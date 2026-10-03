package org.apache.commons.compress.compressors.deflate;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class DeflateCompressorInputStreamTest {

    private byte[] compress(byte[] data, boolean nowrap) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, nowrap);
        DeflaterOutputStream dos = new DeflaterOutputStream(baos, deflater);
        dos.write(data);
        dos.close();
        return baos.toByteArray();
    }

    @Test
    public void testConstructor_singleArg_decompressesSuccessfully() throws IOException {
        byte[] original = "Hello, Deflate Compressor!".getBytes(StandardCharsets.UTF_8);
        byte[] compressed = compress(original, false);

        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            Assert.assertArrayEquals(original, out.toByteArray());
            Assert.assertEquals(original.length, in.getBytesRead());
        }
    }

    @Test
    public void testConstructor_withParametersZlibHeader_decompressesSuccessfully() throws IOException {
        byte[] original = "Testing with zlib header enabled".getBytes(StandardCharsets.UTF_8);
        byte[] compressed = compress(original, false);

        DeflateParameters parameters = new DeflateParameters();
        parameters.setWithZlibHeader(true);

        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed), parameters)) {
            byte[] buffer = new byte[original.length];
            int totalRead = 0;
            int read;
            while ((read = in.read(buffer, totalRead, buffer.length - totalRead)) > 0) {
                totalRead += read;
            }
            Assert.assertEquals(original.length, totalRead);
            Assert.assertArrayEquals(original, buffer);
            Assert.assertEquals(original.length, in.getBytesRead());
        }
    }

    @Test
    public void testConstructor_withParametersNoZlibHeader_decompressesSuccessfully() throws IOException {
        byte[] original = "Testing raw deflate without header".getBytes(StandardCharsets.UTF_8);
        byte[] compressed = compress(original, true);

        DeflateParameters parameters = new DeflateParameters();
        parameters.setWithZlibHeader(false);

        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed), parameters)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[16];
            int read;
            while ((read = in.read(buf, 0, buf.length)) != -1) {
                out.write(buf, 0, read);
            }
            Assert.assertArrayEquals(original, out.toByteArray());
            Assert.assertEquals(original.length, in.getBytesRead());
        }
    }

    @Test
    public void testRead_singleByte_reachesEof() throws IOException {
        byte[] original = new byte[]{1, 2, 3};
        byte[] compressed = compress(original, false);

        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            Assert.assertEquals(1, in.read());
            Assert.assertEquals(2, in.read());
            Assert.assertEquals(3, in.read());
            Assert.assertEquals(-1, in.read());
            Assert.assertEquals(-1, in.read());
            Assert.assertEquals(3, in.getBytesRead());
        }
    }

    @Test
    public void testRead_byteArray_zeroLengthAndOffsets() throws IOException {
        byte[] original = "Deflate stream test".getBytes(StandardCharsets.UTF_8);
        byte[] compressed = compress(original, false);

        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            byte[] buf = new byte[32];
            int readEmpty = in.read(buf, 0, 0);
            Assert.assertEquals(0, readEmpty);

            int readBytes = in.read(buf, 5, original.length);
            Assert.assertEquals(original.length, readBytes);
            Assert.assertArrayEquals(original, Arrays.copyOfRange(buf, 5, 5 + original.length));

            int eofRead = in.read(buf, 0, buf.length);
            Assert.assertEquals(-1, eofRead);
        }
    }

    @Test
    public void testSkip_positiveLength_skipsCorrectBytes() throws IOException {
        byte[] original = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes(StandardCharsets.UTF_8);
        byte[] compressed = compress(original, false);

        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            long skipped = in.skip(10);
            Assert.assertEquals(10, skipped);

            byte[] remaining = new byte[original.length - 10];
            int totalRead = 0;
            int read;
            while (totalRead < remaining.length && (read = in.read(remaining, totalRead, remaining.length - totalRead)) != -1) {
                totalRead += read;
            }

            Assert.assertEquals(remaining.length, totalRead);
            Assert.assertArrayEquals(Arrays.copyOfRange(original, 10, original.length), remaining);
        }
    }

    @Test
    public void testSkip_zeroAndNegative_returnsZero() throws IOException {
        byte[] original = "Skip zero or negative".getBytes(StandardCharsets.UTF_8);
        byte[] compressed = compress(original, false);

        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            Assert.assertEquals(0, in.skip(0));
            Assert.assertEquals(0, in.skip(-5));
            Assert.assertEquals('S', in.read());
        }
    }

    @Test
    public void testAvailable_returnsNonNegative() throws IOException {
        byte[] original = "Check available bytes".getBytes(StandardCharsets.UTF_8);
        byte[] compressed = compress(original, false);

        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            int available = in.available();
            Assert.assertTrue(available >= 0);
            in.read();
            Assert.assertTrue(in.available() >= 0);
        }
    }

    @Test(expected = IOException.class)
    public void testClose_closesUnderlyingStreamAndDisallowsRead() throws IOException {
        byte[] original = "Close test".getBytes(StandardCharsets.UTF_8);
        byte[] compressed = compress(original, false);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed));
        in.close();
        in.read();
    }

    @Test
    public void testEmptyStream_decompressionReturnsEof() throws IOException {
        byte[] original = new byte[0];
        byte[] compressed = compress(original, false);

        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            Assert.assertEquals(-1, in.read());
            Assert.assertEquals(0, in.getBytesRead());
        }
    }

    @Test(expected = IOException.class)
    public void testRead_corruptedData_throwsIOException() throws IOException {
        byte[] corrupted = new byte[]{1, 2, 3, 4, 5};
        try (DeflateCompressorInputStream in = new DeflateCompressorInputStream(new ByteArrayInputStream(corrupted))) {
            in.read();
        }
    }
}
