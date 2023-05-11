import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WordReverserTest {

    private WordReverser wordReverser;
    @BeforeEach
    void setup() {
        wordReverser = new WordReverser();
    }

    @ParameterizedTest(name = "Word: {0} - Expected Word: {1}")
    @CsvSource(value = {"Boot, tooB", "Vliegen, negeilV", "happy, yppah"})
    void shouldReturnEqualsWhenWordReverserRuns(String word, String expectedWord) {

        String currentWord = wordReverser.reverseWord(word);

        assertEquals(expectedWord, currentWord);

    }
}