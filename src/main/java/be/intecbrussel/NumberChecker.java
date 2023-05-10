package be.intecbrussel;

import java.util.Arrays;
import java.util.OptionalInt;

public class NumberChecker {
    public boolean isPositiveNumber(int numberToCheck) {
        return numberToCheck >= 0;
    }

    public boolean isEven(int numberToCheck) {
        return numberToCheck % 2 == 0;
    }

    public OptionalInt getSmallestNumber(int[] arrayToCheck) {
        return Arrays.stream(arrayToCheck).min();
    }
}
