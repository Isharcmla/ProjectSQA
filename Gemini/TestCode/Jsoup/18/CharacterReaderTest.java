package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullInput_throwsException() {
        new CharacterReader(null);
    }

    @Test
    public void testPosAndIsEmpty_initialAndAdvanced_correctState() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());
        assertFalse(reader.isEmpty());

        reader.advance();
        assertEquals(1, reader.pos());
        assertFalse(reader.isEmpty());

        reader.advance();
        reader.advance();
        assertEquals(3, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testCurrentAndConsume_variousPositions_returnsExpectedChar() {
        CharacterReader reader = new CharacterReader("ab");
        assertEquals('a', reader.current());
        assertEquals('a', reader.consume());
        assertEquals('b', reader.current());
        assertEquals('b', reader.consume());

        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testUnconsume_afterConsume_restoresPosition() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.consume());
        assertEquals(1, reader.pos());

        reader.unconsume();
        assertEquals(0, reader.pos());
        assertEquals('a', reader.current());
    }

    @Test
    public void testMarkAndRewindToMark_markedPosition_rewindsCorrectly() {
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
    public void testConsumeAsString_normal_advancesPosAndReturnsSubstring() {
        CharacterReader reader = new CharacterReader("abc");
        String s = reader.consumeAsString();
        assertEquals("", s);
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());
    }

    @Test
    public void testConsumeToChar_foundAndNotFound_consumesAppropriately() {
        CharacterReader reader = new CharacterReader("hello world!");
        String consumed = reader.consumeTo(' ');
        assertEquals("hello", consumed);
        assertEquals(5, reader.pos());

        reader.advance(); // skip space
        String consumedToEnd = reader.consumeTo('z'); // not found
        assertEquals("world", consumedToEnd);
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToString_foundAndNotFound_consumesAppropriately() {
        CharacterReader reader = new CharacterReader("foo <!-- comment --> bar");
        String consumed = reader.consumeTo("<!--");
        assertEquals("foo ", consumed);
        assertEquals(4, reader.pos());

        String consumedToEnd = reader.consumeTo("missing");
        assertEquals("<!-- comment --> ba", consumedToEnd);
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAny_variousConditions_consumesCorrectly() {
        CharacterReader reader = new CharacterReader("one, two; three");
        String part1 = reader.consumeToAny(',', ';');
        assertEquals("one", part1);
        assertEquals(3, reader.pos());

        reader.advance(); // skip ','
        reader.advance(); // skip ' '
        String part2 = reader.consumeToAny(';', ',');
        assertEquals("two", part2);

        reader.advance(); // skip ';'
        reader.advance(); // skip ' '
        String part3 = reader.consumeToAny('x', 'y', 'z');
        assertEquals("three", part3);
        assertTrue(reader.isEmpty());

        String emptyPart = reader.consumeToAny('a');
        assertEquals("", emptyPart);
    }

    @Test
    public void testConsumeToEnd_directCall_consumesString() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.advance();
        String result = reader.consumeToEnd();
        assertEquals("bcde", result);
        assertEquals(6, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeLetterSequence_mixedChars_consumesLettersOnly() {
        CharacterReader reader = new CharacterReader("abcXYZ123def");
        String letters = reader.consumeLetterSequence();
        assertEquals("abcXYZ", letters);
        assertEquals(6, reader.pos());

        CharacterReader nonLetterReader = new CharacterReader("123abc");
        assertEquals("", nonLetterReader.consumeLetterSequence());

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals("", emptyReader.consumeLetterSequence());
    }

    @Test
    public void testConsumeHexSequence_mixedChars_consumesHexOnly() {
        CharacterReader reader = new CharacterReader("0123456789ABCDEFabcdefGHI");
        String hex = reader.consumeHexSequence();
        assertEquals("0123456789ABCDEFabcdef", hex);
        assertEquals(22, reader.pos());

        CharacterReader nonHexReader = new CharacterReader("xyz");
        assertEquals("", nonHexReader.consumeHexSequence());

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals("", emptyReader.consumeHexSequence());
    }

    @Test
    public void testConsumeDigitSequence_mixedChars_consumesDigitsOnly() {
        CharacterReader reader = new CharacterReader("12345abc");
        String digits = reader.consumeDigitSequence();
        assertEquals("12345", digits);
        assertEquals(5, reader.pos());

        CharacterReader nonDigitReader = new CharacterReader("abc123");
        assertEquals("", nonDigitReader.consumeDigitSequence());

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals("", emptyReader.consumeDigitSequence());
    }

    @Test
    public void testMatchesChar_matchesAndMismatches_correctResult() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matches('a'));
    }

    @Test
    public void testMatchesString_matchesAndMismatches_correctResult() {
        CharacterReader reader = new CharacterReader("hello world");
        assertTrue(reader.matches("hello"));
        assertFalse(reader.matches("world"));

        reader.advance();
        assertTrue(reader.matches("ello"));
    }

    @Test
    public void testMatchesIgnoreCase_matchesAndMismatches_correctResult() {
        CharacterReader reader = new CharacterReader("HeLLo World");
        assertTrue(reader.matchesIgnoreCase("hello"));
        assertTrue(reader.matchesIgnoreCase("HELLO"));
        assertFalse(reader.matchesIgnoreCase("world"));
    }

    @Test
    public void testMatchesAny_variousInputs_correctResult() {
        CharacterReader reader = new CharacterReader("test");
        assertTrue(reader.matchesAny('x', 't', 'y'));
        assertFalse(reader.matchesAny('x', 'y', 'z'));
        assertFalse(reader.matchesAny());

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesLetter_variousInputs_correctResult() {
        CharacterReader lowerReader = new CharacterReader("a1");
        assertTrue(lowerReader.matchesLetter());

        CharacterReader upperReader = new CharacterReader("Z1");
        assertTrue(upperReader.matchesLetter());

        CharacterReader digitReader = new CharacterReader("1a");
        assertFalse(digitReader.matchesLetter());

        CharacterReader symbolReader = new CharacterReader("@a");
        assertFalse(symbolReader.matchesLetter());

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesLetter());
    }

    @Test
    public void testMatchesDigit_variousInputs_correctResult() {
        CharacterReader digitReader = new CharacterReader("5a");
        assertTrue(digitReader.matchesDigit());

        CharacterReader letterReader = new CharacterReader("a5");
        assertFalse(letterReader.matchesDigit());

        CharacterReader symbolReader = new CharacterReader("/0");
        assertFalse(symbolReader.matchesDigit());

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesDigit());
    }

    @Test
    public void testMatchConsume_matchesAndMismatches_advancesWhenMatched() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc"));
        assertEquals(3, reader.pos());

        assertFalse(reader.matchConsume("xyz"));
        assertEquals(3, reader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase_matchesAndMismatches_advancesWhenMatched() {
        CharacterReader reader = new CharacterReader("ABCdef");
        assertTrue(reader.matchConsumeIgnoreCase("abc"));
        assertEquals(3, reader.pos());

        assertFalse(reader.matchConsumeIgnoreCase("xyz"));
        assertEquals(3, reader.pos());
    }

    @Test
    public void testContainsIgnoreCase_variousCases_returnsExpected() {
        CharacterReader reader = new CharacterReader("Hello <TITLE>World</title>");
        assertTrue(reader.containsIgnoreCase("title"));
        assertTrue(reader.containsIgnoreCase("TITLE"));
        assertFalse(reader.containsIgnoreCase("style"));

        reader.consumeTo('W');
        assertTrue(reader.containsIgnoreCase("world"));
        assertFalse(reader.containsIgnoreCase("hello"));
    }

    @Test
    public void testToString_variousPositions_returnsRemainingInput() {
        CharacterReader reader = new CharacterReader("hello");
        assertEquals("hello", reader.toString());

        reader.advance();
        reader.advance();
        assertEquals("llo", reader.toString());

        reader.consumeToEnd();
        assertEquals("", reader.toString());
    }
}
