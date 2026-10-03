package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Base64Test {

    @Test
    public void testDefaultConstructor_defaultSettings() {
        Base64 b64 = new Base64();
        assertFalse(b64.isUrlSafe());
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());
    }

    @Test
    public void testConstructor_urlSafeFlag() {
        Base64 b64 = new Base64(true);
        assertTrue(b64.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLength() {
        Base64 b64 = new Base64(64);
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLengthAndSeparator() {
        byte[] customSeparator = new byte[]{';', '\n'};
        Base64 b64 = new Base64(64, customSeparator);
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testConstructor_nullLineSeparatorDefaults() {
        Base64 b64 = new Base64(64, null, true);
        assertTrue(b64.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_lineSeparatorContainsBase64Char_throwsException() {
        byte[] invalidSeparator = new byte[]{'A', '\n'};
        new Base64(64, invalidSeparator, false);
    }

    @Test
    public void testEncode_nullAndEmpty() {
        Base64 b64 = new Base64();
        assertNull(b64.encode((byte[]) null));
        assertArrayEquals(new byte[0], b64.encode(new byte[0]));
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
    }

    @Test
    public void testDecode_nullAndEmpty() {
        Base64 b64 = new Base64();
        assertNull(b64.decode((byte[]) null));
        assertArrayEquals(new byte[0], b64.decode(new byte[0]));
        assertNull(Base64.decodeBase64((byte[]) null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
        assertNull(Base64.decodeBase64((String) null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(""));
    }

    @Test
    public void testEncodeDecode_standardInputs() {
        String original = "Hello World!";
        byte[] encoded = Base64.encodeBase64(StringUtils.getBytesUtf8(original));
        assertEquals("SGVsbG8gV29ybGQh", StringUtils.newStringUtf8(encoded));

        byte[] decoded = Base64.decodeBase64(encoded);
        assertEquals(original, StringUtils.newStringUtf8(decoded));
    }

    @Test
    public void testEncode_modulusCases() {
        Base64 standardEncoder = new Base64();

        // 1 byte -> modulus 1 -> 2 pad chars
        byte[] input1 = new byte[]{'a'};
        assertEquals("YQ==", StringUtils.newStringUtf8(standardEncoder.encode(input1)));

        // 2 bytes -> modulus 2 -> 1 pad char
        byte[] input2 = new byte[]{'a', 'b'};
        assertEquals("YWI=", StringUtils.newStringUtf8(standardEncoder.encode(input2)));

        // 3 bytes -> modulus 0 -> 0 pad chars
        byte[] input3 = new byte[]{'a', 'b', 'c'};
        assertEquals("YWJj", StringUtils.newStringUtf8(standardEncoder.encode(input3)));
    }

    @Test
    public void testEncode_urlSafeModulusCases() {
        Base64 urlSafeEncoder = new Base64(0, Base64.CHUNK_SEPARATOR, true);

        // 1 byte -> modulus 1 -> skips pad
        byte[] input1 = new byte[]{'a'};
        assertEquals("YQ", StringUtils.newStringUtf8(urlSafeEncoder.encode(input1)));

        // 2 bytes -> modulus 2 -> skips pad
        byte[] input2 = new byte[]{'a', 'b'};
        assertEquals("YWI", StringUtils.newStringUtf8(urlSafeEncoder.encode(input2)));

        // 3 bytes -> modulus 0 -> no pad
        byte[] input3 = new byte[]{'a', 'b', 'c'};
        assertEquals("YWJj", StringUtils.newStringUtf8(urlSafeEncoder.encode(input3)));
    }

    @Test
    public void testEncode_negativeBytesAndTableDifferences() {
        // Test values that use 62 ('+' vs '-') and 63 ('/' vs '_')
        byte[] binary = new byte[]{(byte) 0xfb, (byte) 0xff, (byte) 0xfe};
        byte[] standard = Base64.encodeBase64(binary);
        assertEquals("++++", StringUtils.newStringUtf8(standard));

        byte[] urlSafe = Base64.encodeBase64URLSafe(binary);
        assertEquals("----", StringUtils.newStringUtf8(urlSafe));

        byte[] binary2 = new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff};
        byte[] standard2 = Base64.encodeBase64(binary2);
        assertEquals("////", StringUtils.newStringUtf8(standard2));

        byte[] urlSafe2 = Base64.encodeBase64URLSafe(binary2);
        assertEquals("____", StringUtils.newStringUtf8(urlSafe2));
    }

    @Test
    public void testEncode_chunked() {
        byte[] largeInput = new byte[100];
        for (int i = 0; i < largeInput.length; i++) {
            largeInput[i] = (byte) ('A' + (i % 26));
        }
        byte[] chunked = Base64.encodeBase64Chunked(largeInput);
        String chunkedStr = StringUtils.newStringUtf8(chunked);
        assertTrue(chunkedStr.contains("\r\n"));

        byte[] decoded = Base64.decodeBase64(chunked);
        assertArrayEquals(largeInput, decoded);
    }

    @Test
    public void testEncode_chunkedWithNonDefaultLineLength() {
        byte[] input = StringUtils.getBytesUtf8("12345678901234567890");
        Base64 b64 = new Base64(8, new byte[]{'\n'}, false);
        byte[] encoded = b64.encode(input);
        String encodedStr = StringUtils.newStringUtf8(encoded);
        assertTrue(encodedStr.contains("\n"));
        assertArrayEquals(input, b64.decode(encoded));
    }

    @Test
    public void testEncodeBase64String_and_encodeBase64URLSafeString() {
        byte[] input = StringUtils.getBytesUtf8("test data string");
        String standard = Base64.encodeBase64String(input);
        assertNotNull(standard);

        String urlSafe = Base64.encodeBase64URLSafeString(input);
        assertNotNull(urlSafe);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_exceedsMaxResultSize_throwsException() {
        byte[] input = new byte[100];
        Base64.encodeBase64(input, false, false, 10);
    }

    @Test
    public void testDecode_unpaddedAndVariousModulus() {
        Base64 b64 = new Base64();
        // Encoded from 'a' (YQ==) decoded without padding
        assertArrayEquals(new byte[]{'a'}, b64.decode("YQ"));
        // Encoded from 'ab' (YWI=) decoded without padding
        assertArrayEquals(new byte[]{'a', 'b'}, b64.decode("YWI"));
        // Encoded from 'abc' (YWJj)
        assertArrayEquals(new byte[]{'a', 'b', 'c'}, b64.decode("YWJj"));
    }

    @Test
    public void testDecode_withIgnoredCharactersAndWhitespace() {
        Base64 b64 = new Base64();
        // Embedded spaces, newlines, and non-base64 characters like '!'
        byte[] decoded = b64.decode("S G\r\nV!\ns b\tG 8 g V 2 9 y b G Q h");
        assertEquals("Hello World!", StringUtils.newStringUtf8(decoded));
    }

    @Test
    public void testDecode_urlSafeAlphabet() {
        byte[] decoded1 = Base64.decodeBase64("----");
        assertArrayEquals(new byte[]{(byte) 0xfb, (byte) 0xff, (byte) 0xfe}, decoded1);

        byte[] decoded2 = Base64.decodeBase64("____");
        assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff}, decoded2);
    }

    @Test
    public void testDecode_negativeBytesInInput() {
        Base64 b64 = new Base64();
        byte[] inputWithNegatives = new byte[]{'Y', (byte) -10, 'Q', '='};
        byte[] decoded = b64.decode(inputWithNegatives);
        assertArrayEquals(new byte[]{'a'}, decoded);
    }

    @Test
    public void testIsBase64() {
        assertTrue(Base64.isBase64((byte) '='));
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '-'));
        assertTrue(Base64.isBase64((byte) '_'));

        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) '\n'));
        assertFalse(Base64.isBase64((byte) '$'));
        assertFalse(Base64.isBase64((byte) -1));
        assertFalse(Base64.isBase64((byte) 127));
    }

    @Test
    public void testIsArrayByteBase64() {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
        assertTrue(Base64.isArrayByteBase64(StringUtils.getBytesUtf8("YWJj\r\n YQ==")));
        assertFalse(Base64.isArrayByteBase64(StringUtils.getBytesUtf8("YWJj!")));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] withWs = StringUtils.getBytesUtf8(" a \t b \r \n c ");
        byte[] groomed = Base64.discardWhitespace(withWs);
        assertEquals("abc", StringUtils.newStringUtf8(groomed));
    }

    @Test
    public void testObjectEncodeDecode() throws Exception {
        Base64 b64 = new Base64();
        byte[] input = StringUtils.getBytesUtf8("Object encode/decode");

        Object encoded = b64.encode((Object) input);
        assertTrue(encoded instanceof byte[]);

        Object decodedFromBytes = b64.decode(encoded);
        assertTrue(decodedFromBytes instanceof byte[]);
        assertArrayEquals(input, (byte[]) decodedFromBytes);

        Object decodedFromString = b64.decode((Object) StringUtils.newStringUtf8((byte[]) encoded));
        assertTrue(decodedFromString instanceof byte[]);
        assertArrayEquals(input, (byte[]) decodedFromString);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncode_invalidType_throwsException() throws Exception {
        new Base64().encode("Not a byte array");
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecode_invalidType_throwsException() throws Exception {
        new Base64().decode(12345);
    }

    @Test
    public void testEncodeToString() {
        Base64 b64 = new Base64();
        String result = b64.encodeToString(StringUtils.getBytesUtf8("hello"));
        assertEquals("aGVsbG8=", result);
    }

    @Test
    public void testBigIntegerEncodingDecoding() {
        BigInteger original = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(original, decoded);

        BigInteger zero = BigInteger.ZERO;
        byte[] zeroEncoded = Base64.encodeInteger(zero);
        assertEquals(zero, Base64.decodeInteger(zeroEncoded));

        // Exact byte-aligned BigInteger (bitLength % 8 == 0)
        BigInteger exactAligned = new BigInteger("255");
        byte[] exactEncoded = Base64.encodeInteger(exactAligned);
        assertEquals(exactAligned, Base64.decodeInteger(exactEncoded));
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_null_throwsException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testToIntegerBytes() {
        BigInteger bigInt1 = new BigInteger("128"); // bitlen 8
        byte[] bytes1 = Base64.toIntegerBytes(bigInt1);
        assertEquals(1, bytes1.length);
        assertEquals((byte) 128, bytes1[0]);

        BigInteger bigInt2 = new BigInteger("1"); // bitlen 1
        byte[] bytes2 = Base64.toIntegerBytes(bigInt2);
        assertEquals(1, bytes2.length);
        assertEquals((byte) 1, bytes2[0]);
    }

    @Test
    public void testStreamingInternalBuffersAndReadResults() {
        Base64 b64 = new Base64();
        assertFalse(b64.hasData());
        assertEquals(0, b64.avail());

        // Test readResults when buffer is null
        byte[] out = new byte[10];
        assertEquals(0, b64.readResults(out, 0, out.length));

        // Test setInitialBuffer reuse
        b64.setInitialBuffer(out, 0, out.length);
        assertTrue(b64.hasData());

        // Encode data that triggers buffer growth
        byte[] largeData = new byte[16384];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 128);
        }
        byte[] encoded = b64.encode(largeData);
        assertNotNull(encoded);
        assertTrue(encoded.length > 0);

        // Subsequent call when EOF reached
        b64.encode(new byte[]{1, 2}, 0, -1);
        b64.encode(new byte[]{1, 2}, 0, 2); // should return immediately due to eof

        b64.decode(new byte[]{1, 2}, 0, -1);
        b64.decode(new byte[]{1, 2}, 0, 2); // should return immediately due to eof
    }

    @Test
    public void testReadResults_bufferMatchesAndDoesNotMatch() {
        Base64 b64 = new Base64();
        byte[] input = new byte[]{'Y', 'Q', '=', '='};
        b64.decode(input, 0, input.length);
        b64.decode(input, 0, -1);

        assertTrue(b64.hasData());
        assertTrue(b64.avail() > 0);

        byte[] dest = new byte[10];
        int read = b64.readResults(dest, 0, 1);
        assertEquals(1, read);
        assertEquals('a', dest[0]);
        assertFalse(b64.hasData());
    }
}
