package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class ZipArchiveInputStreamTest {

    private byte[] createSimpleZip(String entryName, byte[] data, int method) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry(entryName);
        entry.setMethod(method);
        entry.setSize(data.length);
        if (method == ZipArchiveOutputStream.STORED) {
            CRC32 crc = new CRC32();
            crc.update(data);
            entry.setCrc(crc.getValue());
        }
        zaos.putArchiveEntry(entry);
        zaos.write(data);
        zaos.closeArchiveEntry();
        zaos.close();
        return baos.toByteArray();
    }

    private byte[] createMultiEntryZip() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);

        ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
        entry1.setMethod(ZipArchiveOutputStream.DEFLATED);
        zaos.putArchiveEntry(entry1);
        zaos.write("Hello World 1".getBytes("UTF-8"));
        zaos.closeArchiveEntry();

        ZipArchiveEntry entry2 = new ZipArchiveEntry("file2.txt");
        entry2.setMethod(ZipArchiveOutputStream.DEFLATED);
        zaos.putArchiveEntry(entry2);
        zaos.write("Hello World 2".getBytes("UTF-8"));
        zaos.closeArchiveEntry();

        zaos.close();
        return baos.toByteArray();
    }

    @Test
    public void testMatches() {
        byte[] lfh = ZipArchiveOutputStream.LFH_SIG;
        byte[] eocd = ZipArchiveOutputStream.EOCD_SIG;
        byte[] dd = ZipArchiveOutputStream.DD_SIG;
        byte[] split = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        byte[] invalid = new byte[] {0, 0, 0, 0};

        Assert.assertTrue(ZipArchiveInputStream.matches(lfh, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(eocd, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(dd, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(split, 4));

        Assert.assertFalse(ZipArchiveInputStream.matches(lfh, 3));
        Assert.assertFalse(ZipArchiveInputStream.matches(invalid, 4));
        Assert.assertFalse(ZipArchiveInputStream.matches(new byte[] { 'P', 'K', 99, 99 }, 4));
    }

    @Test
    public void testConstructors() throws IOException {
        byte[] zipData = createSimpleZip("test.txt", "abc".getBytes("UTF-8"), ZipArchiveOutputStream.STORED);
        
        ZipArchiveInputStream in1 = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        Assert.assertNotNull(in1.getNextEntry());
        in1.close();

        ZipArchiveInputStream in2 = new ZipArchiveInputStream(new ByteArrayInputStream(zipData), "UTF-8");
        Assert.assertNotNull(in2.getNextEntry());
        in2.close();

        ZipArchiveInputStream in3 = new ZipArchiveInputStream(new ByteArrayInputStream(zipData), "UTF-8", false);
        Assert.assertNotNull(in3.getNextEntry());
        in3.close();

        ZipArchiveInputStream in4 = new ZipArchiveInputStream(new ByteArrayInputStream(zipData), "UTF-8", true, true);
        Assert.assertNotNull(in4.getNextEntry());
        in4.close();
    }

    @Test
    public void testGetNextZipEntry_emptyStream_returnsNull() throws IOException {
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(zIn.getNextZipEntry());
        Assert.assertNull(zIn.getNextEntry());
        zIn.close();
    }

    @Test
    public void testReadStoredEntry() throws IOException {
        byte[] content = "Hello Stored Zip".getBytes("UTF-8");
        byte[] zipData = createSimpleZip("test_stored.txt", content, ZipArchiveOutputStream.STORED);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zIn.getNextZipEntry();

        Assert.assertNotNull(entry);
        Assert.assertEquals("test_stored.txt", entry.getName());
        Assert.assertEquals(ZipArchiveOutputStream.STORED, entry.getMethod());

        byte[] buf = new byte[content.length];
        int readBytes = zIn.read(buf, 0, buf.length);
        Assert.assertEquals(content.length, readBytes);
        Assert.assertArrayEquals(content, buf);

        // Read at EOF of entry
        Assert.assertEquals(-1, zIn.read(buf, 0, buf.length));
        Assert.assertNull(zIn.getNextZipEntry());
        zIn.close();
    }

    @Test
    public void testReadDeflatedEntry() throws IOException {
        byte[] content = "Hello Deflated Zip Content That Is Long Enough To Compress Well".getBytes("UTF-8");
        byte[] zipData = createSimpleZip("test_deflate.txt", content, ZipArchiveOutputStream.DEFLATED);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zIn.getNextZipEntry();

        Assert.assertNotNull(entry);
        Assert.assertEquals("test_deflate.txt", entry.getName());
        Assert.assertEquals(ZipArchiveOutputStream.DEFLATED, entry.getMethod());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[16];
        int r;
        while ((r = zIn.read(buf, 0, buf.length)) != -1) {
            out.write(buf, 0, r);
        }
        Assert.assertArrayEquals(content, out.toByteArray());
        Assert.assertNull(zIn.getNextZipEntry());
        zIn.close();
    }

    @Test
    public void testSkipAndDrainMultiEntries() throws IOException {
        byte[] zipData = createMultiEntryZip();
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));

        ZipArchiveEntry entry1 = zIn.getNextZipEntry();
        Assert.assertNotNull(entry1);
        Assert.assertEquals("file1.txt", entry1.getName());

        // Skip bytes in first entry
        long skipped = zIn.skip(5);
        Assert.assertEquals(5, skipped);

        // Advance to next entry without reading remainder to test closeEntry draining
        ZipArchiveEntry entry2 = zIn.getNextZipEntry();
        Assert.assertNotNull(entry2);
        Assert.assertEquals("file2.txt", entry2.getName());

        byte[] buf = new byte[64];
        int read = zIn.read(buf, 0, buf.length);
        Assert.assertEquals("Hello World 2", new String(buf, 0, read, "UTF-8"));

        Assert.assertNull(zIn.getNextZipEntry());
        zIn.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkip_negativeValue_throwsException() throws IOException {
        byte[] zipData = createSimpleZip("file.txt", "data".getBytes("UTF-8"), ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zIn.getNextZipEntry();
        try {
            zIn.skip(-1);
        } finally {
            zIn.close();
        }
    }

    @Test
    public void testSkip_zeroOrBeyond() throws IOException {
        byte[] zipData = createSimpleZip("file.txt", "data".getBytes("UTF-8"), ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zIn.getNextZipEntry();
        Assert.assertEquals(0, zIn.skip(0));
        long skipped = zIn.skip(100);
        Assert.assertEquals(4, skipped);
        Assert.assertEquals(0, zIn.skip(10));
        zIn.close();
    }

    @Test(expected = IOException.class)
    public void testReadAfterClose_throwsIOException() throws IOException {
        byte[] zipData = createSimpleZip("file.txt", "data".getBytes("UTF-8"), ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zIn.close();
        zIn.read(new byte[10], 0, 10);
    }

    @Test
    public void testRead_whenCurrentEntryIsNull_returnsMinusOne() throws IOException {
        byte[] zipData = createSimpleZip("file.txt", "data".getBytes("UTF-8"), ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        Assert.assertEquals(-1, zIn.read(new byte[10], 0, 10));
        zIn.close();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidBounds_negativeOffset() throws IOException {
        byte[] zipData = createSimpleZip("file.txt", "data".getBytes("UTF-8"), ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zIn.getNextZipEntry();
        try {
            zIn.read(new byte[10], -1, 5);
        } finally {
            zIn.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidBounds_negativeLength() throws IOException {
        byte[] zipData = createSimpleZip("file.txt", "data".getBytes("UTF-8"), ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zIn.getNextZipEntry();
        try {
            zIn.read(new byte[10], 0, -1);
        } finally {
            zIn.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidBounds_overflow() throws IOException {
        byte[] zipData = createSimpleZip("file.txt", "data".getBytes("UTF-8"), ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zIn.getNextZipEntry();
        try {
            zIn.read(new byte[10], 5, 6);
        } finally {
            zIn.close();
        }
    }

    @Test
    public void testCanReadEntryData() {
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, false);

        ArchiveEntry nonZipEntry = new ArchiveEntry() {
            public String getName() { return "dummy"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public Date getLastModifiedDate() { return new Date(); }
        };
        Assert.assertFalse(zIn.canReadEntryData(nonZipEntry));

        ZipArchiveEntry normalStored = new ZipArchiveEntry("normalStored");
        normalStored.setMethod(ZipEntry.STORED);
        Assert.assertTrue(zIn.canReadEntryData(normalStored));

        ZipArchiveEntry storedWithDataDescriptor = new ZipArchiveEntry("storedDD");
        storedWithDataDescriptor.setMethod(ZipEntry.STORED);
        GeneralPurposeBit gp = new GeneralPurposeBit();
        gp.useDataDescriptor(true);
        storedWithDataDescriptor.setGeneralPurposeBit(gp);
        Assert.assertFalse(zIn.canReadEntryData(storedWithDataDescriptor));

        ZipArchiveInputStream zInAllowDD = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
        Assert.assertTrue(zInAllowDD.canReadEntryData(storedWithDataDescriptor));

        ZipArchiveEntry deflatedWithDD = new ZipArchiveEntry("deflatedDD");
        deflatedWithDD.setMethod(ZipEntry.DEFLATED);
        deflatedWithDD.setGeneralPurposeBit(gp);
        Assert.assertTrue(zIn.canReadEntryData(deflatedWithDD));
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testSplitArchiveSignature_throwsException() throws IOException {
        byte[] header = new byte[30];
        System.arraycopy(ZipArchiveOutputStream.DD_SIG, 0, header, 0, 4);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(header));
        try {
            zIn.getNextZipEntry();
        } finally {
            zIn.close();
        }
    }

    @Test
    public void testSingleSegmentSplitMarker() throws IOException {
        byte[] validZip = createSimpleZip("entry.txt", "abc".getBytes("UTF-8"), ZipArchiveOutputStream.STORED);
        byte[] splitMarker = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        byte[] combined = new byte[splitMarker.length + validZip.length];
        System.arraycopy(splitMarker, 0, combined, 0, splitMarker.length);
        System.arraycopy(validZip, 0, combined, splitMarker.length, validZip.length);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(combined));
        ZipArchiveEntry entry = zIn.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("entry.txt", entry.getName());
        zIn.close();
    }

    @Test
    public void testCentralDirectorySignatureFirst_skipsAndReturnsNull() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.CFH_SIG);
        for (int i = 0; i < 42; i++) {
            baos.write(0);
        }
        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        for (int i = 0; i < 18; i++) {
            baos.write(0);
        }
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Assert.assertNull(zIn.getNextZipEntry());
        zIn.close();
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testUnsupportedCompressionMethod_throwsExceptionOnRead() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[4]); // version & flags
        baos.write(new byte[] { 99, 0 }); // unsupported method = 99
        baos.write(new byte[18]); // time, crc, sizes
        baos.write(new byte[] { 4, 0 }); // filename length = 4
        baos.write(new byte[] { 0, 0 }); // extra len = 0
        baos.write("test".getBytes("UTF-8"));

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zIn.getNextZipEntry();
        Assert.assertNotNull(entry);
        try {
            zIn.read(new byte[10], 0, 10);
        } finally {
            zIn.close();
        }
    }

    @Test
    public void testUnicodeExtraFieldsHandling() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        ZipArchiveEntry entry = new ZipArchiveEntry("unicode_test.txt");
        zaos.putArchiveEntry(entry);
        zaos.write("data".getBytes("UTF-8"));
        zaos.closeArchiveEntry();
        zaos.close();

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), "ISO-8859-1", true);
        ZipArchiveEntry readEntry = zIn.getNextZipEntry();
        Assert.assertNotNull(readEntry);
        Assert.assertEquals("unicode_test.txt", readEntry.getName());
        zIn.close();
    }

    @Test
    public void testZip64ExtraFieldInLocalHeader() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[] { 45, 0 }); // version needed 4.5
        baos.write(new byte[] { 0, 0 }); // flags
        baos.write(new byte[] { 0, 0 }); // method STORED
        baos.write(new byte[] { 0, 0, 0, 0 }); // time
        baos.write(new byte[] { 0, 0, 0, 0 }); // crc
        baos.write(new byte[] { (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF }); // csize zip64 magic
        baos.write(new byte[] { (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF }); // size zip64 magic
        baos.write(new byte[] { 4, 0 }); // name len = 4
        baos.write(new byte[] { 20, 0 }); // extra field len = 20 (4 header + 16 payload)
        baos.write("z64e".getBytes("UTF-8")); // name

        // Zip64 extra field: header ID (0x0001), size (16), uncompressed (100L), compressed (100L)
        baos.write(new byte[] { 1, 0, 16, 0 });
        baos.write(new byte[] { 100, 0, 0, 0, 0, 0, 0, 0 }); // size = 100
        baos.write(new byte[] { 100, 0, 0, 0, 0, 0, 0, 0 }); // csize = 100

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry readEntry = zIn.getNextZipEntry();
        Assert.assertNotNull(readEntry);
        Assert.assertEquals(100L, readEntry.getSize());
        Assert.assertEquals(100L, readEntry.getCompressedSize());
        zIn.close();
    }

    @Test(expected = ZipException.class)
    public void testCorruptedDeflatedEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[] { 20, 0 }); // version
        baos.write(new byte[] { 0, 0 }); // flags
        baos.write(new byte[] { 8, 0 }); // DEFLATED
        baos.write(new byte[] { 0, 0, 0, 0 }); // time
        baos.write(new byte[] { 1, 2, 3, 4 }); // crc
        baos.write(new byte[] { 10, 0, 0, 0 }); // csize = 10
        baos.write(new byte[] { 20, 0, 0, 0 }); // size = 20
        baos.write(new byte[] { 4, 0 }); // name len
        baos.write(new byte[] { 0, 0 }); // extra len
        baos.write("badf".getBytes("UTF-8"));
        baos.write(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }); // invalid deflated payload

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zIn.getNextZipEntry();
        Assert.assertNotNull(entry);
        try {
            zIn.read(new byte[20], 0, 20);
        } finally {
            zIn.close();
        }
    }

    @Test(expected = EOFException.class)
    public void testDrainTruncatedEntry_throwsEOFException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[] { 20, 0 });
        baos.write(new byte[] { 0, 0 });
        baos.write(new byte[] { 0, 0 }); // STORED
        baos.write(new byte[] { 0, 0, 0, 0 });
        baos.write(new byte[] { 0, 0, 0, 0 });
        baos.write(new byte[] { 100, 0, 0, 0 }); // csize = 100
        baos.write(new byte[] { 100, 0, 0, 0 }); // size = 100
        baos.write(new byte[] { 4, 0 });
        baos.write(new byte[] { 0, 0 });
        baos.write("name".getBytes("UTF-8"));
        baos.write(new byte[] { 1, 2, 3 }); // only 3 bytes provided instead of 100

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        zIn.getNextZipEntry();
        try {
            zIn.getNextZipEntry(); // forces draining of previous entry
        } finally {
            zIn.close();
        }
    }

    @Test
    public void testDataDescriptorReadingForDeflatedEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[] { 20, 0 });
        baos.write(new byte[] { 8, 0 }); // general purpose bit 3 set (Data Descriptor)
        baos.write(new byte[] { 8, 0 }); // DEFLATED
        baos.write(new byte[] { 0, 0, 0, 0 }); // time
        baos.write(new byte[] { 0, 0, 0, 0 }); // zero crc
        baos.write(new byte[] { 0, 0, 0, 0 }); // zero csize
        baos.write(new byte[] { 0, 0, 0, 0 }); // zero size
        baos.write(new byte[] { 2, 0 }); // name len
        baos.write(new byte[] { 0, 0 }); // extra len
        baos.write("dd".getBytes("UTF-8"));

        // empty deflate stream: 0x03, 0x00
        baos.write(new byte[] { 0x03, 0x00 });

        // Data descriptor with signature
        baos.write(ZipArchiveOutputStream.DD_SIG);
        baos.write(new byte[] { 0, 0, 0, 0 }); // crc = 0
        baos.write(new byte[] { 2, 0, 0, 0 }); // csize = 2
        baos.write(new byte[] { 0, 0, 0, 0 }); // size = 0

        // Following CFH signature to trigger 4-byte descriptor recognition
        baos.write(ZipArchiveOutputStream.CFH_SIG);
        for (int i = 0; i < 42; i++) {
            baos.write(0);
        }
        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        for (int i = 0; i < 18; i++) {
            baos.write(0);
        }

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zIn.getNextZipEntry();
        Assert.assertNotNull(entry);

        byte[] buf = new byte[10];
        int r = zIn.read(buf, 0, buf.length);
        Assert.assertEquals(-1, r);

        // Advance entry to trigger readDataDescriptor
        Assert.assertNull(zIn.getNextZipEntry());
        Assert.assertEquals(2L, entry.getCompressedSize());
        zIn.close();
    }
}
