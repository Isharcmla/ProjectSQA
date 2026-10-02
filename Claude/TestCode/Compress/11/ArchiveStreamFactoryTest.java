package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.junit.Test;

public class ArchiveStreamFactoryTest {

    private ArchiveStreamFactory factory = new ArchiveStreamFactory();

    // ---------------------------------------------------------------
    // createArchiveInputStream(String, InputStream)
    // ---------------------------------------------------------------

    @Test
    public void testCreateArchiveInputStream_ar_returnsArArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream(ArchiveStreamFactory.AR, in);
        assertNotNull(result);
        assertTrue(result instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_zip_returnsZipArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, in);
        assertNotNull(result);
        assertTrue(result instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_tar_returnsTarArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream(ArchiveStreamFactory.TAR, in);
        assertNotNull(result);
        assertTrue(result instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_jar_returnsJarArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream(ArchiveStreamFactory.JAR, in);
        assertNotNull(result);
        assertTrue(result instanceof JarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_cpio_returnsCpioArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, in);
        assertNotNull(result);
        assertTrue(result instanceof CpioArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_caseInsensitiveName_returnsCorrectStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream("ZIP", in);
        assertNotNull(result);
        assertTrue(result instanceof ZipArchiveInputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_nullArchiverName_throwsIllegalArgumentException() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream(null, in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_nullInputStream_throwsIllegalArgumentException() throws Exception {
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, (InputStream) null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_unknownArchiverName_throwsArchiveException() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream("unknown-format", in);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_emptyArchiverName_throwsArchiveException() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream("", in);
    }

    // ---------------------------------------------------------------
    // createArchiveOutputStream(String, OutputStream)
    // ---------------------------------------------------------------

    @Test
    public void testCreateArchiveOutputStream_ar_returnsArArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream result = factory.createArchiveOutputStream(ArchiveStreamFactory.AR, out);
        assertNotNull(result);
        assertTrue(result instanceof ArArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_zip_returnsZipArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream result = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);
        assertNotNull(result);
        assertTrue(result instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_tar_returnsTarArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream result = factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, out);
        assertNotNull(result);
        assertTrue(result instanceof TarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_jar_returnsJarArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream result = factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, out);
        assertNotNull(result);
        assertTrue(result instanceof JarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_cpio_returnsCpioArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream result = factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, out);
        assertNotNull(result);
        assertTrue(result instanceof CpioArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStream_caseInsensitiveName_returnsCorrectStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream result = factory.createArchiveOutputStream("Tar", out);
        assertNotNull(result);
        assertTrue(result instanceof TarArchiveOutputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_nullArchiverName_throwsIllegalArgumentException() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        factory.createArchiveOutputStream(null, out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_nullOutputStream_throwsIllegalArgumentException() throws Exception {
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, (OutputStream) null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStream_unknownArchiverName_throwsArchiveException() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        factory.createArchiveOutputStream("unknown-format", out);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStream_dumpNotSupported_throwsArchiveException() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        // DUMP format has no output stream implementation
        factory.createArchiveOutputStream(ArchiveStreamFactory.DUMP, out);
    }

    // ---------------------------------------------------------------
    // createArchiveInputStream(InputStream) - autodetection
    // ---------------------------------------------------------------

    @Test
    public void testCreateArchiveInputStream_autodetectZip_returnsZipArchiveInputStream() throws Exception {
        byte[] zipSignature = new byte[]{0x50, 0x4B, 0x03, 0x04, 0, 0, 0, 0, 0, 0, 0, 0};
        InputStream in = new ByteArrayInputStream(zipSignature);
        ArchiveInputStream result = factory.createArchiveInputStream(in);
        assertNotNull(result);
        assertTrue(result instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_autodetectAr_returnsArArchiveInputStream() throws Exception {
        byte[] arSignature = new byte[]{'!', '<', 'a', 'r', 'c', 'h', '>', '\n'};
        InputStream in = new ByteArrayInputStream(arSignature);
        ArchiveInputStream result = factory.createArchiveInputStream(in);
        assertNotNull(result);
        assertTrue(result instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_autodetectCpio_returnsCpioArchiveInputStream() throws Exception {
        byte[] cpioSignature = new byte[]{'0', '7', '0', '7', '0', '1'};
        InputStream in = new ByteArrayInputStream(cpioSignature);
        ArchiveInputStream result = factory.createArchiveInputStream(in);
        assertNotNull(result);
        assertTrue(result instanceof CpioArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStream_autodetectAllZeroTarBlock_returnsTarArchiveInputStream() throws Exception {
        // An all-zero 512-byte block is treated as a valid (empty) TAR EOF marker
        byte[] zeroBlock = new byte[512];
        InputStream in = new ByteArrayInputStream(zeroBlock);
        ArchiveInputStream result = factory.createArchiveInputStream(in);
        assertNotNull(result);
        assertTrue(result instanceof TarArchiveInputStream);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_autodetectUnknownGarbageBytes_throwsArchiveException() throws Exception {
        byte[] garbage = new byte[600];
        for (int i = 0; i < garbage.length; i++) {
            garbage[i] = (byte) 0xFF;
        }
        InputStream in = new ByteArrayInputStream(garbage);
        factory.createArchiveInputStream(in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_nullStream_throwsIllegalArgumentException() throws Exception {
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_markNotSupported_throwsIllegalArgumentException() throws Exception {
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
        factory.createArchiveInputStream(noMarkStream);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_emptyStream_throwsArchiveException() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream(in);
    }
}
