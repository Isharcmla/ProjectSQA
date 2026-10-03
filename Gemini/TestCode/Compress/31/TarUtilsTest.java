package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testParseOctal_validValues() {
        byte[] buffer = " 0755 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0755L, result);

        buffer = "1234567\0".getBytes();
        result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(01234567L, result);

        buffer = "   0   ".getBytes();
        result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);

        // All spaces after trimming trailing spaces
        buffer = "     ".getBytes();
        result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_leadingNull() {
        byte[] buffer = new byte[] {0, '7', '5', '5', ' '};
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_embeddedNull() {
        byte[] buffer = new byte[] {'7', '5', 0, '5', ' '};
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(075L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buffer = new byte[] {'7'};
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidCharBelowZero_throwsException() {
        byte[] buffer = " /123 \0".getBytes(); // '/' is before '0' in ASCII
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidCharAboveSeven_throwsException() {
        byte[] buffer = " 8123 \0".getBytes(); // '8' is invalid octal
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidCharLetter_throwsException() {
        byte[] buffer = " 12a3 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinary_octalValues() {
        byte[] buffer = " 0755 \0".getBytes();
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(0755L, result);
    }

    @Test
    public void testParseOctalOrBinary_positiveBinaryLong() {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0x80;
        buffer[7] = 0x01;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(1L, result);

        buffer = new byte[8];
        buffer[0] = (byte) 0x80;
        buffer[6] = 0x01;
        buffer[7] = 0x02;
        result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(0x0102L, result);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinaryLong() {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0xff;
        buffer[1] = (byte) 0xff;
        buffer[2] = (byte) 0xff;
        buffer[3] = (byte) 0xff;
        buffer[4] = (byte) 0xff;
        buffer[5] = (byte) 0xff;
        buffer[6] = (byte) 0xff;
        buffer[7] = (byte) 0xfe;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(-2L, result);

        buffer = new byte[4];
        buffer[0] = (byte) 0xff;
        buffer[1] = (byte) 0xff;
        buffer[2] = (byte) 0xff;
        buffer[3] = (byte) 0xff;
        result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
        assertEquals(-1L, result);
    }

    @Test
    public void testParseOctalOrBinary_positiveBinaryBigInteger() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[10] = 0x01;
        buffer[11] = 0x00;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(256L, result);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinaryBigInteger() {
        byte[] buffer = new byte[12];
        Arrays.fill(buffer, (byte) 0xff);
        buffer[11] = (byte) 0xfe;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(-2L, result);

        Arrays.fill(buffer, (byte) 0xff);
        result = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(-1L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_bigIntegerOverflow_throwsException() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[1] = (byte) 0x7f; // Sets a high bit exceeding 63 bits
        TarUtils.parseOctalOrBinary(buffer, 0, 12);
    }

    @Test
    public void testParseBoolean() {
        byte[] buffer = new byte[] {0, 1, 2, (byte) 0xff};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
        assertTrue(TarUtils.parseBoolean(buffer, 1));
        assertFalse(TarUtils.parseBoolean(buffer, 2));
        assertFalse(TarUtils.parseBoolean(buffer, 3));
    }

    @Test
    public void testParseName_defaultEncoding() {
        byte[] buffer = new byte[] {'t', 'e', 's', 't', 0, 0};
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("test", name);

        buffer = new byte[] {0, 0, 0};
        name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("", name);

        buffer = new byte[] {'a', 'b', 'c'};
        name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("abc", name);
    }

    @Test
    public void testParseName_customEncoding() throws IOException {
        ZipEncoding encoding = ZipEncodingHelper.getZipEncoding("UTF-8");
        byte[] buffer = new byte[] {'h', 'e', 'l', 'l', 'o', 0};
        String name = TarUtils.parseName(buffer, 0, buffer.length, encoding);
        assertEquals("hello", name);

        buffer = new byte[] {0, 0};
        name = TarUtils.parseName(buffer, 0, buffer.length, encoding);
        assertEquals("", name);
    }

    @Test
    public void testFormatNameBytes_defaultEncoding() {
        byte[] buf = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("hello", buf, 0, 10);
        assertEquals(10, nextOffset);
        assertEquals("hello\0\0\0\0\0", new String(buf));

        // Truncate long name
        buf = new byte[4];
        nextOffset = TarUtils.formatNameBytes("testing", buf, 0, 4);
        assertEquals(4, nextOffset);
        assertEquals("test", new String(buf));
    }

    @Test
    public void testFormatNameBytes_customEncoding() throws IOException {
        ZipEncoding encoding = ZipEncodingHelper.getZipEncoding("UTF-8");
        byte[] buf = new byte[6];
        int nextOffset = TarUtils.formatNameBytes("abc", buf, 0, 6, encoding);
        assertEquals(6, nextOffset);
        assertEquals((byte) 'a', buf[0]);
        assertEquals((byte) 'b', buf[1]);
        assertEquals((byte) 'c', buf[2]);
        assertEquals((byte) 0, buf[3]);
        assertEquals((byte) 0, buf[4]);
        assertEquals((byte) 0, buf[5]);
    }

    @Test
    public void testFormatUnsignedOctalString_zero() {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 5);
        assertEquals("00000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalString_nonZero() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(0755L, buffer, 0, 6);
        assertEquals("000755", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_overflow_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(07777L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(0755L, buf, 0, 8);
        assertEquals(8, nextOffset);
        assertEquals((byte) '0', buf[0]);
        assertEquals((byte) '0', buf[1]);
        assertEquals((byte) '0', buf[2]);
        assertEquals((byte) '7', buf[3]);
        assertEquals((byte) '5', buf[4]);
        assertEquals((byte) '5', buf[5]);
        assertEquals((byte) ' ', buf[6]);
        assertEquals((byte) 0, buf[7]);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[6];
        int nextOffset = TarUtils.formatLongOctalBytes(0755L, buf, 0, 6);
        assertEquals(6, nextOffset);
        assertEquals((byte) '0', buf[0]);
        assertEquals((byte) '0', buf[1]);
        assertEquals((byte) '7', buf[2]);
        assertEquals((byte) '5', buf[3]);
        assertEquals((byte) '5', buf[4]);
        assertEquals((byte) ' ', buf[5]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_octalBranch() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(0755L, buf, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, nextOffset);
        assertEquals((byte) '0', buf[0]);
        assertEquals((byte) ' ', buf[TarConstants.UIDLEN - 1]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_positiveBinaryLong() {
        byte[] buf = new byte[8];
        long value = TarConstants.MAXID + 10L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals(8, nextOffset);
        assertEquals((byte) 0x80, buf[0]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeBinaryLong() {
        byte[] buf = new byte[8];
        long value = -12345L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals(8, nextOffset);
        assertEquals((byte) 0xff, buf[0]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 8);
        assertEquals(value, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_longBinaryTooLarge_throwsException() {
        byte[] buf = new byte[4]; // max 3 bytes for value (1 << 24)
        long tooBig = 1L << 25;
        TarUtils.formatLongOctalOrBinaryBytes(tooBig, buf, 0, 4);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_positiveBinaryBigInteger() {
        byte[] buf = new byte[12];
        long value = TarConstants.MAXSIZE + 10L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        assertEquals(12, nextOffset);
        assertEquals((byte) 0x80, buf[0]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 12);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeBinaryBigInteger() {
        byte[] buf = new byte[12];
        long value = -987654321L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12);
        assertEquals(12, nextOffset);
        assertEquals((byte) 0xff, buf[0]);
        long parsed = TarUtils.parseOctalOrBinary(buf, 0, 12);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buf = new byte[8];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(0123L, buf, 0, 8);
        assertEquals(8, nextOffset);
        assertEquals((byte) '0', buf[0]);
        assertEquals((byte) '0', buf[1]);
        assertEquals((byte) '0', buf[2]);
        assertEquals((byte) '1', buf[3]);
        assertEquals((byte) '2', buf[4]);
        assertEquals((byte) '3', buf[5]);
        assertEquals((byte) 0, buf[6]);
        assertEquals((byte) ' ', buf[7]);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buf = new byte[] {1, 2, 3, (byte) 255};
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(1 + 2 + 3 + 255, sum);
    }

    @Test
    public void testVerifyCheckSum_validUnsigned() {
        byte[] header = new byte[512];
        Arrays.fill(header, (byte) 'a');
        // Clear checksum field to spaces to compute checksum
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long cs = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(cs, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_validSigned() {
        byte[] header = new byte[512];
        Arrays.fill(header, (byte) 0xff); // negative bytes in signed interpretation
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }

        long signedSum = 0;
        for (byte b : header) {
            signedSum += b;
        }

        // Put signed sum into checksum field if positive
        if (signedSum > 0) {
            TarUtils.formatCheckSumOctalBytes(signedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
            assertTrue(TarUtils.verifyCheckSum(header));
        } else {
            // Form a header that results in matching signedSum
            Arrays.fill(header, 0, 200, (byte) 100);
            Arrays.fill(header, 200, 512, (byte) -50);
            for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
                header[i] = ' ';
            }
            signedSum = 0;
            for (byte b : header) {
                signedSum += b;
            }
            TarUtils.formatCheckSumOctalBytes(signedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
            assertTrue(TarUtils.verifyCheckSum(header));
        }
    }

    @Test
    public void testVerifyCheckSum_storedSumGreaterThanUnsigned() {
        byte[] header = new byte[512];
        // Empty header with large checksum
        TarUtils.formatCheckSumOctalBytes(10000L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_invalid() {
        byte[] header = new byte[512];
        Arrays.fill(header, (byte) 'a');
        TarUtils.formatCheckSumOctalBytes(123L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_checksumWithNonOctalSequence() {
        byte[] header = new byte[512];
        Arrays.fill(header, (byte) 0);
        // Put non-octal chars after valid octal chars in checksum range
        header[TarConstants.CHKSUM_OFFSET] = '1';
        header[TarConstants.CHKSUM_OFFSET + 1] = '2';
        header[TarConstants.CHKSUM_OFFSET + 2] = 'x'; // digits > 0, branches to digits = 6
        header[TarConstants.CHKSUM_OFFSET + 3] = '3';

        // Stored sum will be 012 = 10L, unsigned sum is spaces for checksum area (8 * 32 = 256)
        // Stored sum (10) < unsigned sum (256), not matching signed sum -> returns false
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testFallbackEncoding() {
        ZipEncoding fallback = TarUtils.FALLBACK_ENCODING;
        assertTrue(fallback.canEncode("test"));

        ByteBuffer buf = fallback.encode("ABC\u00FF");
        assertEquals(4, buf.remaining());
        assertEquals((byte) 'A', buf.get());
        assertEquals((byte) 'B', buf.get());
        assertEquals((byte) 'C', buf.get());
        assertEquals((byte) 0xFF, buf.get());

        byte[] decodeBuf = new byte[] {'A', 'B', (byte) 0xFF, 0, 'C'};
        String decoded = fallback.decode(decodeBuf);
        assertEquals(3, decoded.length());
        assertEquals('A', decoded.charAt(0));
        assertEquals('B', decoded.charAt(1));
        assertEquals((char) 255, decoded.charAt(2));
    }

    @Test
    public void testRoundTripNamesAndNumbers() {
        byte[] buffer = new byte[512];
        TarUtils.formatNameBytes("some/path/file.txt", buffer, 0, 100);
        String parsedName = TarUtils.parseName(buffer, 0, 100);
        assertEquals("some/path/file.txt", parsedName);

        TarUtils.formatLongOctalOrBinaryBytes(1234567890L, buffer, 100, 12);
        long parsedNumber = TarUtils.parseOctalOrBinary(buffer, 100, 12);
        assertEquals(1234567890L, parsedNumber);

        TarUtils.formatLongOctalOrBinaryBytes(-1234567890L, buffer, 112, 12);
        long parsedNegative = TarUtils.parseOctalOrBinary(buffer, 112, 12);
        assertEquals(-1234567890L, parsedNegative);
    }
}
