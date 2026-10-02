import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;

public class ZipArchiveEntryTest {

    /**
     * Simple concrete implementation of ZipExtraField used for testing
     * purposes only. Not a mocking framework - just a plain implementation.
     */
    private static class SimpleExtraField implements ZipExtraField {
        private final ZipShort headerId;
        private byte[] localData;
        private byte[] centralData;

        SimpleExtraField(final int headerId, final byte[] data) {
            this.headerId = new ZipShort(headerId);
            this.localData = data;
            this.centralData = data;
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
        public void parseFromLocalFileData(final byte[] buffer, final int offset, final int length) {
            localData = Arrays.copyOfRange(buffer, offset, offset + length);
        }

        @Override
        public void parseFromCentralDirectoryData(final byte[] buffer, final int offset, final int length) {
            centralData = Arrays.copyOfRange(buffer, offset, offset + length);
        }
    }

    private File tempFile;
    private File tempDir;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("ziptest", ".txt");
        try (java.io.FileWriter fw = new java.io.FileWriter(tempFile)) {
            fw.write("hello world");
        }
        tempDir = new File(System.getProperty("java.io.tmpdir"));
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructor_withName_setsNameCorrectly() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertEquals("test.txt", entry.getName());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructor_withDirectoryName_isDirectoryTrue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testConstructor_emptyName_returnsEmptyName() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("");
        assertEquals("", entry.getName());
    }

    @Test
    public void testProtectedConstructor_defaultName_isEmpty() {
        final ZipArchiveEntry entry = new ZipArchiveEntry() {
            // anonymous subclass just to instantiate protected constructor path
        };
        assertEquals("", entry.getName());
    }

