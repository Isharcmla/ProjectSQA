package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class QuotedPrintableCodecTest {

    @Test
    public void testDefaultConstructor_defaultCharset_isUtf8() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertEquals(CharEncoding.UTF_8, codec.getDefaultCharset());
    }

    @Test
    public void testConstructor_customCharset_returnsCustomCharset() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(CharEncoding.ISO_8859_1);
        Assert.assertEquals(CharEncoding.ISO_8859_1, codec.getDefaultCharset());
    }

    @Test
    public void testEncodeQuotedPrintableStatic_nullBytes_returnsNull() {
        Assert.assertNull(QuotedPrintableCodec.encodeQuotedPrintable(null, null));
    }

    @Test
    public void testEncodeQuotedPrintableStatic_nullBitSet_usesDefaultPrintableChars() {
        byte[] input = "Hello=World".getBytes();
        byte[] encoded = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        Assert.assertEquals("Hello=3DWorld", new String(encoded));
    }

    @Test
    public void testEncodeQuotedPrintableStatic_emptyArray_returnsEmpty() {
        byte[] input = new byte[0];
        byte[] encoded = QuotedPrintableCodec.encodeQuotedPrintable(new BitSet(), input);
        Assert.assertEquals(0, encoded.length);
    }

    @Test
    public void testEncodeQuotedPrintableStatic_withNegativeBytes_encodesProperly() {
        byte[] input = new byte[] { (byte) -1, (byte) 0x80, (byte) 0xFF };
        byte[] encoded = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        Assert.assertEquals("=FF=80=FF", new String(encoded));
    }

    @Test
    public void testEncodeQuotedPrintableStatic_printableAndUnsafeChars_encodesProperly() {
        BitSet bitSet = new BitSet();
        bitSet.set('A');
        byte[] input = new byte[] { 'A', 'B', ' ', '\t', '=' };
        byte[] encoded = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, input);
        Assert.assertEquals("A=42=20=09=3D", new String(encoded));
    }

    @Test
    public void testDecodeQuotedPrintableStatic_nullBytes_returnsNull() throws DecoderException {
        Assert.assertNull(QuotedPrintableCodec.decodeQuotedPrintable(null));
    }

    @Test
    public void testDecodeQuotedPrintableStatic_emptyArray_returnsEmpty() throws DecoderException {
        byte[] decoded = QuotedPrintableCodec.decodeQuotedPrintable(new byte[0]);
        Assert.assertEquals(0, decoded.length);
    }

    @Test
    public void testDecodeQuotedPrintableStatic_validEncoded_decodesProperly() throws DecoderException {
        byte[] input = "Hello=3DWorld=20=09=FF".getBytes();
        byte[] decoded = QuotedPrintableCodec.decodeQuotedPrintable(input);
        byte[] expected = new byte[] { 'H', 'e', 'l', 'l', 'o', '=', 'W', 'o', 'r', 'l', 'd', ' ', '\t', (byte) 0xFF };
        Assert.assertArrayEquals(expected, decoded);
    }

    @Test
    public void testDecodeQuotedPrintableStatic_lowercaseHex_decodesProperly() throws DecoderException {
        byte[] input = "Hello=3dWorld".getBytes();
        byte[] decoded = QuotedPrintableCodec.decodeQuotedPrintable(input);
        Assert.assertEquals("Hello=World", new String(decoded));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeQuotedPrintableStatic_truncatedEscape_throwsDecoderException() throws DecoderException {
        byte[] input = "Hello=".getBytes();
        QuotedPrintableCodec.decodeQuotedPrintable(input);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeQuotedPrintableStatic_singleHexDigitEscape_throwsDecoderException() throws DecoderException {
        byte[] input = "Hello=3".getBytes();
        QuotedPrintableCodec.decodeQuotedPrintable(input);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeQuotedPrintableStatic_invalidHexDigit_throwsDecoderException() throws DecoderException {
        byte[] input = "Hello=ZZ".getBytes();
        QuotedPrintableCodec.decodeQuotedPrintable(input);
    }

    @Test
    public void testEncodeByteArray_nullInput_returnsNull() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.encode((byte[]) null));
    }

    @Test
    public void testEncodeByteArray_validInput_returnsEncodedBytes() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Test=123".getBytes();
        byte[] encoded = codec.encode(input);
        Assert.assertEquals("Test=3D123", new String(encoded));
    }

    @Test
    public void testDecodeByteArray_nullInput_returnsNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.decode((byte[]) null));
    }

    @Test
    public void testDecodeByteArray_validInput_returnsDecodedBytes() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Test=3D123".getBytes();
        byte[] decoded = codec.decode(input);
        Assert.assertEquals("Test=123", new String(decoded));
    }

    @Test
    public void testEncodeString_nullInput_returnsNull() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.encode((String) null));
    }

    @Test
    public void testEncodeString_validInput_returnsEncodedString() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertEquals("Hello=3DWorld", codec.encode("Hello=World"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeString_invalidDefaultCharset_throwsEncoderException() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("INVALID_CHARSET");
        codec.encode("Hello");
    }

    @Test
    public void testEncodeStringWithCharset_nullInput_returnsNull() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.encode(null, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeStringWithCharset_validInput_returnsEncodedString() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.encode("Hello=World", CharEncoding.UTF_8);
        Assert.assertEquals("Hello=3DWorld", result);
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testEncodeStringWithCharset_invalidCharset_throwsUnsupportedEncodingException() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.encode("Hello", "INVALID_CHARSET");
    }

    @Test
    public void testDecodeString_nullInput_returnsNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.decode((String) null));
    }

    @Test
    public void testDecodeString_validInput_returnsDecodedString() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertEquals("Hello=World", codec.decode("Hello=3DWorld"));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeString_invalidDefaultCharset_throwsDecoderException() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("INVALID_CHARSET");
        codec.decode("Hello");
    }

    @Test
    public void testDecodeStringWithCharset_nullInput_returnsNull() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.decode(null, CharEncoding.UTF_8));
    }

    @Test
    public void testDecodeStringWithCharset_validInput_returnsDecodedString() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.decode("Hello=3DWorld", CharEncoding.UTF_8);
        Assert.assertEquals("Hello=World", result);
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testDecodeStringWithCharset_invalidCharset_throwsUnsupportedEncodingException() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.decode("Hello", "INVALID_CHARSET");
    }

    @Test
    public void testEncodeObject_nullInput_returnsNull() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.encode((Object) null));
    }

    @Test
    public void testEncodeObject_byteArrayInput_returnsEncodedByteArray() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Hello=World".getBytes();
        Object result = codec.encode((Object) input);
        Assert.assertTrue(result instanceof byte[]);
        Assert.assertEquals("Hello=3DWorld", new String((byte[]) result));
    }

    @Test
    public void testEncodeObject_stringInput_returnsEncodedString() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object result = codec.encode((Object) "Hello=World");
        Assert.assertEquals("Hello=3DWorld", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_unsupportedType_throwsEncoderException() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.encode(12345);
    }

    @Test
    public void testDecodeObject_nullInput_returnsNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.decode((Object) null));
    }

    @Test
    public void testDecodeObject_byteArrayInput_returnsDecodedByteArray() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Hello=3DWorld".getBytes();
        Object result = codec.decode((Object) input);
        Assert.assertTrue(result instanceof byte[]);
        Assert.assertEquals("Hello=World", new String((byte[]) result));
    }

    @Test
    public void testDecodeObject_stringInput_returnsDecodedString() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object result = codec.decode((Object) "Hello=3DWorld");
        Assert.assertEquals("Hello=World", result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_unsupportedType_throwsDecoderException() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.decode(12345);
    }
}
