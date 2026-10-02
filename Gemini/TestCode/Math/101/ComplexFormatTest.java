package org.apache.commons.math.complex;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

public class ComplexFormatTest {

    private Locale defaultLocale;

    @Before
    public void setUp() {
        defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
    }

    @After
    public void tearDown() {
        Locale.setDefault(defaultLocale);
    }

    @Test
    public void testConstructorsAndGetters() {
        ComplexFormat cf1 = new ComplexFormat();
        Assert.assertEquals("i", cf1.getImaginaryCharacter());
        Assert.assertNotNull(cf1.getRealFormat());
        Assert.assertNotNull(cf1.getImaginaryFormat());

        NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
        ComplexFormat cf2 = new ComplexFormat(nf1);
        Assert.assertEquals("i", cf2.getImaginaryCharacter());
        Assert.assertEquals(nf1, cf2.getRealFormat());

        NumberFormat nf2 = NumberFormat.getInstance(Locale.GERMAN);
        ComplexFormat cf3 = new ComplexFormat(nf1, nf2);
        Assert.assertEquals("i", cf3.getImaginaryCharacter());
        Assert.assertEquals(nf1, cf3.getRealFormat());
        Assert.assertEquals(nf2, cf3.getImaginaryFormat());

        ComplexFormat cf4 = new ComplexFormat("j");
        Assert.assertEquals("j", cf4.getImaginaryCharacter());

        ComplexFormat cf5 = new ComplexFormat("j", nf1);
        Assert.assertEquals("j", cf5.getImaginaryCharacter());
        Assert.assertEquals(nf1, cf5.getRealFormat());

        ComplexFormat cf6 = new ComplexFormat("j", nf1, nf2);
        Assert.assertEquals("j", cf6.getImaginaryCharacter());
        Assert.assertEquals(nf1, cf6.getRealFormat());
        Assert.assertEquals(nf2, cf6.getImaginaryFormat());
    }

    @Test
    public void testSettersValid() {
        ComplexFormat cf = new ComplexFormat();
        cf.setImaginaryCharacter("k");
        Assert.assertEquals("k", cf.getImaginaryCharacter());

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.FRANCE);
        cf.setRealFormat(nf);
        Assert.assertEquals(nf, cf.getRealFormat());

