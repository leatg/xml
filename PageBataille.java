package com.example.myapplication;

import static com.example.myapplication.Monstre.GénérerTabMonstre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Scanner;

public class PageBataille extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_bataille);

        Button boutonAttaquer = (Button) findViewById(R.id.btnAttaquer);
        Button boutonSuivant = (Button) findViewById(R.id.btnSuivant);

        Intent pageInfos = getIntent();
        Bundle extras = pageInfos.getExtras();
        Monstre[] tabMonstre = (Monstre[])extras.getSerializable("monstres");
        Héros heros = (Héros)extras.getSerializable("heros");

        getSupportFragmentManager().beginTransaction().replace(R.id.fragContainerInfo, AffichageInfoBataille.newInstance(heros.GetNom(), "", true, ""));

        for(Monstre monstre : tabMonstre){
            System.out.println(monstre.munitions);
            System.out.println(monstre.santé);
        }

        int nbBataille = 1;


        boutonAttaquer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

    }
}
