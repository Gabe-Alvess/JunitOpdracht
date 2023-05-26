import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinNumArrayTest {

    private MinNumArray minNumArray;

    @BeforeEach
    void setup() {
        minNumArray = new MinNumArray();
    }

    @Test
    void shouldReturnEqualsSmallestNumberInTheArray() {

        int[] numArray = new int[]{1, 200, -90, 700};

        int returnedNumber = minNumArray.getSmallestNumber(numArray);

        assertEquals(-90, returnedNumber);
    }
}