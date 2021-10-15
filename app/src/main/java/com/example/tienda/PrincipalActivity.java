package com.example.tienda;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tienda.Modal.Productos;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
// muestro productos al usuario
public class PrincipalActivity extends AppCompatActivity  {

    private DatabaseReference ProductosRef;

    private RecyclerView reciclerMENU;
    RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        ProductosRef = FirebaseDatabase.getInstance().getReference().child("Productos");
        reciclerMENU=findViewById(R.id.recicler_menu);
        reciclerMENU.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        reciclerMENU.setLayoutManager(layoutManager);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);



    }


    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerOptions<Productos> options= new FirebaseRecyclerOptions.Builder<Productos>()
                .setQuery(ProductosRef,Productos.class).build();
        FirebaseRecyclerAdapter<Productos,ProductoViewHoler> adapter =new FirebaseRecyclerAdapter<Productos, ProductoViewHoler>(options) {
            @Override
            protected void onBindViewHolder(@NonNull ProductoViewHoler holder, int position, @NonNull Productos model) {

                holder.productNom.setText(model.getNombre());
                holder.productoCantidad.setText("Disponibles :"+model.getCantidad());
                holder.productoDescrip.setText(model.getDescripcion());
                holder.productoPrecio.setText("$ "+model.getPrecioven());
                holder.producto_codigo.setText("Codigo: "+model.getPid());
                // uso de la libreria picaso
                Picasso.get().load(model.getImagen()).into(holder.productoImagen);


            }

            @NonNull
            @Override
            public ProductoViewHoler onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.productos_item_layout,viewGroup,false);
                //objeto de holder
                ProductoViewHoler holder= new ProductoViewHoler(view);

                return holder;
            }
        };
        reciclerMENU.setAdapter(adapter);
        adapter.startListening();



    }

    //si doy para atras controlo que se cierre
    @Override
    public void onBackPressed() {

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }








}