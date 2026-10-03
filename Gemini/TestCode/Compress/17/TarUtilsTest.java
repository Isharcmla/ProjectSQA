package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class TarUtilsTest {

    @Test
    public void testConstructor_instantiation_success() throws Exception {
        Constructor<TarUtils> constructor = TarUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        TarUtils instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testParseOctal_normalValue_success() {
        byte[] buffer = " 012345 \0".getBytes();
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(012345L, val);
    }

    @Test
    public void testParseOctal_withLeadingSpaces_success() {
        byte[] buffer = "   755 \0".getBytes();
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0755L, val);
    }

    @Test
    public void testParseOctal_allNul_returnsZero() {
        byte[] buffer = new byte[8];
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, val);
    }

    @Test
    public void testParseOctal_leadingNul_returnsZero() {
        byte[] buffer = new byte[]{0, '1', '2', ' ', 0};
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, val);
    }

    @Test
    public void testParseOctal_trailingSpaceOnly_success() {
        byte[] buffer = " 644 ".getBytes();
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0644L, val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buffer = new byte[]{'7'};
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_missingTrailingSpaceOrNul_throwsException() {
        byte[] buffer = "12345678".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidOctalDigit_throwsException() {
        byte[] buffer = " 128 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidCharBeforeZero_throwsException() {
        byte[] buffer = " 12/ \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinary_octal_success() {
        byte[] buffer = " 0755 \0".getBytes();
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(0755L, val);
    }

    @Test
    public void testParseOctalOrBinary_positiveBinaryLong_success() {
        byte[] buffer = new byte[]{(byte) 0x80, 0, 0, 1, 2};
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(258L, val);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinaryLong_success() {
        byte[] buffer = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(-100L, buffer, 0, buffer.length);
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(-100L, val);
    }

    @Test
    public void testParseOctalOrBinary_positiveBinaryBigInteger_success() {
        byte[] buffer = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(0x10000000000L, buffer, 0, buffer.length);
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(0x10000000000L, val);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinaryBigInteger_success() {
        byte[] buffer = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(-0x10000000000L, buffer, 0, buffer.length);
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(-0x10000000000L, val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryBigIntegerOverflow_throwsException() {
        byte[] buffer = new byte[12];
        Arrays.fill(buffer, (byte) 0x7f);
        buffer[0] = (byte) 0x80;
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBoolean_byteIsOne_returnsTrue() {
        byte[] buffer = new byte[]{1, 0};
        Assert.assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBoolean_byteIsZero_returnsFalse() {
        byte[] buffer = new byte[]{0, 1};
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBoolean_byteIsOther_returnsFalse() {
        byte[] buffer = new byte[]{2};
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseName_normal_success() {
        byte[] buffer = "test/path/file.txt\0extra".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("test/path/file.txt", name);
    }

    @Test
    public void testParseName_noTrailingNul_success() {
        byte[] buffer = "test.txt".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("test.txt", name);
    }

    @Test
    public void testParseName_empty_returnsEmptyString() {
        byte[] buffer = new byte[10];
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("", name);
    }

    @Test
    public void testParseName_withEncoding_success() throws IOException {
        byte[] buffer = "test-name\0".getBytes();
        ZipEncoding encoding = ZipEncodingHelper.getZipEncoding("UTF-8");
        String name = TarUtils.parseName(buffer, 0, buffer.length, encoding);
        Assert.assertEquals("test-name", name);
    }

    @Test
    public void testFormatNameBytes_shorterThanBuffer_paddedWithNul() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatNameBytes("file", buffer, 0, 10);
        Assert.assertEquals(10, endOffset);
        Assert.assertEquals('f', buffer[0]);
        Assert.assertEquals('i', buffer[1]);
        Assert.assertEquals('l', buffer[2]);
        Assert.assertEquals('e', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[9]);
    }

    @Test
    public void testFormatNameBytes_longerThanBuffer_truncated() {
        byte[] buffer = new byte[4];
        int endOffset = TarUtils.formatNameBytes("verylongfilename", buffer, 0, 4);
        Assert.assertEquals(4, endOffset);
        Assert.assertEquals("very", new String(buffer));
    }

    @Test
    public void testFormatNameBytes_withCustomEncoding_success() throws IOException {
        byte[] buffer = new byte[10];
        ZipEncoding encoding = ZipEncodingHelper.getZipEncoding("UTF-8");
        int endOffset = TarUtils.formatNameBytes("hello", buffer, 2, 6, encoding);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals('h', buffer[2]);
        Assert.assertEquals('o', buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void testFormatUnsignedOctalString_zero_success() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        Assert.assertEquals("0000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalString_normal_success() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(0755L, buffer, 0, 6);
        Assert.assertEquals("000755", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_overflow_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(012345L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes_normal_success() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatOctalBytes(0755L, buffer, 0, 8);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals("0000755 \0", new String(buffer));
    }

    @Test
    public void testFormatLongOctalBytes_normal_success() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatLongOctalBytes(0755L, buffer, 0, 8);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals("0000755 ", new String(buffer));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_fitsInOctalUid_success() {
        byte[] buffer = new byte[TarConstants.UIDLEN];
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(0755L, buffer, 0, TarConstants.UIDLEN);
        Assert.assertEquals(TarConstants.UIDLEN, endOffset);
        Assert.assertEquals("0000755 ", new String(buffer));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_fitsInOctalSize_success() {
        byte[] buffer = new byte[TarConstants.SIZELEN];
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(0755L, buffer, 0, TarConstants.SIZELEN);
        Assert.assertEquals(TarConstants.SIZELEN, endOffset);
        Assert.assertEquals("00000000755 ", new String(buffer));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryPositiveLengthLessThanNine_success() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(0777777777L, buffer, 0, 8);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(0777777777L, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryNegativeLengthLessThanNine_success() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(-12345L, buffer, 0, 8);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(-12345L, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryPositiveBigInteger_success() {
        byte[] buffer = new byte[12];
        long value = TarConstants.MAXSIZE + 100L;
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12);
        Assert.assertEquals(12, endOffset);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryNegativeBigInteger_success() {
        byte[] buffer = new byte[12];
        long value = -(TarConstants.MAXSIZE + 100L);
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12);
        Assert.assertEquals(12, endOffset);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(value, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_binaryOverflow_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(0x1000000L, buffer, 0, 2);
    }

    @Test
    public void testFormatCheckSumOctalBytes_normal_success() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatCheckSumOctalBytes(0755L, buffer, 0, 8);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals("0000755\0 ", new String(buffer));
    }

    @Test
    public void testComputeCheckSum_allBytes_success() {
        byte[] buffer = new byte[]{1, 2, 3, (byte) 255};
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(1 + 2 + 3 + 255, sum);
    }

    @Test
    public void testVerifyCheckSum_validUnsigned_returnsTrue() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 128);
        }
        TarUtils.formatCheckSumOctalBytes(0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        long sum = 0;
        for (int i = 0; i < header.length; i++) {
            byte b = header[i];
            if (TarConstants.CHKSUM_OFFSET <= i && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                b = ' ';
            }
            sum += 0xff & b;
        }
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        Assert.assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_storedSumGreaterThanUnsigned_returnsTrue() {
        byte[] header = new byte[512];
        TarUtils.formatCheckSumOctalBytes(99999L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        Assert.assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_invalidCheckSum_returnsFalse() {
        byte[] header = new byte[512];
        Arrays.fill(header, (byte) 'A');
        TarUtils.formatCheckSumOctalBytes(10L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        Assert.assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testFallbackEncoding_canEncodeAndDecode_success() {
        Assert.assertTrue(TarUtils.FALLBACK_ENCODING.canEncode("test"));
        ByteBuffer encoded = TarUtils.FALLBACK_ENCODING.encode("abc\u00FF");
        Assert.assertEquals(4, encoded.limit());
        String decoded = TarUtils.FALLBACK_ENCODING.decode(encoded.array());
        Assert.assertEquals("abc\u00FF", decoded);

        byte[] trailingNullBytes = new byte[]{'a', 'b', 0, 'c'};
        String decodedNull = TarUtils.FALLBACK_ENCODING.decode(trailingNullBytes);
        Assert.assertEquals("ab", decodedNull);
    }
}
