package org.apache.commons.math.complex;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

public class ComplexFormatTest {

    private ComplexFormat complexFormat;

    @Before
    public void setUp() {
        complexFormat = new ComplexFormat(NumberFormat.getInstance(Locale.US));
    }

    // ---------------- Constructor Tests ----------------

    @Test
    public void testDefaultConstructor_createsInstance_notNull() {
        ComplexFormat cf = new ComplexFormat();
        assertNotNull(cf);
        assertEquals("i", cf.getImaginaryCharacter());
    }

    @Test
    public void testConstructorWithFormat_createsInstance_notNull() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        ComplexFormat cf = new ComplexFormat(nf);
        assertNotNull(cf);
        assertEquals("i", cf.getImaginaryCharacter());
    }

    @Test
    public void testConstructorWithRealAndImaginaryFormat_createsInstance() {
        NumberFormat realFmt = NumberFormat.getInstance(Locale.US);
        NumberFormat imagFmt = NumberFormat.getInstance(Locale.US);
        ComplexFormat cf = new ComplexFormat(realFmt, imagFmt);
        assertNotNull(cf);
        assertSame(realFmt, cf.getRealFormat());
        assertSame(imagFmt, cf.getImaginaryFormat());
    }

    @Test
    public void testConstructorWithImaginaryCharacter_createsInstance() {
        ComplexFormat cf = new ComplexFormat("j");
        assertEquals("j", cf.getImaginaryCharacter());
    }

    @Test
    public void testConstructorWithImaginaryCharacterAndFormat_createsInstance() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        ComplexFormat cf = new ComplexFormat("j", nf);
        assertEquals("j", cf.getImaginaryCharacter());
        assertNotNull(cf.getRealFormat());
        assertNotNull(cf.getImaginaryFormat());
    }

    @Test
    public void testConstructorWithImaginaryCharacterAndTwoFormats_createsInstance() {
        NumberFormat realFmt = NumberFormat.getInstance(Locale.US);
        NumberFormat imagFmt = NumberFormat.getInstance(Locale.US);
        ComplexFormat cf = new ComplexFormat("j", realFmt, imagFmt);
        assertEquals("j", cf.getImaginaryCharacter());
        assertSame(realFmt, cf.getRealFormat());
        assertSame(imagFmt, cf.getImaginaryFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullImaginaryCharacter_throwsException() {
        new ComplexFormat((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_emptyImaginaryCharacter_throwsException() {
        new ComplexFormat("");
    }

    // ---------------- Setter Edge Case Tests ----------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacter_null_throwsException() {
        ComplexFormat cf = new ComplexFormat();
        cf.setImaginaryCharacter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacter_empty_throwsException() {
        ComplexFormat cf = new ComplexFormat();
        cf.setImaginaryCharacter("");
    }

    @Test
    public void testSetImaginaryCharacter_validValue_updatesValue() {
        ComplexFormat cf = new ComplexFormat();
        cf.setImaginaryCharacter("j");
        assertEquals("j", cf.getImaginaryCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryFormat_null_throwsException() {
        ComplexFormat cf = new ComplexFormat();
        cf.setImaginaryFormat(null);
    }

    @Test
    public void testSetImaginaryFormat_validValue_updatesValue() {
        ComplexFormat cf = new ComplexFormat();
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        cf.setImaginaryFormat(nf);
        assertSame(nf, cf.getImaginaryFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRealFormat_null_throwsException() {
        ComplexFormat cf = new ComplexFormat();
        cf.setRealFormat(null);
    }

    @Test
    public void testSetRealFormat_validValue_updatesValue() {
        ComplexFormat cf = new ComplexFormat();
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        cf.setRealFormat(nf);
        assertSame(nf, cf.getRealFormat());
    }

    // ---------------- Getter Tests ----------------

    @Test
    public void testGetImaginaryCharacter_defaultValue_returnsI() {
        ComplexFormat cf = new ComplexFormat(NumberFormat.getInstance(Locale.US));
        assertEquals("i", cf.getImaginaryCharacter());
    }

    @Test
    public void testGetRealFormat_notNull() {
        assertNotNull(complexFormat.getRealFormat());
    }

    @Test
    public void testGetImaginaryFormat_notNull() {
        assertNotNull(complexFormat.getImaginaryFormat());
    }

    // ---------------- Static Method Tests ----------------

    @Test
    public void testGetAvailableLocales_returnsNonEmptyArray() {
        Locale[] locales = ComplexFormat.getAvailableLocales();
        assertNotNull(locales);
        assertTrue(locales.length > 0);
    }

    @Test
    public void testGetInstance_defaultLocale_notNull() {
        ComplexFormat cf = ComplexFormat.getInstance();
        assertNotNull(cf);
    }

    @Test
    public void testGetInstance_specificLocale_notNull() {
        ComplexFormat cf = ComplexFormat.getInstance(Locale.FRENCH);
        assertNotNull(cf);
    }

    @Test
    public void testFormatComplex_staticMethod_returnsNonNullString() {
        String result = ComplexFormat.formatComplex(new Complex(1.0, 2.0));
        assertNotNull(result);
    }

    // ---------------- format(Complex, ...) Tests ----------------

    @Test
    public void testFormat_positiveRealPositiveImaginary_formatsWithPlusSign() {
        Complex c = new Complex(1.0, 2.0);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        complexFormat.format(c, sb, pos);
        assertEquals("1 + 2i", sb.toString());
    }

    @Test
    public void testFormat_positiveRealNegativeImaginary_formatsWithMinusSign() {
        Complex c = new Complex(1.0, -2.0);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        complexFormat.format(c, sb, pos);
        assertEquals("1 - 2i", sb.toString());
    }

    @Test
    public void testFormat_zeroImaginary_formatsRealOnly() {
        Complex c = new Complex(1.0, 0.0);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        complexFormat.format(c, sb, pos);
        assertEquals("1", sb.toString());
    }

    @Test
    public void testFormat_nanImaginary_formatsWithParenthesesNaN() {
        Complex c = new Complex(1.0, Double.NaN);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        complexFormat.format(c, sb, pos);
        assertEquals("1 + (NaN)i", sb.toString());
    }

    @Test
    public void testFormat_infiniteReal_formatsWithParenthesesInfinity() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 2.0);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        complexFormat.format(c, sb, pos);
        assertEquals("(Infinity) + 2i", sb.toString());
    }

    @Test
    public void testFormat_negativeInfiniteImaginary_formatsWithParenthesesNegativeInfinity() {
        Complex c = new Complex(1.0, Double.NEGATIVE_INFINITY);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        complexFormat.format(c, sb, pos);
        assertEquals("1 - (Infinity)i", sb.toString());
    }

    @Test
    public void testFormat_customImaginaryCharacter_usesCustomCharacter() {
        ComplexFormat cf = new ComplexFormat("j", NumberFormat.getInstance(Locale.US));
        Complex c = new Complex(1.0, 2.0);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        cf.format(c, sb, pos);
        assertEquals("1 + 2j", sb.toString());
    }

    // ---------------- format(Object, ...) Tests ----------------

    @Test
    public void testFormatObject_withComplexInstance_formatsCorrectly() {
        Complex c = new Complex(3.0, 4.0);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        complexFormat.format((Object) c, sb, pos);
        assertEquals("3 + 4i", sb.toString());
    }

    @Test
    public void testFormatObject_withNumberInstance_formatsAsComplexWithZeroImaginary() {
        Double num = new Double(5.0);
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        complexFormat.format((Object) num, sb, pos);
        assertEquals("5", sb.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObject_withInvalidType_throwsException() {
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        complexFormat.format((Object) "invalid", sb, pos);
    }

    // ---------------- parse(String) Tests ----------------

    @Test
    public void testParseString_normalComplexNumber_parsesCorrectly() throws ParseException {
        Complex c = complexFormat.parse("1 + 2i");
        assertEquals(1.0, c.getReal(), 1e-9);
        assertEquals(2.0, c.getImaginary(), 1e-9);
    }

    @Test
    public void testParseString_negativeImaginaryPart_parsesCorrectly() throws ParseException {
        Complex c = complexFormat.parse("1 - 2i");
        assertEquals(1.0, c.getReal(), 1e-9);
        assertEquals(-2.0, c.getImaginary(), 1e-9);
    }

    @Test
    public void testParseString_realOnly_parsesWithZeroImaginary() throws ParseException {
        Complex c = complexFormat.parse("1");
        assertEquals(1.0, c.getReal(), 1e-9);
        assertEquals(0.0, c.getImaginary(), 1e-9);
    }

    @Test(expected = ParseException.class)
    public void testParseString_invalidString_throwsParseException() throws ParseException {
        complexFormat.parse("invalid string");
    }

    @Test
    public void testParseString_customImaginaryCharacter_parsesCorrectly() throws ParseException {
        ComplexFormat cf = new ComplexFormat("j", NumberFormat.getInstance(Locale.US));
        Complex c = cf.parse("1 + 2j");
        assertEquals(1.0, c.getReal(), 1e-9);
        assertEquals(2.0, c.getImaginary(), 1e-9);
    }

    @Test
    public void testParseString_specialNaNImaginaryValue_parsesCorrectly() throws ParseException {
        Complex c = complexFormat.parse("1 + (NaN)i");
        assertEquals(1.0, c.getReal(), 1e-9);
        assertTrue(Double.isNaN(c.getImaginary()));
    }

    // ---------------- parse(String, ParsePosition) Tests ----------------

    @Test
    public void testParseWithPosition_validInput_returnsComplexAndUpdatesPosition() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("1 + 2i", pos);
        assertNotNull(c);
        assertEquals(1.0, c.getReal(), 1e-9);
        assertEquals(2.0, c.getImaginary(), 1e-9);
        assertTrue(pos.getIndex() > 0);
    }

    @Test
    public void testParseWithPosition_invalidRealNumber_returnsNullAndResetsIndex() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("abc", pos);
        assertNull(c);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseWithPosition_invalidSignCharacter_returnsNullAndSetsErrorIndex() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("1 * 2i", pos);
        assertNull(c);
        assertEquals(0, pos.getIndex());
        assertTrue(pos.getErrorIndex() >= 0);
    }

    @Test
    public void testParseWithPosition_invalidImaginaryNumber_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("1 + abc", pos);
        assertNull(c);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseWithPosition_invalidImaginaryCharacter_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("1 + 2x", pos);
        assertNull(c);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseWithPosition_emptyString_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Complex c = complexFormat.parse("", pos);
        assertNull(c);
    }

    // ---------------- parseObject(String, ParsePosition) Tests ----------------

    @Test
    public void testParseObject_validInput_returnsComplexObject() {
        ParsePosition pos = new ParsePosition(0);
        Object obj = complexFormat.parseObject("1 + 2i", pos);
        assertNotNull(obj);
        assertTrue(obj instanceof Complex);
        Complex c = (Complex) obj;
        assertEquals(1.0, c.getReal(), 1e-9);
        assertEquals(2.0, c.getImaginary(), 1e-9);
    }

    @Test
    public void testParseObject_invalidInput_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Object obj = complexFormat.parseObject("invalid", pos);
        assertNull(obj);
    }
}
