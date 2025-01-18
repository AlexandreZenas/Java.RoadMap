package com.guide.advanced_syntax.generics;


import java.util.ArrayList;
import java.util.List;

// Para definir uma classe como generica, utilizamos o sinais <>, o T é identificador
public class BolsaNinja<T> {

    // O comando List<String> cria uma lista e precisamos passar o tipo da lista
    // Como estamos utilizando generics, o tipo que passamos para a lista é o nosso tipo generico T
    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    public void addFerramenta(T ferramenta) {
        //o comando add adiciona os dados na lista .
         ferramentas.add(ferramenta);
    }

    public void mostrarFerramenta(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }
}
