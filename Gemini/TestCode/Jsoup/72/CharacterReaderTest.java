package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Test;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsIllegalArgumentException() {
        new CharacterReader((Reader) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_readerWithoutMarkSupport_throwsIllegalArgumentException() {
        Reader unmarkableReader = new FilterReader(new StringReader("test")) {
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        new CharacterReader(unmarkableReader);
    }

    @Test(expected = UncheckedIOException.class)
    public void testConstructor_readerThrowsIOException_throwsUncheckedIOException() {
        Reader faultyReader = new FilterReader(new StringReader("test")) {
            @Override
            public boolean markSupported() {
                return true;
            }

            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated read error");
            }
        };
        new CharacterReader(faultyReader);
    }

    @Test
    public void testConstructor_sizeLargerThanMaxBufferLen_clampsSize() {
        String data = "Hello World";
        CharacterReader reader = new CharacterReader(new StringReader(data), CharacterReader.maxBufferLen + 1000);
        assertEquals('H', reader.current());
        assertEquals("Hello World", reader.consumeToEnd());
    }

    @Test
    public void testConstructor_defaultReaderConstructor_initializesCorrectly() {
        CharacterReader reader = new CharacterReader(new StringReader("test content"));
        assertEquals("test content", reader.consumeToEnd());
    }

    @Test
    public void testPos_tracksPositionAccurately() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals(0, reader.pos());
        reader.consume();
        assertEquals(1, reader.pos());
        reader.advance();
        assertEquals(2, reader.pos());
        reader.consumeTo('e');
        assertEquals(4, reader.pos());
    }

    @Test
    public void testIsEmpty_returnsExpectedState() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());

        reader = new CharacterReader("a");
        assertFalse(reader.isEmpty());
        reader.consume();
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testCurrent_returnsCharWithoutAdvancingOrEOF() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
        assertEquals('a', reader.current());
        reader.consumeToEnd();
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsume_returnsCharAndAdvances() {
        CharacterReader reader = new CharacterReader("ab");
        assertEquals('a', reader.consume());
        assertEquals('b', reader.consume());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testUnconsume_stepsBackOneChar() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.consume());
        reader.unconsume();
        assertEquals('a', reader.consume());
    }

    @Test
    public void testAdvance_movesForward() {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals('b', reader.current());
    }

    @Test
    public void testMarkAndRewindToMark_restoresPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.advance(); // at 'b'
        reader.mark();
        reader.advance(); // at 'c'
        reader.advance(); // at 'd'
        assertEquals('d', reader.current());
        reader.rewindToMark();
        assertEquals('b', reader.current());
    }

    @Test
    public void testNextIndexOfChar_foundAndNotFound() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals(0, reader.nextIndexOf('a'));
        assertEquals(3, reader.nextIndexOf('d'));
        assertEquals(-1, reader.nextIndexOf('z'));

        reader.advance();
        assertEquals(2, reader.nextIndexOf('d'));
    }

    @Test
    public void testNextIndexOfSequence_variousScenarios() {
        CharacterReader reader = new CharacterReader("abcde_abcdef_xyz");
        assertEquals(0, reader.nextIndexOf("abc"));
        assertEquals(6, reader.nextIndexOf("abcdef"));
        assertEquals(13, reader.nextIndexOf("xyz"));
        assertEquals(-1, reader.nextIndexOf("notfound"));
        assertEquals(-1, reader.nextIndexOf("xyz_more"));

        CharacterReader reader2 = new CharacterReader("aaaaab");
        assertEquals(4, reader2.nextIndexOf("ab"));
    }

    @Test
    public void testConsumeToChar_foundAndNotFound() {
        CharacterReader reader = new CharacterReader("one=two");
        assertEquals("one", reader.consumeTo('='));
        assertEquals("=", reader.consumeTo('t'));
        assertEquals("two", reader.consumeTo('z'));
    }

    @Test
    public void testConsumeToString_foundAndNotFound() {
        CharacterReader reader = new CharacterReader("one-->two-->three");
        assertEquals("one", reader.consumeTo("-->"));
        assertEquals("-->two", reader.consumeTo("-->three"));
        assertEquals("-->three", reader.consumeTo("notfound"));
    }

    @Test
    public void testConsumeToAny_matchesAnyOrConsumesToEnd() {
        CharacterReader reader = new CharacterReader("foo&bar<baz");
        assertEquals("foo", reader.consumeToAny('&', '<'));
        assertEquals("&", reader.consumeToAny('b'));
        assertEquals("bar", reader.consumeToAny('<'));
        assertEquals("<baz", reader.consumeToAny('x', 'y'));
    }

    @Test
    public void testConsumeToAnySorted_matchesSortedOrConsumesToEnd() {
        CharacterReader reader = new CharacterReader("hello world!");
        char[] sorted = new char[]{' ', 'd', 'o'};
        Arrays.sort(sorted);

        assertEquals("hell", reader.consumeToAnySorted(sorted));
        assertEquals("o", reader.consumeToAnySorted(new char[]{' '}));
        assertEquals(" ", reader.consumeToAnySorted(new char[]{'w'}));
        assertEquals("world!", reader.consumeToAnySorted(new char[]{'x', 'y', 'z'}));
    }

    @Test
    public void testConsumeData_stopsAtSpecialChars() {
        CharacterReader reader = new CharacterReader("data&amp;<tag>\0rest");
        assertEquals("data", reader.consumeData());
        assertEquals("&", reader.consumeToAny('a'));
        assertEquals("amp;", reader.consumeData());
        assertEquals("<", reader.consumeToAny('t'));
        assertEquals("tag>", reader.consumeData());
        assertEquals("\0", reader.consumeToAny('r'));
        assertEquals("rest", reader.consumeData());
    }

    @Test
    public void testConsumeTagName_stopsAtWhitespaceAndDelimiters() {
        CharacterReader reader = new CharacterReader("div\tspan\nsection\rarticle\fp / > \0rest");
        assertEquals("div", reader.consumeTagName());
        reader.advance();
        assertEquals("span", reader.consumeTagName());
        reader.advance();
        assertEquals("section", reader.consumeTagName());
        reader.advance();
        assertEquals("article", reader.consumeTagName());
        reader.advance();
        assertEquals("p", reader.consumeTagName());
        reader.advance();
        assertEquals("", reader.consumeTagName());
        reader.advance();
        reader.advance();
        assertEquals("", reader.consumeTagName());
        reader.advance();
        reader.advance();
        assertEquals("", reader.consumeTagName());
        reader.advance();
        assertEquals("rest", reader.consumeTagName());
    }

    @Test
    public void testConsumeLetterSequence_lettersAndUnicode() {
        CharacterReader reader = new CharacterReader("abcDEF123กขค");
        assertEquals("abcDEF", reader.consumeLetterSequence());
        assertEquals("", reader.consumeLetterSequence());
        reader.consumeDigitSequence();
        assertEquals("กขค", reader.consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequence_mixedSequences() {
        CharacterReader reader = new CharacterReader("abc12345!@#DEF456");
        assertEquals("abc12345", reader.consumeLetterThenDigitSequence());
        assertEquals("", reader.consumeLetterThenDigitSequence());
        reader.advance();
        reader.advance();
        reader.advance();
        assertEquals("DEF456", reader.consumeLetterThenDigitSequence());

        CharacterReader reader2 = new CharacterReader("lettersOnly");
        assertEquals("lettersOnly", reader2.consumeLetterThenDigitSequence());

        CharacterReader reader3 = new CharacterReader("12345");
        assertEquals("12345", reader3.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeHexSequence_validAndInvalidChars() {
        CharacterReader reader = new CharacterReader("1aF9zG0");
        assertEquals("1aF9", reader.consumeHexSequence());
        assertEquals("", reader.consumeHexSequence());
        reader.advance();
        reader.advance();
        assertEquals("0", reader.consumeHexSequence());
    }

    @Test
    public void testConsumeDigitSequence_digitsOnly() {
        CharacterReader reader = new CharacterReader("12345abc678");
        assertEquals("12345", reader.consumeDigitSequence());
        assertEquals("", reader.consumeDigitSequence());
        reader.consumeLetterSequence();
        assertEquals("678", reader.consumeDigitSequence());
    }

    @Test
    public void testMatchesChar_matchesCorrectly() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));
        reader.consumeToEnd();
        assertFalse(reader.matches('a'));
    }

    @Test
    public void testMatchesString_matchesCorrectly() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
        assertFalse(reader.matches("abd"));
        assertFalse(reader.matches("abcdefghijk"));

        reader.consumeToEnd();
        assertFalse(reader.matches("a"));
    }

    @Test
    public void testMatchesIgnoreCase_caseInsensitiveChecks() {
        CharacterReader reader = new CharacterReader("aBcDef");
        assertTrue(reader.matchesIgnoreCase("ABC"));
        assertTrue(reader.matchesIgnoreCase("abcdef"));
        assertFalse(reader.matchesIgnoreCase("ABz"));
        assertFalse(reader.matchesIgnoreCase("abcdefgh"));

        reader.consumeToEnd();
        assertFalse(reader.matchesIgnoreCase("a"));
    }

    @Test
    public void testMatchesAny_emptyAndNonEmptyInputs() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAny('c', 'b', 'a'));
        assertFalse(reader.matchesAny('x', 'y', 'z'));

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesAny('a'));
    }

    @Test
    public void testMatchesAnySorted_sortedArrayMatching() {
        char[] sorted = new char[]{'a', 'c', 'e'};
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAnySorted(sorted));
        reader.advance(); // 'b'
        assertFalse(reader.matchesAnySorted(sorted));
        reader.consumeToEnd();
        assertFalse(reader.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesLetter_detectsLetters() {
        CharacterReader reader = new CharacterReader("aZ1!ก");
        assertTrue(reader.matchesLetter()); // 'a'
        reader.advance();
        assertTrue(reader.matchesLetter()); // 'Z'
        reader.advance();
        assertFalse(reader.matchesLetter()); // '1'
        reader.advance();
        assertFalse(reader.matchesLetter()); // '!'
        reader.advance();
        assertTrue(reader.matchesLetter()); // 'ก'
        reader.advance();
        assertFalse(reader.matchesLetter()); // EOF
    }

    @Test
    public void testMatchesDigit_detectsDigits() {
        CharacterReader reader = new CharacterReader("09a!");
        assertTrue(reader.matchesDigit()); // '0'
        reader.advance();
        assertTrue(reader.matchesDigit()); // '9'
        reader.advance();
        assertFalse(reader.matchesDigit()); // 'a'
        reader.advance();
        assertFalse(reader.matchesDigit()); // '!'
        reader.advance();
        assertFalse(reader.matchesDigit()); // EOF
    }

    @Test
    public void testMatchConsume_consumesOnlyOnMatch() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc"));
        assertEquals('d', reader.current());
        assertFalse(reader.matchConsume("xyz"));
        assertEquals('d', reader.current());
    }

    @Test
    public void testMatchConsumeIgnoreCase_consumesOnlyOnMatch() {
        CharacterReader reader = new CharacterReader("aBcDef");
        assertTrue(reader.matchConsumeIgnoreCase("abc"));
        assertEquals('D', reader.current());
        assertFalse(reader.matchConsumeIgnoreCase("xyz"));
        assertEquals('D', reader.current());
    }

    @Test
    public void testContainsIgnoreCase_detectsConsistentCasePresence() {
        CharacterReader reader = new CharacterReader("<html><Title>Hello</Title><STYLE>css</style>");
        assertTrue(reader.containsIgnoreCase("title"));
        assertTrue(reader.containsIgnoreCase("TITLE"));
        assertTrue(reader.containsIgnoreCase("style"));
        assertTrue(reader.containsIgnoreCase("STYLE"));
        assertFalse(reader.containsIgnoreCase("script"));
    }

    @Test
    public void testToString_returnsRemainingContent() {
        CharacterReader reader = new CharacterReader("Hello World");
        assertEquals("Hello World", reader.toString());
        reader.consumeTo(' ');
        assertEquals(" World", reader.toString());
    }

    @Test
    public void testRangeEquals_branches() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.rangeEquals(0, 3, "abc"));
        assertFalse(reader.rangeEquals(0, 3, "abcd")); // length mismatch
        assertFalse(reader.rangeEquals(0, 3, "abz"));  // character mismatch
    }

    @Test
    public void testStringCache_hitsAndCollisionsAndLongStrings() {
        // Test strings <= 12 characters (cache hits, misses, collisions)
        CharacterReader reader = new CharacterReader("tag tag tag longerThanTwelveCharacters longerThanTwelveCharacters");
        String firstTag = reader.consumeTo(' '); // "tag" - miss, cached
        reader.advance();
        String secondTag = reader.consumeTo(' '); // "tag" - hit
        assertSame(firstTag, secondTag);

        reader.advance();
        String thirdTag = reader.consumeTo(' '); // "tag" - hit
        assertSame(firstTag, thirdTag);

        reader.advance();
        String long1 = reader.consumeTo(' '); // > 12 chars: no cache
        reader.advance();
        String long2 = reader.consumeToEnd(); // > 12 chars: no cache
        assertEquals(long1, long2);
        assertNotSame(long1, long2);
    }

    @Test
    public void testBuffering_largeInputExceedingBufferSplitPoint() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 40000; i++) {
            sb.append('a');
        }
        sb.append("end");

        CharacterReader reader = new CharacterReader(new StringReader(sb.toString()), 1024 * 32);
        for (int i = 0; i < 40000; i++) {
            assertEquals('a', reader.consume());
        }
        assertEquals("end", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
    }
}
