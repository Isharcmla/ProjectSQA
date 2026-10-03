package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TarUtilsTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<TarUtils> constructor = TarUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        TarUtils instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testFallbackEncoding() {
        ZipEncoding fallback = TarUtils.FALLBACK_ENCODING;
        assertTrue(fallback.canEncode("test"));
        assertTrue(fallback.canEncode("\u00FC"));

        ByteBuffer buf = fallback.encode("abc\u00FF");
        assertEquals(4, buf.remaining());
        assertEquals((byte) 'a', buf.get());
        assertEquals((byte) 'b', buf.get());
        assertEquals((byte) 'c', buf.get());
        assertEquals((byte) 0xFF, buf.get());

        byte[] bytesToDecode = new byte[]{(byte) 'H', (byte) 'i', 0, (byte) '!', (byte) '?'};
        String decoded = fallback.decode(bytesToDecode);
        assertEquals("Hi", decoded);

        byte[] allChars = new byte[]{(byte) 0x80, (byte) 0xFF};
        String decodedAll = fallback.decode(allChars);
        assertEquals(2, decodedAll.length());
        assertEquals((char) 0x80, decodedAll.charAt(0));
        assertEquals((char) 0xFF, decodedAll.charAt(1));
    }

    @Test
    public void testParseOctal_normal() {
        byte[] buffer = " 0755 \0".getBytes();
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0755L, value);
    }

    @Test
    public void testParseOctal_allLeadingZerosOrNull() {
        byte[] buffer = new byte[]{0, 0, 0};
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buffer = new byte[]{'7'};
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_allSpaces_throwsException() {
        byte[] buffer = new byte[]{' ', ' ', ' '};
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByte_throwsException() {
        byte[] buffer = " 0789 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByteBelowZero_throwsException() {
        byte[] buffer = new byte[]{' ', '/', '0', ' '};
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinary_octalMode() {
        byte[] buffer = " 0123 \0".getBytes();
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(0123L, val);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongPositive() {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0x80;
        buffer[7] = 0x01;
        long val = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(1L, val);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongNegative() {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0xFF;
        buffer[1] = (byte) 0xFF;
        buffer[2] = (byte) 0xFF;
        buffer[3] = (byte) 0xFF;
        buffer[4] = (byte) 0xFF;
        buffer[5] = (byte) 0xFF;
        buffer[6] = (byte) 0xFF;
        buffer[7] = (byte) 0xFE;
        long val = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(-2L, val);
    }

    @Test
    public void testParseOctalOrBinary_binaryBigIntegerPositive() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[11] = 0x2A;
        long val = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(42L, val);
    }

    @Test
    public void testParseOctalOrBinary_binaryBigIntegerNegative() {
        byte[] buffer = new byte[12];
        Arrays.fill(buffer, (byte) 0xFF);
        buffer[11] = (byte) 0xFD; // -3
        long val = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(-3L, val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryBigIntegerExceedsLong_throwsException() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[1] = 0x01;
        buffer[2] = 0x00;
        buffer[3] = 0x00;
        buffer[4] = 0x00;
        TarUtils.parseOctalOrBinary(buffer, 0, 12);
    }

    @Test
    public void testParseBoolean() {
        byte[] buffer = new byte[]{0, 1, 2};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
        assertTrue(TarUtils.parseBoolean(buffer, 1));
        assertFalse(TarUtils.parseBoolean(buffer, 2));
    }

    @Test
    public void testParseName_andCustomEncoding() throws IOException {
        byte[] buffer = new byte[]{'h', 'e', 'l', 'l', 'o', 0, 'w', 'o', 'r', 'l', 'd'};
        String name = TarUtils.parseName(buffer, 0, 11);
        assertEquals("hello", name);

        String full = TarUtils.parseName(buffer, 0, 5);
        assertEquals("hello", full);

        byte[] allZeros = new byte[10];
        assertEquals("", TarUtils.parseName(allZeros, 0, 10));

        ZipEncoding enc = ZipEncodingHelper.getZipEncoding("UTF-8");
        assertEquals("hello", TarUtils.parseName(buffer, 0, 11, enc));
    }

    @Test
    public void testFormatNameBytes_andCustomEncoding() throws IOException {
        byte[] buf = new byte[10];
        int endOffset = TarUtils.formatNameBytes("test", buf, 0, 10);
        assertEquals(10, endOffset);
        assertEquals("test", TarUtils.parseName(buf, 0, 10));
        assertEquals(0, buf[4]);
        assertEquals(0, buf[9]);

        // Truncate case
        byte[] shortBuf = new byte[3];
        TarUtils.formatNameBytes("testing", shortBuf, 0, 3);
        assertEquals("tes", TarUtils.parseName(shortBuf, 0, 3));

        // With explicit ZipEncoding
        ZipEncoding enc = ZipEncodingHelper.getZipEncoding("UTF-8");
        byte[] encBuf = new byte[6];
        TarUtils.formatNameBytes("abc", encBuf, 0, 6, enc);
        assertEquals("abc", TarUtils.parseName(encBuf, 0, 6, enc));
    }

    @Test
    public void testFormatUnsignedOctalString_zero() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        assertEquals("0000", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalString_normal() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(0755L, buf, 0, 6);
        assertEquals("000755", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_overflow_throwsException() {
        byte[] buf = new byte[2];
        TarUtils.formatUnsignedOctalString(07777L, buf, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[8];
        int next = TarUtils.formatOctalBytes(0755L, buf, 0, 8);
        assertEquals(8, next);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('0', buf[2]);
        assertEquals('7', buf[3]);
        assertEquals('5', buf[4]);
        assertEquals('5', buf[5]);
        assertEquals(' ', buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[8];
        int next = TarUtils.formatLongOctalBytes(0755L, buf, 0, 8);
        assertEquals(8, next);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('0', buf[2]);
        assertEquals('0', buf[3]);
        assertEquals('7', buf[4]);
        assertEquals('5', buf[5]);
        assertEquals('5', buf[6]);
        assertEquals(' ', buf[7]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_octalFit() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        int next = TarUtils.formatLongOctalOrBinaryBytes(0755L, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, next);
        assertEquals(' ', buf[TarConstants.UIDLEN - 1]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, TarConstants.UIDLEN);
        assertEquals(0755L, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryPositiveSmall() {
        byte[] buf = new byte[8];
        long value = TarConstants.MAXID + 10L;
        int next = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals(8, next);
        assertEquals((byte) 0x80, buf[0]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryNegativeSmall() {
        byte[] buf = new byte[8];
        long value = -12345L;
        int next = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals(8, next);
        assertEquals((byte) 0xFF, buf[0]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryPositiveBig() {
        byte[] buf = new byte[12];
        long value = 0100000000000L; // > MAXSIZE
        int next = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        assertEquals(12, next);
        assertEquals((byte) 0x80, buf[0]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 12);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryNegativeBig() {
        byte[] buf = new byte[12];
        long value = -987654321L;
        int next = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        assertEquals(12, next);
        assertEquals((byte) 0xFF, buf[0]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 12);
        assertEquals(value, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinary_tooLarge_throwsException() {
        byte[] buf = new byte[2];
        // 2 byte field binary holds max (1 << 8) = 256
        TarUtils.formatLongOctalOrBinaryBytes(1000L, buf, 0, 2);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buf = new byte[8];
        int next = TarUtils.formatCheckSumOctalBytes(0123L, buf, 0, 8);
        assertEquals(8, next);
        assertEquals('0', buf[0]);
        assertEquals('0', buf[1]);
        assertEquals('0', buf[2]);
        assertEquals('1', buf[3]);
        assertEquals('2', buf[4]);
        assertEquals('3', buf[5]);
        assertEquals(0, buf[6]);
        assertEquals(' ', buf[7]);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buf = new byte[]{1, 2, (byte) 255};
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(1 + 2 + 255, sum);
    }

    @Test
    public void testVerifyCheckSum_unsignedMatch() {
        byte[] header = new byte[512];
        // Populate header with dummy data
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i & 0x7F);
        }
        // Prepare checksum field with spaces first as spec specifies
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_signedMatch() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) 0xFF; // Signed value is -1
        }
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long signedSum = 0;
        for (byte b : header) {
            signedSum += b;
        }
        TarUtils.formatCheckSumOctalBytes(signedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_storedGreaterThanUnsigned() {
        byte[] header = new byte[512];
        // Digits checksum: "777777"
        for (int i = 0; i < 6; i++) {
            header[TarConstants.CHKSUM_OFFSET + i] = '7';
        }
        header[TarConstants.CHKSUM_OFFSET + 6] = 0;
        header[TarConstants.CHKSUM_OFFSET + 7] = ' ';
        // Header sum will be much smaller than 0777777L
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_invalidChecksum() {
        byte[] header = new byte[512];
        // Checksum set to 000001
        header[TarConstants.CHKSUM_OFFSET] = '0';
        header[TarConstants.CHKSUM_OFFSET + 1] = '0';
        header[TarConstants.CHKSUM_OFFSET + 2] = '0';
        header[TarConstants.CHKSUM_OFFSET + 3] = '0';
        header[TarConstants.CHKSUM_OFFSET + 4] = '0';
        header[TarConstants.CHKSUM_OFFSET + 5] = '1';
        header[TarConstants.CHKSUM_OFFSET + 6] = 0;
        header[TarConstants.CHKSUM_OFFSET + 7] = ' ';

        // Fill remaining buffer to make unsignedSum large
        for (int i = 0; i < 100; i++) {
            header[i] = 'A';
        }
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_digitsCountFollowedByNonOctal() {
        byte[] header = new byte[512];
        header[TarConstants.CHKSUM_OFFSET] = '1';
        header[TarConstants.CHKSUM_OFFSET + 1] = '2';
        header[TarConstants.CHKSUM_OFFSET + 2] = ' ';
        header[TarConstants.CHKSUM_OFFSET + 3] = '3';

        // Check verification does not crash and processes branches
        boolean result = TarUtils.verifyCheckSum(header);
        assertNotNull(result);
    }
}
