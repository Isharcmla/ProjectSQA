import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigInteger;

public class Base64Test {

    private Base64 base64;

    @Before
    public void setUp() {
        base64 = new Base64();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_default_isNotUrlSafe() {
        Base64 b = new Base64();
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_urlSafeTrue_isUrlSafe() {
        Base64 b = new Base64(true);
        assertTrue(b.isUrlSafe());
    }

    @Test
    public void testConstructor_urlSafeFalse_isNotUrlSafe() {
        Base64 b = new Base64(false);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLength_normal() {
        Base64 b = new Base64(76);
        assertNotNull(b);
    }

    @Test
    public void testConstructor_lineLengthNotMultipleOf4_stillWorks() {
        Base64 b = new Base64(10);
        byte[] data = "Hello World Testing 123".getBytes();
        byte[] encoded = b.encode(data);
        assertNotNull(encoded);
    }

    @Test
    public void testConstructor_lineLengthAndSeparator() {
        byte[] sep = {'\n'};
        Base64 b = new Base64(76, sep);
        assertNotNull(b);
    }

    @Test
    public void testConstructor_lineSeparatorNull_disablesChunking() {
        Base64 b = new Base64(76, null);
        byte[] data = new byte[100];
        byte[] encoded = b.encode(data);
        // No CRLF should appear since lineSeparator null disables chunking
        boolean hasCRLF = false;
        for (int i = 0; i < encoded.length - 1; i++) {
            if (encoded[i] == '\r' && encoded[i + 1] == '\n') {
                hasCRLF = true;
                break;
            }
        }
        assertFalse(hasCRLF);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_lineSeparatorContainsBase64Char_throwsException() {
        byte[] sep = {'A', 'B'};
        new Base64(76, sep);
    }

    @Test
    public void testConstructor_lineLengthAndSeparatorAndUrlSafe() {
        byte[] sep = {'\n'};
        Base64 b = new Base64(76, sep, true);
        assertTrue(b.isUrlSafe());
    }

    // ---------- isUrlSafe ----------

    @Test
    public void testIsUrlSafe_default_false() {
        assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testIsUrlSafe_urlSafeConstructor_true() {
        Base64 b = new Base64(true);
        assertTrue(b.isUrlSafe());
    }

    // ---------- hasData / avail ----------

    @Test
    public void testHasData_initial_false() {
        Base64 b = new Base64();
        assertFalse(b.hasData());
    }

    @Test
    public void testAvail_initial_zero() {
        Base64 b = new Base64();
        assertEquals(0, b.avail());
    }

    @Test
    public void testHasData_afterEncode_true() {
        Base64 b = new Base64();
        b.encode(new byte[]{1, 2, 3}, 0, 3);
        assertTrue(b.hasData());
    }

    @Test
    public void testAvail_afterEncode_greaterThanZero() {
        Base64 b = new Base64();
        b.encode(new byte[]{1, 2, 3}, 0, 3);
        assertTrue(b.avail() > 0);
    }

    // ---------- readResults / setInitialBuffer ----------

    @Test
    public void testReadResults_noBuffer_notEof_returnsZero() {
        Base64 b = new Base64();
        byte[] out = new byte[10];
        int result = b.readResults(out, 0, 10);
        assertEquals(0, result);
    }

    @Test
    public void testSetInitialBuffer_setsBufferCorrectly() {
        Base64 b = new Base64();
        byte[] out = new byte[10];
        b.setInitialBuffer(out, 0, 10);
        assertTrue(b.hasData());
    }

    @Test
    public void testSetInitialBuffer_mismatchedLength_doesNotSet() {
        Base64 b = new Base64();
        byte[] out = new byte[10];
        b.setInitialBuffer(out, 0, 5);
        assertFalse(b.hasData());
    }

    @Test
    public void testSetInitialBuffer_nullOut_doesNotSet() {
        Base64 b = new Base64();
        b.setInitialBuffer(null, 0, 5);
        assertFalse(b.hasData());
    }

    // ---------- encode(byte[], int, int) low-level ----------

    @Test
    public void testEncode_lowLevel_normalData() {
        Base64 b = new Base64();
        byte[] data = {65, 66, 67};
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals("QUJD", new String(result));
    }

    @Test
    public void testEncode_lowLevel_eofWhenAlreadyEof_returnsImmediately() {
        Base64 b = new Base64();
        byte[] data = {65, 66, 67};
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        int posBefore = b.avail();
        b.encode(data, 0, -1); // eof true already, should return immediately
        assertEquals(posBefore, b.avail());
    }

    @Test
    public void testEncode_lowLevel_modulus1AtEof_standardPadding() {
        Base64 b = new Base64();
        byte[] data = {65};
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        String s = new String(result);
        assertTrue(s.endsWith("=="));
    }

    @Test
    public void testEncode_lowLevel_modulus2AtEof_standardPadding() {
        Base64 b = new Base64();
        byte[] data = {65, 66};
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        String s = new String(result);
        assertTrue(s.endsWith("="));
    }

    @Test
    public void testEncode_lowLevel_modulus1AtEof_urlSafeNoPadding() {
        Base64 b = new Base64(true);
        byte[] data = {65};
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        String s = new String(result);
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncode_lowLevel_chunking_exactMultipleOfLineLength() {
        // 57 bytes -> encoded length exactly 76 chars, tests the "previous char is separator" skip branch
        Base64 b = new Base64(true == false); // urlSafe false, default line length 76
        byte[] data = new byte[57];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 128);
        }
        byte[] encoded = b.encode(data);
        assertNotNull(encoded);
        String s = new String(encoded);
        // should contain exactly one CRLF at the end (no double CRLF)
        assertFalse(s.contains("\r\n\r\n"));
    }

    @Test
    public void testEncode_lowLevel_negativeByteHandledCorrectly() {
        Base64 b = new Base64();
        byte[] data = {-1, -2, -3};
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    // ---------- decode(byte[], int, int) low-level ----------

    @Test
    public void testDecode_lowLevel_eofWhenAlreadyEof_returnsImmediately() {
        Base64 b = new Base64();
        byte[] data = "QUJD".getBytes();
        b.decode(data, 0, data.length);
        b.decode(data, 0, -1);
        int posBefore = b.avail();
        b.decode(data, 0, -1);
        assertEquals(posBefore, b.avail());
    }

    @Test
    public void testDecode_lowLevel_padCharacterStopsDecoding() {
        Base64 b = new Base64();
        byte[] data = "QQ==".getBytes();
        b.decode(data, 0, data.length);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals(1, result.length);
        assertEquals('A', result[0]);
    }

    @Test
    public void testDecode_lowLevel_modulus2AtEof() {
        Base64 b = new Base64();
        byte[] data = "QQ".getBytes(); // no pad, modulus = 2 at eof
        b.decode(data, 0, data.length);
        b.decode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals(1, result.length);
    }

    @Test
    public void testDecode_lowLevel_modulus3AtEof() {
        Base64 b = new Base64();
        byte[] data = "QUI".getBytes(); // modulus = 3 at eof
        b.decode(data, 0, data.length);
        b.decode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals(2, result.length);
    }

    @Test
    public void testDecode_lowLevel_ignoresInvalidBytes() {
        Base64 b = new Base64();
        byte[] data = {'Q', 'U', (byte) 0x80, 'J', 'D'}; // 0x80 is negative byte, should be ignored
        b.decode(data, 0, data.length);
        b.decode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals("ABC", new String(result));
    }

    @Test
    public void testDecode_lowLevel_ignoresOutOfRangeBytes() {
        Base64 b = new Base64();
        byte[] data = {'Q', 'U', (byte) 200, 'J', 'D'}; // byte value beyond DECODE_TABLE length
        b.decode(data, 0, data.length);
        b.decode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals("ABC", new String(result));
    }

    @Test
    public void testDecode_lowLevel_ignoresWhitespace() {
        Base64 b = new Base64();
        byte[] data = "QU\r\nJD".getBytes();
        b.decode(data, 0, data.length);
        b.decode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals("ABC", new String(result));
    }

    // ---------- isBase64(byte) ----------

    @Test
    public void testIsBase64_validAlphaChar_true() {
        assertTrue(Base64.isBase64((byte) 'A'));
    }

    @Test
    public void testIsBase64_padChar_true() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64_invalidChar_false() {
        assertFalse(Base64.isBase64((byte) '!'));
    }

    @Test
    public void testIsBase64_negativeByte_false() {
        assertFalse(Base64.isBase64((byte) -128));
    }

    @Test
    public void testIsBase64_urlSafeChars_true() {
        assertTrue(Base64.isBase64((byte) '-'));
        assertTrue(Base64.isBase64((byte) '_'));
    }

    @Test
    public void testIsBase64_standardChars_true() {
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
    }

    // ---------- isArrayByteBase64(byte[]) ----------

    @Test
    public void testIsArrayByteBase64_validArray_true() {
        assertTrue(Base64.isArrayByteBase64("QUJD".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_invalidArray_false() {
        assertFalse(Base64.isArrayByteBase64("QU!D".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_withWhitespace_true() {
        assertTrue(Base64.isArrayByteBase64("QU JD\r\n".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_emptyArray_true() {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
    }

    // ---------- static encodeBase64 variants ----------

    @Test
    public void testEncodeBase64_normal() {
        byte[] result = Base64.encodeBase64("ABC".getBytes());
        assertEquals("QUJD", new String(result));
    }

    @Test
    public void testEncodeBase64_nullInput_returnsNull() {
        assertNull(Base64.encodeBase64(null));
    }

    @Test
    public void testEncodeBase64_emptyInput_returnsEmpty() {
        byte[] result = Base64.encodeBase64(new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncodeBase64_chunkedTrue() {
        byte[] data = new byte[100];
        byte[] encoded = Base64.encodeBase64(data, true);
        String s = new String(encoded);
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64_chunkedFalse() {
        byte[] data = new byte[100];
        byte[] encoded = Base64.encodeBase64(data, false);
        String s = new String(encoded);
        assertFalse(s.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64_urlSafeTrue() {
        byte[] data = {-1, -2, -3, -4, -5, -6};
        byte[] encoded = Base64.encodeBase64(data, false, true);
        String s = new String(encoded);
        assertFalse(s.contains("+"));
        assertFalse(s.contains("/"));
    }

    @Test
    public void testEncodeBase64_maxResultSizeNotExceeded() {
        byte[] data = "ABC".getBytes();
        byte[] encoded = Base64.encodeBase64(data, false, false, 100);
        assertNotNull(encoded);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_maxResultSizeExceeded_throwsException() {
        byte[] data = new byte[1000];
        Base64.encodeBase64(data, false, false, 5);
    }

    @Test
    public void testEncodeBase64URLSafe() {
        byte[] data = {-1, -2, -3};
        byte[] encoded = Base64.encodeBase64URLSafe(data);
        assertNotNull(encoded);
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        byte[] data = {-1, -2, -3};
        String encoded = Base64.encodeBase64URLSafeString(data);
        assertNotNull(encoded);
    }

    @Test
    public void testEncodeBase64String() {
        String encoded = Base64.encodeBase64String("ABC".getBytes());
        assertEquals("QUJD", encoded);
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] data = new byte[100];
        byte[] encoded = Base64.encodeBase64Chunked(data);
        String s = new String(encoded);
        assertTrue(s.contains("\r\n"));
    }

    // ---------- static decodeBase64 ----------

    @Test
    public void testDecodeBase64_string() {
        byte[] result = Base64.decodeBase64("QUJD");
        assertEquals("ABC", new String(result));
    }

    @Test
    public void testDecodeBase64_byteArray() {
        byte[] result = Base64.decodeBase64("QUJD".getBytes());
        assertEquals("ABC", new String(result));
    }

    @Test
    public void testDecodeBase64_emptyByteArray() {
        byte[] result = Base64.decodeBase64(new byte[0]);
        assertEquals(0, result.length);
    }

    // ---------- decode(Object), decode(String), decode(byte[]) instance methods ----------

    @Test
    public void testDecodeObject_byteArrayInput() throws DecoderException {
        Object result = base64.decode((Object) "QUJD".getBytes());
        assertTrue(result instanceof byte[]);
        assertEquals("ABC", new String((byte[]) result));
    }

    @Test
    public void testDecodeObject_stringInput() throws DecoderException {
        Object result = base64.decode((Object) "QUJD");
        assertTrue(result instanceof byte[]);
        assertEquals("ABC", new String((byte[]) result));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_invalidType_throwsException() throws DecoderException {
        base64.decode((Object) Integer.valueOf(5));
    }

    @Test
    public void testDecodeString_normal() {
        byte[] result = base64.decode("QUJD");
        assertEquals("ABC", new String(result));
    }

    @Test
    public void testDecodeByteArray_normal() {
        byte[] result = base64.decode("QUJD".getBytes());
        assertEquals("ABC", new String(result));
    }

    @Test
    public void testDecodeByteArray_nullInput_returnsNull() {
        byte[] result = base64.decode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testDecodeByteArray_emptyInput_returnsEmpty() {
        byte[] result = base64.decode(new byte[0]);
        assertEquals(0, result.length);
    }

    // ---------- encode(Object), encode(byte[]), encodeToString ----------

    @Test
    public void testEncodeObject_byteArrayInput() throws EncoderException {
        Object result = base64.encode((Object) "ABC".getBytes());
        assertTrue(result instanceof byte[]);
        assertEquals("QUJD", new String((byte[]) result));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_invalidType_throwsException() throws EncoderException {
        base64.encode((Object) "not a byte array");
    }

    @Test
    public void testEncodeByteArray_normal() {
        byte[] result = base64.encode("ABC".getBytes());
        assertEquals("QUJD", new String(result));
    }

    @Test
    public void testEncodeByteArray_nullInput_returnsNull() {
        byte[] result = base64.encode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testEncodeByteArray_emptyInput_returnsEmpty() {
        byte[] result = base64.encode(new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncodeToString_normal() {
        String result = base64.encodeToString("ABC".getBytes());
        assertEquals("QUJD", result);
    }

    // ---------- decodeInteger / encodeInteger ----------

    @Test
    public void testDecodeInteger_normal() {
        byte[] encoded = Base64.encodeBase64(BigInteger.valueOf(255).toByteArray());
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(BigInteger.valueOf(255), decoded);
    }

    @Test
    public void testEncodeInteger_normal() {
        BigInteger bigInt = BigInteger.valueOf(12345);
        byte[] encoded = Base64.encodeInteger(bigInt);
        assertNotNull(encoded);
        assertTrue(encoded.length > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_nullInput_throwsException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeDecodeInteger_roundTrip() {
        BigInteger original = BigInteger.valueOf(987654321L);
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeInteger_negativeValue() {
        BigInteger original = BigInteger.valueOf(-100);
        byte[] encoded = Base64.encodeInteger(original);
        assertNotNull(encoded);
    }

    @Test
    public void testEncodeDecodeInteger_zero() {
        BigInteger original = BigInteger.ZERO;
        byte[] encoded = Base64.encodeInteger(original);
        assertNotNull(encoded);
    }

    // ---------- discardWhitespace ----------

    @Test
    public void testDiscardWhitespace_removesWhitespace() {
        byte[] data = "A B\tC\r\nD".getBytes();
        byte[] result = Base64.discardWhitespace(data);
        assertEquals("ABCD", new String(result));
    }

    @Test
    public void testDiscardWhitespace_noWhitespace_unchanged() {
        byte[] data = "ABCD".getBytes();
        byte[] result = Base64.discardWhitespace(data);
        assertEquals("ABCD", new String(result));
    }

    @Test
    public void testDiscardWhitespace_emptyInput() {
        byte[] data = new byte[0];
        byte[] result = Base64.discardWhitespace(data);
        assertEquals(0, result.length);
    }

    @Test
    public void testDiscardWhitespace_allWhitespace() {
        byte[] data = " \t\r\n".getBytes();
        byte[] result = Base64.discardWhitespace(data);
        assertEquals(0, result.length);
    }

    // ---------- toIntegerBytes ----------

    @Test
    public void testToIntegerBytes_positiveValue() {
        BigInteger bigInt = BigInteger.valueOf(255);
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testToIntegerBytes_byteAlignedValue() {
        BigInteger bigInt = BigInteger.valueOf(256); // exactly byte-aligned (bitLength % 8 == 0 after adjustment)
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testToIntegerBytes_smallValue() {
        BigInteger bigInt = BigInteger.valueOf(1);
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
        assertEquals(1, result.length);
    }

    @Test
    public void testToIntegerBytes_largeValue() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testToIntegerBytes_zero() {
        BigInteger bigInt = BigInteger.ZERO;
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
    }

    // ---------- Round-trip tests for full encode/decode cycle ----------

    @Test
    public void testEncodeDecode_roundTrip_normalText() {
        String original = "The quick brown fox jumps over the lazy dog";
        byte[] encoded = base64.encode(original.getBytes());
        byte[] decoded = base64.decode(encoded);
        assertEquals(original, new String(decoded));
    }

    @Test
    public void testEncodeDecode_roundTrip_binaryData() {
        byte[] original = new byte[256];
        for (int i = 0; i < 256; i++) {
            original[i] = (byte) i;
        }
        byte[] encoded = base64.encode(original);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeDecode_roundTrip_urlSafe() {
        Base64 urlSafeCodec = new Base64(true);
        byte[] original = {-1, -2, -3, -4, -5, -6, -7, -8};
        byte[] encoded = urlSafeCodec.encode(original);
        byte[] decoded = urlSafeCodec.decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeDecode_roundTrip_singleByte() {
        byte[] original = {42};
        byte[] encoded = base64.encode(original);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeDecode_roundTrip_twoBytes() {
        byte[] original = {42, 43};
        byte[] encoded = base64.encode(original);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeDecode_roundTrip_threeBytes() {
        byte[] original = {42, 43, 44};
        byte[] encoded = base64.encode(original);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeDecode_roundTrip_largeData() {
        byte[] original = new byte[10000];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) (i % 256);
        }
        byte[] encoded = base64.encode(original);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(original, decoded);
    }
}
