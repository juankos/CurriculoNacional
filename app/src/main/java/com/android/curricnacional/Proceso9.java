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

public class Proceso9 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_9, container, false);
        TextView Proceso9 = (TextView)vista.findViewById(R.id.proceso_9);
        Proceso9.setText("PROMOVER EL TRABAJO COOPERATIVO\n\nEsto significa ayudar a los estudiantes a pasar del trabajo grupal espontáneo a un trabajo en equipo, caracterizado por la cooperación, la complementariedad y la autorregulación. Se trata de un aprendizaje vital hoy en día para el desarrollo de competencias. Desde este enfoque, se busca que los estudiantes hagan frente a una situación retadora en la que complementen sus diversos conocimientos, habilidades, destrezas, etc. Así el trabajo cooperativo y colaborativo les permite realizar ciertas tareas a través de la interacción social, aprendiendo unos de otros, independientemente de las que les corresponda realizar de manera individual.");

        return vista;
    }
}