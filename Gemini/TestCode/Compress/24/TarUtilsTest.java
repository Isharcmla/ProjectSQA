package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testParseOctal_validValues_success() {
        byte[] buffer = " 0755 \0".getBytes();
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0755L, val);

        byte[] allZeros = new byte[]{0, 0, 0, 0};
        assertEquals(0L, TarUtils.parseOctal(allZeros, 0, allZeros.length));

        byte[] onlyZeroOctal = "000000 \0".getBytes();
        assertEquals(0L, TarUtils.parseOctal(onlyZeroOctal, 0, onlyZeroOctal.length));

        byte[] multipleSpaces = "   123   ".getBytes();
        assertEquals(0123L, TarUtils.parseOctal(multipleSpaces, 0, multipleSpaces.length));

        byte[] trailingNullAndSpace = "777\0 ".getBytes();
        assertEquals(0777L, TarUtils.parseOctal(trailingNullAndSpace, 0, trailingNullAndSpace.length));

        byte[] trailingSpacesAndNulls = "77  \0\0".getBytes();
        assertEquals(077L, TarUtils.parseOctal(trailingSpacesAndNulls, 0, trailingSpacesAndNulls.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThan2_throwsException() {
        byte[] buffer = new byte[]{'7'};
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_noTrailingSpaceOrNull_throwsException() {
        byte[] buffer = "123456".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByte_throwsException() {
        byte[] buffer = " 128 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidCharBelowZero_throwsException() {
        byte[] buffer = " 1-2 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinary_octal_success() {
        byte[] buffer = " 0755 \0".getBytes();
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(0755L, val);
    }

    @Test
    public void testParseOctalOrBinary_positiveBinaryLong_success() {
        byte[] buffer = new byte[]{
            (byte) 0x80, 0, 0, 0, 0, 1, 2, 3
        };
        long expected = (1L << 16) + (2L << 8) + 3L;
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(expected, val);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinaryLong_success() {
        byte[] buffer = new byte[]{
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe
        };
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(-2L, val);

        byte[] bufferMinusOne = new byte[]{
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff
        };
        assertEquals(-1L, TarUtils.parseOctalOrBinary(bufferMinusOne, 0, bufferMinusOne.length));
    }

    @Test
    public void testParseOctalOrBinary_positiveBinaryBigInteger_success() {
        byte[] buffer = new byte[]{
            (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4
        };
        long expected = (1L << 24) + (2L << 16) + (3L << 8) + 4L;
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(expected, val);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinaryBigInteger_success() {
        byte[] buffer = new byte[]{
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe
        };
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(-2L, val);

        byte[] bufferMinus100 = new byte[]{
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) (256 - 100)
        };
        assertEquals(-100L, TarUtils.parseOctalOrBinary(bufferMinus100, 0, bufferMinus100.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryBigIntegerOverflow_throwsException() {
        byte[] buffer = new byte[]{
            (byte) 0x80, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        };
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBoolean() {
        byte[] bufferTrue = new byte[]{1};
        byte[] bufferFalse = new byte[]{0};
        byte[] bufferOther = new byte[]{2};

        assertTrue(TarUtils.parseBoolean(bufferTrue, 0));
        assertFalse(TarUtils.parseBoolean(bufferFalse, 0));
        assertFalse(TarUtils.parseBoolean(bufferOther, 0));
    }

    @Test
    public void testParseName_defaultEncoding_success() {
        byte[] buffer = "test-file.txt\0extra_garbage".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("test-file.txt", name);

        byte[] emptyBuffer = new byte[]{0, 0, 0, 0};
        assertEquals("", TarUtils.parseName(emptyBuffer, 0, emptyBuffer.length));

        byte[] fullBuffer = "filename".getBytes();
        assertEquals("filename", TarUtils.parseName(fullBuffer, 0, fullBuffer.length));
    }

    @Test
    public void testParseName_withCustomEncoding() throws IOException {
        ZipEncoding customEncoding = TarUtils.FALLBACK_ENCODING;
        byte[] buffer = "custom-name\0\0\0".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length, customEncoding);
        assertEquals("custom-name", name);

        byte[] emptyBuffer = new byte[]{0, 0};
        assertEquals("", TarUtils.parseName(emptyBuffer, 0, emptyBuffer.length, customEncoding));
    }

    @Test
    public void testFormatNameBytes_defaultEncoding_success() {
        byte[] buffer = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("hello", buffer, 0, buffer.length);
        assertEquals(10, nextOffset);
        assertEquals("hello\0\0\0\0\0", new String(buffer));

        Arrays.fill(buffer, (byte) 0);
        TarUtils.formatNameBytes("verylongfilename", buffer, 0, buffer.length);
        assertEquals("verylongfi", new String(buffer));
    }

    @Test
    public void testFormatNameBytes_customEncoding_success() throws IOException {
        ZipEncoding customEncoding = TarUtils.FALLBACK_ENCODING;
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatNameBytes("abc", buffer, 0, buffer.length, customEncoding);
        assertEquals(8, nextOffset);
        assertEquals("abc\0\0\0\0\0", new String(buffer));

        Arrays.fill(buffer, (byte) 0);
        TarUtils.formatNameBytes("1234567890", buffer, 0, buffer.length, customEncoding);
        assertEquals("12345678", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalString_zero_success() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, buffer.length);
        assertEquals("0000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalString_positiveValue_success() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(0755, buffer, 0, buffer.length);
        assertEquals("000755", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_overflow_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(0755, buffer, 0, buffer.length);
    }

    @Test
    public void testFormatOctalBytes_success() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(0755, buffer, 0, buffer.length);
        assertEquals(8, nextOffset);
        assertEquals("0000755 ", new String(buffer, 0, 7));
        assertEquals(0, buffer[7]);
    }

    @Test
    public void testFormatLongOctalBytes_success() {
        byte[] buffer = new byte[7];
        int nextOffset = TarUtils.formatLongOctalBytes(0755, buffer, 0, buffer.length);
        assertEquals(7, nextOffset);
        assertEquals("0000755 ", new String(buffer));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_octalPath_success() {
        byte[] buffer = new byte[TarConstants.UIDLEN];
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(0755, buffer, 0, buffer.length);
        assertEquals(TarConstants.UIDLEN, nextOffset);
        assertEquals("0000755 ", new String(buffer));

        byte[] sizeBuffer = new byte[TarConstants.SIZELEN];
        nextOffset = TarUtils.formatLongOctalOrBinaryBytes(0755, sizeBuffer, 0, sizeBuffer.length);
        assertEquals(TarConstants.SIZELEN, nextOffset);
        assertEquals("00000000755 ", new String(sizeBuffer));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_positiveBinaryShort_success() {
        byte[] buffer = new byte[8];
        long val = TarConstants.MAXID + 1; // Exceeds UIDLEN max octal
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(val, buffer, 0, buffer.length);
        assertEquals(8, nextOffset);
        assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(val, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeBinaryShort_success() {
        byte[] buffer = new byte[8];
        long val = -12345L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(val, buffer, 0, buffer.length);
        assertEquals(8, nextOffset);
        assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(val, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_positiveBinaryLong_success() {
        byte[] buffer = new byte[12];
        long val = TarConstants.MAXSIZE + 1;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(val, buffer, 0, buffer.length);
        assertEquals(12, nextOffset);
        assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(val, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeBinaryLong_success() {
        byte[] buffer = new byte[12];
        long val = -9876543210L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(val, buffer, 0, buffer.length);
        assertEquals(12, nextOffset);
        assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(val, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_valueTooLargeForLength_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(100000L, buffer, 0, buffer.length);
    }

    @Test
    public void testFormatCheckSumOctalBytes_success() {
        byte[] buffer = new byte[TarConstants.CHKSUMLEN];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(01234, buffer, 0, buffer.length);
        assertEquals(TarConstants.CHKSUMLEN, nextOffset);
        assertEquals("001234\0 ", new String(buffer));
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[]{(byte) 0xff, 1, 2, 3};
        long expected = 255 + 1 + 2 + 3;
        assertEquals(expected, TarUtils.computeCheckSum(buffer));

        byte[] emptyBuffer = new byte[0];
        assertEquals(0L, TarUtils.computeCheckSum(emptyBuffer));
    }

    @Test
    public void testVerifyCheckSum_validHeaders_success() {
        byte[] header = new byte[512];
        header[0] = 'a';
        header[1] = 'b';
        TarUtils.formatCheckSumOctalBytes(01234, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        long unsignedSum = 0;
        for (int i = 0; i < header.length; i++) {
            byte b = header[i];
            if (TarConstants.CHKSUM_OFFSET <= i && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                b = ' ';
            }
            unsignedSum += 0xff & b;
        }

        TarUtils.formatCheckSumOctalBytes(unsignedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_signedSumMatch_success() {
        byte[] header = new byte[512];
        header[0] = (byte) 0xfe; // -2 signed, 254 unsigned

        long signedSum = 0;
        for (int i = 0; i < header.length; i++) {
            byte b = header[i];
            if (TarConstants.CHKSUM_OFFSET <= i && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                b = ' ';
            }
            signedSum += b;
        }

        TarUtils.formatCheckSumOctalBytes(signedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_storedSumGreaterThanUnsignedSum_success() {
        byte[] header = new byte[512];
        TarUtils.formatCheckSumOctalBytes(99999L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_invalidCheckSum_returnsFalse() {
        byte[] header = new byte[512];
        Arrays.fill(header, (byte) 'A');
        TarUtils.formatCheckSumOctalBytes(10L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_nonOctalAfterDigits_treatedCorrectly() {
        byte[] header = new byte[512];
        System.arraycopy("123abc  ".getBytes(), 0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testFallbackEncoding_directMethods() {
        ZipEncoding fallback = TarUtils.FALLBACK_ENCODING;
        assertTrue(fallback.canEncode("test"));

        ByteBuffer buf = fallback.encode("ABC\u00FF");
        assertEquals(4, buf.remaining());
        assertEquals((byte) 'A', buf.get());
        assertEquals((byte) 'B', buf.get());
        assertEquals((byte) 'C', buf.get());
        assertEquals((byte) 0xFF, buf.get());

        byte[] decodeBuf = new byte[]{'H', 'i', 0, 'X'};
        assertEquals("Hi", fallback.decode(decodeBuf));

        byte[] signExtBuf = new byte[]{(byte) 0xC3, (byte) 0xA9};
        String decoded = fallback.decode(signExtBuf);
        assertEquals(2, decoded.length());
        assertEquals(0xC3, (int) decoded.charAt(0));
        assertEquals(0xA9, (int) decoded.charAt(1));
    }
}
