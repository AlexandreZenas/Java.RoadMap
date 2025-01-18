package com.guide.exercises.calculadora;

public class Calculadora {
    double num1, num2;

    Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double somar(){
        return num1 + num2;
    }
    public double subtrair() {
        return num1 - num2;
    }
    public double multiplicar() {
        return num1 * num2;
    }
    public double dividir() {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10, 4);

        System.out.println(calculadora.somar());
        System.out.println(calculadora.subtrair());
        System.out.println(calculadora.multiplicar());
        System.out.println(calculadora.dividir());

    }
}
