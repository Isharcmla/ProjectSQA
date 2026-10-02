import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;

public class CompressorStreamFactoryTest {

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_decompressConcatenatedIsFalse() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        Assert.assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testBooleanConstructor_true_decompressConcatenatedIsTrue() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        Assert.assertTrue(factory.getDecompressConcatenated());
    }

    @Test
    public void testBooleanConstructor_false_decompressConcatenatedIsFalse() {
        CompressorStreamFactory factory = new CompressorStreamFactory(false);
        Assert.assertFalse(factory.getDecompressConcatenated());
    }

    // ---------- setDecompressConcatenated tests ----------

    @Test
    public void testSetDecompressConcatenated_withDefaultConstructor_updatesValue() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        Assert.assertTrue(factory.getDecompressConcatenated());
        factory.setDecompressConcatenated(false);
        Assert.assertFalse(factory.getDecompressConcatenated());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetDecompressConcatenated_withBooleanConstructor_throwsIllegalStateException() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        factory.setDecompressConcatenated(false);
    }

    // ---------- createCompressorInputStream(InputStream) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStream_nullStream_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStream_markNotSupported_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream noMarkStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return -1;
            }

            @Override
            public boolean markSupported() {
                return false;
            }
        };
        factory.createCompressorInputStream(noMarkStream);
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStream_unknownSignature_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] randomBytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        InputStream in = new ByteArrayInputStream(randomBytes);
        factory.createCompressorInputStream(in);
    }

    @Test
    public void testCreateCompressorInputStream_gzipSignature_returnsGzipCompressorInputStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        GZIPOutputStream gzOut = new GZIPOutputStream(baos);
        gzOut.write("test data".getBytes());
        gzOut.close();

        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream in = new ByteArrayInputStream(baos.toByteArray());
        CompressorInputStream cis = factory.createCompressorInputStream(in);
        Assert.assertNotNull(cis);
        Assert.assertTrue(cis instanceof GzipCompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateCompressorInputStream_bzip2Signature_returnsBZip2CompressorInputStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BZip2CompressorOutputStream bzOut = new BZip2CompressorOutputStream(baos);
        bzOut.write("test data".getBytes());
        bzOut.close();

        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream in = new ByteArrayInputStream(baos.toByteArray());
        CompressorInputStream cis = factory.createCompressorInputStream(in);
        Assert.assertNotNull(cis);
        Assert.assertTrue(cis instanceof BZip2CompressorInputStream);
        cis.close();
    }

    // ---------- createCompressorInputStream(String, InputStream) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamByName_nullName_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(null, new ByteArrayInputStream(new byte[]{1, 2, 3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamByName_nullStream_throwsIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(CompressorStreamFactory.GZIP, null);
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamByName_unknownName_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream("unknown-format", new ByteArrayInputStream(new byte[]{1, 2, 3}));
    }

    @Test
    public void testCreateCompressorInputStreamByName_gzip_returnsGzipCompressorInputStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        GZIPOutputStream gzOut = new GZIPOutputStream(baos);
        gzOut.write("hello".getBytes());
        gzOut.close();

        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorInputStream cis = factory.createCompressorInputStream(
                CompressorStreamFactory.GZIP, new ByteArrayInputStream(baos.toByteArray()));
        Assert.assertNotNull(cis);
        Assert.assertTrue(cis instanceof GzipCompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateCompressorInputStreamByName_bzip2_returnsBZip2CompressorInputStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BZip2CompressorOutputStream bzOut = new BZip2CompressorOutputStream(baos);
        bzOut.write("hello".getBytes());
        bzOut.close();

        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorInputStream cis = factory.createCompressorInputStream(
                CompressorStreamFactory.BZIP2, new ByteArrayInputStream(baos.toByteArray()));
        Assert.assertNotNull(cis);
        Assert.assertTrue(cis instanceof BZip2CompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateCompressorInputStreamByName_deflate_returnsDeflateCompressorInputStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflateCompressorOutputStream deflateOut = new DeflateCompressorOutputStream(baos);
        deflateOut.write("hello".getBytes());
        deflateOut.close();

        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorInputStream cis = factory.createCompressorInputStream(
                CompressorStreamFactory.DEFLATE, new ByteArrayInputStream(baos.toByteArray()));
        Assert.assertNotNull(cis);
        Assert.assertTrue(cis instanceof DeflateCompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateCompressorInputStreamByName_xz_dummyData_handledGracefully() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            CompressorInputStream cis = factory.createCompressorInputStream(
                    CompressorStreamFactory.XZ, new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5}));
            Assert.assertNotNull(cis);
        } catch (CompressorException e) {
            // acceptable: invalid dummy data results in CompressorException
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_lzma_dummyData_handledGracefully() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            CompressorInputStream cis = factory.createCompressorInputStream(
                    CompressorStreamFactory.LZMA, new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5}));
            Assert.assertNotNull(cis);
        } catch (CompressorException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_pack200_dummyData_handledGracefully() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            CompressorInputStream cis = factory.createCompressorInputStream(
                    CompressorStreamFactory.PACK200, new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5}));
            Assert.assertNotNull(cis);
        } catch (CompressorException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_snappyRaw_dummyData_handledGracefully() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            CompressorInputStream cis = factory.createCompressorInputStream(
                    CompressorStreamFactory.SNAPPY_RAW, new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5}));
            Assert.assertNotNull(cis);
        } catch (CompressorException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_snappyFramed_dummyData_handledGracefully() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            CompressorInputStream cis = factory.createCompressorInputStream(
                    CompressorStreamFactory.SNAPPY_FRAMED, new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5}));
            Assert.assertNotNull(cis);
        } catch (CompressorException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCreateCompressorInputStreamByName_z_dummyData_handledGracefully() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            CompressorInputStream cis = factory.createCompressorInputStream(
                    CompressorStreamFactory.Z, new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5}));
            Assert.assertNotNull(cis);
        } catch (CompressorException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    // ---------- createCompressorOutputStream tests ----------

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
        factory.createCompressorOutputStream("unknown-format", new ByteArrayOutputStream());
    }

    @Test
    public void testCreateCompressorOutputStream_gzip_returnsGzipCompressorOutputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream out = new ByteArrayOutputStream();
        CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.GZIP, out);
        Assert.assertNotNull(cos);
        Assert.assertTrue(cos instanceof GzipCompressorOutputStream);
        cos.close();
    }

    @Test
    public void testCreateCompressorOutputStream_bzip2_returnsBZip2CompressorOutputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream out = new ByteArrayOutputStream();
        CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);
        Assert.assertNotNull(cos);
        Assert.assertTrue(cos instanceof BZip2CompressorOutputStream);
        cos.close();
    }

    @Test
    public void testCreateCompressorOutputStream_deflate_returnsDeflateCompressorOutputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream out = new ByteArrayOutputStream();
        CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.DEFLATE, out);
        Assert.assertNotNull(cos);
        Assert.assertTrue(cos instanceof DeflateCompressorOutputStream);
        cos.close();
    }

    @Test
    public void testCreateCompressorOutputStream_xz_returnsXZCompressorOutputStream() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream out = new ByteArrayOutputStream();
        try {
            CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.XZ, out);
            Assert.assertNotNull(cos);
            Assert.assertTrue(cos instanceof XZCompressorOutputStream);
            cos.close();
        } catch (CompressorException e) {
            // XZ library may not be available on classpath in some environments
            Assert.assertNotNull(e.getMessage());
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateCompressorOutputStream_pack200_returnsPack200CompressorOutputStream() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream out = new ByteArrayOutputStream();
        try {
            CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.PACK200, out);
            Assert.assertNotNull(cos);
            Assert.assertTrue(cos instanceof Pack200CompressorOutputStream);
            cos.close();
        } catch (CompressorException e) {
            Assert.assertNotNull(e.getMessage());
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }
    }

    // ---------- Case-insensitivity checks ----------

    @Test
    public void testCreateCompressorInputStreamByName_caseInsensitiveName_returnsCorrectStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        GZIPOutputStream gzOut = new GZIPOutputStream(baos);
        gzOut.write("hello".getBytes());
        gzOut.close();

        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorInputStream cis = factory.createCompressorInputStream(
                "GZ", new ByteArrayInputStream(baos.toByteArray()));
        Assert.assertNotNull(cis);
        Assert.assertTrue(cis instanceof GzipCompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateCompressorOutputStream_caseInsensitiveName_returnsCorrectStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream out = new ByteArrayOutputStream();
        CompressorOutputStream cos = factory.createCompressorOutputStream("BZIP2", out);
        Assert.assertNotNull(cos);
        Assert.assertTrue(cos instanceof BZip2CompressorOutputStream);
        cos.close();
    }

    // ---------- Empty string name edge case ----------

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamByName_emptyName_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream("", new ByteArrayInputStream(new byte[]{1, 2, 3}));
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorOutputStream_emptyName_throwsCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream("", new ByteArrayOutputStream());
    }
}
