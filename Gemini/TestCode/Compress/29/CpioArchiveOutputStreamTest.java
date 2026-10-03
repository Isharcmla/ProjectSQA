package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class CpioArchiveOutputStreamTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testConstructors_validFormats() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        CpioArchiveOutputStream out1 = new CpioArchiveOutputStream(baos);
        out1.close();

        CpioArchiveOutputStream out2 = new CpioArchiveOutputStream(baos, CharsetNames.UTF_8);
        out2.close();

        CpioArchiveOutputStream out3 = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out3.close();

        CpioArchiveOutputStream out4 = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        out4.close();

        CpioArchiveOutputStream out5 = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        out5.close();

        CpioArchiveOutputStream out6 = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        out6.close();

        CpioArchiveOutputStream out7 = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW, 1024);
        out7.close();

        CpioArchiveOutputStream out8 = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW, 512, CharsetNames.US_ASCII);
        out8.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidFormat_throwsException() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        new CpioArchiveOutputStream(baos, (short) 999);
    }

    @Test
    public void testPutArchiveEntryAndWrite_formatNew_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "testfile.txt");
        byte[] content = "Hello CPIO New Format".getBytes(CharsetNames.US_ASCII);
        entry.setSize(content.length);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setTime(-1); // test default time branch

        out.putArchiveEntry(entry);
        out.write(content, 0, content.length);
        out.closeArchiveEntry();
        out.finish();
        out.close();

        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_formatNew_customInodeAndDev() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "fileWithDevInode.txt");
        entry.setSize(0);
        entry.setTime(123456L);
        entry.setInode(100);
        entry.setDeviceMin(2);
        entry.setDeviceMaj(1);
        entry.setUID(500);
        entry.setGID(500);
        entry.setNumberOfLinks(1);
        entry.setRemoteDeviceMaj(0);
        entry.setRemoteDeviceMin(0);

        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();

        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_formatNew_largeValuesTruncateAscii() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "largeVal.txt");
        entry.setSize(0);
        // Force hex string length > 8 for 8-char field to cover substring branch in writeAsciiLong
        entry.setInode(0x123456789ABCDEFL);

        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();

        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_autoClosePreviousEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file1.txt", 0);
        out.putArchiveEntry(entry1);

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file2.txt", 0);
        out.putArchiveEntry(entry2);

        out.closeArchiveEntry();
        out.close();

        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntryAndWrite_formatNewCrc_validCrc() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);

        byte[] content = "Checksum Test".getBytes(CharsetNames.US_ASCII);
        long crc = 0;
        for (byte b : content) {
            crc += b & 0xFF;
        }

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc.txt");
        entry.setSize(content.length);
        entry.setChksum(crc);
        entry.setTime(1000L);

        out.putArchiveEntry(entry);
        out.write(content);
        out.closeArchiveEntry();
        out.close();

        assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryAndWrite_formatNewCrc_invalidCrcThrowsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);

        byte[] content = "Bad CRC".getBytes(CharsetNames.US_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "badcrc.txt");
        entry.setSize(content.length);
        entry.setChksum(999999); // wrong checksum

        out.putArchiveEntry(entry);
        out.write(content);
        out.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntry_formatOldAscii_autoAndExplicitInodeDev() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);

        // Auto inode and device
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "old1.txt", 0);
        entry1.setTime(1000L);
        out.putArchiveEntry(entry1);
        out.closeArchiveEntry();

        // Explicit inode and device
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "old2.txt", 0);
        entry2.setTime(1000L);
        entry2.setInode(10);
        entry2.setDevice(5);
        entry2.setRemoteDevice(0);
        out.putArchiveEntry(entry2);
        out.closeArchiveEntry();

        out.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_formatOldBinary_autoAndExplicitInodeDev() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);

        // Auto inode and device
        byte[] content = new byte[] {1, 2, 3, 4};
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "bin1.bin", content.length);
        entry1.setTime(1000L);
        out.putArchiveEntry(entry1);
        out.write(content);
        out.closeArchiveEntry();

        // Explicit inode and device
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "bin2.bin", 0);
        entry2.setTime(1000L);
        entry2.setInode(20);
        entry2.setDevice(2);
        entry2.setRemoteDevice(0);
        out.putArchiveEntry(entry2);
        out.closeArchiveEntry();

        out.close();
        assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_formatMismatch_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "mismatch.txt");
        out.putArchiveEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_duplicateName_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup.txt", 0);
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup.txt", 0);

        out.putArchiveEntry(entry1);
        out.closeArchiveEntry();
        out.putArchiveEntry(entry2);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_whenFinished_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.finish();
        out.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt", 0));
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_whenClosed_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt", 0));
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_whenNoEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_whenFinished_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.finish();
        out.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_whenSizeMismatch_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt", 10);
        out.putArchiveEntry(entry);
        out.write(new byte[]{1, 2, 3}); // only 3 bytes written instead of 10
        out.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testWrite_whenNoEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[]{1, 2, 3}, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testWrite_whenClosed_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.write(new byte[]{1, 2, 3}, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testWrite_pastEndOfEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt", 2);
        out.putArchiveEntry(entry);
        out.write(new byte[]{1, 2, 3}, 0, 3);
    }

    @Test
    public void testWrite_zeroLength_doesNothing() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt", 0);
        out.putArchiveEntry(entry);
        out.write(new byte[0], 0, 0);
        out.closeArchiveEntry();
        out.close();
    }

    @Test
    public void testWrite_indexOutOfBoundsConditions() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt", 10);
        out.putArchiveEntry(entry);

        byte[] buf = new byte[10];

        try {
            out.write(buf, -1, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {}

        try {
            out.write(buf, 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {}

        try {
            out.write(buf, 5, 6);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {}

        out.close();
    }

    @Test(expected = IOException.class)
    public void testFinish_whenAlreadyFinished_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.finish();
        out.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "unclosed.txt", 0);
        out.putArchiveEntry(entry);
        out.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_whenClosed_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.finish();
    }

    @Test
    public void testFinish_blockPaddingCalculations() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int customBlockSize = 512;
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW, customBlockSize);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt", 5);
        out.putArchiveEntry(entry);
        out.write(new byte[]{1, 2, 3, 4, 5});
        out.closeArchiveEntry();
        out.finish();

        assertEquals(0, baos.size() % customBlockSize);
    }

    @Test
    public void testClose_multipleCalls() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.close(); // idempotent
    }

    @Test
    public void testCreateArchiveEntry_success() throws IOException {
        File file = temporaryFolder.newFile("sample.txt");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write("Hello World".getBytes(CharsetNames.US_ASCII));
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        ArchiveEntry entry = out.createArchiveEntry(file, "sample.txt");
        assertNotNull(entry);
        assertEquals("sample.txt", entry.getName());
        assertEquals(file.length(), entry.getSize());

        out.close();
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_whenFinished_throwsException() throws IOException {
        File file = temporaryFolder.newFile("sample2.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.finish();
        out.createArchiveEntry(file, "sample2.txt");
    }
}
