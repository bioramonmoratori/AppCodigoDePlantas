package com.example.ocrispum;

public class LogicaCriacao {

    public static String codigo = "";

    public static void adicionarTrechoAoCodigo(String trecho){
        codigo = codigo + trecho;

    }

    public static void zerar(){
        codigo = "";
    }

    public static String getCodigo(){
        return codigo;
    }
}
