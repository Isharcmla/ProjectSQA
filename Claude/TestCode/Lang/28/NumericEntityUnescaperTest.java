import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;

import java.io.StringWriter;
import java.io.Writer;
import java.io.IOException;

public class NumericEntityUnescaperTest {

    private NumericEntityUnescaper unescaper;

    @Before
    public void setUp() {
        unescaper = new NumericEntityUnescaper();
    }

    // ---------- Normal / typical cases ----------

    @Test
    public void testTranslate_decimalEntity_writesCorrectChar() throws IOException {
        String input = "&#65;";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals("A", writer.toString());
        assertEquals(5, consumed);
    }

    @Test
    public void testTranslate_hexEntityLowercaseX_writesCorrectChar() throws IOException {
        String input = "&#x41;";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals("A", writer.toString());
        assertEquals(6, consumed);
    }

    @Test
    public void testTranslate_hexEntityUppercaseX_writesCorrectChar() throws IOException {
        String input = "&#X41;";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals("A", writer.toString());
        assertEquals(6, consumed);
    }

    @Test
    public void testTranslate_entityWithOffsetInLargerString_returnsCorrectLengthAndWrite() throws IOException {
        String input = "Hello &#97; World";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 6, writer);

        assertEquals("a", writer.toString());
        assertEquals(5, consumed);
    }

    @Test
    public void testTranslate_multiDigitDecimalEntity_writesCorrectChar() throws IOException {
        String input = "&#169;"; // copyright symbol
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals("\u00A9", writer.toString());
        assertEquals(6, consumed);
    }

    // ---------- Edge cases ----------

    @Test
    public void testTranslate_notAmpersand_returnsZero() throws IOException {
        String input = "abc&#65;";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_missingHashSymbol_returnsZero() throws IOException {
        String input = "&x65;";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_invalidNumberFormat_returnsZeroAndNoWrite() throws IOException {
        String input = "&#;";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_invalidHexNumberFormat_returnsZeroAndNoWrite() throws IOException {
        String input = "&#xZZ;";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals(0, consumed);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslate_zeroValueEntity_writesNullChar() throws IOException {
        String input = "&#0;";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals(4, consumed);
        assertEquals(1, writer.toString().length());
        assertEquals('\0', writer.toString().charAt(0));
    }

    @Test
    public void testTranslate_negativeNumberFormat_returnsZeroAndNoWrite() throws IOException {
        // '-' char is not a valid digit but Integer.parseInt will throw since char before digits unexpected,
        // Actually "&#-1;" would make end loop find ';' fine but parseInt("-1",10) is valid = -1
        // Writer.write(int) with negative value is still a valid call (writes some char based on lower 16 bits)
        String input = "&#-1;";
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals(5, consumed);
        assertEquals(1, writer.toString().length());
    }

    @Test
    public void testTranslate_hexEntityWithLargeValue_writesCorrectChar() throws IOException {
        String input = "&#x1F600;"; // beyond char range, but parseInt as int is fine
        StringWriter writer = new StringWriter();

        int consumed = unescaper.translate(input, 0, writer);

        assertEquals(9, consumed);
        assertEquals(1, writer.toString().length());
    }

    // ---------- Exception cases ----------

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_emptyString_throwsStringIndexOutOfBoundsException() throws IOException {
        String input = "";
        StringWriter writer = new StringWriter();

        unescaper.translate(input, 0, writer);
    }

    @Test(expected = NullPointerException.class)
    public void testTranslate_nullInput_throwsNullPointerException() throws IOException {
        StringWriter writer = new StringWriter();

        unescaper.translate(null, 0, writer);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_indexOutOfBounds_throwsStringIndexOutOfBoundsException() throws IOException {
        String input = "&#65;";
        StringWriter writer = new StringWriter();

        unescaper.translate(input, 10, writer);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslate_missingSemicolon_throwsStringIndexOutOfBoundsException() throws IOException {
        String input = "&#65";
        StringWriter writer = new StringWriter();

        unescaper.translate(input, 0, writer);
    }

    @Test
    public void testTranslate_ioExceptionPropagated_whenWriterThrows() {
        String input = "&#65;";
        Writer faultyWriter = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("forced failure");
            }

            @Override
            public void write(int c) throws IOException {
                throw new IOException("forced failure");
            }

            @Override
            public void flush() throws IOException {
            }

            @Override
            public void close() throws IOException {
            }
        };

        try {
            unescaper.translate(input, 0, faultyWriter);
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            assertEquals("forced failure", e.getMessage());
        }
    }
}
