import org.junit.Test;
import org.junit.Assert;

public class TarUtilsTest {

    // ---------- parseOctal tests ----------

    @Test
    public void testParseOctal_normalValue_returnsCorrectLong() {
        byte[] buffer = "0000755 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0755, result);
    }

    @Test
    public void testParseOctal_allZeroBytes_returnsZero() {
        byte[] buffer = new byte[8];
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_leadingSpaces_parsesCorrectly() {
        byte[] buffer = "   123 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0123, result);
    }

    @Test
    public void testParseOctal_trailingSpaceBreaksLoop_returnsCorrectValue() {
        byte[] buffer = "123 456\0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0123, result);
    }

    @Test
    public void testParseOctal_allSpaces_returnsZero() {
        byte[] buffer = "        ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByte_throwsIllegalArgumentException() {
        byte[] buffer = "12a9 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctal_zerosOnly_returnsZero() {
        byte[] buffer = "0000000\0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_offsetInMiddleOfBuffer_parsesCorrectly() {
        byte[] buffer = "XX0755 \0YY".getBytes();
        long result = TarUtils.parseOctal(buffer, 2, 8);
        Assert.assertEquals(0755, result);
    }

    // ---------- parseName tests ----------

    @Test
    public void testParseName_normalString_returnsCorrectName() {
        byte[] buffer = "hello\0\0\0".getBytes();
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("hello", result);
    }

    @Test
    public void testParseName_emptyStringAllNull_returnsEmptyString() {
        byte[] buffer = new byte[5];
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("", result);
    }

    @Test
    public void testParseName_noNullTerminator_returnsFullLengthString() {
        byte[] buffer = "abcde".getBytes();
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("abcde", result);
    }

    @Test
    public void testParseName_offsetInMiddle_returnsCorrectSubstring() {
        byte[] buffer = "XXnameYY\0".getBytes();
        String result = TarUtils.parseName(buffer, 2, 6);
        Assert.assertEquals("nameYY", result);
    }

    // ---------- formatNameBytes tests ----------

    @Test
    public void testFormatNameBytes_nameShorterThanLength_padsWithNul() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 10);
        Assert.assertEquals(10, newOffset);
        Assert.assertEquals('a', buf[0]);
        Assert.assertEquals('b', buf[1]);
        Assert.assertEquals('c', buf[2]);
        Assert.assertEquals(0, buf[3]);
        Assert.assertEquals(0, buf[9]);
    }

    @Test
    public void testFormatNameBytes_nameLongerThanLength_truncates() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("abcdef", buf, 0, 3);
        Assert.assertEquals(3, newOffset);
        Assert.assertEquals('a', buf[0]);
        Assert.assertEquals('b', buf[1]);
        Assert.assertEquals('c', buf[2]);
    }

    @Test
    public void testFormatNameBytes_emptyName_fillsAllNul() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("", buf, 0, 5);
        Assert.assertEquals(5, newOffset);
        for (byte b : buf) {
            Assert.assertEquals(0, b);
        }
    }

    @Test
    public void testFormatNameBytes_exactLength_copiesAllChars() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("xyz", buf, 0, 3);
        Assert.assertEquals(3, newOffset);
        Assert.assertEquals('x', buf[0]);
        Assert.assertEquals('y', buf[1]);
        Assert.assertEquals('z', buf[2]);
    }

    // ---------- formatUnsignedOctalString tests ----------

    @Test
    public void testFormatUnsignedOctalString_valueZero_fillsWithZeros() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 6);
        Assert.assertEquals("000000", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalString_normalValue_returnsOctalRepresentation() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, 6);
        Assert.assertEquals("000010", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalString_boundaryFit_exactLength() {
        byte[] buf = new byte[3];
        // octal 777 = decimal 511, fits exactly in 3 chars
        TarUtils.formatUnsignedOctalString(511L, buf, 0, 3);
        Assert.assertEquals("777", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge_throwsIllegalArgumentException() {
        byte[] buf = new byte[2];
        TarUtils.formatUnsignedOctalString(512L, buf, 0, 2); // needs 3 octal digits
    }

    @Test
    public void testFormatUnsignedOctalString_withOffset_writesAtCorrectPosition() {
        byte[] buf = new byte[10];
        TarUtils.formatUnsignedOctalString(8L, buf, 2, 6);
        Assert.assertEquals("000010", new String(buf, 2, 6));
    }

    // ---------- formatOctalBytes tests ----------

    @Test
    public void testFormatOctalBytes_normalValue_writesOctalSpaceNull() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("000010", new String(buf, 0, 6));
        Assert.assertEquals(' ', (char) buf[6]);
        Assert.assertEquals(0, buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_valueTooLarge_throwsIllegalArgumentException() {
        byte[] buf = new byte[4];
        TarUtils.formatOctalBytes(999999L, buf, 0, 4);
    }

    @Test
    public void testFormatOctalBytes_valueZero_writesZerosSpaceNull() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(0L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("000000", new String(buf, 0, 6));
        Assert.assertEquals(' ', (char) buf[6]);
        Assert.assertEquals(0, buf[7]);
    }

    // ---------- formatLongOctalBytes tests ----------

    @Test
    public void testFormatLongOctalBytes_normalValue_writesOctalSpace() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("0000010", new String(buf, 0, 7));
        Assert.assertEquals(' ', (char) buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_valueTooLarge_throwsIllegalArgumentException() {
        byte[] buf = new byte[4];
        TarUtils.formatLongOctalBytes(999999L, buf, 0, 4);
    }

    @Test
    public void testFormatLongOctalBytes_valueZero_writesZerosAndSpace() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(0L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("0000000", new String(buf, 0, 7));
        Assert.assertEquals(' ', (char) buf[7]);
    }

    // ---------- formatCheckSumOctalBytes tests ----------

    @Test
    public void testFormatCheckSumOctalBytes_normalValue_writesOctalNullSpace() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("000010", new String(buf, 0, 6));
        Assert.assertEquals(0, buf[6]);
        Assert.assertEquals(' ', (char) buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytes_valueTooLarge_throwsIllegalArgumentException() {
        byte[] buf = new byte[4];
        TarUtils.formatCheckSumOctalBytes(999999L, buf, 0, 4);
    }

    @Test
    public void testFormatCheckSumOctalBytes_valueZero_writesZerosNullSpace() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(0L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("000000", new String(buf, 0, 6));
        Assert.assertEquals(0, buf[6]);
        Assert.assertEquals(' ', (char) buf[7]);
    }

    // ---------- computeCheckSum tests ----------

    @Test
    public void testComputeCheckSum_emptyArray_returnsZero() {
        byte[] buf = new byte[0];
        long result = TarUtils.computeCheckSum(buf);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void testComputeCheckSum_normalArray_returnsCorrectSum() {
        byte[] buf = {1, 2, 3, 4};
        long result = TarUtils.computeCheckSum(buf);
        Assert.assertEquals(10L, result);
    }

    @Test
    public void testComputeCheckSum_negativeBytes_appliesByteMaskCorrectly() {
        byte[] buf = {(byte) -1}; // 0xFF -> 255 when masked
        long result = TarUtils.computeCheckSum(buf);
        Assert.assertEquals(255L, result);
    }

    @Test
    public void testComputeCheckSum_allZeroBytes_returnsZero() {
        byte[] buf = new byte[5];
        long result = TarUtils.computeCheckSum(buf);
        Assert.assertEquals(0L, result);
    }
}
