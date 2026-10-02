package org.apache.commons.lang3.text.translate;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class CharSequenceTranslatorTest {

    private static class PassthroughTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    private static class CustomTranslator extends CharSequenceTranslator {
        private final String match;
        private final String replacement;
        private final int consumeCount;

        CustomTranslator(String match, String replacement, int consumeCount) {
            this.match = match;
            this.replacement = replacement;
            this.consumeCount = consumeCount;
        }

        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (input.toString().startsWith(match, index)) {
                out.write(replacement);
                return consumeCount;
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
    public void testTranslate_NullInput_ReturnsNull() {
        CharSequenceTranslator translator = new PassthroughTranslator();
        Assert.assertNull(translator.translate(null));
    }

    @Test
    public void testTranslate_EmptyString_ReturnsEmptyString() {
        CharSequenceTranslator translator = new PassthroughTranslator();
        Assert.assertEquals("", translator.translate(""));
    }

    @Test
    public void testTranslate_NoMatch_ReturnsOriginalString() {
        CharSequenceTranslator translator = new PassthroughTranslator();
        Assert.assertEquals("Hello World", translator.translate("Hello World"));
    }

    @Test
    public void testTranslate_WithMatches_ReturnsTranslatedString() {
        CharSequenceTranslator translator = new CustomTranslator("foo", "bar", 3);
        Assert.assertEquals("bar and bar", translator.translate("foo and foo"));
    }

    @Test(expected = RuntimeException.class)
    public void testTranslate_IOExceptionThrown_ThrowsRuntimeException() {
        CharSequenceTranslator translator = new ExceptionTranslator();
        translator.translate("trigger exception");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTranslateWriter_NullWriter_ThrowsIllegalArgumentException() throws IOException {
        CharSequenceTranslator translator = new PassthroughTranslator();
        translator.translate("test", null);
    }

    @Test
    public void testTranslateWriter_NullInput_DoesNotWriteAnything() throws IOException {
        CharSequenceTranslator translator = new PassthroughTranslator();
        StringWriter writer = new StringWriter();
        translator.translate(null, writer);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_EmptyInput_DoesNotWriteAnything() throws IOException {
        CharSequenceTranslator translator = new PassthroughTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("", writer);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_ConsumedZero_WritesCodePoint() throws IOException {
        CharSequenceTranslator translator = new PassthroughTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("abc", writer);
        Assert.assertEquals("abc", writer.toString());
    }

    @Test
    public void testTranslateWriter_ConsumedBranchPosLessThanLenMinusTwo() throws IOException {
        CharSequenceTranslator translator = new CustomTranslator("ab", "X", 2);
        StringWriter writer = new StringWriter();
        // Input length: 6 characters. At pos 0: pos < 6 - 2 (0 < 4) is true.
        translator.translate("abcdef", writer);
        Assert.assertEquals("Xcdef", writer.toString());
    }

    @Test
    public void testTranslateWriter_ConsumedBranchPosGreaterThanOrEqualToLenMinusTwo() throws IOException {
        CharSequenceTranslator translator = new CustomTranslator("ef", "Z", 2);
        StringWriter writer = new StringWriter();
        // Input length: 6 characters. At pos 4: pos < 6 - 2 (4 < 4) is false, taking the else branch.
        translator.translate("abcdef", writer);
        Assert.assertEquals("abcdZ", writer.toString());
    }

    @Test
    public void testTranslateWriter_SupplementaryCharacters() throws IOException {
        // \uD83D\uDE00 is grinning face emoji (surrogate pair, 1 codepoint)
        String emoji = "\uD83D\uDE00";
        CharSequenceTranslator translator = new PassthroughTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("Hi " + emoji + " End", writer);
        Assert.assertEquals("Hi " + emoji + " End", writer.toString());
    }

    @Test
    public void testTranslateWriter_SupplementaryCharactersWithTranslation() throws IOException {
        String emoji = "\uD83D\uDE00";
        CharSequenceTranslator translator = new CustomTranslator(emoji, "[smile]", 2);
        StringWriter writer = new StringWriter();
        translator.translate("A" + emoji + "B", writer);
        Assert.assertEquals("A[smile]B", writer.toString());
    }

    @Test
    public void testWith_SingleTranslatorMerged() {
        CharSequenceTranslator t1 = new CustomTranslator("a", "1", 1);
        CharSequenceTranslator t2 = new CustomTranslator("b", "2", 1);
        CharSequenceTranslator merged = t1.with(t2);

        Assert.assertNotNull(merged);
        Assert.assertEquals("12c", merged.translate("abc"));
    }

    @Test
    public void testWith_MultipleTranslatorsMerged() {
        CharSequenceTranslator t1 = new CustomTranslator("a", "1", 1);
        CharSequenceTranslator t2 = new CustomTranslator("b", "2", 1);
        CharSequenceTranslator t3 = new CustomTranslator("c", "3", 1);
        CharSequenceTranslator merged = t1.with(t2, t3);

        Assert.assertNotNull(merged);
        Assert.assertEquals("123", merged.translate("abc"));
    }

    @Test
    public void testWith_EmptyArrayMerged() {
        CharSequenceTranslator t1 = new CustomTranslator("a", "1", 1);
        CharSequenceTranslator merged = t1.with();

        Assert.assertNotNull(merged);
        Assert.assertEquals("1bc", merged.translate("abc"));
    }

    @Test
    public void testHex_Zero() {
        Assert.assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHex_PositiveAscii() {
        Assert.assertEquals("41", CharSequenceTranslator.hex(65));
        Assert.assertEquals("61", CharSequenceTranslator.hex(97).toUpperCase());
        Assert.assertEquals("20", CharSequenceTranslator.hex(' '));
    }

    @Test
    public void testHex_NegativeNumber() {
        Assert.assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
        Assert.assertEquals("FFFFFFFE", CharSequenceTranslator.hex(-2));
    }

    @Test
    public void testHex_SupplementaryCodePoint() {
        Assert.assertEquals("1F600", CharSequenceTranslator.hex(0x1F600));
        Assert.assertEquals("FFFF", CharSequenceTranslator.hex(0xFFFF));
    }
}
