package com.example.tienda;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

// Relaciono las Categorias
public class FragmentUno extends Fragment {
    private View fragmento;
    private ImageView camaras, gafas, laptops, musicales;
    private ImageView tv, videojuegos, libro, licores;
    private ImageView camiseta, deporte, joyas, audifonos;


    public FragmentUno() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fragmento = inflater.inflate(R.layout.fragment_uno, container, false);

        camaras = (ImageView) fragmento.findViewById(R.id.camaras);
        laptops = (ImageView) fragmento.findViewById(R.id.laptop);
        gafas = (ImageView) fragmento.findViewById(R.id.gafas);
        musicales = (ImageView) fragmento.findViewById(R.id.musicales);

        tv = (ImageView) fragmento.findViewById(R.id.tv);
        videojuegos = (ImageView) fragmento.findViewById(R.id.videojuegos);
        libro = (ImageView) fragmento.findViewById(R.id.libros);
        licores = (ImageView) fragmento.findViewById(R.id.licores);

        camiseta = (ImageView) fragmento.findViewById(R.id.camiseta);
        deporte = (ImageView) fragmento.findViewById(R.id.deporte);
        joyas = (ImageView) fragmento.findViewById(R.id.joyas);
        audifonos = (ImageView) fragmento.findViewById(R.id.auriculares);
// referencio las categorias
        camaras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "camaras");
                startActivity(intent); }});

        gafas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "gafas");
                startActivity(intent); }});

        laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "laptops");
                startActivity(intent); }});

        musicales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "musicales");
                startActivity(intent); }});

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "tv");
                startActivity(intent); }});

        videojuegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "videojuegos");
                startActivity(intent); }});

        libro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "libro");
                startActivity(intent); }});

        licores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "licores");
                startActivity(intent); }});

        camiseta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "camiseta");
                startActivity(intent); }});

        deporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "deporte");
                startActivity(intent); }});

        joyas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "joyas");
                startActivity(intent); }});

        audifonos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AgregarproductoActivity.class);
                intent.putExtra("categoria", "audifonos");
                startActivity(intent); }});




        return fragmento;
    }
}
