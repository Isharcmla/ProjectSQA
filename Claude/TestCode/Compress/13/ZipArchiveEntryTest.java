import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class ZipArchiveEntryTest {

    /**
     * Minimal implementation of ZipExtraField used only for testing
     * extra-field related public methods of ZipArchiveEntry.
     */
    private static class TestExtraField implements ZipExtraField {
        private final ZipShort headerId;
        private byte[] localData = new byte[0];
        private byte[] centralData = new byte[0];

        TestExtraField(int id) {
            headerId = new ZipShort(id);
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

        public void parseFromLocalFileData(byte[] data, int offset, int length) {
            localData = new byte[length];
            System.arraycopy(data, offset, localData, 0, length);
        }

        public void parseFromCentralDirectoryData(byte[] data, int offset, int length) {
            centralData = new byte[length];
            System.arraycopy(data, offset, centralData, 0, length);
        }
    }

    private ZipArchiveEntry entry;

    @Before
    public void setUp() {
        entry = new ZipArchiveEntry("test.txt");
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructorWithName_normal_setsName() {
        ZipArchiveEntry e = new ZipArchiveEntry("hello.txt");
        assertEquals("hello.txt", e.getName());
        assertFalse(e.isDirectory());
    }

    @Test
    public void testConstructorWithName_directoryName_isDirectoryTrue() {
        ZipArchiveEntry e = new ZipArchiveEntry("dir/");
        assertTrue(e.isDirectory());
    }

    @Test
    public void testConstructorWithName_emptyString_ok() {
        ZipArchiveEntry e = new ZipArchiveEntry("");
        assertEquals("", e.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithName_null_throwsException() {
        new ZipArchiveEntry((String) null);
    }

    @Test
    public void testProtectedNoArgConstructor_createsEmptyNameEntry() {
        ZipArchiveEntry e = new ZipArchiveEntry();
        assertEquals("", e.getName());
    }

    @Test
    public void testConstructorFromZipEntry_noExtra_normal() throws ZipException {
        java.util.zip.ZipEntry je = new java.util.zip.ZipEntry("foo.txt");
        je.setMethod(java.util.zip.ZipEntry.DEFLATED);
        je.setSize(100);
        ZipArchiveEntry zae = new ZipArchiveEntry(je);
        assertEquals("foo.txt", zae.getName());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, zae.getMethod());
        assertEquals(100, zae.getSize());
    }

    @Test
    public void testConstructorFromZipEntry_withUnparseableExtra_setsUnparseable() throws ZipException {
        java.util.zip.ZipEntry je = new java.util.zip.ZipEntry("foo2.txt");
        je.setExtra(new byte[] { 1, 2, 3 }); // too short to be a valid extra field
        ZipArchiveEntry zae = new ZipArchiveEntry(je);
        assertNotNull(zae.getUnparseableExtraFieldData());
    }

    @Test
    public void testConstructorFromZipArchiveEntry_copiesAttributes() throws ZipException {
        ZipArchiveEntry orig = new ZipArchiveEntry("copy.txt");
        orig.setInternalAttributes(5);
        orig.setExternalAttributes(10L);
        orig.setMethod(0);
        ZipArchiveEntry copy = new ZipArchiveEntry(orig);
        assertEquals("copy.txt", copy.getName());
        assertEquals(5, copy.getInternalAttributes());
        assertEquals(10L, copy.getExternalAttributes());
    }

    @Test
    public void testConstructorFromFile_normalFile_setsSizeAndTime() throws IOException {
        File tempFile = File.createTempFile("zaetest", ".tmp");
        tempFile.deleteOnExit();
        ZipArchiveEntry e = new ZipArchiveEntry(tempFile, "entry.txt");
        assertEquals("entry.txt", e.getName());
        assertEquals(tempFile.length(), e.getSize());
    }

    @Test
    public void testConstructorFromFile_directoryWithoutSlash_appendsSlash() {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        assertTrue(tempDir.isDirectory());
        ZipArchiveEntry e = new ZipArchiveEntry(tempDir, "dir");
        assertEquals("dir/", e.getName());
        assertTrue(e.isDirectory());
    }

    @Test
    public void testConstructorFromFile_directoryWithSlash_keepsSlash() {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        ZipArchiveEntry e = new ZipArchiveEntry(tempDir, "dir/");
        assertEquals("dir/", e.getName());
    }

    // ---------- clone ----------

    @Test
    public void testClone_copiesFieldsAndExtras() {
        entry.setInternalAttributes(3);
        entry.setExternalAttributes(7L);
        entry.addExtraField(new TestExtraField(1));
        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        assertEquals(entry.getExtraFields(true).length, cloned.getExtraFields(true).length);
        assertEquals(entry.getName(), cloned.getName());
    }

    // ---------- method ----------

    @Test
    public void testGetSetMethod_normal_returnsSameValue() {
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test
    public void testGetMethod_default_returnsMinusOne() {
        ZipArchiveEntry e = new ZipArchiveEntry("x.txt");
        assertEquals(-1, e.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethod_negative_throwsException() {
        entry.setMethod(-5);
    }

    // ---------- internal / external attributes ----------

    @Test
    public void testGetSetInternalAttributes_normal() {
        entry.setInternalAttributes(42);
        assertEquals(42, entry.getInternalAttributes());
    }

    @Test
    public void testGetSetExternalAttributes_normal() {
        entry.setExternalAttributes(123456L);
        assertEquals(123456L, entry.getExternalAttributes());
    }

    // ---------- unix mode / platform ----------

    @Test
    public void testGetPlatform_default_isFat() {
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetUnixMode_normal_updatesPlatformAndMode() {
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testGetUnixMode_whenNotUnixPlatform_returnsZero() {
        assertEquals(0, entry.getUnixMode());
    }

    // ---------- extra fields ----------

    @Test
    public void testGetExtraFields_defaultEmpty_returnsEmptyArray() {
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(0, fields.length);
    }

    @Test
    public void testSetExtraFields_thenGetExtraFields_returnsSameFields() {
        TestExtraField f1 = new TestExtraField(1);
        TestExtraField f2 = new TestExtraField(2);
        entry.setExtraFields(new ZipExtraField[] { f1, f2 });
        ZipExtraField[] result = entry.getExtraFields();
        assertEquals(2, result.length);
    }

    @Test
    public void testAddExtraField_addsNewField() {
        TestExtraField f1 = new TestExtraField(1);
        entry.addExtraField(f1);
        assertNotNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testAddExtraField_replacesExisting() {
        TestExtraField f1 = new TestExtraField(1);
        TestExtraField f1b = new TestExtraField(1);
        entry.addExtraField(f1);
        entry.addExtraField(f1b);
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void testAddAsFirstExtraField_addsFieldAtFront() {
        TestExtraField f1 = new TestExtraField(1);
        TestExtraField f2 = new TestExtraField(2);
        entry.addExtraField(f1);
        entry.addAsFirstExtraField(f2);
        ZipExtraField[] result = entry.getExtraFields();
        assertEquals(2, result.length);
        assertEquals(new ZipShort(2), result[0].getHeaderId());
    }

    @Test
    public void testRemoveExtraField_existing_removesSuccessfully() {
        TestExtraField f1 = new TestExtraField(1);
        entry.addExtraField(f1);
        entry.removeExtraField(new ZipShort(1));
        assertNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_whenExtraFieldsNull_throwsException() {
        ZipArchiveEntry fresh = new ZipArchiveEntry("fresh.txt");
        fresh.removeExtraField(new ZipShort(99));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_whenNotPresent_throwsException() {
        TestExtraField f1 = new TestExtraField(1);
        entry.addExtraField(f1);
        entry.removeExtraField(new ZipShort(999));
    }

    @Test
    public void testGetExtraField_notExisting_returnsNull() {
        assertNull(entry.getExtraField(new ZipShort(5)));
    }

    @Test
    public void testGetUnparseableExtraFieldData_default_returnsNull() {
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetExtra_withUnparseableBytes_setsUnparseableExtraFieldData() {
        entry.setExtra(new byte[] { 9, 9, 9 });
        assertNotNull(entry.getUnparseableExtraFieldData());
        ZipExtraField[] withUnparseable = entry.getExtraFields(true);
        assertEquals(1, withUnparseable.length);
        ZipExtraField[] withoutUnparseable = entry.getExtraFields(false);
        assertEquals(0, withoutUnparseable.length);
    }

    @Test
    public void testSetExtra_withEmptyArray_noExceptions() {
        entry.setExtra(new byte[0]);
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldData_whenNone_throwsException() {
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testRemoveUnparseableExtraFieldData_whenPresent_removesSuccessfully() {
        entry.setExtra(new byte[] { 9, 9, 9 });
        assertNotNull(entry.getUnparseableExtraFieldData());
        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetCentralDirectoryExtra_withUnparseableBytes_setsUnparseable() {
        entry.setCentralDirectoryExtra(new byte[] { 7, 7, 7 });
        assertNotNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testGetLocalFileDataExtra_default_returnsEmptyArray() {
        byte[] extra = entry.getLocalFileDataExtra();
        assertNotNull(extra);
    }

    @Test
    public void testGetCentralDirectoryExtra_default_returnsArray() {
        byte[] extra = entry.getCentralDirectoryExtra();
        assertNotNull(extra);
    }

    // ---------- name / directory ----------

    @Test
    public void testGetName_normal_returnsSetName() {
        assertEquals("test.txt", entry.getName());
    }

    @Test
    public void testIsDirectory_endsWithSlash_true() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("mydir/");
        assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testIsDirectory_notEndsWithSlash_false() {
        assertFalse(entry.isDirectory());
    }

    // ---------- size ----------

    @Test
    public void testGetSize_default_returnsSizeUnknown() {
        ZipArchiveEntry e = new ZipArchiveEntry("size.txt");
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, e.getSize());
    }

    @Test
    public void testSetSize_normal_setsCorrectly() {
        entry.setSize(1000L);
        assertEquals(1000L, entry.getSize());
    }

    @Test
    public void testSetSize_zero_ok() {
        entry.setSize(0L);
        assertEquals(0L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_negative_throwsException() {
        entry.setSize(-5L);
    }

    // ---------- raw name ----------

    @Test
    public void testGetRawName_whenNotSet_returnsNull() {
        assertNull(entry.getRawName());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_matchesNameHashCode() {
        assertEquals(entry.getName().hashCode(), entry.hashCode());
    }

    // ---------- general purpose bit ----------

    @Test
    public void testGetGeneralPurposeBit_default_notNull() {
        assertNotNull(entry.getGeneralPurposeBit());
    }

    @Test
    public void testSetGeneralPurposeBit_normal_updatesValue() {
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        entry.setGeneralPurposeBit(gpb);
        assertSame(gpb, entry.getGeneralPurposeBit());
    }

    // ---------- last modified date ----------

    @Test
    public void testGetLastModifiedDate_returnsDateBasedOnTime() {
        long now = System.currentTimeMillis();
        entry.setTime(now);
        assertEquals(new java.util.Date(entry.getTime()), entry.getLastModifiedDate());
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
    public void testEquals_sameNameAndAttributes_true() {
        ZipArchiveEntry a = new ZipArchiveEntry("same.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("same.txt");
        a.setMethod(0);
        b.setMethod(0);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentName_false() {
        ZipArchiveEntry a = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("b.txt");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentComment_false() {
        ZipArchiveEntry a = new ZipArchiveEntry("cmt.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("cmt.txt");
        a.setComment("hello");
        b.setComment("world");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_sameCommentNull_true() {
        ZipArchiveEntry a = new ZipArchiveEntry("cmt2.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("cmt2.txt");
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentMethod_false() {
        ZipArchiveEntry a = new ZipArchiveEntry("m.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("m.txt");
        a.setMethod(0);
        b.setMethod(8);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentSize_false() {
        ZipArchiveEntry a = new ZipArchiveEntry("s.txt");
        ZipArchiveEntry b = new ZipArchiveEntry("s.txt");
        a.setSize(10);
        b.setSize(20);
        assertFalse(a.equals(b));
    }
}