    @Test
    public void testConstructor_fromJavaZipEntry_copiesNameAndMethod() throws ZipException {
        final java.util.zip.ZipEntry javaEntry = new java.util.zip.ZipEntry("foo.txt");
        javaEntry.setMethod(java.util.zip.ZipEntry.DEFLATED);
        javaEntry.setSize(100);
        final ZipArchiveEntry entry = new ZipArchiveEntry(javaEntry);
        assertEquals("foo.txt", entry.getName());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, entry.getMethod());
        assertEquals(100, entry.getSize());
    }

    @Test
    public void testConstructor_fromJavaZipEntryWithExtra_parsesExtraData() throws ZipException {
        final java.util.zip.ZipEntry javaEntry = new java.util.zip.ZipEntry("foo2.txt");
        final byte[] extra = {(byte) 0x99, (byte) 0x99, 4, 0, 1, 2, 3, 4};
        javaEntry.setExtra(extra);
        final ZipArchiveEntry entry = new ZipArchiveEntry(javaEntry);
        assertNotNull(entry.getLocalFileDataExtra());
    }

    @Test
    public void testConstructor_fromZipArchiveEntry_copiesAllFields() throws ZipException {
        final ZipArchiveEntry original = new ZipArchiveEntry("bar.txt");
        original.setInternalAttributes(5);
        original.setExternalAttributes(10L);
        original.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        final ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals("bar.txt", copy.getName());
        assertEquals(5, copy.getInternalAttributes());
        assertEquals(10L, copy.getExternalAttributes());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, copy.getPlatform());
    }

    @Test
    public void testConstructor_fromFile_notDirectory_setsSizeAndTime() {
        final ZipArchiveEntry entry = new ZipArchiveEntry(tempFile, "myfile.txt");
        assertEquals("myfile.txt", entry.getName());
        assertEquals(tempFile.length(), entry.getSize());
        assertTrue(entry.getTime() >= 0);
    }

    @Test
    public void testConstructor_fromDirectory_appendsSlash() {
        final ZipArchiveEntry entry = new ZipArchiveEntry(tempDir, "mydir");
        assertTrue(entry.getName().endsWith("/"));
        assertTrue(entry.isDirectory());
    }

    // ---------- clone ----------

    @Test
    public void testClone_copiesFieldsCorrectly() throws ZipException {
        final ZipArchiveEntry entry = new ZipArchiveEntry("clone.txt");
        entry.setInternalAttributes(3);
        entry.setExternalAttributes(7L);
        final ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertEquals(entry.getName(), cloned.getName());
        assertEquals(3, cloned.getInternalAttributes());
        assertEquals(7L, cloned.getExternalAttributes());
        assertNotSame(entry, cloned);
    }

    // ---------- method ----------

    @Test
    public void testGetMethod_default_returnsUnknown() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("m.txt");
        assertEquals(ZipMethod.UNKNOWN_CODE, entry.getMethod());
    }

    @Test
    public void testSetMethod_validValue_setsCorrectly() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("m.txt");
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethod_negativeValue_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("m.txt");
        entry.setMethod(-5);
    }

    // ---------- internal / external attributes ----------

    @Test
    public void testGetSetInternalAttributes_normalValue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("a.txt");
        entry.setInternalAttributes(42);
        assertEquals(42, entry.getInternalAttributes());
    }

    @Test
    public void testGetSetExternalAttributes_normalValue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("a.txt");
        entry.setExternalAttributes(12345L);
        assertEquals(12345L, entry.getExternalAttributes());
    }

    // ---------- unix mode ----------

    @Test
    public void testSetUnixMode_setsExternalAttributesAndPlatform() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testGetUnixMode_defaultPlatform_returnsZero() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testIsUnixSymlink_notSymlink_returnsFalse() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setUnixMode(0644);
        assertFalse(entry.isUnixSymlink());
    }

    @Test
    public void testIsUnixSymlink_symlink_returnsTrue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("link");
        entry.setUnixMode(UnixStat.LINK_FLAG | 0755);
        assertTrue(entry.isUnixSymlink());
    }

    // ---------- platform ----------

    @Test
    public void testGetPlatform_default_returnsFat() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("p.txt");
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetPlatform_setsCorrectly() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("p.txt");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    // ---------- extra fields ----------

    @Test
    public void testSetExtraFields_andGetExtraFields_normalCase() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("e.txt");
        final SimpleExtraField field = new SimpleExtraField(0x1234, new byte[] {1, 2, 3});
        entry.setExtraFields(new ZipExtraField[] { field });
        final ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(1, fields.length);
        assertEquals(new ZipShort(0x1234), fields[0].getHeaderId());
    }

    @Test
    public void testGetExtraFields_emptyArray_default() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("e2.txt");
        final ZipExtraField[] fields = entry.getExtraFields();
        assertNotNull(fields);
        assertEquals(0, fields.length);
    }

    @Test
    public void testGetExtraFields_includeUnparseable_false() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("e3.txt");
        final SimpleExtraField field = new SimpleExtraField(0x5555, new byte[] {9, 9});
        entry.setExtraFields(new ZipExtraField[] { field });
        final ZipExtraField[] fields = entry.getExtraFields(false);
        assertEquals(1, fields.length);
    }

    @Test
    public void testGetExtraFields_includeUnparseable_true() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("e4.txt");
        final SimpleExtraField field = new SimpleExtraField(0x5556, new byte[] {9, 9});
        entry.setExtraFields(new ZipExtraField[] { field });
        final ZipExtraField[] fields = entry.getExtraFields(true);
        assertEquals(1, fields.length);
    }

    @Test
    public void testAddExtraField_newField_addsSuccessfully() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("add.txt");
        final SimpleExtraField field = new SimpleExtraField(0x2000, new byte[] {1});
        entry.addExtraField(field);
        assertNotNull(entry.getExtraField(new ZipShort(0x2000)));
    }

    @Test
    public void testAddExtraField_replaceExisting_replacesOldField() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("add2.txt");
        final SimpleExtraField field1 = new SimpleExtraField(0x2001, new byte[] {1});
        final SimpleExtraField field2 = new SimpleExtraField(0x2001, new byte[] {2, 2});
        entry.addExtraField(field1);
        entry.addExtraField(field2);
        final ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(1, fields.length);
        assertArrayEquals(new byte[] {2, 2}, fields[0].getLocalFileDataData());
    }

    @Test
    public void testAddAsFirstExtraField_addsAtFrontPosition() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("add3.txt");
        final SimpleExtraField field1 = new SimpleExtraField(0x3001, new byte[] {1});
        final SimpleExtraField field2 = new SimpleExtraField(0x3002, new byte[] {2});
        entry.addExtraField(field1);
        entry.addAsFirstExtraField(field2);
        final ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertEquals(new ZipShort(0x3002), fields[0].getHeaderId());
    }

    @Test
    public void testAddAsFirstExtraField_replaceExisting_movesToFront() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("add4.txt");
        final SimpleExtraField field1 = new SimpleExtraField(0x4001, new byte[] {1});
        final SimpleExtraField field2 = new SimpleExtraField(0x4002, new byte[] {2});
        entry.addExtraField(field1);
        entry.addExtraField(field2);
        final SimpleExtraField field1b = new SimpleExtraField(0x4001, new byte[] {9, 9});
        entry.addAsFirstExtraField(field1b);
        final ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertEquals(new ZipShort(0x4001), fields[0].getHeaderId());
    }

    @Test
    public void testRemoveExtraField_existingType_removesSuccessfully() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("rm.txt");
        final SimpleExtraField field = new SimpleExtraField(0x6000, new byte[] {1});
        entry.addExtraField(field);
        entry.removeExtraField(new ZipShort(0x6000));
        assertNull(entry.getExtraField(new ZipShort(0x6000)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_noExtraFields_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("rm2.txt");
        entry.removeExtraField(new ZipShort(0x9999));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_typeNotFound_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("rm3.txt");
        final SimpleExtraField field = new SimpleExtraField(0x6001, new byte[] {1});
        entry.addExtraField(field);
        entry.removeExtraField(new ZipShort(0x9998));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldData_noneExists_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("rm4.txt");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testGetExtraField_notFound_returnsNull() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("gf.txt");
        assertNull(entry.getExtraField(new ZipShort(0x1111)));
    }

    @Test
    public void testGetUnparseableExtraFieldData_default_returnsNull() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("uf.txt");
        assertNull(entry.getUnparseableExtraFieldData());
    }

    // ---------- setExtra / getExtra ----------

    @Test
    public void testSetExtra_validData_parsesSuccessfully() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("se.txt");
        final byte[] extra = {(byte) 0x99, (byte) 0x99, 4, 0, 1, 2, 3, 4};
        entry.setExtra(extra);
        assertNotNull(entry.getLocalFileDataExtra());
    }

    @Test
    public void testSetExtra_emptyArray_producesEmptyExtra() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("se2.txt");
        entry.setExtra(new byte[0]);
        assertEquals(0, entry.getLocalFileDataExtra().length);
    }

    @Test
    public void testGetLocalFileDataExtra_default_returnsEmptyArray() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("le.txt");
        final byte[] extra = entry.getLocalFileDataExtra();
        assertNotNull(extra);
        assertEquals(0, extra.length);
    }

    @Test
    public void testSetCentralDirectoryExtra_validData_parsesSuccessfully() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("cd.txt");
        final byte[] extra = {(byte) 0x88, (byte) 0x88, 2, 0, 5, 6};
        entry.setCentralDirectoryExtra(extra);
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test
    public void testGetCentralDirectoryExtra_default_returnsNonNull() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("cd2.txt");
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    // ---------- name ----------

    @Test
    public void testGetName_returnsSetName() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("name.txt");
        assertEquals("name.txt", entry.getName());
    }

    @Test
    public void testIsDirectory_endsWithSlash_returnsTrue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("some/dir/");
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testIsDirectory_noSlash_returnsFalse() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testSetName_withRawName_storesRawBytes() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("dummy");
        final byte[] raw = {1, 2, 3, 4};
        entry.setName("rawname.txt", raw);
        assertEquals("rawname.txt", entry.getName());
        assertArrayEquals(raw, entry.getRawName());
    }

    @Test
    public void testGetRawName_notSet_returnsNull() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("noraw.txt");
        assertNull(entry.getRawName());
    }

    // ---------- size ----------

    @Test
    public void testGetSetSize_normalValue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("sz.txt");
        entry.setSize(1000L);
        assertEquals(1000L, entry.getSize());
    }

    @Test
    public void testSetSize_zeroValue_allowed() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("sz0.txt");
        entry.setSize(0L);
        assertEquals(0L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_negativeValue_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("szneg.txt");
        entry.setSize(-1L);
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_sameName_sameHashCode() {
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("same.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("same.txt");
        assertEquals(entry1.hashCode(), entry2.hashCode());
    }

    // ---------- general purpose bit ----------

    @Test
    public void testGetSetGeneralPurposeBit_normalValue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("gpb.txt");
        final GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        entry.setGeneralPurposeBit(gpb);
        assertSame(gpb, entry.getGeneralPurposeBit());
    }

    @Test
    public void testGetGeneralPurposeBit_default_notNull() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("gpb2.txt");
        assertNotNull(entry.getGeneralPurposeBit());
    }

    @Test
    public void testSetGeneralPurposeBit_null_allowed() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("gpb3.txt");
        entry.setGeneralPurposeBit(null);
        assertNull(entry.getGeneralPurposeBit());
    }

    // ---------- last modified date ----------

    @Test
    public void testGetLastModifiedDate_returnsDateBasedOnTime() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("date.txt");
        entry.setTime(123456789L);
        final Date date = entry.getLastModifiedDate();
        assertEquals(new Date(entry.getTime()), date);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("eq.txt");
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("eq2.txt");
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("eq3.txt");
        assertFalse(entry.equals("not an entry"));
    }

    @Test
    public void testEquals_sameNameAndAttributes_returnsTrue() {
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("eq4.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("eq4.txt");
        assertTrue(entry1.equals(entry2));
    }

    @Test
    public void testEquals_differentName_returnsFalse() {
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("eq5.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("eq6.txt");
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEquals_differentComment_returnsFalse() {
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("eq7.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("eq7.txt");
        entry1.setComment("comment1");
        entry2.setComment("comment2");
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEquals_differentInternalAttributes_returnsFalse() {
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("eq8.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("eq8.txt");
        entry1.setInternalAttributes(1);
        entry2.setInternalAttributes(2);
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEquals_bothNullComments_returnsTrue() {
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("eq9.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("eq9.txt");
        assertTrue(entry1.equals(entry2));
    }

    // ---------- version made by / required ----------

    @Test
    public void testGetSetVersionMadeBy_normalValue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("v.txt");
        entry.setVersionMadeBy(20);
        assertEquals(20, entry.getVersionMadeBy());
    }

    @Test
    public void testGetSetVersionRequired_normalValue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("v2.txt");
        entry.setVersionRequired(45);
        assertEquals(45, entry.getVersionRequired());
    }

    // ---------- raw flag ----------

    @Test
    public void testGetSetRawFlag_normalValue() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("f.txt");
        entry.setRawFlag(8);
        assertEquals(8, entry.getRawFlag());
    }

    @Test
    public void testGetRawFlag_default_returnsZero() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("f2.txt");
        assertEquals(0, entry.getRawFlag());
    }
}
