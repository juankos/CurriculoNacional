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

public class PerfilEgreso8 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso8, container, false);
        TextView perfilegreso8 = (TextView)vista.findViewById(R.id.perfilegreso8);
        perfilegreso8.setText("EL ESTUDIANTE GESTIONA PROYECTOS DE EMPRENDIMIENTO ECONÓMICO o SOCIAL CON ÉTICA, QUE LE PERMITEN ARTICULARSE AL MUNDO DEL TRABAJO, EL DESARROLLO SOCIAL, LA ECONOMÍA y EL AMBIENTE\n\nEl estudiante, de acuerdo a sus características, realiza proyectos de emprendimiento con ética y sentido de iniciativa, que generan recursos económicos o valor social, cultural y ambiental con beneficios propios y colectivos, tangibles o intangibles, con el fin de mejorar su bienestar material o subjetivo, así como las condiciones sociales, culturales o económicos de su entorno. Muestra habilidades socioemocionales y técnicas que favorezcan su conexión con el mundo del trabajo a través de un empleo dependiente, independiente o autogenerado. Propone ideas, planifica actividades, estrategias y recursos, dando soluciones creativas, éticas, sostenibles y responsables con el ambiente y la comunidad. Selecciona las más útiles, viables y pertinentes; las ejecuta con perseverancia y asume riesgos; adapta e innova; trabaja cooperativa y proactivamente. Evalúa los procesos y resultados de su proyecto para incorporar mejoras.");
        return vista;
    }

}