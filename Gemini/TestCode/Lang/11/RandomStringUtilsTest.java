package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Random;
import org.junit.Test;

public class RandomStringUtilsTest {

    @Test
    public void testConstructor_instantiate_notNull() {
        RandomStringUtils instance = new RandomStringUtils();
        assertNotNull(instance);
    }

    @Test
    public void testRandom_count_success() {
        String result = RandomStringUtils.random(10);
        assertNotNull(result);
        assertEquals(10, result.length());
    }

    @Test
    public void testRandom_countZero_returnsEmptyString() {
        assertEquals("", RandomStringUtils.random(0));
        assertEquals("", RandomStringUtils.random(0, true, true));
        assertEquals("", RandomStringUtils.random(0, 0, 0, false, false));
        assertEquals("", RandomStringUtils.random(0, 0, 0, false, false, new char[]{'a', 'b'}, new Random()));
        assertEquals("", RandomStringUtils.random(0, "abc"));
        assertEquals("", RandomStringUtils.random(0, 'a', 'b'));
        assertEquals("", RandomStringUtils.random(0, (String) null));
        assertEquals("", RandomStringUtils.random(0, (char[]) null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandom_countNegative_throwsException() {
        RandomStringUtils.random(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandom_countNegativeWithDetailedParams_throwsException() {
        RandomStringUtils.random(-1, 0, 10, true, true, new char[]{'a'}, new Random());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandom_emptyCharArray_throwsException() {
        RandomStringUtils.random(5, new char[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandom_emptyString_throwsException() {
        RandomStringUtils.random(5, "");
    }

    @Test
    public void testRandomAscii_validCount_returnsAsciiCharacters() {
        int count = 50;
        String result = RandomStringUtils.randomAscii(count);
        assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            assertTrue("Expected ASCII between 32 and 126 inclusive, got: " + (int) ch, ch >= 32 && ch <= 126);
        }
    }

    @Test
    public void testRandomAlphabetic_validCount_returnsOnlyLetters() {
        int count = 50;
        String result = RandomStringUtils.randomAlphabetic(count);
        assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue("Expected letter, got: " + result.charAt(i), Character.isLetter(result.charAt(i)));
        }
    }

    @Test
    public void testRandomAlphanumeric_validCount_returnsLettersAndDigits() {
        int count = 50;
        String result = RandomStringUtils.randomAlphanumeric(count);
        assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue("Expected letter or digit, got: " + result.charAt(i), Character.isLetterOrDigit(result.charAt(i)));
        }
    }

    @Test
    public void testRandomNumeric_validCount_returnsOnlyDigits() {
        int count = 50;
        String result = RandomStringUtils.randomNumeric(count);
        assertEquals(count, result.length());
        for (int i = 0; i < result.length(); i++) {
            assertTrue("Expected digit, got: " + result.charAt(i), Character.isDigit(result.charAt(i)));
        }
    }

    @Test
    public void testRandom_countLettersNumbers_variousFlags() {
        String lettersOnly = RandomStringUtils.random(30, true, false);
        assertEquals(30, lettersOnly.length());
        for (char c : lettersOnly.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }

        String numbersOnly = RandomStringUtils.random(30, false, true);
        assertEquals(30, numbersOnly.length());
        for (char c : numbersOnly.toCharArray()) {
            assertTrue(Character.isDigit(c));
        }

        String both = RandomStringUtils.random(30, true, true);
        assertEquals(30, both.length());
        for (char c : both.toCharArray()) {
            assertTrue(Character.isLetterOrDigit(c));
        }

        String neither = RandomStringUtils.random(30, false, false);
        assertEquals(30, neither.length());
    }

    @Test
    public void testRandom_countStartEndLettersNumbers_success() {
        String result = RandomStringUtils.random(20, 'a', 'z' + 1, true, false);
        assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c >= 'a' && c <= 'z');
        }
    }

    @Test
    public void testRandom_countStartEndLettersNumbersCharsVarargs_success() {
        char[] chars = new char[]{'x', 'y', 'z'};
        String result = RandomStringUtils.random(15, 0, chars.length, false, false, chars);
        assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'x' || c == 'y' || c == 'z');
        }
    }

    @Test
    public void testRandom_nullString_usesAllChars() {
        String result = RandomStringUtils.random(10, (String) null);
        assertEquals(10, result.length());
    }

    @Test
    public void testRandom_validString_usesSpecifiedChars() {
        String allowed = "abc";
        String result = RandomStringUtils.random(20, allowed);
        assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(allowed.indexOf(c) >= 0);
        }
    }

    @Test
    public void testRandom_nullCharArray_usesAllChars() {
        String result = RandomStringUtils.random(10, (char[]) null);
        assertEquals(10, result.length());
    }

    @Test
    public void testRandom_validCharArray_usesSpecifiedChars() {
        char[] chars = new char[]{'1', '2', '3'};
        String result = RandomStringUtils.random(20, chars);
        assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == '1' || c == '2' || c == '3');
        }
    }

    @Test
    public void testRandom_startZeroEndZeroWithChars_defaultsEndToCharsLength() {
        char[] chars = new char[]{'m', 'n', 'o'};
        String result = RandomStringUtils.random(10, 0, 0, false, false, chars, new Random(12345L));
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'm' || c == 'n' || c == 'o');
        }
    }

    @Test
    public void testRandom_seededRandom_deterministicOutput() {
        Random rnd1 = new Random(42L);
        Random rnd2 = new Random(42L);
        String res1 = RandomStringUtils.random(10, 0, 0, true, true, null, rnd1);
        String res2 = RandomStringUtils.random(10, 0, 0, true, true, null, rnd2);
        assertEquals(res1, res2);
    }

    @Test
    public void testRandom_filterRejection_retriesUntilMatchingChar() {
        // chars array contains non-letter and letter; letters=true requires filtering
        char[] chars = new char[]{'1', 'a'};
        String result = RandomStringUtils.random(10, 0, chars.length, true, false, chars, new Random(100L));
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertEquals('a', c);
        }
    }

    @Test
    public void testRandom_lowSurrogate_whenCountGreaterThanZero_createsPair() {
        char lowSurrogate = 56320;
        char[] chars = new char[]{lowSurrogate};
        String result = RandomStringUtils.random(2, 0, 1, false, false, chars, new Random(1L));
        assertEquals(2, result.length());
        assertTrue(result.charAt(1) == lowSurrogate);
        assertTrue(result.charAt(0) >= 55296 && result.charAt(0) <= 56191);
    }

    @Test
    public void testRandom_lowSurrogate_whenCountIsZero_skipsAndRetries() {
        char lowSurrogate = 56320;
        char[] chars = new char[]{lowSurrogate, 'a'};
        // SequenceRandom produces index 0 (lowSurrogate) on first draw where count becomes 0, then index 1 ('a')
        Random sequenceRandom = new Random() {
            private final int[] seq = new int[]{0, 1};
            private int idx = 0;

            @Override
            public int nextInt(int bound) {
                return seq[idx++ % seq.length];
            }
        };

        String result = RandomStringUtils.random(1, 0, 2, false, false, chars, sequenceRandom);
        assertEquals(1, result.length());
        assertEquals("a", result);
    }

    @Test
    public void testRandom_highSurrogate_whenCountGreaterThanZero_createsPair() {
        char highSurrogate = 55296;
        char[] chars = new char[]{highSurrogate};
        String result = RandomStringUtils.random(2, 0, 1, false, false, chars, new Random(1L));
        assertEquals(2, result.length());
        assertTrue(result.charAt(0) == highSurrogate);
        assertTrue(result.charAt(1) >= 56320 && result.charAt(1) <= 57343);
    }

    @Test
    public void testRandom_highSurrogate_whenCountIsZero_skipsAndRetries() {
        char highSurrogate = 55296;
        char[] chars = new char[]{highSurrogate, 'b'};
        Random sequenceRandom = new Random() {
            private final int[] seq = new int[]{0, 1};
            private int idx = 0;

            @Override
            public int nextInt(int bound) {
                return seq[idx++ % seq.length];
            }
        };

        String result = RandomStringUtils.random(1, 0, 2, false, false, chars, sequenceRandom);
        assertEquals(1, result.length());
        assertEquals("b", result);
    }

    @Test
    public void testRandom_privateHighSurrogate_skipsAndRetries() {
        char privateHighSurrogate = 56192;
        char[] chars = new char[]{privateHighSurrogate, 'c'};
        Random sequenceRandom = new Random() {
            private final int[] seq = new int[]{0, 1};
            private int idx = 0;

            @Override
            public int nextInt(int bound) {
                return seq[idx++ % seq.length];
            }
        };

        String result = RandomStringUtils.random(1, 0, 2, false, false, chars, sequenceRandom);
        assertEquals(1, result.length());
        assertEquals("c", result);
    }
}
