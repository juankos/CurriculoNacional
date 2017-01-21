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

public class Evaluacion5 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.evaluacion_5, container, false);
        TextView evaluacion5 = (TextView) vista.findViewById(R.id.evaluacion_5);
        evaluacion5.setText("COMUNICAR A LOS ESTUDIANTES EN QUÉ VAN SER EVALUADOS y LOS CRITERIOS DE EVALUACIÓN\n\nConsiste en informar a los estudiantes desde el inicio del proceso de enseñanza y aprendizaje en qué competencias serán evaluados, cuál es el nivel esperado y cuáles los criterios sobre los cuales se les evaluará. Es decir, especificar qué aprendizajes deben demostrar frente a las diferentes situaciones propuestas. Esta comunicación será diferenciada de acuerdo a la edad de los estudiantes y puede ir acompañada de ejemplos de producciones de estudiantes que den cuenta del nivel de logro esperado.");
        return vista;
    }
}