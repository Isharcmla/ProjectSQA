import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.zip.ZipException;

public class ZipArchiveEntryTest {

    /**
     * Simple concrete implementation of ZipExtraField used for testing
     * purposes since no concrete implementation classes were provided.
     */
    private static class TestExtraField implements ZipExtraField {
        private ZipShort headerId;
        private byte[] localData = new byte[0];
        private byte[] centralData = new byte[0];

        TestExtraField(int id) {
            this.headerId = new ZipShort(id);
        }

        public ZipShort getHeaderId() {
            return headerId;
        }

        public ZipShort getLocalFileDataLength() {
            return new ZipShort(localData.length);
        }

        public byte[] getLocalFileDataData() {
            return localData;
        }

        public ZipShort getCentralDirectoryLength() {
            return new ZipShort(centralData.length);
        }

        public byte[] getCentralDirectoryData() {
            return centralData;
        }

        public void parseFromLocalFileData(byte[] data, int offset, int length) {
            localData = Arrays.copyOfRange(data, offset, offset + length);
        }

        public void parseFromCentralDirectoryData(byte[] data, int offset, int length) {
            centralData = Arrays.copyOfRange(data, offset, offset + length);
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
        ZipArchiveEntry e = new ZipArchiveEntry("foo.txt");
        assertEquals("foo.txt", e.getName());
    }

    @Test
    public void testConstructorWithName_directorySlash_isDirectory() {
        ZipArchiveEntry e = new ZipArchiveEntry("dir/");
        assertTrue(e.isDirectory());
    }

    @Test
    public void testConstructorWithName_emptyString_notDirectory() {
        ZipArchiveEntry e = new ZipArchiveEntry("");
        assertFalse(e.isDirectory());
    }

    @Test
    public void testProtectedNoArgConstructor_default_emptyName() {
        ZipArchiveEntry e = new ZipArchiveEntry();
        assertEquals("", e.getName());
    }

    @Test
    public void testConstructorFromZipEntry_normal_copiesFields() throws ZipException {
        java.util.zip.ZipEntry base = new java.util.zip.ZipEntry("base.txt");
        base.setMethod(java.util.zip.ZipEntry.DEFLATED);
        base.setSize(100L);
        ZipArchiveEntry e = new ZipArchiveEntry(base);
        assertEquals("base.txt", e.getName());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, e.getMethod());
        assertEquals(100L, e.getSize());
    }

    @Test
    public void testConstructorFromZipEntry_withExtra_parsesExtra() throws ZipException {
        java.util.zip.ZipEntry base = new java.util.zip.ZipEntry("withExtra.txt");
        base.setExtra(new byte[0]);
        ZipArchiveEntry e = new ZipArchiveEntry(base);
        assertNotNull(e.getExtra());
    }

    @Test
    public void testConstructorFromZipArchiveEntry_normal_copiesAttributes() throws ZipException {
        ZipArchiveEntry orig = new ZipArchiveEntry("orig.txt");
        orig.setInternalAttributes(5);
        orig.setExternalAttributes(10L);
        ZipArchiveEntry copy = new ZipArchiveEntry(orig);
        assertEquals(5, copy.getInternalAttributes());
        assertEquals(10L, copy.getExternalAttributes());
        assertEquals("orig.txt", copy.getName());
    }

    @Test
    public void testConstructorFromFile_regularFile_setsSize() throws IOException {
        File tmp = File.createTempFile("zae", ".txt");
        tmp.deleteOnExit();
        ZipArchiveEntry e = new ZipArchiveEntry(tmp, "entryName.txt");
        assertEquals(tmp.length(), e.getSize());
        assertFalse(e.isDirectory());
    }

