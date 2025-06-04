package es.codeurjc.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CalculatorParser {

    public int parse(String expression) {
        String expr = expression.replaceAll("\\s+", "");
        if (expr.matches(".*[A-Za-z].*")) {
            throw new IllegalArgumentException("Letters are not allowed");
        }
        Pattern pattern = Pattern.compile("([+-]?\\d+)");
        Matcher matcher = pattern.matcher(expr);
        int result = 0;
        while (matcher.find()) {
            result += Integer.parseInt(matcher.group(1));
        }
        return result;
    }
}