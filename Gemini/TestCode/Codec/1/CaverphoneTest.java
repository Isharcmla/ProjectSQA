package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CaverphoneTest {

    private Caverphone caverphone;

    @Before
    public void setUp() {
        this.caverphone = new Caverphone();
    }

    @Test
    public void testConstructor_normal_instanceCreated() {
        Caverphone cp = new Caverphone();
        assertNotNull(cp);
    }

    @Test
    public void testCaverphone_nullInput_returnsDefaultCode() {
        assertEquals("1111111111", caverphone.caverphone(null));
    }

    @Test
    public void testCaverphone_emptyString_returnsDefaultCode() {
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testCaverphone_nonAlphabeticChars_returnsDefaultCode() {
        assertEquals("1111111111", caverphone.caverphone("12345!@#$%^&*()"));
    }

    @Test
    public void testCaverphone_wordsStartingWithSpecialPrefixes() {
        assertEquals(caverphone.caverphone("cough"), caverphone.caverphone("cou2f"));
        assertNotNull(caverphone.caverphone("cough"));
        assertNotNull(caverphone.caverphone("rough"));
        assertNotNull(caverphone.caverphone("tough"));
        assertNotNull(caverphone.caverphone("enough"));
        assertNotNull(caverphone.caverphone("trough"));
        assertNotNull(caverphone.caverphone("gnat"));
        assertNotNull(caverphone.caverphone("mbappe"));
    }

    @Test
    public void testCaverphone_variousReplacementRules() {
        assertNotNull(caverphone.caverphone("acquire"));    // cq
        assertNotNull(caverphone.caverphone("cinema"));     // ci
        assertNotNull(caverphone.caverphone("center"));     // ce
        assertNotNull(caverphone.caverphone("cyan"));       // cy
        assertNotNull(caverphone.caverphone("catch"));      // tch
        assertNotNull(caverphone.caverphone("quick"));      // q, c, k
        assertNotNull(caverphone.caverphone("xenon"));      // x
        assertNotNull(caverphone.caverphone("valve"));      // v, final e
        assertNotNull(caverphone.caverphone("bridge"));     // dg
        assertNotNull(caverphone.caverphone("motion"));     // tio
        assertNotNull(caverphone.caverphone("spatial"));    // tia
        assertNotNull(caverphone.caverphone("door"));       // d
        assertNotNull(caverphone.caverphone("phone"));      // ph
        assertNotNull(caverphone.caverphone("baby"));       // b
        assertNotNull(caverphone.caverphone("shine"));      // sh
        assertNotNull(caverphone.caverphone("zebra"));      // z
    }

    @Test
    public void testCaverphone_vowelAndYRules() {
        assertNotNull(caverphone.caverphone("apple"));      // ^[aeiou]
        assertNotNull(caverphone.caverphone("jump"));       // j
        assertNotNull(caverphone.caverphone("yard"));       // ^y3
        assertNotNull(caverphone.caverphone("yellow"));     // ^y
        assertNotNull(caverphone.caverphone("byte"));       // y
    }

    @Test
    public void testCaverphone_ghAndConsonantsRules() {
        assertNotNull(caverphone.caverphone("aghast"));     // 3gh3 -> 3kh3
        assertNotNull(caverphone.caverphone("ghost"));      // gh -> 22
        assertNotNull(caverphone.caverphone("good"));       // g -> k
        assertNotNull(caverphone.caverphone("ssss"));       // s+ -> S
        assertNotNull(caverphone.caverphone("tttt"));       // t+ -> T
        assertNotNull(caverphone.caverphone("pppp"));       // p+ -> P
        assertNotNull(caverphone.caverphone("kkkk"));       // k+ -> K
        assertNotNull(caverphone.caverphone("ffff"));       // f+ -> F
        assertNotNull(caverphone.caverphone("mmmm"));       // m+ -> M
        assertNotNull(caverphone.caverphone("nnnn"));       // n+ -> N
    }

    @Test
    public void testCaverphone_w_h_r_l_Rules() {
        assertNotNull(caverphone.caverphone("water"));      // w3 -> W3
        assertNotNull(caverphone.caverphone("what"));       // wh3 -> Wh3
        assertNotNull(caverphone.caverphone("saw"));        // w$ -> 3
        assertNotNull(caverphone.caverphone("awkward"));    // w -> 2
        assertNotNull(caverphone.caverphone("house"));      // ^h -> A
        assertNotNull(caverphone.caverphone("ahead"));      // h -> 2
        assertNotNull(caverphone.caverphone("read"));       // r3 -> R3
        assertNotNull(caverphone.caverphone("car"));        // r$ -> 3
        assertNotNull(caverphone.caverphone("dark"));       // r -> 2
        assertNotNull(caverphone.caverphone("like"));       // l3 -> L3
        assertNotNull(caverphone.caverphone("fall"));       // l$ -> 3
        assertNotNull(caverphone.caverphone("cold"));       // l -> 2
    }

    @Test
    public void testCaverphone_removalsAndLength() {
        String code = caverphone.caverphone("Peter");
        assertEquals(10, code.length());
        assertEquals("PTA1111111", code);

        String longWordCode = caverphone.caverphone("Stevenson");
        assertEquals(10, longWordCode.length());
        assertEquals("STFNSN1111", longWordCode);
    }

    @Test
    public void testEncode_string_returnsEncodedString() {
        assertEquals("PTA1111111", caverphone.encode("Peter"));
        assertEquals("1111111111", caverphone.encode(""));
        assertEquals("1111111111", caverphone.encode((String) null));
    }

    @Test
    public void testEncode_objectString_returnsEncodedObject() throws EncoderException {
        Object result = caverphone.encode((Object) "Peter");
        assertTrue(result instanceof String);
        assertEquals("PTA1111111", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncode_nonStringObject_throwsEncoderException() throws EncoderException {
        caverphone.encode(Integer.valueOf(12345));
    }

    @Test(expected = EncoderException.class)
    public void testEncode_nullObject_throwsEncoderException() throws EncoderException {
        caverphone.encode((Object) null);
    }

    @Test
    public void testIsCaverphoneEqual_sameSoundWords_returnsTrue() {
        assertTrue(caverphone.isCaverphoneEqual("Peter", "Petre"));
        assertTrue(caverphone.isCaverphoneEqual("Stevenson", "Stephenson"));
    }

    @Test
    public void testIsCaverphoneEqual_differentSoundWords_returnsFalse() {
        assertFalse(caverphone.isCaverphoneEqual("Peter", "Stephen"));
        assertFalse(caverphone.isCaverphoneEqual("Hello", "World"));
    }

    @Test
    public void testIsCaverphoneEqual_nullAndEmptyComparisons() {
        assertTrue(caverphone.isCaverphoneEqual(null, ""));
        assertTrue(caverphone.isCaverphoneEqual(null, null));
        assertTrue(caverphone.isCaverphoneEqual("", ""));
        assertFalse(caverphone.isCaverphoneEqual("Peter", null));
    }
}
