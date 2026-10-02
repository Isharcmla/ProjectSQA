package org.apache.commons.compress.archivers.zip;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileTest {

    private File testZipFile;
    private File nonZipFile;
    private ZipFile zipFile;

    @Before
    public void setUp() throws Exception {
        testZipFile = createTestZip();
        nonZipFile = createNonZipFile();
    }

    @After
    public void tearDown() throws Exception {
        ZipFile.closeQuietly(zipFile);
        zipFile = null;
        if (testZipFile != null) {
            testZipFile.delete();
        }
        if (nonZipFile != null) {
            nonZipFile.delete();
        }
    }

    private File createTestZip() throws IOException {
        File f = File.createTempFile("ziptest", ".zip");
        f.deleteOnExit();
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(f));

        // Entry 1 - stored method
        ZipEntry e1 = new ZipEntry("test1.txt");
        e1.setMethod(ZipEntry.STORED);
        byte[] content1 = "Hello World".getBytes("UTF-8");
        e1.setSize(content1.length);
        e1.setCompressedSize(content1.length);
        java.util.zip.CRC32 crc = new java.util.zip.CRC32();
        crc.update(content1);
        e1.setCrc(crc.getValue());
        zos.putNextEntry(e1);
        zos.write(content1);
        zos.closeEntry();

        // Entry 2 - deflated (default) method
        ZipEntry e2 = new ZipEntry("test2.txt");
        zos.putNextEntry(e2);
        zos.write("Second entry content".getBytes("UTF-8"));
        zos.closeEntry();

        // Entry 3 - directory entry
        ZipEntry dirEntry = new ZipEntry("dir/");
        zos.putNextEntry(dirEntry);
        zos.closeEntry();

        zos.close();
        return f;
    }

    private File createNonZipFile() throws IOException {
        File f = File.createTempFile("nonzip", ".txt");
        f.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write("This is not a zip file content".getBytes("UTF-8"));
        fos.close();
        return f;
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorFile_validZip_opensSuccessfully() throws Exception {
        zipFile = new ZipFile(testZipFile);
        assertNotNull(zipFile);
        assertEquals("UTF8", zipFile.getEncoding());
    }

    @Test
    public void testConstructorString_validZip_opensSuccessfully() throws Exception {
        zipFile = new ZipFile(testZipFile.getAbsolutePath());
        assertNotNull(zipFile);
        assertEquals("UTF8", zipFile.getEncoding());
    }

    @Test
    public void testConstructorStringEncoding_validZip_opensSuccessfully() throws Exception {
        zipFile = new ZipFile(testZipFile.getAbsolutePath(), "UTF-8");
        assertNotNull(zipFile);
        assertEquals("UTF-8", zipFile.getEncoding());
    }

    @Test
    public void testConstructorFileEncoding_validZip_opensSuccessfully() throws Exception {
        zipFile = new ZipFile(testZipFile, "UTF-8");
        assertNotNull(zipFile);
        assertEquals("UTF-8", zipFile.getEncoding());
    }

    @Test
    public void testConstructorFileEncodingUseUnicode_validZip_opensSuccessfully() throws Exception {
        zipFile = new ZipFile(testZipFile, "UTF-8", true);
        assertNotNull(zipFile);
        assertEquals("UTF-8", zipFile.getEncoding());
    }

    @Test
    public void testConstructorFileEncodingUseUnicodeFalse_validZip_opensSuccessfully() throws Exception {
        zipFile = new ZipFile(testZipFile, "UTF-8", false);
        assertNotNull(zipFile);
    }

    @Test
    public void testConstructorFileNullEncoding_defaultPlatformEncoding_opensSuccessfully() throws Exception {
        zipFile = new ZipFile(testZipFile, null);
        assertNotNull(zipFile);
        assertNull(zipFile.getEncoding());
    }

    @Test(expected = IOException.class)
    public void testConstructor_nonExistentFile_throwsIOException() throws Exception {
        File notExist = new File("this_file_should_not_exist_12345.zip");
        zipFile = new ZipFile(notExist);
    }

    @Test(expected = IOException.class)
    public void testConstructor_nonZipFile_throwsIOException() throws Exception {
        zipFile = new ZipFile(nonZipFile);
    }

    // ---------- getEncoding ----------

    @Test
    public void testGetEncoding_defaultUTF8_returnsUTF8() throws Exception {
        zipFile = new ZipFile(testZipFile);
        assertEquals("UTF8", zipFile.getEncoding());
    }

    @Test
    public void testGetEncoding_customEncoding_returnsCustomEncoding() throws Exception {
        zipFile = new ZipFile(testZipFile, "ISO-8859-1");
        assertEquals("ISO-8859-1", zipFile.getEncoding());
    }

    // ---------- close ----------

    @Test
    public void testClose_validZipFile_closesWithoutException() throws Exception {
        zipFile = new ZipFile(testZipFile);
        zipFile.close();
        // calling close again should still succeed without unexpected exception thrown here
        zipFile = null;
    }

    // ---------- closeQuietly ----------

    @Test
    public void testCloseQuietly_nullZipFile_doesNothing() {
        ZipFile.closeQuietly(null);
        // no exception expected
    }

    @Test
    public void testCloseQuietly_validZipFile_closesWithoutException() throws Exception {
        ZipFile zf = new ZipFile(testZipFile);
        ZipFile.closeQuietly(zf);
        // no exception expected
    }

    // ---------- getEntries ----------

    @Test
    public void testGetEntries_validZip_returnsAllEntries() throws Exception {
        zipFile = new ZipFile(testZipFile);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
        int count = 0;
        boolean found1 = false, found2 = false, foundDir = false;
        while (entries.hasMoreElements()) {
            ZipArchiveEntry e = entries.nextElement();
            count++;
            if ("test1.txt".equals(e.getName())) {
                found1 = true;
            }
            if ("test2.txt".equals(e.getName())) {
                found2 = true;
            }
            if ("dir/".equals(e.getName())) {
                foundDir = true;
            }
        }
        assertEquals(3, count);
        assertTrue(found1);
        assertTrue(found2);
        assertTrue(foundDir);
    }

    // ---------- getEntriesInPhysicalOrder ----------

    @Test
    public void testGetEntriesInPhysicalOrder_validZip_returnsEntriesInOrder() throws Exception {
        zipFile = new ZipFile(testZipFile);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntriesInPhysicalOrder();
        int count = 0;
        while (entries.hasMoreElements()) {
            entries.nextElement();
            count++;
        }
        assertEquals(3, count);
    }

    // ---------- getEntry ----------

    @Test
    public void testGetEntry_existingName_returnsEntry() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry("test1.txt");
        assertNotNull(entry);
        assertEquals("test1.txt", entry.getName());
    }

    @Test
    public void testGetEntry_nonExistingName_returnsNull() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry("doesNotExist.txt");
        assertNull(entry);
    }

    @Test
    public void testGetEntry_nullName_returnsNull() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry(null);
        assertNull(entry);
    }

    @Test
    public void testGetEntry_emptyStringName_returnsNull() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry("");
        assertNull(entry);
    }

    // ---------- canReadEntryData ----------

    @Test
    public void testCanReadEntryData_storedEntry_returnsTrue() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry("test1.txt");
        assertNotNull(entry);
        assertTrue(zipFile.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryData_deflatedEntry_returnsTrue() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry("test2.txt");
        assertNotNull(entry);
        assertTrue(zipFile.canReadEntryData(entry));
    }

    // ---------- getInputStream ----------

    @Test
    public void testGetInputStream_storedEntry_returnsCorrectContent() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry("test1.txt");
        assertNotNull(entry);
        InputStream is = zipFile.getInputStream(entry);
        assertNotNull(is);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) != -1) {
            baos.write(buf, 0, len);
        }
        is.close();
        assertEquals("Hello World", new String(baos.toByteArray(), "UTF-8"));
    }

    @Test
    public void testGetInputStream_deflatedEntry_returnsCorrectContent() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry("test2.txt");
        assertNotNull(entry);
        InputStream is = zipFile.getInputStream(entry);
        assertNotNull(is);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) != -1) {
            baos.write(buf, 0, len);
        }
        is.close();
        assertEquals("Second entry content", new String(baos.toByteArray(), "UTF-8"));
    }

    @Test
    public void testGetInputStream_directoryEntry_returnsEmptyStream() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry("dir/");
        assertNotNull(entry);
        InputStream is = zipFile.getInputStream(entry);
        assertNotNull(is);
        int b = is.read();
        assertEquals(-1, b);
        is.close();
    }

    @Test
    public void testGetInputStream_entryNotInArchive_returnsNull() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry fakeEntry = new ZipArchiveEntry("not-in-archive.txt");
        InputStream is = zipFile.getInputStream(fakeEntry);
        assertNull(is);
    }

    @Test
    public void testGetInputStream_readSingleBytes_matchesContent() throws Exception {
        zipFile = new ZipFile(testZipFile);
        ZipArchiveEntry entry = zipFile.getEntry("test1.txt");
        assertNotNull(entry);
        InputStream is = zipFile.getInputStream(entry);
        assertNotNull(is);
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = is.read()) != -1) {
            sb.append((char) c);
        }
        is.close();
        assertEquals("Hello World", sb.toString());
    }
}
