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

public class Proceso7  extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_7, container, false);
        TextView Proceso7 = (TextView)vista.findViewById(R.id.proceso_7);
        Proceso7.setText("GENERAR EL CONFLICTO COGNITIVO\n\nRequiere plantear un reto cognitivo que le resulte significativo al estudiante cuya solución permita poner en juego sus diversas capacidades. Puede tratarse de una idea, una información o de un comportamiento que contradice y discute sus creencias. Se produce, entonces, una desarmonía en el sistema de ideas, creencias y emociones de la persona. En la medida que involucra su interés, el desequilibrio generado puede motivar la búsqueda de una respuesta, lo que abre paso a un nuevo aprendizaje.");

        return vista;
    }
}