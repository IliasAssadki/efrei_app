package com.example.efrei_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Connexion extends AppCompatActivity {

    TextView textView;
    EditText identifiant;
    EditText motdepasse;
    Button seconnecter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seconnecter=(Button)findViewById(R.id.connexion);
        identifiant=(EditText) findViewById(R.id.ide);
        motdepasse=(EditText) findViewById(R.id.mdp);



        // recuperation de l'identifiant pour l'afficher sur la page d'accueil
        seconnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //valider(identifiant.getText().toString(), motdepasse.getText().toString());
                if (identifiant.getText().toString().equals("ASSADKI") && motdepasse.getText().toString().equals("assadki123")) {
                    Intent intentconn = new Intent(Connexion.this, AffichageValeur.class);
                    String monid = identifiant.getText().toString(); //
                    String monmdp = motdepasse.getText().toString(); //
                    intentconn.putExtra("keyid", monid); //
                    intentconn.putExtra("keymdp", monmdp); //
                    startActivity(intentconn);
                    Toast.makeText(Connexion.this, "Connexion réussie", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Connexion.this, "Identifiant ou mot de passe incorrect", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
    // test si l'username et le password marqué dans l'input est égal aux valeurs présentes sur la méthode ci dessous
// Si les valeurs sont correctes, passage vers l'activité HomePage, sinon on reste sur l'activité connexion
    //private void valider(String username, String password) {

    //}
}

