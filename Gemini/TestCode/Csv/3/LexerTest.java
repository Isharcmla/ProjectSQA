package org.apache.commons.csv;

import static org.apache.commons.csv.Constants.BACKSPACE;
import static org.apache.commons.csv.Constants.CR;
import static org.apache.commons.csv.Constants.END_OF_STREAM;
import static org.apache.commons.csv.Constants.FF;
import static org.apache.commons.csv.Constants.LF;
import static org.apache.commons.csv.Constants.TAB;
import static org.apache.commons.csv.Constants.UNDEFINED;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;
import org.junit.Test;

public class LexerTest {

    private static class TestLexer extends Lexer {
        TestLexer(final CSVFormat format, final ExtendedBufferedReader in) {
            super(format, in);
        }

        @Override
        Token nextToken(final Token reusableToken) throws IOException {
            return reusableToken;
        }
    }

    private TestLexer createLexer(final String input, final CSVFormat format) {
        final ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(input));
        return new TestLexer(format, reader);
    }

    @Test
    public void testGetLineNumber_initialAndRead_correctLineNumber() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT;
        final TestLexer lexer = createLexer("a\nb\nc", format);
        assertEquals(0, lexer.getLineNumber());
        lexer.in.readLine();
        assertEquals(1, lexer.getLineNumber());
        lexer.in.readLine();
        assertEquals(2, lexer.getLineNumber());
    }

    @Test
    public void testReadEscape_allSupportedSequences_returnsExpectedChar() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');

        TestLexer lexer = createLexer("r", format);
        assertEquals(CR, lexer.readEscape());

        lexer = createLexer("n", format);
        assertEquals(LF, lexer.readEscape());

        lexer = createLexer("t", format);
        assertEquals(TAB, lexer.readEscape());

        lexer = createLexer("b", format);
        assertEquals(BACKSPACE, lexer.readEscape());

        lexer = createLexer("f", format);
        assertEquals(FF, lexer.readEscape());

        lexer = createLexer("\r", format);
        assertEquals(CR, lexer.readEscape());

        lexer = createLexer("\n", format);
        assertEquals(LF, lexer.readEscape());

        lexer = createLexer("\f", format);
        assertEquals(FF, lexer.readEscape());

        lexer = createLexer("\t", format);
        assertEquals(TAB, lexer.readEscape());

        lexer = createLexer("\b", format);
        assertEquals(BACKSPACE, lexer.readEscape());

        lexer = createLexer("a", format);
        assertEquals('a', lexer.readEscape());

        lexer = createLexer("\\", format);
        assertEquals('\\', lexer.readEscape());
    }

    @Test(expected = IOException.class)
    public void testReadEscape_endOfStream_throwsIOException() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        final TestLexer lexer = createLexer("", format);
        lexer.readEscape();
    }

    @Test
    public void testTrimTrailingSpaces_variousBuffers_trimmedCorrectly() {
        final CSVFormat format = CSVFormat.DEFAULT;
        final TestLexer lexer = createLexer("", format);

        final StringBuilder empty = new StringBuilder();
        lexer.trimTrailingSpaces(empty);
        assertEquals("", empty.toString());

        final StringBuilder noTrailing = new StringBuilder("abc");
        lexer.trimTrailingSpaces(noTrailing);
        assertEquals("abc", noTrailing.toString());

        final StringBuilder withSpaces = new StringBuilder("abc   ");
        lexer.trimTrailingSpaces(withSpaces);
        assertEquals("abc", withSpaces.toString());

        final StringBuilder withMixedWhitespace = new StringBuilder("abc \t\n\r");
        lexer.trimTrailingSpaces(withMixedWhitespace);
        assertEquals("abc", withMixedWhitespace.toString());

        final StringBuilder onlyWhitespace = new StringBuilder("   \t ");
        lexer.trimTrailingSpaces(onlyWhitespace);
        assertEquals("", onlyWhitespace.toString());
    }

    @Test
    public void testReadEndOfLine_crlf_consumesLfAndReturnsTrue() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT;
        final TestLexer lexer = createLexer("\nremaining", format);
        final boolean isEol = lexer.readEndOfLine(CR);
        assertTrue(isEol);
        assertEquals('r', lexer.in.read());
    }

    @Test
    public void testReadEndOfLine_crOnly_returnsTrue() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT;
        final TestLexer lexer = createLexer("a", format);
        final boolean isEol = lexer.readEndOfLine(CR);
        assertTrue(isEol);
        assertEquals('a', lexer.in.read());
    }

    @Test
    public void testReadEndOfLine_lfOnly_returnsTrue() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT;
        final TestLexer lexer = createLexer("a", format);
        final boolean isEol = lexer.readEndOfLine(LF);
        assertTrue(isEol);
        assertEquals('a', lexer.in.read());
    }

    @Test
    public void testReadEndOfLine_regularCharacter_returnsFalse() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT;
        final TestLexer lexer = createLexer("bc", format);
        final boolean isEol = lexer.readEndOfLine('a');
        assertFalse(isEol);
        assertEquals('b', lexer.in.read());
    }

    @Test
    public void testIsWhitespace_delimiterIsComma_identifiesWhitespaces() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        final TestLexer lexer = createLexer("", format);

        assertTrue(lexer.isWhitespace(' '));
        assertTrue(lexer.isWhitespace('\t'));
        assertTrue(lexer.isWhitespace('\n'));
        assertTrue(lexer.isWhitespace('\r'));
        assertFalse(lexer.isWhitespace(','));
        assertFalse(lexer.isWhitespace('a'));
    }

    @Test
    public void testIsWhitespace_delimiterIsSpace_spaceIsNotWhitespace() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(' ');
        final TestLexer lexer = createLexer("", format);

        assertFalse(lexer.isWhitespace(' '));
        assertTrue(lexer.isWhitespace('\t'));
        assertFalse(lexer.isWhitespace('x'));
    }

    @Test
    public void testIsStartOfLine_variousChars_correctClassification() {
        final CSVFormat format = CSVFormat.DEFAULT;
        final TestLexer lexer = createLexer("", format);

        assertTrue(lexer.isStartOfLine(LF));
        assertTrue(lexer.isStartOfLine(CR));
        assertTrue(lexer.isStartOfLine(UNDEFINED));
        assertFalse(lexer.isStartOfLine(' '));
        assertFalse(lexer.isStartOfLine('a'));
        assertFalse(lexer.isStartOfLine(END_OF_STREAM));
    }

    @Test
    public void testIsEndOfFile_variousChars_correctClassification() {
        final CSVFormat format = CSVFormat.DEFAULT;
        final TestLexer lexer = createLexer("", format);

        assertTrue(lexer.isEndOfFile(END_OF_STREAM));
        assertFalse(lexer.isEndOfFile(0));
        assertFalse(lexer.isEndOfFile('a'));
        assertFalse(lexer.isEndOfFile(LF));
    }

    @Test
    public void testIsDelimiter_configuredDelimiter_matchesCorrectly() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        final TestLexer lexer = createLexer("", format);

        assertTrue(lexer.isDelimiter(';'));
        assertFalse(lexer.isDelimiter(','));
        assertFalse(lexer.isDelimiter(' '));
    }

    @Test
    public void testIsEscape_withAndWithoutEscapeChar_matchesCorrectly() {
        final CSVFormat withEscape = CSVFormat.DEFAULT.withEscape('\\');
        final TestLexer lexerWithEscape = createLexer("", withEscape);
        assertTrue(lexerWithEscape.isEscape('\\'));
        assertFalse(lexerWithEscape.isEscape('/'));

        final CSVFormat withoutEscape = CSVFormat.DEFAULT.withEscape((Character) null);
        final TestLexer lexerWithoutEscape = createLexer("", withoutEscape);
        assertFalse(lexerWithoutEscape.isEscape('\\'));
        assertFalse(lexerWithoutEscape.isEscape('\ufffe'));
    }

    @Test
    public void testIsQuoteChar_withAndWithoutQuoteChar_matchesCorrectly() {
        final CSVFormat withQuote = CSVFormat.DEFAULT.withQuote('\'');
        final TestLexer lexerWithQuote = createLexer("", withQuote);
        assertTrue(lexerWithQuote.isQuoteChar('\''));
        assertFalse(lexerWithQuote.isQuoteChar('"'));

        final CSVFormat withoutQuote = CSVFormat.DEFAULT.withQuote((Character) null);
        final TestLexer lexerWithoutQuote = createLexer("", withoutQuote);
        assertFalse(lexerWithoutQuote.isQuoteChar('"'));
        assertFalse(lexerWithoutQuote.isQuoteChar('\''));
    }

    @Test
    public void testIsCommentStart_withAndWithoutCommentStart_matchesCorrectly() {
        final CSVFormat withComment = CSVFormat.DEFAULT.withCommentStart('#');
        final TestLexer lexerWithComment = createLexer("", withComment);
        assertTrue(lexerWithComment.isCommentStart('#'));
        assertFalse(lexerWithComment.isCommentStart('!'));

        final CSVFormat withoutComment = CSVFormat.DEFAULT.withCommentStart((Character) null);
        final TestLexer lexerWithoutComment = createLexer("", withoutComment);
        assertFalse(lexerWithoutComment.isCommentStart('#'));
    }

    @Test
    public void testFormatFieldAssignments_surroundingSpacesAndEmptyLines() {
        final CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true).withIgnoreEmptyLines(false);
        final TestLexer lexer = createLexer("", format);

        assertTrue(lexer.ignoreSurroundingSpaces);
        assertFalse(lexer.ignoreEmptyLines);
        assertEquals(format, lexer.format);
    }
}
