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

public class PerfilEgreso11 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso11, container, false);
        TextView perfilegreso11 = (TextView)vista.findViewById(R.id.perfilegreso11);
        perfilegreso11.setText ("EL ESTUDIANTE COMPRENDE y APRECIA LA DIMENSIÓN ESPIRITUAL y RELIGIOSA EN LA VIDA DE LAS PERSONAS y LAS SOCIEDADES\n\nEl estudiante comprende la trascendencia que tiene la dimensión espiritual y religiosa en la vida moral, cultural y social de las personas. Esto le permite reflexionar sobre el sentido de su vida, el compromiso ético y existencial en la construcción de un mundo más justo, solidario y fraterno. Asimismo, muestra respeto y tolerancia por las diversas cosmovisiones, religiones y creencias de las personas.");

        return vista;
    }

}
