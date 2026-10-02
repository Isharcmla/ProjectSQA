package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.nio.charset.Charset;
import java.util.Arrays;

import org.junit.Test;

public class StringUtilsTest {

    private static final String TEST_STRING = "Hello";
    private static final String EMPTY_STRING = "";

    // ---------- getBytesIso8859_1 ----------

    @Test
    public void testGetBytesIso8859_1_normalInput_returnsCorrectBytes() {
        byte[] expected = TEST_STRING.getBytes(Charset.forName("ISO-8859-1"));
        byte[] actual = StringUtils.getBytesIso8859_1(TEST_STRING);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesIso8859_1_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1_emptyString_returnsEmptyArray() {
        byte[] actual = StringUtils.getBytesIso8859_1(EMPTY_STRING);
        assertArrayEquals(new byte[0], actual);
    }

    // ---------- getBytesUsAscii ----------

    @Test
    public void testGetBytesUsAscii_normalInput_returnsCorrectBytes() {
        byte[] expected = TEST_STRING.getBytes(Charset.forName("US-ASCII"));
        byte[] actual = StringUtils.getBytesUsAscii(TEST_STRING);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesUsAscii_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAscii_emptyString_returnsEmptyArray() {
        byte[] actual = StringUtils.getBytesUsAscii(EMPTY_STRING);
        assertArrayEquals(new byte[0], actual);
    }

    // ---------- getBytesUtf16 ----------

    @Test
    public void testGetBytesUtf16_normalInput_returnsCorrectBytes() {
        byte[] expected = TEST_STRING.getBytes(Charset.forName("UTF-16"));
        byte[] actual = StringUtils.getBytesUtf16(TEST_STRING);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesUtf16_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16_emptyString_returnsBom() {
        byte[] expected = EMPTY_STRING.getBytes(Charset.forName("UTF-16"));
        byte[] actual = StringUtils.getBytesUtf16(EMPTY_STRING);
        assertArrayEquals(expected, actual);
    }

    // ---------- getBytesUtf16Be ----------

    @Test
    public void testGetBytesUtf16Be_normalInput_returnsCorrectBytes() {
        byte[] expected = TEST_STRING.getBytes(Charset.forName("UTF-16BE"));
        byte[] actual = StringUtils.getBytesUtf16Be(TEST_STRING);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesUtf16Be_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Be_emptyString_returnsEmptyArray() {
        byte[] actual = StringUtils.getBytesUtf16Be(EMPTY_STRING);
        assertArrayEquals(new byte[0], actual);
    }

    // ---------- getBytesUtf16Le ----------

    @Test
    public void testGetBytesUtf16Le_normalInput_returnsCorrectBytes() {
        byte[] expected = TEST_STRING.getBytes(Charset.forName("UTF-16LE"));
        byte[] actual = StringUtils.getBytesUtf16Le(TEST_STRING);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesUtf16Le_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16Le_emptyString_returnsEmptyArray() {
        byte[] actual = StringUtils.getBytesUtf16Le(EMPTY_STRING);
        assertArrayEquals(new byte[0], actual);
    }

    // ---------- getBytesUtf8 ----------

    @Test
    public void testGetBytesUtf8_normalInput_returnsCorrectBytes() {
        byte[] expected = TEST_STRING.getBytes(Charset.forName("UTF-8"));
        byte[] actual = StringUtils.getBytesUtf8(TEST_STRING);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesUtf8_nullInput_returnsNull() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8_emptyString_returnsEmptyArray() {
        byte[] actual = StringUtils.getBytesUtf8(EMPTY_STRING);
        assertArrayEquals(new byte[0], actual);
    }

    // ---------- getBytesUnchecked ----------

    @Test
    public void testGetBytesUnchecked_normalInput_returnsCorrectBytes() throws Exception {
        byte[] expected = TEST_STRING.getBytes("UTF-8");
        byte[] actual = StringUtils.getBytesUnchecked(TEST_STRING, "UTF-8");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesUnchecked_nullString_returnsNull() {
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test
    public void testGetBytesUnchecked_invalidCharsetName_throwsIllegalStateException() {
        try {
            StringUtils.getBytesUnchecked(TEST_STRING, "INVALID-CHARSET-NAME");
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException e) {
            // expected
            assertEquals(true, e.getMessage().contains("INVALID-CHARSET-NAME"));
        }
    }

    @Test
    public void testGetBytesUnchecked_emptyString_returnsEmptyArray() {
        byte[] actual = StringUtils.getBytesUnchecked(EMPTY_STRING, "UTF-8");
        assertArrayEquals(new byte[0], actual);
    }

    // ---------- newString(byte[], String) ----------

    @Test
    public void testNewStringWithCharsetName_normalInput_returnsCorrectString() throws Exception {
        byte[] bytes = TEST_STRING.getBytes("UTF-8");
        String actual = StringUtils.newString(bytes, "UTF-8");
        assertEquals(TEST_STRING, actual);
    }

    @Test
    public void testNewStringWithCharsetName_nullBytes_returnsNull() {
        assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test
    public void testNewStringWithCharsetName_invalidCharsetName_throwsIllegalStateException() {
        byte[] bytes = { 1, 2, 3 };
        try {
            StringUtils.newString(bytes, "INVALID-CHARSET-NAME");
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException e) {
            // expected
            assertEquals(true, e.getMessage().contains("INVALID-CHARSET-NAME"));
        }
    }

    @Test
    public void testNewStringWithCharsetName_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String actual = StringUtils.newString(bytes, "UTF-8");
        assertEquals(EMPTY_STRING, actual);
    }

    // ---------- newStringIso8859_1 ----------

    @Test
    public void testNewStringIso8859_1_normalInput_returnsCorrectString() {
        byte[] bytes = TEST_STRING.getBytes(Charset.forName("ISO-8859-1"));
        String actual = StringUtils.newStringIso8859_1(bytes);
        assertEquals(TEST_STRING, actual);
    }

    @Test
    public void testNewStringIso8859_1_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringIso8859_1(null));
    }

    @Test
    public void testNewStringIso8859_1_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String actual = StringUtils.newStringIso8859_1(bytes);
        assertEquals(EMPTY_STRING, actual);
    }

    // ---------- newStringUsAscii ----------

    @Test
    public void testNewStringUsAscii_normalInput_returnsCorrectString() {
        byte[] bytes = TEST_STRING.getBytes(Charset.forName("US-ASCII"));
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(TEST_STRING, actual);
    }

    @Test
    public void testNewStringUsAscii_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUsAscii_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(EMPTY_STRING, actual);
    }

    // ---------- newStringUtf16 ----------

    @Test
    public void testNewStringUtf16_normalInput_returnsCorrectString() {
        byte[] bytes = TEST_STRING.getBytes(Charset.forName("UTF-16"));
        String actual = StringUtils.newStringUtf16(bytes);
        assertEquals(TEST_STRING, actual);
    }

    @Test
    public void testNewStringUtf16_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf16(null));
    }

    @Test
    public void testNewStringUtf16_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String actual = StringUtils.newStringUtf16(bytes);
        assertEquals(EMPTY_STRING, actual);
    }

    // ---------- newStringUtf16Be ----------

    @Test
    public void testNewStringUtf16Be_normalInput_returnsCorrectString() {
        byte[] bytes = TEST_STRING.getBytes(Charset.forName("UTF-16BE"));
        String actual = StringUtils.newStringUtf16Be(bytes);
        assertEquals(TEST_STRING, actual);
    }

    @Test
    public void testNewStringUtf16Be_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    @Test
    public void testNewStringUtf16Be_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String actual = StringUtils.newStringUtf16Be(bytes);
        assertEquals(EMPTY_STRING, actual);
    }

