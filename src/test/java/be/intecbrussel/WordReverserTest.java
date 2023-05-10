package be.intecbrussel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class WordReverserTest {
    //properties
    private WordReverser wordReverser;


    //pre-testing
    @BeforeEach
    void setUp() {
        wordReverser = new WordReverser();
    }


    //testing methods
    //reverseWord()
    @ParameterizedTest
    @CsvSource(value = {"Boot, tooB", "Vliegen, negeilV"})
    void shouldReturnTrueWhenCheckingIfTheWordsAreReversedParameterizedTest(String word, String wordReversed) {
        //when
        String result = wordReverser.reverseWord(word);

        //then
        assertEquals(result, wordReversed);
    }


    //isPalindrome()
    @ParameterizedTest
    @ValueSource(strings = {"racecar", "lepel"})
    void shouldReturnTrueWhenCheckingIfTheWordsArePalindromesParameterizedTest(String word) {
        //when
        boolean result = wordReverser.isPalindrome(word);

        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Racecar", "Lepel"})
    void shouldReturnFalseWhenCheckingIfTheWordsArePalindromesParameterizedTest(String word) {
        //when
        boolean result = wordReverser.isPalindrome(word);

        //then
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"  ", "\t", "\n"})
    void shouldReturnFalseWhenCheckingIfFaultyValuesArePalindromesParameterizedTest(String faultyValue) {
        //when
        boolean result = wordReverser.isPalindrome(faultyValue);

        //then
        assertFalse(result);
    }

}