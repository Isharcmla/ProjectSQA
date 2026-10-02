import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;

import org.apache.commons.compress.archivers.zip.ZipEncoding;

public class TarUtilsTest {

    // ---------- parseOctal ----------

    @Test
    public void testParseOctal_normalValue_returnsCorrectLong() {
        byte[] buf = "0000644 ".getBytes();
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0644L, result);
    }

    @Test
    public void testParseOctal_leadingSpaces_returnsCorrectLong() {
        byte[] buf = "  644 ".getBytes();
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0644L, result);
    }

    @Test
    public void testParseOctal_leadingNul_returnsZero() {
        byte[] buf = new byte[]{0, 0, 0, 0};
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buf = "1".getBytes();
        TarUtils.parseOctal(buf, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByte_throwsException() {
        byte[] buf = new byte[]{'1', '2', 'a', '4', ' '};
        TarUtils.parseOctal(buf, 0, buf.length);
    }

    // ---------- parseOctalOrBinary ----------

    @Test
    public void testParseOctalOrBinary_octalValue_returnsCorrectLong() {
        byte[] buf = "0000644 ".getBytes();
        long result = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(0644L, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongPositive_roundTrip() {
        byte[] buf = new byte[8];
        long value = 123456789L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, buf.length);
        long result = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(value, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongNegative_roundTrip() {
        byte[] buf = new byte[8];
        long value = -123456789L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, buf.length);
        long result = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(value, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryBigIntegerPositive_roundTrip() {
        byte[] buf = new byte[12];
        long value = Long.MAX_VALUE;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, buf.length);
        long result = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(value, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryBigIntegerNegative_roundTrip() {
        byte[] buf = new byte[12];
        long value = Long.MIN_VALUE;
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, buf.length);
        long result = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(value, result);
    }

    // ---------- parseBoolean ----------

    @Test
    public void testParseBoolean_byteOne_returnsTrue() {
        byte[] buf = new byte[]{1};
        assertTrue(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void testParseBoolean_byteZero_returnsFalse() {
        byte[] buf = new byte[]{0};
        assertFalse(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void testParseBoolean_otherByte_returnsFalse() {
        byte[] buf = new byte[]{5};
        assertFalse(TarUtils.parseBoolean(buf, 0));
    }

    // ---------- parseName ----------

    @Test
    public void testParseName_normalString_returnsCorrectName() throws IOException {
        byte[] buf = "hello\0\0\0".getBytes();
        String result = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("hello", result);
    }

    @Test
    public void testParseName_allNul_returnsEmptyString() {
        byte[] buf = new byte[5];
        String result = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("", result);
    }

    @Test
    public void testParseName_noTrailingNul_returnsFullBuffer() {
        byte[] buf = "world".getBytes();
        String result = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("world", result);
    }

    @Test
    public void testParseName_withEncoding_returnsCorrectName() throws IOException {
        byte[] buf = "test\0\0\0".getBytes();
        String result = TarUtils.parseName(buf, 0, buf.length, TarUtils.DEFAULT_ENCODING);
        assertEquals("test", result);
    }

    @Test
    public void testParseName_withFallbackEncoding_returnsCorrectName() throws IOException {
        byte[] buf = "abc\0\0".getBytes();
        String result = TarUtils.parseName(buf, 0, buf.length, TarUtils.FALLBACK_ENCODING);
        assertEquals("abc", result);
    }

    // ---------- formatNameBytes ----------

    @Test
    public void testFormatNameBytes_shortName_padsWithNul() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, buf.length);
        assertEquals(10, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
        assertEquals(0, buf[3]);
        assertEquals(0, buf[9]);
    }

    @Test
    public void testFormatNameBytes_longName_truncated() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("abcdef", buf, 0, buf.length);
        assertEquals(3, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
    }

    @Test
    public void testFormatNameBytes_emptyName_allNul() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("", buf, 0, buf.length);
        assertEquals(5, newOffset);
        for (byte b : buf) {
            assertEquals(0, b);
        }
    }

    @Test
    public void testFormatNameBytes_withEncoding_returnsCorrectOffset() throws IOException {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatNameBytes("xy", buf, 0, buf.length, TarUtils.DEFAULT_ENCODING);
        assertEquals(6, newOffset);
        assertEquals('x', buf[0]);
        assertEquals('y', buf[1]);
        assertEquals(0, buf[2]);
    }

    // ---------- formatUnsignedOctalString ----------

    @Test
    public void testFormatUnsignedOctalString_normalValue_correctOctal() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 3);
        assertEquals('0', buf[0]);
        assertEquals('1', buf[1]);
        assertEquals('0', buf[2]);
    }

    @Test
    public void testFormatUnsignedOctalString_zeroValue_returnsZeros() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 3);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('0', buf[2]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge_throwsException() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1);
    }

    @Test
    public void testFormatUnsignedOctalString_negativeValueTreatedUnsigned_doesNotThrow() {
        byte[] buf = new byte[22];
        TarUtils.formatUnsignedOctalString(-1L, buf, 0, 22);
        // Should not throw, buffer filled with octal representation of unsigned -1
        assertNotNull(buf);
    }

    // ---------- formatOctalBytes ----------

    @Test
    public void testFormatOctalBytes_normalValue_correctBytesAndOffset() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 5);
        assertEquals(5, newOffset);
        assertEquals('0', buf[0]);
        assertEquals('1', buf[1]);
        assertEquals('0', buf[2]);
        assertEquals(' ', buf[3]);
        assertEquals(0, buf[4]);
    }

    // ---------- formatLongOctalBytes ----------

    @Test
    public void testFormatLongOctalBytes_normalValue_correctBytesAndOffset() {
        byte[] buf = new byte[4];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 4);
        assertEquals(4, newOffset);
        assertEquals('0', buf[0]);
        assertEquals('1', buf[1]);
        assertEquals('0', buf[2]);
        assertEquals(' ', buf[3]);
    }

    // ---------- formatLongOctalOrBinaryBytes ----------

    @Test
    public void testFormatLongOctalOrBinaryBytes_smallValueOctalPath_correctOffset() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(100L, buf, 0, 8);
        assertEquals(8, newOffset);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_largeValueBinaryPathLength12_correctOffset() {
        byte[] buf = new byte[12];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 12);
        assertEquals(12, newOffset);
        assertEquals((byte) 0x80, buf[0]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeValueBinaryPathLength12_correctOffset() {
        byte[] buf = new byte[12];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(-100L, buf, 0, 12);
        assertEquals(12, newOffset);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_moderateValueBinaryPathLength8_doesNotThrow() {
        byte[] buf = new byte[8];
        long value = 1L << 40;
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals((byte) 0x80, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_valueTooLargeForLength8_throwsException() {
        byte[] buf = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 8);
    }

    // ---------- formatCheckSumOctalBytes ----------

    @Test
    public void testFormatCheckSumOctalBytes_normalValue_correctBytesAndOffset() {
        byte[] buf = new byte[4];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 4);
        assertEquals(4, newOffset);
        assertEquals('1', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals(0, buf[2]);
        assertEquals(' ', buf[3]);
    }

    // ---------- computeCheckSum ----------

    @Test
    public void testComputeCheckSum_normalBuffer_correctSum() {
        byte[] buf = new byte[]{1, 2, 3, 4};
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(10L, sum);
    }

    @Test
    public void testComputeCheckSum_emptyBuffer_returnsZero() {
        byte[] buf = new byte[0];
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(0L, sum);
    }

    @Test
    public void testComputeCheckSum_negativeBytes_treatedAsUnsigned() {
        byte[] buf = new byte[]{(byte) 0xFF};
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(255L, sum);
    }

    // ---------- verifyCheckSum ----------

    @Test
    public void testVerifyCheckSum_correctChecksum_returnsTrue() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 128);
        }
        long sum = 0;
        for (int i = 0; i < header.length; i++) {
            byte b = header[i];
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                b = ' ';
            }
            sum += 0xff & b;
        }
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        boolean result = TarUtils.verifyCheckSum(header);
        assertTrue(result);
    }

    @Test
    public void testVerifyCheckSum_incorrectChecksum_returnsFalse() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 64);
        }
        TarUtils.formatCheckSumOctalBytes(999999L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        boolean result = TarUtils.verifyCheckSum(header);
        assertFalse(result);
    }
}
