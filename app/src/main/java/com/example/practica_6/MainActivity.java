package com.example.practica_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;
import android.os.CountDownTimer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = (TextView) findViewById(R.id.contadortiempo);
        new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {
                contador.setText("Tiempo para empezar: " + millisUntilFinished / 1000);
            }
            public void onFinish() {
                contador.setText("Comenzando...");
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        }.start();

    }
}