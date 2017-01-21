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

public class Diverso1  extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.diverso_1, container, false);
        TextView Diverso1 = (TextView) vista.findViewById(R.id.diverso_1);
        Diverso1.setText("FLEXIBLE\n\nPorque ofrece un margen de libertad que permite la adaptación a la diversidad de estudiantes y a las necesidades y demandas de cada región.");

        return vista;
    }
}