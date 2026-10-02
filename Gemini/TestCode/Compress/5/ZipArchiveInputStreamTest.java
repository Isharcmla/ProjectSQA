package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

public class ZipArchiveInputStreamTest {

    private byte[] createZipData(String[] names, byte[][] contents, int method) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        for (int i = 0; i < names.length; i++) {
            ZipArchiveEntry entry = new ZipArchiveEntry(names[i]);
            entry.setMethod(method);
            if (method == ZipArchiveOutputStream.STORED) {
                entry.setSize(contents[i].length);
                entry.setCompressedSize(contents[i].length);
                java.util.zip.CRC32 crc = new java.util.zip.CRC32();
                crc.update(contents[i]);
                entry.setCrc(crc.getValue());
            }
            zaos.putArchiveEntry(entry);
            zaos.write(contents[i]);
            zaos.closeArchiveEntry();
        }
        zaos.close();
        return baos.toByteArray();
    }

    @Test
    public void testMatches_validSignatures_returnsTrue() {
        byte[] lfhSig = new byte[]{0x50, 0x4b, 0x03, 0x04};
        byte[] eocdSig = new byte[]{0x50, 0x4b, 0x05, 0x06, 0x00, 0x00};

        Assert.assertTrue(ZipArchiveInputStream.matches(lfhSig, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(eocdSig, 6));
    }

    @Test
    public void testMatches_invalidOrShortSignatures_returnsFalse() {
        byte[] shortSig = new byte[]{0x50, 0x4b, 0x03};
        byte[] invalidSig = new byte[]{0x50, 0x4b, 0x00, 0x00};
        byte[] emptySig = new byte[0];

        Assert.assertFalse(ZipArchiveInputStream.matches(shortSig, 3));
        Assert.assertFalse(ZipArchiveInputStream.matches(invalidSig, 4));
        Assert.assertFalse(ZipArchiveInputStream.matches(emptySig, 0));
        Assert.assertFalse(ZipArchiveInputStream.matches(new byte[]{0x50, 0x4b, 0x03, 0x04}, 2));
    }

    @Test
    public void testConstructor_singleArg_initializesCorrectly() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        zis.close();
    }

    @Test
    public void testConstructor_threeArgs_customEncoding() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData), "UTF-8", false);
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        zis.close();
    }

    @Test
    public void testGetNextEntry_storedAndDeflatedEntries_success() throws IOException {
        String[] names = new String[]{"file1.txt", "file2.txt"};
        byte[][] contents = new byte[][]{"Content of file 1".getBytes(), "Content of file 2 with deflated data".getBytes()};

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);

        ZipArchiveEntry entry1 = new ZipArchiveEntry(names[0]);
        entry1.setMethod(ZipArchiveOutputStream.STORED);
        entry1.setSize(contents[0].length);
        entry1.setCompressedSize(contents[0].length);
        java.util.zip.CRC32 crc = new java.util.zip.CRC32();
        crc.update(contents[0]);
        entry1.setCrc(crc.getValue());
        zaos.putArchiveEntry(entry1);
        zaos.write(contents[0]);
        zaos.closeArchiveEntry();

        ZipArchiveEntry entry2 = new ZipArchiveEntry(names[1]);
        entry2.setMethod(ZipArchiveOutputStream.DEFLATED);
        zaos.putArchiveEntry(entry2);
        zaos.write(contents[1]);
        zaos.closeArchiveEntry();
        zaos.close();

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));

        ArchiveEntry readEntry1 = zis.getNextEntry();
        Assert.assertNotNull(readEntry1);
        Assert.assertEquals("file1.txt", readEntry1.getName());
        byte[] buf1 = new byte[contents[0].length];
        int read1 = zis.read(buf1, 0, buf1.length);
        Assert.assertEquals(contents[0].length, read1);
        Assert.assertArrayEquals(contents[0], buf1);

        ArchiveEntry readEntry2 = zis.getNextEntry();
        Assert.assertNotNull(readEntry2);
        Assert.assertEquals("file2.txt", readEntry2.getName());
        byte[] buf2 = new byte[contents[1].length];
        int read2 = zis.read(buf2, 0, buf2.length);
        Assert.assertEquals(contents[1].length, read2);
        Assert.assertArrayEquals(contents[1], buf2);

        Assert.assertNull(zis.getNextEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_emptyStream_returnsNull() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_centralDirectoryDirectly_returnsNull() throws IOException {
        byte[] cdSig = new byte[]{
                0x50, 0x4b, 0x01, 0x02, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00
        };
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(cdSig));
        Assert.assertNull(zis.getNextZipEntry());
        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_corruptedSignature_returnsNull() throws IOException {
        byte[] invalidHeader = new byte[30];
        invalidHeader[0] = 0x50;
        invalidHeader[1] = 0x4b;
        invalidHeader[2] = 0x09;
        invalidHeader[3] = 0x09;
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(invalidHeader));
        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_afterClose_returnsNull() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.close();
        Assert.assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testRead_noCurrentEntry_returnsMinusOne() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        byte[] buf = new byte[10];
        Assert.assertEquals(-1, zis.read(buf, 0, buf.length));
        zis.close();
    }

    @Test(expected = IOException.class)
    public void testRead_afterClose_throwsIOException() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        zis.close();
        zis.read(new byte[10], 0, 10);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidBounds_negativeOffset_throwsException() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        try {
            zis.read(new byte[10], -1, 5);
        } finally {
            zis.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidBounds_negativeLength_throwsException() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        try {
            zis.read(new byte[10], 0, -1);
        } finally {
            zis.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidBounds_lengthExceedsBuffer_throwsException() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        try {
            zis.read(new byte[10], 5, 6);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testRead_storedEntryPartialReads_success() throws IOException {
        byte[] content = "0123456789ABCDEF".getBytes();
        byte[] zipData = createZipData(new String[]{"stored.txt"}, new byte[][]{content}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();

        byte[] dest = new byte[content.length];
        int read1 = zis.read(dest, 0, 5);
        Assert.assertEquals(5, read1);
        int read2 = zis.read(dest, 5, 5);
        Assert.assertEquals(5, read2);
        int read3 = zis.read(dest, 10, 10);
        Assert.assertEquals(6, read3);
        int readEof = zis.read(dest, 0, 5);
        Assert.assertEquals(-1, readEof);
        Assert.assertArrayEquals(content, dest);
        zis.close();
    }

    @Test
    public void testRead_storedEntryEmptyContent_returnsMinusOne() throws IOException {
        byte[] zipData = createZipData(new String[]{"empty.txt"}, new byte[][]{new byte[0]}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        Assert.assertEquals(-1, zis.read(buf, 0, buf.length));
        zis.close();
    }

    @Test
    public void testRead_deflatedEntryFullAndEof() throws IOException {
        byte[] content = "Deflated content test string repeated for compression. Deflated content test string repeated for compression.".getBytes();
        byte[] zipData = createZipData(new String[]{"deflated.txt"}, new byte[][]{content}, ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();

        byte[] dest = new byte[content.length * 2];
        int total = 0;
        int read;
        while ((read = zis.read(dest, total, dest.length - total)) != -1) {
            total += read;
        }
        Assert.assertEquals(content.length, total);
        byte[] actual = new byte[total];
        System.arraycopy(dest, 0, actual, 0, total);
        Assert.assertArrayEquals(content, actual);
        Assert.assertEquals(-1, zis.read(dest, 0, 10));
        zis.close();
    }

    @Test
    public void testRead_deflatedEntryZeroBytesToRead_returnsZero() throws IOException {
        byte[] content = "Testing 0 bytes read".getBytes();
        byte[] zipData = createZipData(new String[]{"deflated.txt"}, new byte[][]{content}, ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        int read = zis.read(buf, 0, 0);
        Assert.assertEquals(0, read);
        zis.close();
    }

    @Test
    public void testSkip_normalAndZero() throws IOException {
        byte[] content = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes();
        byte[] zipData = createZipData(new String[]{"skip.txt"}, new byte[][]{content}, ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();

        long skipped0 = zis.skip(0);
        Assert.assertEquals(0, skipped0);

        long skipped10 = zis.skip(10);
        Assert.assertEquals(10, skipped10);

        byte[] rem = new byte[content.length - 10];
        int read = zis.read(rem, 0, rem.length);
        Assert.assertEquals(rem.length, read);
        for (int i = 0; i < rem.length; i++) {
            Assert.assertEquals(content[i + 10], rem[i]);
        }

        long skippedPastEof = zis.skip(100);
        Assert.assertEquals(0, skippedPastEof);

        zis.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkip_negativeValue_throwsException() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        try {
            zis.skip(-1);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testClose_multipleCalls_noException() throws IOException {
        byte[] zipData = createZipData(new String[]{"test.txt"}, new byte[][]{"Hello".getBytes()}, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.close();
        zis.close();
    }

    @Test
    public void testCloseEntry_skipsRemainingDataAutomatically() throws IOException {
        byte[] data1 = "First entry data that is long enough to leave unread".getBytes();
        byte[] data2 = "Second entry data".getBytes();
        byte[] zipData = createZipData(new String[]{"f1.txt", "f2.txt"}, new byte[][]{data1, data2}, ZipArchiveOutputStream.DEFLATED);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry1 = zis.getNextZipEntry();
        Assert.assertEquals("f1.txt", entry1.getName());
        byte[] partial = new byte[5];
        int read = zis.read(partial, 0, 5);
        Assert.assertEquals(5, read);

        ZipArchiveEntry entry2 = zis.getNextZipEntry();
        Assert.assertEquals("f2.txt", entry2.getName());
        byte[] full2 = new byte[data2.length];
        int read2 = zis.read(full2, 0, full2.length);
        Assert.assertEquals(data2.length, read2);
        Assert.assertArrayEquals(data2, full2);

        zis.close();
    }

    @Test
    public void testCloseEntry_storedEntryPartialRead_skipsCorrectly() throws IOException {
        byte[] data1 = "Stored data 1234567890".getBytes();
        byte[] data2 = "Stored second data".getBytes();
        byte[] zipData = createZipData(new String[]{"s1.txt", "s2.txt"}, new byte[][]{data1, data2}, ZipArchiveOutputStream.STORED);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry1 = zis.getNextZipEntry();
        Assert.assertEquals("s1.txt", entry1.getName());
        byte[] partial = new byte[4];
        zis.read(partial, 0, 4);

        ZipArchiveEntry entry2 = zis.getNextZipEntry();
        Assert.assertEquals("s2.txt", entry2.getName());
        byte[] full2 = new byte[data2.length];
        int read2 = zis.read(full2, 0, full2.length);
        Assert.assertEquals(data2.length, read2);
        Assert.assertArrayEquals(data2, full2);

        zis.close();
    }

    @Test
    public void testUnicodeExtraFields_enabledAndDisabled() throws IOException {
        String utf8Name = "t\u00e9st.txt";
        byte[] content = "Unicode test content".getBytes();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        zaos.setEncoding("CP437");
        ZipArchiveEntry entry = new ZipArchiveEntry(utf8Name);
        zaos.putArchiveEntry(entry);
        zaos.write(content);
        zaos.closeArchiveEntry();
        zaos.close();

        byte[] zipBytes = baos.toByteArray();

        ZipArchiveInputStream zisWithUnicode = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes), "CP437", true);
        ZipArchiveEntry readEntryUnicode = zisWithUnicode.getNextZipEntry();
        Assert.assertEquals(utf8Name, readEntryUnicode.getName());
        zisWithUnicode.close();

        ZipArchiveInputStream zisWithoutUnicode = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes), "CP437", false);
        ZipArchiveEntry readEntryNoUnicode = zisWithoutUnicode.getNextZipEntry();
        Assert.assertNotNull(readEntryNoUnicode);
        zisWithoutUnicode.close();
    }

    @Test(expected = ZipException.class)
    public void testRead_corruptedDeflatedData_throwsZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("corrupt.txt");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        zaos.putArchiveEntry(entry);
        zaos.write("Valid data to compress".getBytes());
        zaos.closeArchiveEntry();
        zaos.close();

        byte[] validZip = baos.toByteArray();
        byte[] corruptZip = validZip.clone();
        for (int i = 30 + "corrupt.txt".getBytes().length; i < corruptZip.length - 22; i++) {
            corruptZip[i] = (byte) 0xFF;
        }

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(corruptZip));
        zis.getNextZipEntry();
        byte[] buffer = new byte[100];
        try {
            while (zis.read(buffer, 0, buffer.length) != -1) {
            }
        } finally {
            zis.close();
        }
    }
}
