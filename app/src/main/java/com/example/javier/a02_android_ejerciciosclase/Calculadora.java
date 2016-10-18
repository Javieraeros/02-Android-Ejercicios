package com.example.javier.a02_android_ejerciciosclase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * al clickar en el boton, se pondrá el simbolo en el textblock
 * poner botón para el resultaod, controlando que el segundo número no sea cero
 */
public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    private EditText num1,num2;
    private TextView simbolo,resultado;
    private Button sumar,restar,multiplicar,dividir,atras;
    private Double res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);

        simbolo=(TextView) findViewById(R.id.simbolo);
        resultado=(TextView) findViewById(R.id.resultado);

        sumar=(Button) findViewById(R.id.sumar);
        sumar.setOnClickListener(this);
        restar=(Button) findViewById(R.id.restar);
        restar.setOnClickListener(this);
        multiplicar=(Button) findViewById(R.id.multiplicar);
        multiplicar.setOnClickListener(this);
        dividir=(Button) findViewById(R.id.dividir);
        dividir.setOnClickListener(this);
        atras=(Button) findViewById(R.id.atras);
        atras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sumar:
                simbolo.setText("+");
                try {
                    res = Double.parseDouble(num1.getText().toString()) +
                            Double.parseDouble(num2.getText().toString());
                }catch (NumberFormatException e){
                    res=0.0;
                }
                resultado.setText(res.toString());
                break;
            case R.id.restar:
                simbolo.setText("-");
                try {
                    res = Double.parseDouble(num1.getText().toString()) -
                            Double.parseDouble(num2.getText().toString());
                }catch (NumberFormatException e){
                    res=0.0;
                }
                resultado.setText(res.toString());
                break;
            case R.id.multiplicar:
                simbolo.setText("*");
                try {
                    res = Double.parseDouble(num1.getText().toString()) *
                            Double.parseDouble(num2.getText().toString());
                }catch (NumberFormatException e){
                    res=0.0;
                }
                resultado.setText(res.toString());
                break;
            case R.id.dividir:
                simbolo.setText("/");
                try {
                    res = Double.parseDouble(num1.getText().toString()) /
                            Double.parseDouble(num2.getText().toString());
                }catch (NumberFormatException e){
                    res=0.0;
                }
                resultado.setText(res.toString());
                break;
            case R.id.atras:
                Intent principal=new Intent(this,ActividadPrincipal.class);
                startActivity(principal);
                break;
        }
    }
}
