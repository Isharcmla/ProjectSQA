package org.apache.commons.compress.archivers.sevenz;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.junit.Test;

public class CodersTest {

    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset UTF_16LE = Charset.forName("UTF-16LE");

    @Test
    public void testCodersInstantiation() {
        Coders coders = new Coders();
        assertNotNull(coders);
    }

    @Test
    public void testCoderIdInstantiation() {
        Coders.CoderId coderId = new Coders.CoderId(SevenZMethod.COPY, new Coders.CopyDecoder());
        assertSame(SevenZMethod.COPY, coderId.method);
        assertNotNull(coderId.coder);
    }

    @Test
    public void testCoderBaseDefaultEncodeThrowsUnsupportedOperationException() throws IOException {
        Coders.CoderBase base = new Coders.CoderBase() {
            @Override
            InputStream decode(InputStream in, Coder coder, byte[] password) {
                return in;
            }
        };
        try {
            base.encode(new ByteArrayOutputStream(), null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("method doesn't support writing", e.getMessage());
        }
    }

    @Test
    public void testAddDecoderUnsupportedMethodThrowsIOException() {
        Coder coder = new Coder();
        coder.decompressionMethodId = new byte[] { (byte) 0xFF, (byte) 0xEE, (byte) 0xDD };
        try {
            Coders.addDecoder(new ByteArrayInputStream(new byte[0]), coder, null);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().startsWith("Unsupported compression method"));
        }
    }

