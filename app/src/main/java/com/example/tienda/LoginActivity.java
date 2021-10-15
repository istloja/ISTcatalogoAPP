package com.example.tienda;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// login del usuario
public class LoginActivity extends AppCompatActivity {
    private Button enviarnumero;
    private EditText numero, codigo;

    private String usuario, clave;

// claves de usuario
    String user = new String("user");
    String clav = new String("1234");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        numero = (EditText) findViewById(R.id.codigo);
        codigo = (EditText) findViewById(R.id.numero);
        enviarnumero = (Button) findViewById(R.id.enviarbumero);
        enviarnumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = numero.getText().toString();
                clave = codigo.getText().toString();

                if (user.equals(clave) & clav.equals(usuario)) {
                    Toast.makeText(LoginActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                    EnviaralaPrincipal();

                } else {
                    Toast.makeText(LoginActivity.this, "Error en las Credenciales", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
// envio ala actividad principal que es el mostrador
    private void EnviaralaPrincipal() {
        Intent intent = new Intent(LoginActivity.this, PrincipalActivity.class);
        startActivity(intent);


    }
}