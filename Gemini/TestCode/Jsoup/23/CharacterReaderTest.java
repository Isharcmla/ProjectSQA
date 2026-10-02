package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullInput_throwsException() {
        new CharacterReader(null);
    }

    @Test
    public void constructor_normaliseNewlines_replacesCarriageReturns() {
        CharacterReader reader = new CharacterReader("a\r\nb\rc\n");
        assertEquals("a\nb\nc\n", reader.toString());
    }

    @Test
    public void pos_initialAndAfterAdvance_returnsCorrectPosition() {
        CharacterReader reader = new CharacterReader("test");
        assertEquals(0, reader.pos());
        reader.advance();
        assertEquals(1, reader.pos());
    }

    @Test
    public void isEmpty_variousStates_returnsExpected() {
        CharacterReader emptyReader = new CharacterReader("");
        assertTrue(emptyReader.isEmpty());

        CharacterReader reader = new CharacterReader("a");
        assertFalse(reader.isEmpty());
        reader.consume();
        assertTrue(reader.isEmpty());
    }

    @Test
    public void current_whenNotEmptyAndEmpty_returnsCharOrEof() {
        CharacterReader reader = new CharacterReader("ab");
        assertEquals('a', reader.current());
        reader.consume();
        assertEquals('b', reader.current());
        reader.consume();
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void consume_readsAndAdvances_returnsCharAndEofWhenEmpty() {
        CharacterReader reader = new CharacterReader("a");
        assertEquals('a', reader.consume());
        assertEquals(1, reader.pos());
        assertEquals(CharacterReader.EOF, reader.consume());
        assertEquals(2, reader.pos());
    }

    @Test
    public void unconsume_movesPositionBack() {
        CharacterReader reader = new CharacterReader("ab");
        reader.consume();
        assertEquals(1, reader.pos());
        reader.unconsume();
        assertEquals(0, reader.pos());
        assertEquals('a', reader.current());
    }

    @Test
    public void advance_movesPositionForward() {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());
    }

    @Test
    public void markAndRewindToMark_restoresMarkedPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.advance();
        reader.advance();
        reader.mark();
        assertEquals(2, reader.pos());

        reader.advance();
        reader.advance();
        assertEquals(4, reader.pos());

        reader.rewindToMark();
        assertEquals(2, reader.pos());
        assertEquals('c', reader.current());
    }

    @Test
    public void consumeAsString_advancesPosAndReturnsSubstring() {
        CharacterReader reader = new CharacterReader("abc");
        String consumed = reader.consumeAsString();
        assertEquals("", consumed);
        assertEquals(1, reader.pos());
    }

    @Test
    public void consumeToChar_charFoundAndNotFound_returnsSubstrings() {
        CharacterReader reader = new CharacterReader("foo-bar-baz");
        assertEquals("foo", reader.consumeTo('-'));
        assertEquals('-', reader.current());

        reader.advance();
        assertEquals("bar-baz", reader.consumeTo('x'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToString_seqFoundAndNotFound_returnsSubstrings() {
        CharacterReader reader = new CharacterReader("foo::bar::baz");
        assertEquals("foo", reader.consumeTo("::"));
        assertEquals(':', reader.current());

        reader.consume();
        reader.consume();
        assertEquals("bar::baz", reader.consumeTo("notFound"));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void consumeToAny_variousChars_stopsAtMatchOrEnd() {
        CharacterReader reader = new CharacterReader("hello [world]");
        assertEquals("hello ", reader.consumeToAny('[', ']'));
        assertEquals('[', reader.current());

        reader.advance();
        assertEquals("world", reader.consumeToAny(']'));
        assertEquals(']', reader.current());

        reader.advance();
        assertEquals("", reader.consumeToAny('a', 'b'));
        assertTrue(reader.isEmpty());

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals("", emptyReader.consumeToAny('a', 'b'));
    }

    @Test
    public void consumeToEnd_returnsRemainingStringAndSetsPosToEnd() {
        CharacterReader reader = new CharacterReader("test string");
        reader.advance();
        reader.advance();
        assertEquals("st string", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
        assertEquals("", reader.consumeToEnd());
    }

    @Test
    public void consumeLetterSequence_lettersAndNonLetters_consumesCorrectly() {
        CharacterReader reader = new CharacterReader("HelloWorld123");
        assertEquals("HelloWorld", reader.consumeLetterSequence());
        assertEquals('1', reader.current());

        CharacterReader nonLetterReader = new CharacterReader("123");
        assertEquals("", nonLetterReader.consumeLetterSequence());

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals("", emptyReader.consumeLetterSequence());
    }

    @Test
    public void consumeHexSequence_hexAndNonHex_consumesCorrectly() {
        CharacterReader reader = new CharacterReader("0123456789ABCDEFabcdefGHI");
        assertEquals("0123456789ABCDEFabcdef", reader.consumeHexSequence());
        assertEquals('G', reader.current());

        CharacterReader nonHexReader = new CharacterReader("XYZ");
        assertEquals("", nonHexReader.consumeHexSequence());

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals("", emptyReader.consumeHexSequence());
    }

    @Test
    public void consumeDigitSequence_digitsAndNonDigits_consumesCorrectly() {
        CharacterReader reader = new CharacterReader("0123456789abc");
        assertEquals("0123456789", reader.consumeDigitSequence());
        assertEquals('a', reader.current());

        CharacterReader nonDigitReader = new CharacterReader("abc");
        assertEquals("", nonDigitReader.consumeDigitSequence());

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals("", emptyReader.consumeDigitSequence());
    }

    @Test
    public void matchesChar_matchingAndNonMatchingAndEmpty_returnsExpected() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));

        reader.consumeToEnd();
        assertFalse(reader.matches('a'));
    }

    @Test
    public void matchesString_matchingAndNonMatching_returnsExpected() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
        assertFalse(reader.matches("bcd"));
        assertFalse(reader.matches("abcdefg"));

        reader.consumeToEnd();
        assertFalse(reader.matches("a"));
    }

    @Test
    public void matchesIgnoreCase_matchingAndNonMatching_returnsExpected() {
        CharacterReader reader = new CharacterReader("AbCdEf");
        assertTrue(reader.matchesIgnoreCase("abcdef"));
        assertTrue(reader.matchesIgnoreCase("ABCDEF"));
        assertFalse(reader.matchesIgnoreCase("bcdef"));

        reader.consumeToEnd();
        assertFalse(reader.matchesIgnoreCase("a"));
    }

    @Test
    public void matchesAny_matchingNonMatchingAndEmpty_returnsExpected() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAny('x', 'a', 'z'));
        assertFalse(reader.matchesAny('x', 'y', 'z'));
        assertFalse(reader.matchesAny());

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesAny('a', 'b'));
    }

    @Test
    public void matchesLetter_uppercaseLowercaseNonLetterAndEmpty_returnsExpected() {
        CharacterReader upper = new CharacterReader("A1");
        assertTrue(upper.matchesLetter());

        CharacterReader lower = new CharacterReader("z1");
        assertTrue(lower.matchesLetter());

        CharacterReader nonLetter = new CharacterReader("1A");
        assertFalse(nonLetter.matchesLetter());

        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matchesLetter());
    }

    @Test
    public void matchesDigit_digitNonDigitAndEmpty_returnsExpected() {
        CharacterReader digit = new CharacterReader("0");
        assertTrue(digit.matchesDigit());

        CharacterReader digitNine = new CharacterReader("9");
        assertTrue(digitNine.matchesDigit());

        CharacterReader nonDigit = new CharacterReader("a");
        assertFalse(nonDigit.matchesDigit());

        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.matchesDigit());
    }

    @Test
    public void matchConsume_matchingAndNonMatching_advancesPosOnlyOnMatch() {
        CharacterReader reader = new CharacterReader("hello world");
        assertTrue(reader.matchConsume("hello"));
        assertEquals(" world", reader.toString());

        assertFalse(reader.matchConsume("earth"));
        assertEquals(" world", reader.toString());
    }

    @Test
    public void matchConsumeIgnoreCase_matchingAndNonMatching_advancesPosOnlyOnMatch() {
        CharacterReader reader = new CharacterReader("HELLO world");
        assertTrue(reader.matchConsumeIgnoreCase("hello"));
        assertEquals(" world", reader.toString());

        assertFalse(reader.matchConsumeIgnoreCase("earth"));
        assertEquals(" world", reader.toString());
    }

    @Test
    public void containsIgnoreCase_lowercaseUppercaseAndNotFound_returnsExpected() {
        CharacterReader reader = new CharacterReader("some </TITLE> in text");
        assertTrue(reader.containsIgnoreCase("</title>"));
        assertTrue(reader.containsIgnoreCase("</TITLE>"));
        assertFalse(reader.containsIgnoreCase("</style>"));

        reader.consumeTo("in");
        assertFalse(reader.containsIgnoreCase("</title>"));
    }

    @Test
    public void toString_returnsRemainingString() {
        CharacterReader reader = new CharacterReader("sample text");
        assertEquals("sample text", reader.toString());
        reader.consumeTo(' ');
        assertEquals(" text", reader.toString());
    }
}
