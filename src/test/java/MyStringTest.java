import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyStringTest {

    private static MyString myString;

    @BeforeAll
    public static void beforeAllMethod() {
        myString = new MyString();
        System.out.println("BeforeAllMethod");
    }

    @Test
    void testNumberOfCharacter() {
        assertEquals(7, myString.numberOfCharacter("newyear"));
    }

    @Test
    void testConcatenateString() {
        assertEquals("HappyNewYear", myString.concatenateString("Happy", "New", "Year"));
    }

    @Test
    void testStringStartWithVowel() {
//        boolean result1 = myString.stringStartWithVowel("Cacofonie");
//        boolean result2 = myString.stringStartWithVowel("America");
        Assertions.assertFalse(myString.stringStartWithVowel("Cacofonie"));
        Assertions.assertTrue(myString.stringStartWithVowel("America"));
    }

    @Test
    void testReverseString() {
        assertEquals("un", myString.reverseString("nu"));
    }

}