    // ---------- newStringUtf16Le ----------

    @Test
    public void testNewStringUtf16Le_normalInput_returnsCorrectString() {
        byte[] bytes = TEST_STRING.getBytes(Charset.forName("UTF-16LE"));
        String actual = StringUtils.newStringUtf16Le(bytes);
        assertEquals(TEST_STRING, actual);
    }

    @Test
    public void testNewStringUtf16Le_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    @Test
    public void testNewStringUtf16Le_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String actual = StringUtils.newStringUtf16Le(bytes);
        assertEquals(EMPTY_STRING, actual);
    }

    // ---------- newStringUtf8 ----------

    @Test
    public void testNewStringUtf8_normalInput_returnsCorrectString() {
        byte[] bytes = TEST_STRING.getBytes(Charset.forName("UTF-8"));
        String actual = StringUtils.newStringUtf8(bytes);
        assertEquals(TEST_STRING, actual);
    }

    @Test
    public void testNewStringUtf8_nullBytes_returnsNull() {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewStringUtf8_emptyBytes_returnsEmptyString() {
        byte[] bytes = new byte[0];
        String actual = StringUtils.newStringUtf8(bytes);
        assertEquals(EMPTY_STRING, actual);
    }

    // ---------- additional round-trip / boundary tests ----------

    @Test
    public void testRoundTripUtf8_specialCharacters_returnsCorrectString() {
        String special = "héllo wörld! 日本語";
        byte[] bytes = StringUtils.getBytesUtf8(special);
        String actual = StringUtils.newStringUtf8(bytes);
        assertEquals(special, actual);
    }

    @Test
    public void testRoundTripUtf16_specialCharacters_returnsCorrectString() {
        String special = "héllo wörld! 日本語";
        byte[] bytes = StringUtils.getBytesUtf16(special);
        String actual = StringUtils.newStringUtf16(bytes);
        assertEquals(special, actual);
    }

    @Test
    public void testGetBytesUnchecked_boundaryLongString_returnsCorrectLength() throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append('a');
        }
        String longString = sb.toString();
        byte[] expected = longString.getBytes("UTF-8");
        byte[] actual = StringUtils.getBytesUnchecked(longString, "UTF-8");
        assertArrayEquals(expected, actual);
    }
}
