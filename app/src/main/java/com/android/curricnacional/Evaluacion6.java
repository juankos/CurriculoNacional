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

public class Evaluacion6 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.evaluacion_6, container, false);
        TextView evaluacion6 = (TextView) vista.findViewById(R.id.evaluacion_6);
        evaluacion6.setText("VALORAR EL DESEMPEÑO ACTUAL DE CADA ESTUDIANTE A PARTIR DEL ANÁLISIS DE EVIDENCIAS\n\nLa valoración del desempeño se aborda desde la perspectiva del docente y del estudiante: Para el docente, la valoración del desempeño significa describir lo que es capaz de saber hacer el estudiante a partir del análisis de la evidencia recogida: qué saberes pone en juego para organizar su respuesta, las relaciones que establece, cuáles son los aciertos y los errores principales cometidos y sus razones probables. Este análisis implica, además, comparar el estado actual del desempeño del estudiante con el nivel esperado de la competencia al final del ciclo y establecer la distancia existente. Esta información le sirve al docente para realizar una retroalimentación efectiva al estudiante y también para corregir o ajustar la enseñanza misma.\n\nEn este proceso, el estudiante se autoevalúa usando los mismos criterios para identificar dónde se encuentra con relación al logro de la competencia.");
        return vista;
    }
}