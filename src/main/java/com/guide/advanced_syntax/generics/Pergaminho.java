package com.guide.advanced_syntax.generics;

public class Pergaminho {
    private String tipo;


    public Pergaminho(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return "Pergaminho de " + tipo;
    }
}
