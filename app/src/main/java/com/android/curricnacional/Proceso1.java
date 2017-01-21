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

public class Proceso1  extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_1, container, false);
        TextView Proceso1 = (TextView)vista.findViewById(R.id.proceso_1);
        Proceso1.setText("PARTIR DE SITUACIONES SIGNIFICATIVAS\n\nImplica diseñar o seleccionar situaciones que respondan a los intereses de los estudiantes y que ofrezcan posibilidades de aprender de ellas. Cuando esto ocurre, los estudiantes pueden establecer relaciones entre sus saberes previos y la nueva situación. Por este motivo se dice que cuando una situación le resulta significativa al estudiante, puede constituir un desafío para él. Estas situaciones cumplen el rol de retar las competencias del estudiante para que progresen a un nivel de desarrollo mayor al que tenían.");

        return vista;
    }

}