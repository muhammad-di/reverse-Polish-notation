import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationCalculatorTest {

    private ReversePolishNotationCalculator reversePolishNotationCalculator;

    @BeforeEach
    private void create() {
        reversePolishNotationCalculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("3 8 +");
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("4 7 -");
        int expected = -3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMultiplication() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("4 7 *");
        int expected = 28;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAdditionSubtraction() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("17 3 8 + -");
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateSubtractionAddition() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("17 3 8 - +");
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAdditionMultiplication() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("4 3 8 + *");
        int expected = 44;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMultiplicationAddition() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("4 3 8 * +");
        int expected = 28;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateSubtractionMultiplication() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("4 3 8 - *");
        int expected = -20;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMultiplicationSubtraction() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("6 3 8 * -");
        int expected = -18;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAdditionSubtractionMultiplication() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("5 4 3 8 + - *");
        int expected = -35;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAdditionMultiplicationSubtraction() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("5 4 3 8 + * -");
        int expected = -39;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateSubtractionAdditionMultiplication() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("5 4 3 8 - + *");
        int expected = -5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateSubtractionMultiplicationAddition() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("5 4 3 8 - * +");
        int expected = -15;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMultiplicationAdditionSubtraction() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("5 4 3 8 * + -");
        int expected = -23;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMultiplicationSubtractionAddition() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("5 4 3 8 * + -");
        int expected = -23;
        assertEquals(expected, actual);
    }
}