import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class ChecksumCalculatingInputStreamTest {

    private CRC32 checksum;

    @Before
    public void setUp() {
        checksum = new CRC32();
    }

    // A helper InputStream that always throws IOException on read
    private static class ThrowingInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            throw new IOException("Simulated read error");
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            throw new IOException("Simulated read error");
        }
    }

    // A helper InputStream that returns empty data (0 length reads not applicable to InputStream contract directly)
    private static class EmptyInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            return -1;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            return -1;
        }
    }

    @Test
    public void testRead_singleByte_returnsCorrectByteAndUpdatesChecksum() throws IOException {
        byte[] data = {65, 66, 67}; // "ABC"
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        int firstByte = stream.read();
        Assert.assertEquals(65, firstByte);

        int secondByte = stream.read();
        Assert.assertEquals(66, secondByte);

        int thirdByte = stream.read();
        Assert.assertEquals(67, thirdByte);

        // Verify checksum matches expected CRC32 value for "ABC"
        CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void testRead_endOfStream_returnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        int result = stream.read();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testReadByteArray_normalInput_returnsCorrectDataAndChecksum() throws IOException {
        byte[] data = {1, 2, 3, 4, 5};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[5];
        int bytesRead = stream.read(buffer);

        Assert.assertEquals(5, bytesRead);
        Assert.assertArrayEquals(data, buffer);

        CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void testReadByteArray_emptyArray_returnsZero() throws IOException {
        byte[] data = {1, 2, 3};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[0];
        int bytesRead = stream.read(buffer);

        Assert.assertEquals(0, bytesRead);
    }

    @Test
    public void testReadByteArray_endOfStream_returnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[5];
        int bytesRead = stream.read(buffer);

        Assert.assertEquals(-1, bytesRead);
    }

    @Test
    public void testReadByteArrayOffsetLen_normalInput_returnsCorrectDataAndChecksum() throws IOException {
        byte[] data = {10, 20, 30, 40, 50};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[10];
        int bytesRead = stream.read(buffer, 2, 5);

        Assert.assertEquals(5, bytesRead);
        Assert.assertEquals(10, buffer[2]);
        Assert.assertEquals(20, buffer[3]);
        Assert.assertEquals(30, buffer[4]);
        Assert.assertEquals(40, buffer[5]);
        Assert.assertEquals(50, buffer[6]);

        CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data, 0, data.length);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void testReadByteArrayOffsetLen_endOfStream_returnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[5];
        int bytesRead = stream.read(buffer, 0, 5);

        Assert.assertEquals(-1, bytesRead);
    }

    @Test
    public void testReadByteArrayOffsetLen_zeroLength_returnsZero() throws IOException {
        byte[] data = {1, 2, 3};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[5];
        int bytesRead = stream.read(buffer, 0, 0);

        Assert.assertEquals(0, bytesRead);
    }

    @Test
    public void testSkip_hasData_returnsOne() throws IOException {
        byte[] data = {1, 2, 3};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        long skipped = stream.skip(1);
        Assert.assertEquals(1, skipped);
    }

    @Test
    public void testSkip_endOfStream_returnsZero() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        long skipped = stream.skip(1);
        Assert.assertEquals(0, skipped);
    }

    @Test
    public void testSkip_multipleTimes_consumesBytesOneByOne() throws IOException {
        byte[] data = {1, 2, 3};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        long skipped1 = stream.skip(10);
        Assert.assertEquals(1, skipped1);

        long skipped2 = stream.skip(10);
        Assert.assertEquals(1, skipped2);

        long skipped3 = stream.skip(10);
        Assert.assertEquals(1, skipped3);

        long skipped4 = stream.skip(10);
        Assert.assertEquals(0, skipped4);
    }

    @Test
    public void testGetValue_afterReadingAllData_returnsCorrectChecksum() throws IOException {
        byte[] data = {72, 101, 108, 108, 111}; // "Hello"
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        int b;
        while ((b = stream.read()) != -1) {
            // consume stream
        }

        CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void testGetValue_noDataRead_returnsInitialChecksumValue() {
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(
                checksum, new ByteArrayInputStream(new byte[]{1, 2, 3}));

        Assert.assertEquals(0L, stream.getValue());
    }

    @Test(expected = IOException.class)
    public void testRead_underlyingStreamThrowsIOException_propagatesException() throws IOException {
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(
                checksum, new ThrowingInputStream());

        stream.read();
    }

    @Test(expected = IOException.class)
    public void testReadByteArray_underlyingStreamThrowsIOException_propagatesException() throws IOException {
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(
                checksum, new ThrowingInputStream());

        byte[] buffer = new byte[5];
        stream.read(buffer);
    }

    @Test(expected = IOException.class)
    public void testReadByteArrayOffsetLen_underlyingStreamThrowsIOException_propagatesException() throws IOException {
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(
                checksum, new ThrowingInputStream());

        byte[] buffer = new byte[5];
        stream.read(buffer, 0, 5);
    }

    @Test(expected = IOException.class)
    public void testSkip_underlyingStreamThrowsIOException_propagatesException() throws IOException {
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(
                checksum, new ThrowingInputStream());

        stream.skip(1);
    }

    @Test
    public void testRead_withEmptyInputStreamSubclass_returnsMinusOne() throws IOException {
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(
                checksum, new EmptyInputStream());

        int result = stream.read();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testConstructor_withValidParameters_createsInstance() {
        Checksum crc = new CRC32();
        InputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc, in);

        Assert.assertNotNull(stream);
    }

    @Test
    public void testReadByteArrayOffsetLen_partialRead_updatesChecksumCorrectly() throws IOException {
        byte[] data = {5, 10, 15, 20, 25, 30, 35, 40};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, bais);

        byte[] buffer = new byte[4];
        int firstRead = stream.read(buffer, 0, 4);
        Assert.assertEquals(4, firstRead);

        int secondRead = stream.read(buffer, 0, 4);
        Assert.assertEquals(4, secondRead);

        CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }
}
