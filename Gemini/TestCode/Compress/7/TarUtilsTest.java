package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TarUtilsTest {

    @Test
    public void testConstructor_privateInstantiation() throws Exception {
        Constructor<TarUtils> constructor = TarUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        TarUtils instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testParseOctal_validStandardValue_returnsParsedLong() {
        byte[] buffer = "0755".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0755L, result);
    }

    @Test
    public void testParseOctal_withLeadingSpacesAndZeros_returnsParsedLong() {
        byte[] buffer = "  000755".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0755L, result);
    }

    @Test
    public void testParseOctal_withTrailingSpace_stopsParsing() {
        byte[] buffer = "755 123".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0755L, result);
    }

    @Test
    public void testParseOctal_withTrailingNull_stopsParsing() {
        byte[] buffer = new byte[]{'7', '5', '5', 0, '1', '2'};
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0755L, result);
    }

    @Test
    public void testParseOctal_allLeadingSpacesAndZerosOnly_returnsZero() {
        byte[] buffer = "   0000".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_emptyRange_returnsZero() {
        byte[] buffer = new byte[10];
        long result = TarUtils.parseOctal(buffer, 2, 0);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_withOffsetAndLength_returnsCorrectValue() {
        byte[] buffer = "XX0644YY".getBytes();
        long result = TarUtils.parseOctal(buffer, 2, 4);
        Assert.assertEquals(0644L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidCharacterBelowZero_throwsException() {
        byte[] buffer = "07/5".getBytes(); // '/' is ASCII 47 (one below '0')
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidOctalDigitAboveSeven_throwsException() {
        byte[] buffer = "0785".getBytes(); // '8' is not an octal digit
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidLetter_throwsException() {
        byte[] buffer = "12A3".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseName_standardName_returnsFullString() {
        byte[] buffer = "testfile.txt".getBytes();
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("testfile.txt", result);
    }

    @Test
    public void testParseName_withNullTerminator_stopsAtFirstNull() {
        byte[] buffer = new byte[]{'a', 'b', 'c', 0, 'd', 'e'};
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("abc", result);
    }

    @Test
    public void testParseName_withOffsetAndLength_returnsSubString() {
        byte[] buffer = "PREFIX_filename.tar_SUFFIX".getBytes();
        String result = TarUtils.parseName(buffer, 7, 12);
        Assert.assertEquals("filename.tar", result);
    }

    @Test
    public void testParseName_emptyBuffer_returnsEmptyString() {
        byte[] buffer = new byte[5];
        String result = TarUtils.parseName(buffer, 0, 5);
        Assert.assertEquals("", result);
    }

    @Test
    public void testParseName_zeroLength_returnsEmptyString() {
        byte[] buffer = "filename.txt".getBytes();
        String result = TarUtils.parseName(buffer, 0, 0);
        Assert.assertEquals("", result);
    }

    @Test
    public void testFormatNameBytes_shorterName_padsRemainingWithNull() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatNameBytes("abc", buffer, 0, 6);
        Assert.assertEquals(6, endOffset);
        Assert.assertEquals('a', buffer[0]);
        Assert.assertEquals('b', buffer[1]);
        Assert.assertEquals('c', buffer[2]);
        Assert.assertEquals(0, buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals(0, buffer[6]); // unmodified
    }

    @Test
    public void testFormatNameBytes_longerName_truncatesToLength() {
        byte[] buffer = new byte[5];
        int endOffset = TarUtils.formatNameBytes("abcdefgh", buffer, 0, 5);
        Assert.assertEquals(5, endOffset);
        Assert.assertEquals("abcde", new String(buffer, 0, 5));
    }

    @Test
    public void testFormatNameBytes_withOffset_writesToCorrectPosition() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatNameBytes("hi", buffer, 3, 4);
        Assert.assertEquals(7, endOffset);
        Assert.assertEquals(0, buffer[2]);
        Assert.assertEquals('h', buffer[3]);
        Assert.assertEquals('i', buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void testFormatUnsignedOctalString_zeroValue_fillsWithLeadingZeros() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        Assert.assertEquals("0000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalString_positiveValue_formatsCorrectly() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(0755L, buffer, 0, 6);
        Assert.assertEquals("000755", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalString_withOffset_formatsCorrectly() {
        byte[] buffer = new byte[8];
        TarUtils.formatUnsignedOctalString(0644L, buffer, 2, 5);
        Assert.assertEquals("00644", new String(buffer, 2, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueDoesNotFit_throwsException() {
        byte[] buffer = new byte[2];
        // 0755 in octal requires 3 digits ("755"), will not fit in 2 bytes
        TarUtils.formatUnsignedOctalString(0755L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes_validValue_appendsSpaceAndNull() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatOctalBytes(0755L, buffer, 0, 8);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals("0000755 \0", new String(buffer, 0, 8));
    }

    @Test
    public void testFormatOctalBytes_withOffset_writesToCorrectPosition() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatOctalBytes(0123L, buffer, 2, 6);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals("0123 \0", new String(buffer, 2, 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_valueTooLarge_throwsException() {
        byte[] buffer = new byte[4];
        // 4 bytes - 2 for space and null leaves 2 digits. 0755 requires 3 digits.
        TarUtils.formatOctalBytes(0755L, buffer, 0, 4);
    }

    @Test
    public void testFormatLongOctalBytes_validValue_appendsSpace() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatLongOctalBytes(0755L, buffer, 0, 8);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals("0000755 ", new String(buffer, 0, 8));
    }

    @Test
    public void testFormatLongOctalBytes_withOffset_writesToCorrectPosition() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatLongOctalBytes(0777L, buffer, 1, 6);
        Assert.assertEquals(7, endOffset);
        Assert.assertEquals("00777 ", new String(buffer, 1, 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_valueTooLarge_throwsException() {
        byte[] buffer = new byte[3];
        // 3 bytes - 1 for space leaves 2 digits. 0755 requires 3 digits.
        TarUtils.formatLongOctalBytes(0755L, buffer, 0, 3);
    }

    @Test
    public void testFormatCheckSumOctalBytes_validValue_appendsNullAndSpace() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatCheckSumOctalBytes(0755L, buffer, 0, 8);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals("0000755\0 ", new String(buffer, 0, 8));
    }

    @Test
    public void testFormatCheckSumOctalBytes_withOffset_writesToCorrectPosition() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatCheckSumOctalBytes(0123L, buffer, 1, 6);
        Assert.assertEquals(7, endOffset);
        Assert.assertEquals("0123\0 ", new String(buffer, 1, 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytes_valueTooLarge_throwsException() {
        byte[] buffer = new byte[3];
        // 3 bytes - 2 for null and space leaves 1 digit. 0755 requires 3 digits.
        TarUtils.formatCheckSumOctalBytes(0755L, buffer, 0, 3);
    }

    @Test
    public void testComputeCheckSum_emptyArray_returnsZero() {
        byte[] buffer = new byte[0];
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(0L, sum);
    }

    @Test
    public void testComputeCheckSum_positiveBytes_calculatesCorrectSum() {
        byte[] buffer = new byte[]{1, 2, 3, 4, 5};
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(15L, sum);
    }

    @Test
    public void testComputeCheckSum_treatsBytesAsUnsigned() {
        byte[] buffer = new byte[]{(byte) 0xFF, (byte) 0x80, 1};
        // 0xFF -> 255, 0x80 -> 128, 1 -> 1. Total = 384
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(384L, sum);
    }

    @Test
    public void testParseOctalAndFormatRoundTrip() {
        byte[] buffer = new byte[12];
        long originalValue = 01234567L;
        TarUtils.formatOctalBytes(originalValue, buffer, 0, buffer.length);
        long parsedValue = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(originalValue, parsedValue);
    }
}
