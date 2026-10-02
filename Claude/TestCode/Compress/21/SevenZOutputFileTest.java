package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class SevenZOutputFileTest {

    private File tempFile;
    private SevenZOutputFile sevenZOutput;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("sevenztest", ".7z");
    }

    @After
    public void tearDown() {
        if (sevenZOutput != null) {
            try {
                sevenZOutput.close();
            } catch (IOException e) {
                // ignore - may already be closed
            }
        }
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    @Test
    public void testConstructor_validFile_createsFileSuccessfully() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        assertNotNull(sevenZOutput);
    }

    @Test
    public void testSetContentCompression_copyMethod_doesNotThrow() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.setContentCompression(SevenZMethod.COPY);
        sevenZOutput.finish();
    }

    @Test
    public void testCreateArchiveEntry_regularFile_returnsEntryWithCorrectName() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        File dummy = File.createTempFile("dummy", ".txt");
        dummy.deleteOnExit();
        SevenZArchiveEntry entry = sevenZOutput.createArchiveEntry(dummy, "test.txt");
        assertEquals("test.txt", entry.getName());
        assertFalse(entry.isDirectory());
        dummy.delete();
    }

    @Test
    public void testCreateArchiveEntry_directory_returnsDirectoryEntry() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        File dir = File.createTempFile("dirtest", "");
        dir.delete();
        dir.mkdir();
        SevenZArchiveEntry entry = sevenZOutput.createArchiveEntry(dir, "testDir");
        assertTrue(entry.isDirectory());
        dir.delete();
    }

    @Test
    public void testCreateArchiveEntry_setsLastModifiedDate() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        File dummy = File.createTempFile("dummy2", ".txt");
        dummy.deleteOnExit();
        SevenZArchiveEntry entry = sevenZOutput.createArchiveEntry(dummy, "test2.txt");
        assertNotNull(entry.getLastModifiedDate());
        dummy.delete();
    }

    @Test
    public void testPutArchiveEntry_validEntry_addsToArchive() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("test.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
    }

    @Test
    public void testCloseArchiveEntry_noDataWritten_setsHasStreamFalse() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("empty.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.closeArchiveEntry();
        assertFalse(entry.hasStream());
        sevenZOutput.finish();
    }

    @Test
    public void testCloseArchiveEntry_dataWritten_setsHasStreamTrue() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("data.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.write("hello".getBytes());
        sevenZOutput.closeArchiveEntry();
        assertTrue(entry.hasStream());
        sevenZOutput.finish();
    }

    @Test
    public void testWriteInt_singleByte_writesSuccessfully() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("byte.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.write(65);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
    }

    @Test
    public void testWriteByteArray_normalData_writesSuccessfully() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("array.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.write(new byte[]{1, 2, 3, 4, 5});
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
    }

    @Test
    public void testWriteByteArray_emptyArray_handlesGracefully() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("emptyarray.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.write(new byte[0]);
        sevenZOutput.closeArchiveEntry();
        assertFalse(entry.hasStream());
        sevenZOutput.finish();
    }

    @Test
    public void testWriteByteArrayOffsetLen_partialArray_writesSuccessfully() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("partial.txt");
        sevenZOutput.putArchiveEntry(entry);
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        sevenZOutput.write(data, 2, 4);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
    }

    @Test
    public void testWriteByteArrayOffsetLen_zeroLength_doesNotWriteAnyData() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("zero.txt");
        sevenZOutput.putArchiveEntry(entry);
        byte[] data = {1, 2, 3};
        sevenZOutput.write(data, 0, 0);
        sevenZOutput.closeArchiveEntry();
        assertFalse(entry.hasStream());
        sevenZOutput.finish();
    }

    @Test
    public void testWriteByteArrayOffsetLen_negativeLength_doesNotWriteData() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("negativelen.txt");
        sevenZOutput.putArchiveEntry(entry);
        byte[] data = {1, 2, 3};
        sevenZOutput.write(data, 0, -1);
        sevenZOutput.closeArchiveEntry();
        assertFalse(entry.hasStream());
        sevenZOutput.finish();
    }

    @Test
    public void testFinish_emptyArchive_completesSuccessfully() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test(expected = IOException.class)
    public void testFinish_alreadyFinished_throwsIOException() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.finish();
        sevenZOutput.finish();
    }

    @Test
    public void testClose_notFinished_callsFinishAndCloses() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("test.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.write("data".getBytes());
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.close();
        sevenZOutput = null;
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testClose_alreadyFinished_justClosesFile() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.finish();
        sevenZOutput.close();
        sevenZOutput = null;
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testMultipleEntries_mixedStreamAndEmpty_writesCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);

        SevenZArchiveEntry entry1 = new SevenZArchiveEntry();
        entry1.setName("file1.txt");
        sevenZOutput.putArchiveEntry(entry1);
        sevenZOutput.write("content1".getBytes());
        sevenZOutput.closeArchiveEntry();

        SevenZArchiveEntry entry2 = new SevenZArchiveEntry();
        entry2.setName("emptyfile.txt");
        sevenZOutput.putArchiveEntry(entry2);
        sevenZOutput.closeArchiveEntry();

        SevenZArchiveEntry entry3 = new SevenZArchiveEntry();
        entry3.setName("dir/");
        entry3.setDirectory(true);
        sevenZOutput.putArchiveEntry(entry3);
        sevenZOutput.closeArchiveEntry();

        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testEntryWithAntiItem_setsAntiItemCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("anti.txt");
        entry.setAntiItem(true);
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testEntryWithCreationDate_writesCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("dated.txt");
        entry.setCreationDate(new Date());
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testEntryWithAccessDate_writesCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("accessed.txt");
        entry.setAccessDate(new Date());
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testEntryWithLastModifiedDate_writesCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("modified.txt");
        entry.setLastModifiedDate(new Date());
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testEntryWithWindowsAttributes_writesCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("winattr.txt");
        entry.setWindowsAttributes(0x20);
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testSetContentCompression_bzip2_worksCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.setContentCompression(SevenZMethod.BZIP2);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("bzip2test.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.write("test data for bzip2".getBytes());
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testSetContentCompression_deflate_worksCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.setContentCompression(SevenZMethod.DEFLATE);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("deflatetest.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.write("test data for deflate".getBytes());
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testSetContentCompression_copy_worksCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.setContentCompression(SevenZMethod.COPY);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("copytest.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.write("test data for copy".getBytes());
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testMultipleEntriesWithLargeData_writesCorrectly() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("large.txt");
        sevenZOutput.putArchiveEntry(entry);
        byte[] largeData = new byte[10000];
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 256);
        }
        sevenZOutput.write(largeData);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(entry.hasStream());
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testEntryWithEmptyName_writesSuccessfully() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.finish();
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testMultipleWriteCallsForSingleEntry_accumulatesData() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("multiwrite.txt");
        sevenZOutput.putArchiveEntry(entry);
        sevenZOutput.write("part1".getBytes());
        sevenZOutput.write("part2".getBytes());
        sevenZOutput.write(65);
        sevenZOutput.closeArchiveEntry();
        assertTrue(entry.hasStream());
        sevenZOutput.finish();
    }
}
