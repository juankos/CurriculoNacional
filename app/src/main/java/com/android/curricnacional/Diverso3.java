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

public class Diverso3 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.diverso_3, container, false);
        TextView Diverso3 = (TextView) vista.findViewById(R.id.diverso_3);
        Diverso3.setText("DIVERSIFICADO\n\nPues es en él cada región ofrece a las instancias locales los lineamientos de diversificación, los cuales orientan a las instituciones educativas en la adecuación del currículo a las características y demandas socioeconómicas, lingüísticas, geográficas y culturales de cada región mediante un trabajo colegiado.");

        return vista;
    }
}