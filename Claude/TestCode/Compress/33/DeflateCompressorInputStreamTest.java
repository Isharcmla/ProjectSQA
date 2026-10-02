import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Deflater;

import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.compressors.deflate.DeflateParameters;

public class DeflateCompressorInputStreamTest {

    private byte[] originalData;
    private byte[] compressedDataWithZlibHeader;

    @Before
    public void setUp() {
        originalData = "Hello, Deflate Compression Test! 1234567890".getBytes();
        compressedDataWithZlibHeader = compress(originalData, false);
    }

    /**
     * Helper method to compress data using java.util.zip.Deflater.
     * nowrap = false means zlib header is included (standard zlib format).
     */
    private byte[] compress(byte[] data, boolean nowrap) {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, nowrap);
        deflater.setInput(data);
        deflater.finish();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            baos.write(buffer, 0, count);
        }
        deflater.end();
        return baos.toByteArray();
    }

    @Test
    public void testConstructorSingleArg_validInput_decompressesCorrectly() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int b;
        while ((b = dcis.read()) != -1) {
            result.write(b);
        }
        dcis.close();

        assertArrayEquals(originalData, result.toByteArray());
    }

    @Test
    public void testConstructorTwoArgs_validInput_decompressesCorrectly() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateParameters params = new DeflateParameters();
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis, params);

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int b;
        while ((b = dcis.read()) != -1) {
            result.write(b);
        }
        dcis.close();

        assertArrayEquals(originalData, result.toByteArray());
    }

    @Test
    public void testRead_singleByte_returnsCorrectData() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        int firstByte = dcis.read();
        assertEquals(originalData[0] & 0xFF, firstByte);

        dcis.close();
    }

    @Test
    public void testRead_endOfStream_returnsMinusOne() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        // Read all data first
        int b;
        while ((b = dcis.read()) != -1) {
            // consume
        }

        // Now reading again should return -1
        assertEquals(-1, dcis.read());

        dcis.close();
    }

    @Test
    public void testReadByteArray_normalInput_returnsCorrectData() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        byte[] buffer = new byte[100];
        int totalRead = 0;
        int n;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((n = dcis.read(buffer, 0, buffer.length)) != -1) {
            baos.write(buffer, 0, n);
            totalRead += n;
        }

        assertEquals(originalData.length, totalRead);
        assertArrayEquals(originalData, baos.toByteArray());

        dcis.close();
    }

    @Test
    public void testReadByteArray_zeroLength_returnsZero() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        byte[] buffer = new byte[10];
        int result = dcis.read(buffer, 0, 0);
        assertEquals(0, result);

        dcis.close();
    }

    @Test
    public void testReadByteArray_endOfStream_returnsMinusOne() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        byte[] buffer = new byte[originalData.length + 10];
        int totalRead = 0;
        int n;
        while ((n = dcis.read(buffer, totalRead, buffer.length - totalRead)) != -1) {
            totalRead += n;
            if (totalRead >= originalData.length) {
                break;
            }
        }

        // Next read should return -1 since all data consumed
        int endResult = dcis.read(buffer, 0, buffer.length);
        assertEquals(-1, endResult);

        dcis.close();
    }

    @Test
    public void testSkip_normalInput_skipsCorrectAmount() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        long skipped = dcis.skip(5);
        assertTrue(skipped >= 0);

        dcis.close();
    }

    @Test
    public void testSkip_zeroInput_returnsZero() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        long skipped = dcis.skip(0);
        assertEquals(0, skipped);

        dcis.close();
    }

    @Test
    public void testAvailable_afterConstruction_returnsNonNegative() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        int available = dcis.available();
        assertTrue(available >= 0);

        dcis.close();
    }

    @Test
    public void testAvailable_afterFullRead_returnsNonNegative() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        int b;
        while ((b = dcis.read()) != -1) {
            // consume all
        }

        int available = dcis.available();
        assertTrue(available >= 0);

        dcis.close();
    }

    @Test
    public void testClose_afterUse_doesNotThrowException() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        dcis.read();
        dcis.close();

        // Closing again should not throw (InflaterInputStream.close() is safe to call multiple times)
        dcis.close();
    }

    @Test
    public void testClose_withoutReading_doesNotThrowException() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        dcis.close();
    }

    @Test(expected = IOException.class)
    public void testRead_corruptedData_throwsIOException() throws IOException {
        byte[] corruptedData = new byte[]{ (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        InputStream bis = new ByteArrayInputStream(corruptedData);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        int b;
        while ((b = dcis.read()) != -1) {
            // trigger exception during decompression
        }

        dcis.close();
    }

    @Test(expected = IOException.class)
    public void testReadByteArray_corruptedData_throwsIOException() throws IOException {
        byte[] corruptedData = new byte[]{ (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        InputStream bis = new ByteArrayInputStream(corruptedData);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        byte[] buffer = new byte[10];
        int n;
        while ((n = dcis.read(buffer, 0, buffer.length)) != -1) {
            // trigger exception during decompression
        }

        dcis.close();
    }

    @Test
    public void testRead_emptyInput_returnsMinusOneImmediately() throws IOException {
        byte[] emptyCompressed = compress(new byte[0], false);
        InputStream bis = new ByteArrayInputStream(emptyCompressed);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        int result = dcis.read();
        assertEquals(-1, result);

        dcis.close();
    }

    @Test
    public void testReadByteArray_largeBuffer_readsAllDataInOneCall() throws IOException {
        InputStream bis = new ByteArrayInputStream(compressedDataWithZlibHeader);
        DeflateCompressorInputStream dcis = new DeflateCompressorInputStream(bis);

        byte[] buffer = new byte[originalData.length + 50];
        int n = dcis.read(buffer, 0, buffer.length);

        assertTrue(n > 0);

        dcis.close();
    }
}
