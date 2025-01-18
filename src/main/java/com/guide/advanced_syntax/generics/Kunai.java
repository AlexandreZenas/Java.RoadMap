package com.guide.advanced_syntax.generics;

public class Kunai {
    private String tipo;


    public Kunai(String tipo ) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return "Kunai" + tipo;
    }
}
