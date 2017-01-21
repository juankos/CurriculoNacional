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

public class Proceso8 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_8, container, false);
        TextView Proceso8 = (TextView)vista.findViewById(R.id.proceso_8);
        Proceso8.setText("MEDIAR EL PROGRESO DE LOS ESTUDIANTES DE UN NIVEL DE APRENDIZAJE A OTRO SUPERIOR\n\nLa mediación del docente durante el proceso de aprendizaje supone acompañar al estudiante hacia un nivel inmediatamente superior de posibilidades (zona de desarrollo próximo) con respecto a su nivel actual (zona real de aprendizaje), por lo menos hasta que el estudiante pueda desempeñarse bien de manera independiente. De este modo, es necesaria una conducción cuidadosa del proceso de aprendizaje, en donde la atenta observación del docente permita al estudiante realizar tareas con distintos niveles de dificultad.");

        return vista;
    }
}