package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class TarArchiveOutputStreamTest {

    private File tempFile;

    @Before
    public void setUp() throws Exception {
        tempFile = File.createTempFile("tar_test", ".tmp");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write("test content for file entry".getBytes());
        fos.close();
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    @Test
    public void testConstructorsAndGetRecordSize() throws IOException {
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        TarArchiveOutputStream taos1 = new TarArchiveOutputStream(baos1);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos1.getRecordSize());
        taos1.close();

        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        TarArchiveOutputStream taos2 = new TarArchiveOutputStream(baos2, 1024);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos2.getRecordSize());
        taos2.close();

        ByteArrayOutputStream baos3 = new ByteArrayOutputStream();
        TarArchiveOutputStream taos3 = new TarArchiveOutputStream(baos3, 1024, 512);
        Assert.assertEquals(512, taos3.getRecordSize());
        taos3.close();
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        ArchiveEntry entry = taos.createArchiveEntry(tempFile, "entryName.txt");
        Assert.assertNotNull(entry);
        Assert.assertTrue(entry instanceof TarArchiveEntry);
        Assert.assertEquals("entryName.txt", entry.getName());
        Assert.assertEquals(tempFile.length(), entry.getSize());

        taos.close();
    }

    @Test
    public void testPutArchiveEntry_regularFile_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        byte[] data = "Hello World Tar Archive Test".getBytes();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(data.length);

        taos.putArchiveEntry(entry);
        taos.write(data);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_directory_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir/");
        taos.putArchiveEntry(dirEntry);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test(expected = ClassCastException.class)
    public void testPutArchiveEntry_invalidEntryType_throwsClassCastException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        ArchiveEntry fakeEntry = new ArchiveEntry() {
            public String getName() {
                return "fake";
            }

            public long getSize() {
                return 0;
            }

            public boolean isDirectory() {
                return false;
            }

            public java.util.Date getLastModifiedDate() {
                return new java.util.Date();
            }
        };

        try {
            taos.putArchiveEntry(fakeEntry);
        } finally {
            taos.close();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntry_longFileNameErrorMode_throwsRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            longName.append("a");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(0);

        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test
    public void testPutArchiveEntry_longFileNameTruncateMode_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);

        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            longName.append("a");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_longFileNameGnuMode_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 15; i++) {
            longName.append("b");
        }

        byte[] content = "Content inside long name file".getBytes();
        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(content.length);

        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testWrite_exceedsEntrySize_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        taos.putArchiveEntry(entry);

        try {
            taos.write("123456".getBytes());
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_unwrittenBytes_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.write("12345".getBytes());

        try {
            taos.closeArchiveEntry();
        } finally {
            taos.close();
        }
    }

    @Test
    public void testWrite_multiRecordAndPartialBufferAssembly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int recordSize = 512;
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, recordSize);

        int totalSize = recordSize * 3 + 100;
        byte[] fullData = new byte[totalSize];
        Arrays.fill(fullData, (byte) 'Z');

        TarArchiveEntry entry = new TarArchiveEntry("large.txt");
        entry.setSize(totalSize);
        taos.putArchiveEntry(entry);

        // 1. Write smaller than recordSize (assemLen > 0, assemLen + num < recordBuf.length)
        taos.write(fullData, 0, 100);

        // 2. Write partial that does NOT complete recordBuf (assemLen: 100 + 50 = 150)
        taos.write(fullData, 100, 50);

        // 3. Write data that completes recordBuf (assemLen > 0, assemLen + num >= recordBuf.length)
        // and has remaining large data (while loop for recordBuf.length chunks)
        // and ends with trailing partial data (numToWrite < recordBuf.length inside while loop)
        int remaining = totalSize - 150;
        taos.write(fullData, 150, remaining);

        // 4. closeArchiveEntry will pad assemLen (100) to recordSize and write record
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testWrite_zeroBytes_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = new TarArchiveEntry("zero.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.write(new byte[0], 0, 0);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testWrite_exactRecordSizeChunks() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        int recordSize = taos.getRecordSize();
        byte[] fullData = new byte[recordSize * 2];
        Arrays.fill(fullData, (byte) 'A');

        TarArchiveEntry entry = new TarArchiveEntry("exact.txt");
        entry.setSize(fullData.length);
        taos.putArchiveEntry(entry);

        taos.write(fullData, 0, fullData.length);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = new TarArchiveEntry("unclosed.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);

        try {
            taos.finish();
        } finally {
            taos.close();
        }
    }

    @Test
    public void testFinish_and_close_multipleTimes() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        taos.finish();
        // Closing multiple times should be safe (idempotent)
        taos.close();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testFlush_success() throws IOException {
        final boolean[] flushed = new boolean[]{false};
        OutputStream os = new OutputStream() {
            @Override
            public void write(int b) {
            }

            @Override
            public void flush() {
                flushed[0] = true;
            }
        };

        TarArchiveOutputStream taos = new TarArchiveOutputStream(os);
        taos.flush();
        Assert.assertTrue(flushed[0]);
        taos.close();
    }
}
