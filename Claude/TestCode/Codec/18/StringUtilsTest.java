package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

import org.junit.Test;

public class StringUtilsTest {

    // ---------- equals ----------

    @Test
    public void testEquals_bothNull_returnsTrue() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEquals_firstNull_returnsFalse() {
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    public void testEquals_secondNull_returnsFalse() {
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_sameReference_returnsTrue() {
        String s = "abc";
        assertTrue(StringUtils.equals(s, s));
    }

    @Test
    public void testEquals_equalStrings_returnsTrue() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEquals_differentCase_returnsFalse() {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEquals_differentStrings_returnsFalse() {
        assertFalse(StringUtils.equals("abc", "def"));
    }

    @Test
    public void testEquals_nonStringCharSequences_equal_returnsTrue() {
        CharSequence cs1 = new StringBuilder("abc");
        CharSequence cs2 = new StringBuilder("abc");
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEquals_nonStringCharSequences_notEqual_returnsFalse() {
        CharSequence cs1 = new StringBuilder("abc");
        CharSequence cs2 = new StringBuilder("xyz");
        assertFalse(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEquals_emptyStrings_returnsTrue() {
        assertTrue(StringUtils.equals("", ""));
    }

    // ---------- getByteBufferUtf8 ----------

    @Test
    public void testGetByteBufferUtf8_normalString_returnsExpectedBytes() {
        ByteBuffer buffer = StringUtils.getByteBufferUtf8("hello");
        assertArrayEquals("hello".getBytes(), buffer.array());
    }

    @Test
    public void testGetByteBufferUtf8_nullInput_returnsNull() {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8_emptyString_returnsEmptyBuffer() {
        ByteBuffer buffer = StringUtils.getByteBufferUtf8("");
        assertEquals(0, buffer.array().length);
    }

    // ---------- getBytesIso8859_1 ----------

    @Test
    public void testGetBytesIso8859_1_normalString_returnsExpectedBytes() throws UnsupportedEncodingException {
        byte[] expected = "hello".getBytes("ISO-8859-1");
        assertArrayEquals(expected, StringUtils.getBytesIso8859_1("hello"));
    }

    @Test
    public void testGetBytesIso8859_1_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1_emptyString_returnsEmptyArray() {
        byte[] result = StringUtils.getBytesIso8859_1("");
        assertEquals(0, result.length);
    }

    // ---------- getBytesUnchecked ----------

    @Test
    public void testGetBytesUnchecked_normalString_returnsExpectedBytes() throws UnsupportedEncodingException {
        byte[] expected = "hello".getBytes("UTF-8");
        assertArrayEquals(expected, StringUtils.getBytesUnchecked("hello", "UTF-8"));
    }

    @Test
    public void testGetBytesUnchecked_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUnchecked_invalidCharsetName_throwsIllegalStateException() {
        StringUtils.getBytesUnchecked("hello", "INVALID-CHARSET-NAME-XYZ");
    }

    // ---------- getBytesUsAscii ----------

    @Test
    public void testGetBytesUsAscii_normalString_returnsExpectedBytes() throws UnsupportedEncodingException {
        byte[] expected = "hello".getBytes("US-ASCII");
        assertArrayEquals(expected, StringUtils.getBytesUsAscii("hello"));
    }

    @Test
    public void testGetBytesUsAscii_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    // ---------- getBytesUtf16 ----------

    @Test
    public void testGetBytesUtf16_normalString_returnsExpectedBytes() throws UnsupportedEncodingException {
        byte[] expected = "hello".getBytes("UTF-16");
        assertArrayEquals(expected, StringUtils.getBytesUtf16("hello"));
    }

    @Test
    public void testGetBytesUtf16_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    // ---------- getBytesUtf16Be ----------

    @Test
    public void testGetBytesUtf16Be_normalString_returnsExpectedBytes() throws UnsupportedEncodingException {
        byte[] expected = "hello".getBytes("UTF-16BE");
        assertArrayEquals(expected, StringUtils.getBytesUtf16Be("hello"));
    }

    @Test
    public void testGetBytesUtf16Be_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    // ---------- getBytesUtf16Le ----------

    @Test
    public void testGetBytesUtf16Le_normalString_returnsExpectedBytes() throws UnsupportedEncodingException {
        byte[] expected = "hello".getBytes("UTF-16LE");
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le("hello"));
    }

    @Test
    public void testGetBytesUtf16Le_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    // ---------- getBytesUtf8 ----------

    @Test
    public void testGetBytesUtf8_normalString_returnsExpectedBytes() throws UnsupportedEncodingException {
        byte[] expected = "hello".getBytes("UTF-8");
        assertArrayEquals(expected, StringUtils.getBytesUtf8("hello"));
    }

    @Test
    public void testGetBytesUtf8_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8_emptyString_returnsEmptyArray() {
        byte[] result = StringUtils.getBytesUtf8("");
        assertEquals(0, result.length);
    }

    // ---------- newString(byte[], String charsetName) ----------

    @Test
    public void testNewString_normalBytes_returnsExpectedString() throws UnsupportedEncodingException {
        byte[] bytes = "hello".getBytes("UTF-8");
        assertEquals("hello", StringUtils.newString(bytes, "UTF-8"));
    }

    @Test
    public void testNewString_nullBytes_returnsNull() {
        assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewString_invalidCharsetName_throwsIllegalStateException() {
        byte[] bytes = { 104, 101, 108, 108, 111 };
        StringUtils.newString(bytes, "INVALID-CHARSET-NAME-XYZ");
    }

    @Test
    public void testNewString_emptyBytes_returnsEmptyString() throws UnsupportedEncodingException {
        byte[] bytes = new byte[0];
        assertEquals("", StringUtils.newString(bytes, "UTF-8"));
    }

    // ---------- newStringIso8859_1 ----------

    @Test
    public void testNewStringIso8859_1_normalBytes_returnsExpectedString() throws UnsupportedEncodingException {
        byte[] bytes = "hello".getBytes("ISO-8859-1");
        assertEquals("hello", StringUtils.newStringIso8859_1(bytes));
    }

    @Test
    public void testNewStringIso8859_1_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringIso8859_1(null));
    }

    // ---------- newStringUsAscii ----------

    @Test
    public void testNewStringUsAscii_normalBytes_returnsExpectedString() throws UnsupportedEncodingException {
        byte[] bytes = "hello".getBytes("US-ASCII");
        assertEquals("hello", StringUtils.newStringUsAscii(bytes));
    }

    @Test
    public void testNewStringUsAscii_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUsAscii(null));
    }

    // ---------- newStringUtf16 ----------

    @Test
    public void testNewStringUtf16_normalBytes_returnsExpectedString() throws UnsupportedEncodingException {
        byte[] bytes = "hello".getBytes("UTF-16");
        assertEquals("hello", StringUtils.newStringUtf16(bytes));
    }

    @Test
    public void testNewStringUtf16_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf16(null));
    }

    // ---------- newStringUtf16Be ----------

    @Test
    public void testNewStringUtf16Be_normalBytes_returnsExpectedString() throws UnsupportedEncodingException {
        byte[] bytes = "hello".getBytes("UTF-16BE");
        assertEquals("hello", StringUtils.newStringUtf16Be(bytes));
    }

    @Test
    public void testNewStringUtf16Be_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    // ---------- newStringUtf16Le ----------

    @Test
    public void testNewStringUtf16Le_normalBytes_returnsExpectedString() throws UnsupportedEncodingException {
        byte[] bytes = "hello".getBytes("UTF-16LE");
        assertEquals("hello", StringUtils.newStringUtf16Le(bytes));
    }

    @Test
    public void testNewStringUtf16Le_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    // ---------- newStringUtf8 ----------

    @Test
    public void testNewStringUtf8_normalBytes_returnsExpectedString() throws UnsupportedEncodingException {
        byte[] bytes = "hello".getBytes("UTF-8");
        assertEquals("hello", StringUtils.newStringUtf8(bytes));
    }

    @Test
    public void testNewStringUtf8_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewStringUtf8_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        assertEquals("", StringUtils.newStringUtf8(bytes));
    }
}
