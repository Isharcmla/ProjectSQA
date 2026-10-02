package org.apache.commons.compress.archivers.cpio;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

public class CpioArchiveOutputStreamTest {

    @Test
    public void testConstructor_defaultFormat() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test.txt");
        entry.setSize(0);
        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();
        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidFormat_throwsException() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        new CpioArchiveOutputStream(baos, (short) 999);
    }

    @Test
    public void testWrite_formatNew_success() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file1.txt");
        byte[] content = "Hello New Format".getBytes();
        entry.setSize(content.length);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setTime(System.currentTimeMillis() / 1000);
        entry.setDeviceMaj(1);
        entry.setDeviceMin(2);
        entry.setRemoteDeviceMaj(3);
        entry.setRemoteDeviceMin(4);
        entry.setInode(100);
        entry.setUID(500);
        entry.setGID(500);
        entry.setNumberOfLinks(1);

        out.putArchiveEntry(entry);
        out.write(content, 0, content.length);
        out.closeArchiveEntry();

        out.finish();
        out.close();

        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testWrite_formatNewCrc_success() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc_file.txt");
        byte[] content = "Testing CRC calculation".getBytes();
        entry.setSize(content.length);

        long expectedCrc = 0;
        for (byte b : content) {
            expectedCrc += (b & 0xFF);
        }
        entry.setChksum(expectedCrc);

        out.putArchiveEntry(entry);
        out.write(content);
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test(expected = IOException.class)
    public void testWrite_formatNewCrc_crcMismatch_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc_fail.txt");
        byte[] content = "Mismatch CRC".getBytes();
        entry.setSize(content.length);
        entry.setChksum(12345L); // Incorrect checksum

        out.putArchiveEntry(entry);
        out.write(content);
        out.closeArchiveEntry(); // Should throw IOException("CRC Error")
    }

    @Test
    public void testWrite_formatOldAscii_success() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "old_ascii.txt");
        byte[] content = "Old ASCII Content".getBytes();
        entry.setSize(content.length);
        entry.setDevice(1);
        entry.setInode(2);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setUID(10);
        entry.setGID(10);
        entry.setNumberOfLinks(1);
        entry.setRemoteDevice(0);
        entry.setTime(1000L);

        out.putArchiveEntry(entry);
        out.write(content, 0, content.length);
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testWrite_formatOldBinary_success() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "old_binary.bin");
        byte[] content = new byte[]{1, 2, 3, 4, 5};
        entry.setSize(content.length);
        entry.setDevice(1);
        entry.setInode(2);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setUID(10);
        entry.setGID(10);
        entry.setNumberOfLinks(1);
        entry.setRemoteDevice(0);
        entry.setTime(1000L);

        out.putArchiveEntry(entry);
        out.write(content);
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testPutArchiveEntry_defaultTimeSet() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "no_time.txt");
        entry.setTime(-1);
        entry.setSize(0);

        out.putArchiveEntry(entry);
        Assert.assertNotEquals(-1, entry.getTime());
        out.close();
    }

    @Test
    public void testPutArchiveEntry_autoClosesPreviousEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file1.txt");
        entry1.setSize(0);
        out.putArchiveEntry(entry1);

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file2.txt");
        entry2.setSize(0);
        out.putArchiveEntry(entry2);

        out.closeArchiveEntry();
        out.close();
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_formatMismatch_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "mismatch.txt");
        out.putArchiveEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_duplicateEntryName_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "duplicate.txt");
        entry1.setSize(0);
        out.putArchiveEntry(entry1);
        out.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "duplicate.txt");
        entry2.setSize(0);
        out.putArchiveEntry(entry2);
    }

    @Test(expected = ClassCastException.class)
    public void testPutArchiveEntry_nonCpioArchiveEntry_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        ArchiveEntry nonCpioEntry = new ArchiveEntry() {
            @Override
            public String getName() {
                return "test";
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public boolean isDirectory() {
                return false;
            }

            @Override
            public Date getLastModifiedDate() {
                return new Date();
            }
        };

        out.putArchiveEntry(nonCpioEntry);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_streamClosed_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "closed.txt");
        out.putArchiveEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_sizeMismatch_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "size_mismatch.txt");
        entry.setSize(10);
        out.putArchiveEntry(entry);
        out.write(new byte[]{1, 2, 3}); // only 3 bytes written instead of 10

        out.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_streamClosed_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testWrite_noCurrentEntry_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        out.write(new byte[]{1, 2, 3}, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testWrite_pastEndOfEntry_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "overflow.txt");
        entry.setSize(2);
        out.putArchiveEntry(entry);

        out.write(new byte[]{1, 2, 3}, 0, 3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_negativeOffset_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[10], -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_negativeLength_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[10], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_offsetPlusLengthExceedsBuffer_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[10], 6, 5);
    }

    @Test
    public void testWrite_zeroLength_doesNothing() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "zero_len.txt");
        entry.setSize(5);
        out.putArchiveEntry(entry);

        int bytesBefore = baos.size();
        out.write(new byte[10], 0, 0);
        Assert.assertEquals(bytesBefore, baos.size());
        out.write(new byte[]{1, 2, 3, 4, 5});
        out.closeArchiveEntry();
        out.close();
    }

    @Test(expected = IOException.class)
    public void testWrite_streamClosed_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.write(new byte[]{1}, 0, 1);
    }

    @Test(expected = IOException.class)
    public void testFinish_unclosedEntry_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "unclosed.txt");
        entry.setSize(5);
        out.putArchiveEntry(entry);

        out.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_streamClosed_throwsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.finish();
    }

    @Test
    public void testClose_calledMultipleTimes_isIdempotent() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.close(); // Second close should not throw exception
    }

    @Test
    public void testCreateArchiveEntry_withFile() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        File tempFile = File.createTempFile("cpio_test", ".tmp");
        tempFile.deleteOnExit();

        ArchiveEntry entry = out.createArchiveEntry(tempFile, "entry_name.txt");
        Assert.assertNotNull(entry);
        Assert.assertEquals("entry_name.txt", entry.getName());
        Assert.assertTrue(entry instanceof CpioArchiveEntry);

        out.close();
    }

    @Test
    public void testWriteAsciiLong_overflowTruncation() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "overflow.txt");
        // Device in old ascii format is 6 octal chars (max 0777777 = 262143). Pass a larger value to trigger substring trimming
        entry.setDevice(0xFFFFFF);
        entry.setSize(0);

        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.toByteArray().length > 0);
    }
}
