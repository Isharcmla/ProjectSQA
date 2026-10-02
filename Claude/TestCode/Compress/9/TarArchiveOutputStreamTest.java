import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(baos);
    }

    @After
    public void tearDown() {
        try {
            if (tos != null) {
                tos.close();
            }
        } catch (IOException e) {
            // ignore for cleanup
        }
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_defaultBlockSize_normal() {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new ByteArrayOutputStream());
        assertNotNull(stream);
    }

    @Test
    public void testConstructor_withBlockSize_normal() {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new ByteArrayOutputStream(), 10240);
        assertNotNull(stream);
    }

    @Test
    public void testConstructor_withBlockSizeAndRecordSize_normal() {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new ByteArrayOutputStream(), 10240, 512);
        assertNotNull(stream);
        assertEquals(512, stream.getRecordSize());
    }

    // ---------- getRecordSize Tests ----------

    @Test
    public void testGetRecordSize_default_returnsDefault() {
        assertEquals(512, tos.getRecordSize());
    }

    // ---------- setLongFileMode Tests ----------

    @Test
    public void testSetLongFileMode_gnu_setsSuccessfully() {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        // no exception expected, verify by usage below in other test
        assertTrue(true);
    }

    @Test
    public void testSetLongFileMode_truncate_setsSuccessfully() {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        assertTrue(true);
    }

    @Test
    public void testSetLongFileMode_error_setsSuccessfully() {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        assertTrue(true);
    }

    // ---------- putArchiveEntry Tests ----------

    @Test
    public void testPutArchiveEntry_normalEntry_success() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        tos.write("hello".getBytes());
        tos.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntry_directoryEntry_success() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("testDir/");
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterFinished_throwsIOException() throws IOException {
        tos.finish();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntry_longNameWithErrorMode_throwsRuntimeException() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testPutArchiveEntry_longNameWithGnuMode_success() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(3);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        tos.putArchiveEntry(entry);
        tos.write("abc".getBytes());
        tos.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntry_longNameWithTruncateMode_success() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
    }

    // ---------- closeArchiveEntry Tests ----------

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_noUnclosedEntry_throwsIOException() throws IOException {
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_afterFinished_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_lessBytesWrittenThanSpecified_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        tos.write("abc".getBytes());
        tos.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntry_assembleBufferFlushed_success() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(3);
        tos.putArchiveEntry(entry);
        tos.write("abc".getBytes());
        tos.closeArchiveEntry();
    }

    // ---------- write Tests ----------

    @Test
    public void testWrite_normalData_success() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        tos.write("hello".getBytes(), 0, 5);
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testWrite_exceedsEntrySize_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(3);
        tos.putArchiveEntry(entry);
        tos.write("hello".getBytes(), 0, 5);
    }

    @Test
    public void testWrite_largeDataMultipleRecords_success() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = new byte[2000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data, 0, data.length);
        tos.closeArchiveEntry();
    }

    @Test
    public void testWrite_smallChunksAssembled_success() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        tos.write("abcde".getBytes(), 0, 5);
        tos.write("fghij".getBytes(), 0, 5);
        tos.closeArchiveEntry();
    }

    @Test
    public void testWrite_zeroLength_success() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.write(new byte[0], 0, 0);
        tos.closeArchiveEntry();
    }

    // ---------- finish Tests ----------

    @Test
    public void testFinish_normal_success() throws IOException {
        tos.finish();
        assertTrue(true);
    }

    @Test(expected = IOException.class)
    public void testFinish_alreadyFinished_throwsIOException() throws IOException {
        tos.finish();
        tos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_unclosedEntry_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.finish();
    }

    // ---------- close Tests ----------

    @Test
    public void testClose_normal_success() throws IOException {
        tos.close();
        assertTrue(true);
    }

    @Test
    public void testClose_afterFinish_success() throws IOException {
        tos.finish();
        tos.close();
        assertTrue(true);
    }

    @Test
    public void testClose_calledTwice_success() throws IOException {
        tos.close();
        tos.close();
        assertTrue(true);
    }

    // ---------- flush Tests ----------

    @Test
    public void testFlush_normal_success() throws IOException {
        tos.flush();
        assertTrue(true);
    }

    // ---------- createArchiveEntry Tests ----------

    @Test
    public void testCreateArchiveEntry_normal_returnsEntry() throws IOException {
        File tempFile = File.createTempFile("tarTest", ".txt");
        tempFile.deleteOnExit();
        ArchiveEntry entry = tos.createArchiveEntry(tempFile, "entryName.txt");
        assertNotNull(entry);
        assertTrue(entry instanceof TarArchiveEntry);
        assertEquals("entryName.txt", entry.getName());
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_afterFinished_throwsIOException() throws IOException {
        tos.finish();
        File tempFile = File.createTempFile("tarTest", ".txt");
        tempFile.deleteOnExit();
        tos.createArchiveEntry(tempFile, "entryName.txt");
    }

    // ---------- Full integration scenario ----------

    @Test
    public void testFullArchiveLifecycle_multipleEntries_success() throws IOException {
        TarArchiveEntry entry1 = new TarArchiveEntry("file1.txt");
        entry1.setSize(5);
        tos.putArchiveEntry(entry1);
        tos.write("hello".getBytes());
        tos.closeArchiveEntry();

        TarArchiveEntry entry2 = new TarArchiveEntry("file2.txt");
        entry2.setSize(3);
        tos.putArchiveEntry(entry2);
        tos.write("abc".getBytes());
        tos.closeArchiveEntry();

        tos.finish();
        tos.close();

        assertTrue(baos.toByteArray().length > 0);
    }
}
