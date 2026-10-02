package org.apache.commons.compress.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.Adler32;
import java.util.zip.CRC32;

public class ChecksumCalculatingInputStreamTest {

    @Test
    public void testReadSingleByte_normalInput_calculatesChecksumCorrectly() throws IOException {
        final byte[] data = new byte[] { 10, 20, 30, 40, 50 };
        final CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data);

        final CRC32 actualChecksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(actualChecksum, new ByteArrayInputStream(data));

        for (byte b : data) {
            Assert.assertEquals(b & 0xFF, stream.read());
        }
        Assert.assertEquals(-1, stream.read());
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void testReadSingleByte_emptyStream_returnsMinusOne() throws IOException {
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[0]));

        Assert.assertEquals(-1, stream.read());
        Assert.assertEquals(0L, stream.getValue());
    }

    @Test
    public void testReadByteArray_normalInput_calculatesChecksumCorrectly() throws IOException {
        final byte[] data = "Hello, Apache Commons Compress!".getBytes();
        final CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data);

        final CRC32 actualChecksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(actualChecksum, new ByteArrayInputStream(data));

        final byte[] buffer = new byte[data.length];
        final int bytesRead = stream.read(buffer);

        Assert.assertEquals(data.length, bytesRead);
        Assert.assertArrayEquals(data, buffer);
        Assert.assertEquals(-1, stream.read(buffer));
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void testReadByteArray_emptyBuffer_returnsZero() throws IOException {
        final byte[] data = new byte[] { 1, 2, 3 };
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(data));

        final byte[] emptyBuffer = new byte[0];
        final int bytesRead = stream.read(emptyBuffer);

        Assert.assertEquals(0, bytesRead);
        Assert.assertEquals(0L, stream.getValue());
    }

    @Test
    public void testReadByteArray_streamAtEof_returnsMinusOne() throws IOException {
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[0]));

        final byte[] buffer = new byte[10];
        Assert.assertEquals(-1, stream.read(buffer));
        Assert.assertEquals(0L, stream.getValue());
    }

    @Test
    public void testReadByteArrayOffsetLength_partialRead_calculatesChecksumCorrectly() throws IOException {
        final byte[] data = "Chunk of data for partial read testing".getBytes();
        final int offset = 2;
        final int length = 10;

        final CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data, 0, length);

        final CRC32 actualChecksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(actualChecksum, new ByteArrayInputStream(data));

        final byte[] buffer = new byte[20];
        final int bytesRead = stream.read(buffer, offset, length);

        Assert.assertEquals(length, bytesRead);
        for (int i = 0; i < length; i++) {
            Assert.assertEquals(data[i], buffer[offset + i]);
        }
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void testReadByteArrayOffsetLength_emptyStream_returnsMinusOne() throws IOException {
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[0]));

        final byte[] buffer = new byte[10];
        final int bytesRead = stream.read(buffer, 0, buffer.length);

        Assert.assertEquals(-1, bytesRead);
        Assert.assertEquals(0L, stream.getValue());
    }

    @Test
    public void testSkip_whenDataAvailable_skipsSingleByteAndReturnsOne() throws IOException {
        final byte[] data = new byte[] { 65, 66, 67 };
        final CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(65);

        final CRC32 actualChecksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(actualChecksum, new ByteArrayInputStream(data));

        final long skipped = stream.skip(100);
        Assert.assertEquals(1L, skipped);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
        Assert.assertEquals(66, stream.read());
    }

    @Test
    public void testSkip_whenStreamExhausted_returnsZero() throws IOException {
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[0]));

        final long skipped = stream.skip(1);
        Assert.assertEquals(0L, skipped);
        Assert.assertEquals(0L, stream.getValue());
    }

    @Test
    public void testSkip_zeroOrNegative_stillReadsSingleByteIfAvailable() throws IOException {
        final byte[] data = new byte[] { 42 };
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(data));

        final long skipped = stream.skip(0);
        Assert.assertEquals(1L, skipped);
        Assert.assertEquals(0L, stream.skip(-1));
    }

    @Test
    public void testGetValue_adler32Algorithm_matchesCalculatedValue() throws IOException {
        final byte[] data = "Testing with Adler32 Checksum Algorithm".getBytes();
        final Adler32 expectedChecksum = new Adler32();
        expectedChecksum.update(data);

        final Adler32 actualChecksum = new Adler32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(actualChecksum, new ByteArrayInputStream(data));

        final byte[] buffer = new byte[data.length];
        final int read = stream.read(buffer);

        Assert.assertEquals(data.length, read);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void testReadByteArray_nullBuffer_throwsNullPointerException() throws IOException {
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[5]));
        stream.read((byte[]) null);
    }

    @Test(expected = NullPointerException.class)
    public void testReadByteArrayOffsetLength_nullBuffer_throwsNullPointerException() throws IOException {
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[5]));
        stream.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayOffsetLength_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[5]));
        final byte[] buffer = new byte[5];
        stream.read(buffer, -1, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayOffsetLength_negativeLength_throwsIndexOutOfBoundsException() throws IOException {
        final CRC32 checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[5]));
        final byte[] buffer = new byte[5];
        stream.read(buffer, 0, -1);
    }

    @Test(expected = NullPointerException.class)
    public void testRead_nullChecksum_throwsNullPointerException() throws IOException {
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(null, new ByteArrayInputStream(new byte[] { 1 }));
        stream.read();
    }

    @Test(expected = NullPointerException.class)
    public void testRead_nullInputStream_throwsNullPointerException() throws IOException {
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(new CRC32(), null);
        stream.read();
    }

    @Test(expected = NullPointerException.class)
    public void testGetValue_nullChecksum_throwsNullPointerException() {
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(null, new ByteArrayInputStream(new byte[0]));
        stream.getValue();
    }
}
