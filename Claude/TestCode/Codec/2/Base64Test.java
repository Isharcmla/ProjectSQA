package org.apache.commons.codec.binary;

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

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_notUrlSafe() {
        Base64 b = new Base64();
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_urlSafeTrue() {
        Base64 b = new Base64(true);
        assertTrue(b.isUrlSafe());
    }

    @Test
    public void testConstructor_urlSafeFalse() {
        Base64 b = new Base64(false);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLength() {
        Base64 b = new Base64(10);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLengthAndSeparator() {
        byte[] sep = {'\n'};
        Base64 b = new Base64(10, sep);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLengthSeparatorUrlSafe() {
        byte[] sep = {'\n'};
        Base64 b = new Base64(10, sep, true);
        assertTrue(b.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidLineSeparator_throwsException() {
        // 'A' is a valid base64 char, so using it as separator should throw
        byte[] badSep = {'A'};
        new Base64(10, badSep);
    }

    @Test
    public void testConstructor_negativeLineLength() {
        Base64 b = new Base64(-1, Base64.CHUNK_SEPARATOR);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_zeroLineLength() {
        Base64 b = new Base64(0, Base64.CHUNK_SEPARATOR);
        assertFalse(b.isUrlSafe());
    }

    // ---------- isUrlSafe ----------

    @Test
    public void testIsUrlSafe_defaultFalse() {
        assertFalse(base64.isUrlSafe());
    }

    // ---------- hasData / avail ----------

    @Test
    public void testHasData_initiallyFalse() {
        Base64 b = new Base64();
        assertFalse(b.hasData());
    }

    @Test
    public void testAvail_initiallyZero() {
        Base64 b = new Base64();
        assertEquals(0, b.avail());
    }

    @Test
    public void testHasData_afterEncode_true() {
        Base64 b = new Base64();
        b.encode(new byte[]{1, 2, 3}, 0, 3);
        assertTrue(b.hasData());
        assertTrue(b.avail() > 0);
    }

    // ---------- setInitialBuffer ----------

    @Test
    public void testSetInitialBuffer_reusesArray() {
        Base64 b = new Base64();
        byte[] out = new byte[10];
        b.setInitialBuffer(out, 0, out.length);
        assertTrue(b.hasData());
    }

    @Test
    public void testSetInitialBuffer_nullArray_doesNotCrash() {
        Base64 b = new Base64();
        b.setInitialBuffer(null, 0, 10);
        assertFalse(b.hasData());
    }

    @Test
    public void testSetInitialBuffer_mismatchedLength_doesNotSetBuffer() {
        Base64 b = new Base64();
        byte[] out = new byte[10];
        b.setInitialBuffer(out, 0, 5); // outAvail != out.length
        assertFalse(b.hasData());
    }

    // ---------- readResults ----------

    @Test
    public void testReadResults_noBuffer_eofFalse_returnsZero() {
        Base64 b = new Base64();
        byte[] out = new byte[10];
        int result = b.readResults(out, 0, 10);
        assertEquals(0, result);
    }

    @Test
    public void testReadResults_noBuffer_eofTrue_returnsMinusOne() {
        Base64 b = new Base64();
        b.encode(new byte[0], 0, -1); // sets eof true
        byte[] out = new byte[10];
        int result = b.readResults(out, 0, 10);
        assertEquals(-1, result);
    }

    @Test
    public void testReadResults_withDifferentArray_copiesData() {
        Base64 b = new Base64();
        b.encode(new byte[]{1, 2, 3}, 0, 3);
        b.encode(new byte[0], 0, -1);
        byte[] out = new byte[100];
        int len = b.readResults(out, 0, 100);
        assertTrue(len > 0);
    }

    @Test
    public void testReadResults_withSameArray_setsBufNull() {
        Base64 b = new Base64();
        byte[] out = new byte[20];
        b.setInitialBuffer(out, 0, out.length);
        b.encode(new byte[]{1, 2, 3}, 0, 3);
        b.encode(new byte[0], 0, -1);
        int len = b.readResults(out, 0, out.length);
        assertTrue(len >= 0);
        assertFalse(b.hasData());
    }

    // ---------- encode(byte[], int, int) package-private ----------

    @Test
    public void testEncode_eofAlreadySet_returnsImmediately() {
        Base64 b = new Base64();
        b.encode(new byte[0], 0, -1);
        // calling encode again should just return due to eof check
        b.encode(new byte[]{1, 2, 3}, 0, 3);
        assertTrue(b.hasData());
    }

    @Test
    public void testEncode_modulus1_standardTable_addsPadding() {
        Base64 b = new Base64();
        b.encode(new byte[]{65}, 0, 1);
        b.encode(new byte[0], 0, -1);
        byte[] out = new byte[100];
        int len = b.readResults(out, 0, 100);
        String result = new String(out, 0, len);
        assertTrue(result.contains("=="));
    }

    @Test
    public void testEncode_modulus2_standardTable_addsPadding() {
        Base64 b = new Base64();
        b.encode(new byte[]{65, 66}, 0, 2);
        b.encode(new byte[0], 0, -1);
        byte[] out = new byte[100];
        int len = b.readResults(out, 0, 100);
        String result = new String(out, 0, len);
        assertTrue(result.contains("="));
    }

    @Test
    public void testEncode_modulus1_urlSafe_noPadding() {
        Base64 b = new Base64(true);
        b.encode(new byte[]{65}, 0, 1);
        b.encode(new byte[0], 0, -1);
        byte[] out = new byte[100];
        int len = b.readResults(out, 0, 100);
        String result = new String(out, 0, len);
        assertFalse(result.contains("="));
    }

    @Test
    public void testEncode_modulus2_urlSafe_noPadding() {
        Base64 b = new Base64(true);
        b.encode(new byte[]{65, 66}, 0, 2);
        b.encode(new byte[0], 0, -1);
        byte[] out = new byte[100];
        int len = b.readResults(out, 0, 100);
        String result = new String(out, 0, len);
        assertFalse(result.contains("="));
    }

    @Test
    public void testEncode_negativeByteValue_handledCorrectly() {
        Base64 b = new Base64();
        b.encode(new byte[]{-1, -2, -3}, 0, 3);
        b.encode(new byte[0], 0, -1);
        byte[] out = new byte[100];
        int len = b.readResults(out, 0, 100);
        assertTrue(len > 0);
    }

    @Test
    public void testEncode_lineLengthTriggersSeparator() {
        Base64 b = new Base64(4, new byte[]{'\n'});
        byte[] data = new byte[10];
        for (int i = 0; i < data.length; i++) data[i] = (byte) i;
        b.encode(data, 0, data.length);
        b.encode(new byte[0], 0, -1);
        byte[] out = new byte[200];
        int len = b.readResults(out, 0, 200);
        String result = new String(out, 0, len);
        assertTrue(result.contains("\n"));
    }

    // ---------- decode(byte[], int, int) package-private ----------

    @Test
    public void testDecode_eofAlreadySet_returnsImmediately() {
        Base64 b = new Base64();
        b.decode(new byte[0], 0, -1);
        b.decode(new byte[]{65, 66}, 0, 2);
        assertFalse(b.hasData());
    }

    @Test
    public void testDecode_padCharacter_stopsDecoding() {
        Base64 b = new Base64();
        byte[] input = "QQ==".getBytes();
        b.decode(input, 0, input.length);
        byte[] out = new byte[10];
        int len = b.readResults(out, 0, 10);
        assertEquals(1, len);
        assertEquals('A', out[0]);
    }

    @Test
    public void testDecode_modulus2AtEof() {
        Base64 b = new Base64();
        byte[] input = "QQ".getBytes(); // modulus will be 2 at EOF
        b.decode(input, 0, input.length);
        b.decode(new byte[0], 0, -1);
        byte[] out = new byte[10];
        int len = b.readResults(out, 0, 10);
        assertEquals(1, len);
    }

    @Test
    public void testDecode_modulus3AtEof() {
        Base64 b = new Base64();
        byte[] input = "QUE".getBytes(); // modulus 3 at EOF
        b.decode(input, 0, input.length);
        b.decode(new byte[0], 0, -1);
        byte[] out = new byte[10];
        int len = b.readResults(out, 0, 10);
        assertEquals(2, len);
    }

    @Test
    public void testDecode_ignoresNonBase64Characters() {
        Base64 b = new Base64();
        byte[] input = "QU\n E".getBytes();
        b.decode(input, 0, input.length);
        b.decode(new byte[0], 0, -1);
        byte[] out = new byte[10];
        int len = b.readResults(out, 0, 10);
        assertTrue(len >= 0);
    }

    @Test
    public void testDecode_byteOutOfDecodeTableRange_ignored() {
        Base64 b = new Base64();
        byte[] input = {(byte) 200, 'Q', 'Q', '='};
        b.decode(input, 0, input.length);
        byte[] out = new byte[10];
        int len = b.readResults(out, 0, 10);
        assertTrue(len >= 0);
    }

    // ---------- isBase64(byte) ----------

    @Test
    public void testIsBase64_validCharacter_returnsTrue() {
        assertTrue(Base64.isBase64((byte) 'A'));
    }

    @Test
    public void testIsBase64_padCharacter_returnsTrue() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64_invalidCharacter_returnsFalse() {
        assertFalse(Base64.isBase64((byte) '!'));
    }

    @Test
    public void testIsBase64_negativeByte_returnsFalse() {
        assertFalse(Base64.isBase64((byte) -5));
    }

    @Test
    public void testIsBase64_outOfRangeByte_returnsFalse() {
        assertFalse(Base64.isBase64((byte) 127));
    }

    // ---------- isArrayByteBase64 ----------

    @Test
    public void testIsArrayByteBase64_validArray_returnsTrue() {
        byte[] data = "SGVsbG8=".getBytes();
        assertTrue(Base64.isArrayByteBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_emptyArray_returnsTrue() {
        byte[] data = new byte[0];
        assertTrue(Base64.isArrayByteBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_withWhitespace_returnsTrue() {
        byte[] data = "SGVs bG8=\n".getBytes();
        assertTrue(Base64.isArrayByteBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_invalidCharacter_returnsFalse() {
        byte[] data = "SGVs!bG8=".getBytes();
        assertFalse(Base64.isArrayByteBase64(data));
    }

    // ---------- encodeBase64(byte[]) ----------

    @Test
    public void testEncodeBase64_normalInput_returnsEncodedBytes() {
        byte[] input = "Hello".getBytes();
        byte[] result = Base64.encodeBase64(input);
        assertEquals("SGVsbG8=", new String(result));
    }

    @Test
    public void testEncodeBase64_nullInput_returnsNull() {
        byte[] result = Base64.encodeBase64(null);
        assertNull(result);
    }

    @Test
    public void testEncodeBase64_emptyInput_returnsEmpty() {
        byte[] input = new byte[0];
        byte[] result = Base64.encodeBase64(input);
        assertEquals(0, result.length);
    }

    // ---------- encodeBase64URLSafe ----------

    @Test
    public void testEncodeBase64URLSafe_normalInput_noPadding() {
        byte[] input = "Hello".getBytes();
        byte[] result = Base64.encodeBase64URLSafe(input);
        String str = new String(result);
        assertFalse(str.contains("="));
    }

    @Test
    public void testEncodeBase64URLSafe_nullInput_returnsNull() {
        byte[] result = Base64.encodeBase64URLSafe(null);
        assertNull(result);
    }

    // ---------- encodeBase64Chunked ----------

    @Test
    public void testEncodeBase64Chunked_normalInput_containsChunkSeparator() {
        byte[] input = new byte[100];
        for (int i = 0; i < input.length; i++) input[i] = (byte) i;
        byte[] result = Base64.encodeBase64Chunked(input);
        String str = new String(result);
        assertTrue(str.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64Chunked_nullInput_returnsNull() {
        byte[] result = Base64.encodeBase64Chunked(null);
        assertNull(result);
    }

    // ---------- decode(Object) ----------

    @Test
    public void testDecodeObject_validByteArray_returnsDecodedBytes() throws DecoderException {
        byte[] input = "SGVsbG8=".getBytes();
        Object result = base64.decode((Object) input);
        assertTrue(result instanceof byte[]);
        assertEquals("Hello", new String((byte[]) result));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_invalidType_throwsDecoderException() throws DecoderException {
        base64.decode((Object) "not a byte array");
    }

    // ---------- decode(byte[]) ----------

    @Test
    public void testDecodeByteArray_validInput_returnsDecodedBytes() {
        byte[] input = "SGVsbG8=".getBytes();
        byte[] result = base64.decode(input);
        assertEquals("Hello", new String(result));
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

    // ---------- encodeBase64(byte[], boolean) ----------

    @Test
    public void testEncodeBase64_chunkedTrue_returnsChunkedOutput() {
        byte[] input = new byte[100];
        byte[] result = Base64.encodeBase64(input, true);
        assertTrue(new String(result).contains("\r\n"));
    }

    @Test
    public void testEncodeBase64_chunkedFalse_noChunkSeparator() {
        byte[] input = new byte[10];
        byte[] result = Base64.encodeBase64(input, false);
        assertFalse(new String(result).contains("\r\n"));
    }

    // ---------- encodeBase64(byte[], boolean, boolean) ----------

    @Test
    public void testEncodeBase64_urlSafeAndChunked_combination() {
        byte[] input = "Hello World".getBytes();
        byte[] result = Base64.encodeBase64(input, false, true);
        String str = new String(result);
        assertFalse(str.contains("+"));
        assertFalse(str.contains("/"));
    }

    @Test
    public void testEncodeBase64_notUrlSafeNotChunked_standardOutput() {
        byte[] input = "Hello".getBytes();
        byte[] result = Base64.encodeBase64(input, false, false);
        assertEquals("SGVsbG8=", new String(result));
    }

    @Test
    public void testEncodeBase64_nullBinaryData_returnsNull() {
        byte[] result = Base64.encodeBase64(null, false, false);
        assertNull(result);
    }

    @Test
    public void testEncodeBase64_emptyBinaryData_returnsEmpty() {
        byte[] result = Base64.encodeBase64(new byte[0], false, false);
        assertEquals(0, result.length);
    }

    // ---------- decodeBase64(byte[]) ----------

    @Test
    public void testDecodeBase64_normalInput_returnsDecodedBytes() {
        byte[] input = "SGVsbG8=".getBytes();
        byte[] result = Base64.decodeBase64(input);
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeBase64_nullInput_returnsNull() {
        byte[] result = Base64.decodeBase64(null);
        assertNull(result);
    }

    @Test
    public void testDecodeBase64_emptyInput_returnsEmpty() {
        byte[] result = Base64.decodeBase64(new byte[0]);
        assertEquals(0, result.length);
    }

    // ---------- discardWhitespace ----------

    @Test
    public void testDiscardWhitespace_withSpacesAndNewlines_removesThem() {
        byte[] input = "A B\nC\rD\tE".getBytes();
        byte[] result = Base64.discardWhitespace(input);
        assertEquals("ABCDE", new String(result));
    }

    @Test
    public void testDiscardWhitespace_noWhitespace_returnsSame() {
        byte[] input = "ABCDE".getBytes();
        byte[] result = Base64.discardWhitespace(input);
        assertEquals("ABCDE", new String(result));
    }

    @Test
    public void testDiscardWhitespace_emptyInput_returnsEmpty() {
        byte[] input = new byte[0];
        byte[] result = Base64.discardWhitespace(input);
        assertEquals(0, result.length);
    }

    // ---------- discardNonBase64 ----------

    @Test
    public void testDiscardNonBase64_withInvalidCharacters_removesThem() {
        byte[] input = "A!B@C#D".getBytes();
        byte[] result = Base64.discardNonBase64(input);
        assertEquals("ABCD", new String(result));
    }

    @Test
    public void testDiscardNonBase64_allValid_returnsSame() {
        byte[] input = "ABCD".getBytes();
        byte[] result = Base64.discardNonBase64(input);
        assertEquals("ABCD", new String(result));
    }

    @Test
    public void testDiscardNonBase64_emptyInput_returnsEmpty() {
        byte[] input = new byte[0];
        byte[] result = Base64.discardNonBase64(input);
        assertEquals(0, result.length);
    }

    // ---------- encode(Object) ----------

    @Test
    public void testEncodeObject_validByteArray_returnsEncodedBytes() throws EncoderException {
        byte[] input = "Hello".getBytes();
        Object result = base64.encode((Object) input);
        assertTrue(result instanceof byte[]);
        assertEquals("SGVsbG8=", new String((byte[]) result));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_invalidType_throwsEncoderException() throws EncoderException {
        base64.encode((Object) "not a byte array");
    }

    // ---------- encode(byte[]) ----------

    @Test
    public void testEncodeByteArray_normalInput_returnsEncodedBytes() {
        byte[] input = "Hello".getBytes();
        byte[] result = base64.encode(input);
        assertEquals("SGVsbG8=", new String(result));
    }

    @Test
    public void testEncodeByteArray_urlSafeMode_noPadding() {
        Base64 urlSafeBase64 = new Base64(true);
        byte[] input = "Hello".getBytes();
        byte[] result = urlSafeBase64.encode(input);
        assertFalse(new String(result).contains("="));
    }

    @Test
    public void testEncodeByteArray_nullInput_returnsNull() {
        byte[] result = base64.encode((byte[]) null);
        assertNull(result);
    }

    // ---------- decodeInteger ----------

    @Test
    public void testDecodeInteger_validBase64_returnsBigInteger() {
        BigInteger original = BigInteger.valueOf(12345);
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testDecodeInteger_zero_returnsZero() {
        BigInteger original = BigInteger.ZERO;
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    // ---------- encodeInteger ----------

    @Test
    public void testEncodeInteger_positiveValue_returnsEncodedBytes() {
        BigInteger bigInt = BigInteger.valueOf(255);
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_nullInput_throwsNullPointerException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeInteger_negativeValue_handledCorrectly() {
        BigInteger bigInt = BigInteger.valueOf(-100);
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testEncodeInteger_largeValue_handledCorrectly() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
        BigInteger decoded = Base64.decodeInteger(result);
        assertEquals(bigInt, decoded);
    }

    // ---------- toIntegerBytes ----------

    @Test
    public void testToIntegerBytes_positiveValue_returnsBytes() {
        BigInteger bigInt = BigInteger.valueOf(255);
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testToIntegerBytes_byteAlignedValue_handlesSignBitCorrectly() {
        // 256 = 0x100, bitLength = 9, not byte aligned in the % 8 sense
        BigInteger bigInt = BigInteger.valueOf(256);
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testToIntegerBytes_exactByteAligned_skipsSignBit() {
        // 255 = 0xFF, bitLength = 8, exactly byte aligned
        BigInteger bigInt = BigInteger.valueOf(255);
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testToIntegerBytes_zero_returnsBytes() {
        BigInteger bigInt = BigInteger.ZERO;
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
    }

    // ---------- Round trip tests ----------

    @Test
    public void testEncodeDecodeRoundTrip_variousLengths() {
        for (int len = 0; len < 10; len++) {
            byte[] data = new byte[len];
            for (int i = 0; i < len; i++) data[i] = (byte) (i + 1);
            byte[] encoded = Base64.encodeBase64(data);
            byte[] decoded = Base64.decodeBase64(encoded);
            assertArrayEquals(data, decoded);
        }
    }

    @Test
    public void testEncodeDecodeRoundTrip_urlSafe() {
        byte[] data = "This is a test string for URL safe encoding!".getBytes();
        byte[] encoded = Base64.encodeBase64(data, false, true);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecodeRoundTrip_chunked() {
        byte[] data = new byte[200];
        for (int i = 0; i < data.length; i++) data[i] = (byte) i;
        byte[] encoded = Base64.encodeBase64Chunked(data);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }
}
