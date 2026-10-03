package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

public class TarArchiveInputStreamTest {

    private byte[] createTarArchive(TarArchiveEntry... entries) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        for (TarArchiveEntry entry : entries) {
            tos.putArchiveEntry(entry);
            tos.closeArchiveEntry();
        }
        tos.close();
        return bos.toByteArray();
    }

    private byte[] createTarArchiveWithData(String name, byte[] content) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(content.length);
        tos.putArchiveEntry(entry);
        tos.write(content);
        tos.closeArchiveEntry();
        tos.close();
        return bos.toByteArray();
    }

    @Test
    public void testConstructorsAndGetRecordSize() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);

        TarArchiveInputStream tais1 = new TarArchiveInputStream(bais);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais1.getRecordSize());
        tais1.close();

        TarArchiveInputStream tais2 = new TarArchiveInputStream(bais, "UTF-8");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais2.getRecordSize());
        tais2.close();

        TarArchiveInputStream tais3 = new TarArchiveInputStream(bais, 1024);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais3.getRecordSize());
        tais3.close();

        TarArchiveInputStream tais4 = new TarArchiveInputStream(bais, 1024, "UTF-8");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais4.getRecordSize());
        tais4.close();

        TarArchiveInputStream tais5 = new TarArchiveInputStream(bais, 1024, 512);
        Assert.assertEquals(512, tais5.getRecordSize());
        tais5.close();

        TarArchiveInputStream tais6 = new TarArchiveInputStream(bais, 1024, 512, "UTF-8");
        Assert.assertEquals(512, tais6.getRecordSize());
        tais6.close();
    }

    @Test
    public void testAvailableAndRead_normalEntry_readsCorrectly() throws IOException {
        byte[] content = "Hello, Tar Archive World!".getBytes(CharsetNames.UTF_8);
        byte[] tarData = createTarArchiveWithData("test.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(content.length, tais.available());

        byte[] readBuf = new byte[content.length];
        int numRead = tais.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(content.length, numRead);
        Assert.assertArrayEquals(content, readBuf);
        Assert.assertEquals(0, tais.available());

        Assert.assertEquals(-1, tais.read(readBuf, 0, readBuf.length));
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testSkip_validAndInvalidValues_skipsProperly() throws IOException {
        byte[] content = "0123456789ABCDEF".getBytes(CharsetNames.UTF_8);
        byte[] tarData = createTarArchiveWithData("skip.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        Assert.assertNotNull(tais.getNextTarEntry());

        Assert.assertEquals(0, tais.skip(-5));
        Assert.assertEquals(0, tais.skip(0));

        long skipped = tais.skip(5);
        Assert.assertEquals(5, skipped);
        Assert.assertEquals(11, tais.available());

        byte[] buf = new byte[5];
        int read = tais.read(buf, 0, 5);
        Assert.assertEquals(5, read);
        Assert.assertEquals("56789", new String(buf, CharsetNames.UTF_8));

        long skippedRest = tais.skip(100);
        Assert.assertEquals(6, skippedRest);
        Assert.assertEquals(0, tais.available());

        tais.close();
    }

    @Test
    public void testMarkAndReset_unsupported() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertFalse(tais.markSupported());
        tais.mark(100);
        tais.reset();
    }

    @Test
    public void testGetNextEntry_multipleEntries_readsAll() throws IOException {
        TarArchiveEntry entry1 = new TarArchiveEntry("file1.txt");
        TarArchiveEntry entry2 = new TarArchiveEntry("file2.txt");
        byte[] tarData = createTarArchive(entry1, entry2);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        ArchiveEntry read1 = tais.getNextEntry();
        Assert.assertNotNull(read1);
        Assert.assertEquals("file1.txt", read1.getName());

        ArchiveEntry read2 = tais.getNextEntry();
        Assert.assertNotNull(read2);
        Assert.assertEquals("file2.txt", read2.getName());

        Assert.assertNull(tais.getNextEntry());
        tais.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testRead_withoutCurrentEntry_throwsIllegalStateException() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[512]));
        byte[] buf = new byte[10];
        tais.read(buf, 0, 10);
    }

    @Test(expected = IOException.class)
    public void testRead_truncatedStream_throwsIOException() throws IOException {
        byte[] content = new byte[100];
        byte[] tarData = createTarArchiveWithData("truncated.txt", content);
        // Truncate the tar data right after header so content is missing
        byte[] truncated = Arrays.copyOf(tarData, 512);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(truncated));
        Assert.assertNotNull(tais.getNextTarEntry());
        byte[] buf = new byte[100];
        tais.read(buf, 0, 100);
    }

    @Test(expected = IOException.class)
    public void testGetNextTarEntry_corruptHeader_throwsIOException() throws IOException {
        byte[] corruptHeader = new byte[512];
        corruptHeader[0] = (byte) 'a'; // not zero, but invalid tar header
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(corruptHeader));
        tais.getNextTarEntry();
    }

    @Test
    public void testGNULongNameEntry() throws IOException {
        String longName = "a/very/long/path/name/that/exceeds/the/normal/tar/limit/of/one/hundred/characters/which/requires/gnu/long/name/handling/in/the/stream/testfile.txt";
        byte[] content = "content".getBytes(CharsetNames.UTF_8);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(content.length);
        tos.putArchiveEntry(entry);
        tos.write(content);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(bos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        Assert.assertNotNull(readEntry);
        Assert.assertEquals(longName, readEntry.getName());
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testGNULongLinkEntry() throws IOException {
        String longLinkName = "a/very/long/target/link/path/that/exceeds/the/normal/tar/limit/of/one/hundred/characters/which/requires/gnu/long/link/handling/in/the/stream/target.txt";

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry("symlink", TarConstants.LF_SYMLINK);
        entry.setLinkName(longLinkName);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(bos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        Assert.assertNotNull(readEntry);
        Assert.assertEquals(longLinkName, readEntry.getLinkName());
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testPaxHeaders() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("pax-file.txt");
        entry.setSize(5);
        entry.setGroupId(1234);
        entry.setGroupName("groupname");
        entry.setUserId(5678);
        entry.setUserName("username");
        entry.setModTime(1000000000L);
        tos.putArchiveEntry(entry);
        tos.write("hello".getBytes(CharsetNames.UTF_8));
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(bos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        Assert.assertNotNull(readEntry);
        Assert.assertEquals("pax-file.txt", readEntry.getName());
        Assert.assertEquals(5, readEntry.getSize());
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testParsePaxHeadersDirectly() throws IOException {
        String paxString = "30 path=new/long/path/name.txt\n"
                + "20 linkpath=symlink\n"
                + "11 gid=1001\n"
                + "15 gname=testers\n"
                + "11 uid=2002\n"
                + "13 uname=user\n"
                + "12 size=12345\n"
                + "18 mtime=1234567.89\n"
                + "21 SCHILY.devminor=10\n"
                + "21 SCHILY.devmajor=20\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(paxString.getBytes(CharsetNames.UTF_8));
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tais.parsePaxHeaders(bais);

        Assert.assertEquals("new/long/path/name.txt", headers.get("path"));
        Assert.assertEquals("symlink", headers.get("linkpath"));
        Assert.assertEquals("1001", headers.get("gid"));
        Assert.assertEquals("testers", headers.get("gname"));
        Assert.assertEquals("2002", headers.get("uid"));
        Assert.assertEquals("user", headers.get("uname"));
        Assert.assertEquals("12345", headers.get("size"));
        Assert.assertEquals("1234567.89", headers.get("mtime"));
        Assert.assertEquals("10", headers.get("SCHILY.devminor"));
        Assert.assertEquals("20", headers.get("SCHILY.devmajor"));
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeaders_truncatedData_throwsIOException() throws IOException {
        String corruptPaxString = "30 path=truncated";
        ByteArrayInputStream bais = new ByteArrayInputStream(corruptPaxString.getBytes(CharsetNames.UTF_8));
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tais.parsePaxHeaders(bais);
    }

    @Test
    public void testGetLongNameData_eofPremature_returnsNull() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry gnuEntry = new TarArchiveEntry(TarConstants.GNU_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] nameBytes = "file.txt\0".getBytes(CharsetNames.UTF_8);
        gnuEntry.setSize(nameBytes.length);
        tos.putArchiveEntry(gnuEntry);
        tos.write(nameBytes);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(bos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        tais.close();
    }

    @Test
    public void testCanReadEntryData() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry regularEntry = new TarArchiveEntry("test.txt");
        Assert.assertTrue(tais.canReadEntryData(regularEntry));

        TarArchiveEntry sparseEntry = new TarArchiveEntry("sparse.txt", TarConstants.LF_GNUTYPE_SPARSE);
        Assert.assertFalse(tais.canReadEntryData(sparseEntry));

        ArchiveEntry nonTarEntry = new ArchiveEntry() {
            @Override
            public String getName() { return "other"; }
            @Override
            public long getSize() { return 0; }
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public java.util.Date getLastModifiedDate() { return null; }
        };
        Assert.assertFalse(tais.canReadEntryData(nonTarEntry));
        Assert.assertFalse(tais.canReadEntryData(null));
    }

    @Test
    public void testCurrentEntryAndEofGettersSetters() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(tais.getCurrentEntry());
        Assert.assertFalse(tais.isAtEOF());

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tais.setCurrentEntry(entry);
        Assert.assertEquals(entry, tais.getCurrentEntry());

        tais.setAtEOF(true);
        Assert.assertTrue(tais.isAtEOF());
    }

    @Test
    public void testIsEOFRecord() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(tais.isEOFRecord(null));
        Assert.assertTrue(tais.isEOFRecord(new byte[512]));

        byte[] nonEof = new byte[512];
        nonEof[0] = 1;
        Assert.assertFalse(tais.isEOFRecord(nonEof));
    }

    @Test
    public void testReadRecord_shortRead_returnsNull() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        Assert.assertNull(tais.readRecord());
    }

    @Test
    public void testConsumeSecondEOFRecord_nonMarkSupportedStream() throws IOException {
        byte[] doubleEofData = new byte[10240];
        InputStream nonMarkIs = new FilterInputStream(new ByteArrayInputStream(doubleEofData)) {
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        TarArchiveInputStream tais = new TarArchiveInputStream(nonMarkIs);
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testMatches() {
        byte[] empty = new byte[0];
        Assert.assertFalse(TarArchiveInputStream.matches(empty, 0));

        byte[] posixSig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, posixSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, posixSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(posixSig, posixSig.length));

        byte[] gnuSpaceSig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuSpaceSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, gnuSpaceSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(gnuSpaceSig, gnuSpaceSig.length));

        byte[] gnuZeroSig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuZeroSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, gnuZeroSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(gnuZeroSig, gnuZeroSig.length));

        byte[] antSig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, antSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, antSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(antSig, antSig.length));

        byte[] invalidSig = new byte[512];
        Assert.assertFalse(TarArchiveInputStream.matches(invalidSig, invalidSig.length));
    }
}
