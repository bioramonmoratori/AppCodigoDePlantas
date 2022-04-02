package com.example.ocrispum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriarCodigoEstagioDaPlanta2 extends AppCompatActivity {

    //Botoes
    Button botaoInVitro;
    Button botaoAclimatacao;
    Button botaoVasoComum;
    Button botaoVasoPoliploides;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_codigo_estagio_da_planta2);

        //Zero a String da Logica de Criacao
        LogicaCriacao.zerar();

        //Acho os botoes no xml e salvo na variaveis
        botaoInVitro = findViewById(R.id.estagioDaPlantaA);
        botaoAclimatacao = findViewById(R.id.estagioDaPlantaB);
        botaoVasoComum = findViewById(R.id.estagioDaPlantaC);
        botaoVasoPoliploides = findViewById(R.id.estagioDaPlantaD);


        //Botao InVitro
        botaoInVitro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("A");

                Intent porcentagemColchicina = new Intent(getApplicationContext(), CriarCodigoPorcentagemColchicina.class);
                startActivity(porcentagemColchicina);

            }
        });

        //Botao Aclimatacao
        botaoAclimatacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("B");

                Intent porcentagemColchicina = new Intent(getApplicationContext(), CriarCodigoPorcentagemColchicina.class);
                startActivity(porcentagemColchicina);

            }
        });

        //Botao VasoComum
        botaoVasoComum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("C");

                Intent porcentagemColchicina = new Intent(getApplicationContext(), CriarCodigoPorcentagemColchicina.class);
                startActivity(porcentagemColchicina);

            }
        });

        //Botao VasoPoliploides
        botaoVasoPoliploides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LogicaCriacao.adicionarTrechoAoCodigo("D");

                Intent porcentagemColchicina = new Intent(getApplicationContext(), CriarCodigoPorcentagemColchicina.class);
                startActivity(porcentagemColchicina);

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