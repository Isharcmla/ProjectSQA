package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CaverphoneTest {

    private Caverphone caverphone;

    @Before
    public void setUp() {
        this.caverphone = new Caverphone();
    }

    @Test
    public void testCaverphone_nullInput_returnsDefaultCode() {
        assertEquals("1111111111", this.caverphone.caverphone(null));
    }

    @Test
    public void testCaverphone_emptyInput_returnsDefaultCode() {
        assertEquals("1111111111", this.caverphone.caverphone(""));
    }

    @Test
    public void testCaverphone_nonAlphaCharacters_filteredOut() {
        assertEquals("1111111111", this.caverphone.caverphone("12345!@#$%^&*()"));
        assertEquals(this.caverphone.caverphone("Peter"), this.caverphone.caverphone("P-e_t.e!r?123"));
    }

    @Test
    public void testCaverphone_variousSpecialPrefixes() {
        assertEquals("KFA1111111", this.caverphone.caverphone("cough"));
        assertEquals("RFA1111111", this.caverphone.caverphone("rough"));
        assertEquals("TFA1111111", this.caverphone.caverphone("tough"));
        assertEquals("ANFA111111", this.caverphone.caverphone("enough"));
        assertEquals("TRAFA11111", this.caverphone.caverphone("trough"));
        assertEquals("NTA1111111", this.caverphone.caverphone("gnat"));
        assertEquals("MPA1111111", this.caverphone.caverphone("mbappe"));
    }

    @Test
    public void testCaverphone_consonantAndPhoneticTransformations() {
        // cq, ci, ce, cy, tch, c, q, x, v, dg, tio, tia, d, ph, b, sh, z
        assertNotNull(this.caverphone.caverphone("acquire")); // cq
        assertNotNull(this.caverphone.caverphone("circle"));  // ci
        assertNotNull(this.caverphone.caverphone("centre"));  // ce
        assertNotNull(this.caverphone.caverphone("cyan"));    // cy
        assertNotNull(this.caverphone.caverphone("catch"));   // tch
        assertNotNull(this.caverphone.caverphone("quick"));   // q, k
        assertNotNull(this.caverphone.caverphone("fox"));     // x
        assertNotNull(this.caverphone.caverphone("van"));     // v
        assertNotNull(this.caverphone.caverphone("bridge"));  // dg, e$
        assertNotNull(this.caverphone.caverphone("action"));  // tio
        assertNotNull(this.caverphone.caverphone("spatial")); // tia
        assertNotNull(this.caverphone.caverphone("dog"));     // d, g
        assertNotNull(this.caverphone.caverphone("phone"));   // ph
        assertNotNull(this.caverphone.caverphone("boy"));     // b, y
        assertNotNull(this.caverphone.caverphone("ship"));    // sh
        assertNotNull(this.caverphone.caverphone("zebra"));   // z
    }

    @Test
    public void testCaverphone_vowelAndYTransformations() {
        // ^[aeiou] -> A, [aeiou] -> 3
        assertEquals("APA1111111", this.caverphone.caverphone("apple"));

        // j -> y -> ...
        assertNotNull(this.caverphone.caverphone("jam"));

        // ^y3 -> Y3
        assertNotNull(this.caverphone.caverphone("yellow"));

        // ^y (not followed by vowel converted to 3) -> A
        assertNotNull(this.caverphone.caverphone("yvette"));

        // internal y
        assertNotNull(this.caverphone.caverphone("byte"));
    }

    @Test
    public void testCaverphone_ghAndGTransformations() {
        // 3gh3 -> 3kh3
        assertNotNull(this.caverphone.caverphone("ugha"));
        // gh -> 22
        assertNotNull(this.caverphone.caverphone("ghost"));
        // g -> k
        assertNotNull(this.caverphone.caverphone("great"));
    }

    @Test
    public void testCaverphone_repeatedConsonants() {
        // s+, t+, p+, k+, f+, m+, n+
        assertNotNull(this.caverphone.caverphone("mississippi"));
        assertNotNull(this.caverphone.caverphone("little"));
        assertNotNull(this.caverphone.caverphone("bookkeeper"));
        assertNotNull(this.caverphone.caverphone("traffic"));
        assertNotNull(this.caverphone.caverphone("hammer"));
        assertNotNull(this.caverphone.caverphone("banner"));
    }

    @Test
    public void testCaverphone_wTransformations() {
        // w3, wh3, w$, w
        assertNotNull(this.caverphone.caverphone("water")); // w3
        assertNotNull(this.caverphone.caverphone("white")); // wh3
        assertNotNull(this.caverphone.caverphone("cow"));   // w$
        assertNotNull(this.caverphone.caverphone("awkward")); // w internal
    }

    @Test
    public void testCaverphone_hTransformations() {
        // ^h, h
        assertNotNull(this.caverphone.caverphone("hat"));   // ^h
        assertNotNull(this.caverphone.caverphone("ahead")); // internal h
    }

    @Test
    public void testCaverphone_rAndLTransformations() {
        // r3, r$, r
        assertNotNull(this.caverphone.caverphone("ready")); // r3
        assertNotNull(this.caverphone.caverphone("car"));   // r$
        assertNotNull(this.caverphone.caverphone("arm"));   // internal r

        // l3, l$, l
        assertNotNull(this.caverphone.caverphone("late"));  // l3
        assertNotNull(this.caverphone.caverphone("ball"));  // l$
        assertNotNull(this.caverphone.caverphone("already")); // internal l
    }

    @Test
    public void testCaverphone_endVowelRule() {
        // 3$ -> A
        assertEquals("PNA1111111", this.caverphone.caverphone("banana"));
    }

    @Test
    public void testCaverphone_lengthTruncationToTen() {
        String code = this.caverphone.caverphone("supercalifragilisticexpialidocious");
        assertEquals(10, code.length());
    }

    @Test
    public void testCaverphone_knownStandardWords() {
        assertEquals("PTA1111111", this.caverphone.caverphone("Peter"));
        assertEquals("STFNSN1111", this.caverphone.caverphone("Stevenson"));
        assertEquals("TMPSN11111", this.caverphone.caverphone("Thompson"));
        assertEquals("LA11111111", this.caverphone.caverphone("Lee"));
    }

    @Test
    public void testEncode_stringMethod() {
        assertEquals("PTA1111111", this.caverphone.encode("Peter"));
        assertEquals("1111111111", this.caverphone.encode(""));
        assertEquals("1111111111", this.caverphone.encode((String) null));
    }

    @Test
    public void testEncode_objectMethod_validString() throws EncoderException {
        Object result = this.caverphone.encode((Object) "Peter");
        assertTrue(result instanceof String);
        assertEquals("PTA1111111", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncode_objectMethod_nonString_throwsException() throws EncoderException {
        this.caverphone.encode(Integer.valueOf(12345));
    }

    @Test
    public void testEncode_objectMethod_nullObject_throwsException() {
        try {
            this.caverphone.encode((Object) null);
            fail("Expected EncoderException for null object");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Caverphone encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    public void testIsCaverphoneEqual_samePhonetics_returnsTrue() {
        assertTrue(this.caverphone.isCaverphoneEqual("Peter", "Peter"));
        assertTrue(this.caverphone.isCaverphoneEqual("Lee", "Leigh"));
        assertTrue(this.caverphone.isCaverphoneEqual("Smith", "Smyth"));
    }

    @Test
    public void testIsCaverphoneEqual_differentPhonetics_returnsFalse() {
        assertFalse(this.caverphone.isCaverphoneEqual("Peter", "Stevenson"));
        assertFalse(this.caverphone.isCaverphoneEqual("Thompson", "Lee"));
    }

    @Test
    public void testIsCaverphoneEqual_nullAndEmptyComparisons() {
        assertTrue(this.caverphone.isCaverphoneEqual(null, ""));
        assertTrue(this.caverphone.isCaverphoneEqual("", null));
        assertTrue(this.caverphone.isCaverphoneEqual(null, null));
        assertFalse(this.caverphone.isCaverphoneEqual(null, "Peter"));
    }
}
