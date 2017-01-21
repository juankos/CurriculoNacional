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

public class Proceso3 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_3, container, false);
        TextView Proceso3 = (TextView)vista.findViewById(R.id.proceso_3);
        Proceso3.setText("APRENDER HACIENDO\n\nEl desarrollo de las competencias se coloca en la perspectiva de la denominada «enseñanza situada», para la cual aprender y hacer son procesos indesligables, es decir, la actividad y el contexto son claves para el aprendizaje. Construir el conocimiento en contextos reales o simulados implica que los estudiantes pongan en juego sus capacidades reflexivas y críticas, aprendan a partir de su experiencia, identificando el problema, investigando sobre él, formulando alguna hipótesis viable de solución, comprobándola en la acción, entre otras acciones.");

        return vista;
    }
}