package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;

public class TarUtilsTest {

    // ---------- parseOctal ----------

    @Test
    public void testParseOctal_normalValue_returnsCorrectLong() {
        byte[] buf = "0000644 ".getBytes();
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(420L, result); // 0644 octal = 420 decimal
    }

    @Test
    public void testParseOctal_leadingNul_returnsZero() {
        byte[] buf = new byte[] {0, '1', '2', ' '};
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_leadingSpaces_parsedCorrectly() {
        byte[] buf = "  17 ".getBytes();
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(15L, result); // octal 17 = 15
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buf = new byte[] {'1'};
        TarUtils.parseOctal(buf, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_allSpaces_throwsException() {
        byte[] buf = new byte[] {' ', ' '};
        TarUtils.parseOctal(buf, 0, buf.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidDigit_throwsException() {
        byte[] buf = "89 ".getBytes(); // '8' and '9' invalid octal digits
        TarUtils.parseOctal(buf, 0, buf.length);
    }

    // ---------- parseOctalOrBinary ----------

    @Test
    public void testParseOctalOrBinary_octalPath_returnsCorrectValue() {
        byte[] buf = "0000644 ".getBytes();
        long result = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(420L, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongPath_roundTrip() {
        long value = 123456L;
        byte[] buf = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(-value, buf, 0, 8);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertEquals(-value, parsed);
    }

    @Test
    public void testParseOctalOrBinary_binaryBigIntegerPath_roundTrip() {
        long value = -987654321L;
        byte[] buf = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 12);
        assertEquals(value, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_bigIntegerOverflow_throwsException() {
        byte[] buffer = new byte[10];
        buffer[0] = (byte) 0x80; // positive marker
        buffer[1] = 0x7F;
        for (int i = 2; i <= 9; i++) {
            buffer[i] = (byte) 0xFF;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, 10);
    }

    // ---------- parseBoolean ----------

    @Test
    public void testParseBoolean_valueOne_returnsTrue() {
        byte[] buf = new byte[] {1};
        assertTrue(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void testParseBoolean_valueZero_returnsFalse() {
        byte[] buf = new byte[] {0};
        assertFalse(TarUtils.parseBoolean(buf, 0));
    }

    // ---------- parseName ----------

    @Test
    public void testParseName_withTrailingNul_returnsTrimmedString() {
        byte[] buf = new byte[10];
        byte[] nameBytes = "hello".getBytes();
        System.arraycopy(nameBytes, 0, buf, 0, nameBytes.length);
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
    public void testParseName_noNul_fullLengthUsed() {
        byte[] buf = "world".getBytes();
        String result = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("world", result);
    }

    @Test
    public void testParseName_withEncoding_returnsCorrectString() throws IOException {
        byte[] buf = new byte[10];
        byte[] nameBytes = "test".getBytes();
        System.arraycopy(nameBytes, 0, buf, 0, nameBytes.length);
        String result = TarUtils.parseName(buf, 0, buf.length, TarUtils.FALLBACK_ENCODING);
        assertEquals("test", result);
    }

    // ---------- formatNameBytes ----------

    @Test
    public void testFormatNameBytes_shortName_paddedWithNul() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 10);
        assertEquals(10, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
        for (int i = 3; i < 10; i++) {
            assertEquals(0, buf[i]);
        }
    }

    @Test
    public void testFormatNameBytes_longName_truncated() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("abcdefgh", buf, 0, 5);
        assertEquals(5, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('e', buf[4]);
    }

    @Test
    public void testFormatNameBytes_emptyName_allNul() {
        byte[] buf = new byte[5];
        TarUtils.formatNameBytes("", buf, 0, 5);
        for (int i = 0; i < 5; i++) {
            assertEquals(0, buf[i]);
        }
    }

    @Test
    public void testFormatNameBytes_withEncoding_returnsCorrectOffset() throws IOException {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("xy", buf, 0, 10, TarUtils.FALLBACK_ENCODING);
        assertEquals(10, newOffset);
        assertEquals('x', buf[0]);
        assertEquals('y', buf[1]);
    }

    // ---------- formatUnsignedOctalString ----------

    @Test
    public void testFormatUnsignedOctalString_zeroValue_filledWithZeros() {
        byte[] buf = new byte[5];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 5);
        for (byte b : buf) {
            assertEquals('0', b);
        }
    }

    @Test
    public void testFormatUnsignedOctalString_normalValue_correctOctal() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 6);
        // 8 decimal = 10 octal
        assertEquals("000010", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge_throwsException() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1);
    }

    // ---------- formatOctalBytes ----------

    @Test
    public void testFormatOctalBytes_normalValue_correctFormat() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(' ', (char) buf[6]);
        assertEquals(0, buf[7]);
    }

    // ---------- formatLongOctalBytes ----------

    @Test
    public void testFormatLongOctalBytes_normalValue_correctFormat() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(' ', (char) buf[7]);
    }

    // ---------- formatLongOctalOrBinaryBytes ----------

    @Test
    public void testFormatLongOctalOrBinaryBytes_smallPositiveValue_usesOctal() {
        byte[] buf = new byte[12];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(100L, buf, 0, 12);
        assertEquals(12, newOffset);
        // should be printable octal representation, not high bit set
        assertFalse((buf[0] & 0x80) != 0 && buf[0] != 0);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeValueSmallLength_usesBinaryLong() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(-1000L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeValueLargeLength_usesBigInteger() {
        byte[] buf = new byte[12];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(-123456789L, buf, 0, 12);
        assertEquals(12, newOffset);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_valueTooLargeForBinaryLong_throwsException() {
        byte[] buf = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(-1000L, buf, 0, 2);
    }

    // ---------- formatCheckSumOctalBytes ----------

    @Test
    public void testFormatCheckSumOctalBytes_normalValue_correctFormat() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(0, buf[6]);
        assertEquals(' ', (char) buf[7]);
    }

    // ---------- computeCheckSum ----------

    @Test
    public void testComputeCheckSum_knownBuffer_correctSum() {
        byte[] buf = new byte[] {1, 2, 3, 4};
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(10L, sum);
    }

    @Test
    public void testComputeCheckSum_emptyBuffer_returnsZero() {
        byte[] buf = new byte[0];
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(0L, sum);
    }

    // ---------- verifyCheckSum ----------

    @Test
    public void testVerifyCheckSum_allZeroHeader_returnsTrue() {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 10];
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_correctChecksum_returnsTrue() {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 10];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) 'A';
        }
        // set checksum field to spaces first, as per algorithm
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_incorrectChecksum_returnsFalse() {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 10];
        // checksum field stays zero (storedSum = 0)
        // set some other byte to a high value to make unsignedSum/signedSum non-zero and bigger than stored
        header[header.length - 1] = 100;
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
