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
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

public class ZipArchiveInputStreamTest {

    private byte[] createZip(String entryName, byte[] data, int method, boolean useDataDescriptor, boolean zip64) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        if (zip64) {
            zaos.setUseZip64(Zip64Mode.Always);
        }
        ZipArchiveEntry entry = new ZipArchiveEntry(entryName);
        entry.setMethod(method);
        if (method == ZipArchiveOutputStream.STORED && !useDataDescriptor) {
            entry.setSize(data.length);
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

    private byte[] createEmptyZip() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.close();
        return baos.toByteArray();
    }

    @Test
    public void testConstructor_variousSignatures() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis1 = new ZipArchiveInputStream(bais);
        zis1.close();

        ZipArchiveInputStream zis2 = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8");
        Assert.assertEquals("UTF-8", zis2.encoding);
        zis2.close();

        ZipArchiveInputStream zis3 = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true);
        zis3.close();

        ZipArchiveInputStream zis4 = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
        zis4.close();
    }

    @Test
    public void testMatches_validAndInvalidSignatures() {
        Assert.assertFalse(ZipArchiveInputStream.matches(new byte[3], 3));
        Assert.assertFalse(ZipArchiveInputStream.matches(new byte[]{0, 0, 0, 0}, 4));

        Assert.assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.LFH_SIG, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.EOCD_SIG, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.DD_SIG, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes(), 4));

        byte[] longer = new byte[]{ZipArchiveOutputStream.LFH_SIG[0], ZipArchiveOutputStream.LFH_SIG[1],
                ZipArchiveOutputStream.LFH_SIG[2], ZipArchiveOutputStream.LFH_SIG[3], 0x10, 0x20};
        Assert.assertTrue(ZipArchiveInputStream.matches(longer, 6));

        byte[] mismatched = new byte[]{ZipArchiveOutputStream.LFH_SIG[0], ZipArchiveOutputStream.LFH_SIG[1],
                ZipArchiveOutputStream.LFH_SIG[2], 0x00};
        Assert.assertFalse(ZipArchiveInputStream.matches(mismatched, 4));
    }

    @Test
    public void testGetNextZipEntry_emptyZipArchive_returnsNull() throws IOException {
        byte[] emptyZip = createEmptyZip();
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(emptyZip))) {
            Assert.assertNull(zis.getNextZipEntry());
            Assert.assertNull(zis.getNextEntry());
        }
    }

    @Test
    public void testGetNextZipEntry_eofOnFirstHeader_returnsNull() throws IOException {
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            Assert.assertNull(zis.getNextZipEntry());
        }
    }

    @Test
    public void testGetNextZipEntry_unexpectedSignature_throwsException() throws IOException {
        byte[] invalidData = new byte[]{0x12, 0x34, 0x56, 0x78, 0x00, 0x00, 0x00, 0x00,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(invalidData))) {
            zis.getNextZipEntry();
            Assert.fail("Expected ZipException");
        } catch (ZipException expected) {
            Assert.assertTrue(expected.getMessage().contains("Unexpected record signature"));
        }
    }

    @Test
    public void testGetNextZipEntry_splitArchiveMarker_throwsUnsupportedZipFeatureException() throws IOException {
        byte[] splitSig = new byte[30];
        System.arraycopy(ZipLong.DD_SIG.getBytes(), 0, splitSig, 0, 4);
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(splitSig))) {
            zis.getNextZipEntry();
            Assert.fail("Expected UnsupportedZipFeatureException");
        } catch (UnsupportedZipFeatureException expected) {
            Assert.assertEquals(UnsupportedZipFeatureException.Feature.SPLITTING, expected.getFeature());
        }
    }

    @Test
    public void testGetNextZipEntry_singleSegmentSplitMarker_readsLFHCorrectly() throws IOException {
        byte[] zipBytes = createZip("entry.txt", "data".getBytes(StandardCharsets.UTF_8), ZipArchiveOutputStream.STORED, false, false);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
        baos.write(zipBytes);

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            ZipArchiveEntry entry = zis.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("entry.txt", entry.getName());
            byte[] buf = new byte[10];
            int read = zis.read(buf, 0, buf.length);
            Assert.assertEquals(4, read);
            Assert.assertEquals("data", new String(buf, 0, read, StandardCharsets.UTF_8));
        }
    }

    @Test
    public void testRead_storedEntryNormal_success() throws IOException {
        byte[] expectedData = "Hello Stored Zip".getBytes(StandardCharsets.UTF_8);
        byte[] zipBytes = createZip("test.txt", expectedData, ZipArchiveOutputStream.STORED, false, false);

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes))) {
            ZipArchiveEntry entry = zis.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("test.txt", entry.getName());
            Assert.assertTrue(zis.canReadEntryData(entry));

            byte[] buf = new byte[32];
            int read = zis.read(buf, 0, buf.length);
            Assert.assertEquals(expectedData.length, read);
            Assert.assertEquals(new String(expectedData), new String(buf, 0, read));

            Assert.assertEquals(-1, zis.read(buf, 0, buf.length));
            Assert.assertNull(zis.getNextZipEntry());
        }
    }

    @Test
    public void testRead_deflatedEntryNormal_success() throws IOException {
        byte[] expectedData = "Hello Deflated Zip String with repeated words words words".getBytes(StandardCharsets.UTF_8);
        byte[] zipBytes = createZip("deflated.txt", expectedData, ZipArchiveOutputStream.DEFLATED, false, false);

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes))) {
            ArchiveEntry entry = zis.getNextEntry();
            Assert.assertNotNull(entry);
            Assert.assertTrue(zis.canReadEntryData(entry));

            byte[] buf = new byte[128];
            int read = zis.read(buf, 0, buf.length);
            Assert.assertEquals(expectedData.length, read);
            Assert.assertEquals(new String(expectedData), new String(buf, 0, read));

            Assert.assertEquals(-1, zis.read(buf, 0, buf.length));
        }
    }

    @Test
    public void testRead_zip64StoredEntry_success() throws IOException {
        byte[] expectedData = "Zip64 Content".getBytes(StandardCharsets.UTF_8);
        byte[] zipBytes = createZip("zip64.txt", expectedData, ZipArchiveOutputStream.STORED, false, true);

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes))) {
            ZipArchiveEntry entry = zis.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("zip64.txt", entry.getName());

            byte[] buf = new byte[64];
            int read = zis.read(buf, 0, buf.length);
            Assert.assertEquals(expectedData.length, read);
            Assert.assertEquals(new String(expectedData), new String(buf, 0, read));
        }
    }

    @Test
    public void testRead_multipleEntriesSequential_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry e1 = new ZipArchiveEntry("first.txt");
            e1.setMethod(ZipArchiveOutputStream.DEFLATED);
            zaos.putArchiveEntry(e1);
            zaos.write("first entry content".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();

            ZipArchiveEntry e2 = new ZipArchiveEntry("second.txt");
            e2.setMethod(ZipArchiveOutputStream.STORED);
            byte[] d2 = "second entry content".getBytes(StandardCharsets.UTF_8);
            e2.setSize(d2.length);
            CRC32 crc = new CRC32();
            crc.update(d2);
            e2.setCrc(crc.getValue());
            zaos.putArchiveEntry(e2);
            zaos.write(d2);
            zaos.closeArchiveEntry();
        }

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            ZipArchiveEntry e1 = zis.getNextZipEntry();
            Assert.assertEquals("first.txt", e1.getName());

            ZipArchiveEntry e2 = zis.getNextZipEntry();
            Assert.assertEquals("second.txt", e2.getName());
            byte[] buf = new byte[64];
            int read = zis.read(buf, 0, buf.length);
            Assert.assertEquals("second entry content", new String(buf, 0, read, StandardCharsets.UTF_8));

            Assert.assertNull(zis.getNextZipEntry());
        }
    }

    @Test
    public void testRead_storedWithDataDescriptor_allowed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] lfh = new byte[]{
                0x50, 0x4b, 0x03, 0x04,
                0x14, 0x00,
                0x08, 0x00,
                0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x04, 0x00,
                0x00, 0x00
        };
        baos.write(lfh);
        baos.write("test".getBytes(StandardCharsets.UTF_8));

        byte[] payload = "stored_dd_data".getBytes(StandardCharsets.UTF_8);
        baos.write(payload);

        CRC32 crc = new CRC32();
        crc.update(payload);
        long crcVal = crc.getValue();

        baos.write(ZipLong.DD_SIG.getBytes());
        baos.write(new ZipLong(crcVal).getBytes());
        baos.write(new ZipLong(payload.length).getBytes());
        baos.write(new ZipLong(payload.length).getBytes());

        baos.write(ZipArchiveOutputStream.CFH_SIG);
        byte[] dummyCfh = new byte[42];
        baos.write(dummyCfh);
        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        byte[] dummyEocd = new byte[18];
        baos.write(dummyEocd);

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), "UTF-8", true, true)) {
            ZipArchiveEntry entry = zis.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertTrue(zis.canReadEntryData(entry));

            byte[] buf = new byte[32];
            int read = zis.read(buf, 0, buf.length);
            Assert.assertEquals(payload.length, read);
            Assert.assertEquals(new String(payload), new String(buf, 0, read));
        }
    }

    @Test
    public void testRead_storedWithDataDescriptor_disallowed_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] lfh = new byte[]{
                0x50, 0x4b, 0x03, 0x04,
                0x14, 0x00,
                0x08, 0x00,
                0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x04, 0x00,
                0x00, 0x00
        };
        baos.write(lfh);
        baos.write("test".getBytes(StandardCharsets.UTF_8));
        baos.write("data".getBytes(StandardCharsets.UTF_8));
        baos.write(ZipLong.DD_SIG.getBytes());
        baos.write(new byte[12]);

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), "UTF-8", true, false)) {
            ZipArchiveEntry entry = zis.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertFalse(zis.canReadEntryData(entry));

            byte[] buf = new byte[10];
            try {
                zis.read(buf, 0, buf.length);
                Assert.fail("Expected UnsupportedZipFeatureException");
            } catch (UnsupportedZipFeatureException e) {
                Assert.assertEquals(UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR, e.getFeature());
            }
        }
    }

    @Test
    public void testRead_deflatedWithDataDescriptor_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] payload = "data-for-deflated-descriptor".getBytes(StandardCharsets.UTF_8);

        ByteArrayOutputStream deflatedStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        deflater.setInput(payload);
        deflater.finish();
        byte[] tempBuf = new byte[128];
        while (!deflater.finished()) {
            int count = deflater.deflate(tempBuf);
            deflatedStream.write(tempBuf, 0, count);
        }
        byte[] deflatedData = deflatedStream.toByteArray();

        byte[] lfh = new byte[]{
                0x50, 0x4b, 0x03, 0x04,
                0x14, 0x00,
                0x08, 0x00,
                0x08, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x04, 0x00,
                0x00, 0x00
        };
        baos.write(lfh);
        baos.write("test".getBytes(StandardCharsets.UTF_8));
        baos.write(deflatedData);

        CRC32 crc = new CRC32();
        crc.update(payload);
        baos.write(ZipLong.DD_SIG.getBytes());
        baos.write(new ZipLong(crc.getValue()).getBytes());
        baos.write(new ZipLong(deflatedData.length).getBytes());
        baos.write(new ZipLong(payload.length).getBytes());

        baos.write(ZipArchiveOutputStream.CFH_SIG);
        baos.write(new byte[42]);
        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        baos.write(new byte[18]);

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            ZipArchiveEntry entry = zis.getNextZipEntry();
            Assert.assertNotNull(entry);
            byte[] out = new byte[64];
            int read = zis.read(out, 0, out.length);
            Assert.assertEquals(payload.length, read);
            Assert.assertEquals(new String(payload), new String(out, 0, read));

            Assert.assertNull(zis.getNextZipEntry());
        }
    }

    @Test
    public void testRead_unsupportedCompressionMethod_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] lfh = new byte[]{
                0x50, 0x4b, 0x03, 0x04,
                0x14, 0x00,
                0x00, 0x00,
                99, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x05, 0x00, 0x00, 0x00,
                0x05, 0x00, 0x00, 0x00,
                0x04, 0x00,
                0x00, 0x00
        };
        baos.write(lfh);
        baos.write("test".getBytes(StandardCharsets.UTF_8));
        baos.write(new byte[]{1, 2, 3, 4, 5});

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            ZipArchiveEntry entry = zis.getNextZipEntry();
            Assert.assertNotNull(entry);
            byte[] buf = new byte[10];
            try {
                zis.read(buf, 0, buf.length);
                Assert.fail("Expected UnsupportedZipFeatureException");
            } catch (UnsupportedZipFeatureException e) {
                Assert.assertEquals(UnsupportedZipFeatureException.Feature.METHOD, e.getFeature());
            }
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_boundsNegativeOffset_throwsException() throws IOException {
        byte[] zipBytes = createZip("entry.txt", new byte[]{1, 2, 3}, ZipArchiveOutputStream.STORED, false, false);
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes))) {
            zis.getNextZipEntry();
            zis.read(new byte[10], -1, 5);
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_boundsNegativeLength_throwsException() throws IOException {
        byte[] zipBytes = createZip("entry.txt", new byte[]{1, 2, 3}, ZipArchiveOutputStream.STORED, false, false);
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes))) {
            zis.getNextZipEntry();
            zis.read(new byte[10], 0, -1);
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_boundsOverflow_throwsException() throws IOException {
        byte[] zipBytes = createZip("entry.txt", new byte[]{1, 2, 3}, ZipArchiveOutputStream.STORED, false, false);
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes))) {
            zis.getNextZipEntry();
            zis.read(new byte[10], 6, 5);
        }
    }

    @Test
    public void testRead_nullCurrentEntry_returnsMinusOne() throws IOException {
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            Assert.assertEquals(-1, zis.read(new byte[10], 0, 10));
        }
    }

    @Test(expected = IOException.class)
    public void testRead_afterClose_throwsIOException() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        zis.read(new byte[10], 0, 10);
    }

    @Test
    public void testSkip_normalAndEdgeCases() throws IOException {
        byte[] data = "0123456789ABCDEF".getBytes(StandardCharsets.UTF_8);
        byte[] zipBytes = createZip("skip.txt", data, ZipArchiveOutputStream.STORED, false, false);

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes))) {
            zis.getNextZipEntry();

            Assert.assertEquals(0, zis.skip(0));

            long skipped = zis.skip(5);
            Assert.assertEquals(5, skipped);

            byte[] buf = new byte[5];
            int read = zis.read(buf, 0, buf.length);
            Assert.assertEquals(5, read);
            Assert.assertEquals("56789", new String(buf, 0, read));

            skipped = zis.skip(100);
            Assert.assertEquals(6, skipped);
            Assert.assertEquals(-1, zis.read(buf, 0, buf.length));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkip_negativeValue_throwsException() throws IOException {
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            zis.skip(-1);
        }
    }

    @Test
    public void testClose_multipleCalls_safe() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        zis.close();
    }

    @Test
    public void testCanReadEntryData_nullOrNonZipEntry_returnsFalse() throws IOException {
        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            Assert.assertFalse(zis.canReadEntryData(null));
            ArchiveEntry nonZipEntry = new ArchiveEntry() {
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
            };
            Assert.assertFalse(zis.canReadEntryData(nonZipEntry));
        }
    }

    @Test
    public void testUnicodeExtraFields_handled() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
            zaos.setEncoding("US-ASCII");

            ZipArchiveEntry entry = new ZipArchiveEntry("test-unicode-\u00e9.txt");
            zaos.putArchiveEntry(entry);
            zaos.write("content".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();
        }

        try (ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), "US-ASCII", true)) {
            ZipArchiveEntry entry = zis.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("test-unicode-\u00e9.txt", entry.getName());
        }
    }
}
