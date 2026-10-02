package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class ZipArchiveInputStreamTest {

    @Test
    public void testMatches_validSignatures_returnsTrue() {
        byte[] lfhSig = new byte[]{0x50, 0x4b, 0x03, 0x04};
        byte[] eocdSig = new byte[]{0x50, 0x4b, 0x05, 0x06};
        byte[] ddSig = new byte[]{0x50, 0x4b, 0x07, 0x08};
        byte[] singleSegmentMarker = new byte[]{0x50, 0x4b, 0x30, 0x30};

        Assert.assertTrue(ZipArchiveInputStream.matches(lfhSig, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(eocdSig, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ddSig, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(singleSegmentMarker, 4));
    }

    @Test
    public void testMatches_invalidLengthOrSignature_returnsFalse() {
        byte[] lfhSig = new byte[]{0x50, 0x4b, 0x03, 0x04};
        byte[] invalidSig = new byte[]{0x00, 0x00, 0x00, 0x00};

        Assert.assertFalse(ZipArchiveInputStream.matches(lfhSig, 3));
        Assert.assertFalse(ZipArchiveInputStream.matches(invalidSig, 4));
        Assert.assertFalse(ZipArchiveInputStream.matches(new byte[]{0x50, 0x4b, 0x03, 0x00}, 4));
    }

    @Test
    public void testConstructors_variousSignatures_success() throws IOException {
        byte[] empty = new byte[0];

        try (ZipArchiveInputStream in1 = new ZipArchiveInputStream(new ByteArrayInputStream(empty))) {
            Assert.assertEquals(0, in1.getBytesRead());
        }
        try (ZipArchiveInputStream in2 = new ZipArchiveInputStream(new ByteArrayInputStream(empty), "UTF-8")) {
            Assert.assertEquals("UTF-8", in2.encoding);
        }
        try (ZipArchiveInputStream in3 = new ZipArchiveInputStream(new ByteArrayInputStream(empty), "UTF-8", true)) {
            Assert.assertEquals("UTF-8", in3.encoding);
        }
        try (ZipArchiveInputStream in4 = new ZipArchiveInputStream(new ByteArrayInputStream(empty), null, false, true)) {
            Assert.assertNull(in4.encoding);
        }
    }

    @Test
    public void testGetNextZipEntry_emptyStream_returnsNull() throws IOException {
        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            Assert.assertNull(in.getNextZipEntry());
            Assert.assertNull(in.getNextEntry());
        }
    }

    @Test
    public void testGetNextZipEntry_closedStream_returnsNull() throws IOException {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        Assert.assertNull(in.getNextZipEntry());
    }

    @Test
    public void testRead_storedEntry_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
            entry.setMethod(ZipEntry.STORED);
            byte[] content = "Hello World Stored".getBytes(StandardCharsets.UTF_8);
            entry.setSize(content.length);
            entry.setCompressedSize(content.length);
            CRC32 crc = new CRC32();
            crc.update(content);
            entry.setCrc(crc.getValue());

            zos.putArchiveEntry(entry);
            zos.write(content);
            zos.closeArchiveEntry();
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            ZipArchiveEntry entry = in.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("test.txt", entry.getName());
            Assert.assertEquals(ZipEntry.STORED, entry.getMethod());
            Assert.assertTrue(in.canReadEntryData(entry));

            byte[] buf = new byte[1024];
            int read = in.read(buf, 0, buf.length);
            Assert.assertEquals("Hello World Stored", new String(buf, 0, read, StandardCharsets.UTF_8));
            Assert.assertEquals(-1, in.read(buf, 0, buf.length));
            Assert.assertNull(in.getNextZipEntry());
        }
    }

    @Test
    public void testRead_deflatedEntry_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("deflated.txt");
            entry.setMethod(ZipEntry.DEFLATED);
            byte[] content = "Hello World Deflated! Repeating content to allow compression... Hello World Deflated!".getBytes(StandardCharsets.UTF_8);

            zos.putArchiveEntry(entry);
            zos.write(content);
            zos.closeArchiveEntry();
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            ZipArchiveEntry entry = (ZipArchiveEntry) in.getNextEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("deflated.txt", entry.getName());
            Assert.assertEquals(ZipEntry.DEFLATED, entry.getMethod());

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[16];
            int r;
            while ((r = in.read(buf, 0, buf.length)) != -1) {
                out.write(buf, 0, r);
            }
            Assert.assertEquals("Hello World Deflated! Repeating content to allow compression... Hello World Deflated!",
                    new String(out.toByteArray(), StandardCharsets.UTF_8));
            Assert.assertNull(in.getNextEntry());
        }
    }

    @Test
    public void testRead_multipleEntries_sequentialRead() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry1 = new ZipArchiveEntry("entry1.txt");
            zos.putArchiveEntry(entry1);
            zos.write("Content1".getBytes(StandardCharsets.UTF_8));
            zos.closeArchiveEntry();

            ZipArchiveEntry entry2 = new ZipArchiveEntry("entry2.txt");
            zos.putArchiveEntry(entry2);
            zos.write("Content2".getBytes(StandardCharsets.UTF_8));
            zos.closeArchiveEntry();
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            ZipArchiveEntry e1 = in.getNextZipEntry();
            Assert.assertNotNull(e1);
            Assert.assertEquals("entry1.txt", e1.getName());

            ZipArchiveEntry e2 = in.getNextZipEntry();
            Assert.assertNotNull(e2);
            Assert.assertEquals("entry2.txt", e2.getName());
            byte[] buf = new byte[64];
            int r = in.read(buf, 0, buf.length);
            Assert.assertEquals("Content2", new String(buf, 0, r, StandardCharsets.UTF_8));

            Assert.assertNull(in.getNextZipEntry());
        }
    }

    @Test
    public void testSkip_validValues_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("skip.txt");
            zos.putArchiveEntry(entry);
            zos.write("0123456789ABCDEF".getBytes(StandardCharsets.UTF_8));
            zos.closeArchiveEntry();
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            in.getNextZipEntry();
            long skipped = in.skip(4);
            Assert.assertEquals(4, skipped);

            byte[] buf = new byte[6];
            int r = in.read(buf, 0, buf.length);
            Assert.assertEquals(6, r);
            Assert.assertEquals("456789", new String(buf, 0, r, StandardCharsets.UTF_8));

            long skipMore = in.skip(100);
            Assert.assertEquals(6, skipMore);
            Assert.assertEquals(-1, in.read(buf, 0, buf.length));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkip_negativeValue_throwsException() throws IOException {
        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            in.skip(-1);
        }
    }

    @Test(expected = IOException.class)
    public void testRead_afterClose_throwsException() throws IOException {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.read(new byte[10], 0, 10);
    }

    @Test
    public void testRead_withoutCurrentEntry_returnsMinusOne() throws IOException {
        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            int read = in.read(new byte[10], 0, 10);
            Assert.assertEquals(-1, read);
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidOffsetLength_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
            zos.putArchiveEntry(entry);
            zos.write("Data".getBytes(StandardCharsets.UTF_8));
            zos.closeArchiveEntry();
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            in.getNextZipEntry();
            in.read(new byte[10], 5, 10);
        }
    }

    @Test
    public void testRead_zeroLength_returnsZero() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
            zos.putArchiveEntry(entry);
            zos.write("Data".getBytes(StandardCharsets.UTF_8));
            zos.closeArchiveEntry();
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            in.getNextZipEntry();
            int read = in.read(new byte[10], 0, 0);
            Assert.assertEquals(0, read);
        }
    }

    @Test
    public void testCanReadEntryData_variousEntries() {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        Assert.assertFalse(in.canReadEntryData(null));
        Assert.assertFalse(in.canReadEntryData(new ArchiveEntry() {
            @Override
            public String getName() { return "dummy"; }
            @Override
            public long getSize() { return 0; }
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public java.util.Date getLastModifiedDate() { return new java.util.Date(); }
        }));

        ZipArchiveEntry normalEntry = new ZipArchiveEntry("test.txt");
        normalEntry.setMethod(ZipEntry.DEFLATED);
        Assert.assertTrue(in.canReadEntryData(normalEntry));

        ZipArchiveEntry storedWithDataDescriptor = new ZipArchiveEntry("testStored.txt");
        storedWithDataDescriptor.setMethod(ZipEntry.STORED);
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        storedWithDataDescriptor.setGeneralPurposeBit(gpb);
        Assert.assertFalse(in.canReadEntryData(storedWithDataDescriptor));

        ZipArchiveInputStream inAllowStoredDD = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
        Assert.assertTrue(inAllowStoredDD.canReadEntryData(storedWithDataDescriptor));
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testReadFirstLocalFileHeader_splitArchiveSignature_throwsException() throws IOException {
        byte[] splitSig = ZipLong.DD_SIG.getBytes();
        byte[] data = new byte[30];
        System.arraycopy(splitSig, 0, data, 0, 4);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(data))) {
            in.getNextZipEntry();
        }
    }

    @Test
    public void testReadFirstLocalFileHeader_singleSegmentSplitMarker_handled() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("single.txt");
            zos.putArchiveEntry(entry);
            zos.write("Segment content".getBytes(StandardCharsets.UTF_8));
            zos.closeArchiveEntry();
        }
        byte[] zipBytes = baos.toByteArray();

        ByteArrayOutputStream combined = new ByteArrayOutputStream();
        combined.write(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
        combined.write(zipBytes);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(combined.toByteArray()))) {
            ZipArchiveEntry entry = in.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("single.txt", entry.getName());
            byte[] buf = new byte[32];
            int read = in.read(buf, 0, buf.length);
            Assert.assertEquals("Segment content", new String(buf, 0, read, StandardCharsets.UTF_8));
        }
    }

    @Test
    public void testGetNextZipEntry_nonLfhSig_returnsNull() throws IOException {
        byte[] randomBytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(randomBytes))) {
            Assert.assertNull(in.getNextZipEntry());
        }
    }

    @Test
    public void testGetNextZipEntry_centralDirectoryEncounteredFirst_returnsNull() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.CFH_SIG.getBytes());
        for (int i = 0; i < 42; i++) {
            baos.write(0);
        }
        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        for (int i = 0; i < 18; i++) {
            baos.write(0);
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            Assert.assertNull(in.getNextZipEntry());
            Assert.assertNull(in.getNextZipEntry());
        }
    }

    @Test
    public void testRead_deflatedWithDataDescriptor_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] data = "Data descriptor deflated content text here".getBytes(StandardCharsets.UTF_8);

        baos.write(ZipLong.LFH_SIG.getBytes());
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{0x08, 0x08});
        baos.write(new byte[]{8, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        byte[] nameBytes = "test_dd.txt".getBytes(StandardCharsets.UTF_8);
        baos.write(new byte[]{(byte) nameBytes.length, 0});
        baos.write(new byte[]{0, 0});
        baos.write(nameBytes);

        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        deflater.setInput(data);
        deflater.finish();
        byte[] deflatedData = new byte[1024];
        int compressedLen = deflater.deflate(deflatedData);
        deflater.end();
        baos.write(deflatedData, 0, compressedLen);

        CRC32 crc = new CRC32();
        crc.update(data);
        baos.write(ZipLong.DD_SIG.getBytes());
        baos.write(new ZipLong(crc.getValue()).getBytes());
        baos.write(new ZipLong(compressedLen).getBytes());
        baos.write(new ZipLong(data.length).getBytes());

        baos.write(ZipLong.CFH_SIG.getBytes());
        for (int i = 0; i < 42; i++) {
            baos.write(0);
        }
        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        for (int i = 0; i < 18; i++) {
            baos.write(0);
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            ZipArchiveEntry entry = in.getNextZipEntry();
            Assert.assertNotNull(entry);
            byte[] readBuf = new byte[256];
            int read = in.read(readBuf, 0, readBuf.length);
            Assert.assertEquals(new String(data, StandardCharsets.UTF_8), new String(readBuf, 0, read, StandardCharsets.UTF_8));
            Assert.assertNull(in.getNextZipEntry());
        }
    }

    @Test
    public void testRead_storedWithDataDescriptor_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] data = "Stored data with data descriptor stream".getBytes(StandardCharsets.UTF_8);

        baos.write(ZipLong.LFH_SIG.getBytes());
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{0x08, 0x08});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        byte[] nameBytes = "stored_dd.txt".getBytes(StandardCharsets.UTF_8);
        baos.write(new byte[]{(byte) nameBytes.length, 0});
        baos.write(new byte[]{0, 0});
        baos.write(nameBytes);

        baos.write(data);

        CRC32 crc = new CRC32();
        crc.update(data);
        baos.write(ZipLong.DD_SIG.getBytes());
        baos.write(new ZipLong(crc.getValue()).getBytes());
        baos.write(new ZipLong(data.length).getBytes());
        baos.write(new ZipLong(data.length).getBytes());

        baos.write(ZipLong.CFH_SIG.getBytes());
        for (int i = 0; i < 42; i++) {
            baos.write(0);
        }
        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        for (int i = 0; i < 18; i++) {
            baos.write(0);
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(baos.toByteArray()), "UTF-8", true, true)) {
            ZipArchiveEntry entry = in.getNextZipEntry();
            Assert.assertNotNull(entry);
            byte[] readBuf = new byte[256];
            int read = in.read(readBuf, 0, readBuf.length);
            Assert.assertEquals(new String(data, StandardCharsets.UTF_8), new String(readBuf, 0, read, StandardCharsets.UTF_8));
            Assert.assertNull(in.getNextZipEntry());
        }
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testRead_storedWithDataDescriptorNotAllowed_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.LFH_SIG.getBytes());
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{0x08, 0x00});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        byte[] nameBytes = "stored_dd_fail.txt".getBytes(StandardCharsets.UTF_8);
        baos.write(new byte[]{(byte) nameBytes.length, 0});
        baos.write(new byte[]{0, 0});
        baos.write(nameBytes);
        baos.write("data".getBytes(StandardCharsets.UTF_8));

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(baos.toByteArray()), "UTF-8", true, false)) {
            in.getNextZipEntry();
            in.read(new byte[10], 0, 10);
        }
    }

    @Test(expected = ZipException.class)
    public void testRead_corruptedDeflatedData_throwsZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.LFH_SIG.getBytes());
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{8, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new ZipLong(10).getBytes());
        baos.write(new ZipLong(10).getBytes());
        byte[] nameBytes = "corrupt.txt".getBytes(StandardCharsets.UTF_8);
        baos.write(new byte[]{(byte) nameBytes.length, 0});
        baos.write(new byte[]{0, 0});
        baos.write(nameBytes);
        baos.write(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            in.getNextZipEntry();
            in.read(new byte[10], 0, 10);
        }
    }

    @Test
    public void testZip64ExtraField_parsing() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.LFH_SIG.getBytes());
        baos.write(new byte[]{45, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(ZipLong.ZIP64_MAGIC.getBytes());
        baos.write(ZipLong.ZIP64_MAGIC.getBytes());
        byte[] nameBytes = "zip64.txt".getBytes(StandardCharsets.UTF_8);
        baos.write(new byte[]{(byte) nameBytes.length, 0});

        Zip64ExtendedInformationExtraField z64 = new Zip64ExtendedInformationExtraField(
                new ZipEightByteInteger(4), new ZipEightByteInteger(4));
        byte[] extra = z64.getLocalFileDataData();
        byte[] extraFieldHeader = new byte[4];
        System.arraycopy(Zip64ExtendedInformationExtraField.HEADER_ID.getBytes(), 0, extraFieldHeader, 0, 2);
        System.arraycopy(new ZipShort(extra.length).getBytes(), 0, extraFieldHeader, 2, 2);

        baos.write(new byte[]{(byte) (extraFieldHeader.length + extra.length), 0});
        baos.write(nameBytes);
        baos.write(extraFieldHeader);
        baos.write(extra);
        baos.write("1234".getBytes(StandardCharsets.UTF_8));

        baos.write(ZipLong.CFH_SIG.getBytes());
        for (int i = 0; i < 42; i++) {
            baos.write(0);
        }
        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        for (int i = 0; i < 18; i++) {
            baos.write(0);
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            ZipArchiveEntry entry = in.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals(4, entry.getSize());
            Assert.assertEquals(4, entry.getCompressedSize());

            byte[] buf = new byte[10];
            int read = in.read(buf, 0, buf.length);
            Assert.assertEquals(4, read);
            Assert.assertEquals("1234", new String(buf, 0, 4, StandardCharsets.UTF_8));
        }
    }

    @Test
    public void testUnicodeExtraField_nameResolution() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.LFH_SIG.getBytes());
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});

        byte[] rawName = "ascii.txt".getBytes(StandardCharsets.US_ASCII);
        baos.write(new byte[]{(byte) rawName.length, 0});

        UnicodePathExtraField upef = new UnicodePathExtraField("unicode_\u00e9.txt", rawName);
        byte[] extra = upef.getLocalFileDataData();
        byte[] extraHeader = new byte[4];
        System.arraycopy(UnicodePathExtraField.UPATH_ID.getBytes(), 0, extraHeader, 0, 2);
        System.arraycopy(new ZipShort(extra.length).getBytes(), 0, extraHeader, 2, 2);

        baos.write(new byte[]{(byte) (extraHeader.length + extra.length), 0});
        baos.write(rawName);
        baos.write(extraHeader);
        baos.write(extra);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(baos.toByteArray()), "US-ASCII", true)) {
            ZipArchiveEntry entry = in.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("unicode_\u00e9.txt", entry.getName());
        }
    }

    @Test(expected = EOFException.class)
    public void testDrainCurrentEntryData_truncatedEntry_throwsEOFException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.LFH_SIG.getBytes());
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new ZipLong(100).getBytes());
        baos.write(new ZipLong(100).getBytes());
        byte[] nameBytes = "truncated.txt".getBytes(StandardCharsets.UTF_8);
        baos.write(new byte[]{(byte) nameBytes.length, 0});
        baos.write(new byte[]{0, 0});
        baos.write(nameBytes);
        baos.write(new byte[]{1, 2, 3});

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            in.getNextZipEntry();
            in.getNextZipEntry();
        }
    }

    @Test
    public void testClose_multipleCalls_noException() throws IOException {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.close();
    }
}
