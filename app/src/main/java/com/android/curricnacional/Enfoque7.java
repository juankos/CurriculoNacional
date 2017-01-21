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

public class Enfoque7 extends Fragment{

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.enfoque_7, container, false);
        TextView Enfoque7 = (TextView)vista.findViewById(R.id.enfoque_7);
        Enfoque7.setText("La excelencia significa utilizar al máximo las facultades y adquirir estrategias para el éxito de las propias metas a nivel personal y social. La excelencia comprende el desarrollo de la capacidad para el cambio y la adaptación, que garantiza el éxito personal y social, es decir, la aceptación del cambio orientado a la mejora de la persona: desde las habilidades sociales o de la comunicación eficaz hasta la interiorización de estrategias que han facilitado el éxito a otras personas. De esta manera, cada individuo construye su realidad y busca ser cada vez mejor para contribuir también con su comunidad.\n\nTRAMIENTO DEL ENFOQUE BÚSQUEDA DE LA EXCELENCIA (VALORES)\n\n1. Flexibilidad y apertura\n2. Superación personal ");

        return vista;
    }
}
