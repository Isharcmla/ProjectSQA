package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<TarUtils> constructor = TarUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            TarUtils instance = constructor.newInstance();
            org.junit.Assert.assertNotNull(instance);
        } catch (InvocationTargetException e) {
            // In case constructor is explicitly private
        }
    }

    @Test
    public void testParseOctal_normal() {
        byte[] buffer = "0000755 \0".getBytes(StandardCharsets.UTF_8);
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0755L, value);
    }

    @Test
    public void testParseOctal_leadingSpacesAndTrailingNull() {
        byte[] buffer = "   123 \0".getBytes(StandardCharsets.UTF_8);
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0123L, value);
    }

    @Test
    public void testParseOctal_leadingNullReturnsZero() {
        byte[] buffer = new byte[]{0, '7', '5', '5', ' '};
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, value);
    }

    @Test
    public void testParseOctal_allSpacesReturnsZero() {
        byte[] buffer = "        ".getBytes(StandardCharsets.UTF_8);
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwoThrowsException() {
        byte[] buffer = "0".getBytes(StandardCharsets.UTF_8);
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidCharThrowsException() {
        byte[] buffer = "0000855 \0".getBytes(StandardCharsets.UTF_8);
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_embeddedNullOrInvalid() {
        byte[] buffer = "000a755 \0".getBytes(StandardCharsets.UTF_8);
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBoolean() {
        byte[] buffer = new byte[]{0, 1, 2, (byte) 0xff};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
        assertTrue(TarUtils.parseBoolean(buffer, 1));
        assertFalse(TarUtils.parseBoolean(buffer, 2));
        assertFalse(TarUtils.parseBoolean(buffer, 3));
    }

    @Test
    public void testParseOctalOrBinary_octalPath() {
        byte[] buffer = "0000755 \0".getBytes(StandardCharsets.UTF_8);
        long value = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(0755L, value);
    }

    @Test
    public void testParseOctalOrBinary_positiveBinarySmall() {
        byte[] buffer = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(0x01020304050607L, buffer, 0, 8);
        long value = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(0x01020304050607L, value);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinarySmall() {
        byte[] buffer = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(-12345L, buffer, 0, 8);
        long value = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(-12345L, value);
    }

    @Test
    public void testParseOctalOrBinary_positiveBinaryBigInteger() {
        byte[] buffer = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(0x0102030405060708L, buffer, 0, 12);
        long value = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(0x0102030405060708L, value);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinaryBigInteger() {
        byte[] buffer = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(-55555555555L, buffer, 0, 12);
        long value = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(-55555555555L, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryExceedsLongMax() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        for (int i = 1; i < 12; i++) {
            buffer[i] = (byte) 0xff;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, 12);
    }

    @Test
    public void testParseName_withDefaultEncoding() {
        byte[] buffer = new byte[20];
        byte[] nameBytes = "test-file.txt".getBytes(StandardCharsets.UTF_8);
        System.arraycopy(nameBytes, 0, buffer, 0, nameBytes.length);

        String result = TarUtils.parseName(buffer, 0, 20);
        assertEquals("test-file.txt", result);
    }

    @Test
    public void testParseName_emptyBuffer() {
        byte[] buffer = new byte[10];
        String result = TarUtils.parseName(buffer, 0, 10);
        assertEquals("", result);
    }

    @Test
    public void testParseName_withCustomZipEncoding() throws IOException {
        ZipEncoding encoding = ZipEncodingHelper.getZipEncoding("UTF-8");
        byte[] buffer = new byte[20];
        byte[] nameBytes = "foo/bar.txt".getBytes(StandardCharsets.UTF_8);
        System.arraycopy(nameBytes, 0, buffer, 0, nameBytes.length);

        String result = TarUtils.parseName(buffer, 0, 20, encoding);
        assertEquals("foo/bar.txt", result);
    }

    @Test
    public void testFormatNameBytes_simple() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatNameBytes("hello", buffer, 0, 10);
        assertEquals(10, endOffset);
        assertEquals("hello\0\0\0\0\0", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testFormatNameBytes_truncated() {
        byte[] buffer = new byte[5];
        int endOffset = TarUtils.formatNameBytes("longfilename", buffer, 0, 5);
        assertEquals(5, endOffset);
        assertEquals("longf", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testFormatNameBytes_withCustomZipEncoding() throws IOException {
        ZipEncoding encoding = ZipEncodingHelper.getZipEncoding("UTF-8");
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatNameBytes("file", buffer, 2, 6, encoding);
        assertEquals(8, endOffset);
        assertEquals("file\0\0", new String(buffer, 2, 6, StandardCharsets.UTF_8));
    }

    @Test
    public void testFormatUnsignedOctalString_zero() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 6);
        assertEquals("000000", new String(buffer, StandardCharsets.UTF_8));
    }

    @Test
    public void testFormatUnsignedOctalString_normal() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(0755, buffer, 0, 6);
        assertEquals("000755", new String(buffer, StandardCharsets.UTF_8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_overflow() {
        byte[] buffer = new byte[3];
        TarUtils.formatUnsignedOctalString(0777777L, buffer, 0, 3);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buffer = new byte[8];
        int offset = TarUtils.formatOctalBytes(0755, buffer, 0, 8);
        assertEquals(8, offset);
        assertEquals("0000755 \0", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int offset = TarUtils.formatLongOctalBytes(0755, buffer, 0, 8);
        assertEquals(8, offset);
        assertEquals("0000755 ", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_fitsInOctal() {
        byte[] buffer = new byte[8];
        int offset = TarUtils.formatLongOctalOrBinaryBytes(0755, buffer, 0, 8);
        assertEquals(8, offset);
        assertEquals("0000755 ", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_positiveExceedsOctalSmall() {
        byte[] buffer = new byte[8];
        long value = 0x01020304050607L;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 8);
        assertEquals(8, offset);
        assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_positiveExceedsOctalLarge() {
        byte[] buffer = new byte[12];
        long value = 0x0102030405060708L;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12);
        assertEquals(12, offset);
        assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeSmall() {
        byte[] buffer = new byte[8];
        long value = -12345L;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 8);
        assertEquals(8, offset);
        assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeLarge() {
        byte[] buffer = new byte[12];
        long value = -55555555555L;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12);
        assertEquals(12, offset);
        assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        assertEquals(value, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongBinary_tooLargeThrows() {
        byte[] buffer = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(0x10000L, buffer, 0, 2);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buffer = new byte[8];
        int offset = TarUtils.formatCheckSumOctalBytes(0755, buffer, 0, 8);
        assertEquals(8, offset);
        assertEquals("000755\0 ", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[]{1, 2, 3, 4, (byte) 255};
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(1 + 2 + 3 + 4 + 255, sum);
    }

    @Test
    public void testVerifyCheckSum_validHeader() {
        byte[] header = new byte[512];
        for (int i = 0; i < 512; i++) {
            header[i] = (byte) (i & 0x7f);
        }
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_invalidHeader() {
        byte[] header = new byte[512];
        TarUtils.formatCheckSumOctalBytes(1234, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_signedCompatibility() {
        byte[] header = new byte[512];
        header[0] = (byte) 0x80;
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
    public void testVerifyCheckSum_trailerSpaceDigitsBranches() {
        byte[] header = new byte[512];
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        header[TarConstants.CHKSUM_OFFSET] = '1';
        header[TarConstants.CHKSUM_OFFSET + 1] = '2';
        header[TarConstants.CHKSUM_OFFSET + 2] = '3';
        header[TarConstants.CHKSUM_OFFSET + 3] = '4';
        header[TarConstants.CHKSUM_OFFSET + 4] = ' ';
        header[TarConstants.CHKSUM_OFFSET + 5] = '5';
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testFallbackEncodingDirectly() {
        ZipEncoding fallback = TarUtils.FALLBACK_ENCODING;
        assertTrue(fallback.canEncode("test"));

        ByteBuffer buf = fallback.encode("test");
        assertEquals(4, buf.remaining());
        assertEquals('t', buf.get());

        byte[] raw = new byte[]{'h', 'e', 'l', 'l', 'o', 0, 'x'};
        assertEquals("hello", fallback.decode(raw));
    }
}
