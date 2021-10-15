package com.example.tienda;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//loggin del administrador
public class LoginAdminActivity extends AppCompatActivity {

    private Button enviarnumero;
    private EditText numero, codigo;
    private String usuario, clave;


    String user = new String("admin");
    String clav = new String("1234");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        numero = (EditText) findViewById(R.id.codigoadmin);
        codigo = (EditText) findViewById(R.id.numeroadmin);
        enviarnumero = (Button) findViewById(R.id.enviarbumeroadmin);


        enviarnumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = numero.getText().toString();
                clave = codigo.getText().toString();

                if (user.equals(clave) & clav.equals(usuario)) {
                    Toast.makeText(LoginAdminActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                    EnviaralaPrincipal();

                } else {
                    Toast.makeText(LoginAdminActivity.this, "Error en las Credenciales", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
// envio actividad del administrador
    private void EnviaralaPrincipal() {
        Intent intent = new Intent(LoginAdminActivity.this, AdminActivity.class);
        startActivity(intent);


    }


}