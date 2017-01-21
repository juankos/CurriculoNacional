package com.android.curricnacional;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Juan on 9/01/2017.
 */

public class MainPlanes extends TabActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //Sacar o borrar este código, para que funcionen los tabs
        //setContentView(R.layout.planes_main);

        TabHost th = getTabHost();

        th.addTab(th.newTabSpec("Inicial").setIndicator("Inicial").setContent(new Intent(this, Planes1.class)));
        th.addTab(th.newTabSpec("Primaria").setIndicator("Primaria").setContent(new Intent(this, Planes2.class)));
        th.addTab(th.newTabSpec("Secundaria").setIndicator("Secundaria").setContent(new Intent(this, Planes3.class)));
    }

}
