package com.example.ocrispum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriarCodigoDiasNaColchicina extends AppCompatActivity {

    //Botoes
    Button botaoDias7;
    Button botaoDias4;
    Button botaoDias0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_codigo_dias_na_colchicina);

        //Acho os botoes no xml e salvo na variaveis
        botaoDias7 = findViewById(R.id.dias7);
        botaoDias4 = findViewById(R.id.dias4);
        botaoDias0 = findViewById(R.id.dias0);

        //Botao 7Dias
        botaoDias7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("7");

                Intent tempoDeBloqueio = new Intent(getApplicationContext(), CriarCodigoTempoDeBloqueio.class);
                startActivity(tempoDeBloqueio);

            }
        });

        //Botao 4Dias
        botaoDias4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("4");

                Intent tempoDeBloqueio = new Intent(getApplicationContext(), CriarCodigoTempoDeBloqueio.class);
                startActivity(tempoDeBloqueio);

            }
        });

        //Botao 0Dias
        botaoDias0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("0");

                Intent tempoDeBloqueio = new Intent(getApplicationContext(), CriarCodigoTempoDeBloqueio.class);
                startActivity(tempoDeBloqueio);

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