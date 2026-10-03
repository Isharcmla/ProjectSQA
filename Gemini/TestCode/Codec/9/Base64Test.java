package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

public class Base64Test {

    @Test
    public void testDefaultConstructor_defaultSettings() {
        Base64 b64 = new Base64();
        Assert.assertFalse(b64.isUrlSafe());
        Assert.assertFalse(b64.hasData());
        Assert.assertEquals(0, b64.avail());
    }

    @Test
    public void testConstructor_urlSafe_true() {
        Base64 b64 = new Base64(true);
        Assert.assertTrue(b64.isUrlSafe());
    }

    @Test
    public void testConstructor_urlSafe_false() {
        Base64 b64 = new Base64(false);
        Assert.assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLengthOnly() {
        Base64 b64 = new Base64(64);
        Assert.assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testConstructor_lineLengthAndSeparator() {
        byte[] customSeparator = new byte[]{'\n'};
        Base64 b64 = new Base64(32, customSeparator);
        Assert.assertFalse(b64.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_lineSeparatorContainsBase64Character_throwsException() {
        byte[] invalidSeparator = new byte[]{'A', '\n'};
        new Base64(64, invalidSeparator, false);
    }

    @Test
    public void testConstructor_nullLineSeparator_disablesChunking() {
        Base64 b64 = new Base64(76, null, true);
        Assert.assertTrue(b64.isUrlSafe());
    }

    @Test
    public void testConstructor_negativeLineLength_disablesChunking() {
        Base64 b64 = new Base64(-1, new byte[]{'\r', '\n'}, false);
        byte[] input = "12345678901234567890123456789012345678901234567890".getBytes();
        byte[] encoded = b64.encode(input);
        Assert.assertFalse(new String(encoded).contains("\r\n"));
    }

    @Test
    public void testIsBase64_singleByte() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) 'z'));
        Assert.assertTrue(Base64.isBase64((byte) '0'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '/'));
        Assert.assertTrue(Base64.isBase64((byte) '-'));
        Assert.assertTrue(Base64.isBase64((byte) '_'));
        Assert.assertTrue(Base64.isBase64((byte) '='));

        Assert.assertFalse(Base64.isBase64((byte) -1));
        Assert.assertFalse(Base64.isBase64((byte) ' '));
        Assert.assertFalse(Base64.isBase64((byte) '$'));
        Assert.assertFalse(Base64.isBase64((byte) 127));
    }

    @Test
    public void testIsBase64_string() {
        Assert.assertTrue(Base64.isBase64(""));
        Assert.assertTrue(Base64.isBase64("SGVsbG8gV29ybGQ="));
        Assert.assertTrue(Base64.isBase64("SGVs bG8g\r\nV29ybGQ=\n\t"));
        Assert.assertFalse(Base64.isBase64("Hello World!"));
    }

    @Test
    public void testIsArrayByteBase64_deprecatedMethod() {
        byte[] valid = StringUtils.getBytesUtf8("SGVsbG8=");
        byte[] invalid = StringUtils.getBytesUtf8("Hello!");
        Assert.assertTrue(Base64.isArrayByteBase64(valid));
        Assert.assertFalse(Base64.isArrayByteBase64(invalid));
    }

    @Test
    public void testIsBase64_byteArray() {
        byte[] empty = new byte[0];
        Assert.assertTrue(Base64.isBase64(empty));

        byte[] validWithSpaces = StringUtils.getBytesUtf8("SGVs bG8=\r\n\t");
        Assert.assertTrue(Base64.isBase64(validWithSpaces));

        byte[] invalid = new byte[]{(byte) 0xFF, (byte) 0xFE};
        Assert.assertFalse(Base64.isBase64(invalid));
    }

    @Test
    public void testEncodeBase64_basic() {
        byte[] input = "Hello".getBytes();
        byte[] expected = "SGVsbG8=".getBytes();
        Assert.assertArrayEquals(expected, Base64.encodeBase64(input));

        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
    }

    @Test
    public void testEncodeBase64String() {
        byte[] input = "Hello World".getBytes();
        String expected = "SGVsbG8gV29ybGQ=";
        Assert.assertEquals(expected, Base64.encodeBase64String(input));
    }

