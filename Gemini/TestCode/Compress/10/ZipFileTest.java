package org.apache.commons.compress.archivers.zip;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

public class ZipFileTest {

    private List<File> tempFiles;

    @Before
    public void setUp() {
        tempFiles = new ArrayList<File>();
    }

    @After
    public void tearDown() {
        for (File f : tempFiles) {
            if (f.exists()) {
                f.delete();
            }
        }
    }

    private File createTempFile() throws IOException {
        File file = File.createTempFile("zipfile_test", ".zip");
        file.deleteOnExit();
        tempFiles.add(file);
        return file;
    }

    private File createStandardZipFile() throws IOException {
        File file = createTempFile();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(file);
        try {
            ZipArchiveEntry entry1 = new ZipArchiveEntry("stored.txt");
            entry1.setMethod(ZipArchiveEntry.STORED);
            byte[] data1 = "Stored Content".getBytes(StandardCharsets.UTF_8);
            entry1.setSize(data1.length);
            entry1.setCompressedSize(data1.length);
            CRC32 crc1 = new CRC32();
            crc1.update(data1);
            entry1.setCrc(crc1.getValue());
            entry1.setComment("Stored comment");
            zaos.putArchiveEntry(entry1);
            zaos.write(data1);
            zaos.closeArchiveEntry();

            ZipArchiveEntry entry2 = new ZipArchiveEntry("deflated.txt");
            entry2.setMethod(ZipArchiveEntry.DEFLATED);
            entry2.setComment("Deflated comment");
            zaos.putArchiveEntry(entry2);
            byte[] data2 = "Deflated Content Deflated Content".getBytes(StandardCharsets.UTF_8);
            zaos.write(data2);
            zaos.closeArchiveEntry();
        } finally {
            zaos.close();
        }
        return file;
    }

