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

public class Evaluacion3 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.evaluacion_3, container, false);
        TextView evaluacion3 = (TextView) vista.findViewById(R.id.evaluacion_3);
        evaluacion3.setText("SELECCIONAR o DISEÑAR SITUACIONES SIGNIFICATIVAS\n\nConsiste en elegir o plantear situaciones significativas que sean retadoras para los estudiantes. Estas situaciones pueden consistir, por ejemplo, en describir un fenómeno, generar conocimiento explicativo de un fenómeno, discutir o retar a mejorar algo existente, recrear escenarios futuros, crear un nuevo objeto, comprender o resolver una contradicción u oposición entre dos o más conclusiones, teorías, enfoques, perspectivas o metodologías. Para que sean significativas, las situaciones deben despertar el interés de los estudiantes, articularse con sus saberes previos para construir nuevos aprendizajes y ser desafiantes pero alcanzables de resolver por los estudiantes.\n\nAdemás, deben permitir que los estudiantes pongan en juego o apliquen una serie de capacidades, evidenciando así los distintos niveles del desarrollo de las competencias en los que se encuentran.");
        return vista;
    }
}