package com.guide.exercises.parouimpar;

import org.w3c.dom.ls.LSOutput;

public class ParOuImpar {

    private int numero;

    ParOuImpar(int numero){
        this.numero = numero;
    }

    public String verificador(){
        if( numero / 2 == 0){
            return "O numero é impar";
        }
        else {
            return "O numero é par";
        }
    }

    public static void main(String[] args) {
        ParOuImpar parOuImpar = new ParOuImpar( 87456);

        System.out.println(parOuImpar.verificador());
    }
}
