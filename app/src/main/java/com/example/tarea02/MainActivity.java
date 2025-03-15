package com.example.tarea02;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // actividad principal de registro
        setContentView(R.layout.activity_main);
        // actividad de confirmación
        //setContentView(R.layout.activity_confirmacion);
    }
}