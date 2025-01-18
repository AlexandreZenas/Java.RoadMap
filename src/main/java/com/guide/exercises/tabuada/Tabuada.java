package com.guide.exercises.tabuada;

public class Tabuada {
    private int number;

    Tabuada(int number){
        this.number = number;
    }

    public int resultados( ){
        int initNumber = number;
        for (int i = 0; i < 9; i = i + 1){
            System.out.println(number);
            number = initNumber + number;
        }
        return number;
    }



    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada(9);


        System.out.println(tabuada.resultados());
    }
}
