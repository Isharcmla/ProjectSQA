package org.apache.commons.lang3.text.translate;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class NumericEntityUnescaperTest {

    @Test
    public void testTranslate_decimalEntity_success() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&#65;", 0, out);

        Assert.assertEquals(5, consumed);
        Assert.assertEquals("A", out.toString());
    }

    @Test
    public void testTranslate_hexLowerCaseEntity_success() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&#x41;", 0, out);

        Assert.assertEquals(6, consumed);
        Assert.assertEquals("A", out.toString());
    }

    @Test
    public void testTranslate_hexUpperCaseEntity_success() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&#X41;", 0, out);

        Assert.assertEquals(6, consumed);
        Assert.assertEquals("A", out.toString());
    }

    @Test
    public void testTranslate_supplementaryCharacterHex_writesSurrogatePair() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&#x10000;", 0, out);

        Assert.assertEquals(9, consumed);
        Assert.assertEquals(new String(Character.toChars(0x10000)), out.toString());
    }

    @Test
    public void testTranslate_supplementaryCharacterDecimal_writesSurrogatePair() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&#65536;", 0, out);

        Assert.assertEquals(8, consumed);
        Assert.assertEquals(new String(Character.toChars(65536)), out.toString());
    }

    @Test
    public void testTranslate_notAnEntity_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("Hello", 0, out);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_ampersandAtEndOfInput_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("Test&", 4, out);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_ampersandNotFollowedByHash_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&amp;", 0, out);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_invalidDecimalNumber_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&#invalid;", 0, out);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_invalidHexNumber_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&#xZZZ;", 0, out);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_emptyEntity_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&#;", 0, out);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_emptyHexEntity_returnsZero() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate("&#x;", 0, out);

        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_fullStringTranslation_success() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        String input = "Test &#65; and &#x42; and &#X43;!";
        String result = unescaper.translate(input);

        Assert.assertEquals("Test A and B and C!", result);
    }

    @Test
    public void testTranslate_nullInput_returnsNull() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        Assert.assertNull(unescaper.translate(null));
    }

    @Test
    public void testTranslate_emptyInput_returnsEmpty() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        Assert.assertEquals("", unescaper.translate(""));
    }
}
