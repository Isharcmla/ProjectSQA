package org.apache.commons.compress.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class IOUtilsTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<IOUtils> constructor = IOUtils.class.getDeclaredConstructor();
        Assert.assertTrue(java.lang.reflect.Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        IOUtils instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testCopy_defaultBufferSize_copiesAllBytes() throws IOException {
        byte[] data = new byte[10000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 128);
        }
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long copied = IOUtils.copy(input, output);

        Assert.assertEquals(data.length, copied);
        Assert.assertArrayEquals(data, output.toByteArray());
    }

    @Test
    public void testCopy_customBufferSize_copiesAllBytes() throws IOException {
        byte[] data = "Hello, World! Testing custom buffer size copy.".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long copied = IOUtils.copy(input, output, 4);

        Assert.assertEquals(data.length, copied);
        Assert.assertArrayEquals(data, output.toByteArray());
    }

    @Test
    public void testCopy_emptyStream_returnsZero() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long copied = IOUtils.copy(input, output);

        Assert.assertEquals(0, copied);
        Assert.assertEquals(0, output.size());
    }

    @Test
    public void testSkip_zeroOrNegative_returnsZero() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream("abcdef".getBytes());

        Assert.assertEquals(0, IOUtils.skip(input, 0));
        Assert.assertEquals(0, IOUtils.skip(input, -5));
        Assert.assertEquals('a', input.read());
    }

    @Test
    public void testSkip_positive_skipsBytes() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream("abcdef".getBytes());

        long skipped = IOUtils.skip(input, 3);

        Assert.assertEquals(3, skipped);
        Assert.assertEquals('d', input.read());
    }

    @Test
    public void testSkip_moreThanAvailable_skipsAvailableBytes() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream("abc".getBytes());

        long skipped = IOUtils.skip(input, 10);

        Assert.assertEquals(3, skipped);
        Assert.assertEquals(-1, input.read());
    }

    @Test
    public void testSkip_streamReturnsZeroSkip_breaksLoop() throws IOException {
        InputStream zeroSkipStream = new InputStream() {
            private int count = 3;

            @Override
            public int read() {
                return (count-- > 0) ? 'a' : -1;
            }

            @Override
            public long skip(long n) {
                return 0; // Simulate stream refusing to skip
            }
        };

        long skipped = IOUtils.skip(zeroSkipStream, 5);

        Assert.assertEquals(0, skipped);
    }

    @Test
    public void testSkip_partialSkipMultipleIterations_skipsRequested() throws IOException {
        InputStream partialSkipStream = new InputStream() {
            private long remaining = 10;

            @Override
            public int read() {
                return (remaining-- > 0) ? 'x' : -1;
            }

            @Override
            public long skip(long n) {
                long toSkip = Math.min(2, Math.min(n, remaining));
                remaining -= toSkip;
                return toSkip;
            }
        };

        long skipped = IOUtils.skip(partialSkipStream, 6);

        Assert.assertEquals(6, skipped);
    }

    @Test
    public void testReadFully_byteArray_readsCompletely() throws IOException {
        byte[] inputData = "1234567890".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(inputData);
        byte[] buffer = new byte[10];

        int bytesRead = IOUtils.readFully(input, buffer);

        Assert.assertEquals(10, bytesRead);
        Assert.assertArrayEquals(inputData, buffer);
    }

    @Test
    public void testReadFully_byteArray_reachesEofEarly() throws IOException {
        byte[] inputData = "12345".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(inputData);
        byte[] buffer = new byte[10];

        int bytesRead = IOUtils.readFully(input, buffer);

        Assert.assertEquals(5, bytesRead);
        Assert.assertArrayEquals("12345".getBytes(), Arrays.copyOfRange(buffer, 0, 5));
    }

    @Test
    public void testReadFully_offsetAndLen_success() throws IOException {
        byte[] inputData = "abcdef".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(inputData);
        byte[] buffer = new byte[10];

        int bytesRead = IOUtils.readFully(input, buffer, 2, 4);

        Assert.assertEquals(4, bytesRead);
        Assert.assertEquals(0, buffer[0]);
        Assert.assertEquals(0, buffer[1]);
        Assert.assertEquals('a', buffer[2]);
        Assert.assertEquals('b', buffer[3]);
        Assert.assertEquals('c', buffer[4]);
        Assert.assertEquals('d', buffer[5]);
        Assert.assertEquals(0, buffer[6]);
    }

    @Test
    public void testReadFully_chunkedStream_readsFullLength() throws IOException {
        byte[] inputData = "HelloWorld".getBytes();
        InputStream chunkedStream = new FilterInputStream(new ByteArrayInputStream(inputData)) {
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return super.read(b, off, Math.min(len, 2));
            }
        };

        byte[] buffer = new byte[10];
        int bytesRead = IOUtils.readFully(chunkedStream, buffer, 0, 10);

        Assert.assertEquals(10, bytesRead);
        Assert.assertArrayEquals(inputData, buffer);
    }

    @Test
    public void testReadFully_lenZero_returnsZero() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream("test".getBytes());
        byte[] buffer = new byte[5];

        int bytesRead = IOUtils.readFully(input, buffer, 0, 0);

        Assert.assertEquals(0, bytesRead);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_negativeLen_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream("test".getBytes());
        byte[] buffer = new byte[5];
        IOUtils.readFully(input, buffer, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream("test".getBytes());
        byte[] buffer = new byte[5];
        IOUtils.readFully(input, buffer, -1, 3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_offsetPlusLenExceedsBuffer_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream("test".getBytes());
        byte[] buffer = new byte[5];
        IOUtils.readFully(input, buffer, 3, 3);
    }

    @Test
    public void testToByteArray_validStream_returnsByteArray() throws IOException {
        byte[] expected = "Apache Commons Compress".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(expected);

        byte[] actual = IOUtils.toByteArray(input);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testToByteArray_emptyStream_returnsEmptyByteArray() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);

        byte[] actual = IOUtils.toByteArray(input);

        Assert.assertEquals(0, actual.length);
    }

    @Test(expected = NullPointerException.class)
    public void testToByteArray_nullInput_throwsNullPointerException() throws IOException {
        IOUtils.toByteArray(null);
    }

    @Test
    public void testCloseQuietly_null_doesNotThrow() {
        IOUtils.closeQuietly(null);
    }

    @Test
    public void testCloseQuietly_validCloseable_closesSuccessfully() {
        final boolean[] closed = new boolean[]{false};
        Closeable closeable = new Closeable() {
            @Override
            public void close() {
                closed[0] = true;
            }
        };

        IOUtils.closeQuietly(closeable);

        Assert.assertTrue(closed[0]);
    }

    @Test
    public void testCloseQuietly_closeThrowsIOException_swallowedWithoutException() {
        Closeable throwingCloseable = new Closeable() {
            @Override
            public void close() throws IOException {
                throw new IOException("Failed to close");
            }
        };

        IOUtils.closeQuietly(throwingCloseable);
    }
}
