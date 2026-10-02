package org.apache.commons.lang3;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RandomStringUtilsTest {

    @Test
    public void testConstructor_default_shouldBePublic() throws Exception {
        Constructor<RandomStringUtils> constructor = RandomStringUtils.class.getConstructor();
        assertTrue(Modifier.isPublic(constructor.getModifiers()));
        RandomStringUtils instance = new RandomStringUtils();
        assertNotNull(instance);
    }

    @Test
    public void testRandom_countZero_returnsEmptyString() {
        assertEquals("", RandomStringUtils.random(0));
        assertEquals("", RandomStringUtils.random(0, true, false));
        assertEquals("", RandomStringUtils.random(0, 0, 0, false, false));
        assertEquals("", RandomStringUtils.random(0, 0, 0, false, false, new char[]{'a', 'b'}));
        assertEquals("", RandomStringUtils.random(0, "abc"));
        assertEquals("", RandomStringUtils.random(0, 'a', 'b'));
        assertEquals("", RandomStringUtils.random(0, 0, 0, false, false, null, new Random()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandom_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.random(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomAscii_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.randomAscii(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomAlphabetic_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.randomAlphabetic(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomAlphanumeric_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.randomAlphanumeric(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomNumeric_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.randomNumeric(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomString_emptyCharsArray_throwsIllegalArgumentException() {
        RandomStringUtils.random(5, new char[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomString_emptyCharsString_throwsIllegalArgumentException() {
        RandomStringUtils.random(5, "");
    }

    @Test
    public void testRandom_normalCount_returnsStringOfCorrectLength() {
        int length = 20;
        String result = RandomStringUtils.random(length);
        assertEquals(length, result.length());
    }

    @Test
    public void testRandomAscii_normalCount_returnsAsciiCharactersOnly() {
        int length = 50;
        String result = RandomStringUtils.randomAscii(length);
        assertEquals(length, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            assertTrue(ch >= 32 && ch <= 126);
        }
    }

    @Test
    public void testRandomAlphabetic_normalCount_returnsAlphabeticOnly() {
        int length = 50;
        String result = RandomStringUtils.randomAlphabetic(length);
        assertEquals(length, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue(Character.isLetter(result.charAt(i)));
        }
    }

    @Test
    public void testRandomAlphanumeric_normalCount_returnsAlphanumericOnly() {
        int length = 50;
        String result = RandomStringUtils.randomAlphanumeric(length);
        assertEquals(length, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue(Character.isLetterOrDigit(result.charAt(i)));
        }
    }

    @Test
    public void testRandomNumeric_normalCount_returnsNumericOnly() {
        int length = 50;
        String result = RandomStringUtils.randomNumeric(length);
        assertEquals(length, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue(Character.isDigit(result.charAt(i)));
        }
    }

    @Test
    public void testRandom_withLettersAndNumbersFlags() {
        int length = 30;
        String result = RandomStringUtils.random(length, true, true);
        assertEquals(length, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue(Character.isLetterOrDigit(result.charAt(i)));
        }
    }

    @Test
    public void testRandom_withStartAndEnd() {
        int length = 30;
        int start = 'a';
        int end = 'z' + 1;
        String result = RandomStringUtils.random(length, start, end, true, false);
        assertEquals(length, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            assertTrue(ch >= 'a' && ch <= 'z');
        }
    }

    @Test
    public void testRandom_withStartEndAndCharsVarargs() {
        char[] set = new char[]{'a', 'b', 'c', 'd'};
        String result = RandomStringUtils.random(20, 0, set.length, false, false, set);
        assertEquals(20, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            assertTrue(ch >= 'a' && ch <= 'd');
        }
    }

    @Test
    public void testRandom_withNullCharsString_returnsRandomCharacters() {
        String result = RandomStringUtils.random(10, (String) null);
        assertEquals(10, result.length());
    }

    @Test
    public void testRandom_withNonNullCharsString_returnsFromGivenString() {
        String allowed = "XYZ123";
        String result = RandomStringUtils.random(15, allowed);
        assertEquals(15, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue(allowed.indexOf(result.charAt(i)) >= 0);
        }
    }

    @Test
    public void testRandom_withNullCharsArray_returnsRandomCharacters() {
        String result = RandomStringUtils.random(10, (char[]) null);
        assertEquals(10, result.length());
    }

    @Test
    public void testRandom_withNonNullCharsArray_returnsFromGivenArray() {
        char[] allowed = new char[]{'x', 'y', 'z'};
        String result = RandomStringUtils.random(15, allowed);
        assertEquals(15, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            assertTrue(ch == 'x' || ch == 'y' || ch == 'z');
        }
    }

    @Test
    public void testRandom_withCustomSeededRandom_producesDeterministicResult() {
        long seed = 123456789L;
        String result1 = RandomStringUtils.random(10, 0, 0, true, true, null, new Random(seed));
        String result2 = RandomStringUtils.random(10, 0, 0, true, true, null, new Random(seed));
        assertEquals(result1, result2);
    }

    @Test
    public void testRandom_withLowSurrogateAtCount1_retriesAndGeneratesPairs() {
        char[] lowSurrogateOnly = new char[]{(char) 56320};
        String result = RandomStringUtils.random(2, 0, 1, false, false, lowSurrogateOnly, new Random());
        assertEquals(2, result.length());
        assertTrue(Character.isHighSurrogate(result.charAt(0)));
        assertTrue(Character.isLowSurrogate(result.charAt(1)));
    }

    @Test
    public void testRandom_withHighSurrogateAtCount1_retriesAndGeneratesPairs() {
        char[] highSurrogateOnly = new char[]{(char) 55296};
        String result = RandomStringUtils.random(2, 0, 1, false, false, highSurrogateOnly, new Random());
        assertEquals(2, result.length());
        assertTrue(Character.isHighSurrogate(result.charAt(0)));
        assertTrue(Character.isLowSurrogate(result.charAt(1)));
    }

    @Test
    public void testRandom_withPrivateHighSurrogate_skipsAndPicksNextChar() {
        char[] charsWithPrivateHighSurrogate = new char[]{(char) 56192, 'A'};
        String result = RandomStringUtils.random(5, 0, 2, false, false, charsWithPrivateHighSurrogate, new Random());
        assertEquals(5, result.length());
        assertEquals("AAAAA", result);
    }

    @Test
    public void testRandom_filteredLettersAndNumbers_rejectsUnmatchedChars() {
        char[] mixedChars = new char[]{'!', 'a', '1'};
        String resultLettersOnly = RandomStringUtils.random(5, 0, 3, true, false, mixedChars, new Random());
        assertEquals("aaaaa", resultLettersOnly);

        String resultNumbersOnly = RandomStringUtils.random(5, 0, 3, false, true, mixedChars, new Random());
        assertEquals("11111", resultNumbersOnly);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRandom_gapExceedsArrayLength_throwsArrayIndexOutOfBoundsException() {
        char[] chars = new char[]{'a', 'b'};
        RandomStringUtils.random(5, 0, 5, false, false, chars, new Random());
    }
}
