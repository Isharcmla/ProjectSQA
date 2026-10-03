package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SoundexTest {

    private Soundex soundex;

    @Before
    public void setUp() {
        this.soundex = new Soundex();
    }

    @Test
    public void testConstructor_default_usesUsEnglishMapping() {
        final Soundex s = new Soundex();
        Assert.assertEquals("S530", s.soundex("Smith"));
    }

    @Test
    public void testConstructor_charArray_copiesMapping() {
        final char[] customMapping = "01230120022455012623010202".toCharArray();
        final Soundex s = new Soundex(customMapping);
        Assert.assertEquals("S530", s.soundex("Smith"));
    }

    @Test
    public void testConstructor_string_usesStringMapping() {
        final Soundex s = new Soundex("01230120022455012623010202");
        Assert.assertEquals("S530", s.soundex("Smith"));
    }

    @Test
    public void testConstants_usEnglishMappingString_matchesExpected() {
        Assert.assertEquals("01230120022455012623010202", Soundex.US_ENGLISH_MAPPING_STRING);
        Assert.assertNotNull(Soundex.US_ENGLISH);
        Assert.assertEquals("S530", Soundex.US_ENGLISH.soundex("Smith"));
    }

    @Test
    public void testDifference_similarStrings_returnsFour() throws EncoderException {
        Assert.assertEquals(4, this.soundex.difference("Smith", "Smyth"));
    }

    @Test
    public void testDifference_differentStrings_returnsLowScore() throws EncoderException {
        final int score = this.soundex.difference("Smith", "Jones");
        Assert.assertTrue(score >= 0 && score <= 4);
    }

    @Test
    public void testDifference_nullInputs_returnsZero() throws EncoderException {
        Assert.assertEquals(0, this.soundex.difference(null, "Smith"));
        Assert.assertEquals(0, this.soundex.difference("Smith", null));
        Assert.assertEquals(0, this.soundex.difference(null, null));
    }

    @Test
    public void testEncodeObject_stringType_returnsSoundexCode() throws EncoderException {
        final Object result = this.soundex.encode((Object) "Testing");
        Assert.assertTrue(result instanceof String);
        Assert.assertEquals("T235", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_nonStringType_throwsEncoderException() throws EncoderException {
        this.soundex.encode(12345);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_nullObject_throwsEncoderException() throws EncoderException {
        this.soundex.encode((Object) null);
    }

    @Test
    public void testEncodeString_validInput_returnsSoundexCode() {
        final String result = this.soundex.encode("Williams");
        Assert.assertEquals("W452", result);
    }

    @Test
    public void testSoundex_nullInput_returnsNull() {
        Assert.assertNull(this.soundex.soundex(null));
    }

    @Test
    public void testSoundex_emptyString_returnsEmptyString() {
        Assert.assertEquals("", this.soundex.soundex(""));
    }

    @Test
    public void testSoundex_nonLettersOnly_returnsEmptyString() {
        Assert.assertEquals("", this.soundex.soundex("12345#@!"));
    }

    @Test
    public void testSoundex_singleCharacter_paddedWithZeros() {
        Assert.assertEquals("A000", this.soundex.soundex("A"));
    }

    @Test
    public void testSoundex_shortString_paddedWithZeros() {
        Assert.assertEquals("A200", this.soundex.soundex("Ac"));
    }

    @Test
    public void testSoundex_longString_truncatedToFourCharacters() {
        Assert.assertEquals("W252", this.soundex.soundex("Washington"));
    }

    @Test
    public void testSoundex_consecutiveDuplicateCodes_treatedAsOne() {
        Assert.assertEquals("B100", this.soundex.soundex("Bb"));
    }

    @Test
    public void testSoundex_duplicateCodesSeparatedByVowel_encodedTwice() {
        Assert.assertEquals("B110", this.soundex.soundex("Bob"));
    }

    @Test
    public void testSoundex_hwSeparation_sameCodeGroupTreatedAsOne() {
        Assert.assertEquals("A261", this.soundex.soundex("Ashcraft"));
        Assert.assertEquals("A261", this.soundex.soundex("Ashcroft"));
        Assert.assertEquals("A200", this.soundex.soundex("Aswc"));
    }

    @Test
    public void testSoundex_hwSeparation_differentCodeGroup_notTreatedAsOne() {
        Assert.assertEquals("A210", this.soundex.soundex("Ashb"));
        Assert.assertEquals("A210", this.soundex.soundex("Aswb"));
    }

    @Test
    public void testSoundex_consecutiveHW_preHWCharIsHorW() {
        Assert.assertEquals("A000", this.soundex.soundex("Awhb"));
        Assert.assertEquals("A000", this.soundex.soundex("Ahhb"));
    }

    @Test
    public void testSoundex_hwAtBeginningOrNonHWSeparation() {
        Assert.assertEquals("H000", this.soundex.soundex("H"));
        Assert.assertEquals("W000", this.soundex.soundex("W"));
        Assert.assertEquals("H200", this.soundex.soundex("Hc"));
        Assert.assertEquals("A123", this.soundex.soundex("Abcd"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSoundex_unmappedCharacterOutOfBounds_throwsIllegalArgumentException() {
        final Soundex customSoundex = new Soundex("0123");
        customSoundex.soundex("Z");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSoundex_nonAsciiLetter_throwsIllegalArgumentException() {
        this.soundex.soundex("Åland");
    }

    @Test
    public void testGetSetMaxLength_deprecatedFields() {
        Assert.assertEquals(4, this.soundex.getMaxLength());
        this.soundex.setMaxLength(6);
        Assert.assertEquals(6, this.soundex.getMaxLength());
    }

    @Test
    public void testSoundex_knownStandardEncodings() {
        Assert.assertEquals("E800", new Soundex("01230120022455012623010208").soundex("Euler"));
        Assert.assertEquals("E460", this.soundex.soundex("Ellery"));
        Assert.assertEquals("G120", this.soundex.soundex("Gauss"));
        Assert.assertEquals("G200", this.soundex.soundex("Ghosh"));
        Assert.assertEquals("H416", this.soundex.soundex("Hilbert"));
        Assert.assertEquals("K520", this.soundex.soundex("Knuth"));
        Assert.assertEquals("L330", this.soundex.soundex("Ladd"));
        Assert.assertEquals("L222", this.soundex.soundex("Lukasiewicz"));
        Assert.assertEquals("T522", this.soundex.soundex("Tymczak"));
    }
}
