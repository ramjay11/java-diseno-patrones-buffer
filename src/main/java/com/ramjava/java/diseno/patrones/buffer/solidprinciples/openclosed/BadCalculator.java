package com.ramjava.java.diseno.patrones.buffer.solidprinciples.openclosed;

public class BadCalculator {
    // Bad design since we are taking a type and for each type, we have a case.
    // If we introduce division, we need to modify calculator
    public int calculateNumber(int number1, int number2, String type) {
        int result = 0;
        switch (type) {
            case "sum":
                result = number1 + number2;
            case "sub":
                result = number1 - number2;
        }
        return result;
    }
}