    @Test
    public void testConstructorFromFile_directory_appendsSlash() throws IOException {
        File tmpDir = File.createTempFile("zaeDir", "");
        tmpDir.delete();
        tmpDir.mkdir();
        tmpDir.deleteOnExit();
        ZipArchiveEntry e = new ZipArchiveEntry(tmpDir, "dirEntry");
        assertTrue(e.getName().endsWith("/"));
        assertTrue(e.isDirectory());
    }

    // ---------- clone ----------

    @Test
    public void testClone_normal_returnsEqualButDistinctInstance() {
        entry.setInternalAttributes(3);
        entry.setExternalAttributes(7L);
        entry.addExtraField(new TestExtraField(1));
        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertNotSame(entry, cloned);
        assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        assertEquals(entry.getName(), cloned.getName());
    }

    // ---------- method ----------

    @Test
    public void testGetSetMethod_normal_returnsSetValue() {
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test
    public void testGetMethod_default_returnsMinusOne() {
        ZipArchiveEntry e = new ZipArchiveEntry("m.txt");
        assertEquals(-1, e.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethod_negative_throwsException() {
        entry.setMethod(-5);
    }

    // ---------- internal attributes ----------

    @Test
    public void testGetSetInternalAttributes_normal_returnsSetValue() {
        entry.setInternalAttributes(42);
        assertEquals(42, entry.getInternalAttributes());
    }

    // ---------- external attributes ----------

    @Test
    public void testGetSetExternalAttributes_normal_returnsSetValue() {
        entry.setExternalAttributes(12345L);
        assertEquals(12345L, entry.getExternalAttributes());
    }

    // ---------- unix mode ----------

    @Test
    public void testSetUnixMode_normal_setsPlatformUnixAndAttributes() {
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testGetUnixMode_platformNotUnix_returnsZero() {
        ZipArchiveEntry e = new ZipArchiveEntry("u.txt");
        assertEquals(0, e.getUnixMode());
    }

    @Test
    public void testSetUnixMode_directory_setsDirectoryFlag() {
        ZipArchiveEntry dir = new ZipArchiveEntry("dir/");
        dir.setUnixMode(0755);
        long ext = dir.getExternalAttributes();
        assertTrue((ext & 0x10) != 0);
    }

    @Test
    public void testSetUnixMode_readOnly_setsReadOnlyBit() {
        ZipArchiveEntry e = new ZipArchiveEntry("ro.txt");
        e.setUnixMode(0400); // no write permission for owner
        long ext = e.getExternalAttributes();
        assertTrue((ext & 1) != 0);
    }

    // ---------- platform ----------

    @Test
    public void testGetPlatform_default_returnsFat() {
        ZipArchiveEntry e = new ZipArchiveEntry("p.txt");
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, e.getPlatform());
    }

    @Test
    public void testSetPlatform_protectedMethod_updatesPlatform() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    // ---------- extra fields ----------

    @Test
    public void testSetGetExtraFields_normal_returnsFieldsArray() {
        TestExtraField f1 = new TestExtraField(1);
        TestExtraField f2 = new TestExtraField(2);
        entry.setExtraFields(new ZipExtraField[] { f1, f2 });
        ZipExtraField[] result = entry.getExtraFields();
        assertEquals(2, result.length);
    }

    @Test
    public void testGetExtraFields_emptyDefault_returnsEmptyArray() {
        ZipArchiveEntry e = new ZipArchiveEntry();
        ZipExtraField[] result = e.getExtraFields();
        assertNotNull(result);
    }

    @Test
    public void testGetExtraFields_includeUnparseableTrueWithNoFields_returnsEmpty() {
        ZipArchiveEntry e = new ZipArchiveEntry("nf.txt");
        // force extraFields to remain null by not calling setExtraFields/addExtraField
        ZipExtraField[] result = e.getExtraFields(true);
        assertNotNull(result);
    }

    @Test
    public void testAddExtraField_normal_addsField() {
        TestExtraField f = new TestExtraField(10);
        entry.addExtraField(f);
        assertSame(f, entry.getExtraField(new ZipShort(10)));
    }

    @Test
    public void testAddExtraField_unparseable_setsUnparseableExtra() {
        UnparseableExtraFieldData uf = new UnparseableExtraFieldData();
        entry.addExtraField(uf);
        assertSame(uf, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testAddAsFirstExtraField_normal_addsFieldFirst() {
        TestExtraField f1 = new TestExtraField(1);
        TestExtraField f2 = new TestExtraField(2);
        entry.addExtraField(f1);
        entry.addAsFirstExtraField(f2);
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(f2.getHeaderId(), fields[0].getHeaderId());
    }

    @Test
    public void testAddAsFirstExtraField_unparseable_setsUnparseableExtra() {
        UnparseableExtraFieldData uf = new UnparseableExtraFieldData();
        entry.addAsFirstExtraField(uf);
        assertSame(uf, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testRemoveExtraField_normal_removesField() {
        TestExtraField f = new TestExtraField(20);
        entry.addExtraField(f);
        entry.removeExtraField(new ZipShort(20));
        assertNull(entry.getExtraField(new ZipShort(20)));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_nonExistentFieldsNull_throwsException() {
        ZipArchiveEntry e = new ZipArchiveEntry("re.txt");
        e.removeExtraField(new ZipShort(99));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraField_nonExistentField_throwsException() {
        entry.addExtraField(new TestExtraField(1));
        entry.removeExtraField(new ZipShort(999));
    }

    @Test
    public void testRemoveUnparseableExtraFieldData_normal_removesData() {
        UnparseableExtraFieldData uf = new UnparseableExtraFieldData();
        entry.addExtraField(uf);
        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldData_none_throwsException() {
        ZipArchiveEntry e = new ZipArchiveEntry("ru.txt");
        e.removeUnparseableExtraFieldData();
    }

    @Test
    public void testGetExtraField_notFound_returnsNull() {
        assertNull(entry.getExtraField(new ZipShort(555)));
    }

    @Test
    public void testGetUnparseableExtraFieldData_default_returnsNull() {
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetExtraByteArray_normal_setsLocalFileDataExtra() {
        entry.setExtra(new byte[0]);
        assertNotNull(entry.getLocalFileDataExtra());
    }

    @Test
    public void testSetCentralDirectoryExtra_normal_setsCentralData() {
        entry.setCentralDirectoryExtra(new byte[0]);
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test
    public void testGetLocalFileDataExtra_default_returnsNonNullArray() {
        byte[] result = entry.getLocalFileDataExtra();
        assertNotNull(result);
    }

    @Test
    public void testGetCentralDirectoryExtra_default_returnsNonNullArray() {
        byte[] result = entry.getCentralDirectoryExtra();
        assertNotNull(result);
    }

    @Test
    public void testMergeExtraFields_localMergeUpdatesExisting() {
        TestExtraField f1 = new TestExtraField(30);
        entry.addExtraField(f1);
        TestExtraField f2 = new TestExtraField(30);
        entry.addExtraField(f2); // replaces existing due to same headerId
        ZipExtraField result = entry.getExtraField(new ZipShort(30));
        assertSame(f2, result);
    }

    // ---------- name ----------

    @Test
    public void testGetSetName_normal_returnsName() {
        ZipArchiveEntry e = new ZipArchiveEntry("name.txt");
        assertEquals("name.txt", e.getName());
    }

    @Test
    public void testSetName_backslashReplacedWithSlash_whenPlatformFat() {
        ZipArchiveEntry e = new ZipArchiveEntry("a\\b\\c.txt");
        assertEquals("a/b/c.txt", e.getName());
    }

    @Test
    public void testSetName_containsSlashAlready_notModified() {
        ZipArchiveEntry e = new ZipArchiveEntry("a/b\\c.txt");
        assertEquals("a/b\\c.txt", e.getName());
    }

    @Test
    public void testSetNameWithRawName_normal_setsRawName() {
        ZipArchiveEntry e = new ZipArchiveEntry("raw.txt");
        byte[] raw = new byte[] { 1, 2, 3 };
        e.setName("raw.txt", raw);
        byte[] result = e.getRawName();
        assertArrayEquals(raw, result);
    }

    @Test
    public void testGetRawName_notSet_returnsNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("norw.txt");
        assertNull(e.getRawName());
    }

    @Test
    public void testIsDirectory_endsWithSlash_true() {
        ZipArchiveEntry e = new ZipArchiveEntry("dir2/");
        assertTrue(e.isDirectory());
    }

    @Test
    public void testIsDirectory_notEndsWithSlash_false() {
        ZipArchiveEntry e = new ZipArchiveEntry("file.txt");
        assertFalse(e.isDirectory());
    }

    // ---------- size ----------

    @Test
    public void testGetSetSize_normal_returnsSetValue() {
        entry.setSize(1000L);
        assertEquals(1000L, entry.getSize());
    }

    @Test
    public void testSetSize_zero_allowed() {
        entry.setSize(0L);
        assertEquals(0L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_negative_throwsException() {
        entry.setSize(-1L);
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_sameName_sameHashCode() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("same.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("same.txt");
        assertEquals(e1.hashCode(), e2.hashCode());
    }

    // ---------- general purpose bit ----------

    @Test
    public void testGetSetGeneralPurposeBit_normal_returnsSetValue() {
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useStrongEncryption(true);
        entry.setGeneralPurposeBit(gpb);
        assertSame(gpb, entry.getGeneralPurposeBit());
    }

    @Test
    public void testGetGeneralPurposeBit_default_notNull() {
        ZipArchiveEntry e = new ZipArchiveEntry("gpb.txt");
        assertNotNull(e.getGeneralPurposeBit());
    }

    // ---------- last modified date ----------

    @Test
    public void testGetLastModifiedDate_normal_returnsDateMatchingTime() {
        entry.setTime(100000L);
        Date d = entry.getLastModifiedDate();
        assertEquals(entry.getTime(), d.getTime());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_true() {
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEquals_null_false() {
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEquals_differentClass_false() {
        assertFalse(entry.equals("someString"));
    }

    @Test
    public void testEquals_identicalEntries_true() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("eq.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("eq.txt");
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEquals_differentNames_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("b.txt");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentComments_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("c.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("c.txt");
        e1.setComment("hello");
        e2.setComment("world");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_bothCommentsNull_stillEqualByOtherFields() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("cn.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("cn.txt");
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEquals_differentTime_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("t.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("t.txt");
        e1.setTime(1000L);
        e2.setTime(2000L);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentInternalAttributes_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("ia.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("ia.txt");
        e1.setInternalAttributes(1);
        e2.setInternalAttributes(2);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentPlatform_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("pl.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("pl.txt");
        e1.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentExternalAttributes_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("ea.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("ea.txt");
        e1.setExternalAttributes(1L);
        e2.setExternalAttributes(2L);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentMethod_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("me.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("me.txt");
        e1.setMethod(0);
        e2.setMethod(8);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentSize_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("sz.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("sz.txt");
        e1.setSize(10L);
        e2.setSize(20L);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentCrc_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("crc.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("crc.txt");
        e1.setCrc(111L);
        e2.setCrc(222L);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentCompressedSize_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("cs.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("cs.txt");
        e1.setCompressedSize(50L);
        e2.setCompressedSize(60L);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentExtraFields_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("ex1.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("ex1.txt");
        TestExtraField f1 = new TestExtraField(1);
        e1.addExtraField(f1);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEquals_differentGpb_false() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("gpb2.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("gpb2.txt");
        GeneralPurposeBit gpb1 = new GeneralPurposeBit();
        gpb1.useStrongEncryption(true);
        e1.setGeneralPurposeBit(gpb1);
        assertFalse(e1.equals(e2));
    }
}
