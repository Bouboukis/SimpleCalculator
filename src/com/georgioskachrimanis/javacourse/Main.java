package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(0);
        calculator.setSecondNumber(1.250);

        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());

        System.out.println(calculator.getSubtractionResult());
    }
}
