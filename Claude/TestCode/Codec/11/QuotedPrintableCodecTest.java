import org.junit.Test;
import org.junit.Assert;
import org.apache.commons.codec.net.QuotedPrintableCodec;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import java.util.BitSet;

public class QuotedPrintableCodecTest {

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_charsetIsUTF8() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test
    public void testConstructorWithCharset_setsCharsetCorrectly() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("ISO-8859-1");
        Assert.assertEquals("ISO-8859-1", codec.getDefaultCharset());
    }

    // ---------- getDefaultCharset ----------

    @Test
    public void testGetDefaultCharset_returnsExpectedCharset() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        Assert.assertEquals("UTF-8", codec.getDefaultCharset());
    }

    // ---------- encode(byte[]) ----------

    @Test
    public void testEncodeByteArray_normalInput_returnsEncodedBytes() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Hello".getBytes();
        byte[] result = codec.encode(input);
        Assert.assertNotNull(result);
        Assert.assertEquals("Hello", new String(result));
    }

    @Test
    public void testEncodeByteArray_null_returnsNull() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.encode((byte[]) null));
    }

    @Test
    public void testEncodeByteArray_specialCharacter_escaped() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = { (byte) '=' };
        byte[] result = codec.encode(input);
        Assert.assertEquals("=3D", new String(result));
    }

    @Test
    public void testEncodeByteArray_negativeByte_encodedCorrectly() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = { (byte) 0xFF };
        byte[] result = codec.encode(input);
        Assert.assertEquals("=FF", new String(result));
    }

    @Test
    public void testEncodeByteArray_emptyArray_returnsEmptyArray() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = new byte[0];
        byte[] result = codec.encode(input);
        Assert.assertEquals(0, result.length);
    }

    // ---------- decode(byte[]) ----------

    @Test
    public void testDecodeByteArray_normalInput_returnsDecodedBytes() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Hello".getBytes();
        byte[] result = codec.decode(input);
        Assert.assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeByteArray_null_returnsNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.decode((byte[]) null));
    }

    @Test
    public void testDecodeByteArray_escapedCharacter_decodedCorrectly() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "=3D".getBytes();
        byte[] result = codec.decode(input);
        Assert.assertEquals("=", new String(result));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeByteArray_invalidEscapeSequence_throwsDecoderException() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "=3".getBytes();
        codec.decode(input);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeByteArray_trailingEscapeChar_throwsDecoderException() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "=".getBytes();
        codec.decode(input);
    }

    // ---------- encode(String) ----------

    @Test
    public void testEncodeString_normalInput_returnsEncodedString() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.encode("Hello");
        Assert.assertEquals("Hello", result);
    }

    @Test
    public void testEncodeString_null_returnsNull() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.encode((String) null));
    }

    @Test
    public void testEncodeString_emptyString_returnsEmptyString() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.encode("");
        Assert.assertEquals("", result);
    }

    @Test
    public void testEncodeString_specialCharacter_escapedCorrectly() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.encode("=");
        Assert.assertEquals("=3D", result);
    }

    // ---------- decode(String) ----------

    @Test
    public void testDecodeString_normalInput_returnsDecodedString() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.decode("Hello");
        Assert.assertEquals("Hello", result);
    }

    @Test
    public void testDecodeString_null_returnsNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.decode((String) null));
    }

    @Test
    public void testDecodeString_escapedCharacter_decodedCorrectly() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.decode("=3D");
        Assert.assertEquals("=", result);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeString_invalidEncoding_throwsDecoderException() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.decode("=ZZ");
    }

    // ---------- decode(String, String) ----------

    @Test
    public void testDecodeStringWithCharset_normalInput_returnsDecodedString() throws DecoderException, java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.decode("Hello", "UTF-8");
        Assert.assertEquals("Hello", result);
    }

    @Test
    public void testDecodeStringWithCharset_null_returnsNull() throws DecoderException, java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.decode(null, "UTF-8"));
    }

    @Test(expected = java.io.UnsupportedEncodingException.class)
    public void testDecodeStringWithCharset_unsupportedCharset_throwsException() throws DecoderException, java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.decode("Hello", "INVALID-CHARSET-XYZ");
    }

    // ---------- encode(String, String) ----------

    @Test
    public void testEncodeStringWithCharset_normalInput_returnsEncodedString() throws java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.encode("Hello", "UTF-8");
        Assert.assertEquals("Hello", result);
    }

    @Test
    public void testEncodeStringWithCharset_null_returnsNull() throws java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.encode(null, "UTF-8"));
    }

    @Test(expected = java.io.UnsupportedEncodingException.class)
    public void testEncodeStringWithCharset_unsupportedCharset_throwsException() throws java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.encode("Hello", "INVALID-CHARSET-XYZ");
    }

    // ---------- encode(Object) ----------

    @Test
    public void testEncodeObject_byteArray_returnsEncodedByteArray() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object result = codec.encode((Object) "Hello".getBytes());
        Assert.assertTrue(result instanceof byte[]);
        Assert.assertEquals("Hello", new String((byte[]) result));
    }

    @Test
    public void testEncodeObject_string_returnsEncodedString() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object result = codec.encode((Object) "Hello");
        Assert.assertEquals("Hello", result);
    }

    @Test
    public void testEncodeObject_null_returnsNull() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.encode((Object) null));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObject_unsupportedType_throwsEncoderException() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.encode((Object) Integer.valueOf(123));
    }

    // ---------- decode(Object) ----------

    @Test
    public void testDecodeObject_byteArray_returnsDecodedByteArray() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object result = codec.decode((Object) "Hello".getBytes());
        Assert.assertTrue(result instanceof byte[]);
        Assert.assertEquals("Hello", new String((byte[]) result));
    }

    @Test
    public void testDecodeObject_string_returnsDecodedString() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object result = codec.decode((Object) "Hello");
        Assert.assertEquals("Hello", result);
    }

    @Test
    public void testDecodeObject_null_returnsNull() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.decode((Object) null));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObject_unsupportedType_throwsDecoderException() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.decode((Object) Integer.valueOf(123));
    }

    // ---------- static encodeQuotedPrintable(BitSet, byte[]) ----------

    @Test
    public void testEncodeQuotedPrintableStatic_nullBytes_returnsNull() {
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, null);
        Assert.assertNull(result);
    }

    @Test
    public void testEncodeQuotedPrintableStatic_nullBitSet_usesDefaultPrintableChars() {
        byte[] input = "Hello".getBytes();
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        Assert.assertEquals("Hello", new String(result));
    }

    @Test
    public void testEncodeQuotedPrintableStatic_customBitSet_usesGivenPrintableChars() {
        BitSet customPrintable = new BitSet(256);
        customPrintable.set('A');
        byte[] input = { 'A', 'B' };
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(customPrintable, input);
        Assert.assertEquals("A=42", new String(result));
    }

    @Test
    public void testEncodeQuotedPrintableStatic_emptyArray_returnsEmptyArray() {
        byte[] input = new byte[0];
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void testEncodeQuotedPrintableStatic_negativeByteValue_encodedCorrectly() {
        byte[] input = { (byte) -1 };
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(null, input);
        Assert.assertEquals("=FF", new String(result));
    }

    // ---------- static decodeQuotedPrintable(byte[]) ----------

    @Test
    public void testDecodeQuotedPrintableStatic_nullBytes_returnsNull() throws DecoderException {
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(null);
        Assert.assertNull(result);
    }

    @Test
    public void testDecodeQuotedPrintableStatic_normalInput_returnsDecodedBytes() throws DecoderException {
        byte[] input = "Hello".getBytes();
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(input);
        Assert.assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeQuotedPrintableStatic_emptyArray_returnsEmptyArray() throws DecoderException {
        byte[] input = new byte[0];
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(input);
        Assert.assertEquals(0, result.length);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeQuotedPrintableStatic_incompleteEscapeAtEnd_throwsDecoderException() throws DecoderException {
        byte[] input = "=4".getBytes();
        QuotedPrintableCodec.decodeQuotedPrintable(input);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeQuotedPrintableStatic_onlyEscapeChar_throwsDecoderException() throws DecoderException {
        byte[] input = "=".getBytes();
        QuotedPrintableCodec.decodeQuotedPrintable(input);
    }
}
