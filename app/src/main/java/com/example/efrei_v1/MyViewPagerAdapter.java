package com.example.efrei_v1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.efrei_v1.fragments.fragment_absences;
import com.example.efrei_v1.fragments.fragment_agenda;
import com.example.efrei_v1.fragments.fragment_message;
import com.example.efrei_v1.fragments.fragment_offre;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new fragment_agenda();
            case 1:
                return new fragment_message();
            case 2:
                return new fragment_offre();
            case 3:
                return new fragment_absences();
            default:
            return new fragment_agenda();

        }



    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
