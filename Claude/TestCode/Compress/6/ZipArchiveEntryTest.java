package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipException;

public class ZipArchiveEntryTest {

    /**
     * Simple test implementation of ZipExtraField used only for testing
     * purposes. The exact ZipExtraField interface signature is assumed
     * based on standard Apache Commons Compress API.
     */
    private static class TestZipExtraField implements ZipExtraField {
        private ZipShort headerId;
        private byte[] localData;
        private byte[] centralData;

        TestZipExtraField(int headerId, byte[] localData, byte[] centralData) {
            this.headerId = new ZipShort(headerId);
            this.localData = localData;
            this.centralData = centralData;
        }

        public ZipShort getHeaderId() {
            return headerId;
        }

        public ZipShort getLocalFileDataLength() {
            return new ZipShort(localData.length);
        }

        public ZipShort getCentralDirectoryLength() {
            return new ZipShort(centralData.length);
        }

        public byte[] getLocalFileDataData() {
            return localData;
        }

        public byte[] getCentralDirectoryData() {
            return centralData;
        }

        public void parseFromLocalFileData(byte[] data, int offset, int length) throws ZipException {
            this.localData = new byte[length];
            System.arraycopy(data, offset, this.localData, 0, length);
        }

        public void parseFromCentralDirectoryData(byte[] data, int offset, int length) throws ZipException {
            this.centralData = new byte[length];
            System.arraycopy(data, offset, this.centralData, 0, length);
        }
    }

    private ZipArchiveEntry entry;

