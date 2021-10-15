package com.example.tienda;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

//Clase inicio
public class HomeActivity extends AppCompatActivity {

    int REQUEST_CODE = 200;

    private Button botonusuario, botonadministrador;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        VerificarPermisos();
        VerificarPermisos2();

        botonadministrador = (Button) findViewById(R.id.botonadministrador);
        botonusuario = (Button) findViewById(R.id.botonusuario);
//llevar activity usuario
        botonusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
        //llevar activity administrador
        botonadministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginAdminActivity.class);
                startActivity(intent);

            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void VerificarPermisos() {
        int Permisos = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);

        if (Permisos == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Permiso concedido", Toast.LENGTH_SHORT).show();
        } else {
            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_CODE);
        }


    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void VerificarPermisos2() {
        int Permisos = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (Permisos == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Permiso concedido", Toast.LENGTH_SHORT).show();
        } else {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
        }


    }
}