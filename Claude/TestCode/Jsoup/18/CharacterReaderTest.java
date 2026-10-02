package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullInput_throwsException() {
        new CharacterReader(null);
    }

    @Test
    public void testConstructor_emptyString_isEmptyTrue() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
    }

    @Test
    public void testPos_initial_returnsZero() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals(0, r.pos());
    }

    @Test
    public void testPos_afterAdvance_returnsIncrementedValue() {
        CharacterReader r = new CharacterReader("abc");
        r.advance();
        assertEquals(1, r.pos());
    }

    @Test
    public void testIsEmpty_nonEmptyString_returnsFalse() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.isEmpty());
    }

    @Test
    public void testIsEmpty_emptyString_returnsTrue() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
    }

    @Test
    public void testIsEmpty_afterConsumingAll_returnsTrue() {
        CharacterReader r = new CharacterReader("a");
        r.consume();
        assertTrue(r.isEmpty());
    }

    @Test
    public void testCurrent_nonEmpty_returnsFirstChar() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals('a', r.current());
    }

    @Test
    public void testCurrent_empty_returnsEOF() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.current());
    }

    @Test
    public void testConsume_nonEmpty_returnsCharAndAdvances() {
        CharacterReader r = new CharacterReader("abc");
        char c = r.consume();
        assertEquals('a', c);
        assertEquals(1, r.pos());
    }

    @Test
    public void testConsume_empty_returnsEOF() {
        CharacterReader r = new CharacterReader("");
        char c = r.consume();
        assertEquals(CharacterReader.EOF, c);
    }

    @Test
    public void testUnconsume_afterConsume_decrementsPos() {
        CharacterReader r = new CharacterReader("abc");
        r.consume();
        r.unconsume();
        assertEquals(0, r.pos());
    }

    @Test
    public void testAdvance_normalCase_incrementsPos() {
        CharacterReader r = new CharacterReader("abc");
        r.advance();
        assertEquals(1, r.pos());
    }

    @Test
    public void testMark_andRewindToMark_restoresPos() {
        CharacterReader r = new CharacterReader("abc");
        r.advance();
        r.mark();
        r.advance();
        r.advance();
        r.rewindToMark();
        assertEquals(1, r.pos());
    }

    @Test
    public void testConsumeAsString_normalCase_returnsCharAndAdvances() {
        CharacterReader r = new CharacterReader("abc");
        String s = r.consumeAsString();
        assertEquals("a", s);
        assertEquals(1, r.pos());
    }

    @Test
    public void testConsumeTo_charFound_returnsSubstring() {
        CharacterReader r = new CharacterReader("abcdef");
        String s = r.consumeTo('d');
        assertEquals("abc", s);
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeTo_charNotFound_consumesToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        String s = r.consumeTo('z');
        // consumeToEnd has quirky behavior: substring(pos, length-1)
        assertEquals("abcde", s);
        assertEquals(6, r.pos());
    }

    @Test
    public void testConsumeTo_stringFound_returnsSubstring() {
        CharacterReader r = new CharacterReader("abcdefgh");
        String s = r.consumeTo("efg");
        assertEquals("abcd", s);
        assertEquals(4, r.pos());
    }

    @Test
    public void testConsumeTo_stringNotFound_consumesToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        String s = r.consumeTo("xyz");
        assertEquals("abcde", s);
        assertEquals(6, r.pos());
    }

    @Test
    public void testConsumeToAny_matchFound_returnsSubstring() {
        CharacterReader r = new CharacterReader("abc,def");
        String s = r.consumeToAny(',', ';');
        assertEquals("abc", s);
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeToAny_noMatch_consumesAllAndReturnsFullString() {
        CharacterReader r = new CharacterReader("abcdef");
        String s = r.consumeToAny(',', ';');
        assertEquals("abcdef", s);
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToAny_emptyInput_returnsEmptyString() {
        CharacterReader r = new CharacterReader("");
        String s = r.consumeToAny(',', ';');
        assertEquals("", s);
    }

    @Test
    public void testConsumeToEnd_normalCase_consumesRemainingExceptLast() {
        CharacterReader r = new CharacterReader("abcdef");
        String s = r.consumeToEnd();
        assertEquals("abcde", s);
        assertEquals(6, r.pos());
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeLetterSequence_lettersOnly_returnsLetters() {
        CharacterReader r = new CharacterReader("abcXYZ123");
        String s = r.consumeLetterSequence();
        assertEquals("abcXYZ", s);
        assertEquals(6, r.pos());
    }

    @Test
    public void testConsumeLetterSequence_noLetters_returnsEmptyString() {
        CharacterReader r = new CharacterReader("123abc");
        String s = r.consumeLetterSequence();
        assertEquals("", s);
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeLetterSequence_emptyInput_returnsEmptyString() {
        CharacterReader r = new CharacterReader("");
        String s = r.consumeLetterSequence();
        assertEquals("", s);
    }

    @Test
    public void testConsumeHexSequence_hexChars_returnsHexString() {
        CharacterReader r = new CharacterReader("1A2Bxyz");
        String s = r.consumeHexSequence();
        assertEquals("1A2B", s);
        assertEquals(4, r.pos());
    }

    @Test
    public void testConsumeHexSequence_noHexChars_returnsEmptyString() {
        CharacterReader r = new CharacterReader("xyz");
        String s = r.consumeHexSequence();
        assertEquals("", s);
    }

    @Test
    public void testConsumeDigitSequence_digitsOnly_returnsDigits() {
        CharacterReader r = new CharacterReader("12345abc");
        String s = r.consumeDigitSequence();
        assertEquals("12345", s);
        assertEquals(5, r.pos());
    }

    @Test
    public void testConsumeDigitSequence_noDigits_returnsEmptyString() {
        CharacterReader r = new CharacterReader("abc");
        String s = r.consumeDigitSequence();
        assertEquals("", s);
    }

    @Test
    public void testMatches_charMatches_returnsTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matches('a'));
    }

    @Test
    public void testMatches_charDoesNotMatch_returnsFalse() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matches('z'));
    }

    @Test
    public void testMatches_emptyInput_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matches('a'));
    }

    @Test
    public void testMatchesString_seqMatches_returnsTrue() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.matches("abc"));
    }

    @Test
    public void testMatchesString_seqDoesNotMatch_returnsFalse() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.matches("xyz"));
    }

    @Test
    public void testMatchesIgnoreCase_matchesRegardlessOfCase_returnsTrue() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertTrue(r.matchesIgnoreCase("abc"));
    }

    @Test
    public void testMatchesIgnoreCase_noMatch_returnsFalse() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.matchesIgnoreCase("xyz"));
    }

    @Test
    public void testMatchesAny_charInSet_returnsTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesAny('a', 'b', 'c'));
    }

    @Test
    public void testMatchesAny_charNotInSet_returnsFalse() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAny_emptyInput_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesLetter_isLetter_returnsTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesLetter());
    }

    @Test
    public void testMatchesLetter_isNotLetter_returnsFalse() {
        CharacterReader r = new CharacterReader("123");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchesLetter_emptyInput_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchesDigit_isDigit_returnsTrue() {
        CharacterReader r = new CharacterReader("123");
        assertTrue(r.matchesDigit());
    }

    @Test
    public void testMatchesDigit_isNotDigit_returnsFalse() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesDigit());
    }

    @Test
    public void testMatchesDigit_emptyInput_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesDigit());
    }

    @Test
    public void testMatchConsume_matches_consumesAndReturnsTrue() {
        CharacterReader r = new CharacterReader("abcdef");
        boolean result = r.matchConsume("abc");
        assertTrue(result);
        assertEquals(3, r.pos());
    }

    @Test
    public void testMatchConsume_doesNotMatch_returnsFalseWithoutConsuming() {
        CharacterReader r = new CharacterReader("abcdef");
        boolean result = r.matchConsume("xyz");
        assertFalse(result);
        assertEquals(0, r.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase_matches_consumesAndReturnsTrue() {
        CharacterReader r = new CharacterReader("ABCdef");
        boolean result = r.matchConsumeIgnoreCase("abc");
        assertTrue(result);
        assertEquals(3, r.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase_doesNotMatch_returnsFalseWithoutConsuming() {
        CharacterReader r = new CharacterReader("abcdef");
        boolean result = r.matchConsumeIgnoreCase("xyz");
        assertFalse(result);
        assertEquals(0, r.pos());
    }

    @Test
    public void testContainsIgnoreCase_lowerCaseSeqPresent_returnsTrue() {
        CharacterReader r = new CharacterReader("hello </title> world");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_upperCaseSeqPresent_returnsTrue() {
        CharacterReader r = new CharacterReader("hello </TITLE> world");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCase_seqNotPresent_returnsFalse() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testToString_returnsRemainingInput() {
        CharacterReader r = new CharacterReader("abcdef");
        r.advance();
        r.advance();
        assertEquals("cdef", r.toString());
    }

    @Test
    public void testToString_atStart_returnsFullInput() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.toString());
    }

    @Test
    public void testToString_atEnd_returnsEmptyString() {
        CharacterReader r = new CharacterReader("abc");
        r.consumeToEnd();
        assertEquals("", r.toString());
    }
}
