package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class ZipArchiveEntryTest {

    private static class DummyExtraField implements ZipExtraField {
        private final ZipShort headerId;
        private byte[] localData = new byte[0];
        private byte[] centralData = new byte[0];

        public DummyExtraField(ZipShort headerId) {
            this.headerId = headerId;
        }

        public DummyExtraField(int headerId) {
            this(new ZipShort(headerId));
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
        public void parseFromLocalFileData(byte[] buffer, int offset, int length) {
            localData = new byte[length];
            System.arraycopy(buffer, offset, localData, 0, length);
        }

        @Override
        public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) {
            centralData = new byte[length];
            System.arraycopy(buffer, offset, centralData, 0, length);
        }
    }

    private static class SubclassZipArchiveEntry extends ZipArchiveEntry {
        public SubclassZipArchiveEntry() {
            super();
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
        public void setName(String name, byte[] rawName) {
            super.setName(name, rawName);
        }

        @Override
        public void setExtra() {
            super.setExtra();
        }
    }

    @Test
    public void testConstructor_StringName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertEquals("test.txt", entry.getName());
        assertFalse(entry.isDirectory());

        ZipArchiveEntry dirEntry = new ZipArchiveEntry("dir/");
        assertEquals("dir/", dirEntry.getName());
        assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testConstructor_ProtectedDefault() {
        SubclassZipArchiveEntry entry = new SubclassZipArchiveEntry();
        assertEquals("", entry.getName());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructor_JavaZipEntry_WithoutExtra() throws ZipException {
        ZipEntry stdEntry = new ZipEntry("entry.txt");
        stdEntry.setMethod(ZipEntry.DEFLATED);
        stdEntry.setSize(1024L);

        ZipArchiveEntry archiveEntry = new ZipArchiveEntry(stdEntry);
        assertEquals("entry.txt", archiveEntry.getName());
        assertEquals(ZipEntry.DEFLATED, archiveEntry.getMethod());
        assertEquals(1024L, archiveEntry.getSize());
        assertEquals(0, archiveEntry.getExtraFields().length);
    }

    @Test
    public void testConstructor_JavaZipEntry_WithExtra() throws ZipException {
        ZipEntry stdEntry = new ZipEntry("entry.txt");
        // Extra field header 0x0001 (ZipShort 1), length 0x0000
        byte[] extraData = new byte[] { 0x01, 0x00, 0x00, 0x00 };
        stdEntry.setExtra(extraData);

        ZipArchiveEntry archiveEntry = new ZipArchiveEntry(stdEntry);
        assertEquals("entry.txt", archiveEntry.getName());
        assertEquals(1, archiveEntry.getExtraFields().length);
    }

    @Test
    public void testConstructor_ZipArchiveEntryCopy() throws ZipException {
        ZipArchiveEntry source = new ZipArchiveEntry("src.txt");
        source.setInternalAttributes(5);
        source.setExternalAttributes(10L);
        DummyExtraField field = new DummyExtraField(0x1234);
        source.addExtraField(field);

        ZipArchiveEntry copy = new ZipArchiveEntry(source);
        assertEquals("src.txt", copy.getName());
        assertEquals(5, copy.getInternalAttributes());
        assertEquals(10L, copy.getExternalAttributes());
        assertNotNull(copy.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testConstructor_File_Directory() throws IOException {
        File tempDir = File.createTempFile("test_dir", "");
        tempDir.delete();
        tempDir.mkdir();
        tempDir.deleteOnExit();

        ZipArchiveEntry entry1 = new ZipArchiveEntry(tempDir, "myDir");
        assertEquals("myDir/", entry1.getName());
        assertTrue(entry1.isDirectory());

        ZipArchiveEntry entry2 = new ZipArchiveEntry(tempDir, "myDir/");
        assertEquals("myDir/", entry2.getName());
        assertTrue(entry2.isDirectory());

        tempDir.delete();
    }

    @Test
    public void testConstructor_File_RegularFile() throws IOException {
        File tempFile = File.createTempFile("test_file", ".txt");
        tempFile.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("Hello World".getBytes());
        }

        ZipArchiveEntry entry = new ZipArchiveEntry(tempFile, "myFile.txt");
        assertEquals("myFile.txt", entry.getName());
        assertFalse(entry.isDirectory());
        assertEquals(tempFile.length(), entry.getSize());
        assertEquals(tempFile.lastModified(), entry.getTime());

        tempFile.delete();
    }

    @Test
    public void testClone() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setInternalAttributes(12);
        entry.setExternalAttributes(34L);
        DummyExtraField field = new DummyExtraField(0x5678);
        entry.addExtraField(field);

        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertNotSame(entry, cloned);
        assertEquals(entry.getName(), cloned.getName());
        assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        assertNotNull(cloned.getExtraField(new ZipShort(0x5678)));
    }

    @Test
    public void testMethod_GetterAndSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(-1, entry.getMethod());

        entry.setMethod(ZipEntry.STORED);
        assertEquals(ZipEntry.STORED, entry.getMethod());

        entry.setMethod(ZipEntry.DEFLATED);
        assertEquals(ZipEntry.DEFLATED, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethod_NegativeValueThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setMethod(-2);
    }

    @Test
    public void testSize_GetterAndSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(ZipArchiveEntry.SIZE_UNKNOWN, entry.getSize());

        entry.setSize(5000L);
        assertEquals(5000L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSize_NegativeValueThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(-1L);
    }

    @Test
    public void testInternalAttributes_GetterAndSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(0, entry.getInternalAttributes());
        entry.setInternalAttributes(42);
        assertEquals(42, entry.getInternalAttributes());
    }

    @Test
    public void testExternalAttributes_GetterAndSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(0L, entry.getExternalAttributes());
        entry.setExternalAttributes(0x12345678L);
        assertEquals(0x12345678L, entry.getExternalAttributes());
    }

    @Test
    public void testPlatform_GetterAndSetter() {
        SubclassZipArchiveEntry entry = new SubclassZipArchiveEntry();
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());

        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testUnixMode() {
        ZipArchiveEntry fileEntry = new ZipArchiveEntry("file.txt");
        assertEquals(0, fileEntry.getUnixMode()); // FAT platform returns 0

        // Set mode with write permission (0644 -> 0200 is set, DOS read-only bit = 0)
        fileEntry.setUnixMode(0644);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, fileEntry.getPlatform());
        assertEquals(0644, fileEntry.getUnixMode());
        assertEquals(0, fileEntry.getExternalAttributes() & 1); // Not read-only
        assertEquals(0, fileEntry.getExternalAttributes() & 0x10); // Not directory

        // Set mode without write permission (0444 -> 0200 not set, DOS read-only bit = 1)
        fileEntry.setUnixMode(0444);
        assertEquals(0444, fileEntry.getUnixMode());
        assertEquals(1, fileEntry.getExternalAttributes() & 1); // Read-only

        // Directory entry unix mode
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("dir/");
        dirEntry.setUnixMode(0755);
        assertEquals(0755, dirEntry.getUnixMode());
        assertEquals(0x10, dirEntry.getExternalAttributes() & 0x10); // Directory bit set
    }

    @Test
    public void testExtraFields_BasicOperations() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(0, entry.getExtraFields().length);
        assertEquals(0, entry.getExtraFields(true).length);
        assertEquals(0, entry.getExtraFields(false).length);
        assertNull(entry.getExtraField(new ZipShort(0x1111)));

        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[] { 1, 2, 3 }, 0, 3);
        entry.addExtraField(unparseable);

        assertNull(entry.getExtraField(new ZipShort(0x1111)));
        assertEquals(0, entry.getExtraFields(false).length);
        assertEquals(1, entry.getExtraFields(true).length);
        assertSame(unparseable, entry.getUnparseableExtraFieldData());

        DummyExtraField field1 = new DummyExtraField(0x1111);
        DummyExtraField field2 = new DummyExtraField(0x2222);
        entry.setExtraFields(new ZipExtraField[] { field1, field2, unparseable });

        assertEquals(2, entry.getExtraFields(false).length);
        assertEquals(3, entry.getExtraFields(true).length);
        assertSame(field1, entry.getExtraField(new ZipShort(0x1111)));
        assertSame(field2, entry.getExtraField(new ZipShort(0x2222)));

        entry.removeExtraField(new ZipShort(0x1111));
        assertNull(entry.getExtraField(new ZipShort(0x1111)));
        assertEquals(1, entry.getExtraFields(false).length);

        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
        assertEquals(1, entry.getExtraFields(true).length);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_WhenMapIsNull_ThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeExtraField(new ZipShort(0x1234));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_WhenKeyNotFound_ThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.addExtraField(new DummyExtraField(0x1111));
        entry.removeExtraField(new ZipShort(0x2222));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldData_WhenNull_ThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testAddAsFirstExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        DummyExtraField field1 = new DummyExtraField(0x1111);
        DummyExtraField field2 = new DummyExtraField(0x2222);

        entry.addExtraField(field1);
        entry.addAsFirstExtraField(field2);

        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertEquals(new ZipShort(0x2222), fields[0].getHeaderId());
        assertEquals(new ZipShort(0x1111), fields[1].getHeaderId());

        // Re-adding existing field as first
        entry.addAsFirstExtraField(field1);
        fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertEquals(new ZipShort(0x1111), fields[0].getHeaderId());
        assertEquals(new ZipShort(0x2222), fields[1].getHeaderId());

        // Adding unparseable as first
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addAsFirstExtraField(unparseable);
        assertSame(unparseable, entry.getUnparseableExtraFieldData());

        // Test addAsFirstExtraField on fresh entry
        ZipArchiveEntry freshEntry = new ZipArchiveEntry("fresh");
        freshEntry.addAsFirstExtraField(field1);
        assertEquals(1, freshEntry.getExtraFields().length);
    }

    @Test
    public void testSetExtraByteArray_AndMergeLocalData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        byte[] extraBytes = new byte[] {
                0x01, 0x00, 0x02, 0x00, 0x0A, 0x0B, // Header 1, length 2, data [10, 11]
                0x02, 0x00, 0x01, 0x00, 0x0C        // Header 2, length 1, data [12]
        };
        entry.setExtra(extraBytes);
        assertEquals(2, entry.getExtraFields().length);

        // Merge updated local data for header 1
        byte[] updatedBytes = new byte[] {
                0x01, 0x00, 0x02, 0x00, 0x0D, 0x0E  // Header 1, length 2, data [13, 14]
        };
        entry.setExtra(updatedBytes);
        assertEquals(2, entry.getExtraFields().length);

        ZipExtraField field1 = entry.getExtraField(new ZipShort(1));
        assertNotNull(field1);
        assertArrayEquals(new byte[] { 0x0D, 0x0E }, field1.getLocalFileDataData());
    }

    @Test
    public void testSetCentralDirectoryExtra_AndMergeCentralData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        byte[] centralBytes = new byte[] {
                0x01, 0x00, 0x02, 0x00, 0x0A, 0x0B
        };
        entry.setCentralDirectoryExtra(centralBytes);
        assertEquals(1, entry.getExtraFields().length);

        byte[] updatedCentralBytes = new byte[] {
                0x01, 0x00, 0x02, 0x00, 0x0F, 0x10,
                0x03, 0x00, 0x00, 0x00
        };
        entry.setCentralDirectoryExtra(updatedCentralBytes);
        assertEquals(2, entry.getExtraFields().length);
    }

    @Test
    public void testGetLocalAndCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNotNull(entry.getLocalFileDataExtra());
        assertNotNull(entry.getCentralDirectoryExtra());

        DummyExtraField field = new DummyExtraField(0x01);
        field.localData = new byte[] { 1, 2 };
        field.centralData = new byte[] { 3, 4, 5 };
        entry.addExtraField(field);

        assertTrue(entry.getLocalFileDataExtra().length > 0);
        assertTrue(entry.getCentralDirectoryExtra().length > 0);
    }

    @Test
    public void testNameHandling() {
        SubclassZipArchiveEntry entry = new SubclassZipArchiveEntry();

        // Platform FAT: backslash replaced with forward slash if no slash exists
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        entry.setName("dir\\subdir\\file.txt");
        assertEquals("dir/subdir/file.txt", entry.getName());

        // Platform FAT: backslash not replaced if slash already exists
        entry.setName("dir/subdir\\file.txt");
        assertEquals("dir/subdir\\file.txt", entry.getName());

        // Platform UNIX: backslash not replaced
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        entry.setName("dir\\file.txt");
        assertEquals("dir\\file.txt", entry.getName());

        // Null name
        entry.setName(null);
        assertNotNull(entry.getName()); // falls back to super.getName()
    }

    @Test
    public void testRawName() {
        SubclassZipArchiveEntry entry = new SubclassZipArchiveEntry();
        assertNull(entry.getRawName());

        byte[] raw = new byte[] { 't', 'e', 's', 't' };
        entry.setName("test", raw);
        assertArrayEquals(raw, entry.getRawName());
        assertNotSame(raw, entry.getRawName()); // returns defensive copy
    }

    @Test
    public void testHashCode() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("test.txt");
        assertEquals(entry1.hashCode(), entry2.hashCode());
        assertEquals("test.txt".hashCode(), entry1.hashCode());
    }

    @Test
    public void testGeneralPurposeBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertNotNull(entry.getGeneralPurposeBit());

        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        entry.setGeneralPurposeBit(gpb);
        assertSame(gpb, entry.getGeneralPurposeBit());
    }

    @Test
    public void testLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        long now = System.currentTimeMillis();
        entry.setTime(now);
        assertEquals(new Date(entry.getTime()), entry.getLastModifiedDate());
    }

    @Test
    public void testEquals() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("file.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("file.txt");

        // Same object
        assertTrue(e1.equals(e1));

        // Null and wrong class
        assertFalse(e1.equals(null));
        assertFalse(e1.equals("file.txt"));

        // Identical objects
        assertTrue(e1.equals(e2));
        assertTrue(e2.equals(e1));

        // Name differences
        ZipArchiveEntry eDiffName = new ZipArchiveEntry("other.txt");
        assertFalse(e1.equals(eDiffName));

        // Comment differences
        e1.setComment("comment");
        assertFalse(e1.equals(e2));
        e2.setComment("diffComment");
        assertFalse(e1.equals(e2));
        e2.setComment("comment");
        assertTrue(e1.equals(e2));

        // Time difference
        e2.setTime(e1.getTime() + 10000);
        assertFalse(e1.equals(e2));
        e2.setTime(e1.getTime());
        assertTrue(e1.equals(e2));

        // Internal attributes difference
        e2.setInternalAttributes(99);
        assertFalse(e1.equals(e2));
        e2.setInternalAttributes(e1.getInternalAttributes());
        assertTrue(e1.equals(e2));

        // Platform difference
        SubclassZipArchiveEntry sub1 = new SubclassZipArchiveEntry();
        SubclassZipArchiveEntry sub2 = new SubclassZipArchiveEntry();
        sub2.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertFalse(sub1.equals(sub2));

        // External attributes difference
        e2.setExternalAttributes(999L);
        assertFalse(e1.equals(e2));
        e2.setExternalAttributes(e1.getExternalAttributes());
        assertTrue(e1.equals(e2));

        // Method difference
        e1.setMethod(ZipEntry.DEFLATED);
        e2.setMethod(ZipEntry.STORED);
        assertFalse(e1.equals(e2));
        e2.setMethod(ZipEntry.DEFLATED);
        assertTrue(e1.equals(e2));

        // Size difference
        e1.setSize(100);
        e2.setSize(200);
        assertFalse(e1.equals(e2));
        e2.setSize(100);
        assertTrue(e1.equals(e2));

        // CRC difference
        e1.setCrc(111L);
        e2.setCrc(222L);
        assertFalse(e1.equals(e2));
        e2.setCrc(111L);
        assertTrue(e1.equals(e2));

        // Compressed size difference
        e1.setCompressedSize(50L);
        e2.setCompressedSize(60L);
        assertFalse(e1.equals(e2));
        e2.setCompressedSize(50L);
        assertTrue(e1.equals(e2));

        // Extra fields difference
        e1.addExtraField(new DummyExtraField(0x1234));
        assertFalse(e1.equals(e2));
        e2.addExtraField(new DummyExtraField(0x1234));
        assertTrue(e1.equals(e2));

        // GPB difference
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useEncryption(true);
        e2.setGeneralPurposeBit(gpb);
        assertFalse(e1.equals(e2));
    }
}
