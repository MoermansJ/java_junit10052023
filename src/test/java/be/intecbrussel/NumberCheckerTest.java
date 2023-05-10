package be.intecbrussel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {
    //properties
    private NumberChecker numberChecker;


    //pre-testing
    @BeforeEach
    void setUp() {
        numberChecker = new NumberChecker();
    }


    //testing methods
    //isPositiveNumber()
    @Test
    void shouldReturnTrueWhenCheckingIfZeroIsPositive() {
        //given
        int numberToCheck = 0;

        //when
        boolean result = numberChecker.isPositiveNumber(numberToCheck);

        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenCheckingIfNegativeOneIsPositive() {
        //given
        int numberToCheck = -1;

        //when
        boolean result = numberChecker.isPositiveNumber(numberToCheck);

        //then
        assertFalse(result);
    }


    //isEven()
    @ParameterizedTest
    @ValueSource(ints = {0, 2, -2})
    void shouldReturnTrueWhenCheckingIfIntegersAreEvenParameterizedTest(int numberToCheck) {
        //when
        boolean result = numberChecker.isEven(numberToCheck);

        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, -1})
    void shouldReturnFalseWhenCheckingIfIntegersAreEvenParameterizedTest(int numberToCheck) {
        //when
        boolean result = numberChecker.isEven(numberToCheck);

        //then
        assertFalse(result);
    }


    //getSmallestNumber()
    @Test
    void shouldReturnEqualsWhenGettingZeroAsSmallestNumber() {
        //given
        int[] numberArray = {5, 1, 2, 3, 4, 0};

        //when
        OptionalInt resultOptionalInt = numberChecker.getSmallestNumber(numberArray);

        //then
        if (resultOptionalInt.isPresent()) {
            int result = resultOptionalInt.getAsInt();
            assertEquals(result, 0);
        }
    }

    @Test
    void shouldReturnEqualsWhenGettingNegativeOneAsSmallestNumber() {
        //given
        int[] numberArray = {1, 2, -1, 4, 5};

        //when
        OptionalInt resultOptionalInt = numberChecker.getSmallestNumber(numberArray);

        //then
        if (resultOptionalInt.isPresent()) {
            int result = resultOptionalInt.getAsInt();
            assertEquals(result, -1);
        }
    }

}