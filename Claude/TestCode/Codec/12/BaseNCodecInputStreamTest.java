import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.binary.Base64InputStream;
import org.junit.Test;

public class BaseNCodecInputStreamTest {

    // ---------- read() single byte tests ----------

    @Test
    public void testRead_singleByte_normalInput() throws IOException {
        byte[] original = "Hello".getBytes();
        InputStream in = new ByteArrayInputStream(original);
        Base64InputStream encStream = new Base64InputStream(in, true);

        ByteArrayOutputStream encodedOut = new ByteArrayOutputStream();
        int b;
        while ((b = encStream.read()) != -1) {
            encodedOut.write(b);
        }
        encStream.close();

        byte[] encodedBytes = encodedOut.toByteArray();
        assertTrue(encodedBytes.length > 0);

        InputStream decIn = new ByteArrayInputStream(encodedBytes);
        Base64InputStream decStream = new Base64InputStream(decIn, false);

        ByteArrayOutputStream decodedOut = new ByteArrayOutputStream();
        int d;
        while ((d = decStream.read()) != -1) {
            decodedOut.write(d);
        }
        decStream.close();

        assertEquals("Hello", new String(decodedOut.toByteArray()));
    }

    @Test
    public void testRead_EOF_returnsMinusOne() throws IOException {
        byte[] original = "A".getBytes();
        InputStream in = new ByteArrayInputStream(original);
        Base64InputStream encStream = new Base64InputStream(in, true);

        int r;
        while ((r = encStream.read()) != -1) {
            // consume all
        }
        // subsequent read should still return EOF
        assertEquals(-1, encStream.read());
        encStream.close();
    }

