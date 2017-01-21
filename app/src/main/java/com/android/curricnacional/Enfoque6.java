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

public class Enfoque6 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.enfoque_6, container, false);
        TextView Enfoque6 = (TextView)vista.findViewById(R.id.enfoque_6);
        Enfoque6.setText("El bien común está constituido por los bienes que los seres humanos comparten intrínsecamente en común y que se comunican entre sí, como los valores, las virtudes cívicas y el sentido de la justicia. A partir de este enfoque, la comunidad es una asociación solidaria de personas, cuyo bien son las relaciones recíprocas entre ellas, a partir de las cuales y por medio de las cuales las personas consiguen su bienestar. Este enfoque considera a la educación y el conocimiento como bienes comunes mundiales. Esto significa que la generación de conocimiento, el control, su adquisición, validación y utilización son comunes a todos los pueblos como asociación mundial.\n\nTRAMIENTO DEL ENFOQUE ORIENTACIÓN AL BIEN COMÚN (VALORES)\n\n1. Equidad y justicia\n2. Solidaridad\n3. Empatía\n4. Responsabilidad");

        return vista;
    }

}