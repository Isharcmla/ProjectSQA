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

    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tarOut;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        tarOut = new TarArchiveOutputStream(baos);
    }

    @After
    public void tearDown() throws IOException {
        if (tarOut != null) {
            try {
                tarOut.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void testConstructors() throws IOException {
        TarArchiveOutputStream s1 = new TarArchiveOutputStream(new ByteArrayOutputStream());
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, s1.getRecordSize());
        s1.close();

        TarArchiveOutputStream s2 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 2048);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, s2.getRecordSize());
        s2.close();

        TarArchiveOutputStream s3 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 2048, 1024);
        Assert.assertEquals(1024, s3.getRecordSize());
        s3.close();
    }

    @Test
    public void testPutArchiveEntry_regularFile() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "Hello, Tar World!".getBytes();
        entry.setSize(data.length);

        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
        tarOut.finish();

        byte[] result = baos.toByteArray();
        Assert.assertTrue(result.length >= 512);
    }

    @Test
    public void testPutArchiveEntry_directory() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("testdir/");
        entry.setSize(100); // Directory size should be forced to 0 internally

        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        tarOut.finish();

        byte[] result = baos.toByteArray();
        Assert.assertTrue(result.length >= 512);
    }

    @Test(expected = ClassCastException.class)
    public void testPutArchiveEntry_invalidEntryType_throwsClassCastException() throws IOException {
        ArchiveEntry nonTarEntry = new ArchiveEntry() {
            public String getName() {
                return "dummy";
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

        tarOut.putArchiveEntry(nonTarEntry);
    }

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntry_longFileNameDefaultError_throwsException() throws IOException {
        String longName = "1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/toolong.txt";
        Assert.assertTrue(longName.length() >= TarConstants.NAMELEN);

        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);

        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        tarOut.putArchiveEntry(entry);
    }

    @Test
    public void testPutArchiveEntry_longFileNameTruncate() throws IOException {
        String longName = "1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/toolong.txt";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);

        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        tarOut.finish();

        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testPutArchiveEntry_longFileNameGNU() throws IOException {
        String longName = "1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/1234567890/toolong.txt";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        byte[] data = "gnu long name test content".getBytes();
        entry.setSize(data.length);

        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
        tarOut.finish();

        Assert.assertTrue(baos.toByteArray().length > 512);
    }

    @Test(expected = IOException.class)
    public void testWrite_exceedsSpecifiedSize_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("overflow.txt");
        entry.setSize(5);

        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{1, 2, 3, 4, 5, 6}, 0, 6);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_unwrittenBytes_throwsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("underflow.txt");
        entry.setSize(10);

        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{1, 2, 3});
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWrite_piecewiseAssemblyAndLargeWrites() throws IOException {
        int recordSize = tarOut.getRecordSize();
        int totalSize = recordSize * 3 + 100;
        byte[] content = new byte[totalSize];
        for (int i = 0; i < totalSize; i++) {
            content[i] = (byte) (i % 256);
        }

        TarArchiveEntry entry = new TarArchiveEntry("large_chunked.dat");
        entry.setSize(totalSize);
        tarOut.putArchiveEntry(entry);

        // 1. Write small chunk (< recordSize) -> buffers into assemBuf
        tarOut.write(content, 0, 100);

        // 2. Write another small chunk that stays in assemBuf
        tarOut.write(content, 100, 50);

        // 3. Write chunk that completes the assembly buffer and overflows
        int remainingToFillRecord = recordSize - 150;
        tarOut.write(content, 150, remainingToFillRecord + 50);

        // 4. Write full records in single calls
        int currentOffset = 150 + remainingToFillRecord + 50;
        int remaining = totalSize - currentOffset;
        tarOut.write(content, currentOffset, remaining);

        tarOut.closeArchiveEntry();
        tarOut.finish();

        Assert.assertTrue(baos.toByteArray().length >= totalSize);
    }

    @Test
    public void testWrite_singleByte() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("singlebyte.txt");
        entry.setSize(1);

        tarOut.putArchiveEntry(entry);
        tarOut.write(65); // ASCII 'A'
        tarOut.closeArchiveEntry();
        tarOut.finish();

        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testWrite_emptyArray() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("empty.txt");
        entry.setSize(0);

        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[0], 0, 0);
        tarOut.closeArchiveEntry();
        tarOut.finish();

        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testFlush() throws IOException {
        final boolean[] flushed = new boolean[]{false};
        OutputStream trackingOut = new OutputStream() {
            @Override
            public void write(int b) {
            }

            @Override
            public void flush() {
                flushed[0] = true;
            }
        };

        TarArchiveOutputStream customOut = new TarArchiveOutputStream(trackingOut);
        customOut.flush();
        Assert.assertTrue(flushed[0]);
        customOut.close();
    }

    @Test
    public void testClose_multipleCalls() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();

        tarOut.close();
        // Second close should be a no-op and not throw exceptions
        tarOut.close();
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File tempFile = File.createTempFile("tar_test", ".tmp");
        tempFile.deleteOnExit();

        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write("content".getBytes());
        fos.close();

        ArchiveEntry entry = tarOut.createArchiveEntry(tempFile, "custom_name.txt");
        Assert.assertNotNull(entry);
        Assert.assertTrue(entry instanceof TarArchiveEntry);
        Assert.assertEquals("custom_name.txt", entry.getName());
        Assert.assertEquals(tempFile.length(), entry.getSize());

        tempFile.delete();
    }

    @Test
    public void testWriteEOFRecordViaFinish() throws IOException {
        tarOut.finish();
        byte[] eofData = baos.toByteArray();
        // finish() writes 2 records of 512 zeros = 1024 bytes (or padded to block size 10240)
        Assert.assertTrue(eofData.length >= 1024);
        for (int i = 0; i < 1024; i++) {
            Assert.assertEquals(0, eofData[i]);
        }
    }
}
