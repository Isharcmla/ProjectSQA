package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.junit.Before;
import org.junit.Test;

public class ArchiveStreamFactoryTest {

    private ArchiveStreamFactory factory;

    @Before
    public void setUp() {
        factory = new ArchiveStreamFactory();
    }

    @Test
    public void testConstants() {
        assertEquals("ar", ArchiveStreamFactory.AR);
        assertEquals("cpio", ArchiveStreamFactory.CPIO);
        assertEquals("dump", ArchiveStreamFactory.DUMP);
        assertEquals("jar", ArchiveStreamFactory.JAR);
        assertEquals("tar", ArchiveStreamFactory.TAR);
        assertEquals("zip", ArchiveStreamFactory.ZIP);
    }

    @Test
    public void testCreateArchiveInputStreamByName_ar_returnsArInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.AR, in);
        assertNotNull(ais);
        assertTrue(ais instanceof ArArchiveInputStream);

        ArchiveInputStream aisCase = factory.createArchiveInputStream("AR", in);
        assertNotNull(aisCase);
        assertTrue(aisCase instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamByName_zip_returnsZipInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, in);
        assertNotNull(ais);
        assertTrue(ais instanceof ZipArchiveInputStream);

        ArchiveInputStream aisCase = factory.createArchiveInputStream("ZiP", in);
        assertNotNull(aisCase);
        assertTrue(aisCase instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamByName_tar_returnsTarInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.TAR, in);
        assertNotNull(ais);
        assertTrue(ais instanceof TarArchiveInputStream);

        ArchiveInputStream aisCase = factory.createArchiveInputStream("TaR", in);
        assertNotNull(aisCase);
        assertTrue(aisCase instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamByName_jar_returnsJarInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.JAR, in);
        assertNotNull(ais);
        assertTrue(ais instanceof JarArchiveInputStream);

        ArchiveInputStream aisCase = factory.createArchiveInputStream("JAR", in);
        assertNotNull(aisCase);
        assertTrue(aisCase instanceof JarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamByName_cpio_returnsCpioInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, in);
        assertNotNull(ais);
        assertTrue(ais instanceof CpioArchiveInputStream);

        ArchiveInputStream aisCase = factory.createArchiveInputStream("CPIo", in);
        assertNotNull(aisCase);
        assertTrue(aisCase instanceof CpioArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamByName_dump_returnsDumpInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, in);
        assertNotNull(ais);
        assertTrue(ais instanceof DumpArchiveInputStream);

        ArchiveInputStream aisCase = factory.createArchiveInputStream("DuMp", in);
        assertNotNull(aisCase);
        assertTrue(aisCase instanceof DumpArchiveInputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamByName_nullName_throwsIllegalArgumentException() throws Exception {
        factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamByName_nullStream_throwsIllegalArgumentException() throws Exception {
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamByName_unknownName_throwsArchiveException() throws Exception {
        factory.createArchiveInputStream("unknownFormat", new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamByName_emptyName_throwsArchiveException() throws Exception {
        factory.createArchiveInputStream("", new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateArchiveOutputStreamByName_ar_returnsArOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.AR, out);
        assertNotNull(aos);
        assertTrue(aos instanceof ArArchiveOutputStream);

        ArchiveOutputStream aosCase = factory.createArchiveOutputStream("AR", out);
        assertNotNull(aosCase);
        assertTrue(aosCase instanceof ArArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamByName_zip_returnsZipOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);
        assertNotNull(aos);
        assertTrue(aos instanceof ZipArchiveOutputStream);

        ArchiveOutputStream aosCase = factory.createArchiveOutputStream("ZiP", out);
        assertNotNull(aosCase);
        assertTrue(aosCase instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamByName_tar_returnsTarOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, out);
        assertNotNull(aos);
        assertTrue(aos instanceof TarArchiveOutputStream);

        ArchiveOutputStream aosCase = factory.createArchiveOutputStream("TaR", out);
        assertNotNull(aosCase);
        assertTrue(aosCase instanceof TarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamByName_jar_returnsJarOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, out);
        assertNotNull(aos);
        assertTrue(aos instanceof JarArchiveOutputStream);

        ArchiveOutputStream aosCase = factory.createArchiveOutputStream("JAR", out);
        assertNotNull(aosCase);
        assertTrue(aosCase instanceof JarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamByName_cpio_returnsCpioOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, out);
        assertNotNull(aos);
        assertTrue(aos instanceof CpioArchiveOutputStream);

        ArchiveOutputStream aosCase = factory.createArchiveOutputStream("CPIo", out);
        assertNotNull(aosCase);
        assertTrue(aosCase instanceof CpioArchiveOutputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamByName_nullName_throwsIllegalArgumentException() throws Exception {
        factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamByName_nullStream_throwsIllegalArgumentException() throws Exception {
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamByName_dumpUnsupported_throwsArchiveException() throws Exception {
        factory.createArchiveOutputStream(ArchiveStreamFactory.DUMP, new ByteArrayOutputStream());
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamByName_unknownName_throwsArchiveException() throws Exception {
        factory.createArchiveOutputStream("unknownFormat", new ByteArrayOutputStream());
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamByName_emptyName_throwsArchiveException() throws Exception {
        factory.createArchiveOutputStream("", new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamAutodetect_nullStream_throwsIllegalArgumentException() throws Exception {
        factory.createArchiveInputStream(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamAutodetect_streamWithoutMarkSupport_throwsIllegalArgumentException() throws Exception {
        InputStream unmarkableStream = new InputStream() {
            @Override
            public boolean markSupported() {
                return false;
            }

            @Override
            public int read() {
                return -1;
            }
        };
        factory.createArchiveInputStream(unmarkableStream);
    }

    @Test
    public void testCreateArchiveInputStreamAutodetect_zipSignature_returnsZipInputStream() throws Exception {
        byte[] zipHeader = new byte[]{0x50, 0x4b, 0x03, 0x04, 0, 0, 0, 0, 0, 0, 0, 0};
        InputStream in = new ByteArrayInputStream(zipHeader);
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertNotNull(ais);
        assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamAutodetect_arSignature_returnsArInputStream() throws Exception {
        byte[] arHeader = "!<arch>\n".getBytes(StandardCharsets.US_ASCII);
        InputStream in = new ByteArrayInputStream(arHeader);
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertNotNull(ais);
        assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamAutodetect_cpioSignature_returnsCpioInputStream() throws Exception {
        byte[] cpioHeader = "070701".getBytes(StandardCharsets.US_ASCII);
        InputStream in = new ByteArrayInputStream(cpioHeader);
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertNotNull(ais);
        assertTrue(ais instanceof CpioArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamAutodetect_dumpSignature_returnsDumpInputStream() throws Exception {
        byte[] dumpHeader = new byte[32];
        // Dump NFS_MAGIC signature at offset 24 (little-endian 0x0000ea61)
        dumpHeader[24] = 0x61;
        dumpHeader[25] = (byte) 0xea;
        dumpHeader[26] = 0x00;
        dumpHeader[27] = 0x00;

        InputStream in = new ByteArrayInputStream(dumpHeader);
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertNotNull(ais);
        assertTrue(ais instanceof DumpArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamAutodetect_tarSignature_returnsTarInputStream() throws Exception {
        byte[] tarHeader = new byte[512];
        // "ustar\0" at offset 257
        byte[] magic = "ustar\0".getBytes(StandardCharsets.US_ASCII);
        System.arraycopy(magic, 0, tarHeader, 257, magic.length);

        InputStream in = new ByteArrayInputStream(tarHeader);
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertNotNull(ais);
        assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamAutodetect_tarFallbackValidChecksum_returnsTarInputStream() throws Exception {
        byte[] v7TarHeader = new byte[512];
        System.arraycopy("test.txt".getBytes(StandardCharsets.US_ASCII), 0, v7TarHeader, 0, 8);
        System.arraycopy("0000644\0".getBytes(StandardCharsets.US_ASCII), 0, v7TarHeader, 100, 8);
        System.arraycopy("0000000\0".getBytes(StandardCharsets.US_ASCII), 0, v7TarHeader, 108, 8);
        System.arraycopy("0000000\0".getBytes(StandardCharsets.US_ASCII), 0, v7TarHeader, 116, 8);
        System.arraycopy("00000000000\0".getBytes(StandardCharsets.US_ASCII), 0, v7TarHeader, 124, 12);
        System.arraycopy("00000000000\0".getBytes(StandardCharsets.US_ASCII), 0, v7TarHeader, 136, 12);

        for (int i = 148; i < 156; i++) {
            v7TarHeader[i] = ' ';
        }

        long checksum = 0;
        for (byte b : v7TarHeader) {
            checksum += (b & 0xFF);
        }

        String chkStr = String.format("%06o\0 ", checksum);
        System.arraycopy(chkStr.getBytes(StandardCharsets.US_ASCII), 0, v7TarHeader, 148, 8);

        InputStream in = new ByteArrayInputStream(v7TarHeader);
        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        assertNotNull(ais);
        assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamAutodetect_tarFallbackInvalidChecksum_throwsArchiveException() {
        byte[] dummyTarBlock = new byte[512];
        for (int i = 0; i < dummyTarBlock.length; i++) {
            dummyTarBlock[i] = (byte) (i + 1);
        }
        InputStream in = new ByteArrayInputStream(dummyTarBlock);
        try {
            factory.createArchiveInputStream(in);
            fail("Should throw ArchiveException for invalid signature");
        } catch (ArchiveException e) {
            assertEquals("No Archiver found for the stream signature", e.getMessage());
        }
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamAutodetect_emptyStream_throwsArchiveException() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream(in);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamAutodetect_unrecognizedShortStream_throwsArchiveException() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3, 4});
        factory.createArchiveInputStream(in);
    }

    @Test
    public void testCreateArchiveInputStreamAutodetect_resetThrowsIOException_wrapsInArchiveException() {
        InputStream brokenStream = new InputStream() {
            @Override
            public boolean markSupported() {
                return true;
            }

            @Override
            public synchronized void mark(int readlimit) {
            }

            @Override
            public synchronized void reset() throws IOException {
                throw new IOException("Simulated reset failure");
            }

            @Override
            public int read() {
                return 0;
            }

            @Override
            public int read(byte[] b, int off, int len) {
                return len;
            }
        };

        try {
            factory.createArchiveInputStream(brokenStream);
            fail("Expected ArchiveException on reset failure");
        } catch (ArchiveException e) {
            assertEquals("Could not use reset and mark operations.", e.getMessage());
            assertNotNull(e.getCause());
            assertTrue(e.getCause() instanceof IOException);
        }
    }
}
