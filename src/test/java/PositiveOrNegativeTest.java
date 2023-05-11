import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PositiveOrNegativeTest {

    private PositiveOrNegative positiveOrNegative;

    @BeforeEach
    void setup() {
        positiveOrNegative = new PositiveOrNegative();
    }

    @ParameterizedTest(name = "Number = {0}, Expected Result = {1}")
    @CsvSource(value = {"1, Positive", "0, Positive", "-1, Negative"})
    void shouldReturnEqualsPositiveIfNumberEqualToOrGreaterThanZeroAndEqualsNegativeIfNumberSmallerThanZero(int number, String expectedResult) {

        String result = positiveOrNegative.isNumberPositive(number);

        assertEquals(expectedResult, result);
    }

}