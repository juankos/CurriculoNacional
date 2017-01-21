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

public class PerfilEgreso10 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso10, container, false);
        TextView perfilegreso10 = (TextView)vista.findViewById(R.id.perfilegreso10);
        perfilegreso10.setText ("EL ESTUDIANTE DESARROLLA PROCESOS AUTÓNOMOS DE APRENDIZAJE EN FORMA PERMANENTE PARA LA MEJORA CONTINUA DE SU PROCESO DE APRENDIZAJE y DE SUS RESULTADOS\n\nEl estudiante toma conciencia de su aprendizaje como un proceso activo. De esta manera participa directamente en él, evaluando por sí mismo sus avances, dificultades y asumiendo el control de su proceso de aprendizaje, de manera disciplinada, responsable y comprometida respecto de la mejora continua de este y sus resultados. Asimismo, el estudiante organiza y potencia por sí mismo, a través de distintas estrategias, los distintos procesos de aprendizaje que emprende en su vida académica.");
        return vista;
    }

}