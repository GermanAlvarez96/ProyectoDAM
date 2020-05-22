package com.example.swipeviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> listaCategorias = new ArrayList<>();
    //Habrán varios arrays que contendrán la iformación obtenida de la BD, este es uno de ejemplo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaCategorias.add("Hogar");
        listaCategorias.add("Deporte");
        listaCategorias.add("Electronica");
        listaCategorias.add("Limpieza");

        // Creamos la vista ViewPager, que permite visualizar varios Fragments en una misma activity
        // La idea es cargar en cada Fragment la información de un producto
        ViewPager viewPager = findViewById(R.id.view_pager);

        // Indica el numero de Fragments que pueden estar en memoria a la vez
        viewPager.setOffscreenPageLimit(1);

        // Pasamos los arrays con la información de la BD a través del constructor del adaptador del SwipeView
        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager(), listaCategorias);
        viewPager.setAdapter(swipeAdapter);

        // Fijamos que el primer Fragment que se muestra es el que corresponde a la posición 0 del Array
        viewPager.setCurrentItem(0);

    }
}
