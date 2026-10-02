package org.apache.commons.math.fraction;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProperFractionFormatTest {

    private ProperFractionFormat properFormat;

    @Before
    public void setUp() {
        properFormat = new ProperFractionFormat(NumberFormat.getIntegerInstance(Locale.US));
    }

    @Test
    public void testDefaultConstructor() {
        ProperFractionFormat format = new ProperFractionFormat();
        Assert.assertNotNull(format.getWholeFormat());
        Assert.assertNotNull(format.getNumeratorFormat());
        Assert.assertNotNull(format.getDenominatorFormat());
    }

    @Test
    public void testSingleFormatConstructor() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        ProperFractionFormat format = new ProperFractionFormat(nf);
        Assert.assertNotNull(format.getWholeFormat());
        Assert.assertNotNull(format.getNumeratorFormat());
        Assert.assertNotNull(format.getDenominatorFormat());
    }

    @Test
    public void testThreeFormatsConstructor() {
        NumberFormat wholeFormat = NumberFormat.getIntegerInstance(Locale.US);
        NumberFormat numFormat = NumberFormat.getIntegerInstance(Locale.US);
        NumberFormat denFormat = NumberFormat.getIntegerInstance(Locale.US);
        ProperFractionFormat format = new ProperFractionFormat(wholeFormat, numFormat, denFormat);
        Assert.assertSame(wholeFormat, format.getWholeFormat());
        Assert.assertSame(numFormat, format.getNumeratorFormat());
        Assert.assertSame(denFormat, format.getDenominatorFormat());
    }

    @Test
    public void testFormat_positiveProperFraction_formatsCorrectly() {
        Fraction f = new Fraction(1, 2);
        String result = properFormat.format(f);
        Assert.assertEquals("1 / 2", result);
    }

    @Test
    public void testFormat_positiveImproperFraction_formatsAsProper() {
        Fraction f = new Fraction(7, 2);
        String result = properFormat.format(f);
        Assert.assertEquals("3 1 / 2", result);
    }

    @Test
    public void testFormat_negativeImproperFraction_formatsAsProperWithNegativeWhole() {
        Fraction f = new Fraction(-7, 2);
        String result = properFormat.format(f);
        Assert.assertEquals("-3 1 / 2", result);
    }

    @Test
    public void testFormat_zeroNumerator_formatsZero() {
        Fraction f = new Fraction(0, 1);
        String result = properFormat.format(f);
        Assert.assertEquals("0 / 1", result);
    }

    @Test
    public void testFormat_withFieldPosition_resetsPositionIndices() {
        Fraction f = new Fraction(5, 3);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        pos.setBeginIndex(10);
        pos.setEndIndex(20);
        properFormat.format(f, sb, pos);
        Assert.assertEquals("1 2 / 3", sb.toString());
        Assert.assertEquals(0, pos.getBeginIndex());
        Assert.assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testParse_properFractionWithoutWhole_parsedSuccessfully() throws ParseException {
        Fraction f = properFormat.parse("1 / 2");
        Assert.assertEquals(new Fraction(1, 2), f);
    }

    @Test
    public void testParse_positiveProperFractionWithWhole_parsedSuccessfully() throws ParseException {
        Fraction f = properFormat.parse("3 1 / 2");
        Assert.assertEquals(new Fraction(7, 2), f);
    }

    @Test
    public void testParse_negativeProperFractionWithWhole_parsedSuccessfully() throws ParseException {
        Fraction f = properFormat.parse("-3 1 / 2");
        Assert.assertEquals(new Fraction(-7, 2), f);
    }

    @Test
    public void testParse_wholeAndNumeratorWithoutSlash_returnsFractionFromNumerator() {
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse("3 5", pos);
        Assert.assertNotNull(f);
        Assert.assertEquals(new Fraction(5, 1), f);
    }

    @Test
    public void testParse_invalidSlashCharacter_returnsNullAndSetsErrorIndex() {
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse("3 1 x 2", pos);
        Assert.assertNull(f);
        Assert.assertEquals(0, pos.getIndex());
        Assert.assertTrue(pos.getErrorIndex() >= 0);
    }

    @Test
    public void testParse_missingDenominator_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse("3 1 / ", pos);
        Assert.assertNull(f);
        Assert.assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParse_missingNumerator_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse("3  abc", pos);
        Assert.assertNull(f);
        Assert.assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParse_emptyString_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse("", pos);
        Assert.assertNull(f);
        Assert.assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParse_whitespaceOnly_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Fraction f = properFormat.parse("   ", pos);
        Assert.assertNull(f);
        Assert.assertEquals(0, pos.getIndex());
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidStringThrowsParseException() throws ParseException {
        properFormat.parse("invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWholeFormat_nullThrowsIllegalArgumentException() {
        properFormat.setWholeFormat(null);
    }

    @Test
    public void testSetWholeFormat_validFormat_updatesFormat() {
        NumberFormat newFormat = NumberFormat.getIntegerInstance(Locale.GERMANY);
        properFormat.setWholeFormat(newFormat);
        Assert.assertSame(newFormat, properFormat.getWholeFormat());
    }
}
