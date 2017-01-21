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

public class Enfoque4 extends Fragment {

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.enfoque_3, container, false);
        TextView Enfoque4 = (TextView)vista.findViewById(R.id.enfoque_3);
        Enfoque4.setText("Todas las personas, varones o mujeres, tienen el mismo potencial para aprender y desarrollarse plenamente. La Igualdad de Género se refiere a la igual valoración de los diferentes comportamientos, aspiraciones y necesidades. En una situación de igualdad real, los derechos, deberes y oportunidades de las personas no dependen de su identidad de género, y por lo tanto, todos tienen las mismas condiciones y posibilidades para ejercer sus derechos, así como para ampliar sus capacidades y oportunidades de desarrollo personal, contribuyendo al progreso social y beneficiándose de sus resultados.\n\nTRATAMIENTO DEL ENFOQUE DE IGUALDAD DE GÉNERO (VALORES)\n\n1. Igualdad y dignidad\n2. Justicia\n3. Empatía");

        return vista;
    }

}

