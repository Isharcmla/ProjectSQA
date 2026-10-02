import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

import org.junit.Test;
import static org.junit.Assert.*;

public class BZip2CompressorInputStreamTest {

    // ---------- Helper methods ----------

    private byte[] compress(byte[] data) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BZip2CompressorOutputStream bzOut = new BZip2CompressorOutputStream(baos);
        bzOut.write(data);
        bzOut.close();
        return baos.toByteArray();
    }

    private byte[] compress(byte[] data, int blockSize) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BZip2CompressorOutputStream bzOut = new BZip2CompressorOutputStream(baos, blockSize);
        bzOut.write(data);
        bzOut.close();
        return baos.toByteArray();
    }

    private byte[] decompressAllByRead(InputStream compressedIn, boolean concat) throws IOException {
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(compressedIn, concat);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int b;
        while ((b = bzIn.read()) != -1) {
            out.write(b);
        }
        bzIn.close();
        return out.toByteArray();
    }

    // ---------- Normal / typical cases ----------

    @Test
    public void testRead_singleByte_normal() throws IOException {
        String text = "Hello World! Hello World! Hello World! Hello Apache Commons Compress!";
        byte[] compressed = compress(text.getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int b;
        while ((b = bzIn.read()) != -1) {
            out.write(b);
        }
        bzIn.close();
        assertArrayEquals(text.getBytes(), out.toByteArray());
    }

    @Test
    public void testReadByteArray_normal() throws IOException {
        String text = "The quick brown fox jumps over the lazy dog. Repeat repeat repeat.";
        byte[] compressed = compress(text.getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));

        byte[] buffer = new byte[1024];
        int total = 0;
        int r;
        while ((r = bzIn.read(buffer, total, buffer.length - total)) != -1) {
            total += r;
        }
        bzIn.close();
        byte[] result = Arrays.copyOf(buffer, total);
        assertArrayEquals(text.getBytes(), result);
    }

    @Test
    public void testReadByteArray_partialBufferOffset_normal() throws IOException {
        String text = "0123456789ABCDEF";
        byte[] compressed = compress(text.getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));

        byte[] dest = new byte[50];
        int offs = 10;
        int len = 16;
        int r = bzIn.read(dest, offs, len);
        bzIn.close();
        assertTrue(r > 0);
        byte[] actual = Arrays.copyOfRange(dest, offs, offs + r);
        assertArrayEquals(text.substring(0, r).getBytes(), actual);
    }

    @Test
    public void testSingleArgConstructor_normal() throws IOException {
        String text = "Testing single-argument constructor for BZip2CompressorInputStream.";
        byte[] compressed = compress(text.getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int b;
        while ((b = bzIn.read()) != -1) {
            out.write(b);
        }
        bzIn.close();
        assertArrayEquals(text.getBytes(), out.toByteArray());
    }

    @Test
    public void testDecompressConcatenated_true_normal() throws IOException {
        String text1 = "First concatenated stream content.";
        String text2 = "Second concatenated stream content.";
        byte[] compressed1 = compress(text1.getBytes());
        byte[] compressed2 = compress(text2.getBytes());

        ByteArrayOutputStream concatBaos = new ByteArrayOutputStream();
        concatBaos.write(compressed1);
        concatBaos.write(compressed2);

        byte[] result = decompressAllByRead(new ByteArrayInputStream(concatBaos.toByteArray()), true);
        String expected = text1 + text2;
        assertArrayEquals(expected.getBytes(), result);
    }

    @Test
    public void testDecompressConcatenated_false_onlyFirstStreamRead() throws IOException {
        String text1 = "First stream only.";
        String text2 = "Second stream should not be read.";
        byte[] compressed1 = compress(text1.getBytes());
        byte[] compressed2 = compress(text2.getBytes());

        ByteArrayOutputStream concatBaos = new ByteArrayOutputStream();
        concatBaos.write(compressed1);
        concatBaos.write(compressed2);

        byte[] result = decompressAllByRead(new ByteArrayInputStream(concatBaos.toByteArray()), false);
        assertArrayEquals(text1.getBytes(), result);
    }

    @Test
    public void testMatches_validSignature_true() {
        byte[] signature = new byte[]{'B', 'Z', 'h', '9', 0x17, 0x72};
        assertTrue(BZip2CompressorInputStream.matches(signature, signature.length));
    }

    @Test
    public void testClose_normal_noException() throws IOException {
        byte[] compressed = compress("close test".getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        bzIn.close();
    }

    // ---------- Edge cases ----------

    @Test
    public void testRead_emptyContent_returnsMinusOneImmediately() throws IOException {
        byte[] compressed = compress(new byte[0]);
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        assertEquals(-1, bzIn.read());
        // calling again should still return -1 (EOF state)
        assertEquals(-1, bzIn.read());
        bzIn.close();
    }

    @Test
    public void testReadByteArray_zeroLength_returnsMinusOne() throws IOException {
        byte[] compressed = compress("some data".getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        byte[] dest = new byte[10];
        int r = bzIn.read(dest, 0, 0);
        assertEquals(-1, r);
        bzIn.close();
    }

    @Test
    public void testMatches_shortLength_false() {
        byte[] signature = new byte[]{'B', 'Z'};
        assertFalse(BZip2CompressorInputStream.matches(signature, 2));
    }

    @Test
    public void testMatches_invalidSignature_false() {
        byte[] signature = new byte[]{'X', 'Y', 'Z'};
        assertFalse(BZip2CompressorInputStream.matches(signature, 3));
    }

    @Test
    public void testMatches_wrongFirstByte_false() {
        byte[] signature = new byte[]{'A', 'Z', 'h'};
        assertFalse(BZip2CompressorInputStream.matches(signature, 3));
    }

    @Test
    public void testMatches_wrongSecondByte_false() {
        byte[] signature = new byte[]{'B', 'A', 'h'};
        assertFalse(BZip2CompressorInputStream.matches(signature, 3));
    }

    @Test
    public void testMatches_wrongThirdByte_false() {
        byte[] signature = new byte[]{'B', 'Z', 'A'};
        assertFalse(BZip2CompressorInputStream.matches(signature, 3));
    }

    @Test
    public void testClose_calledTwice_noException() throws IOException {
        byte[] compressed = compress("double close test".getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        bzIn.close();
        bzIn.close(); // second close should not throw
    }

    @Test
    public void testMultipleBlocks_smallBlockSize_normal() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append("abcdefghij");
        }
        byte[] data = sb.toString().getBytes();
        byte[] compressed = compress(data, 1); // small block size to force multiple blocks
        byte[] result = decompressAllByRead(new ByteArrayInputStream(compressed), false);
        assertArrayEquals(data, result);
    }

    // ---------- Exception cases ----------

    @Test(expected = IOException.class)
    public void testConstructor_nullInputStream_throwsIOException() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test(expected = IOException.class)
    public void testConstructor_invalidMagicBytes_throwsIOException() throws IOException {
        byte[] badData = new byte[]{'X', 'Y', 'Z', '9', 0, 0, 0, 0};
        new BZip2CompressorInputStream(new ByteArrayInputStream(badData));
    }

    @Test(expected = IOException.class)
    public void testConstructor_invalidBlockSize_throwsIOException() throws IOException {
        byte[] badData = new byte[]{'B', 'Z', 'h', '0', 0, 0, 0, 0};
        new BZip2CompressorInputStream(new ByteArrayInputStream(badData));
    }

    @Test(expected = IOException.class)
    public void testConstructor_blockSizeAboveNine_throwsIOException() throws IOException {
        byte[] badData = new byte[]{'B', 'Z', 'h', ':', 0, 0, 0, 0};
        new BZip2CompressorInputStream(new ByteArrayInputStream(badData));
    }

    @Test(expected = IOException.class)
    public void testConstructor_badBlockHeader_throwsIOException() throws IOException {
        // valid header magic + valid block size, but invalid block magic bytes
        byte[] badData = new byte[]{
            'B', 'Z', 'h', '1',
            0, 0, 0, 0, 0, 0
        };
        new BZip2CompressorInputStream(new ByteArrayInputStream(badData));
    }

    @Test(expected = IOException.class)
    public void testRead_afterClose_throwsIOException() throws IOException {
        byte[] compressed = compress("closed stream read test".getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        bzIn.close();
        bzIn.read();
    }

    @Test(expected = IOException.class)
    public void testReadByteArray_afterClose_throwsIOException() throws IOException {
        byte[] compressed = compress("closed stream read array test".getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        bzIn.close();
        byte[] dest = new byte[10];
        bzIn.read(dest, 0, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_negativeOffset_throwsException() throws IOException {
        byte[] compressed = compress("test data".getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        byte[] dest = new byte[10];
        bzIn.read(dest, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_negativeLength_throwsException() throws IOException {
        byte[] compressed = compress("test data".getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        byte[] dest = new byte[10];
        bzIn.read(dest, 0, -5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_offsetPlusLenExceedsDestLength_throwsException() throws IOException {
        byte[] compressed = compress("test data".getBytes());
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        byte[] dest = new byte[10];
        bzIn.read(dest, 5, 10);
    }

    @Test(expected = IOException.class)
    public void testRead_truncatedStream_throwsIOException() throws IOException {
        byte[] compressed = compress("Some test data for truncation testing 1234567890".getBytes());
        byte[] truncated = Arrays.copyOf(compressed, Math.max(compressed.length - 5, 4));
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(truncated));
        int b;
        while ((b = bzIn.read()) != -1) {
            // consume until failure
        }
    }

    @Test(expected = IOException.class)
    public void testRead_corruptedBlockCRC_throwsIOException() throws IOException {
        byte[] compressed = compress("Corrupt CRC test data content for bzip2 block.".getBytes());
        // header is 4 bytes ("BZh" + digit), followed by 6-byte block magic (byte-aligned),
        // followed by 4-byte stored block CRC starting at index 10.
        if (compressed.length > 11) {
            compressed[10] = (byte) (compressed[10] ^ 0xFF);
        }
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(new ByteArrayInputStream(compressed));
        int b;
        while ((b = bzIn.read()) != -1) {
            // consume until CRC error is detected
        }
    }
}
