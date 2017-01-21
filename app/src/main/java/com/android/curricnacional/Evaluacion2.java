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

public class Evaluacion2 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.evaluacion_2, container, false);
        TextView evaluacion2 = (TextView) vista.findViewById(R.id.evaluacion_2);
        evaluacion2.setText("ANALIZAR EL ESTÁNDAR DE APRENDIZAJE DEL CICLO\n\nConsiste en leer el nivel del estándar esperado y compararlo con la descripción del nivel anterior y posterior. De esta comparación podemos identificar con más claridad las diferencias en la exigencia de cada nivel. Esta información permitirá comprender en qué nivel se puede encontrar cada estudiante con respecto de las competencias y tenerlo como referente al momento de evaluarlo. Este proceso se puede enriquecer con la revisión de ejemplos de producciones realizadas por estudiantes que evidencien el nivel esperado de la competencia.");
        return vista;
    }
}