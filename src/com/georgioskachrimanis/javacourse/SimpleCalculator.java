package com.georgioskachrimanis.javacourse;

public class SimpleCalculator {
    private double firstNumber, secondNumber;

    // Getters and Setters.

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber () {
        return firstNumber;
    }

    public double getSecondNumber () {
        return secondNumber;
    }

    // Calculation Methods.

    public double getAdditionResult () {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult () {
        return  getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult () {
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult () {
        if (getSecondNumber() == 0) {
            return 0.0;
        }
        return getFirstNumber() / getSecondNumber();
    }





}



