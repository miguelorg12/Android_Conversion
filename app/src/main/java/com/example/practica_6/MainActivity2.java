package com.example.practica_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import Models.Celsius;
import Models.Fahrenheit;
import Models.Kelvin;


public class MainActivity2 extends AppCompatActivity {
    TextView temp1, temp2, resul1, resul2;
    Button convertir;
    Spinner tipostemp;
    EditText temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        temp1 = findViewById(R.id.tipotemp1);
        temp2 = findViewById(R.id.tipotemp2);
        resul1 = findViewById(R.id.resultado1);
        resul2 = findViewById(R.id.resultado2);
        convertir = findViewById(R.id.botonconvertir);
        tipostemp = findViewById(R.id.tipotemperatura);
        temp = findViewById(R.id.temperatura);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.conversiones, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipostemp.setAdapter(adapter);
        convertir.setOnClickListener(view-> {
            if (tipostemp.getSelectedItem().toString().equals("Celsius")) {
                Celsius celsius = new Celsius(Double.parseDouble(temp.getText().toString()));
                temp1.setText(new Kelvin(celsius.getValor()).getUnidad());
                temp2.setText(new Fahrenheit(celsius.getValor()).getUnidad());
                resul1.setText(String.valueOf(celsius.parse(new Kelvin(celsius.getValor())).getValor()));
                resul2.setText(String.valueOf(celsius.parse(new Fahrenheit(celsius.getValor())).getValor()));
            } else if (tipostemp.getSelectedItem().toString().equals("Fahrenheit")) {
                Fahrenheit fahrenheit = new Fahrenheit(Double.parseDouble(temp.getText().toString()));
                temp1.setText(new Celsius(fahrenheit.getValor()).getUnidad());
                temp2.setText(new Kelvin(fahrenheit.getValor()).getUnidad());
                resul1.setText(String.valueOf(fahrenheit.parse(new Celsius(fahrenheit.getValor())).getValor()));
                resul2.setText(String.valueOf(fahrenheit.parse(new Kelvin(fahrenheit.getValor())).getValor()));
            } else if (tipostemp.getSelectedItem().toString().equals("Kelvin")) {
                Kelvin kelvin = new Kelvin(Double.parseDouble(temp.getText().toString()));
                temp1.setText(new Celsius(kelvin.getValor()).getUnidad());
                temp2.setText(new Fahrenheit(kelvin.getValor()).getUnidad());
                resul1.setText(String.valueOf(kelvin.parse(new Celsius(kelvin.getValor())).getValor()));
                resul2.setText(String.valueOf(kelvin.parse(new Fahrenheit(kelvin.getValor())).getValor()));
            }
        });
    }
}