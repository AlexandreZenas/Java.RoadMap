package com.guide.advanced_syntax.generics;

public class Shuriken {
    private String tipo;

    public Shuriken(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return "Shuriken " + tipo;
    }
}
