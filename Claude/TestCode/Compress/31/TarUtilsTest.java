import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.junit.Test;
import static org.junit.Assert.*;

public class TarUtilsTest {

    // ---------- parseOctal ----------

    @Test
    public void testParseOctal_normalValue_returnsCorrectLong() {
        byte[] buffer = "0000644 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(420L, result);
    }

    @Test
    public void testParseOctal_leadingNul_returnsZero() {
        byte[] buffer = new byte[]{0, '7', '7', '7', ' ', 0};
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_allNul_returnsZero() {
        byte[] buffer = new byte[8];
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctal_leadingSpaces_returnsCorrectLong() {
        byte[] buffer = "  644 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(420L, result);
    }

    @Test
    public void testParseOctal_trailingNulAndSpace_returnsCorrectLong() {
        byte[] buffer = "644 \0 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(420L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThanTwo_throwsException() {
        byte[] buffer = "7".getBytes();
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByte_throwsException() {
        byte[] buffer = "abc ".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    // ---------- parseOctalOrBinary ----------

    @Test
    public void testParseOctalOrBinary_octalValue_returnsCorrectLong() {
        byte[] buffer = "0000644 ".getBytes();
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(420L, result);
    }

    @Test
    public void testParseOctalOrBinary_positiveBinaryShort_returnsCorrectLong() {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0x80;
        buffer[7] = 10;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(10L, result);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinaryShort_returnsCorrectLong() {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0xff;
        for (int i = 1; i < 8; i++) {
            buffer[i] = (byte) 0xff;
        }
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(-1L, result);
    }

    @Test
    public void testParseOctalOrBinary_positiveBinaryLong_returnsCorrectLong() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[11] = 5;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(5L, result);
    }

    @Test
    public void testParseOctalOrBinary_negativeBinaryLong_returnsCorrectLong() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0xff;
        for (int i = 1; i < 12; i++) {
            buffer[i] = (byte) 0xff;
        }
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        assertEquals(-1L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_exceedsMaxLong_throwsException() {
        byte[] buffer = new byte[9];
        buffer[0] = (byte) 0x80;
        for (int i = 1; i < 9; i++) {
            buffer[i] = (byte) 0xff;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    // ---------- parseBoolean ----------

    @Test
    public void testParseBoolean_valueOne_returnsTrue() {
        byte[] buffer = new byte[]{1};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBoolean_valueZero_returnsFalse() {
        byte[] buffer = new byte[]{0};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBoolean_otherValue_returnsFalse() {
        byte[] buffer = new byte[]{5};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    // ---------- parseName(byte[], int, int) ----------

    @Test
    public void testParseName_normalNameWithTrailingNul_returnsName() {
        byte[] buffer = "hello\0\0\0".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("hello", name);
    }

    @Test
    public void testParseName_fullLengthNoNul_returnsFullName() {
        byte[] buffer = "hello123".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("hello123", name);
    }

    @Test
    public void testParseName_allNul_returnsEmptyString() {
        byte[] buffer = new byte[5];
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        assertEquals("", name);
    }

    // ---------- parseName(byte[], int, int, ZipEncoding) ----------

    @Test
    public void testParseNameWithEncoding_defaultEncoding_returnsName() throws Exception {
        byte[] buffer = "test\0\0".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length, TarUtils.DEFAULT_ENCODING);
        assertEquals("test", name);
    }

    @Test
    public void testParseNameWithEncoding_fallbackEncoding_returnsName() throws Exception {
        byte[] buffer = "test\0\0".getBytes();
        String name = TarUtils.parseName(buffer, 0, buffer.length, TarUtils.FALLBACK_ENCODING);
        assertEquals("test", name);
    }

    // ---------- formatNameBytes(String, byte[], int, int) ----------

    @Test
    public void testFormatNameBytes_shortName_padsWithNul() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, buf.length);
        assertEquals(10, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
        assertEquals(0, buf[3]);
        assertEquals(0, buf[9]);
    }

    @Test
    public void testFormatNameBytes_longName_truncates() {
        byte[] buf = new byte[3];
        int newOffset = TarUtils.formatNameBytes("abcdef", buf, 0, buf.length);
        assertEquals(3, newOffset);
        assertEquals('a', buf[0]);
        assertEquals('b', buf[1]);
        assertEquals('c', buf[2]);
    }

    @Test
    public void testFormatNameBytes_emptyName_fillsWithNul() {
        byte[] buf = new byte[5];
        int newOffset = TarUtils.formatNameBytes("", buf, 0, buf.length);
        assertEquals(5, newOffset);
        for (byte b : buf) {
            assertEquals(0, b);
        }
    }

    // ---------- formatNameBytes(String, byte[], int, int, ZipEncoding) ----------

    @Test
    public void testFormatNameBytesWithEncoding_normalName_returnsCorrectOffset() throws Exception {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatNameBytes("abc", buf, 0, buf.length, TarUtils.DEFAULT_ENCODING);
        assertEquals(10, newOffset);
        assertEquals('a', buf[0]);
    }

    // ---------- formatUnsignedOctalString ----------

    @Test
    public void testFormatUnsignedOctalString_valueZero_fillsWithZeros() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, buf.length);
        assertEquals("0000", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalString_normalValue_returnsCorrectOctal() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, buf.length);
        assertEquals("0010", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge_throwsException() {
        byte[] buf = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buf, 0, buf.length);
    }

    // ---------- formatOctalBytes ----------

    @Test
    public void testFormatOctalBytes_normalValue_returnsCorrectOffset() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatOctalBytes(420L, buf, 0, buf.length);
        assertEquals(8, newOffset);
        assertEquals(' ', (char) buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[3];
        TarUtils.formatOctalBytes(8L, buf, 0, buf.length);
    }

    // ---------- formatLongOctalBytes ----------

    @Test
    public void testFormatLongOctalBytes_normalValue_returnsCorrectOffset() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatLongOctalBytes(420L, buf, 0, buf.length);
        assertEquals(8, newOffset);
        assertEquals(' ', (char) buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[2];
        TarUtils.formatLongOctalBytes(8L, buf, 0, buf.length);
    }

    // ---------- formatLongOctalOrBinaryBytes ----------

    @Test
    public void testFormatLongOctalOrBinaryBytes_smallPositiveValue_usesOctalFormat() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(100L, buf, 0, buf.length);
        assertEquals(TarConstants.UIDLEN, newOffset);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeValueShortLength_usesBinaryFormat() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(-1L, buf, 0, buf.length);
        assertEquals(TarConstants.UIDLEN, newOffset);
        assertEquals((byte) 0xff, buf[0]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_largePositiveValueLongLength_usesBinaryFormat() {
        byte[] buf = new byte[TarConstants.SIZELEN];
        long largeValue = TarConstants.MAXSIZE + 1;
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(largeValue, buf, 0, buf.length);
        assertEquals(TarConstants.SIZELEN, newOffset);
        assertEquals((byte) 0x80, buf[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytes_exceedsBinaryCapacity_throwsException() {
        byte[] buf = new byte[TarConstants.UIDLEN];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, buf.length);
    }

    // ---------- formatCheckSumOctalBytes ----------

    @Test
    public void testFormatCheckSumOctalBytes_normalValue_returnsCorrectOffset() {
        byte[] buf = new byte[8];
        int newOffset = TarUtils.formatCheckSumOctalBytes(420L, buf, 0, buf.length);
        assertEquals(8, newOffset);
        assertEquals(0, buf[6]);
        assertEquals(' ', (char) buf[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytes_valueTooLarge_throwsException() {
        byte[] buf = new byte[3];
        TarUtils.formatCheckSumOctalBytes(8L, buf, 0, buf.length);
    }

    // ---------- computeCheckSum ----------

    @Test
    public void testComputeCheckSum_normalBuffer_returnsCorrectSum() {
        byte[] buf = new byte[]{1, 2, 3, 4};
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(10L, sum);
    }

    @Test
    public void testComputeCheckSum_emptyBuffer_returnsZero() {
        byte[] buf = new byte[0];
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(0L, sum);
    }

    @Test
    public void testComputeCheckSum_negativeBytes_treatedAsUnsigned() {
        byte[] buf = new byte[]{(byte) 0xff};
        long sum = TarUtils.computeCheckSum(buf);
        assertEquals(255L, sum);
    }

    // ---------- verifyCheckSum ----------

    @Test
    public void testVerifyCheckSum_validChecksum_returnsTrue() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) 'a';
        }
        // Initialize checksum field with spaces before computing sum
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_invalidChecksum_returnsFalse() {
        byte[] header = new byte[512];
        // all zero, checksum field remains zero -> storedSum = 0
        header[200] = (byte) 5; // modify a byte outside checksum field
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_storedSumGreaterThanUnsigned_returnsTrueCompress177() {
        byte[] header = new byte[512];
        // Fill checksum field with '7' repeated (valid octal digits)
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = '7';
        }
        // rest of header remains zero
        assertTrue(TarUtils.verifyCheckSum(header));
    }
}
