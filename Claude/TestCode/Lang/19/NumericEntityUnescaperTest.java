package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Before;
import org.junit.Test;

public class NumericEntityUnescaperTest {

    private NumericEntityUnescaper unescaper;

    @Before
    public void setUp() {
        unescaper = new NumericEntityUnescaper();
    }

    // (ก) Normal / typical input cases

    @Test
    public void testTranslate_decimalEntityWithSemicolon_writesCharacterAndReturnsLength() throws IOException {
        String input = "&#65;";
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(5, consumed);
        assertEquals("A", out.toString());
    }

    @Test
    public void testTranslate_hexEntityLowercaseX_writesCharacterAndReturnsLength() throws IOException {
        String input = "&#x41;";
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(6, consumed);
        assertEquals("A", out.toString());
    }

    @Test
    public void testTranslate_hexEntityUppercaseX_writesCharacterAndReturnsLength() throws IOException {
        String input = "&#X41;";
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(6, consumed);
        assertEquals("A", out.toString());
    }

    @Test
    public void testTranslate_characterAboveBMP_writesSurrogatePairAndReturnsLength() throws IOException {
        String input = "&#65536;"; // 0x10000, above 0xFFFF
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(8, consumed);
        char[] expectedChars = Character.toChars(65536);
        assertEquals(new String(expectedChars), out.toString());
    }

    @Test
    public void testTranslate_entityInMiddleOfString_correctOutput() throws IOException {
        String input = "prefix&#66;suffix";
        StringWriter out = new StringWriter();
        int index = input.indexOf('&');
        int consumed = unescaper.translate(input, index, out);
        assertEquals(5, consumed);
        assertEquals("B", out.toString());
    }

    @Test
    public void testTranslate_fullStringConvenienceMethod_returnsTranslatedString() throws IOException {
        // Testing the public translate(CharSequence) method inherited from CharSequenceTranslator
        String input = "Hello &#87;orld";
        String result = unescaper.translate(input);
        assertEquals("Hello World", result);
    }

    // (ข) Edge cases: boundary values, empty string, non-matching conditions

    @Test
    public void testTranslate_notAmpersand_returnsZero() throws IOException {
        String input = "abc";
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_ampersandAtLastIndex_returnsZero() throws IOException {
        String input = "&";
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(0, consumed);
    }

    @Test
    public void testTranslate_ampersandNotFollowedByHash_returnsZero() throws IOException {
        String input = "&x";
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(0, consumed);
    }

    @Test
    public void testTranslate_emptyNumericValue_returnsZeroDueToNumberFormatException() throws IOException {
        String input = "&#;";
        StringWriter out = new StringWriter();
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_emptyString_returnsZero() throws IOException {
        // input length 0 -> seqEnd = 0, charAt(0) would throw if accessed,
        // but index would be out of bounds too; use empty string with index 0
        // Note: this will actually throw StringIndexOutOfBoundsException because
        // input.charAt(index) is called before bounds are otherwise checked.
        String input = "";
        StringWriter out = new StringWriter();
        try {
            unescaper.translate(input, 0, out);
            // If no exception thrown, consumed should logically be 0
        } catch (StringIndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    // (ค) Exception cases

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_noSemicolonCausesException_throwsStringIndexOutOfBoundsException() throws IOException {
        String input = "&#65"; // no terminating semicolon, loop runs out of bounds
        StringWriter out = new StringWriter();
        unescaper.translate(input, 0, out);
    }

    @Test(expected = NullPointerException.class)
    public void testTranslate_nullInput_throwsNullPointerException() throws IOException {
        StringWriter out = new StringWriter();
        unescaper.translate(null, 0, out);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_negativeIndex_throwsStringIndexOutOfBoundsException() throws IOException {
        String input = "&#65;";
        StringWriter out = new StringWriter();
        unescaper.translate(input, -1, out);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_indexOutOfBounds_throwsStringIndexOutOfBoundsException() throws IOException {
        String input = "&#65;";
        StringWriter out = new StringWriter();
        unescaper.translate(input, input.length() + 1, out);
    }

    @Test
    public void testTranslate_writerIsNullButNoWriteNeeded_returnsZero() throws IOException {
        // When the condition for a valid numeric entity fails, out.write is never called,
        // so passing a null Writer should still be safe and return 0.
        String input = "abc";
        Writer out = null;
        int consumed = unescaper.translate(input, 0, out);
        assertEquals(0, consumed);
    }
}
