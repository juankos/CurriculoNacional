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

public class Enfoque5 extends Fragment{

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.enfoque_5, container, false);
        TextView Enfoque5 = (TextView)vista.findViewById(R.id.enfoque_5);
        Enfoque5.setText("Desde este enfoque, los procesos educativos se orientan hacia la formación de personas con conciencia crítica y colectiva sobre la problemática ambiental y la condición del cambio climático a nivel local y global, así como su relación con la pobreza y la desigualdad social. Además, implica desarrollar prácticas de conservación de la biodiversidad, del suelo y el aire, el uso sostenible de la energía y el agua, la valoración de lo que nos brinda la naturaleza y los ecosistemas terrestres y marinos, la promoción de patrones de producción y consumo responsables y el manejo adecuado de los residuos sólidos, la promoción de la salud y el bienestar, la adaptación al cambio climático y la gestión del riesgo de desastres y, finalmente, desarrollar estilos de vida saludables y sostenibles.\n\nTRAMIENTO DEL ENFOQUE AMBIENTAL (VALORES)\n\n1. Solidaridad planetaria y equidad intergeneracional\n2. Justicia y solidaridad\n3. Respeto a toda forma de vida");

        return vista;
    }

}

