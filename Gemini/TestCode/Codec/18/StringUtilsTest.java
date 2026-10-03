package org.apache.commons.codec.binary;

import org.apache.commons.codec.CharEncoding;
import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class StringUtilsTest {

    @Test
    public void testConstructor() {
        final StringUtils stringUtils = new StringUtils();
        Assert.assertNotNull(stringUtils);
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        final String str = "test";
        Assert.assertTrue(StringUtils.equals(str, str));
        Assert.assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEquals_oneNull_returnsFalse() {
        Assert.assertFalse(StringUtils.equals(null, "abc"));
        Assert.assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_bothStrings_returnsExpected() {
        Assert.assertTrue(StringUtils.equals("abc", "abc"));
        Assert.assertFalse(StringUtils.equals("abc", "ABC"));
        Assert.assertFalse(StringUtils.equals("abc", "abcd"));
        Assert.assertFalse(StringUtils.equals("abcd", "abc"));
    }

    @Test
    public void testEquals_nonStringCharSequences_returnsExpected() {
        final StringBuilder sb1 = new StringBuilder("abc");
        final StringBuilder sb2 = new StringBuilder("abc");
        final StringBuilder sb3 = new StringBuilder("abcd");
        final StringBuilder sb4 = new StringBuilder("ABC");

        Assert.assertTrue(StringUtils.equals(sb1, sb2));
        Assert.assertTrue(StringUtils.equals(sb1, "abc"));
        Assert.assertTrue(StringUtils.equals("abc", sb2));
        Assert.assertFalse(StringUtils.equals(sb1, sb3));
        Assert.assertFalse(StringUtils.equals(sb3, sb1));
        Assert.assertFalse(StringUtils.equals(sb1, sb4));
    }

    @Test
    public void testGetByteBufferUtf8_nullInput_returnsNull() {
        Assert.assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8_validInput_returnsByteBuffer() {
        final String input = "Hello World!";
        final ByteBuffer buffer = StringUtils.getByteBufferUtf8(input);
        Assert.assertNotNull(buffer);
        Assert.assertEquals(ByteBuffer.wrap(input.getBytes(StandardCharsets.UTF_8)), buffer);
    }

    @Test
    public void testGetBytesIso8859_1() {
        Assert.assertNull(StringUtils.getBytesIso8859_1(null));
        final String input = "test string";
        final byte[] expected = input.getBytes(StandardCharsets.ISO_8859_1);
        Assert.assertArrayEquals(expected, StringUtils.getBytesIso8859_1(input));
    }

    @Test
    public void testGetBytesUsAscii() {
        Assert.assertNull(StringUtils.getBytesUsAscii(null));
        final String input = "test string";
        final byte[] expected = input.getBytes(StandardCharsets.US_ASCII);
        Assert.assertArrayEquals(expected, StringUtils.getBytesUsAscii(input));
    }

    @Test
    public void testGetBytesUtf16() {
        Assert.assertNull(StringUtils.getBytesUtf16(null));
        final String input = "test string";
        final byte[] expected = input.getBytes(StandardCharsets.UTF_16);
        Assert.assertArrayEquals(expected, StringUtils.getBytesUtf16(input));
    }

    @Test
    public void testGetBytesUtf16Be() {
        Assert.assertNull(StringUtils.getBytesUtf16Be(null));
        final String input = "test string";
        final byte[] expected = input.getBytes(StandardCharsets.UTF_16BE);
        Assert.assertArrayEquals(expected, StringUtils.getBytesUtf16Be(input));
    }

    @Test
    public void testGetBytesUtf16Le() {
        Assert.assertNull(StringUtils.getBytesUtf16Le(null));
        final String input = "test string";
        final byte[] expected = input.getBytes(StandardCharsets.UTF_16LE);
        Assert.assertArrayEquals(expected, StringUtils.getBytesUtf16Le(input));
    }

    @Test
    public void testGetBytesUtf8() {
        Assert.assertNull(StringUtils.getBytesUtf8(null));
        final String input = "test string";
        final byte[] expected = input.getBytes(StandardCharsets.UTF_8);
        Assert.assertArrayEquals(expected, StringUtils.getBytesUtf8(input));
    }

    @Test
    public void testGetBytesUnchecked_nullInput_returnsNull() {
        Assert.assertNull(StringUtils.getBytesUnchecked(null, CharEncoding.UTF_8));
    }

    @Test
    public void testGetBytesUnchecked_validInput_returnsBytes() {
        final String input = "test string";
        final byte[] expected = input.getBytes(StandardCharsets.UTF_8);
        Assert.assertArrayEquals(expected, StringUtils.getBytesUnchecked(input, CharEncoding.UTF_8));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUnchecked_invalidCharset_throwsIllegalStateException() {
        StringUtils.getBytesUnchecked("test string", "INVALID_CHARSET_NAME");
    }

    @Test
    public void testNewString_nullInput_returnsNull() {
        Assert.assertNull(StringUtils.newString(null, CharEncoding.UTF_8));
    }

    @Test
    public void testNewString_validInput_returnsString() {
        final byte[] input = "test string".getBytes(StandardCharsets.UTF_8);
        Assert.assertEquals("test string", StringUtils.newString(input, CharEncoding.UTF_8));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewString_invalidCharset_throwsIllegalStateException() {
        final byte[] input = "test string".getBytes(StandardCharsets.UTF_8);
        StringUtils.newString(input, "INVALID_CHARSET_NAME");
    }

    @Test
    public void testNewStringIso8859_1() {
        Assert.assertNull(StringUtils.newStringIso8859_1(null));
        final byte[] input = "test string".getBytes(StandardCharsets.ISO_8859_1);
        Assert.assertEquals("test string", StringUtils.newStringIso8859_1(input));
    }

    @Test
    public void testNewStringUsAscii() {
        Assert.assertNull(StringUtils.newStringUsAscii(null));
        final byte[] input = "test string".getBytes(StandardCharsets.US_ASCII);
        Assert.assertEquals("test string", StringUtils.newStringUsAscii(input));
    }

    @Test
    public void testNewStringUtf16() {
        Assert.assertNull(StringUtils.newStringUtf16(null));
        final byte[] input = "test string".getBytes(StandardCharsets.UTF_16);
        Assert.assertEquals("test string", StringUtils.newStringUtf16(input));
    }

    @Test
    public void testNewStringUtf16Be() {
        Assert.assertNull(StringUtils.newStringUtf16Be(null));
        final byte[] input = "test string".getBytes(StandardCharsets.UTF_16BE);
        Assert.assertEquals("test string", StringUtils.newStringUtf16Be(input));
    }

    @Test
    public void testNewStringUtf16Le() {
        Assert.assertNull(StringUtils.newStringUtf16Le(null));
        final byte[] input = "test string".getBytes(StandardCharsets.UTF_16LE);
        Assert.assertEquals("test string", StringUtils.newStringUtf16Le(input));
    }

    @Test
    public void testNewStringUtf8() {
        Assert.assertNull(StringUtils.newStringUtf8(null));
        final byte[] input = "test string".getBytes(StandardCharsets.UTF_8);
        Assert.assertEquals("test string", StringUtils.newStringUtf8(input));
    }

    @Test
    public void testEmptyInputs() {
        Assert.assertArrayEquals(new byte[0], StringUtils.getBytesIso8859_1(""));
        Assert.assertArrayEquals(new byte[0], StringUtils.getBytesUsAscii(""));
        Assert.assertArrayEquals(new byte[0], StringUtils.getBytesUtf16(""));
        Assert.assertArrayEquals(new byte[0], StringUtils.getBytesUtf16Be(""));
        Assert.assertArrayEquals(new byte[0], StringUtils.getBytesUtf16Le(""));
        Assert.assertArrayEquals(new byte[0], StringUtils.getBytesUtf8(""));
        Assert.assertArrayEquals(new byte[0], StringUtils.getBytesUnchecked("", CharEncoding.UTF_8));
        Assert.assertEquals(0, StringUtils.getByteBufferUtf8("").remaining());

        Assert.assertEquals("", StringUtils.newStringIso8859_1(new byte[0]));
        Assert.assertEquals("", StringUtils.newStringUsAscii(new byte[0]));
        Assert.assertEquals("", StringUtils.newStringUtf16(new byte[0]));
        Assert.assertEquals("", StringUtils.newStringUtf16Be(new byte[0]));
        Assert.assertEquals("", StringUtils.newStringUtf16Le(new byte[0]));
        Assert.assertEquals("", StringUtils.newStringUtf8(new byte[0]));
        Assert.assertEquals("", StringUtils.newString(new byte[0], CharEncoding.UTF_8));
    }
}
