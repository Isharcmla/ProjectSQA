package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Tests {@link StringUtils}.
 */
public class StringUtilsTest {

    private static final String TEST_STRING = "Hello World! \u00e9\u00e0\u00ee";
    private static final String ASCII_STRING = "Hello World!";

    @Test
    public void testConstructor_instanceCreation_notNull() {
        final StringUtils instance = new StringUtils();
        assertNotNull(instance);
    }

    @Test
    public void testEquals_bothNull_returnsTrue() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEquals_firstNullSecondNonNull_returnsFalse() {
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    public void testEquals_firstNonNullSecondNull_returnsFalse() {
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        final String str = "abc";
        assertTrue(StringUtils.equals(str, str));
    }

    @Test
    public void testEquals_equalStrings_returnsTrue() {
        assertTrue(StringUtils.equals("abc", "abc"));
        assertTrue(StringUtils.equals("", ""));
    }

    @Test
    public void testEquals_differentStrings_returnsFalse() {
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertFalse(StringUtils.equals("abc", "def"));
        assertFalse(StringUtils.equals("abc", "abcd"));
        assertFalse(StringUtils.equals("abcd", "abc"));
    }

    @Test
    public void testEquals_nonStringCharSequencesEqual_returnsTrue() {
        final StringBuilder sb1 = new StringBuilder("abc");
        final StringBuilder sb2 = new StringBuilder("abc");
        final StringBuffer buffer = new StringBuffer("abc");

        assertTrue(StringUtils.equals(sb1, sb2));
        assertTrue(StringUtils.equals(sb1, "abc"));
        assertTrue(StringUtils.equals("abc", sb1));
        assertTrue(StringUtils.equals(sb1, buffer));
    }

    @Test
    public void testEquals_nonStringCharSequencesNotEqual_returnsFalse() {
        final StringBuilder sb1 = new StringBuilder("abc");
        final StringBuilder sb2 = new StringBuilder("def");
        final StringBuilder sb3 = new StringBuilder("abcd");

        assertFalse(StringUtils.equals(sb1, sb2));
        assertFalse(StringUtils.equals(sb1, sb3));
        assertFalse(StringUtils.equals(sb3, sb1));
        assertFalse(StringUtils.equals(sb1, "ABC"));
    }

    @Test
    public void testGetByteBufferUtf8_nullInput_returnsNull() {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8_validInput_returnsByteBuffer() {
        final ByteBuffer buffer = StringUtils.getByteBufferUtf8(TEST_STRING);
        assertNotNull(buffer);
        assertArrayEquals(StringUtils.getBytesUtf8(TEST_STRING), buffer.array());
    }

    @Test
    public void testGetBytesIso8859_1_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1_validInput_matchesNewString() {
        final byte[] bytes = StringUtils.getBytesIso8859_1(ASCII_STRING);
        assertNotNull(bytes);
        assertEquals(ASCII_STRING, StringUtils.newStringIso8859_1(bytes));
    }

    @Test
    public void testGetBytesUsAscii_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAscii_validInput_matchesNewString() {
        final byte[] bytes = StringUtils.getBytesUsAscii(ASCII_STRING);
        assertNotNull(bytes);
        assertEquals(ASCII_STRING, StringUtils.newStringUsAscii(bytes));
    }

    @Test
    public void testGetBytesUtf16_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16_validInput_matchesNewString() {
        final byte[] bytes = StringUtils.getBytesUtf16(TEST_STRING);
        assertNotNull(bytes);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16(bytes));
    }

    @Test
    public void testGetBytesUtf16Be_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Be_validInput_matchesNewString() {
        final byte[] bytes = StringUtils.getBytesUtf16Be(TEST_STRING);
        assertNotNull(bytes);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16Be(bytes));
    }

    @Test
    public void testGetBytesUtf16Le_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16Le_validInput_matchesNewString() {
        final byte[] bytes = StringUtils.getBytesUtf16Le(TEST_STRING);
        assertNotNull(bytes);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16Le(bytes));
    }

    @Test
    public void testGetBytesUtf8_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8_validInput_matchesNewString() {
        final byte[] bytes = StringUtils.getBytesUtf8(TEST_STRING);
        assertNotNull(bytes);
        assertEquals(TEST_STRING, StringUtils.newStringUtf8(bytes));
    }

    @Test
    public void testGetBytesUnchecked_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test
    public void testGetBytesUnchecked_validInput_returnsBytes() {
        final byte[] bytes = StringUtils.getBytesUnchecked(TEST_STRING, "UTF-8");
        assertNotNull(bytes);
        assertArrayEquals(StringUtils.getBytesUtf8(TEST_STRING), bytes);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUnchecked_invalidCharset_throwsIllegalStateException() {
        StringUtils.getBytesUnchecked(TEST_STRING, "INVALID_CHARSET_NAME");
    }

    @Test
    public void testNewString_nullInput_returnsNull() {
        assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test
    public void testNewString_validInput_returnsString() {
        final byte[] bytes = StringUtils.getBytesUtf8(TEST_STRING);
        final String result = StringUtils.newString(bytes, "UTF-8");
        assertEquals(TEST_STRING, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testNewString_invalidCharset_throwsIllegalStateException() {
        final byte[] bytes = new byte[] { 65, 66, 67 };
        StringUtils.newString(bytes, "INVALID_CHARSET_NAME");
    }

    @Test(expected = NullPointerException.class)
    public void testNewStringIso8859_1_nullInput_throwsNullPointerException() {
        StringUtils.newStringIso8859_1(null);
    }

    @Test
    public void testNewStringUsAscii_nullInput_returnsNull() {
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUtf16_nullInput_returnsNull() {
        assertNull(StringUtils.newStringUtf16(null));
    }

    @Test
    public void testNewStringUtf16Be_nullInput_returnsNull() {
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    @Test
    public void testNewStringUtf16Le_nullInput_returnsNull() {
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    @Test
    public void testNewStringUtf8_nullInput_returnsNull() {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testEmptyStringHandling() {
        assertArrayEquals(new byte[0], StringUtils.getBytesIso8859_1(""));
        assertArrayEquals(new byte[0], StringUtils.getBytesUsAscii(""));
        assertArrayEquals(new byte[0], StringUtils.getBytesUtf16(""));
        assertArrayEquals(new byte[0], StringUtils.getBytesUtf16Be(""));
        assertArrayEquals(new byte[0], StringUtils.getBytesUtf16Le(""));
        assertArrayEquals(new byte[0], StringUtils.getBytesUtf8(""));
        assertArrayEquals(new byte[0], StringUtils.getBytesUnchecked("", "UTF-8"));

        assertEquals("", StringUtils.newStringIso8859_1(new byte[0]));
        assertEquals("", StringUtils.newStringUsAscii(new byte[0]));
        assertEquals("", StringUtils.newStringUtf16(new byte[0]));
        assertEquals("", StringUtils.newStringUtf16Be(new byte[0]));
        assertEquals("", StringUtils.newStringUtf16Le(new byte[0]));
        assertEquals("", StringUtils.newStringUtf8(new byte[0]));
        assertEquals("", StringUtils.newString(new byte[0], "UTF-8"));
    }
}
