package org.apache.commons.lang3.text.translate;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class NumericEntityUnescaperTest {

    @Test
    public void testTranslate_decimalEntity_success() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&#65;";
        int consumed = unescaper.translate(input, 0, writer);

        Assert.assertEquals(5, consumed);
        Assert.assertEquals("A", writer.toString());
    }

    @Test
    public void testTranslate_hexLowerCaseEntity_success() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&#x41;";
        int consumed = unescaper.translate(input, 0, writer);

        Assert.assertEquals(6, consumed);
        Assert.assertEquals("A", writer.toString());
    }

    @Test
    public void testTranslate_hexUpperCaseEntity_success() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&#X42;";
        int consumed = unescaper.translate(input, 0, writer);

        Assert.assertEquals(6, consumed);
        Assert.assertEquals("B", writer.toString());
    }

    @Test
    public void testTranslate_notAnEntity_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "Hello";
        int consumed = unescaper.translate(input, 0, writer);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_ampersandOnly_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&abc;";
        int consumed = unescaper.translate(input, 0, writer);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_invalidDecimalNumberFormat_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&#abc;";
        int consumed = unescaper.translate(input, 0, writer);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_invalidHexNumberFormat_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&#xgh;";
        int consumed = unescaper.translate(input, 0, writer);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_emptyEntityContent_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&#;";
        int consumed = unescaper.translate(input, 0, writer);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_emptyHexEntityContent_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&#x;";
        int consumed = unescaper.translate(input, 0, writer);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_fullStringTranslation_success() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        String input = "Test &#65; and &#x42; and &#X43;!";
        String result = unescaper.translate(input);

        Assert.assertEquals("Test A and B and C!", result);
    }

    @Test
    public void testTranslate_stringWithoutEntities_unchanged() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        String input = "Plain text with no entities.";
        String result = unescaper.translate(input);

        Assert.assertEquals(input, result);
    }

    @Test
    public void testTranslate_emptyString_returnsEmptyString() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        String result = unescaper.translate("");

        Assert.assertEquals("", result);
    }

    @Test
    public void testTranslate_nullInput_returnsNull() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        String result = unescaper.translate(null);

        Assert.assertNull(result);
    }

    @Test
    public void testTranslate_offsetIndex_success() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "prefix&#68;suffix";
        int consumed = unescaper.translate(input, 6, writer);

        Assert.assertEquals(5, consumed);
        Assert.assertEquals("D", writer.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testTranslate_unterminatedEntity_throwsException() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&#65";
        unescaper.translate(input, 0, writer);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testTranslate_ampersandAtEndOfString_throwsException() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        String input = "&";
        unescaper.translate(input, 0, writer);
    }
}
