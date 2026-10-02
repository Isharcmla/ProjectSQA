package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsException() {
        new CharacterReader((Reader) null, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_unsupportedMarkReader_throwsException() {
        Reader unmarkableReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) {
                return -1;
            }

            @Override
            public void close() {
            }

            @Override
            public boolean markSupported() {
                return false;
            }
        };
        new CharacterReader(unmarkableReader);
    }

    @Test
    public void testConstructor_readerWithSizeLargerThanMaxBuffer_capsBuffer() {
        String data = "Hello World";
        CharacterReader reader = new CharacterReader(new StringReader(data), CharacterReader.maxBufferLen + 1000);
        assertEquals("Hello World", reader.consumeToEnd());
    }

    @Test
    public void testConstructor_readerDefaultSize_success() {
        CharacterReader reader = new CharacterReader(new StringReader("Sample"));
        assertEquals("Sample", reader.consumeToEnd());
    }

    @Test
    public void testConstructor_stringInput_success() {
        CharacterReader reader = new CharacterReader("Test");
        assertEquals("Test", reader.consumeToEnd());
    }

    @Test(expected = UncheckedIOException.class)
    public void testBufferUp_ioException_throwsUncheckedIOException() {
        Reader failingReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated read error");
            }

            @Override
            public void close() {
            }

            @Override
            public boolean markSupported() {
                return true;
            }
        };
        new CharacterReader(failingReader, 10);
    }

    @Test
    public void testBufferUp_multipleRefills_readsAllData() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000; i++) {
            sb.append("0123456789");
        }
        String fullString = sb.toString();

        CharacterReader reader = new CharacterReader(new StringReader(fullString), 50);
        StringBuilder consumed = new StringBuilder();
        while (!reader.isEmpty()) {
            consumed.append(reader.consume());
        }
        assertEquals(fullString, consumed.toString());
        assertEquals(CharacterReader.EOF, reader.consume());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testPos_advancementAndRewind_tracksPositionCorrectly() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals(0, reader.pos());
        reader.advance();
        assertEquals(1, reader.pos());
        reader.consume();
        assertEquals(2, reader.pos());
        reader.mark();
        reader.advance();
        reader.advance();
        assertEquals(4, reader.pos());
        reader.rewindToMark();
        assertEquals(2, reader.pos());
        reader.unconsume();
        assertEquals(1, reader.pos());
    }

    @Test
    public void testCurrentAndConsume_emptyReader_returnsEof() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testNextIndexOf_char_foundAndNotFound() {
        CharacterReader reader = new CharacterReader("abcdefg");
        assertEquals(2, reader.nextIndexOf('c'));
        assertEquals(-1, reader.nextIndexOf('z'));
        reader.consumeTo('c');
        assertEquals(0, reader.nextIndexOf('c'));
        reader.consumeToEnd();
        assertEquals(-1, reader.nextIndexOf('c'));
    }

    @Test
    public void testNextIndexOf_charSequence_foundAndNotFound() {
        CharacterReader reader = new CharacterReader("abcde_xyz_123");
        assertEquals(6, reader.nextIndexOf("xyz"));
        assertEquals(-1, reader.nextIndexOf("notfound"));
        assertEquals(-1, reader.nextIndexOf("1234567890"));

        CharacterReader shortReader = new CharacterReader("abc");
        assertEquals(-1, shortReader.nextIndexOf("abcd"));
    }

    @Test
    public void testConsumeTo_char_normalAndMissing() {
        CharacterReader reader = new CharacterReader("one=two;three");
        assertEquals("one", reader.consumeTo('='));
        reader.consume(); // skip '='
        assertEquals("two", reader.consumeTo(';'));
        reader.consume(); // skip ';'
        assertEquals("three", reader.consumeTo('?'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeTo_string_normalAndMissing() {
        CharacterReader reader = new CharacterReader("start<!--comment-->end");
        assertEquals("start", reader.consumeTo("<!--"));
        reader.matchConsume("<!--");
        assertEquals("comment", reader.consumeTo("-->"));
        reader.matchConsume("-->");
        assertEquals("end", reader.consumeTo("missing"));
    }

    @Test
    public void testConsumeToAny_foundAndEmptyResult() {
        CharacterReader reader = new CharacterReader("foo/bar?baz");
        assertEquals("foo", reader.consumeToAny('/', '?'));
        assertEquals('/', reader.consume());
        assertEquals("bar", reader.consumeToAny('?', '!'));
        assertEquals('?', reader.consume());
        assertEquals("baz", reader.consumeToAny('@', '#'));
        assertEquals("", reader.consumeToAny('x', 'y'));
    }

    @Test
    public void testConsumeToAnySorted_foundAndEmptyResult() {
        CharacterReader reader = new CharacterReader("alpha:beta=gamma");
        char[] sortedDelims = new char[]{':', '='};
        Arrays.sort(sortedDelims);

        assertEquals("alpha", reader.consumeToAnySorted(sortedDelims));
        assertEquals(':', reader.consume());
        assertEquals("beta", reader.consumeToAnySorted(sortedDelims));
        assertEquals('=', reader.consume());
        assertEquals("gamma", reader.consumeToAnySorted(sortedDelims));
        assertEquals("", reader.consumeToAnySorted(sortedDelims));
    }

    @Test
    public void testConsumeData_stopsAtSpecialChars() {
        CharacterReader reader = new CharacterReader("plain&amp<tag\0end");
        assertEquals("plain", reader.consumeData());
        reader.advance(); // skip '&'
        assertEquals("amp", reader.consumeData());
        reader.advance(); // skip '<'
        assertEquals("tag", reader.consumeData());
        reader.advance(); // skip '\0'
        assertEquals("end", reader.consumeData());
    }

    @Test
    public void testConsumeTagName_stopsAtWhitespaceAndDelimiters() {
        String[] tags = {"div ", "span\t", "p\n", "b\r", "i\f", "br/", "hr>", "a\0", "em<"};
        for (String t : tags) {
            CharacterReader reader = new CharacterReader(t);
            assertFalse(reader.consumeTagName().isEmpty());
        }
        CharacterReader emptyReader = new CharacterReader(" ");
        assertEquals("", emptyReader.consumeTagName());
    }

    @Test
    public void testConsumeLetterSequence_variousInputs() {
        CharacterReader reader = new CharacterReader("HelloWorld123 \u00E9cole");
        assertEquals("HelloWorld", reader.consumeLetterSequence());
        assertEquals("", reader.consumeLetterSequence());
        reader.consumeTo(' ');
        reader.consume();
        assertEquals("\u00E9cole", reader.consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequence_variousInputs() {
        CharacterReader reader = new CharacterReader("User12345!Next6789");
        assertEquals("User12345", reader.consumeLetterThenDigitSequence());
        reader.consume(); // skip '!'
        assertEquals("Next6789", reader.consumeLetterThenDigitSequence());

        CharacterReader nonAlphaReader = new CharacterReader("!@#");
        assertEquals("", nonAlphaReader.consumeLetterThenDigitSequence());

        CharacterReader onlyDigits = new CharacterReader("999");
        assertEquals("", onlyDigits.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeHexSequence_validAndInvalid() {
        CharacterReader reader = new CharacterReader("0123456789abcdefABCDEFxyz");
        assertEquals("0123456789abcdefABCDEF", reader.consumeHexSequence());
        assertEquals("", reader.consumeHexSequence());
    }

    @Test
    public void testConsumeDigitSequence_validAndInvalid() {
        CharacterReader reader = new CharacterReader("1234567890abc");
        assertEquals("1234567890", reader.consumeDigitSequence());
        assertEquals("", reader.consumeDigitSequence());
    }

    @Test
    public void testMatches_char_matchingAndMismatch() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));
        reader.consumeToEnd();
        assertFalse(reader.matches('a'));
    }

    @Test
    public void testMatches_string_matchingAndMismatch() {
        CharacterReader reader = new CharacterReader("hello world");
        assertTrue(reader.matches("hello"));
        assertFalse(reader.matches("world"));
        assertFalse(reader.matches("hello world longer"));
    }

    @Test
    public void testMatchesIgnoreCase_matchingAndMismatch() {
        CharacterReader reader = new CharacterReader("HeLLo WoRLd");
        assertTrue(reader.matchesIgnoreCase("hello"));
        assertTrue(reader.matchesIgnoreCase("HELLO"));
        assertFalse(reader.matchesIgnoreCase("world"));
        assertFalse(reader.matchesIgnoreCase("hello world too long string"));
    }

    @Test
    public void testMatchesAny_matchingAndMismatch() {
        CharacterReader reader = new CharacterReader("test");
        assertTrue(reader.matchesAny('x', 't', 'y'));
        assertFalse(reader.matchesAny('a', 'b', 'c'));
        reader.consumeToEnd();
        assertFalse(reader.matchesAny('t'));
    }

    @Test
    public void testMatchesAnySorted_matchingAndMismatch() {
        CharacterReader reader = new CharacterReader("test");
        char[] sorted = new char[]{'a', 'm', 't', 'z'};
        assertTrue(reader.matchesAnySorted(sorted));
        assertFalse(reader.matchesAnySorted(new char[]{'a', 'b', 'c'}));
        reader.consumeToEnd();
        assertFalse(reader.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesLetter_matchingAndMismatch() {
        CharacterReader reader = new CharacterReader("aZ\u00FC1!");
        assertTrue(reader.matchesLetter()); // 'a'
        reader.advance();
        assertTrue(reader.matchesLetter()); // 'Z'
        reader.advance();
        assertTrue(reader.matchesLetter()); // '\u00FC'
        reader.advance();
        assertFalse(reader.matchesLetter()); // '1'
        reader.advance();
        assertFalse(reader.matchesLetter()); // '!'
        reader.advance();
        assertFalse(reader.matchesLetter()); // EOF
    }

    @Test
    public void testMatchesDigit_matchingAndMismatch() {
        CharacterReader reader = new CharacterReader("09a");
        assertTrue(reader.matchesDigit()); // '0'
        reader.advance();
        assertTrue(reader.matchesDigit()); // '9'
        reader.advance();
        assertFalse(reader.matchesDigit()); // 'a'
        reader.advance();
        assertFalse(reader.matchesDigit()); // EOF
    }

    @Test
    public void testMatchConsume_matchingAndMismatch() {
        CharacterReader reader = new CharacterReader("prefix-content");
        assertTrue(reader.matchConsume("prefix-"));
        assertEquals("content", reader.toString());
        assertFalse(reader.matchConsume("invalid"));
    }

    @Test
    public void testMatchConsumeIgnoreCase_matchingAndMismatch() {
        CharacterReader reader = new CharacterReader("PrEFiX-content");
        assertTrue(reader.matchConsumeIgnoreCase("prefix-"));
        assertEquals("content", reader.toString());
        assertFalse(reader.matchConsumeIgnoreCase("invalid"));
    }

    @Test
    public void testContainsIgnoreCase_foundAndNotFound() {
        CharacterReader reader = new CharacterReader("Some </STYLE> tag and </Title>");
        assertTrue(reader.containsIgnoreCase("</style>"));
        assertTrue(reader.containsIgnoreCase("</TITLE>"));
        assertFalse(reader.containsIgnoreCase("</script>"));
    }

    @Test
    public void testToString_returnsRemainingContent() {
        CharacterReader reader = new CharacterReader("123456789");
        assertEquals("123456789", reader.toString());
        reader.consume();
        reader.consume();
        assertEquals("3456789", reader.toString());
        reader.consumeToEnd();
        assertEquals("", reader.toString());
    }

    @Test
    public void testRangeEquals_staticAndInstance_branches() {
        char[] buf = "abcdef".toCharArray();
        assertTrue(CharacterReader.rangeEquals(buf, 0, 6, "abcdef"));
        assertFalse(CharacterReader.rangeEquals(buf, 0, 5, "abcdef"));
        assertFalse(CharacterReader.rangeEquals(buf, 0, 6, "abcdeg"));

        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.rangeEquals(0, 6, "abcdef"));
        assertFalse(reader.rangeEquals(0, 5, "abcdef"));
    }

    @Test
    public void testStringCache_collisionsAndLongStrings() {
        // String longer than maxStringCacheLen (12)
        CharacterReader reader1 = new CharacterReader("longerthan12chars");
        String longConsumed = reader1.consumeToEnd();
        assertEquals("longerthan12chars", longConsumed);

        // Repeated reads to test cache hit
        CharacterReader reader2 = new CharacterReader("tag tag tag");
        String tag1 = reader2.consumeTo(' ');
        reader2.consume();
        String tag2 = reader2.consumeTo(' ');
        reader2.consume();
        String tag3 = reader2.consumeToEnd();

        assertSame(tag1, tag2);
        assertSame(tag2, tag3);
        assertEquals("tag", tag1);

        // Empty string caching
        CharacterReader reader3 = new CharacterReader("");
        assertEquals("", reader3.consumeToEnd());
    }
}
