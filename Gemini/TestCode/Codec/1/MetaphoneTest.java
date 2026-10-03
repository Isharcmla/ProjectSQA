package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MetaphoneTest {

    private Metaphone metaphone;

    @Before
    public void setUp() {
        this.metaphone = new Metaphone();
    }

    @Test
    public void testConstructor() {
        Metaphone m = new Metaphone();
        assertEquals(4, m.getMaxCodeLen());
    }

    @Test
    public void testGetAndSetMaxCodeLen() {
        assertEquals(4, metaphone.getMaxCodeLen());
        metaphone.setMaxCodeLen(6);
        assertEquals(6, metaphone.getMaxCodeLen());
        metaphone.setMaxCodeLen(0);
        assertEquals(0, metaphone.getMaxCodeLen());
        metaphone.setMaxCodeLen(-1);
        assertEquals(-1, metaphone.getMaxCodeLen());
        metaphone.setMaxCodeLen(4);
    }

    @Test
    public void testMetaphone_NullOrEmpty_ReturnsEmptyString() {
        assertEquals("", metaphone.metaphone(null));
        assertEquals("", metaphone.metaphone(""));
    }

    @Test
    public void testMetaphone_SingleCharacter() {
        assertEquals("A", metaphone.metaphone("a"));
        assertEquals("B", metaphone.metaphone("B"));
        assertEquals("Z", metaphone.metaphone("z"));
    }

    @Test
    public void testMetaphone_InitialLettersTransformations() {
        // Initial KN, GN, PN -> N
        assertEquals("NFT", metaphone.metaphone("KNIGHT"));
        assertEquals("NM", metaphone.metaphone("GNOME"));
        assertEquals("NM", metaphone.metaphone("PNEUMONIA"));

        // Initial K, G, P followed by non-N
        assertEquals("KLXN", metaphone.metaphone("KLAXON"));
        assertEquals("KR", metaphone.metaphone("GROW"));
        assertEquals("PL", metaphone.metaphone("PLAY"));

        // Initial AE -> E
        assertEquals("EJS", metaphone.metaphone("AEGIS"));
        // Initial A followed by non-E
        assertEquals("APL", metaphone.metaphone("APPLE"));

        // Initial WR -> R, WH -> W
        assertEquals("RT", metaphone.metaphone("WRIGHT"));
        assertEquals("WT", metaphone.metaphone("WHITE"));
        // Initial W followed by non-R, non-H
        assertEquals("WTR", metaphone.metaphone("WATER"));

        // Initial X -> S
        assertEquals("SLFN", metaphone.metaphone("XYLOPHONE"));

        // Default initial letter
        assertEquals("TST", metaphone.metaphone("TEST"));
    }

    @Test
    public void testMetaphone_DuplicateLetters() {
        // Double letters except C should be deduplicated
        assertEquals("LT", metaphone.metaphone("LETTER"));
        assertEquals("BL", metaphone.metaphone("BALL"));
        assertEquals("APL", metaphone.metaphone("APPLE"));

        // CC should not be automatically skipped by duplicate check
        assertEquals("AKSN", metaphone.metaphone("ACCENT"));
    }

    @Test
    public void testMetaphone_VowelsHandling() {
        // Leading vowels are retained
        assertEquals("E", metaphone.metaphone("EGG"));
        assertEquals("I", metaphone.metaphone("IGLOO"));
        assertEquals("O", metaphone.metaphone("ORANGE"));
        assertEquals("U", metaphone.metaphone("UMBRELLA"));

        // Non-leading vowels are ignored
        assertEquals("B", metaphone.metaphone("BEE"));
        assertEquals("B", metaphone.metaphone("BA"));
    }

    @Test
    public void testMetaphone_BHandling() {
        // Silent B after M at end of word
        assertEquals("TM", metaphone.metaphone("THUMB"));
        assertEquals("KM", metaphone.metaphone("COMB"));
        assertEquals("TM", metaphone.metaphone("DUMB"));

        // B after M but not at end of word
        assertEquals("TMBR", metaphone.metaphone("TIMBER"));
        assertEquals("AMBR", metaphone.metaphone("AMBER"));

        // Normal B
        assertEquals("BB", metaphone.metaphone("BABY"));
    }

    @Test
    public void testMetaphone_CHandling() {
        // SCE, SCI, SCY -> SC ignored
        assertEquals("SN", metaphone.metaphone("SCENE"));
        assertEquals("SS", metaphone.metaphone("SCIENCE"));
        assertEquals("S0", metaphone.metaphone("SCYTHE"));

        // CIA -> X
        assertEquals("KLXL", metaphone.metaphone("GLACIAL"));
        assertEquals("SPXL", metaphone.metaphone("SPECIAL"));

        // CI, CE, CY -> S
        assertEquals("ST", metaphone.metaphone("CITY"));
        assertEquals("SNT", metaphone.metaphone("CENT"));
        assertEquals("SLNT", metaphone.metaphone("CYLINDER"));

        // SCH -> SK
        assertEquals("SKL", metaphone.metaphone("SCHOOL"));
        assertEquals("SKM", metaphone.metaphone("SCHEME"));

        // CH consonant vs CH vowel
        assertEquals("KRS", metaphone.metaphone("CHRIST"));
        assertEquals("KRX", metaphone.metaphone("CHAIR"));
        assertEquals("KP", metaphone.metaphone("CHEAP"));
        assertEquals("KRT", metaphone.metaphone("CHORD"));

        // CH in non-initial position or word length < 3
        assertEquals("AX", metaphone.metaphone("ACHE"));
        assertEquals("ARX", metaphone.metaphone("ARCH"));
        assertEquals("X", metaphone.metaphone("CH"));

        // Default C -> K
        assertEquals("KT", metaphone.metaphone("CAT"));
        assertEquals("KP", metaphone.metaphone("CUP"));
        assertEquals("KLM", metaphone.metaphone("CLIMB"));
    }

    @Test
    public void testMetaphone_DHandling() {
        // DGE, DGI, DGY -> J
        assertEquals("EJ", metaphone.metaphone("EDGE"));
        assertEquals("JJ", metaphone.metaphone("JUDGE"));
        assertEquals("EJ", metaphone.metaphone("EDGY"));
        assertEquals("JJMN", metaphone.metaphone("JUDGMENT"));

        // Default D -> T
        assertEquals("TT", metaphone.metaphone("DAD"));
        assertEquals("TR", metaphone.metaphone("DOOR"));
    }

    @Test
    public void testMetaphone_GHandling() {
        // Terminal GH -> silent
        assertEquals("H", metaphone.metaphone("HIGH"));
        assertEquals("0R", metaphone.metaphone("THROUGH"));

        // GH followed by consonant -> silent
        assertEquals("NFT", metaphone.metaphone("NIGHT"));
        assertEquals("FLT", metaphone.metaphone("FLIGHT"));

        // GH followed by vowel -> K
        assertEquals("KST", metaphone.metaphone("GHOST"));

        // Silent GN and GNED
        assertEquals("SN", metaphone.metaphone("SIGN"));
        assertEquals("RSNT", metaphone.metaphone("RESIGNED"));

        // Double G (hard G)
        assertEquals("AKRS", metaphone.metaphone("AGGRESSIVE"));
        assertEquals("TKNK", metaphone.metaphone("TAGGING"));

        // Soft G before E, I, Y
        assertEquals("JL", metaphone.metaphone("GEL"));
        assertEquals("JNT", metaphone.metaphone("GIANT"));
        assertEquals("JM", metaphone.metaphone("GYM"));

        // Default G -> K
        assertEquals("KM", metaphone.metaphone("GUM"));
        assertEquals("BK", metaphone.metaphone("BAG"));
    }

    @Test
    public void testMetaphone_HHandling() {
        // Terminal H
        assertEquals("A", metaphone.metaphone("AHAH"));
        assertEquals("O", metaphone.metaphone("OH"));

        // H after VARSON (C, S, P, T, G)
        assertEquals("XT", metaphone.metaphone("CHAT"));
        assertEquals("X", metaphone.metaphone("SH"));
        assertEquals("FT", metaphone.metaphone("PHOTO"));

        // H before vowel (not after VARSON)
        assertEquals("HTL", metaphone.metaphone("HOTEL"));
        assertEquals("AHT", metaphone.metaphone("AHEAD"));

        // H before consonant (not after VARSON) -> silent
        assertEquals("A", metaphone.metaphone("AHL"));
    }

    @Test
    public void testMetaphone_KHandling() {
        // Initial K
        assertEquals("KNK", metaphone.metaphone("KING"));

        // K after C -> silent
        assertEquals("BK", metaphone.metaphone("BACK"));
        assertEquals("TK", metaphone.metaphone("DUCK"));

        // K not initial and not after C
        assertEquals("MK", metaphone.metaphone("MIKE"));
        assertEquals("BK", metaphone.metaphone("BIKE"));
    }

    @Test
    public void testMetaphone_PHandling() {
        // PH -> F
        assertEquals("FN", metaphone.metaphone("PHONE"));
        assertEquals("KRF", metaphone.metaphone("GRAPH"));

        // Normal P
        assertEquals("PRK", metaphone.metaphone("PARK"));
    }

    @Test
    public void testMetaphone_QHandling() {
        assertEquals("KK", metaphone.metaphone("QUICK"));
    }

    @Test
    public void testMetaphone_SHandling() {
        // SH -> X
        assertEquals("XP", metaphone.metaphone("SHIP"));

        // SIO, SIA -> X
        assertEquals("PXN", metaphone.metaphone("PASSION"));
        assertEquals("MXN", metaphone.metaphone("MISSION"));
        assertEquals("AX", metaphone.metaphone("ASIA"));
        assertEquals("RX", metaphone.metaphone("RUSSIA"));

        // Normal S
        assertEquals("SN", metaphone.metaphone("SUN"));
    }

    @Test
    public void testMetaphone_THandling() {
        // TIA, TIO -> X
        assertEquals("PXNT", metaphone.metaphone("PATIENT"));
        assertEquals("NXN", metaphone.metaphone("NATION"));
        assertEquals("AKXN", metaphone.metaphone("ACTION"));

        // TCH -> silent T
        assertEquals("MX", metaphone.metaphone("MATCH"));
        assertEquals("WX", metaphone.metaphone("WATCH"));

        // TH -> 0
        assertEquals("0T", metaphone.metaphone("THAT"));
        assertEquals("0NK", metaphone.metaphone("THING"));

        // Normal T
        assertEquals("TM", metaphone.metaphone("TIME"));
    }

    @Test
    public void testMetaphone_VHandling() {
        assertEquals("FN", metaphone.metaphone("VAN"));
        assertEquals("FT", metaphone.metaphone("VOTE"));
    }

    @Test
    public void testMetaphone_WYHandling() {
        // W, Y followed by vowel
        assertEquals("WTR", metaphone.metaphone("WATER"));
        assertEquals("YL", metaphone.metaphone("YELLOW"));
        assertEquals("YS", metaphone.metaphone("YES"));

        // W, Y terminal or before consonant -> silent
        assertEquals("STR", metaphone.metaphone("STRAW"));
        assertEquals("TR", metaphone.metaphone("TRY"));
        assertEquals("B", metaphone.metaphone("BY"));
    }

    @Test
    public void testMetaphone_XHandling() {
        assertEquals("TKS", metaphone.metaphone("TAX"));
        assertEquals("EKST", metaphone.metaphone("EXIT"));
        assertEquals("FKS", metaphone.metaphone("FOX"));
    }

    @Test
    public void testMetaphone_ZHandling() {
        assertEquals("SBR", metaphone.metaphone("ZEBRA"));
        assertEquals("BS", metaphone.metaphone("BUZZ"));
    }

    @Test
    public void testMetaphone_LengthTruncation() {
        metaphone.setMaxCodeLen(2);
        assertEquals("KM", metaphone.metaphone("COMMUNICATION"));

        metaphone.setMaxCodeLen(8);
        assertEquals("KMNK", metaphone.metaphone("COMMUNICATION").substring(0, 4));
        assertTrue(metaphone.metaphone("COMMUNICATION").length() <= 8);
    }

    @Test
    public void testEncode_StringMethod() {
        assertEquals("AL", metaphone.encode("HELLO"));
        assertEquals("", metaphone.encode(""));
        assertEquals("", metaphone.encode((String) null));
    }

    @Test
    public void testEncode_ObjectMethod_ValidString() throws EncoderException {
        Object result = metaphone.encode((Object) "WORLD");
        assertNotNull(result);
        assertTrue(result instanceof String);
        assertEquals("WRLT", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncode_ObjectMethod_InvalidType_ThrowsException() throws EncoderException {
        metaphone.encode(Integer.valueOf(12345));
    }

    @Test
    public void testEncode_ObjectMethod_NullObject_ThrowsException() {
        try {
            metaphone.encode((Object) null);
            fail("Expected EncoderException for null object");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Metaphone encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    public void testIsMetaphoneEqual() {
        assertTrue(metaphone.isMetaphoneEqual("Smith", "Smyth"));
        assertTrue(metaphone.isMetaphoneEqual("knight", "night"));
        assertFalse(metaphone.isMetaphoneEqual("Smith", "Jones"));
        assertTrue(metaphone.isMetaphoneEqual("", ""));
        assertTrue(metaphone.isMetaphoneEqual(null, ""));
    }
}
