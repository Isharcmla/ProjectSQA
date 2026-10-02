import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

public class Base32Test {

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_normal_createsUsableCodec() {
        Base32 base32 = new Base32();
        Assert.assertNotNull(base32);
    }

    @Test
    public void testConstructor_withPad_normal_createsUsableCodec() {
        Base32 base32 = new Base32((byte) '!');
        byte[] data = "test".getBytes();
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testConstructor_useHexTrue_normal_encodesWithHexAlphabet() {
        Base32 base32 = new Base32(true);
        byte[] data = "Hello".getBytes();
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testConstructor_useHexFalseWithPad_normal_roundTrip() {
        Base32 base32 = new Base32(false, (byte) '@');
        byte[] data = "Hello".getBytes();
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testConstructor_lineLengthOnly_normal_roundTrip() {
        Base32 base32 = new Base32(4);
        byte[] data = "This is a longer test string for line wrapping".getBytes();
        byte[] encoded = base32.encode(data);
        Assert.assertTrue(encoded.length > 0);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testConstructor_lineLengthAndSeparator_normal_roundTrip() {
        byte[] sep = {'-', '-'};
        Base32 base32 = new Base32(8, sep);
        byte[] data = "AnotherTestStringForChunking".getBytes();
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testConstructor_lineLengthSeparatorUseHex_normal_roundTrip() {
        byte[] sep = {'\n'};
        Base32 base32 = new Base32(8, sep, true);
        byte[] data = "HexVariantTest".getBytes();
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testConstructor_fullArgs_normal_roundTrip() {
        byte[] sep = {'\n'};
        Base32 base32 = new Base32(8, sep, false, (byte) '*');
        byte[] data = "FullArgsConstructorTest".getBytes();
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_lineLengthPositiveNullSeparator_throwsException() {
        new Base32(8, null, false, Base32.PAD_DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_separatorContainsBase32Chars_throwsException() {
        byte[] badSep = {'A', 'B'};
        new Base32(8, badSep);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_padInAlphabet_throwsException() {
        new Base32(false, (byte) 'A');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_padIsWhitespace_throwsException() {
        new Base32(false, (byte) ' ');
    }

    // ---------- Encode / Decode round trip tests for different modulus branches ----------

    @Test
    public void testEncodeDecode_emptyArray_returnsEmptyOrSameArray() {
        Base32 base32 = new Base32();
        byte[] data = new byte[0];
        byte[] encoded = base32.encode(data);
        Assert.assertNotNull(encoded);
        Assert.assertEquals(0, encoded.length);
        byte[] decoded = base32.decode(encoded);
        Assert.assertNotNull(decoded);
        Assert.assertEquals(0, decoded.length);
    }

    @Test
    public void testEncodeDecode_oneByte_modulus1_roundTrip() {
        Base32 base32 = new Base32();
        byte[] data = {(byte) 0x61};
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecode_twoBytes_modulus2_roundTrip() {
        Base32 base32 = new Base32();
        byte[] data = {(byte) 0x61, (byte) 0x62};
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecode_threeBytes_modulus3_roundTrip() {
        Base32 base32 = new Base32();
        byte[] data = {(byte) 0x61, (byte) 0x62, (byte) 0x63};
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecode_fourBytes_modulus4_roundTrip() {
        Base32 base32 = new Base32();
        byte[] data = {(byte) 0x61, (byte) 0x62, (byte) 0x63, (byte) 0x64};
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecode_fiveBytes_modulus0_roundTrip() {
        Base32 base32 = new Base32();
        byte[] data = {(byte) 0x61, (byte) 0x62, (byte) 0x63, (byte) 0x64, (byte) 0x65};
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecode_sixBytes_modulus1AfterFullBlock_roundTrip() {
        Base32 base32 = new Base32();
        byte[] data = {(byte) 0x61, (byte) 0x62, (byte) 0x63, (byte) 0x64, (byte) 0x65, (byte) 0x66};
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecode_sevenBytes_modulus2AfterFullBlock_roundTrip() {
        Base32 base32 = new Base32();
        byte[] data = {(byte) 0x61, (byte) 0x62, (byte) 0x63, (byte) 0x64, (byte) 0x65, (byte) 0x66, (byte) 0x67};
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeDecode_largeData_normal_roundTrip() {
        Base32 base32 = new Base32();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append((char) ('A' + (i % 26)));
        }
        byte[] data = sb.toString().getBytes();
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncode_withNegativeByteValues_normal_roundTrip() {
        Base32 base32 = new Base32();
        byte[] data = {(byte) 0xFF, (byte) 0x80, (byte) 0x00, (byte) 0x7F};
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    // ---------- Hex variant round trips for various modulus values ----------

    @Test
    public void testEncodeDecode_hexVariant_variousLengths_roundTrip() {
        Base32 base32 = new Base32(true);
        for (int len = 0; len <= 10; len++) {
            byte[] data = new byte[len];
            for (int i = 0; i < len; i++) {
                data[i] = (byte) (i + 1);
            }
            byte[] encoded = base32.encode(data);
            byte[] decoded = base32.decode(encoded);
            Assert.assertArrayEquals("Failed for length " + len, data, decoded);
        }
    }

    // ---------- Decode ignoring non-alphabet characters / padding ----------

    @Test
    public void testDecode_withPaddingCharacters_normal_decodesCorrectly() {
        Base32 base32 = new Base32();
        byte[] data = "f".getBytes();
        byte[] encoded = base32.encode(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
        // Ensure padding chars present for single byte input (should be padded to 8 chars)
        Assert.assertEquals(8, encoded.length);
    }

    @Test
    public void testDecode_withWhitespaceIgnored_normal_decodesCorrectly() {
        Base32 base32 = new Base32();
        byte[] data = "Hello".getBytes();
        byte[] encoded = base32.encode(data);
        // insert whitespace into encoded array
        byte[] withSpaces = new byte[encoded.length + 2];
        withSpaces[0] = ' ';
        System.arraycopy(encoded, 0, withSpaces, 1, encoded.length);
        withSpaces[withSpaces.length - 1] = '\n';
        byte[] decoded = base32.decode(withSpaces);
        Assert.assertArrayEquals(data, decoded);
    }

    // ---------- Line length / chunking behavior ----------

    @Test
    public void testEncode_withLineLength_normal_containsSeparator() {
        Base32 base32 = new Base32(8);
        byte[] data = new byte[20];
        Arrays.fill(data, (byte) 'X');
        byte[] encoded = base32.encode(data);
        String encodedStr = new String(encoded);
        Assert.assertTrue(encodedStr.contains("\r\n"));
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncode_zeroLineLength_normal_noSeparator() {
        Base32 base32 = new Base32(0);
        byte[] data = new byte[20];
        Arrays.fill(data, (byte) 'Y');
        byte[] encoded = base32.encode(data);
        String encodedStr = new String(encoded);
        Assert.assertFalse(encodedStr.contains("\r\n"));
    }

    // ---------- isInAlphabet tests ----------

    @Test
    public void testIsInAlphabet_validCharacter_returnsTrue() {
        Base32 base32 = new Base32();
        Assert.assertTrue(base32.isInAlphabet((byte) 'A'));
        Assert.assertTrue(base32.isInAlphabet((byte) 'Z'));
        Assert.assertTrue(base32.isInAlphabet((byte) '2'));
        Assert.assertTrue(base32.isInAlphabet((byte) '7'));
    }

    @Test
    public void testIsInAlphabet_invalidCharacter_returnsFalse() {
        Base32 base32 = new Base32();
        Assert.assertFalse(base32.isInAlphabet((byte) '0'));
        Assert.assertFalse(base32.isInAlphabet((byte) '1'));
        Assert.assertFalse(base32.isInAlphabet((byte) '8'));
        Assert.assertFalse(base32.isInAlphabet((byte) '9'));
    }

    @Test
    public void testIsInAlphabet_negativeByte_returnsFalse() {
        Base32 base32 = new Base32();
        Assert.assertFalse(base32.isInAlphabet((byte) -1));
        Assert.assertFalse(base32.isInAlphabet((byte) -128));
    }

    @Test
    public void testIsInAlphabet_outOfBoundsHighValue_returnsFalse() {
        Base32 base32 = new Base32();
        // decodeTable length is small; any value beyond its length should be false.
        Assert.assertFalse(base32.isInAlphabet((byte) 127));
    }

    @Test
    public void testIsInAlphabet_hexVariant_validCharacter_returnsTrue() {
        Base32 base32 = new Base32(true);
        Assert.assertTrue(base32.isInAlphabet((byte) '0'));
        Assert.assertTrue(base32.isInAlphabet((byte) 'V'));
    }

    @Test
    public void testIsInAlphabet_hexVariant_invalidCharacter_returnsFalse() {
        Base32 base32 = new Base32(true);
        Assert.assertFalse(base32.isInAlphabet((byte) 'W'));
        Assert.assertFalse(base32.isInAlphabet((byte) 'Z'));
    }

    // ---------- encodeToString / decode(String) tests ----------

    @Test
    public void testEncodeToString_normal_returnsExpectedString() {
        Base32 base32 = new Base32();
        byte[] data = "f".getBytes();
        String encoded = base32.encodeToString(data);
        Assert.assertNotNull(encoded);
        Assert.assertTrue(encoded.length() > 0);
    }

    @Test
    public void testDecodeString_normal_roundTrip() {
        Base32 base32 = new Base32();
        byte[] data = "Hello World!".getBytes();
        String encoded = base32.encodeToString(data);
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    // ---------- null / edge case handling ----------

    @Test
    public void testEncode_nullArray_returnsNull() {
        Base32 base32 = new Base32();
        byte[] result = base32.encode(null);
        Assert.assertNull(result);
    }

    @Test
    public void testDecode_nullArray_returnsNull() {
        Base32 base32 = new Base32();
        byte[] result = base32.decode((byte[]) null);
        Assert.assertNull(result);
    }

    @Test
    public void testDecodeString_null_returnsNull() {
        Base32 base32 = new Base32();
        byte[] result = base32.decode((String) null);
        Assert.assertNull(result);
    }

    // ---------- Custom pad byte encode/decode ----------

    @Test
    public void testEncodeDecode_customPadByte_normal_roundTrip() {
        Base32 base32 = new Base32((byte) '#');
        byte[] data = "x".getBytes();
        byte[] encoded = base32.encode(data);
        String encStr = new String(encoded);
        Assert.assertTrue(encStr.contains("#"));
        byte[] decoded = base32.decode(encoded);
        Assert.assertArrayEquals(data, decoded);
    }

    // ---------- Known vector test ----------

    @Test
    public void testEncode_knownVector_matchesExpected() {
        Base32 base32 = new Base32();
        byte[] data = "hello".getBytes();
        byte[] encoded = base32.encode(data);
        String expected = "NBSWY3DP";
        Assert.assertEquals(expected, new String(encoded));
    }

    @Test
    public void testDecode_knownVector_matchesExpected() {
        Base32 base32 = new Base32();
        byte[] decoded = base32.decode("NBSWY3DP".getBytes());
        Assert.assertEquals("hello", new String(decoded));
    }
}
