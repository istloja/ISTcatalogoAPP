package com.example.tienda;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
//lista
//
public class AdminActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        bottomNavigationView = findViewById(R.id.boton_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);

    }
//escucha el menu botton
    private BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

//fragmento agregar producto
            if (item.getItemId() == R.id.fragmentProductos) {
                Fragmentos(new ProductosFragment());
            }
            // fragmento inventario
            if (item.getItemId() == R.id.fragmentDos) {
                Intent intent = new Intent(AdminActivity.this, PrincipalActivity.class);
                startActivity(intent);
            }

            return true;
        }
    };
//muestra menu agregar producto
    private void Fragmentos(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit();

    }

}


