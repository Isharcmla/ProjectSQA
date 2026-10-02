package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TarArchiveOutputStreamTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testConstructor_oneArg() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
        tos.close();
    }

    @Test
    public void testConstructor_twoArgs() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, TarBuffer.DEFAULT_BLKSIZE);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
        tos.close();
    }

    @Test
    public void testConstructor_threeArgsAndGetRecordSize() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int recordSize = 512;
        int blockSize = 1024;
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, blockSize, recordSize);
        Assert.assertEquals(recordSize, tos.getRecordSize());
        tos.close();
    }

    @Test
    public void testCreateArchiveEntry_success() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        File tempFile = temporaryFolder.newFile("test.txt");
        ArchiveEntry entry = tos.createArchiveEntry(tempFile, "entryName.txt");

        Assert.assertNotNull(entry);
        Assert.assertTrue(entry instanceof TarArchiveEntry);
        Assert.assertEquals("entryName.txt", entry.getName());
        tos.close();
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_afterFinished_throwsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();

        File tempFile = temporaryFolder.newFile("test.txt");
        tos.createArchiveEntry(tempFile, "entryName.txt");
    }

    @Test
    public void testPutArchiveEntry_normalFileAndWrite() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] content = "Hello Tar".getBytes();
        entry.setSize(content.length);

        tos.putArchiveEntry(entry);
        tos.write(content, 0, content.length);
        tos.closeArchiveEntry();

        tos.finish();
        tos.close();

        byte[] result = bos.toByteArray();
        Assert.assertTrue(result.length > 0);
    }

    @Test
    public void testPutArchiveEntry_directory() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir/");
        dirEntry.setSize(100); // Directory size should be forced to 0 internally

        tos.putArchiveEntry(dirEntry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();

        Assert.assertTrue(bos.toByteArray().length > 0);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterFinished_throwsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testPutArchiveEntry_longFileNameErrorMode_throwsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            longName.append("a");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testPutArchiveEntry_longFileNameTruncateMode() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);

        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            longName.append("a");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();

        Assert.assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testPutArchiveEntry_longFileNameGnuMode() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            longName.append("b");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        byte[] data = "gnu long name test content".getBytes();
        entry.setSize(data.length);

        tos.putArchiveEntry(entry);
        tos.write(data, 0, data.length);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();

        Assert.assertTrue(bos.toByteArray().length > 0);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_whenNoEntryOpen_throwsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_afterFinished_throwsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_beforeWritingSpecifiedSize_throwsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(100);

        tos.putArchiveEntry(entry);
        tos.write(new byte[50], 0, 50);
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testWrite_exceedsSpecifiedSize_throwsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);

        tos.putArchiveEntry(entry);
        tos.write(new byte[15], 0, 15);
    }

    @Test
    public void testWrite_multipleSmallChunksAssemblingRecords() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        int totalSize = 1200;
        TarArchiveEntry entry = new TarArchiveEntry("chunk_test.dat");
        entry.setSize(totalSize);
        tos.putArchiveEntry(entry);

        byte[] chunk = new byte[300];
        tos.write(chunk, 0, 300); // 300 bytes in assemBuf
        tos.write(chunk, 0, 300); // Fills 512 bytes recordBuf, remaining 88 bytes in assemBuf
        tos.write(chunk, 0, 300); // 88 + 300 = 388 bytes in assemBuf
        tos.write(chunk, 0, 300); // 388 + 300 = 688 -> fills 512 bytes, remaining 176 in assemBuf

        tos.closeArchiveEntry(); // Flushes remaining 176 bytes padded to record size
        tos.finish();
        tos.close();

        Assert.assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testWrite_largeRecordDirectWrite() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        int totalSize = 1536; // 3 full records (512 * 3)
        TarArchiveEntry entry = new TarArchiveEntry("large_test.dat");
        entry.setSize(totalSize);
        tos.putArchiveEntry(entry);

        byte[] largeChunk = new byte[1536];
        tos.write(largeChunk, 0, largeChunk.length);

        tos.closeArchiveEntry();
        tos.finish();
        tos.close();

        Assert.assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testWrite_singleByteAndEmptyArray() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("test.dat");
        entry.setSize(1);
        tos.putArchiveEntry(entry);

        tos.write(new byte[0]); // empty array write
        tos.write(65);          // single byte write (ArchiveOutputStream.write(int))

        tos.closeArchiveEntry();
        tos.finish();
        tos.close();

        Assert.assertTrue(bos.toByteArray().length > 0);
    }

    @Test(expected = IOException.class)
    public void testFinish_whenHaveUnclosedEntry_throwsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);

        tos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_calledTwice_throwsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        tos.finish();
    }

    @Test
    public void testClose_withoutFinish_finishesAndClosesSuccessfully() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();

        tos.close();
        tos.close(); // Double close check
        Assert.assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testFlush_delegatesToOutputStream() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.flush();
        tos.close();
    }
}
