package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.EnumSet;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;

public class ZipArchiveOutputStreamTest {

    private File tempFile;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("zaostest", ".zip");
        tempFile.deleteOnExit();
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorOutputStream_isSeekableFalse() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        assertFalse(zos.isSeekable());
        zos.finish();
        zos.close();
    }

    @Test
    public void testConstructorFile_isSeekableTrue() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(tempFile);
        assertTrue(zos.isSeekable());
        zos.finish();
        zos.close();
    }

    @Test
    public void testConstructorSeekableByteChannel_isSeekableTrue() throws IOException {
        SeekableByteChannel channel = Files.newByteChannel(tempFile.toPath(),
                EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE,
                        StandardOpenOption.READ, StandardOpenOption.TRUNCATE_EXISTING));
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(channel);
        assertTrue(zos.isSeekable());
        zos.finish();
        zos.close();
    }

    // ---------- Encoding tests ----------

    @Test
    public void testSetAndGetEncoding_default() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        assertEquals("UTF8", zos.getEncoding());
        zos.setEncoding("UTF-8");
        assertEquals("UTF-8", zos.getEncoding());
        zos.finish();
        zos.close();
    }

    @Test
    public void testSetEncoding_null() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setEncoding(null);
        assertNull(zos.getEncoding());
        zos.finish();
        zos.close();
    }

    // ---------- Flag setter tests ----------

    @Test
    public void testSetUseLanguageEncodingFlag() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setUseLanguageEncodingFlag(true);
        zos.setUseLanguageEncodingFlag(false);
        zos.finish();
        zos.close();
    }

    @Test
    public void testSetCreateUnicodeExtraFields() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER);
        zos.finish();
        zos.close();
    }

    @Test
    public void testSetFallbackToUTF8() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setFallbackToUTF8(true);
        zos.finish();
        zos.close();
    }

    @Test
    public void testSetUseZip64_setsMode_noExceptionOnSmallArchive() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setUseZip64(Zip64Mode.Always);
        ZipArchiveEntry entry = new ZipArchiveEntry("a.txt");
        zos.putArchiveEntry(entry);
        zos.write("hello".getBytes());
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();
    }

    @Test
    public void testSetComment() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setComment("my comment");
        zos.finish();
        zos.close();
    }

    // ---------- Level / Method setter tests ----------

    @Test
    public void testSetLevel_validLevel() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setLevel(java.util.zip.Deflater.BEST_COMPRESSION);
        zos.finish();
        zos.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevel_invalidLevel_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        try {
            zos.setLevel(100);
        } finally {
            zos.close();
        }
    }

    @Test
    public void testSetMethod() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setMethod(ZipArchiveOutputStream.STORED);
        ZipArchiveEntry entry = new ZipArchiveEntry("a.txt");
        byte[] data = "hi".getBytes();
        entry.setSize(data.length);
        CRC32 crc = new CRC32();
        crc.update(data);
        entry.setCrc(crc.getValue());
        zos.putArchiveEntry(entry);
        assertEquals(ZipArchiveOutputStream.STORED, entry.getMethod());
        zos.write(data);
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();
    }

    // ---------- canWriteEntryData tests ----------

    @Test
    public void testCanWriteEntryData_zipArchiveEntryDeflated_true() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("a.txt");
        entry.setMethod(ZipArchiveEntry.DEFLATED);
        assertTrue(zos.canWriteEntryData(entry));
        zos.finish();
        zos.close();
    }

    @Test
    public void testCanWriteEntryData_nonZipArchiveEntry_false() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ArchiveEntry fake = new ArchiveEntry() {
            @Override
            public String getName() {
                return "fake";
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
        assertFalse(zos.canWriteEntryData(fake));
        zos.finish();
        zos.close();
    }

    // ---------- write tests ----------

    @Test(expected = IllegalStateException.class)
    public void testWrite_noCurrentEntry_throwsIllegalStateException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        try {
            zos.write("data".getBytes(), 0, 4);
        } finally {
            zos.destroy();
        }
    }

    // ---------- putArchiveEntry / closeArchiveEntry tests ----------

    @Test
    public void testPutArchiveEntry_and_write_deflated_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("deflated.txt");
        zos.putArchiveEntry(entry);
        zos.write("Hello Deflated World".getBytes());
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();

        byte[] zipBytes = baos.toByteArray();
        ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(zipBytes));
        ZipEntry ze = zis.getNextEntry();
        assertNotNull(ze);
        assertEquals("deflated.txt", ze.getName());
        zis.close();
    }

    @Test
    public void testPutArchiveEntry_stored_withSizeAndCrc_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
        entry.setMethod(ZipArchiveEntry.STORED);
        byte[] data = "Stored Content".getBytes();
        entry.setSize(data.length);
        CRC32 crc = new CRC32();
        crc.update(data);
        entry.setCrc(crc.getValue());
        zos.putArchiveEntry(entry);
        zos.write(data);
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();

        byte[] zipBytes = baos.toByteArray();
        ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(zipBytes));
        ZipEntry ze = zis.getNextEntry();
        assertNotNull(ze);
        assertEquals("stored.txt", ze.getName());
        zis.close();
    }

    @Test(expected = java.util.zip.ZipException.class)
    public void testPutArchiveEntry_stored_missingSize_throwsZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("stored_missing.txt");
        entry.setMethod(ZipArchiveEntry.STORED);
        try {
            zos.putArchiveEntry(entry);
        } finally {
            zos.destroy();
        }
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_noCurrentEntry_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        try {
            zos.closeArchiveEntry();
        } finally {
            zos.destroy();
        }
    }

    // ---------- finish tests ----------

    @Test(expected = IOException.class)
    public void testFinish_calledTwice_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("x.txt");
        zos.putArchiveEntry(entry);
        zos.write("abc".getBytes());
        zos.closeArchiveEntry();
        zos.finish();
        try {
            zos.finish();
        } finally {
            zos.destroy();
        }
    }

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("unclosed.txt");
        zos.putArchiveEntry(entry);
        try {
            zos.finish();
        } finally {
            zos.destroy();
        }
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterFinished_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.finish();
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("late.txt");
            zos.putArchiveEntry(entry);
        } finally {
            zos.destroy();
        }
    }

    // ---------- addRawArchiveEntry tests ----------

    @Test
    public void testAddRawArchiveEntry_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);

        ZipArchiveEntry rawEntry = new ZipArchiveEntry("raw.txt");
        rawEntry.setMethod(ZipArchiveEntry.STORED);
        byte[] data = "Raw Entry Data".getBytes();
        rawEntry.setSize(data.length);
        rawEntry.setCompressedSize(data.length);
        CRC32 crc = new CRC32();
        crc.update(data);
        rawEntry.setCrc(crc.getValue());

        ByteArrayInputStream rawStream = new ByteArrayInputStream(data);
        zos.addRawArchiveEntry(rawEntry, rawStream);
        zos.finish();
        zos.close();

        byte[] zipBytes = baos.toByteArray();
        ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(zipBytes));
        ZipEntry ze = zis.getNextEntry();
        assertNotNull(ze);
        assertEquals("raw.txt", ze.getName());
        zis.close();
    }

    // ---------- close / flush tests ----------

    @Test
    public void testClose_finishesArchive() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("closetest.txt");
        zos.putArchiveEntry(entry);
        zos.write("close test".getBytes());
        zos.closeArchiveEntry();
        zos.close();
        // closing again via finish should now fail since already finished
        try {
            zos.finish();
            fail("Expected IOException since already finished");
        } catch (IOException expected) {
            // expected
        }
    }

    @Test
    public void testFlush_noException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.flush();
        zos.finish();
        zos.close();
    }

    @Test
    public void testFlush_withFileConstructor_noException() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(tempFile);
        zos.flush();
        zos.finish();
        zos.close();
    }

    // ---------- createArchiveEntry tests ----------

    @Test
    public void testCreateArchiveEntry_returnsZipArchiveEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        File tmp = File.createTempFile("entrytest", ".txt");
        tmp.deleteOnExit();
        try {
            ArchiveEntry ae = zos.createArchiveEntry(tmp, "entryName.txt");
            assertNotNull(ae);
            assertTrue(ae instanceof ZipArchiveEntry);
            assertEquals("entryName.txt", ae.getName());
        } finally {
            tmp.delete();
            zos.finish();
            zos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_afterFinished_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.finish();
        try {
            zos.createArchiveEntry(tempFile, "name.txt");
        } finally {
            zos.destroy();
        }
    }

    // ---------- Full round-trip test with multiple entries ----------

    @Test
    public void testFullArchiveRoundTrip_multipleEntries_readableByJdkZipInputStream() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);

        ZipArchiveEntry entry1 = new ZipArchiveEntry("first.txt");
        zos.putArchiveEntry(entry1);
        zos.write("First Entry Content".getBytes());
        zos.closeArchiveEntry();

        ZipArchiveEntry entry2 = new ZipArchiveEntry("second.txt");
        entry2.setMethod(ZipArchiveEntry.STORED);
        byte[] data2 = "Second Entry Content".getBytes();
        entry2.setSize(data2.length);
        CRC32 crc2 = new CRC32();
        crc2.update(data2);
        entry2.setCrc(crc2.getValue());
        zos.putArchiveEntry(entry2);
        zos.write(data2);
        zos.closeArchiveEntry();

        zos.finish();
        zos.close();

        byte[] zipBytes = baos.toByteArray();
        ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(zipBytes));
        int count = 0;
        ZipEntry ze;
        while ((ze = zis.getNextEntry()) != null) {
            count++;
            assertNotNull(ze.getName());
        }
        zis.close();
        assertEquals(2, count);
    }

    // ---------- Using File-based ZipArchiveOutputStream (seekable) full flow ----------

    @Test
    public void testFileBasedStream_putWriteCloseFinish_success() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(tempFile);
        ZipArchiveEntry entry = new ZipArchiveEntry("filebased.txt");
        zos.putArchiveEntry(entry);
        zos.write("File based content".getBytes());
        zos.closeArchiveEntry();
        zos.finish();
        zos.close();

        assertTrue(tempFile.exists());
        assertTrue(tempFile.length() > 0);
    }
}
