package org.apache.commons.codec.binary;

import org.apache.commons.codec.CharEncoding;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Tests {@link StringUtils}.
 */
public class StringUtilsTest {

    private static final String TEST_STRING = "Hello World! \u00e9\u00e0";
    private static final String ASCII_STRING = "Hello World!";
    private static final String INVALID_CHARSET = "INVALID_CHARSET_NAME_12345";

    @Test
    public void testConstructor_instantiation_success() {
        final StringUtils instance = new StringUtils();
        assertNotNull(instance);
    }

    // --- getBytesIso8859_1 Tests ---

    @Test
    public void testGetBytesIso8859_1_nullString_returnsNull() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1_emptyString_returnsEmptyArray() {
        assertArrayEquals(new byte[0], StringUtils.getBytesIso8859_1(""));
    }

    @Test
    public void testGetBytesIso8859_1_validString_returnsEncodedBytes() {
        final byte[] bytes = StringUtils.getBytesIso8859_1(ASCII_STRING);
        assertNotNull(bytes);
        assertEquals(ASCII_STRING, StringUtils.newStringIso8859_1(bytes));
    }

    // --- getBytesUsAscii Tests ---

    @Test
    public void testGetBytesUsAscii_nullString_returnsNull() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAscii_emptyString_returnsEmptyArray() {
        assertArrayEquals(new byte[0], StringUtils.getBytesUsAscii(""));
    }

    @Test
    public void testGetBytesUsAscii_validString_returnsEncodedBytes() {
        final byte[] bytes = StringUtils.getBytesUsAscii(ASCII_STRING);
        assertNotNull(bytes);
        assertEquals(ASCII_STRING, StringUtils.newStringUsAscii(bytes));
    }

    // --- getBytesUtf16 Tests ---

    @Test
    public void testGetBytesUtf16_nullString_returnsNull() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16_emptyString_returnsEmptyArray() {
        assertArrayEquals(new byte[0], StringUtils.getBytesUtf16(""));
    }

