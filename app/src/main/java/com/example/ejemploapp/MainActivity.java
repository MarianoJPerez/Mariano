package com.example.ejemploapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void tirarDado(View view) {
       
       Log.i("tirar-dato", "Ganaste");
        LinearLayout resultados = findViewById(R.id.resultados);
       TextView resultado = new TextView( this);
       resultado.setText(R.string.text_win);
        resultados.addView(resultado);

    }
}