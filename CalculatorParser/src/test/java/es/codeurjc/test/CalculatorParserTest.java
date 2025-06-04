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
}
