package org.apache.commons.compress.utils;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class IOUtilsTest {

    // ---------- Helper classes ----------

    /** InputStream that always throws IOException on read. */
    private static class ThrowingInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            throw new IOException("read error");
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            throw new IOException("read error");
        }
    }

    /** Closeable that always throws IOException on close. */
    private static class ThrowingCloseable implements Closeable {
        boolean closeCalled = false;

        @Override
        public void close() throws IOException {
            closeCalled = true;
            throw new IOException("close error");
        }
    }

    /** Closeable that records whether close was called, does not throw. */
    private static class RecordingCloseable implements Closeable {
        boolean closeCalled = false;

        @Override
        public void close() throws IOException {
            closeCalled = true;
        }
    }

    /** InputStream whose skip() always returns 0 to force the break in IOUtils.skip. */
    private static class ZeroSkipInputStream extends ByteArrayInputStream {
        public ZeroSkipInputStream(byte[] buf) {
            super(buf);
        }

        @Override
        public long skip(long n) {
            return 0;
        }
    }

    // ---------- copy(InputStream, OutputStream) ----------

    @Test
    public void testCopy_normalInput_returnsCorrectByteCount() throws IOException {
        byte[] data = "Hello World".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long count = IOUtils.copy(input, output);

        assertEquals(data.length, count);
        assertArrayEquals(data, output.toByteArray());
    }

    @Test
    public void testCopy_emptyInput_returnsZero() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long count = IOUtils.copy(input, output);

        assertEquals(0, count);
        assertEquals(0, output.toByteArray().length);
    }

    @Test(expected = IOException.class)
    public void testCopy_readThrowsIOException_propagatesException() throws IOException {
        InputStream input = new ThrowingInputStream();
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        IOUtils.copy(input, output);
    }

    // ---------- copy(InputStream, OutputStream, int) ----------

    @Test
    public void testCopyWithBufferSize_normalInput_returnsCorrectByteCount() throws IOException {
        byte[] data = new byte[20000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        InputStream input = new ByteArrayInputStream(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long count = IOUtils.copy(input, output, 1024);

        assertEquals(data.length, count);
        assertArrayEquals(data, output.toByteArray());
    }

    @Test
    public void testCopyWithBufferSize_smallBuffer_multipleIterations() throws IOException {
        byte[] data = "abcdefghij".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long count = IOUtils.copy(input, output, 2);

        assertEquals(data.length, count);
        assertArrayEquals(data, output.toByteArray());
    }

    // ---------- skip(InputStream, long) ----------

    @Test
    public void testSkip_normalSkip_returnsSkippedCount() throws IOException {
        byte[] data = "0123456789".getBytes();
        InputStream input = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(input, 5);

        assertEquals(5, skipped);
        assertEquals('5', input.read());
    }

    @Test
    public void testSkip_zeroToSkip_returnsZero() throws IOException {
        byte[] data = "0123456789".getBytes();
        InputStream input = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(input, 0);

        assertEquals(0, skipped);
    }

    @Test
    public void testSkip_negativeToSkip_returnsZero() throws IOException {
        byte[] data = "0123456789".getBytes();
        InputStream input = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(input, -5);

        assertEquals(0, skipped);
    }

    @Test
    public void testSkip_moreThanAvailable_returnsActualSkipped() throws IOException {
        byte[] data = "0123456789".getBytes();
        InputStream input = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(input, 100);

        assertEquals(10, skipped);
        assertEquals(-1, input.read());
    }

    @Test
    public void testSkip_skipReturnsZero_breaksLoopEarly() throws IOException {
        byte[] data = "0123456789".getBytes();
        InputStream input = new ZeroSkipInputStream(data);

        long skipped = IOUtils.skip(input, 5);

        assertEquals(0, skipped);
    }

    // ---------- readFully(InputStream, byte[]) ----------

    @Test
    public void testReadFully_normalInput_readsAllBytes() throws IOException {
        byte[] data = "HelloWorld".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[data.length];

        int count = IOUtils.readFully(input, buffer);

        assertEquals(data.length, count);
        assertArrayEquals(data, buffer);
    }

    @Test
    public void testReadFully_streamShorterThanBuffer_readsAvailableBytesOnly() throws IOException {
        byte[] data = "Hi".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];

        int count = IOUtils.readFully(input, buffer);

        assertEquals(2, count);
    }

    @Test
    public void testReadFully_emptyBuffer_returnsZero() throws IOException {
        byte[] data = "data".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[0];

        int count = IOUtils.readFully(input, buffer);

        assertEquals(0, count);
    }

    // ---------- readFully(InputStream, byte[], int, int) ----------

    @Test
    public void testReadFullyWithOffsetLen_normalInput_readsCorrectBytes() throws IOException {
        byte[] data = "abcdefgh".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];

        int count = IOUtils.readFully(input, buffer, 2, 5);

        assertEquals(5, count);
        assertEquals('a', buffer[2]);
        assertEquals('e', buffer[6]);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyWithOffsetLen_negativeLen_throwsException() throws IOException {
        byte[] data = "abcdefgh".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];

        IOUtils.readFully(input, buffer, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyWithOffsetLen_negativeOffset_throwsException() throws IOException {
        byte[] data = "abcdefgh".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];

        IOUtils.readFully(input, buffer, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyWithOffsetLen_lenPlusOffsetExceedsBufferLength_throwsException() throws IOException {
        byte[] data = "abcdefgh".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];

        IOUtils.readFully(input, buffer, 8, 5);
    }

    @Test
    public void testReadFullyWithOffsetLen_streamEndsEarly_returnsPartialCount() throws IOException {
        byte[] data = "ab".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];

        int count = IOUtils.readFully(input, buffer, 0, 10);

        assertEquals(2, count);
    }

    // ---------- toByteArray(InputStream) ----------

    @Test
    public void testToByteArray_normalInput_returnsCorrectBytes() throws IOException {
        byte[] data = "toByteArrayTest".getBytes();
        InputStream input = new ByteArrayInputStream(data);

        byte[] result = IOUtils.toByteArray(input);

        assertArrayEquals(data, result);
    }

    @Test
    public void testToByteArray_emptyInput_returnsEmptyArray() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[0]);

        byte[] result = IOUtils.toByteArray(input);

        assertEquals(0, result.length);
    }

    @Test(expected = NullPointerException.class)
    public void testToByteArray_nullInput_throwsNullPointerException() throws IOException {
        IOUtils.toByteArray(null);
    }

    // ---------- closeQuietly(Closeable) ----------

    @Test
    public void testCloseQuietly_normalCloseable_closesSuccessfully() {
        RecordingCloseable closeable = new RecordingCloseable();

        IOUtils.closeQuietly(closeable);

        assertTrue(closeable.closeCalled);
    }

    @Test
    public void testCloseQuietly_nullCloseable_doesNothing() {
        // Should not throw any exception
        IOUtils.closeQuietly(null);
    }

    @Test
    public void testCloseQuietly_closeableThrowsIOException_exceptionSwallowed() {
        ThrowingCloseable closeable = new ThrowingCloseable();

        // Should not throw despite close() throwing IOException
        IOUtils.closeQuietly(closeable);

        assertTrue(closeable.closeCalled);
    }
}
