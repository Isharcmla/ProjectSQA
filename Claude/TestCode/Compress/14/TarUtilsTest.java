package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

public class TarUtilsTest {

    // ---------- parseOctal tests ----------

    @Test
    public void testParseOctal_normalValue_returnsCorrectLong() {
        byte[] buffer = "0000123 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0123L, result);
    }

    @Test
    public void testParseOctal_allNulBuffer_returnsZero() {
        byte[] buffer = new byte[8];
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_leadingSpaces_ignoredAndParsedCorrectly() {
        byte[] buffer = "   17 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(017L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buffer = "0".getBytes();
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_missingTrailingSpaceOrNul_throwsException() {
        byte[] buffer = "1234567".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidOctalDigit_throwsException() {
        byte[] buffer = "12389 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctal_singleTrailingSpace_parsedCorrectly() {
        byte[] buffer = "17 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(017L, result);
    }

    // ---------- parseOctalOrBinary tests ----------

    @Test
    public void testParseOctalOrBinary_octalPath_returnsCorrectLong() {
        byte[] buffer = "0000123 \0".getBytes();
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(0123L, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryPath_returnsCorrectLong() {
        byte[] buffer = new byte[9];
        buffer[0] = (byte) 0x80; // high bit set, remaining bits zero
        buffer[8] = 5;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(5L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryOverflow_throwsException() {
        byte[] buffer = new byte[9];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte) 0xFF;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    // ---------- parseBoolean tests ----------

    @Test
    public void testParseBoolean_valueOne_returnsTrue() {
        byte[] buffer = new byte[]{1};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBoolean_valueZero_returnsFalse() {
        byte[] buffer = new byte[]{0};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBoolean_otherValue_returnsFalse() {
        byte[] buffer = new byte[]{5};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    // ---------- parseName tests ----------

    @Test
    public void testParseName_normalString_returnsCorrectName() {
        byte[] buffer = "hello\0\0\0".getBytes();
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("hello", result);
    }

    @Test
    public void testParseName_noNulTerminator_returnsFullBuffer() {
        byte[] buffer = "hello".getBytes();
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("hello", result);
    }

    @Test
    public void testParseName_emptyBuffer_returnsEmptyString() {
        byte[] buffer = new byte[0];
        String result = TarUtils.parseName(buffer, 0, 0);
        assertEquals("", result);
    }

    @Test
    public void testParseName_immediateNul_returnsEmptyString() {
        byte[] buffer = new byte[]{0, 'a', 'b'};
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("", result);
    }

    // ---------- formatNameBytes tests ----------

    @Test
    public void testFormatNameBytes_nameShorterThanLength_padsWithNul() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 10);
        assertEquals(10, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
        assertEquals(0, buf[3]);
        assertEquals(0, buf[9]);
    }

    @Test
    public void testFormatNameBytes_nameLongerThanLength_truncated() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("abcdef", buf, 0, 3);
        assertEquals(3, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
    }

    @Test
    public void testFormatNameBytes_emptyName_fillsWithNul() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("", buf, 0, 5);
        assertEquals(5, newOffset);
        for (int i = 0; i < 5; i++) {
            assertEquals(0, buf[i]);
        }
    }

    // ---------- formatUnsignedOctalString tests ----------

    @Test
    public void testFormatUnsignedOctalString_valueZero_fillsWithZeros() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0, buf, 0, 4);
        assertEquals("0000", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalString_normalValue_formattedCorrectly() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(8, buf, 0, 4);
        assertEquals("0010", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge_throwsException() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8, buf, 0, 1);
    }

    // ---------- formatOctalBytes tests ----------

    @Test
    public void testFormatOctalBytes_normalValue_formattedCorrectly() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(100, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(' ', (char) buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(100, buf, 0, 3);
    }

    // ---------- formatLongOctalBytes tests ----------

    @Test
    public void testFormatLongOctalBytes_normalValue_formattedCorrectly() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(100, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(' ', (char) buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[2];
        TarUtils.formatLongOctalBytes(100, buf, 0, 2);
    }

    // ---------- formatLongOctalOrBinaryBytes tests ----------

    @Test
    public void testFormatLongOctalOrBinaryBytes_octalPath_worksCorrectly() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        long value = 100;
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, newOffset);
        // high bit should not be set for octal path
        assertEquals(0, buf[0] & 0x80);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryPath_setsHighBit() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        long value = TarConstants.MAXID + 1;
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, newOffset);
        assertNotEquals(0, buf[0] & 0x80);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_valueTooLargeForBinary_throwsException() {
        byte[] buf = new byte[1];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 1);
    }

    // ---------- formatCheckSumOctalBytes tests ----------

    @Test
    public void testFormatCheckSumOctalBytes_normalValue_formattedCorrectly() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(100, buf, 0, 8);
        assertEquals(8, newOffset);
        assertEquals(0, buf[6]);
        assertEquals(' ', (char) buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[3];
        TarUtils.formatCheckSumOctalBytes(100, buf, 0, 3);
    }

    // ---------- computeCheckSum tests ----------

    @Test
    public void testComputeCheckSum_normalBuffer_returnsCorrectSum() {
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
    public void testComputeCheckSum_negativeByteValues_handledAsUnsigned() {
        byte[] buf = new byte[]{(byte) 0xFF};
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(255L, sum);
    }
}
