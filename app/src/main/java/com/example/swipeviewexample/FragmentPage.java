package com.example.swipeviewexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentPage extends Fragment implements View.OnClickListener {

    private Button btnToast;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view;
        // Obtenemos la información a través del Adapter
        final Bundle bundle = getArguments();
        final String strCategoria = bundle.getString("categoria");

        view = inflater.inflate(R.layout.page_fragment_layout, container, false);
        TextView textView = view.findViewById(R.id.categoria);
        textView.setText(strCategoria);

        //btnToast.findViewById(R.id.btnToast);
        //btnToast.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        /**
         * DUDA: No consigo acceder ni a la String strCategoria ni a la información que contiene el
         * bundle para trabajar con ella desde este método. He probado a crear las variables como
         * variables globales para que sean visibles desde toda la clase pero no me ha funcionado.
         * He comentado el botón en esta clase y el boton y TextView en page_fragment_layout.xml
         * para que la aplicación no pete
         * */

        //TextView tvCategoria = findViewById(R.id.textoCategoria);
        //txCategoria.setText(bundle.getString("categoria");
    }
}
