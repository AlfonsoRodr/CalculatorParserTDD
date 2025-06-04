package es.codeurjc.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorParserTest {
    private CalculatorParser calculator;

    private static final String ERROR_MESSAGE = "Letters are not allowed";

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
    
    @ParameterizedTest
    @ValueSource(strings = {"5 - 3:2", "1 - 2:-1", "7 - 2 - 1:4", "9 - 5 - 3 - 1:0"})
    public void subTests(String input) {
        String[] parts = input.split(":");
        String expression = parts[0];
        int expected = Integer.parseInt(parts[1]);
        int res = this.calculator.parse(expression);
        assertEquals(expected, res);
    }

    @ParameterizedTest
    @ValueSource(strings = {"7 + 1 - 5:3", "9 - 5 - 4:0", "9 + 1 - 6 - 2:2", "-5 + 9:4"})
    public void mixedOperationsTests(String input) {
        String[] parts = input.split(":");
        String expression = parts[0];
        int expected = Integer.parseInt(parts[1]);
        int result = this.calculator.parse(expression);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"A", "B", "k", "HoLa", "1 + A", "Hola + 69 + -678A"})
    public void testSingleLetter(String expression) {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> { 
            this.calculator.parse(expression); 
        });
        assertEquals(ERROR_MESSAGE, thrown.getMessage());
    }
}