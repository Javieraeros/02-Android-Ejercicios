package com.example.javier.a02_android_ejerciciosclase;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class ActividadPrincipal extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private EditText texto;
    private CheckBox negrita,enorme,pequeño,rojo;
    private boolean negritaOn,enormeOn,pequeñoOn,rojoOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        texto=(EditText) findViewById(R.id.texto);

        negrita=(CheckBox) findViewById(R.id.negrita);
        negrita.setOnCheckedChangeListener(this);

        enorme=(CheckBox) findViewById(R.id.gigante);
        enorme.setOnCheckedChangeListener(this);

        pequeño=(CheckBox) findViewById(R.id.minusculo);
        pequeño.setOnCheckedChangeListener(this);

        rojo=(CheckBox) findViewById(R.id.rojo);
        rojo.setOnCheckedChangeListener(this);

        negritaOn=enormeOn=pequeñoOn=rojoOn=false;

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.negrita:
                if(negritaOn){
                    texto.setTypeface(null,Typeface.NORMAL);
                    negritaOn=false;
                }else {
                    texto.setTypeface(null, Typeface.BOLD);
                    negritaOn=true;
                }
                break;
            case R.id.gigante:
                if(pequeñoOn){
                    pequeño.setChecked(false);
                }
                if(enormeOn){
                    texto.setTextSize(0,40);
                    enormeOn=false;
                }else{
                    texto.setTextSize(0,200);
                    enormeOn=true;
                }
                break;
            case R.id.minusculo:
                if(enormeOn){
                    enorme.setChecked(false);
                }
                if(pequeñoOn){
                    texto.setTextSize(0,40);
                    pequeñoOn=false;
                }else{
                    texto.setTextSize(0,2);
                    pequeñoOn=true;
                }
                break;
            case R.id.rojo:
                if(rojoOn){
                    texto.setTextColor(Color.BLACK);
                    rojoOn=false;
                }else{
                    texto.setTextColor(Color.RED);
                    rojoOn=true;
                }
                break;
        }
    }
}
