package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class CharacterReaderTest {

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorWithReaderAndSize_normal() {
        CharacterReader r = new CharacterReader(new StringReader("hello"), 10);
        assertEquals("hello", r.toString());
    }

    @Test
    public void testConstructorWithReader_default() {
        CharacterReader r = new CharacterReader(new StringReader("hello world"));
        assertEquals("hello world", r.toString());
    }

    @Test
    public void testConstructorWithString_normal() {
        CharacterReader r = new CharacterReader("sample text");
        assertEquals("sample text", r.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsException() {
        new CharacterReader((Reader) null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_markNotSupported_throwsException() {
        Reader unsupported = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return -1;
            }

            @Override
            public void close() throws IOException {
            }

            @Override
            public boolean markSupported() {
                return false;
            }
        };
        new CharacterReader(unsupported, 10);
    }

    @Test(expected = org.jsoup.UncheckedIOException.class)
    public void testConstructor_ioExceptionDuringBufferUp_throwsUncheckedIOException() {
        Reader throwing = new Reader() {
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
        };
        new CharacterReader(throwing, 10);
    }

    @Test
    public void testConstructor_sizeGreaterThanMaxBufferLen_capped() {
        // Builds a string larger than maxBufferLen to force multiple internal buffer refills
        int size = CharacterReader.maxBufferLen + 1000;
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        String input = sb.toString();
        CharacterReader r = new CharacterReader(input);
        String consumed = r.consumeToEnd();
        assertEquals(input.length(), consumed.length());
        assertEquals(input, consumed);
        assertTrue(r.isEmpty());
    }

    // ---------- pos() ----------

    @Test
    public void testPos_initial_returnsZero() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals(0, r.pos());
    }

    @Test
    public void testPos_afterConsume_increments() {
        CharacterReader r = new CharacterReader("abc");
        r.consume();
        r.consume();
        assertEquals(2, r.pos());
    }

    // ---------- isEmpty() ----------

    @Test
    public void testIsEmpty_emptyString_true() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
    }

    @Test
    public void testIsEmpty_nonEmptyString_false() {
        CharacterReader r = new CharacterReader("a");
        assertFalse(r.isEmpty());
    }

    // ---------- current() ----------

    @Test
    public void testCurrent_normal() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals('a', r.current());
    }

    @Test
    public void testCurrent_atEnd_returnsEOF() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.current());
    }

    // ---------- consume() ----------

    @Test
    public void testConsume_normal() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals('a', r.consume());
        assertEquals('b', r.consume());
    }

    @Test
    public void testConsume_atEnd_returnsEOF() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.consume());
    }

    // ---------- unconsume() ----------

    @Test
    public void testUnconsume_afterConsume_returnsToPreviousChar() {
        CharacterReader r = new CharacterReader("ab");
        r.consume();
        r.unconsume();
        assertEquals('a', r.current());
    }

    // ---------- advance() ----------

    @Test
    public void testAdvance_movesPositionForward() {
        CharacterReader r = new CharacterReader("abc");
        r.advance();
        assertEquals(1, r.pos());
    }

    // ---------- mark()/rewindToMark() ----------

    @Test
    public void testMarkAndRewindToMark() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        r.consume();
        r.mark();
        r.consume();
        r.consume();
        r.rewindToMark();
        assertEquals('c', r.current());
    }

    // ---------- nextIndexOf(char) ----------

    @Test
    public void testNextIndexOfChar_found() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals(3, r.nextIndexOf('d'));
    }

    @Test
    public void testNextIndexOfChar_notFound() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals(-1, r.nextIndexOf('z'));
    }

    // ---------- nextIndexOf(CharSequence) ----------

    @Test
    public void testNextIndexOfCharSequence_found() {
        CharacterReader r = new CharacterReader("abcdefgh");
        assertEquals(2, r.nextIndexOf("cde"));
    }

    @Test
    public void testNextIndexOfCharSequence_notFound() {
        CharacterReader r = new CharacterReader("abcdefgh");
        assertEquals(-1, r.nextIndexOf("xyz"));
    }

    @Test
    public void testNextIndexOfCharSequence_partialMatchFails() {
        CharacterReader r = new CharacterReader("aabxaaby");
        assertEquals(3, r.nextIndexOf("xaab"));
    }

    // ---------- consumeTo(char) ----------

    @Test
    public void testConsumeToChar_found() {
        CharacterReader r = new CharacterReader("abc,def");
        String consumed = r.consumeTo(',');
        assertEquals("abc", consumed);
        assertEquals(',', r.current());
    }

    @Test
    public void testConsumeToChar_notFound_consumesToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        String consumed = r.consumeTo('z');
        assertEquals("abcdef", consumed);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeTo(String) ----------

    @Test
    public void testConsumeToString_found() {
        CharacterReader r = new CharacterReader("hello world");
        String consumed = r.consumeTo("world");
        assertEquals("hello ", consumed);
    }

    @Test
    public void testConsumeToString_notFound() {
        CharacterReader r = new CharacterReader("hello there");
        String consumed = r.consumeTo("xyz");
        assertEquals("hello there", consumed);
    }

    // ---------- consumeToAny(char...) ----------

    @Test
    public void testConsumeToAny_found() {
        CharacterReader r = new CharacterReader("abc<def");
        String consumed = r.consumeToAny('<', '&');
        assertEquals("abc", consumed);
    }

    @Test
    public void testConsumeToAny_notFound() {
        CharacterReader r = new CharacterReader("abcdef");
        String consumed = r.consumeToAny('<', '&');
        assertEquals("abcdef", consumed);
    }

    @Test
    public void testConsumeToAny_immediateMatch_returnsEmpty() {
        CharacterReader r = new CharacterReader("<abc");
        String consumed = r.consumeToAny('<');
        assertEquals("", consumed);
    }

    // ---------- consumeToAnySorted ----------

    @Test
    public void testConsumeToAnySorted_found() {
        CharacterReader r = new CharacterReader("abc<def");
        char[] chars = {'&', '<'};
        String consumed = r.consumeToAnySorted(chars);
        assertEquals("abc", consumed);
    }

    // ---------- consumeData ----------

    @Test
    public void testConsumeData_stopsAtAmpersand() {
        CharacterReader r = new CharacterReader("abc&amp;def");
        String consumed = r.consumeData();
        assertEquals("abc", consumed);
    }

    @Test
    public void testConsumeData_stopsAtLessThan() {
        CharacterReader r = new CharacterReader("abc<def");
        String consumed = r.consumeData();
        assertEquals("abc", consumed);
    }

    @Test
    public void testConsumeData_stopsAtNullChar() {
        CharacterReader r = new CharacterReader("abc\u0000def");
        String consumed = r.consumeData();
        assertEquals("abc", consumed);
    }

    @Test
    public void testConsumeData_noDelimiter_consumesAll() {
        CharacterReader r = new CharacterReader("abcdef");
        String consumed = r.consumeData();
        assertEquals("abcdef", consumed);
    }

    // ---------- consumeTagName ----------

    @Test
    public void testConsumeTagName_stopsAtSpace() {
        CharacterReader r = new CharacterReader("div class");
        String consumed = r.consumeTagName();
        assertEquals("div", consumed);
    }

    @Test
    public void testConsumeTagName_stopsAtSlash() {
        CharacterReader r = new CharacterReader("div/>");
        String consumed = r.consumeTagName();
        assertEquals("div", consumed);
    }

    @Test
    public void testConsumeTagName_stopsAtGreaterThan() {
        CharacterReader r = new CharacterReader("div>");
        String consumed = r.consumeTagName();
        assertEquals("div", consumed);
    }

    // ---------- consumeToEnd ----------

    @Test
    public void testConsumeToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        String consumed = r.consumeToEnd();
        assertEquals("bcdef", consumed);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeLetterSequence ----------

    @Test
    public void testConsumeLetterSequence_lettersOnly() {
        CharacterReader r = new CharacterReader("abcDEF123");
        String consumed = r.consumeLetterSequence();
        assertEquals("abcDEF", consumed);
    }

    @Test
    public void testConsumeLetterSequence_unicodeLetter() {
        CharacterReader r = new CharacterReader("caf\u00e9123");
        String consumed = r.consumeLetterSequence();
        assertEquals("caf\u00e9", consumed);
    }

    @Test
    public void testConsumeLetterSequence_noLetters_returnsEmpty() {
        CharacterReader r = new CharacterReader("123abc");
        String consumed = r.consumeLetterSequence();
        assertEquals("", consumed);
    }

    // ---------- consumeLetterThenDigitSequence ----------

    @Test
    public void testConsumeLetterThenDigitSequence_normal() {
        CharacterReader r = new CharacterReader("abc123def");
        String consumed = r.consumeLetterThenDigitSequence();
        assertEquals("abc123", consumed);
    }

    @Test
    public void testConsumeLetterThenDigitSequence_onlyLetters() {
        CharacterReader r = new CharacterReader("abcdef");
        String consumed = r.consumeLetterThenDigitSequence();
        assertEquals("abcdef", consumed);
    }

    @Test
    public void testConsumeLetterThenDigitSequence_lettersThenEnd() {
        CharacterReader r = new CharacterReader("abc");
        String consumed = r.consumeLetterThenDigitSequence();
        assertEquals("abc", consumed);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeHexSequence ----------

    @Test
    public void testConsumeHexSequence_normal() {
        CharacterReader r = new CharacterReader("1A2Fgh");
        String consumed = r.consumeHexSequence();
        assertEquals("1A2F", consumed);
    }

    @Test
    public void testConsumeHexSequence_noHex_returnsEmpty() {
        CharacterReader r = new CharacterReader("ghij");
        String consumed = r.consumeHexSequence();
        assertEquals("", consumed);
    }

    // ---------- consumeDigitSequence ----------

    @Test
    public void testConsumeDigitSequence_normal() {
        CharacterReader r = new CharacterReader("12345abc");
        String consumed = r.consumeDigitSequence();
        assertEquals("12345", consumed);
    }

    @Test
    public void testConsumeDigitSequence_noDigits_returnsEmpty() {
        CharacterReader r = new CharacterReader("abc123");
        String consumed = r.consumeDigitSequence();
        assertEquals("", consumed);
    }

    // ---------- matches(char) ----------

    @Test
    public void testMatchesChar_true() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matches('a'));
    }

    @Test
    public void testMatchesChar_false() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matches('b'));
    }

    @Test
    public void testMatchesChar_empty_false() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matches('a'));
    }

    // ---------- matches(String) ----------

    @Test
    public void testMatchesString_true() {
        CharacterReader r = new CharacterReader("hello world");
        assertTrue(r.matches("hello"));
    }

    @Test
    public void testMatchesString_false() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matches("world"));
    }

    @Test
    public void testMatchesString_longerThanRemaining_false() {
        CharacterReader r = new CharacterReader("hi");
        assertFalse(r.matches("hello"));
    }

    // ---------- matchesIgnoreCase ----------

    @Test
    public void testMatchesIgnoreCase_true() {
        CharacterReader r = new CharacterReader("HELLO world");
        assertTrue(r.matchesIgnoreCase("hello"));
    }

    @Test
    public void testMatchesIgnoreCase_false() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matchesIgnoreCase("world"));
    }

    @Test
    public void testMatchesIgnoreCase_longerThanRemaining_false() {
        CharacterReader r = new CharacterReader("hi");
        assertFalse(r.matchesIgnoreCase("hello"));
    }

    // ---------- matchesAny ----------

    @Test
    public void testMatchesAny_true() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesAny('x', 'a', 'z'));
    }

    @Test
    public void testMatchesAny_false() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAny_empty_false() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAny('a', 'b'));
    }

    // ---------- matchesAnySorted ----------

    @Test
    public void testMatchesAnySorted_true() {
        CharacterReader r = new CharacterReader("abc");
        char[] sorted = {'a', 'm', 'z'};
        assertTrue(r.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesAnySorted_false() {
        CharacterReader r = new CharacterReader("abc");
        char[] sorted = {'x', 'y', 'z'};
        assertFalse(r.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesAnySorted_empty_false() {
        CharacterReader r = new CharacterReader("");
        char[] sorted = {'a', 'b'};
        assertFalse(r.matchesAnySorted(sorted));
    }

    // ---------- matchesLetter ----------

    @Test
    public void testMatchesLetter_true() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesLetter());
    }

    @Test
    public void testMatchesLetter_false() {
        CharacterReader r = new CharacterReader("123");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchesLetter_empty_false() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesLetter());
    }

    // ---------- matchesDigit ----------

    @Test
    public void testMatchesDigit_true() {
        CharacterReader r = new CharacterReader("123");
        assertTrue(r.matchesDigit());
    }

    @Test
    public void testMatchesDigit_false() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesDigit());
    }

    @Test
    public void testMatchesDigit_empty_false() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesDigit());
    }

    // ---------- matchConsume ----------

    @Test
    public void testMatchConsume_true() {
        CharacterReader r = new CharacterReader("hello world");
        assertTrue(r.matchConsume("hello"));
        assertEquals(' ', r.current());
    }

    @Test
    public void testMatchConsume_false() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matchConsume("world"));
        assertEquals(0, r.pos());
    }

    // ---------- matchConsumeIgnoreCase ----------

    @Test
    public void testMatchConsumeIgnoreCase_true() {
        CharacterReader r = new CharacterReader("HELLO world");
        assertTrue(r.matchConsumeIgnoreCase("hello"));
        assertEquals(' ', r.current());
    }

    @Test
    public void testMatchConsumeIgnoreCase_false() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matchConsumeIgnoreCase("world"));
        assertEquals(0, r.pos());
    }

    // ---------- containsIgnoreCase ----------

    @Test
    public void testContainsIgnoreCase_lowercaseMatch_true() {
        CharacterReader r = new CharacterReader("some </title> text");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_uppercaseMatch_true() {
        CharacterReader r = new CharacterReader("some </TITLE> text");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_notFound_false() {
        CharacterReader r = new CharacterReader("some text without tag");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsRemainingContent() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        r.consume();
        assertEquals("cdef", r.toString());
    }

    // ---------- rangeEquals ----------

    @Test
    public void testRangeEquals_true() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.rangeEquals(0, 3, "abc"));
    }

    @Test
    public void testRangeEquals_falseDueToDifferentContent() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.rangeEquals(0, 3, "xyz"));
    }

    @Test
    public void testRangeEquals_falseDueToDifferentLength() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.rangeEquals(0, 3, "abcd"));
    }

    // ---------- cacheString related branch coverage ----------

    @Test
    public void testConsumeTo_longStringBeyondCacheLimit() {
        String longStr = "abcdefghijklmnopqrstuvwxyz"; // length > 12
        CharacterReader r = new CharacterReader(longStr + ",end");
        String consumed = r.consumeTo(',');
        assertEquals(longStr, consumed);
    }

    @Test
    public void testConsumeToAny_emptyResultBranch() {
        CharacterReader r = new CharacterReader("");
        String consumed = r.consumeToAny('a', 'b');
        assertEquals("", consumed);
    }
}
