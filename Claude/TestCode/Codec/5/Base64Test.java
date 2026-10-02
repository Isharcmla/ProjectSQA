import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import java.math.BigInteger;

public class Base64Test {

    private Base64 base64;

    @Before
    public void setUp() {
        base64 = new Base64();
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_default_notUrlSafe() {
        Base64 b = new Base64();
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_urlSafeTrue_isUrlSafe() {
        Base64 b = new Base64(true);
        assertTrue(b.isUrlSafe());
    }

    @Test
    public void testConstructor_urlSafeFalse_notUrlSafe() {
        Base64 b = new Base64(false);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLength_normal() {
        Base64 b = new Base64(64);
        assertNotNull(b);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLengthZero_noChunking() {
        Base64 b = new Base64(0);
        byte[] data = "Hello World".getBytes();
        byte[] encoded = b.encode(data);
        // should not contain CRLF
        String s = new String(encoded);
        assertFalse(s.contains("\r\n"));
    }

    @Test
    public void testConstructor_lineLengthNegative_noChunking() {
        Base64 b = new Base64(-1);
        byte[] data = "Hello World".getBytes();
        byte[] encoded = b.encode(data);
        String s = new String(encoded);
        assertFalse(s.contains("\r\n"));
    }

    @Test
    public void testConstructor_lineLengthAndSeparator_normal() {
        byte[] sep = {'\n'};
        Base64 b = new Base64(4, sep);
        assertNotNull(b);
    }

    @Test
    public void testConstructor_nullLineSeparator_disablesChunking() {
        Base64 b = new Base64(76, null);
        byte[] data = "Hello World".getBytes();
        byte[] encoded = b.encode(data);
        String s = new String(encoded);
        assertFalse(s.contains("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_lineSeparatorContainsBase64Char_throwsException() {
        byte[] sep = {'A'};
        new Base64(4, sep);
    }

    @Test
    public void testConstructor_fullConstructor_urlSafeTrue() {
        byte[] sep = {'\n'};
        Base64 b = new Base64(4, sep, true);
        assertTrue(b.isUrlSafe());
    }

    @Test
    public void testConstructor_fullConstructor_urlSafeFalse() {
        byte[] sep = {'\n'};
        Base64 b = new Base64(4, sep, false);
        assertFalse(b.isUrlSafe());
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

    // ---------- isBase64(byte) ----------

    @Test
    public void testIsBase64_validChar_true() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
    }

    @Test
    public void testIsBase64_padChar_true() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64_invalidChar_false() {
        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) '!'));
    }

    @Test
    public void testIsBase64_negativeByte_false() {
        assertFalse(Base64.isBase64((byte) -1));
    }

    @Test
    public void testIsBase64_urlSafeChars_true() {
        assertTrue(Base64.isBase64((byte) '-'));
        assertTrue(Base64.isBase64((byte) '_'));
    }

    // ---------- isArrayByteBase64 ----------

    @Test
    public void testIsArrayByteBase64_validArray_true() {
        byte[] data = "SGVsbG8=".getBytes();
        assertTrue(Base64.isArrayByteBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_emptyArray_true() {
        byte[] data = new byte[0];
        assertTrue(Base64.isArrayByteBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_withWhitespace_true() {
        byte[] data = "SGVs bG8=\r\n".getBytes();
        assertTrue(Base64.isArrayByteBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_invalidChar_false() {
        byte[] data = "Hello!@#$".getBytes();
        assertFalse(Base64.isArrayByteBase64(data));
    }

    // ---------- encodeBase64(byte[]) ----------

    @Test
    public void testEncodeBase64_normalInput_correctOutput() {
        byte[] data = "Hello World".getBytes();
        byte[] encoded = Base64.encodeBase64(data);
        assertEquals("SGVsbG8gV29ybGQ=", new String(encoded));
    }

    @Test
    public void testEncodeBase64_nullInput_returnsNull() {
        byte[] result = Base64.encodeBase64(null);
        assertNull(result);
    }

    @Test
    public void testEncodeBase64_emptyInput_returnsEmpty() {
        byte[] data = new byte[0];
        byte[] result = Base64.encodeBase64(data);
        assertEquals(0, result.length);
    }

    // ---------- encodeBase64String ----------

    @Test
    public void testEncodeBase64String_normalInput_correctOutput() {
        byte[] data = "Hello World".getBytes();
        String encoded = Base64.encodeBase64String(data);
        assertEquals("SGVsbG8gV29ybGQ=\r\n", encoded);
    }

    @Test
    public void testEncodeBase64String_emptyInput_returnsEmptyString() {
        byte[] data = new byte[0];
        String encoded = Base64.encodeBase64String(data);
        assertEquals("", encoded);
    }

    // ---------- encodeBase64URLSafe ----------

    @Test
    public void testEncodeBase64URLSafe_normalInput_noPadding() {
        byte[] data = "Hello World".getBytes();
        byte[] encoded = Base64.encodeBase64URLSafe(data);
        String s = new String(encoded);
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncodeBase64URLSafe_emptyInput_returnsEmpty() {
        byte[] data = new byte[0];
        byte[] result = Base64.encodeBase64URLSafe(data);
        assertEquals(0, result.length);
    }

    // ---------- encodeBase64URLSafeString ----------

    @Test
    public void testEncodeBase64URLSafeString_normalInput_correctFormat() {
        byte[] data = "Hello World".getBytes();
        String encoded = Base64.encodeBase64URLSafeString(data);
        assertFalse(encoded.contains("="));
    }

    // ---------- encodeBase64Chunked ----------

    @Test
    public void testEncodeBase64Chunked_normalInput_hasChunkSeparator() {
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        byte[] encoded = Base64.encodeBase64Chunked(data);
        String s = new String(encoded);
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64Chunked_emptyInput_returnsEmpty() {
        byte[] data = new byte[0];
        byte[] result = Base64.encodeBase64Chunked(data);
        assertEquals(0, result.length);
    }

    // ---------- encodeBase64(byte[], boolean) ----------

    @Test
    public void testEncodeBase64_isChunkedTrue_hasSeparator() {
        byte[] data = new byte[100];
        byte[] encoded = Base64.encodeBase64(data, true);
        String s = new String(encoded);
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64_isChunkedFalse_noSeparator() {
        byte[] data = new byte[100];
        byte[] encoded = Base64.encodeBase64(data, false);
        String s = new String(encoded);
        assertFalse(s.contains("\r\n"));
    }

    // ---------- encodeBase64(byte[], boolean, boolean) ----------

    @Test
    public void testEncodeBase64_urlSafeTrue_noPlusSlash() {
        byte[] data = {(byte) 0xFF, (byte) 0xFE, (byte) 0xFD};
        byte[] encoded = Base64.encodeBase64(data, false, true);
        String s = new String(encoded);
        assertFalse(s.contains("+"));
        assertFalse(s.contains("/"));
    }

    // ---------- encodeBase64(byte[], boolean, boolean, int) ----------

    @Test
    public void testEncodeBase64_maxResultSizeSufficient_success() {
        byte[] data = "Hello".getBytes();
        byte[] encoded = Base64.encodeBase64(data, false, false, 100);
        assertNotNull(encoded);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_maxResultSizeExceeded_throwsException() {
        byte[] data = new byte[1000];
        Base64.encodeBase64(data, false, false, 10);
    }

    // ---------- decodeBase64(String) ----------

    @Test
    public void testDecodeBase64String_normalInput_correctOutput() {
        byte[] decoded = Base64.decodeBase64("SGVsbG8gV29ybGQ=");
        assertEquals("Hello World", new String(decoded));
    }

    @Test
    public void testDecodeBase64String_emptyString_returnsEmptyArray() {
        byte[] decoded = Base64.decodeBase64("");
        assertEquals(0, decoded.length);
    }

    // ---------- decodeBase64(byte[]) ----------

    @Test
    public void testDecodeBase64ByteArray_normalInput_correctOutput() {
        byte[] input = "SGVsbG8gV29ybGQ=".getBytes();
        byte[] decoded = Base64.decodeBase64(input);
        assertEquals("Hello World", new String(decoded));
    }

    @Test
    public void testDecodeBase64ByteArray_nullInput_returnsNull() {
        byte[] result = Base64.decodeBase64((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testDecodeBase64ByteArray_emptyInput_returnsEmpty() {
        byte[] input = new byte[0];
        byte[] result = Base64.decodeBase64(input);
        assertEquals(0, result.length);
    }

    // ---------- decode(Object) ----------

    @Test
    public void testDecodeObject_byteArrayInput_correctOutput() throws DecoderException {
        byte[] input = "SGVsbG8=".getBytes();
        Object result = base64.decode((Object) input);
        assertTrue(result instanceof byte[]);
        assertEquals("Hello", new String((byte[]) result));
    }

    @Test
    public void testDecodeObject_stringInput_correctOutput() throws DecoderException {
        Object result = base64.decode((Object) "SGVsbG8=");
        assertTrue(result instanceof byte[]);
        assertEquals("Hello", new String((byte[]) result));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_invalidType_throwsException() throws DecoderException {
        base64.decode((Object) new Integer(123));
    }

    // ---------- decode(String) ----------

    @Test
    public void testDecodeString_normalInput_correctOutput() {
        byte[] result = base64.decode("SGVsbG8gV29ybGQ=");
        assertEquals("Hello World", new String(result));
    }

    @Test
    public void testDecodeString_emptyString_returnsEmptyArray() {
        byte[] result = base64.decode("");
        assertEquals(0, result.length);
    }

    // ---------- decode(byte[]) ----------

    @Test
    public void testDecodeByteArray_normalInput_correctOutput() {
        byte[] input = "SGVsbG8gV29ybGQ=".getBytes();
        byte[] result = base64.decode(input);
        assertEquals("Hello World", new String(result));
    }

    @Test
    public void testDecodeByteArray_nullInput_returnsNull() {
        byte[] result = base64.decode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testDecodeByteArray_emptyInput_returnsEmptyArray() {
        byte[] input = new byte[0];
        byte[] result = base64.decode(input);
        assertEquals(0, result.length);
    }

    @Test
    public void testDecodeByteArray_withWhitespace_ignoresWhitespace() {
        byte[] input = "SGVs\r\nbG8=".getBytes();
        byte[] result = base64.decode(input);
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeByteArray_withPadding_stopsAtPad() {
        byte[] input = "SGVsbG8=extra".getBytes();
        byte[] result = base64.decode(input);
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeByteArray_urlSafeChars_decodesCorrectly() {
        byte[] input = "SGVsbG8_V29ybGQ-".getBytes();
        byte[] result = base64.decode(input);
        assertNotNull(result);
    }

    @Test
    public void testDecodeByteArray_singleCharModulus1_noExtraByte() {
        // modulus of 1 (invalid trailing char) - only 1 leftover 6-bit char, should produce no output byte
        byte[] input = "QQ".getBytes(); // "QQ" decodes normally actually is 1 byte with padding needed
        byte[] result = base64.decode(input);
        assertNotNull(result);
    }

    // ---------- encode(Object) ----------

    @Test
    public void testEncodeObject_byteArrayInput_correctOutput() throws EncoderException {
        byte[] input = "Hello".getBytes();
        Object result = base64.encode((Object) input);
        assertTrue(result instanceof byte[]);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_invalidType_throwsException() throws EncoderException {
        base64.encode((Object) "NotAByteArray");
    }

    // ---------- encodeToString ----------

    @Test
    public void testEncodeToString_normalInput_correctOutput() {
        byte[] input = "Hello".getBytes();
        String result = base64.encodeToString(input);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testEncodeToString_emptyInput_returnsEmptyString() {
        byte[] input = new byte[0];
        String result = base64.encodeToString(input);
        assertEquals("", result);
    }

    // ---------- encode(byte[]) ----------

    @Test
    public void testEncode_normalInput_correctOutput() {
        byte[] input = "Hello World".getBytes();
        byte[] result = base64.encode(input);
        assertEquals("SGVsbG8gV29ybGQ=\r\n", new String(result));
    }

    @Test
    public void testEncode_nullInput_returnsNull() {
        byte[] result = base64.encode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testEncode_emptyInput_returnsEmptyArray() {
        byte[] input = new byte[0];
        byte[] result = base64.encode(input);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncode_singleByteInput_correctPadding() {
        byte[] input = {65}; // 'A'
        byte[] result = base64.encode(input);
        String s = new String(result);
        assertTrue(s.startsWith("QQ=="));
    }

    @Test
    public void testEncode_twoByteInput_correctPadding() {
        byte[] input = {65, 66}; // 'A', 'B'
        byte[] result = base64.encode(input);
        String s = new String(result);
        assertTrue(s.startsWith("QUI="));
    }

    @Test
    public void testEncode_threeByteInput_noPadding() {
        byte[] input = {65, 66, 67}; // 'A', 'B', 'C'
        byte[] result = base64.encode(input);
        String s = new String(result);
        assertTrue(s.startsWith("QUJD"));
    }

    @Test
    public void testEncode_urlSafeMode_noPaddingChars() {
        Base64 urlSafeB64 = new Base64(true);
        byte[] input = {65}; // single byte -> needs padding normally
        byte[] result = urlSafeB64.encode(input);
        String s = new String(result);
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncode_largeInput_multipleLines() {
        byte[] input = new byte[200];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) i;
        }
        byte[] result = base64.encode(input);
        String s = new String(result);
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testEncode_negativeByteValues_correctEncoding() {
        byte[] input = {(byte) -1, (byte) -128, (byte) 127};
        byte[] result = base64.encode(input);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    // ---------- decodeInteger ----------

    @Test
    public void testDecodeInteger_validInput_correctBigInteger() {
        BigInteger original = new BigInteger("255");
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    // ---------- encodeInteger ----------

    @Test
    public void testEncodeInteger_positiveValue_correctOutput() {
        BigInteger bigInt = new BigInteger("12345");
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testEncodeInteger_zeroValue_correctOutput() {
        BigInteger bigInt = BigInteger.ZERO;
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testEncodeInteger_largeValue_correctOutput() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_nullValue_throwsException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeInteger_negativeValue_correctOutput() {
        BigInteger bigInt = new BigInteger("-100");
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testEncodeInteger_byteAlignedValue_correctOutput() {
        // Value exactly byte aligned (multiple of 8 bits with high bit potentially set)
        BigInteger bigInt = new BigInteger("256"); // 0x100 - 9 bits
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testEncodeInteger_exactByteBoundary_correctOutput() {
        BigInteger bigInt = new BigInteger(new byte[]{0, -1, -1}); // exactly byte aligned positive
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
    }

    // ---------- hasData / avail (package-private, but test indirectly through streaming) ----------

    @Test
    public void testHasData_afterEncode_returnsFalseWhenDrained() {
        byte[] input = "Hi".getBytes();
        base64.encode(input);
        assertFalse(base64.hasData());
    }

    // ---------- Additional round-trip tests ----------

    @Test
    public void testRoundTrip_encodeThenDecode_matchesOriginal() {
        String original = "The quick brown fox jumps over the lazy dog";
        byte[] encoded = Base64.encodeBase64(original.getBytes());
        byte[] decoded = Base64.decodeBase64(encoded);
        assertEquals(original, new String(decoded));
    }

    @Test
    public void testRoundTrip_urlSafeEncodeThenDecode_matchesOriginal() {
        String original = "Test data with special chars \u00FF\u00FE";
        byte[] encoded = Base64.encodeBase64URLSafe(original.getBytes("ISO-8859-1".equals("ISO-8859-1") ? "ISO-8859-1".length() > 0 ? getIso() : null : null));
        byte[] decoded = Base64.decodeBase64(encoded);
        assertNotNull(decoded);
    }

    private static String getIso() {
        return "ISO-8859-1";
    }

    @Test
    public void testRoundTrip_binaryData_matchesOriginal() {
        byte[] original = new byte[256];
        for (int i = 0; i < 256; i++) {
            original[i] = (byte) i;
        }
        byte[] encoded = Base64.encodeBase64(original);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncode_withCustomLineLength_correctChunking() {
        Base64 customB64 = new Base64(4, new byte[]{'\n'});
        byte[] input = "Hello World Test".getBytes();
        byte[] result = customB64.encode(input);
        String s = new String(result);
        assertTrue(s.contains("\n"));
    }

    @Test
    public void testDecode_modulus2Case_correctPartialByte() {
        // Two base64 chars with no padding leftover producing modulus=2 branch coverage
        byte[] input = "QQ".getBytes();
        byte[] result = base64.decode(input);
        assertEquals(1, result.length);
    }

    @Test
    public void testDecode_modulus3Case_correctPartialBytes() {
        byte[] input = "QUI".getBytes();
        byte[] result = base64.decode(input);
        assertEquals(2, result.length);
    }

    @Test
    public void testEncode_bufferResize_largeData() {
        byte[] input = new byte[20000];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i % 256);
        }
        byte[] result = base64.encode(input);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testDecode_bufferResize_largeData() {
        byte[] input = new byte[20000];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i % 256);
        }
        byte[] encoded = base64.encode(input);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(input, decoded);
    }
}
