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

public class Diverso4 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.diverso_4, container, false);
        TextView Diverso4 = (TextView) vista.findViewById(R.id.diverso_4);
        Diverso4.setText("INTEGRADOR\n\nPorque el Perfil de egreso, competencias, capacidades, estándares de aprendizaje y áreas curriculares conforman un sistema que promueve su implementación en las escuelas.");

        return vista;
    }
}