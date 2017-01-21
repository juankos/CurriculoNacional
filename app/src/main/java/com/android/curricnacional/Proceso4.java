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

public class Proceso4 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_4, container, false);
        TextView Proceso4 = (TextView)vista.findViewById(R.id.proceso_4);
        Proceso4.setText("PARTIR DE LOS SABERES PREVIOS\n\nConsiste en recuperar y activar, a través de preguntas o tareas, los conocimientos, concepciones, representaciones, vivencias, creencias, emociones y habilidades adquiridos previamente por el estudiante, con respecto a lo que se propone aprender al enfrentar la situación significativa. Estos saberes previos no solo permiten poner al estudiante en contacto con el nuevo conocimiento, sino que además son determinantes y se constituyen en la base del aprendizaje, pues el docente puede hacerse una idea sobre cuánto ya sabe o domina de lo que él quiere enseñarle. El aprendizaje será más significativo cuantas más relaciones con sentido sea capaz de establecer el estudiante entre sus saberes previos y el nuevo aprendizaje.");

        return vista;
    }
}