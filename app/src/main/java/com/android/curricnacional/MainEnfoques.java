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

public class MainEnfoques extends ActionBarActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {

    private ViewPager vista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enfoques_main);



        Adaptador pa = new Adaptador(getSupportFragmentManager());
        vista = (ViewPager)findViewById(R.id.vista);
        vista.setAdapter(pa);

        vista.setOnPageChangeListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Enfoques transversales");
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab = actionBar.newTab().setText("Enfoque de derechos").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Inclusión y diversidad").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Intercul-\nturalidad").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Igualdad de género").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("Enfoque ambiental").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("El bien común").setTabListener(this);
        actionBar.addTab (tab);

        tab = actionBar.newTab().setText("La excelencia").setTabListener(this);
        actionBar.addTab (tab);

    }
    public class Adaptador extends FragmentPagerAdapter {
        public Adaptador (FragmentManager fm){
            super (fm);
        }
        public Fragment getItem(int arg0) {
            switch (arg0) {
                case 0:
                    return new Enfoque1();
                case 1:
                    return new Enfoque2();
                case 2:
                    return new Enfoque3();
                case 3:
                    return new Enfoque4();
                case 4:
                    return  new Enfoque5();
                case 5:
                    return new Enfoque6();
                case 6:
                    return new Enfoque7();
                default:

                    return null;
            }
        }

        public int getCount(){
            return 7;
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

