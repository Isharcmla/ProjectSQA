package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Base64Test {

    private static final byte[] CRLF = new byte[]{'\r', '\n'};

    @Test
    public void testDefaultConstructor() {
        Base64 b64 = new Base64();
        assertFalse(b64.isUrlSafe());
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testBooleanConstructor() {
        Base64 b64Url = new Base64(true);
        assertTrue(b64Url.isUrlSafe());

        Base64 b64Std = new Base64(false);
        assertFalse(b64Std.isUrlSafe());
    }

    @Test
    public void testLineLengthConstructor() {
        Base64 b64 = new Base64(64);
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testLineLengthAndSeparatorConstructor() {
        byte[] customSep = new byte[]{'\n'};
        Base64 b64 = new Base64(64, customSep);
        assertFalse(b64.isUrlSafe());

        Base64 b64NoChunk = new Base64(0, customSep);
        assertFalse(b64NoChunk.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_separatorContainsBase64Character_throwsIllegalArgumentException() {
        byte[] invalidSep = new byte[]{'A', '\n'};
        new Base64(64, invalidSep, false);
    }

    @Test
    public void testIsBase64() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'Z'));
        assertTrue(Base64.isBase64((byte) 'a'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '9'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '-'));
        assertTrue(Base64.isBase64((byte) '_'));
        assertTrue(Base64.isBase64((byte) '='));

        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) '\n'));
        assertFalse(Base64.isBase64((byte) '\r'));
        assertFalse(Base64.isBase64((byte) '\t'));
        assertFalse(Base64.isBase64((byte) -1));
        assertFalse(Base64.isBase64((byte) 127));
        assertFalse(Base64.isBase64((byte) 200));
    }

    @Test
    public void testIsArrayByteBase64_validInputs_returnsTrue() {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
        assertTrue(Base64.isArrayByteBase64(getBytesUtf8("YWJj")));
        assertTrue(Base64.isArrayByteBase64(getBytesUtf8("YW J\r\n c=")));
    }

    @Test
    public void testIsArrayByteBase64_invalidInputs_returnsFalse() {
        assertFalse(Base64.isArrayByteBase64(new byte[]{(byte) 0x80}));
        assertFalse(Base64.isArrayByteBase64(getBytesUtf8("YWJj$")));
    }

    @Test
    public void testEncodeBase64_nullAndEmptyInput() {
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        assertNull(Base64.encodeBase64(null, true));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0], true));
        assertNull(Base64.encodeBase64(null, false, true));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0], false, true));
    }

    @Test
    public void testEncodeBase64_lengthsMod0Mod1Mod2() {
        // Mod 0 (3 bytes)
        assertArrayEquals(getBytesUtf8("YWJj"), Base64.encodeBase64(getBytesUtf8("abc")));
        // Mod 1 (1 byte -> 4 base64 chars with ==)
        assertArrayEquals(getBytesUtf8("YQ=="), Base64.encodeBase64(getBytesUtf8("a")));
        // Mod 2 (2 bytes -> 4 base64 chars with =)
        assertArrayEquals(getBytesUtf8("YWI="), Base64.encodeBase64(getBytesUtf8("ab")));
    }

    @Test
    public void testEncodeBase64URLSafe() {
        assertNull(Base64.encodeBase64URLSafe(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64URLSafe(new byte[0]));

        byte[] binaryData = new byte[]{(byte) 0xfb, (byte) 0xff, (byte) 0xfe};
        byte[] standardEncoded = Base64.encodeBase64(binaryData);
        byte[] urlSafeEncoded = Base64.encodeBase64URLSafe(binaryData);

        assertEquals("+//+", StringUtf8(standardEncoded));
        assertEquals("-_/+", StringUtf8(urlSafeEncoded).replace("/", "_").replace("+", "-"));
        assertEquals("-_--", StringUtf8(urlSafeEncoded));

        // URL safe mod 1 and mod 2 should skip padding
        assertArrayEquals(getBytesUtf8("YQ"), Base64.encodeBase64URLSafe(getBytesUtf8("a")));
        assertArrayEquals(getBytesUtf8("YWI"), Base64.encodeBase64URLSafe(getBytesUtf8("ab")));
    }

    @Test
    public void testEncodeBase64Chunked() {
        assertNull(Base64.encodeBase64Chunked(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64Chunked(new byte[0]));

        byte[] input = new byte[57]; // 57 bytes * 4 / 3 = 76 bytes Base64
        for (int i = 0; i < input.length; i++) {
            input[i] = 'a';
        }
        byte[] chunked = Base64.encodeBase64Chunked(input);
        assertEquals(76 + CRLF.length, chunked.length);
        assertEquals('\r', chunked[76]);
        assertEquals('\n', chunked[77]);

        byte[] longInput = new byte[60]; // 60 bytes -> 80 bytes Base64 -> 76 + CRLF + 4 + CRLF
        for (int i = 0; i < longInput.length; i++) {
            longInput[i] = 'b';
        }
        byte[] longChunked = Base64.encodeBase64Chunked(longInput);
        assertEquals(80 + CRLF.length * 2, longChunked.length);
    }

    @Test
    public void testDecodeBase64_nullAndEmptyInput() {
        assertNull(Base64.decodeBase64(null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
    }

    @Test
    public void testDecodeBase64_variousInputs() {
        assertArrayEquals(getBytesUtf8("abc"), Base64.decodeBase64(getBytesUtf8("YWJj")));
        assertArrayEquals(getBytesUtf8("a"), Base64.decodeBase64(getBytesUtf8("YQ==")));
        assertArrayEquals(getBytesUtf8("ab"), Base64.decodeBase64(getBytesUtf8("YWI=")));

        // Without padding
        assertArrayEquals(getBytesUtf8("a"), Base64.decodeBase64(getBytesUtf8("YQ")));
        assertArrayEquals(getBytesUtf8("ab"), Base64.decodeBase64(getBytesUtf8("YWI")));

        // URL Safe variants
        byte[] binaryData = new byte[]{(byte) 0xfb, (byte) 0xff, (byte) 0xfe};
        assertArrayEquals(binaryData, Base64.decodeBase64(getBytesUtf8("-_--")));
        assertArrayEquals(binaryData, Base64.decodeBase64(getBytesUtf8("+//+")));

        // Containing whitespace and non-base64 characters
        assertArrayEquals(getBytesUtf8("abc"), Base64.decodeBase64(getBytesUtf8(" Y\r\nW\n\tJ j ")));
    }

    @Test
    public void testInstanceEncode_byteArray() {
        Base64 b64 = new Base64();
        assertArrayEquals(getBytesUtf8("YWJj"), b64.encode(getBytesUtf8("abc")));

        Base64 b64Url = new Base64(true);
        assertArrayEquals(getBytesUtf8("YQ"), b64Url.encode(getBytesUtf8("a")));
    }

    @Test
    public void testInstanceDecode_byteArray() {
        Base64 b64 = new Base64();
        assertArrayEquals(getBytesUtf8("abc"), b64.decode(getBytesUtf8("YWJj")));
        assertArrayEquals(getBytesUtf8("a"), b64.decode(getBytesUtf8("YQ==")));
    }

    @Test
    public void testInstanceEncode_objectSuccess() throws EncoderException {
        Base64 b64 = new Base64();
        Object result = b64.encode((Object) getBytesUtf8("abc"));
        assertTrue(result instanceof byte[]);
        assertArrayEquals(getBytesUtf8("YWJj"), (byte[]) result);
    }

    @Test(expected = EncoderException.class)
    public void testInstanceEncode_invalidObjectType_throwsEncoderException() throws EncoderException {
        Base64 b64 = new Base64();
        b64.encode("A String is not a byte[]");
    }

    @Test
    public void testInstanceDecode_objectSuccess() throws DecoderException {
        Base64 b64 = new Base64();
        Object result = b64.decode((Object) getBytesUtf8("YWJj"));
        assertTrue(result instanceof byte[]);
        assertArrayEquals(getBytesUtf8("abc"), (byte[]) result);
    }

    @Test(expected = DecoderException.class)
    public void testInstanceDecode_invalidObjectType_throwsDecoderException() throws DecoderException {
        Base64 b64 = new Base64();
        b64.decode("A String is not a byte[]");
    }

    @Test
    public void testStreamingEncodeAndDecodeBufferGrowth() {
        Base64 encoder = new Base64(0, CRLF, false);
        byte[] largeData = new byte[10000];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 256);
        }

        encoder.encode(largeData, 0, largeData.length);
        encoder.encode(largeData, 0, -1); // flush EOF
        assertTrue(encoder.hasData());
        assertTrue(encoder.avail() > 0);

        byte[] encoded = new byte[encoder.avail()];
        int readCount = encoder.readResults(encoded, 0, encoded.length);
        assertEquals(encoded.length, readCount);
        assertFalse(encoder.hasData());

        Base64 decoder = new Base64();
        decoder.decode(encoded, 0, encoded.length);
        decoder.decode(encoded, 0, -1); // flush EOF
        byte[] decoded = new byte[decoder.avail()];
        decoder.readResults(decoded, 0, decoded.length);
        assertArrayEquals(largeData, decoded);
    }

    @Test
    public void testReadResults_sameBuffer() {
        Base64 b64 = new Base64();
        byte[] out = new byte[4];
        b64.setInitialBuffer(out, 0, 4);
        b64.encode(new byte[]{1, 2, 3}, 0, 3);
        int read = b64.readResults(out, 0, 4);
        assertEquals(4, read);
    }

    @Test
    public void testReadResults_noData() {
        Base64 b64 = new Base64();
        assertEquals(0, b64.readResults(new byte[10], 0, 10));

        // After EOF without data
        b64.encode(new byte[0], 0, -1);
        b64.readResults(new byte[10], 0, 10); // drain if any
        assertEquals(-1, b64.readResults(new byte[10], 0, 10));
    }

    @Test
    public void testEncodeAndDecodeAfterEofIgnored() {
        Base64 b64 = new Base64();
        b64.encode(new byte[0], 0, -1);
        b64.encode(new byte[]{1, 2, 3}, 0, 3); // should return immediately due to eof

        Base64 b64Dec = new Base64();
        b64Dec.decode(new byte[0], 0, -1);
        b64Dec.decode(getBytesUtf8("YWJj"), 0, 4); // should return immediately due to eof
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] input = getBytesUtf8("  Y \r\n W \t J j  ");
        byte[] cleaned = Base64.discardWhitespace(input);
        assertArrayEquals(getBytesUtf8("YWJj"), cleaned);

        byte[] noWhitespace = getBytesUtf8("YWJj");
        assertArrayEquals(noWhitespace, Base64.discardWhitespace(noWhitespace));
    }

    @Test
    public void testDiscardNonBase64() {
        byte[] input = getBytesUtf8("YW!@#J$j%^");
        byte[] cleaned = Base64.discardNonBase64(input);
        assertArrayEquals(getBytesUtf8("YWJj"), cleaned);

        byte[] allValid = getBytesUtf8("YWJj");
        assertArrayEquals(allValid, Base64.discardNonBase64(allValid));
    }

    @Test
    public void testBigIntegerEncodingDecoding() {
        BigInteger original = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(original);
        assertNotNull(encoded);
        assertTrue(encoded.length > 0);

        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);

        // Test boundary bit lengths
        BigInteger bitAligned = new BigInteger("255"); // 8-bit positive integer (0x00FF in signed)
        byte[] bitAlignedEncoded = Base64.encodeInteger(bitAligned);
        assertEquals(bitAligned, Base64.decodeInteger(bitAlignedEncoded));

        BigInteger zero = BigInteger.ZERO;
        byte[] zeroEncoded = Base64.encodeInteger(zero);
        assertEquals(zero, Base64.decodeInteger(zeroEncoded));
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_null_throwsNullPointerException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testToIntegerBytes_variousBitLengths() {
        BigInteger bi7 = new BigInteger("127");
        byte[] b7 = Base64.toIntegerBytes(bi7);
        assertEquals(1, b7.length);
        assertEquals(127, b7[0]);

        BigInteger bi8 = new BigInteger("128");
        byte[] b8 = Base64.toIntegerBytes(bi8);
        assertEquals(1, b8.length);
        assertEquals((byte) 128, b8[0]);

        BigInteger bi16 = new BigInteger("65535");
        byte[] b16 = Base64.toIntegerBytes(bi16);
        assertEquals(2, b16.length);
        assertEquals((byte) 0xFF, b16[0]);
        assertEquals((byte) 0xFF, b16[1]);
    }

    @Test
    public void testNegativeByteValuesEncoding() {
        byte[] input = new byte[]{-1, -2, -3, -4};
        byte[] encoded = Base64.encodeBase64(input);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(input, decoded);
    }

    private static byte[] getBytesUtf8(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static String StringUtf8(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
