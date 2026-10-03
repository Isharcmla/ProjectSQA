package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    private byte[] createSimpleTarArchive(String entryName, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry(entryName);
        entry.setSize(content.length);
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.close();
        return baos.toByteArray();
    }

    private byte[] createTwoEntriesTarArchive(String name1, byte[] content1, String name2, byte[] content2) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        
        TarArchiveEntry entry1 = new TarArchiveEntry(name1);
        entry1.setSize(content1.length);
        taos.putArchiveEntry(entry1);
        taos.write(content1);
        taos.closeArchiveEntry();

        TarArchiveEntry entry2 = new TarArchiveEntry(name2);
        entry2.setSize(content2.length);
        taos.putArchiveEntry(entry2);
        taos.write(content2);
        taos.closeArchiveEntry();

        taos.close();
        return baos.toByteArray();
    }

    @Test
    public void testConstructors_variousParameters_instantiatedProperly() throws IOException {
        byte[] empty = new byte[0];
        
        TarArchiveInputStream tais1 = new TarArchiveInputStream(new ByteArrayInputStream(empty));
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais1.getRecordSize());
        tais1.close();

        TarArchiveInputStream tais2 = new TarArchiveInputStream(new ByteArrayInputStream(empty), "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais2.getRecordSize());
        assertEquals("UTF-8", tais2.encoding);
        tais2.close();

        TarArchiveInputStream tais3 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais3.getRecordSize());
        tais3.close();

        TarArchiveInputStream tais4 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024, "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais4.getRecordSize());
        tais4.close();

        TarArchiveInputStream tais5 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024, 512);
        assertEquals(512, tais5.getRecordSize());
        tais5.close();

        TarArchiveInputStream tais6 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024, 512, "ISO-8859-1");
        assertEquals(512, tais6.getRecordSize());
        assertEquals("ISO-8859-1", tais6.encoding);
        tais6.close();
    }

    @Test
    public void testGetNextTarEntry_normalEntry_readsCorrectly() throws IOException {
        byte[] content = "Hello World!".getBytes("UTF-8");
        byte[] tarBytes = createSimpleTarArchive("test.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(content.length, entry.getSize());
        assertEquals(entry, tais.getCurrentEntry());

        byte[] readBuf = new byte[content.length];
        int read = tais.read(readBuf, 0, readBuf.length);
        assertEquals(content.length, read);
        assertArrayEquals(content, readBuf);

        assertEquals(-1, tais.read(readBuf, 0, readBuf.length));
        assertNull(tais.getNextTarEntry());
        assertNull(tais.getCurrentEntry());
        tais.close();
    }

    @Test
    public void testGetNextEntry_callsGetNextTarEntry_returnsSame() throws IOException {
        byte[] content = "Some content".getBytes("UTF-8");
        byte[] tarBytes = createSimpleTarArchive("file.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        ArchiveEntry entry = tais.getNextEntry();
        assertNotNull(entry);
        assertEquals("file.txt", entry.getName());
        tais.close();
    }

    @Test
    public void testSkip_validAndEdgeCases_skipsProperly() throws IOException {
        byte[] content = "0123456789ABCDEF".getBytes("UTF-8");
        byte[] tarBytes = createSimpleTarArchive("numbers.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        assertNotNull(tais.getNextTarEntry());

        assertEquals(0, tais.skip(-5));
        assertEquals(0, tais.skip(0));

        long skipped = tais.skip(4);
        assertEquals(4, skipped);
        assertEquals(12, tais.available());

        byte[] buf = new byte[4];
        int read = tais.read(buf, 0, 4);
        assertEquals(4, read);
        assertEquals("4567", new String(buf, "UTF-8"));

        skipped = tais.skip(100);
        assertEquals(8, skipped);
        assertEquals(0, tais.available());

        tais.close();
    }

    @Test
    public void testAvailable_afterReading_returnsCorrectCount() throws IOException {
        byte[] content = new byte[100];
        byte[] tarBytes = createSimpleTarArchive("data.bin", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        assertEquals(0, tais.available());
        tais.getNextTarEntry();
        assertEquals(100, tais.available());
        tais.read(new byte[30], 0, 30);
        assertEquals(70, tais.available());
        tais.close();
    }

    @Test
    public void testSkipRecordPadding_entrySizeNotMultipleOfRecord_skipsPadding() throws IOException {
        byte[] content1 = new byte[300];
        byte[] content2 = new byte[200];
        byte[] tarBytes = createTwoEntriesTarArchive("first.bin", content1, "second.bin", content2);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        
        TarArchiveEntry e1 = tais.getNextTarEntry();
        assertNotNull(e1);
        assertEquals("first.bin", e1.getName());
        
        TarArchiveEntry e2 = tais.getNextTarEntry();
        assertNotNull(e2);
        assertEquals("second.bin", e2.getName());

        byte[] read2 = new byte[200];
        int got = tais.read(read2, 0, 200);
        assertEquals(200, got);

        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testRead_noCurrentEntry_throwsIllegalStateException() throws IOException {
        byte[] tarBytes = createSimpleTarArchive("test.txt", new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes));
        try {
            tais.read(new byte[10], 0, 10);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // Success
        }
        tais.close();
    }

    @Test
    public void testRead_truncatedArchive_throwsIOException() throws IOException {
        byte[] content = new byte[200];
        byte[] tarBytes = createSimpleTarArchive("truncated.bin", content);
        
        byte[] truncatedBytes = Arrays.copyOf(tarBytes, 512 + 50);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(truncatedBytes));
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        
        byte[] buf = new byte[200];
        int read1 = tais.read(buf, 0, 50);
        assertEquals(50, read1);

        try {
            tais.read(buf, 50, 150);
            fail("Expected IOException due to truncated archive");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("Truncated TAR archive"));
        }
        tais.close();
    }

    @Test
    public void testMarkAndReset_unsupported_doesNothing() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tais.markSupported());
        tais.mark(100);
        tais.reset();
        tais.close();
    }

    @Test
    public void testGNULongNameEntry_longFileName_readsCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        String longName = "this/is/a/very/long/file/path/that/exceeds/the/one/hundred/character/limit/for/standard/tar/headers/file.txt";
        byte[] content = "GNU Long Name Content".getBytes("UTF-8");

        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(content.length);
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        assertNotNull(readEntry);
        assertEquals(longName, readEntry.getName());
        assertEquals(content.length, readEntry.getSize());

        byte[] buf = new byte[content.length];
        assertEquals(content.length, tais.read(buf, 0, content.length));
        assertArrayEquals(content, buf);
        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testGNULongLinkEntry_longLinkName_readsCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        String name = "link.txt";
        String longLinkName = "target/is/a/very/long/file/path/that/exceeds/the/one/hundred/character/limit/for/standard/tar/link/target.txt";

        TarArchiveEntry entry = new TarArchiveEntry(name, TarConstants.LF_SYMLINK);
        entry.setLinkName(longLinkName);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        assertNotNull(readEntry);
        assertEquals(name, readEntry.getName());
        assertEquals(longLinkName, readEntry.getLinkName());
        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testGetLongNameData_truncatedArchive_returnsNull() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        TarArchiveEntry entry = new TarArchiveEntry("a".repeat(150));
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.write(new byte[10]);
        taos.closeArchiveEntry();
        taos.close();

        byte[] raw = baos.toByteArray();
        byte[] truncated = Arrays.copyOf(raw, 512 + 512);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(truncated));
        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testPaxHeaders_parsingAndApplyingAllFields() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);

        TarArchiveEntry entry = new TarArchiveEntry("pax-entry.txt");
        entry.setSize(5);
        entry.setGroupId(1234);
        entry.setUserId(5678);
        entry.setGroupName("paxgroup");
        entry.setUserName("paxuser");
        entry.setModTime(1500000000000L);
        taos.putArchiveEntry(entry);
        taos.write("12345".getBytes("UTF-8"));
        taos.closeArchiveEntry();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        assertNotNull(readEntry);
        assertEquals("pax-entry.txt", readEntry.getName());
        assertEquals(1234, readEntry.getGroupId());
        assertEquals(5678, readEntry.getUserId());
        assertEquals("paxgroup", readEntry.getGroupName());
        assertEquals("paxuser", readEntry.getUserName());
        assertEquals(1500000000000L, readEntry.getModTime().getTime());
        tais.close();
    }

    @Test
    public void testParsePaxHeaders_allSupportedAttributes() throws IOException {
        StringBuilder pax = new StringBuilder();
        pax.append("25 path=custom/path.txt\n");
        pax.append("25 linkpath=custom/link\n");
        pax.append("14 gid=1001\n");
        pax.append("18 gname=testgroup\n");
        pax.append("14 uid=1002\n");
        pax.append("17 uname=testuser\n");
        pax.append("14 size=2048\n");
        pax.append("20 mtime=1600000.5\n");
        pax.append("21 SCHILY.devminor=10\n");
        pax.append("21 SCHILY.devmajor=20\n");

        ByteArrayInputStream bais = new ByteArrayInputStream(pax.toString().getBytes(CharsetNames.UTF_8));
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        Map<String, String> headers = tais.parsePaxHeaders(bais);
        assertEquals("custom/path.txt", headers.get("path"));
        assertEquals("custom/link", headers.get("linkpath"));
        assertEquals("1001", headers.get("gid"));
        assertEquals("testgroup", headers.get("gname"));
        assertEquals("1002", headers.get("uid"));
        assertEquals("testuser", headers.get("uname"));
        assertEquals("2048", headers.get("size"));
        assertEquals("1600000.5", headers.get("mtime"));
        assertEquals("10", headers.get("SCHILY.devminor"));
        assertEquals("20", headers.get("SCHILY.devmajor"));

        TarArchiveEntry tae = new TarArchiveEntry("old-name");
        tais.setCurrentEntry(tae);
        
        ByteArrayOutputStream singlePaxBlock = new ByteArrayOutputStream();
        TarArchiveEntry paxEntry = new TarArchiveEntry("PaxHeader/old-name", TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        byte[] paxBytes = pax.toString().getBytes(CharsetNames.UTF_8);
        paxEntry.setSize(paxBytes.length);
        byte[] headerBuf = new byte[512];
        paxEntry.writeEntryHeader(headerBuf);
        singlePaxBlock.write(headerBuf);
        singlePaxBlock.write(paxBytes);
        int pad = 512 - (paxBytes.length % 512);
        if (pad < 512) {
            singlePaxBlock.write(new byte[pad]);
        }
        
        TarArchiveEntry fileEntry = new TarArchiveEntry("old-name");
        fileEntry.setSize(10);
        byte[] fileHeader = new byte[512];
        fileEntry.writeEntryHeader(fileHeader);
        singlePaxBlock.write(fileHeader);
        singlePaxBlock.write(new byte[10]);
        singlePaxBlock.write(new byte[512 - 10]);
        singlePaxBlock.write(new byte[1024]); // 2 EOF records

        TarArchiveInputStream paxTais = new TarArchiveInputStream(new ByteArrayInputStream(singlePaxBlock.toByteArray()));
        TarArchiveEntry actual = paxTais.getNextTarEntry();
        assertNotNull(actual);
        assertEquals("custom/path.txt", actual.getName());
        assertEquals("custom/link", actual.getLinkName());
        assertEquals(1001, actual.getGroupId());
        assertEquals("testgroup", actual.getGroupName());
        assertEquals(1002, actual.getUserId());
        assertEquals("testuser", actual.getUserName());
        assertEquals(2048, actual.getSize());
        assertEquals(1600000500L, actual.getModTime().getTime());
        assertEquals(10, actual.getDevMinor());
        assertEquals(20, actual.getDevMajor());

        paxTais.close();
        tais.close();
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeaders_truncatedData_throwsIOException() throws IOException {
        String pax = "50 path=truncated";
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tais.parsePaxHeaders(new ByteArrayInputStream(pax.getBytes("UTF-8")));
    }

    @Test
    public void testGNUSparseExtended_readsSparseHeaders() throws IOException {
        byte[] headerBuf = new byte[512];
        TarArchiveEntry entry = new TarArchiveEntry("sparse.bin", TarConstants.LF_GNUTYPE_SPARSE);
        entry.setSize(0);
        entry.writeEntryHeader(headerBuf);
        headerBuf[482] = 1; // isExtended = 1

        byte[] sparseHeader1 = new byte[512];
        sparseHeader1[504] = 1; // extended = 1

        byte[] sparseHeader2 = new byte[512];
        sparseHeader2[504] = 0; // extended = 0

        byte[] eof = new byte[1024];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(headerBuf);
        baos.write(sparseHeader1);
        baos.write(sparseHeader2);
        baos.write(eof);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry sparseEntry = tais.getNextTarEntry();
        assertNotNull(sparseEntry);
        assertTrue(sparseEntry.isGNUSparse());
        tais.close();
    }

    @Test
    public void testGNUSparseExtended_eofInSparse_stopsGracefully() throws IOException {
        byte[] headerBuf = new byte[512];
        TarArchiveEntry entry = new TarArchiveEntry("sparse.bin", TarConstants.LF_GNUTYPE_SPARSE);
        entry.setSize(0);
        entry.writeEntryHeader(headerBuf);
        headerBuf[482] = 1; // isExtended = 1

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(headerBuf));
        TarArchiveEntry sparseEntry = tais.getNextTarEntry();
        assertNull(sparseEntry);
        tais.close();
    }

    @Test
    public void testGetNextTarEntry_corruptedHeader_throwsIOException() throws IOException {
        byte[] invalidHeader = new byte[512];
        Arrays.fill(invalidHeader, (byte) 'A');

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(invalidHeader));
        try {
            tais.getNextTarEntry();
            fail("Expected IOException on invalid header");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("Error detected parsing the header"));
        }
        tais.close();
    }

    @Test
    public void testTryToConsumeSecondEOFRecord_markSupportedInputStream() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(0);
        byte[] header = new byte[512];
        entry.writeEntryHeader(header);
        baos.write(header);
        baos.write(new byte[512]); // First EOF record
        baos.write(new byte[512]); // Second EOF record
        
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        assertNotNull(tais.getNextTarEntry());
        assertNull(tais.getNextTarEntry());
        assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void testTryToConsumeSecondEOFRecord_nonMarkSupportedStream() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(0);
        byte[] header = new byte[512];
        entry.writeEntryHeader(header);
        baos.write(header);
        baos.write(new byte[512]); // First EOF
        baos.write(new byte[512]); // Second EOF

        InputStream nonMarkStream = new FilterInputStream(new ByteArrayInputStream(baos.toByteArray())) {
            @Override
            public boolean markSupported() {
                return false;
            }
        };

        TarArchiveInputStream tais = new TarArchiveInputStream(nonMarkStream);
        assertNotNull(tais.getNextTarEntry());
        assertNull(tais.getNextTarEntry());
        assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void testTryToConsumeSecondEOFRecord_secondRecordIsNotEOF_resetsMark() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveEntry entry1 = new TarArchiveEntry("file1.txt");
        entry1.setSize(0);
        byte[] header1 = new byte[512];
        entry1.writeEntryHeader(header1);
        baos.write(header1);
        baos.write(new byte[512]); // Single EOF record

        byte[] nonEofHeader = new byte[512];
        Arrays.fill(nonEofHeader, (byte) 1);
        baos.write(nonEofHeader);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        assertNotNull(tais.getNextTarEntry());
        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testCanReadEntryData() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry normalEntry = new TarArchiveEntry("test.txt");
        assertTrue(tais.canReadEntryData(normalEntry));

        TarArchiveEntry sparseEntry = new TarArchiveEntry("sparse.txt", TarConstants.LF_GNUTYPE_SPARSE);
        assertFalse(tais.canReadEntryData(sparseEntry));

        ZipArchiveEntry zipEntry = new ZipArchiveEntry("test.zip");
        assertFalse(tais.canReadEntryData(zipEntry));
        assertFalse(tais.canReadEntryData(null));
    }

    @Test
    public void testMatches_allSignatures() {
        byte[] tooShort = new byte[10];
        assertFalse(TarArchiveInputStream.matches(tooShort, tooShort.length));

        byte[] posixTar = new byte[512];
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, posixTar, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, posixTar, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(posixTar, 512));

        byte[] gnuSpaceTar = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuSpaceTar, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, gnuSpaceTar, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(gnuSpaceTar, 512));

        byte[] gnuZeroTar = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuZeroTar, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, gnuZeroTar, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(gnuZeroTar, 512));

        byte[] antTar = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, antTar, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, antTar, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(antTar, 512));

        byte[] invalidTar = new byte[512];
        assertFalse(TarArchiveInputStream.matches(invalidTar, 512));
    }

    @Test
    public void testProtectedGettersAndSetters() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tais.isAtEOF());
        tais.setAtEOF(true);
        assertTrue(tais.isAtEOF());

        assertNull(tais.getCurrentEntry());
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tais.setCurrentEntry(entry);
        assertEquals(entry, tais.getCurrentEntry());

        byte[] zeros = new byte[512];
        assertTrue(tais.isEOFRecord(zeros));
        assertTrue(tais.isEOFRecord(null));
        zeros[0] = 1;
        assertFalse(tais.isEOFRecord(zeros));
    }

    @Test
    public void testGetNextTarEntry_alreadyAtEOF_returnsNullImmediately() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tais.setAtEOF(true);
        assertNull(tais.getNextTarEntry());
        tais.close();
    }
}
