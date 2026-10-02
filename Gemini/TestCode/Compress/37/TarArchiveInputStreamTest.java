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
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    @Test
    public void testConstructors() throws IOException {
        final byte[] empty = new byte[0];
        try (TarArchiveInputStream tais1 = new TarArchiveInputStream(new ByteArrayInputStream(empty))) {
            assertEquals(TarConstants.DEFAULT_RCDSIZE, tais1.getRecordSize());
        }
        try (TarArchiveInputStream tais2 = new TarArchiveInputStream(new ByteArrayInputStream(empty), CharsetNames.UTF_8)) {
            assertEquals(TarConstants.DEFAULT_RCDSIZE, tais2.getRecordSize());
            assertEquals(CharsetNames.UTF_8, tais2.encoding);
        }
        try (TarArchiveInputStream tais3 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024)) {
            assertEquals(TarConstants.DEFAULT_RCDSIZE, tais3.getRecordSize());
        }
        try (TarArchiveInputStream tais4 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024, CharsetNames.UTF_8)) {
            assertEquals(TarConstants.DEFAULT_RCDSIZE, tais4.getRecordSize());
            assertEquals(CharsetNames.UTF_8, tais4.encoding);
        }
        try (TarArchiveInputStream tais5 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024, 512)) {
            assertEquals(512, tais5.getRecordSize());
        }
        try (TarArchiveInputStream tais6 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024, 512, CharsetNames.UTF_8)) {
            assertEquals(512, tais6.getRecordSize());
            assertEquals(CharsetNames.UTF_8, tais6.encoding);
        }
    }

    @Test
    public void testMarkAndReset() throws IOException {
        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[512]))) {
            assertFalse(tais.markSupported());
            tais.mark(100);
            tais.reset();
        }
    }

    @Test
    public void testMatches_allVariants() {
        final byte[] buffer = new byte[512];

        assertFalse(TarArchiveInputStream.matches(buffer, 10));

        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, buffer, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, buffer, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(buffer, 512));

        Arrays.fill(buffer, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, buffer, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, buffer, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(buffer, 512));

        Arrays.fill(buffer, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, buffer, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, buffer, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(buffer, 512));

        Arrays.fill(buffer, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, buffer, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, buffer, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(buffer, 512));

        Arrays.fill(buffer, (byte) 0);
        assertFalse(TarArchiveInputStream.matches(buffer, 512));
    }

    @Test
    public void testCanReadEntryData() {
        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            assertTrue(tais.canReadEntryData(entry));
            assertFalse(tais.canReadEntryData(null));

            ArchiveEntry mockArchiveEntry = new ArchiveEntry() {
                @Override
                public String getName() { return "mock"; }
                @Override
                public long getSize() { return 0; }
                @Override
                public boolean isDirectory() { return false; }
                @Override
                public java.util.Date getLastModifiedDate() { return new java.util.Date(); }
            };
            assertFalse(tais.canReadEntryData(mockArchiveEntry));
        } catch (IOException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGettersAndSetters() throws IOException {
        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            assertNull(tais.getCurrentEntry());
            assertFalse(tais.isAtEOF());

            TarArchiveEntry entry = new TarArchiveEntry("file.txt");
            tais.setCurrentEntry(entry);
            assertEquals(entry, tais.getCurrentEntry());

            tais.setAtEOF(true);
            assertTrue(tais.isAtEOF());
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testRead_noCurrentEntry_throwsIllegalStateException() throws IOException {
        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[512]))) {
            tais.read(new byte[10], 0, 10);
        }
    }

    @Test
    public void testReadAndSkip_normalWorkflow() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] content = "Hello, Tar World! 1234567890".getBytes(CharsetNames.UTF_8);
        entry.setSize(content.length);

        byte[] header = new byte[512];
        entry.writeEntryHeader(header);
        baos.write(header);
        baos.write(content);

        int padding = 512 - (content.length % 512);
        if (padding < 512) {
            baos.write(new byte[padding]);
        }
        baos.write(new byte[1024]); // Two EOF records

        byte[] tarBytes = baos.toByteArray();

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarBytes))) {
            TarArchiveEntry readEntry = tais.getNextTarEntry();
            assertNotNull(readEntry);
            assertEquals("test.txt", readEntry.getName());
            assertEquals(content.length, readEntry.getSize());
            assertEquals(content.length, tais.available());

            assertEquals(0, tais.skip(-1));
            assertEquals(0, tais.skip(0));

            byte[] buf = new byte[5];
            int read = tais.read(buf, 0, 5);
            assertEquals(5, read);
            assertEquals("Hello", new String(buf, 0, read, CharsetNames.UTF_8));

            long skipped = tais.skip(7);
            assertEquals(7, skipped);

            byte[] remaining = new byte[100];
            int remainingRead = tais.read(remaining, 0, remaining.length);
            assertEquals(content.length - 12, remainingRead);

            assertEquals(-1, tais.read(buf, 0, 5));
            assertNull(tais.getNextEntry());
        }
    }

    @Test
    public void testRead_directoryEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveEntry dirEntry = new TarArchiveEntry("dir/", TarConstants.LF_DIR);
        dirEntry.setSize(0);
        byte[] header = new byte[512];
        dirEntry.writeEntryHeader(header);
        baos.write(header);
        baos.write(new byte[1024]);

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            TarArchiveEntry entry = (TarArchiveEntry) tais.getNextEntry();
            assertNotNull(entry);
            assertTrue(entry.isDirectory());
            assertEquals(0, tais.available());
            assertEquals(0, tais.skip(10));
            assertEquals(-1, tais.read(new byte[10], 0, 10));
        }
    }

    @Test
    public void testRead_truncatedArchive_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveEntry entry = new TarArchiveEntry("trunc.txt");
        entry.setSize(100);
        byte[] header = new byte[512];
        entry.writeEntryHeader(header);
        baos.write(header);
        baos.write(new byte[20]); // less than entry size, stream ends abruptly

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            TarArchiveEntry e = tais.getNextTarEntry();
            assertNotNull(e);
            byte[] buf = new byte[50];
            tais.read(buf, 0, 20);
            tais.read(buf, 0, 30);
            fail("Expected IOException on truncated read");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("Truncated TAR archive"));
        }
    }

    @Test
    public void testInvalidHeader_throwsIOException() {
        byte[] invalidHeader = new byte[512];
        Arrays.fill(invalidHeader, (byte) 'A');
        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(invalidHeader))) {
            tais.getNextTarEntry();
            fail("Expected IOException due to invalid header parsing");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Error detected parsing the header"));
        }
    }

    @Test
    public void testGNULongNameAndLongLink() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String longLinkName = "target/dir/very/long/path/name/for/symlink/pointing/to/somewhere/that/exceeds/the/standard/one/hundred/bytes/limit/link.txt";
        TarArchiveEntry longLinkEntry = new TarArchiveEntry(TarConstants.GNU_LONGLINK, TarConstants.LF_GNUTYPE_LONGLINK);
        byte[] linkBytes = longLinkEntry.getName().getBytes(CharsetNames.UTF_8);
        byte[] longLinkBytes = longLinkName.getBytes(CharsetNames.UTF_8);
        longLinkEntry.setSize(longLinkBytes.length + 1); // with null terminator
        byte[] header1 = new byte[512];
        longLinkEntry.writeEntryHeader(header1);
        baos.write(header1);
        baos.write(longLinkBytes);
        baos.write(0); // null terminator
        int padLink = 512 - ((longLinkBytes.length + 1) % 512);
        if (padLink < 512) baos.write(new byte[padLink]);

        String longFileName = "directory/subdirectory/nested/structure/with/a/very/long/file/name/that/exceeds/one/hundred/characters/filename.txt";
        TarArchiveEntry longNameEntry = new TarArchiveEntry(TarConstants.GNU_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] longNameBytes = longFileName.getBytes(CharsetNames.UTF_8);
        longNameEntry.setSize(longNameBytes.length + 1);
        byte[] header2 = new byte[512];
        longNameEntry.writeEntryHeader(header2);
        baos.write(header2);
        baos.write(longNameBytes);
        baos.write(0);
        int padName = 512 - ((longNameBytes.length + 1) % 512);
        if (padName < 512) baos.write(new byte[padName]);

        TarArchiveEntry actualEntry = new TarArchiveEntry("short.txt", TarConstants.LF_SYMLINK);
        actualEntry.setSize(0);
        byte[] header3 = new byte[512];
        actualEntry.writeEntryHeader(header3);
        baos.write(header3);
        baos.write(new byte[1024]); // EOF blocks

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            TarArchiveEntry entry = tais.getNextTarEntry();
            assertNotNull(entry);
            assertEquals(longFileName, entry.getName());
            assertEquals(longLinkName, entry.getLinkName());
        }
    }

    @Test
    public void testGNULongName_malformedTar() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveEntry longNameEntry = new TarArchiveEntry(TarConstants.GNU_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] nameBytes = "name".getBytes(CharsetNames.UTF_8);
        longNameEntry.setSize(nameBytes.length);
        byte[] header = new byte[512];
        longNameEntry.writeEntryHeader(header);
        baos.write(header);
        baos.write(nameBytes);
        int pad = 512 - (nameBytes.length % 512);
        if (pad < 512) baos.write(new byte[pad]);
        baos.write(new byte[1024]); // EOF record immediately after long name without target entry

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            TarArchiveEntry entry = tais.getNextTarEntry();
            assertNull(entry);
        }
    }

    @Test
    public void testGNULongLink_malformedTar() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveEntry longLinkEntry = new TarArchiveEntry(TarConstants.GNU_LONGLINK, TarConstants.LF_GNUTYPE_LONGLINK);
        byte[] linkBytes = "link".getBytes(CharsetNames.UTF_8);
        longLinkEntry.setSize(linkBytes.length);
        byte[] header = new byte[512];
        longLinkEntry.writeEntryHeader(header);
        baos.write(header);
        baos.write(linkBytes);
        int pad = 512 - (linkBytes.length % 512);
        if (pad < 512) baos.write(new byte[pad]);
        baos.write(new byte[1024]); // EOF record immediately after

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            TarArchiveEntry entry = tais.getNextTarEntry();
            assertNull(entry);
        }
    }

    @Test
    public void testPaxHeaders() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String paxData = "25 ctime=1300000000.0\n"
                + "30 path=overridden/path.txt\n"
                + "26 linkpath=target/link\n"
                + "13 gid=1001\n"
                + "15 gname=group1\n"
                + "13 uid=2002\n"
                + "14 uname=user1\n"
                + "14 size=5\n"
                + "28 mtime=1350000000.123456\n"
                + "24 SCHILY.devminor=12\n"
                + "24 SCHILY.devmajor=34\n"
                + "23 GNU.sparse.size=100\n"
                + "27 GNU.sparse.realsize=200\n"
                + "30 SCHILY.filetype=sparse\n"
                + "13 removeme=\n";

        byte[] paxBytes = paxData.getBytes(CharsetNames.UTF_8);

        TarArchiveEntry paxEntry = new TarArchiveEntry("PaxHeader/file.txt", TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        paxEntry.setSize(paxBytes.length);
        byte[] paxHeaderBuf = new byte[512];
        paxEntry.writeEntryHeader(paxHeaderBuf);
        baos.write(paxHeaderBuf);
        baos.write(paxBytes);
        int padPax = 512 - (paxBytes.length % 512);
        if (padPax < 512) baos.write(new byte[padPax]);

        TarArchiveEntry actualEntry = new TarArchiveEntry("original/path.txt");
        actualEntry.setSize(5);
        byte[] actualHeaderBuf = new byte[512];
        actualEntry.writeEntryHeader(actualHeaderBuf);
        baos.write(actualHeaderBuf);
        baos.write("Hello".getBytes(CharsetNames.UTF_8));
        int padActual = 512 - (5 % 512);
        if (padActual < 512) baos.write(new byte[padActual]);

        baos.write(new byte[1024]);

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            TarArchiveEntry entry = tais.getNextTarEntry();
            assertNotNull(entry);
            assertEquals("overridden/path.txt", entry.getName());
            assertEquals("target/link", entry.getLinkName());
            assertEquals(1001, entry.getLongGroupId());
            assertEquals("group1", entry.getGroupName());
            assertEquals(2002, entry.getLongUserId());
            assertEquals("user1", entry.getUserName());
            assertEquals(5, entry.getSize());
            assertEquals(1350000000123L, entry.getModTime().getTime());
            assertEquals(12, entry.getDevMinor());
            assertEquals(34, entry.getDevMajor());

            byte[] content = new byte[5];
            int read = tais.read(content, 0, 5);
            assertEquals(5, read);
            assertEquals("Hello", new String(content, CharsetNames.UTF_8));
        }
    }

    @Test
    public void testGlobalPaxHeaders() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String globalPaxData = "30 path=global/default.txt\n"
                + "13 gid=3003\n";
        byte[] globalPaxBytes = globalPaxData.getBytes(CharsetNames.UTF_8);

        TarArchiveEntry globalPaxEntry = new TarArchiveEntry("GlobalHead", TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER);
        globalPaxEntry.setSize(globalPaxBytes.length);
        byte[] headerBuf = new byte[512];
        globalPaxEntry.writeEntryHeader(headerBuf);
        baos.write(headerBuf);
        baos.write(globalPaxBytes);
        int pad = 512 - (globalPaxBytes.length % 512);
        if (pad < 512) baos.write(new byte[pad]);

        TarArchiveEntry normalEntry = new TarArchiveEntry("dummy.txt");
        normalEntry.setSize(0);
        byte[] normBuf = new byte[512];
        normalEntry.writeEntryHeader(normBuf);
        baos.write(normBuf);

        baos.write(new byte[1024]);

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            TarArchiveEntry entry = tais.getNextTarEntry();
            assertNotNull(entry);
            assertEquals("global/default.txt", entry.getName());
            assertEquals(3003, entry.getLongGroupId());
        }
    }

    @Test
    public void testParsePaxHeaders_truncatedData_throwsIOException() {
        String truncatedPaxData = "50 path=short\n";
        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            tais.parsePaxHeaders(new ByteArrayInputStream(truncatedPaxData.getBytes(CharsetNames.UTF_8)));
            fail("Expected IOException on truncated pax header line");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("Failed to read Paxheader"));
        }
    }

    @Test
    public void testOldGNUSparse() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        TarArchiveEntry entry = new TarArchiveEntry("sparse.bin", TarConstants.LF_GNUTYPE_SPARSE);
        entry.setSize(0);

        byte[] header = new byte[512];
        entry.writeEntryHeader(header);
        header[TarConstants.PADREV_GNU_SPARSEOFFSET_10X] = 1; // Mark isExtended = true
        baos.write(header);

        TarArchiveSparseEntry sparseEntry = new TarArchiveSparseEntry(new byte[512]);
        byte[] sparseHeader = new byte[512];
        sparseHeader[TarConstants.SPARSE_OFFSET_GNU_SPARSEENTRY_SPM] = 0; // isExtended = false
        baos.write(sparseHeader);

        baos.write(new byte[1024]);

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            TarArchiveEntry readEntry = tais.getNextTarEntry();
            assertNotNull(readEntry);
            assertTrue(readEntry.isOldGNUSparse());
        }
    }

    @Test
    public void testOldGNUSparse_eofDuringSparseHeaders() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        TarArchiveEntry entry = new TarArchiveEntry("sparse.bin", TarConstants.LF_GNUTYPE_SPARSE);
        entry.setSize(0);
        byte[] header = new byte[512];
        entry.writeEntryHeader(header);
        header[TarConstants.PADREV_GNU_SPARSEOFFSET_10X] = 1;
        baos.write(header);
        // No sparse header follows, stream ends immediately

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            TarArchiveEntry readEntry = tais.getNextTarEntry();
            assertNull(readEntry);
        }
    }

    @Test
    public void testIsEOFRecordAndReadRecord() throws IOException {
        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[512]))) {
            assertTrue(tais.isEOFRecord(null));
            assertTrue(tais.isEOFRecord(new byte[512]));

            byte[] nonZero = new byte[512];
            nonZero[0] = 1;
            assertFalse(tais.isEOFRecord(nonZero));

            byte[] record = tais.readRecord();
            assertNotNull(record);
            assertEquals(512, record.length);

            byte[] eofRecord = tais.readRecord();
            assertNull(eofRecord);
        }
    }

    @Test
    public void testTryToConsumeSecondEOFRecord_nonMarkSupportedStream() throws IOException {
        byte[] data = new byte[1024];
        InputStream nonMarkStream = new FilterInputStream(new ByteArrayInputStream(data)) {
            @Override
            public boolean markSupported() {
                return false;
            }
        };

        try (TarArchiveInputStream tais = new TarArchiveInputStream(nonMarkStream)) {
            assertNull(tais.getNextTarEntry());
            assertTrue(tais.isAtEOF());
        }
    }

    @Test
    public void testConsumeRemainderOfLastBlock() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        byte[] header = new byte[512];
        entry.writeEntryHeader(header);
        baos.write(header);
        baos.write(new byte[512]); // 1 EOF record -> total 1024 bytes read so far
        baos.write(new byte[10240 - 1024]); // Rest of 10240-byte block

        try (TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), 10240, 512)) {
            TarArchiveEntry e = tais.getNextTarEntry();
            assertNotNull(e);
            assertNull(tais.getNextTarEntry());
            assertEquals(10240, tais.getBytesRead());
        }
    }

    @Test
    public void testAvailable_maxIntegerHandling() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0])) {
            @Override
            public TarArchiveEntry getCurrentEntry() {
                TarArchiveEntry entry = new TarArchiveEntry("large");
                entry.setSize(Long.MAX_VALUE);
                return entry;
            }
        };
        TarArchiveEntry fakeEntry = new TarArchiveEntry("large");
        fakeEntry.setSize(Long.MAX_VALUE);
        tais.setCurrentEntry(fakeEntry);

        try {
            java.lang.reflect.Field entrySizeField = TarArchiveInputStream.class.getDeclaredField("entrySize");
            entrySizeField.setAccessible(true);
            entrySizeField.setLong(tais, Long.MAX_VALUE);
            assertEquals(Integer.MAX_VALUE, tais.available());
        } catch (ReflectiveOperationException e) {
            fail("Reflection failed: " + e.getMessage());
        } finally {
            tais.close();
        }
    }

    @Test
    public void testClose() throws IOException {
        final boolean[] closed = new boolean[]{false};
        InputStream is = new ByteArrayInputStream(new byte[0]) {
            @Override
            public void close() throws IOException {
                closed[0] = true;
                super.close();
            }
        };
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.close();
        assertTrue(closed[0]);
    }
}
