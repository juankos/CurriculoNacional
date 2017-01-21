package com.android.curricnacional;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Juan on 18/01/2017.
 */

public class Proceso5 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.proceso_5, container, false);
        TextView Proceso5 = (TextView)vista.findViewById(R.id.proceso_5);
        Proceso5.setText("CONSTRUIR EL NUEVO CONOCIMIENTO\n\nSe requiere que el estudiante maneje, además de las habilidades cognitivas y de interacción necesarias, la información, los principios, las leyes, los conceptos o teorías que le ayudarán a entender y afrontar los retos planteados dentro de un determinado campo de acción, sea la comunicación, la convivencia, el cuidado del ambiente, la tecnología o el mundo virtual, entre otros. Importa que logre un dominio aceptable de estos conocimientos, así como que sepa transferirlos y aplicarlos de manera pertinente en situaciones concretas. La diversidad de conocimientos necesita aprenderse de manera crítica: indagando, produciendo y analizando información, siempre de cara a un desafío y en relación al desarrollo de una o más competencias implicadas.");

        return vista;
    }
}