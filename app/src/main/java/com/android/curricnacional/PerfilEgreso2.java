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

public class PerfilEgreso2 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso2, container, false);
        TextView perfilegreso2 = (TextView)vista.findViewById(R.id.perfilegreso2);
        perfilegreso2.setText("EL ESTUDIANTE PROPICIA LA VIDA EN DEMOCRACIA A PARTIR DEL RECONOCIMIENTO DE SUS DERECHOS, DEBERES y DE LA COMPRENSIÓN DE LOS PROCESOS HISTÓRICOS y SOCIALES DE NUESTRO PAÍS y EL MUNDO\n\nEl estudiante actúa en la sociedad promoviendo la democracia como forma de gobierno y como un modo de convivencia social; también, la defensa y el respeto a los derechos humanos y deberes ciudadanos. Reflexiona críticamente sobre el rol que cumple cada persona en la sociedad y aplica en su vida los conocimientos vinculados al civismo, referidos al funcionamiento de las instituciones, las leyes y los procedimientos de la vida política. Analiza procesos históricos, económicos, ambientales y geográficos que le permiten comprender y explicar el contexto en el que vive y ejercer una ciudadanía informada. Interactúa de manera ética, empática, asertiva y tolerante. Colabora con los otros en función de objetivos comunes, regulando sus emociones y comportamientos, siendo consciente de las consecuencias de su comportamiento en los demás y en la naturaleza.");

        return vista;
    }

}


