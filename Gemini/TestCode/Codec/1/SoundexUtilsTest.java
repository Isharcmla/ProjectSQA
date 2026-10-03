package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.junit.Assert;
import org.junit.Test;

public class SoundexUtilsTest {

    @Test
    public void testConstructor() {
        SoundexUtils utils = new SoundexUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void testClean_nullInput_returnsNull() {
        Assert.assertNull(SoundexUtils.clean(null));
    }

    @Test
    public void testClean_emptyString_returnsEmptyString() {
        Assert.assertEquals("", SoundexUtils.clean(""));
    }

    @Test
    public void testClean_allLettersLowerCase_returnsUpperCase() {
        Assert.assertEquals("HELLO", SoundexUtils.clean("hello"));
    }

    @Test
    public void testClean_allLettersUpperCase_returnsSameUpperCase() {
        Assert.assertEquals("WORLD", SoundexUtils.clean("WORLD"));
    }

    @Test
    public void testClean_mixedLettersAndNonLetters_returnsOnlyUpperCaseLetters() {
        Assert.assertEquals("HELLOWORLD", SoundexUtils.clean("H3ll0, W0rld!"));
    }

    @Test
    public void testClean_onlyNonLetters_returnsEmptyString() {
        Assert.assertEquals("", SoundexUtils.clean("1234567890!@#$%^&*()"));
    }

    @Test
    public void testClean_specialCharactersAndWhitespace_filtersCorrectly() {
        Assert.assertEquals("TEST", SoundexUtils.clean("  t_e-s.t  "));
    }

    @Test
    public void testDifference_validInputs_returnsDifferenceCount() throws EncoderException {
        StringEncoder encoder = new Soundex();
        int diff = SoundexUtils.difference(encoder, "Smith", "Smyth");
        Assert.assertEquals(4, diff);
    }

    @Test
    public void testDifference_differentInputs_returnsLowDifferenceCount() throws EncoderException {
        StringEncoder encoder = new Soundex();
        int diff = SoundexUtils.difference(encoder, "Smith", "Jones");
        Assert.assertEquals(0, diff);
    }

    @Test(expected = EncoderException.class)
    public void testDifference_encoderThrowsException_propagatesException() throws EncoderException {
        StringEncoder throwingEncoder = new StringEncoder() {
            @Override
            public String encode(String source) throws EncoderException {
                throw new EncoderException("Encoding failed");
            }

            @Override
            public Object encode(Object source) throws EncoderException {
                throw new EncoderException("Encoding failed");
            }
        };
        SoundexUtils.difference(throwingEncoder, "test1", "test2");
    }

    @Test
    public void testDifferenceEncoded_bothNull_returnsZero() {
        Assert.assertEquals(0, SoundexUtils.differenceEncoded(null, null));
    }

    @Test
    public void testDifferenceEncoded_firstNull_returnsZero() {
        Assert.assertEquals(0, SoundexUtils.differenceEncoded(null, "S123"));
    }

    @Test
    public void testDifferenceEncoded_secondNull_returnsZero() {
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("S123", null));
    }

    @Test
    public void testDifferenceEncoded_bothEmpty_returnsZero() {
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("", ""));
    }

    @Test
    public void testDifferenceEncoded_oneEmpty_returnsZero() {
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("S123", ""));
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("", "S123"));
    }

    @Test
    public void testDifferenceEncoded_identicalStrings_returnsStringLength() {
        Assert.assertEquals(4, SoundexUtils.differenceEncoded("S123", "S123"));
    }

    @Test
    public void testDifferenceEncoded_completelyDifferentStrings_returnsZero() {
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("S123", "A456"));
    }

    @Test
    public void testDifferenceEncoded_partiallyMatchingStrings_returnsMatchCount() {
        Assert.assertEquals(2, SoundexUtils.differenceEncoded("S123", "S145"));
        Assert.assertEquals(2, SoundexUtils.differenceEncoded("S123", "A124"));
    }

    @Test
    public void testDifferenceEncoded_differentLengths_matchesUpToMinLength() {
        Assert.assertEquals(3, SoundexUtils.differenceEncoded("S12345", "S129"));
        Assert.assertEquals(3, SoundexUtils.differenceEncoded("S129", "S12345"));
    }
}
