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

public class PerfilEgreso5  extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso5, container, false);
        TextView perfilegreso5 = (TextView)vista.findViewById(R.id.perfilegreso5);
        perfilegreso5.setText("EL ESTUDIANTE SE COMUNICA EN SU LENGUA MATERNA, EN CASTELLANO COMO SEGUNDA LENGUA, EN INGLÉS COMO LENGUA EXTRANJERA DE MANERA ASERTIVA y RESPONSABLE, PARA INTERACTUAR EN DIVERSOS CONTEXTOS y PROPÓSITOS\n\nEl estudiante usa el lenguaje para comunicarse según sus propósitos en situaciones distintas, en las que se producen y comprenden diversos tipos de textos. Emplea recursos y estrategias en su comunicación oral, escrita, multimodal o en sistemas alternativos y aumentativos como el braille. Utiliza el lenguaje para aprender, apreciar manifestaciones literarias, desenvolverse en distintos contextos socioculturales y contribuir a la construcción de comunidades interculturales, democráticas e inclusivas.");
        return vista;
    }

}