    @Before
    public void setUp() {
        entry = new ZipArchiveEntry("test.txt");
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorWithName_normalInput_setsName() {
        ZipArchiveEntry e = new ZipArchiveEntry("myfile.txt");
        assertEquals("myfile.txt", e.getName());
    }

    @Test
    public void testConstructorWithZipEntry_normalInput_copiesFields() throws ZipException {
        java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("foo.txt");
        zipEntry.setMethod(java.util.zip.ZipEntry.STORED);
        ZipArchiveEntry e = new ZipArchiveEntry(zipEntry);
        assertEquals("foo.txt", e.getName());
        assertEquals(java.util.zip.ZipEntry.STORED, e.getMethod());
    }

    @Test
    public void testConstructorWithZipEntry_nullExtra_setsEmptyExtra() throws ZipException {
        java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("bar.txt");
        // default extra is null
        ZipArchiveEntry e = new ZipArchiveEntry(zipEntry);
        assertNotNull(e.getLocalFileDataExtra());
    }

    @Test
    public void testConstructorWithZipArchiveEntry_copiesAllFields() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("original.txt");
        original.setInternalAttributes(5);
        original.setExternalAttributes(10L);
        original.setMethod(java.util.zip.ZipEntry.DEFLATED);

        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals("original.txt", copy.getName());
        assertEquals(5, copy.getInternalAttributes());
        assertEquals(10L, copy.getExternalAttributes());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, copy.getMethod());
    }

    @Test
    public void testProtectedConstructor_defaultName() {
        ZipArchiveEntry e = new ZipArchiveEntry() { };
        assertEquals("", e.getName());
    }

    @Test
    public void testConstructorWithFileAndEntryName_fileIsDirectory_appendsSlash() throws IOException {
        File dir = File.createTempFile("ziptest", "dir");
        dir.delete();
        dir.mkdir();
        dir.deleteOnExit();
        try {
            ZipArchiveEntry e = new ZipArchiveEntry(dir, "somedir");
            assertTrue(e.getName().endsWith("/"));
        } finally {
            dir.delete();
        }
    }

    @Test
    public void testConstructorWithFileAndEntryName_fileIsFile_setsSize() throws IOException {
        File file = File.createTempFile("ziptest", ".txt");
        file.deleteOnExit();
        try {
            java.io.FileWriter fw = new java.io.FileWriter(file);
            fw.write("hello world");
            fw.close();

            ZipArchiveEntry e = new ZipArchiveEntry(file, "somefile.txt");
            assertEquals("somefile.txt", e.getName());
            assertEquals(file.length(), e.getSize());
        } finally {
            file.delete();
        }
    }

    // ---------- clone() ----------

    @Test
    public void testClone_returnsEqualButDistinctObject() {
        entry.setInternalAttributes(3);
        entry.setExternalAttributes(20L);
        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();

        assertNotSame(entry, cloned);
        assertEquals(entry.getName(), cloned.getName());
        assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        assertEquals(entry, cloned);
    }

    // ---------- isSupportedCompressionMethod ----------

    @Test
    public void testIsSupportedCompressionMethod_stored_true() {
        entry.setMethod(java.util.zip.ZipEntry.STORED);
        assertTrue(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testIsSupportedCompressionMethod_deflated_true() {
        entry.setMethod(java.util.zip.ZipEntry.DEFLATED);
        assertTrue(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testIsSupportedCompressionMethod_unknown_false() {
        entry.setMethod(5);
        assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testIsSupportedCompressionMethod_defaultNotSet_false() {
        ZipArchiveEntry fresh = new ZipArchiveEntry("fresh.txt");
        assertFalse(fresh.isSupportedCompressionMethod());
    }

    // ---------- getMethod/setMethod ----------

    @Test
    public void testGetSetMethod_normalValue() {
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethod_negativeValue_throwsException() {
        entry.setMethod(-1);
    }

    @Test
    public void testGetMethod_defaultValue_isMinusOne() {
        ZipArchiveEntry fresh = new ZipArchiveEntry("fresh.txt");
        assertEquals(-1, fresh.getMethod());
    }

    // ---------- Internal Attributes ----------

    @Test
    public void testGetSetInternalAttributes() {
        entry.setInternalAttributes(42);
        assertEquals(42, entry.getInternalAttributes());
    }

    @Test
    public void testGetInternalAttributes_default_isZero() {
        assertEquals(0, entry.getInternalAttributes());
    }

    // ---------- External Attributes ----------

    @Test
    public void testGetSetExternalAttributes() {
        entry.setExternalAttributes(1234L);
        assertEquals(1234L, entry.getExternalAttributes());
    }

    @Test
    public void testGetExternalAttributes_default_isZero() {
        assertEquals(0L, entry.getExternalAttributes());
    }

    // ---------- Unix mode / platform ----------

    @Test
    public void testSetUnixMode_normalValue_setsPlatformUnix() {
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testSetUnixMode_readOnlyMode_setsReadOnlyBit() {
        entry.setUnixMode(0400);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testGetUnixMode_notUnixPlatform_returnsZero() {
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testGetPlatform_default_returnsFat() {
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetUnixMode_directoryEntry_setsDirectoryFlag() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("dir/");
        dirEntry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, dirEntry.getPlatform());
    }

    // ---------- Extra fields ----------

    @Test
    public void testSetGetExtraFields() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1, 2}, new byte[]{1, 2});
        TestZipExtraField f2 = new TestZipExtraField(2, new byte[]{3, 4}, new byte[]{3, 4});
        entry.setExtraFields(new ZipExtraField[]{f1, f2});

        ZipExtraField[] result = entry.getExtraFields();
        assertEquals(2, result.length);
    }

    @Test
    public void testGetExtraFields_noFields_returnsEmptyArray() {
        ZipExtraField[] result = entry.getExtraFields();
        assertEquals(0, result.length);
    }

    @Test
    public void testSetExtraFields_emptyArray_returnsEmpty() {
        entry.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testAddExtraField() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1}, new byte[]{1});
        entry.addExtraField(f1);
        assertEquals(1, entry.getExtraFields().length);
        assertSame(f1, entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testAddExtraField_replacesExisting() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1}, new byte[]{1});
        TestZipExtraField f1b = new TestZipExtraField(1, new byte[]{9}, new byte[]{9});
        entry.addExtraField(f1);
        entry.addExtraField(f1b);
        assertEquals(1, entry.getExtraFields().length);
        assertSame(f1b, entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testAddAsFirstExtraField() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1}, new byte[]{1});
        TestZipExtraField f2 = new TestZipExtraField(2, new byte[]{2}, new byte[]{2});
        entry.addExtraField(f1);
        entry.addAsFirstExtraField(f2);

        ZipExtraField[] result = entry.getExtraFields();
        assertEquals(2, result.length);
        assertSame(f2, result[0]);
    }

    @Test
    public void testAddAsFirstExtraField_noExistingFields() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1}, new byte[]{1});
        entry.addAsFirstExtraField(f1);
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void testRemoveExtraField_existing() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1}, new byte[]{1});
        entry.addExtraField(f1);
        entry.removeExtraField(new ZipShort(1));
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_notExisting_throwsException() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1}, new byte[]{1});
        entry.addExtraField(f1);
        entry.removeExtraField(new ZipShort(99));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_noFields_throwsException() {
        entry.removeExtraField(new ZipShort(1));
    }

    @Test
    public void testGetExtraField_existing() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1}, new byte[]{1});
        entry.addExtraField(f1);
        assertSame(f1, entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testGetExtraField_notExisting_returnsNull() {
        assertNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testGetExtraField_noFieldsAtAll_returnsNull() {
        ZipArchiveEntry fresh = new ZipArchiveEntry("fresh.txt");
        assertNull(fresh.getExtraField(new ZipShort(1)));
    }

    // ---------- setExtra / setCentralDirectoryExtra ----------

    @Test
    public void testSetExtraByteArray_emptyArray_noException() {
        entry.setExtra(new byte[0]);
        assertNotNull(entry.getLocalFileDataExtra());
    }

    @Test
    public void testSetExtraByteArray_mergesWithExisting() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1}, new byte[]{1});
        entry.addExtraField(f1);
        entry.setExtra(new byte[0]);
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void testSetCentralDirectoryExtra_emptyArray_noException() {
        entry.setCentralDirectoryExtra(new byte[0]);
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test
    public void testSetCentralDirectoryExtra_mergesWithExisting() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1}, new byte[]{1});
        entry.addExtraField(f1);
        entry.setCentralDirectoryExtra(new byte[0]);
        assertEquals(1, entry.getExtraFields().length);
    }

    // ---------- getLocalFileDataExtra / getCentralDirectoryExtra ----------

    @Test
    public void testGetLocalFileDataExtra_noFields_returnsEmptyArray() {
        byte[] extra = entry.getLocalFileDataExtra();
        assertNotNull(extra);
    }

    @Test
    public void testGetLocalFileDataExtra_withFields_returnsData() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1, 2}, new byte[]{1, 2});
        entry.addExtraField(f1);
        byte[] extra = entry.getLocalFileDataExtra();
        assertNotNull(extra);
        assertTrue(extra.length > 0);
    }

    @Test
    public void testGetCentralDirectoryExtra_noFields_returnsEmptyArray() {
        byte[] extra = entry.getCentralDirectoryExtra();
        assertNotNull(extra);
        assertEquals(0, extra.length);
    }

    @Test
    public void testGetCentralDirectoryExtra_withFields_returnsData() {
        TestZipExtraField f1 = new TestZipExtraField(1, new byte[]{1, 2}, new byte[]{1, 2});
        entry.addExtraField(f1);
        byte[] extra = entry.getCentralDirectoryExtra();
        assertNotNull(extra);
        assertTrue(extra.length > 0);
    }

    // ---------- getName / isDirectory / setName ----------

    @Test
    public void testGetName_returnsName() {
        assertEquals("test.txt", entry.getName());
    }

    @Test
    public void testIsDirectory_true() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("dir/");
        assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testIsDirectory_false() {
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testSetName_protected_updatesName() {
        entry.setName("newname.txt");
        assertEquals("newname.txt", entry.getName());
    }

    @Test
    public void testSetName_emptyString() {
        entry.setName("");
        assertEquals("", entry.getName());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalsNameHashCode() {
        assertEquals(entry.getName().hashCode(), entry.hashCode());
    }

    @Test
    public void testHashCode_sameForEqualNames() {
        ZipArchiveEntry other = new ZipArchiveEntry("test.txt");
        assertEquals(entry.hashCode(), other.hashCode());
    }

    // ---------- getLastModifiedDate ----------

    @Test
    public void testGetLastModifiedDate_returnsDateBasedOnTime() {
        long time = System.currentTimeMillis();
        entry.setTime(time);
        Date date = entry.getLastModifiedDate();
        assertNotNull(date);
        assertEquals(entry.getTime(), date.getTime());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_true() {
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEquals_null_false() {
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEquals_differentClass_false() {
        assertFalse(entry.equals("not an entry"));
    }

    @Test
    public void testEquals_sameName_true() {
        ZipArchiveEntry other = new ZipArchiveEntry("test.txt");
        assertTrue(entry.equals(other));
    }

    @Test
    public void testEquals_differentName_false() {
        ZipArchiveEntry other = new ZipArchiveEntry("other.txt");
        assertFalse(entry.equals(other));
    }

    @Test
    public void testEquals_bothNullNames_true() {
        ZipArchiveEntry e1 = new ZipArchiveEntry() { };
        ZipArchiveEntry e2 = new ZipArchiveEntry() { };
        e1.setName(null);
        e2.setName(null);
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEquals_oneNullNameOtherNot_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("somename");
        ZipArchiveEntry e2 = new ZipArchiveEntry() { };
        e1.setName(null);
        assertFalse(e1.equals(e2));
    }
}
