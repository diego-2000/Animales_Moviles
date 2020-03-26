package com.example.animales;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderAnimal extends RecyclerView.ViewHolder implements View.OnClickListener {
  //  ImageView img;
    TextView nombre,especie,edad,descripcion;
    ClickItem click;
    HolderAnimal(@NonNull View itemView) {
        super(itemView);
        //this.img=itemView.findViewById(R.id.id_image);
        //this.edad=itemView.findViewById(R.id.id_edad);
        this.nombre=itemView.findViewById(R.id.id_nombre);
        this.especie=itemView.findViewById(R.id.id_especie);
        this.descripcion=itemView.findViewById(R.id.id_descripcion);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.click.onClickItem(view,getLayoutPosition());
    }

    public void setClickItem(ClickItem a){
        this.click=a;
    }
}
