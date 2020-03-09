package com.example.animales;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterAnimal extends RecyclerView.Adapter <HolderAnimal>{
    Context cont;
    ArrayList<Animal> arrAnimal;
    public AdapterAnimal(Context cont,ArrayList<Animal> arrAnimal){
        this.cont=cont;
        this.arrAnimal=arrAnimal;
    }


    @NonNull
    @Override
    public HolderAnimal onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,null);

        return new HolderAnimal(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderAnimal holder, int position) {

        holder.img.setImageResource(arrAnimal.get(position).getImg());
        holder.nombre.setText(arrAnimal.get(position).getNombre());
        holder.especie.setText(arrAnimal.get(position).getEspecie());
        holder.edad.setText(arrAnimal.get(position).getEdad());
        holder.descripcion.setText(arrAnimal.get(position).getDescripcion());

        holder.setClickItem(new ClickItem() {
            @Override
            public void onClickItem(View v, int i) {

             //   Animal ani= new Animal();
              String nombre=arrAnimal.get(i).getNombre();
              String especie=arrAnimal.get(i).getEspecie();
              String edad=arrAnimal.get(i).getEdad();
              String descripcion=arrAnimal.get(i).getDescripcion();
                //BitmapDrawable bitmapDrawable=(BitmapDrawable)HolderAnimal.img.getDrawable();
                //Bitmap bitmap = bitmapDrawable.getBitmap();
            Intent intetn = new Intent(cont,ResultadoActivity.class);

            intetn.putExtra("nombre",nombre);
            intetn.putExtra("especie",especie);
            intetn.putExtra("edad",edad);
            intetn.putExtra("descripcion",descripcion);
                cont.startActivity(intetn);
            }
        });
    }



    @Override
    public int getItemCount() {
        return arrAnimal.size();
    }
}
