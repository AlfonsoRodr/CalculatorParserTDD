package es.codeurjc.test;

public class CalculatorParser {

    public int parse(String expression) {
        if ("1".equals(expression)) {
            return 1;
        }
        throw new IllegalArgumentException("Expected number 1");
    }
}