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

public class PerfilEgreso6 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso6, container, false);
        TextView perfilegreso6 = (TextView)vista.findViewById(R.id.perfilegreso6);
        perfilegreso6.setText("EL ESTUDIANTE INDAGA y COMPRENDE EL MUNDO NATURAL y ARTIFICIAL CON CONOCIMIENTOS CIENTÍFICOS EN DIÁLOGO CON SABERES LOCALES PARA ELEVAR LA CALIDAD DE VIDA y CUIDANDO LA NATURALEZA\n\nEl estudiante indaga sobre el mundo natural y artificial para comprender y apreciar su estructura y funcionamiento. En consecuencia, asume posturas críticas y éticas para tomar decisiones informadas en ámbitos de la vida y del conocimiento relacionados con los seres vivos, la materia y energía, biodiversidad, Tierra y universo. Según sus características, utiliza o propone soluciones a problemas derivados de sus propias acciones y necesidades, considerando el cuidado responsable del ambiente y adaptación al cambio climático. Usa procedimientos científicos para probar la validez de sus hipótesis, saberes locales y observaciones como una manera de relacionarse con el mundo natural y artificial.");
        return vista;
    }

}
