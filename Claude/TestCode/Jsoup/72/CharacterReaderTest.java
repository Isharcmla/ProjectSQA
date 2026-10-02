package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class CharacterReaderTest {

    // Helper: Reader that does not support mark
    private static class NonMarkSupportedReader extends StringReader {
        NonMarkSupportedReader(String s) {
            super(s);
        }
        @Override
        public boolean markSupported() {
            return false;
        }
    }

    // Helper: Reader that throws IOException on read
    private static class ThrowingReader extends Reader {
        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("boom");
        }
        @Override
        public void close() throws IOException {
        }
        @Override
        public boolean markSupported() {
            return true;
        }
        @Override
        public void mark(int readAheadLimit) throws IOException {
        }
        @Override
        public void reset() throws IOException {
        }
    }

    private String generateLongString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        return sb.toString();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_withString_initializesCorrectly() {
        CharacterReader reader = new CharacterReader("hello");
        assertEquals(0, reader.pos());
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testConstructor_withEmptyString_isEmptyTrue() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withNullReader_throwsException() {
        new CharacterReader((Reader) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withNonMarkSupportedReader_throwsException() {
        new CharacterReader(new NonMarkSupportedReader("hello"));
    }

    @Test(expected = org.jsoup.UncheckedIOException.class)
    public void testConstructor_readerThrowsIOException_wrappedAsUncheckedIOException() {
        new CharacterReader(new ThrowingReader());
    }

    @Test
    public void testConstructor_withReaderAndSize_initializesCorrectly() {
        CharacterReader reader = new CharacterReader(new StringReader("abcdef"), 10);
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testConstructor_withSizeGreaterThanMaxBuffer_capsBuffer() {
        CharacterReader reader = new CharacterReader(new StringReader("abc"), CharacterReader.maxBufferLen + 100);
        assertFalse(reader.isEmpty());
    }

    // ---------- pos() ----------

    @Test
    public void testPos_initial_returnsZero() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());
    }

    @Test
    public void testPos_afterAdvance_returnsUpdatedPosition() {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals(1, reader.pos());
    }

    // ---------- isEmpty() ----------

    @Test
    public void testIsEmpty_emptyString_returnsTrue() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testIsEmpty_nonEmptyString_returnsFalse() {
        CharacterReader reader = new CharacterReader("x");
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testIsEmpty_afterConsumingAll_returnsTrue() {
        CharacterReader reader = new CharacterReader("x");
        reader.consume();
        assertTrue(reader.isEmpty());
    }

    // ---------- current() ----------

    @Test
    public void testCurrent_normalInput_returnsFirstChar() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
    }

    @Test
    public void testCurrent_emptyInput_returnsEOF() {
        CharacterReader reader = new CharacterReader("");
        assertEquals(CharacterReader.EOF, reader.current());
    }

    // ---------- consume() ----------

    @Test
    public void testConsume_normalInput_returnsCharAndAdvances() {
        CharacterReader reader = new CharacterReader("ab");
        char c = reader.consume();
        assertEquals('a', c);
        assertEquals(1, reader.pos());
    }

    @Test
    public void testConsume_atEnd_returnsEOF() {
        CharacterReader reader = new CharacterReader("a");
        reader.consume();
        char c = reader.consume();
        assertEquals(CharacterReader.EOF, c);
    }

    // ---------- unconsume() ----------

    @Test
    public void testUnconsume_afterConsume_movesBack() {
        CharacterReader reader = new CharacterReader("ab");
        reader.consume();
        reader.unconsume();
        assertEquals('a', reader.current());
    }

    // ---------- advance() ----------

    @Test
    public void testAdvance_movesPositionForward() {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals('b', reader.current());
    }

    // ---------- mark()/rewindToMark() ----------

    @Test
    public void testMark_rewindToMark_returnsToMarkedPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.advance();
        reader.mark();
        reader.advance();
        reader.advance();
        reader.rewindToMark();
        assertEquals('b', reader.current());
    }

    // ---------- nextIndexOf(char) ----------

    @Test
    public void testNextIndexOfChar_found_returnsOffset() {
        CharacterReader reader = new CharacterReader("abcdef");
        int idx = reader.nextIndexOf('d');
        assertEquals(3, idx);
    }

    @Test
    public void testNextIndexOfChar_notFound_returnsNegativeOne() {
        CharacterReader reader = new CharacterReader("abcdef");
        int idx = reader.nextIndexOf('z');
        assertEquals(-1, idx);
    }

    // ---------- nextIndexOf(CharSequence) ----------

    @Test
    public void testNextIndexOfCharSequence_found_returnsOffset() {
        CharacterReader reader = new CharacterReader("hello world");
        int idx = reader.nextIndexOf("world");
        assertEquals(6, idx);
    }

    @Test
    public void testNextIndexOfCharSequence_notFound_returnsNegativeOne() {
        CharacterReader reader = new CharacterReader("hello world");
        int idx = reader.nextIndexOf("xyz");
        assertEquals(-1, idx);
    }

    @Test
    public void testNextIndexOfCharSequence_partialMatchThenMismatch_returnsNegativeOne() {
        CharacterReader reader = new CharacterReader("aabaac");
        int idx = reader.nextIndexOf("aac");
        assertEquals(3, idx);
    }

    // ---------- consumeTo(char) ----------

    @Test
    public void testConsumeToChar_found_returnsSubstring() {
        CharacterReader reader = new CharacterReader("abc,def");
        String result = reader.consumeTo(',');
        assertEquals("abc", result);
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToChar_notFound_returnsRestOfString() {
        CharacterReader reader = new CharacterReader("abcdef");
        String result = reader.consumeTo('z');
        assertEquals("abcdef", result);
        assertTrue(reader.isEmpty());
    }

    // ---------- consumeTo(String) ----------

    @Test
    public void testConsumeToString_found_returnsSubstring() {
        CharacterReader reader = new CharacterReader("hello world");
        String result = reader.consumeTo("world");
        assertEquals("hello ", result);
    }

    @Test
    public void testConsumeToString_notFound_returnsRestOfString() {
        CharacterReader reader = new CharacterReader("hello world");
        String result = reader.consumeTo("xyz");
        assertEquals("hello world", result);
        assertTrue(reader.isEmpty());
    }

    // ---------- consumeToAny(char...) ----------

    @Test
    public void testConsumeToAny_matchesDelimiter_returnsPrefix() {
        CharacterReader reader = new CharacterReader("abc<def");
        String result = reader.consumeToAny('<', '&');
        assertEquals("abc", result);
        assertEquals('<', reader.current());
    }

    @Test
    public void testConsumeToAny_noMatch_returnsFullString() {
        CharacterReader reader = new CharacterReader("abcdef");
        String result = reader.consumeToAny('<', '&');
        assertEquals("abcdef", result);
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAny_emptyAtStart_returnsEmptyString() {
        CharacterReader reader = new CharacterReader("<abc");
        String result = reader.consumeToAny('<');
        assertEquals("", result);
    }

    // ---------- consumeToAnySorted(char...) ----------

    @Test
    public void testConsumeToAnySorted_matchesDelimiter_returnsPrefix() {
        CharacterReader reader = new CharacterReader("abc<def");
        char[] sorted = {'&', '<'};
        String result = reader.consumeToAnySorted(sorted);
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeToAnySorted_noMatch_returnsFullString() {
        CharacterReader reader = new CharacterReader("abcdef");
        char[] sorted = {'&', '<'};
        String result = reader.consumeToAnySorted(sorted);
        assertEquals("abcdef", result);
    }

    // ---------- consumeData() ----------

    @Test
    public void testConsumeData_stopsAtAmpersand() {
        CharacterReader reader = new CharacterReader("abc&def");
        String result = reader.consumeData();
        assertEquals("abc", result);
        assertEquals('&', reader.current());
    }

    @Test
    public void testConsumeData_stopsAtLessThan() {
        CharacterReader reader = new CharacterReader("abc<def");
        String result = reader.consumeData();
        assertEquals("abc", result);
        assertEquals('<', reader.current());
    }

    @Test
    public void testConsumeData_stopsAtNullChar() {
        CharacterReader reader = new CharacterReader("abc\u0000def");
        String result = reader.consumeData();
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeData_noDelimiter_returnsFullString() {
        CharacterReader reader = new CharacterReader("abcdef");
        String result = reader.consumeData();
        assertEquals("abcdef", result);
    }

    // ---------- consumeTagName() ----------

    @Test
    public void testConsumeTagName_stopsAtWhitespace() {
        CharacterReader reader = new CharacterReader("div class");
        String result = reader.consumeTagName();
        assertEquals("div", result);
    }

    @Test
    public void testConsumeTagName_stopsAtSlash() {
        CharacterReader reader = new CharacterReader("div/");
        String result = reader.consumeTagName();
        assertEquals("div", result);
    }

    @Test
    public void testConsumeTagName_stopsAtGreaterThan() {
        CharacterReader reader = new CharacterReader("div>");
        String result = reader.consumeTagName();
        assertEquals("div", result);
    }

    @Test
    public void testConsumeTagName_noDelimiter_returnsFullString() {
        CharacterReader reader = new CharacterReader("div");
        String result = reader.consumeTagName();
        assertEquals("div", result);
    }

    // ---------- consumeToEnd() ----------

    @Test
    public void testConsumeToEnd_returnsRemaining() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.advance();
        String result = reader.consumeToEnd();
        assertEquals("bcdef", result);
        assertTrue(reader.isEmpty());
    }

    // ---------- consumeLetterSequence() ----------

    @Test
    public void testConsumeLetterSequence_lettersOnly() {
        CharacterReader reader = new CharacterReader("abcDEF123");
        String result = reader.consumeLetterSequence();
        assertEquals("abcDEF", result);
    }

    @Test
    public void testConsumeLetterSequence_noLetters_returnsEmpty() {
        CharacterReader reader = new CharacterReader("123abc");
        String result = reader.consumeLetterSequence();
        assertEquals("", result);
    }

    // ---------- consumeLetterThenDigitSequence() ----------

    @Test
    public void testConsumeLetterThenDigitSequence_mixed() {
        CharacterReader reader = new CharacterReader("abc123xyz");
        String result = reader.consumeLetterThenDigitSequence();
        assertEquals("abc123", result);
    }

    @Test
    public void testConsumeLetterThenDigitSequence_onlyLetters() {
        CharacterReader reader = new CharacterReader("abcxyz");
        String result = reader.consumeLetterThenDigitSequence();
        assertEquals("abcxyz", result);
    }

    // ---------- consumeHexSequence() ----------

    @Test
    public void testConsumeHexSequence_hexChars() {
        CharacterReader reader = new CharacterReader("1A2fG");
        String result = reader.consumeHexSequence();
        assertEquals("1A2f", result);
    }

    @Test
    public void testConsumeHexSequence_noHex_returnsEmpty() {
        CharacterReader reader = new CharacterReader("G123");
        String result = reader.consumeHexSequence();
        assertEquals("", result);
    }

    // ---------- consumeDigitSequence() ----------

    @Test
    public void testConsumeDigitSequence_digits() {
        CharacterReader reader = new CharacterReader("123abc");
        String result = reader.consumeDigitSequence();
        assertEquals("123", result);
    }

    @Test
    public void testConsumeDigitSequence_noDigits_returnsEmpty() {
        CharacterReader reader = new CharacterReader("abc123");
        String result = reader.consumeDigitSequence();
        assertEquals("", result);
    }

    // ---------- matches(char) ----------

    @Test
    public void testMatchesChar_true() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
    }

    @Test
    public void testMatchesChar_false() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matches('b'));
    }

    @Test
    public void testMatchesChar_emptyReader_returnsFalse() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matches('a'));
    }

    // ---------- matches(String) ----------

    @Test
    public void testMatchesString_true() {
        CharacterReader reader = new CharacterReader("hello world");
        assertTrue(reader.matches("hello"));
    }

    @Test
    public void testMatchesString_false() {
        CharacterReader reader = new CharacterReader("hello world");
        assertFalse(reader.matches("world"));
    }

    @Test
    public void testMatchesString_longerThanRemaining_returnsFalse() {
        CharacterReader reader = new CharacterReader("hi");
        assertFalse(reader.matches("hello"));
    }

    // ---------- matchesIgnoreCase(String) ----------

    @Test
    public void testMatchesIgnoreCase_true() {
        CharacterReader reader = new CharacterReader("HELLO world");
        assertTrue(reader.matchesIgnoreCase("hello"));
    }

    @Test
    public void testMatchesIgnoreCase_false() {
        CharacterReader reader = new CharacterReader("HELLO world");
        assertFalse(reader.matchesIgnoreCase("world"));
    }

    @Test
    public void testMatchesIgnoreCase_longerThanRemaining_returnsFalse() {
        CharacterReader reader = new CharacterReader("hi");
        assertFalse(reader.matchesIgnoreCase("hello"));
    }

    // ---------- matchesAny(char...) ----------

    @Test
    public void testMatchesAny_true() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAny('x', 'a', 'z'));
    }

    @Test
    public void testMatchesAny_false() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAny_emptyReader_returnsFalse() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesAny('x', 'y'));
    }

    // ---------- matchesAnySorted(char[]) ----------

    @Test
    public void testMatchesAnySorted_true() {
        CharacterReader reader = new CharacterReader("abc");
        char[] sorted = {'a', 'x', 'z'};
        assertTrue(reader.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesAnySorted_false() {
        CharacterReader reader = new CharacterReader("abc");
        char[] sorted = {'x', 'y', 'z'};
        assertFalse(reader.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesAnySorted_emptyReader_returnsFalse() {
        CharacterReader reader = new CharacterReader("");
        char[] sorted = {'x', 'y', 'z'};
        assertFalse(reader.matchesAnySorted(sorted));
    }

    // ---------- matchesLetter() ----------

    @Test
    public void testMatchesLetter_true() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetter_false() {
        CharacterReader reader = new CharacterReader("123");
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetter_emptyReader_returnsFalse() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesLetter());
    }

    // ---------- matchesDigit() ----------

    @Test
    public void testMatchesDigit_true() {
        CharacterReader reader = new CharacterReader("123");
        assertTrue(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigit_false() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigit_emptyReader_returnsFalse() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesDigit());
    }

    // ---------- matchConsume(String) ----------

    @Test
    public void testMatchConsume_success_advancesPos() {
        CharacterReader reader = new CharacterReader("hello world");
        boolean matched = reader.matchConsume("hello");
        assertTrue(matched);
        assertEquals(5, reader.pos());
    }

    @Test
    public void testMatchConsume_fail_doesNotAdvance() {
        CharacterReader reader = new CharacterReader("hello world");
        boolean matched = reader.matchConsume("world");
        assertFalse(matched);
        assertEquals(0, reader.pos());
    }

    // ---------- matchConsumeIgnoreCase(String) ----------

    @Test
    public void testMatchConsumeIgnoreCase_success() {
        CharacterReader reader = new CharacterReader("HELLO world");
        boolean matched = reader.matchConsumeIgnoreCase("hello");
        assertTrue(matched);
        assertEquals(5, reader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase_fail() {
        CharacterReader reader = new CharacterReader("HELLO world");
        boolean matched = reader.matchConsumeIgnoreCase("world");
        assertFalse(matched);
        assertEquals(0, reader.pos());
    }

    // ---------- containsIgnoreCase(String) ----------

    @Test
    public void testContainsIgnoreCase_foundLowerCase_returnsTrue() {
        CharacterReader reader = new CharacterReader("some text </title> more");
        assertTrue(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_foundUpperCase_returnsTrue() {
        CharacterReader reader = new CharacterReader("some text </TITLE> more");
        assertTrue(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_notFound_returnsFalse() {
        CharacterReader reader = new CharacterReader("some text here");
        assertFalse(reader.containsIgnoreCase("</title>"));
    }

    // ---------- toString() ----------

    @Test
    public void testToString_returnsRemainingContent() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.advance();
        assertEquals("bcdef", reader.toString());
    }

    @Test
    public void testToString_emptyReader_returnsEmptyString() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.toString());
    }

    // ---------- rangeEquals ----------

    @Test
    public void testRangeEquals_equal_true() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.rangeEquals(0, 3, "abc"));
    }

    @Test
    public void testRangeEquals_notEqual_false() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.rangeEquals(0, 3, "xyz"));
    }

    @Test
    public void testRangeEquals_differentLength_false() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.rangeEquals(0, 3, "abcd"));
    }

    // ---------- caching behavior with long strings (> maxStringCacheLen) ----------

    @Test
    public void testConsumeTo_longStringNotCached_stillCorrect() {
        String longPrefix = "abcdefghijklmnopqrstuvwxyz"; // > 12 chars
        CharacterReader reader = new CharacterReader(longPrefix + ",rest");
        String result = reader.consumeTo(',');
        assertEquals(longPrefix, result);
    }

    // ---------- large buffer / multiple bufferUp calls ----------

    @Test
    public void testConsume_largeInput_triggersBufferRefill() {
        int length = 40000; // greater than maxBufferLen
        String longStr = generateLongString(length);
        CharacterReader reader = new CharacterReader(new StringReader(longStr));
        StringBuilder sb = new StringBuilder();
        while (!reader.isEmpty()) {
            sb.append(reader.consume());
        }
        assertEquals(longStr, sb.toString());
    }

    @Test
    public void testConsumeToEnd_largeInput_returnsFullRemaining() {
        int length = 40000;
        String longStr = generateLongString(length);
        CharacterReader reader = new CharacterReader(new StringReader(longStr));
        String result = reader.consumeToEnd();
        assertEquals(longStr, result);
    }
}
