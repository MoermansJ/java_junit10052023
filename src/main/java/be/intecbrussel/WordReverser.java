package be.intecbrussel;

public class WordReverser {
    public String reverseWord(String wordToReverse) {
        return new StringBuilder(wordToReverse).reverse().toString();
    }

    public boolean isPalindrome(String wordToCheck) {
        if (wordToCheck.isBlank()) {
            return false;
        }

        String wordToCheckReversed = new StringBuilder(wordToCheck.trim()).reverse().toString();
        return wordToCheckReversed.equals(wordToCheck);
    }
}
