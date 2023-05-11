import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    void setup() {
        palindrome = new Palindrome();
    }

    @ParameterizedTest(name = "Word: {0} - Expected Message: {1}")
    @CsvSource(value = {"   , Error! Null isn't allowed", "B, Error! Not a word", "Taco cat, Error! Please enter a word not a sentence."})

    void shouldReturnEqualsErrorMessageIfInputIsNotValid(String word, String expectedMessage) {

        String returnedMessage = palindrome.isWordAPalindrome(word);

        assertEquals(expectedMessage, returnedMessage);
    }

    @ParameterizedTest(name = "Word: {0} - Expected Answer: {1}")
    @CsvSource(value = {"Mom, Yes", "Bob, Yes", "Mouse, No"})

    void shouldReturnEqualsYesOrNoIfWordIsOrNotAPalindrome(String word, String expectedAnswer) {

        String returnedAnswer = palindrome.isWordAPalindrome(word);

        assertEquals(expectedAnswer, returnedAnswer);
    }


}