    @Test
    public void testRead_emptyInput_returnsEOF() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream encStream = new Base64InputStream(in, true);
        assertEquals(-1, encStream.read());
        encStream.close();
    }

    // ---------- read(byte[], offset, len) tests ----------

    @Test
    public void testReadByteArray_normalInput_returnsCorrectLength() throws IOException {
        byte[] original = "HelloWorld".getBytes();
        InputStream in = new ByteArrayInputStream(original);
        Base64InputStream encStream = new Base64InputStream(in, true);

        byte[] buffer = new byte[100];
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len;
        while ((len = encStream.read(buffer, 0, buffer.length)) != -1) {
            out.write(buffer, 0, len);
        }
        encStream.close();

        byte[] encodedBytes = out.toByteArray();
        assertTrue(encodedBytes.length > 0);

        InputStream decIn = new ByteArrayInputStream(encodedBytes);
        Base64InputStream decStream = new Base64InputStream(decIn, false);

        byte[] decBuffer = new byte[100];
        ByteArrayOutputStream decOut = new ByteArrayOutputStream();
        int dlen;
        while ((dlen = decStream.read(decBuffer, 0, decBuffer.length)) != -1) {
            decOut.write(decBuffer, 0, dlen);
        }
        decStream.close();

        assertEquals("HelloWorld", new String(decOut.toByteArray()));
    }

    @Test(expected = NullPointerException.class)
    public void testReadByteArray_nullArray_throwsNPE() throws IOException {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Base64InputStream encStream = new Base64InputStream(in, true);
        try {
            encStream.read(null, 0, 10);
        } finally {
            encStream.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Base64InputStream encStream = new Base64InputStream(in, true);
        byte[] buffer = new byte[10];
        try {
            encStream.read(buffer, -1, 5);
        } finally {
            encStream.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_negativeLen_throwsIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Base64InputStream encStream = new Base64InputStream(in, true);
        byte[] buffer = new byte[10];
        try {
            encStream.read(buffer, 0, -5);
        } finally {
            encStream.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_offsetExceedsArrayLength_throwsIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Base64InputStream encStream = new Base64InputStream(in, true);
        byte[] buffer = new byte[10];
        try {
            encStream.read(buffer, 11, 5);
        } finally {
            encStream.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArray_offsetPlusLenExceedsArrayLength_throwsIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Base64InputStream encStream = new Base64InputStream(in, true);
        byte[] buffer = new byte[10];
        try {
            encStream.read(buffer, 5, 10);
        } finally {
            encStream.close();
        }
    }

    @Test
    public void testReadByteArray_zeroLen_returnsZero() throws IOException {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Base64InputStream encStream = new Base64InputStream(in, true);
        byte[] buffer = new byte[10];
        int result = encStream.read(buffer, 0, 0);
        assertEquals(0, result);
        encStream.close();
    }

    // ---------- markSupported() test ----------

    @Test
    public void testMarkSupported_returnsFalse() throws IOException {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Base64InputStream encStream = new Base64InputStream(in, true);
        assertEquals(false, encStream.markSupported());
        encStream.close();
    }

    // ---------- Encode/Decode full stream tests ----------

    @Test
    public void testEncodeStream_readAll_returnsEncodedData() throws IOException {
        byte[] original = "The quick brown fox jumps over the lazy dog".getBytes();
        InputStream in = new ByteArrayInputStream(original);
        Base64InputStream encStream = new Base64InputStream(in, true);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[16];
        int len;
        while ((len = encStream.read(buf, 0, buf.length)) != -1) {
            out.write(buf, 0, len);
        }
        encStream.close();

        assertTrue(out.toByteArray().length > 0);
    }

    @Test
    public void testDecodeStream_readAll_returnsDecodedData() throws IOException {
        byte[] original = "SimpleTestData".getBytes();
        InputStream in = new ByteArrayInputStream(original);
        Base64InputStream encStream = new Base64InputStream(in, true);

        ByteArrayOutputStream encodedOut = new ByteArrayOutputStream();
        byte[] buf = new byte[16];
        int len;
        while ((len = encStream.read(buf, 0, buf.length)) != -1) {
            encodedOut.write(buf, 0, len);
        }
        encStream.close();

        InputStream decIn = new ByteArrayInputStream(encodedOut.toByteArray());
        Base64InputStream decStream = new Base64InputStream(decIn, false);

        ByteArrayOutputStream decodedOut = new ByteArrayOutputStream();
        byte[] decBuf = new byte[16];
        int dlen;
        while ((dlen = decStream.read(decBuf, 0, decBuf.length)) != -1) {
            decodedOut.write(decBuf, 0, dlen);
        }
        decStream.close();

        assertEquals("SimpleTestData", new String(decodedOut.toByteArray()));
    }

    @Test
    public void testRead_largeInput_multipleBufferReads() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append('X');
        }
        byte[] original = sb.toString().getBytes();
        InputStream in = new ByteArrayInputStream(original);
        Base64InputStream encStream = new Base64InputStream(in, true);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[512];
        int len;
        while ((len = encStream.read(buf, 0, buf.length)) != -1) {
            out.write(buf, 0, len);
        }
        encStream.close();

        assertTrue(out.toByteArray().length > 0);
    }

    @Test
    public void testRead_singleByteAfterEmptyResult_handlesLoopCorrectly() throws IOException {
        // Input containing whitespace which decode may skip returning 0 in some iterations
        byte[] original = "   \n  \t  ".getBytes();
        InputStream in = new ByteArrayInputStream(original);
        Base64InputStream decStream = new Base64InputStream(in, false);

        int result = decStream.read();
        // whitespace-only input should eventually return EOF
        assertEquals(-1, result);
        decStream.close();
    }

    @Test
    public void testReadByteArray_offsetEqualsArrayLengthWithZeroLen_returnsZero() throws IOException {
        InputStream in = new ByteArrayInputStream("data".getBytes());
        Base64InputStream encStream = new Base64InputStream(in, true);
        byte[] buffer = new byte[5];
        int result = encStream.read(buffer, 5, 0);
        assertEquals(0, result);
        encStream.close();
    }
}
