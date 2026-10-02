package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TarUtilsTest {

    @Test
    public void testParseOctal_validOctal() {
        final byte[] buffer = " 0755 \0".getBytes(StandardCharsets.US_ASCII);
        final long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0755L, result);
    }

    @Test
    public void testParseOctal_leadingNulReturnsZero() {
        final byte[] buffer = new byte[]{0, '7', '5', '5', ' '};
        final long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_allNulsReturnsZero() {
        final byte[] buffer = new byte[5];
        final long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_allSpacesReturnsZero() {
        final byte[] buffer = "     ".getBytes(StandardCharsets.US_ASCII);
        final long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        final byte[] buffer = new byte[]{'7'};
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByte_throwsException() {
        final byte[] buffer = " 0789 \0".getBytes(StandardCharsets.US_ASCII);
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByteBelowZero_throwsException() {
        final byte[] buffer = new byte[]{' ', '/', '7', ' '};
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinary_octalMode() {
        final byte[] buffer = " 0644 \0".getBytes(StandardCharsets.US_ASCII);
        final long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(0644L, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongPositive() {
        final byte[] buffer = new byte[8];
        buffer[0] = (byte) 0x80;
        buffer[4] = 0x01;
        buffer[7] = 0x02;
        final long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(0x00000001000002L, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryLongNegative() {
        final byte[] buffer = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(-12345L, buffer, 0, buffer.length);
        final long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(-12345L, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryBigIntegerPositive() {
        final byte[] buffer = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(0100000000000L, buffer, 0, buffer.length);
        final long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(0100000000000L, result);
    }

    @Test
    public void testParseOctalOrBinary_binaryBigIntegerNegative() {
        final byte[] buffer = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(-9876543210L, buffer, 0, buffer.length);
        final long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(-9876543210L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryBigIntegerOverflow_throwsException() {
        final byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[1] = 0x01;
        buffer[2] = (byte) 0x80;
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBoolean() {
        final byte[] buffer = new byte[]{1, 0, 2};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
        assertFalse(TarUtils.parseBoolean(buffer, 1));
        assertFalse(TarUtils.parseBoolean(buffer, 2));
    }

    @Test
    public void testParseName_defaultEncoding() {
        final byte[] buffer = "test-name\0extra".getBytes(StandardCharsets.US_ASCII);
        final String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("test-name", name);
    }

    @Test
    public void testParseName_allNulsReturnsEmpty() {
        final byte[] buffer = new byte[10];
        final String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("", name);
    }

    @Test
    public void testParseName_withCustomZipEncoding() throws IOException {
        final ZipEncoding utf8Encoding = ZipEncodingHelper.getZipEncoding("UTF-8");
        final byte[] buffer = "custom-entry-name\0".getBytes(StandardCharsets.UTF_8);
        final String name = TarUtils.parseName(buffer, 0, buffer.length, utf8Encoding);
        assertEquals("custom-entry-name", name);
    }

    @Test
    public void testFormatNameBytes_defaultEncoding() {
        final byte[] buffer = new byte[10];
        final int nextOffset = TarUtils.formatNameBytes("hello", buffer, 0, 10);
        assertEquals(10, nextOffset);
        assertEquals("hello", TarUtils.parseName(buffer, 0, 10));
        assertEquals(0, buffer[5]);
        assertEquals(0, buffer[9]);
    }

    @Test
    public void testFormatNameBytes_truncation() {
        final byte[] buffer = new byte[5];
        final int nextOffset = TarUtils.formatNameBytes("toolongname", buffer, 0, 5);
        assertEquals(5, nextOffset);
        assertEquals("toolo", TarUtils.parseName(buffer, 0, 5));
    }

    @Test
    public void testFormatNameBytes_withCustomZipEncoding() throws IOException {
        final ZipEncoding utf8Encoding = ZipEncodingHelper.getZipEncoding("UTF-8");
        final byte[] buffer = new byte[8];
        final int nextOffset = TarUtils.formatNameBytes("abc", buffer, 0, 8, utf8Encoding);
        assertEquals(8, nextOffset);
        assertEquals("abc", TarUtils.parseName(buffer, 0, 8, utf8Encoding));
    }

    @Test
    public void testFormatUnsignedOctalString_zero() {
        final byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        assertEquals("0000", new String(buffer, StandardCharsets.US_ASCII));
    }

    @Test
    public void testFormatUnsignedOctalString_positive() {
        final byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0755L, buffer, 0, 5);
        assertEquals("00755", new String(buffer, StandardCharsets.US_ASCII));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_overflow_throwsException() {
        final byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(07777L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        final byte[] buffer = new byte[8];
        final int nextOffset = TarUtils.formatOctalBytes(0755L, buffer, 0, 8);
        assertEquals(8, nextOffset);
        assertEquals('0', buffer[0]);
        assertEquals('7', buffer[3]);
        assertEquals('5', buffer[4]);
        assertEquals('5', buffer[5]);
        assertEquals(' ', buffer[6]);
        assertEquals(0, buffer[7]);
        assertEquals(0755L, TarUtils.parseOctal(buffer, 0, 8));
    }

    @Test
    public void testFormatLongOctalBytes() {
        final byte[] buffer = new byte[8];
        final int nextOffset = TarUtils.formatLongOctalBytes(0755L, buffer, 0, 8);
        assertEquals(8, nextOffset);
        assertEquals('0', buffer[0]);
        assertEquals('7', buffer[4]);
        assertEquals('5', buffer[5]);
        assertEquals('5', buffer[6]);
        assertEquals(' ', buffer[7]);
        assertEquals(0755L, TarUtils.parseOctal(buffer, 0, 8));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_asOctal() {
        final byte[] buffer = new byte[TarConstants.UIDLEN];
        final int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(0755L, buffer, 0, buffer.length);
        assertEquals(TarConstants.UIDLEN, nextOffset);
        assertEquals(0755L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryLong() {
        final byte[] buffer = new byte[8];
        final long largeValue = 077777770L;
        final int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(largeValue, buffer, 0, buffer.length);
        assertEquals(8, nextOffset);
        assertEquals((byte) 0x80, buffer[0]);
        assertEquals(largeValue, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryLongNegative() {
        final byte[] buffer = new byte[8];
        final long negativeValue = -555L;
        final int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(negativeValue, buffer, 0, buffer.length);
        assertEquals(8, nextOffset);
        assertEquals((byte) 0xff, buffer[0]);
        assertEquals(negativeValue, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryBigInteger() {
        final byte[] buffer = new byte[12];
        final long largeValue = 0777777777777L;
        final int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(largeValue, buffer, 0, buffer.length);
        assertEquals(12, nextOffset);
        assertEquals((byte) 0x80, buffer[0]);
        assertEquals(largeValue, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryBigIntegerNegative() {
        final byte[] buffer = new byte[12];
        final long negativeValue = -1234567890123L;
        final int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(negativeValue, buffer, 0, buffer.length);
        assertEquals(12, nextOffset);
        assertEquals((byte) 0xff, buffer[0]);
        assertEquals(negativeValue, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_valueTooLargeForLength_throwsException() {
        final byte[] buffer = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(100000L, buffer, 0, 2);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        final byte[] buffer = new byte[8];
        final int nextOffset = TarUtils.formatCheckSumOctalBytes(0123L, buffer, 0, 8);
        assertEquals(8, nextOffset);
        assertEquals(0, buffer[6]);
        assertEquals(' ', buffer[7]);
        assertEquals(0123L, TarUtils.parseOctal(buffer, 0, 6));
    }

    @Test
    public void testComputeCheckSum() {
        final byte[] buffer = new byte[]{10, 20, (byte) 200};
        final long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(10 + 20 + 200, sum);
    }

    @Test
    public void testVerifyCheckSum_unsignedMatch() {
        final byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) ('a' + (i % 26));
        }
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        final long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_signedMatch() {
        final byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 2 == 0 ? 0xfe : 0x05);
        }
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }

        long signedSum = 0;
        for (final byte b : header) {
            signedSum += b;
        }

        TarUtils.formatCheckSumOctalBytes(signedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_mismatch() {
        final byte[] header = new byte[512];
        TarUtils.formatCheckSumOctalBytes(12345L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testFallbackEncoding() throws IOException {
        final ZipEncoding fallback = TarUtils.FALLBACK_ENCODING;
        assertTrue(fallback.canEncode("any-string"));

        final ByteBuffer encoded = fallback.encode("test\u00FF");
        Assert.assertNotNull(encoded);
        assertEquals(5, encoded.limit());

        final byte[] decodedBytesWithNul = new byte[]{'a', 'b', 'c', 0, 'd'};
        assertEquals("abc", fallback.decode(decodedBytesWithNul));

        final byte[] decodedBytesWithoutNul = new byte[]{'x', 'y', 'z'};
        assertEquals("xyz", fallback.decode(decodedBytesWithoutNul));
    }
}