    @Test
    public void testGetBytesUtf16_validString_returnsEncodedBytes() {
        final byte[] bytes = StringUtils.getBytesUtf16(TEST_STRING);
        assertNotNull(bytes);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16(bytes));
    }

    // --- getBytesUtf16Be Tests ---

    @Test
    public void testGetBytesUtf16Be_nullString_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Be_emptyString_returnsEmptyArray() {
        assertArrayEquals(new byte[0], StringUtils.getBytesUtf16Be(""));
    }

    @Test
    public void testGetBytesUtf16Be_validString_returnsEncodedBytes() {
        final byte[] bytes = StringUtils.getBytesUtf16Be(TEST_STRING);
        assertNotNull(bytes);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16Be(bytes));
    }

    // --- getBytesUtf16Le Tests ---

    @Test
    public void testGetBytesUtf16Le_nullString_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16Le_emptyString_returnsEmptyArray() {
        assertArrayEquals(new byte[0], StringUtils.getBytesUtf16Le(""));
    }

    @Test
    public void testGetBytesUtf16Le_validString_returnsEncodedBytes() {
        final byte[] bytes = StringUtils.getBytesUtf16Le(TEST_STRING);
        assertNotNull(bytes);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16Le(bytes));
    }

    // --- getBytesUtf8 Tests ---

    @Test
    public void testGetBytesUtf8_nullString_returnsNull() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8_emptyString_returnsEmptyArray() {
        assertArrayEquals(new byte[0], StringUtils.getBytesUtf8(""));
    }

    @Test
    public void testGetBytesUtf8_validString_returnsEncodedBytes() {
        final byte[] bytes = StringUtils.getBytesUtf8(TEST_STRING);
        assertNotNull(bytes);
        assertEquals(TEST_STRING, StringUtils.newStringUtf8(bytes));
    }

    // --- getBytesUnchecked Tests ---

    @Test
    public void testGetBytesUnchecked_nullString_returnsNull() {
        assertNull(StringUtils.getBytesUnchecked(null, CharEncoding.UTF_8));
    }

    @Test
    public void testGetBytesUnchecked_validStringAndCharset_returnsEncodedBytes() {
        final byte[] bytes = StringUtils.getBytesUnchecked(TEST_STRING, CharEncoding.UTF_8);
        assertNotNull(bytes);
        assertEquals(TEST_STRING, StringUtils.newStringUtf8(bytes));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUnchecked_invalidCharset_throwsIllegalStateException() {
        StringUtils.getBytesUnchecked(TEST_STRING, INVALID_CHARSET);
    }

    @Test
    public void testGetBytesUnchecked_invalidCharset_exceptionContainsDetails() {
        try {
            StringUtils.getBytesUnchecked(TEST_STRING, INVALID_CHARSET);
        } catch (final IllegalStateException e) {
            assertTrue(e.getMessage().contains(INVALID_CHARSET));
            assertNotNull(e.getCause());
        }
    }

    // --- newString(byte[], String) Tests ---

    @Test
    public void testNewString_nullBytes_returnsNull() {
        assertNull(StringUtils.newString(null, CharEncoding.UTF_8));
    }

    @Test
    public void testNewString_validBytesAndCharset_returnsString() {
        final byte[] bytes = StringUtils.getBytesUtf8(TEST_STRING);
        assertEquals(TEST_STRING, StringUtils.newString(bytes, CharEncoding.UTF_8));
    }

    @Test
    public void testNewString_emptyBytes_returnsEmptyString() {
        assertEquals("", StringUtils.newString(new byte[0], CharEncoding.UTF_8));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewString_invalidCharset_throwsIllegalStateException() {
        final byte[] bytes = new byte[] { 65, 66, 67 };
        StringUtils.newString(bytes, INVALID_CHARSET);
    }

    @Test
    public void testNewString_invalidCharset_exceptionContainsDetails() {
        try {
            final byte[] bytes = new byte[] { 65, 66, 67 };
            StringUtils.newString(bytes, INVALID_CHARSET);
        } catch (final IllegalStateException e) {
            assertTrue(e.getMessage().contains(INVALID_CHARSET));
            assertNotNull(e.getCause());
        }
    }

    // --- newStringIso8859_1 Tests ---

    @Test(expected = NullPointerException.class)
    public void testNewStringIso8859_1_nullBytes_throwsNullPointerException() {
        StringUtils.newStringIso8859_1(null);
    }

    @Test
    public void testNewStringIso8859_1_emptyBytes_returnsEmptyString() {
        assertEquals("", StringUtils.newStringIso8859_1(new byte[0]));
    }

    @Test
    public void testNewStringIso8859_1_validBytes_returnsDecodedString() {
        final byte[] bytes = StringUtils.getBytesIso8859_1(ASCII_STRING);
        assertEquals(ASCII_STRING, StringUtils.newStringIso8859_1(bytes));
    }

    // --- newStringUsAscii Tests ---

    @Test(expected = NullPointerException.class)
    public void testNewStringUsAscii_nullBytes_throwsNullPointerException() {
        StringUtils.newStringUsAscii(null);
    }

    @Test
    public void testNewStringUsAscii_emptyBytes_returnsEmptyString() {
        assertEquals("", StringUtils.newStringUsAscii(new byte[0]));
    }

    @Test
    public void testNewStringUsAscii_validBytes_returnsDecodedString() {
        final byte[] bytes = StringUtils.getBytesUsAscii(ASCII_STRING);
        assertEquals(ASCII_STRING, StringUtils.newStringUsAscii(bytes));
    }

    // --- newStringUtf16 Tests ---

    @Test(expected = NullPointerException.class)
    public void testNewStringUtf16_nullBytes_throwsNullPointerException() {
        StringUtils.newStringUtf16(null);
    }

    @Test
    public void testNewStringUtf16_emptyBytes_returnsEmptyString() {
        assertEquals("", StringUtils.newStringUtf16(new byte[0]));
    }

    @Test
    public void testNewStringUtf16_validBytes_returnsDecodedString() {
        final byte[] bytes = StringUtils.getBytesUtf16(TEST_STRING);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16(bytes));
    }

    // --- newStringUtf16Be Tests ---

    @Test(expected = NullPointerException.class)
    public void testNewStringUtf16Be_nullBytes_throwsNullPointerException() {
        StringUtils.newStringUtf16Be(null);
    }

    @Test
    public void testNewStringUtf16Be_emptyBytes_returnsEmptyString() {
        assertEquals("", StringUtils.newStringUtf16Be(new byte[0]));
    }

    @Test
    public void testNewStringUtf16Be_validBytes_returnsDecodedString() {
        final byte[] bytes = StringUtils.getBytesUtf16Be(TEST_STRING);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16Be(bytes));
    }

    // --- newStringUtf16Le Tests ---

    @Test(expected = NullPointerException.class)
    public void testNewStringUtf16Le_nullBytes_throwsNullPointerException() {
        StringUtils.newStringUtf16Le(null);
    }

    @Test
    public void testNewStringUtf16Le_emptyBytes_returnsEmptyString() {
        assertEquals("", StringUtils.newStringUtf16Le(new byte[0]));
    }

    @Test
    public void testNewStringUtf16Le_validBytes_returnsDecodedString() {
        final byte[] bytes = StringUtils.getBytesUtf16Le(TEST_STRING);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16Le(bytes));
    }

    // --- newStringUtf8 Tests ---

    @Test
    public void testNewStringUtf8_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewStringUtf8_emptyBytes_returnsEmptyString() {
        assertEquals("", StringUtils.newStringUtf8(new byte[0]));
    }

    @Test
    public void testNewStringUtf8_validBytes_returnsDecodedString() {
        final byte[] bytes = StringUtils.getBytesUtf8(TEST_STRING);
        assertEquals(TEST_STRING, StringUtils.newStringUtf8(bytes));
    }
}
