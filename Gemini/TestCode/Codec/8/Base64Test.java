package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class Base64Test {

    @Test
    public void testDefaultConstructor_standardBehavior() {
        Base64 b64 = new Base64();
        Assert.assertFalse(b64.isUrlSafe());
        Assert.assertFalse(b64.hasData());
        Assert.assertEquals(0, b64.avail());

        byte[] input = "Hello World".getBytes();
        byte[] encoded = b64.encode(input);
        byte[] decoded = b64.decode(encoded);
        Assert.assertArrayEquals(input, decoded);
    }

    @Test
    public void testConstructorWithUrlSafe_trueAndFalse() {
        Base64 b64Url = new Base64(true);
        Assert.assertTrue(b64Url.isUrlSafe());

        Base64 b64Standard = new Base64(false);
        Assert.assertFalse(b64Standard.isUrlSafe());
    }

    @Test
    public void testConstructorWithLineLength_positiveAndZeroAndNegative() {
        Base64 b64_76 = new Base64(76);
        Assert.assertFalse(b64_76.isUrlSafe());

        Base64 b64_0 = new Base64(0);
        Assert.assertFalse(b64_0.isUrlSafe());

        Base64 b64_neg = new Base64(-10);
        Assert.assertFalse(b64_neg.isUrlSafe());
    }

    @Test
    public void testConstructorWithLineLengthAndSeparator() {
        byte[] customSep = new byte[]{'\n'};
        Base64 b64 = new Base64(64, customSep);
        Assert.assertFalse(b64.isUrlSafe());

        Base64 b64NullSep = new Base64(64, null);
        Assert.assertFalse(b64NullSep.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidLineSeparator_throwsException() {
        byte[] invalidSep = new byte[]{'A', '\n'};
        new Base64(64, invalidSep, false);
    }

    @Test
    public void testEncodeAndDecode_nullOrEmptyInput() {
        Base64 b64 = new Base64();
        Assert.assertNull(b64.encode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], b64.encode(new byte[0]));

        Assert.assertNull(b64.decode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], b64.decode(new byte[0]));

        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));

        Assert.assertNull(Base64.decodeBase64((byte[]) null));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(""));
    }

    @Test
    public void testEncode_differentModulusLengths() {
        Base64 standardB64 = new Base64(0);
        // length % 3 == 1 (modulus 1 -> 2 pad chars)
        byte[] data1 = new byte[]{'a'};
        String enc1 = standardB64.encodeToString(data1);
        Assert.assertEquals("YQ==", enc1);
        Assert.assertArrayEquals(data1, standardB64.decode(enc1));

        // length % 3 == 2 (modulus 2 -> 1 pad char)
        byte[] data2 = new byte[]{'a', 'b'};
        String enc2 = standardB64.encodeToString(data2);
        Assert.assertEquals("YWI=", enc2);
        Assert.assertArrayEquals(data2, standardB64.decode(enc2));

        // length % 3 == 0 (modulus 0 -> 0 pad char)
        byte[] data3 = new byte[]{'a', 'b', 'c'};
        String enc3 = standardB64.encodeToString(data3);
        Assert.assertEquals("YWJj", enc3);
        Assert.assertArrayEquals(data3, standardB64.decode(enc3));
    }

    @Test
    public void testEncodeUrlSafe_skipsPaddingAndReplacesChars() {
        Base64 urlB64 = new Base64(0, Base64.CHUNK_SEPARATOR, true);
        Assert.assertTrue(urlB64.isUrlSafe());

        // Byte values that yield '+' and '/' in standard base64 (indices 62 and 63)
        // 0xfb, 0xef, 0xbe => binary produces index 62 ('+') and index 63 ('/') in standard
        byte[] testBytes1 = new byte[]{(byte) 0xfb, (byte) 0xef, (byte) 0xbe};
        String standardEnc = Base64.encodeBase64String(testBytes1);
        Assert.assertTrue(standardEnc.contains("+") || standardEnc.contains("/"));

        String urlSafeEnc = urlB64.encodeToString(testBytes1);
        Assert.assertFalse(urlSafeEnc.contains("+"));
        Assert.assertFalse(urlSafeEnc.contains("/"));
        Assert.assertTrue(urlSafeEnc.contains("-") || urlSafeEnc.contains("_"));

        // Modulus 1 without padding in URL safe mode
        byte[] singleByte = new byte[]{'a'};
        String encUrlMod1 = urlB64.encodeToString(singleByte);
        Assert.assertEquals("YQ", encUrlMod1);
        Assert.assertArrayEquals(singleByte, urlB64.decode(encUrlMod1));

        // Modulus 2 without padding in URL safe mode
        byte[] twoBytes = new byte[]{'a', 'b'};
        String encUrlMod2 = urlB64.encodeToString(twoBytes);
        Assert.assertEquals("YWI", encUrlMod2);
        Assert.assertArrayEquals(twoBytes, urlB64.decode(encUrlMod2));
    }

    @Test
    public void testEncodeBase64Chunked_andStaticMethods() {
        byte[] longData = new byte[100];
        for (int i = 0; i < longData.length; i++) {
            longData[i] = (byte) (i & 0xFF);
        }

        byte[] chunked = Base64.encodeBase64Chunked(longData);
        String chunkedStr = StringUtils.newStringUtf8(chunked);
        Assert.assertTrue(chunkedStr.contains("\r\n"));

        byte[] decoded = Base64.decodeBase64(chunked);
        Assert.assertArrayEquals(longData, decoded);

        byte[] urlSafeBytes = Base64.encodeBase64URLSafe(longData);
        String urlSafeStr = Base64.encodeBase64URLSafeString(longData);
        Assert.assertEquals(StringUtils.newStringUtf8(urlSafeBytes), urlSafeStr);

        byte[] decodedUrlSafe = Base64.decodeBase64(urlSafeStr);
        Assert.assertArrayEquals(longData, decodedUrlSafe);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_exceedsMaxResultSize_throwsException() {
        byte[] data = new byte[100];
        Base64.encodeBase64(data, false, false, 10);
    }

    @Test
    public void testDecode_withWhitespaceAndNonBase64Chars() {
        Base64 b64 = new Base64();
        // Base64 of "Hello World" with embedded whitespaces, CR, LF, tabs and garbage chars
        String dirtyEncoded = "  SGVsb  \r\n\t  G8gV29  ybGQ=  \n";
        byte[] decoded = b64.decode(dirtyEncoded);
        Assert.assertEquals("Hello World", StringUtils.newStringUtf8(decoded));

        // Modulus 2 decode case with EOF
        byte[] decMod2 = b64.decode("YQ"); // "a" without pad '='
        Assert.assertArrayEquals(new byte[]{'a'}, decMod2);

        // Modulus 3 decode case with EOF
        byte[] decMod3 = b64.decode("YWI"); // "ab" without pad '='
        Assert.assertArrayEquals(new byte[]{'a', 'b'}, decMod3);
    }

    @Test
    public void testIsBase64_andIsArrayByteBase64() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) 'z'));
        Assert.assertTrue(Base64.isBase64((byte) '0'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '/'));
        Assert.assertTrue(Base64.isBase64((byte) '-'));
        Assert.assertTrue(Base64.isBase64((byte) '_'));
        Assert.assertTrue(Base64.isBase64((byte) '='));

        Assert.assertFalse(Base64.isBase64((byte) '$'));
        Assert.assertFalse(Base64.isBase64((byte) -5));
        Assert.assertFalse(Base64.isBase64((byte) 127));

        Assert.assertTrue(Base64.isArrayByteBase64(new byte[0]));
        Assert.assertTrue(Base64.isArrayByteBase64(StringUtils.getBytesUtf8("SGVs bG8=\r\n\t ")));
        Assert.assertFalse(Base64.isArrayByteBase64(StringUtils.getBytesUtf8("Hello$World")));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] dataWithWs = StringUtils.getBytesUtf8(" A \n B \r C \t D ");
        byte[] cleaned = Base64.discardWhitespace(dataWithWs);
        Assert.assertEquals("ABCD", StringUtils.newStringUtf8(cleaned));
    }

    @Test
    public void testObjectEncodeAndDecode_validAndInvalidTypes() throws Exception {
        Base64 b64 = new Base64();

        // Object encode with byte[]
        byte[] input = "Object Test".getBytes();
        Object encodedObj = b64.encode((Object) input);
        Assert.assertTrue(encodedObj instanceof byte[]);

        // Object decode with byte[]
        Object decodedObj = b64.decode(encodedObj);
        Assert.assertTrue(decodedObj instanceof byte[]);
        Assert.assertArrayEquals(input, (byte[]) decodedObj);

        // Object decode with String
        Object decodedStrObj = b64.decode((Object) StringUtils.newStringUtf8((byte[]) encodedObj));
        Assert.assertTrue(decodedStrObj instanceof byte[]);
        Assert.assertArrayEquals(input, (byte[]) decodedStrObj);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncode_invalidType_throwsEncoderException() throws Exception {
        Base64 b64 = new Base64();
        b64.encode("Not A Byte Array");
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecode_invalidType_throwsDecoderException() throws Exception {
        Base64 b64 = new Base64();
        b64.decode(Integer.valueOf(123));
    }

    @Test
    public void testEncodeAndDecodeInteger() {
        BigInteger bigInt1 = new BigInteger("12345678901234567890");
        byte[] encInt1 = Base64.encodeInteger(bigInt1);
        BigInteger decInt1 = Base64.decodeInteger(encInt1);
        Assert.assertEquals(bigInt1, decInt1);

        BigInteger bigInt2 = BigInteger.valueOf(255);
        byte[] encInt2 = Base64.encodeInteger(bigInt2);
        BigInteger decInt2 = Base64.decodeInteger(encInt2);
        Assert.assertEquals(bigInt2, decInt2);

        BigInteger bigInt3 = BigInteger.valueOf(128);
        byte[] encInt3 = Base64.encodeInteger(bigInt3);
        BigInteger decInt3 = Base64.decodeInteger(encInt3);
        Assert.assertEquals(bigInt3, decInt3);

        BigInteger bigIntZero = BigInteger.ZERO;
        byte[] encIntZero = Base64.encodeInteger(bigIntZero);
        BigInteger decIntZero = Base64.decodeInteger(encIntZero);
        Assert.assertEquals(bigIntZero, decIntZero);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_null_throwsNullPointerException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testToIntegerBytes_exactByteAlignedAndNonAligned() {
        BigInteger exactAligned = new BigInteger(1, new byte[]{(byte) 0x80, 0x01});
        byte[] bytesExact = Base64.toIntegerBytes(exactAligned);
        Assert.assertNotNull(bytesExact);

        BigInteger nonAligned = new BigInteger(1, new byte[]{0x01, 0x02});
        byte[] bytesNonAligned = Base64.toIntegerBytes(nonAligned);
        Assert.assertNotNull(bytesNonAligned);
    }

    @Test
    public void testStreamingMethods_internalState() {
        Base64 b64 = new Base64();
        byte[] customBuffer = new byte[100];
        b64.setInitialBuffer(customBuffer, 10, 100);
        Assert.assertTrue(b64.hasData());
        Assert.assertEquals(0, b64.avail());

        byte[] dest = new byte[10];
        int read = b64.readResults(dest, 0, dest.length);
        Assert.assertEquals(0, read);

        // encode EOF when already eof
        b64.encode(new byte[]{1, 2}, 0, -1);
        Assert.assertEquals(-1, b64.readResults(dest, 0, dest.length));
        b64.encode(new byte[]{1, 2}, 0, -1); // should return immediately due to eof

        // decode EOF when already eof
        b64.decode(new byte[]{1, 2}, 0, -1);
        b64.decode(new byte[]{1, 2}, 0, -1); // should return immediately due to eof
    }

    @Test
    public void testBufferResizing_largePayload() {
        Base64 b64 = new Base64(76);
        byte[] largeData = new byte[16384];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 127);
        }

        byte[] encoded = b64.encode(largeData);
        Assert.assertTrue(encoded.length > largeData.length);

        byte[] decoded = b64.decode(encoded);
        Assert.assertArrayEquals(largeData, decoded);
    }

    @Test
    public void testConstantsAndPemChunkSize() {
        Assert.assertEquals(76, Base64.MIME_CHUNK_SIZE);
        Assert.assertEquals(64, Base64.PEM_CHUNK_SIZE);
        Base64 pemB64 = new Base64(Base64.PEM_CHUNK_SIZE);
        byte[] data = new byte[100];
        byte[] encoded = pemB64.encode(data);
        Assert.assertNotNull(encoded);
    }
}
