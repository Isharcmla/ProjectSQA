import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.apache.commons.lang3.text.translate.LookupTranslator;

public class LookupTranslatorTest {

    private LookupTranslator translator;

    @Before
    public void setUp() {
        CharSequence[][] lookup = new CharSequence[][] {
                { "a", "1" },
                { "ab", "2" },
                { "abc", "3" }
        };
        translator = new LookupTranslator(lookup);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalLookupTable_createsInstance() {
        CharSequence[][] lookup = new CharSequence[][] {
                { "foo", "bar" }
        };
        LookupTranslator t = new LookupTranslator(lookup);
        assertNotNull(t);
    }

    @Test
    public void testConstructor_nullLookupTable_createsInstanceWithoutError() {
        LookupTranslator t = new LookupTranslator((CharSequence[][]) null);
        assertNotNull(t);
    }

    @Test
    public void testConstructor_emptyLookupTable_createsInstance() {
        CharSequence[][] lookup = new CharSequence[][] {};
        LookupTranslator t = new LookupTranslator(lookup);
        assertNotNull(t);
    }

    @Test
    public void testConstructor_singleEntryTable_shortestAndLongestEqual() throws IOException {
        CharSequence[][] lookup = new CharSequence[][] {
                { "x", "y" }
        };
        LookupTranslator t = new LookupTranslator(lookup);
        StringWriter out = new StringWriter();
        int consumed = t.translate("x", 0, out);
        assertEquals(1, consumed);
        assertEquals("y", out.toString());
    }

    // ---------- translate() normal/typical ----------

    @Test
    public void testTranslate_matchFound_returnsLengthAndWritesResult() throws IOException {
        StringWriter out = new StringWriter();
        int consumed = translator.translate("a", 0, out);
        assertEquals(1, consumed);
        assertEquals("1", out.toString());
    }

    @Test
    public void testTranslate_greedyMatching_choosesLongestMatch() throws IOException {
        StringWriter out = new StringWriter();
        int consumed = translator.translate("abcd", 0, out);
        assertEquals(3, consumed);
        assertEquals("3", out.toString());
    }

    @Test
    public void testTranslate_partialGreedyMatch_choosesLongestAvailableMatch() throws IOException {
        StringWriter out = new StringWriter();
        int consumed = translator.translate("abx", 0, out);
        assertEquals(2, consumed);
        assertEquals("2", out.toString());
    }

    @Test
    public void testTranslate_matchAtNonZeroIndex_returnsCorrectLength() throws IOException {
        StringWriter out = new StringWriter();
        int consumed = translator.translate("xxabc", 2, out);
        assertEquals(3, consumed);
        assertEquals("3", out.toString());
    }

    // ---------- translate() edge cases ----------

    @Test
    public void testTranslate_noMatchFound_returnsZero() throws IOException {
        StringWriter out = new StringWriter();
        int consumed = translator.translate("xyz", 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_emptyInput_returnsZero() throws IOException {
        StringWriter out = new StringWriter();
        int consumed = translator.translate("", 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_indexAtEndOfInput_returnsZero() throws IOException {
        StringWriter out = new StringWriter();
        int consumed = translator.translate("abc", 3, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_indexNearEndBoundary_handlesMaxCorrectly() throws IOException {
        StringWriter out = new StringWriter();
        // input length 4, index 3 -> only 1 char remains, longest is 3
        int consumed = translator.translate("zzza", 3, out);
        assertEquals(1, consumed);
        assertEquals("1", out.toString());
    }

    @Test
    public void testTranslate_nullLookupTable_alwaysReturnsZero() throws IOException {
        LookupTranslator t = new LookupTranslator((CharSequence[][]) null);
        StringWriter out = new StringWriter();
        int consumed = t.translate("anything", 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslate_emptyLookupTable_alwaysReturnsZero() throws IOException {
        CharSequence[][] lookup = new CharSequence[][] {};
        LookupTranslator t = new LookupTranslator(lookup);
        StringWriter out = new StringWriter();
        int consumed = t.translate("abc", 0, out);
        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    // ---------- translate() exception case ----------

    @Test(expected = IOException.class)
    public void testTranslate_writerThrowsIOException_propagatesException() throws IOException {
        Writer faultyWriter = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("forced failure");
            }

            @Override
            public void flush() throws IOException {
            }

            @Override
            public void close() throws IOException {
            }
        };
        translator.translate("a", 0, faultyWriter);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_indexBeyondInputLength_throwsException() throws IOException {
        StringWriter out = new StringWriter();
        translator.translate("abc", 10, out);
    }
}
