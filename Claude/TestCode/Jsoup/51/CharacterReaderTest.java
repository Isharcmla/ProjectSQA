package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CharacterReaderTest {

    private CharacterReader reader;

    @Before
    public void setUp() {
        reader = new CharacterReader("test");
    }

    // Constructor tests
    @Test(expected = Exception.class)
    public void testConstructor_nullInput_throwsException() {
        new CharacterReader(null);
    }

    @Test
    public void testConstructor_emptyString_createsEmptyReader() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConstructor_normalString_createsReader() {
        CharacterReader r = new CharacterReader("hello");
        assertFalse(r.isEmpty());
        assertEquals(0, r.pos());
    }

    // pos()
    @Test
    public void testPos_initial_returnsZero() {
        assertEquals(0, reader.pos());
    }

    @Test
    public void testPos_afterConsume_returnsIncrementedValue() {
        reader.consume();
        assertEquals(1, reader.pos());
    }

    // isEmpty()
    @Test
    public void testIsEmpty_nonEmptyReader_returnsFalse() {
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testIsEmpty_emptyString_returnsTrue() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
    }

    @Test
    public void testIsEmpty_afterConsumingAll_returnsTrue() {
        CharacterReader r = new CharacterReader("ab");
        r.consume();
        r.consume();
        assertTrue(r.isEmpty());
    }

    // current()
    @Test
    public void testCurrent_atStart_returnsFirstChar() {
        assertEquals('t', reader.current());
    }

    @Test
    public void testCurrent_atEnd_returnsEOF() {
        CharacterReader r = new CharacterReader("a");
        r.consume();
        assertEquals(CharacterReader.EOF, r.current());
    }

    // consume()
    @Test
    public void testConsume_normalChar_returnsAndAdvances() {
        char c = reader.consume();
        assertEquals('t', c);
        assertEquals(1, reader.pos());
    }

    @Test
    public void testConsume_atEnd_returnsEOF() {
        CharacterReader r = new CharacterReader("");
        char c = r.consume();
        assertEquals(CharacterReader.EOF, c);
    }

    // unconsume()
    @Test
    public void testUnconsume_afterConsume_movesBackPosition() {
        reader.consume();
        reader.unconsume();
        assertEquals(0, reader.pos());
    }

    // advance()
    @Test
    public void testAdvance_movesPositionForward() {
        reader.advance();
        assertEquals(1, reader.pos());
    }

    // mark() and rewindToMark()
    @Test
    public void testMarkAndRewindToMark_afterConsuming_restoresPosition() {
        reader.consume();
        reader.mark();
        reader.consume();
        reader.consume();
        reader.rewindToMark();
        assertEquals(1, reader.pos());
    }

    // consumeAsString()
    @Test
    public void testConsumeAsString_normalChar_returnsSingleCharString() {
        String s = reader.consumeAsString();
        assertEquals("t", s);
        assertEquals(1, reader.pos());
    }

    // nextIndexOf(char)
    @Test
    public void testNextIndexOfChar_charFound_returnsOffset() {
        CharacterReader r = new CharacterReader("hello world");
        int idx = r.nextIndexOf('w');
        assertEquals(6, idx);
    }

    @Test
    public void testNextIndexOfChar_charNotFound_returnsMinusOne() {
        CharacterReader r = new CharacterReader("hello");
        int idx = r.nextIndexOf('z');
        assertEquals(-1, idx);
    }

    // nextIndexOf(CharSequence)
    @Test
    public void testNextIndexOfSeq_seqFound_returnsOffset() {
        CharacterReader r = new CharacterReader("hello world");
        int idx = r.nextIndexOf("world");
        assertEquals(6, idx);
    }

    @Test
    public void testNextIndexOfSeq_seqNotFound_returnsMinusOne() {
        CharacterReader r = new CharacterReader("hello");
        int idx = r.nextIndexOf("xyz");
        assertEquals(-1, idx);
    }

    @Test
    public void testNextIndexOfSeq_seqAtStart_returnsZero() {
        CharacterReader r = new CharacterReader("hello world");
        int idx = r.nextIndexOf("hello");
        assertEquals(0, idx);
    }

    @Test
    public void testNextIndexOfSeq_singleCharSeq_returnsOffset() {
        CharacterReader r = new CharacterReader("hello");
        int idx = r.nextIndexOf("l");
        assertEquals(2, idx);
    }

    @Test
    public void testNextIndexOfSeq_seqLongerThanRemaining_returnsMinusOne() {
        CharacterReader r = new CharacterReader("hi");
        int idx = r.nextIndexOf("hello");
        assertEquals(-1, idx);
    }

    @Test
    public void testNextIndexOfSeq_partialMatchThenFail_returnsCorrectResult() {
        CharacterReader r = new CharacterReader("ababc");
        int idx = r.nextIndexOf("abc");
        assertEquals(2, idx);
    }

    // consumeTo(char)
    @Test
    public void testConsumeToChar_charFound_returnsConsumedString() {
        CharacterReader r = new CharacterReader("hello world");
        String s = r.consumeTo('w');
        assertEquals("hello ", s);
        assertEquals(6, r.pos());
    }

    @Test
    public void testConsumeToChar_charNotFound_consumesToEnd() {
        CharacterReader r = new CharacterReader("hello");
        String s = r.consumeTo('z');
        assertEquals("hello", s);
        assertTrue(r.isEmpty());
    }

    // consumeTo(String)
    @Test
    public void testConsumeToString_seqFound_returnsConsumedString() {
        CharacterReader r = new CharacterReader("hello world");
        String s = r.consumeTo("world");
        assertEquals("hello ", s);
    }

    @Test
    public void testConsumeToString_seqNotFound_consumesToEnd() {
        CharacterReader r = new CharacterReader("hello");
        String s = r.consumeTo("xyz");
        assertEquals("hello", s);
        assertTrue(r.isEmpty());
    }

    // consumeToAny
    @Test
    public void testConsumeToAny_charFound_returnsConsumedString() {
        CharacterReader r = new CharacterReader("hello world");
        String s = r.consumeToAny(' ', 'x');
        assertEquals("hello", s);
    }

    @Test
    public void testConsumeToAny_noMatch_returnsEmptyStringAtStart() {
        CharacterReader r = new CharacterReader("hello");
        String s = r.consumeToAny('h');
        assertEquals("", s);
    }

    @Test
    public void testConsumeToAny_noCharFoundInEntireString_consumesAll() {
        CharacterReader r = new CharacterReader("hello");
        String s = r.consumeToAny('z', 'x');
        assertEquals("hello", s);
    }

    // consumeToAnySorted
    @Test
    public void testConsumeToAnySorted_charFound_returnsConsumedString() {
        CharacterReader r = new CharacterReader("hello world");
        char[] sorted = {' ', 'x'};
        String s = r.consumeToAnySorted(sorted);
        assertEquals("hello", s);
    }

    @Test
    public void testConsumeToAnySorted_noMatch_returnsEmptyString() {
        CharacterReader r = new CharacterReader("hello");
        char[] sorted = {'h'};
        String s = r.consumeToAnySorted(sorted);
        assertEquals("", s);
    }

    // consumeData
    @Test
    public void testConsumeData_stopsAtAmpersand_returnsConsumedString() {
        CharacterReader r = new CharacterReader("hello&world");
        String s = r.consumeData();
        assertEquals("hello", s);
    }

    @Test
    public void testConsumeData_stopsAtLessThan_returnsConsumedString() {
        CharacterReader r = new CharacterReader("hello<world");
        String s = r.consumeData();
        assertEquals("hello", s);
    }

    @Test
    public void testConsumeData_noSpecialChar_consumesAll() {
        CharacterReader r = new CharacterReader("helloworld");
        String s = r.consumeData();
        assertEquals("helloworld", s);
    }

    // consumeTagName
    @Test
    public void testConsumeTagName_stopsAtSpace_returnsConsumedString() {
        CharacterReader r = new CharacterReader("div class");
        String s = r.consumeTagName();
        assertEquals("div", s);
    }

    @Test
    public void testConsumeTagName_stopsAtGreaterThan_returnsConsumedString() {
        CharacterReader r = new CharacterReader("div>");
        String s = r.consumeTagName();
        assertEquals("div", s);
    }

    @Test
    public void testConsumeTagName_stopsAtSlash_returnsConsumedString() {
        CharacterReader r = new CharacterReader("div/");
        String s = r.consumeTagName();
        assertEquals("div", s);
    }

    @Test
    public void testConsumeTagName_noSpecialChar_consumesAll() {
        CharacterReader r = new CharacterReader("div");
        String s = r.consumeTagName();
        assertEquals("div", s);
    }

    // consumeToEnd
    @Test
    public void testConsumeToEnd_normal_returnsRemainingString() {
        CharacterReader r = new CharacterReader("hello world");
        r.consume();
        String s = r.consumeToEnd();
        assertEquals("ello world", s);
        assertTrue(r.isEmpty());
    }

    // consumeLetterSequence
    @Test
    public void testConsumeLetterSequence_letters_returnsLetters() {
        CharacterReader r = new CharacterReader("abc123");
        String s = r.consumeLetterSequence();
        assertEquals("abc", s);
    }

    @Test
    public void testConsumeLetterSequence_noLetters_returnsEmptyString() {
        CharacterReader r = new CharacterReader("123abc");
        String s = r.consumeLetterSequence();
        assertEquals("", s);
    }

    // consumeLetterThenDigitSequence
    @Test
    public void testConsumeLetterThenDigitSequence_lettersThenDigits_returnsBoth() {
        CharacterReader r = new CharacterReader("abc123xyz");
        String s = r.consumeLetterThenDigitSequence();
        assertEquals("abc123", s);
    }

    @Test
    public void testConsumeLetterThenDigitSequence_onlyLetters_returnsLetters() {
        CharacterReader r = new CharacterReader("abc");
        String s = r.consumeLetterThenDigitSequence();
        assertEquals("abc", s);
    }

    @Test
    public void testConsumeLetterThenDigitSequence_onlyDigits_returnsDigits() {
        CharacterReader r = new CharacterReader("123");
        String s = r.consumeLetterThenDigitSequence();
        assertEquals("123", s);
    }

    // consumeHexSequence
    @Test
    public void testConsumeHexSequence_hexChars_returnsHexString() {
        CharacterReader r = new CharacterReader("1aF3xyz");
        String s = r.consumeHexSequence();
        assertEquals("1aF3", s);
    }

    @Test
    public void testConsumeHexSequence_noHexChars_returnsEmptyString() {
        CharacterReader r = new CharacterReader("xyz");
        String s = r.consumeHexSequence();
        assertEquals("", s);
    }

    // consumeDigitSequence
    @Test
    public void testConsumeDigitSequence_digits_returnsDigits() {
        CharacterReader r = new CharacterReader("123abc");
        String s = r.consumeDigitSequence();
        assertEquals("123", s);
    }

    @Test
    public void testConsumeDigitSequence_noDigits_returnsEmptyString() {
        CharacterReader r = new CharacterReader("abc");
        String s = r.consumeDigitSequence();
        assertEquals("", s);
    }

    // matches(char)
    @Test
    public void testMatchesChar_matchingChar_returnsTrue() {
        assertTrue(reader.matches('t'));
    }

    @Test
    public void testMatchesChar_nonMatchingChar_returnsFalse() {
        assertFalse(reader.matches('x'));
    }

    @Test
    public void testMatchesChar_emptyReader_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matches('a'));
    }

    // matches(String)
    @Test
    public void testMatchesString_matchingSeq_returnsTrue() {
        assertTrue(reader.matches("te"));
    }

    @Test
    public void testMatchesString_nonMatchingSeq_returnsFalse() {
        assertFalse(reader.matches("xy"));
    }

    @Test
    public void testMatchesString_seqLongerThanRemaining_returnsFalse() {
        assertFalse(reader.matches("testlonger"));
    }

    // matchesIgnoreCase
    @Test
    public void testMatchesIgnoreCase_matchingDifferentCase_returnsTrue() {
        assertTrue(reader.matchesIgnoreCase("TE"));
    }

    @Test
    public void testMatchesIgnoreCase_nonMatching_returnsFalse() {
        assertFalse(reader.matchesIgnoreCase("XY"));
    }

    @Test
    public void testMatchesIgnoreCase_seqLongerThanRemaining_returnsFalse() {
        assertFalse(reader.matchesIgnoreCase("testlonger"));
    }

    // matchesAny(char...)
    @Test
    public void testMatchesAny_matchingChar_returnsTrue() {
        assertTrue(reader.matchesAny('x', 't', 'y'));
    }

    @Test
    public void testMatchesAny_noMatch_returnsFalse() {
        assertFalse(reader.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAny_emptyReader_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAny('a', 'b'));
    }

    // matchesAnySorted
    @Test
    public void testMatchesAnySorted_matchingChar_returnsTrue() {
        char[] sorted = {'a', 't', 'z'};
        assertTrue(reader.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesAnySorted_noMatch_returnsFalse() {
        char[] sorted = {'a', 'b', 'c'};
        assertFalse(reader.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesAnySorted_emptyReader_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        char[] sorted = {'a'};
        assertFalse(r.matchesAnySorted(sorted));
    }

    // matchesLetter
    @Test
    public void testMatchesLetter_letter_returnsTrue() {
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetter_digit_returnsFalse() {
        CharacterReader r = new CharacterReader("123");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchesLetter_emptyReader_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesLetter());
    }

    // matchesDigit
    @Test
    public void testMatchesDigit_digit_returnsTrue() {
        CharacterReader r = new CharacterReader("123");
        assertTrue(r.matchesDigit());
    }

    @Test
    public void testMatchesDigit_letter_returnsFalse() {
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigit_emptyReader_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesDigit());
    }

    // matchConsume
    @Test
    public void testMatchConsume_matchingSeq_consumesAndReturnsTrue() {
        boolean result = reader.matchConsume("te");
        assertTrue(result);
        assertEquals(2, reader.pos());
    }

    @Test
    public void testMatchConsume_nonMatchingSeq_returnsFalseWithoutConsuming() {
        boolean result = reader.matchConsume("xy");
        assertFalse(result);
        assertEquals(0, reader.pos());
    }

    // matchConsumeIgnoreCase
    @Test
    public void testMatchConsumeIgnoreCase_matchingDifferentCase_consumesAndReturnsTrue() {
        boolean result = reader.matchConsumeIgnoreCase("TE");
        assertTrue(result);
        assertEquals(2, reader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase_nonMatching_returnsFalseWithoutConsuming() {
        boolean result = reader.matchConsumeIgnoreCase("XY");
        assertFalse(result);
        assertEquals(0, reader.pos());
    }

    // containsIgnoreCase
    @Test
    public void testContainsIgnoreCase_lowerCaseMatch_returnsTrue() {
        CharacterReader r = new CharacterReader("hello </title> world");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_upperCaseMatch_returnsTrue() {
        CharacterReader r = new CharacterReader("hello </TITLE> world");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_noMatch_returnsFalse() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    // toString
    @Test
    public void testToString_atStart_returnsFullString() {
        CharacterReader r = new CharacterReader("hello");
        assertEquals("hello", r.toString());
    }

    @Test
    public void testToString_afterConsume_returnsRemainingString() {
        CharacterReader r = new CharacterReader("hello");
        r.consume();
        assertEquals("ello", r.toString());
    }

    // rangeEquals
    @Test
    public void testRangeEquals_equalRange_returnsTrue() {
        CharacterReader r = new CharacterReader("hello");
        assertTrue(r.rangeEquals(0, 5, "hello"));
    }

    @Test
    public void testRangeEquals_differentLength_returnsFalse() {
        CharacterReader r = new CharacterReader("hello");
        assertFalse(r.rangeEquals(0, 5, "hell"));
    }

    @Test
    public void testRangeEquals_sameLengthDifferentContent_returnsFalse() {
        CharacterReader r = new CharacterReader("hello");
        assertFalse(r.rangeEquals(0, 5, "world"));
    }

    // cacheString via consumeTo triggering cache hit/miss and long string bypass
    @Test
    public void testCacheString_longStringExceedsCacheLimit_returnsNewString() {
        String longStr = "abcdefghijklmnop"; // length > 12
        CharacterReader r = new CharacterReader(longStr + "&end");
        String s = r.consumeTo('&');
        assertEquals(longStr, s);
    }

    @Test
    public void testCacheString_repeatedShortStrings_usesCacheConsistently() {
        CharacterReader r1 = new CharacterReader("abc def abc");
        String first = r1.consumeTo(' ');
        r1.advance();
        r1.consumeTo(' ');
        r1.advance();
        String third = r1.consumeToEnd();
        assertEquals("abc", first);
        assertEquals("abc", third);
    }

    @Test
    public void testConsumeToAnySorted_emptyInput_returnsEmptyString() {
        CharacterReader r = new CharacterReader("");
        char[] sorted = {'a'};
        String s = r.consumeToAnySorted(sorted);
        assertEquals("", s);
    }

    @Test
    public void testNextIndexOf_emptyReaderChar_returnsMinusOne() {
        CharacterReader r = new CharacterReader("");
        assertEquals(-1, r.nextIndexOf('a'));
    }
}
