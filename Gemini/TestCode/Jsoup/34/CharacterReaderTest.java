package org.jsoup.parser;

import org.jsoup.helper.ValidationException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullInput_throwsException() {
        new CharacterReader(null);
    }

    @Test
    public void testPosAndAdvanceAndUnconsume() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());

        reader.advance();
        assertEquals(1, reader.pos());

        reader.unconsume();
        assertEquals(0, reader.pos());
    }

    @Test
    public void testIsEmpty() {
        CharacterReader emptyReader = new CharacterReader("");
        assertTrue(emptyReader.isEmpty());

        CharacterReader reader = new CharacterReader("a");
        assertFalse(reader.isEmpty());
        reader.consume();
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testCurrent() {
        CharacterReader reader = new CharacterReader("ab");
        assertEquals('a', reader.current());
        reader.consume();
        assertEquals('b', reader.current());
        reader.consume();
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsume() {
        CharacterReader reader = new CharacterReader("ab");
        assertEquals('a', reader.consume());
        assertEquals('b', reader.consume());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testMarkAndRewindToMark() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume();
        reader.consume();
        reader.mark();
        assertEquals(2, reader.pos());

        reader.consume();
        reader.consume();
        assertEquals(4, reader.pos());

        reader.rewindToMark();
        assertEquals(2, reader.pos());
        assertEquals('c', reader.current());
    }

    @Test
    public void testConsumeAsString() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("a", reader.consumeAsString());
        assertEquals("b", reader.consumeAsString());
        assertEquals("c", reader.consumeAsString());
    }

    @Test
    public void testNextIndexOfChar() {
        CharacterReader reader = new CharacterReader("banana");
        assertEquals(1, reader.nextIndexOf('a'));
        assertEquals(0, reader.nextIndexOf('b'));
        assertEquals(-1, reader.nextIndexOf('z'));

        reader.advance(); // at 'a'
        reader.advance(); // at 'n'
        assertEquals(1, reader.nextIndexOf('a'));
    }

    @Test
    public void testNextIndexOfCharSequence() {
        CharacterReader reader = new CharacterReader("banana");
        assertEquals(1, reader.nextIndexOf("an"));
        assertEquals(0, reader.nextIndexOf("ban"));
        assertEquals(3, reader.nextIndexOf("ana"));
        assertEquals(-1, reader.nextIndexOf("nanaz"));
        assertEquals(-1, reader.nextIndexOf("xyz"));

        CharacterReader notFoundReader = new CharacterReader("mississippi");
        assertEquals(-1, notFoundReader.nextIndexOf("issipz"));
        assertEquals(-1, notFoundReader.nextIndexOf("piq"));
    }

    @Test
    public void testConsumeToChar() {
        CharacterReader reader = new CharacterReader("one=two");
        assertEquals("one", reader.consumeTo('='));
        assertEquals('=', reader.current());

        CharacterReader reader2 = new CharacterReader("hello world");
        assertEquals("hello world", reader2.consumeTo('z'));
        assertTrue(reader2.isEmpty());
    }

    @Test
    public void testConsumeToString() {
        CharacterReader reader = new CharacterReader("one==two");
        assertEquals("one", reader.consumeTo("=="));
        assertEquals('=', reader.current());

        CharacterReader reader2 = new CharacterReader("hello world");
        assertEquals("hello world", reader2.consumeTo("xyz"));
        assertTrue(reader2.isEmpty());
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader reader = new CharacterReader("foo & bar < baz");
        assertEquals("foo ", reader.consumeToAny('&', '<'));
        assertEquals('&', reader.consume());
        assertEquals(" bar ", reader.consumeToAny('&', '<'));
        assertEquals('<', reader.consume());
        assertEquals(" baz", reader.consumeToAny('&', '<'));
        assertTrue(reader.isEmpty());

        CharacterReader reader2 = new CharacterReader("&bar");
        assertEquals("", reader2.consumeToAny('&', '<'));

        CharacterReader reader3 = new CharacterReader("foobar");
        assertEquals("foobar", reader3.consumeToAny('&', '<'));
    }

    @Test
    public void testConsumeToEnd() {
        CharacterReader reader = new CharacterReader("hello world");
        reader.advance();
        assertEquals("ello world", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
        assertEquals("", reader.consumeToEnd());
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader reader = new CharacterReader("HelloWorld123");
        assertEquals("HelloWorld", reader.consumeLetterSequence());
        assertEquals('1', reader.current());

        CharacterReader reader2 = new CharacterReader("123HelloWorld");
        assertEquals("", reader2.consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader reader = new CharacterReader("Hello123World456");
        assertEquals("Hello123", reader.consumeLetterThenDigitSequence());
        assertEquals("World456", reader.consumeLetterThenDigitSequence());

        CharacterReader reader2 = new CharacterReader("123Hello");
        assertEquals("123", reader2.consumeLetterThenDigitSequence());

        CharacterReader reader3 = new CharacterReader("!@#");
        assertEquals("", reader3.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader reader = new CharacterReader("0123456789abcdefABCDEFghij");
        assertEquals("0123456789abcdefABCDEF", reader.consumeHexSequence());
        assertEquals('g', reader.current());

        CharacterReader reader2 = new CharacterReader("xyz");
        assertEquals("", reader2.consumeHexSequence());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader reader = new CharacterReader("12345abc678");
        assertEquals("12345", reader.consumeDigitSequence());
        assertEquals('a', reader.current());

        CharacterReader reader2 = new CharacterReader("abc");
        assertEquals("", reader2.consumeDigitSequence());
    }

    @Test
    public void testMatchesChar() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));
        reader.consumeToEnd();
        assertFalse(reader.matches('a'));
    }

    @Test
    public void testMatchesString() {
        CharacterReader reader = new CharacterReader("hello world");
        assertTrue(reader.matches("hello"));
        assertFalse(reader.matches("world"));
        assertFalse(reader.matches("hello world longer"));

        reader.consumeToEnd();
        assertFalse(reader.matches("hello"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader("Hello World");
        assertTrue(reader.matchesIgnoreCase("HELLO"));
        assertTrue(reader.matchesIgnoreCase("hello"));
        assertFalse(reader.matchesIgnoreCase("WORLD"));
        assertFalse(reader.matchesIgnoreCase("Hello World Long"));

        reader.consumeToEnd();
        assertFalse(reader.matchesIgnoreCase("h"));
    }

    @Test
    public void testMatchesAny() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAny('x', 'y', 'a'));
        assertFalse(reader.matchesAny('x', 'y', 'z'));

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesLetter() {
        CharacterReader reader = new CharacterReader("aB1#");
        assertTrue(reader.matchesLetter()); // 'a'
        reader.advance();
        assertTrue(reader.matchesLetter()); // 'B'
        reader.advance();
        assertFalse(reader.matchesLetter()); // '1'
        reader.advance();
        assertFalse(reader.matchesLetter()); // '#'
        reader.advance();
        assertFalse(reader.matchesLetter()); // EOF
    }

    @Test
    public void testMatchesDigit() {
        CharacterReader reader = new CharacterReader("1a");
        assertTrue(reader.matchesDigit());
        reader.advance();
        assertFalse(reader.matchesDigit());
        reader.advance();
        assertFalse(reader.matchesDigit()); // EOF
    }

    @Test
    public void testMatchConsume() {
        CharacterReader reader = new CharacterReader("hello world");
        assertTrue(reader.matchConsume("hello"));
        assertEquals(' ', reader.current());
        assertFalse(reader.matchConsume("planet"));
        assertEquals(' ', reader.current());
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader reader = new CharacterReader("Hello World");
        assertTrue(reader.matchConsumeIgnoreCase("HELLO"));
        assertEquals(' ', reader.current());
        assertFalse(reader.matchConsumeIgnoreCase("PLANET"));
        assertEquals(' ', reader.current());
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("Some </TITLE> and </style>");
        assertTrue(reader.containsIgnoreCase("</title>"));
        assertTrue(reader.containsIgnoreCase("</STYLE>"));
        assertTrue(reader.containsIgnoreCase("</style>"));
        assertFalse(reader.containsIgnoreCase("</script>"));
    }

    @Test
    public void testToString() {
        CharacterReader reader = new CharacterReader("hello world");
        assertEquals("hello world", reader.toString());
        reader.consumeTo(' ');
        assertEquals(" world", reader.toString());
        reader.consumeToEnd();
        assertEquals("", reader.toString());
    }
}