        NumberFormat nf2 = NumberFormat.getNumberInstance(Locale.ITALY);
        cf.setImaginaryFormat(nf2);
        Assert.assertEquals(nf2, cf.getImaginaryFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacter_null_throwsException() {
        new ComplexFormat().setImaginaryCharacter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryCharacter_empty_throwsException() {
        new ComplexFormat().setImaginaryCharacter("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRealFormat_null_throwsException() {
        new ComplexFormat().setRealFormat(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetImaginaryFormat_null_throwsException() {
        new ComplexFormat().setImaginaryFormat(null);
    }

    @Test
    public void testGetAvailableLocales() {
        Locale[] locales = ComplexFormat.getAvailableLocales();
        Assert.assertNotNull(locales);
        Assert.assertTrue(locales.length > 0);
    }

    @Test
    public void testGetInstance() {
        ComplexFormat cfDefault = ComplexFormat.getInstance();
        Assert.assertNotNull(cfDefault);
        Assert.assertEquals("i", cfDefault.getImaginaryCharacter());

        ComplexFormat cfLocale = ComplexFormat.getInstance(Locale.GERMANY);
        Assert.assertNotNull(cfLocale);
        Assert.assertEquals("i", cfLocale.getImaginaryCharacter());
    }

    @Test
    public void testFormatComplex_static() {
        Complex c = new Complex(1.23, 4.56);
        String formatted = ComplexFormat.formatComplex(c);
        Assert.assertEquals("1.23 + 4.56i", formatted);
    }

    @Test
    public void testFormat_complexCases() {
        ComplexFormat cf = ComplexFormat.getInstance(Locale.US);

        // Positive imaginary
        Assert.assertEquals("1.5 + 2.5i", cf.format(new Complex(1.5, 2.5)));

        // Negative imaginary
        Assert.assertEquals("1.5 - 2.5i", cf.format(new Complex(1.5, -2.5)));

        // Zero imaginary
        Assert.assertEquals("1.5", cf.format(new Complex(1.5, 0.0)));

        // Zero real and zero imaginary
        Assert.assertEquals("0", cf.format(new Complex(0.0, 0.0)));

        // NaN imaginary
        Assert.assertEquals("1.5 + (NaN)i", cf.format(new Complex(1.5, Double.NaN)));

        // NaN real
        Assert.assertEquals("(NaN) + 1.5i", cf.format(new Complex(Double.NaN, 1.5)));

        // Infinity imaginary
        Assert.assertEquals("1.5 + (Infinity)i", cf.format(new Complex(1.5, Double.POSITIVE_INFINITY)));
        Assert.assertEquals("1.5 - (Infinity)i", cf.format(new Complex(1.5, Double.NEGATIVE_INFINITY)));

        // Infinity real
        Assert.assertEquals("(Infinity) + 1.5i", cf.format(new Complex(Double.POSITIVE_INFINITY, 1.5)));
        Assert.assertEquals("(-Infinity) + 1.5i", cf.format(new Complex(Double.NEGATIVE_INFINITY, 1.5)));
    }

    @Test
    public void testFormat_objectTypes() {
        ComplexFormat cf = ComplexFormat.getInstance(Locale.US);
        FieldPosition pos = new FieldPosition(0);

        // Object instance of Complex
        StringBuffer sb1 = new StringBuffer();
        cf.format((Object) new Complex(2.0, 3.0), sb1, pos);
        Assert.assertEquals("2 + 3i", sb1.toString());

        // Object instance of Number (e.g., Double, Integer)
        StringBuffer sb2 = new StringBuffer();
        cf.format((Object) Double.valueOf(5.25), sb2, pos);
        Assert.assertEquals("5.25", sb2.toString());

        StringBuffer sb3 = new StringBuffer();
        cf.format((Object) Integer.valueOf(7), sb3, pos);
        Assert.assertEquals("7", sb3.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_invalidObjectType_throwsException() {
        ComplexFormat cf = new ComplexFormat();
        cf.format("Invalid Object", new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void testParse_validInputs() throws ParseException {
        ComplexFormat cf = ComplexFormat.getInstance(Locale.US);

        Complex c1 = cf.parse("1.23 + 4.56i");
        Assert.assertEquals(1.23, c1.getReal(), 1e-6);
        Assert.assertEquals(4.56, c1.getImaginary(), 1e-6);

        Complex c2 = cf.parse("  1.23   -   4.56i  ");
        Assert.assertEquals(1.23, c2.getReal(), 1e-6);
        Assert.assertEquals(-4.56, c2.getImaginary(), 1e-6);

        // Real only
        Complex c3 = cf.parse("1.23");
        Assert.assertEquals(1.23, c3.getReal(), 1e-6);
        Assert.assertEquals(0.0, c3.getImaginary(), 1e-6);

        // Special numbers parsing
        Complex cNaN = cf.parse("(NaN) + (NaN)i");
        Assert.assertTrue(Double.isNaN(cNaN.getReal()));
        Assert.assertTrue(Double.isNaN(cNaN.getImaginary()));

        Complex cInf = cf.parse("(Infinity) - (Infinity)i");
        Assert.assertEquals(Double.POSITIVE_INFINITY, cInf.getReal(), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, cInf.getImaginary(), 0.0);

        Complex cNegInf = cf.parse("(-Infinity) + (-Infinity)i");
        Assert.assertEquals(Double.NEGATIVE_INFINITY, cNegInf.getReal(), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, cNegInf.getImaginary(), 0.0);
    }

    @Test
    public void testParseObject() {
        ComplexFormat cf = ComplexFormat.getInstance(Locale.US);
        ParsePosition pos = new ParsePosition(0);
        Object obj = cf.parseObject("3.14 + 2.71i", pos);
        Assert.assertTrue(obj instanceof Complex);
        Complex c = (Complex) obj;
        Assert.assertEquals(3.14, c.getReal(), 1e-6);
        Assert.assertEquals(2.71, c.getImaginary(), 1e-6);
        Assert.assertEquals(12, pos.getIndex());
    }

    @Test
    public void testParse_invalidInputs_returnsNullOrSetsError() {
        ComplexFormat cf = ComplexFormat.getInstance(Locale.US);

        // Invalid real part
        ParsePosition pos1 = new ParsePosition(0);
        Complex res1 = cf.parse("abc + 1i", pos1);
        Assert.assertNull(res1);
        Assert.assertEquals(0, pos1.getIndex());

        // Invalid sign
        ParsePosition pos2 = new ParsePosition(0);
        Complex res2 = cf.parse("1.23 * 4.56i", pos2);
        Assert.assertNull(res2);
        Assert.assertEquals(0, pos2.getIndex());
        Assert.assertEquals(5, pos2.getErrorIndex());

        // Invalid imaginary part
        ParsePosition pos3 = new ParsePosition(0);
        Complex res3 = cf.parse("1.23 + abci", pos3);
        Assert.assertNull(res3);
        Assert.assertEquals(0, pos3.getIndex());

        // Invalid imaginary character
        ParsePosition pos4 = new ParsePosition(0);
        Complex res4 = cf.parse("1.23 + 4.56j", pos4); // expecting 'i'
        Assert.assertNull(res4);
        Assert.assertEquals(0, pos4.getIndex());
        Assert.assertEquals(11, pos4.getErrorIndex());

        // Empty string
        ParsePosition pos5 = new ParsePosition(0);
        Complex res5 = cf.parse("", pos5);
        Assert.assertNull(res5);
        Assert.assertEquals(0, pos5.getIndex());
    }

    @Test(expected = ParseException.class)
    public void testParse_unparseableString_throwsParseException() throws ParseException {
        ComplexFormat cf = ComplexFormat.getInstance(Locale.US);
        cf.parse("not a complex number");
    }
}
