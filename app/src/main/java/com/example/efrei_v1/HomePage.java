package com.example.efrei_v1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;



public class HomePage extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    MyViewPagerAdapter myViewPagerAdapter;
    Button envoyervaleurs;
    EditText votreprenom;
    Button allerversmainactivity;
    EditText identifiant;
    EditText motdepasse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_pager);
        myViewPagerAdapter = new MyViewPagerAdapter(this);
        viewPager2.setAdapter(myViewPagerAdapter);



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();

            }
        });
        //


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items_menu,menu);
        return true;
        //deconnexion=(Menu)findViewById(R.id.deconnect);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       // int item_id=item.getItemId();
        switch (item.getItemId()) {
            case R.id.deconnect:
                Intent intentConnexion = new Intent(HomePage.this, Connexion.class);
                startActivity(intentConnexion);
                Toast.makeText(this, "Vous vous etes bien deconnectés", Toast.LENGTH_SHORT).show();
            break;
           /* case R.id.infos:
                Intent intentInformation = new Intent(HomePage.this, Mesinformations.class);
                String monid1 = identifiant.getText().toString(); //
                String monmdp1 = motdepasse.getText().toString(); //
                intentInformation.putExtra("keyid1", monid1); //
                intentInformation.putExtra("keymdp1", monmdp1); //
                startActivity(intentInformation);
                Toast.makeText(HomePage.this, "Affichage d'informations", Toast.LENGTH_SHORT).show();
                break; */
        }

        return super.onOptionsItemSelected(item);
    }
}



