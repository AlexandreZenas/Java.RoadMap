package com.guide.advanced_syntax.generics;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        Shuriken shuriken = new Shuriken("explosiva");
        Pergaminho pergaminho = new Pergaminho("invocação");
        Kunai kunai = new Kunai("normal");

        bolsaNinja.addFerramenta(shuriken.getTipo());
        bolsaNinja.addFerramenta(pergaminho.getTipo());
        bolsaNinja.addFerramenta(kunai.getTipo());
        bolsaNinja.mostrarFerramenta();
    }
}
