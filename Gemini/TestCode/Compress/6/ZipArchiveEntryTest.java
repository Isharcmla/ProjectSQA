package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class ZipArchiveEntryTest {

    private static class DummyExtraField implements ZipExtraField {
        private final ZipShort headerId;
        private byte[] localData = new byte[0];
        private byte[] centralData = new byte[0];

        public DummyExtraField(ZipShort headerId) {
            this.headerId = headerId;
        }

        public DummyExtraField(ZipShort headerId, byte[] localData, byte[] centralData) {
            this.headerId = headerId;
            this.localData = localData != null ? localData : new byte[0];
            this.centralData = centralData != null ? centralData : new byte[0];
        }

        @Override
        public ZipShort getHeaderId() {
            return headerId;
        }

        @Override
        public ZipShort getLocalFileDataLength() {
            return new ZipShort(localData.length);
        }

        @Override
        public ZipShort getCentralDirectoryLength() {
            return new ZipShort(centralData.length);
        }

        @Override
        public byte[] getLocalFileDataData() {
            return localData;
        }

        @Override
        public byte[] getCentralDirectoryData() {
            return centralData;
        }

        @Override
        public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {
            localData = new byte[length];
            System.arraycopy(buffer, offset, localData, 0, length);
        }

        @Override
        public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {
            centralData = new byte[length];
            System.arraycopy(buffer, offset, centralData, 0, length);
        }
    }

    private static class SubZipArchiveEntry extends ZipArchiveEntry {
        public SubZipArchiveEntry() {
            super();
        }

        public SubZipArchiveEntry(String name) {
            super(name);
        }

        @Override
        public void setPlatform(int platform) {
            super.setPlatform(platform);
        }

        @Override
        public void setName(String name) {
            super.setName(name);
        }

        @Override
        public void setExtra() {
            super.setExtra();
        }
    }

    @Test
    public void testDefaultConstructor() {
        SubZipArchiveEntry entry = new SubZipArchiveEntry();
        Assert.assertEquals("", entry.getName());
        Assert.assertEquals(-1, entry.getMethod());
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        Assert.assertEquals(0, entry.getInternalAttributes());
        Assert.assertEquals(0, entry.getExternalAttributes());
        Assert.assertEquals(0, entry.getExtraFields().length);
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void testStringConstructor_fileAndDirectory() {
        ZipArchiveEntry fileEntry = new ZipArchiveEntry("test.txt");
        Assert.assertEquals("test.txt", fileEntry.getName());
        Assert.assertFalse(fileEntry.isDirectory());

        ZipArchiveEntry dirEntry = new ZipArchiveEntry("dir/");
        Assert.assertEquals("dir/", dirEntry.getName());
        Assert.assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testZipEntryConstructor_withExtraAndMethod() throws Exception {
        java.util.zip.ZipEntry standardEntry = new java.util.zip.ZipEntry("foo.txt");
        standardEntry.setMethod(ZipEntry.DEFLATED);
        standardEntry.setTime(12345678L);

        // Header ID 0x1234, length 2, data [0x01, 0x02]
        byte[] extraData = new byte[]{0x34, 0x12, 0x02, 0x00, 0x01, 0x02};
        standardEntry.setExtra(extraData);

        ZipArchiveEntry entry = new ZipArchiveEntry(standardEntry);
        Assert.assertEquals("foo.txt", entry.getName());
        Assert.assertEquals(ZipEntry.DEFLATED, entry.getMethod());
        Assert.assertTrue(entry.getExtraFields().length > 0);
        Assert.assertNotNull(entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testZipEntryConstructor_withoutExtra() throws Exception {
        java.util.zip.ZipEntry standardEntry = new java.util.zip.ZipEntry("bar.txt");
        standardEntry.setMethod(ZipEntry.STORED);
        standardEntry.setExtra(null);

        ZipArchiveEntry entry = new ZipArchiveEntry(standardEntry);
        Assert.assertEquals("bar.txt", entry.getName());
        Assert.assertEquals(ZipEntry.STORED, entry.getMethod());
        Assert.assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testZipArchiveEntryCopyConstructor() throws Exception {
        ZipArchiveEntry source = new ZipArchiveEntry("source.txt");
        source.setMethod(ZipEntry.DEFLATED);
        source.setInternalAttributes(42);
        source.setExternalAttributes(0x81A40000L);
        DummyExtraField field = new DummyExtraField(new ZipShort(0x0001), new byte[]{1, 2}, new byte[]{3, 4});
        source.setExtraFields(new ZipExtraField[]{field});

        ZipArchiveEntry copy = new ZipArchiveEntry(source);
        Assert.assertEquals("source.txt", copy.getName());
        Assert.assertEquals(ZipEntry.DEFLATED, copy.getMethod());
        Assert.assertEquals(42, copy.getInternalAttributes());
        Assert.assertEquals(0x81A40000L, copy.getExternalAttributes());
        Assert.assertEquals(1, copy.getExtraFields().length);
        Assert.assertNotNull(copy.getExtraField(new ZipShort(0x0001)));
    }

    @Test
    public void testFileConstructor_directoryWithoutSlash() throws Exception {
        File tempDir = File.createTempFile("zipTestDir", "");
        tempDir.delete();
        tempDir.mkdir();
        tempDir.deleteOnExit();

        ZipArchiveEntry entry = new ZipArchiveEntry(tempDir, "myDir");
        Assert.assertEquals("myDir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());

        tempDir.delete();
    }

    @Test
    public void testFileConstructor_directoryWithSlash() throws Exception {
        File tempDir = File.createTempFile("zipTestDirSlash", "");
        tempDir.delete();
        tempDir.mkdir();
        tempDir.deleteOnExit();

        ZipArchiveEntry entry = new ZipArchiveEntry(tempDir, "myDir/");
        Assert.assertEquals("myDir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());

        tempDir.delete();
    }

    @Test
    public void testFileConstructor_file() throws Exception {
        File tempFile = File.createTempFile("zipTestFile", ".txt");
        tempFile.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("Hello World".getBytes());
        }

        ZipArchiveEntry entry = new ZipArchiveEntry(tempFile, "hello.txt");
        Assert.assertEquals("hello.txt", entry.getName());
        Assert.assertFalse(entry.isDirectory());
        Assert.assertEquals(tempFile.length(), entry.getSize());
        Assert.assertEquals(tempFile.lastModified(), entry.getTime());

        tempFile.delete();
    }

    @Test
    public void testClone_withAndWithoutExtraFields() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("entry1.txt");
        entry1.setInternalAttributes(10);
        entry1.setExternalAttributes(20L);

        ZipArchiveEntry clone1 = (ZipArchiveEntry) entry1.clone();
        Assert.assertEquals(entry1.getName(), clone1.getName());
        Assert.assertEquals(10, clone1.getInternalAttributes());
        Assert.assertEquals(20L, clone1.getExternalAttributes());
        Assert.assertEquals(0, clone1.getExtraFields().length);

        ZipArchiveEntry entry2 = new ZipArchiveEntry("entry2.txt");
        DummyExtraField field = new DummyExtraField(new ZipShort(1), new byte[]{5}, new byte[]{6});
        entry2.addExtraField(field);

        ZipArchiveEntry clone2 = (ZipArchiveEntry) entry2.clone();
        Assert.assertEquals(entry2.getName(), clone2.getName());
        Assert.assertEquals(1, clone2.getExtraFields().length);
        Assert.assertNotNull(clone2.getExtraField(new ZipShort(1)));
        Assert.assertNotSame(entry2.getExtraFields(), clone2.getExtraFields());
    }

    @Test
    public void testCompressionMethod_isSupported() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        Assert.assertEquals(-1, entry.getMethod());
        Assert.assertFalse(entry.isSupportedCompressionMethod());

        entry.setMethod(ZipEntry.STORED);
        Assert.assertEquals(ZipEntry.STORED, entry.getMethod());
        Assert.assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(ZipEntry.DEFLATED);
        Assert.assertEquals(ZipEntry.DEFLATED, entry.getMethod());
        Assert.assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(88);
        Assert.assertEquals(88, entry.getMethod());
        Assert.assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethod_negativeThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(-2);
    }

    @Test
    public void testInternalAndExternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setInternalAttributes(1234);
        Assert.assertEquals(1234, entry.getInternalAttributes());

        entry.setExternalAttributes(0xFEDCBA9876543210L);
        Assert.assertEquals(0xFEDCBA9876543210L, entry.getExternalAttributes());
    }

    @Test
    public void testUnixMode_fileAndDirectory() {
        ZipArchiveEntry fileEntry = new ZipArchiveEntry("file.txt");
        fileEntry.setUnixMode(0644); // 0644 octal, user write bit (0200) is set -> read-only bit = 0
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, fileEntry.getPlatform());
        Assert.assertEquals(0644, fileEntry.getUnixMode());
        // external attributes: (0644 << 16) | 0 | 0 = 0x01A40000
        Assert.assertEquals(0644 << 16, fileEntry.getExternalAttributes());

        ZipArchiveEntry readOnlyFile = new ZipArchiveEntry("ro.txt");
        readOnlyFile.setUnixMode(0444); // 0444 octal, user write bit (0200) is NOT set -> read-only bit = 1
        Assert.assertEquals(0444, readOnlyFile.getUnixMode());
        Assert.assertEquals((0444 << 16) | 1, readOnlyFile.getExternalAttributes());

        ZipArchiveEntry dirEntry = new ZipArchiveEntry("myDir/");
        dirEntry.setUnixMode(0755); // directory flag = 0x10
        Assert.assertEquals(0755, dirEntry.getUnixMode());
        Assert.assertEquals((0755 << 16) | 0x10, dirEntry.getExternalAttributes());

        // Platform FAT returns 0 for unixMode
        ZipArchiveEntry fatEntry = new ZipArchiveEntry("fat.txt");
        fatEntry.setExternalAttributes(0644 << 16);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, fatEntry.getPlatform());
        Assert.assertEquals(0, fatEntry.getUnixMode());
    }

    @Test
    public void testSetPlatform() {
        SubZipArchiveEntry entry = new SubZipArchiveEntry("test.txt");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testExtraFieldOperations_addGetRemove() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extra.txt");
        Assert.assertNull(entry.getExtraField(new ZipShort(1)));
        Assert.assertEquals(0, entry.getExtraFields().length);

        DummyExtraField field1 = new DummyExtraField(new ZipShort(1), new byte[]{1, 2}, new byte[]{1});
        DummyExtraField field2 = new DummyExtraField(new ZipShort(2), new byte[]{3, 4}, new byte[]{2});
        DummyExtraField field1Replace = new DummyExtraField(new ZipShort(1), new byte[]{9, 9}, new byte[]{9});

        entry.addExtraField(field1);
        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertSame(field1, entry.getExtraField(new ZipShort(1)));

        entry.addExtraField(field2);
        Assert.assertEquals(2, entry.getExtraFields().length);

        // Replacing existing
        entry.addExtraField(field1Replace);
        Assert.assertEquals(2, entry.getExtraFields().length);
        Assert.assertSame(field1Replace, entry.getExtraField(new ZipShort(1)));

        entry.removeExtraField(new ZipShort(1));
        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertNull(entry.getExtraField(new ZipShort(1)));
        Assert.assertSame(field2, entry.getExtraField(new ZipShort(2)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_whenNullThrows() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.removeExtraField(new ZipShort(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_whenNotFoundThrows() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.addExtraField(new DummyExtraField(new ZipShort(1)));
        entry.removeExtraField(new ZipShort(2));
    }

    @Test
    public void testAddAsFirstExtraField_whenNullAndNotNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("first.txt");
        DummyExtraField field1 = new DummyExtraField(new ZipShort(1));
        DummyExtraField field2 = new DummyExtraField(new ZipShort(2));
        DummyExtraField field3 = new DummyExtraField(new ZipShort(3));

        entry.addAsFirstExtraField(field1);
        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertSame(field1, entry.getExtraFields()[0]);

        entry.addAsFirstExtraField(field2);
        Assert.assertEquals(2, entry.getExtraFields().length);
        Assert.assertSame(field2, entry.getExtraFields()[0]);
        Assert.assertSame(field1, entry.getExtraFields()[1]);

        // Replace existing by adding as first
        entry.addExtraField(field3);
        DummyExtraField field3New = new DummyExtraField(new ZipShort(3));
        entry.addAsFirstExtraField(field3New);
        Assert.assertEquals(3, entry.getExtraFields().length);
        Assert.assertSame(field3New, entry.getExtraFields()[0]);
    }

    @Test
    public void testSetExtra_byteDataAndMerging() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        // Header 0x0001, len 2, data [0x0A, 0x0B]
        byte[] extraData1 = new byte[]{0x01, 0x00, 0x02, 0x00, 0x0A, 0x0B};
        entry.setExtra(extraData1);

        ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(1, fields.length);
        Assert.assertEquals(0x0001, fields[0].getHeaderId().getValue());

        // Merge with another header 0x0002, len 1, data [0xFF]
        byte[] extraData2 = new byte[]{0x02, 0x00, 0x01, 0x00, (byte) 0xFF};
        entry.setExtra(extraData2);
        Assert.assertEquals(2, entry.getExtraFields().length);
        Assert.assertNotNull(entry.getExtraField(new ZipShort(0x0001)));
        Assert.assertNotNull(entry.getExtraField(new ZipShort(0x0002)));

        // Merge updated data for existing header 0x0001
        byte[] extraData3 = new byte[]{0x01, 0x00, 0x02, 0x00, 0x0C, 0x0D};
        entry.setExtra(extraData3);
        Assert.assertEquals(2, entry.getExtraFields().length);
    }

    @Test(expected = RuntimeException.class)
    public void testSetExtra_invalidDataThrows() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        // Incomplete header bytes (< 4 bytes)
        byte[] invalidData = new byte[]{0x01, 0x00};
        entry.setExtra(invalidData);
    }

    @Test
    public void testSetCentralDirectoryExtra_validAndMerging() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        // Header 0x0001, len 2, data [0x11, 0x22]
        byte[] cdData1 = new byte[]{0x01, 0x00, 0x02, 0x00, 0x11, 0x22};
        entry.setCentralDirectoryExtra(cdData1);
        Assert.assertEquals(1, entry.getExtraFields().length);

        // Merge with existing
        byte[] cdData2 = new byte[]{0x01, 0x00, 0x02, 0x00, 0x33, 0x44, 0x02, 0x00, 0x01, 0x00, 0x55};
        entry.setCentralDirectoryExtra(cdData2);
        Assert.assertEquals(2, entry.getExtraFields().length);
    }

    @Test(expected = RuntimeException.class)
    public void testSetCentralDirectoryExtra_invalidDataThrows() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        byte[] invalidData = new byte[]{0x01, 0x00, 0x05, 0x00, 0x01}; // length is 5 but only 1 byte provided
        entry.setCentralDirectoryExtra(invalidData);
    }

    @Test
    public void testGetLocalFileDataExtra_andGetCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        Assert.assertEquals(0, entry.getLocalFileDataExtra().length);
        Assert.assertEquals(0, entry.getCentralDirectoryExtra().length);

        DummyExtraField field = new DummyExtraField(new ZipShort(0x0005), new byte[]{1, 2}, new byte[]{3, 4, 5});
        entry.addExtraField(field);

        byte[] localExtra = entry.getLocalFileDataExtra();
        // 4 header bytes + 2 data bytes = 6 bytes
        Assert.assertEquals(6, localExtra.length);

        byte[] centralExtra = entry.getCentralDirectoryExtra();
        // 4 header bytes + 3 data bytes = 7 bytes
        Assert.assertEquals(7, centralExtra.length);
    }

    @Test
    public void testSetName_andGetName() {
        SubZipArchiveEntry entry = new SubZipArchiveEntry("initial.txt");
        Assert.assertEquals("initial.txt", entry.getName());

        entry.setName("modified.txt");
        Assert.assertEquals("modified.txt", entry.getName());

        entry.setName(null);
        Assert.assertEquals("initial.txt", entry.getName());
    }

    @Test
    public void testHashCode() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("name1.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("name1.txt");
        ZipArchiveEntry entry3 = new ZipArchiveEntry("name2.txt");

        Assert.assertEquals(entry1.hashCode(), entry2.hashCode());
        Assert.assertNotEquals(entry1.hashCode(), entry3.hashCode());
    }

    @Test
    public void testLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        long now = System.currentTimeMillis();
        entry.setTime(now);
        Assert.assertEquals(new Date(now), entry.getLastModifiedDate());
    }

    @Test
    public void testEquals() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry entry3 = new ZipArchiveEntry("other.txt");

        // Same reference
        Assert.assertTrue(entry1.equals(entry1));

        // Null and different class
        Assert.assertFalse(entry1.equals(null));
        Assert.assertFalse(entry1.equals("Not a ZipArchiveEntry"));

        // Same name
        Assert.assertTrue(entry1.equals(entry2));
        Assert.assertTrue(entry2.equals(entry1));

        // Different name
        Assert.assertFalse(entry1.equals(entry3));

        // Name is null branches
        SubZipArchiveEntry nullName1 = new SubZipArchiveEntry("temp");
        nullName1.setName(null);
        SubZipArchiveEntry nullName2 = new SubZipArchiveEntry("temp");
        nullName2.setName(null);
        SubZipArchiveEntry customName = new SubZipArchiveEntry("temp");
        customName.setName("custom");

        // nullName1.name is null, nullName2.name is null -> true
        Assert.assertTrue(nullName1.equals(nullName2));
        // nullName1.name is null, customName.name != null -> false
        Assert.assertFalse(nullName1.equals(customName));
        // customName.name != null, nullName1.name is null -> false
        Assert.assertFalse(customName.equals(nullName1));
    }
}
