package chapter01.problem03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RevertUtilTest {

    private static StringUtils stringUtils;

    private String word;

    @BeforeAll
    static void beforeAll() {
        stringUtils = new StringUtils();
    }

    @BeforeEach
    void setUp() {
        word = "Cloud UNT Bootcamp";
    }

    @Test
    @DisplayName("Reverse word")
    void reverseWords() {
        String reversedWord = stringUtils.reverseWords(word);

        Assertions.assertEquals(18, reversedWord.length());
        Assertions.assertEquals("duolC TNU pmactooB", reversedWord);
    }


    @Test
    @DisplayName("Reverse word - functional style")
    void reverseWord_Functional() {
        String reversedWord = stringUtils.reverseWordFunctional(word);

        Assertions.assertAll(
                () -> Assertions.assertEquals(18, reversedWord.length()),
                () -> Assertions.assertEquals("duolC TNU pmactooB", reversedWord));
    }
}