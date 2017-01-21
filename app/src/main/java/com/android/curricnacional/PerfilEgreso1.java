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

public class PerfilEgreso1 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso1, container, false);
        TextView perfilegreso1 = (TextView)vista.findViewById(R.id.perfilegreso1);
        perfilegreso1.setText("EL ESTUDIANTE SE RECONOCE COMO PERSONA VALIOSA y SE IDENTIFICA CON SU CULTURA EN DIFERENTES CONTEXTOS\n\nEl estudiante valora, desde su individualidad e interacción con su entorno sociocultural y ambiental, sus propias características generacionales, las distintas identidades que lo definen, y las raíces históricas y culturales que le dan sentido de pertenencia. Toma decisiones con autonomía, cuidando de sí mismo y de los otros, procurando su bienestar y el de los demás. Asume sus derechos y deberes. Reconoce y valora su diferencia y la de los demás. Vive su sexualidad estableciendo vínculos afectivos saludables.");

        return vista;
    }

}
