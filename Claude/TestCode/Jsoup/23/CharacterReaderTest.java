package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CharacterReaderTest {

    private CharacterReader reader;

    @Before
    public void setUp() {
        reader = new CharacterReader("abc123");
    }

    // Constructor tests
    @Test
    public void testConstructor_normalizesCarriageReturns_convertsToNewline() {
        CharacterReader r = new CharacterReader("line1\r\nline2\rline3");
        String result = r.toString();
        assertFalse(result.contains("\r"));
        assertTrue(result.contains("\n"));
    }

    @Test
    public void testConstructor_emptyString_isEmptyTrue() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConstructor_nullInput_throwsException() {
        boolean thrown = false;
        try {
            new CharacterReader(null);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    // pos()
    @Test
    public void testPos_initialState_returnsZero() {
        assertEquals(0, reader.pos());
    }

    @Test
    public void testPos_afterConsume_incremented() {
        reader.consume();
        assertEquals(1, reader.pos());
    }

    // isEmpty()
    @Test
    public void testIsEmpty_nonEmptyString_returnsFalse() {
        assertFalse(reader.isEmpty());
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
    public void testCurrent_normalInput_returnsFirstChar() {
        assertEquals('a', reader.current());
    }

    @Test
    public void testCurrent_emptyInput_returnsEOF() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.current());
    }

    // consume()
    @Test
    public void testConsume_normalInput_returnsCharAndAdvances() {
        char c = reader.consume();
        assertEquals('a', c);
        assertEquals(1, reader.pos());
    }

    @Test
    public void testConsume_atEndOfInput_returnsEOF() {
        CharacterReader r = new CharacterReader("");
        char c = r.consume();
        assertEquals(CharacterReader.EOF, c);
    }

    // unconsume()
    @Test
    public void testUnconsume_afterConsume_decrementsPos() {
        reader.consume();
        reader.unconsume();
        assertEquals(0, reader.pos());
        assertEquals('a', reader.current());
    }

    // advance()
    @Test
    public void testAdvance_normalCall_incrementsPos() {
        reader.advance();
        assertEquals(1, reader.pos());
    }

    // mark() and rewindToMark()
    @Test
    public void testMarkAndRewindToMark_afterConsuming_restoresPosition() {
        reader.mark();
        reader.consume();
        reader.consume();
        reader.rewindToMark();
        assertEquals(0, reader.pos());
    }

    // consumeAsString()
    @Test
    public void testConsumeAsString_normalInput_returnsSingleChar() {
        String s = reader.consumeAsString();
        assertEquals("a", s);
        assertEquals(1, reader.pos());
    }

    // consumeTo(char)
    @Test
    public void testConsumeToChar_charExists_returnsSubstringBeforeChar() {
        CharacterReader r = new CharacterReader("hello,world");
        String result = r.consumeTo(',');
        assertEquals("hello", result);
        assertEquals(5, r.pos());
    }

    @Test
    public void testConsumeToChar_charNotExists_consumesToEnd() {
        CharacterReader r = new CharacterReader("hello");
        String result = r.consumeTo('x');
        assertEquals("hello", result);
        assertTrue(r.isEmpty());
    }

    // consumeTo(String)
    @Test
    public void testConsumeToString_seqExists_returnsSubstringBeforeSeq() {
        CharacterReader r = new CharacterReader("hello world foo");
        String result = r.consumeTo("world");
        assertEquals("hello ", result);
    }

    @Test
    public void testConsumeToString_seqNotExists_consumesToEnd() {
        CharacterReader r = new CharacterReader("hello world");
        String result = r.consumeTo("xyz");
        assertEquals("hello world", result);
        assertTrue(r.isEmpty());
    }

    // consumeToAny()
    @Test
    public void testConsumeToAny_matchFound_returnsSubstring() {
        CharacterReader r = new CharacterReader("abc<def>ghi");
        String result = r.consumeToAny('<', '>');
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeToAny_noMatch_consumesAllReturnsFullString() {
        CharacterReader r = new CharacterReader("abcdef");
        String result = r.consumeToAny('<', '>');
        assertEquals("abcdef", result);
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToAny_emptyInputAtStart_returnsEmptyString() {
        CharacterReader r = new CharacterReader("");
        String result = r.consumeToAny('<', '>');
        assertEquals("", result);
    }

    @Test
    public void testConsumeToAny_matchAtStart_returnsEmptyString() {
        CharacterReader r = new CharacterReader("<abc>");
        String result = r.consumeToAny('<', '>');
        assertEquals("", result);
    }

    // consumeToEnd()
    @Test
    public void testConsumeToEnd_normalInput_returnsRemainingAndSetsPosToLength() {
        CharacterReader r = new CharacterReader("hello");
        String result = r.consumeToEnd();
        assertEquals("hello", result);
        assertTrue(r.isEmpty());
    }

    // consumeLetterSequence()
    @Test
    public void testConsumeLetterSequence_lettersFollowedByDigits_returnsLettersOnly() {
        CharacterReader r = new CharacterReader("abcXYZ123");
        String result = r.consumeLetterSequence();
        assertEquals("abcXYZ", result);
    }

    @Test
    public void testConsumeLetterSequence_noLetters_returnsEmptyString() {
        CharacterReader r = new CharacterReader("123abc");
        String result = r.consumeLetterSequence();
        assertEquals("", result);
    }

    // consumeHexSequence()
    @Test
    public void testConsumeHexSequence_validHexChars_returnsHexString() {
        CharacterReader r = new CharacterReader("1A2Fg");
        String result = r.consumeHexSequence();
        assertEquals("1A2F", result);
    }

    @Test
    public void testConsumeHexSequence_noHexChars_returnsEmptyString() {
        CharacterReader r = new CharacterReader("g123");
        String result = r.consumeHexSequence();
        assertEquals("", result);
    }

    // consumeDigitSequence()
    @Test
    public void testConsumeDigitSequence_digitsFollowedByLetters_returnsDigitsOnly() {
        CharacterReader r = new CharacterReader("123abc");
        String result = r.consumeDigitSequence();
        assertEquals("123", result);
    }

    @Test
    public void testConsumeDigitSequence_noDigits_returnsEmptyString() {
        CharacterReader r = new CharacterReader("abc123");
        String result = r.consumeDigitSequence();
        assertEquals("", result);
    }

    // matches(char)
    @Test
    public void testMatchesChar_matchingChar_returnsTrue() {
        assertTrue(reader.matches('a'));
    }

    @Test
    public void testMatchesChar_nonMatchingChar_returnsFalse() {
        assertFalse(reader.matches('z'));
    }

    @Test
    public void testMatchesChar_emptyInput_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matches('a'));
    }

    // matches(String)
    @Test
    public void testMatchesString_matchingSeq_returnsTrue() {
        assertTrue(reader.matches("abc"));
    }

    @Test
    public void testMatchesString_nonMatchingSeq_returnsFalse() {
        assertFalse(reader.matches("xyz"));
    }

    // matchesIgnoreCase()
    @Test
    public void testMatchesIgnoreCase_differentCase_returnsTrue() {
        assertTrue(reader.matchesIgnoreCase("ABC"));
    }

    @Test
    public void testMatchesIgnoreCase_nonMatchingSeq_returnsFalse() {
        assertFalse(reader.matchesIgnoreCase("xyz"));
    }

    // matchesAny(char...)
    @Test
    public void testMatchesAny_matchFound_returnsTrue() {
        assertTrue(reader.matchesAny('x', 'a', 'z'));
    }

    @Test
    public void testMatchesAny_noMatch_returnsFalse() {
        assertFalse(reader.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAny_emptyInput_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAny('a', 'b'));
    }

    // matchesLetter()
    @Test
    public void testMatchesLetter_letterAtCurrentPos_returnsTrue() {
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetter_digitAtCurrentPos_returnsFalse() {
        CharacterReader r = new CharacterReader("123");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchesLetter_emptyInput_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesLetter());
    }

    // matchesDigit()
    @Test
    public void testMatchesDigit_digitAtCurrentPos_returnsTrue() {
        CharacterReader r = new CharacterReader("123");
        assertTrue(r.matchesDigit());
    }

    @Test
    public void testMatchesDigit_letterAtCurrentPos_returnsFalse() {
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigit_emptyInput_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesDigit());
    }

    // matchConsume(String)
    @Test
    public void testMatchConsume_matchingSeq_consumesAndReturnsTrue() {
        boolean result = reader.matchConsume("abc");
        assertTrue(result);
        assertEquals(3, reader.pos());
    }

    @Test
    public void testMatchConsume_nonMatchingSeq_returnsFalseAndPosUnchanged() {
        boolean result = reader.matchConsume("xyz");
        assertFalse(result);
        assertEquals(0, reader.pos());
    }

    // matchConsumeIgnoreCase(String)
    @Test
    public void testMatchConsumeIgnoreCase_matchingDifferentCase_consumesAndReturnsTrue() {
        boolean result = reader.matchConsumeIgnoreCase("ABC");
        assertTrue(result);
        assertEquals(3, reader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase_nonMatchingSeq_returnsFalse() {
        boolean result = reader.matchConsumeIgnoreCase("xyz");
        assertFalse(result);
        assertEquals(0, reader.pos());
    }

    // containsIgnoreCase(String)
    @Test
    public void testContainsIgnoreCase_lowerCaseMatchExists_returnsTrue() {
        CharacterReader r = new CharacterReader("Hello </title> world");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_upperCaseMatchExists_returnsTrue() {
        CharacterReader r = new CharacterReader("Hello </TITLE> world");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_noMatch_returnsFalse() {
        CharacterReader r = new CharacterReader("Hello world");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    // toString()
    @Test
    public void testToString_afterPartialConsume_returnsRemainingString() {
        reader.consume();
        reader.consume();
        String result = reader.toString();
        assertEquals("c123", result);
    }

    @Test
    public void testToString_atStart_returnsFullString() {
        assertEquals("abc123", reader.toString());
    }
}
