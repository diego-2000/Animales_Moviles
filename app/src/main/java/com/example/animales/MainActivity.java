package com.example.animales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;

import java.security.acl.AclNotFoundException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterAnimal adapterAnimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.id_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapterAnimal= new AdapterAnimal(this,getLinsta());
        recyclerView.setAdapter(adapterAnimal);
    }

    private ArrayList<Animal> getLinsta(){
        ArrayList<Animal> arrAni= new ArrayList<>();

        Animal animal = new Animal();
               animal.setDescripcion("Descripcion\nTierno");
               animal.setEdad("Vive\n16 Años");
               animal.setEspecie("Especie\nFelino");
               animal.setNombre("Nombre\nGato");
               animal.setImg(R.drawable.ic_launcher_background);
        arrAni.add(animal);

        Animal animal1 = new Animal();
             animal1.setDescripcion("Descripcion\nrecolectan\nmienl");
             animal1.setEdad("Vive\n28 Dias");
             animal1.setEspecie("Especie\nhimenópteros");
             animal1.setNombre("Nombre\nAbeja");
             animal1.setImg(R.drawable.ic_launcher_background);
        arrAni.add(animal1);

        Animal animal2 = new Animal();
        animal2.setDescripcion("Descripcion\nMortal");
        animal2.setEdad("Vive\n14 Años");
        animal2.setEspecie("Especie\nFelino");
        animal2.setNombre("Nombre\nLeon");
        animal2.setImg(R.drawable.ic_launcher_background);
        arrAni.add(animal2);
        return arrAni;
    }



}
