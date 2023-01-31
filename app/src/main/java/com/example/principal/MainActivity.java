package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    Boton boton_comer = new Boton(1, "comer",3093151, Uri.parse("R.drawable.comer"), RingtoneManager.getActualDefaultRingtoneUri(getApplicationContext(), RingtoneManager.TYPE_ALARM), true);
    Boton boton_bagno = new Boton(2, "baño",16777017, Uri.parse("R.drawable.bagno"), RingtoneManager.getActualDefaultRingtoneUri(getApplicationContext(), RingtoneManager.TYPE_ALARM), false);

    //Clase creada: Boton

    Boton botones[] = {boton_comer, boton_bagno};

    //int [] datosImg = {R.drawable.bagno, R.drawable.comer, R.drawable.dormir, R.drawable.jugar, R.drawable.aseo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.lvLista);

        lista.setAdapter(new Adaptador(this, botones));
    }
}