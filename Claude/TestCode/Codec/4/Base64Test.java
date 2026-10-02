package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Base64Test {

    private Base64 base64;

    @Before
    public void setUp() {
        base64 = new Base64();
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_isUrlSafeFalse() {
        Base64 b = new Base64();
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_urlSafeTrue_isUrlSafeTrue() {
        Base64 b = new Base64(true);
        assertTrue(b.isUrlSafe());
    }

    @Test
    public void testConstructor_urlSafeFalse_isUrlSafeFalse() {
        Base64 b = new Base64(false);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLength_normal() {
        Base64 b = new Base64(10);
        assertFalse(b.isUrlSafe());
        byte[] result = b.encode("Hello World Testing".getBytes());
        assertNotNull(result);
    }

    @Test
    public void testConstructor_lineLengthAndSeparator() {
        byte[] sep = new byte[]{'\n'};
        Base64 b = new Base64(4, sep);
        assertFalse(b.isUrlSafe());
    }

    @Test
    public void testConstructor_nullLineSeparator_disablesChunking() {
        Base64 b = new Base64(76, null);
        byte[] data = new byte[100];
        byte[] result = b.encode(data);
        // should not contain CRLF since chunking is disabled
        boolean containsCR = false;
        for (byte bb : result) {
            if (bb == '\r') {
                containsCR = true;
                break;
            }
        }
        assertFalse(containsCR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidLineSeparator_throwsIllegalArgumentException() {
        byte[] invalidSep = new byte[]{'A'};
        new Base64(10, invalidSep);
    }

    // ---------- isUrlSafe ----------

    @Test
    public void testIsUrlSafe_default_false() {
        assertFalse(base64.isUrlSafe());
    }

    // ---------- hasData / avail (package-private) ----------

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
    public void testEncodeStreaming_hasDataAndAvail() {
        Base64 b = new Base64();
        byte[] data = "Man".getBytes();
        b.encode(data, 0, data.length);
        assertTrue(b.hasData());
        assertTrue(b.avail() > 0);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        int n = b.readResults(result, 0, result.length);
        assertEquals(result.length, n);
        assertEquals("TWFu", new String(result));
    }

    // ---------- readResults edge case ----------

    @Test
    public void testReadResults_eofAndNoBuffer_returnsMinusOne() {
        Base64 b = new Base64();
        b.decode(new byte[0], 0, -1);
        assertFalse(b.hasData());
        int result = b.readResults(new byte[10], 0, 10);
        assertEquals(-1, result);
    }

    // ---------- encode/decode streaming modulus branches ----------

    @Test
    public void testEncodeStreaming_modulus1_oneByte() {
        Base64 b = new Base64();
        byte[] data = "A".getBytes();
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals("QQ==", new String(result));
    }

    @Test
    public void testEncodeStreaming_modulus2_twoBytes() {
        Base64 b = new Base64();
        byte[] data = "AB".getBytes();
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals("QUI=", new String(result));
    }

    @Test
    public void testEncodeStreaming_urlSafe_modulus1_noPadding() {
        Base64 b = new Base64(true);
        byte[] data = "A".getBytes();
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        String s = new String(result);
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncodeStreaming_urlSafe_modulus2_noPadding() {
        Base64 b = new Base64(true);
        byte[] data = "AB".getBytes();
        b.encode(data, 0, data.length);
        b.encode(data, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        String s = new String(result);
        assertFalse(s.contains("="));
    }

    @Test
    public void testDecodeStreaming_modulus2() {
        Base64 b = new Base64();
        byte[] in = "QQ".getBytes();
        b.decode(in, 0, in.length);
        b.decode(in, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals(1, result.length);
    }

    @Test
    public void testDecodeStreaming_modulus3() {
        Base64 b = new Base64();
        byte[] in = "QUJ".getBytes();
        b.decode(in, 0, in.length);
        b.decode(in, 0, -1);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals(2, result.length);
    }

    @Test
    public void testDecodeStreaming_withPadCharacter_stopsAtPad() {
        Base64 b = new Base64();
        byte[] in = "QQ==".getBytes();
        b.decode(in, 0, in.length);
        byte[] result = new byte[b.avail()];
        b.readResults(result, 0, result.length);
        assertEquals(1, result.length);
        assertEquals('A', result[0]);
    }

    @Test
    public void testDecodeStreaming_withInvalidCharacters_ignored() {
        Base64 b = new Base64();
        byte[] in = "Q~Q==".getBytes();
        b.decode(in, 0, in.length);
        byte[] result = new byte[b.avail()];
        int n = b.readResults(result, 0, result.length);
        assertTrue(n >= 0);
    }

    @Test
    public void testSetInitialBuffer_reusesArray() {
        Base64 b = new Base64();
        byte[] out = new byte[10];
        b.setInitialBuffer(out, 0, out.length);
        assertTrue(b.hasData());
    }

    // ---------- isBase64 ----------

    @Test
    public void testIsBase64_validChar_returnsTrue() {
        assertTrue(Base64.isBase64((byte) 'A'));
    }

    @Test
    public void testIsBase64_padChar_returnsTrue() {
        assertTrue(Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsBase64_invalidChar_returnsFalse() {
        assertFalse(Base64.isBase64((byte) ' '));
    }

    @Test
    public void testIsBase64_negativeByte_returnsFalse() {
        assertFalse(Base64.isBase64((byte) -1));
    }

    // ---------- isArrayByteBase64 ----------

    @Test
    public void testIsArrayByteBase64_validData_returnsTrue() {
        byte[] data = "QUJD".getBytes();
        assertTrue(Base64.isArrayByteBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_withWhitespace_returnsTrue() {
        byte[] data = "QU JD\r\n".getBytes();
        assertTrue(Base64.isArrayByteBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_invalidChar_returnsFalse() {
        byte[] data = "QU~JD".getBytes();
        assertFalse(Base64.isArrayByteBase64(data));
    }

    @Test
    public void testIsArrayByteBase64_emptyArray_returnsTrue() {
        byte[] data = new byte[0];
        assertTrue(Base64.isArrayByteBase64(data));
    }

    // ---------- static encodeBase64 methods ----------

    @Test
    public void testEncodeBase64_normalData() {
        byte[] data = "Hello World".getBytes();
        byte[] encoded = Base64.encodeBase64(data);
        assertNotNull(encoded);
        assertTrue(encoded.length > 0);
    }

    @Test
    public void testEncodeBase64_nullData_returnsNull() {
        byte[] result = Base64.encodeBase64(null);
        assertNull(result);
    }

    @Test
    public void testEncodeBase64_emptyData_returnsEmpty() {
        byte[] result = Base64.encodeBase64(new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncodeBase64Chunked_largeData_containsCRLF() {
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        byte[] encoded = Base64.encodeBase64Chunked(data);
        String s = new String(encoded);
        assertTrue(s.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64URLSafe_noPadding() {
        byte[] data = "A".getBytes();
        byte[] encoded = Base64.encodeBase64URLSafe(data);
        String s = new String(encoded);
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncodeBase64URLSafeString_noPadding() {
        byte[] data = "AB".getBytes();
        String s = Base64.encodeBase64URLSafeString(data);
        assertFalse(s.contains("="));
    }

    @Test
    public void testEncodeBase64String_normal() {
        byte[] data = "Hello".getBytes();
        String s = Base64.encodeBase64String(data);
        assertNotNull(s);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_maxResultSizeExceeded_throwsIllegalArgumentException() {
        byte[] data = new byte[1000];
        Base64.encodeBase64(data, false, false, 10);
    }

    @Test
    public void testEncodeBase64_withMaxResultSize_normal() {
        byte[] data = "Hi".getBytes();
        byte[] result = Base64.encodeBase64(data, false, false, 1000);
        assertNotNull(result);
    }

    // ---------- decodeBase64 static methods ----------

    @Test
    public void testDecodeBase64_string_normal() {
        byte[] result = Base64.decodeBase64("SGVsbG8=");
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeBase64_byteArray_normal() {
        byte[] encoded = "SGVsbG8=".getBytes();
        byte[] result = Base64.decodeBase64(encoded);
        assertEquals("Hello", new String(result));
    }

    // ---------- decode(Object) ----------

    @Test
    public void testDecodeObject_byteArray() throws DecoderException {
        byte[] encoded = "SGVsbG8=".getBytes();
        Object result = base64.decode((Object) encoded);
        assertTrue(result instanceof byte[]);
        assertEquals("Hello", new String((byte[]) result));
    }

    @Test
    public void testDecodeObject_string() throws DecoderException {
        Object result = base64.decode((Object) "SGVsbG8=");
        assertTrue(result instanceof byte[]);
        assertEquals("Hello", new String((byte[]) result));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_invalidType_throwsDecoderException() throws DecoderException {
        base64.decode((Object) Integer.valueOf(5));
    }

    // ---------- decode(String) / decode(byte[]) instance methods ----------

    @Test
    public void testDecodeString_normal() {
        byte[] result = base64.decode("SGVsbG8=");
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeByteArray_null_returnsNull() {
        byte[] result = base64.decode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testDecodeByteArray_empty_returnsEmpty() {
        byte[] result = base64.decode(new byte[0]);
        assertEquals(0, result.length);
    }

    // ---------- encode(Object) ----------

    @Test
    public void testEncodeObject_byteArray() throws EncoderException {
        Object result = base64.encode((Object) "Hi".getBytes());
        assertTrue(result instanceof byte[]);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_invalidType_throwsEncoderException() throws EncoderException {
        base64.encode((Object) "Not a byte array");
    }

    // ---------- encode(byte[]) / encodeToString ----------

    @Test
    public void testEncodeByteArray_null_returnsNull() {
        byte[] result = base64.encode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testEncodeByteArray_empty_returnsEmpty() {
        byte[] result = base64.encode(new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncodeByteArray_normal() {
        byte[] result = base64.encode("Man".getBytes());
        assertEquals("TWFu", new String(result));
    }

    @Test
    public void testEncodeToString_normal() {
        String result = base64.encodeToString("Man".getBytes());
        assertEquals("TWFu", result);
    }

    @Test
    public void testEncode_urlSafeMode_smallerBuffer() {
        Base64 urlSafeCodec = new Base64(true);
        byte[] data = "A".getBytes();
        byte[] result = urlSafeCodec.encode(data);
        String s = new String(result);
        assertFalse(s.contains("="));
    }

    // ---------- round trip ----------

    @Test
    public void testEncodeDecodeRoundTrip_normalString() {
        String original = "The quick brown fox jumps over the lazy dog";
        byte[] encoded = Base64.encodeBase64(original.getBytes());
        byte[] decoded = Base64.decodeBase64(encoded);
        assertEquals(original, new String(decoded));
    }

    @Test
    public void testEncodeDecodeRoundTrip_binaryData() {
        byte[] original = new byte[256];
        for (int i = 0; i < 256; i++) {
            original[i] = (byte) i;
        }
        byte[] encoded = Base64.encodeBase64(original);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    // ---------- decodeInteger / encodeInteger / toIntegerBytes ----------

    @Test
    public void testDecodeInteger_normal() {
        byte[] encoded = Base64.encodeBase64(BigInteger.valueOf(255).toByteArray(), false);
        BigInteger result = Base64.decodeInteger(encoded);
        assertNotNull(result);
    }

    @Test
    public void testEncodeInteger_normal() {
        BigInteger bigInt = BigInteger.valueOf(255);
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testEncodeInteger_zero() {
        BigInteger bigInt = BigInteger.ZERO;
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_null_throwsNullPointerException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testEncodeIntegerDecodeInteger_roundTrip() {
        BigInteger original = BigInteger.valueOf(123456789L);
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testToIntegerBytes_positiveValue() {
        BigInteger bigInt = BigInteger.valueOf(255);
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testToIntegerBytes_byteAlignedValue() {
        BigInteger bigInt = BigInteger.valueOf(256);
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testToIntegerBytes_zero() {
        BigInteger bigInt = BigInteger.ZERO;
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertNotNull(result);
    }

    // ---------- discardWhitespace (deprecated, package-private) ----------

    @Test
    public void testDiscardWhitespace_removesWhitespace() {
        byte[] data = "A B\tC\r\nD".getBytes();
        byte[] result = Base64.discardWhitespace(data);
        assertEquals("ABCD", new String(result));
    }

    @Test
    public void testDiscardWhitespace_noWhitespace() {
        byte[] data = "ABCD".getBytes();
        byte[] result = Base64.discardWhitespace(data);
        assertEquals("ABCD", new String(result));
    }

    @Test
    public void testDiscardWhitespace_emptyArray() {
        byte[] data = new byte[0];
        byte[] result = Base64.discardWhitespace(data);
        assertEquals(0, result.length);
    }

    // ---------- chunking line separator branch coverage ----------

    @Test
    public void testEncode_dataExactMultipleOfLineLength() {
        Base64 b = new Base64(4, new byte[]{'\n'}, false);
        byte[] data = "abc".getBytes();
        byte[] result = b.encode(data);
        String s = new String(result);
        assertTrue(s.length() > 0);
    }

    @Test
    public void testEncode_lineLengthZero_noChunking() {
        Base64 b = new Base64(0);
        byte[] data = new byte[200];
        byte[] result = b.encode(data);
        String s = new String(result);
        assertFalse(s.contains("\r\n"));
    }
}
