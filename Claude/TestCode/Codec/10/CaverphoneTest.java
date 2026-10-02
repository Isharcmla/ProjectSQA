import org.apache.commons.codec.EncoderException;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CaverphoneTest {

    private Caverphone caverphone;

    @Before
    public void setUp() {
        caverphone = new Caverphone();
    }

    // ---------------------------------------------------------------
    // caverphone(String) - edge cases
    // ---------------------------------------------------------------

    @Test
    public void testCaverphone_nullInput_returnsDefaultCode() {
        assertEquals("1111111111", caverphone.caverphone(null));
    }

    @Test
    public void testCaverphone_emptyInput_returnsDefaultCode() {
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testCaverphone_onlyNonLetterCharacters_returnsDefaultCode() {
        // digits are stripped out leaving an empty string, which follows
        // the same code path as an empty input after normalization
        assertEquals("1111111111", caverphone.caverphone("1234"));
    }

    @Test
    public void testCaverphone_onlySpaces_returnsDefaultCode() {
        assertEquals("1111111111", caverphone.caverphone("   "));
    }

    // ---------------------------------------------------------------
    // caverphone(String) - normal/typical input, verified manually
    // against the Caverphone 2.0 algorithm rules
    // ---------------------------------------------------------------

    @Test
    public void testCaverphone_normalInputPeter_returnsExpectedCode() {
        assertEquals("PTA1111111", caverphone.caverphone("Peter"));
    }

    @Test
    public void testCaverphone_normalInputThompson_returnsExpectedCode() {
        assertEquals("TMPSN11111", caverphone.caverphone("Thompson"));
    }

    @Test
    public void testCaverphone_startCough_returnsExpectedCode() {
        assertEquals("KF11111111", caverphone.caverphone("cough"));
    }

    @Test
    public void testCaverphone_caseInsensitive_sameResult() {
        String lower = caverphone.caverphone("peter");
        String upper = caverphone.caverphone("PETER");
        String mixed = caverphone.caverphone("Peter");
        assertEquals(lower, upper);
        assertEquals(lower, mixed);
    }

    @Test
    public void testCaverphone_resultLength_alwaysTen() {
        String[] words = {
            "rough", "tough", "enough", "trough", "gnome", "mbeki",
            "acquire", "city", "cent", "cyst", "watch", "box", "badge",
            "action", "martial", "phone", "sharp", "zoo", "apple",
            "jack", "yes", "byte", "ghost", "David", "Whittle",
            "Stevenson", "Browne"
        };
        for (String word : words) {
            String result = caverphone.caverphone(word);
            assertNotNull(result);
            assertEquals("Length mismatch for word: " + word, 10, result.length());
        }
    }

    @Test
    public void testCaverphone_startsWithVowel_returnsTenCharCode() {
        String result = caverphone.caverphone("apple");
        assertEquals(10, result.length());
    }

    @Test
    public void testCaverphone_repeatedCalls_deterministicResult() {
        String first = caverphone.caverphone("Elizabeth");
        String second = caverphone.caverphone("Elizabeth");
        assertEquals(first, second);
    }

    // ---------------------------------------------------------------
    // encode(Object)
    // ---------------------------------------------------------------

    @Test
    public void testEncodeObject_withStringInput_returnsExpectedCode() throws EncoderException {
        Object result = caverphone.encode((Object) "Peter");
        assertEquals("PTA1111111", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_withNonStringInput_throwsEncoderException() throws EncoderException {
        caverphone.encode((Object) Integer.valueOf(42));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_withNullNonStringLikeObject_throwsEncoderException() throws EncoderException {
        // passing an object that is not a String (StringBuilder is not a String instance)
        caverphone.encode((Object) new StringBuilder("test"));
    }

    // ---------------------------------------------------------------
    // encode(String)
    // ---------------------------------------------------------------

    @Test
    public void testEncodeString_delegatesToCaverphone_normalInput() {
        assertEquals(caverphone.caverphone("Thompson"), caverphone.encode("Thompson"));
    }

    @Test
    public void testEncodeString_nullInput_returnsDefaultCode() {
        assertEquals("1111111111", caverphone.encode((String) null));
    }

    @Test
    public void testEncodeString_emptyInput_returnsDefaultCode() {
        assertEquals("1111111111", caverphone.encode(""));
    }

    // ---------------------------------------------------------------
    // isCaverphoneEqual(String, String)
    // ---------------------------------------------------------------

    @Test
    public void testIsCaverphoneEqual_sameWordsDifferentCase_returnsTrue() {
        assertTrue(caverphone.isCaverphoneEqual("Peter", "PETER"));
    }

    @Test
    public void testIsCaverphoneEqual_differentWords_returnsFalse() {
        assertFalse(caverphone.isCaverphoneEqual("Peter", "Thompson"));
    }

    @Test
    public void testIsCaverphoneEqual_bothNull_returnsTrue() {
        assertTrue(caverphone.isCaverphoneEqual(null, null));
    }

    @Test
    public void testIsCaverphoneEqual_bothEmpty_returnsTrue() {
        assertTrue(caverphone.isCaverphoneEqual("", ""));
    }

    @Test
    public void testIsCaverphoneEqual_similarSoundingWords_returnsTrue() {
        // "Thompson" and "Tompsen" should sound alike under caverphone rules
        assertTrue(caverphone.isCaverphoneEqual("Thompson", "Tompsen"));
    }
}
