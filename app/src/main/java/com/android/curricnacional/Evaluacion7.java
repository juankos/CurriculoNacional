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

public class Evaluacion7 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.evaluacion_7, container, false);
        TextView evaluacion7 = (TextView) vista.findViewById(R.id.evaluacion_7);
        evaluacion7.setText("RETROALIMENTAR A LOS ESTUDIANTES PARA AYUDARLOS A AVANZAR HACIA EL NIVEL ESPERADO y AJUSTAR LA ENSEÑANZA A LAS NECESIDADES IDENTIFICADAS\n\nLa retroalimentación consiste en devolver al estudiante información que describa sus logros o progresos en relación con los niveles esperados para cada competencia. Esta información le permite comparar lo que debió hacer y lo que intentó lograr con lo que efectivamente hizo. Además, debe basarse en criterios claros y compartidos, ofrecer modelos de trabajo o procedimientos para que el estudiante revise o corrija. Retroalimentar consiste en otorgarle un valor a lo realizado, y no en brindar elogios o criticas sin sustento que no orienten sus esfuerzos con claridad o que los puedan distraer de los propósitos centrales.");
        return vista;
    }
}