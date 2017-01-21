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

public class Proceso6 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_6, container, false);
        TextView Proceso6 = (TextView)vista.findViewById(R.id.proceso_6);
        Proceso6.setText("APRENDER DEL ERROR o EL ERROR CONSTRUCTIVO\n\nEl error suele ser considerado solo como síntoma de que el proceso de aprendizaje no va bien y que el estudiante presenta deficiencias. Desde la didáctica, en cambio, el error puede ser empleado más bien de forma constructiva, como una oportunidad de aprendizaje, propiciando la reflexión y revisión de los diversos productos o tareas, tanto del profesor como del estudiante. El error requiere diálogo, análisis, una revisión cuidadosa de los factores y decisiones que llevaron a él. Esta forma de abordarlo debe ser considerada tanto en la metodología como en la interacción continua profesor-estudiante.");

        return vista;
    }
}