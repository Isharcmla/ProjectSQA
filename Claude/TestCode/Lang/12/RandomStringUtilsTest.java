import org.junit.Test;
import org.junit.Assert;

import java.util.Random;

public class RandomStringUtilsTest {

    @Test
    public void testConstructor_createInstance_notNull() {
        RandomStringUtils instance = new RandomStringUtils();
        Assert.assertNotNull(instance);
    }

    // ---------- random(int count) ----------

    @Test
    public void testRandom_normalCount_correctLength() {
        String result = RandomStringUtils.random(10);
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void testRandom_zeroCount_returnsEmptyString() {
        String result = RandomStringUtils.random(0);
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandom_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.random(-1);
    }

    // ---------- randomAscii(int count) ----------

    @Test
    public void testRandomAscii_normalCount_correctLengthAndRange() {
        String result = RandomStringUtils.randomAscii(20);
        Assert.assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c >= 32 && c < 127);
        }
    }

    @Test
    public void testRandomAscii_zeroCount_returnsEmptyString() {
        Assert.assertEquals("", RandomStringUtils.randomAscii(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomAscii_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.randomAscii(-5);
    }

    // ---------- randomAlphabetic(int count) ----------

    @Test
    public void testRandomAlphabetic_normalCount_onlyLetters() {
        String result = RandomStringUtils.randomAlphabetic(15);
        Assert.assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isLetter(c));
        }
    }

    @Test
    public void testRandomAlphabetic_zeroCount_returnsEmptyString() {
        Assert.assertEquals("", RandomStringUtils.randomAlphabetic(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomAlphabetic_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.randomAlphabetic(-3);
    }

    // ---------- randomAlphanumeric(int count) ----------

    @Test
    public void testRandomAlphanumeric_normalCount_onlyLettersOrDigits() {
        String result = RandomStringUtils.randomAlphanumeric(15);
        Assert.assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isLetter(c) || Character.isDigit(c));
        }
    }

    @Test
    public void testRandomAlphanumeric_zeroCount_returnsEmptyString() {
        Assert.assertEquals("", RandomStringUtils.randomAlphanumeric(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomAlphanumeric_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.randomAlphanumeric(-7);
    }

    // ---------- randomNumeric(int count) ----------

    @Test
    public void testRandomNumeric_normalCount_onlyDigits() {
        String result = RandomStringUtils.randomNumeric(15);
        Assert.assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isDigit(c));
        }
    }

    @Test
    public void testRandomNumeric_zeroCount_returnsEmptyString() {
        Assert.assertEquals("", RandomStringUtils.randomNumeric(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomNumeric_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.randomNumeric(-2);
    }

    // ---------- random(int count, boolean letters, boolean numbers) ----------

    @Test
    public void testRandomWithLettersNumbers_lettersTrueNumbersFalse_onlyLetters() {
        String result = RandomStringUtils.random(10, true, false);
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isLetter(c));
        }
    }

    @Test
    public void testRandomWithLettersNumbers_lettersFalseNumbersTrue_onlyDigits() {
        String result = RandomStringUtils.random(10, false, true);
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isDigit(c));
        }
    }

    @Test
    public void testRandomWithLettersNumbers_bothFalse_correctLength() {
        String result = RandomStringUtils.random(10, false, false);
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void testRandomWithLettersNumbers_bothTrue_lettersOrDigits() {
        String result = RandomStringUtils.random(10, true, true);
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isLetter(c) || Character.isDigit(c));
        }
    }

    @Test
    public void testRandomWithLettersNumbers_zeroCount_returnsEmptyString() {
        Assert.assertEquals("", RandomStringUtils.random(0, true, true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithLettersNumbers_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.random(-1, true, true);
    }

    // ---------- random(int count, int start, int end, boolean letters, boolean numbers) ----------

    @Test
    public void testRandomWithStartEnd_normalRange_correctLength() {
        String result = RandomStringUtils.random(10, 'a', 'z' + 1, true, false);
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c >= 'a' && c <= 'z');
        }
    }

    @Test
    public void testRandomWithStartEnd_startEndZeroNoLettersNoNumbers_correctLength() {
        String result = RandomStringUtils.random(10, 0, 0, false, false);
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void testRandomWithStartEnd_startEndZeroWithLetters_correctLength() {
        String result = RandomStringUtils.random(10, 0, 0, true, false);
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void testRandomWithStartEnd_zeroCount_returnsEmptyString() {
        Assert.assertEquals("", RandomStringUtils.random(0, 0, 0, true, true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithStartEnd_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.random(-5, 0, 0, true, true);
    }

    // ---------- random(int count, int start, int end, boolean letters, boolean numbers, char... chars) ----------

    @Test
    public void testRandomWithCharsVarargs_normalChars_correctLength() {
        char[] chars = {'x', 'y', 'z'};
        String result = RandomStringUtils.random(10, 0, chars.length, false, false, chars);
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c == 'x' || c == 'y' || c == 'z');
        }
    }

    @Test
    public void testRandomWithCharsVarargs_zeroCount_returnsEmptyString() {
        char[] chars = {'a', 'b', 'c'};
        Assert.assertEquals("", RandomStringUtils.random(0, 0, chars.length, false, false, chars));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithCharsVarargs_negativeCount_throwsIllegalArgumentException() {
        char[] chars = {'a', 'b', 'c'};
        RandomStringUtils.random(-1, 0, chars.length, false, false, chars);
    }

    // ---------- random(int count, int start, int end, boolean letters, boolean numbers, char[] chars, Random random) ----------

    @Test
    public void testRandomFull_nullCharsWithSeededRandom_correctLength() {
        Random random = new Random(42L);
        String result = RandomStringUtils.random(10, 0, 0, true, true, null, random);
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void testRandomFull_withCharsArray_onlyChosenChars() {
        char[] chars = {'1', '2', '3'};
        Random random = new Random(42L);
        String result = RandomStringUtils.random(10, 0, chars.length, false, false, chars, random);
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c == '1' || c == '2' || c == '3');
        }
    }

    @Test
    public void testRandomFull_zeroCount_returnsEmptyString() {
        Random random = new Random();
        Assert.assertEquals("", RandomStringUtils.random(0, 0, 0, false, false, null, random));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomFull_negativeCount_throwsIllegalArgumentException() {
        Random random = new Random();
        RandomStringUtils.random(-10, 0, 0, false, false, null, random);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomFull_emptyCharsArray_throwsIllegalArgumentException() {
        Random random = new Random();
        char[] chars = {};
        RandomStringUtils.random(5, 0, 0, false, false, chars, random);
    }

    @Test
    public void testRandomFull_bothLettersNumbersFalseStartEndZero_fullUnicodeRange() {
        Random random = new Random(1L);
        String result = RandomStringUtils.random(5, 0, 0, false, false, null, random);
        Assert.assertEquals(5, result.length());
    }

    // ---------- random(int count, String chars) ----------

    @Test
    public void testRandomWithStringChars_normalChars_correctLength() {
        String result = RandomStringUtils.random(10, "abc");
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c == 'a' || c == 'b' || c == 'c');
        }
    }

    @Test
    public void testRandomWithStringChars_nullChars_correctLength() {
        String result = RandomStringUtils.random(10, (String) null);
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void testRandomWithStringChars_zeroCount_returnsEmptyString() {
        Assert.assertEquals("", RandomStringUtils.random(0, "abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithStringChars_negativeCount_throwsIllegalArgumentException() {
        RandomStringUtils.random(-1, "abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithStringChars_emptyString_throwsIllegalArgumentException() {
        RandomStringUtils.random(5, "");
    }

    // ---------- random(int count, char... chars) ----------

    @Test
    public void testRandomWithCharArray_normalChars_correctLength() {
        char[] chars = {'a', 'b', 'c'};
        String result = RandomStringUtils.random(10, chars);
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c == 'a' || c == 'b' || c == 'c');
        }
    }

    @Test
    public void testRandomWithCharArray_nullChars_correctLength() {
        String result = RandomStringUtils.random(10, (char[]) null);
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void testRandomWithCharArray_zeroCount_returnsEmptyString() {
        char[] chars = {'a', 'b', 'c'};
        Assert.assertEquals("", RandomStringUtils.random(0, chars));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithCharArray_negativeCount_throwsIllegalArgumentException() {
        char[] chars = {'a', 'b', 'c'};
        RandomStringUtils.random(-1, chars);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithCharArray_emptyCharArray_throwsIllegalArgumentException() {
        char[] chars = {};
        RandomStringUtils.random(5, chars);
    }

    // ---------- surrogate handling tests ----------

    @Test
    public void testRandom_surrogatePairsAllowed_correctLength() {
        // Using full unicode range with letters=false, numbers=false to potentially hit surrogate branches
        Random random = new Random(7L);
        String result = RandomStringUtils.random(50, 0, 0, false, false, null, random);
        Assert.assertEquals(50, result.length());
    }

    @Test
    public void testRandom_multipleCallsConsistentLength_allCorrect() {
        for (int i = 1; i <= 5; i++) {
            String result = RandomStringUtils.random(i);
            Assert.assertEquals(i, result.length());
        }
    }
}
