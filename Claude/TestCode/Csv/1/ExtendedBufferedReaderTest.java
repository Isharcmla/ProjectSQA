package org.apache.commons.csv;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class ExtendedBufferedReaderTest {

    private ExtendedBufferedReader reader;

    @Before
    public void setUp() {
        reader = null;
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_validReader_createsInstance() {
        reader = new ExtendedBufferedReader(new StringReader("test"));
        assertNotNull(reader);
    }

    // ---------- read() Tests ----------

    @Test
    public void testRead_normalCharacters_returnsCorrectChars() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("abc"));
        assertEquals('a', reader.read());
        assertEquals('b', reader.read());
        assertEquals('c', reader.read());
        assertEquals(-1, reader.read());
    }

    @Test
    public void testRead_emptyString_returnsEOF() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader(""));
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.read());
    }

    @Test
    public void testRead_newlineCharacter_incrementsLineCounter() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a\nb"));
        assertEquals(0, reader.getLineNumber());
        reader.read(); // a
        assertEquals(0, reader.getLineNumber());
        reader.read(); // \n
        assertEquals(1, reader.getLineNumber());
        reader.read(); // b
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testRead_updatesLastChar() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("xy"));
        reader.read();
        assertEquals('x', reader.readAgain());
        reader.read();
        assertEquals('y', reader.readAgain());
    }

    @Test
    public void testRead_atEOF_lastCharIsEndOfStream() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader(""));
        reader.read();
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    // ---------- readAgain() Tests ----------

    @Test
    public void testReadAgain_beforeAnyRead_returnsUndefined() {
        reader = new ExtendedBufferedReader(new StringReader("abc"));
        assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
    }

    @Test
    public void testReadAgain_afterRead_returnsLastCharacter() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("z"));
        reader.read();
        assertEquals('z', reader.readAgain());
    }

    // ---------- read(char[], int, int) Tests ----------

    @Test
    public void testReadBuffer_zeroLength_returnsZero() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("abc"));
        char[] buf = new char[5];
        int result = reader.read(buf, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testReadBuffer_normalInput_readsCorrectly() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("abc"));
        char[] buf = new char[10];
        int len = reader.read(buf, 0, 3);
        assertEquals(3, len);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
        assertEquals('c', reader.readAgain());
    }

    @Test
    public void testReadBuffer_atEOF_returnsMinusOne() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader(""));
        char[] buf = new char[5];
        int len = reader.read(buf, 0, 5);
        assertEquals(-1, len);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    @Test
    public void testReadBuffer_withStandaloneNewline_incrementsLineCounter() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a\nb"));
        char[] buf = new char[10];
        int len = reader.read(buf, 0, 3);
        assertEquals(3, len);
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadBuffer_withStandaloneCarriageReturn_incrementsLineCounter() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a\rb"));
        char[] buf = new char[10];
        int len = reader.read(buf, 0, 3);
        assertEquals(3, len);
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadBuffer_withCRLF_incrementsLineCounterOnce() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a\r\nb"));
        char[] buf = new char[10];
        int len = reader.read(buf, 0, 4);
        assertEquals(4, len);
        // \r increments, \n after \r does not increment again
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadBuffer_withOffset_readsIntoCorrectPosition() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("xyz"));
        char[] buf = new char[10];
        int len = reader.read(buf, 2, 3);
        assertEquals(3, len);
        assertEquals('x', buf[2]);
        assertEquals('y', buf[3]);
        assertEquals('z', buf[4]);
    }

    @Test
    public void testReadBuffer_newlineAtStartWithPriorCRLastChar_doesNotDoubleCount() throws IOException {
        // Simulate: first read a \r via read(), then buffer read starts with \n
        reader = new ExtendedBufferedReader(new StringReader("\r\nb"));
        reader.read(); // reads \r, lastChar = '\r'
        char[] buf = new char[10];
        int len = reader.read(buf, 0, 2); // reads \n then b
        assertEquals(2, len);
        // \n at index 0, i==0 so check lastChar ('\r') -> equal, so no increment
        assertEquals(0, reader.getLineNumber());
    }

    // ---------- readLine() Tests ----------

    @Test
    public void testReadLine_normalLine_returnsLineWithoutTerminator() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("hello\nworld"));
        String line = reader.readLine();
        assertEquals("hello", line);
        assertEquals(1, reader.getLineNumber());
        assertEquals('o', reader.readAgain());
    }

    @Test
    public void testReadLine_emptyLine_returnsEmptyString() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("\nabc"));
        String line = reader.readLine();
        assertEquals("", line);
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadLine_atEOF_returnsNull() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader(""));
        String line = reader.readLine();
        assertNull(line);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    @Test
    public void testReadLine_multipleLines_incrementsLineCounterEachTime() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("line1\nline2\nline3"));
        reader.readLine();
        assertEquals(1, reader.getLineNumber());
        reader.readLine();
        assertEquals(2, reader.getLineNumber());
        reader.readLine();
        assertEquals(3, reader.getLineNumber());
        assertNull(reader.readLine());
        assertEquals(3, reader.getLineNumber());
    }

    // ---------- lookAhead() Tests ----------

    @Test
    public void testLookAhead_normalInput_doesNotConsumeCharacter() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("abc"));
        int peeked = reader.lookAhead();
        assertEquals('a', peeked);
        int actual = reader.read();
        assertEquals('a', actual);
    }

    @Test
    public void testLookAhead_atEOF_returnsMinusOne() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader(""));
        int peeked = reader.lookAhead();
        assertEquals(-1, peeked);
    }

    @Test
    public void testLookAhead_multipleCallsSameChar_returnsSameChar() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("xy"));
        int first = reader.lookAhead();
        int second = reader.lookAhead();
        assertEquals(first, second);
        assertEquals('x', first);
    }

    // ---------- getLineNumber() Tests ----------

    @Test
    public void testGetLineNumber_initialState_returnsZero() {
        reader = new ExtendedBufferedReader(new StringReader("abc"));
        assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void testGetLineNumber_afterReadingNewlines_returnsCorrectCount() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a\nb\nc"));
        while (reader.read() != -1) {
            // consume all
        }
        assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void testGetLineNumber_noNewlines_remainsZero() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("abc"));
        while (reader.read() != -1) {
            // consume all
        }
        assertEquals(0, reader.getLineNumber());
    }
}
