import org.junit.Test;
import org.junit.Assert;

public class TarUtilsTest {

    // ---------- parseOctal ----------

    @Test
    public void testParseOctal_normalValue_returnsCorrectLong() {
        byte[] buffer = "0000644 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(420L, result);
    }

    @Test
    public void testParseOctal_leadingSpaces_ignoredCorrectly() {
        byte[] buffer = "   777 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(511L, result);
    }

    @Test
    public void testParseOctal_allZeros_returnsZero() {
        byte[] buffer = "0000000 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_trailingNul_stopsParsing() {
        byte[] buffer = new byte[]{'1', '2', 0, '3', '4'};
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(10L, result); // 1*8+2 = 10
    }

    @Test
    public void testParseOctal_trailingSpace_stopsParsing() {
        byte[] buffer = new byte[]{'1', '2', ' ', '3', '4'};
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(10L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidDigit_throwsException() {
        byte[] buffer = "89".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctal_emptyLength_returnsZero() {
        byte[] buffer = "1234".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, 0);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_offsetNonZero_parsesCorrectSubstring() {
        byte[] buffer = "xx17 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 2, 4);
        Assert.assertEquals(15L, result); // "17 \0" -> 1*8+7=15
    }

    // ---------- parseName ----------

    @Test
    public void testParseName_normalString_returnsCorrectName() {
        byte[] buffer = "filename.txt\0\0\0".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("filename.txt", name);
    }

    @Test
    public void testParseName_emptyBuffer_returnsEmptyString() {
        byte[] buffer = new byte[0];
        String name = TarUtils.parseName(buffer, 0, 0);
        Assert.assertEquals("", name);
    }

    @Test
    public void testParseName_noNulTerminator_readsFullLength() {
        byte[] buffer = "abcdef".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("abcdef", name);
    }

    @Test
    public void testParseName_nulAtStart_returnsEmptyString() {
        byte[] buffer = new byte[]{0, 'a', 'b', 'c'};
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("", name);
    }

    @Test
    public void testParseName_offsetNonZero_parsesCorrectSubstring() {
        byte[] buffer = "xxhello\0".getBytes();
        String name = TarUtils.parseName(buffer, 2, 6);
        Assert.assertEquals("hello", name);
    }

    // ---------- formatNameBytes ----------

    @Test
    public void testFormatNameBytes_nameShorterThanLength_padsWithNul() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, 10);
        Assert.assertEquals(10, newOffset);
        Assert.assertEquals('a', buf[0]);
        Assert.assertEquals('b', buf[1]);
        Assert.assertEquals('c', buf[2]);
        for (int i = 3; i < 10; i++) {
            Assert.assertEquals(0, buf[i]);
        }
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
    public void testFormatNameBytes_emptyName_fillsWithNul() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("", buf, 0, 5);
        Assert.assertEquals(5, newOffset);
        for (byte b : buf) {
            Assert.assertEquals(0, b);
        }
    }

    @Test
    public void testFormatNameBytes_offsetNonZero_writesAtOffset() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("ab", buf, 3, 4);
        Assert.assertEquals(7, newOffset);
        Assert.assertEquals('a', buf[3]);
        Assert.assertEquals('b', buf[4]);
        Assert.assertEquals(0, buf[5]);
        Assert.assertEquals(0, buf[6]);
    }

    // ---------- formatUnsignedOctalString ----------

    @Test
    public void testFormatUnsignedOctalString_zeroValue_fillsWithZeros() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 6);
        Assert.assertEquals("000000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalString_normalValue_returnsCorrectOctal() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(8L, buffer, 0, 6);
        Assert.assertEquals("000010", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge_throwsException() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(64L, buffer, 0, 2);
    }

    @Test
    public void testFormatUnsignedOctalString_offsetNonZero_writesAtOffset() {
        byte[] buffer = new byte[10];
        TarUtils.formatUnsignedOctalString(8L, buffer, 2, 6);
        byte[] expected = "000010".getBytes();
        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(expected[i], buffer[2 + i]);
        }
    }

    // ---------- formatOctalBytes ----------

    @Test
    public void testFormatOctalBytes_normalValue_writesCorrectFormat() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(8L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("000010", new String(buf, 0, 6));
        Assert.assertEquals(' ', buf[6]);
        Assert.assertEquals(0, buf[7]);
    }

    @Test
    public void testFormatOctalBytes_zeroValue_writesZeroPadded() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(0L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("000000", new String(buf, 0, 6));
        Assert.assertEquals(' ', buf[6]);
        Assert.assertEquals(0, buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[4];
        TarUtils.formatOctalBytes(1000000L, buf, 0, 4);
    }

    // ---------- formatLongOctalBytes ----------

    @Test
    public void testFormatLongOctalBytes_normalValue_writesCorrectFormat() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(8L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("0000010", new String(buf, 0, 7));
        Assert.assertEquals(' ', buf[7]);
    }

    @Test
    public void testFormatLongOctalBytes_zeroValue_writesZeroPadded() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(0L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("0000000", new String(buf, 0, 7));
        Assert.assertEquals(' ', buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[3];
        TarUtils.formatLongOctalBytes(1000000L, buf, 0, 3);
    }

    // ---------- formatCheckSumOctalBytes ----------

    @Test
    public void testFormatCheckSumOctalBytes_normalValue_writesCorrectFormat() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(8L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("000010", new String(buf, 0, 6));
        Assert.assertEquals(0, buf[6]);
        Assert.assertEquals(' ', buf[7]);
    }

    @Test
    public void testFormatCheckSumOctalBytes_zeroValue_writesZeroPadded() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(0L, buf, 0, 8);
        Assert.assertEquals(8, newOffset);
        Assert.assertEquals("000000", new String(buf, 0, 6));
        Assert.assertEquals(0, buf[6]);
        Assert.assertEquals(' ', buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[4];
        TarUtils.formatCheckSumOctalBytes(1000000L, buf, 0, 4);
    }

    // ---------- computeCheckSum ----------

    @Test
    public void testComputeCheckSum_normalBuffer_returnsCorrectSum() {
        byte[] buf = new byte[]{1, 2, 3, 4};
        long sum = TarUtils.computeCheckSum(buf);
        Assert.assertEquals(10L, sum);
    }

    @Test
    public void testComputeCheckSum_emptyBuffer_returnsZero() {
        byte[] buf = new byte[0];
        long sum = TarUtils.computeCheckSum(buf);
        Assert.assertEquals(0L, sum);
    }

    @Test
    public void testComputeCheckSum_negativeByteValues_handledAsUnsigned() {
        byte[] buf = new byte[]{(byte) -1}; // 0xFF -> 255
        long sum = TarUtils.computeCheckSum(buf);
        Assert.assertEquals(255L, sum);
    }

    @Test
    public void testComputeCheckSum_allZeroBuffer_returnsZero() {
        byte[] buf = new byte[10];
        long sum = TarUtils.computeCheckSum(buf);
        Assert.assertEquals(0L, sum);
    }
}
