package com.android.curricnacional;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Juan on 6/01/2017.
 */

public class MainPerfil extends FragmentActivity implements Listado.OnHeadlineSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_main);

        if (findViewById(R.id.fragment_container)!=null){
            if (savedInstanceState !=null){
                return;
            }
            Listado primerFragmento = new Listado();
            primerFragmento.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, primerFragmento).commit();

        }

    }

    @Override
    public void onArticleSelected(int position) {
        Fragmentos contenido = (Fragmentos) getSupportFragmentManager().findFragmentById(R.id.fragmento_contenidos);
        if (contenido != null){
            contenido.updateArticleView(position);

        }else{
            Fragmentos nuevoFragmento = new Fragmentos();
            Bundle args = new Bundle();
            args.putInt(Fragmentos.ARG_POSITION, position);
            nuevoFragmento.setArguments(args);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, nuevoFragmento);
            transaction.addToBackStack(null);
            transaction.commit();

        }

    }

}
