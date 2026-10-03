package org.apache.commons.codec.binary;

import org.junit.Assert;
import org.junit.Test;

public class Base32Test {

    private static final byte[] CRLF = new byte[]{'\r', '\n'};

    // ------------------------------------------------------------------------
    // Constructor Tests
    // ------------------------------------------------------------------------

    @Test
    public void testConstructor_default_shouldUseStandardAlphabetAndNoChunking() {
        final Base32 base32 = new Base32();
        Assert.assertFalse(base32.isInAlphabet((byte) '0'));
        Assert.assertTrue(base32.isInAlphabet((byte) 'A'));
        Assert.assertTrue(base32.isInAlphabet((byte) '2'));
    }

    @Test
    public void testConstructor_customPad_shouldUseCustomPadByte() {
        final Base32 base32 = new Base32((byte) '_');
        final byte[] encoded = base32.encode(new byte[]{'f'});
        Assert.assertEquals("MY______", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testConstructor_useHexTrue_shouldUseHexAlphabet() {
        final Base32 base32 = new Base32(true);
        Assert.assertTrue(base32.isInAlphabet((byte) '0'));
        Assert.assertTrue(base32.isInAlphabet((byte) '9'));
        Assert.assertTrue(base32.isInAlphabet((byte) 'A'));
        Assert.assertTrue(base32.isInAlphabet((byte) 'V'));
        Assert.assertFalse(base32.isInAlphabet((byte) 'W'));
        Assert.assertFalse(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    public void testConstructor_useHexWithCustomPad() {
        final Base32 base32 = new Base32(true, (byte) '$');
        final byte[] encoded = base32.encode(new byte[]{'f'});
        Assert.assertEquals("CO$$$$$$", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testConstructor_lineLength_shouldChunkWithCRLF() {
        final Base32 base32 = new Base32(8);
        final byte[] encoded = base32.encode(StringUtils.getBytesUtf8("foobafooba"));
        Assert.assertEquals("MZXW6YTB\r\nMZXW6YTB\r\n", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testConstructor_lineLengthAndSeparator() {
        final Base32 base32 = new Base32(8, new byte[]{';'});
        final byte[] encoded = base32.encode(StringUtils.getBytesUtf8("foobafooba"));
        Assert.assertEquals("MZXW6YTB;MZXW6YTB;", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testConstructor_lineLengthSeparatorAndUseHex() {
        final Base32 base32 = new Base32(8, new byte[]{';'}, true);
        final byte[] encoded = base32.encode(StringUtils.getBytesUtf8("foobafooba"));
        Assert.assertEquals("CPNMUOJ1;CPNMUOJ1;", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testConstructor_allParameters() {
        final Base32 base32 = new Base32(8, new byte[]{';'}, true, (byte) '.');
        final byte[] encoded = base32.encode(StringUtils.getBytesUtf8("f"));
        Assert.assertEquals("CO......;", StringUtils.newStringUtf8(encoded));
    }

    // ------------------------------------------------------------------------
    // Constructor Exception Tests
    // ------------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullSeparatorWithPositiveLineLength_throwsException() {
        new Base32(76, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_separatorContainsBase32Char_throwsException() {
        new Base32(76, new byte[]{'A', '\n'});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_separatorContainsHexBase32Char_throwsException() {
        new Base32(76, new byte[]{'0', '\n'}, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_padInAlphabetStandard_throwsException() {
        new Base32((byte) 'A');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_padInAlphabetHex_throwsException() {
        new Base32(true, (byte) '0');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_padIsWhitespace_throwsException() {
        new Base32((byte) ' ');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_padIsCR_throwsException() {
        new Base32((byte) '\r');
    }

    // ------------------------------------------------------------------------
    // isInAlphabet Tests
    // ------------------------------------------------------------------------

    @Test
    public void testIsInAlphabet_standardAlphabet() {
        final Base32 base32 = new Base32();
        for (char c = 'A'; c <= 'Z'; c++) {
            Assert.assertTrue("Should be in alphabet: " + c, base32.isInAlphabet((byte) c));
        }
        for (char c = '2'; c <= '7'; c++) {
            Assert.assertTrue("Should be in alphabet: " + c, base32.isInAlphabet((byte) c));
        }
        Assert.assertFalse(base32.isInAlphabet((byte) '0'));
        Assert.assertFalse(base32.isInAlphabet((byte) '1'));
        Assert.assertFalse(base32.isInAlphabet((byte) '8'));
        Assert.assertFalse(base32.isInAlphabet((byte) '9'));
        Assert.assertFalse(base32.isInAlphabet((byte) '='));
        Assert.assertFalse(base32.isInAlphabet((byte) -1));
        Assert.assertFalse(base32.isInAlphabet((byte) 120));
    }

    @Test
    public void testIsInAlphabet_hexAlphabet() {
        final Base32 base32 = new Base32(true);
        for (char c = '0'; c <= '9'; c++) {
            Assert.assertTrue("Should be in hex alphabet: " + c, base32.isInAlphabet((byte) c));
        }
        for (char c = 'A'; c <= 'V'; c++) {
            Assert.assertTrue("Should be in hex alphabet: " + c, base32.isInAlphabet((byte) c));
        }
        Assert.assertFalse(base32.isInAlphabet((byte) 'W'));
        Assert.assertFalse(base32.isInAlphabet((byte) 'Z'));
        Assert.assertFalse(base32.isInAlphabet((byte) -5));
        Assert.assertFalse(base32.isInAlphabet((byte) 127));
    }

    // ------------------------------------------------------------------------
    // RFC 4648 Standard Base32 Encoding / Decoding Tests
    // ------------------------------------------------------------------------

    @Test
    public void testRfc4648_standard_empty() {
        final Base32 base32 = new Base32();
        Assert.assertEquals("", base32.encodeToString(new byte[0]));
        Assert.assertArrayEquals(new byte[0], base32.decode(""));
    }

    @Test
    public void testRfc4648_standard_1Byte_modulus1() {
        final Base32 base32 = new Base32();
        final byte[] input = StringUtils.getBytesUtf8("f");
        final String expected = "MY======";
        Assert.assertEquals(expected, base32.encodeToString(input));
        Assert.assertArrayEquals(input, base32.decode(expected));
    }

    @Test
    public void testRfc4648_standard_2Bytes_modulus2() {
        final Base32 base32 = new Base32();
        final byte[] input = StringUtils.getBytesUtf8("fo");
        final String expected = "MZXQ====";
        Assert.assertEquals(expected, base32.encodeToString(input));
        Assert.assertArrayEquals(input, base32.decode(expected));
    }

    @Test
    public void testRfc4648_standard_3Bytes_modulus3() {
        final Base32 base32 = new Base32();
        final byte[] input = StringUtils.getBytesUtf8("foo");
        final String expected = "MZXW6===";
        Assert.assertEquals(expected, base32.encodeToString(input));
        Assert.assertArrayEquals(input, base32.decode(expected));
    }

    @Test
    public void testRfc4648_standard_4Bytes_modulus4() {
        final Base32 base32 = new Base32();
        final byte[] input = StringUtils.getBytesUtf8("foob");
        final String expected = "MZXW6YQ=";
        Assert.assertEquals(expected, base32.encodeToString(input));
        Assert.assertArrayEquals(input, base32.decode(expected));
    }

    @Test
    public void testRfc4648_standard_5Bytes_modulus0() {
        final Base32 base32 = new Base32();
        final byte[] input = StringUtils.getBytesUtf8("fooba");
        final String expected = "MZXW6YTB";
        Assert.assertEquals(expected, base32.encodeToString(input));
        Assert.assertArrayEquals(input, base32.decode(expected));
    }

    @Test
    public void testRfc4648_standard_6Bytes() {
        final Base32 base32 = new Base32();
        final byte[] input = StringUtils.getBytesUtf8("foobar");
        final String expected = "MZXW6YTBOI======";
        Assert.assertEquals(expected, base32.encodeToString(input));
        Assert.assertArrayEquals(input, base32.decode(expected));
    }

    // ------------------------------------------------------------------------
    // RFC 4648 Hex Base32 Encoding / Decoding Tests
    // ------------------------------------------------------------------------

    @Test
    public void testRfc4648_hex_vectors() {
        final Base32 base32 = new Base32(true);
        final String[] raw = {"", "f", "fo", "foo", "foob", "fooba", "foobar"};
        final String[] hex = {
                "",
                "CO======",
                "CPNG====",
                "CPNMU===",
                "CPNMUOG=",
                "CPNMUOJ1",
                "CPNMUOJ1E8======"
        };

        for (int i = 0; i < raw.length; i++) {
            final byte[] rawBytes = StringUtils.getBytesUtf8(raw[i]);
            Assert.assertEquals(hex[i], base32.encodeToString(rawBytes));
            Assert.assertArrayEquals(rawBytes, base32.decode(hex[i]));
        }
    }

    // ------------------------------------------------------------------------
    // Decoding Remainder Modulus Branches (modulus 2 to 7, unpadded)
    // ------------------------------------------------------------------------

    @Test
    public void testDecode_unpaddedModulus2() {
        final Base32 base32 = new Base32();
        Assert.assertEquals("f", StringUtils.newStringUtf8(base32.decode("MY")));
    }

    @Test
    public void testDecode_unpaddedModulus3() {
        final Base32 base32 = new Base32();
        // 15 bits, drop 7 bits -> 1 byte
        Assert.assertEquals("f", StringUtils.newStringUtf8(base32.decode("MZX")));
    }

    @Test
    public void testDecode_unpaddedModulus4() {
        final Base32 base32 = new Base32();
        Assert.assertEquals("fo", StringUtils.newStringUtf8(base32.decode("MZXQ")));
    }

    @Test
    public void testDecode_unpaddedModulus5() {
        final Base32 base32 = new Base32();
        Assert.assertEquals("foo", StringUtils.newStringUtf8(base32.decode("MZXW6")));
    }

    @Test
    public void testDecode_unpaddedModulus6() {
        final Base32 base32 = new Base32();
        Assert.assertEquals("foo", StringUtils.newStringUtf8(base32.decode("MZXW6Y")));
    }

    @Test
    public void testDecode_unpaddedModulus7() {
        final Base32 base32 = new Base32();
        Assert.assertEquals("foob", StringUtils.newStringUtf8(base32.decode("MZXW6YQ")));
    }

    @Test
    public void testDecode_singleCharModulus1Ignored() {
        final Base32 base32 = new Base32();
        // Modulus < 2 produces no bytes
        Assert.assertArrayEquals(new byte[0], base32.decode("M"));
    }

    // ------------------------------------------------------------------------
    // Noise / Whitespace / Non-Base32 characters in Decode
    // ------------------------------------------------------------------------

    @Test
    public void testDecode_withNoiseAndWhitespace() {
        final Base32 base32 = new Base32();
        final byte[] decoded = base32.decode("M Z\r\n\t X 6 Y T B");
        Assert.assertEquals("fooba", StringUtils.newStringUtf8(decoded));
    }

    @Test
    public void testDecode_withNegativeBytesAndInvalidCharacters() {
        final Base32 base32 = new Base32();
        final byte[] noisy = new byte[]{'M', (byte) 0xFF, (byte) 0x80, 'Y', '=', '='};
        final byte[] decoded = base32.decode(noisy);
        Assert.assertEquals("f", StringUtils.newStringUtf8(decoded));
    }

    // ------------------------------------------------------------------------
    // Chunking and Line Length Tests
    // ------------------------------------------------------------------------

    @Test
    public void testEncode_chunkingWithLeftoverAndCustomSeparator() {
        final Base32 base32 = new Base32(8, new byte[]{'#'});
        // 9 bytes: "foobafoob" -> 8 chars + '#' + 7 chars + pad + '#'
        final byte[] encoded = base32.encode(StringUtils.getBytesUtf8("foobafoob"));
        Assert.assertEquals("MZXW6YTB#MZXW6YQ=#", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testEncode_negativeLineLength_shouldNotChunk() {
        final Base32 base32 = new Base32(-1, CRLF);
        final byte[] encoded = base32.encode(StringUtils.getBytesUtf8("foobafooba"));
        Assert.assertEquals("MZXW6YTBMZXW6YTB", StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testEncode_zeroModulusChunking() {
        // Exactly 5 bytes (8 encoded chars) with lineLength 8
        final Base32 base32 = new Base32(8, CRLF);
        final byte[] encoded = base32.encode(StringUtils.getBytesUtf8("fooba"));
        Assert.assertEquals("MZXW6YTB\r\n", StringUtils.newStringUtf8(encoded));
    }

    // ------------------------------------------------------------------------
    // Negative byte values (signed byte boundary > 127)
    // ------------------------------------------------------------------------

    @Test
    public void testEncodeDecode_binaryDataWithNegativeBytes() {
        final Base32 base32 = new Base32();
        final byte[] binary = new byte[]{-1, -2, -3, -4, -5, -6, -7, -8};
        final byte[] encoded = base32.encode(binary);
        final byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(binary, decoded);
    }

    @Test
    public void testEncodeDecode_binaryDataHex() {
        final Base32 base32 = new Base32(true);
        final byte[] binary = new byte[]{(byte) 0xDE, (byte) 0xAD, (byte) 0xBE, (byte) 0xEF, 0x01, 0x02};
        final byte[] encoded = base32.encode(binary);
        final byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(binary, decoded);
    }

    // ------------------------------------------------------------------------
    // Null and Empty Edge Cases
    // ------------------------------------------------------------------------

    @Test
    public void testEncode_nullOrEmptyInput() {
        final Base32 base32 = new Base32();
        Assert.assertNull(base32.encode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], base32.encode(new byte[0]));
    }

    @Test
    public void testDecode_nullOrEmptyInput() {
        final Base32 base32 = new Base32();
        Assert.assertNull(base32.decode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], base32.decode(new byte[0]));
        Assert.assertNull(base32.decode((String) null));
        Assert.assertArrayEquals(new byte[0], base32.decode(""));
    }
}
