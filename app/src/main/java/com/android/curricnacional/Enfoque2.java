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

public class Enfoque2 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.enfoque_2, container, false);
        TextView Enfoque2 = (TextView)vista.findViewById(R.id.enfoque_2);
        Enfoque2.setText("Hoy nadie discute que todas las niñas, niños, adolescentes, adultos y jóvenes tienen derecho no solo a oportunidades educativas de igual calidad, sino a obtener resultados de aprendizaje de igual calidad, independientemente de sus diferencias culturales, sociales, étnicas, religiosas, de género, condición de discapacidad o estilos de aprendizaje. No obstante, en un país como el nuestro, que aún exhibe profundas desigualdades sociales, significa que los estudiantes con mayores desventajas de inicio deben recibir del Estado una atención mayor y más pertinente, para estar en condiciones de aprovechar las oportunidades que el sistema educativo ofrece. La atención a la diversidad significa erradicar la exclusión, discriminación y desigualdad de oportunidades.\n\nTRAMIENTO DEL ENFOQUE INCLUSIVO O ATENCIÓN A LA DIVERSIDAD (VALORES)\n\n1. Respeto por las diferencias\n2. Equidad en la enseñanza\n3. Confianza en la persona ");

        return vista;
    }

}
