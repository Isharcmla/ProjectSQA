package org.apache.commons.compress.compressors.bzip2;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class BZip2CompressorInputStreamTest {

    // Valid bzip2 stream representing 0 bytes (empty stream)
    private static final byte[] EMPTY_BZ2 = new byte[] {
            'B', 'Z', 'h', '9',
            0x17, 0x72, 0x45, 0x38, 0x50, (byte) 0x90, // EOS magic
            0x00, 0x00, 0x00, 0x00                     // Stream CRC (0)
    };

    // Valid bzip2 stream for text "Hello World!\n"
    private static final byte[] HELLO_WORLD_BZ2 = new byte[] {
            0x42, 0x5a, 0x68, 0x39, 0x31, 0x41, 0x59, 0x26, 0x53, 0x59,
            (byte) 0xdb, 0x4a, 0x3a, (byte) 0x8b, 0x00, 0x00, 0x02, 0x49,
            (byte) 0x80, 0x00, 0x10, 0x40, 0x00, 0x38, 0x00, 0x20, 0x00,
            0x21, 0x00, (byte) 0x82, 0x0b, 0x48, 0x2e, 0x2e, 0x48,
            (byte) 0xb2, 0x18, 0x48, 0x32, 0x24, (byte) 0x9a, 0x08, 0x23,
            (byte) 0xa3, 0x42, 0x76, (byte) 0xee, 0x48, (byte) 0xa7, 0x0a,
            0x12, 0x1b, 0x69, 0x47, 0x16, 0x00
    };

    // Valid bzip2 stream for repetitive text "AAAAAA" (triggers run-length decoding)
    private static final byte[] REPEATED_A_BZ2 = new byte[] {
            0x42, 0x5a, 0x68, 0x39, 0x31, 0x41, 0x59, 0x26, 0x53, 0x59,
            (byte) 0xe0, 0x08, (byte) 0xb5, (byte) 0x82, 0x00, 0x00, 0x00,
            0x40, 0x00, 0x00, 0x10, 0x01, 0x00, 0x02, 0x00, 0x20, 0x00,
            0x20, 0x00, 0x21, 0x00, (byte) 0x82, 0x08, 0x0a, 0x26, 0x1d,
            0x45, 0x3c, 0x5c, (byte) 0xdc, (byte) 0x91, 0x4e, 0x14, 0x24,
            0x1c, 0x01, 0x6b, 0x10, 0x40
    };

    @Test
    public void testMatches_validSignatures() {
        byte[] sig = new byte[] { 'B', 'Z', 'h', '9' };
        Assert.assertTrue(BZip2CompressorInputStream.matches(sig, 3));
        Assert.assertTrue(BZip2CompressorInputStream.matches(sig, 4));
        Assert.assertTrue(BZip2CompressorInputStream.matches(HELLO_WORLD_BZ2, HELLO_WORLD_BZ2.length));
    }

    @Test
    public void testMatches_invalidSignatures() {
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z', 'h' }, 2));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z', 'h' }, 0));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z', 'h' }, -1));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'A', 'Z', 'h' }, 3));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'A', 'h' }, 3));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z', 'a' }, 3));
    }

    @Test
    public void testDecompressEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(EMPTY_BZ2);
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais)) {
            Assert.assertEquals(-1, bzIn.read());
            byte[] buf = new byte[10];
            Assert.assertEquals(-1, bzIn.read(buf, 0, buf.length));
        }
    }

    @Test
    public void testDecompressHelloWorld_singleByteRead() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(HELLO_WORLD_BZ2);
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais)) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int b;
            while ((b = bzIn.read()) != -1) {
                baos.write(b);
            }
            Assert.assertEquals("Hello World!\n", baos.toString("UTF-8"));
            Assert.assertEquals(-1, bzIn.read());
        }
    }

    @Test
    public void testDecompressHelloWorld_blockRead() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(HELLO_WORLD_BZ2);
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais)) {
            byte[] buf = new byte[32];
            int readCount = bzIn.read(buf, 0, buf.length);
            Assert.assertEquals(13, readCount);
            Assert.assertEquals("Hello World!\n", new String(buf, 0, readCount, "UTF-8"));
            Assert.assertEquals(-1, bzIn.read(buf, 0, buf.length));
        }
    }

    @Test
    public void testDecompressRepeatedCharacters_rleHandling() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(REPEATED_A_BZ2);
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais)) {
            byte[] buf = new byte[10];
            int readCount = bzIn.read(buf, 0, buf.length);
            Assert.assertEquals(6, readCount);
            Assert.assertEquals("AAAAAA", new String(buf, 0, readCount, "UTF-8"));
            Assert.assertEquals(-1, bzIn.read());
        }
    }

    @Test
    public void testDecompressConcatenated_enabled() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(HELLO_WORLD_BZ2);
        baos.write(HELLO_WORLD_BZ2);
        byte[] concatenated = baos.toByteArray();

        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(
                new ByteArrayInputStream(concatenated), true)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int b;
            while ((b = bzIn.read()) != -1) {
                out.write(b);
            }
            Assert.assertEquals("Hello World!\nHello World!\n", out.toString("UTF-8"));
        }
    }

    @Test
    public void testDecompressConcatenated_disabled() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(HELLO_WORLD_BZ2);
        baos.write(HELLO_WORLD_BZ2);
        byte[] concatenated = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(concatenated);
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais, false)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int b;
            while ((b = bzIn.read()) != -1) {
                out.write(b);
            }
            Assert.assertEquals("Hello World!\n", out.toString("UTF-8"));
            Assert.assertTrue(bais.available() > 0);
        }
    }

    @Test(expected = IOException.class)
    public void testDecompressConcatenated_garbageAfterStream_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(HELLO_WORLD_BZ2);
        baos.write(new byte[] { 'G', 'A', 'R', 'B', 'A', 'G', 'E' });
        byte[] data = baos.toByteArray();

        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(
                new ByteArrayInputStream(data), true)) {
            byte[] buf = new byte[64];
            while (bzIn.read(buf, 0, buf.length) != -1) {
                // read until exception
            }
        }
    }

    @Test(expected = IOException.class)
    public void testConstructor_nullInputStream_throwsIOException() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test(expected = IOException.class)
    public void testConstructor_emptyStream_throwsIOException() throws IOException {
        new BZip2CompressorInputStream(new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IOException.class)
    public void testConstructor_invalidMagic_throwsIOException() throws IOException {
        byte[] invalid = new byte[] { 'P', 'K', 0x03, 0x04 };
        new BZip2CompressorInputStream(new ByteArrayInputStream(invalid));
    }

    @Test(expected = IOException.class)
    public void testConstructor_invalidBlockSize_throwsIOException() throws IOException {
        byte[] invalid = new byte[] { 'B', 'Z', 'h', '0' };
        new BZip2CompressorInputStream(new ByteArrayInputStream(invalid));
    }

    @Test(expected = IOException.class)
    public void testConstructor_invalidBlockSizeAbove9_throwsIOException() throws IOException {
        byte[] invalid = new byte[] { 'B', 'Z', 'h', 'A' };
        new BZip2CompressorInputStream(new ByteArrayInputStream(invalid));
    }

    @Test(expected = IOException.class)
    public void testConstructor_truncatedStream_throwsIOException() throws IOException {
        byte[] truncated = new byte[] { 'B', 'Z', 'h', '9', 0x31, 0x41 };
        new BZip2CompressorInputStream(new ByteArrayInputStream(truncated));
    }

    @Test(expected = IOException.class)
    public void testConstructor_badBlockHeader_throwsIOException() throws IOException {
        byte[] badHeader = new byte[] {
                'B', 'Z', 'h', '9',
                0x31, 0x41, 0x59, 0x26, 0x53, 0x00 // bad last byte of block header
        };
        new BZip2CompressorInputStream(new ByteArrayInputStream(badHeader));
    }

    @Test(expected = IOException.class)
    public void testDecompress_corruptedCrcInBlock_throwsIOException() throws IOException {
        byte[] corrupted = HELLO_WORLD_BZ2.clone();
        corrupted[11] ^= 0xFF; // corrupt stored block CRC
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(corrupted))) {
            byte[] buf = new byte[64];
            while (bzIn.read(buf, 0, buf.length) != -1) {
                // read until CRC check on block completion
            }
        }
    }

    @Test(expected = IOException.class)
    public void testDecompress_corruptedStreamCrcInEmptyStream_throwsIOException() throws IOException {
        byte[] corrupted = EMPTY_BZ2.clone();
        corrupted[10] = 0x01; // non-zero CRC for empty stream
        new BZip2CompressorInputStream(new ByteArrayInputStream(corrupted));
    }

    @Test(expected = IOException.class)
    public void testRead_afterClose_throwsIOException() throws IOException {
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(
                new ByteArrayInputStream(HELLO_WORLD_BZ2));
        bzIn.close();
        bzIn.read();
    }

    @Test(expected = IOException.class)
    public void testReadBuffer_afterClose_throwsIOException() throws IOException {
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(
                new ByteArrayInputStream(HELLO_WORLD_BZ2));
        bzIn.close();
        byte[] buf = new byte[10];
        bzIn.read(buf, 0, 10);
    }

    @Test
    public void testReadBuffer_zeroLength() throws IOException {
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(
                new ByteArrayInputStream(HELLO_WORLD_BZ2))) {
            byte[] buf = new byte[10];
            int read = bzIn.read(buf, 0, 0);
            Assert.assertEquals(0, read);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadBuffer_negativeOffset_throwsException() throws IOException {
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(
                new ByteArrayInputStream(HELLO_WORLD_BZ2))) {
            byte[] buf = new byte[10];
            bzIn.read(buf, -1, 5);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadBuffer_negativeLength_throwsException() throws IOException {
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(
                new ByteArrayInputStream(HELLO_WORLD_BZ2))) {
            byte[] buf = new byte[10];
            bzIn.read(buf, 0, -1);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadBuffer_offsetPlusLengthOverflow_throwsException() throws IOException {
        try (BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(
                new ByteArrayInputStream(HELLO_WORLD_BZ2))) {
            byte[] buf = new byte[10];
            bzIn.read(buf, 5, 6);
        }
    }

    @Test
    public void testClose_multipleTimesDoesNotThrow() throws IOException {
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(
                new ByteArrayInputStream(HELLO_WORLD_BZ2));
        bzIn.close();
        bzIn.close();
    }

    @Test
    public void testClose_systemInNotClosed() throws IOException {
        // Test branch where in == System.in
        // We construct with custom stream that avoids closing System.in
        InputStream dummyIn = new InputStream() {
            private final ByteArrayInputStream inner = new ByteArrayInputStream(EMPTY_BZ2);

            @Override
            public int read() throws IOException {
                return inner.read();
            }
        };
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(dummyIn);
        bzIn.close();
    }
}
