package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CharacterReaderTest {

    private CharacterReader reader;

    @Before
    public void setUp() {
        reader = null;
    }

    // Constructor tests
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullInput_throwsException() {
        new CharacterReader(null);
    }

    @Test
    public void testConstructor_emptyString_createsEmptyReader() {
        reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        assertEquals(0, reader.pos());
    }

    @Test
    public void testConstructor_normalString_createsReader() {
        reader = new CharacterReader("hello");
        assertFalse(reader.isEmpty());
        assertEquals(0, reader.pos());
    }

    // pos() tests
    @Test
    public void testPos_initial_returnsZero() {
        reader = new CharacterReader("test");
        assertEquals(0, reader.pos());
    }

    @Test
    public void testPos_afterConsume_returnsIncrementedValue() {
        reader = new CharacterReader("test");
        reader.consume();
        assertEquals(1, reader.pos());
    }

    // isEmpty() tests
    @Test
    public void testIsEmpty_emptyString_returnsTrue() {
        reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testIsEmpty_nonEmptyString_returnsFalse() {
        reader = new CharacterReader("a");
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testIsEmpty_afterConsumingAll_returnsTrue() {
        reader = new CharacterReader("a");
        reader.consume();
        assertTrue(reader.isEmpty());
    }

    // current() tests
    @Test
    public void testCurrent_nonEmpty_returnsCurrentChar() {
        reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
    }

    @Test
    public void testCurrent_empty_returnsEOF() {
        reader = new CharacterReader("");
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testCurrent_afterConsume_returnsNextChar() {
        reader = new CharacterReader("abc");
        reader.consume();
        assertEquals('b', reader.current());
    }

    // consume() tests
    @Test
    public void testConsume_normalInput_returnsCharAndAdvances() {
        reader = new CharacterReader("abc");
        char c = reader.consume();
        assertEquals('a', c);
        assertEquals(1, reader.pos());
    }

    @Test
    public void testConsume_atEnd_returnsEOF() {
        reader = new CharacterReader("");
        char c = reader.consume();
        assertEquals(CharacterReader.EOF, c);
    }

    @Test
    public void testConsume_multipleConsumes_returnsCorrectSequence() {
        reader = new CharacterReader("abc");
        assertEquals('a', reader.consume());
        assertEquals('b', reader.consume());
        assertEquals('c', reader.consume());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    // unconsume() tests
    @Test
    public void testUnconsume_afterConsume_movesBack() {
        reader = new CharacterReader("abc");
        reader.consume();
        reader.unconsume();
        assertEquals(0, reader.pos());
        assertEquals('a', reader.current());
    }

    // advance() tests
    @Test
    public void testAdvance_normalInput_incrementsPos() {
        reader = new CharacterReader("abc");
        reader.advance();
        assertEquals(1, reader.pos());
    }

    // mark() and rewindToMark() tests
    @Test
    public void testMarkAndRewindToMark_normalUsage_restoresPos() {
        reader = new CharacterReader("abcdef");
        reader.consume();
        reader.consume();
        reader.mark();
        reader.consume();
        reader.consume();
        reader.rewindToMark();
        assertEquals(2, reader.pos());
    }

    @Test
    public void testMark_initial_marksAtZero() {
        reader = new CharacterReader("abc");
        reader.mark();
        reader.consume();
        reader.rewindToMark();
        assertEquals(0, reader.pos());
    }

    // consumeAsString() tests
    @Test
    public void testConsumeAsString_normalInput_returnsSingleChar() {
        reader = new CharacterReader("abc");
        String s = reader.consumeAsString();
        assertEquals("a", s);
        assertEquals(1, reader.pos());
    }

    // nextIndexOf(char) tests
    @Test
    public void testNextIndexOfChar_found_returnsOffset() {
        reader = new CharacterReader("abcdef");
        int idx = reader.nextIndexOf('d');
        assertEquals(3, idx);
    }

    @Test
    public void testNextIndexOfChar_notFound_returnsMinusOne() {
        reader = new CharacterReader("abcdef");
        int idx = reader.nextIndexOf('z');
        assertEquals(-1, idx);
    }

    @Test
    public void testNextIndexOfChar_afterConsume_returnsRelativeOffset() {
        reader = new CharacterReader("abcdef");
        reader.consume();
        reader.consume();
        int idx = reader.nextIndexOf('d');
        assertEquals(1, idx);
    }

    // nextIndexOf(CharSequence) tests
    @Test
    public void testNextIndexOfSeq_found_returnsOffset() {
        reader = new CharacterReader("abcdefgh");
        int idx = reader.nextIndexOf("def");
        assertEquals(3, idx);
    }

    @Test
    public void testNextIndexOfSeq_notFound_returnsMinusOne() {
        reader = new CharacterReader("abcdefgh");
        int idx = reader.nextIndexOf("xyz");
        assertEquals(-1, idx);
    }

    @Test
    public void testNextIndexOfSeq_startCharMismatchThenFound_returnsOffset() {
        reader = new CharacterReader("xxxabcdef");
        int idx = reader.nextIndexOf("abc");
        assertEquals(3, idx);
    }

    @Test
    public void testNextIndexOfSeq_partialMatchThenFail_returnsMinusOne() {
        reader = new CharacterReader("ababcx");
        int idx = reader.nextIndexOf("abcx");
        assertEquals(2, idx);
    }

    @Test
    public void testNextIndexOfSeq_singleCharSeq_returnsOffset() {
        reader = new CharacterReader("abcdef");
        int idx = reader.nextIndexOf("d");
        assertEquals(3, idx);
    }

    // consumeTo(char) tests
    @Test
    public void testConsumeToChar_found_returnsConsumedStringAndUpdatesPos() {
        reader = new CharacterReader("abcdef");
        String s = reader.consumeTo('d');
        assertEquals("abc", s);
        assertEquals(3, reader.pos());
    }

    @Test
    public void testConsumeToChar_notFound_consumesToEnd() {
        reader = new CharacterReader("abcdef");
        String s = reader.consumeTo('z');
        assertEquals("abcdef", s);
        assertTrue(reader.isEmpty());
    }

    // consumeTo(String) tests
    @Test
    public void testConsumeToString_found_returnsConsumedStringAndUpdatesPos() {
        reader = new CharacterReader("abcdefgh");
        String s = reader.consumeTo("def");
        assertEquals("abc", s);
        assertEquals(3, reader.pos());
    }

    @Test
    public void testConsumeToString_notFound_consumesToEnd() {
        reader = new CharacterReader("abcdefgh");
        String s = reader.consumeTo("xyz");
        assertEquals("abcdefgh", s);
        assertTrue(reader.isEmpty());
    }

    // consumeToAny() tests
    @Test
    public void testConsumeToAny_found_returnsConsumedString() {
        reader = new CharacterReader("abc123def");
        String s = reader.consumeToAny('1', '2', '3');
        assertEquals("abc", s);
        assertEquals(3, reader.pos());
    }

    @Test
    public void testConsumeToAny_notFound_consumesToEnd() {
        reader = new CharacterReader("abcdef");
        String s = reader.consumeToAny('1', '2', '3');
        assertEquals("abcdef", s);
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAny_matchAtStart_returnsEmptyString() {
        reader = new CharacterReader("1abc");
        String s = reader.consumeToAny('1', '2');
        assertEquals("", s);
        assertEquals(0, reader.pos());
    }

    // consumeToEnd() tests
    @Test
    public void testConsumeToEnd_normalInput_returnsRemainingString() {
        reader = new CharacterReader("abcdef");
        reader.consume();
        reader.consume();
        String s = reader.consumeToEnd();
        assertEquals("cdef", s);
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToEnd_emptyReader_returnsEmptyString() {
        reader = new CharacterReader("");
        String s = reader.consumeToEnd();
        assertEquals("", s);
    }

    // consumeLetterSequence() tests
    @Test
    public void testConsumeLetterSequence_normalLetters_returnsLetters() {
        reader = new CharacterReader("abcDEF123");
        String s = reader.consumeLetterSequence();
        assertEquals("abcDEF", s);
        assertEquals(6, reader.pos());
    }

    @Test
    public void testConsumeLetterSequence_noLetters_returnsEmptyString() {
        reader = new CharacterReader("123abc");
        String s = reader.consumeLetterSequence();
        assertEquals("", s);
        assertEquals(0, reader.pos());
    }

    @Test
    public void testConsumeLetterSequence_allLetters_consumesAll() {
        reader = new CharacterReader("abcdef");
        String s = reader.consumeLetterSequence();
        assertEquals("abcdef", s);
        assertTrue(reader.isEmpty());
    }

    // consumeLetterThenDigitSequence() tests
    @Test
    public void testConsumeLetterThenDigitSequence_lettersAndDigits_returnsBoth() {
        reader = new CharacterReader("abc123xyz");
        String s = reader.consumeLetterThenDigitSequence();
        assertEquals("abc123", s);
        assertEquals(6, reader.pos());
    }

    @Test
    public void testConsumeLetterThenDigitSequence_onlyLetters_returnsLetters() {
        reader = new CharacterReader("abcdef");
        String s = reader.consumeLetterThenDigitSequence();
        assertEquals("abcdef", s);
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeLetterThenDigitSequence_onlyDigits_returnsDigits() {
        reader = new CharacterReader("123456");
        String s = reader.consumeLetterThenDigitSequence();
        assertEquals("123456", s);
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeLetterThenDigitSequence_neitherLetterNorDigit_returnsEmpty() {
        reader = new CharacterReader("!!!");
        String s = reader.consumeLetterThenDigitSequence();
        assertEquals("", s);
        assertEquals(0, reader.pos());
    }

    // consumeHexSequence() tests
    @Test
    public void testConsumeHexSequence_validHex_returnsHexString() {
        reader = new CharacterReader("1a2B3fXYZ");
        String s = reader.consumeHexSequence();
        assertEquals("1a2B3f", s);
        assertEquals(6, reader.pos());
    }

    @Test
    public void testConsumeHexSequence_noHex_returnsEmptyString() {
        reader = new CharacterReader("XYZ");
        String s = reader.consumeHexSequence();
        assertEquals("", s);
        assertEquals(0, reader.pos());
    }

    // consumeDigitSequence() tests
    @Test
    public void testConsumeDigitSequence_normalDigits_returnsDigits() {
        reader = new CharacterReader("12345abc");
        String s = reader.consumeDigitSequence();
        assertEquals("12345", s);
        assertEquals(5, reader.pos());
    }

    @Test
    public void testConsumeDigitSequence_noDigits_returnsEmptyString() {
        reader = new CharacterReader("abc123");
        String s = reader.consumeDigitSequence();
        assertEquals("", s);
        assertEquals(0, reader.pos());
    }

    // matches(char) tests
    @Test
    public void testMatchesChar_matchingChar_returnsTrue() {
        reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
    }

    @Test
    public void testMatchesChar_nonMatchingChar_returnsFalse() {
        reader = new CharacterReader("abc");
        assertFalse(reader.matches('b'));
    }

    @Test
    public void testMatchesChar_emptyReader_returnsFalse() {
        reader = new CharacterReader("");
        assertFalse(reader.matches('a'));
    }

    // matches(String) tests
    @Test
    public void testMatchesString_matchingSeq_returnsTrue() {
        reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
    }

    @Test
    public void testMatchesString_nonMatchingSeq_returnsFalse() {
        reader = new CharacterReader("abcdef");
        assertFalse(reader.matches("xyz"));
    }

    @Test
    public void testMatchesString_seqLongerThanRemaining_returnsFalse() {
        reader = new CharacterReader("ab");
        assertFalse(reader.matches("abcdef"));
    }

    @Test
    public void testMatchesString_exactMatch_returnsTrue() {
        reader = new CharacterReader("abc");
        assertTrue(reader.matches("abc"));
    }

    // matchesIgnoreCase(String) tests
    @Test
    public void testMatchesIgnoreCase_differentCase_returnsTrue() {
        reader = new CharacterReader("ABCdef");
        assertTrue(reader.matchesIgnoreCase("abc"));
    }

    @Test
    public void testMatchesIgnoreCase_nonMatching_returnsFalse() {
        reader = new CharacterReader("abcdef");
        assertFalse(reader.matchesIgnoreCase("xyz"));
    }

    @Test
    public void testMatchesIgnoreCase_seqLongerThanRemaining_returnsFalse() {
        reader = new CharacterReader("ab");
        assertFalse(reader.matchesIgnoreCase("abcdef"));
    }

    // matchesAny(char...) tests
    @Test
    public void testMatchesAny_matchFound_returnsTrue() {
        reader = new CharacterReader("abc");
        assertTrue(reader.matchesAny('x', 'a', 'b'));
    }

    @Test
    public void testMatchesAny_noMatch_returnsFalse() {
        reader = new CharacterReader("abc");
        assertFalse(reader.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAny_emptyReader_returnsFalse() {
        reader = new CharacterReader("");
        assertFalse(reader.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesAny_emptyArray_returnsFalse() {
        reader = new CharacterReader("abc");
        assertFalse(reader.matchesAny());
    }

    // matchesLetter() tests
    @Test
    public void testMatchesLetter_isLetter_returnsTrue() {
        reader = new CharacterReader("abc");
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetter_isDigit_returnsFalse() {
        reader = new CharacterReader("123");
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetter_emptyReader_returnsFalse() {
        reader = new CharacterReader("");
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetter_upperCaseLetter_returnsTrue() {
        reader = new CharacterReader("XYZ");
        assertTrue(reader.matchesLetter());
    }

    // matchesDigit() tests
    @Test
    public void testMatchesDigit_isDigit_returnsTrue() {
        reader = new CharacterReader("123");
        assertTrue(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigit_isLetter_returnsFalse() {
        reader = new CharacterReader("abc");
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigit_emptyReader_returnsFalse() {
        reader = new CharacterReader("");
        assertFalse(reader.matchesDigit());
    }

    // matchConsume(String) tests
    @Test
    public void testMatchConsume_matches_consumesAndReturnsTrue() {
        reader = new CharacterReader("abcdef");
        boolean result = reader.matchConsume("abc");
        assertTrue(result);
        assertEquals(3, reader.pos());
    }

    @Test
    public void testMatchConsume_doesNotMatch_returnsFalseWithoutConsuming() {
        reader = new CharacterReader("abcdef");
        boolean result = reader.matchConsume("xyz");
        assertFalse(result);
        assertEquals(0, reader.pos());
    }

    // matchConsumeIgnoreCase(String) tests
    @Test
    public void testMatchConsumeIgnoreCase_matchesDifferentCase_consumesAndReturnsTrue() {
        reader = new CharacterReader("ABCdef");
        boolean result = reader.matchConsumeIgnoreCase("abc");
        assertTrue(result);
        assertEquals(3, reader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase_doesNotMatch_returnsFalseWithoutConsuming() {
        reader = new CharacterReader("abcdef");
        boolean result = reader.matchConsumeIgnoreCase("xyz");
        assertFalse(result);
        assertEquals(0, reader.pos());
    }

    // containsIgnoreCase(String) tests
    @Test
    public void testContainsIgnoreCase_lowerCaseFound_returnsTrue() {
        reader = new CharacterReader("hello </title> world");
        assertTrue(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_upperCaseFound_returnsTrue() {
        reader = new CharacterReader("hello </TITLE> world");
        assertTrue(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_notFound_returnsFalse() {
        reader = new CharacterReader("hello world");
        assertFalse(reader.containsIgnoreCase("</title>"));
    }

    // toString() tests
    @Test
    public void testToString_normalInput_returnsRemainingString() {
        reader = new CharacterReader("abcdef");
        reader.consume();
        reader.consume();
        assertEquals("cdef", reader.toString());
    }

    @Test
    public void testToString_emptyReader_returnsEmptyString() {
        reader = new CharacterReader("");
        assertEquals("", reader.toString());
    }

    @Test
    public void testToString_fullyConsumed_returnsEmptyString() {
        reader = new CharacterReader("abc");
        reader.consumeToEnd();
        assertEquals("", reader.toString());
    }
}
