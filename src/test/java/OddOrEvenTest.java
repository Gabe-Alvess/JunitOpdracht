import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OddOrEvenTest {
    private OddOrEven oddOrEven;

    @BeforeEach
    void setup() {
        oddOrEven = new OddOrEven();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 32, 254, 1006, -10508})
    void shouldReturnEqualsEvenWhenNumberEndsWith0_2_4_6_8(int number) {

        String result = oddOrEven.isNumberOddOrEven(number);

        assertEquals("Even", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 43, 555, 7777, -10999})
    void shouldReturnEqualsOddWhenNumberEndsWith1_3_5_7_9(int number) {

        String result = oddOrEven.isNumberOddOrEven(number);

        assertEquals("Odd", result);
    }
}