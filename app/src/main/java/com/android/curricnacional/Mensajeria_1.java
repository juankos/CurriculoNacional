package com.android.curricnacional;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Juan on 20/01/2017.
 */

public class Mensajeria_1 extends ActionBarActivity {

    private EditText destinatario;
    private EditText asunto;
    private EditText mensaje;
    private ImageButton enviarCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensajeria_main);

        //Código para mostrar título de la aplicación

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Enviar correo electrónico");

        //Código para relacionar los elementos del fragment con la parte lógica

        destinatario = (EditText)findViewById(R.id.destinatario);
        asunto = (EditText)findViewById(R.id.asunto);
        mensaje = (EditText)findViewById(R.id.mensaje);
        enviarCorreo = (ImageButton)findViewById(R.id.enviarCorreo);

        enviarCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarCorreo();

                //Limpiamos los campos
                destinatario.setText("");
                asunto.setText("");
                mensaje.setText("");
            }
        });

    }
    //Código para enviar los mensajes
    protected void enviarCorreo(){
        String[] destinatarios = {destinatario.getText().toString()};
        Intent emailIntent = new Intent (Intent.ACTION_SEND, Uri.parse("mailto:"));
        emailIntent.setType("message/rfc822");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, destinatarios);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, asunto.getText().toString());
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje.getText().toString());

        try {
            startActivity(Intent.createChooser(emailIntent, "Elija un cliente de correo electrónico"));
        }catch (Exception e){
            Toast.makeText(Mensajeria_1.this, "Ningún cliente de correo instalado", Toast.LENGTH_SHORT).show();

        }

    }
}
