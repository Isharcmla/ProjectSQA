package org.apache.commons.compress.archivers.cpio;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class CpioArchiveOutputStreamTest {

    @Test
    public void testConstructor_defaultFormat_success() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(0);
        out.putNextEntry(entry);
        out.closeArchiveEntry();
        out.close();
        Assert.assertTrue(baos.toByteArray().length > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidFormat_throwsIllegalArgumentException() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        new CpioArchiveOutputStream(baos, (short) 999);
    }

    @Test
    public void testPutNextEntry_formatNew_writesExpectedData() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file1.txt", 4);
        entry.setInode(1);
        entry.setMode(0100644);
        entry.setUID(1000);
        entry.setGID(1000);
        entry.setNumberOfLinks(1);
        entry.setTime(100000L);
        entry.setDeviceMaj(1);
        entry.setDeviceMin(2);
        entry.setRemoteDeviceMaj(0);
        entry.setRemoteDeviceMin(0);

        out.putNextEntry(entry);
        out.write(new byte[]{1, 2, 3, 4});
        out.closeArchiveEntry();
        out.finish();
        out.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutNextEntry_formatNewLargeValues_handlesAsciiSubstring() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "large.txt", 0);
        // Exceeds 8 hex chars (0x100000000L = 9 hex chars: "100000000")
        entry.setInode(0x100000000L);
        entry.setTime(12345L);
        out.putNextEntry(entry);
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutNextEntry_formatNewCrc_validChecksum_success() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);

        byte[] data = new byte[]{10, 20, 30};
        long crc = 10 + 20 + 30; // 60

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc.txt", data.length);
        entry.setChksum(crc);
        entry.setTime(1000L);

        out.putNextEntry(entry);
        out.write(data, 0, data.length);
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_formatNewCrc_invalidChecksum_throwsIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);

        byte[] data = new byte[]{1, 2, 3};
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc_bad.txt", data.length);
        entry.setChksum(9999); // Wrong checksum

        out.putNextEntry(entry);
        out.write(data);
        out.closeArchiveEntry();
    }

    @Test
    public void testPutNextEntry_formatOldAscii_success() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "old_ascii.txt", 2);
        entry.setDevice(1);
        entry.setInode(2);
        entry.setMode(0100644);
        entry.setUID(500);
        entry.setGID(500);
        entry.setNumberOfLinks(1);
        entry.setRemoteDevice(0);
        entry.setTime(5000L);

        out.putNextEntry(entry);
        out.write(new byte[]{65, 66});
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutNextEntry_formatOldBinary_success() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);

        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "old_bin.txt", 3);
        entry.setDevice(1);
        entry.setInode(2);
        entry.setMode(0100644);
        entry.setUID(500);
        entry.setGID(500);
        entry.setNumberOfLinks(1);
        entry.setRemoteDevice(0);
        entry.setTime(5000L);

        out.putNextEntry(entry);
        out.write(new byte[]{1, 2, 3});
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_interfaceMethod_delegatesProperly() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        ArchiveEntry entry = new CpioArchiveEntry("delegate.txt", 0);
        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutNextEntry_autoClosesPreviousActiveEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        CpioArchiveEntry entry1 = new CpioArchiveEntry("file1.txt", 0);
        out.putNextEntry(entry1);

        CpioArchiveEntry entry2 = new CpioArchiveEntry("file2.txt", 0);
        out.putNextEntry(entry2);

        out.closeArchiveEntry();
        out.close();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testPutNextEntry_duplicateName_throwsIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        CpioArchiveEntry entry1 = new CpioArchiveEntry("duplicate.txt", 0);
        out.putNextEntry(entry1);
        out.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry("duplicate.txt", 0);
        out.putNextEntry(entry2);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_unwrittenBytesMismatch_throwsIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        CpioArchiveEntry entry = new CpioArchiveEntry("size_mismatch.txt", 10);
        out.putNextEntry(entry);
        out.write(new byte[]{1, 2, 3}); // only 3 bytes written instead of 10
        out.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testWrite_withoutActiveEntry_throwsIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[]{1, 2, 3}, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testWrite_pastEndOfEntrySize_throwsIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        CpioArchiveEntry entry = new CpioArchiveEntry("overflow.txt", 2);
        out.putNextEntry(entry);
        out.write(new byte[]{1, 2, 3});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_negativeOffset_throwsIndexOutOfBoundsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[5], -1, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_negativeLength_throwsIndexOutOfBoundsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[5], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_offsetPlusLengthOverflow_throwsIndexOutOfBoundsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[5], 3, 3);
    }

    @Test
    public void testWrite_lengthZero_doesNothing() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[5], 0, 0);
        out.close();
        Assert.assertEquals(0, baos.size());
    }

    @Test
    public void testWrite_singleByte() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(65);
        Assert.assertEquals(1, baos.size());
        Assert.assertEquals(65, baos.toByteArray()[0]);
        out.close();
    }

    @Test
    public void testFinish_multipleCallsAndActiveEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);

        CpioArchiveEntry entry = new CpioArchiveEntry("finish_test.txt", 0);
        out.putNextEntry(entry);
        out.finish();
        int sizeAfterFirstFinish = baos.size();
        out.finish();
        Assert.assertEquals(sizeAfterFirstFinish, baos.size());
        out.close();
    }

    @Test
    public void testClose_multipleCalls_idempotent() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.close();
    }

    @Test(expected = IOException.class)
    public void testEnsureOpen_putNextEntryAfterClose_throwsIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.putNextEntry(new CpioArchiveEntry("closed.txt", 0));
    }

    @Test(expected = IOException.class)
    public void testEnsureOpen_writeAfterClose_throwsIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.write(new byte[]{1});
    }

    @Test(expected = IOException.class)
    public void testEnsureOpen_closeArchiveEntryAfterClose_throwsIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testEnsureOpen_finishAfterClose_throwsIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.finish();
    }
}
