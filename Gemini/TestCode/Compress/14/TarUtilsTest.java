package org.apache.commons.compress.archivers.tar;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TarUtilsTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<TarUtils> constructor = TarUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        TarUtils instance = constructor.newInstance();
        org.junit.Assert.assertNotNull(instance);
    }

    @Test
    public void testParseOctal_validOctalWithSpaceAndNullTrailer_success() {
        byte[] buffer = " 0755 \0".getBytes(StandardCharsets.ISO_8859_1);
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(493L, value);
    }

    @Test
    public void testParseOctal_validOctalWithSingleSpaceTrailer_success() {
        byte[] buffer = "123 ".getBytes(StandardCharsets.ISO_8859_1);
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83L, value);
    }

    @Test
    public void testParseOctal_validOctalWithSingleNullTrailer_success() {
        byte[] buffer = new byte[]{'1', '2', '3', 0};
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83L, value);
    }

    @Test
    public void testParseOctal_validOctalWithTwoSpacesTrailer_success() {
        byte[] buffer = "123  ".getBytes(StandardCharsets.ISO_8859_1);
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83L, value);
    }

    @Test
    public void testParseOctal_validOctalWithTwoNullTrailers_success() {
        byte[] buffer = new byte[]{'1', '2', '3', 0, 0};
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83L, value);
    }

    @Test
    public void testParseOctal_allNulls_returnsZero() {
        byte[] buffer = new byte[8];
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buffer = new byte[]{'0'};
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_missingTrailer_throwsException() {
        byte[] buffer = "1234".getBytes(StandardCharsets.ISO_8859_1);
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidDigitAboveSeven_throwsException() {
        byte[] buffer = "08 \0".getBytes(StandardCharsets.ISO_8859_1);
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidDigitBelowZero_throwsException() {
        byte[] buffer = "0/ \0".getBytes(StandardCharsets.ISO_8859_1);
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidCharacterLetter_throwsException() {
        byte[] buffer = "abc \0".getBytes(StandardCharsets.ISO_8859_1);
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinary_positiveOctal_success() {
        byte[] buffer = " 177 \0".getBytes(StandardCharsets.ISO_8859_1);
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(127L, val);
    }

    @Test
    public void testParseOctalOrBinary_binaryFormat_success() {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0x80;
        buffer[1] = 0;
        buffer[2] = 0;
        buffer[3] = 0;
        buffer[4] = 0;
        buffer[5] = 0;
        buffer[6] = 0x01;
        buffer[7] = 0x02;

        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(258L, val);
    }

    @Test
    public void testParseOctalOrBinary_binaryFormatMaxPositiveLong_success() {
        byte[] buffer = new byte[9];
        buffer[0] = (byte) 0x80;
        for (int i = 1; i < 9; i++) {
            buffer[i] = (byte) 0xFF;
        }
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(Long.MAX_VALUE, val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryFormatExceedsMaxLong_throwsException() {
        byte[] buffer = new byte[10];
        buffer[0] = (byte) 0xFF;
        for (int i = 1; i < 10; i++) {
            buffer[i] = (byte) 0xFF;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBoolean_byteIsOne_returnsTrue() {
        byte[] buffer = new byte[]{0, 1, 0};
        assertTrue(TarUtils.parseBoolean(buffer, 1));
    }

    @Test
    public void testParseBoolean_byteIsZero_returnsFalse() {
        byte[] buffer = new byte[]{0, 0, 0};
        assertFalse(TarUtils.parseBoolean(buffer, 1));
    }

    @Test
    public void testParseBoolean_byteIsOtherValue_returnsFalse() {
        byte[] buffer = new byte[]{(byte) 2, (byte) 255};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
        assertFalse(TarUtils.parseBoolean(buffer, 1));
    }

    @Test
    public void testParseName_stopAtNullCharacter_returnsPrefix() {
        byte[] buffer = new byte[]{'h', 'e', 'l', 'l', 'o', 0, 'w', 'o', 'r', 'l', 'd'};
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("hello", name);
    }

    @Test
    public void testParseName_noNullCharacter_returnsFullString() {
        byte[] buffer = new byte[]{'t', 'a', 'r'};
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("tar", name);
    }

    @Test
    public void testParseName_highBytePreserved_success() {
        byte[] buffer = new byte[]{(byte) 0xFF, (byte) 0xFE, 0};
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals(2, name.length());
        assertEquals((char) 255, name.charAt(0));
        assertEquals((char) 254, name.charAt(1));
    }

    @Test
    public void testParseName_withOffsetAndEmptyName_returnsEmpty() {
        byte[] buffer = new byte[]{0, 0, 'a', 'b', 'c'};
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("", name);

        String nameFromOffset = TarUtils.parseName(buffer, 2, 3);
        assertEquals("abc", nameFromOffset);
    }

    @Test
    public void testFormatNameBytes_nameShorterThanLength_paddedWithZeros() {
        byte[] buffer = new byte[8];
        int resultOffset = TarUtils.formatNameBytes("foo", buffer, 1, 6);
        assertEquals(7, resultOffset);

        assertEquals(0, buffer[0]);
        assertEquals('f', (char) buffer[1]);
        assertEquals('o', (char) buffer[2]);
        assertEquals('o', (char) buffer[3]);
        assertEquals(0, buffer[4]);
        assertEquals(0, buffer[5]);
        assertEquals(0, buffer[6]);
        assertEquals(0, buffer[7]);
    }

    @Test
    public void testFormatNameBytes_nameLongerThanLength_truncated() {
        byte[] buffer = new byte[5];
        int resultOffset = TarUtils.formatNameBytes("toolongname", buffer, 0, 5);
        assertEquals(5, resultOffset);
        assertEquals("toolo", new String(buffer, 0, 5, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testFormatUnsignedOctalString_zeroValue_fillsWithLeadingZeros() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        assertEquals("0000", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testFormatUnsignedOctalString_positiveValue_formattedCorrectly() {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(64L, buffer, 0, 5);
        assertEquals("00100", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(64L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes_validValue_formattedWithSpaceAndNull() {
        byte[] buffer = new byte[6];
        int nextOffset = TarUtils.formatOctalBytes(7L, buffer, 0, 6);
        assertEquals(6, nextOffset);
        assertEquals("0007 \0", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testFormatLongOctalBytes_validValue_formattedWithTrailingSpace() {
        byte[] buffer = new byte[5];
        int nextOffset = TarUtils.formatLongOctalBytes(7L, buffer, 0, 5);
        assertEquals(5, nextOffset);
        assertEquals("0007 ", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_uidLengthOctalFit_success() {
        byte[] buffer = new byte[TarConstants.UIDLEN];
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXID, buffer, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, nextOffset);
        assertEquals(' ', (char) buffer[TarConstants.UIDLEN - 1]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_uidLengthBinaryOverflowToBinary_success() {
        byte[] buffer = new byte[TarConstants.UIDLEN];
        long value = TarConstants.MAXID + 1L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, TarConstants.UIDLEN);
        assertEquals(TarConstants.UIDLEN, nextOffset);
        assertEquals(0x80, buffer[0] & 0x80);

        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, TarConstants.UIDLEN);
        assertEquals(value, parsed);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_sizeLengthOctalFit_success() {
        byte[] buffer = new byte[TarConstants.SIZELEN];
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXSIZE, buffer, 0, TarConstants.SIZELEN);
        assertEquals(TarConstants.SIZELEN, nextOffset);
        assertEquals(' ', (char) buffer[TarConstants.SIZELEN - 1]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_sizeLengthBinaryOverflowToBinary_success() {
        byte[] buffer = new byte[TarConstants.SIZELEN];
        long value = TarConstants.MAXSIZE + 1L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, TarConstants.SIZELEN);
        assertEquals(TarConstants.SIZELEN, nextOffset);
        assertEquals(0x80, buffer[0] & 0x80);

        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, TarConstants.SIZELEN);
        assertEquals(value, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_valueTooLargeForLength_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(0x10000L, buffer, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_msbAlreadySetInVal_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(0x8000L, buffer, 0, 2);
    }

    @Test
    public void testFormatCheckSumOctalBytes_validValue_formattedWithNullAndSpace() {
        byte[] buffer = new byte[6];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(7L, buffer, 0, 6);
        assertEquals(6, nextOffset);
        assertEquals("0007\0 ", new String(buffer, StandardCharsets.ISO_8859_1));
    }

    @Test
    public void testComputeCheckSum_emptyBuffer_returnsZero() {
        byte[] buffer = new byte[0];
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(0L, sum);
    }

    @Test
    public void testComputeCheckSum_unsignedHandling_success() {
        byte[] buffer = new byte[]{(byte) 255, 1, 0, (byte) 128};
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(255L + 1L + 0L + 128L, sum);
    }
}
