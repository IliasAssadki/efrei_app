package com.example.efrei_v1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Mesinformations extends AppCompatActivity {

// affichage de la valeur récuperée dans le EditText de l'Activité activity_mesinformations.xml
    // revient à la HomePage (Activité activity_main2) alors qu'il doit aller vers l'Activité activity_main3.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TextView lavaleurduprenom;
        TextView lid1, lmdp1; //
        Button retouracc;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesinformations);

        //lavaleurduprenom=(TextView)findViewById(R.id.prenomecrit);
        lid1=(TextView)findViewById(R.id.idrecup1); // changer en id recup
        lmdp1=(TextView)findViewById(R.id.mdprecup1);

        retouracc=(Button)findViewById(R.id.retouraccueil); //

        retouracc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentInfos = new Intent(Mesinformations.this, HomePage.class);
                startActivity(intentInfos);
                Toast.makeText(Mesinformations.this, "Retour à la page d'accueil", Toast.LENGTH_SHORT).show();
            }
        });






        //Bundle extras=getIntent().getExtras();
        // String monprenom = getIntent().getStringExtra("nom");
        String monid1 = getIntent().getStringExtra("keyid1"); //
        String monmdp1 = getIntent().getStringExtra("keymdp1"); //



        //String monid = extras.getString("id");
        //String monmdp = extras.getString("mdp");
        //lavaleurduprenom.setText(monprenom); //affichage du prenom dans le text view
        lid1.setText("Identifiant  "+ monid1); // // affichage du id dans le text view
        lmdp1.setText("Mot de passe "+ monmdp1); // // affichage du mdp dans le text view



    }

}