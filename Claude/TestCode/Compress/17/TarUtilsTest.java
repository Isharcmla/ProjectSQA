import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;

import org.apache.commons.compress.archivers.zip.ZipEncoding;

public class TarUtilsTest {

    // ---------- parseOctal ----------

    @Test
    public void testParseOctal_normalInput_returnsCorrectValue() {
        byte[] buf = new byte[8];
        TarUtils.formatOctalBytes(83L, buf, 0, 8);
        long result = TarUtils.parseOctal(buf, 0, 8);
        assertEquals(83L, result);
    }

    @Test
    public void testParseOctal_leadingNul_returnsZero() {
        byte[] buf = new byte[8]; // all zero
        long result = TarUtils.parseOctal(buf, 0, 8);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_leadingSpaces_skipsThem() {
        byte[] buf = new byte[] {' ', ' ', '1', '2', ' ', 0};
        long result = TarUtils.parseOctal(buf, 0, 6);
        // "12" octal = 10 decimal
        assertEquals(10L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buf = new byte[] {'1'};
        TarUtils.parseOctal(buf, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_missingTrailingSpaceOrNul_throwsException() {
        byte[] buf = new byte[] {'1', '2', '3'};
        TarUtils.parseOctal(buf, 0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidDigit_throwsException() {
        byte[] buf = new byte[] {'8', ' ', 0};
        TarUtils.parseOctal(buf, 0, 3);
    }

    // ---------- parseOctalOrBinary ----------

    @Test
    public void testParseOctalOrBinary_octalPath_returnsCorrectValue() {
        byte[] buf = new byte[8];
        TarUtils.formatOctalBytes(83L, buf, 0, 8);
        long result = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertEquals(83L, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongNegative_roundTrip() {
        int length = TarConstants.UIDLEN; // typically 8, < 9
        long value = -1L;
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, length);
        assertEquals(value, parsed);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongPositive_roundTrip() {
        int length = TarConstants.UIDLEN; // 8, < 9
        long value = TarConstants.MAXID + 100L; // exceeds octal max for UIDLEN, forces binary
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, length);
        assertEquals(value, parsed);
    }

    @Test
    public void testParseOctalOrBinary_bigIntegerPathPositive_roundTrip() {
        int length = TarConstants.SIZELEN; // typically 12, >= 9
        long value = TarConstants.MAXSIZE + 1000L; // exceeds octal capacity
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, length);
        assertEquals(value, parsed);
    }

    @Test
    public void testParseOctalOrBinary_bigIntegerPathNegative_roundTrip() {
        int length = TarConstants.SIZELEN; // typically 12, >= 9
        long value = -(TarConstants.MAXSIZE + 1000L);
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, length);
        assertEquals(value, parsed);
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

    @Test
    public void testParseBoolean_otherValue_returnsFalse() {
        byte[] buf = new byte[] {5};
        assertFalse(TarUtils.parseBoolean(buf, 0));
    }

    // ---------- parseName ----------

    @Test
    public void testParseName_normalInput_returnsTrimmedString() {
        byte[] buf = new byte[] {'a', 'b', 'c', 0, 0};
        String result = TarUtils.parseName(buf, 0, 5);
        assertEquals("abc", result);
    }

    @Test
    public void testParseName_allNul_returnsEmptyString() {
        byte[] buf = new byte[5]; // all zero
        String result = TarUtils.parseName(buf, 0, 5);
        assertEquals("", result);
    }

    @Test
    public void testParseName_withEncoding_returnsCorrectString() throws IOException {
        byte[] buf = new byte[] {'x', 'y', 'z', 0, 0};
        String result = TarUtils.parseName(buf, 0, 5, TarUtils.DEFAULT_ENCODING);
        assertEquals("xyz", result);
    }

    @Test
    public void testParseName_noTrailingNul_usesFullLength() {
        byte[] buf = new byte[] {'a', 'b', 'c', 'd'};
        String result = TarUtils.parseName(buf, 0, 4);
        assertEquals("abcd", result);
    }

    // ---------- formatNameBytes ----------

    @Test
    public void testFormatNameBytes_nameShorterThanBuffer_padsWithNul() {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 6);
        assertEquals(6, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
        assertEquals(0, buf[3]);
        assertEquals(0, buf[4]);
        assertEquals(0, buf[5]);
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
    public void testFormatNameBytes_withEncoding_returnsCorrectOffset() throws IOException {
        byte[] buf = new byte[6];
        int newOffset = TarUtils.formatNameBytes("xy", buf, 0, 6, TarUtils.DEFAULT_ENCODING);
        assertEquals(6, newOffset);
        assertEquals('x', buf[0]);
        assertEquals('y', buf[1]);
        assertEquals(0, buf[2]);
    }

    @Test
    public void testFormatNameBytes_emptyName_fillsWithNul() {
        byte[] buf = new byte[4];
        int newOffset = TarUtils.formatNameBytes("", buf, 0, 4);
        assertEquals(4, newOffset);
        for (int i = 0; i < 4; i++) {
            assertEquals(0, buf[i]);
        }
    }

    // ---------- formatUnsignedOctalString ----------

    @Test
    public void testFormatUnsignedOctalString_normalValue_returnsCorrectBytes() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 4);
        assertEquals("0010", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalString_zeroValue_returnsAllZeros() {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 3);
        assertEquals("000", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge_throwsException() {
        byte[] buf = new byte[2];
        TarUtils.formatUnsignedOctalString(64L, buf, 0, 2);
    }

    // ---------- formatOctalBytes ----------

    @Test
    public void testFormatOctalBytes_normalValue_roundTripsCorrectly() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(83L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(83L, TarUtils.parseOctal(buf, 0, 8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(1000000L, buf, 0, 3);
    }

    // ---------- formatLongOctalBytes ----------

    @Test
    public void testFormatLongOctalBytes_normalValue_roundTripsCorrectly() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(83L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(83L, TarUtils.parseOctal(buf, 0, 8));
    }

    // ---------- formatLongOctalOrBinaryBytes ----------

    @Test
    public void testFormatLongOctalOrBinaryBytes_octalPath_returnsCorrectOffset() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(83L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(83L, TarUtils.parseOctalOrBinary(buf, 0, 8));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryPathNegative_setsHighBit() {
        int length = TarConstants.UIDLEN; // 8
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(-1L, buf, 0, length);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryPathPositive_setsHighBit() {
        int length = TarConstants.UIDLEN; // 8
        long value = TarConstants.MAXID + 100L;
        byte[] buf = new byte[length];
        TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals((byte) 0x80, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_valueTooLargeForLength_throwsException() {
        byte[] buf = new byte[4];
        // negative value forces binary path; magnitude exceeds capacity for length=4
        TarUtils.formatLongOctalOrBinaryBytes(-100000000L, buf, 0, 4);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_bigIntegerPath_returnsCorrectOffset() {
        int length = TarConstants.SIZELEN; // 12
        long value = TarConstants.MAXSIZE + 1000L;
        byte[] buf = new byte[length];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, length);
        assertEquals(length, newOffset);
    }

    // ---------- formatCheckSumOctalBytes ----------

    @Test
    public void testFormatCheckSumOctalBytes_normalValue_roundTripsCorrectly() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(83L, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(83L, TarUtils.parseOctal(buf, 0, 8));
    }

    // ---------- computeCheckSum ----------

    @Test
    public void testComputeCheckSum_normalBytes_returnsCorrectSum() {
        byte[] buf = new byte[] {1, 2, 3};
        assertEquals(6L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSum_negativeByte_treatedAsUnsigned() {
        byte[] buf = new byte[] {(byte) -1};
        assertEquals(255L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSum_emptyArray_returnsZero() {
        byte[] buf = new byte[0];
        assertEquals(0L, TarUtils.computeCheckSum(buf));
    }

    // ---------- verifyCheckSum ----------

    @Test
    public void testVerifyCheckSum_validHeader_returnsTrue() {
        byte[] header = new byte[512];
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_corruptedHeader_returnsFalse() {
        byte[] header = new byte[512];
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        // Corrupt a byte outside the checksum field to break the checksum match
        header[0] = 100;
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_allZeroHeader_returnsTrue() {
        byte[] header = new byte[512]; // storedSum = 0, unsignedSum = 0 -> equal
        assertTrue(TarUtils.verifyCheckSum(header));
    }
}
