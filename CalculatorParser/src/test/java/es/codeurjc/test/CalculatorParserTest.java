package es.codeurjc.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorParserTest {
    private CalculatorParser calculator;

    @BeforeEach
    public void setup(){
        calculator = new CalculatorParser();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testOneNumber(String operation) {
        int res = this.calculator.parse(operation);
        assertEquals(Integer.parseInt(operation), res);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1 + 1:2", "2 + 3:5", "2 + 3 + 4:9", "1 + 2 + 3 + 4:10"})
    public void sumTests(String input) {
        String[] parts = input.split(":");
        String expression = parts[0];
        int expected = Integer.parseInt(parts[1]);
        int res = this.calculator.parse(expression);
        assertEquals(expected, res);
    }
}