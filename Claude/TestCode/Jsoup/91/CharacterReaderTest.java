package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class CharacterReaderTest {

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_withStringInput_initializesCorrectly() {
        CharacterReader reader = new CharacterReader("hello");
        assertEquals(0, reader.pos());
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testConstructor_withReaderAndSize_initializesCorrectly() {
        Reader input = new StringReader("test data");
        CharacterReader reader = new CharacterReader(input, 10);
        assertEquals(0, reader.pos());
    }

    @Test
    public void testConstructor_withReaderOnly_initializesCorrectly() {
        Reader input = new StringReader("test data");
        CharacterReader reader = new CharacterReader(input);
        assertEquals(0, reader.pos());
    }

    @Test
    public void testConstructor_withSizeGreaterThanMaxBufferLen_capsBuffer() {
        Reader input = new StringReader("small content");
        CharacterReader reader = new CharacterReader(input, CharacterReader.maxBufferLen + 1000);
        assertNotNull(reader);
    }

    @Test(expected = Exception.class)
    public void testConstructor_withNullReader_throwsException() {
        new CharacterReader((Reader) null, 10);
    }

    @Test(expected = Exception.class)
    public void testConstructor_withMarkNotSupported_throwsException() {
        Reader noMarkReader = new Reader() {
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
        new CharacterReader(noMarkReader, 10);
    }

    // ---------- pos() ----------

    @Test
    public void testPos_afterConsume_returnsIncrementedPosition() {
        CharacterReader reader = new CharacterReader("abc");
        reader.consume();
        assertEquals(1, reader.pos());
    }

    // ---------- isEmpty() ----------

    @Test
    public void testIsEmpty_withNonEmptyContent_returnsFalse() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testIsEmpty_afterConsumingAll_returnsTrue() {
        CharacterReader reader = new CharacterReader("ab");
        reader.consume();
        reader.consume();
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testIsEmpty_withEmptyString_returnsTrue() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
    }

    // ---------- current() ----------

    @Test
    public void testCurrent_withContent_returnsFirstChar() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
    }

    @Test
    public void testCurrent_atEnd_returnsEOF() {
        CharacterReader reader = new CharacterReader("a");
        reader.consume();
        assertEquals(CharacterReader.EOF, reader.current());
    }

    // ---------- consume() ----------

    @Test
    public void testConsume_normalInput_returnsCharsInSequence() {
        CharacterReader reader = new CharacterReader("ab");
        assertEquals('a', reader.consume());
        assertEquals('b', reader.consume());
    }

    @Test
    public void testConsume_atEOF_returnsEOF() {
        CharacterReader reader = new CharacterReader("a");
        reader.consume();
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    // ---------- unconsume() ----------

    @Test
    public void testUnconsume_afterConsume_movesBack() {
        CharacterReader reader = new CharacterReader("ab");
        reader.consume();
        reader.unconsume();
        assertEquals('a', reader.current());
    }

    @Test(expected = UncheckedIOException.class)
    public void testUnconsume_atStart_throwsUncheckedIOException() {
        CharacterReader reader = new CharacterReader("ab");
        reader.unconsume();
    }

    // ---------- advance() ----------

    @Test
    public void testAdvance_movesPositionForward() {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals('b', reader.current());
    }

    // ---------- mark() / rewindToMark() ----------

    @Test
    public void testMarkAndRewindToMark_afterConsuming_restoresPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.mark();
        reader.consume();
        reader.consume();
        reader.rewindToMark();
        assertEquals('a', reader.current());
    }

    @Test(expected = UncheckedIOException.class)
    public void testRewindToMark_withoutMark_throwsUncheckedIOException() {
        CharacterReader reader = new CharacterReader("abc");
        reader.rewindToMark();
    }

    // ---------- nextIndexOf(char) ----------

    @Test
    public void testNextIndexOfChar_found_returnsOffset() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals(3, reader.nextIndexOf('d'));
    }

    @Test
    public void testNextIndexOfChar_notFound_returnsNegativeOne() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals(-1, reader.nextIndexOf('z'));
    }

    // ---------- nextIndexOf(CharSequence) ----------

    @Test
    public void testNextIndexOfSequence_found_returnsOffset() {
        CharacterReader reader = new CharacterReader("abcdefgh");
        assertEquals(2, reader.nextIndexOf("cde"));
    }

    @Test
    public void testNextIndexOfSequence_notFound_returnsNegativeOne() {
        CharacterReader reader = new CharacterReader("abcdefgh");
        assertEquals(-1, reader.nextIndexOf("xyz"));
    }

    @Test
    public void testNextIndexOfSequence_atStart_returnsZero() {
        CharacterReader reader = new CharacterReader("abcdefgh");
        assertEquals(0, reader.nextIndexOf("abc"));
    }

    // ---------- consumeTo(char) ----------

    @Test
    public void testConsumeToChar_found_returnsConsumedString() {
        CharacterReader reader = new CharacterReader("abc,def");
        String result = reader.consumeTo(',');
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeToChar_notFound_consumesToEnd() {
        CharacterReader reader = new CharacterReader("abcdef");
        String result = reader.consumeTo('z');
        assertEquals("abcdef", result);
        assertTrue(reader.isEmpty());
    }

    // ---------- consumeTo(String) ----------

    @Test
    public void testConsumeToString_found_returnsConsumedString() {
        CharacterReader reader = new CharacterReader("abcXYZdef");
        String result = reader.consumeTo("XYZ");
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeToString_notFound_consumesToEnd() {
        CharacterReader reader = new CharacterReader("abcdef");
        String result = reader.consumeTo("ZZZ");
        assertEquals("abcdef", result);
    }

    // ---------- consumeToAny ----------

    @Test
    public void testConsumeToAny_delimiterFound_returnsConsumedString() {
        CharacterReader reader = new CharacterReader("abc<def");
        String result = reader.consumeToAny('<', '>');
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeToAny_noDelimiterFound_returnsEmptyAtStart() {
        CharacterReader reader = new CharacterReader("<abc");
        String result = reader.consumeToAny('<');
        assertEquals("", result);
    }

    @Test
    public void testConsumeToAny_noMatchInEntireString_consumesAll() {
        CharacterReader reader = new CharacterReader("abcdef");
        String result = reader.consumeToAny('<', '>');
        assertEquals("abcdef", result);
    }

    // ---------- consumeToAnySorted ----------

    @Test
    public void testConsumeToAnySorted_delimiterFound_returnsConsumedString() {
        CharacterReader reader = new CharacterReader("abc<def");
        char[] sorted = {'<', '>'};
        String result = reader.consumeToAnySorted(sorted);
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeToAnySorted_noneFound_consumesAll() {
        CharacterReader reader = new CharacterReader("abcdef");
        char[] sorted = {'<', '>'};
        String result = reader.consumeToAnySorted(sorted);
        assertEquals("abcdef", result);
    }

    // ---------- consumeData ----------

    @Test
    public void testConsumeData_stopsAtAmpersand_returnsConsumedData() {
        CharacterReader reader = new CharacterReader("abc&def");
        String result = reader.consumeData();
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeData_stopsAtLessThan_returnsConsumedData() {
        CharacterReader reader = new CharacterReader("abc<def");
        String result = reader.consumeData();
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeData_noSpecialChars_consumesAll() {
        CharacterReader reader = new CharacterReader("abcdef");
        String result = reader.consumeData();
        assertEquals("abcdef", result);
    }

    // ---------- consumeTagName ----------

    @Test
    public void testConsumeTagName_stopsAtSpace_returnsTagName() {
        CharacterReader reader = new CharacterReader("div class");
        String result = reader.consumeTagName();
        assertEquals("div", result);
    }

    @Test
    public void testConsumeTagName_stopsAtSlash_returnsTagName() {
        CharacterReader reader = new CharacterReader("br/>");
        String result = reader.consumeTagName();
        assertEquals("br", result);
    }

    @Test
    public void testConsumeTagName_noDelimiter_consumesAll() {
        CharacterReader reader = new CharacterReader("divtagname");
        String result = reader.consumeTagName();
        assertEquals("divtagname", result);
    }

    // ---------- consumeToEnd ----------

    @Test
    public void testConsumeToEnd_returnsRemainingContent() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume();
        String result = reader.consumeToEnd();
        assertEquals("bcdef", result);
        assertTrue(reader.isEmpty());
    }

    // ---------- consumeLetterSequence ----------

    @Test
    public void testConsumeLetterSequence_lettersOnly_returnsSequence() {
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

    // ---------- consumeLetterThenDigitSequence ----------

    @Test
    public void testConsumeLetterThenDigitSequence_lettersThenDigits_returnsBoth() {
        CharacterReader reader = new CharacterReader("abc123xyz");
        String result = reader.consumeLetterThenDigitSequence();
        assertEquals("abc123", result);
    }

    @Test
    public void testConsumeLetterThenDigitSequence_onlyLetters_returnsLetters() {
        CharacterReader reader = new CharacterReader("abcdef");
        String result = reader.consumeLetterThenDigitSequence();
        assertEquals("abcdef", result);
    }

    // ---------- consumeHexSequence ----------

    @Test
    public void testConsumeHexSequence_validHex_returnsHexChars() {
        CharacterReader reader = new CharacterReader("1A2Bxyz");
        String result = reader.consumeHexSequence();
        assertEquals("1A2B", result);
    }

    @Test
    public void testConsumeHexSequence_noHexChars_returnsEmpty() {
        CharacterReader reader = new CharacterReader("xyz");
        String result = reader.consumeHexSequence();
        assertEquals("", result);
    }

    // ---------- consumeDigitSequence ----------

    @Test
    public void testConsumeDigitSequence_digitsOnly_returnsDigits() {
        CharacterReader reader = new CharacterReader("12345abc");
        String result = reader.consumeDigitSequence();
        assertEquals("12345", result);
    }

    @Test
    public void testConsumeDigitSequence_noDigits_returnsEmpty() {
        CharacterReader reader = new CharacterReader("abc123");
        String result = reader.consumeDigitSequence();
        assertEquals("", result);
    }

    // ---------- matches(char) ----------

    @Test
    public void testMatchesChar_matchingChar_returnsTrue() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
    }

    @Test
    public void testMatchesChar_nonMatchingChar_returnsFalse() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matches('z'));
    }

    @Test
    public void testMatchesChar_whenEmpty_returnsFalse() {
        CharacterReader reader = new CharacterReader("a");
        reader.consume();
        assertFalse(reader.matches('a'));
    }

    // ---------- matches(String) ----------

    @Test
    public void testMatchesString_matchingSequence_returnsTrue() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
    }

    @Test
    public void testMatchesString_nonMatchingSequence_returnsFalse() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.matches("xyz"));
    }

    @Test
    public void testMatchesString_seqLongerThanRemaining_returnsFalse() {
        CharacterReader reader = new CharacterReader("ab");
        assertFalse(reader.matches("abcdef"));
    }

    // ---------- matchesIgnoreCase ----------

    @Test
    public void testMatchesIgnoreCase_differentCase_returnsTrue() {
        CharacterReader reader = new CharacterReader("ABCdef");
        assertTrue(reader.matchesIgnoreCase("abc"));
    }

    @Test
    public void testMatchesIgnoreCase_nonMatching_returnsFalse() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.matchesIgnoreCase("xyz"));
    }

    @Test
    public void testMatchesIgnoreCase_seqLongerThanRemaining_returnsFalse() {
        CharacterReader reader = new CharacterReader("ab");
        assertFalse(reader.matchesIgnoreCase("abcdef"));
    }

    // ---------- matchesAny ----------

    @Test
    public void testMatchesAny_matchingChar_returnsTrue() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAny('x', 'a', 'b'));
    }

    @Test
    public void testMatchesAny_noMatchingChar_returnsFalse() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAny_whenEmpty_returnsFalse() {
        CharacterReader reader = new CharacterReader("a");
        reader.consume();
        assertFalse(reader.matchesAny('a'));
    }

    // ---------- matchesAnySorted ----------

    @Test
    public void testMatchesAnySorted_matchingChar_returnsTrue() {
        CharacterReader reader = new CharacterReader("abc");
        char[] sorted = {'a', 'b', 'x'};
        assertTrue(reader.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesAnySorted_noMatch_returnsFalse() {
        CharacterReader reader = new CharacterReader("abc");
        char[] sorted = {'x', 'y', 'z'};
        assertFalse(reader.matchesAnySorted(sorted));
    }

    // ---------- matchesLetter ----------

    @Test
    public void testMatchesLetter_isLetter_returnsTrue() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetter_isNotLetter_returnsFalse() {
        CharacterReader reader = new CharacterReader("123");
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetter_whenEmpty_returnsFalse() {
        CharacterReader reader = new CharacterReader("a");
        reader.consume();
        assertFalse(reader.matchesLetter());
    }

    // ---------- matchesDigit ----------

    @Test
    public void testMatchesDigit_isDigit_returnsTrue() {
        CharacterReader reader = new CharacterReader("123");
        assertTrue(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigit_isNotDigit_returnsFalse() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigit_whenEmpty_returnsFalse() {
        CharacterReader reader = new CharacterReader("1");
        reader.consume();
        assertFalse(reader.matchesDigit());
    }

    // ---------- matchConsume ----------

    @Test
    public void testMatchConsume_matchingSequence_consumesAndReturnsTrue() {
        CharacterReader reader = new CharacterReader("abcdef");
        boolean result = reader.matchConsume("abc");
        assertTrue(result);
        assertEquals('d', reader.current());
    }

    @Test
    public void testMatchConsume_nonMatchingSequence_returnsFalseWithoutConsuming() {
        CharacterReader reader = new CharacterReader("abcdef");
        boolean result = reader.matchConsume("xyz");
        assertFalse(result);
        assertEquals('a', reader.current());
    }

    // ---------- matchConsumeIgnoreCase ----------

    @Test
    public void testMatchConsumeIgnoreCase_matchingDifferentCase_consumesAndReturnsTrue() {
        CharacterReader reader = new CharacterReader("ABCdef");
        boolean result = reader.matchConsumeIgnoreCase("abc");
        assertTrue(result);
        assertEquals('d', reader.current());
    }

    @Test
    public void testMatchConsumeIgnoreCase_nonMatching_returnsFalse() {
        CharacterReader reader = new CharacterReader("abcdef");
        boolean result = reader.matchConsumeIgnoreCase("xyz");
        assertFalse(result);
    }

    // ---------- containsIgnoreCase ----------

    @Test
    public void testContainsIgnoreCase_lowerCaseMatch_returnsTrue() {
        CharacterReader reader = new CharacterReader("hello </title> world");
        assertTrue(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_upperCaseMatch_returnsTrue() {
        CharacterReader reader = new CharacterReader("hello </TITLE> world");
        assertTrue(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_noMatch_returnsFalse() {
        CharacterReader reader = new CharacterReader("hello world");
        assertFalse(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_mixedCaseNotFound_returnsFalse() {
        CharacterReader reader = new CharacterReader("hello </TiTlE> world");
        assertFalse(reader.containsIgnoreCase("</title>"));
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsRemainingBufferContent() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume();
        reader.consume();
        assertEquals("cdef", reader.toString());
    }

    // ---------- rangeEquals (package-private testing method) ----------

    @Test
    public void testRangeEquals_matchingRange_returnsTrue() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.rangeEquals(0, 3, "abc"));
    }

    @Test
    public void testRangeEquals_nonMatchingRange_returnsFalse() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.rangeEquals(0, 3, "xyz"));
    }

    @Test
    public void testRangeEquals_differentLength_returnsFalse() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.rangeEquals(0, 3, "ab"));
    }

    // ---------- Large content / buffer boundary tests ----------

    @Test
    public void testLargeContent_consumeAll_worksCorrectly() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append('a');
        }
        CharacterReader reader = new CharacterReader(sb.toString());
        int count = 0;
        while (!reader.isEmpty()) {
            reader.consume();
            count++;
        }
        assertEquals(100000, count);
    }

    @Test
    public void testLongStringConsumeTo_exceedsCacheLimit_returnsCorrectString() {
        String longPrefix = "abcdefghijklmnopqrstuvwxyz"; // longer than maxStringCacheLen (12)
        CharacterReader reader = new CharacterReader(longPrefix + ",rest");
        String result = reader.consumeTo(',');
        assertEquals(longPrefix, result);
    }
}
