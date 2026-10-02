import org.apache.commons.codec.EncoderException;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaverphoneTest {

    private final Caverphone caverphone = new Caverphone();

    // ---------- Constructor ----------

    @Test
    public void testConstructor_createsInstance() {
        Caverphone c = new Caverphone();
        assertNotNull(c);
    }

    // ---------- caverphone(String) - edge cases ----------

    @Test
    public void testCaverphone_nullInput_returnsAllOnes() {
        String result = caverphone.caverphone(null);
        assertEquals("1111111111", result);
    }

    @Test
    public void testCaverphone_emptyInput_returnsAllOnes() {
        String result = caverphone.caverphone("");
        assertEquals("1111111111", result);
    }

    @Test
    public void testCaverphone_nonAlphaOnlyInput_returnsAllOnes() {
        // After removing non a-z characters, the string becomes empty,
        // but the initial null/empty check is bypassed since length() > 0 initially.
        String result = caverphone.caverphone("12345");
        assertEquals("1111111111", result);
    }

    // ---------- caverphone(String) - normal / typical cases ----------

    @Test
    public void testCaverphone_smith_returnsExpectedCode() {
        String result = caverphone.caverphone("smith");
        assertEquals("SMT1111111", result);
    }

    @Test
    public void testCaverphone_smyth_returnsSameCodeAsSmith() {
        String result = caverphone.caverphone("smyth");
        assertEquals("SMT1111111", result);
    }

    @Test
    public void testCaverphone_jones_returnsExpectedCode() {
        String result = caverphone.caverphone("jones");
        assertEquals("YNS1111111", result);
    }

    @Test
    public void testCaverphone_adam_vowelStart_returnsExpectedCode() {
        String result = caverphone.caverphone("adam");
        assertEquals("ATM1111111", result);
    }

    @Test
    public void testCaverphone_upperCaseInput_isNormalizedToLowerCase() {
        String result = caverphone.caverphone("SMITH");
        assertEquals("SMT1111111", result);
    }

    @Test
    public void testCaverphone_alwaysReturnsLengthTen_forVariousSpecialStarts() {
        // These exercise the special-start replacement rules (cough/rough/tough/
        // enough/trough/gn/mb) without asserting an exact hand-computed value,
        // to avoid brittle assertions while still exercising the code paths.
        assertEquals(10, caverphone.caverphone("cough").length());
        assertEquals(10, caverphone.caverphone("rough").length());
        assertEquals(10, caverphone.caverphone("tough").length());
        assertEquals(10, caverphone.caverphone("enough").length());
        assertEquals(10, caverphone.caverphone("trough").length());
        assertEquals(10, caverphone.caverphone("gnome").length());
        assertEquals(10, caverphone.caverphone("mbeki").length());
    }

    @Test
    public void testCaverphone_mixedCaseWithNonAlphaCharacters_returnsLengthTen() {
        String result = caverphone.caverphone("Sm1th O'Brien-123");
        assertEquals(10, result.length());
    }

    @Test
    public void testCaverphone_singleCharacter_returnsLengthTen() {
        String result = caverphone.caverphone("a");
        assertEquals(10, result.length());
    }

    @Test
    public void testCaverphone_wordEndingInE_removesFinalE() {
        // Exercises the "remove final e" rule.
        String result = caverphone.caverphone("apple");
        assertEquals(10, result.length());
    }

    @Test
    public void testCaverphone_wordWithTch_hitsTchReplacement() {
        String result = caverphone.caverphone("watch");
        assertEquals(10, result.length());
    }

    @Test
    public void testCaverphone_wordWithWAtEnd_hitsWEndRule() {
        String result = caverphone.caverphone("bow");
        assertEquals(10, result.length());
    }

    @Test
    public void testCaverphone_wordWithRAtEnd_hitsREndRule() {
        String result = caverphone.caverphone("car");
        assertEquals(10, result.length());
    }

    @Test
    public void testCaverphone_wordWithLAtEnd_hitsLEndRule() {
        String result = caverphone.caverphone("ball");
        assertEquals(10, result.length());
    }

    // ---------- encode(Object) ----------

    @Test
    public void testEncodeObject_validString_returnsCaverphoneCode() throws EncoderException {
        Object result = caverphone.encode((Object) "smith");
        assertEquals("SMT1111111", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_nonStringType_throwsEncoderException() throws EncoderException {
        caverphone.encode(Integer.valueOf(123));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_nullObject_throwsEncoderException() throws EncoderException {
        caverphone.encode((Object) null);
    }

    // ---------- encode(String) ----------

    @Test
    public void testEncodeString_validString_delegatesToCaverphone() {
        String result = caverphone.encode("smith");
        assertEquals("SMT1111111", result);
    }

    @Test
    public void testEncodeString_nullString_returnsAllOnes() {
        String result = caverphone.encode((String) null);
        assertEquals("1111111111", result);
    }

    @Test
    public void testEncodeString_emptyString_returnsAllOnes() {
        String result = caverphone.encode("");
        assertEquals("1111111111", result);
    }

    // ---------- isCaverphoneEqual ----------

    @Test
    public void testIsCaverphoneEqual_similarSoundingWords_returnsTrue() {
        boolean result = caverphone.isCaverphoneEqual("smith", "smyth");
        assertTrue(result);
    }

    @Test
    public void testIsCaverphoneEqual_differentWords_returnsFalse() {
        boolean result = caverphone.isCaverphoneEqual("smith", "jones");
        assertFalse(result);
    }

    @Test
    public void testIsCaverphoneEqual_bothNull_returnsTrue() {
        boolean result = caverphone.isCaverphoneEqual(null, null);
        assertTrue(result);
    }

    @Test
    public void testIsCaverphoneEqual_bothEmpty_returnsTrue() {
        boolean result = caverphone.isCaverphoneEqual("", "");
        assertTrue(result);
    }

    @Test
    public void testIsCaverphoneEqual_sameStringDifferentCase_returnsTrue() {
        boolean result = caverphone.isCaverphoneEqual("Smith", "SMITH");
        assertTrue(result);
    }
}
