package com.example.ocrispum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriarCodigoTempoDeEnzima extends AppCompatActivity {

    //Botoes
    Button botaoEnzima5;
    Button botaoEnzima4;
    Button botaoEnzima3;
    Button botaoEnzima0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_codigo_tempo_de_enzima);

        //Acho os botoes no xml e salvo na variaveis
        botaoEnzima5 = findViewById(R.id.enzima5);
        botaoEnzima4 = findViewById(R.id.enzima4);
        botaoEnzima3 = findViewById(R.id.enzima3);
        botaoEnzima0 = findViewById(R.id.enzima0);

        //Botao Enzima 5hrs
        botaoEnzima5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("5");

                Intent numeroDoRecipiente = new Intent(getApplicationContext(), CriarCodigoNumeroDoRecipiente.class);
                startActivity(numeroDoRecipiente);

            }
        });

        //Botao Enzima 4hrs
        botaoEnzima4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("4");

                Intent numeroDoRecipiente = new Intent(getApplicationContext(), CriarCodigoNumeroDoRecipiente.class);
                startActivity(numeroDoRecipiente);

            }
        });

        //Botao Enzima 3hrs
        botaoEnzima3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("3");

                Intent numeroDoRecipiente = new Intent(getApplicationContext(), CriarCodigoNumeroDoRecipiente.class);
                startActivity(numeroDoRecipiente);

            }
        });

        //Botao Enzima 0hrs
        botaoEnzima0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("0");

                Intent numeroDoRecipiente = new Intent(getApplicationContext(), CriarCodigoNumeroDoRecipiente.class);
                startActivity(numeroDoRecipiente);

            }
        });

    }

    //FUNCAO DE OCULTAR BARRAS E DEIXAR EM FULLSCREEN
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }
}