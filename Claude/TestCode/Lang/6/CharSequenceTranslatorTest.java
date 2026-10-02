import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.apache.commons.lang3.text.translate.CharSequenceTranslator;

public class CharSequenceTranslatorTest {

    // A translator that consumes nothing, forcing the default char-write path
    private static class NoOpTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    // A translator that consumes the whole character (1 codepoint) and writes uppercase
    private static class UpperCaseTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            char c = input.charAt(index);
            out.write(Character.toUpperCase(c));
            return 1;
        }
    }

    // A translator that always throws IOException
    private static class ThrowingTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            throw new IOException("Simulated IO failure");
        }
    }

    // A translator that replaces the character 'a' with "XX" and consumes 1, others consume 0
    private static class ReplaceATranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            char c = input.charAt(index);
            if (c == 'a') {
                out.write("XX");
                return 1;
            }
            return 0;
        }
    }

    private NoOpTranslator noOpTranslator;
    private UpperCaseTranslator upperCaseTranslator;
    private ThrowingTranslator throwingTranslator;
    private ReplaceATranslator replaceATranslator;

    @Before
    public void setUp() {
        noOpTranslator = new NoOpTranslator();
        upperCaseTranslator = new UpperCaseTranslator();
        throwingTranslator = new ThrowingTranslator();
        replaceATranslator = new ReplaceATranslator();
    }

    // ---------- translate(CharSequence) tests ----------

    @Test
    public void testTranslateCharSequence_nullInput_returnsNull() {
        String result = upperCaseTranslator.translate((CharSequence) null);
        assertNull(result);
    }

    @Test
    public void testTranslateCharSequence_normalInput_returnsTranslatedString() {
        String result = upperCaseTranslator.translate("hello");
        assertEquals("HELLO", result);
    }

    @Test
    public void testTranslateCharSequence_emptyInput_returnsEmptyString() {
        String result = upperCaseTranslator.translate("");
        assertEquals("", result);
    }

    @Test
    public void testTranslateCharSequence_noOpTranslator_returnsInputUnchanged() {
        String result = noOpTranslator.translate("abc");
        assertEquals("abc", result);
    }

    @Test
    public void testTranslateCharSequence_withIOException_throwsRuntimeException() {
        try {
            throwingTranslator.translate("a");
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertTrue(e.getCause() instanceof IOException);
        }
    }

    @Test
    public void testTranslateCharSequence_replaceATranslator_mixedConsumption() {
        String result = replaceATranslator.translate("bac");
        assertEquals("bXXc", result);
    }

    // ---------- translate(CharSequence, Writer) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testTranslateCharSequenceWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        upperCaseTranslator.translate("abc", (Writer) null);
    }

    @Test
    public void testTranslateCharSequenceWriter_nullInput_doesNothing() throws IOException {
        StringWriter writer = new StringWriter();
        upperCaseTranslator.translate((CharSequence) null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateCharSequenceWriter_emptyInput_writesNothing() throws IOException {
        StringWriter writer = new StringWriter();
        upperCaseTranslator.translate("", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateCharSequenceWriter_normalInput_writesTranslatedOutput() throws IOException {
        StringWriter writer = new StringWriter();
        upperCaseTranslator.translate("world", writer);
        assertEquals("WORLD", writer.toString());
    }

    @Test
    public void testTranslateCharSequenceWriter_noOpTranslator_writesOriginalChars() throws IOException {
        StringWriter writer = new StringWriter();
        noOpTranslator.translate("xyz", writer);
        assertEquals("xyz", writer.toString());
    }

    @Test
    public void testTranslateCharSequenceWriter_withSurrogatePair_handlesCorrectly() throws IOException {
        // Supplementary character (surrogate pair) e.g. U+1F600 (emoji)
        String input = new String(Character.toChars(0x1F600));
        StringWriter writer = new StringWriter();
        noOpTranslator.translate(input, writer);
        assertEquals(input, writer.toString());
    }

    @Test(expected = IOException.class)
    public void testTranslateCharSequenceWriter_throwingTranslator_propagatesIOException() throws IOException {
        StringWriter writer = new StringWriter();
        throwingTranslator.translate("a", writer);
    }

    @Test
    public void testTranslateCharSequenceWriter_replaceATranslator_mixedConsumption() throws IOException {
        StringWriter writer = new StringWriter();
        replaceATranslator.translate("bac", writer);
        assertEquals("bXXc", writer.toString());
    }

    // ---------- with(...) tests ----------

    @Test
    public void testWith_mergesTranslators_producesAggregateTranslator() {
        CharSequenceTranslator merged = upperCaseTranslator.with(noOpTranslator);
        assertNotNull(merged);
        assertTrue(merged instanceof org.apache.commons.lang3.text.translate.AggregateTranslator);
    }

    @Test
    public void testWith_noAdditionalTranslators_stillProducesAggregateTranslator() {
        CharSequenceTranslator merged = upperCaseTranslator.with();
        assertNotNull(merged);
        assertTrue(merged instanceof org.apache.commons.lang3.text.translate.AggregateTranslator);
    }

    @Test
    public void testWith_mergedTranslatorFunctionality_worksAsExpected() {
        CharSequenceTranslator merged = upperCaseTranslator.with(noOpTranslator);
        String result = merged.translate("test");
        assertEquals("TEST", result);
    }

    // ---------- hex(...) tests ----------

    @Test
    public void testHex_typicalCodepoint_returnsUpperCaseHex() {
        String result = CharSequenceTranslator.hex(65); // 'A'
        assertEquals("41", result);
    }

    @Test
    public void testHex_zeroCodepoint_returnsZero() {
        String result = CharSequenceTranslator.hex(0);
        assertEquals("0", result);
    }

    @Test
    public void testHex_largeCodepoint_returnsUpperCaseHex() {
        String result = CharSequenceTranslator.hex(0x1F600);
        assertEquals("1F600", result);
    }

    @Test
    public void testHex_negativeCodepoint_returnsHexRepresentation() {
        // Integer.toHexString handles negative numbers via two's complement representation
        String result = CharSequenceTranslator.hex(-1);
        assertEquals("FFFFFFFF", result);
    }
}
