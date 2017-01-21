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

public class Proceso10 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_10, container, false);
        TextView Proceso10 = (TextView) vista.findViewById(R.id.proceso_10);
        Proceso10.setText("PROMOVER EL PENSAMIENTO COMPLEJO\n\nLa educación necesita promover el desarrollo de un pensamiento complejo para que los estudiantes vean el mundo de una manera integrada y no fragmentada, como sistema interrelacionado y no como partes aisladas, sin conexión. Desde el enfoque por competencias, se busca que los estudiantes aprendan a analizar la situación que los desafía relacionando sus distintas características a fin de poder explicarla. El ser humano al que la escuela forma es un ser físico, biológico, psíquico, cultural, histórico y social a la vez; por lo tanto, la educación debe ir más allá de la enseñanza de las disciplinas y contribuir a que tome conocimiento y conciencia de su identidad compleja y de su identidad común con los demás seres humanos.");

        return vista;
    }
}