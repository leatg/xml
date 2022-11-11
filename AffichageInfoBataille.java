package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AffichageInfoBataille#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AffichageInfoBataille extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "nom";
    private static final String ARG_PARAM2 = "gentillesse";
    private static final String ARG_PARAM3 = "tourHeros";
    private static final String ARG_PARAM4 = "race";

    // TODO: Rename and change types of parameters
    private String nom;
    private String gentillesse;
    private Boolean tourHeros;
    private String race;

    public AffichageInfoBataille() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment AffichageInfoBataille.
     */
    // TODO: Rename and change types and number of parameters
    public static AffichageInfoBataille newInstance(String nom, String gentillesse, Boolean tourHeros, String race) {
        AffichageInfoBataille fragment = new AffichageInfoBataille();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, nom);
        args.putString(ARG_PARAM2, gentillesse);
        args.putBoolean(ARG_PARAM3, tourHeros);
        args.putString(ARG_PARAM4, race);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            nom = getArguments().getString(ARG_PARAM1);
            gentillesse = getArguments().getString(ARG_PARAM2);
            tourHeros = getArguments().getBoolean(ARG_PARAM3);
            race = getArguments().getString(ARG_PARAM4);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_affichage_info_bataille, container, false);
        TextView txtNom = view.findViewById(R.id.nom);
        TextView txtRace = view.findViewById(R.id.race);
        TextView txtGentillesse = view.findViewById(R.id.gentillesse);

        txtNom.setText(nom);
        //if (tourHeros){
            txtRace.setText("");
            txtGentillesse.setText("");
        //}
        //else {
            //txtRace.setText(race);
            //txtGentillesse.setText(gentillesse);
        //}
        return view;
    }

    public void Suivant(){
        tourHeros = false;
    }
    public void Attaquer(){

    }
}