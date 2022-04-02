package com.example.ocrispum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CriarCodigoPosicaoDaPlantaNoVaso extends AppCompatActivity {

    //Botoes
    Button botaoOk;

    //EditText
    EditText posicaoDaPlanta;

    //Variaveis
    String inputUsuario;
    int tamanhoInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_codigo_posicao_da_planta_no_vaso);

        //Acho os botoes no xml e salvo na variaveis
        posicaoDaPlanta = findViewById(R.id.posicaoDaPlanta);
        botaoOk = findViewById(R.id.botaoOK);

        //Botao OK
        botaoOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inputUsuario = String.valueOf(posicaoDaPlanta.getText());
                tamanhoInput = inputUsuario.length();

                if(tamanhoInput == 1) {

                    LogicaCriacao.adicionarTrechoAoCodigo(inputUsuario);

                    Intent posicaoDaPlanta = new Intent(getApplicationContext(), CriarCodigoResultado.class);
                    startActivity(posicaoDaPlanta);

                }
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