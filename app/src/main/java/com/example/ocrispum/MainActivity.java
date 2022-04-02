package com.example.ocrispum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Botoes
    Button botaoConsultar;
    Button botaoCriar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Acho os botoes no xml e salvo na variaveis
        botaoConsultar = findViewById(R.id.consultar);
        botaoCriar = findViewById(R.id.criar);

        //Abre nova Intent quando clico no botao
        botaoConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent consultarCodigo = new Intent(getApplicationContext(), ConsultarCodigo.class);
                startActivity(consultarCodigo);

            }
        });

        //Abre nova Intent quando clico no botao
        botaoCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent criarCodigo = new Intent(getApplicationContext(), CriarCodigoEstagioDaPlanta2.class);
                startActivity(criarCodigo);

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