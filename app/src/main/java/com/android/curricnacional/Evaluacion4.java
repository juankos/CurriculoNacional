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

public class Evaluacion4 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.evaluacion_4, container, false);
        TextView evaluacion4 = (TextView) vista.findViewById(R.id.evaluacion_4);
        evaluacion4.setText("UTILIZAR CRITERIOS DE EVALUACIÓN PARA CONSTRUIR INSTRUMENTOS\n\nSe construyen instrumentos de evaluación de competencias cuyos criterios están en relación a las capacidades de las competencias. Las capacidades son los atributos estrictamente necesarios y claves para observar el desarrollo de la competencia de los estudiantes. Se requieren instrumentos de evaluación que hagan visible la combinación de las capacidades al afrontar un desafío y que estas se precisen y describan en niveles de logro.");
        return vista;
    }
}