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
 * Created by Juan on 8/01/2017.
 */

public class MainPerfilesEgreso extends ActionBarActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {

    private ViewPager vista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfilesegreso_main);

        Adaptador pa = new Adaptador(getSupportFragmentManager());
        vista = (ViewPager)findViewById(R.id.vista);
        vista.setAdapter(pa);

        vista.setOnPageChangeListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Perfiles de egreso");
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab = actionBar.newTab().setText("Perfil 1").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 2").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 3").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 4").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 5").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 6").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 7").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 8").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 9").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 10").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Perfil 11").setTabListener(this);
        actionBar.addTab (tab);



    }
    public class Adaptador extends FragmentPagerAdapter {
        public Adaptador (FragmentManager fm){
            super (fm);
        }
        public Fragment getItem(int arg0) {
            switch (arg0) {
                case 0:
                    return new PerfilEgreso1();
                case 1:
                    return new PerfilEgreso2();
                case 2:
                    return new PerfilEgreso3();
                case 3:
                    return new PerfilEgreso4();
                case 4:
                    return new PerfilEgreso5();
                case 5:
                    return new PerfilEgreso6();
                case 6:
                    return new PerfilEgreso7();
                case 7:
                    return new PerfilEgreso8();
                case 8:
                    return new PerfilEgreso9();
                case 9:
                    return new PerfilEgreso10();
                case 10:
                    return new PerfilEgreso11();
                default:
                    return null;
            }
        }

        public int getCount(){
            return 11;
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

