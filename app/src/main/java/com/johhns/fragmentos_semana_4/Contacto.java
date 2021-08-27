package com.johhns.fragmentos_semana_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Toolbar barra_acciones = findViewById( R.id.miActionBar ) ;
        setSupportActionBar(barra_acciones);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}