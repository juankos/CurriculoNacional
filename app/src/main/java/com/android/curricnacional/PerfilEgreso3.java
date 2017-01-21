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

public class PerfilEgreso3 extends Fragment {
    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso3, container, false);
        TextView perfilegreso3 = (TextView)vista.findViewById(R.id.perfilegreso3);
        perfilegreso3.setText("EL ESTUDIANTE PRACTICA UNA VIDA ACTIVA y SALUDABLE PARA SU BIENESTAR, CUIDA SU CUERPO e INTERACTÚA EN LA PRÁCTICA DE DISTINTAS ACTIVIDADES FÍSICAS\n\nEl estudiante tiene una comprensión y conciencia de sí mismo, que le permite interiorizar y mejorar la calidad de sus movimientos en un espacio y tiempo determinados, así como expresarse y comunicarse corporalmente. Asume un estilo de vida activo, saludable y placentero a través de la realización de prácticas que contribuyen al desarrollo de una actitud crítica hacia el cuidado de su salud y a comprender cómo impactan en su bienestar social, emocional, mental y físico. Demuestra habilidades sociomotrices como la resolución de conflictos, pensamiento estratégico, igualdad de género, trabajo en equipo y logro de objetivos comunes, entre otros.");

        return vista;
    }

}



