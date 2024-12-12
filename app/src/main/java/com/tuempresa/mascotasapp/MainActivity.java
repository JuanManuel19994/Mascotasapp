package com.tuempresa.mascotasapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import database.DatabaseHelper;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa la base de datos
        DatabaseHelper dbHelper = new DatabaseHelper(this);

        // Implementar funcionalidad para mostrar y calificar mascotas
    }
}
