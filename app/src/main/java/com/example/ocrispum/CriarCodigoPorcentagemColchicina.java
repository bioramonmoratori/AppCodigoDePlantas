package com.example.ocrispum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriarCodigoPorcentagemColchicina extends AppCompatActivity {

    //Botoes
    Button botaoColchicina01;
    Button botaoColchicina05;
    Button botaoColchicina00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_codigo_porcentagem_colchicina);

        //Acho os botoes no xml e salvo na variaveis
        botaoColchicina01 = findViewById(R.id.porcentagem01);
        botaoColchicina05 = findViewById(R.id.porcentagem05);
        botaoColchicina00 = findViewById(R.id.porcentagem00);

        //Botao 01%
        botaoColchicina01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("01");

                Intent diasNaColchicina = new Intent(getApplicationContext(), CriarCodigoDiasNaColchicina.class);
                startActivity(diasNaColchicina);

            }
        });

        //Botao 005%
        botaoColchicina05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("05");

                Intent diasNaColchicina = new Intent(getApplicationContext(), CriarCodigoDiasNaColchicina.class);
                startActivity(diasNaColchicina);

            }
        });

        //Botao 0%
        botaoColchicina00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("00");

                Intent diasNaColchicina = new Intent(getApplicationContext(), CriarCodigoDiasNaColchicina.class);
                startActivity(diasNaColchicina);

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