package com.example.principal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    Boton[] datos;

    public Adaptador(Context contexto, Boton[] datos) {

        this.contexto = contexto;
        this.datos = datos;

        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.elemento_lista, null);
        TextView titulo = (TextView) vista.findViewById(R.id.tvTitulo);
        ImageView imagen = (ImageView) vista.findViewById(R.id.ivImagen);
        Switch cambio = (Switch) vista.findViewById(R.id.sw);
       // ConstraintLayout fondo = (ConstraintLayout) vista.findViewById(R.id.fondo);

        titulo.setText(datos[i].getTexto());
        imagen.setImageURI(datos[i].getImagen());
        cambio.setEnabled(datos[i].isActivado());
        vista.setBackgroundColor(datos[i].getColor());

       /* imagen.setTag(i); //Agrega una etiqueta a la imagen para saber cuál ha sido clickeada

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(contexto, VisorImagen.class);
                visorImagen.putExtra("IMG", datosImg[(Integer)v.getTag()]);
                contexto.startActivity(visorImagen);
            }
        });*/

        return vista;
    }

    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

}
