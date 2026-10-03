package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BZip2CompressorInputStreamTest {

    private static final byte[] EMPTY_BZ2 = hexToBytes(
            "42 5A 68 39 17 72 45 38 50 90 00 00 00 00"
    );

    // Compressed "test\n"
    private static final byte[] TEST_TEXT_BZ2 = hexToBytes(
            "42 5A 68 39 31 41 59 26 53 59 4B 67 9C 2A 00 00 00 C1 00 00 10 20 " +
            "00 20 00 21 00 82 83 17 46 32 4E 8D 28 62 EE 48 A7 0A 12 09 6C F3 " +
            "85 40 17 72 45 38 50 90 4B 67 9C 2A"
    );

    // Compressed 100 'a' chars (triggers run-length decoding in no-rand state)
    private static final byte[] REPEATED_A_BZ2 = hexToBytes(
            "42 5A 68 39 31 41 59 26 53 59 7D 5B 50 D0 00 00 00 41 00 00 10 20 " +
            "00 20 00 21 00 82 83 17 4B 90 5C 62 10 65 A0 17 72 45 38 50 90 7D " +
            "5B 50 D0"
    );

    // Compressed "AAAAABBBBBCCCCCDDDDD\n"
    private static final byte[] MULTIPLE_RUNS_BZ2 = hexToBytes(
            "42 5A 68 39 31 41 59 26 53 59 3B B5 2E E7 00 00 01 C9 80 00 10 40 " +
            "00 38 00 20 00 30 81 21 8C A4 D2 A2 00 82 B2 92 C9 B6 74 A0 F4 A5 " +
            "94 36 F5 C3 14 0B EB 4B 33 2A CC B1 A3 D4 A3 2A 73 EF C2 60 4C AC " +
            "AE 55 A4 D2 C9 59 36 DB 9E D2 D0 17 72 45 38 50 90 3B B5 2E E7"
    );

    private static byte[] hexToBytes(String hex) {
        String cleaned = hex.replaceAll("\\s+", "");
        byte[] data = new byte[cleaned.length() / 2];
        for (int i = 0; i < cleaned.length(); i += 2) {
            data[i / 2] = (byte) ((Character.digit(cleaned.charAt(i), 16) << 4)
                    + Character.digit(cleaned.charAt(i + 1), 16));
        }
        return data;
    }

    @Test
    public void testMatches_nullOrShortSignature_returnsFalse() {
        assertFalse(BZip2CompressorInputStream.matches(new byte[0], 0));
        assertFalse(BZip2CompressorInputStream.matches(new byte[]{ 'B' }, 1));
        assertFalse(BZip2CompressorInputStream.matches(new byte[]{ 'B', 'Z' }, 2));
    }

    @Test
    public void testMatches_invalidHeaderSignature_returnsFalse() {
        assertFalse(BZip2CompressorInputStream.matches(new byte[]{ 'A', 'Z', 'h' }, 3));
        assertFalse(BZip2CompressorInputStream.matches(new byte[]{ 'B', 'A', 'h' }, 3));
        assertFalse(BZip2CompressorInputStream.matches(new byte[]{ 'B', 'Z', '0' }, 3));
    }

    @Test
    public void testMatches_validSignature_returnsTrue() {
        assertTrue(BZip2CompressorInputStream.matches(new byte[]{ 'B', 'Z', 'h' }, 3));
        assertTrue(BZip2CompressorInputStream.matches(new byte[]{ 'B', 'Z', 'h', '9' }, 4));
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
        new BZip2CompressorInputStream(new ByteArrayInputStream(new byte[]{ 'P', 'K', 3, 4 }));
    }

    @Test(expected = IOException.class)
    public void testConstructor_invalidBlockSizeLow_throwsIOException() throws IOException {
        new BZip2CompressorInputStream(new ByteArrayInputStream(new byte[]{ 'B', 'Z', 'h', '0' }));
    }

    @Test(expected = IOException.class)
    public void testConstructor_invalidBlockSizeHigh_throwsIOException() throws IOException {
        new BZip2CompressorInputStream(new ByteArrayInputStream(new byte[]{ 'B', 'Z', 'h', ':' }));
    }

    @Test(expected = IOException.class)
    public void testConstructor_unexpectedEofAfterHeader_throwsIOException() throws IOException {
        new BZip2CompressorInputStream(new ByteArrayInputStream(new byte[]{ 'B', 'Z', 'h', '9' }));
    }

    @Test(expected = IOException.class)
    public void testConstructor_badBlockHeader_throwsIOException() throws IOException {
        byte[] badHeaderData = new byte[]{ 'B', 'Z', 'h', '9', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        new BZip2CompressorInputStream(new ByteArrayInputStream(badHeaderData));
    }

    @Test
    public void testDecompress_emptyStream_returnsEof() throws IOException {
        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZ2))) {
            assertEquals(-1, in.read());
            assertEquals(-1, in.read(new byte[10], 0, 10));
        }
    }

    @Test
    public void testDecompress_validSmallStream_readByteByByte() throws IOException {
        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(TEST_TEXT_BZ2))) {
            byte[] expected = "test\n".getBytes();
            for (byte b : expected) {
                assertEquals(b & 0xFF, in.read());
            }
            assertEquals(-1, in.read());
        }
    }

    @Test
    public void testDecompress_validSmallStream_readByteArray() throws IOException {
        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(TEST_TEXT_BZ2))) {
            byte[] buf = new byte[10];
            int readCount = in.read(buf, 0, buf.length);
            assertEquals(5, readCount);
            assertEquals("test\n", new String(buf, 0, readCount));
            assertEquals(-1, in.read(buf, 0, buf.length));
        }
    }

    @Test
    public void testDecompress_runLengthEncodedStream() throws IOException {
        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(REPEATED_A_BZ2))) {
            byte[] buf = new byte[150];
            int totalRead = 0;
            int r;
            while ((r = in.read(buf, totalRead, buf.length - totalRead)) != -1) {
                totalRead += r;
            }
            assertEquals(100, totalRead);
            for (int i = 0; i < 100; i++) {
                assertEquals('a', (char) buf[i]);
            }
        }
    }

    @Test
    public void testDecompress_multipleRunsStream() throws IOException {
        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(MULTIPLE_RUNS_BZ2))) {
            byte[] buf = new byte[64];
            int totalRead = 0;
            int r;
            while ((r = in.read(buf, totalRead, buf.length - totalRead)) != -1) {
                totalRead += r;
            }
            String result = new String(buf, 0, totalRead);
            assertEquals("AAAAABBBBBCCCCCDDDDD\n", result);
        }
    }

    @Test
    public void testRead_boundsChecking() throws IOException {
        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(TEST_TEXT_BZ2))) {
            byte[] buf = new byte[10];

            try {
                in.read(buf, -1, 5);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {
            }

            try {
                in.read(buf, 0, -1);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {
            }

            try {
                in.read(buf, 6, 5);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {
            }

            assertEquals(-1, in.read(buf, 0, 0));
        }
    }

    @Test
    public void testRead_afterClose_throwsIOException() throws IOException {
        BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(TEST_TEXT_BZ2));
        in.close();

        try {
            in.read();
            fail("Expected IOException on read() after close()");
        } catch (IOException expected) {
            assertEquals("stream closed", expected.getMessage());
        }

        try {
            in.read(new byte[5], 0, 5);
            fail("Expected IOException on read(byte[], int, int) after close()");
        } catch (IOException expected) {
            assertEquals("stream closed", expected.getMessage());
        }
    }

    @Test
    public void testClose_multipleCalls_noException() throws IOException {
        BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(EMPTY_BZ2));
        in.close();
        in.close();
    }

    @Test
    public void testConcatenatedStreams_enabled() throws IOException {
        byte[] concatenated = new byte[EMPTY_BZ2.length * 2];
        System.arraycopy(EMPTY_BZ2, 0, concatenated, 0, EMPTY_BZ2.length);
        System.arraycopy(EMPTY_BZ2, 0, concatenated, EMPTY_BZ2.length, EMPTY_BZ2.length);

        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(concatenated), true)) {
            assertEquals(-1, in.read());
        }
    }

    @Test
    public void testConcatenatedStreams_disabled() throws IOException {
        byte[] concatenated = new byte[TEST_TEXT_BZ2.length + EMPTY_BZ2.length];
        System.arraycopy(TEST_TEXT_BZ2, 0, concatenated, 0, TEST_TEXT_BZ2.length);
        System.arraycopy(EMPTY_BZ2, 0, concatenated, TEST_TEXT_BZ2.length, EMPTY_BZ2.length);

        ByteArrayInputStream bin = new ByteArrayInputStream(concatenated);
        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(bin, false)) {
            byte[] buf = new byte[10];
            int readCount = in.read(buf, 0, buf.length);
            assertEquals(5, readCount);
            assertEquals("test\n", new String(buf, 0, readCount));
            assertEquals(-1, in.read());
        }
    }

    @Test(expected = IOException.class)
    public void testConcatenatedStreams_garbageAfterValidStream_throwsIOException() throws IOException {
        byte[] withGarbage = new byte[EMPTY_BZ2.length + 4];
        System.arraycopy(EMPTY_BZ2, 0, withGarbage, 0, EMPTY_BZ2.length);
        withGarbage[EMPTY_BZ2.length] = 'G';
        withGarbage[EMPTY_BZ2.length + 1] = 'A';
        withGarbage[EMPTY_BZ2.length + 2] = 'R';
        withGarbage[EMPTY_BZ2.length + 3] = 'B';

        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(withGarbage), true)) {
            in.read();
        }
    }

    @Test(expected = IOException.class)
    public void testCrcError_corruptedCombinedCrc_throwsIOException() throws IOException {
        byte[] corrupted = Arrays.copyOf(EMPTY_BZ2, EMPTY_BZ2.length);
        corrupted[corrupted.length - 1] ^= 0xFF;
        new BZip2CompressorInputStream(new ByteArrayInputStream(corrupted));
    }

    @Test(expected = IOException.class)
    public void testCrcError_corruptedBlockCrc_throwsIOException() throws IOException {
        byte[] corrupted = Arrays.copyOf(TEST_TEXT_BZ2, TEST_TEXT_BZ2.length);
        // Mutate block CRC bytes
        corrupted[10] ^= 0x55;
        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(corrupted))) {
            byte[] buf = new byte[100];
            while (in.read(buf, 0, buf.length) >= 0) {
                // Read until block end to trigger CRC verification
            }
        }
    }

    @Test(expected = IOException.class)
    public void testDecompress_truncatedStream_throwsIOException() throws IOException {
        byte[] truncated = Arrays.copyOf(TEST_TEXT_BZ2, TEST_TEXT_BZ2.length - 15);
        try (BZip2CompressorInputStream in = new BZip2CompressorInputStream(new ByteArrayInputStream(truncated))) {
            byte[] buf = new byte[100];
            while (in.read(buf, 0, buf.length) >= 0) {
                // Read until truncated stream fails
            }
        }
    }
}
