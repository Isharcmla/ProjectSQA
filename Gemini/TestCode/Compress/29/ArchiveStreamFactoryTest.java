package org.apache.commons.compress.archivers;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class ArchiveStreamFactoryTest {

    @Test
    public void testDefaultConstructor_defaultEncodingIsNull() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        Assert.assertNull(factory.getEntryEncoding());
    }

    @Test
    public void testEncodingConstructor_setsEncoding() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        Assert.assertEquals("UTF-8", factory.getEntryEncoding());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testSetEntryEncoding_whenConstructorHadNull_updatesEncoding() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.setEntryEncoding("ISO-8859-1");
        Assert.assertEquals("ISO-8859-1", factory.getEntryEncoding());
        factory.setEntryEncoding(null);
        Assert.assertNull(factory.getEntryEncoding());
    }

    @Test(expected = IllegalStateException.class)
    @SuppressWarnings("deprecation")
    public void testSetEntryEncoding_whenConstructorHadEncoding_throwsIllegalStateException() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        factory.setEntryEncoding("ISO-8859-1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_nullArchiverName_throwsException() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStream_nullInputStream_throwsException() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateArchiveInputStream_sevenZ_throwsStreamingNotSupportedException() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.SEVEN_Z, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStream_unknownArchiverName_throwsArchiveException() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream("unknown_format", new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateArchiveInputStream_byNameWithoutEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();

        ArchiveInputStream ar = factory.createArchiveInputStream(ArchiveStreamFactory.AR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ar instanceof ArArchiveInputStream);
        ar.close();

        byte[] arjBytes = new byte[] { (byte) 0x60, (byte) 0xea, 0, 0 };
        ArchiveInputStream arj = factory.createArchiveInputStream(ArchiveStreamFactory.ARJ, new ByteArrayInputStream(arjBytes));
        Assert.assertTrue(arj instanceof ArjArchiveInputStream);
        arj.close();

        ArchiveInputStream zip = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(zip instanceof ZipArchiveInputStream);
        zip.close();

        ArchiveInputStream tar = factory.createArchiveInputStream(ArchiveStreamFactory.TAR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(tar instanceof TarArchiveInputStream);
        tar.close();

        ArchiveInputStream jar = factory.createArchiveInputStream(ArchiveStreamFactory.JAR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(jar instanceof JarArchiveInputStream);
        jar.close();

        ArchiveInputStream cpio = factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(cpio instanceof CpioArchiveInputStream);
        cpio.close();

        byte[] dumpBytes = new byte[32];
        ArchiveInputStream dump = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, new ByteArrayInputStream(dumpBytes));
        Assert.assertTrue(dump instanceof DumpArchiveInputStream);
        dump.close();
    }

    @Test
    public void testCreateArchiveInputStream_byNameWithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");

        byte[] arjBytes = new byte[] { (byte) 0x60, (byte) 0xea, 0, 0 };
        ArchiveInputStream arj = factory.createArchiveInputStream(ArchiveStreamFactory.ARJ, new ByteArrayInputStream(arjBytes));
        Assert.assertTrue(arj instanceof ArjArchiveInputStream);
        arj.close();

        ArchiveInputStream zip = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(zip instanceof ZipArchiveInputStream);
        zip.close();

        ArchiveInputStream tar = factory.createArchiveInputStream(ArchiveStreamFactory.TAR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(tar instanceof TarArchiveInputStream);
        tar.close();

        ArchiveInputStream jar = factory.createArchiveInputStream(ArchiveStreamFactory.JAR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(jar instanceof JarArchiveInputStream);
        jar.close();

        ArchiveInputStream cpio = factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(cpio instanceof CpioArchiveInputStream);
        cpio.close();

        byte[] dumpBytes = new byte[32];
        ArchiveInputStream dump = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, new ByteArrayInputStream(dumpBytes));
        Assert.assertTrue(dump instanceof DumpArchiveInputStream);
        dump.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_nullArchiverName_throwsException() throws Exception {
        new ArchiveStreamFactory().createArchiveOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStream_nullOutputStream_throwsException() throws Exception {
        new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateArchiveOutputStream_sevenZ_throwsStreamingNotSupportedException() throws Exception {
        new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.SEVEN_Z, new ByteArrayOutputStream());
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStream_unknownArchiverName_throwsArchiveException() throws Exception {
        new ArchiveStreamFactory().createArchiveOutputStream("unknown_format", new ByteArrayOutputStream());
    }

    @Test
    public void testCreateArchiveOutputStream_byNameWithoutEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();

        ArchiveOutputStream ar = factory.createArchiveOutputStream(ArchiveStreamFactory.AR, new ByteArrayOutputStream());
        Assert.assertTrue(ar instanceof ArArchiveOutputStream);
        ar.close();

        ArchiveOutputStream zip = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, new ByteArrayOutputStream());
        Assert.assertTrue(zip instanceof ZipArchiveOutputStream);
        zip.close();

        ArchiveOutputStream tar = factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, new ByteArrayOutputStream());
        Assert.assertTrue(tar instanceof TarArchiveOutputStream);
        tar.close();

        ArchiveOutputStream jar = factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, new ByteArrayOutputStream());
        Assert.assertTrue(jar instanceof JarArchiveOutputStream);
        jar.close();

        ArchiveOutputStream cpio = factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, new ByteArrayOutputStream());
        Assert.assertTrue(cpio instanceof CpioArchiveOutputStream);
        cpio.close();
    }

    @Test
    public void testCreateArchiveOutputStream_byNameWithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");

        ArchiveOutputStream zip = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, new ByteArrayOutputStream());
        Assert.assertTrue(zip instanceof ZipArchiveOutputStream);
        zip.close();

        ArchiveOutputStream tar = factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, new ByteArrayOutputStream());
        Assert.assertTrue(tar instanceof TarArchiveOutputStream);
        tar.close();

        ArchiveOutputStream cpio = factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, new ByteArrayOutputStream());
        Assert.assertTrue(cpio instanceof CpioArchiveOutputStream);
        cpio.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetect_nullStream_throwsIllegalArgumentException() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetect_markNotSupportedStream_throwsIllegalArgumentException() throws Exception {
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
        new ArchiveStreamFactory().createArchiveInputStream(unmarkableStream);
    }

    @Test(expected = ArchiveException.class)
    public void testAutodetect_ioExceptionOnReset_throwsArchiveException() throws Exception {
        InputStream faultyStream = new InputStream() {
            private boolean marked = false;

            @Override
            public int read() {
                return 0;
            }

            @Override
            public boolean markSupported() {
                return true;
            }

            @Override
            public synchronized void mark(int readlimit) {
                marked = true;
            }

            @Override
            public synchronized void reset() throws IOException {
                if (marked) {
                    throw new IOException("Simulated reset failure");
                }
            }
        };
        new ArchiveStreamFactory().createArchiveInputStream(faultyStream);
    }

    @Test(expected = ArchiveException.class)
    public void testAutodetect_emptyStream_throwsArchiveException() throws Exception {
        new ArchiveStreamFactory().createArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = ArchiveException.class)
    public void testAutodetect_randomBytes_throwsArchiveException() throws Exception {
        byte[] randomBytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        new ArchiveStreamFactory().createArchiveInputStream(new ByteArrayInputStream(randomBytes));
    }

    @Test
    public void testAutodetect_zipStream_withoutAndWithEncoding() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.putArchiveEntry(new ZipArchiveEntry("entry.txt"));
        zaos.write(new byte[] { 1, 2, 3 });
        zaos.closeArchiveEntry();
        zaos.close();
        byte[] data = baos.toByteArray();

        ArchiveInputStream ais1 = new ArchiveStreamFactory().createArchiveInputStream(new ByteArrayInputStream(data));
        Assert.assertTrue(ais1 instanceof ZipArchiveInputStream);
        ais1.close();

        ArchiveInputStream ais2 = new ArchiveStreamFactory("UTF-8").createArchiveInputStream(new ByteArrayInputStream(data));
        Assert.assertTrue(ais2 instanceof ZipArchiveInputStream);
        ais2.close();
    }

    @Test
    public void testAutodetect_arStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ArArchiveOutputStream aaos = new ArArchiveOutputStream(baos);
        aaos.putArchiveEntry(new ArArchiveEntry("entry.txt", 3));
        aaos.write(new byte[] { 1, 2, 3 });
        aaos.closeArchiveEntry();
        aaos.close();
        byte[] data = baos.toByteArray();

        ArchiveInputStream ais = new ArchiveStreamFactory().createArchiveInputStream(new ByteArrayInputStream(data));
        Assert.assertTrue(ais instanceof ArArchiveInputStream);
        ais.close();
    }

    @Test
    public void testAutodetect_cpioStream_withoutAndWithEncoding() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream caos = new CpioArchiveOutputStream(baos);
        caos.putArchiveEntry(new CpioArchiveEntry("entry.txt", 3));
        caos.write(new byte[] { 1, 2, 3 });
        caos.closeArchiveEntry();
        caos.close();
        byte[] data = baos.toByteArray();

        ArchiveInputStream ais1 = new ArchiveStreamFactory().createArchiveInputStream(new ByteArrayInputStream(data));
        Assert.assertTrue(ais1 instanceof CpioArchiveInputStream);
        ais1.close();

        ArchiveInputStream ais2 = new ArchiveStreamFactory("UTF-8").createArchiveInputStream(new ByteArrayInputStream(data));
        Assert.assertTrue(ais2 instanceof CpioArchiveInputStream);
        ais2.close();
    }

    @Test
    public void testAutodetect_arjStream() throws Exception {
        byte[] arjHeader = new byte[] { (byte) 0x60, (byte) 0xea, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        ArchiveInputStream ais = new ArchiveStreamFactory().createArchiveInputStream(new ByteArrayInputStream(arjHeader));
        Assert.assertTrue(ais instanceof ArjArchiveInputStream);
        ais.close();
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testAutodetect_sevenZStream_throwsStreamingNotSupportedException() throws Exception {
        byte[] sevenZHeader = new byte[] { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C, 0, 0, 0, 0, 0, 0 };
        new ArchiveStreamFactory().createArchiveInputStream(new ByteArrayInputStream(sevenZHeader));
    }

    @Test
    public void testAutodetect_dumpStream() throws Exception {
        byte[] dumpHeader = new byte[32];
        dumpHeader[24] = (byte) 0x60;
        dumpHeader[25] = (byte) 0xea;
        dumpHeader[26] = (byte) 0x00;
        dumpHeader[27] = (byte) 0x00;

        ArchiveInputStream ais = new ArchiveStreamFactory("UTF-8").createArchiveInputStream(new ByteArrayInputStream(dumpHeader));
        Assert.assertTrue(ais instanceof DumpArchiveInputStream);
        ais.close();
    }

    @Test
    public void testAutodetect_tarStream_standardMatches() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(4);
        taos.putArchiveEntry(entry);
        taos.write("test".getBytes(StandardCharsets.UTF_8));
        taos.closeArchiveEntry();
        taos.close();
        byte[] data = baos.toByteArray();

        ArchiveInputStream ais = new ArchiveStreamFactory("UTF-8").createArchiveInputStream(new ByteArrayInputStream(data));
        Assert.assertTrue(ais instanceof TarArchiveInputStream);
        ais.close();
    }

    @Test
    public void testAutodetect_tarStream_checksumCheckFallback() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        taos.putArchiveEntry(entry);
        taos.write("hello".getBytes(StandardCharsets.UTF_8));
        taos.closeArchiveEntry();
        taos.close();
        byte[] data = baos.toByteArray();

        // Clear the POSIX/GNU magic field so TarArchiveInputStream.matches returns false,
        // forcing the autodetection to fall through to the 512-byte TarArchiveEntry checksum verification.
        for (int i = 257; i < 265 && i < data.length; i++) {
            data[i] = 0;
        }
        // Recalculate tar header checksum with cleared magic bytes
        long chk = 0;
        for (int i = 0; i < 512; i++) {
            if (i >= 148 && i < 156) {
                chk += ' ';
            } else {
                chk += (data[i] & 0xFF);
            }
        }
        String chkStr = String.format("%06o\0 ", chk);
        byte[] chkBytes = chkStr.getBytes(StandardCharsets.ISO_8859_1);
        System.arraycopy(chkBytes, 0, data, 148, 8);

        ArchiveInputStream ais = new ArchiveStreamFactory("UTF-8").createArchiveInputStream(new ByteArrayInputStream(data));
        Assert.assertTrue(ais instanceof TarArchiveInputStream);
        ais.close();
    }

    @Test(expected = ArchiveException.class)
    public void testAutodetect_512BytesNonTar_throwsArchiveException() throws Exception {
        byte[] nonTar512 = new byte[512];
        for (int i = 0; i < nonTar512.length; i++) {
            nonTar512[i] = (byte) (i % 128);
        }
        new ArchiveStreamFactory().createArchiveInputStream(new ByteArrayInputStream(nonTar512));
    }
}
