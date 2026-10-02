import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

public class TarUtilsTest {

    // ---------- parseOctal ----------

    @Test
    public void testParseOctal_normalValue_returnsCorrectLong() {
        byte[] buf = "0000755 \0".getBytes();
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0755, result);
    }

    @Test
    public void testParseOctal_leadingNul_returnsZero() {
        byte[] buf = new byte[]{0, '7', '5', ' '};
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_allNuls_returnsZero() {
        byte[] buf = new byte[]{0, 0, 0, 0};
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_leadingSpaces_skipsAndParses() {
        byte[] buf = "  17 ".getBytes();
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(017, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buf = new byte[]{'1'};
        TarUtils.parseOctal(buf, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidDigit_throwsException() {
        byte[] buf = "  8 ".getBytes();
        TarUtils.parseOctal(buf, 0, buf.length);
    }

    @Test
    public void testParseOctal_noTrailingSeparator_parsesFullRange() {
        byte[] buf = "777".getBytes();
        long result = TarUtils.parseOctal(buf, 0, buf.length);
        assertEquals(0777, result);
    }

    // ---------- parseOctalOrBinary ----------

    @Test
    public void testParseOctalOrBinary_normalOctal_delegatesToParseOctal() {
        byte[] buf = "0000017 \0".getBytes();
        long result = TarUtils.parseOctalOrBinary(buf, 0, buf.length);
        assertEquals(017, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongPositive_returnsCorrectValue() {
        byte[] buf = new byte[8];
        buf[0] = (byte) 0x80; // high bit set, not 0xff => positive
        buf[7] = 5;
        long result = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertEquals(5L, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongNegative_returnsNegativeValue() {
        byte[] buf = new byte[]{
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFE
        };
        long result = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertTrue(result < 0);
    }

    @Test
    public void testParseOctalOrBinary_bigIntegerPositive_returnsCorrectValue() {
        byte[] buf = new byte[12];
        buf[0] = (byte) 0x80; // marker, positive
        buf[10] = 0x03;
        buf[11] = (byte) 0xE8; // 0x03E8 = 1000
        long result = TarUtils.parseOctalOrBinary(buf, 0, 12);
        assertEquals(1000L, result);
    }

    @Test
    public void testParseOctalOrBinary_bigIntegerNegative_returnsNegativeValue() {
        byte[] buf = new byte[12];
        for (int i = 0; i < 12; i++) {
            buf[i] = (byte) 0xFF;
        }
        long result = TarUtils.parseOctalOrBinary(buf, 0, 12);
        assertEquals(-1L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_bigIntegerExceeds63Bits_throwsException() {
        byte[] buf = new byte[12];
        buf[0] = (byte) 0x80;
        for (int i = 1; i < 12; i++) {
            buf[i] = (byte) 0x7F;
        }
        TarUtils.parseOctalOrBinary(buf, 0, 12);
    }

    // ---------- parseBoolean ----------

    @Test
    public void testParseBoolean_valueIsOne_returnsTrue() {
        byte[] buf = new byte[]{1};
        assertTrue(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void testParseBoolean_valueIsZero_returnsFalse() {
        byte[] buf = new byte[]{0};
        assertFalse(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void testParseBoolean_valueIsOther_returnsFalse() {
        byte[] buf = new byte[]{5};
        assertFalse(TarUtils.parseBoolean(buf, 0));
    }

    // ---------- parseName ----------

    @Test
    public void testParseName_normalName_returnsCorrectString() {
        byte[] buf = "hello\0\0\0".getBytes();
        String name = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("hello", name);
    }

    @Test
    public void testParseName_allNuls_returnsEmptyString() {
        byte[] buf = new byte[]{0, 0, 0, 0};
        String name = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("", name);
    }

    @Test
    public void testParseName_noTrailingNul_returnsFullLength() {
        byte[] buf = "abcdef".getBytes();
        String name = TarUtils.parseName(buf, 0, buf.length);
        assertEquals("abcdef", name);
    }

    @Test
    public void testParseName_withEncoding_returnsCorrectString() throws IOException {
        byte[] buf = "world\0\0\0".getBytes();
        String name = TarUtils.parseName(buf, 0, buf.length, TarUtils.DEFAULT_ENCODING);
        assertEquals("world", name);
    }

    // ---------- formatNameBytes ----------

    @Test
    public void testFormatNameBytes_shortName_padsWithNul() {
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
    public void testFormatNameBytes_nameLongerThanBuffer_truncates() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("abcdef", buf, 0, 3);
        assertEquals(3, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
    }

    @Test
    public void testFormatNameBytes_emptyName_writesAllNuls() {
        byte[] buf = new byte[5];
        TarUtils.formatNameBytes("", buf, 0, 5);
        for (byte b : buf) {
            assertEquals(0, b);
        }
    }

    @Test
    public void testFormatNameBytes_withEncoding_returnsUpdatedOffset() throws IOException {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("ab", buf, 0, 5, TarUtils.DEFAULT_ENCODING);
        assertEquals(5, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
    }

    // ---------- formatUnsignedOctalString ----------

    @Test
    public void testFormatUnsignedOctalString_valueZero_fillsWithZeros() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 6);
        for (byte b : buf) {
            assertEquals('0', b);
        }
    }

    @Test
    public void testFormatUnsignedOctalString_normalValue_correctOctal() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 6);
        assertEquals("000010", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge_throwsException() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 1);
    }

    // ---------- formatOctalBytes ----------

    @Test
    public void testFormatOctalBytes_normalValue_correctBytes() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('0', buf[2]);
        assertEquals('0', buf[3]);
        assertEquals('1', buf[4]);
        assertEquals('0', buf[5]);
        assertEquals(' ', buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(8L, buf, 0, 3);
    }

    // ---------- formatLongOctalBytes ----------

    @Test
    public void testFormatLongOctalBytes_normalValue_correctBytes() {
        byte[] buf = new byte[7];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 7);
        assertEquals(7, newOffset);
        assertEquals("000010", new String(buf, 0, 6));
        assertEquals(' ', buf[6]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[2];
        TarUtils.formatLongOctalBytes(8L, buf, 0, 2);
    }

    // ---------- formatCheckSumOctalBytes ----------

    @Test
    public void testFormatCheckSumOctalBytes_normalValue_correctBytes() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals("000010", new String(buf, 0, 6));
        assertEquals(0, buf[6]);
        assertEquals(' ', buf[7]);
    }

    // ---------- formatLongOctalOrBinaryBytes ----------

    @Test
    public void testFormatLongOctalOrBinaryBytes_smallPositiveValue_usesOctalFormat() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(100L, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, newOffset);

        byte[] expected = new byte[TarConstants.UIDLEN];
        TarUtils.formatLongOctalBytes(100L, expected, 0, TarConstants.UIDLEN);
        assertEquals(new String(expected), new String(buf));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeValueShortLength_usesBinaryFormat() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(-5L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeValueLongLength_usesBigIntegerBinaryFormat() {
        byte[] buf = new byte[12];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(-100L, buf, 0, 12);
        assertEquals(12, newOffset);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_positiveValueExceedsMax_usesBigIntegerBinaryFormat() {
        byte[] buf = new byte[12];
        long value = TarConstants.MAXSIZE + 1;
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        assertEquals(12, newOffset);
        assertEquals((byte) 0x80, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_valueTooLargeForBinaryField_throwsException() {
        byte[] buf = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 8);
    }

    // ---------- computeCheckSum ----------

    @Test
    public void testComputeCheckSum_allZeroBuffer_returnsZero() {
        byte[] buf = new byte[10];
        assertEquals(0L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSum_normalBuffer_correctSum() {
        byte[] buf = new byte[]{1, 2, 3, 4};
        assertEquals(10L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSum_bufferWithHighBitBytes_correctUnsignedSum() {
        byte[] buf = new byte[]{(byte) 0xFF, (byte) 0xFF};
        assertEquals(510L, TarUtils.computeCheckSum(buf));
    }

    // ---------- verifyCheckSum ----------

    @Test
    public void testVerifyCheckSum_validChecksum_returnsTrue() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) 'a';
        }
        // set checksum field to spaces prior to computing sum
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_corruptedChecksum_returnsFalse() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) 'a';
        }
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        // corrupt a byte outside checksum field
        header[0] = (byte) 'z';

        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_allZeroHeader_returnsTrue() {
        byte[] header = new byte[512];
        assertTrue(TarUtils.verifyCheckSum(header));
    }
}
