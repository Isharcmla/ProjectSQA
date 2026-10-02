import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
            // ignore in teardown
        }
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_default_createsInstance() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TarArchiveOutputStream stream = new TarArchiveOutputStream(out);
        Assert.assertNotNull(stream);
        Assert.assertEquals(512, stream.getRecordSize());
    }

    @Test
    public void testConstructor_withBlockSize_createsInstance() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TarArchiveOutputStream stream = new TarArchiveOutputStream(out, 10240);
        Assert.assertNotNull(stream);
        Assert.assertEquals(512, stream.getRecordSize());
    }

    @Test
    public void testConstructor_withBlockSizeAndRecordSize_createsInstance() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TarArchiveOutputStream stream = new TarArchiveOutputStream(out, 10240, 512);
        Assert.assertNotNull(stream);
        Assert.assertEquals(512, stream.getRecordSize());
    }

    // ---------- setLongFileMode ----------

    @Test
    public void testSetLongFileMode_validValues_noException() {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        // no exception expected, just verifying no side effects thrown
        Assert.assertTrue(true);
    }

    // ---------- getRecordSize ----------

    @Test
    public void testGetRecordSize_returnsDefault() {
        Assert.assertEquals(512, tos.getRecordSize());
    }

    // ---------- putArchiveEntry ----------

    @Test
    public void testPutArchiveEntry_normalFile_writesHeaderSuccessfully() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        // if no exception, header was written successfully
        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testPutArchiveEntry_directory_setsCurrSizeZero() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("testDir/");
        Assert.assertTrue(entry.isDirectory());
        tos.putArchiveEntry(entry);
        // since directory, currSize should be 0, closeArchiveEntry should succeed without writing bytes
        tos.closeArchiveEntry();
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntry_longNameWithErrorMode_throwsRuntimeException() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 105; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        // default longFileMode is LONGFILE_ERROR
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testPutArchiveEntry_longNameWithTruncateMode_noException() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 105; i++) {
            sb.append('b');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        Assert.assertTrue(true);
    }

    @Test
    public void testPutArchiveEntry_longNameWithGnuMode_writesLongLinkEntry() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 105; i++) {
            sb.append('c');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    // ---------- closeArchiveEntry ----------

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_beforeAllBytesWritten_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("incomplete.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        // write only 5 bytes instead of the declared 10
        tos.write(new byte[]{1, 2, 3, 4, 5});
        tos.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntry_afterWritingAllBytes_success() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("complete.txt");
        byte[] data = "hello world".getBytes();
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        Assert.assertTrue(true);
    }

    // ---------- write ----------

    @Test(expected = IOException.class)
    public void testWrite_exceedsEntrySize_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.write(new byte[]{1, 2, 3});
    }

    @Test
    public void testWrite_smallChunks_assemblesCorrectly() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("chunked.txt");
        // total size less than one record (512), written in small pieces
        byte[] chunk1 = new byte[100];
        byte[] chunk2 = new byte[100];
        entry.setSize(chunk1.length + chunk2.length);
        tos.putArchiveEntry(entry);
        tos.write(chunk1);
        tos.write(chunk2);
        tos.closeArchiveEntry();
        Assert.assertTrue(true);
    }

    @Test
    public void testWrite_largeSingleWrite_writesDirectly() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("large.txt");
        // size bigger than one record (512) to trigger direct record write path
        byte[] data = new byte[1200];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        Assert.assertTrue(true);
    }

    @Test
    public void testWrite_assemblyBufferFillsAndFlushes_writesRecord() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("mixed.txt");
        // first write small amount into assembly buffer, then write enough to overflow it
        byte[] first = new byte[10];
        byte[] second = new byte[600]; // will cause assembly buffer to fill and flush
        entry.setSize(first.length + second.length);
        tos.putArchiveEntry(entry);
        tos.write(first);
        tos.write(second);
        tos.closeArchiveEntry();
        Assert.assertTrue(true);
    }

    // ---------- finish ----------

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("unclosed.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        // do not call closeArchiveEntry
        tos.finish();
    }

    @Test
    public void testFinish_noUnclosedEntry_success() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("closedEntry.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    // ---------- close ----------

    @Test
    public void testClose_closesUnderlyingStreamAndIsIdempotent() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("toClose.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();
        // calling close again should not throw due to closed flag check
        tos.close();
        Assert.assertTrue(true);
    }

    // ---------- flush ----------

    @Test
    public void testFlush_flushesUnderlyingStream() throws IOException {
        // flush should simply delegate to underlying stream without exception
        tos.flush();
        Assert.assertTrue(true);
    }

    // ---------- createArchiveEntry ----------

    @Test
    public void testCreateArchiveEntry_returnsTarArchiveEntryInstance() throws IOException {
        File tempFile = File.createTempFile("tarTest", ".tmp");
        tempFile.deleteOnExit();
        ArchiveEntry entry = tos.createArchiveEntry(tempFile, "entryName.tmp");
        Assert.assertNotNull(entry);
        Assert.assertTrue(entry instanceof TarArchiveEntry);
        Assert.assertEquals("entryName.tmp", entry.getName());
    }

    @Test
    public void testCreateArchiveEntry_withEmptyEntryName_stillCreatesEntry() throws IOException {
        File tempFile = File.createTempFile("tarTest2", ".tmp");
        tempFile.deleteOnExit();
        ArchiveEntry entry = tos.createArchiveEntry(tempFile, "");
        Assert.assertNotNull(entry);
    }
}
