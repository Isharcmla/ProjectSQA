import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class Base64Test {

    private Base64 base64;

    @Before
    public void setUp() {
        base64 = new Base64();
    }

    // ---------- Constructor tests ----------

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
        Base64 b = new Base64(76);
        assertNotNull(b);
    }

    @Test
    public void testConstructor_lineLengthZero_noChunking() {
        Base64 b = new Base64(0);
        byte[] data = "Hello World, this is a longer test string to check chunking behavior!".getBytes();
        byte[] encoded = b.encode(data);
        String s = new String(encoded);
        assertFalse(s.contains("\r\n"));
    }

    @Test
    public void testConstructor_lineLengthNegative_noChunking() {
        Base64 b = new Base64(-5);
        byte[] data = "Hello World".getBytes();
        byte[] encoded = b.encode(data);
        String s = new String(encoded);
        assertFalse(s.contains("\r\n"));
    }

    @Test
    public void testConstructor_customLineSeparator_used() {
        byte[] sep = {'\n'};
        Base64 b = new Base64(4, sep);
        byte[] data = "abcdefgh".getBytes();
        byte[] encoded = b.encode(data);
        String s = new String(encoded);
        assertTrue(s.contains("\n"));
    }

    @Test
    public void testConstructor_nullLineSeparator_disablesChunking() {
        Base64 b = new Base64(76, null);
        byte[] data = "Hello World, this is a longer test string!!".getBytes();
        byte[] encoded = b.encode(data);
        String s = new String(encoded);
        assertFalse(s.contains("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_lineSeparatorContainsBase64Char_throwsException() {
        byte[] sep = {'A', 'B'};
        new Base64(4, sep);
    }

    @Test
    public void testConstructor_lineLengthUrlSafe_encodeSizeProper() {
        Base64 b = new Base64(76, new byte[]{'\r', '\n'}, true);
        byte[] data = "abc".getBytes();
        byte[] encoded = b.encode(data);
        assertNotNull(encoded);
    }

    // ---------- isUrlSafe ----------

    @Test
    public void testIsUrlSafe_standardTable_returnsFalse() {
        Base64 b = new Base64(0, new byte[]{'\r', '\n'}, false);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testIsUrlSafe_urlSafeTable_returnsTrue() {
        Base64 b = new Base64(0, new byte[]{'\r', '\n'}, true);
        assertTrue(b.isUrlSafe());
    }

    // ---------- hasData / avail (package-private but tested via same package) ----------

    @Test
    public void testHasData_afterReset_falseInitially() {
        Base64 b = new Base64();
        assertFalse(b.hasData());
    }

    @Test
    public void testAvail_noBuffer_returnsZero() {
        Base64 b = new Base64();
        assertEquals(0, b.avail());
    }

    // ---------- encode(byte[]) ----------

    @Test
    public void testEncode_normalInput_returnsExpected() {
        byte[] data = "Hello".getBytes();
        byte[] encoded = base64.encode(data);
        String result = new String(encoded);
        assertEquals("SGVsbG8=", result.trim());
    }

    @Test
    public void testEncode_nullInput_returnsNull() {
        byte[] result = base64.encode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testEncode_emptyInput_returnsEmpty() {
        byte[] result = base64.encode(new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncode_oneByteModulus1_padsWithEquals() {
        byte[] data = "A".getBytes();
        byte[] encoded = base64.encode(data);
        String result = new String(encoded).trim();
        assertTrue(result.endsWith("=="));
    }

    @Test
    public void testEncode_twoBytesModulus2_padsWithSingleEquals() {
        byte[] data = "AB".getBytes();
        byte[] encoded = base64.encode(data);
        String result = new String(encoded).trim();
        assertTrue(result.endsWith("="));
        assertFalse(result.endsWith("=="));
    }

    @Test
    public void testEncode_threeBytesModulus0_noPadding() {
        byte[] data = "ABC".getBytes();
        byte[] encoded = base64.encode(data);
        String result = new String(encoded).trim();
        assertFalse(result.endsWith("="));
    }

    @Test
    public void testEncode_urlSafeMode_noPadding() {
        Base64 urlSafeB64 = new Base64(true);
        byte[] data = "A".getBytes();
        byte[] encoded = urlSafeB64.encode(data);
        String result = new String(encoded).trim();
        assertFalse(result.contains("="));
    }

    @Test
    public void testEncode_largeDataWithChunking_containsLineSeparator() {
        Base64 chunkedB64 = new Base64(true); // MIME_CHUNK_SIZE, CRLF
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) ('A' + (i % 26));
        }
        byte[] encoded = chunkedB64.encode(data);
        String result = new String(encoded);
        assertTrue(result.contains("\r\n"));
    }

    // ---------- encodeToString ----------

    @Test
    public void testEncodeToString_normalInput_returnsExpectedString() {
        byte[] data = "Hello".getBytes();
        String result = base64.encodeToString(data);
        assertEquals("SGVsbG8=", result.trim());
    }

    @Test
    public void testEncodeToString_emptyInput_returnsEmptyString() {
        String result = base64.encodeToString(new byte[0]);
        assertEquals("", result);
    }

    // ---------- encode(Object) ----------

    @Test
    public void testEncodeObject_byteArray_returnsEncodedByteArray() throws EncoderException {
        byte[] data = "Test".getBytes();
        Object result = base64.encode((Object) data);
        assertTrue(result instanceof byte[]);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_nonByteArray_throwsEncoderException() throws EncoderException {
        base64.encode((Object) "not a byte array");
    }

    // ---------- decode(byte[]) ----------

    @Test
    public void testDecode_normalInput_returnsExpectedBytes() {
        byte[] encoded = "SGVsbG8=".getBytes();
        byte[] decoded = base64.decode(encoded);
        assertEquals("Hello", new String(decoded));
    }

    @Test
    public void testDecode_nullInput_returnsNull() {
        byte[] result = base64.decode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testDecode_emptyInput_returnsEmpty() {
        byte[] result = base64.decode(new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testDecode_withPadding_stopsAtPad() {
        byte[] encoded = "QQ==".getBytes();
        byte[] decoded = base64.decode(encoded);
        assertEquals("A", new String(decoded));
    }

    @Test
    public void testDecode_withoutPadding_stillDecodes() {
        byte[] encoded = "QQ".getBytes();
        byte[] decoded = base64.decode(encoded);
        assertEquals("A", new String(decoded));
    }

    @Test
    public void testDecode_withWhitespace_ignoresWhitespace() {
        byte[] encoded = "SGVs\r\nbG8=".getBytes();
        byte[] decoded = base64.decode(encoded);
        assertEquals("Hello", new String(decoded));
    }

    @Test
    public void testDecode_modulus2Case_decodesOneByte() {
        byte[] encoded = "QQ".getBytes(); // modulus 2 remainder handling
        byte[] decoded = base64.decode(encoded);
        assertEquals(1, decoded.length);
    }

    @Test
    public void testDecode_modulus3Case_decodesTwoBytes() {
        byte[] encoded = "QUI".getBytes(); // 3 chars -> modulus 3 remainder
        byte[] decoded = base64.decode(encoded);
        assertEquals(2, decoded.length);
    }

    @Test
    public void testDecode_urlSafeCharacters_decodesCorrectly() {
        byte[] data = "Hello World! This has / and + chars".getBytes();
        byte[] encoded = Base64.encodeBase64URLSafe(data);
        byte[] decoded = base64.decode(encoded);
        assertEquals(new String(data), new String(decoded));
    }

    // ---------- decode(String) ----------

    @Test
    public void testDecodeString_normalInput_returnsExpectedBytes() {
        byte[] decoded = base64.decode("SGVsbG8=");
        assertEquals("Hello", new String(decoded));
    }

    @Test
    public void testDecodeString_emptyString_returnsEmptyArray() {
        byte[] decoded = base64.decode("");
        assertEquals(0, decoded.length);
    }

    // ---------- decode(Object) ----------

    @Test
    public void testDecodeObject_byteArray_returnsDecodedBytes() throws DecoderException {
        Object result = base64.decode((Object) "SGVsbG8=".getBytes());
        assertTrue(result instanceof byte[]);
        assertEquals("Hello", new String((byte[]) result));
    }

    @Test
    public void testDecodeObject_string_returnsDecodedBytes() throws DecoderException {
        Object result = base64.decode((Object) "SGVsbG8=");
        assertTrue(result instanceof byte[]);
        assertEquals("Hello", new String((byte[]) result));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_invalidType_throwsDecoderException() throws DecoderException {
        base64.decode((Object) Integer.valueOf(5));
    }

    // ---------- isBase64(byte) ----------

    @Test
    public void testIsBase64Byte_validCharacter_returnsTrue() {
        assertTrue(Base64.isBase64((byte) 'A'));
    }

    @Test
    public void testIsBase64Byte_padCharacter_returnsTrue() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64Byte_invalidCharacter_returnsFalse() {
        assertFalse(Base64.isBase64((byte) '!'));
    }

    @Test
    public void testIsBase64Byte_negativeValue_returnsFalse() {
        assertFalse(Base64.isBase64((byte) -5));
    }

    @Test
    public void testIsBase64Byte_outOfBoundValue_returnsFalse() {
        assertFalse(Base64.isBase64((byte) 127));
    }

    // ---------- isBase64(String) ----------

    @Test
    public void testIsBase64String_validString_returnsTrue() {
        assertTrue(Base64.isBase64("SGVsbG8="));
    }

    @Test
    public void testIsBase64String_emptyString_returnsTrue() {
        assertTrue(Base64.isBase64(""));
    }

    @Test
    public void testIsBase64String_invalidString_returnsFalse() {
        assertFalse(Base64.isBase64("Hello!@#"));
    }

    // ---------- isBase64(byte[]) ----------

    @Test
    public void testIsBase64ByteArray_validArray_returnsTrue() {
        assertTrue(Base64.isBase64("SGVsbG8=".getBytes()));
    }

    @Test
    public void testIsBase64ByteArray_emptyArray_returnsTrue() {
        assertTrue(Base64.isBase64(new byte[0]));
    }

    @Test
    public void testIsBase64ByteArray_withWhitespace_returnsTrue() {
        assertTrue(Base64.isBase64("SGVs\r\nbG8=".getBytes()));
    }

    @Test
    public void testIsBase64ByteArray_withInvalidChar_returnsFalse() {
        assertFalse(Base64.isBase64("Hello!".getBytes()));
    }

    // ---------- isArrayByteBase64 (deprecated) ----------

    @Test
    public void testIsArrayByteBase64_validArray_returnsTrue() {
        assertTrue(Base64.isArrayByteBase64("SGVsbG8=".getBytes()));
    }

    @Test
    public void testIsArrayByteBase64_invalidArray_returnsFalse() {
        assertFalse(Base64.isArrayByteBase64("!!!".getBytes()));
    }

    // ---------- encodeBase64(byte[]) ----------

    @Test
    public void testEncodeBase64_normalInput_returnsCorrectEncoding() {
        byte[] result = Base64.encodeBase64("Hello".getBytes());
        assertEquals("SGVsbG8=", new String(result));
    }

    @Test
    public void testEncodeBase64_nullInput_returnsNull() {
        assertNull(Base64.encodeBase64((byte[]) null));
    }

    @Test
    public void testEncodeBase64_emptyInput_returnsEmpty() {
        byte[] result = Base64.encodeBase64(new byte[0]);
        assertEquals(0, result.length);
    }

    // ---------- encodeBase64String ----------

    @Test
    public void testEncodeBase64String_normalInput_returnsCorrectString() {
        String result = Base64.encodeBase64String("Hello".getBytes());
        assertEquals("SGVsbG8=", result);
    }

    // ---------- encodeBase64URLSafe ----------

    @Test
    public void testEncodeBase64URLSafe_normalInput_noPadding() {
        byte[] result = Base64.encodeBase64URLSafe("A".getBytes());
        String s = new String(result);
        assertFalse(s.contains("="));
    }

    // ---------- encodeBase64URLSafeString ----------

    @Test
    public void testEncodeBase64URLSafeString_normalInput_returnsCorrectString() {
        String result = Base64.encodeBase64URLSafeString("A".getBytes());
        assertFalse(result.contains("="));
    }

    // ---------- encodeBase64Chunked ----------

    @Test
    public void testEncodeBase64Chunked_largeInput_containsLineSeparator() {
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) ('A' + (i % 26));
        }
        byte[] result = Base64.encodeBase64Chunked(data);
        String s = new String(result);
        assertTrue(s.contains("\r\n"));
    }

    // ---------- encodeBase64(byte[], boolean) ----------

    @Test
    public void testEncodeBase64_chunkedTrue_containsSeparator() {
        byte[] data = new byte[100];
        byte[] result = Base64.encodeBase64(data, true);
        String s = new String(result);
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64_chunkedFalse_noSeparator() {
        byte[] data = new byte[100];
        byte[] result = Base64.encodeBase64(data, false);
        String s = new String(result);
        assertFalse(s.contains("\r\n"));
    }

    // ---------- encodeBase64(byte[], boolean, boolean) ----------

    @Test
    public void testEncodeBase64_urlSafeTrue_noPlusOrSlash() {
        byte[] data = {(byte) 0xFB, (byte) 0xFF, (byte) 0xFF};
        byte[] result = Base64.encodeBase64(data, false, true);
        String s = new String(result);
        assertFalse(s.contains("+"));
        assertFalse(s.contains("/"));
    }

    // ---------- encodeBase64(byte[], boolean, boolean, int) ----------

    @Test
    public void testEncodeBase64_withMaxResultSize_success() {
        byte[] data = "Hello".getBytes();
        byte[] result = Base64.encodeBase64(data, false, false, 100);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_exceedsMaxResultSize_throwsException() {
        byte[] data = new byte[1000];
        Base64.encodeBase64(data, false, false, 10);
    }

    @Test
    public void testEncodeBase64_nullInputWithMaxSize_returnsNull() {
        byte[] result = Base64.encodeBase64(null, false, false, 100);
        assertNull(result);
    }

    @Test
    public void testEncodeBase64_emptyInputWithMaxSize_returnsEmpty() {
        byte[] result = Base64.encodeBase64(new byte[0], false, false, 100);
        assertEquals(0, result.length);
    }

    // ---------- decodeBase64(String) ----------

    @Test
    public void testDecodeBase64String_normalInput_returnsExpectedBytes() {
        byte[] result = Base64.decodeBase64("SGVsbG8=");
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeBase64String_emptyString_returnsEmptyArray() {
        byte[] result = Base64.decodeBase64("");
        assertEquals(0, result.length);
    }

    // ---------- decodeBase64(byte[]) ----------

    @Test
    public void testDecodeBase64ByteArray_normalInput_returnsExpectedBytes() {
        byte[] result = Base64.decodeBase64("SGVsbG8=".getBytes());
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeBase64ByteArray_nullInput_returnsNull() {
        byte[] result = Base64.decodeBase64((byte[]) null);
        assertNull(result);
    }

    // ---------- decodeInteger ----------

    @Test
    public void testDecodeInteger_validEncodedInteger_returnsCorrectBigInteger() {
        BigInteger original = BigInteger.valueOf(123456789L);
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    // ---------- encodeInteger ----------

    @Test
    public void testEncodeInteger_positiveValue_returnsNonNullEncoding() {
        BigInteger value = BigInteger.valueOf(255);
        byte[] result = Base64.encodeInteger(value);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_nullValue_throwsNullPointerException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeInteger_zeroValue_returnsValidEncoding() {
        BigInteger value = BigInteger.ZERO;
        byte[] result = Base64.encodeInteger(value);
        assertNotNull(result);
    }

    @Test
    public void testEncodeInteger_largeValue_roundTripsCorrectly() {
        BigInteger value = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(value);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(value, decoded);
    }

    @Test
    public void testEncodeInteger_byteAlignedValue_handlesSignBitCorrectly() {
        // Choosing a value whose bitLength is exactly byte-aligned (multiple of 8)
        BigInteger value = new BigInteger("255"); // 8 bits, all 1's -> sign consideration
        byte[] encoded = Base64.encodeInteger(value);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(value, decoded);
    }

    @Test
    public void testEncodeInteger_negativeStoredAsPositive_roundTrips() {
        // encodeInteger uses toIntegerBytes which handles sign; test large power-of-two boundary
        BigInteger value = BigInteger.valueOf(256); // bitLength 9
        byte[] encoded = Base64.encodeInteger(value);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(value, decoded);
    }

    // ---------- roundtrip / integration tests ----------

    @Test
    public void testEncodeDecodeRoundTrip_variousLengths_success() {
        for (int len = 0; len < 10; len++) {
            byte[] data = new byte[len];
            for (int i = 0; i < len; i++) {
                data[i] = (byte) i;
            }
            byte[] encoded = Base64.encodeBase64(data);
            byte[] decoded = Base64.decodeBase64(encoded);
            assertArrayEquals(data, decoded);
        }
    }

    @Test
    public void testEncodeDecodeRoundTrip_binaryData_success() {
        byte[] data = new byte[256];
        for (int i = 0; i < 256; i++) {
            data[i] = (byte) (i - 128);
        }
        byte[] encoded = Base64.encodeBase64(data);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecodeRoundTrip_withChunking_success() {
        byte[] data = new byte[200];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 128);
        }
        byte[] encoded = Base64.encodeBase64Chunked(data);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testMimeChunkSize_isCorrectValue() {
        assertEquals(76, Base64.MIME_CHUNK_SIZE);
    }

    @Test
    public void testPemChunkSize_isCorrectValue() {
        assertEquals(64, Base64.PEM_CHUNK_SIZE);
    }
}
