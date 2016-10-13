package com.example.javier.a02_android_ejerciciosclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * al clickar en el boton, se pondrá el simbolo en el textblock
 * poner botón para el resultaod, controlando que el segundo número no sea cero
 */
public class Calculadora extends AppCompatActivity {

    private EditText num1,num2;
    private TextView simbolo,resultado;
    private Button sumar,restar,multiplicar,dividir,calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);

        simbolo=(TextView) findViewById(R.id.simbolo);

    }
}
