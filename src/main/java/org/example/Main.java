package org.example;

public class Main {

    public static void main(String[] args) {

        calculator.Calculator calculator = new calculator.Calculator();

        double a = 5;
        double b = 3;
        double c = 10;
        double d = 5;
        double e = 4;
        double f = 5;

        System.out.println(a + " + " + b + " = " + calculator.add(a, b));
        System.out.println(c + " - " + d + " = " + calculator.subtract(c, d));
        System.out.println(e + " * " + f + " = " + calculator.multiply(e, f));
        System.out.println(c + " / " + d + " = " + calculator.divide(c, d));

    }
}