package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

public class ZipArchiveInputStreamTest {

    private byte[] createSimpleZipData(String entryName, byte[] content, int method) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry(entryName);
        entry.setMethod(method);
        if (method == ZipArchiveOutputStream.STORED) {
            entry.setSize(content.length);
            entry.setCompressedSize(content.length);
            CRC32 crc = new CRC32();
            crc.update(content);
            entry.setCrc(crc.getValue());
        }
        zaos.putArchiveEntry(entry);
        zaos.write(content);
        zaos.closeArchiveEntry();
        zaos.close();
        return baos.toByteArray();
    }

    private byte[] createMultiEntryZipData() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);

        ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
        zaos.putArchiveEntry(entry1);
        zaos.write("Hello World 1".getBytes("UTF-8"));
        zaos.closeArchiveEntry();

        ZipArchiveEntry entry2 = new ZipArchiveEntry("file2.txt");
        zaos.putArchiveEntry(entry2);
        zaos.write("Hello World 2".getBytes("UTF-8"));
        zaos.closeArchiveEntry();

        zaos.close();
        return baos.toByteArray();
    }

    @Test
    public void testConstructors_allVariants_instantiateSuccessfully() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);

        ZipArchiveInputStream in1 = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        Assert.assertNotNull(in1.getNextZipEntry());
        in1.close();

        ZipArchiveInputStream in2 = new ZipArchiveInputStream(new ByteArrayInputStream(data), "UTF-8");
        Assert.assertNotNull(in2.getNextZipEntry());
        in2.close();

        ZipArchiveInputStream in3 = new ZipArchiveInputStream(new ByteArrayInputStream(data), "UTF-8", true);
        Assert.assertNotNull(in3.getNextZipEntry());
        in3.close();

        ZipArchiveInputStream in4 = new ZipArchiveInputStream(new ByteArrayInputStream(data), "UTF-8", true, true);
        Assert.assertNotNull(in4.getNextZipEntry());
        in4.close();
    }

    @Test
    public void testMatches_variousSignatures_expectedResults() {
        Assert.assertFalse(ZipArchiveInputStream.matches(new byte[]{1, 2}, 2));
        Assert.assertFalse(ZipArchiveInputStream.matches(new byte[]{0, 0, 0, 0}, 4));

        Assert.assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.LFH_SIG, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.EOCD_SIG, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.DD_SIG, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes(), 4));

        byte[] longer = new byte[]{ZipArchiveOutputStream.LFH_SIG[0], ZipArchiveOutputStream.LFH_SIG[1],
                ZipArchiveOutputStream.LFH_SIG[2], ZipArchiveOutputStream.LFH_SIG[3], 9, 9};
        Assert.assertTrue(ZipArchiveInputStream.matches(longer, 6));

        byte[] corrupted = new byte[]{ZipArchiveOutputStream.LFH_SIG[0], ZipArchiveOutputStream.LFH_SIG[1], 0, 0};
        Assert.assertFalse(ZipArchiveInputStream.matches(corrupted, 4));
    }

    @Test
    public void testGetNextZipEntry_storedAndDeflated_readsCorrectContent() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);

        byte[] c1 = "Stored Content".getBytes("UTF-8");
        ZipArchiveEntry e1 = new ZipArchiveEntry("stored.txt");
        e1.setMethod(ZipArchiveOutputStream.STORED);
        e1.setSize(c1.length);
        e1.setCompressedSize(c1.length);
        CRC32 crc = new CRC32();
        crc.update(c1);
        e1.setCrc(crc.getValue());
        zaos.putArchiveEntry(e1);
        zaos.write(c1);
        zaos.closeArchiveEntry();

        byte[] c2 = "Deflated Content String repeated repeated repeated".getBytes("UTF-8");
        ZipArchiveEntry e2 = new ZipArchiveEntry("deflated.txt");
        e2.setMethod(ZipArchiveOutputStream.DEFLATED);
        zaos.putArchiveEntry(e2);
        zaos.write(c2);
        zaos.closeArchiveEntry();
        zaos.close();

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));

        ZipArchiveEntry readE1 = zis.getNextZipEntry();
        Assert.assertNotNull(readE1);
        Assert.assertEquals("stored.txt", readE1.getName());
        byte[] b1 = new byte[c1.length];
        int r1 = zis.read(b1, 0, b1.length);
        Assert.assertEquals(c1.length, r1);
        Assert.assertArrayEquals(c1, b1);
        Assert.assertEquals(-1, zis.read(b1, 0, 1));

        ArchiveEntry readE2 = zis.getNextEntry();
        Assert.assertNotNull(readE2);
        Assert.assertEquals("deflated.txt", readE2.getName());
        byte[] b2 = new byte[c2.length];
        int totalRead = 0;
        int r;
        while ((r = zis.read(b2, totalRead, b2.length - totalRead)) > 0) {
            totalRead += r;
        }
        Assert.assertEquals(c2.length, totalRead);
        Assert.assertArrayEquals(c2, b2);
        Assert.assertEquals(-1, zis.read(b2, 0, 1));

        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_emptyStream_returnsNull() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(zis.getNextZipEntry());
        Assert.assertNull(zis.getNextEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_closedStream_returnsNull() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.close();
        Assert.assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testRead_whenCurrentEntryIsNull_returnsMinusOne() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        byte[] buf = new byte[10];
        Assert.assertEquals(-1, zis.read(buf, 0, buf.length));
        zis.close();
    }

    @Test(expected = IOException.class)
    public void testRead_whenClosed_throwsException() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        zis.close();
        byte[] buf = new byte[10];
        zis.read(buf, 0, 1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidOffsetAndLength_throwsException() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        try {
            zis.read(buf, -1, 5);
        } finally {
            zis.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidLength_throwsException() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        try {
            zis.read(buf, 0, -1);
        } finally {
            zis.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_offsetGreaterThanLength_throwsException() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        try {
            zis.read(buf, 11, 1);
        } finally {
            zis.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_offsetPlusLengthExceedsBuffer_throwsException() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        try {
            zis.read(buf, 6, 5);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testSkip_validAndInvalidValues() throws IOException {
        byte[] content = "0123456789ABCDEF".getBytes("UTF-8");
        byte[] data = createSimpleZipData("test.txt", content, ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();

        Assert.assertEquals(0, zis.skip(0));
        long skipped = zis.skip(5);
        Assert.assertEquals(5, skipped);

        byte[] buf = new byte[5];
        int r = zis.read(buf, 0, buf.length);
        Assert.assertEquals(5, r);
        Assert.assertEquals("56789", new String(buf, 0, r, "UTF-8"));

        long remaining = zis.skip(100);
        Assert.assertEquals(6, remaining);

        Assert.assertEquals(0, zis.skip(10));
        zis.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkip_negativeValue_throwsException() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        try {
            zis.skip(-1);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testCloseEntry_withoutReadingFully_positionsToNextEntry() throws IOException {
        byte[] zipData = createMultiEntryZipData();
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));

        ZipArchiveEntry e1 = zis.getNextZipEntry();
        Assert.assertNotNull(e1);
        Assert.assertEquals("file1.txt", e1.getName());

        byte[] smallBuf = new byte[2];
        int r = zis.read(smallBuf, 0, 2);
        Assert.assertEquals(2, r);

        ZipArchiveEntry e2 = zis.getNextZipEntry();
        Assert.assertNotNull(e2);
        Assert.assertEquals("file2.txt", e2.getName());

        byte[] b2 = new byte[50];
        int r2 = zis.read(b2, 0, b2.length);
        Assert.assertEquals("Hello World 2", new String(b2, 0, r2, "UTF-8"));

        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testCanReadEntryData_variousEntries() {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        Assert.assertFalse(zis.canReadEntryData(null));
        Assert.assertFalse(zis.canReadEntryData(new ArchiveEntry() {
            @Override
            public String getName() {
                return "dummy";
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
            public java.util.Date getLastModifiedDate() {
                return null;
            }
        }));

        ZipArchiveEntry deflatedEntry = new ZipArchiveEntry("test.txt");
        deflatedEntry.setMethod(ZipArchiveOutputStream.DEFLATED);
        Assert.assertTrue(zis.canReadEntryData(deflatedEntry));

        ZipArchiveEntry storedEntry = new ZipArchiveEntry("test.txt");
        storedEntry.setMethod(ZipArchiveOutputStream.STORED);
        Assert.assertTrue(zis.canReadEntryData(storedEntry));

        ZipArchiveEntry ddStoredEntry = new ZipArchiveEntry("test.txt");
        ddStoredEntry.setMethod(ZipArchiveOutputStream.STORED);
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        ddStoredEntry.setGeneralPurposeBit(gpb);
        Assert.assertFalse(zis.canReadEntryData(ddStoredEntry));

        ZipArchiveInputStream zisAllowDD = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
        Assert.assertTrue(zisAllowDD.canReadEntryData(ddStoredEntry));

        ZipArchiveEntry unsuppEntry = new ZipArchiveEntry("test.txt");
        unsuppEntry.setMethod(99);
        Assert.assertFalse(zis.canReadEntryData(unsuppEntry));

        try {
            zis.close();
            zisAllowDD.close();
        } catch (IOException ignored) {
        }
    }

    @Test
    public void testSingleSegmentSplitMarker_skippedProperly() throws IOException {
        byte[] simpleZip = createSimpleZipData("test.txt", "Hello Split".getBytes("UTF-8"), ZipArchiveOutputStream.DEFLATED);
        byte[] marker = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        byte[] combined = new byte[marker.length + simpleZip.length];
        System.arraycopy(marker, 0, combined, 0, marker.length);
        System.arraycopy(simpleZip, 0, combined, marker.length, simpleZip.length);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(combined));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        byte[] buf = new byte[50];
        int r = zis.read(buf, 0, buf.length);
        Assert.assertEquals("Hello Split", new String(buf, 0, r, "UTF-8"));
        zis.close();
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testSplitZip_ddSigAtStart_throwsUnsupportedZipFeatureException() throws IOException {
        byte[] ddSig = ZipLong.DD_SIG.getBytes();
        byte[] dummy = new byte[30];
        System.arraycopy(ddSig, 0, dummy, 0, ddSig.length);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(dummy));
        try {
            zis.getNextZipEntry();
        } finally {
            zis.close();
        }
    }

    @Test
    public void testZip64ExtraField_parsedCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[]{45, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{1, 2, 3, 4});
        baos.write(ZipLong.ZIP64_MAGIC.getBytes());
        baos.write(ZipLong.ZIP64_MAGIC.getBytes());

        byte[] nameBytes = "z64.txt".getBytes("UTF-8");
        baos.write(new ZipShort(nameBytes.length).getBytes());

        Zip64ExtendedInformationExtraField z64 = new Zip64ExtendedInformationExtraField(
                new ZipEightByteInteger(123456789L), new ZipEightByteInteger(987654321L));
        byte[] extraData = z64.getLocalFileDataData();
        byte[] extraFieldHeader = new byte[4];
        System.arraycopy(z64.getHeaderId().getBytes(), 0, extraFieldHeader, 0, 2);
        System.arraycopy(new ZipShort(extraData.length).getBytes(), 0, extraFieldHeader, 2, 2);

        baos.write(new ZipShort(extraFieldHeader.length + extraData.length).getBytes());
        baos.write(nameBytes);
        baos.write(extraFieldHeader);
        baos.write(extraData);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("z64.txt", entry.getName());
        Assert.assertEquals(123456789L, entry.getSize());
        Assert.assertEquals(987654321L, entry.getCompressedSize());
        zis.close();
    }

    @Test
    public void testUnicodeExtraField_overridesName() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});

        byte[] asciiName = "ascii.txt".getBytes("US-ASCII");
        baos.write(new ZipShort(asciiName.length).getBytes());

        UnicodePathExtraField uPath = new UnicodePathExtraField("unicode_\u00E9.txt", asciiName);
        byte[] extraData = uPath.getLocalFileDataData();
        byte[] extraHeader = new byte[4];
        System.arraycopy(uPath.getHeaderId().getBytes(), 0, extraHeader, 0, 2);
        System.arraycopy(new ZipShort(extraData.length).getBytes(), 0, extraHeader, 2, 2);

        baos.write(new ZipShort(extraHeader.length + extraData.length).getBytes());
        baos.write(asciiName);
        baos.write(extraHeader);
        baos.write(extraData);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), "US-ASCII", true);
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("unicode_\u00E9.txt", entry.getName());
        zis.close();
    }

    @Test
    public void testReadStoredEntry_withDataDescriptor() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{8, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});

        byte[] nameBytes = "storedDD.txt".getBytes("UTF-8");
        baos.write(new ZipShort(nameBytes.length).getBytes());
        baos.write(new byte[]{0, 0});
        baos.write(nameBytes);

        byte[] payload = "Hello Stored With DD".getBytes("UTF-8");
        baos.write(payload);

        CRC32 crc = new CRC32();
        crc.update(payload);
        long crcVal = crc.getValue();

        baos.write(ZipLong.DD_SIG.getBytes());
        baos.write(new ZipLong(crcVal).getBytes());
        baos.write(new ZipLong(payload.length).getBytes());
        baos.write(new ZipLong(payload.length).getBytes());

        baos.write(ZipArchiveOutputStream.CFH_SIG);
        baos.write(new byte[42]);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(
                new ByteArrayInputStream(baos.toByteArray()), "UTF-8", true, true);
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("storedDD.txt", entry.getName());

        byte[] readBuf = new byte[100];
        int r = zis.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(payload.length, r);
        Assert.assertEquals("Hello Stored With DD", new String(readBuf, 0, r, "UTF-8"));

        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test(expected = ZipException.class)
    public void testCorruptedDeflatedData_throwsZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{8, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{1, 2, 3, 4});
        baos.write(new ZipLong(20).getBytes());
        baos.write(new ZipLong(20).getBytes());

        byte[] nameBytes = "corrupt.txt".getBytes("UTF-8");
        baos.write(new ZipShort(nameBytes.length).getBytes());
        baos.write(new byte[]{0, 0});
        baos.write(nameBytes);
        baos.write(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        zis.getNextZipEntry();
        byte[] buf = new byte[50];
        try {
            zis.read(buf, 0, buf.length);
        } finally {
            zis.close();
        }
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void testUnsupportedCompressionMethod_throwsExceptionOnRead() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{99, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new ZipLong(5).getBytes());
        baos.write(new ZipLong(5).getBytes());

        byte[] nameBytes = "unsupported.txt".getBytes("UTF-8");
        baos.write(new ZipShort(nameBytes.length).getBytes());
        baos.write(new byte[]{0, 0});
        baos.write(nameBytes);
        baos.write(new byte[]{1, 2, 3, 4, 5});

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        try {
            zis.read(buf, 0, buf.length);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testClose_multipleInvocations_safe() throws IOException {
        byte[] data = createSimpleZipData("test.txt", "abc".getBytes(), ZipArchiveOutputStream.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.close();
        zis.close();
    }
}
