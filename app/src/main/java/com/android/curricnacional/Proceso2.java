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

public class Proceso2  extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_2, container, false);
        TextView Proceso2 = (TextView)vista.findViewById(R.id.proceso_2);
        Proceso2.setText("GENERAR INTERÉS y DISPOSICIÓN COMO CONDICIÓN PARA EL APRENDIZAJE\n\nEs más fácil que los estudiantes se involucren en las situaciones significativas al tener claro qué se pretende de ellas y al sentir que con ello se cubre una necesidad o un propósito de su interés (ampliar información, preparar algo, entre otros.). Así, se favorece la autonomía de los estudiantes y su motivación para el aprendizaje a medida de que puedan participar plenamente de la planificación de lo que se hará en la situación significativa.");
        return vista;
    }
}