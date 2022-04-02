package com.example.ocrispum;

public class LogicaConsulta {

    TratandoVariaveisDaConsulta tratamento;
    Verificacao verificacao;


    //O construtor precisa receber a String com o codigo e o textView
    public LogicaConsulta(String codigo){

        //Salvando em variaveis
        tratamento = new TratandoVariaveisDaConsulta(codigo);

        //Fazendo a verificacao
        verificacao = new Verificacao(tratamento);


    }

    public String getResultadoDaConsulta() {
        //Precisa retornar uma String com os textos
        return verificacao.getResultadoDaConsulta();
    }
}
