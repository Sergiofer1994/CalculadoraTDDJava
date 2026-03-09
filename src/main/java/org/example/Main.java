package org.example;

public class Main {

    public static void main(String[] args) {

        calculator.Calculator calculator = new calculator.Calculator();

        double sum = calculator.add(5, 3);
        double subtraction = calculator.subtract(10, 5);
        double multiplication = calculator.multiply(4, 5);
        double division = calculator.divide(10, 5);

        System.out.println("Addition result: " + sum);
        System.out.println("Subtraction result: " + subtraction);
        System.out.println("Multiplication result: " + multiplication);
        System.out.println("Division result: " + division);

    }
}