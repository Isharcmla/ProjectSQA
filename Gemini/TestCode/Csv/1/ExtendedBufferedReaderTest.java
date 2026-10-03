package org.apache.commons.csv;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ExtendedBufferedReaderTest {

    private ExtendedBufferedReader createReader(String input) {
        return new ExtendedBufferedReader(new StringReader(input));
    }

    @Test
    public void testInitialState_readerCreated_returnsDefaultValues() {
        ExtendedBufferedReader reader = createReader("test");
        assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
        assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void testRead_singleCharsWithNewlines_incrementsLineCounterAndTracksLastChar() throws IOException {
        ExtendedBufferedReader reader = createReader("a\nb\n");

        assertEquals('a', reader.read());
        assertEquals('a', reader.readAgain());
        assertEquals(0, reader.getLineNumber());

        assertEquals('\n', reader.read());
        assertEquals('\n', reader.readAgain());
        assertEquals(1, reader.getLineNumber());

        assertEquals('b', reader.read());
        assertEquals('b', reader.readAgain());
        assertEquals(1, reader.getLineNumber());

        assertEquals('\n', reader.read());
        assertEquals('\n', reader.readAgain());
        assertEquals(2, reader.getLineNumber());

        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void testLookAhead_withoutConsuming_returnsNextChar() throws IOException {
        ExtendedBufferedReader reader = createReader("abc");

        assertEquals('a', reader.lookAhead());
        assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());

        assertEquals('a', reader.read());
        assertEquals('a', reader.readAgain());

        assertEquals('b', reader.lookAhead());
        assertEquals('b', reader.lookAhead());
        assertEquals('b', reader.read());

        assertEquals('c', reader.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.lookAhead());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.read());
    }

    @Test
    public void testReadCharArray_lengthZero_returnsZeroWithoutChangingState() throws IOException {
        ExtendedBufferedReader reader = createReader("hello");
        char[] buf = new char[5];

        int bytesRead = reader.read(buf, 0, 0);

        assertEquals(0, bytesRead);
        assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
        assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void testReadCharArray_crLfWithinBuffer_countsLineOnce() throws IOException {
        ExtendedBufferedReader reader = createReader("a\r\nb");
        char[] buf = new char[10];

        int len = reader.read(buf, 0, buf.length);

        assertEquals(4, len);
        assertEquals('b', reader.readAgain());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadCharArray_lfWithoutPrecedingCrInBuffer_incrementsLineCounter() throws IOException {
        ExtendedBufferedReader reader = createReader("a\nb");
        char[] buf = new char[10];

        int len = reader.read(buf, 0, buf.length);

        assertEquals(3, len);
        assertEquals('b', reader.readAgain());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadCharArray_crAlone_incrementsLineCounter() throws IOException {
        ExtendedBufferedReader reader = createReader("a\rb");
        char[] buf = new char[10];

        int len = reader.read(buf, 0, buf.length);

        assertEquals(3, len);
        assertEquals('b', reader.readAgain());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadCharArray_crLfSplitAcrossReads_countsLineOnce() throws IOException {
        ExtendedBufferedReader reader = createReader("\r\n");
        char[] buf = new char[1];

        int read1 = reader.read(buf, 0, 1);
        assertEquals(1, read1);
        assertEquals('\r', buf[0]);
        assertEquals('\r', reader.readAgain());
        assertEquals(1, reader.getLineNumber());

        int read2 = reader.read(buf, 0, 1);
        assertEquals(1, read2);
        assertEquals('\n', buf[0]);
        assertEquals('\n', reader.readAgain());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadCharArray_lfAtBufferStartWithoutPreviousCr_incrementsLineCounter() throws IOException {
        ExtendedBufferedReader reader = createReader("a\n");
        char[] buf = new char[1];

        int read1 = reader.read(buf, 0, 1);
        assertEquals(1, read1);
        assertEquals('a', reader.readAgain());
        assertEquals(0, reader.getLineNumber());

        int read2 = reader.read(buf, 0, 1);
        assertEquals(1, read2);
        assertEquals('\n', reader.readAgain());
        assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadCharArray_withOffset_readsCorrectly() throws IOException {
        ExtendedBufferedReader reader = createReader("xyz");
        char[] buf = new char[5];

        int len = reader.read(buf, 2, 3);

        assertEquals(3, len);
        assertEquals('x', buf[2]);
        assertEquals('y', buf[3]);
        assertEquals('z', buf[4]);
        assertEquals('z', reader.readAgain());
    }

    @Test
    public void testReadCharArray_endOfStream_returnsNegativeOneAndUpdatesLastChar() throws IOException {
        ExtendedBufferedReader reader = createReader("");
        char[] buf = new char[5];

        int len = reader.read(buf, 0, buf.length);

        assertEquals(ExtendedBufferedReader.END_OF_STREAM, len);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    @Test
    public void testReadLine_nonEmptyLines_readsLinesAndUpdatesState() throws IOException {
        ExtendedBufferedReader reader = createReader("first\nsecond");

        String line1 = reader.readLine();
        assertEquals("first", line1);
        assertEquals('t', reader.readAgain());
        assertEquals(1, reader.getLineNumber());

        String line2 = reader.readLine();
        assertEquals("second", line2);
        assertEquals('d', reader.readAgain());
        assertEquals(2, reader.getLineNumber());

        String line3 = reader.readLine();
        assertNull(line3);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void testReadLine_emptyLines_maintainsLastCharAndIncrementsLineCounter() throws IOException {
        ExtendedBufferedReader reader = createReader("\n\n");

        String line1 = reader.readLine();
        assertEquals("", line1);
        assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
        assertEquals(1, reader.getLineNumber());

        String line2 = reader.readLine();
        assertEquals("", line2);
        assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
        assertEquals(2, reader.getLineNumber());

        String line3 = reader.readLine();
        assertNull(line3);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void testReadLine_emptyStream_returnsNullImmediately() throws IOException {
        ExtendedBufferedReader reader = createReader("");

        String line = reader.readLine();

        assertNull(line);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        assertEquals(0, reader.getLineNumber());
    }
}