    @Test
    public void testConstructor_FileOnly_Success() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        try {
            Assert.assertEquals(ZipEncodingHelper.UTF8, zf.getEncoding());
            Assert.assertNotNull(zf.getEntry("stored.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testConstructor_StringNameOnly_Success() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file.getAbsolutePath());
        try {
            Assert.assertEquals(ZipEncodingHelper.UTF8, zf.getEncoding());
            Assert.assertNotNull(zf.getEntry("deflated.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testConstructor_StringNameAndEncoding_Success() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file.getAbsolutePath(), "UTF-8");
        try {
            Assert.assertEquals("UTF-8", zf.getEncoding());
            Assert.assertNotNull(zf.getEntry("stored.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testConstructor_FileAndEncoding_Success() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file, "UTF-8");
        try {
            Assert.assertEquals("UTF-8", zf.getEncoding());
            Assert.assertNotNull(zf.getEntry("deflated.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testConstructor_FileEncodingAndUnicodeFlag_Success() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file, "UTF-8", false);
        try {
            Assert.assertEquals("UTF-8", zf.getEncoding());
            Assert.assertNotNull(zf.getEntry("stored.txt"));
        } finally {
            zf.close();
        }
    }

    @Test(expected = IOException.class)
    public void testConstructor_NonExistentFile_ThrowsIOException() throws IOException {
        File nonExistent = new File("non_existent_zip_archive_" + System.currentTimeMillis() + ".zip");
        new ZipFile(nonExistent);
    }

    @Test(expected = ZipException.class)
    public void testConstructor_InvalidZipFile_ThrowsZipException() throws IOException {
        File file = createTempFile();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        fos.close();

        new ZipFile(file);
    }

    @Test(expected = IOException.class)
    public void testConstructor_EmptyCentralDirectoryWithLFH_ThrowsIOException() throws IOException {
        File file = createTempFile();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(ZipArchiveOutputStream.LFH_SIG);
        for (int i = 0; i < 30; i++) {
            fos.write(0);
        }
        fos.write(ZipArchiveOutputStream.EOCD_SIG);
        for (int i = 0; i < 12; i++) {
            fos.write(0);
        }
        fos.write(new byte[]{0, 0, 0, 0});
        fos.write(new byte[]{0, 0});
        fos.close();

        new ZipFile(file);
    }

    @Test
    public void testGetEncoding_NullEncoding_ReturnsNull() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file, null);
        try {
            Assert.assertNull(zf.getEncoding());
        } finally {
            zf.close();
        }
    }

    @Test
    public void testCloseQuietly_NormalAndNull() throws IOException {
        ZipFile.closeQuietly(null);

        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        ZipFile.closeQuietly(zf);
    }

    @Test
    public void testGetEntries_ReturnsAllEntries() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        try {
            Enumeration<ZipArchiveEntry> entries = zf.getEntries();
            int count = 0;
            while (entries.hasMoreElements()) {
                ZipArchiveEntry entry = entries.nextElement();
                Assert.assertNotNull(entry);
                count++;
            }
            Assert.assertEquals(2, count);
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetEntriesInPhysicalOrder() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        try {
            Enumeration<ZipArchiveEntry> entries = zf.getEntriesInPhysicalOrder();
            List<String> names = new ArrayList<String>();
            while (entries.hasMoreElements()) {
                names.add(entries.nextElement().getName());
            }
            Assert.assertEquals(2, names.size());
            Assert.assertEquals("stored.txt", names.get(0));
            Assert.assertEquals("deflated.txt", names.get(1));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetEntry_ExistingAndNonExisting() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        try {
            ZipArchiveEntry existing = zf.getEntry("stored.txt");
            Assert.assertNotNull(existing);
            Assert.assertEquals("stored.txt", existing.getName());
            Assert.assertEquals("Stored comment", existing.getComment());

            ZipArchiveEntry nonExisting = zf.getEntry("does_not_exist.txt");
            Assert.assertNull(nonExisting);
        } finally {
            zf.close();
        }
    }

    @Test
    public void testCanReadEntryData() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        try {
            ZipArchiveEntry stored = zf.getEntry("stored.txt");
            Assert.assertTrue(zf.canReadEntryData(stored));

            ZipArchiveEntry deflated = zf.getEntry("deflated.txt");
            Assert.assertTrue(zf.canReadEntryData(deflated));

            ZipArchiveEntry unhandled = new ZipArchiveEntry("unsupported");
            unhandled.setMethod(ZipMethod.BZIP2.getCode());
            Assert.assertFalse(zf.canReadEntryData(unhandled));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetInputStream_StoredEntry_ReadOperations() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        try {
            ZipArchiveEntry entry = zf.getEntry("stored.txt");
            InputStream is = zf.getInputStream(entry);
            Assert.assertNotNull(is);

            int firstByte = is.read();
            Assert.assertEquals('S', firstByte);

            byte[] buf = new byte[100];
            int readCount = is.read(buf, 0, 0);
            Assert.assertEquals(0, readCount);

            readCount = is.read(buf, 0, 5);
            Assert.assertEquals(5, readCount);
            Assert.assertEquals("tored", new String(buf, 0, 5, StandardCharsets.UTF_8));

            int remaining = is.read(buf, 0, buf.length);
            Assert.assertTrue(remaining > 0);

            Assert.assertEquals(-1, is.read());
            Assert.assertEquals(-1, is.read(buf, 0, buf.length));

            is.close();
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetInputStream_DeflatedEntry_ReadOperations() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        try {
            ZipArchiveEntry entry = zf.getEntry("deflated.txt");
            InputStream is = zf.getInputStream(entry);
            Assert.assertNotNull(is);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[8];
            int len;
            while ((len = is.read(buf)) != -1) {
                baos.write(buf, 0, len);
            }
            Assert.assertEquals("Deflated Content Deflated Content", baos.toString(StandardCharsets.UTF_8.name()));
            is.close();
        } finally {
            zf.close();
        }
    }

    @Test
    public void testGetInputStream_EntryNotInZip_ReturnsNull() throws IOException {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("foreign.txt");
            InputStream is = zf.getInputStream(entry);
            Assert.assertNull(is);
        } finally {
            zf.close();
        }
    }

    @Test(expected = ZipException.class)
    public void testGetInputStream_UnsupportedCompressionMethod_ThrowsZipException() throws IOException {
        File file = createTempFile();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(file);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveEntry.STORED);
        entry.setSize(0);
        entry.setCompressedSize(0);
        entry.setCrc(0);
        zaos.putArchiveEntry(entry);
        zaos.closeArchiveEntry();
        zaos.close();

        ZipFile zf = new ZipFile(file);
        try {
            ZipArchiveEntry testEntry = zf.getEntry("test.txt");
            testEntry.setMethod(99);
            zf.getInputStream(testEntry);
        } finally {
            zf.close();
        }
    }

    @Test
    public void testZip64Archive_ParsingAndReading() throws IOException {
        File file = createTempFile();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(file);
        zaos.setUseZip64(Zip64Mode.Always);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("zip64_file.txt");
            entry.setMethod(ZipArchiveEntry.DEFLATED);
            zaos.putArchiveEntry(entry);
            zaos.write("Zip64 content payload".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();
        } finally {
            zaos.close();
        }

        ZipFile zf = new ZipFile(file);
        try {
            ZipArchiveEntry entry = zf.getEntry("zip64_file.txt");
            Assert.assertNotNull(entry);
            InputStream is = zf.getInputStream(entry);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[64];
            int len;
            while ((len = is.read(buf)) != -1) {
                baos.write(buf, 0, len);
            }
            Assert.assertEquals("Zip64 content payload", baos.toString(StandardCharsets.UTF_8.name()));
            is.close();
        } finally {
            zf.close();
        }
    }

    @Test(expected = ZipException.class)
    public void testCorruptZip64EocdLocator_ThrowsZipException() throws IOException {
        File file = createTempFile();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(file);
        zaos.setUseZip64(Zip64Mode.Always);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zaos.putArchiveEntry(entry);
        zaos.write("data".getBytes(StandardCharsets.UTF_8));
        zaos.closeArchiveEntry();
        zaos.close();

        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.seek(0);
        raf.write(new byte[]{0, 0, 0, 0});
        raf.close();

        new ZipFile(file);
    }

    @Test
    public void testUnicodeExtraFieldsHandling() throws IOException {
        File file = createTempFile();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(file);
        zaos.setEncoding("Cp437");
        zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        ZipArchiveEntry ze = new ZipArchiveEntry("unicode_\u00E4\u00F6\u00FC.txt");
        ze.setComment("comment_\u00E4\u00F6\u00FC");
        zaos.putArchiveEntry(ze);
        zaos.write("some data".getBytes(StandardCharsets.UTF_8));
        zaos.closeArchiveEntry();
        zaos.close();

        ZipFile zf = new ZipFile(file, "Cp437", true);
        try {
            ZipArchiveEntry entry = zf.getEntry("unicode_\u00E4\u00F6\u00FC.txt");
            Assert.assertNotNull(entry);
            Assert.assertEquals("comment_\u00E4\u00F6\u00FC", entry.getComment());
        } finally {
            zf.close();
        }
    }

    @Test
    public void testZipWithArchiveComment() throws IOException {
        File file = createTempFile();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(file);
        zaos.setComment("Global zip archive comment");
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        zaos.putArchiveEntry(entry);
        zaos.write("hello".getBytes(StandardCharsets.UTF_8));
        zaos.closeArchiveEntry();
        zaos.close();

        ZipFile zf = new ZipFile(file);
        try {
            Assert.assertNotNull(zf.getEntry("file.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void testFinalize_CleansUpOpenArchive() throws Throwable {
        File file = createStandardZipFile();
        ZipFile zf = new ZipFile(file);
        zf.finalize();
    }
}
