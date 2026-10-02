import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Base64InputStreamTest {

    private byte[] originalData;

    @Before
    public void setUp() {
        originalData = "Hello, World! Testing Base64 stream 1234567890".getBytes();
    }

    /* Helper: reads all available bytes from an InputStream using read(byte[], int, int) */
    private byte[] readAllUsingArrayRead(InputStream in) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[64];
        int n;
        while ((n = in.read(buf, 0, buf.length)) != -1) {
            if (n > 0) {
                baos.write(buf, 0, n);
            }
        }
        return baos.toByteArray();
    }

    /* Helper: reads all available bytes from an InputStream using read() single-byte method */
    private byte[] readAllUsingSingleRead(InputStream in) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int b;
        while ((b = in.read()) != -1) {
            baos.write(b);
        }
        return baos.toByteArray();
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_defaultDecodeMode_createsInstance() {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais);
        assertNotNull(stream);
    }

    @Test
    public void testConstructor_withDoEncodeTrue_createsInstance() {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, true);
        assertNotNull(stream);
    }

    @Test
    public void testConstructor_withDoEncodeFalse_createsInstance() {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, false);
        assertNotNull(stream);
    }

    @Test
    public void testConstructor_withLineLengthAndSeparator_createsInstance() {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, true, 4, new byte[] { '\n' });
        assertNotNull(stream);
    }

    // ---------- markSupported Tests ----------

    @Test
    public void testMarkSupported_alwaysFalse() {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais);
        assertFalse(stream.markSupported());
    }

    // ---------- Normal / Typical Input Tests ----------

    @Test
    public void testEncodeThenDecode_normalData_roundTripUsingArrayRead() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream encodeStream = new Base64InputStream(bais, true);
        byte[] encoded = readAllUsingArrayRead(encodeStream);

        assertTrue(encoded.length > 0);

        ByteArrayInputStream encodedInput = new ByteArrayInputStream(encoded);
        Base64InputStream decodeStream = new Base64InputStream(encodedInput, false);
        byte[] decoded = readAllUsingArrayRead(decodeStream);

        assertArrayEquals(originalData, decoded);
    }

    @Test
    public void testEncodeThenDecode_normalData_roundTripUsingSingleRead() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream encodeStream = new Base64InputStream(bais, true);
        byte[] encoded = readAllUsingSingleRead(encodeStream);

        assertTrue(encoded.length > 0);

        ByteArrayInputStream encodedInput = new ByteArrayInputStream(encoded);
        Base64InputStream decodeStream = new Base64InputStream(encodedInput, false);
        byte[] decoded = readAllUsingSingleRead(decodeStream);

        assertArrayEquals(originalData, decoded);
    }

    @Test
    public void testEncodeThenDecode_withCustomLineLengthAndSeparator_roundTrip() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream encodeStream = new Base64InputStream(bais, true, 4, new byte[] { '\n' });
        byte[] encoded = readAllUsingArrayRead(encodeStream);

        assertTrue(encoded.length > 0);

        ByteArrayInputStream encodedInput = new ByteArrayInputStream(encoded);
        Base64InputStream decodeStream = new Base64InputStream(encodedInput, false);
        byte[] decoded = readAllUsingArrayRead(decodeStream);

        assertArrayEquals(originalData, decoded);
    }

    @Test
    public void testEncodeThenDecode_largeData_roundTrip() throws IOException {
        byte[] largeData = new byte[50000];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 256);
        }

        ByteArrayInputStream bais = new ByteArrayInputStream(largeData);
        Base64InputStream encodeStream = new Base64InputStream(bais, true);
        byte[] encoded = readAllUsingArrayRead(encodeStream);

        assertTrue(encoded.length > 0);

        ByteArrayInputStream encodedInput = new ByteArrayInputStream(encoded);
        Base64InputStream decodeStream = new Base64InputStream(encodedInput, false);
        byte[] decoded = readAllUsingArrayRead(decodeStream);

        assertArrayEquals(largeData, decoded);
    }

    @Test
    public void testRead_singleByteMode_decodesCorrectly() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream encodeStream = new Base64InputStream(bais, true);
        byte[] encoded = readAllUsingArrayRead(encodeStream);

        ByteArrayInputStream encodedInput = new ByteArrayInputStream(encoded);
        Base64InputStream decodeStream = new Base64InputStream(encodedInput, false);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int b;
        while ((b = decodeStream.read()) != -1) {
            assertTrue(b >= 0 && b <= 255);
            baos.write(b);
        }
        assertArrayEquals(originalData, baos.toByteArray());
    }

    // ---------- Edge Case Tests ----------

    @Test
    public void testRead_emptyStream_returnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        Base64InputStream stream = new Base64InputStream(bais, false);
        assertEquals(-1, stream.read());
    }

    @Test
    public void testReadByteArray_emptyStream_returnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        Base64InputStream stream = new Base64InputStream(bais, false);
        byte[] buf = new byte[10];
        int result = stream.read(buf, 0, 10);
        assertEquals(-1, result);
    }

    @Test
    public void testReadByteArray_lenZero_returnsZero() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, false);
        byte[] buf = new byte[5];
        int result = stream.read(buf, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testReadByteArray_offsetZeroLenZero_returnsZero() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        Base64InputStream stream = new Base64InputStream(bais, false);
        byte[] buf = new byte[0];
        int result = stream.read(buf, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testEncodeThenDecode_singleByteData_roundTrip() throws IOException {
        byte[] singleByteData = new byte[] { (byte) 65 };
        ByteArrayInputStream bais = new ByteArrayInputStream(singleByteData);
        Base64InputStream encodeStream = new Base64InputStream(bais, true);
        byte[] encoded = readAllUsingArrayRead(encodeStream);

        ByteArrayInputStream encodedInput = new ByteArrayInputStream(encoded);
        Base64InputStream decodeStream = new Base64InputStream(encodedInput, false);
        byte[] decoded = readAllUsingArrayRead(decodeStream);

        assertArrayEquals(singleByteData, decoded);
    }

    @Test
    public void testConstructor_withZeroLineLength_encodesWithoutLineBreaks() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream encodeStream = new Base64InputStream(bais, true, 0, new byte[] { '\r', '\n' });
        byte[] encoded = readAllUsingArrayRead(encodeStream);
        assertTrue(encoded.length > 0);

        ByteArrayInputStream encodedInput = new ByteArrayInputStream(encoded);
        Base64InputStream decodeStream = new Base64InputStream(encodedInput, false);
        byte[] decoded = readAllUsingArrayRead(decodeStream);

        assertArrayEquals(originalData, decoded);
    }

    @Test
    public void testConstructor_withNegativeLineLength_treatedAsNoLineBreaks() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream encodeStream = new Base64InputStream(bais, true, -1, new byte[] { '\r', '\n' });
        byte[] encoded = readAllUsingArrayRead(encodeStream);
        assertTrue(encoded.length > 0);
    }

    // ---------- Exception Tests ----------

    @Test(expected = NullPointerException.class)
    public void testReadByteArray_nullBuffer_throwsNullPointerException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, false);
        stream.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, false);
        byte[] buf = new byte[5];
        stream.read(buf, -1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_negativeLen_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, false);
        byte[] buf = new byte[5];
        stream.read(buf, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_offsetGreaterThanBufferLength_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, false);
        byte[] buf = new byte[5];
        stream.read(buf, 10, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_offsetPlusLenExceedsBufferLength_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, false);
        byte[] buf = new byte[5];
        stream.read(buf, 3, 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_bothOffsetAndLenNegative_throwsIndexOutOfBoundsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(originalData);
        Base64InputStream stream = new Base64InputStream(bais, false);
        byte[] buf = new byte[5];
        stream.read(buf, -1, -1);
    }
}
