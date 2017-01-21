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

public class PerfilEgreso4 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso4, container, false);
        TextView perfilegreso4 = (TextView)vista.findViewById(R.id.perfilegreso4);
        perfilegreso4.setText("EL ESTUDIANTE APRECIA MANIFESTACIONES ARTÍSTICO - CULTURALES PARA COMPRENDER EL APORTE DEL ARTE A LA CULTURA y LA SOCIEDAD, CREA PROYECTOS UTILIZANDO LENGUAJES DEL ARTE PARA COMUNICAR SUS IDEAS\n\nEl estudiante interactúa con diversas manifestaciones artístico- culturales, desde las formas más tradicionales hasta las formas emergentes y contemporáneas, para descifrar sus significados y comprender la contribución que hacen a la cultura y a la sociedad. Asimismo, usa los diversos lenguajes de las artes para crear producciones individuales y colectivas, interpretar y reinterpretar las de otros, lo que le permite comunicar mensajes, ideas y sentimientos pertinentes a su realidad personal y social.");

        return vista;
    }

}
