import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinNumArrayTest {

    private MinNumArray minNumArrayDefault;
    private MinNumArray minNumArrayCustom;

    private final int[] customIntArray = {1000, 50, 777, 900, 50, 187, 2};

    @BeforeEach
    void setup() {
        minNumArrayDefault = new MinNumArray();
        minNumArrayCustom = new MinNumArray(customIntArray);
    }

    @Test
    void shouldReturnEqualsSmallestNumberInTheArrayWithDefaultIntArray() {

        int returnedNumber = minNumArrayDefault.getSmallestNumber();

        assertEquals(5, returnedNumber);
    }

    @Test
    void shouldReturnEqualsSmallestNumberInTheArrayWithCustomIntArray() {

        int returnedNumber = minNumArrayCustom.getSmallestNumber();

        assertEquals(2, returnedNumber);
    }

}