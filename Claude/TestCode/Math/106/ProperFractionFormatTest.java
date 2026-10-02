import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.ProperFractionFormat;

public class ProperFractionFormatTest {

    private ProperFractionFormat properFormatDefault;

    @Before
    public void setUp() {
        properFormatDefault = new ProperFractionFormat();
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testDefaultConstructor_createsInstance_notNull() {
        ProperFractionFormat format = new ProperFractionFormat();
        Assert.assertNotNull(format);
        Assert.assertNotNull(format.getWholeFormat());
    }

    @Test
    public void testSingleFormatConstructor_createsInstance_wholeFormatSet() {
        NumberFormat nf = NumberFormat.getInstance();
        ProperFractionFormat format = new ProperFractionFormat(nf);
        Assert.assertNotNull(format.getWholeFormat());
    }

    @Test
    public void testThreeFormatConstructor_createsInstance_wholeFormatSet() {
        NumberFormat whole = NumberFormat.getInstance();
        NumberFormat num = NumberFormat.getInstance();
        NumberFormat den = NumberFormat.getInstance();
        ProperFractionFormat format = new ProperFractionFormat(whole, num, den);
        Assert.assertEquals(whole, format.getWholeFormat());
    }

    // ---------- getWholeFormat / setWholeFormat Tests ----------

    @Test
    public void testGetWholeFormat_afterDefaultConstruction_returnsNonNull() {
        Assert.assertNotNull(properFormatDefault.getWholeFormat());
    }

    @Test
    public void testSetWholeFormat_withValidFormat_updatesFormat() {
        NumberFormat newFormat = NumberFormat.getIntegerInstance();
        properFormatDefault.setWholeFormat(newFormat);
        Assert.assertEquals(newFormat, properFormatDefault.getWholeFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWholeFormat_withNull_throwsIllegalArgumentException() {
        properFormatDefault.setWholeFormat(null);
    }

    // ---------- format() Tests ----------

    @Test
    public void testFormat_properFractionWithPositiveWhole_returnsExpectedString() {
        Fraction fraction = new Fraction(7, 2); // 3 1/2
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        StringBuffer result = properFormatDefault.format(fraction, sb, pos);
        Assert.assertEquals("3 1 / 2", result.toString());
    }

    @Test
    public void testFormat_fractionWithZeroWhole_returnsExpectedString() {
        Fraction fraction = new Fraction(1, 2); // 0 whole, 1/2
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        StringBuffer result = properFormatDefault.format(fraction, sb, pos);
        Assert.assertEquals("1 / 2", result.toString());
    }

    @Test
    public void testFormat_negativeFraction_returnsExpectedString() {
        Fraction fraction = new Fraction(-7, 2); // whole = -3, remainder -1 -> abs = 1
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        StringBuffer result = properFormatDefault.format(fraction, sb, pos);
        Assert.assertEquals("-3 1 / 2", result.toString());
    }

    @Test
    public void testFormat_wholeNumberFractionNoRemainder_returnsExpectedString() {
        Fraction fraction = new Fraction(5, 1); // whole = 5, remainder 0
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        StringBuffer result = properFormatDefault.format(fraction, sb, pos);
        Assert.assertEquals("5 0 / 1", result.toString());
    }

    @Test
    public void testFormat_zeroNumerator_returnsExpectedString() {
        Fraction fraction = new Fraction(0, 5);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        StringBuffer result = properFormatDefault.format(fraction, sb, pos);
        Assert.assertEquals("0 / 5", result.toString());
    }

    // ---------- parse() Tests ----------

    @Test
    public void testParse_improperFraction_returnsCorrectFraction() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("7/2", pos);
        Assert.assertNotNull(result);
        Assert.assertEquals(7, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());
    }

    @Test
    public void testParse_properFractionPositiveWhole_returnsCorrectFraction() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("1 1/2", pos);
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());
    }

    @Test
    public void testParse_properFractionNegativeWhole_returnsCorrectFraction() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("-1 1/2", pos);
        Assert.assertNotNull(result);
        Assert.assertEquals(-3, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());
    }

    @Test
    public void testParse_wholeAndNumeratorNoSlash_returnsNumeratorOnlyFraction() {
        // Due to switch-case logic in ProperFractionFormat.parse, when no '/' is
        // found after parsing whole and numerator, only the numerator is used.
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("1 2", pos);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getNumerator());
        Assert.assertEquals(1, result.getDenominator());
    }

    @Test
    public void testParse_invalidWholeNumber_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("abc", pos);
        Assert.assertNull(result);
    }

    @Test
    public void testParse_invalidNumeratorAfterWhole_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("1 ", pos);
        Assert.assertNull(result);
    }

    @Test
    public void testParse_invalidCharacterInsteadOfSlash_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("1 1x2", pos);
        Assert.assertNull(result);
    }

    @Test
    public void testParse_missingDenominatorAfterSlash_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("1 1/", pos);
        Assert.assertNull(result);
    }

    @Test
    public void testParse_emptyString_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("", pos);
        Assert.assertNull(result);
    }

    @Test
    public void testParse_wholeWithExtraWhitespace_returnsCorrectFraction() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = properFormatDefault.parse("2   3/4", pos);
        Assert.assertNotNull(result);
        Assert.assertEquals(11, result.getNumerator());
        Assert.assertEquals(4, result.getDenominator());
    }
}
