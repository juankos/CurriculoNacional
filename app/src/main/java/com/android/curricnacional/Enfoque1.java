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

public class Enfoque1 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.enfoque_1, container, false);
        TextView Enfoque1 = (TextView)vista.findViewById(R.id.enfoque_1);
        Enfoque1.setText("Parte por reconocer a los estudiantes como sujetos de derecho y no como objetos de cuidado, es decir, como personas con capacidad de defender y exigir sus derechos legalmente reconocidos.  Asimismo, reconocer que son ciudadanos con deberes que participan del mundo social propiciando la vida en democracia.  Este enfoque promueve la consolidación de la democracia que vive el país, contribuyendo a la promoción de las libertades individuales, los los pueblos y la participación en asuntos públicos: a fortalecer la convivencia y transparencia en las instituciones educativas; a reducir la inequidad y procurar la solución pacífica de los conflictos.\n\nTRATAMIENTO DEL ENFOQUE DE DERECHOS (VALORES)\n\n1. Conciencia de derechos\n2. Libertad y responsabilidad\n3. Diálogo y concertación");

        return vista;
    }

}