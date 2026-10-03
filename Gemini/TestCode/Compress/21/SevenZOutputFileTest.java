package org.apache.commons.compress.archivers.sevenz;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class SevenZOutputFileTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testCreateArchiveEntry_normalFileAndDirectory() throws IOException {
        File archiveFile = tempFolder.newFile("test_create.7z");
        File regularFile = tempFolder.newFile("sample.txt");
        File dir = tempFolder.newFolder("sampleDir");

        SevenZOutputFile sevenZOutput = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry fileEntry = sevenZOutput.createArchiveEntry(regularFile, "sample.txt");
            assertNotNull(fileEntry);
            assertEquals("sample.txt", fileEntry.getName());
            assertFalse(fileEntry.isDirectory());
            assertEquals(regularFile.lastModified(), fileEntry.getLastModifiedDate().getTime());

            SevenZArchiveEntry dirEntry = sevenZOutput.createArchiveEntry(dir, "sampleDir");
            assertNotNull(dirEntry);
            assertEquals("sampleDir", dirEntry.getName());
            assertTrue(dirEntry.isDirectory());
            assertEquals(dir.lastModified(), dirEntry.getLastModifiedDate().getTime());
        } finally {
            sevenZOutput.close();
        }
    }

    @Test
    public void testEmptyArchive_finishAndClose() throws IOException {
        File archiveFile = tempFolder.newFile("empty.7z");
        SevenZOutputFile sevenZOutput = new SevenZOutputFile(archiveFile);
        sevenZOutput.finish();
        sevenZOutput.close();

        assertTrue(archiveFile.exists());
        assertTrue(archiveFile.length() > 0);

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            assertEquals(null, sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testFinish_calledTwice_throwsException() throws IOException {
        File archiveFile = tempFolder.newFile("finish_twice.7z");
        SevenZOutputFile sevenZOutput = new SevenZOutputFile(archiveFile);
        try {
            sevenZOutput.finish();
            try {
                sevenZOutput.finish();
                fail("Expected IOException when finish is called twice");
            } catch (IOException e) {
                assertEquals("This archive has already been finished", e.getMessage());
            }
        } finally {
            sevenZOutput.close();
        }
    }

    @Test
    public void testClose_withoutExplicitFinish_finishesAndClosesSuccessfully() throws IOException {
        File archiveFile = tempFolder.newFile("auto_finish.7z");
        SevenZOutputFile sevenZOutput = new SevenZOutputFile(archiveFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("file.txt");
        sevenZOutput.putArchiveEntry(entry);
        byte[] data = "Auto close test".getBytes("UTF-8");
        sevenZOutput.write(data);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.close();

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry readEntry = sevenZFile.getNextEntry();
            assertNotNull(readEntry);
            assertEquals("file.txt", readEntry.getName());
            byte[] readContent = new byte[(int) readEntry.getSize()];
            int bytesRead = sevenZFile.read(readContent);
            assertEquals(data.length, bytesRead);
            assertArrayEquals(data, readContent);
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testWrite_variousMethodsAndReadBack() throws IOException {
        SevenZMethod[] methods = new SevenZMethod[] {
            SevenZMethod.COPY,
            SevenZMethod.LZMA2,
            SevenZMethod.DEFLATE,
            SevenZMethod.BZIP2
        };

        for (SevenZMethod method : methods) {
            File archiveFile = tempFolder.newFile("archive_" + method.name() + ".7z");
            SevenZOutputFile sevenZOutput = new SevenZOutputFile(archiveFile);
            sevenZOutput.setContentCompression(method);

            SevenZArchiveEntry entry = new SevenZArchiveEntry();
            entry.setName("entry_" + method.name() + ".bin");
            sevenZOutput.putArchiveEntry(entry);

            byte[] content = new byte[1024];
            for (int i = 0; i < content.length; i++) {
                content[i] = (byte) (i % 256);
            }

            // Write using single byte
            sevenZOutput.write(content[0]);
            // Write using full array
            byte[] subArray1 = Arrays.copyOfRange(content, 1, 100);
            sevenZOutput.write(subArray1);
            // Write with offset and len
            sevenZOutput.write(content, 100, content.length - 100);
            // Write 0 length should not fail or affect output
            sevenZOutput.write(content, 0, 0);

            sevenZOutput.closeArchiveEntry();
            sevenZOutput.close();

            SevenZFile sevenZFile = new SevenZFile(archiveFile);
            try {
                SevenZArchiveEntry readEntry = sevenZFile.getNextEntry();
                assertNotNull(readEntry);
                assertEquals("entry_" + method.name() + ".bin", readEntry.getName());
                assertEquals(content.length, readEntry.getSize());
                byte[] readContent = new byte[(int) readEntry.getSize()];
                int read = 0;
                while (read < readContent.length) {
                    int count = sevenZFile.read(readContent, read, readContent.length - read);
                    if (count < 0) {
                        break;
                    }
                    read += count;
                }
                assertEquals(content.length, read);
                assertArrayEquals(content, readContent);
            } finally {
                sevenZFile.close();
            }
        }
    }

    @Test
    public void testEmptyEntriesAndDirectoriesAndAntiItems() throws IOException {
        File archiveFile = tempFolder.newFile("complex_entries.7z");
        SevenZOutputFile sevenZOutput = new SevenZOutputFile(archiveFile);

        // 1. Directory entry (empty stream)
        SevenZArchiveEntry dirEntry = new SevenZArchiveEntry();
        dirEntry.setName("myDir");
        dirEntry.setDirectory(true);
        sevenZOutput.putArchiveEntry(dirEntry);
        sevenZOutput.closeArchiveEntry();

        // 2. Empty file entry (empty stream, not directory)
        SevenZArchiveEntry emptyFileEntry = new SevenZArchiveEntry();
        emptyFileEntry.setName("emptyFile.txt");
        emptyFileEntry.setDirectory(false);
        sevenZOutput.putArchiveEntry(emptyFileEntry);
        sevenZOutput.closeArchiveEntry();

        // 3. Anti-item entry
        SevenZArchiveEntry antiEntry = new SevenZArchiveEntry();
        antiEntry.setName("antiItem.txt");
        antiEntry.setAntiItem(true);
        sevenZOutput.putArchiveEntry(antiEntry);
        sevenZOutput.closeArchiveEntry();

        // 4. Normal non-empty file
        SevenZArchiveEntry fileEntry = new SevenZArchiveEntry();
        fileEntry.setName("normal.txt");
        sevenZOutput.putArchiveEntry(fileEntry);
        sevenZOutput.write("Hello World".getBytes("UTF-8"));
        sevenZOutput.closeArchiveEntry();

        sevenZOutput.close();

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry e1 = sevenZFile.getNextEntry();
            assertNotNull(e1);
            assertEquals("myDir", e1.getName());
            assertTrue(e1.isDirectory());
            assertEquals(0, e1.getSize());

            SevenZArchiveEntry e2 = sevenZFile.getNextEntry();
            assertNotNull(e2);
            assertEquals("emptyFile.txt", e2.getName());
            assertFalse(e2.isDirectory());
            assertEquals(0, e2.getSize());

            SevenZArchiveEntry e3 = sevenZFile.getNextEntry();
            assertNotNull(e3);
            assertEquals("antiItem.txt", e3.getName());
            assertTrue(e3.isAntiItem());

            SevenZArchiveEntry e4 = sevenZFile.getNextEntry();
            assertNotNull(e4);
            assertEquals("normal.txt", e4.getName());
            assertEquals(11, e4.getSize());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testPartialDatesAndWindowsAttributes() throws IOException {
        File archiveFile = tempFolder.newFile("partial_metadata.7z");
        SevenZOutputFile sevenZOutput = new SevenZOutputFile(archiveFile);

        Date now = new Date(1600000000000L);

        // Entry 1 with all attributes set
        SevenZArchiveEntry entry1 = new SevenZArchiveEntry();
        entry1.setName("entry1.txt");
        entry1.setCreationDate(now);
        entry1.setAccessDate(now);
        entry1.setLastModifiedDate(now);
        entry1.setWindowsAttributes(0x20); // Archive attribute
        sevenZOutput.putArchiveEntry(entry1);
        sevenZOutput.write(new byte[]{1, 2, 3});
        sevenZOutput.closeArchiveEntry();

        // Entry 2 with NO metadata set (tests partial bitmasks)
        SevenZArchiveEntry entry2 = new SevenZArchiveEntry();
        entry2.setName("entry2.txt");
        entry2.setHasCreationDate(false);
        entry2.setHasAccessDate(false);
        entry2.setHasLastModifiedDate(false);
        entry2.setHasWindowsAttributes(false);
        sevenZOutput.putArchiveEntry(entry2);
        sevenZOutput.write(new byte[]{4, 5, 6});
        sevenZOutput.closeArchiveEntry();

        sevenZOutput.close();

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            SevenZArchiveEntry e1 = sevenZFile.getNextEntry();
            assertNotNull(e1);
            assertEquals("entry1.txt", e1.getName());
            assertTrue(e1.getHasCreationDate());
            assertTrue(e1.getHasAccessDate());
            assertTrue(e1.getHasLastModifiedDate());
            assertTrue(e1.getHasWindowsAttributes());
            assertEquals(0x20, e1.getWindowsAttributes());

            SevenZArchiveEntry e2 = sevenZFile.getNextEntry();
            assertNotNull(e2);
            assertEquals("entry2.txt", e2.getName());
            assertFalse(e2.getHasCreationDate());
            assertFalse(e2.getHasAccessDate());
            assertFalse(e2.getHasLastModifiedDate());
            assertFalse(e2.getHasWindowsAttributes());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testAllDatesAndWindowsAttributesSet() throws IOException {
        File archiveFile = tempFolder.newFile("all_metadata.7z");
        SevenZOutputFile sevenZOutput = new SevenZOutputFile(archiveFile);

        Date now = new Date(1600000000000L);

        // All entries have full metadata (tests all == files.size() branch)
        for (int i = 1; i <= 2; i++) {
            SevenZArchiveEntry entry = new SevenZArchiveEntry();
            entry.setName("entry" + i + ".txt");
            entry.setCreationDate(now);
            entry.setAccessDate(now);
            entry.setLastModifiedDate(now);
            entry.setWindowsAttributes(0x01);
            sevenZOutput.putArchiveEntry(entry);
            sevenZOutput.write(new byte[]{(byte) i});
            sevenZOutput.closeArchiveEntry();
        }

        sevenZOutput.close();

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            for (int i = 1; i <= 2; i++) {
                SevenZArchiveEntry entry = sevenZFile.getNextEntry();
                assertNotNull(entry);
                assertEquals("entry" + i + ".txt", entry.getName());
                assertTrue(entry.getHasCreationDate());
                assertTrue(entry.getHasAccessDate());
                assertTrue(entry.getHasLastModifiedDate());
                assertTrue(entry.getHasWindowsAttributes());
                assertEquals(0x01, entry.getWindowsAttributes());
            }
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void testManyEntries_bitSetCrossByteBoundary() throws IOException {
        File archiveFile = tempFolder.newFile("many_entries.7z");
        SevenZOutputFile sevenZOutput = new SevenZOutputFile(archiveFile);

        // Add 18 entries to exceed 8-bit and 16-bit boundaries in BitSet serialization
        int count = 18;
        for (int i = 0; i < count; i++) {
            SevenZArchiveEntry entry = new SevenZArchiveEntry();
            entry.setName("file_" + i + ".txt");
            sevenZOutput.putArchiveEntry(entry);
            if (i % 2 == 0) {
                // Non-empty stream
                sevenZOutput.write(i);
            }
            // Empty stream for odd i
            sevenZOutput.closeArchiveEntry();
        }

        sevenZOutput.close();

        SevenZFile sevenZFile = new SevenZFile(archiveFile);
        try {
            for (int i = 0; i < count; i++) {
                SevenZArchiveEntry entry = sevenZFile.getNextEntry();
                assertNotNull(entry);
                assertEquals("file_" + i + ".txt", entry.getName());
                if (i % 2 == 0) {
                    assertEquals(1, entry.getSize());
                    assertEquals(i, sevenZFile.read());
                } else {
                    assertEquals(0, entry.getSize());
                }
            }
        } finally {
            sevenZFile.close();
        }
    }
}
