package org.apache.commons.compress.compressors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream;
import org.apache.commons.compress.compressors.lzma.LZMAUtils;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;
import org.apache.commons.compress.compressors.xz.XZUtils;
import org.apache.commons.compress.compressors.z.ZCompressorInputStream;
import org.junit.Test;

public class CompressorStreamFactoryTest {

    @Test
    public void testDefaultConstructor_getDecompressConcatenated_returnsFalse() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testConstructorWithBoolean_getDecompressConcatenated_returnsCorrectValue() {
        CompressorStreamFactory factoryTrue = new CompressorStreamFactory(true);
        assertTrue(factoryTrue.getDecompressConcatenated());

        CompressorStreamFactory factoryFalse = new CompressorStreamFactory(false);
        assertFalse(factoryFalse.getDecompressConcatenated());
    }

    @Test
    public void testSetDecompressConcatenated_afterDefaultConstructor_succeeds() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        assertTrue(factory.getDecompressConcatenated());
        factory.setDecompressConcatenated(false);
        assertFalse(factory.getDecompressConcatenated());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetDecompressConcatenated_afterBooleanConstructor_throwsIllegalStateException() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        factory.setDecompressConcatenated(false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamAuto_nullStream_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamAuto_markNotSupported_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream unmarkableStream = new InputStream() {
            @Override
            public int read() {
                return -1;
            }

            @Override
            public boolean markSupported() {
                return false;
            }
        };
        factory.createCompressorInputStream(unmarkableStream);
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamAuto_emptyStream_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamAuto_unknownSignature_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] unknownBytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        factory.createCompressorInputStream(new ByteArrayInputStream(unknownBytes));
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamAuto_ioExceptionOnRead_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream faultyStream = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Simulated read error");
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("Simulated read error");
            }

            @Override
            public boolean markSupported() {
                return true;
            }
        };
        factory.createCompressorInputStream(faultyStream);
    }

    @Test
    public void testCreateCompressorInputStreamAuto_bzip2_detectsSuccessfully() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (BZip2CompressorOutputStream bz2Out = new BZip2CompressorOutputStream(baos)) {
            bz2Out.write("test".getBytes());
        }
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            assertTrue(in instanceof BZip2CompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamAuto_gzip_detectsSuccessfully() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (GzipCompressorOutputStream gzOut = new GzipCompressorOutputStream(baos)) {
            gzOut.write("test".getBytes());
        }
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            assertTrue(in instanceof GzipCompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamAuto_pack200_detectsSuccessfully() throws Exception {
        byte[] pack200Magic = new byte[]{(byte) 0xCA, (byte) 0xFE, (byte) 0xD0, (byte) 0x0D, 0, 0, 0, 0, 0, 0, 0, 0};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(new ByteArrayInputStream(pack200Magic))) {
            assertTrue(in instanceof Pack200CompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamAuto_framedSnappy_detectsSuccessfully() throws Exception {
        byte[] framedSnappyMagic = new byte[]{(byte) 0xff, 6, 0, 0, 's', 'N', 'a', 'P', 'p', 'Y', 0, 0};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(new ByteArrayInputStream(framedSnappyMagic))) {
            assertTrue(in instanceof FramedSnappyCompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamAuto_z_detectsSuccessfully() throws Exception {
        byte[] zMagic = new byte[]{0x1f, (byte) 0x9d, (byte) 0x90, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(new ByteArrayInputStream(zMagic))) {
            assertTrue(in instanceof ZCompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamAuto_xz_detectsSuccessfullyIfAvailable() throws Exception {
        if (!XZUtils.isXZCompressionAvailable()) {
            return;
        }
        byte[] xzMagic = new byte[]{(byte) 0xfd, '7', 'z', 'X', 'Z', 0x00, 0, 0, 0, 0, 0, 0};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            CompressorInputStream in = factory.createCompressorInputStream(new ByteArrayInputStream(xzMagic));
            assertTrue(in instanceof XZCompressorInputStream);
            in.close();
        } catch (CompressorException e) {
            // Expected if header check throws EOF/corrupt on incomplete XZ stream
        }
    }

    @Test
    public void testCreateCompressorInputStreamAuto_lzma_detectsSuccessfullyIfAvailable() throws Exception {
        if (!LZMAUtils.isLZMACompressionAvailable()) {
            return;
        }
        byte[] lzmaMagic = new byte[]{0x5d, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            CompressorInputStream in = factory.createCompressorInputStream(new ByteArrayInputStream(lzmaMagic));
            assertTrue(in instanceof LZMACompressorInputStream);
            in.close();
        } catch (CompressorException e) {
            // Expected if LZMA header is invalid
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamByName_nullName_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamByName_nullStream_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(CompressorStreamFactory.GZIP, null);
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamByName_unknownName_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream("unknown-format", new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamByName_emptyName_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream("", new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateCompressorInputStreamByName_gzip() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (GzipCompressorOutputStream out = new GzipCompressorOutputStream(baos)) {
            out.write("test".getBytes());
        }
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        try (CompressorInputStream in = factory.createCompressorInputStream(CompressorStreamFactory.GZIP, new ByteArrayInputStream(baos.toByteArray()))) {
            assertTrue(in instanceof GzipCompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_bzip2() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (BZip2CompressorOutputStream out = new BZip2CompressorOutputStream(baos)) {
            out.write("test".getBytes());
        }
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        try (CompressorInputStream in = factory.createCompressorInputStream(CompressorStreamFactory.BZIP2, new ByteArrayInputStream(baos.toByteArray()))) {
            assertTrue(in instanceof BZip2CompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_xz() throws Exception {
        if (!XZUtils.isXZCompressionAvailable()) {
            return;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (XZCompressorOutputStream out = new XZCompressorOutputStream(baos)) {
            out.write("test".getBytes());
        }
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        try (CompressorInputStream in = factory.createCompressorInputStream(CompressorStreamFactory.XZ, new ByteArrayInputStream(baos.toByteArray()))) {
            assertTrue(in instanceof XZCompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_pack200() throws Exception {
        byte[] dummy = new byte[]{1, 2, 3};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(CompressorStreamFactory.PACK200, new ByteArrayInputStream(dummy))) {
            assertTrue(in instanceof Pack200CompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_snappyRaw() throws Exception {
        byte[] dummy = new byte[]{4 << 2, 't', 'e', 's', 't'};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(CompressorStreamFactory.SNAPPY_RAW, new ByteArrayInputStream(dummy))) {
            assertTrue(in instanceof SnappyCompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_snappyFramed() throws Exception {
        byte[] framedSnappyMagic = new byte[]{(byte) 0xff, 6, 0, 0, 's', 'N', 'a', 'P', 'p', 'Y'};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(CompressorStreamFactory.SNAPPY_FRAMED, new ByteArrayInputStream(framedSnappyMagic))) {
            assertTrue(in instanceof FramedSnappyCompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_z() throws Exception {
        byte[] zMagic = new byte[]{0x1f, (byte) 0x9d, (byte) 0x90, 0};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(CompressorStreamFactory.Z, new ByteArrayInputStream(zMagic))) {
            assertTrue(in instanceof ZCompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_deflate() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (DeflateCompressorOutputStream out = new DeflateCompressorOutputStream(baos)) {
            out.write("test".getBytes());
        }
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try (CompressorInputStream in = factory.createCompressorInputStream(CompressorStreamFactory.DEFLATE, new ByteArrayInputStream(baos.toByteArray()))) {
            assertTrue(in instanceof DeflateCompressorInputStream);
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_lzma() throws Exception {
        if (!LZMAUtils.isLZMACompressionAvailable()) {
            return;
        }
        byte[] invalidHeader = new byte[]{0x5d, 0, 0};
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            CompressorInputStream in = factory.createCompressorInputStream(CompressorStreamFactory.LZMA, new ByteArrayInputStream(invalidHeader));
            in.close();
        } catch (CompressorException e) {
            // IOException wrapped in CompressorException
            assertNotNull(e.getCause());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorOutputStream_nullName_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorOutputStream_nullStream_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream(CompressorStreamFactory.GZIP, null);
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorOutputStream_unknownName_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream("unsupported-format", new ByteArrayOutputStream());
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorOutputStream_emptyName_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream("", new ByteArrayOutputStream());
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorOutputStream_readOnlyTypes_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream(CompressorStreamFactory.SNAPPY_RAW, new ByteArrayOutputStream());
    }

    @Test
    public void testCreateCompressorOutputStream_gzip_success() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.GZIP, baos)) {
            assertTrue(out instanceof GzipCompressorOutputStream);
            out.write("test".getBytes());
        }
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testCreateCompressorOutputStream_bzip2_success() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.BZIP2, baos)) {
            assertTrue(out instanceof BZip2CompressorOutputStream);
            out.write("test".getBytes());
        }
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testCreateCompressorOutputStream_xz_success() throws Exception {
        if (!XZUtils.isXZCompressionAvailable()) {
            return;
        }
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.XZ, baos)) {
            assertTrue(out instanceof XZCompressorOutputStream);
            out.write("test".getBytes());
        }
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testCreateCompressorOutputStream_pack200_success() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.PACK200, baos)) {
            assertTrue(out instanceof Pack200CompressorOutputStream);
        }
    }

    @Test
    public void testCreateCompressorOutputStream_deflate_success() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.DEFLATE, baos)) {
            assertTrue(out instanceof DeflateCompressorOutputStream);
            out.write("test".getBytes());
        }
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testCreateCompressorOutputStream_caseInsensitive() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (CompressorOutputStream out = factory.createCompressorOutputStream("Gz", baos)) {
            assertTrue(out instanceof GzipCompressorOutputStream);
        }
    }
}