    @Test
    public void testAddEncoderUnsupportedMethodThrowsIOException() {
        try {
            Coders.addEncoder(new ByteArrayOutputStream(), null, null);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().startsWith("Unsupported compression method"));
        }
    }

    @Test
    public void testCopyDecoderAndEncoder() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.COPY.getId();

        byte[] data = "Hello World SevenZ".getBytes(UTF_8);
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        InputStream is = Coders.addDecoder(bais, coder, null);
        assertSame(bais, is);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream os = Coders.addEncoder(baos, SevenZMethod.COPY, null);
        assertSame(baos, os);
        os.write(data);
        assertArrayEquals(data, baos.toByteArray());
    }

    @Test
    public void testLZMADecoder() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = new byte[] { 0x5d, 0x00, 0x10, 0x00, 0x00 };

        InputStream is = Coders.addDecoder(new ByteArrayInputStream(new byte[0]), coder, null);
        assertNotNull(is);
        is.close();
    }

    @Test
    public void testLZMAEncoderThrowsUnsupportedOperationException() throws IOException {
        try {
            Coders.addEncoder(new ByteArrayOutputStream(), SevenZMethod.LZMA, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("method doesn't support writing", e.getMessage());
        }
    }

    @Test
    public void testLZMA2Decoder() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA2.getId();
        coder.properties = new byte[] { 0x00 };

        InputStream is = Coders.addDecoder(new ByteArrayInputStream(new byte[0]), coder, null);
        assertNotNull(is);
        is.close();
    }

    @Test
    public void testLZMA2EncoderThrowsUnsupportedOperationException() throws IOException {
        try {
            Coders.addEncoder(new ByteArrayOutputStream(), SevenZMethod.LZMA2, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("method doesn't support writing", e.getMessage());
        }
    }

    @Test
    public void testDeflateEncodeAndDecode() throws IOException {
        byte[] original = "Deflate test data payload 1234567890".getBytes(UTF_8);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream encoder = Coders.addEncoder(baos, SevenZMethod.DEFLATE, null);
        encoder.write(original);
        encoder.close();

        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.DEFLATE.getId();
        InputStream decoder = Coders.addDecoder(new ByteArrayInputStream(baos.toByteArray()), coder, null);

        ByteArrayOutputStream decompressed = new ByteArrayOutputStream();
        int b;
        while ((b = decoder.read()) != -1) {
            decompressed.write(b);
        }
        decoder.close();

        assertArrayEquals(original, decompressed.toByteArray());
    }

    @Test
    public void testDeflateDecodeReadByteArray() throws IOException {
        byte[] original = "Deflate byte array read test".getBytes(UTF_8);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream encoder = Coders.addEncoder(baos, SevenZMethod.DEFLATE, null);
        encoder.write(original);
        encoder.close();

        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.DEFLATE.getId();
        InputStream decoder = Coders.addDecoder(new ByteArrayInputStream(baos.toByteArray()), coder, null);

        byte[] buffer = new byte[original.length];
        int bytesRead = decoder.read(buffer, 0, buffer.length);
        assertEquals(original.length, bytesRead);
        assertArrayEquals(original, buffer);
        decoder.close();
    }

    @Test
    public void testBzip2EncodeAndDecode() throws IOException {
        byte[] original = "BZip2 test data string for testing bzip2 encoder and decoder".getBytes(UTF_8);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream encoder = Coders.addEncoder(baos, SevenZMethod.BZIP2, null);
        encoder.write(original);
        encoder.close();

        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.BZIP2.getId();
        InputStream decoder = Coders.addDecoder(new ByteArrayInputStream(baos.toByteArray()), coder, null);

        ByteArrayOutputStream decompressed = new ByteArrayOutputStream();
        byte[] buffer = new byte[32];
        int n;
        while ((n = decoder.read(buffer, 0, buffer.length)) != -1) {
            decompressed.write(buffer, 0, n);
        }
        decoder.close();

        assertArrayEquals(original, decompressed.toByteArray());
    }

    @Test
    public void testAES256SHA256EncoderThrowsUnsupportedOperationException() throws IOException {
        try {
            Coders.addEncoder(new ByteArrayOutputStream(), SevenZMethod.AES256SHA256, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("method doesn't support writing", e.getMessage());
        }
    }

    @Test
    public void testAES256SHA256DecoderPropertiesTooShort() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] { (byte) 0xC1, (byte) 0x23, 0x01 };

        InputStream is = Coders.addDecoder(new ByteArrayInputStream(new byte[16]), coder, new byte[8]);
        try {
            is.read();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Salt size + IV size too long"));
        }
    }

    @Test
    public void testAES256SHA256DecoderPasswordNull() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] { 0x3f, 0x00 };

        InputStream is = Coders.addDecoder(new ByteArrayInputStream(new byte[16]), coder, null);
        try {
            is.read();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Cannot read encrypted files without a password"));
        }
    }

    @Test
    public void testAES256SHA256DecoderDirectKeyDerivationCycles3F() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] { 0x3f, 0x00 };

        byte[] passwordBytes = "pass1234pass1234pass1234pass1234".getBytes(UTF_8);
        byte[] dummyCiphertext = new byte[32];

        InputStream is = Coders.addDecoder(new ByteArrayInputStream(dummyCiphertext), coder, passwordBytes);
        int firstByte = is.read();
        assertTrue(firstByte >= 0 && firstByte <= 255);

        byte[] buf = new byte[8];
        int readCount = is.read(buf, 0, buf.length);
        assertEquals(8, readCount);

        is.close();
    }

    @Test
    public void testAES256SHA256DecoderHashedKeyDerivation() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        // byte0: 0xC1 -> numCyclesPower = 1, saltSize = 1 + (0x23>>4) = 3, ivSize = 1 + (0x23&0x0F) = 4
        coder.properties = new byte[] { (byte) 0xC1, (byte) 0x23, 1, 2, 3, 4, 5, 6, 7 };

        byte[] passwordBytes = "my-secret-password".getBytes(UTF_16LE);
        byte[] dummyCiphertext = new byte[16];

        InputStream is = Coders.addDecoder(new ByteArrayInputStream(dummyCiphertext), coder, passwordBytes);
        int firstByte = is.read();
        assertTrue(firstByte >= 0 && firstByte <= 255);

        byte[] buf = new byte[4];
        int readCount = is.read(buf, 0, buf.length);
        assertEquals(4, readCount);

        is.close();
    }

    @Test
    public void testAES256SHA256DecoderExtraCarryLoop() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        // byte0: 0x09 -> numCyclesPower = 9 (512 iterations), ivSize = 0, saltSize = 0
        coder.properties = new byte[] { 0x09, 0x00 };

        byte[] passwordBytes = "password".getBytes(UTF_8);
        byte[] dummyCiphertext = new byte[16];

        InputStream is = Coders.addDecoder(new ByteArrayInputStream(dummyCiphertext), coder, passwordBytes);
        int firstByte = is.read();
        assertTrue(firstByte >= 0 && firstByte <= 255);
        is.close();
    }

    @Test
    public void testDummyByteAddingInputStreamReadSingleByte() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DummyByteAddingInputStream");
        Constructor<?> ctor = clazz.getDeclaredConstructor(InputStream.class);
        ctor.setAccessible(true);

        InputStream in = (InputStream) ctor.newInstance(new ByteArrayInputStream(new byte[] { 42 }));
        assertEquals(42, in.read());
        assertEquals(0, in.read());
        assertEquals(-1, in.read());
        in.close();
    }

    @Test
    public void testDummyByteAddingInputStreamReadByteArray() throws Exception {
        Class<?> clazz = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DummyByteAddingInputStream");
        Constructor<?> ctor = clazz.getDeclaredConstructor(InputStream.class);
        ctor.setAccessible(true);

        InputStream in = (InputStream) ctor.newInstance(new ByteArrayInputStream(new byte[] { 10, 20 }));
        byte[] buf = new byte[4];
        int count1 = in.read(buf, 0, 2);
        assertEquals(2, count1);
        assertEquals(10, buf[0]);
        assertEquals(20, buf[1]);

        int count2 = in.read(buf, 2, 2);
        assertEquals(1, count2);
        assertEquals(0, buf[2]);

        int count3 = in.read(buf, 0, 2);
        assertEquals(-1, count3);
        in.close();
    }
}
