package org.jsoup.parser;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullInput_throwsIllegalArgumentException() {
        new CharacterReader(null);
    }

    @Test
    public void testConstructorAndBasicState_emptyInput() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        assertEquals(0, reader.pos());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());
        assertEquals("", reader.toString());
    }

    @Test
    public void testPosAdvanceAndUnconsume() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());

        reader.advance();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());

        reader.unconsume();
        assertEquals(0, reader.pos());
        assertEquals('a', reader.current());
    }

    @Test
    public void testConsumeAndCurrent_normalInput() {
        CharacterReader reader = new CharacterReader("ab");
        assertFalse(reader.isEmpty());
        assertEquals('a', reader.current());

        assertEquals('a', reader.consume());
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());

        assertEquals('b', reader.consume());
        assertEquals(2, reader.pos());
        assertTrue(reader.isEmpty());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testMarkAndRewindToMark() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume(); // pos 1
        reader.consume(); // pos 2
        reader.mark();

        reader.consume(); // pos 3
        reader.consume(); // pos 4
        assertEquals(4, reader.pos());
        assertEquals('e', reader.current());

        reader.rewindToMark();
        assertEquals(2, reader.pos());
        assertEquals('c', reader.current());
    }

    @Test
    public void testConsumeAsString() {
        CharacterReader reader = new CharacterReader("hello");
        assertEquals("h", reader.consumeAsString());
        assertEquals("e", reader.consumeAsString());
        assertEquals(2, reader.pos());
    }

    @Test
    public void testNextIndexOfChar_foundAndNotFound() {
        CharacterReader reader = new CharacterReader("banana");
        assertEquals(1, reader.nextIndexOf('a'));
        assertEquals(0, reader.nextIndexOf('b'));
        assertEquals(5, reader.nextIndexOf('a') + 4); // check offset
        assertEquals(-1, reader.nextIndexOf('z'));

        reader.advance(); // pos 1 ('a')
        assertEquals(0, reader.nextIndexOf('a'));
        assertEquals(1, reader.nextIndexOf('n'));
        assertEquals(-1, reader.nextIndexOf('b'));

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals(-1, emptyReader.nextIndexOf('a'));
    }

    @Test
    public void testNextIndexOfCharSequence_foundNotFoundAndPartialMatches() {
        CharacterReader reader = new CharacterReader("abcababcabx");
        assertEquals(0, reader.nextIndexOf("abc"));
        assertEquals(3, reader.nextIndexOf("ababc"));
        assertEquals(10, reader.nextIndexOf("x"));
        assertEquals(-1, reader.nextIndexOf("notfound"));
        assertEquals(-1, reader.nextIndexOf("abcababcabxyz")); // longer than remaining

        CharacterReader reader2 = new CharacterReader("aaaaab");
        assertEquals(4, reader2.nextIndexOf("ab"));
        assertEquals(-1, reader2.nextIndexOf("ac"));

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals(-1, emptyReader.nextIndexOf("a"));
    }

    @Test
    public void testConsumeToChar_foundAndNotFound() {
        CharacterReader reader = new CharacterReader("foo-bar");
        assertEquals("foo", reader.consumeTo('-'));
        assertEquals('-', reader.current());
        assertEquals("-bar", reader.consumeTo('z'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToString_foundAndNotFound() {
        CharacterReader reader = new CharacterReader("one [[two]] three");
        assertEquals("one ", reader.consumeTo("[["));
        assertEquals("[[", reader.current() + "" + (char)reader.input[reader.pos() + 1]);
        assertEquals("[[two]] three", reader.consumeTo("not-present"));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAny() {
        CharacterReader reader = new CharacterReader("foo & bar < baz");
        assertEquals("foo ", reader.consumeToAny('&', '<'));
        assertEquals('&', reader.current());

        reader.advance(); // skip '&'
        assertEquals(" bar ", reader.consumeToAny('&', '<'));
        assertEquals('<', reader.current());

        reader.advance(); // skip '<'
        assertEquals(" baz", reader.consumeToAny('x', 'y'));
        assertTrue(reader.isEmpty());
        assertEquals("", reader.consumeToAny('a', 'b'));
    }

    @Test
    public void testConsumeToAnySorted() {
        char[] sortedDelims = new char[]{'&', '<', '>'};
        Arrays.sort(sortedDelims);

        CharacterReader reader = new CharacterReader("hello<world>again");
        assertEquals("hello", reader.consumeToAnySorted(sortedDelims));
        assertEquals('<', reader.current());
        reader.advance();

        assertEquals("world", reader.consumeToAnySorted(sortedDelims));
        assertEquals('>', reader.current());
        reader.advance();

        assertEquals("again", reader.consumeToAnySorted(sortedDelims));
        assertTrue(reader.isEmpty());
        assertEquals("", reader.consumeToAnySorted(sortedDelims));
    }

    @Test
    public void testConsumeData() {
        CharacterReader reader = new CharacterReader("data&more<tag\0end");
        assertEquals("data", reader.consumeData());
        assertEquals('&', reader.current());
        reader.advance();

        assertEquals("more", reader.consumeData());
        assertEquals('<', reader.current());
        reader.advance();

        assertEquals("tag", reader.consumeData());
        assertEquals('\0', reader.current());
        reader.advance();

        assertEquals("end", reader.consumeData());
        assertTrue(reader.isEmpty());
        assertEquals("", reader.consumeData());
    }

    @Test
    public void testConsumeTagName() {
        CharacterReader reader = new CharacterReader("div\tspan\r\na\fb c/d>e\0f");
        assertEquals("div", reader.consumeTagName());
        reader.advance();
        assertEquals("span", reader.consumeTagName());
        reader.advance(); // \r
        reader.advance(); // \n
        assertEquals("a", reader.consumeTagName());
        reader.advance(); // \f
        assertEquals("b", reader.consumeTagName());
        reader.advance(); // ' '
        assertEquals("c", reader.consumeTagName());
        reader.advance(); // '/'
        assertEquals("d", reader.consumeTagName());
        reader.advance(); // '>'
        assertEquals("e", reader.consumeTagName());
        reader.advance(); // '\0'
        assertEquals("f", reader.consumeTagName());
        assertTrue(reader.isEmpty());
        assertEquals("", reader.consumeTagName());
    }

    @Test
    public void testConsumeToEnd() {
        CharacterReader reader = new CharacterReader("consume entire string");
        reader.advance();
        reader.advance();
        assertEquals("nsume entire string", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
        assertEquals("", reader.consumeToEnd());
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader reader = new CharacterReader("HelloWorld123");
        assertEquals("HelloWorld", reader.consumeLetterSequence());
        assertEquals('1', reader.current());

        CharacterReader nonLetter = new CharacterReader("123abc");
        assertEquals("", nonLetter.consumeLetterSequence());
        assertEquals('1', nonLetter.current());

        CharacterReader empty = new CharacterReader("");
        assertEquals("", empty.consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader reader = new CharacterReader("abc123def456");
        assertEquals("abc123", reader.consumeLetterThenDigitSequence());
        assertEquals("def456", reader.consumeLetterThenDigitSequence());
        assertTrue(reader.isEmpty());

        CharacterReader lettersOnly = new CharacterReader("onlyLetters");
        assertEquals("onlyLetters", lettersOnly.consumeLetterThenDigitSequence());
        assertTrue(lettersOnly.isEmpty());

        CharacterReader digitsOnly = new CharacterReader("12345");
        assertEquals("12345", digitsOnly.consumeLetterThenDigitSequence());
        assertTrue(digitsOnly.isEmpty());

        CharacterReader empty = new CharacterReader("");
        assertEquals("", empty.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader reader = new CharacterReader("0123456789abcdefABCDEFghijk");
        assertEquals("0123456789abcdefABCDEF", reader.consumeHexSequence());
        assertEquals('g', reader.current());

        CharacterReader nonHex = new CharacterReader("xyz123");
        assertEquals("", nonHex.consumeHexSequence());
        assertEquals('x', nonHex.current());

        CharacterReader empty = new CharacterReader("");
        assertEquals("", empty.consumeHexSequence());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader reader = new CharacterReader("0123456789abc");
        assertEquals("0123456789", reader.consumeDigitSequence());
        assertEquals('a', reader.current());

        CharacterReader nonDigit = new CharacterReader("abc123");
        assertEquals("", nonDigit.consumeDigitSequence());

        CharacterReader empty = new CharacterReader("");
        assertEquals("", empty.consumeDigitSequence());
    }

    @Test
    public void testMatchesChar() {
        CharacterReader reader = new CharacterReader("hello");
        assertTrue(reader.matches('h'));
        assertFalse(reader.matches('e'));

        reader.consumeToEnd();
        assertFalse(reader.matches('h'));
    }

    @Test
    public void testMatchesString() {
        CharacterReader reader = new CharacterReader("hello world");
        assertTrue(reader.matches("hello"));
        assertTrue(reader.matches("hello world"));
        assertFalse(reader.matches("hello world extra"));
        assertFalse(reader.matches("world"));

        reader.consumeToEnd();
        assertFalse(reader.matches("hello"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader("hElLo WoRlD");
        assertTrue(reader.matchesIgnoreCase("HELLO"));
        assertTrue(reader.matchesIgnoreCase("hello world"));
        assertFalse(reader.matchesIgnoreCase("hello world extra"));
        assertFalse(reader.matchesIgnoreCase("world"));

        reader.consumeToEnd();
        assertFalse(reader.matchesIgnoreCase("hello"));
    }

    @Test
    public void testMatchesAny() {
        CharacterReader reader = new CharacterReader("hello");
        assertTrue(reader.matchesAny('a', 'e', 'h'));
        assertFalse(reader.matchesAny('x', 'y', 'z'));
        assertFalse(reader.matchesAny());

        reader.consumeToEnd();
        assertFalse(reader.matchesAny('h'));
    }

    @Test
    public void testMatchesAnySorted() {
        char[] sortedChars = new char[]{'c', 'e', 'h', 'z'};
        CharacterReader reader = new CharacterReader("hello");
        assertTrue(reader.matchesAnySorted(sortedChars));

        reader.advance(); // pos at 'e'
        assertTrue(reader.matchesAnySorted(sortedChars));

        reader.advance(); // pos at 'l'
        assertFalse(reader.matchesAnySorted(sortedChars));

        reader.consumeToEnd();
        assertFalse(reader.matchesAnySorted(sortedChars));
    }

    @Test
    public void testMatchesLetter() {
        CharacterReader reader = new CharacterReader("aB3!");
        assertTrue(reader.matchesLetter()); // 'a'
        reader.advance();
        assertTrue(reader.matchesLetter()); // 'B'
        reader.advance();
        assertFalse(reader.matchesLetter()); // '3'
        reader.advance();
        assertFalse(reader.matchesLetter()); // '!'
        reader.advance();
        assertFalse(reader.matchesLetter()); // EOF
    }

    @Test
    public void testMatchesDigit() {
        CharacterReader reader = new CharacterReader("1a");
        assertTrue(reader.matchesDigit()); // '1'
        reader.advance();
        assertFalse(reader.matchesDigit()); // 'a'
        reader.advance();
        assertFalse(reader.matchesDigit()); // EOF
    }

    @Test
    public void testMatchConsume() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc"));
        assertEquals(3, reader.pos());
        assertEquals('d', reader.current());

        assertFalse(reader.matchConsume("xyz"));
        assertEquals(3, reader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader reader = new CharacterReader("ABCdef");
        assertTrue(reader.matchConsumeIgnoreCase("abc"));
        assertEquals(3, reader.pos());
        assertEquals('d', reader.current());

        assertFalse(reader.matchConsumeIgnoreCase("xyz"));
        assertEquals(3, reader.pos());
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("<div>some <TITLE>My Page</Title> content</div>");
        assertTrue(reader.containsIgnoreCase("title"));
        assertTrue(reader.containsIgnoreCase("TITLE"));
        assertFalse(reader.containsIgnoreCase("style"));

        CharacterReader empty = new CharacterReader("");
        assertFalse(empty.containsIgnoreCase("something"));
    }

    @Test
    public void testToString() {
        CharacterReader reader = new CharacterReader("hello world");
        assertEquals("hello world", reader.toString());
        reader.advance();
        reader.advance();
        assertEquals("llo world", reader.toString());
        reader.consumeToEnd();
        assertEquals("", reader.toString());
    }

    @Test
    public void testCacheStringAndRangeEquals() {
        CharacterReader reader = new CharacterReader("tag tag tag longerThanMaxCacheLengthString tag");
        // Test cache hit for string <= 12 chars
        String first = reader.consumeTo(' ');
        assertEquals("tag", first);
        reader.advance();

        String second = reader.consumeTo(' ');
        assertEquals("tag", second);
        assertSame(first, second); // Flywheel cache should return the identical String instance
        reader.advance();

        String third = reader.consumeTo(' ');
        assertEquals("tag", third);
        assertSame(first, third);
        reader.advance();

        // Test string length > maxCacheLen (12)
        String longString = reader.consumeTo(' ');
        assertEquals("longerThanMaxCacheLengthString", longString);
        reader.advance();

        String fourth = reader.consumeTo(' ');
        assertEquals("tag", fourth);
        assertSame(first, fourth);

        // Test rangeEquals method explicitly
        CharacterReader rEquals = new CharacterReader("abcdef");
        assertTrue(rEquals.rangeEquals(0, 3, "abc"));
        assertFalse(rEquals.rangeEquals(0, 3, "abd"));
        assertFalse(rEquals.rangeEquals(0, 3, "ab"));
        assertFalse(rEquals.rangeEquals(0, 3, "abcd"));
    }

    private void assertSame(Object expected, Object actual) {
        assertTrue(expected == actual);
    }
}
