package com.android.curricnacional;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Juan on 18/01/2017.
 */

public class MainProcesos extends ActionBarActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {

    private ViewPager vista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proceso_main);

        Adaptador pa = new Adaptador(getSupportFragmentManager());
        vista = (ViewPager)findViewById(R.id.vista);
        vista.setAdapter(pa);

        vista.setOnPageChangeListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Cómo desarrollar competencias");
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab = actionBar.newTab().setText("De dónde\npartir").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Generar\ninterés").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Aprender haciendo").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Saberes\nprevios").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("El nuevo\nconocimiento").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Aprender del error").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("El conflicto cognitivo").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Progreso del\naprendizaje").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("El trabajo cooperativo").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("El pensamiento complejo").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("TUTORÍA\nGRUPAL").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("TUTORÍA INDIVIDUAL").setTabListener(this);
        actionBar.addTab (tab);



    }
    public class Adaptador extends FragmentPagerAdapter {
        public Adaptador (FragmentManager fm){
            super (fm);
        }
        public Fragment getItem(int arg0) {
            switch (arg0) {
                case 0:
                    return new Proceso1();
                case 1:
                    return new Proceso2();
                case 2:
                    return new Proceso3();
                case 3:
                    return new Proceso4();
                case 4:
                    return new Proceso5();
                case 5:
                    return new Proceso6();
                case 6:
                    return new Proceso7();
                case 7:
                    return new Proceso8();
                case 8:
                    return new Proceso9();
                case 9:
                    return new Proceso10();
                case 10:
                    return new Proceso11();
                case 11:
                    return new Proceso12();


                default:

                    return null;
            }
        }

        public int getCount(){
            return 12;
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        vista.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int i) {
        getSupportActionBar().setSelectedNavigationItem(i);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

}
