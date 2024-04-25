package com.ramjava.java.diseno.patrones.buffer.solidprinciples.openclosed;

public class Calculator {
    public static void main(String[] args) {
        var addOperation = new AddOperation();
        int number1 = 22;
        int number2 = 23;
        int result = Calculator.calculateNumber(number1, number2, addOperation);
        System.out.println(result);
    }
    // No modification in calculator functionality, rather
    // we add extensions by creating new operations
    public static int calculateNumber(int number1, int number2, Operation operation) {
        return operation.perform(number1, number2);
    }
}
