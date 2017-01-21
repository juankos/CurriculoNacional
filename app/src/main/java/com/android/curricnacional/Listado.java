package com.android.curricnacional;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Juan on 6/01/2017.
 */

@SuppressLint("NewApi") public class Listado extends ListFragment {

    OnHeadlineSelectedListener mCallBack;

    public interface OnHeadlineSelectedListener{
        public void onArticleSelected (int position);
    }
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
                android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;
        setListAdapter(new ArrayAdapter<String>(getActivity(), layout, Contenido.perfiles));
    }
    public void onStart(){
        super.onStart();

        if (getFragmentManager().findFragmentById(R.id.fragmento_contenidos) != null){
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
    }

    public void onAttach(Activity activity){
        super.onAttach(activity);

        try {
            mCallBack = (OnHeadlineSelectedListener) activity;

        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString() + "must implement OnHeadSelectedListener");
        }
    }
    public void onListItemClick(ListView l, View view, int position, long id){
        mCallBack.onArticleSelected(position);
        getListView().setItemChecked(position, true);
    }


}
