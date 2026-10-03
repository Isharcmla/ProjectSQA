package org.apache.commons.compress.archivers.dump;

import org.apache.commons.compress.archivers.ArchiveException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class DumpArchiveInputStreamTest {

    private static final int TP_SIZE = DumpArchiveConstants.TP_SIZE; // 1024
    private static final int NFS_MAGIC = DumpArchiveConstants.NFS_MAGIC; // 60012
    private static final int CHECKSUM_OFFSET = 28;

    private byte[] createHeader(int type, int count, int holes, int ino, int mode, long size, byte[] cdata) {
        byte[] header = new byte[TP_SIZE];

        // 0: date (int)
        // 4: ddate (int)
        // 8: volume (int)
        // 12: tapea (int)
        // 16: inum (int)
        DumpArchiveUtil.convert32(ino, header, 16);
        // 20: magic (int)
        DumpArchiveUtil.convert32(NFS_MAGIC, header, 20);
        // 24: checksum (int) -> calculated later
        // 28: type (int)
        DumpArchiveUtil.convert32(type, header, 28);
        // 32: date (int)
        // 36: mode (int)
        DumpArchiveUtil.convert32(mode, header, 32);
        // 40: nlink (short)
        DumpArchiveUtil.convert16(1, header, 36);
        // 44: size (long)
        DumpArchiveUtil.convert64(size, header, 40);
        // 52: count (int)
        DumpArchiveUtil.convert32(count, header, 160);
        // holes (int)
        DumpArchiveUtil.convert32(holes, header, 164);

        if (cdata != null) {
            System.arraycopy(cdata, 0, header, 168, Math.min(cdata.length, 512));
        }

        // calculate checksum
        int checksum = DumpArchiveUtil.calculateChecksum(header);
        DumpArchiveUtil.convert32(checksum, header, 24);

        return header;
    }

    private byte[] createSummaryHeader(int ntrec, boolean isCompressed) {
        byte[] header = new byte[TP_SIZE];
        DumpArchiveUtil.convert32(NFS_MAGIC, header, 20);
        DumpArchiveUtil.convert32(DumpArchiveConstants.SEGMENT_TYPE.VOLUME.code, header, 28);
        // NTRec at offset 160
        DumpArchiveUtil.convert32(ntrec, header, 160);
        // flags at 144
        int flags = isCompressed ? 0x0080 : 0x0;
        DumpArchiveUtil.convert32(flags, header, 144);

        int checksum = DumpArchiveUtil.calculateChecksum(header);
        DumpArchiveUtil.convert32(checksum, header, 24);
        return header;
    }

    private byte[] createDirentRecord(int ino, int reclen, byte type, String name) {
        byte[] record = new byte[reclen];
        DumpArchiveUtil.convert32(ino, record, 0);
        DumpArchiveUtil.convert16(reclen, record, 4);
        record[6] = type;
        record[7] = (byte) name.length();
        byte[] nameBytes = name.getBytes();
        System.arraycopy(nameBytes, 0, record, 8, nameBytes.length);
        return record;
    }

    @Test
    public void testMatches_validLengthAndMagic_returnsExpected() {
        byte[] buffer = new byte[TP_SIZE];
        Assert.assertFalse(DumpArchiveInputStream.matches(buffer, 31));

        DumpArchiveUtil.convert32(NFS_MAGIC, buffer, 24);
        Assert.assertTrue(DumpArchiveInputStream.matches(buffer, 32));

        byte[] invalidMagic = new byte[32];
        Assert.assertFalse(DumpArchiveInputStream.matches(invalidMagic, 32));

        byte[] validHeader = createSummaryHeader(1, false);
        Assert.assertTrue(DumpArchiveInputStream.matches(validHeader, TP_SIZE));

        byte[] invalidHeader = new byte[TP_SIZE];
        Assert.assertFalse(DumpArchiveInputStream.matches(invalidHeader, TP_SIZE));
    }

    @Test(expected = ArchiveException.class)
    public void testConstructor_invalidHeader_throwsArchiveException() throws Exception {
        byte[] data = new byte[TP_SIZE];
        new DumpArchiveInputStream(new ByteArrayInputStream(data));
    }

    @Test(expected = ArchiveException.class)
    public void testConstructor_invalidCLRI_throwsArchiveException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(new byte[TP_SIZE]); // Invalid CLRI

        new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
    }

    @Test(expected = ArchiveException.class)
    public void testConstructor_clriWrongSegmentType_throwsArchiveException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.BITS.code, 0, 0, 0, 0, 0, null));

        new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
    }

    @Test(expected = ArchiveException.class)
    public void testConstructor_clriEofOnSkip_throwsArchiveException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.CLRI.code, 5, 0, 0, 0, 0, null));

        new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
    }

    @Test(expected = ArchiveException.class)
    public void testConstructor_bitsWrongSegmentType_throwsArchiveException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.CLRI.code, 0, 0, 0, 0, 0, null));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.CLRI.code, 0, 0, 0, 0, 0, null));

        new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
    }

    @Test
    public void testSuccessfulInitializationAndSummary() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.CLRI.code, 0, 0, 0, 0, 0, null));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.BITS.code, 0, 0, 0, 0, 0, null));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.END.code, 0, 0, 0, 0, 0, null));

        DumpArchiveInputStream in = new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()), "UTF-8");
        Assert.assertNotNull(in.getSummary());
        Assert.assertEquals(0, in.getBytesRead());
        Assert.assertEquals(0, in.getCount());

        DumpArchiveEntry entry = in.getNextDumpEntry();
        Assert.assertNull(entry);

        entry = in.getNextEntry();
        Assert.assertNull(entry);

        byte[] buf = new byte[10];
        Assert.assertEquals(-1, in.read(buf, 0, buf.length));

        in.close();
        in.close(); // Test idempotent close
    }

    @Test
    public void testReadDirectoryAndFileEntries() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.CLRI.code, 0, 0, 0, 0, 0, null));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.BITS.code, 0, 0, 0, 0, 0, null));

        // Directory entry ino = 2 (Root directory)
        byte[] cdataDir = new byte[512];
        cdataDir[0] = 1; // 1 data block
        byte[] dirHeader = createHeader(DumpArchiveConstants.SEGMENT_TYPE.INODE.code, 1, 0, 2, 0040755, TP_SIZE, cdataDir);
        out.write(dirHeader);

        // Directory content: dirent records
        byte[] dirContent = new byte[TP_SIZE];
        ByteArrayOutputStream dirContentStream = new ByteArrayOutputStream();
        dirContentStream.write(createDirentRecord(2, 12, (byte) 4, "."));
        dirContentStream.write(createDirentRecord(2, 12, (byte) 4, ".."));
        dirContentStream.write(createDirentRecord(3, 16, (byte) 8, "test.txt"));
        dirContentStream.write(createDirentRecord(4, 16, (byte) 4, "subdir"));
        byte[] dirBytes = dirContentStream.toByteArray();
        System.arraycopy(dirBytes, 0, dirContent, 0, dirBytes.length);
        out.write(dirContent);

        // File entry ino = 3 (test.txt)
        byte[] cdataFile = new byte[512];
        cdataFile[0] = 1; // 1 data block, non-sparse
        byte[] fileHeader = createHeader(DumpArchiveConstants.SEGMENT_TYPE.INODE.code, 1, 0, 3, 0100644, 5, cdataFile);
        out.write(fileHeader);

        // File data (5 bytes padded to TP_SIZE)
        byte[] fileData = new byte[TP_SIZE];
        fileData[0] = 'H';
        fileData[1] = 'e';
        fileData[2] = 'l';
        fileData[3] = 'l';
        fileData[4] = 'o';
        out.write(fileData);

        // END record
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.END.code, 0, 0, 0, 0, 0, null));

        DumpArchiveInputStream in = new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));

        DumpArchiveEntry rootDirEntry = in.getNextDumpEntry();
        Assert.assertNotNull(rootDirEntry);
        Assert.assertTrue(rootDirEntry.isDirectory());
        Assert.assertEquals(".", rootDirEntry.getName());

        DumpArchiveEntry fileEntry = in.getNextEntry();
        Assert.assertNotNull(fileEntry);
        Assert.assertFalse(fileEntry.isDirectory());
        Assert.assertEquals("./test.txt", fileEntry.getName());
        Assert.assertEquals("test.txt", fileEntry.getSimpleName());

        byte[] readBuffer = new byte[10];
        int readBytes = in.read(readBuffer, 0, readBuffer.length);
        Assert.assertEquals(5, readBytes);
        Assert.assertEquals("Hello", new String(readBuffer, 0, readBytes));

        // Next read should return -1 (EOF for this entry)
        Assert.assertEquals(-1, in.read(readBuffer, 0, readBuffer.length));

        // END marker reached
        Assert.assertNull(in.getNextEntry());
        in.close();
    }

    @Test
    public void testSparseFileRead() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.CLRI.code, 0, 0, 0, 0, 0, null));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.BITS.code, 0, 0, 0, 0, 0, null));

        // Directory entry ino = 2
        byte[] cdataDir = new byte[512];
        cdataDir[0] = 1;
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.INODE.code, 1, 0, 2, 0040755, TP_SIZE, cdataDir));

        byte[] dirContent = new byte[TP_SIZE];
        byte[] dirent = createDirentRecord(5, 16, (byte) 8, "sparse.bin");
        System.arraycopy(dirent, 0, dirContent, 0, dirent.length);
        out.write(dirContent);

        // File entry ino = 5, size = 10, sparse record (cdata[0] = 0)
        byte[] cdataFile = new byte[512];
        cdataFile[0] = 0; // sparse block
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.INODE.code, 1, 1, 5, 0100644, 10, cdataFile));

        // END marker
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.END.code, 0, 0, 0, 0, 0, null));

        DumpArchiveInputStream in = new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
        Assert.assertNotNull(in.getNextEntry()); // Dir
        DumpArchiveEntry sparseEntry = in.getNextEntry();
        Assert.assertNotNull(sparseEntry);
        Assert.assertEquals("./sparse.bin", sparseEntry.getName());

        byte[] buf = new byte[10];
        int readBytes = in.read(buf, 0, 10);
        Assert.assertEquals(10, readBytes);
        Assert.assertArrayEquals(new byte[10], buf);

        in.close();
    }

    @Test
    public void testPendingResolutionAndQueueOrdering() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.CLRI.code, 0, 0, 0, 0, 0, null));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.BITS.code, 0, 0, 0, 0, 0, null));

        // Inode 6 defined before root directory listing gives its parent
        byte[] cdataFile = new byte[512];
        cdataFile[0] = 1;
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.INODE.code, 1, 0, 6, 0100644, 4, cdataFile));
        byte[] dummyData = new byte[TP_SIZE];
        out.write(dummyData);

        // Directory entry ino = 2 (Root) referencing ino 6
        byte[] cdataDir = new byte[512];
        cdataDir[0] = 1;
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.INODE.code, 1, 0, 2, 0040755, TP_SIZE, cdataDir));

        byte[] dirContent = new byte[TP_SIZE];
        byte[] dirent = createDirentRecord(6, 16, (byte) 8, "orphaned.txt");
        System.arraycopy(dirent, 0, dirContent, 0, dirent.length);
        out.write(dirContent);

        // END record
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.END.code, 0, 0, 0, 0, 0, null));

        DumpArchiveInputStream in = new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));

        // The queued entry should come out first
        DumpArchiveEntry queued = in.getNextEntry();
        Assert.assertNotNull(queued);
        Assert.assertEquals(6, queued.getIno());
        Assert.assertEquals("./orphaned.txt", queued.getName());

        // Then root directory
        DumpArchiveEntry root = in.getNextEntry();
        Assert.assertNotNull(root);
        Assert.assertEquals(2, root.getIno());

        Assert.assertNull(in.getNextEntry());
        in.close();
    }

    @Test
    public void testSkipRemainingRecordsAndAddrSegments() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.CLRI.code, 0, 0, 0, 0, 0, null));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.BITS.code, 0, 0, 0, 0, 0, null));

        // Root directory
        byte[] cdataDir = new byte[512];
        cdataDir[0] = 1;
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.INODE.code, 1, 0, 2, 0040755, TP_SIZE, cdataDir));
        byte[] dirContent = new byte[TP_SIZE];
        byte[] dirent1 = createDirentRecord(7, 16, (byte) 8, "file1.txt");
        System.arraycopy(dirent1, 0, dirContent, 0, dirent1.length);
        byte[] dirent2 = createDirentRecord(8, 16, (byte) 8, "file2.txt");
        System.arraycopy(dirent2, 0, dirContent, 16, dirent2.length);
        out.write(dirContent);

        // File 1 with 2 blocks (unread)
        byte[] cdataFile1 = new byte[512];
        cdataFile1[0] = 1;
        cdataFile1[1] = 1;
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.INODE.code, 2, 0, 7, 0100644, TP_SIZE * 2, cdataFile1));
        out.write(new byte[TP_SIZE]);
        out.write(new byte[TP_SIZE]);

        // ADDR segment for file 1 (should be skipped)
        byte[] cdataAddr = new byte[512];
        cdataAddr[0] = 1;
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.ADDR.code, 1, 0, 7, 0100644, TP_SIZE, cdataAddr));
        out.write(new byte[TP_SIZE]);

        // File 2
        byte[] cdataFile2 = new byte[512];
        cdataFile2[0] = 1;
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.INODE.code, 1, 0, 8, 0100644, 4, cdataFile2));
        out.write(new byte[TP_SIZE]);

        // END record
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.END.code, 0, 0, 0, 0, 0, null));

        DumpArchiveInputStream in = new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
        Assert.assertNotNull(in.getNextEntry()); // Root dir
        Assert.assertNotNull(in.getNextEntry()); // file1.txt (don't read its body)
        DumpArchiveEntry file2 = in.getNextEntry(); // Should skip file1's remaining blocks and ADDR
        Assert.assertNotNull(file2);
        Assert.assertEquals("./file2.txt", file2.getName());
        in.close();
    }

    @Test(expected = InvalidFormatException.class)
    public void testGetNextEntry_corruptHeader_throwsInvalidFormatException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(createSummaryHeader(1, false));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.CLRI.code, 0, 0, 0, 0, 0, null));
        out.write(createHeader(DumpArchiveConstants.SEGMENT_TYPE.BITS.code, 0, 0, 0, 0, 0, null));
        out.write(new byte[TP_SIZE]); // Invalid header

        DumpArchiveInputStream in = new DumpArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
        in.getNextEntry();
    }
}
