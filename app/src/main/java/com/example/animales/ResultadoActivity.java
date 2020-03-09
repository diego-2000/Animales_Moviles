package com.example.animales;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    ImageView img;
    TextView nombre,especie,edad,descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        ActionBar actionBar = getSupportActionBar();

        this.img            =      findViewById(R.id.id_image);
        this.nombre         =      findViewById(R.id.id_nombre);
        this.especie        =      findViewById(R.id.id_especie);
        this.edad           =      findViewById(R.id.id_edad);
        this.descripcion    =      findViewById(R.id.id_descripcion);

        Intent intent =getIntent();
        String nombre_i= intent.getStringExtra("nombre");
        String especie_i= intent.getStringExtra("especie");
        String edad_i= intent.getStringExtra("edad");
        String descripcion_i= intent.getStringExtra("descripcion");

        this.nombre.setText(nombre_i);
        this.especie.setText(especie_i);
        this.edad.setText(edad_i);
        this.descripcion.setText(descripcion_i);
    }
}
