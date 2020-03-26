package com.example.animales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;

import java.security.acl.AclNotFoundException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterAnimal adapterAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.id_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Animal> arrAni= new ArrayList<>();

        Animal gato = new Animal();
        gato.setDescripcion("Tierno");
        gato.setEdad("16 Años");
        gato.setEspecie("Felino");
        gato.setNombre("Gato");
        gato.setImg("gato");
        arrAni.add(gato);

        Animal abeja = new Animal();
        abeja.setDescripcion("Recolectan miel");
        abeja.setEdad("28 Dias");
        abeja.setEspecie("Himenópteros");
        abeja.setNombre("Abeja");
        abeja.setImg("abeja");
        arrAni.add(abeja);

        Animal jaguar = new Animal();
        jaguar.setDescripcion("Mortal");
        jaguar.setEdad("14 Años");
        jaguar.setEspecie("Felino");
        jaguar.setNombre("Jaguar");
        jaguar.setImg("jaguar");
        arrAni.add(jaguar);

        Animal perro = new Animal();
        perro .setDescripcion("Tierno");
        perro .setEdad("14 Años");
        perro .setEspecie("Canino");
        perro .setNombre("Perro");
        perro .setImg("perro");
        arrAni.add(perro);
        adapterAnimal= new AdapterAnimal(this,arrAni);
        recyclerView.setAdapter(adapterAnimal);
    }

}
