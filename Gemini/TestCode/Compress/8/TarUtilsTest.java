package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testParseOctal_allZeros_returnsZero() {
        byte[] buffer = new byte[8];
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, val);
    }

    @Test
    public void testParseOctal_validOctalWithTrailingSpaceAndNull_returnsParsedValue() {
        byte[] buffer = "  0755 \0".getBytes();
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0755L, val);
    }

    @Test
    public void testParseOctal_onlyLeadingSpacesAndZeros_returnsZero() {
        byte[] buffer = "   000 ".getBytes();
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, val);
    }

    @Test
    public void testParseOctal_withOffsetAndLength_returnsCorrectValue() {
        byte[] buffer = "xxxx0123 \0xxxx".getBytes();
        long val = TarUtils.parseOctal(buffer, 4, 6);
        Assert.assertEquals(0123L, val);
    }

    @Test
    public void testParseOctal_stopsAtTrailingSpaceAfterDigits() {
        byte[] buffer = "0777 999".getBytes();
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0777L, val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidOctalDigitBelowZero_throwsException() {
        byte[] buffer = "012/4 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidOctalDigitAboveSeven_throwsException() {
        byte[] buffer = "0128 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseName_stopsAtNullByte() {
        byte[] buffer = "test/path\0extra".getBytes();
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("test/path", result);
    }

    @Test
    public void testParseName_reachesBufferEndWithoutNull() {
        byte[] buffer = "test/path".getBytes();
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("test/path", result);
    }

    @Test
    public void testParseName_withOffsetAndLength() {
        byte[] buffer = "prefix_test_suffix".getBytes();
        String result = TarUtils.parseName(buffer, 7, 4);
        Assert.assertEquals("test", result);
    }

    @Test
    public void testParseName_emptyBuffer_returnsEmptyString() {
        byte[] buffer = new byte[0];
        String result = TarUtils.parseName(buffer, 0, 0);
        Assert.assertEquals("", result);
    }

    @Test
    public void testParseName_extendedAsciiPreserved() {
        byte[] buffer = new byte[]{(byte) 0xE9, 0};
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals(1, result.length());
        Assert.assertEquals(0xE9, (int) result.charAt(0));
    }

    @Test
    public void testFormatNameBytes_nameShorterThanLength_paddedWithZeros() {
        byte[] buffer = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("file", buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals('f', buffer[0]);
        Assert.assertEquals('i', buffer[1]);
        Assert.assertEquals('l', buffer[2]);
        Assert.assertEquals('e', buffer[3]);
        for (int i = 4; i < 8; i++) {
            Assert.assertEquals(0, buffer[i]);
        }
    }

    @Test
    public void testFormatNameBytes_nameLongerThanLength_truncated() {
        byte[] buffer = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("longfilename", buffer, 2, 4);
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals('l', buffer[2]);
        Assert.assertEquals('o', buffer[3]);
        Assert.assertEquals('n', buffer[4]);
        Assert.assertEquals('g', buffer[5]);
    }

    @Test
    public void testFormatNameBytes_emptyName_allPaddedWithZeros() {
        byte[] buffer = new byte[5];
        int nextOffset = TarUtils.formatNameBytes("", buffer, 0, 5);
        Assert.assertEquals(5, nextOffset);
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(0, buffer[i]);
        }
    }

    @Test
    public void testFormatUnsignedOctalString_zeroValue_paddedWithLeadingZeros() {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 5);
        Assert.assertEquals("00000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalString_positiveValue_paddedWithLeadingZeros() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(0755L, buffer, 0, 6);
        Assert.assertEquals("000755", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLargeForLength_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(0755L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes_validInput_endsInSpaceAndNull() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(0123L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals("0000123 \0", new String(buffer));
    }

    @Test
    public void testFormatOctalBytes_withOffset() {
        byte[] buffer = new byte[12];
        int nextOffset = TarUtils.formatOctalBytes(0777L, buffer, 2, 8);
        Assert.assertEquals(10, nextOffset);
        Assert.assertEquals("0000777 \0", new String(buffer, 2, 8));
    }

    @Test
    public void testFormatLongOctalBytes_validInput_endsInSpace() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(012345L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals("0012345 ", new String(buffer));
    }

    @Test
    public void testFormatLongOctalBytes_withOffset() {
        byte[] buffer = new byte[10];
        int nextOffset = TarUtils.formatLongOctalBytes(077L, buffer, 1, 6);
        Assert.assertEquals(7, nextOffset);
        Assert.assertEquals("00077 ", new String(buffer, 1, 6));
    }

    @Test
    public void testFormatCheckSumOctalBytes_validInput_endsInNullAndSpace() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(0123L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals("0000123\0 ", new String(buffer));
    }

    @Test
    public void testFormatCheckSumOctalBytes_withOffset() {
        byte[] buffer = new byte[10];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(0644L, buffer, 1, 7);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals("00644\0 ", new String(buffer, 1, 7));
    }

    @Test
    public void testComputeCheckSum_emptyBuffer_returnsZero() {
        byte[] buffer = new byte[0];
        long checksum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(0L, checksum);
    }

    @Test
    public void testComputeCheckSum_calculatesUnsignedSumCorrectly() {
        byte[] buffer = new byte[]{(byte) 255, 1, 2, 3};
        long checksum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(255L + 1L + 2L + 3L, checksum);
    }

    @Test
    public void testComputeCheckSum_allZeroBytes_returnsZero() {
        byte[] buffer = new byte[10];
        long checksum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(0L, checksum);
    }
}
