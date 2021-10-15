package com.example.tienda;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//imp
// clase escucha el producto que seleciona
public class ProductoViewHoler extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView productNom, productoDescrip, productoPrecio, productoCantidad, producto_codigo;
    public ImageView productoImagen;
    public ItemClickListener listener;

    public ProductoViewHoler(@NonNull View itemView) {
        super(itemView);
        productNom = (TextView) itemView.findViewById(R.id.producto_nombre);
        productoDescrip = (TextView) itemView.findViewById(R.id.producto_descripcion);
        productoPrecio = (TextView) itemView.findViewById(R.id.producto_precio);
        productoCantidad = (TextView) itemView.findViewById(R.id.producto_cantidad);
        producto_codigo = (TextView) itemView.findViewById(R.id.producto_codigo);
        productoImagen = (ImageView) itemView.findViewById(R.id.producto_imagen);

    }

    public void setItemClickListener(ItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        listener.onClick(v, getAdapterPosition(), false);

    }
}
