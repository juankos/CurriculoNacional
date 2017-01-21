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

public class Diverso2 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.diverso_2, container, false);
        TextView Diverso2 = (TextView) vista.findViewById(R.id.diverso_2);
        Diverso2.setText("ABIERTO\n\nYa que en él pueden incorporarse competencias de acuerdo al diagnóstico de las potencialidades naturales, culturales y económico-productivas de cada región, así como sus demandas sociales y las características específicas de los estudiantes.");

        return vista;
    }
}