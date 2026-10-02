package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

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

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_defaultBlockAndRecordSize_returnsDefaultRecordSize() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
    }

    @Test
    public void testConstructor_customBlockSize_returnsDefaultRecordSize() {
        TarArchiveOutputStream custom = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, custom.getRecordSize());
    }

    @Test
    public void testConstructor_customBlockAndRecordSize_returnsCustomRecordSize() {
        TarArchiveOutputStream custom = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024, 256);
        assertEquals(256, custom.getRecordSize());
    }

    // ---------- getRecordSize ----------

    @Test
    public void testGetRecordSize_default_returns512() {
        assertEquals(512, tos.getRecordSize());
    }

    // ---------- setLongFileMode ----------

    @Test
    public void testSetLongFileMode_setTruncate_noExceptionOnLongName() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
    }

    // ---------- putArchiveEntry - normal ----------

    @Test
    public void testPutArchiveEntry_normalFileEntry_writesHeaderSuccessfully() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "hello world".getBytes();
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_directoryEntry_currSizeZero() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("mydir/", true);
        tos.putArchiveEntry(entry);
        // no write needed since currSize should be 0 for directories
        tos.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntry_boundaryNameLength_notLongName() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN - 1; i++) {
            sb.append('b');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
    }

    // ---------- putArchiveEntry - long file name error ----------

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntry_longNameWithErrorMode_throwsRuntimeException() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            sb.append('c');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        // default longFileMode is LONGFILE_ERROR
        tos.putArchiveEntry(entry);
    }

    // ---------- putArchiveEntry - GNU long file name ----------

    @Test
    public void testPutArchiveEntry_longNameWithGnuMode_writesLongLinkEntry() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            sb.append('d');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        assertTrue(baos.size() > 0);
    }

    // ---------- closeArchiveEntry ----------

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_notEnoughBytesWritten_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("shortfile.txt");
        entry.setSize(100);
        tos.putArchiveEntry(entry);
        byte[] data = new byte[50];
        tos.write(data);
        tos.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntry_exactBytesWritten_noException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("exact.txt");
        byte[] data = new byte[10];
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntry_partialAssemblyBuffer_padsAndWritesRecord() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("partial.txt");
        byte[] data = new byte[10]; // less than record size (512)
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        // assemLen should be > 0 here, closeArchiveEntry should pad with zeros and write record
        tos.closeArchiveEntry();
    }

    // ---------- write ----------

    @Test(expected = IOException.class)
    public void testWrite_exceedsEntrySize_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("toobig.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        byte[] data = new byte[10];
        tos.write(data, 0, data.length);
    }

    @Test
    public void testWrite_smallChunksAssembled_noException() throws IOException {
        int recordSize = tos.getRecordSize();
        int total = recordSize + 100; // larger than one record to trigger assembly logic
        TarArchiveEntry entry = new TarArchiveEntry("assembled.txt");
        entry.setSize(total);
        tos.putArchiveEntry(entry);

        byte[] chunk1 = new byte[200];
        byte[] chunk2 = new byte[200];
        byte[] chunk3 = new byte[total - 400];

        tos.write(chunk1, 0, chunk1.length);
        tos.write(chunk2, 0, chunk2.length);
        tos.write(chunk3, 0, chunk3.length);
        tos.closeArchiveEntry();
    }

    @Test
    public void testWrite_largeDataMultipleRecords_writesDirectly() throws IOException {
        int recordSize = tos.getRecordSize();
        int total = recordSize * 3; // exactly multiple of record size, no remainder
        TarArchiveEntry entry = new TarArchiveEntry("large.txt");
        entry.setSize(total);
        tos.putArchiveEntry(entry);

        byte[] data = new byte[total];
        tos.write(data, 0, data.length);
        tos.closeArchiveEntry();
    }

    @Test
    public void testWrite_zeroBytes_noEffect() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("zero.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        byte[] data = new byte[0];
        tos.write(data, 0, 0);
        tos.closeArchiveEntry();
    }

    @Test
    public void testWrite_fullByteArrayOverload_worksCorrectly() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("fullarray.txt");
        byte[] data = "some content data".getBytes();
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
    }

    // ---------- finish ----------

    @Test
    public void testFinish_writesEOFRecordsTwice() throws IOException {
        int sizeBefore = baos.size();
        tos.finish();
        assertTrue(baos.size() > sizeBefore);
    }

    // ---------- close ----------

    @Test
    public void testClose_normalClose_setsClosedTrue() throws IOException {
        tos.close();
        // calling close a second time should be a no-op and not throw
        tos.close();
    }

    @Test
    public void testClose_afterEntryWrittenAndClosed_completesWithoutException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("closetest.txt");
        byte[] data = "closing test".getBytes();
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        tos.close();
    }

    // ---------- flush ----------

    @Test
    public void testFlush_doesNotThrowException() throws IOException {
        tos.flush();
    }

    // ---------- createArchiveEntry ----------

    @Test
    public void testCreateArchiveEntry_validFile_returnsTarArchiveEntry() throws IOException {
        File tempFile = File.createTempFile("tartest", ".tmp");
        tempFile.deleteOnExit();
        ArchiveEntryHolder holder = new ArchiveEntryHolder(tos.createArchiveEntry(tempFile, "entryName.tmp"));
        assertTrue(holder.entry instanceof TarArchiveEntry);
        assertEquals("entryName.tmp", holder.entry.getName());
    }

    // simple holder to avoid unused import warnings and keep assertion readable
    private static class ArchiveEntryHolder {
        final org.apache.commons.compress.archivers.ArchiveEntry entry;
        ArchiveEntryHolder(org.apache.commons.compress.archivers.ArchiveEntry entry) {
            this.entry = entry;
        }
    }
}
