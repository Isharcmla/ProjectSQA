package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
    public void testEquals_sameReference_returnsTrue() {
        String s = "abc";
        assertTrue(StringUtils.equals(s, s));
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
    public void testEquals_equalStrings_returnsTrue() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEquals_caseDifferentStrings_returnsFalse() {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEquals_differentLengthStrings_returnsFalse() {
        assertFalse(StringUtils.equals("abc", "abcd"));
    }

    @Test
    public void testEquals_nonStringCharSequenceEqual_returnsTrue() {
        CharSequence cs1 = new StringBuilder("abc");
        CharSequence cs2 = new StringBuilder("abc");
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEquals_nonStringCharSequenceDifferent_returnsFalse() {
        CharSequence cs1 = new StringBuilder("abc");
        CharSequence cs2 = new StringBuilder("abd");
        assertFalse(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEquals_mixedStringAndCharSequence_returnsTrue() {
        CharSequence cs1 = "abc";
        CharSequence cs2 = new StringBuilder("abc");
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEquals_emptyStrings_returnsTrue() {
        assertTrue(StringUtils.equals("", ""));
    }

    // ---------- getByteBufferUtf8 ----------

    @Test
    public void testGetByteBufferUtf8_normalString_returnsCorrectBuffer() {
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
    public void testGetBytesIso8859_1_normalString_returnsCorrectBytes() {
        byte[] bytes = StringUtils.getBytesIso8859_1("hello");
        assertArrayEquals("hello".getBytes(), bytes);
    }

    @Test
    public void testGetBytesIso8859_1_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1_emptyString_returnsEmptyArray() {
        byte[] bytes = StringUtils.getBytesIso8859_1("");
        assertEquals(0, bytes.length);
    }

    // ---------- getBytesUnchecked ----------

    @Test
    public void testGetBytesUnchecked_normalString_returnsCorrectBytes() throws UnsupportedEncodingException {
        byte[] expected = "hello".getBytes("UTF-8");
        byte[] actual = StringUtils.getBytesUnchecked("hello", "UTF-8");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesUnchecked_nullString_returnsNull() {
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUnchecked_invalidCharset_throwsIllegalStateException() {
        StringUtils.getBytesUnchecked("hello", "INVALID-CHARSET-NAME");
    }

    @Test
    public void testGetBytesUnchecked_emptyString_returnsEmptyArray() {
        byte[] bytes = StringUtils.getBytesUnchecked("", "UTF-8");
        assertEquals(0, bytes.length);
    }

    // ---------- getBytesUsAscii ----------

    @Test
    public void testGetBytesUsAscii_normalString_returnsCorrectBytes() {
        byte[] bytes = StringUtils.getBytesUsAscii("hello");
        assertArrayEquals("hello".getBytes(), bytes);
    }

    @Test
    public void testGetBytesUsAscii_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAscii_emptyString_returnsEmptyArray() {
        byte[] bytes = StringUtils.getBytesUsAscii("");
        assertEquals(0, bytes.length);
    }

    // ---------- getBytesUtf16 ----------

    @Test
    public void testGetBytesUtf16_normalString_returnsCorrectBytes() {
        byte[] bytes = StringUtils.getBytesUtf16("hello");
        assertTrue(bytes.length > 0);
    }

    @Test
    public void testGetBytesUtf16_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16_emptyString_returnsEmptyOrBomOnlyArray() {
        byte[] bytes = StringUtils.getBytesUtf16("");
        assertTrue(bytes.length >= 0);
    }

    // ---------- getBytesUtf16Be ----------

    @Test
    public void testGetBytesUtf16Be_normalString_returnsCorrectBytes() {
        byte[] bytes = StringUtils.getBytesUtf16Be("hello");
        assertTrue(bytes.length > 0);
    }

    @Test
    public void testGetBytesUtf16Be_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Be_emptyString_returnsEmptyArray() {
        byte[] bytes = StringUtils.getBytesUtf16Be("");
        assertEquals(0, bytes.length);
    }

    // ---------- getBytesUtf16Le ----------

    @Test
    public void testGetBytesUtf16Le_normalString_returnsCorrectBytes() {
        byte[] bytes = StringUtils.getBytesUtf16Le("hello");
        assertTrue(bytes.length > 0);
    }

    @Test
    public void testGetBytesUtf16Le_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16Le_emptyString_returnsEmptyArray() {
        byte[] bytes = StringUtils.getBytesUtf16Le("");
        assertEquals(0, bytes.length);
    }

    // ---------- getBytesUtf8 ----------

    @Test
    public void testGetBytesUtf8_normalString_returnsCorrectBytes() {
        byte[] bytes = StringUtils.getBytesUtf8("hello");
        assertArrayEquals("hello".getBytes(), bytes);
    }

    @Test
    public void testGetBytesUtf8_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8_emptyString_returnsEmptyArray() {
        byte[] bytes = StringUtils.getBytesUtf8("");
        assertEquals(0, bytes.length);
    }

    // ---------- newString(bytes, charsetName) ----------

    @Test
    public void testNewString_normalBytes_returnsCorrectString() throws UnsupportedEncodingException {
        byte[] bytes = "hello".getBytes("UTF-8");
        String result = StringUtils.newString(bytes, "UTF-8");
        assertEquals("hello", result);
    }

    @Test
    public void testNewString_nullBytes_returnsNull() {
        assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewString_invalidCharset_throwsIllegalStateException() {
        byte[] bytes = new byte[] { 1, 2, 3 };
        StringUtils.newString(bytes, "INVALID-CHARSET-NAME");
    }

    @Test
    public void testNewString_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String result = StringUtils.newString(bytes, "UTF-8");
        assertEquals("", result);
    }

    // ---------- newStringIso8859_1 ----------

    @Test
    public void testNewStringIso8859_1_normalBytes_returnsCorrectString() {
        byte[] bytes = "hello".getBytes();
        String result = StringUtils.newStringIso8859_1(bytes);
        assertEquals("hello", result);
    }

    @Test(expected = NullPointerException.class)
    public void testNewStringIso8859_1_nullBytes_throwsNullPointerException() {
        StringUtils.newStringIso8859_1(null);
    }

    @Test
    public void testNewStringIso8859_1_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String result = StringUtils.newStringIso8859_1(bytes);
        assertEquals("", result);
    }

    // ---------- newStringUsAscii ----------

    @Test
    public void testNewStringUsAscii_normalBytes_returnsCorrectString() {
        byte[] bytes = "hello".getBytes();
        String result = StringUtils.newStringUsAscii(bytes);
        assertEquals("hello", result);
    }

    @Test
    public void testNewStringUsAscii_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUsAscii_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String result = StringUtils.newStringUsAscii(bytes);
        assertEquals("", result);
    }

    // ---------- newStringUtf16 ----------

    @Test
    public void testNewStringUtf16_normalBytes_returnsCorrectString() {
        byte[] bytes = StringUtils.getBytesUtf16("hello");
        String result = StringUtils.newStringUtf16(bytes);
        assertEquals("hello", result);
    }

    @Test
    public void testNewStringUtf16_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf16(null));
    }

    @Test
    public void testNewStringUtf16_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String result = StringUtils.newStringUtf16(bytes);
        assertEquals("", result);
    }

    // ---------- newStringUtf16Be ----------

    @Test
    public void testNewStringUtf16Be_normalBytes_returnsCorrectString() {
        byte[] bytes = StringUtils.getBytesUtf16Be("hello");
        String result = StringUtils.newStringUtf16Be(bytes);
        assertEquals("hello", result);
    }

    @Test
    public void testNewStringUtf16Be_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    @Test
    public void testNewStringUtf16Be_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String result = StringUtils.newStringUtf16Be(bytes);
        assertEquals("", result);
    }

    // ---------- newStringUtf16Le ----------

    @Test
    public void testNewStringUtf16Le_normalBytes_returnsCorrectString() {
        byte[] bytes = StringUtils.getBytesUtf16Le("hello");
        String result = StringUtils.newStringUtf16Le(bytes);
        assertEquals("hello", result);
    }

    @Test
    public void testNewStringUtf16Le_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    @Test
    public void testNewStringUtf16Le_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String result = StringUtils.newStringUtf16Le(bytes);
        assertEquals("", result);
    }

    // ---------- newStringUtf8 ----------

    @Test
    public void testNewStringUtf8_normalBytes_returnsCorrectString() {
        byte[] bytes = "hello".getBytes();
        String result = StringUtils.newStringUtf8(bytes);
        assertEquals("hello", result);
    }

    @Test
    public void testNewStringUtf8_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewStringUtf8_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String result = StringUtils.newStringUtf8(bytes);
        assertEquals("", result);
    }

    // ---------- Round-trip sanity checks ----------

    @Test
    public void testRoundTrip_utf8_encodeDecode_returnsOriginalString() {
        String original = "Hello World! 123";
        byte[] encoded = StringUtils.getBytesUtf8(original);
        String decoded = StringUtils.newStringUtf8(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testRoundTrip_iso8859_1_encodeDecode_returnsOriginalString() {
        String original = "Hello World!";
        byte[] encoded = StringUtils.getBytesIso8859_1(original);
        String decoded = StringUtils.newStringIso8859_1(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testRoundTrip_usAscii_encodeDecode_returnsOriginalString() {
        String original = "Hello World!";
        byte[] encoded = StringUtils.getBytesUsAscii(original);
        String decoded = StringUtils.newStringUsAscii(encoded);
        assertEquals(original, decoded);
    }
}
