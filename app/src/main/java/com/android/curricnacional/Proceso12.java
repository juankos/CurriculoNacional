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

public class Proceso12 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_12, container, false);
        TextView Proceso12 = (TextView) vista.findViewById(R.id.proceso_12);
        Proceso12.setText("TUTORÍA INDIVIDUAL:\n\nEs una forma de orientación en la cual los tutores brindan acompañamiento socio-afectivo individualizado, lo que posibilita que los estudiantes reconozcan que cuentan con una persona que es un soporte para ellos. El tutor planifica para su atención un tiempo y espacio dentro de la institución educativa para abordar aspectos de índole personal que no pueden ser atendidos grupalmente o que van más allá de las necesidades de orientación del grupo. Sin embargo, este acompañamiento puede ser de manera espontánea, a solicitud del estudiante, preventiva o ante una necesidad inmediata. Es fundamental que los tutores realicen un acompañamiento personalizado a todos sus estudiantes, procurando empatía, capacidad de escucha, interés y otras características que favorezcan la construcción de vínculos afectivos con sus estudiantes.");
        return vista;

    }
}