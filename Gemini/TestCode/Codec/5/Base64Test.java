package org.apache.commons.codec.binary;

import java.math.BigInteger;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class Base64Test {

    @Test
    public void testDefaultConstructor_isNotUrlSafe() {
        Base64 b64 = new Base64();
        Assert.assertFalse(b64.isUrlSafe());
        Assert.assertFalse(b64.hasData());
        Assert.assertEquals(0, b64.avail());
    }

    @Test
    public void testBooleanConstructor_urlSafeMode() {
        Base64 b64UrlSafe = new Base64(true);
        Assert.assertTrue(b64UrlSafe.isUrlSafe());

        Base64 b64Standard = new Base64(false);
        Assert.assertFalse(b64Standard.isUrlSafe());
    }

    @Test
    public void testIntConstructor_lineLength() {
        Base64 b64 = new Base64(64);
        Assert.assertFalse(b64.isUrlSafe());

        Base64 b64Negative = new Base64(-1);
        Assert.assertFalse(b64Negative.isUrlSafe());
    }

    @Test
    public void testConstructor_withLineLengthAndSeparator() {
        byte[] customSep = new byte[]{'\n'};
        Base64 b64 = new Base64(64, customSep);
        Assert.assertFalse(b64.isUrlSafe());

        Base64 b64NullSep = new Base64(64, null);
        Assert.assertFalse(b64NullSep.isUrlSafe());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_illegalLineSeparatorThrowsException() {
        byte[] invalidSep = new byte[]{'A', '\n'};
        new Base64(64, invalidSep, false);
    }

    @Test
    public void testEncode_nullAndEmptyInput() {
        Base64 b64 = new Base64();
        Assert.assertNull(b64.encode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], b64.encode(new byte[0]));

        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
    }

    @Test
    public void testEncodeToString_validInput() {
        Base64 b64 = new Base64();
        String result = b64.encodeToString(StringUtils.getBytesUtf8("Hello World"));
        Assert.assertEquals("SGVsbG8gV29ybGQ=", result);
    }

    @Test
    public void testEncodeBase64_singleBytePad2() {
        byte[] input = new byte[]{'f'};
        byte[] encoded = Base64.encodeBase64(input);
        Assert.assertEquals("Zg==", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testEncodeBase64_twoBytesPad1() {
        byte[] input = new byte[]{'f', 'o'};
        byte[] encoded = Base64.encodeBase64(input);
        Assert.assertEquals("Zm8=", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testEncodeBase64_threeBytesNoPad() {
        byte[] input = new byte[]{'f', 'o', 'o'};
        byte[] encoded = Base64.encodeBase64(input);
        Assert.assertEquals("Zm9v", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testEncodeBase64URLSafe_omitsPaddingAndUsesSafeChars() {
        byte[] input1 = new byte[]{(byte) 0xfb, (byte) 0xff, (byte) 0xfe};
        byte[] standard = Base64.encodeBase64(input1);
        Assert.assertEquals("++++", StringUtils.newStringUtf8(standard));

        byte[] urlSafe1 = Base64.encodeBase64URLSafe(input1);
        Assert.assertEquals("----", StringUtils.newStringUtf8(urlSafe1));

        byte[] input2 = new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff};
        byte[] standard2 = Base64.encodeBase64(input2);
        Assert.assertEquals("////", StringUtils.newStringUtf8(standard2));

        byte[] urlSafe2 = Base64.encodeBase64URLSafe(input2);
        Assert.assertEquals("____", StringUtils.newStringUtf8(urlSafe2));

        byte[] input3 = new byte[]{'f'};
        byte[] urlSafePad2 = Base64.encodeBase64URLSafe(input3);
        Assert.assertEquals("Zg", StringUtils.newStringUtf8(urlSafePad2));

        byte[] input4 = new byte[]{'f', 'o'};
        byte[] urlSafePad1 = Base64.encodeBase64URLSafe(input4);
        Assert.assertEquals("Zm8", StringUtils.newStringUtf8(urlSafePad1));
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        byte[] input = new byte[]{(byte) 0xfb, (byte) 0xf0};
        String result = Base64.encodeBase64URLSafeString(input);
        Assert.assertEquals("--A", result);
    }

    @Test
    public void testEncodeBase64String_chunkedOutput() {
        byte[] input = new byte[60];
        for (int i = 0; i < input.length; i++) {
            input[i] = 'a';
        }
        String encoded = Base64.encodeBase64String(input);
        Assert.assertTrue(encoded.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] input = new byte[60];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) ('A' + (i % 26));
        }
        byte[] chunked = Base64.encodeBase64Chunked(input);
        String chunkedStr = StringUtils.newStringUtf8(chunked);
        Assert.assertTrue(chunkedStr.endsWith("\r\n"));
        Assert.assertEquals(82, chunked.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64_exceedsMaxResultSizeThrowsException() {
        byte[] input = new byte[100];
        Base64.encodeBase64(input, false, false, 10);
    }

    @Test
    public void testDecode_nullAndEmptyInput() {
        Base64 b64 = new Base64();
        Assert.assertNull(b64.decode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], b64.decode(new byte[0]));

        Assert.assertNull(Base64.decodeBase64((byte[]) null));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));

        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(""));
    }

    @Test
    public void testDecode_standardAndUrlSafeStrings() {
        byte[] decoded1 = Base64.decodeBase64("Zg==");
        Assert.assertEquals("f", StringUtils.newStringUtf8(decoded1));

        byte[] decoded2 = Base64.decodeBase64("Zm8=");
        Assert.assertEquals("fo", StringUtils.newStringUtf8(decoded2));

        byte[] decoded3 = Base64.decodeBase64("Zm9v");
        Assert.assertEquals("foo", StringUtils.newStringUtf8(decoded3));

        byte[] decodedNoPad1 = Base64.decodeBase64("Zg");
        Assert.assertEquals("f", StringUtils.newStringUtf8(decodedNoPad1));

        byte[] decodedNoPad2 = Base64.decodeBase64("Zm8");
        Assert.assertEquals("fo", StringUtils.newStringUtf8(decodedNoPad2));

        byte[] decodedSafeMinus = Base64.decodeBase64("----");
        Assert.assertEquals(3, decodedSafeMinus.length);
        Assert.assertEquals((byte) 0xfb, decodedSafeMinus[0]);
        Assert.assertEquals((byte) 0xff, decodedSafeMinus[1]);
        Assert.assertEquals((byte) 0xfe, decodedSafeMinus[2]);

        byte[] decodedSafeUnderscore = Base64.decodeBase64("____");
        Assert.assertEquals(3, decodedSafeUnderscore.length);
        Assert.assertEquals((byte) 0xff, decodedSafeUnderscore[0]);
        Assert.assertEquals((byte) 0xff, decodedSafeUnderscore[1]);
        Assert.assertEquals((byte) 0xff, decodedSafeUnderscore[2]);
    }

    @Test
    public void testDecode_ignoresInvalidCharsAndWhitespace() {
        byte[] decoded = Base64.decodeBase64(" Z m 9\r\n v ");
        Assert.assertEquals("foo", StringUtils.newStringUtf8(decoded));

        byte[] decodedWithGarbage = Base64.decodeBase64("Zm9v!@#$%^&*()");
        Assert.assertEquals("foo", StringUtils.newStringUtf8(decodedWithGarbage));
    }

    @Test
    public void testDecodeString_method() {
        Base64 b64 = new Base64();
        byte[] decoded = b64.decode("SGVsbG8=");
        Assert.assertEquals("Hello", StringUtils.newStringUtf8(decoded));
    }

    @Test
    public void testObjectEncodeAndDecode_validObjects() throws Exception {
        Base64 b64 = new Base64();
        byte[] inputBytes = StringUtils.getBytesUtf8("Hello");
        Object encodedObj = b64.encode(inputBytes);
        Assert.assertTrue(encodedObj instanceof byte[]);
        Assert.assertEquals("SGVsbG8=", StringUtils.newStringUtf8((byte[]) encodedObj));

        Object decodedFromBytes = b64.decode(encodedObj);
        Assert.assertTrue(decodedFromBytes instanceof byte[]);
        Assert.assertEquals("Hello", StringUtils.newStringUtf8((byte[]) decodedFromBytes));

        Object decodedFromString = b64.decode("SGVsbG8=");
        Assert.assertTrue(decodedFromString instanceof byte[]);
        Assert.assertEquals("Hello", StringUtils.newStringUtf8((byte[]) decodedFromString));
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncode_invalidTypeThrowsException() throws Exception {
        Base64 b64 = new Base64();
        b64.encode("StringObjectNotSupported");
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecode_invalidTypeThrowsException() throws Exception {
        Base64 b64 = new Base64();
        b64.decode(12345);
    }

    @Test
    public void testIsBase64_byte() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) 'z'));
        Assert.assertTrue(Base64.isBase64((byte) '0'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '/'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertTrue(Base64.isBase64((byte) '-'));
        Assert.assertTrue(Base64.isBase64((byte) '_'));

        Assert.assertFalse(Base64.isBase64((byte) ' '));
        Assert.assertFalse(Base64.isBase64((byte) '\n'));
        Assert.assertFalse(Base64.isBase64((byte) '$'));
        Assert.assertFalse(Base64.isBase64((byte) -1));
        Assert.assertFalse(Base64.isBase64((byte) 127));
    }

    @Test
    public void testIsArrayByteBase64() {
        Assert.assertTrue(Base64.isArrayByteBase64(new byte[0]));
        Assert.assertTrue(Base64.isArrayByteBase64(StringUtils.getBytesUtf8("Zm9v\r\n\t ")));
        Assert.assertFalse(Base64.isArrayByteBase64(StringUtils.getBytesUtf8("Zm9v!")));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] withWs = StringUtils.getBytesUtf8(" Z m\r\n 9\t v ");
        byte[] cleaned = Base64.discardWhitespace(withWs);
        Assert.assertEquals("Zm9v", StringUtils.newStringUtf8(cleaned));
    }

    @Test
    public void testBigInteger_encodeAndDecode() {
        BigInteger bigInt = new BigInteger("12345678901234567890");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        Assert.assertEquals(bigInt, decoded);

        BigInteger exactByteAligned = new BigInteger("255");
        byte[] encodedAligned = Base64.encodeInteger(exactByteAligned);
        BigInteger decodedAligned = Base64.decodeInteger(encodedAligned);
        Assert.assertEquals(exactByteAligned, decodedAligned);

        BigInteger nonAligned = new BigInteger("1");
        byte[] encodedNonAligned = Base64.encodeInteger(nonAligned);
        BigInteger decodedNonAligned = Base64.decodeInteger(encodedNonAligned);
        Assert.assertEquals(nonAligned, decodedNonAligned);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeInteger_nullThrowsException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testStreamingMethods_directBufferAndResize() {
        Base64 b64 = new Base64(0, Base64.CHUNK_SEPARATOR, false);
        byte[] largeInput = new byte[10000];
        for (int i = 0; i < largeInput.length; i++) {
            largeInput[i] = (byte) (i % 256);
        }

        byte[] encoded = b64.encode(largeInput);
        Assert.assertNotNull(encoded);

        byte[] decoded = b64.decode(encoded);
        Assert.assertArrayEquals(largeInput, decoded);

        b64.encode(largeInput, 0, largeInput.length);
        Assert.assertTrue(b64.hasData());
        Assert.assertTrue(b64.avail() > 0);

        byte[] partial = new byte[100];
        int read = b64.readResults(partial, 0, partial.length);
        Assert.assertEquals(100, read);

        b64.encode(largeInput, 0, -1); // EOF
        b64.encode(largeInput, 0, 10); // already EOF, should return immediately
        
        byte[] drain = new byte[b64.avail()];
        b64.readResults(drain, 0, drain.length);
        Assert.assertEquals(0, b64.avail());
        Assert.assertEquals(-1, b64.readResults(partial, 0, partial.length));

        Base64 decodeB64 = new Base64();
        decodeB64.decode(encoded, 0, encoded.length);
        decodeB64.decode(encoded, 0, -1);
        decodeB64.decode(encoded, 0, 10); // already EOF, should return immediately
    }

    @Test
    public void testReadResults_sameBufferBranch() {
        Base64 b64 = new Base64();
        byte[] out = new byte[8];
        b64.setInitialBuffer(out, 0, 8);
        b64.encode(new byte[]{1, 2, 3}, 0, 3);
        int read = b64.readResults(out, 0, 8);
        Assert.assertEquals(4, read);
    }
}
