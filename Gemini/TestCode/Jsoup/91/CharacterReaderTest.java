package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CharacterReaderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullReader_throwsException() {
        new CharacterReader((Reader) null);
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

    @Test(expected = UncheckedIOException.class)
    public void testConstructor_readerThrowsIOException_throwsUncheckedIOException() {
        Reader errorReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Read failed");
            }

            @Override
            public void close() {
            }

            @Override
            public boolean markSupported() {
                return true;
            }
        };
        new CharacterReader(errorReader);
    }

    @Test
    public void testConstructor_customSizeLargerThanMaxBuffer_usesMaxBuffer() {
        CharacterReader reader = new CharacterReader(new StringReader("test"), CharacterReader.maxBufferLen + 5000);
        assertEquals("test", reader.consumeToEnd());
    }

    @Test
    public void testPos_advancing_returnsCorrectCursorPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals(0, reader.pos());
        reader.consume();
        assertEquals(1, reader.pos());
        reader.advance();
        assertEquals(2, reader.pos());
        reader.consumeTo('e');
        assertEquals(4, reader.pos());
        reader.consumeToEnd();
        assertEquals(6, reader.pos());
    }

    @Test
    public void testIsEmpty_variousInputs_returnsExpectedState() {
        CharacterReader emptyReader = new CharacterReader("");
        assertTrue(emptyReader.isEmpty());

        CharacterReader reader = new CharacterReader("a");
        assertFalse(reader.isEmpty());
        reader.consume();
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testCurrent_atVariousPositions_returnsCorrectCharOrEOF() {
        CharacterReader reader = new CharacterReader("ab");
        assertEquals('a', reader.current());
        reader.consume();
        assertEquals('b', reader.current());
        reader.consume();
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsume_consumingCharacters_returnsCharsAndAdvances() {
        CharacterReader reader = new CharacterReader("xyz");
        assertEquals('x', reader.consume());
        assertEquals('y', reader.consume());
        assertEquals('z', reader.consume());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testUnconsume_afterConsume_revertsPosition() {
        CharacterReader reader = new CharacterReader("abc");
        reader.consume();
        reader.consume();
        assertEquals('c', reader.current());
        reader.unconsume();
        assertEquals('b', reader.current());
    }

    @Test(expected = UncheckedIOException.class)
    public void testUnconsume_atStartOfBuffer_throwsException() {
        CharacterReader reader = new CharacterReader("abc");
        reader.unconsume();
    }

    @Test
    public void testMarkAndRewindToMark_validMark_rewindsSuccessfully() {
        CharacterReader reader = new CharacterReader("abcdefgh");
        reader.consume();
        reader.consume();
        reader.mark();
        reader.consume();
        reader.consume();
        assertEquals('e', reader.current());
        reader.rewindToMark();
        assertEquals('c', reader.current());
        assertEquals(2, reader.pos());
    }

    @Test(expected = UncheckedIOException.class)
    public void testRewindToMark_withoutMark_throwsException() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.rewindToMark();
    }

    @Test
    public void testNextIndexOf_charTarget_returnsExpectedOffset() {
        CharacterReader reader = new CharacterReader("abcdefg");
        assertEquals(0, reader.nextIndexOf('a'));
        assertEquals(3, reader.nextIndexOf('d'));
        assertEquals(-1, reader.nextIndexOf('z'));

        reader.consume();
        reader.consume();
        assertEquals(1, reader.nextIndexOf('d'));
    }

    @Test
    public void testNextIndexOf_charSequenceTarget_handlesMatchesAndMismatches() {
        CharacterReader reader = new CharacterReader("abcde_ab_abc_abcdef");
        assertEquals(0, reader.nextIndexOf("abc"));
        assertEquals(6, reader.nextIndexOf("ab_"));
        assertEquals(13, reader.nextIndexOf("abcdef"));
        assertEquals(-1, reader.nextIndexOf("notFound"));
        assertEquals(-1, reader.nextIndexOf("abcdef_tooLong"));

        CharacterReader partialReader = new CharacterReader("abxabyabz");
        assertEquals(6, partialReader.nextIndexOf("abz"));
    }

    @Test
    public void testConsumeTo_char_consumesCorrectly() {
        CharacterReader reader = new CharacterReader("one,two,three");
        assertEquals("one", reader.consumeTo(','));
        assertEquals(',', reader.consume());
        assertEquals("two", reader.consumeTo(','));
        assertEquals(',', reader.consume());
        assertEquals("three", reader.consumeTo(','));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeTo_string_consumesCorrectly() {
        CharacterReader reader = new CharacterReader("hello <b>world</b> end");
        assertEquals("hello ", reader.consumeTo("<b>"));
        assertEquals("<b>world", reader.consumeTo("</b>"));
        assertEquals("</b> end", reader.consumeTo("<missing>"));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAny_variousDelimiters_stopsAtFirstMatch() {
        CharacterReader reader = new CharacterReader("foo/bar?baz#qux");
        assertEquals("foo", reader.consumeToAny('/', '?', '#'));
        assertEquals('/', reader.consume());
        assertEquals("bar", reader.consumeToAny('/', '?', '#'));
        assertEquals('?', reader.consume());
        assertEquals("baz#qux", reader.consumeToAny('@', '$'));
        assertEquals("", reader.consumeToAny('x'));
    }

    @Test
    public void testConsumeToAnySorted_sortedDelimiters_stopsAtFirstMatch() {
        char[] sortedDelims = new char[]{'#', '/', '?'};
        Arrays.sort(sortedDelims);

        CharacterReader reader = new CharacterReader("alpha/beta?gamma#delta");
        assertEquals("alpha", reader.consumeToAnySorted(sortedDelims));
        assertEquals('/', reader.consume());
        assertEquals("beta", reader.consumeToAnySorted(sortedDelims));
        assertEquals('?', reader.consume());
        assertEquals("gamma", reader.consumeToAnySorted(sortedDelims));
        assertEquals('#', reader.consume());
        assertEquals("delta", reader.consumeToAnySorted(sortedDelims));
    }

    @Test
    public void testConsumeData_variousSpecialCharacters_stopsAtDataDelimiters() {
        CharacterReader reader1 = new CharacterReader("text&amp;");
        assertEquals("text", reader1.consumeData());

        CharacterReader reader2 = new CharacterReader("text<tag>");
        assertEquals("text", reader2.consumeData());

        CharacterReader reader3 = new CharacterReader("text\u0000null");
        assertEquals("text", reader3.consumeData());

        CharacterReader reader4 = new CharacterReader("pureTextWithoutSpecial");
        assertEquals("pureTextWithoutSpecial", reader4.consumeData());

        CharacterReader reader5 = new CharacterReader("<startWithTag");
        assertEquals("", reader5.consumeData());
    }

    @Test
    public void testConsumeTagName_variousDelimiters_stopsAtTagNameDelimiters() {
        String[] tags = new String[]{
                "div\tclass", "div\nclass", "div\rclass", "div\fclass",
                "div class", "div/class", "div>class", "div<class", "div\u0000class"
        };
        for (String tag : tags) {
            CharacterReader reader = new CharacterReader(tag);
            assertEquals("div", reader.consumeTagName());
        }

        CharacterReader reader = new CharacterReader("regularTagName");
        assertEquals("regularTagName", reader.consumeTagName());

        CharacterReader emptyStart = new CharacterReader(">div");
        assertEquals("", emptyStart.consumeTagName());
    }

    @Test
    public void testConsumeLetterSequence_lettersAndUnicode_consumesOnlyLetters() {
        CharacterReader reader = new CharacterReader("abcXYZกขค123");
        assertEquals("abcXYZกขค", reader.consumeLetterSequence());
        assertEquals('1', reader.current());

        CharacterReader readerNoLetters = new CharacterReader("123abc");
        assertEquals("", readerNoLetters.consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequence_lettersFollowedByDigits_consumesBoth() {
        CharacterReader reader = new CharacterReader("abc123def");
        assertEquals("abc123", reader.consumeLetterThenDigitSequence());
        assertEquals("def", reader.consumeLetterSequence());

        CharacterReader readerOnlyLetters = new CharacterReader("hello-world");
        assertEquals("hello", readerOnlyLetters.consumeLetterThenDigitSequence());

        CharacterReader readerOnlyDigits = new CharacterReader("123hello");
        assertEquals("123", readerOnlyDigits.consumeLetterThenDigitSequence());

        CharacterReader emptyReader = new CharacterReader("");
        assertEquals("", emptyReader.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeHexSequence_hexCharacters_consumesCorrectly() {
        CharacterReader reader = new CharacterReader("0123456789abcdefABCDEFghi");
        assertEquals("0123456789abcdefABCDEF", reader.consumeHexSequence());
        assertEquals('g', reader.current());

        CharacterReader nonHexReader = new CharacterReader("xyz");
        assertEquals("", nonHexReader.consumeHexSequence());
    }

    @Test
    public void testConsumeDigitSequence_digits_consumesCorrectly() {
        CharacterReader reader = new CharacterReader("1234567890abc");
        assertEquals("1234567890", reader.consumeDigitSequence());
        assertEquals('a', reader.current());

        CharacterReader nonDigitReader = new CharacterReader("abc123");
        assertEquals("", nonDigitReader.consumeDigitSequence());
    }

    @Test
    public void testMatches_charInput_evaluatesCorrectly() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));

        reader.consumeToEnd();
        assertFalse(reader.matches('a'));
    }

    @Test
    public void testMatches_stringInput_evaluatesCorrectly() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
        assertFalse(reader.matches("abd"));
        assertFalse(reader.matches("abcdefghijk"));

        reader.consumeToEnd();
        assertFalse(reader.matches("a"));
    }

    @Test
    public void testMatchesIgnoreCase_stringInput_evaluatesCaseInsensitive() {
        CharacterReader reader = new CharacterReader("aBcDef");
        assertTrue(reader.matchesIgnoreCase("ABC"));
        assertTrue(reader.matchesIgnoreCase("abcdef"));
        assertFalse(reader.matchesIgnoreCase("abd"));
        assertFalse(reader.matchesIgnoreCase("abcdefghijk"));
    }

    @Test
    public void testMatchesAny_variousChars_evaluatesCorrectly() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAny('x', 'y', 'a'));
        assertFalse(reader.matchesAny('x', 'y', 'z'));

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesAnySorted_sortedChars_evaluatesCorrectly() {
        char[] sorted = new char[]{'a', 'c', 'e'};
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAnySorted(sorted));

        reader.consume();
        assertFalse(reader.matchesAnySorted(sorted));

        CharacterReader emptyReader = new CharacterReader("");
        assertFalse(emptyReader.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesLetter_variousInputs_evaluatesCorrectly() {
        CharacterReader reader = new CharacterReader("aZ1ก-");
        assertTrue(reader.matchesLetter()); // 'a'
        reader.consume();
        assertTrue(reader.matchesLetter()); // 'Z'
        reader.consume();
        assertFalse(reader.matchesLetter()); // '1'
        reader.consume();
        assertTrue(reader.matchesLetter()); // Unicode letter 'ก'
        reader.consume();
        assertFalse(reader.matchesLetter()); // '-'
        reader.consume();
        assertFalse(reader.matchesLetter()); // EOF
    }

    @Test
    public void testMatchesDigit_variousInputs_evaluatesCorrectly() {
        CharacterReader reader = new CharacterReader("5a");
        assertTrue(reader.matchesDigit());
        reader.consume();
        assertFalse(reader.matchesDigit());
        reader.consume();
        assertFalse(reader.matchesDigit()); // EOF
    }

    @Test
    public void testMatchConsume_stringInput_consumesOnMatchOnly() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc"));
        assertEquals("def", reader.toString());

        assertFalse(reader.matchConsume("xyz"));
        assertEquals("def", reader.toString());
    }

    @Test
    public void testMatchConsumeIgnoreCase_stringInput_consumesOnCaseInsensitiveMatch() {
        CharacterReader reader = new CharacterReader("AbCdEf");
        assertTrue(reader.matchConsumeIgnoreCase("abc"));
        assertEquals("dEf", reader.toString());

        assertFalse(reader.matchConsumeIgnoreCase("xyz"));
        assertEquals("dEf", reader.toString());
    }

    @Test
    public void testContainsIgnoreCase_sequence_findsExpectedCaseSequences() {
        CharacterReader reader = new CharacterReader("The <TITLE>hello</TITLE> and <style>world</style>");
        assertTrue(reader.containsIgnoreCase("</title>"));
        assertTrue(reader.containsIgnoreCase("</STYLE>"));
        assertTrue(reader.containsIgnoreCase("<style>"));
        assertFalse(reader.containsIgnoreCase("</script>"));
    }

    @Test
    public void testToString_variousPositions_reflectsRemainingBuffer() {
        CharacterReader reader = new CharacterReader("hello world");
        assertEquals("hello world", reader.toString());
        reader.consumeTo(' ');
        reader.consume();
        assertEquals("world", reader.toString());
    }

    @Test
    public void testRangeEquals_staticAndInstance_evaluatesCorrectly() {
        char[] buf = "abcdef".toCharArray();
        assertTrue(CharacterReader.rangeEquals(buf, 0, 3, "abc"));
        assertFalse(CharacterReader.rangeEquals(buf, 0, 3, "abcd"));
        assertFalse(CharacterReader.rangeEquals(buf, 0, 3, "abd"));

        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.rangeEquals(0, 3, "abc"));
        assertFalse(reader.rangeEquals(0, 3, "xyz"));
        assertFalse(reader.rangeEquals(0, 4, "abc"));
    }

    @Test
    public void testStringCache_cacheHitMissCollisionAndLengthLimits() {
        CharacterReader reader = new CharacterReader("tag tag tag longerThanTwelveChars");

        String tag1 = reader.consumeTo(' ');
        assertEquals("tag", tag1);
        reader.consume();

        // Hit cache
        String tag2 = reader.consumeTo(' ');
        assertEquals("tag", tag2);
        assertSame(tag1, tag2);
        reader.consume();

        // Hit cache again
        String tag3 = reader.consumeTo(' ');
        assertEquals("tag", tag3);
        assertSame(tag1, tag3);
        reader.consume();

        // Exceeds maxStringCacheLen (12 chars) -> not cached
        String longStr = reader.consumeToEnd();
        assertEquals("longerThanTwelveChars", longStr);

        // Empty string from cache
        CharacterReader emptyReader = new CharacterReader("");
        assertEquals("", emptyReader.consumeToAny('x'));
    }

    @Test
    public void testBufferUp_largeStream_buffersCorrectly() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 40000; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        String largeText = sb.toString();

        CharacterReader reader = new CharacterReader(new StringReader(largeText), 1024);

        int count = 0;
        while (!reader.isEmpty()) {
            assertEquals(largeText.charAt(count), reader.consume());
            count++;
        }
        assertEquals(largeText.length(), count);
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testBufferUp_skipsWhenBufferNotCrossedSplitPoint() {
        CharacterReader reader = new CharacterReader("abcdefghij");
        reader.consume();
        assertEquals('b', reader.current());
    }
}
