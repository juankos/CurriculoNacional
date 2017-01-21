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

public class Enfoque3 extends Fragment{

    View vista;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.enfoque_3, container, false);
        TextView Enfoque3 = (TextView)vista.findViewById(R.id.enfoque_3);
        Enfoque3.setText("En el contexto de la realidad peruana, caracterizada por la diversidad sociocultural y lingüística, interculturalidad es el proceso dinámico y permanente de interacción e intercambio entre personas de diferentes culturas, orientado a una convivencia basada en el acuerdo y la complementariedad, así como en el respeto a la propia identidad y a las diferencias. La interculturalidad parte de entender que en cualquier sociedad del planeta las culturas están vivas, no son estáticas ni aisladas, y en su interrelación van generando cambios que contribuyen de manera natural a su desarrollo, siempre que no se menoscabe su identidad ni exista pretensión de hegemonía o dominio por parte de ninguna.\n\nTRATAMIENDO DEL ENFOQUE INTERCULTURAL (VALORES)\n\n1. Respeto a la identidad cultural\n2. Justicia\n3. Diálogo intercultural");

        return vista;
    }

}
