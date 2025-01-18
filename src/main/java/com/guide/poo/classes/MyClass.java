package com.guide.poo.classes;

import java.sql.SQLOutput;

public class MyClass {

    double num1, num2;

    MyClass(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double somar(){
        return num1 + num2;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass( 1, 2);
        System.out.println(myClass.somar());
    }
}
