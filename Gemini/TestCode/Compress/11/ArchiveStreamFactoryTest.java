package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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
    public void testCreateArchiveInputStreamByName_allValidTypesCaseInsensitive() throws Exception {
        byte[] dummyData = new byte[0];

        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("AR", in) instanceof ArArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("ar", in) instanceof ArArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("ZIP", in) instanceof ZipArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("zip", in) instanceof ZipArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("TAR", in) instanceof TarArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("tar", in) instanceof TarArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("JAR", in) instanceof JarArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("jar", in) instanceof JarArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("CPIO", in) instanceof CpioArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("cpio", in) instanceof CpioArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("DUMP", in) instanceof DumpArchiveInputStream);
        }
        try (InputStream in = new ByteArrayInputStream(dummyData)) {
            assertTrue(factory.createArchiveInputStream("dump", in) instanceof DumpArchiveInputStream);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamByName_nullName_throwsException() throws Exception {
        factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamByName_nullStream_throwsException() throws Exception {
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamByName_unknownName_throwsException() throws Exception {
        factory.createArchiveInputStream("unknownFormat", new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamByName_emptyName_throwsException() throws Exception {
        factory.createArchiveInputStream("", new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateArchiveOutputStreamByName_allValidTypesCaseInsensitive() throws Exception {
        OutputStream out = new ByteArrayOutputStream();

        assertTrue(factory.createArchiveOutputStream("AR", out) instanceof ArArchiveOutputStream);
        assertTrue(factory.createArchiveOutputStream("ar", out) instanceof ArArchiveOutputStream);
        assertTrue(factory.createArchiveOutputStream("ZIP", out) instanceof ZipArchiveOutputStream);
        assertTrue(factory.createArchiveOutputStream("zip", out) instanceof ZipArchiveOutputStream);
        assertTrue(factory.createArchiveOutputStream("TAR", out) instanceof TarArchiveOutputStream);
        assertTrue(factory.createArchiveOutputStream("tar", out) instanceof TarArchiveOutputStream);
        assertTrue(factory.createArchiveOutputStream("JAR", out) instanceof JarArchiveOutputStream);
        assertTrue(factory.createArchiveOutputStream("jar", out) instanceof JarArchiveOutputStream);
        assertTrue(factory.createArchiveOutputStream("CPIO", out) instanceof CpioArchiveOutputStream);
        assertTrue(factory.createArchiveOutputStream("cpio", out) instanceof CpioArchiveOutputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamByName_nullName_throwsException() throws Exception {
        factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamByName_nullStream_throwsException() throws Exception {
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamByName_unknownName_throwsException() throws Exception {
        factory.createArchiveOutputStream("unknownFormat", new ByteArrayOutputStream());
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamByName_dumpNotSupported_throwsException() throws Exception {
        factory.createArchiveOutputStream(ArchiveStreamFactory.DUMP, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetect_nullStream_throwsException() throws Exception {
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetect_unsupportedMark_throwsException() throws Exception {
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
        factory.createArchiveInputStream(unmarkableStream);
    }

    @Test
    public void testAutodetect_zip() throws Exception {
        byte[] zipHeader = new byte[] { 'P', 'K', 0x03, 0x04, 0, 0, 0, 0, 0, 0, 0, 0 };
        try (InputStream in = new BufferedInputStream(new ByteArrayInputStream(zipHeader))) {
            ArchiveInputStream ais = factory.createArchiveInputStream(in);
            assertNotNull(ais);
            assertTrue(ais instanceof ZipArchiveInputStream);
        }
    }

    @Test
    public void testAutodetect_ar() throws Exception {
        byte[] arHeader = "!<arch>\n".getBytes("US-ASCII");
        try (InputStream in = new BufferedInputStream(new ByteArrayInputStream(arHeader))) {
            ArchiveInputStream ais = factory.createArchiveInputStream(in);
            assertNotNull(ais);
            assertTrue(ais instanceof ArArchiveInputStream);
        }
    }

    @Test
    public void testAutodetect_cpio() throws Exception {
        byte[] cpioHeader = "070701".getBytes("US-ASCII");
        try (InputStream in = new BufferedInputStream(new ByteArrayInputStream(cpioHeader))) {
            ArchiveInputStream ais = factory.createArchiveInputStream(in);
            assertNotNull(ais);
            assertTrue(ais instanceof CpioArchiveInputStream);
        }
    }

    @Test
    public void testAutodetect_dump() throws Exception {
        byte[] dumpHeader = new byte[32];
        // DumpArchiveInputStream.NFS_MAGIC is 60012 (0x0000EA6C) or 60011 (0x0000EA6B) at offset 24
        dumpHeader[24] = (byte) 0x6C;
        dumpHeader[25] = (byte) 0xEA;
        dumpHeader[26] = 0x00;
        dumpHeader[27] = 0x00;
        try (InputStream in = new BufferedInputStream(new ByteArrayInputStream(dumpHeader))) {
            ArchiveInputStream ais = factory.createArchiveInputStream(in);
            assertNotNull(ais);
            assertTrue(ais instanceof DumpArchiveInputStream);
        }
    }

    @Test
    public void testAutodetect_tarByMagic() throws Exception {
        byte[] tarHeader = new byte[512];
        byte[] magic = "ustar\0".getBytes("US-ASCII");
        System.arraycopy(magic, 0, tarHeader, 257, magic.length);
        try (InputStream in = new BufferedInputStream(new ByteArrayInputStream(tarHeader))) {
            ArchiveInputStream ais = factory.createArchiveInputStream(in);
            assertNotNull(ais);
            assertTrue(ais instanceof TarArchiveInputStream);
        }
    }

    @Test(expected = ArchiveException.class)
    public void testAutodetect_emptyStream_throwsException() throws Exception {
        byte[] empty = new byte[0];
        try (InputStream in = new BufferedInputStream(new ByteArrayInputStream(empty))) {
            factory.createArchiveInputStream(in);
        }
    }

    @Test(expected = ArchiveException.class)
    public void testAutodetect_unrecognizedSignature_throwsException() throws Exception {
        byte[] randomBytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        try (InputStream in = new BufferedInputStream(new ByteArrayInputStream(randomBytes))) {
            factory.createArchiveInputStream(in);
        }
    }

    @Test
    public void testAutodetect_ioExceptionOnReset_throwsArchiveException() {
        InputStream faultyStream = new InputStream() {
            @Override
            public int read() {
                return 0;
            }

            @Override
            public int read(byte[] b, int off, int len) {
                return len;
            }

            @Override
            public boolean markSupported() {
                return true;
            }

            @Override
            public synchronized void mark(int readlimit) {
            }

            @Override
            public synchronized void reset() throws IOException {
                throw new IOException("Simulated Reset Failure");
            }
        };

        try {
            factory.createArchiveInputStream(faultyStream);
            fail("ArchiveException expected due to reset failure.");
        } catch (ArchiveException e) {
            assertTrue(e.getMessage().contains("Could not use reset and mark operations."));
            assertTrue(e.getCause() instanceof IOException);
        }
    }
}
