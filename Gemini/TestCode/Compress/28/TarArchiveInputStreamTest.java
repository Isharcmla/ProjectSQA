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
import java.util.Date;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    @Test
    public void testConstructors_allVariants_initializeCorrectly() throws IOException {
        byte[] dummy = new byte[0];

        TarArchiveInputStream tais1 = new TarArchiveInputStream(new ByteArrayInputStream(dummy));
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais1.getRecordSize());
        tais1.close();

        TarArchiveInputStream tais2 = new TarArchiveInputStream(new ByteArrayInputStream(dummy), "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais2.getRecordSize());
        tais2.close();

        TarArchiveInputStream tais3 = new TarArchiveInputStream(new ByteArrayInputStream(dummy), 1024);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais3.getRecordSize());
        tais3.close();

        TarArchiveInputStream tais4 = new TarArchiveInputStream(new ByteArrayInputStream(dummy), 1024, "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais4.getRecordSize());
        tais4.close();

        TarArchiveInputStream tais5 = new TarArchiveInputStream(new ByteArrayInputStream(dummy), 1024, 512);
        assertEquals(512, tais5.getRecordSize());
        tais5.close();

        TarArchiveInputStream tais6 = new TarArchiveInputStream(new ByteArrayInputStream(dummy), 1024, 512, "UTF-8");
        assertEquals(512, tais6.getRecordSize());
        tais6.close();
    }

    @Test
    public void testClose_closesUnderlyingStream() throws IOException {
        final boolean[] closed = new boolean[] { false };
        InputStream in = new InputStream() {
            @Override
            public int read() {
                return -1;
            }

            @Override
            public void close() {
                closed[0] = true;
            }
        };

        TarArchiveInputStream tais = new TarArchiveInputStream(in);
        tais.close();
        assertTrue(closed[0]);
    }

    @Test(expected = IllegalStateException.class)
    public void testRead_withoutCurrentEntry_throwsIllegalStateException() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[1024]));
        tais.read(new byte[10], 0, 10);
    }

    @Test
    public void testReadAndAvailable_normalEntry_readsCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] content = "Hello World Tar Entry".getBytes(CharsetNames.UTF_8);
        entry.setSize(content.length);
        tos.putArchiveEntry(entry);
        tos.write(content);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        assertNotNull(readEntry);
        assertEquals("test.txt", readEntry.getName());
        assertEquals(content.length, tais.available());

        byte[] buf = new byte[5];
        int bytesRead = tais.read(buf, 0, 5);
        assertEquals(5, bytesRead);
        assertEquals(content.length - 5, tais.available());
        assertEquals("Hello", new String(buf, 0, 5, CharsetNames.UTF_8));

        byte[] remaining = new byte[content.length];
        int remRead = tais.read(remaining, 0, remaining.length);
        assertEquals(content.length - 5, remRead);
        assertEquals(0, tais.available());

        int eofRead = tais.read(buf, 0, 5);
        assertEquals(-1, eofRead);

        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testAvailable_overflowLongSize_returnsIntegerMaxValue() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry largeEntry = new TarArchiveEntry("large");
        largeEntry.setSize(Long.MAX_VALUE);
        tais.setCurrentEntry(largeEntry);

        // entryOffset is 0, entrySize is Long.MAX_VALUE, so size - offset > Integer.MAX_VALUE
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
    public void testSkip_partialAndFull_skipsCorrectBytes() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("skip.txt");
        byte[] content = "0123456789ABCDEF".getBytes(CharsetNames.UTF_8);
        entry.setSize(content.length);
        tos.putArchiveEntry(entry);
        tos.write(content);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        tais.getNextTarEntry();

        long skipped = tais.skip(4);
        assertEquals(4, skipped);

        byte[] buf = new byte[4];
        int read = tais.read(buf, 0, 4);
        assertEquals(4, read);
        assertEquals("4567", new String(buf, 0, 4, CharsetNames.UTF_8));

        long skippedRest = tais.skip(100);
        assertEquals(content.length - 8, skippedRest);
        assertEquals(0, tais.available());

        tais.close();
    }

    @Test
    public void testReset_doesNothingWithoutException() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tais.reset();
        tais.close();
    }

    @Test
    public void testGetNextEntry_returnsSameAsGetNextTarEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("entry1.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ArchiveEntry ae = tais.getNextEntry();
        assertNotNull(ae);
        assertEquals("entry1.txt", ae.getName());
        assertNull(tais.getNextEntry());
        tais.close();
    }

    @Test
    public void testSkipRecordPadding_multipleEntriesWithUnalignedSizes() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry1 = new TarArchiveEntry("file1.bin");
        byte[] data1 = new byte[7]; // Not 512 aligned
        entry1.setSize(data1.length);
        tos.putArchiveEntry(entry1);
        tos.write(data1);
        tos.closeArchiveEntry();

        TarArchiveEntry entry2 = new TarArchiveEntry("file2.bin");
        byte[] data2 = new byte[11];
        entry2.setSize(data2.length);
        tos.putArchiveEntry(entry2);
        tos.write(data2);
        tos.closeArchiveEntry();

        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry e1 = tais.getNextTarEntry();
        assertNotNull(e1);
        assertEquals("file1.bin", e1.getName());

        // Skip to next without reading body of e1
        TarArchiveEntry e2 = tais.getNextTarEntry();
        assertNotNull(e2);
        assertEquals("file2.bin", e2.getName());

        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testGNULongNameEntry_decodesLongNameProperly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        String longName = "a/very/long/path/name/that/exceeds/the/normal/tar/limit/of/one/hundred/characters/so/it/uses/gnu/long/name/feature/test.txt";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        byte[] data = "long name content".getBytes(CharsetNames.UTF_8);
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        assertNotNull(readEntry);
        assertEquals(longName, readEntry.getName());
        tais.close();
    }

    @Test
    public void testGNULongLinkEntry_decodesLongLinkProperly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        String longLinkName = "target/of/a/very/long/symbolic/or/hard/link/that/exceeds/the/standard/one/hundred/characters/limit/in/tar/format";
        TarArchiveEntry entry = new TarArchiveEntry("symlink", TarConstants.LF_SYMLINK);
        entry.setLinkName(longLinkName);
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        assertNotNull(readEntry);
        assertEquals("symlink", readEntry.getName());
        assertEquals(longLinkName, readEntry.getLinkName());
        tais.close();
    }

    @Test
    public void testGNULongNameData_malformedNoFollowingEntry_returnsNull() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);

        TarArchiveEntry longNameEntry = new TarArchiveEntry(TarConstants.GNU_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] nameBytes = "some_long_name\0".getBytes(CharsetNames.UTF_8);
        longNameEntry.setSize(nameBytes.length);
        tos.putArchiveEntry(longNameEntry);
        tos.write(nameBytes);
        tos.closeArchiveEntry();
        tos.close(); // Closed immediately without actual entry following

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNull(entry);
        tais.close();
    }

    @Test
    public void testGNULongLinkData_malformedNoFollowingEntry_returnsNull() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);

        TarArchiveEntry longLinkEntry = new TarArchiveEntry(TarConstants.GNU_LONGLINK, TarConstants.LF_GNUTYPE_LONGLINK);
        byte[] linkBytes = "some_long_link\0".getBytes(CharsetNames.UTF_8);
        longLinkEntry.setSize(linkBytes.length);
        tos.putArchiveEntry(longLinkEntry);
        tos.write(linkBytes);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNull(entry);
        tais.close();
    }

    @Test
    public void testPaxHeaders_appliedToCurrentEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);

        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        entry.setModTime(new Date(123456789000L));
        entry.setUserId(1001);
        entry.setGroupId(1002);
        entry.setUserName("testuser");
        entry.setGroupName("testgroup");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        assertNotNull(readEntry);
        assertEquals("short.txt", readEntry.getName());
        assertEquals(1001, readEntry.getUserId());
        assertEquals(1002, readEntry.getGroupId());
        assertEquals("testuser", readEntry.getUserName());
        assertEquals("testgroup", readEntry.getGroupName());
        tais.close();
    }

    @Test
    public void testPaxHeaders_allFieldsParsedAndApplied() throws IOException {
        String paxContent = "25 path=new/custom/path\n"
                + "22 linkpath=link/target\n"
                + "11 gid=2001\n"
                + "18 gname=customgroup\n"
                + "11 uid=3001\n"
                + "17 uname=customuser\n"
                + "10 size=15\n"
                + "20 mtime=1234567.890\n"
                + "20 SCHILY.devminor=12\n"
                + "20 SCHILY.devmajor=34\n";

        byte[] paxBytes = paxContent.getBytes(CharsetNames.UTF_8);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(baos);

        TarArchiveEntry paxEntry = new TarArchiveEntry("PaxHeader/test", TarConstants.LF_PAX_EXTENDED_HEADER);
        paxEntry.setSize(paxBytes.length);
        tos.putArchiveEntry(paxEntry);
        tos.write(paxBytes);
        tos.closeArchiveEntry();

        TarArchiveEntry fileEntry = new TarArchiveEntry("orig_name.txt");
        fileEntry.setSize(15);
        tos.putArchiveEntry(fileEntry);
        tos.write("123456789012345".getBytes(CharsetNames.UTF_8));
        tos.closeArchiveEntry();
        tos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry actualEntry = tais.getNextTarEntry();

        assertNotNull(actualEntry);
        assertEquals("new/custom/path", actualEntry.getName());
        assertEquals("link/target", actualEntry.getLinkName());
        assertEquals(2001, actualEntry.getGroupId());
        assertEquals("customgroup", actualEntry.getGroupName());
        assertEquals(3001, actualEntry.getUserId());
        assertEquals("customuser", actualEntry.getUserName());
        assertEquals(15, actualEntry.getSize());
        assertEquals(1234567890L, actualEntry.getModTime().getTime());
        assertEquals(12, actualEntry.getDevMinor());
        assertEquals(34, actualEntry.getDevMajor());

        tais.close();
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeaders_truncatedData_throwsIOException() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        String truncatedPax = "50 path=incomplete";
        tais.parsePaxHeaders(new ByteArrayInputStream(truncatedPax.getBytes(CharsetNames.UTF_8)));
        tais.close();
    }

    @Test
    public void testParsePaxHeaders_emptyStream_returnsEmptyMap() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tais.parsePaxHeaders(new ByteArrayInputStream(new byte[0]));
        assertTrue(headers.isEmpty());
        tais.close();
    }

    @Test(expected = IOException.class)
    public void testGetNextTarEntry_corruptedHeader_throwsIOException() throws IOException {
        byte[] corrupted = new byte[512];
        Arrays.fill(corrupted, (byte) 'A'); // Invalid octal fields

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(corrupted));
        try {
            tais.getNextTarEntry();
        } finally {
            tais.close();
        }
    }

    @Test
    public void testGetLongNameData_withTrailingNulls_trimsNulls() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        ByteArrayOutputStream entryStream = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(entryStream);
        TarArchiveEntry dummy = new TarArchiveEntry("test.txt");
        dummy.setSize(0);
        tos.putArchiveEntry(dummy);
        tos.closeArchiveEntry();
        tos.close();

        byte[] nameWithNulls = "custom_long_name\0\0\0".getBytes(CharsetNames.UTF_8);

        ByteArrayOutputStream combined = new ByteArrayOutputStream();
        combined.write(nameWithNulls);
        combined.write(entryStream.toByteArray());

        TarArchiveInputStream testStream = new TarArchiveInputStream(new ByteArrayInputStream(combined.toByteArray()));
        TarArchiveEntry longEntry = new TarArchiveEntry("long", TarConstants.LF_GNUTYPE_LONGNAME);
        longEntry.setSize(nameWithNulls.length);
        testStream.setCurrentEntry(longEntry);

        java.lang.reflect.Field entrySizeField = TarArchiveInputStream.class.getDeclaredField("entrySize");
        entrySizeField.setAccessible(true);
        entrySizeField.setLong(testStream, nameWithNulls.length);

        byte[] result = testStream.getLongNameData();
        assertEquals("custom_long_name", new String(result, CharsetNames.UTF_8));
        testStream.close();
        tais.close();
    }

    @Test
    public void testIsEOFRecord_variousInputs() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        assertTrue(tais.isEOFRecord(null));
        assertTrue(tais.isEOFRecord(new byte[512]));

        byte[] nonEof = new byte[512];
        nonEof[10] = 1;
        assertFalse(tais.isEOFRecord(nonEof));

        tais.close();
    }

    @Test
    public void testReadRecord_partialReadReturnsNull() throws IOException {
        byte[] shortData = new byte[200];
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(shortData));
        assertNull(tais.readRecord());
        tais.close();
    }

    @Test
    public void testReadRecord_fullRecordReturnsBytes() throws IOException {
        byte[] fullRecord = new byte[512];
        fullRecord[0] = 42;
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(fullRecord));
        byte[] read = tais.readRecord();
        assertNotNull(read);
        assertArrayEquals(fullRecord, read);
        tais.close();
    }

    @Test
    public void testGettersAndSetters_currentEntryAndEOF() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        assertNull(tais.getCurrentEntry());
        assertFalse(tais.isAtEOF());

        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        tais.setCurrentEntry(entry);
        assertEquals(entry, tais.getCurrentEntry());

        tais.setAtEOF(true);
        assertTrue(tais.isAtEOF());

        tais.close();
    }

    @Test
    public void testCanReadEntryData_variousEntries() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        assertFalse(tais.canReadEntryData(null));

        ArchiveEntry dummyArchiveEntry = new ArchiveEntry() {
            @Override
            public String getName() {
                return "dummy";
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public boolean isDirectory() {
                return false;
            }

            @Override
            public Date getLastModifiedDate() {
                return new Date();
            }
        };
        assertFalse(tais.canReadEntryData(dummyArchiveEntry));

        TarArchiveEntry normalEntry = new TarArchiveEntry("normal.txt");
        assertTrue(tais.canReadEntryData(normalEntry));

        TarArchiveEntry sparseEntry = new TarArchiveEntry("sparse.txt", TarConstants.LF_GNUTYPE_SPARSE);
        assertFalse(tais.canReadEntryData(sparseEntry));

        tais.close();
    }

    @Test
    public void testReadGNUSparse_withExtendedSparseEntries() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Sparse header 1
        byte[] header1 = new byte[512];
        System.arraycopy("sparse_file.bin".getBytes(CharsetNames.UTF_8), 0, header1, 0, 15);
        header1[156] = TarConstants.LF_GNUTYPE_SPARSE; // type
        header1[504] = 1; // isExtended = true
        // Set magic
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(CharsetNames.UTF_8), 0, header1, TarConstants.MAGIC_OFFSET, 6);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(CharsetNames.UTF_8), 0, header1, TarConstants.VERSION_OFFSET, 2);
        // Compute checksum
        long chk = computeCheckSum(header1);
        formatOctal(chk, header1, 148, 8);
        baos.write(header1);

        // Sparse extended header 2
        byte[] header2 = new byte[512];
        header2[504] = 0; // isExtended = false
        baos.write(header2);

        // Two EOF blocks
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        assertTrue(entry.isGNUSparse());

        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testReadGNUSparse_sparseTruncated_setsCurrentEntryNull() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] header1 = new byte[512];
        System.arraycopy("sparse_trunc.bin".getBytes(CharsetNames.UTF_8), 0, header1, 0, 16);
        header1[156] = TarConstants.LF_GNUTYPE_SPARSE;
        header1[504] = 1; // isExtended = true
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(CharsetNames.UTF_8), 0, header1, TarConstants.MAGIC_OFFSET, 6);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(CharsetNames.UTF_8), 0, header1, TarConstants.VERSION_OFFSET, 2);
        long chk = computeCheckSum(header1);
        formatOctal(chk, header1, 148, 8);
        baos.write(header1);
        // Truncated: no extended sparse header following

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNull(entry);
        tais.close();
    }

    @Test
    public void testTryToConsumeSecondEOFRecord_withoutMarkSupport() throws IOException {
        byte[] twoEOFRecords = new byte[1024]; // 2 x 512 EOF records
        InputStream nonMarkIn = new FilterInputStream(new ByteArrayInputStream(twoEOFRecords)) {
            @Override
            public boolean markSupported() {
                return false;
            }
        };

        TarArchiveInputStream tais = new TarArchiveInputStream(nonMarkIn);
        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testMatches_allMagicAndVersionCombinations() {
        // Less than required length
        assertFalse(TarArchiveInputStream.matches(new byte[10], 10));

        byte[] sig = new byte[512];

        // Zero buffer
        assertFalse(TarArchiveInputStream.matches(sig, 512));

        // POSIX: magic "ustar\0", version "00"
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(CharsetNames.UTF_8), 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(CharsetNames.UTF_8), 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, 512));

        // GNU with space version: magic "ustar ", version " \0"
        Arrays.fill(sig, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(CharsetNames.UTF_8), 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(CharsetNames.UTF_8), 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, 512));

        // GNU with zero version: magic "ustar ", version "00"
        Arrays.fill(sig, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(CharsetNames.UTF_8), 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(CharsetNames.UTF_8), 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, 512));

        // ANT: magic "ustar\0", version "\0\0"
        Arrays.fill(sig, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(CharsetNames.UTF_8), 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(CharsetNames.UTF_8), 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, 512));

        // Unknown magic
        Arrays.fill(sig, (byte) 0);
        System.arraycopy("unknown".getBytes(CharsetNames.UTF_8), 0, sig, TarConstants.MAGIC_OFFSET, 6);
        assertFalse(TarArchiveInputStream.matches(sig, 512));
    }

    private static long computeCheckSum(byte[] buf) {
        long sum = 0;
        for (int i = 0; i < buf.length; ++i) {
            if (148 <= i && i < 148 + 8) {
                sum += ' ';
            } else {
                sum += 0xff & buf[i];
            }
        }
        return sum;
    }

    private static void formatOctal(long val, byte[] out, int offset, int length) {
        int idx = length - 1;
        out[offset + idx] = 0;
        idx--;
        out[offset + idx] = (byte) ' ';
        idx--;
        if (val == 0) {
            out[offset + idx] = (byte) '0';
            idx--;
        } else {
            for (long v = val; idx >= 0 && v > 0; idx--) {
                out[offset + idx] = (byte) ((byte) '0' + (byte) (v & 7));
                v >>= 3;
            }
        }
        for (; idx >= 0; idx--) {
            out[offset + idx] = (byte) '0';
        }
    }
}
