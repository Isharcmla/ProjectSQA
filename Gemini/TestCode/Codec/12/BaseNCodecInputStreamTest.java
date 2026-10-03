package org.apache.commons.codec.binary;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BaseNCodecInputStreamTest {

    @Test
    public void testMarkSupported_returnsFalse() {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        Assert.assertFalse(stream.markSupported());
    }

    @Test(expected = NullPointerException.class)
    public void testReadArray_nullBuffer_throwsNullPointerException() throws IOException {
        InputStream in = new ByteArrayInputStream("Hello".getBytes());
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        stream.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArray_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream("Hello".getBytes());
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        stream.read(new byte[10], -1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArray_negativeLength_throwsIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream("Hello".getBytes());
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        stream.read(new byte[10], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArray_offsetGreaterThanLength_throwsIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream("Hello".getBytes());
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        stream.read(new byte[5], 6, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArray_offsetPlusLengthGreaterThanBufferLength_throwsIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream("Hello".getBytes());
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        stream.read(new byte[5], 3, 3);
    }

    @Test
    public void testReadArray_zeroLength_returnsZero() throws IOException {
        InputStream in = new ByteArrayInputStream("Hello".getBytes());
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        int bytesRead = stream.read(new byte[5], 0, 0);
        Assert.assertEquals(0, bytesRead);
    }

    @Test
    public void testEncode_readArray_success() throws IOException {
        byte[] inputData = "Hello World".getBytes(StringUtils.UTF_8);
        InputStream in = new ByteArrayInputStream(inputData);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(0), true);

        byte[] output = new byte[64];
        int bytesRead = stream.read(output, 0, output.length);
        Assert.assertTrue(bytesRead > 0);

        String encodedString = new String(output, 0, bytesRead, StringUtils.UTF_8);
        Assert.assertEquals("SGVsbG8gV29ybGQ=", encodedString);

        int eof = stream.read(output, 0, output.length);
        Assert.assertEquals(-1, eof);
        stream.close();
    }

    @Test
    public void testDecode_readArray_success() throws IOException {
        byte[] inputData = "SGVsbG8gV29ybGQ=".getBytes(StringUtils.UTF_8);
        InputStream in = new ByteArrayInputStream(inputData);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(0), false);

        byte[] output = new byte[64];
        int bytesRead = stream.read(output, 0, output.length);
        Assert.assertTrue(bytesRead > 0);

        String decodedString = new String(output, 0, bytesRead, StringUtils.UTF_8);
        Assert.assertEquals("Hello World", decodedString);

        int eof = stream.read(output, 0, output.length);
        Assert.assertEquals(-1, eof);
        stream.close();
    }

    @Test
    public void testEncode_readSingleByte_handlesNegativeByteCorrectly() throws IOException {
        byte[] inputData = new byte[]{(byte) 0xFF, (byte) 0xFE, (byte) 0xFD};
        InputStream in = new ByteArrayInputStream(inputData);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(0), true);

        int b;
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        while ((b = stream.read()) != -1) {
            Assert.assertTrue("Read byte should be in range 0-255", b >= 0 && b <= 255);
            out.write(b);
        }

        Assert.assertEquals(Base64.encodeBase64String(inputData), new String(out.toByteArray(), StringUtils.UTF_8));
        stream.close();
    }

    @Test
    public void testDecode_readSingleByte_handlesNegativeByteResultCorrectly() throws IOException {
        byte[] expectedData = new byte[]{(byte) 0x80, (byte) 0x90, (byte) 0xFF};
        String base64Str = Base64.encodeBase64String(expectedData);
        InputStream in = new ByteArrayInputStream(base64Str.getBytes(StringUtils.UTF_8));
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(0), false);

        int b1 = stream.read();
        Assert.assertEquals(0x80, b1);
        int b2 = stream.read();
        Assert.assertEquals(0x90, b2);
        int b3 = stream.read();
        Assert.assertEquals(0xFF, b3);

        int eof = stream.read();
        Assert.assertEquals(-1, eof);
        stream.close();
    }

    @Test
    public void testRead_emptyStream_returnsEOF() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        BaseNCodecInputStream encodeStream = new BaseNCodecInputStream(in, new Base64(), true);
        Assert.assertEquals(-1, encodeStream.read());
        Assert.assertEquals(-1, encodeStream.read(new byte[10], 0, 10));
        encodeStream.close();

        InputStream in2 = new ByteArrayInputStream(new byte[0]);
        BaseNCodecInputStream decodeStream = new BaseNCodecInputStream(in2, new Base64(), false);
        Assert.assertEquals(-1, decodeStream.read());
        Assert.assertEquals(-1, decodeStream.read(new byte[10], 0, 10));
        decodeStream.close();
    }

    @Test
    public void testReadArray_withOffsetAndChunkReading() throws IOException {
        byte[] inputData = "Testing Chunk Read Logic with Base64".getBytes(StringUtils.UTF_8);
        InputStream in = new ByteArrayInputStream(inputData);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(0), true);

        byte[] buffer = new byte[8];
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        int bytesRead;
        while ((bytesRead = stream.read(buffer, 2, 4)) != -1) {
            out.write(buffer, 2, bytesRead);
        }

        Assert.assertEquals(Base64.encodeBase64String(inputData), new String(out.toByteArray(), StringUtils.UTF_8));
        stream.close();
    }
}
