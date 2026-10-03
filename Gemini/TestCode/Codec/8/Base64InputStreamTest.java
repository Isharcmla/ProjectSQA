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

    private static final String HELLO_WORLD_STR = "Hello World";
    private static final byte[] HELLO_WORLD_BYTES = HELLO_WORLD_STR.getBytes();
    private static final String HELLO_WORLD_B64_STR = "SGVsbG8gV29ybGQ=";
    private static final byte[] HELLO_WORLD_B64_BYTES = HELLO_WORLD_B64_STR.getBytes();

    @Test
    public void testConstructor_defaultDecode() throws IOException {
        InputStream in = new ByteArrayInputStream(HELLO_WORLD_B64_BYTES);
        Base64InputStream b64In = new Base64InputStream(in);
        byte[] result = new byte[HELLO_WORLD_BYTES.length];
        int bytesRead = b64In.read(result);
        assertEquals(HELLO_WORLD_BYTES.length, bytesRead);
        assertArrayEquals(HELLO_WORLD_BYTES, result);
        b64In.close();
    }

    @Test
    public void testConstructor_withDoEncodeTrue() throws IOException {
        InputStream in = new ByteArrayInputStream(HELLO_WORLD_BYTES);
        Base64InputStream b64In = new Base64InputStream(in, true);
        byte[] result = new byte[HELLO_WORLD_B64_BYTES.length];
        int bytesRead = b64In.read(result);
        assertEquals(HELLO_WORLD_B64_BYTES.length, bytesRead);
        assertArrayEquals(HELLO_WORLD_B64_BYTES, result);
        b64In.close();
    }

    @Test
    public void testConstructor_withCustomLineLengthAndSeparator() throws IOException {
        byte[] customSeparator = new byte[]{'\n'};
        InputStream in = new ByteArrayInputStream("12345678901234567890".getBytes());
        Base64InputStream b64In = new Base64InputStream(in, true, 8, customSeparator);

        byte[] buffer = new byte[128];
        int bytesRead = 0;
        int read;
        while ((read = b64In.read(buffer, bytesRead, buffer.length - bytesRead)) > 0) {
            bytesRead += read;
        }

        String encoded = new String(Arrays.copyOf(buffer, bytesRead));
        assertTrue(encoded.contains("\n"));
        b64In.close();
    }

    @Test
    public void testRead_singleByte_positiveAndNegativeValues() throws IOException {
        // Raw byte array with both positive (< 128) and negative (> 127 in signed byte)
        byte[] rawBytes = new byte[]{(byte) 'A', (byte) 0xFF, (byte) 0x80, (byte) 0};
        byte[] encoded = Base64.encodeBase64(rawBytes);

        InputStream in = new ByteArrayInputStream(encoded);
        Base64InputStream b64In = new Base64InputStream(in, false);

        assertEquals('A', b64In.read());
        assertEquals(255, b64In.read()); // 0xFF should return 255
        assertEquals(128, b64In.read()); // 0x80 should return 128
        assertEquals(0, b64In.read());
        assertEquals(-1, b64In.read()); // EOF
        b64In.close();
    }

    @Test
    public void testRead_singleByte_encode() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[]{'f'});
        Base64InputStream b64In = new Base64InputStream(in, true);

        assertEquals('Z', b64In.read());
        assertEquals('g', b64In.read());
        assertEquals('=', b64In.read());
        assertEquals('=', b64In.read());
        assertEquals(-1, b64In.read());
        b64In.close();
    }

    @Test
    public void testRead_singleByte_emptyStream_returnsMinusOne() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream b64In = new Base64InputStream(in);
        assertEquals(-1, b64In.read());
        b64In.close();
    }

    @Test(expected = NullPointerException.class)
    public void testRead_arrayNull_throwsNullPointerException() throws IOException {
        Base64InputStream b64In = new Base64InputStream(new ByteArrayInputStream(new byte[10]));
        try {
            b64In.read(null, 0, 1);
        } finally {
            b64In.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        Base64InputStream b64In = new Base64InputStream(new ByteArrayInputStream(new byte[10]));
        try {
            b64In.read(new byte[10], -1, 1);
        } finally {
            b64In.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_negativeLen_throwsIndexOutOfBoundsException() throws IOException {
        Base64InputStream b64In = new Base64InputStream(new ByteArrayInputStream(new byte[10]));
        try {
            b64In.read(new byte[10], 0, -1);
        } finally {
            b64In.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_offsetGreaterThanBufferLength_throwsIndexOutOfBoundsException() throws IOException {
        Base64InputStream b64In = new Base64InputStream(new ByteArrayInputStream(new byte[10]));
        try {
            b64In.read(new byte[10], 11, 0);
        } finally {
            b64In.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_offsetPlusLenGreaterThanBufferLength_throwsIndexOutOfBoundsException() throws IOException {
        Base64InputStream b64In = new Base64InputStream(new ByteArrayInputStream(new byte[10]));
        try {
            b64In.read(new byte[10], 5, 6);
        } finally {
            b64In.close();
        }
    }

    @Test
    public void testRead_lenZero_returnsZero() throws IOException {
        Base64InputStream b64In = new Base64InputStream(new ByteArrayInputStream(new byte[10]));
        int read = b64In.read(new byte[10], 0, 0);
        assertEquals(0, read);
        b64In.close();
    }

    @Test
    public void testRead_array_decodeWithBufferLengthEqualToLen() throws IOException {
        InputStream in = new ByteArrayInputStream(HELLO_WORLD_B64_BYTES);
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buffer = new byte[HELLO_WORLD_BYTES.length];
        int bytesRead = b64In.read(buffer, 0, buffer.length);
        assertEquals(HELLO_WORLD_BYTES.length, bytesRead);
        assertArrayEquals(HELLO_WORLD_BYTES, buffer);
        assertEquals(-1, b64In.read(buffer, 0, buffer.length));
        b64In.close();
    }

    @Test
    public void testRead_array_decodeWithBufferLengthNotEqualToLen() throws IOException {
        InputStream in = new ByteArrayInputStream(HELLO_WORLD_B64_BYTES);
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buffer = new byte[32];
        int bytesRead = b64In.read(buffer, 4, 16);
        assertEquals(HELLO_WORLD_BYTES.length, bytesRead);
        byte[] extracted = Arrays.copyOfRange(buffer, 4, 4 + bytesRead);
        assertArrayEquals(HELLO_WORLD_BYTES, extracted);
        b64In.close();
    }

    @Test
    public void testRead_array_encodeWithBufferLengthEqualToLen() throws IOException {
        InputStream in = new ByteArrayInputStream(HELLO_WORLD_BYTES);
        Base64InputStream b64In = new Base64InputStream(in, true);
        byte[] buffer = new byte[HELLO_WORLD_B64_BYTES.length];
        int bytesRead = b64In.read(buffer, 0, buffer.length);
        assertEquals(HELLO_WORLD_B64_BYTES.length, bytesRead);
        assertArrayEquals(HELLO_WORLD_B64_BYTES, buffer);
        assertEquals(-1, b64In.read(buffer, 0, buffer.length));
        b64In.close();
    }

    @Test
    public void testRead_array_encodeWithBufferLengthNotEqualToLen() throws IOException {
        InputStream in = new ByteArrayInputStream(HELLO_WORLD_BYTES);
        Base64InputStream b64In = new Base64InputStream(in, true);
        byte[] buffer = new byte[32];
        int bytesRead = b64In.read(buffer, 2, 20);
        assertEquals(HELLO_WORLD_B64_BYTES.length, bytesRead);
        byte[] extracted = Arrays.copyOfRange(buffer, 2, 2 + bytesRead);
        assertArrayEquals(HELLO_WORLD_B64_BYTES, extracted);
        b64In.close();
    }

    @Test
    public void testRead_decodeWithWhitespaceAndNonBase64Data() throws IOException {
        String paddedWithWhitespace = "   \r\n\t SGVs   bG8g\r\n  V29y   bGQ=  \r\n ";
        InputStream in = new ByteArrayInputStream(paddedWithWhitespace.getBytes());
        Base64InputStream b64In = new Base64InputStream(in, false);
        byte[] buffer = new byte[64];
        int bytesRead = b64In.read(buffer, 0, buffer.length);
        assertEquals(HELLO_WORLD_BYTES.length, bytesRead);
        byte[] actual = Arrays.copyOf(buffer, bytesRead);
        assertArrayEquals(HELLO_WORLD_BYTES, actual);
        b64In.close();
    }

    @Test
    public void testMarkSupported_returnsFalse() throws IOException {
        Base64InputStream b64In = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(b64In.markSupported());
        b64In.close();
    }

    @Test
    public void testRead_largePayload_encodeAndDecode() throws IOException {
        byte[] largeData = new byte[10000];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 256);
        }

        // Encode stream
        InputStream rawIn = new ByteArrayInputStream(largeData);
        Base64InputStream encodeIn = new Base64InputStream(rawIn, true);
        byte[] encodedBuffer = new byte[16000];
        int totalEncoded = 0;
        int read;
        while ((read = encodeIn.read(encodedBuffer, totalEncoded, encodedBuffer.length - totalEncoded)) > 0) {
            totalEncoded += read;
        }
        encodeIn.close();

        // Decode stream
        InputStream encodedIn = new ByteArrayInputStream(Arrays.copyOf(encodedBuffer, totalEncoded));
        Base64InputStream decodeIn = new Base64InputStream(encodedIn, false);
        byte[] decodedBuffer = new byte[10000];
        int totalDecoded = 0;
        while ((read = decodeIn.read(decodedBuffer, totalDecoded, decodedBuffer.length - totalDecoded)) > 0) {
            totalDecoded += read;
        }
        decodeIn.close();

        assertEquals(largeData.length, totalDecoded);
        assertArrayEquals(largeData, decodedBuffer);
    }
}
