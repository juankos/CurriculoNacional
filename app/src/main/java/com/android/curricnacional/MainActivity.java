package com.android.curricnacional;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //PARA PONER TOAST EN BOTON
    private ImageButton miBoton;
    private ImageButton botonenfoques;
    private ImageButton botonperfilesegreso;
    private ImageButton botonplanes;
    private ImageButton botonprocesos;
    private ImageButton botonevaluacion;
    private ImageButton botondiverso;
    private ImageButton botonmensajeria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Currículo Nacional EBR");

        //PARA PONER TOAST
        miBoton = (ImageButton) findViewById(R.id.botoncompetencias);
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miBoton = new Intent(MainActivity.this, MainPerfil.class);
                startActivity(miBoton);
                Toast.makeText(getApplicationContext(), "Ingrese a cada competencia, para ver sus capacidades", Toast.LENGTH_LONG).show();
            }
        });

        botonenfoques = (ImageButton)findViewById(R.id.botonenfoques);
        botonenfoques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonenfoques = new Intent(MainActivity.this, MainEnfoques.class);
                startActivity(botonenfoques);
                Toast.makeText(getApplicationContext(), "Explore todos los enfoques", Toast.LENGTH_SHORT).show();

            }
        });

        botonperfilesegreso = (ImageButton)findViewById(R.id.botonPerfilegreso);
        botonperfilesegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonperfilesegreso = new Intent(MainActivity.this, MainPerfilesEgreso.class );
                startActivity(botonperfilesegreso);
                Toast.makeText(getApplicationContext(), "Explore los perfiles", Toast.LENGTH_SHORT).show();
            }
        });

        botonplanes = (ImageButton)findViewById(R.id.botonplanes);
        botonplanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonplanes = new Intent(MainActivity.this, MainPlanes.class);
                startActivity(botonplanes);
                Toast.makeText(getApplicationContext(), "Revise los planes de estudio, de los tres niveles", Toast.LENGTH_SHORT).show();

            }
        });

        botonprocesos = (ImageButton)findViewById(R.id.botonprocesos);
        botonprocesos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonprocesos = new Intent (MainActivity.this, MainProcesos.class);
                startActivity(botonprocesos);
                Toast.makeText(getApplicationContext(), "Revise las orientaciones pedagógicas para el desarrollo de competencias", Toast.LENGTH_LONG).show();
            }
        });

        botonevaluacion = (ImageButton)findViewById(R.id.botonevaluacion);
        botonevaluacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonevaluacion = new Intent(MainActivity.this, MainEvaluacion.class);
                startActivity(botonevaluacion);
                Toast.makeText(getApplicationContext(), "Revise las orientaciones para evaluar competencias.", Toast.LENGTH_SHORT).show();

            }
        });

        botondiverso = (ImageButton)findViewById(R.id.botondiverso);
        botondiverso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botondiverso = new Intent (MainActivity.this, MainDiverso.class);
                startActivity(botondiverso);
                Toast.makeText(getApplicationContext(), "Orientaciones para la diversificación curricular.", Toast.LENGTH_SHORT).show();
            }
        });

        botonmensajeria = (ImageButton)findViewById(R.id.botonmensaje);
        botonmensajeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonmensaje = new Intent (MainActivity.this, Mensajeria_1.class);
                startActivity(botonmensaje);
                Toast.makeText(getApplicationContext(), "Utilice el servicio para enviar mensajes", Toast.LENGTH_SHORT).show();
            }
        });


    }

}
