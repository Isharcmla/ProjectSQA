package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoubleMetaphoneTest {

    private DoubleMetaphone encoder;

    @Before
    public void setUp() {
        encoder = new DoubleMetaphone();
    }

    @Test
    public void testCleanInput_nullAndEmptyAndWhitespace_returnsNull() {
        Assert.assertNull(encoder.doubleMetaphone(null));
        Assert.assertNull(encoder.doubleMetaphone(""));
        Assert.assertNull(encoder.doubleMetaphone("   "));
    }

    @Test
    public void testEncode_objectValidString_returnsEncodedString() throws EncoderException {
        Object result = encoder.encode((Object) "Smith");
        Assert.assertEquals("SM0", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncode_objectNonString_throwsEncoderException() throws EncoderException {
        encoder.encode(12345);
    }

    @Test
    public void testEncode_stringMethod_returnsEncodedString() {
        String result = encoder.encode("Schmidt");
        Assert.assertEquals("XMT", result);
    }

    @Test
    public void testMaxCodeLen_getAndSet() {
        Assert.assertEquals(4, encoder.getMaxCodeLen());
        encoder.setMaxCodeLen(8);
        Assert.assertEquals(8, encoder.getMaxCodeLen());
        encoder.setMaxCodeLen(2);
        Assert.assertEquals(2, encoder.getMaxCodeLen());
    }

    @Test
    public void testIsDoubleMetaphoneEqual_defaultAndAlternate() {
        Assert.assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Schmidt"));
        Assert.assertFalse(encoder.isDoubleMetaphoneEqual("Smith", "Jones"));
        Assert.assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Schmidt", false));
        Assert.assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Schmidt", true));
        Assert.assertFalse(encoder.isDoubleMetaphoneEqual("Smith", "Jones", true));
    }

    @Test
    public void testSilentStarts() {
        Assert.assertEquals("NAS", encoder.doubleMetaphone("GNASH"));
        Assert.assertEquals("NT", encoder.doubleMetaphone("KNIGHT"));
        Assert.assertEquals("NMNS", encoder.doubleMetaphone("PNEUMONIA"));
        Assert.assertEquals("RT", encoder.doubleMetaphone("WRITE"));
        Assert.assertEquals("LM", encoder.doubleMetaphone("PSALM"));
    }

    @Test
    public void testVowels() {
        Assert.assertEquals("A", encoder.doubleMetaphone("A"));
        Assert.assertEquals("A", encoder.doubleMetaphone("E"));
        Assert.assertEquals("A", encoder.doubleMetaphone("I"));
        Assert.assertEquals("A", encoder.doubleMetaphone("O"));
        Assert.assertEquals("A", encoder.doubleMetaphone("U"));
        Assert.assertEquals("A", encoder.doubleMetaphone("Y"));
        Assert.assertEquals("AP", encoder.doubleMetaphone("APPLE"));
    }

    @Test
    public void testB() {
        Assert.assertEquals("P", encoder.doubleMetaphone("B"));
        Assert.assertEquals("P", encoder.doubleMetaphone("BB"));
        Assert.assertEquals("PB", encoder.doubleMetaphone("BAB"));
    }

    @Test
    public void testCedilla() {
        Assert.assertEquals("S", encoder.doubleMetaphone("\u00C7"));
        Assert.assertEquals("SA", encoder.doubleMetaphone("\u00C7A"));
    }

    @Test
    public void testC_conditions() {
        Assert.assertEquals("K", encoder.doubleMetaphone("CHIA"));
        Assert.assertEquals("PKR", encoder.doubleMetaphone("BACHER"));
        Assert.assertEquals("MKR", encoder.doubleMetaphone("MACHER"));
        Assert.assertEquals("AX", encoder.doubleMetaphone("ACHI"));
        Assert.assertEquals("SSR", encoder.doubleMetaphone("CAESAR"));

        Assert.assertEquals("S", encoder.doubleMetaphone("CZERNY", false));
        Assert.assertEquals("X", encoder.doubleMetaphone("CZERNY", true));
        Assert.assertEquals("VTS", encoder.doubleMetaphone("WICZ"));

        Assert.assertEquals("FKX", encoder.doubleMetaphone("FOCACCIA"));

        Assert.assertEquals("MKLN", encoder.doubleMetaphone("MCCLELLAND"));
        Assert.assertEquals("KS", encoder.doubleMetaphone("ACCIDENT"));
        Assert.assertEquals("SKS", encoder.doubleMetaphone("SUCCEED"));
        Assert.assertEquals("PKS", encoder.doubleMetaphone("BACCHUS"));
        Assert.assertEquals("PX", encoder.doubleMetaphone("BACCI"));
        Assert.assertEquals("PRTK", encoder.doubleMetaphone("BERTUCCIO"));

        Assert.assertEquals("K", encoder.doubleMetaphone("CK"));
        Assert.assertEquals("K", encoder.doubleMetaphone("CG"));
        Assert.assertEquals("K", encoder.doubleMetaphone("CQ"));

        Assert.assertEquals("S", encoder.doubleMetaphone("CIOC", false));
        Assert.assertEquals("X", encoder.doubleMetaphone("CIOC", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("CIEL", false));
        Assert.assertEquals("X", encoder.doubleMetaphone("CIEL", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("CIAL", false));
        Assert.assertEquals("X", encoder.doubleMetaphone("CIAL", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("CITY"));
        Assert.assertEquals("S", encoder.doubleMetaphone("CENT"));
        Assert.assertEquals("S", encoder.doubleMetaphone("CYL"));

        Assert.assertEquals("MKFR", encoder.doubleMetaphone("MAC CAFFREY"));
        Assert.assertEquals("MK", encoder.doubleMetaphone("MAC Q"));
        Assert.assertEquals("MKRK", encoder.doubleMetaphone("MAC GREGOR"));
        Assert.assertEquals("KK", encoder.doubleMetaphone("MCKEE"));
        Assert.assertEquals("K", encoder.doubleMetaphone("CAT"));
    }

    @Test
    public void testCH_conditions() {
        Assert.assertEquals("MKL", encoder.doubleMetaphone("MICHAEL", false));
        Assert.assertEquals("MXL", encoder.doubleMetaphone("MICHAEL", true));

        Assert.assertEquals("KRKT", encoder.doubleMetaphone("CHARACTER"));
        Assert.assertEquals("KRS", encoder.doubleMetaphone("CHARIS"));
        Assert.assertEquals("KR", encoder.doubleMetaphone("CHORUS"));
        Assert.assertEquals("KM", encoder.doubleMetaphone("CHYME"));
        Assert.assertEquals("K", encoder.doubleMetaphone("CHIA"));
        Assert.assertEquals("KMST", encoder.doubleMetaphone("CHEMIST"));
        Assert.assertEquals("XR", encoder.doubleMetaphone("CHORE"));

        Assert.assertEquals("FNK", encoder.doubleMetaphone("VON CH"));
        Assert.assertEquals("X", encoder.doubleMetaphone("SCHCH"));
        Assert.assertEquals("ARKS", encoder.doubleMetaphone("ORCHESTRA"));
        Assert.assertEquals("ARKT", encoder.doubleMetaphone("ARCHITECT"));
        Assert.assertEquals("ARKT", encoder.doubleMetaphone("ORCHID"));
        Assert.assertEquals("XTS", encoder.doubleMetaphone("CHTS"));
        Assert.assertEquals("AKL", encoder.doubleMetaphone("ACHL"));

        Assert.assertEquals("MK", encoder.doubleMetaphone("MCCH"));
        Assert.assertEquals("X", encoder.doubleMetaphone("ACH", false));
        Assert.assertEquals("K", encoder.doubleMetaphone("ACH", true));
        Assert.assertEquals("X", encoder.doubleMetaphone("CHAIR"));
    }

    @Test
    public void testD() {
        Assert.assertEquals("J", encoder.doubleMetaphone("EDGE"));
        Assert.assertEquals("TK", encoder.doubleMetaphone("EDGAR"));
        Assert.assertEquals("T", encoder.doubleMetaphone("DT"));
        Assert.assertEquals("T", encoder.doubleMetaphone("DD"));
        Assert.assertEquals("T", encoder.doubleMetaphone("DOG"));
    }

    @Test
    public void testG_and_GH() {
        Assert.assertEquals("K", encoder.doubleMetaphone("GH", false));
        Assert.assertEquals("J", encoder.doubleMetaphone("GHI"));
        Assert.assertEquals("K", encoder.doubleMetaphone("GHA"));
        Assert.assertEquals("A", encoder.doubleMetaphone("AGH"));
        Assert.assertEquals("H", encoder.doubleMetaphone("HUGH"));
        Assert.assertEquals("TF", encoder.doubleMetaphone("TOUGH"));
        Assert.assertEquals("LF", encoder.doubleMetaphone("LAUGH"));
        Assert.assertEquals("KLF", encoder.doubleMetaphone("MCLAUGHLIN"));
        Assert.assertEquals("KF", encoder.doubleMetaphone("COUGH"));
        Assert.assertEquals("KF", encoder.doubleMetaphone("GOUGH"));
        Assert.assertEquals("RF", encoder.doubleMetaphone("ROUGH"));
        Assert.assertEquals("K", encoder.doubleMetaphone("NIGHT"));
        Assert.assertEquals("K", encoder.doubleMetaphone("AG"));

        Assert.assertEquals("KN", encoder.doubleMetaphone("AGNES", false));
        Assert.assertEquals("N", encoder.doubleMetaphone("AGNES", true));
        Assert.assertEquals("N", encoder.doubleMetaphone("GNAT", false));
        Assert.assertEquals("KN", encoder.doubleMetaphone("GNAT", true));
        Assert.assertEquals("KN", encoder.doubleMetaphone("GNEY"));
        Assert.assertEquals("KN", encoder.doubleMetaphone("GNOK"));

        Assert.assertEquals("KL", encoder.doubleMetaphone("TAGLI", false));
        Assert.assertEquals("L", encoder.doubleMetaphone("TAGLI", true));
        Assert.assertEquals("KL", encoder.doubleMetaphone("KLINKER"));

        Assert.assertEquals("K", encoder.doubleMetaphone("GY", false));
        Assert.assertEquals("J", encoder.doubleMetaphone("GY", true));
        Assert.assertEquals("K", encoder.doubleMetaphone("GES", false));
        Assert.assertEquals("J", encoder.doubleMetaphone("GES", true));
        Assert.assertEquals("K", encoder.doubleMetaphone("GEP", false));
        Assert.assertEquals("K", encoder.doubleMetaphone("GEL", false));
        Assert.assertEquals("K", encoder.doubleMetaphone("GIE", false));
        Assert.assertEquals("K", encoder.doubleMetaphone("GER", false));
        Assert.assertEquals("K", encoder.doubleMetaphone("GIB", false));
        Assert.assertEquals("K", encoder.doubleMetaphone("GIL", false));
        Assert.assertEquals("K", encoder.doubleMetaphone("GIN", false));
        Assert.assertEquals("K", encoder.doubleMetaphone("GEI", false));

        Assert.assertEquals("TNKR", encoder.doubleMetaphone("DANGER"));
        Assert.assertEquals("RNKR", encoder.doubleMetaphone("RANGER"));
        Assert.assertEquals("MNKR", encoder.doubleMetaphone("MANGER"));
        Assert.assertEquals("AKR", encoder.doubleMetaphone("EGER"));
        Assert.assertEquals("AKR", encoder.doubleMetaphone("IGER"));
        Assert.assertEquals("ARJ", encoder.doubleMetaphone("ORGY"));
        Assert.assertEquals("AJ", encoder.doubleMetaphone("OGY"));
        Assert.assertEquals("K", encoder.doubleMetaphone("ANGER", false));
        Assert.assertEquals("J", encoder.doubleMetaphone("ANGER", true));

        Assert.assertEquals("FNK", encoder.doubleMetaphone("VAN GE"));
        Assert.assertEquals("FNK", encoder.doubleMetaphone("VON GE"));
        Assert.assertEquals("XK", encoder.doubleMetaphone("SCHGE"));
        Assert.assertEquals("KT", encoder.doubleMetaphone("GET"));
        Assert.assertEquals("J", encoder.doubleMetaphone("GIER"));
        Assert.assertEquals("J", encoder.doubleMetaphone("GEL", true));
        Assert.assertEquals("PJ", encoder.doubleMetaphone("BIAGGI", false));
        Assert.assertEquals("PK", encoder.doubleMetaphone("BIAGGI", true));
        Assert.assertEquals("K", encoder.doubleMetaphone("EGG"));
        Assert.assertEquals("K", encoder.doubleMetaphone("G"));
    }

    @Test
    public void testH() {
        Assert.assertEquals("H", encoder.doubleMetaphone("HA"));
        Assert.assertEquals("AH", encoder.doubleMetaphone("AHA"));
        Assert.assertEquals("", encoder.doubleMetaphone("H"));
        Assert.assertEquals("", encoder.doubleMetaphone("AH"));
    }

    @Test
    public void testJ() {
        Assert.assertEquals("HS", encoder.doubleMetaphone("JOSE"));
        Assert.assertEquals("HS", encoder.doubleMetaphone("JOSEPH"));
        Assert.assertEquals("SNHS", encoder.doubleMetaphone("SAN JOSE"));
        Assert.assertEquals("J", encoder.doubleMetaphone("JOS", false));
        Assert.assertEquals("A", encoder.doubleMetaphone("JOS", true));
        Assert.assertEquals("AJH", encoder.doubleMetaphone("AJA", false));
        Assert.assertEquals("A", encoder.doubleMetaphone("AJA", true));
        Assert.assertEquals("AJ", encoder.doubleMetaphone("AJ", false));
        Assert.assertEquals("A ", encoder.doubleMetaphone("AJ", true));
        Assert.assertEquals("AJ", encoder.doubleMetaphone("AJAX"));
        Assert.assertEquals("J", encoder.doubleMetaphone("JJ"));
    }

    @Test
    public void testL() {
        Assert.assertEquals("L", encoder.doubleMetaphone("CABRILLO", false));
        Assert.assertEquals("", encoder.doubleMetaphone("CABRILLO", true));
        Assert.assertEquals("L", encoder.doubleMetaphone("VILLA", false));
        Assert.assertEquals("", encoder.doubleMetaphone("VILLA", true));
        Assert.assertEquals("AL", encoder.doubleMetaphone("ALLE"));
        Assert.assertEquals("AL", encoder.doubleMetaphone("ALLA"));
        Assert.assertEquals("AL", encoder.doubleMetaphone("ALLO"));
        Assert.assertEquals("L", encoder.doubleMetaphone("ALL"));
        Assert.assertEquals("L", encoder.doubleMetaphone("L"));
    }

    @Test
    public void testM() {
        Assert.assertEquals("M", encoder.doubleMetaphone("MM"));
        Assert.assertEquals("TM", encoder.doubleMetaphone("THUMB"));
        Assert.assertEquals("TMR", encoder.doubleMetaphone("THUMBER"));
        Assert.assertEquals("M", encoder.doubleMetaphone("M"));
    }

    @Test
    public void testN() {
        Assert.assertEquals("N", encoder.doubleMetaphone("NN"));
        Assert.assertEquals("N", encoder.doubleMetaphone("\u00D1"));
        Assert.assertEquals("N", encoder.doubleMetaphone("N"));
    }

    @Test
    public void testP() {
        Assert.assertEquals("F", encoder.doubleMetaphone("PHONE"));
        Assert.assertEquals("P", encoder.doubleMetaphone("PP"));
        Assert.assertEquals("P", encoder.doubleMetaphone("PB"));
        Assert.assertEquals("P", encoder.doubleMetaphone("P"));
    }

    @Test
    public void testQ() {
        Assert.assertEquals("K", encoder.doubleMetaphone("QQ"));
        Assert.assertEquals("K", encoder.doubleMetaphone("Q"));
    }

    @Test
    public void testR() {
        Assert.assertEquals("", encoder.doubleMetaphone("PIER", false));
        Assert.assertEquals("R", encoder.doubleMetaphone("PIER", true));
        Assert.assertEquals("MR", encoder.doubleMetaphone("MIER"));
        Assert.assertEquals("MR", encoder.doubleMetaphone("MAIER"));
        Assert.assertEquals("R", encoder.doubleMetaphone("RR"));
        Assert.assertEquals("R", encoder.doubleMetaphone("R"));
    }

    @Test
    public void testS_and_SC() {
        Assert.assertEquals("ALNT", encoder.doubleMetaphone("ISLAND"));
        Assert.assertEquals("ALNT", encoder.doubleMetaphone("YSLAND"));
        Assert.assertEquals("XKR", encoder.doubleMetaphone("SUGAR", false));
        Assert.assertEquals("SKR", encoder.doubleMetaphone("SUGAR", true));
        Assert.assertEquals("SM", encoder.doubleMetaphone("SHEIM"));
        Assert.assertEquals("SK", encoder.doubleMetaphone("SHOEK"));
        Assert.assertEquals("SLM", encoder.doubleMetaphone("SHOLM"));
        Assert.assertEquals("SLS", encoder.doubleMetaphone("SHOLZ"));
        Assert.assertEquals("X", encoder.doubleMetaphone("SH"));
        Assert.assertEquals("S", encoder.doubleMetaphone("SIO", false));
        Assert.assertEquals("X", encoder.doubleMetaphone("SIO", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("SIAN", false));
        Assert.assertEquals("S", encoder.doubleMetaphone("WSIO"));

        Assert.assertEquals("SM", encoder.doubleMetaphone("SMITH", false));
        Assert.assertEquals("XM", encoder.doubleMetaphone("SMITH", true));
        Assert.assertEquals("SNTR", encoder.doubleMetaphone("SNIDER", false));
        Assert.assertEquals("XNTR", encoder.doubleMetaphone("SNIDER", true));
        Assert.assertEquals("SLTR", encoder.doubleMetaphone("SLATER", false));
        Assert.assertEquals("XLTR", encoder.doubleMetaphone("SLATER", true));
        Assert.assertEquals("SWTR", encoder.doubleMetaphone("SWITER", false));
        Assert.assertEquals("XWTR", encoder.doubleMetaphone("SWITER", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("SZ", false));
        Assert.assertEquals("X", encoder.doubleMetaphone("SZ", true));

        Assert.assertEquals("SKL", encoder.doubleMetaphone("SCHOOL"));
        Assert.assertEquals("SKNR", encoder.doubleMetaphone("SCHOONER"));
        Assert.assertEquals("XRM", encoder.doubleMetaphone("SCHERMERHORN", false));
        Assert.assertEquals("SKRM", encoder.doubleMetaphone("SCHERMERHORN", true));
        Assert.assertEquals("XNK", encoder.doubleMetaphone("SCHENKER", false));
        Assert.assertEquals("SKNK", encoder.doubleMetaphone("SCHENKER", true));
        Assert.assertEquals("SKT", encoder.doubleMetaphone("SCHED"));
        Assert.assertEquals("SKM", encoder.doubleMetaphone("SCHEM"));
        Assert.assertEquals("SK", encoder.doubleMetaphone("SCHUY"));
        Assert.assertEquals("XT", encoder.doubleMetaphone("SCHT", false));
        Assert.assertEquals("ST", encoder.doubleMetaphone("SCHT", true));
        Assert.assertEquals("XW", encoder.doubleMetaphone("SCHW"));
        Assert.assertEquals("X", encoder.doubleMetaphone("SCHA"));
        Assert.assertEquals("S", encoder.doubleMetaphone("SCIENCE"));
        Assert.assertEquals("SK", encoder.doubleMetaphone("SCREAM"));

        Assert.assertEquals("", encoder.doubleMetaphone("AI", false));
        Assert.assertEquals("", encoder.doubleMetaphone("AIS", false));
        Assert.assertEquals("S", encoder.doubleMetaphone("AIS", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("OIS", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("SS"));
        Assert.assertEquals("S", encoder.doubleMetaphone("S"));
    }

    @Test
    public void testT() {
        Assert.assertEquals("XN", encoder.doubleMetaphone("TION"));
        Assert.assertEquals("X", encoder.doubleMetaphone("TIA"));
        Assert.assertEquals("X", encoder.doubleMetaphone("TCH"));
        Assert.assertEquals("TM", encoder.doubleMetaphone("THOMAS"));
        Assert.assertEquals("TM", encoder.doubleMetaphone("THAMES"));
        Assert.assertEquals("FNT", encoder.doubleMetaphone("VAN TH"));
        Assert.assertEquals("FNT", encoder.doubleMetaphone("VON TH"));
        Assert.assertEquals("XT", encoder.doubleMetaphone("SCHTH"));
        Assert.assertEquals("0", encoder.doubleMetaphone("TH", false));
        Assert.assertEquals("T", encoder.doubleMetaphone("TH", true));
        Assert.assertEquals("0", encoder.doubleMetaphone("TTH", false));
        Assert.assertEquals("T", encoder.doubleMetaphone("TT"));
        Assert.assertEquals("T", encoder.doubleMetaphone("TD"));
        Assert.assertEquals("T", encoder.doubleMetaphone("T"));
    }

    @Test
    public void testV() {
        Assert.assertEquals("F", encoder.doubleMetaphone("VV"));
        Assert.assertEquals("F", encoder.doubleMetaphone("V"));
    }

    @Test
    public void testW() {
        Assert.assertEquals("R", encoder.doubleMetaphone("WR"));
        Assert.assertEquals("R", encoder.doubleMetaphone("AWR"));
        Assert.assertEquals("A", encoder.doubleMetaphone("WASSERMAN", false));
        Assert.assertEquals("F", encoder.doubleMetaphone("WASSERMAN", true));
        Assert.assertEquals("A", encoder.doubleMetaphone("WHITE"));
        Assert.assertEquals("", encoder.doubleMetaphone("ARNOW", false));
        Assert.assertEquals("F", encoder.doubleMetaphone("ARNOW", true));
        Assert.assertEquals("", encoder.doubleMetaphone("EWSKI", false));
        Assert.assertEquals("F", encoder.doubleMetaphone("EWSKI", true));
        Assert.assertEquals("", encoder.doubleMetaphone("EWSKY", false));
        Assert.assertEquals("F", encoder.doubleMetaphone("EWSKY", true));
        Assert.assertEquals("", encoder.doubleMetaphone("OWSKI", false));
        Assert.assertEquals("F", encoder.doubleMetaphone("OWSKI", true));
        Assert.assertEquals("", encoder.doubleMetaphone("OWSKY", false));
        Assert.assertEquals("F", encoder.doubleMetaphone("OWSKY", true));
        Assert.assertEquals("X", encoder.doubleMetaphone("SCHW", false));
        Assert.assertEquals("XF", encoder.doubleMetaphone("SCHW", true));
        Assert.assertEquals("TS", encoder.doubleMetaphone("WICZ", false));
        Assert.assertEquals("FX", encoder.doubleMetaphone("WICZ", true));
        Assert.assertEquals("TS", encoder.doubleMetaphone("WITZ", false));
        Assert.assertEquals("FX", encoder.doubleMetaphone("WITZ", true));
        Assert.assertEquals("", encoder.doubleMetaphone("W"));
    }

    @Test
    public void testX() {
        Assert.assertEquals("S", encoder.doubleMetaphone("X"));
        Assert.assertEquals("S", encoder.doubleMetaphone("XRAY"));
        Assert.assertEquals("PR", encoder.doubleMetaphone("BREAUX"));
        Assert.assertEquals("PR", encoder.doubleMetaphone("BRIAUX"));
        Assert.assertEquals("PR", encoder.doubleMetaphone("BRAUX"));
        Assert.assertEquals("PR", encoder.doubleMetaphone("BROUX"));
        Assert.assertEquals("AKS", encoder.doubleMetaphone("AX"));
        Assert.assertEquals("AKS", encoder.doubleMetaphone("AXC"));
        Assert.assertEquals("AKS", encoder.doubleMetaphone("AXX"));
    }

    @Test
    public void testZ() {
        Assert.assertEquals("J", encoder.doubleMetaphone("ZHAO"));
        Assert.assertEquals("S", encoder.doubleMetaphone("ZO", false));
        Assert.assertEquals("TS", encoder.doubleMetaphone("ZO", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("ZI", false));
        Assert.assertEquals("TS", encoder.doubleMetaphone("ZI", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("ZA", false));
        Assert.assertEquals("TS", encoder.doubleMetaphone("ZA", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("WZO", false));
        Assert.assertEquals("TS", encoder.doubleMetaphone("WZO", true));
        Assert.assertEquals("TS", encoder.doubleMetaphone("TZ", false));
        Assert.assertEquals("S", encoder.doubleMetaphone("ZZ"));
        Assert.assertEquals("S", encoder.doubleMetaphone("Z"));
    }

    @Test
    public void testDefaultBranchAndNonLetters() {
        Assert.assertEquals("A", encoder.doubleMetaphone("A123"));
        Assert.assertEquals("", encoder.doubleMetaphone("123"));
    }

    @Test
    public void testDoubleMetaphoneResult_appendOperations() {
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(4);
        Assert.assertEquals("", result.getPrimary());
        Assert.assertEquals("", result.getAlternate());
        Assert.assertFalse(result.isComplete());

        result.append('A');
        Assert.assertEquals("A", result.getPrimary());
        Assert.assertEquals("A", result.getAlternate());

        result.append('B', 'C');
        Assert.assertEquals("AB", result.getPrimary());
        Assert.assertEquals("AC", result.getAlternate());

        result.append("DE");
        Assert.assertEquals("ABDE", result.getPrimary());
        Assert.assertEquals("ACDE", result.getAlternate());
        Assert.assertTrue(result.isComplete());

        result.append("FG", "HI");
        Assert.assertEquals("ABDE", result.getPrimary());
        Assert.assertEquals("ACDE", result.getAlternate());
    }

    @Test
    public void testDoubleMetaphoneResult_appendStringTruncation() {
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(3);
        result.appendPrimary("ABCD");
        result.appendAlternate("EFGH");
        Assert.assertEquals("ABC", result.getPrimary());
        Assert.assertEquals("EFG", result.getAlternate());
        Assert.assertTrue(result.isComplete());
    }

    @Test
    public void testCharAt_outOfBounds() {
        Assert.assertEquals(Character.MIN_VALUE, encoder.charAt("TEST", -1));
        Assert.assertEquals(Character.MIN_VALUE, encoder.charAt("TEST", 4));
        Assert.assertEquals('T', encoder.charAt("TEST", 0));
    }

    @Test
    public void testContains_outOfBoundsAndCriteria() {
        Assert.assertFalse(DoubleMetaphone.contains("TEST", -1, 2, "TE"));
        Assert.assertFalse(DoubleMetaphone.contains("TEST", 3, 2, "ST"));
        Assert.assertTrue(DoubleMetaphone.contains("TEST", 0, 2, "TE", "ES"));
        Assert.assertFalse(DoubleMetaphone.contains("TEST", 0, 2, "ES", "ST"));
    }
}
