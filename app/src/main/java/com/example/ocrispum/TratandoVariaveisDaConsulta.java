package com.example.ocrispum;

public class TratandoVariaveisDaConsulta {

    public String estagioDaPlanta = "null";
    public String porcentagemColchicina = "null";
    public String diasNaColchicina = "null";
    public String tempoDeBloqueio = "null";
    public String tempoDeEnzima = "null";
    public String numeroDoRecipiente = "null";
    public String posicaoDaPlantaNoRecipiente = "null";
    public int numeroDeDigitos;

    public TratandoVariaveisDaConsulta(String codigo){

        this.numeroDeDigitos = codigo.length();

        if(this.numeroDeDigitos == 10) {
            this.estagioDaPlanta = String.valueOf(codigo.charAt(0));
            this.porcentagemColchicina = String.valueOf(codigo.charAt(1)) + String.valueOf(codigo.charAt(2));
            this.diasNaColchicina = String.valueOf(codigo.charAt(3));
            this.tempoDeBloqueio = String.valueOf(codigo.charAt(4)) + String.valueOf(codigo.charAt(5));
            this.tempoDeEnzima = String.valueOf(codigo.charAt(6));
            this.numeroDoRecipiente = String.valueOf(codigo.charAt(7)) + String.valueOf(codigo.charAt(8));
            this.posicaoDaPlantaNoRecipiente = String.valueOf(codigo.charAt(9));
        }

    }
}
