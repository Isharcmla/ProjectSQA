import org.junit.Test;
import org.junit.Assert;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringUtilsTest {

    // Helper Random subclass that returns a predetermined sequence of ints
    // from nextInt(bound), ignoring the bound parameter. This allows
    // deterministic control over branch outcomes (surrogate handling,
    // letter/number filtering retries) inside RandomStringUtils.random(...).
    private static class FixedSequenceRandom extends Random {
        private static final long serialVersionUID = 1L;
        private final int[] sequence;
        private int index = 0;

        FixedSequenceRandom(int... sequence) {
            this.sequence = sequence;
        }

        @Override
        public int nextInt(int bound) {
            int value = sequence[index % sequence.length];
            index++;
            return value;
        }
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_doesNotThrow() {
        RandomStringUtils instance = new RandomStringUtils();
        Assert.assertNotNull(instance);
    }

    // ---------- random(int count) ----------

    @Test
    public void testRandomIntCount_normal_returnsCorrectLength() {
        String result = RandomStringUtils.random(10);
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void testRandomIntCount_zero_returnsEmptyString() {
        String result = RandomStringUtils.random(0);
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomIntCount_negative_throwsException() {
        RandomStringUtils.random(-1);
    }

    // ---------- randomAscii ----------

    @Test
    public void testRandomAscii_normal_charactersInRange() {
        String result = RandomStringUtils.randomAscii(50);
        Assert.assertEquals(50, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c >= 32 && c < 127);
        }
    }

    @Test
    public void testRandomAscii_zero_returnsEmptyString() {
        String result = RandomStringUtils.randomAscii(0);
        Assert.assertEquals("", result);
    }

    // ---------- randomAlphabetic ----------

    @Test
    public void testRandomAlphabetic_normal_allLetters() {
        String result = RandomStringUtils.randomAlphabetic(50);
        Assert.assertEquals(50, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isLetter(c));
        }
    }

    // ---------- randomAlphanumeric ----------

    @Test
    public void testRandomAlphanumeric_normal_allLettersOrDigits() {
        String result = RandomStringUtils.randomAlphanumeric(50);
        Assert.assertEquals(50, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isLetter(c) || Character.isDigit(c));
        }
    }

    // ---------- randomNumeric ----------

    @Test
    public void testRandomNumeric_normal_allDigits() {
        String result = RandomStringUtils.randomNumeric(50);
        Assert.assertEquals(50, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isDigit(c));
        }
    }

    // ---------- random(int count, boolean letters, boolean numbers) ----------

    @Test
    public void testRandomCountLettersNumbers_bothFalse_anyCharLength() {
        String result = RandomStringUtils.random(20, false, false);
        Assert.assertEquals(20, result.length());
    }

    @Test
    public void testRandomCountLettersNumbers_bothTrue_lettersOrDigits() {
        String result = RandomStringUtils.random(20, true, true);
        Assert.assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isLetter(c) || Character.isDigit(c));
        }
    }

    // ---------- random(int count, int start, int end, boolean letters, boolean numbers) ----------

    @Test
    public void testRandomCountStartEndLettersNumbers_normal_lettersOrDigits() {
        String result = RandomStringUtils.random(15, 0, 0, true, true);
        Assert.assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(Character.isLetter(c) || Character.isDigit(c));
        }
    }

    @Test
    public void testRandomCountStartEndLettersNumbers_customRange_withinBounds() {
        String result = RandomStringUtils.random(15, 65, 91, false, false);
        Assert.assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c >= 65 && c < 91);
        }
    }

    // ---------- random(int count, int start, int end, boolean letters, boolean numbers, char... chars) ----------

    @Test
    public void testRandomCountStartEndLettersNumbersChars_normal_usesProvidedChars() {
        char[] chars = new char[] {'a', 'b', 'c'};
        String result = RandomStringUtils.random(10, 0, 0, false, false, chars);
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c == 'a' || c == 'b' || c == 'c');
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomCountStartEndLettersNumbersChars_emptyArray_throwsException() {
        char[] chars = new char[0];
        RandomStringUtils.random(5, 0, 0, false, false, chars);
    }

    // ---------- random(int count, int start, int end, boolean letters, boolean numbers, char[] chars, Random random) ----------

    @Test
    public void testRandomFull_lowSurrogateWithRoom_insertsHighSurrogate() {
        // ch = 56320 (low surrogate), count=1 at time of generation (room available)
        Random fixedRandom = new FixedSequenceRandom(56320, 10);
        String result = RandomStringUtils.random(2, 0, 65536, false, false, null, fixedRandom);
        char[] arr = result.toCharArray();
        Assert.assertEquals(2, arr.length);
        Assert.assertEquals(55296 + 10, (int) arr[0]);
        Assert.assertEquals(56320, (int) arr[1]);
    }

    @Test
    public void testRandomFull_lowSurrogateNoRoom_skipsAndRetries() {
        // count=1 so only one buffer slot; low surrogate at count==0 triggers retry
        Random fixedRandom = new FixedSequenceRandom(56320, 65); // 65 = 'A'
        String result = RandomStringUtils.random(1, 0, 65536, false, false, null, fixedRandom);
        Assert.assertEquals("A", result);
    }

    @Test
    public void testRandomFull_highSurrogateWithRoom_insertsLowSurrogate() {
        // ch = 55300 (high surrogate), count=1 at time of generation (room available)
        Random fixedRandom = new FixedSequenceRandom(55300, 20);
        String result = RandomStringUtils.random(2, 0, 65536, false, false, null, fixedRandom);
        char[] arr = result.toCharArray();
        Assert.assertEquals(2, arr.length);
        Assert.assertEquals(55300, (int) arr[0]);
        Assert.assertEquals(56320 + 20, (int) arr[1]);
    }

    @Test
    public void testRandomFull_highSurrogateNoRoom_skipsAndRetries() {
        Random fixedRandom = new FixedSequenceRandom(55300, 66); // 66 = 'B'
        String result = RandomStringUtils.random(1, 0, 65536, false, false, null, fixedRandom);
        Assert.assertEquals("B", result);
    }

    @Test
    public void testRandomFull_privateHighSurrogate_skipsAlways() {
        // ch = 56200 falls in private high surrogate range, always skipped regardless of count
        Random fixedRandom = new FixedSequenceRandom(56200, 67); // 67 = 'C'
        String result = RandomStringUtils.random(1, 0, 65536, false, false, null, fixedRandom);
        Assert.assertEquals("C", result);
    }

    @Test
    public void testRandomFull_lettersFilterRejectsNonLetter_retries() {
        // first value 49 ('1') is not a letter, rejected; second value 88 ('X') accepted
        Random fixedRandom = new FixedSequenceRandom(49, 88);
        String result = RandomStringUtils.random(1, 0, 65536, true, false, null, fixedRandom);
        Assert.assertEquals("X", result);
    }

    @Test
    public void testRandomFull_charsArrayWithStartEndZero_usesCharsLength() {
        char[] chars = new char[] {'x', 'y', 'z'};
        Random random = new Random();
        String result = RandomStringUtils.random(5, 0, 0, false, false, chars, random);
        Assert.assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c == 'x' || c == 'y' || c == 'z');
        }
    }

    @Test
    public void testRandomFull_countZero_returnsEmptyString() {
        String result = RandomStringUtils.random(0, 0, 0, false, false, null, new Random());
        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomFull_negativeCount_throwsException() {
        RandomStringUtils.random(-5, 0, 0, false, false, null, new Random());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomFull_emptyCharsArray_throwsException() {
        RandomStringUtils.random(5, 0, 0, false, false, new char[0], new Random());
    }

    // ---------- random(int count, String chars) ----------

    @Test
    public void testRandomCountString_normal_usesCharsFromString() {
        String result = RandomStringUtils.random(10, "ab");
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c == 'a' || c == 'b');
        }
    }

    @Test
    public void testRandomCountString_null_usesDefaultCharset() {
        String result = RandomStringUtils.random(5, (String) null);
        Assert.assertEquals(5, result.length());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomCountString_empty_throwsException() {
        RandomStringUtils.random(5, "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomCountString_negativeCount_throwsException() {
        RandomStringUtils.random(-3, "abc");
    }

    @Test
    public void testRandomCountString_zeroCount_returnsEmptyString() {
        String result = RandomStringUtils.random(0, "abc");
        Assert.assertEquals("", result);
    }

    // ---------- random(int count, char... chars) ----------

    @Test
    public void testRandomCountCharArray_normal_usesProvidedChars() {
        String result = RandomStringUtils.random(10, 'a', 'b', 'c');
        Assert.assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            Assert.assertTrue(c == 'a' || c == 'b' || c == 'c');
        }
    }

    @Test
    public void testRandomCountCharArray_null_usesDefaultCharset() {
        String result = RandomStringUtils.random(5, (char[]) null);
        Assert.assertEquals(5, result.length());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomCountCharArray_empty_throwsException() {
        RandomStringUtils.random(5, new char[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomCountCharArray_negativeCount_throwsException() {
        RandomStringUtils.random(-1, 'a', 'b');
    }

    @Test
    public void testRandomCountCharArray_zeroCount_returnsEmptyString() {
        String result = RandomStringUtils.random(0, 'a', 'b');
        Assert.assertEquals("", result);
    }
}
