package com.android.curricnacional;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Juan on 18/01/2017.
 */

public class Diverso7 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.diverso_7, container, false);
        TextView Diverso7 = (TextView) vista.findViewById(R.id.diverso_7);
        Diverso7.setText("PARTICIPATIVO\n\nPorque lo elabora la comunidad educativa junto a otros actores de la sociedad; por tanto, está abierto a enriquecerse permanentemente y respeta la pluralidad metodológica.");

        return vista;
    }
}