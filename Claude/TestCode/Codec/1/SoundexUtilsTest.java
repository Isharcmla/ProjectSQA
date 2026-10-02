package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.junit.Test;

public class SoundexUtilsTest {

    // ---------- clean(String) ----------

    @Test
    public void testClean_nullInput_returnsNull() {
        assertNull(SoundexUtils.clean(null));
    }

    @Test
    public void testClean_emptyString_returnsEmptyString() {
        assertEquals("", SoundexUtils.clean(""));
    }

    @Test
    public void testClean_allLetters_returnsUpperCase() {
        assertEquals("ABC", SoundexUtils.clean("abc"));
    }

    @Test
    public void testClean_mixedLettersAndDigits_returnsOnlyLettersUpperCase() {
        assertEquals("ABC", SoundexUtils.clean("a1b2c3"));
    }

    @Test
    public void testClean_stringWithSpacesAndPunctuation_returnsOnlyLetters() {
        assertEquals("HELLOWORLD", SoundexUtils.clean("Hello, World!"));
    }

    @Test
    public void testClean_noLettersAtAll_returnsEmptyString() {
        assertEquals("", SoundexUtils.clean("12345"));
    }

    @Test
    public void testClean_alreadyUpperCase_returnsSameUpperCase() {
        assertEquals("TEST", SoundexUtils.clean("TEST"));
    }

    // ---------- differenceEncoded(String, String) ----------

    @Test
    public void testDifferenceEncoded_bothNull_returnsZero() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, null));
    }

    @Test
    public void testDifferenceEncoded_firstNull_returnsZero() {
        assertEquals(0, SoundexUtils.differenceEncoded(null, "ABC"));
    }

    @Test
    public void testDifferenceEncoded_secondNull_returnsZero() {
        assertEquals(0, SoundexUtils.differenceEncoded("ABC", null));
    }

    @Test
    public void testDifferenceEncoded_identicalStrings_returnsFullLength() {
        assertEquals(4, SoundexUtils.differenceEncoded("A123", "A123"));
    }

    @Test
    public void testDifferenceEncoded_partialMatch_returnsMatchingCount() {
        assertEquals(2, SoundexUtils.differenceEncoded("A123", "A199"));
    }

    @Test
    public void testDifferenceEncoded_noMatch_returnsZero() {
        assertEquals(0, SoundexUtils.differenceEncoded("ABCD", "WXYZ"));
    }

    @Test
    public void testDifferenceEncoded_differentLengths_usesShorterLength() {
        assertEquals(3, SoundexUtils.differenceEncoded("ABC", "ABCDEF"));
    }

    @Test
    public void testDifferenceEncoded_emptyStrings_returnsZero() {
        assertEquals(0, SoundexUtils.differenceEncoded("", ""));
    }

    // ---------- difference(StringEncoder, String, String) ----------

    @Test
    public void testDifference_normalEncoder_returnsCorrectDifference() throws EncoderException {
        StringEncoder encoder = new StringEncoder() {
            @Override
            public Object encode(Object source) throws EncoderException {
                return encode((String) source);
            }

            @Override
            public String encode(String source) throws EncoderException {
                return source == null ? null : source.toUpperCase();
            }
        };

        int result = SoundexUtils.difference(encoder, "abcd", "abcx");
        assertEquals(3, result);
    }

    @Test(expected = EncoderException.class)
    public void testDifference_encoderThrowsException_propagatesException() throws EncoderException {
        StringEncoder encoder = new StringEncoder() {
            @Override
            public Object encode(Object source) throws EncoderException {
                throw new EncoderException("Encoding failed");
            }

            @Override
            public String encode(String source) throws EncoderException {
                throw new EncoderException("Encoding failed");
            }
        };

        SoundexUtils.difference(encoder, "test", "test");
    }

    @Test
    public void testDifference_encoderReturnsNull_returnsZero() throws EncoderException {
        StringEncoder encoder = new StringEncoder() {
            @Override
            public Object encode(Object source) throws EncoderException {
                return null;
            }

            @Override
            public String encode(String source) throws EncoderException {
                return null;
            }
        };

        int result = SoundexUtils.difference(encoder, "abc", "xyz");
        assertEquals(0, result);
    }
}
