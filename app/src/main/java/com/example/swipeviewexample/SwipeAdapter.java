package com.example.swipeviewexample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class SwipeAdapter extends FragmentStatePagerAdapter {

    private ArrayList<String> listaCategorias;

    public SwipeAdapter(@NonNull FragmentManager fm, ArrayList<String> arrayList) {
        super(fm);
        listaCategorias = new ArrayList<>();
        this.listaCategorias = arrayList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        // A través de los indices de los Arrays definimos que información debe mostrar cada Fragment
        Fragment pageFragment = new FragmentPage();
        Bundle bundle = new Bundle();
        bundle.putString("categoria", listaCategorias.get(position));
        pageFragment.setArguments(bundle);

        return pageFragment;
    }

    @Override
    public int getCount() {
        // En este método establecemos que hayan tantos Fragments como items en los Arrays
        return listaCategorias.size();
    }
}
