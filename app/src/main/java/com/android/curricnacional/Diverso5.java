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

public class Diverso5 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.diverso_5, container, false);
        TextView Diverso5 = (TextView) vista.findViewById(R.id.diverso_5);
        Diverso5.setText("VALORATIVO\n\nEn tanto responde al desarrollo armonioso e integral del estudiante y promueve actitudes positivas de convivencia social, democratización de la sociedad y ejercicio responsable de la ciudadanía.");

        return vista;
    }
}