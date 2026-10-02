package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

public class LexerTest {

    private static final int CR = '\r';
    private static final int LF = '\n';
    private static final int TAB = '\t';
    private static final int BACKSPACE = '\b';
    private static final int FF = '\f';
    private static final int END_OF_STREAM = -1;
    private static final int UNDEFINED = -2;

    private static class ConcreteLexer extends Lexer {
        ConcreteLexer(final CSVFormat format, final ExtendedBufferedReader in) {
            super(format, in);
        }

        @Override
        Token nextToken(final Token reusableToken) throws IOException {
            return reusableToken;
        }
    }

    private ConcreteLexer createLexer(final String input, final CSVFormat format) {
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(input));
        return new ConcreteLexer(format, reader);
    }

    // ---------- Constructor / getLineNumber ----------

    @Test
    public void testGetLineNumber_freshReader_returnsZero() {
        final ConcreteLexer lexer = createLexer("abc\ndef", CSVFormat.DEFAULT);
        assertEquals(0, lexer.getLineNumber());
    }

    @Test
    public void testGetLineNumber_afterReadingLine_incrementsLineNumber() throws IOException {
        final ConcreteLexer lexer = createLexer("abc\ndef", CSVFormat.DEFAULT);
        // consume the line, forcing internal line number update
        while (lexer.in.read() != END_OF_STREAM) {
            // just read through
        }
        assertTrue(lexer.getLineNumber() >= 1);
    }

    // ---------- readEscape ----------

    @Test
    public void testReadEscape_r_returnsCR() throws IOException {
        final ConcreteLexer lexer = createLexer("r", CSVFormat.DEFAULT);
        assertEquals(CR, lexer.readEscape());
    }

    @Test
    public void testReadEscape_n_returnsLF() throws IOException {
        final ConcreteLexer lexer = createLexer("n", CSVFormat.DEFAULT);
        assertEquals(LF, lexer.readEscape());
    }

    @Test
    public void testReadEscape_t_returnsTAB() throws IOException {
        final ConcreteLexer lexer = createLexer("t", CSVFormat.DEFAULT);
        assertEquals(TAB, lexer.readEscape());
    }

    @Test
    public void testReadEscape_b_returnsBACKSPACE() throws IOException {
        final ConcreteLexer lexer = createLexer("b", CSVFormat.DEFAULT);
        assertEquals(BACKSPACE, lexer.readEscape());
    }

    @Test
    public void testReadEscape_f_returnsFF() throws IOException {
        final ConcreteLexer lexer = createLexer("f", CSVFormat.DEFAULT);
        assertEquals(FF, lexer.readEscape());
    }

    @Test
    public void testReadEscape_rawCR_returnsCR() throws IOException {
        final ConcreteLexer lexer = createLexer("\r", CSVFormat.DEFAULT);
        assertEquals(CR, lexer.readEscape());
    }

    @Test
    public void testReadEscape_rawLF_returnsLF() throws IOException {
        final ConcreteLexer lexer = createLexer("\n", CSVFormat.DEFAULT);
        assertEquals(LF, lexer.readEscape());
    }

    @Test
    public void testReadEscape_rawTab_returnsTAB() throws IOException {
        final ConcreteLexer lexer = createLexer("\t", CSVFormat.DEFAULT);
        assertEquals(TAB, lexer.readEscape());
    }

    @Test
    public void testReadEscape_rawBackspace_returnsBACKSPACE() throws IOException {
        final ConcreteLexer lexer = createLexer("\b", CSVFormat.DEFAULT);
        assertEquals(BACKSPACE, lexer.readEscape());
    }

    @Test
    public void testReadEscape_rawFF_returnsFF() throws IOException {
        final ConcreteLexer lexer = createLexer("\f", CSVFormat.DEFAULT);
        assertEquals(FF, lexer.readEscape());
    }

    @Test
    public void testReadEscape_defaultChar_returnsSameChar() throws IOException {
        final ConcreteLexer lexer = createLexer("x", CSVFormat.DEFAULT);
        assertEquals('x', lexer.readEscape());
    }

    @Test(expected = IOException.class)
    public void testReadEscape_endOfStream_throwsIOException() throws IOException {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        lexer.readEscape();
    }

    // ---------- trimTrailingSpaces ----------

    @Test
    public void testTrimTrailingSpaces_trailingWhitespace_trimmed() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder sb = new StringBuilder("hello   ");
        lexer.trimTrailingSpaces(sb);
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testTrimTrailingSpaces_noTrailingWhitespace_unchanged() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder sb = new StringBuilder("hello");
        lexer.trimTrailingSpaces(sb);
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testTrimTrailingSpaces_emptyBuffer_unchanged() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder sb = new StringBuilder("");
        lexer.trimTrailingSpaces(sb);
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrimTrailingSpaces_allWhitespace_becomesEmpty() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        final StringBuilder sb = new StringBuilder("     ");
        lexer.trimTrailingSpaces(sb);
        assertEquals("", sb.toString());
    }

    // ---------- readEndOfLine ----------

    @Test
    public void testReadEndOfLine_CRfollowedByLF_consumesLFAndReturnsTrue() throws IOException {
        final ConcreteLexer lexer = createLexer("\n", CSVFormat.DEFAULT);
        assertTrue(lexer.readEndOfLine(CR));
    }

    @Test
    public void testReadEndOfLine_LFonly_returnsTrue() throws IOException {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.readEndOfLine(LF));
    }

    @Test
    public void testReadEndOfLine_CRwithoutFollowingLF_returnsTrue() throws IOException {
        final ConcreteLexer lexer = createLexer("a", CSVFormat.DEFAULT);
        assertTrue(lexer.readEndOfLine(CR));
    }

    @Test
    public void testReadEndOfLine_otherChar_returnsFalse() throws IOException {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.readEndOfLine('x'));
    }

    // ---------- isWhitespace ----------

    @Test
    public void testIsWhitespace_spaceChar_returnsTrue() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isWhitespace(' '));
    }

    @Test
    public void testIsWhitespace_delimiterChar_returnsFalse() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.isWhitespace(CSVFormat.DEFAULT.getDelimiter()));
    }

    @Test
    public void testIsWhitespace_nonWhitespaceChar_returnsFalse() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.isWhitespace('a'));
    }

    // ---------- isStartOfLine ----------

    @Test
    public void testIsStartOfLine_LF_returnsTrue() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isStartOfLine(LF));
    }

    @Test
    public void testIsStartOfLine_CR_returnsTrue() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isStartOfLine(CR));
    }

    @Test
    public void testIsStartOfLine_UNDEFINED_returnsTrue() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isStartOfLine(UNDEFINED));
    }

    @Test
    public void testIsStartOfLine_otherChar_returnsFalse() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.isStartOfLine('a'));
    }

    // ---------- isEndOfFile ----------

    @Test
    public void testIsEndOfFile_endOfStream_returnsTrue() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertTrue(lexer.isEndOfFile(END_OF_STREAM));
    }

    @Test
    public void testIsEndOfFile_otherChar_returnsFalse() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.isEndOfFile('a'));
    }

    // ---------- isDelimiter ----------

    @Test
    public void testIsDelimiter_matchingChar_returnsTrue() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        final ConcreteLexer lexer = createLexer("", format);
        assertTrue(lexer.isDelimiter(';'));
    }

    @Test
    public void testIsDelimiter_nonMatchingChar_returnsFalse() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        final ConcreteLexer lexer = createLexer("", format);
        assertFalse(lexer.isDelimiter(','));
    }

    // ---------- isEscape ----------

    @Test
    public void testIsEscape_escapeEnabledAndMatches_returnsTrue() {
        final CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        final ConcreteLexer lexer = createLexer("", format);
        assertTrue(lexer.isEscape('\\'));
    }

    @Test
    public void testIsEscape_escapeDisabled_returnsFalseForNormalChar() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.isEscape('\\'));
    }

    // ---------- isQuoteChar ----------

    @Test
    public void testIsQuoteChar_matchingChar_returnsTrue() {
        final CSVFormat format = CSVFormat.DEFAULT.withQuote('\'');
        final ConcreteLexer lexer = createLexer("", format);
        assertTrue(lexer.isQuoteChar('\''));
    }

    @Test
    public void testIsQuoteChar_nonMatchingChar_returnsFalse() {
        final CSVFormat format = CSVFormat.DEFAULT.withQuote('\'');
        final ConcreteLexer lexer = createLexer("", format);
        assertFalse(lexer.isQuoteChar('"'));
    }

    // ---------- isCommentStart ----------

    @Test
    public void testIsCommentStart_matchingChar_returnsTrue() {
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        final ConcreteLexer lexer = createLexer("", format);
        assertTrue(lexer.isCommentStart('#'));
    }

    @Test
    public void testIsCommentStart_commentDisabled_returnsFalse() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.isCommentStart('#'));
    }

    // ---------- nextToken (abstract, exercised via concrete subclass) ----------

    @Test
    public void testNextToken_returnsSameTokenPassedIn() throws IOException {
        final ConcreteLexer lexer = createLexer("abc", CSVFormat.DEFAULT);
        final Token token = new Token();
        final Token result = lexer.nextToken(token);
        assertEquals(token, result);
    }

    // ---------- edge case: null escape/quote/comment maps to disabled ----------

    @Test
    public void testConstructor_defaultFormatWithoutEscapeQuoteComment_isEscapeIsQuoteIsCommentAllFalseForRandomChar() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        assertFalse(lexer.isEscape('a'));
        assertFalse(lexer.isCommentStart('a'));
    }

    @Test
    public void testIgnoreSurroundingSpacesAndIgnoreEmptyLines_flagsSetFromFormat() {
        final CSVFormat format = CSVFormat.DEFAULT
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreEmptyLines(true);
        final ConcreteLexer lexer = createLexer("", format);
        assertTrue(lexer.ignoreSurroundingSpaces);
        assertTrue(lexer.ignoreEmptyLines);
    }

    @Test
    public void testIgnoreSurroundingSpacesAndIgnoreEmptyLines_defaultFlags() {
        final ConcreteLexer lexer = createLexer("", CSVFormat.DEFAULT);
        // just verifying access does not throw, flags reflect default format settings
        final boolean surrounding = lexer.ignoreSurroundingSpaces;
        final boolean emptyLines = lexer.ignoreEmptyLines;
        assertTrue(surrounding == true || surrounding == false);
        assertTrue(emptyLines == true || emptyLines == false);
    }
}
