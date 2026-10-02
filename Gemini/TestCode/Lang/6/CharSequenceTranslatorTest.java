package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class CharSequenceTranslatorTest {

    private static class PassthroughTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    private static class ReplacingTranslator extends CharSequenceTranslator {
        private final String search;
        private final String replacement;

        public ReplacingTranslator(String search, String replacement) {
            this.search = search;
            this.replacement = replacement;
        }

        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            int len = search.length();
            if (index + len <= input.length()) {
                CharSequence sub = input.subSequence(index, index + len);
                if (search.equals(sub.toString())) {
                    out.write(replacement);
                    return Character.codePointCount(search, 0, search.length());
                }
            }
            return 0;
        }
    }

    private static class ExceptionTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            throw new IOException("Simulated IOException");
        }
    }

    @Test
    public void testTranslateString_nullInput_returnsNull() {
        CharSequenceTranslator translator = new PassthroughTranslator();
        assertNull(translator.translate(null));
    }

    @Test
    public void testTranslateString_emptyString_returnsEmpty() {
        CharSequenceTranslator translator = new PassthroughTranslator();
        assertEquals("", translator.translate(""));
    }

    @Test
    public void testTranslateString_passthroughString_returnsIdenticalString() {
        CharSequenceTranslator translator = new PassthroughTranslator();
        assertEquals("Hello World", translator.translate("Hello World"));
    }

    @Test
    public void testTranslateString_supplementaryCharacters_preservedCorrectly() {
        CharSequenceTranslator translator = new PassthroughTranslator();
        String emojiString = "Hello \uD83D\uDE00 World";
        assertEquals(emojiString, translator.translate(emojiString));
    }

    @Test
    public void testTranslateString_throwsRuntimeExceptionOnTranslatorIOException() {
        CharSequenceTranslator translator = new ExceptionTranslator();
        try {
            translator.translate("Test");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertNotNull(e.getCause());
            assertTrue(e.getCause() instanceof IOException);
            assertEquals("Simulated IOException", e.getCause().getMessage());
        }
    }

    @Test
    public void testTranslateWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        CharSequenceTranslator translator = new PassthroughTranslator();
        try {
            translator.translate("Test", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null", e.getMessage());
        }
    }

    @Test
    public void testTranslateWriter_nullInput_doesNothing() throws IOException {
        CharSequenceTranslator translator = new PassthroughTranslator();
        StringWriter writer = new StringWriter();
        translator.translate(null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_emptyInput_doesNothing() throws IOException {
        CharSequenceTranslator translator = new PassthroughTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedNonZero_replacesText() throws IOException {
        CharSequenceTranslator translator = new ReplacingTranslator("foo", "bar");
        StringWriter writer = new StringWriter();
        translator.translate("123foo456foo", writer);
        assertEquals("123bar456bar", writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedSupplementaryCharacter_replacesAndAdvancesCorrectly() throws IOException {
        String emoji = "\uD83D\uDE00";
        CharSequenceTranslator translator = new ReplacingTranslator(emoji, "[smile]");
        StringWriter writer = new StringWriter();
        translator.translate("A" + emoji + "B", writer);
        assertEquals("A[smile]B", writer.toString());
    }

    @Test
    public void testWith_emptyTranslatorsArray() {
        CharSequenceTranslator t1 = new ReplacingTranslator("a", "1");
        CharSequenceTranslator combined = t1.with();
        assertNotNull(combined);
        assertEquals("1b", combined.translate("ab"));
    }

    @Test
    public void testWith_multipleTranslatorsChain() {
        CharSequenceTranslator t1 = new ReplacingTranslator("a", "1");
        CharSequenceTranslator t2 = new ReplacingTranslator("b", "2");
        CharSequenceTranslator t3 = new ReplacingTranslator("c", "3");

        CharSequenceTranslator combined = t1.with(t2, t3);
        assertNotNull(combined);
        assertEquals("123d", combined.translate("abcd"));
    }

    @Test
    public void testHex_zero() {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHex_positiveAscii() {
        assertEquals("41", CharSequenceTranslator.hex(65));
        assertEquals("61", CharSequenceTranslator.hex(97).toUpperCase());
    }

    @Test
    public void testHex_supplementaryCodePoint() {
        assertEquals("1F600", CharSequenceTranslator.hex(0x1F600));
    }

    @Test
    public void testHex_negativeValue() {
        assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
    }

    @Test
    public void testHex_extremeValues() {
        assertEquals("7FFFFFFF", CharSequenceTranslator.hex(Integer.MAX_VALUE));
        assertEquals("80000000", CharSequenceTranslator.hex(Integer.MIN_VALUE));
    }
}
