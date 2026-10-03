package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoubleMetaphoneTest {

    private DoubleMetaphone encoder;

    @Before
    public void setUp() {
        this.encoder = new DoubleMetaphone();
    }

    @Test
    public void testCleanInput_nullOrBlank_returnsNull() {
        Assert.assertNull(encoder.doubleMetaphone(null));
        Assert.assertNull(encoder.doubleMetaphone(""));
        Assert.assertNull(encoder.doubleMetaphone("   "));
        Assert.assertNull(encoder.doubleMetaphone(null, true));
        Assert.assertNull(encoder.doubleMetaphone("", true));
    }

    @Test
    public void testEncode_objectValidString_returnsEncodedString() throws EncoderException {
        Object result = encoder.encode((Object) "Testing");
        Assert.assertEquals("TSTN", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncode_objectNonString_throwsEncoderException() throws EncoderException {
        encoder.encode(Integer.valueOf(12345));
    }

    @Test
    public void testEncode_string_returnsDoubleMetaphone() {
        Assert.assertEquals("TSTN", encoder.encode("Testing"));
        Assert.assertNull(encoder.encode((String) null));
    }

    @Test
    public void testIsDoubleMetaphoneEqual_primaryComparison() {
        Assert.assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Schmidt"));
        Assert.assertFalse(encoder.isDoubleMetaphoneEqual("Smith", "Water"));
    }

    @Test
    public void testIsDoubleMetaphoneEqual_alternateComparison() {
        Assert.assertTrue(encoder.isDoubleMetaphoneEqual("Schmidt", "Smith", true));
        Assert.assertFalse(encoder.isDoubleMetaphoneEqual("Smith", "Jones", true));
    }

    @Test
    public void testMaxCodeLen_getterAndSetter() {
        Assert.assertEquals(4, encoder.getMaxCodeLen());
        encoder.setMaxCodeLen(6);
        Assert.assertEquals(6, encoder.getMaxCodeLen());
        Assert.assertEquals("TSTNKK", encoder.doubleMetaphone("Testingcock"));
        encoder.setMaxCodeLen(2);
        Assert.assertEquals(2, encoder.getMaxCodeLen());
        Assert.assertEquals("TS", encoder.doubleMetaphone("Testingcock"));
    }

    @Test
    public void testCharAt_edgeCases() {
        Assert.assertEquals(Character.MIN_VALUE, encoder.charAt("TEST", -1));
        Assert.assertEquals(Character.MIN_VALUE, encoder.charAt("TEST", 4));
        Assert.assertEquals(Character.MIN_VALUE, encoder.charAt("TEST", 10));
        Assert.assertEquals('E', encoder.charAt("TEST", 1));
    }

    @Test
    public void testContains_variationsAndBounds() {
        Assert.assertFalse(DoubleMetaphone.contains("TEST", -1, 2, new String[]{"TE"}));
        Assert.assertFalse(DoubleMetaphone.contains("TEST", 3, 2, new String[]{"ST"}));
        Assert.assertTrue(DoubleMetaphone.contains("TEST", 0, 2, new String[]{"TE"}));
        Assert.assertFalse(DoubleMetaphone.contains("TEST", 0, 2, new String[]{"ES"}));
    }

    @Test
    public void testSilentStarts() {
        Assert.assertEquals("NT", encoder.doubleMetaphone("GNAT"));
        Assert.assertEquals("NT", encoder.doubleMetaphone("KNIGHT"));
        Assert.assertEquals("NM", encoder.doubleMetaphone("PNEUMONIA"));
        Assert.assertEquals("RT", encoder.doubleMetaphone("WRITE"));
        Assert.assertEquals("SLM", encoder.doubleMetaphone("PSALM"));
    }

    @Test
    public void testVowels() {
        Assert.assertEquals("A", encoder.doubleMetaphone("A"));
        Assert.assertEquals("A", encoder.doubleMetaphone("E"));
        Assert.assertEquals("A", encoder.doubleMetaphone("I"));
        Assert.assertEquals("A", encoder.doubleMetaphone("O"));
        Assert.assertEquals("A", encoder.doubleMetaphone("U"));
        Assert.assertEquals("A", encoder.doubleMetaphone("Y"));
        Assert.assertEquals("APL", encoder.doubleMetaphone("APPLE"));
        Assert.assertEquals("BA", encoder.doubleMetaphone("BAY"));
    }

    @Test
    public void testCedillaC() {
        Assert.assertEquals("S", encoder.doubleMetaphone("\u00C7"));
        Assert.assertEquals("SA", encoder.doubleMetaphone("\u00C7A"));
    }

    @Test
    public void testLetterB() {
        Assert.assertEquals("P", encoder.doubleMetaphone("B"));
        Assert.assertEquals("P", encoder.doubleMetaphone("BB"));
        Assert.assertEquals("PB", encoder.doubleMetaphone("BABY"));
    }

    @Test
    public void testLetterC_conditionC0() {
        Assert.assertEquals("K", encoder.doubleMetaphone("CHIA"));
        Assert.assertEquals("PKR", encoder.doubleMetaphone("BACHER"));
        Assert.assertEquals("MKR", encoder.doubleMetaphone("MACHER"));
        Assert.assertEquals("AKTN", encoder.doubleMetaphone("ACHTUNG"));
        Assert.assertEquals("AK", encoder.doubleMetaphone("ACH"));
        Assert.assertEquals("AX", encoder.doubleMetaphone("ACHI"));
    }

    @Test
    public void testLetterC_caesarAndCzAndCia() {
        Assert.assertEquals("SSR", encoder.doubleMetaphone("CAESAR"));
        Assert.assertEquals("SRN", encoder.doubleMetaphone("CZERNY", false));
        Assert.assertEquals("XRN", encoder.doubleMetaphone("CZERNY", true));
        Assert.assertEquals("FKX", encoder.doubleMetaphone("FOCACCIA"));
    }

    @Test
    public void testLetterC_doubleCC() {
        Assert.assertEquals("AKST", encoder.doubleMetaphone("ACCIDENT"));
        Assert.assertEquals("AKST", encoder.doubleMetaphone("ACCEDE"));
        Assert.assertEquals("SKST", encoder.doubleMetaphone("SUCCEED"));
        Assert.assertEquals("PX", encoder.doubleMetaphone("BACCI"));
        Assert.assertEquals("PRTX", encoder.doubleMetaphone("BERTUCCI"));
        Assert.assertEquals("MKLNT", encoder.doubleMetaphone("MCCLELLAND"));
        Assert.assertEquals("PKS", encoder.doubleMetaphone("BACCHUS"));
        Assert.assertEquals("PLK", encoder.doubleMetaphone("BELLOCCHIO"));
    }

    @Test
    public void testLetterC_otherPatterns() {
        Assert.assertEquals("K", encoder.doubleMetaphone("CK"));
        Assert.assertEquals("K", encoder.doubleMetaphone("CG"));
        Assert.assertEquals("K", encoder.doubleMetaphone("CQ"));
        Assert.assertEquals("S", encoder.doubleMetaphone("CIO", false));
        Assert.assertEquals("X", encoder.doubleMetaphone("CIO", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("CIE", false));
        Assert.assertEquals("X", encoder.doubleMetaphone("CIE", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("CIA", false));
        Assert.assertEquals("X", encoder.doubleMetaphone("CIA", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("CENT"));
        Assert.assertEquals("S", encoder.doubleMetaphone("CITY"));
        Assert.assertEquals("S", encoder.doubleMetaphone("CYST"));
        Assert.assertEquals("MKFR", encoder.doubleMetaphone("MAC CAFFREY"));
        Assert.assertEquals("MKRK", encoder.doubleMetaphone("MAC GREGOR"));
        Assert.assertEquals("MK", encoder.doubleMetaphone("MCKAY"));
        Assert.assertEquals("KT", encoder.doubleMetaphone("CAT"));
    }

    @Test
    public void testLetterCH() {
        Assert.assertEquals("MKL", encoder.doubleMetaphone("MICHAEL", false));
        Assert.assertEquals("MXL", encoder.doubleMetaphone("MICHAEL", true));
        Assert.assertEquals("KMST", encoder.doubleMetaphone("CHEMISTRY"));
        Assert.assertEquals("KRS", encoder.doubleMetaphone("CHORUS"));
        Assert.assertEquals("XR", encoder.doubleMetaphone("CHORE"));
        Assert.assertEquals("ARKT", encoder.doubleMetaphone("ARCHITECT"));
        Assert.assertEquals("ARKT", encoder.doubleMetaphone("ORCHESTRA"));
        Assert.assertEquals("ARKT", encoder.doubleMetaphone("ORCHID"));
        Assert.assertEquals("FK", encoder.doubleMetaphone("VON CH"));
        Assert.assertEquals("SK", encoder.doubleMetaphone("SCH"));
        Assert.assertEquals("KTS", encoder.doubleMetaphone("CHTS"));
        Assert.assertEquals("MK", encoder.doubleMetaphone("MCCH"));
        Assert.assertEquals("PX", encoder.doubleMetaphone("BACH", false));
        Assert.assertEquals("PK", encoder.doubleMetaphone("BACH", true));
        Assert.assertEquals("X", encoder.doubleMetaphone("CHIP"));
    }

    @Test
    public void testLetterD() {
        Assert.assertEquals("J", encoder.doubleMetaphone("EDGE"));
        Assert.assertEquals("J", encoder.doubleMetaphone("EDGY"));
        Assert.assertEquals("ATKR", encoder.doubleMetaphone("EDGAR"));
        Assert.assertEquals("TT", encoder.doubleMetaphone("DT"));
        Assert.assertEquals("T", encoder.doubleMetaphone("DD"));
        Assert.assertEquals("TK", encoder.doubleMetaphone("DOG"));
    }

    @Test
    public void testLetterF() {
        Assert.assertEquals("F", encoder.doubleMetaphone("F"));
        Assert.assertEquals("F", encoder.doubleMetaphone("FF"));
        Assert.assertEquals("FR", encoder.doubleMetaphone("FROG"));
    }

    @Test
    public void testLetterG_ghPatterns() {
        Assert.assertEquals("KL", encoder.doubleMetaphone("GH"));
        Assert.assertEquals("J", encoder.doubleMetaphone("GHI"));
        Assert.assertEquals("K", encoder.doubleMetaphone("GHOST"));
        Assert.assertEquals("PRKF", encoder.doubleMetaphone("BERGHOF"));
        Assert.assertEquals("H", encoder.doubleMetaphone("HUGH"));
        Assert.assertEquals("P", encoder.doubleMetaphone("BGH"));
        Assert.assertEquals("T", encoder.doubleMetaphone("DGH"));
        Assert.assertEquals("LF", encoder.doubleMetaphone("LAUGH"));
        Assert.assertEquals("KF", encoder.doubleMetaphone("COUGH"));
        Assert.assertEquals("RF", encoder.doubleMetaphone("ROUGH"));
        Assert.assertEquals("TF", encoder.doubleMetaphone("TOUGH"));
        Assert.assertEquals("KF", encoder.doubleMetaphone("GOUGH"));
        Assert.assertEquals("MKLF", encoder.doubleMetaphone("MCLAUGHLIN"));
        Assert.assertEquals("NT", encoder.doubleMetaphone("NIGHT"));
        Assert.assertEquals("PK", encoder.doubleMetaphone("BOGH"));
    }

    @Test
    public void testLetterG_gnPatterns() {
        Assert.assertEquals("KN", encoder.doubleMetaphone("AGNES", false));
        Assert.assertEquals("N", encoder.doubleMetaphone("AGNES", true));
        Assert.assertEquals("N", encoder.doubleMetaphone("GNEISS", false));
        Assert.assertEquals("KN", encoder.doubleMetaphone("GNEISS", true));
        Assert.assertEquals("AKN", encoder.doubleMetaphone("WAGNER", false));
        Assert.assertEquals("AKN", encoder.doubleMetaphone("WAGNER", true));
    }

    @Test
    public void testLetterG_gliAndPrefixPatterns() {
        Assert.assertEquals("TKL", encoder.doubleMetaphone("TAGLI", false));
        Assert.assertEquals("TL", encoder.doubleMetaphone("TAGLI", true));
        Assert.assertEquals("K", encoder.doubleMetaphone("GES", false));
        Assert.assertEquals("J", encoder.doubleMetaphone("GES", true));
        Assert.assertEquals("K", encoder.doubleMetaphone("GEP", false));
        Assert.assertEquals("J", encoder.doubleMetaphone("GEP", true));
        Assert.assertEquals("KL", encoder.doubleMetaphone("GEL", false));
        Assert.assertEquals("JL", encoder.doubleMetaphone("GEL", true));
        Assert.assertEquals("K", encoder.doubleMetaphone("GIE", false));
        Assert.assertEquals("J", encoder.doubleMetaphone("GIE", true));
        Assert.assertEquals("K", encoder.doubleMetaphone("GYM", false));
        Assert.assertEquals("J", encoder.doubleMetaphone("GYM", true));
        Assert.assertEquals("AKR", encoder.doubleMetaphone("AGER", false));
        Assert.assertEquals("AJR", encoder.doubleMetaphone("AGER", true));
        Assert.assertEquals("KPS", encoder.doubleMetaphone("GYPSY", false));
        Assert.assertEquals("JPS", encoder.doubleMetaphone("GYPSY", true));
        Assert.assertEquals("TNJR", encoder.doubleMetaphone("DANGER"));
        Assert.assertEquals("RNJR", encoder.doubleMetaphone("RANGER"));
        Assert.assertEquals("MNJR", encoder.doubleMetaphone("MANGER"));
        Assert.assertEquals("ANRJ", encoder.doubleMetaphone("ENERGY"));
        Assert.assertEquals("PLJ", encoder.doubleMetaphone("BIOLOGY"));
    }

    @Test
    public void testLetterG_otherPatterns() {
        Assert.assertEquals("FKT", encoder.doubleMetaphone("VAN GET"));
        Assert.assertEquals("SKT", encoder.doubleMetaphone("SCHGET"));
        Assert.assertEquals("KT", encoder.doubleMetaphone("GET"));
        Assert.assertEquals("AJR", encoder.doubleMetaphone("ANGIER"));
        Assert.assertEquals("PJ", encoder.doubleMetaphone("BIAGGI", false));
        Assert.assertEquals("PK", encoder.doubleMetaphone("BIAGGI", true));
        Assert.assertEquals("K", encoder.doubleMetaphone("EGG"));
        Assert.assertEquals("KT", encoder.doubleMetaphone("GOD"));
    }

    @Test
    public void testLetterH() {
        Assert.assertEquals("HT", encoder.doubleMetaphone("HOT"));
        Assert.assertEquals("AH", encoder.doubleMetaphone("AHA"));
        Assert.assertEquals("A", encoder.doubleMetaphone("AH"));
        Assert.assertEquals("A", encoder.doubleMetaphone("AHT"));
    }

    @Test
    public void testLetterJ() {
        Assert.assertEquals("HS", encoder.doubleMetaphone("JOSE"));
        Assert.assertEquals("SNHS", encoder.doubleMetaphone("SAN JACINTO"));
        Assert.assertEquals("SNHS", encoder.doubleMetaphone("SAN JOSE"));
        Assert.assertEquals("HSF", encoder.doubleMetaphone("JOSEPH", false));
        Assert.assertEquals("HSF", encoder.doubleMetaphone("JOSEPH", true));
        Assert.assertEquals("JN", encoder.doubleMetaphone("JOHN", false));
        Assert.assertEquals("AN", encoder.doubleMetaphone("JOHN", true));
        Assert.assertEquals("PJ", encoder.doubleMetaphone("BAJA", false));
        Assert.assertEquals("PH", encoder.doubleMetaphone("BAJA", true));
        Assert.assertEquals("MJ", encoder.doubleMetaphone("MAJO", false));
        Assert.assertEquals("MH", encoder.doubleMetaphone("MAJO", true));
        Assert.assertEquals("RJ", encoder.doubleMetaphone("RAJ", false));
        Assert.assertEquals("R ", encoder.doubleMetaphone("RAJ", true));
        Assert.assertEquals("JLP", encoder.doubleMetaphone("JALAPENO"));
        Assert.assertEquals("HLJ", encoder.doubleMetaphone("HALLELUJAH"));
        Assert.assertEquals("J", encoder.doubleMetaphone("JJ"));
    }

    @Test
    public void testLetterK() {
        Assert.assertEquals("K", encoder.doubleMetaphone("K"));
        Assert.assertEquals("K", encoder.doubleMetaphone("KK"));
        Assert.assertEquals("KT", encoder.doubleMetaphone("KITE"));
    }

    @Test
    public void testLetterL() {
        Assert.assertEquals("KPRL", encoder.doubleMetaphone("CABRILLO", false));
        Assert.assertEquals("KPR", encoder.doubleMetaphone("CABRILLO", true));
        Assert.assertEquals("ARMT", encoder.doubleMetaphone("ARMADILLO", false));
        Assert.assertEquals("ARMT", encoder.doubleMetaphone("ARMADILLO", true));
        Assert.assertEquals("FL", encoder.doubleMetaphone("VILLA", false));
        Assert.assertEquals("F", encoder.doubleMetaphone("VILLA", true));
        Assert.assertEquals("KL", encoder.doubleMetaphone("CALLE", false));
        Assert.assertEquals("K", encoder.doubleMetaphone("CALLE", true));
        Assert.assertEquals("AL", encoder.doubleMetaphone("ALLA", false));
        Assert.assertEquals("AL", encoder.doubleMetaphone("ALLOS", false));
        Assert.assertEquals("AL", encoder.doubleMetaphone("ALLAS", false));
        Assert.assertEquals("HL", encoder.doubleMetaphone("HELLO"));
        Assert.assertEquals("LK", encoder.doubleMetaphone("LOOK"));
    }

    @Test
    public void testLetterM() {
        Assert.assertEquals("M", encoder.doubleMetaphone("M"));
        Assert.assertEquals("M", encoder.doubleMetaphone("MM"));
        Assert.assertEquals("TM", encoder.doubleMetaphone("THUMB"));
        Assert.assertEquals("TM", encoder.doubleMetaphone("DUMB"));
        Assert.assertEquals("TMR", encoder.doubleMetaphone("THUMBER"));
        Assert.assertEquals("PLMR", encoder.doubleMetaphone("PLUMBER"));
        Assert.assertEquals("MT", encoder.doubleMetaphone("MAT"));
    }

    @Test
    public void testLetterN() {
        Assert.assertEquals("N", encoder.doubleMetaphone("N"));
        Assert.assertEquals("N", encoder.doubleMetaphone("NN"));
        Assert.assertEquals("NN", encoder.doubleMetaphone("NINE"));
        Assert.assertEquals("KN", encoder.doubleMetaphone("CA\u00D1ON"));
    }

    @Test
    public void testLetterP() {
        Assert.assertEquals("FLP", encoder.doubleMetaphone("PHILIP"));
        Assert.assertEquals("P", encoder.doubleMetaphone("PP"));
        Assert.assertEquals("P", encoder.doubleMetaphone("PB"));
        Assert.assertEquals("PL", encoder.doubleMetaphone("PAUL"));
    }

    @Test
    public void testLetterQ() {
        Assert.assertEquals("K", encoder.doubleMetaphone("Q"));
        Assert.assertEquals("K", encoder.doubleMetaphone("QQ"));
        Assert.assertEquals("KK", encoder.doubleMetaphone("QUICK"));
    }

    @Test
    public void testLetterR() {
        Assert.assertEquals("PR", encoder.doubleMetaphone("PIER", false));
        Assert.assertEquals("P", encoder.doubleMetaphone("PIER", true));
        Assert.assertEquals("MR", encoder.doubleMetaphone("MIE", false));
        Assert.assertEquals("MR", encoder.doubleMetaphone("MAMIER", false));
        Assert.assertEquals("R", encoder.doubleMetaphone("RR"));
        Assert.assertEquals("RT", encoder.doubleMetaphone("RED"));
    }

    @Test
    public void testLetterS() {
        Assert.assertEquals("ALNT", encoder.doubleMetaphone("ISLAND"));
        Assert.assertEquals("AL", encoder.doubleMetaphone("ISLE"));
        Assert.assertEquals("KRLL", encoder.doubleMetaphone("CARLISLE"));
        Assert.assertEquals("KRLL", encoder.doubleMetaphone("CARLYSLE"));
        Assert.assertEquals("SKR", encoder.doubleMetaphone("SUGAR", false));
        Assert.assertEquals("XKR", encoder.doubleMetaphone("SUGAR", true));
        Assert.assertEquals("SM", encoder.doubleMetaphone("SHEIM"));
        Assert.assertEquals("SK", encoder.doubleMetaphone("SHOEK"));
        Assert.assertEquals("SLM", encoder.doubleMetaphone("SHOLM"));
        Assert.assertEquals("SLS", encoder.doubleMetaphone("SHOLZ"));
        Assert.assertEquals("X", encoder.doubleMetaphone("SHOE"));
        Assert.assertEquals("AS", encoder.doubleMetaphone("ASIA", false));
        Assert.assertEquals("AX", encoder.doubleMetaphone("ASIA", true));
        Assert.assertEquals("RSN", encoder.doubleMetaphone("RUSSIAN", false));
        Assert.assertEquals("RXN", encoder.doubleMetaphone("RUSSIAN", true));
        Assert.assertEquals("AS", encoder.doubleMetaphone("WSIA", false));
        Assert.assertEquals("AS", encoder.doubleMetaphone("WSIA", true));
        Assert.assertEquals("SM0", encoder.doubleMetaphone("SMITH", false));
        Assert.assertEquals("XM0", encoder.doubleMetaphone("SMITH", true));
        Assert.assertEquals("SNTR", encoder.doubleMetaphone("SNIDER", false));
        Assert.assertEquals("XNTR", encoder.doubleMetaphone("SNIDER", true));
        Assert.assertEquals("SB", encoder.doubleMetaphone("SZABO", false));
        Assert.assertEquals("XB", encoder.doubleMetaphone("SZABO", true));
        Assert.assertEquals("RSN", encoder.doubleMetaphone("RESNAIS", false));
        Assert.assertEquals("RSNS", encoder.doubleMetaphone("RESNAIS", true));
        Assert.assertEquals("ART", encoder.doubleMetaphone("ARTOIS", false));
        Assert.assertEquals("ARTS", encoder.doubleMetaphone("ARTOIS", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("SS"));
        Assert.assertEquals("S", encoder.doubleMetaphone("ST"));
    }

    @Test
    public void testLetterSC() {
        Assert.assertEquals("SKL", encoder.doubleMetaphone("SCHOOL"));
        Assert.assertEquals("SKNR", encoder.doubleMetaphone("SCHOONER"));
        Assert.assertEquals("XRMR", encoder.doubleMetaphone("SCHERMERHORN", false));
        Assert.assertEquals("SKRM", encoder.doubleMetaphone("SCHERMERHORN", true));
        Assert.assertEquals("XNKR", encoder.doubleMetaphone("SCHENKER", false));
        Assert.assertEquals("SKNK", encoder.doubleMetaphone("SCHENKER", true));
        Assert.assertEquals("SKLR", encoder.doubleMetaphone("SCHUYLER"));
        Assert.assertEquals("SKT", encoder.doubleMetaphone("SCHED"));
        Assert.assertEquals("XMT", encoder.doubleMetaphone("SCHMITT", false));
        Assert.assertEquals("SMT", encoder.doubleMetaphone("SCHMITT", true));
        Assert.assertEquals("XWS", encoder.doubleMetaphone("SCHW"));
        Assert.assertEquals("S", encoder.doubleMetaphone("SCIENCE"));
        Assert.assertEquals("SKN", encoder.doubleMetaphone("SCAN"));
    }

    @Test
    public void testLetterT() {
        Assert.assertEquals("NXN", encoder.doubleMetaphone("NATION"));
        Assert.assertEquals("X", encoder.doubleMetaphone("TIA"));
        Assert.assertEquals("KX", encoder.doubleMetaphone("CATCH"));
        Assert.assertEquals("TMS", encoder.doubleMetaphone("THOMAS"));
        Assert.assertEquals("TMS", encoder.doubleMetaphone("THAMES"));
        Assert.assertEquals("FT", encoder.doubleMetaphone("VAN TH"));
        Assert.assertEquals("FT", encoder.doubleMetaphone("VON TH"));
        Assert.assertEquals("ST", encoder.doubleMetaphone("SCHTH"));
        Assert.assertEquals("0", encoder.doubleMetaphone("THE", false));
        Assert.assertEquals("T", encoder.doubleMetaphone("THE", true));
        Assert.assertEquals("T", encoder.doubleMetaphone("TT"));
        Assert.assertEquals("T", encoder.doubleMetaphone("TD"));
        Assert.assertEquals("TN", encoder.doubleMetaphone("TEN"));
    }

    @Test
    public void testLetterW() {
        Assert.assertEquals("R", encoder.doubleMetaphone("WR"));
        Assert.assertEquals("ASRM", encoder.doubleMetaphone("WASSERMAN", false));
        Assert.assertEquals("FSRM", encoder.doubleMetaphone("WASSERMAN", true));
        Assert.assertEquals("AT", encoder.doubleMetaphone("WHITE"));
        Assert.assertEquals("ARN", encoder.doubleMetaphone("ARNOW", false));
        Assert.assertEquals("ARNF", encoder.doubleMetaphone("ARNOW", true));
        Assert.assertEquals("ASK", encoder.doubleMetaphone("EWSKI", false));
        Assert.assertEquals("ASKF", encoder.doubleMetaphone("EWSKI", true));
        Assert.assertEquals("ASK", encoder.doubleMetaphone("EWSKY", false));
        Assert.assertEquals("ASKF", encoder.doubleMetaphone("EWSKY", true));
        Assert.assertEquals("ASK", encoder.doubleMetaphone("OWSKI", false));
        Assert.assertEquals("ASKF", encoder.doubleMetaphone("OWSKI", true));
        Assert.assertEquals("ASK", encoder.doubleMetaphone("OWSKY", false));
        Assert.assertEquals("ASKF", encoder.doubleMetaphone("OWSKY", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("SCHW", false));
        Assert.assertEquals("SF", encoder.doubleMetaphone("SCHW", true));
        Assert.assertEquals("TS", encoder.doubleMetaphone("WICZ", false));
        Assert.assertEquals("FX", encoder.doubleMetaphone("WICZ", true));
        Assert.assertEquals("TS", encoder.doubleMetaphone("WITZ", false));
        Assert.assertEquals("FX", encoder.doubleMetaphone("WITZ", true));
        Assert.assertEquals("AFL", encoder.doubleMetaphone("AWFUL"));
    }

    @Test
    public void testLetterX() {
        Assert.assertEquals("S", encoder.doubleMetaphone("XAVIER"));
        Assert.assertEquals("PR", encoder.doubleMetaphone("BREAUX"));
        Assert.assertEquals("P", encoder.doubleMetaphone("BOUX"));
        Assert.assertEquals("P", encoder.doubleMetaphone("BAUX"));
        Assert.assertEquals("P", encoder.doubleMetaphone("BEAUX"));
        Assert.assertEquals("AKS", encoder.doubleMetaphone("AX"));
        Assert.assertEquals("AKS", encoder.doubleMetaphone("AXC"));
        Assert.assertEquals("AKS", encoder.doubleMetaphone("AXX"));
    }

    @Test
    public void testLetterZ() {
        Assert.assertEquals("J", encoder.doubleMetaphone("ZHAO"));
        Assert.assertEquals("JNK", encoder.doubleMetaphone("ZHANG"));
        Assert.assertEquals("S", encoder.doubleMetaphone("ZOOM", false));
        Assert.assertEquals("TS", encoder.doubleMetaphone("ZOOM", true));
        Assert.assertEquals("SNK", encoder.doubleMetaphone("ZINC", false));
        Assert.assertEquals("TSNK", encoder.doubleMetaphone("ZINC", true));
        Assert.assertEquals("SS", encoder.doubleMetaphone("ZAZA", false));
        Assert.assertEquals("TSTS", encoder.doubleMetaphone("ZAZA", true));
        Assert.assertEquals("TKS", encoder.doubleMetaphone("TAGZ", false));
        Assert.assertEquals("TKTS", encoder.doubleMetaphone("TAGZ", true));
        Assert.assertEquals("S", encoder.doubleMetaphone("ZZ"));
        Assert.assertEquals("ST", encoder.doubleMetaphone("ZET"));
    }

    @Test
    public void testDefaultBranchInSwitch() {
        Assert.assertEquals("T", encoder.doubleMetaphone("123T456"));
    }

    @Test
    public void testDoubleMetaphoneResult_methodsAndOverflow() {
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(4);
        Assert.assertFalse(result.isComplete());

        result.append('A');
        result.append('B', 'C');
        Assert.assertEquals("AB", result.getPrimary());
        Assert.assertEquals("AC", result.getAlternate());

        result.append("DE");
        Assert.assertEquals("ABDE", result.getPrimary());
        Assert.assertEquals("ACDE", result.getAlternate());
        Assert.assertTrue(result.isComplete());

        result.append('X');
        result.append('Y', 'Z');
        result.append("LONGSTRING");
        result.append("STR1", "STR2");
        Assert.assertEquals("ABDE", result.getPrimary());
        Assert.assertEquals("ACDE", result.getAlternate());
    }

    @Test
    public void testDoubleMetaphoneResult_appendIndividualStringsWithOverflow() {
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(3);
        result.appendPrimary("ABCD");
        result.appendAlternate("WXYZ");
        Assert.assertEquals("ABC", result.getPrimary());
        Assert.assertEquals("WXY", result.getAlternate());
        Assert.assertTrue(result.isComplete());
    }
}
