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

public class Diverso6 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.diverso_6, container, false);
        TextView Diverso6 = (TextView) vista.findViewById(R.id.diverso_6);
        Diverso6.setText("SIGNIFICATIVO\n\nYa que toma en cuenta las experiencias, conocimientos previos y necesidades de los estudiantes.");

        return vista;
    }
}