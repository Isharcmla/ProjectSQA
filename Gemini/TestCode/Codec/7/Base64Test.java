package org.apache.commons.codec.binary;

import java.math.BigInteger;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class Base64Test {

    @Test
    public void testDefaultConstructor_isNotUrlSafe() {
        Base64 base64 = new Base64();
        Assert.assertFalse(base64.isUrlSafe());
        Assert.assertFalse(base64.hasData());
        Assert.assertEquals(0, base64.avail());
    }

    @Test
    public void testBooleanConstructor_urlSafeMode() {
        Base64 base64 = new Base64(true);
        Assert.assertTrue(base64.isUrlSafe());
    }

    @Test
    public void testLineLengthConstructor_validLength() {
        Base64 base64 = new Base64(64);
        Assert.assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testLineLengthAndSeparatorConstructor_customSeparator() {
        byte[] separator = new byte[]{(byte) '\n'};
        Base64 base64 = new Base64(64, separator);
        Assert.assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testConstructor_nullLineSeparator_disablesChunking() {
        Base64 base64 = new Base64(64, null, true);
        Assert.assertTrue(base64.isUrlSafe());
        byte[] input = new byte[100];
        byte[] encoded = base64.encode(input);
        Assert.assertNotNull(encoded);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_base64CharsInSeparator_throwsException() {
        byte[] invalidSeparator = new byte[]{'A', 'B'};
        new Base64(64, invalidSeparator, false);
    }

    @Test
    public void testIsBase64_validAndInvalidBytes() {
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) 'z'));
        Assert.assertTrue(Base64.isBase64((byte) '0'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '/'));
        Assert.assertTrue(Base64.isBase64((byte) '-'));
        Assert.assertTrue(Base64.isBase64((byte) '_'));
        Assert.assertFalse(Base64.isBase64((byte) '$'));
        Assert.assertFalse(Base64.isBase64((byte) -1));
        Assert.assertFalse(Base64.isBase64((byte) 127));
    }

    @Test
    public void testIsArrayByteBase64_validAndInvalidArrays() {
        Assert.assertTrue(Base64.isArrayByteBase64(new byte[0]));
        Assert.assertTrue(Base64.isArrayByteBase64(StringUtils.getBytesUtf8("YWJj\r\n\t ")));
        Assert.assertFalse(Base64.isArrayByteBase64(StringUtils.getBytesUtf8("YWJj$")));
    }

    @Test
    public void testEncodeBase64_basicData() {
        byte[] raw = StringUtils.getBytesUtf8("Hello World");
        byte[] encoded = Base64.encodeBase64(raw);
        Assert.assertEquals("SGVsbG8gV29ybGQ=", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testEncodeBase64_emptyAndNull() {
        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
    }

    @Test
    public void testEncodeBase64String_chunkedString() {
        byte[] raw = StringUtils.getBytesUtf8("Hello World 123456789012345678901234567890123456789012345678901234567890");
        String encoded = Base64.encodeBase64String(raw);
        Assert.assertTrue(encoded.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64URLSafe_andURLSafeString() {
        byte[] raw = new byte[]{(byte) 0xfb, (byte) 0xff, (byte) 0xbf};
        byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(raw);
        String encodedUrlSafeStr = Base64.encodeBase64URLSafeString(raw);

        Assert.assertEquals("----", StringUtils.newStringUtf8(encodedUrlSafe));
        Assert.assertEquals("----", encodedUrlSafeStr);
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] raw = new byte[100];
        byte[] encoded = Base64.encodeBase64Chunked(raw);
        String encodedStr = StringUtils.newStringUtf8(encoded);
        Assert.assertTrue(encodedStr.endsWith("\r\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_exceedsMaxSize_throwsException() {
        byte[] raw = new byte[100];
        Base64.encodeBase64(raw, false, false, 10);
    }

    @Test
    public void testEncode_differentModulusValues_standardAndUrlSafe() {
        Base64 standard = new Base64(0, Base64.CHUNK_SEPARATOR, false);
        Base64 urlSafe = new Base64(0, Base64.CHUNK_SEPARATOR, true);

        // Length % 3 == 1 (modulus 1)
        byte[] oneByte = new byte[]{'a'};
        Assert.assertEquals("YQ==", standard.encodeToString(oneByte));
        Assert.assertEquals("YQ", urlSafe.encodeToString(oneByte));

        // Length % 3 == 2 (modulus 2)
        byte[] twoBytes = new byte[]{'a', 'b'};
        Assert.assertEquals("YWI=", standard.encodeToString(twoBytes));
        Assert.assertEquals("YWI", urlSafe.encodeToString(twoBytes));

        // Length % 3 == 0 (modulus 0)
        byte[] threeBytes = new byte[]{'a', 'b', 'c'};
        Assert.assertEquals("YWJj", standard.encodeToString(threeBytes));
        Assert.assertEquals("YWJj", urlSafe.encodeToString(threeBytes));
    }

    @Test
    public void testEncode_negativeBytesAndBufferResize() {
        byte[] largeData = new byte[10000];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 256 - 128);
        }
        Base64 base64 = new Base64(76);
        byte[] encoded = base64.encode(largeData);
        byte[] decoded = base64.decode(encoded);
        Assert.assertArrayEquals(largeData, decoded);
    }

    @Test
    public void testEncodeObject_validAndInvalid() throws Exception {
        Base64 base64 = new Base64();
        byte[] input = StringUtils.getBytesUtf8("Test");
        Object result = base64.encode((Object) input);
        Assert.assertTrue(result instanceof byte[]);
        Assert.assertEquals("VGVzdA==", StringUtils.newStringUtf8((byte[]) result));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_invalidType_throwsException() throws Exception {
        Base64 base64 = new Base64();
        base64.encode("Not a byte array");
    }

    @Test
    public void testDecodeBase64_fromByteArrayAndString() {
        String base64Str = "SGVsbG8gV29ybGQ=";
        byte[] decodedFromString = Base64.decodeBase64(base64Str);
        byte[] decodedFromBytes = Base64.decodeBase64(StringUtils.getBytesUtf8(base64Str));

        Assert.assertEquals("Hello World", StringUtils.newStringUtf8(decodedFromString));
        Assert.assertArrayEquals(decodedFromString, decodedFromBytes);
    }

    @Test
    public void testDecode_emptyAndNull() {
        Base64 base64 = new Base64();
        Assert.assertNull(base64.decode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], base64.decode(new byte[0]));
    }

    @Test
    public void testDecode_withPaddingAndWithoutPadding() {
        Base64 base64 = new Base64();
        // 1 byte result decoded from 2 chars (without padding)
        Assert.assertEquals("a", StringUtils.newStringUtf8(base64.decode("YQ")));
        // 1 byte result decoded from 4 chars (with padding)
        Assert.assertEquals("a", StringUtils.newStringUtf8(base64.decode("YQ==")));
        // 2 bytes result decoded from 3 chars (without padding)
        Assert.assertEquals("ab", StringUtils.newStringUtf8(base64.decode("YWI")));
        // 2 bytes result decoded from 4 chars (with padding)
        Assert.assertEquals("ab", StringUtils.newStringUtf8(base64.decode("YWI=")));
    }

    @Test
    public void testDecode_withIgnoredCharactersAndGarbage() {
        Base64 base64 = new Base64();
        byte[] decoded = base64.decode("SGVs\r\n bG8g\tV29ybGQ=");
        Assert.assertEquals("Hello World", StringUtils.newStringUtf8(decoded));
    }

    @Test
    public void testDecode_largeDataBufferResize() {
        byte[] largeData = new byte[10000];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i & 0xFF);
        }
        byte[] encoded = Base64.encodeBase64(largeData);
        Base64 base64 = new Base64();
        byte[] decoded = base64.decode(encoded);
        Assert.assertArrayEquals(largeData, decoded);
    }

    @Test
    public void testDecodeObject_validAndInvalid() throws Exception {
        Base64 base64 = new Base64();
        Object decodedBytes = base64.decode((Object) StringUtils.getBytesUtf8("VGVzdA=="));
        Assert.assertTrue(decodedBytes instanceof byte[]);
        Assert.assertEquals("Test", StringUtils.newStringUtf8((byte[]) decodedBytes));

        Object decodedString = base64.decode((Object) "VGVzdA==");
        Assert.assertTrue(decodedString instanceof byte[]);
        Assert.assertEquals("Test", StringUtils.newStringUtf8((byte[]) decodedString));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_invalidType_throwsException() throws Exception {
        Base64 base64 = new Base64();
        base64.decode(new Integer(123));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] dataWithWs = StringUtils.getBytesUtf8(" A \n B \r C \t D ");
        byte[] result = Base64.discardWhitespace(dataWithWs);
        Assert.assertEquals("ABCD", StringUtils.newStringUtf8(result));
    }

    @Test
    public void testEncodeAndDecodeInteger() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        Assert.assertEquals(bigInt, decoded);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_null_throwsException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testToIntegerBytes_variousBitLengths() {
        BigInteger aligned = new BigInteger("255"); // 8-bit positive (0x00FF in signed)
        byte[] bytesAligned = Base64.toIntegerBytes(aligned);
        Assert.assertEquals(1, bytesAligned.length);
        Assert.assertEquals((byte) 0xFF, bytesAligned[0]);

        BigInteger unaligned = new BigInteger("127");
        byte[] bytesUnaligned = Base64.toIntegerBytes(unaligned);
        Assert.assertEquals(1, bytesUnaligned.length);
        Assert.assertEquals((byte) 0x7F, bytesUnaligned[0]);

        BigInteger zero = BigInteger.ZERO;
        byte[] bytesZero = Base64.toIntegerBytes(zero);
        Assert.assertEquals(0, bytesZero.length);
    }

    @Test
    public void testStreamingMethods_coverage() {
        Base64 base64 = new Base64();
        byte[] input = StringUtils.getBytesUtf8("Hello");
        base64.encode(input, 0, input.length);
        Assert.assertTrue(base64.hasData());
        Assert.assertTrue(base64.avail() > 0);

        byte[] out = new byte[100];
        int read = base64.readResults(out, 0, out.length);
        Assert.assertTrue(read > 0);

        // Test EOF flag & readResults when empty
        base64.encode(input, 0, -1);
        int eofRead = base64.readResults(out, 0, out.length);
        Assert.assertTrue(eofRead >= 0);

        // After fully drained buffer
        int drained = base64.readResults(out, 0, out.length);
        Assert.assertEquals(-1, drained);

        // Already EOF call
        base64.encode(input, 0, input.length);
        base64.decode(input, 0, input.length);
    }

    @Test
    public void testSetInitialBuffer_reusingArray() {
        Base64 base64 = new Base64();
        byte[] out = new byte[8];
        base64.setInitialBuffer(out, 0, 8);
        Assert.assertTrue(base64.hasData());

        int read = base64.readResults(out, 0, 8);
        Assert.assertEquals(0, read);
        Assert.assertFalse(base64.hasData());
    }
}