    @Test
    public void testEncodeBase64URLSafe() {
        byte[] input = new byte[]{(byte) 0xFB, (byte) 0xFF, (byte) 0xFE};
        byte[] standard = Base64.encodeBase64(input);
        byte[] urlSafe = Base64.encodeBase64URLSafe(input);

        Assert.assertEquals("+//+", new String(standard));
        Assert.assertEquals("-_--", new String(urlSafe));
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        byte[] input = new byte[]{(byte) 0xFB, (byte) 0xFF, (byte) 0xFE};
        Assert.assertEquals("-_--", Base64.encodeBase64URLSafeString(input));
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] input = new byte[100];
        Arrays.fill(input, (byte) 'A');
        byte[] encoded = Base64.encodeBase64Chunked(input);
        String str = new String(encoded);
        Assert.assertTrue(str.contains("\r\n"));
        Assert.assertTrue(str.endsWith("\r\n"));
    }

    @Test
    public void testEncodeBase64_isChunkedAndUrlSafe() {
        byte[] input = new byte[]{(byte) 0xFB, (byte) 0xFF};
        byte[] encoded = Base64.encodeBase64(input, false, true);
        Assert.assertEquals("-_-", new String(encoded));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_exceedsMaxResultSize_throwsException() {
        byte[] input = new byte[100];
        Base64.encodeBase64(input, false, false, 10);
    }

    @Test
    public void testDecodeBase64_string() {
        String input = "SGVsbG8gV29ybGQ=";
        byte[] result = Base64.decodeBase64(input);
        Assert.assertEquals("Hello World", new String(result));
    }

    @Test
    public void testDecodeBase64_byteArray() {
        byte[] input = "SGVsbG8gV29ybGQ=".getBytes();
        byte[] result = Base64.decodeBase64(input);
        Assert.assertEquals("Hello World", new String(result));

        Assert.assertNull(Base64.decodeBase64((byte[]) null));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] input = "S G\r\nV\n s\tb G8=".getBytes();
        byte[] groomed = Base64.discardWhitespace(input);
        Assert.assertEquals("SGVsbG8=", new String(groomed));
    }

    @Test
    public void testInstanceEncode_object_success() throws Exception {
        Base64 b64 = new Base64();
        Object input = "Hello".getBytes();
        Object output = b64.encode(input);
        Assert.assertTrue(output instanceof byte[]);
        Assert.assertEquals("SGVsbG8=", new String((byte[]) output));
    }

    @Test(expected = EncoderException.class)
    public void testInstanceEncode_invalidObjectType_throwsException() throws Exception {
        Base64 b64 = new Base64();
        b64.encode("Not A Byte Array");
    }

    @Test
    public void testInstanceEncodeToString() {
        Base64 b64 = new Base64();
        Assert.assertEquals("SGVsbG8=", b64.encodeToString("Hello".getBytes()));
    }

    @Test
    public void testInstanceEncode_edgeCases() {
        Base64 b64 = new Base64();
        Assert.assertNull(b64.encode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], b64.encode(new byte[0]));

        // 1 byte -> 2 base64 chars + 2 pad chars (modulus 1)
        Assert.assertEquals("AQ==", new String(b64.encode(new byte[]{1})));
        // 2 bytes -> 3 base64 chars + 1 pad char (modulus 2)
        Assert.assertEquals("AQI=", new String(b64.encode(new byte[]{1, 2})));
        // 3 bytes -> 4 base64 chars (modulus 0)
        Assert.assertEquals("AQID", new String(b64.encode(new byte[]{1, 2, 3})));
    }

    @Test
    public void testInstanceEncode_urlSafeModulus() {
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR, true);
        Assert.assertEquals("AQ", new String(b64.encode(new byte[]{1})));
        Assert.assertEquals("AQI", new String(b64.encode(new byte[]{1, 2})));
    }

    @Test
    public void testInstanceDecode_object_success() throws Exception {
        Base64 b64 = new Base64();
        Object inputBytes = "SGVsbG8=".getBytes();
        Object outputBytes = b64.decode(inputBytes);
        Assert.assertTrue(outputBytes instanceof byte[]);
        Assert.assertEquals("Hello", new String((byte[]) outputBytes));

        Object inputString = "SGVsbG8=";
        Object outputString = b64.decode(inputString);
        Assert.assertTrue(outputString instanceof byte[]);
        Assert.assertEquals("Hello", new String((byte[]) outputString));
    }

    @Test(expected = DecoderException.class)
    public void testInstanceDecode_invalidObjectType_throwsException() throws Exception {
        Base64 b64 = new Base64();
        b64.decode(Integer.valueOf(123));
    }

    @Test
    public void testInstanceDecode_edgeCases() {
        Base64 b64 = new Base64();
        Assert.assertNull(b64.decode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], b64.decode(new byte[0]));

        // Decode variants (with pad, without pad, modulus 2 and 3)
        Assert.assertArrayEquals(new byte[]{1}, b64.decode("AQ==".getBytes()));
        Assert.assertArrayEquals(new byte[]{1}, b64.decode("AQ".getBytes()));
        Assert.assertArrayEquals(new byte[]{1, 2}, b64.decode("AQI=".getBytes()));
        Assert.assertArrayEquals(new byte[]{1, 2}, b64.decode("AQI".getBytes()));
        Assert.assertArrayEquals(new byte[]{1, 2, 3}, b64.decode("AQID".getBytes()));

        // Invalid non-base64 chars and whitespace ignored
        Assert.assertArrayEquals(new byte[]{1, 2, 3}, b64.decode(" A Q ! I D ".getBytes()));
    }

    @Test
    public void testStreamingEncodeAndDecode_bufferResizeAndReadResults() {
        Base64 b64 = new Base64(0);
        // Force buffer resize by encoding more data than DEFAULT_BUFFER_SIZE (8192 bytes)
        byte[] largeData = new byte[10000];
        Arrays.fill(largeData, (byte) 'Z');
        byte[] encoded = b64.encode(largeData);
        Assert.assertNotNull(encoded);

        byte[] decoded = b64.decode(encoded);
        Assert.assertArrayEquals(largeData, decoded);

        // Test streaming methods directly
        Base64 streamB64 = new Base64();
        streamB64.encode(new byte[]{1, 2, 3}, 0, 3);
        Assert.assertTrue(streamB64.hasData());
        Assert.assertTrue(streamB64.avail() > 0);

        byte[] readBuf = new byte[2];
        int read1 = streamB64.readResults(readBuf, 0, 2);
        Assert.assertEquals(2, read1);
        Assert.assertTrue(streamB64.hasData());

        byte[] readBuf2 = new byte[10];
        int read2 = streamB64.readResults(readBuf2, 0, 10);
        Assert.assertEquals(2, read2);
        Assert.assertFalse(streamB64.hasData());

        int readEof = streamB64.readResults(readBuf, 0, 2);
        Assert.assertEquals(0, readEof);

        streamB64.encode(new byte[0], 0, -1);
        int readAfterEof = streamB64.readResults(readBuf, 0, 2);
        Assert.assertEquals(-1, readAfterEof);

        // Calling encode after EOF does nothing
        streamB64.encode(new byte[]{1, 2}, 0, 2);

        // Calling decode after EOF does nothing
        streamB64.decode(new byte[]{1, 2}, 0, 2);
    }

    @Test
    public void testBigIntegerEncodingDecoding() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        Assert.assertEquals(bigInt, decoded);

        BigInteger zero = BigInteger.ZERO;
        Assert.assertEquals(zero, Base64.decodeInteger(Base64.encodeInteger(zero)));

        // Byte aligned BigInteger
        BigInteger byteAligned = new BigInteger("255");
        Assert.assertEquals(byteAligned, Base64.decodeInteger(Base64.encodeInteger(byteAligned)));
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_nullInput_throwsException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testChunkedEncoding_lineWrappingExactMultiple() {
        Base64 b64 = new Base64(4, new byte[]{'\n'});
        byte[] input = new byte[]{1, 2, 3, 4, 5, 6};
        byte[] encoded = b64.encode(input);
        Assert.assertEquals("AQID\nBAUG\n", new String(encoded));
    }
}
