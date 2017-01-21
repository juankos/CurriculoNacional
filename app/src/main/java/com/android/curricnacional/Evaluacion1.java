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

public class Evaluacion1 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.evaluacion_1, container, false);
        TextView evaluacion1 = (TextView) vista.findViewById(R.id.evaluacion_1);
        evaluacion1.setText("COMPRENDER LA COMPETENCIA POR EVALUAR\n\nConsiste en asegurar una comprensión cabal de la competencia: su definición, significado, las capacidades que la componen, su progresión a lo largo de la Educación Básica y sus implicancias pedagógicas para la enseñanza. Para evitar una interpretación subjetiva de las competencias del Currículo Nacional de la Educación Básica se recomienda analizar con cuidado las definiciones y progresiones.");
        return vista;
    }
}