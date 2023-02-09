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

public class AffichageValeur extends AppCompatActivity {

// affichage de la valeur récuperée dans le EditText de l'Activité activity_mesinformations.xml
    // revient à la HomePage (Activité activity_main2) alors qu'il doit aller vers l'Activité activity_main3.xml

     @Override
    protected void onCreate(Bundle savedInstanceState) {
         //TextView lavaleurduprenom;
         TextView lid, lmdp; //
         Button retouracc;

         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

         //lavaleurduprenom=(TextView)findViewById(R.id.prenomecrit);
         lid=(TextView)findViewById(R.id.idrecup); // changer en id recup
         lmdp=(TextView)findViewById(R.id.mdprecup);

         retouracc=(Button)findViewById(R.id.retouraccueil); //

         retouracc.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intentaccueil = new Intent(AffichageValeur.this, HomePage.class);
                 startActivity(intentaccueil);
                Toast.makeText(AffichageValeur.this, "Retour à la page d'accueil", Toast.LENGTH_SHORT).show();
             }
             });

                 //Bundle extras=getIntent().getExtras();
       // String monprenom = getIntent().getStringExtra("nom");
       String monid = getIntent().getStringExtra("keyid"); //
       String monmdp = getIntent().getStringExtra("keymdp"); //



        //String monid = extras.getString("id");
        //String monmdp = extras.getString("mdp");
         //lavaleurduprenom.setText(monprenom); //affichage du prenom dans le text view
        lid.setText("Votre identifiant  "+ monid); // // affichage du id dans le text view
         lmdp.setText("Votre mot de passe "+monmdp); // // affichage du mdp dans le text view



    }

}