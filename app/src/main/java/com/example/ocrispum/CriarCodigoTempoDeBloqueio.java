package com.example.ocrispum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriarCodigoTempoDeBloqueio extends AppCompatActivity {

    //Botoes
    Button botaoBloqueio24;
    Button botaoBloqueio8;
    Button botaoBloqueio4;
    Button botaoBloqueio0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_codigo_tempo_de_bloqueio);

        //Acho os botoes no xml e salvo na variaveis
        botaoBloqueio24 = findViewById(R.id.bloqueio24);
        botaoBloqueio8 = findViewById(R.id.bloqueio8);
        botaoBloqueio4 = findViewById(R.id.bloqueio4);
        botaoBloqueio0 = findViewById(R.id.bloqueio0);

        //Botao Bloqueio 24hrs
        botaoBloqueio24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("24");

                Intent tempoDeEnzima = new Intent(getApplicationContext(), CriarCodigoTempoDeEnzima.class);
                startActivity(tempoDeEnzima);

            }
        });

        //Botao Bloqueio 08hrs
        botaoBloqueio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("08");

                Intent tempoDeEnzima = new Intent(getApplicationContext(), CriarCodigoTempoDeEnzima.class);
                startActivity(tempoDeEnzima);

            }
        });

        //Botao Bloqueio 04hrs
        botaoBloqueio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("04");

                Intent tempoDeEnzima = new Intent(getApplicationContext(), CriarCodigoTempoDeEnzima.class);
                startActivity(tempoDeEnzima);

            }
        });

        //Botao Bloqueio 00hrs
        botaoBloqueio0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("00");

                Intent tempoDeEnzima = new Intent(getApplicationContext(), CriarCodigoTempoDeEnzima.class);
                startActivity(tempoDeEnzima);

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