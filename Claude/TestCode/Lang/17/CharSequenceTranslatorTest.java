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

    /**
     * Translator that simply echoes a single char (one codepoint) back to the writer.
     * Always consumes exactly 1 codepoint.
     */
    private static class EchoTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            int cp = Character.codePointAt(input, index);
            char[] c = Character.toChars(cp);
            out.write(c);
            return 1;
        }
    }

    /**
     * Translator that never consumes anything (always returns 0),
     * forcing the caller (translate(CharSequence, Writer)) to write the original char itself.
     */
    private static class ZeroConsumeTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    /**
     * Translator that consumes the entire input (all codepoints) in a single call,
     * writing an uppercased version of the whole string.
     */
    private static class ConsumeAllTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (index != 0) {
                return 0;
            }
            String s = input.toString().toUpperCase();
            out.write(s);
            return Character.codePointCount(input, 0, input.length());
        }
    }

    /**
     * Translator that always throws an IOException to test exception propagation.
     */
    private static class ThrowingTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            throw new IOException("boom");
        }
    }

    // ---------- translate(CharSequence) ----------

    @Test
    public void testTranslateCharSequence_null_returnsNull() {
        CharSequenceTranslator t = new EchoTranslator();
        assertNull(t.translate((CharSequence) null));
    }

    @Test
    public void testTranslateCharSequence_emptyString_returnsEmptyString() {
        CharSequenceTranslator t = new EchoTranslator();
        String result = t.translate("");
        assertEquals("", result);
    }

    @Test
    public void testTranslateCharSequence_normalInput_echoesBackSameString() {
        CharSequenceTranslator t = new EchoTranslator();
        String result = t.translate("abc");
        assertEquals("abc", result);
    }

    @Test
    public void testTranslateCharSequence_zeroConsumeTranslator_writesOriginalChars() {
        CharSequenceTranslator t = new ZeroConsumeTranslator();
        String result = t.translate("xyz");
        assertEquals("xyz", result);
    }

    @Test
    public void testTranslateCharSequence_consumeAllTranslator_consumesEntireInput() {
        CharSequenceTranslator t = new ConsumeAllTranslator();
        String result = t.translate("abcd");
        assertEquals("ABCD", result);
    }

    @Test
    public void testTranslateCharSequence_surrogatePair_roundTripsCorrectly() {
        CharSequenceTranslator t = new EchoTranslator();
        String input = "\uD83D\uDE00A"; // emoji codepoint + 'A'
        String result = t.translate(input);
        assertEquals(input, result);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateCharSequence_ioExceptionThrown_wrappedAsRuntimeException() {
        CharSequenceTranslator t = new ThrowingTranslator();
        t.translate("a");
    }

    // ---------- translate(CharSequence, Writer) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testTranslateCharSequenceWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        CharSequenceTranslator t = new EchoTranslator();
        t.translate("abc", (Writer) null);
    }

    @Test
    public void testTranslateCharSequenceWriter_nullInput_doesNothing() throws IOException {
        CharSequenceTranslator t = new EchoTranslator();
        StringWriter sw = new StringWriter();
        t.translate((CharSequence) null, sw);
        assertEquals("", sw.toString());
    }

    @Test
    public void testTranslateCharSequenceWriter_normalInput_writesExpectedOutput() throws IOException {
        CharSequenceTranslator t = new EchoTranslator();
        StringWriter sw = new StringWriter();
        t.translate("hello", sw);
        assertEquals("hello", sw.toString());
    }

    @Test
    public void testTranslateCharSequenceWriter_zeroConsume_writesOriginalCharDirectly() throws IOException {
        CharSequenceTranslator t = new ZeroConsumeTranslator();
        StringWriter sw = new StringWriter();
        t.translate("q", sw);
        assertEquals("q", sw.toString());
    }

    @Test
    public void testTranslateCharSequenceWriter_consumeAll_writesUppercasedOutput() throws IOException {
        CharSequenceTranslator t = new ConsumeAllTranslator();
        StringWriter sw = new StringWriter();
        t.translate("abcd", sw);
        assertEquals("ABCD", sw.toString());
    }

    @Test(expected = IOException.class)
    public void testTranslateCharSequenceWriter_ioExceptionPropagated() throws IOException {
        CharSequenceTranslator t = new ThrowingTranslator();
        StringWriter sw = new StringWriter();
        t.translate("a", sw);
    }

    @Test
    public void testTranslateCharSequenceWriter_emptyInput_writesNothing() throws IOException {
        CharSequenceTranslator t = new EchoTranslator();
        StringWriter sw = new StringWriter();
        t.translate("", sw);
        assertEquals("", sw.toString());
    }

    // ---------- with(...) ----------

    @Test
    public void testWith_mergeWithAnotherTranslator_returnsNonNullAggregateTranslator() {
        CharSequenceTranslator t1 = new EchoTranslator();
        CharSequenceTranslator t2 = new ZeroConsumeTranslator();
        CharSequenceTranslator merged = t1.with(t2);
        assertNotNull(merged);
        assertTrue(merged instanceof CharSequenceTranslator);
    }

    @Test
    public void testWith_mergeWithNoAdditionalTranslators_returnsNonNullAggregateTranslator() {
        CharSequenceTranslator t1 = new EchoTranslator();
        CharSequenceTranslator merged = t1.with();
        assertNotNull(merged);
        assertTrue(merged instanceof CharSequenceTranslator);
    }

    @Test
    public void testWith_mergeWithMultipleTranslators_returnsNonNullAggregateTranslator() {
        CharSequenceTranslator t1 = new EchoTranslator();
        CharSequenceTranslator t2 = new ZeroConsumeTranslator();
        CharSequenceTranslator t3 = new ConsumeAllTranslator();
        CharSequenceTranslator merged = t1.with(t2, t3);
        assertNotNull(merged);
        assertTrue(merged instanceof CharSequenceTranslator);
    }

    // ---------- hex(int) ----------

    @Test
    public void testHex_normalPositiveCodepoint_returnsUpperCaseHex() {
        assertEquals("41", CharSequenceTranslator.hex(65));
    }

    @Test
    public void testHex_zero_returnsZeroString() {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHex_negativeCodepoint_returnsUpperCaseHexOfTwosComplement() {
        assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
    }

    @Test
    public void testHex_largeCodepoint_returnsUpperCaseHex() {
        assertEquals("1F600", CharSequenceTranslator.hex(0x1F600));
    }

    // ---------- abstract method sanity (via concrete subclass) ----------

    @Test
    public void testTranslateAbstractMethod_directCall_returnsExpectedConsumedCount() throws IOException {
        CharSequenceTranslator t = new EchoTranslator();
        StringWriter sw = new StringWriter();
        int consumed = t.translate("abc", 1, sw);
        assertEquals(1, consumed);
        assertEquals("b", sw.toString());
    }

    @Test
    public void testTranslateAbstractMethod_zeroConsumeDirectCall_returnsZero() throws IOException {
        CharSequenceTranslator t = new ZeroConsumeTranslator();
        StringWriter sw = new StringWriter();
        int consumed = t.translate("abc", 0, sw);
        assertEquals(0, consumed);
        assertEquals("", sw.toString());
    }

    @Test
    public void testTranslateAbstractMethod_throwsIOExceptionDirectly() {
        CharSequenceTranslator t = new ThrowingTranslator();
        StringWriter sw = new StringWriter();
        try {
            t.translate("a", 0, sw);
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            assertEquals("boom", e.getMessage());
        }
    }
}
