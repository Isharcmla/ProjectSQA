import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

import org.apache.commons.codec.binary.Base64InputStream;

public class Base64InputStreamTest {

    private static byte[] readAll(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int c;
        while ((c = in.read(buf, 0, buf.length)) != -1) {
            out.write(buf, 0, c);
        }
        return out.toByteArray();
    }

    private static byte[] readAllSingleByte(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        return out.toByteArray();
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_defaultDoDecode_decodesData() throws IOException {
        String encoded = "SGVsbG8gV29ybGQ="; // "Hello World"
        ByteArrayInputStream bais = new ByteArrayInputStream(encoded.getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] result = readAll(b64is);
        assertEquals("Hello World", new String(result, "UTF-8"));
    }

    @Test
    public void testConstructor_doEncodeTrue_encodesData() throws IOException {
        String plain = "Hello World";
        ByteArrayInputStream bais = new ByteArrayInputStream(plain.getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais, true);
        byte[] result = readAll(b64is);
        assertEquals("SGVsbG8gV29ybGQ=", new String(result, "UTF-8"));
    }

    @Test
    public void testConstructor_withLineLengthAndSeparator_encodesWithCustomLine() throws IOException {
        String plain = "abcdefghijklmnopqrstuvwxyz";
        ByteArrayInputStream bais = new ByteArrayInputStream(plain.getBytes("UTF-8"));
        byte[] lineSep = {'\n'};
        Base64InputStream b64is = new Base64InputStream(bais, true, 4, lineSep);
        byte[] result = readAll(b64is);
        String encoded = new String(result, "UTF-8");
        assertTrue(encoded.contains("\n"));
    }

    @Test
    public void testConstructor_withLineLengthZero_decodeIgnoresLineLength() throws IOException {
        String encoded = "SGVsbG8gV29ybGQ=";
        ByteArrayInputStream bais = new ByteArrayInputStream(encoded.getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais, false, 0, new byte[]{'\n'});
        byte[] result = readAll(b64is);
        assertEquals("Hello World", new String(result, "UTF-8"));
    }

    // ---------- read() single byte tests ----------

    @Test
    public void testRead_singleByte_decodeNormal() throws IOException {
        String encoded = "SGVsbG8gV29ybGQ=";
        ByteArrayInputStream bais = new ByteArrayInputStream(encoded.getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] result = readAllSingleByte(b64is);
        assertEquals("Hello World", new String(result, "UTF-8"));
    }

    @Test
    public void testRead_singleByte_encodeNormal() throws IOException {
        String plain = "Hello World";
        ByteArrayInputStream bais = new ByteArrayInputStream(plain.getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais, true);
        byte[] result = readAllSingleByte(b64is);
        assertEquals("SGVsbG8gV29ybGQ=", new String(result, "UTF-8"));
    }

    @Test
    public void testRead_singleByte_emptyStream_returnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        Base64InputStream b64is = new Base64InputStream(bais);
        int result = b64is.read();
        assertEquals(-1, result);
    }

    @Test
    public void testRead_singleByte_highBitByte_returnsUnsignedValue() throws IOException {
        // encode raw bytes that will decode to a byte with high bit set (>127)
        // Encode byte value 200 (0xC8) using encoder first
        byte[] rawData = new byte[]{(byte) 200};
        ByteArrayInputStream rawIn = new ByteArrayInputStream(rawData);
        Base64InputStream encoder = new Base64InputStream(rawIn, true);
        byte[] encoded = readAll(encoder);

        ByteArrayInputStream encIn = new ByteArrayInputStream(encoded);
        Base64InputStream decoder = new Base64InputStream(encIn, false);
        int val = decoder.read();
        assertEquals(200, val);
    }

    // ---------- read(byte[], int, int) tests ----------

