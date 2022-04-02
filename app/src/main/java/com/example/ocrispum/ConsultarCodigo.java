package com.example.ocrispum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConsultarCodigo extends AppCompatActivity {

    //Botoes
    Button botaoOK;
    Button botaoVoltar;

    //Edit Views
    EditText campoConsulta;

    //Text Views
    TextView campoResultadoDaConsulta;

    //Strings
    String codigo;
    String resultadoDaConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_codigo);

        //Acho os elementos no xml e salvo na variaveis
        botaoVoltar = findViewById(R.id.voltar);
        botaoOK = findViewById(R.id.ok);
        campoConsulta = findViewById(R.id.campoConsulta);
        campoResultadoDaConsulta = findViewById(R.id.campoResultadoDaConsulta);

        //Executa o botao Voltar
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltar = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(voltar);

            }
        });

        //Executa o botao da Consulta e imprime na tela
        botaoOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Captura o que o usuario digitou
                codigo = String.valueOf(campoConsulta.getText());
                LogicaConsulta consultar = new LogicaConsulta(codigo);

                resultadoDaConsulta = String.valueOf(consultar.getResultadoDaConsulta());

                campoResultadoDaConsulta.setText(resultadoDaConsulta);

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