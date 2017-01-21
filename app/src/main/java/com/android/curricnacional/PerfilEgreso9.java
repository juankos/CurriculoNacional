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

public class PerfilEgreso9 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.perfilegreso9, container, false);
        TextView perfilegreso9 = (TextView)vista.findViewById(R.id.perfilegreso9);
        perfilegreso9.setText("EL ESTUDIANTE APROVECHA RESPONSABLE-\nMENTE LAS TICs, PARA INTERACTUAR CON LA INFORMACIÓN, GESTIONAR SU COMUNICACIÓN y APRENDIZAJE\n\nEl estudiante discrimina y organiza información de manera interactiva; se expresa a través de la modificación y creación de materiales digitales; selecciona e instala aplicaciones según sus necesidades para satisfacer nuevas demandas y cambios en su contexto. Identifica y elige interfaces según sus condiciones personales o de su entorno sociocultural y ambiental. Participa y se relaciona con responsabilidad en redes sociales y comunidades virtuales, a través de diálogos basados en el respeto y el desarrollo colaborativo de proyectos. Además, lleva a cabo todas estas actividades de manera sistemática y con capacidad de autorregulación de sus acciones.");
        return vista;
    }

}