package com.android.curricnacional;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Juan on 8/01/2017.
 */

public class PerfilEgreso7 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso7, container, false);
        TextView perfilegreso7 = (TextView)vista.findViewById(R.id.perfilegreso7);
        perfilegreso7.setText("EL ESTUDIANTE INTERPRETA LA REALIDAD y TOMA DECISIONES A PARTIR DE CONOCIMIENTOS MATEMÁTICOS QUE APORTEN A SU CONTEXTO\n\nEl estudiante busca, sistematiza y analiza información para entender el mundo que lo rodea, resolver problemas y tomar decisiones relacionadas con el entorno. Usa de forma flexible estrategias y conocimientos matemáticos en diversas situaciones, a partir de los cuales elabora argumentos y comunica sus ideas mediante el lenguaje matemático, así como diversas representaciones y recursos.");

        return vista;
    }

}