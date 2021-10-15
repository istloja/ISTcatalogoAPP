package com.example.tienda;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
//main
public class MainActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// doy el efecto de inicio
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);

                } catch (Exception e) {
                    e.printStackTrace();

                } finally {
                    //cuando voy atras finalizo la actividad
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}