    @Test(expected = NullPointerException.class)
    public void testReadByteArray_nullArray_throwsNullPointerException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("test".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        b64is.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("test".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] buf = new byte[10];
        b64is.read(buf, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_negativeLen_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("test".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] buf = new byte[10];
        b64is.read(buf, 0, -5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_offsetGreaterThanLength_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("test".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] buf = new byte[5];
        b64is.read(buf, 10, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_offsetPlusLenGreaterThanLength_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("test".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] buf = new byte[5];
        b64is.read(buf, 2, 10);
    }

    @Test
    public void testReadByteArray_lenZero_returnsZero() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("test".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] buf = new byte[10];
        int result = b64is.read(buf, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testReadByteArray_normalDecode_returnsDecodedData() throws IOException {
        String encoded = "SGVsbG8gV29ybGQ=";
        ByteArrayInputStream bais = new ByteArrayInputStream(encoded.getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] buf = new byte[100];
        int totalRead = 0;
        int r;
        while ((r = b64is.read(buf, totalRead, buf.length - totalRead)) != -1) {
            totalRead += r;
            if (totalRead >= buf.length) {
                break;
            }
        }
        String result = new String(buf, 0, totalRead, "UTF-8");
        assertEquals("Hello World", result);
    }

    @Test
    public void testReadByteArray_normalEncode_returnsEncodedData() throws IOException {
        String plain = "Hello World";
        ByteArrayInputStream bais = new ByteArrayInputStream(plain.getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais, true);
        byte[] buf = new byte[100];
        int totalRead = 0;
        int r;
        while ((r = b64is.read(buf, totalRead, buf.length - totalRead)) != -1) {
            totalRead += r;
            if (totalRead >= buf.length) {
                break;
            }
        }
        String result = new String(buf, 0, totalRead, "UTF-8");
        assertEquals("SGVsbG8gV29ybGQ=", result);
    }

    @Test
    public void testReadByteArray_emptyStream_returnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] buf = new byte[10];
        int result = b64is.read(buf, 0, buf.length);
        assertEquals(-1, result);
    }

    @Test
    public void testReadByteArray_largeData_decodesFully() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            sb.append('A');
        }
        String plain = sb.toString();

        ByteArrayInputStream plainIn = new ByteArrayInputStream(plain.getBytes("UTF-8"));
        Base64InputStream encoder = new Base64InputStream(plainIn, true);
        byte[] encoded = readAll(encoder);

        ByteArrayInputStream encIn = new ByteArrayInputStream(encoded);
        Base64InputStream decoder = new Base64InputStream(encIn, false);
        byte[] decoded = readAll(decoder);

        assertEquals(plain, new String(decoded, "UTF-8"));
    }

    // ---------- markSupported ----------

    @Test
    public void testMarkSupported_returnsFalse() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("test".getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        assertFalse(b64is.markSupported());
    }

    // ---------- Round trip test ----------

    @Test
    public void testEncodeThenDecode_roundTrip_returnsOriginalData() throws IOException {
        String original = "The quick brown fox jumps over the lazy dog. 1234567890!@#$%^&*()";
        ByteArrayInputStream originalIn = new ByteArrayInputStream(original.getBytes("UTF-8"));
        Base64InputStream encoder = new Base64InputStream(originalIn, true);
        byte[] encodedBytes = readAll(encoder);

        ByteArrayInputStream encodedIn = new ByteArrayInputStream(encodedBytes);
        Base64InputStream decoder = new Base64InputStream(encodedIn, false);
        byte[] decodedBytes = readAll(decoder);

        assertEquals(original, new String(decodedBytes, "UTF-8"));
    }

    @Test
    public void testRead_withNonBase64Characters_skipsInvalidChars() throws IOException {
        // Insert invalid characters that should be ignored by decoder
        String encodedWithNoise = "SGVs\nbG8g\nV29y\nbGQ=";
        ByteArrayInputStream bais = new ByteArrayInputStream(encodedWithNoise.getBytes("UTF-8"));
        Base64InputStream b64is = new Base64InputStream(bais);
        byte[] result = readAll(b64is);
        assertEquals("Hello World", new String(result, "UTF-8"));
    }
}
