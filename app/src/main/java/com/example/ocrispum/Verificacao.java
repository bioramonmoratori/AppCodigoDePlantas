package com.example.ocrispum;

public class Verificacao {

    public String estagioDaPlanta = null;
    public String porcentagemColchicina = null;
    public String diasNaColchicina = null;
    public String tempoDeBloqueio = null;
    public String tempoDeEnzima = null;
    public String numeroDoRecipiente = null;
    public String posicaoDaPlantaNoRecipiente = null;
    public String resultadoDaConsulta;

    public Verificacao(TratandoVariaveisDaConsulta tratamento){

        this.estagioDaPlanta = tratamento.estagioDaPlanta;
        this.porcentagemColchicina = tratamento.porcentagemColchicina;
        this.diasNaColchicina = tratamento.diasNaColchicina;
        this.tempoDeBloqueio = tratamento.tempoDeBloqueio;
        this.tempoDeEnzima = tratamento.tempoDeEnzima;
        this.numeroDoRecipiente = tratamento.numeroDoRecipiente;
        this.posicaoDaPlantaNoRecipiente = tratamento.posicaoDaPlantaNoRecipiente;

        //Executando os metodos
        verificacaoEstagioDaPlanta(this.estagioDaPlanta);
        verificacaoPorcentagemColchicina(this.porcentagemColchicina);
        verificacaoDiasNaColchicina(this.diasNaColchicina);
        verificacaoTempoDeBloqueio(this.tempoDeBloqueio);
        verificacaoTempoDeEnzima(this.tempoDeEnzima);
        verificacaoNumeroDoRecipiente(this.numeroDoRecipiente);
        verificacaoPosicaoDaPlantaNoRecipiente(this.posicaoDaPlantaNoRecipiente);
        getResultadoDaConsulta();
    }

    public String verificacaoEstagioDaPlanta(String estagioDaPlanta){

        switch (this.estagioDaPlanta){

            case "A":
                this.estagioDaPlanta = "In Vitro";
                return this.estagioDaPlanta;

            case "B":
                this.estagioDaPlanta = "Em Aclimatação";
                return this.estagioDaPlanta;

            case "C":
                this.estagioDaPlanta = "Em Vaso Comum";
                return this.estagioDaPlanta;

            case "D":
                this.estagioDaPlanta = "Em Vaso de Poliploides";
                return this.estagioDaPlanta;

            default:
                this.estagioDaPlanta = "Código Inválido";
                return this.estagioDaPlanta;
        }

    }

    public String verificacaoPorcentagemColchicina(String porcentagemColchicina){

        switch (this.porcentagemColchicina){

            case "01":
                this.porcentagemColchicina = "0,1%";
                return this.porcentagemColchicina;

            case "05":
                this.porcentagemColchicina = "0,05%";
                return this.porcentagemColchicina;

            default:
                this.porcentagemColchicina = "Código Inválido";
                return this.porcentagemColchicina;
        }

    }

    public String verificacaoDiasNaColchicina(String diasNaColchicina){

        switch (this.diasNaColchicina){

            case "7":
                this.diasNaColchicina = "7 dias";
                return this.diasNaColchicina;

            case "4":
                this.diasNaColchicina = "4 dias";
                return this.diasNaColchicina;

            default:
                this.diasNaColchicina = "Código Inválido";
                return this.diasNaColchicina;
        }

    }

    public String verificacaoTempoDeBloqueio(String tempoDeBloqueio){

        switch (this.tempoDeBloqueio){

            case "04":
                this.tempoDeBloqueio = "4Hrs";
                return this.tempoDeBloqueio;

            case "08":
                this.tempoDeBloqueio = "8Hrs";
                return this.tempoDeBloqueio;

            case "24":
                this.tempoDeBloqueio = "24Hrs";
                return this.tempoDeBloqueio;

            default:
                this.tempoDeBloqueio = "Código Inválido";
                return this.tempoDeBloqueio;
        }

    }

    public String verificacaoTempoDeEnzima(String tempoDeEnzima){

        switch (this.tempoDeEnzima){

            case "3":
                this.tempoDeEnzima = "3Hrs";
                return this.tempoDeEnzima;

            case "4":
                this.tempoDeEnzima = "4Hrs";
                return this.tempoDeEnzima;

            case "5":
                this.tempoDeEnzima = "5Hrs";
                return this.tempoDeEnzima;

            default:
                this.tempoDeEnzima = "Código Inválido";
                return this.tempoDeEnzima;
        }

    }

    public String verificacaoNumeroDoRecipiente(String numeroDoRecipiente){

        return this.numeroDoRecipiente;

    }

    public String verificacaoPosicaoDaPlantaNoRecipiente(String posicaoDaPlantaNoRecipiente){

        return this.posicaoDaPlantaNoRecipiente;

    }

    public String getResultadoDaConsulta(){
        resultadoDaConsulta = "Estágio da Planta: " + estagioDaPlanta + "\n\n" +
                "Porcentagem de Colchicina: " + porcentagemColchicina + "\n\n" +
                "Dias na Colchicina: " + diasNaColchicina + "\n\n" +
                "Tempo de Bloqueio: " + tempoDeBloqueio + "\n\n" +
                "Tempo de Enzima: " + tempoDeEnzima + "\n\n" +
                "Número do Recipíente: " + numeroDoRecipiente + "\n\n" +
                "Posição da Planta no Recipiente: " + posicaoDaPlantaNoRecipiente;

        return resultadoDaConsulta;
    }
}
