package org.apache.commons.codec.binary;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Base64InputStreamTest {

    private static final String STRING_TO_ENCODE = "Hello World! This is a test string for Base64InputStream coverage.";
    private static final String ENCODED_STRING = "SGVsbG8gV29ybGQhIFRoaXMgaXMgYSB0ZXN0IHN0cmluZyBmb3IgQmFzZTY0SW5wdXRTdHJlYW0gY292ZXJhZ2Uu";

    @Test
    public void testMarkSupported_returnsFalse() {
        InputStream byteIn = new ByteArrayInputStream(new byte[0]);
        Base64InputStream in = new Base64InputStream(byteIn);
        assertFalse(in.markSupported());
    }

    @Test
    public void testConstructor_singleParam_defaultsToDecode() throws IOException {
        byte[] encodedBytes = ENCODED_STRING.getBytes("UTF-8");
        InputStream byteIn = new ByteArrayInputStream(encodedBytes);
        Base64InputStream in = new Base64InputStream(byteIn);

        byte[] result = new byte[STRING_TO_ENCODE.length()];
        int readBytes = in.read(result, 0, result.length);

        assertEquals(STRING_TO_ENCODE.length(), readBytes);
        assertEquals(STRING_TO_ENCODE, new String(result, 0, readBytes, "UTF-8"));
        in.close();
    }

    @Test
    public void testConstructor_twoParams_encode() throws IOException {
        byte[] rawBytes = STRING_TO_ENCODE.getBytes("UTF-8");
        InputStream byteIn = new ByteArrayInputStream(rawBytes);
        Base64InputStream in = new Base64InputStream(byteIn, true);

        byte[] result = new byte[ENCODED_STRING.length()];
        int readBytes = in.read(result, 0, result.length);

        assertEquals(ENCODED_STRING.length(), readBytes);
        assertEquals(ENCODED_STRING, new String(result, 0, readBytes, "UTF-8"));
        in.close();
    }

    @Test
    public void testConstructor_fourParams_chunkedEncode() throws IOException {
        byte[] rawBytes = "12345678".getBytes("UTF-8");
        byte[] separator = new byte[]{'\r', '\n'};
        InputStream byteIn = new ByteArrayInputStream(rawBytes);
        Base64InputStream in = new Base64InputStream(byteIn, true, 4, separator);

        byte[] buffer = new byte[64];
        int bytesRead = in.read(buffer, 0, buffer.length);

        String expected = "MTIz\r\nNDU2\r\nNzg=\r\n";
        String actual = new String(buffer, 0, bytesRead, "UTF-8");
        assertEquals(expected, actual);
        in.close();
    }

    @Test(expected = NullPointerException.class)
    public void testReadArray_nullBuffer_throwsNullPointerException() throws IOException {
        InputStream byteIn = new ByteArrayInputStream(new byte[10]);
        Base64InputStream in = new Base64InputStream(byteIn);
        try {
            in.read(null, 0, 1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArray_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        InputStream byteIn = new ByteArrayInputStream(new byte[10]);
        Base64InputStream in = new Base64InputStream(byteIn);
        try {
            in.read(new byte[10], -1, 1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArray_negativeLen_throwsIndexOutOfBoundsException() throws IOException {
        InputStream byteIn = new ByteArrayInputStream(new byte[10]);
        Base64InputStream in = new Base64InputStream(byteIn);
        try {
            in.read(new byte[10], 0, -1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArray_offsetGreaterThanLength_throwsIndexOutOfBoundsException() throws IOException {
        InputStream byteIn = new ByteArrayInputStream(new byte[10]);
        Base64InputStream in = new Base64InputStream(byteIn);
        try {
            in.read(new byte[10], 11, 0);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArray_offsetPlusLenGreaterThanLength_throwsIndexOutOfBoundsException() throws IOException {
        InputStream byteIn = new ByteArrayInputStream(new byte[10]);
        Base64InputStream in = new Base64InputStream(byteIn);
        try {
            in.read(new byte[10], 5, 6);
        } finally {
            in.close();
        }
    }

    @Test
    public void testReadArray_zeroLen_returnsZero() throws IOException {
        InputStream byteIn = new ByteArrayInputStream(new byte[10]);
        Base64InputStream in = new Base64InputStream(byteIn);
        int result = in.read(new byte[10], 0, 0);
        assertEquals(0, result);
        in.close();
    }

    @Test
    public void testReadArray_emptyStream_returnsNegativeOne() throws IOException {
        InputStream byteIn = new ByteArrayInputStream(new byte[0]);
        Base64InputStream in = new Base64InputStream(byteIn, false);
        int result = in.read(new byte[10], 0, 10);
        assertEquals(-1, result);
        in.close();
    }

    @Test
    public void testReadArray_emptyStreamEncode_returnsNegativeOne() throws IOException {
        InputStream byteIn = new ByteArrayInputStream(new byte[0]);
        Base64InputStream in = new Base64InputStream(byteIn, true);
        int result = in.read(new byte[10], 0, 10);
        assertEquals(-1, result);
        in.close();
    }

    @Test
    public void testReadArray_nonOptimizationBranch_offsetAndLenNotMatchingBufferLength() throws IOException {
        byte[] encodedBytes = ENCODED_STRING.getBytes("UTF-8");
        InputStream byteIn = new ByteArrayInputStream(encodedBytes);
        Base64InputStream in = new Base64InputStream(byteIn, false);

        byte[] dest = new byte[200];
        int offset = 10;
        int len = 20;

        int readBytes = in.read(dest, offset, len);
        assertTrue(readBytes > 0 && readBytes <= len);
        in.close();
    }

    @Test
    public void testReadArray_optimizationBranch_lenEqualsBufferLength() throws IOException {
        byte[] rawBytes = "HelloWorld".getBytes("UTF-8");
        InputStream byteIn = new ByteArrayInputStream(rawBytes);
        Base64InputStream in = new Base64InputStream(byteIn, true);

        byte[] dest = new byte[16];
        int readBytes = in.read(dest, 0, dest.length);
        assertEquals(16, readBytes);
        assertEquals("SGVsbG9Xb3JsZA==", new String(dest, 0, readBytes, "UTF-8"));
        in.close();
    }

    @Test
    public void testReadSingleByte_positiveAndNegativeValues() throws IOException {
        // Base64 encoding of bytes: [0x05, 0x80, 0xFF] -> "BYD/"
        byte[] encoded = "BYD/".getBytes("UTF-8");
        InputStream byteIn = new ByteArrayInputStream(encoded);
        Base64InputStream in = new Base64InputStream(byteIn, false);

        int b1 = in.read();
        assertEquals(5, b1);

        int b2 = in.read();
        assertEquals(128, b2); // 0x80 unsigned is 128

        int b3 = in.read();
        assertEquals(255, b3); // 0xFF unsigned is 255

        int b4 = in.read();
        assertEquals(-1, b4); // EOF

        in.close();
    }

    @Test
    public void testReadSingleByte_eofOnEmptyStream() throws IOException {
        InputStream byteIn = new ByteArrayInputStream(new byte[0]);
        Base64InputStream in = new Base64InputStream(byteIn);

        int result = in.read();
        assertEquals(-1, result);
        in.close();
    }

    @Test
    public void testReadSingleByte_encodeAllBytes() throws IOException {
        byte[] raw = "ABC".getBytes("UTF-8");
        InputStream byteIn = new ByteArrayInputStream(raw);
        Base64InputStream in = new Base64InputStream(byteIn, true);

        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = in.read()) != -1) {
            sb.append((char) b);
        }

        assertEquals("QUJD", sb.toString());
        in.close();
    }

    @Test
    public void testRead_whitespaceAndNonBase64IgnoredWhenDecoding() throws IOException {
        byte[] encodedWithSpaces = " SG Vz bG 8= \r\n".getBytes("UTF-8");
        InputStream byteIn = new ByteArrayInputStream(encodedWithSpaces);
        Base64InputStream in = new Base64InputStream(byteIn, false);

        byte[] output = new byte[10];
        int count = in.read(output, 0, output.length);

        assertEquals(4, count);
        assertEquals("Hell", new String(output, 0, count, "UTF-8"));
        in.close();
    }

    @Test
    public void testRead_largeDataStream() throws IOException {
        byte[] largeData = new byte[10000];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 256);
        }

        InputStream byteIn = new ByteArrayInputStream(largeData);
        Base64InputStream encodeIn = new Base64InputStream(byteIn, true);
        Base64InputStream decodeIn = new Base64InputStream(encodeIn, false);

        byte[] result = new byte[largeData.length];
        int totalRead = 0;
        int r;
        while (totalRead < result.length && (r = decodeIn.read(result, totalRead, result.length - totalRead)) != -1) {
            totalRead += r;
        }

        assertEquals(largeData.length, totalRead);
        assertArrayEquals(largeData, result);
        assertEquals(-1, decodeIn.read());

        decodeIn.close();
        encodeIn.close();
    }
}
