package org.apache.commons.lang3.text.translate;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

public class LookupTranslatorTest {

    @Test
    public void testConstructor_nullLookup_doesNotThrowAndTranslatesZero() throws IOException {
        final LookupTranslator translator = new LookupTranslator((CharSequence[][]) null);
        final StringWriter writer = new StringWriter();
        final int consumed = translator.translate("hello", 0, writer);

        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testConstructor_emptyLookup_doesNotThrowAndTranslatesZero() throws IOException {
        final LookupTranslator translator = new LookupTranslator(new CharSequence[0][0]);
        final StringWriter writer = new StringWriter();
        final int consumed = translator.translate("hello", 0, writer);

        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_exactMatchAtStart_translatesAndReturnsLength() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"foo", "bar"}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter writer = new StringWriter();
        final int consumed = translator.translate("foobar", 0, writer);

        assertEquals(3, consumed);
        assertEquals("bar", writer.toString());
    }

    @Test
    public void testTranslate_exactMatchInMiddle_translatesAndReturnsLength() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"target", "replacement"}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter writer = new StringWriter();
        final int consumed = translator.translate("pre_target_post", 4, writer);

        assertEquals(6, consumed);
        assertEquals("replacement", writer.toString());
    }

    @Test
    public void testTranslate_greedyMatch_prefersLongestMatchingKey() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"a", "1"},
            {"ab", "2"},
            {"abc", "3"}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter writer = new StringWriter();
        final int consumed = translator.translate("abcd", 0, writer);

        assertEquals(3, consumed);
        assertEquals("3", writer.toString());
    }

    @Test
    public void testTranslate_noMatch_returnsZeroAndWritesNothing() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"apple", "fruit"},
            {"banana", "fruit"}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter writer = new StringWriter();
        final int consumed = translator.translate("orange", 0, writer);

        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_remainingLengthShorterThanLongestKey_matchesShorterKey() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"longestKey", "LONG"},
            {"end", "FINISH"}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter writer = new StringWriter();
        final int consumed = translator.translate("the end", 4, writer);

        assertEquals(3, consumed);
        assertEquals("FINISH", writer.toString());
    }

    @Test
    public void testTranslate_remainingLengthShorterThanLongestKey_noMatchReturnsZero() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"veryLongString", "REPLACED"}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter writer = new StringWriter();
        final int consumed = translator.translate("short", 0, writer);

        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_emptyTargetValue_writesEmptyStringAndReturnsLength() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"removeMe", ""}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter writer = new StringWriter();
        final int consumed = translator.translate("removeMeNow", 0, writer);

        assertEquals(8, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_inheritedTranslateMethod_translatesCompleteString() {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"one", "1"},
            {"two", "2"},
            {"three", "3"}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final String result = translator.translate("one and two and three");

        assertEquals("1 and 2 and 3", result);
    }

    @Test
    public void testTranslate_inheritedTranslateMethodWithNullInput_returnsNull() {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"key", "value"}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        assertNull(translator.translate(null));
    }

    @Test
    public void testTranslate_writerThrowsIOException_propagatesException() {
        final CharSequence[][] lookup = new CharSequence[][] {
            {"match", "value"}
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final Writer failingWriter = new Writer() {
            @Override
            public void write(final char[] cbuf, final int off, final int len) throws IOException {
                throw new IOException("Simulated write failure");
            }

            @Override
            public void flush() throws IOException {
            }

            @Override
            public void close() throws IOException {
            }
        };

        try {
            translator.translate("match", 0, failingWriter);
            fail("Expected IOException to be thrown");
        } catch (final IOException e) {
            assertEquals("Simulated write failure", e.getMessage());
        }
    }
}
