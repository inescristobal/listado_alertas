package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class VisorImagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen);

        ImageView img = (ImageView) findViewById(R.id.ivImagenCompleta);

        Intent i = getIntent();
        Bundle b = i.getExtras();

        if (b != null) {

            img.setImageResource(b.getInt("IMG"));
        }

    }
}