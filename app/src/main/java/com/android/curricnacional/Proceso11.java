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

public class Proceso11 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_11, container, false);
        TextView Proceso11 = (TextView) vista.findViewById(R.id.proceso_11);
        Proceso11.setText("TUTORÍA GRUPAL:\n\nEs la forma de orientación que se realiza en los espacios educativos o en otros espacios de aprendizaje con todo el grupo de estudiantes. Promueve estrategias de interacción en las que los estudiantes expresan con libertad sus ideas y sentimientos, exploran sus dudas, examinan sus valores, aprenden a relacionarse, toman conciencia de sus metas comunes y de su proyecto de vida. Todo esto supone que los estudiantes reconozcan que sus compañeros y compañeras comparten experiencias similares.");

        return vista;
    }
}