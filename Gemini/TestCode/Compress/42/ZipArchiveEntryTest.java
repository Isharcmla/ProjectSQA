package org.apache.commons.compress.archivers.zip;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ZipArchiveEntryTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testConstructor_StringName_normal() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test/file.txt");
        assertEquals("test/file.txt", entry.getName());
        assertEquals(ZipMethod.UNKNOWN_CODE, entry.getMethod());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        assertEquals(ZipArchiveEntry.SIZE_UNKNOWN, entry.getSize());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructor_StringName_directorySlash() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test/dir/");
        assertEquals("test/dir/", entry.getName());
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testConstructor_StringName_fatBackslashReplacement() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("folder\\sub\\file.txt");
        assertEquals("folder/sub/file.txt", entry.getName());
    }

    @Test
    public void testConstructor_DefaultProtected() {
        final ZipArchiveEntry entry = new ZipArchiveEntry();
        assertEquals("", entry.getName());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructor_FromJavaZipEntry_withoutExtra() throws Exception {
        final ZipEntry javaEntry = new ZipEntry("entry.txt");
        javaEntry.setSize(1234L);
        javaEntry.setMethod(ZipEntry.DEFLATED);

        final ZipArchiveEntry entry = new ZipArchiveEntry(javaEntry);
        assertEquals("entry.txt", entry.getName());
        assertEquals(1234L, entry.getSize());
        assertEquals(ZipEntry.DEFLATED, entry.getMethod());
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testConstructor_FromJavaZipEntry_withExtra() throws Exception {
        final ZipEntry javaEntry = new ZipEntry("entry.txt");
        final byte[] extra = new byte[]{0x01, 0x00, 0x02, 0x00, 0x41, 0x42};
        javaEntry.setExtra(extra);

        final ZipArchiveEntry entry = new ZipArchiveEntry(javaEntry);
        assertEquals("entry.txt", entry.getName());
        final ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(1, fields.length);
        assertEquals(new ZipShort(1), fields[0].getHeaderId());
    }

    @Test
    public void testConstructor_FromZipArchiveEntry() throws Exception {
        final ZipArchiveEntry source = new ZipArchiveEntry("source.txt");
        source.setInternalAttributes(10);
        source.setExternalAttributes(20L);
        source.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        final GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        source.setGeneralPurposeBit(gpb);

        final UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(0x1234));
        uef.setLocalFileDataData(new byte[]{1, 2});
        source.addExtraField(uef);

        final ZipArchiveEntry copy = new ZipArchiveEntry(source);
        assertEquals("source.txt", copy.getName());
        assertEquals(10, copy.getInternalAttributes());
        assertEquals(20L, copy.getExternalAttributes());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, copy.getPlatform());
        assertEquals(gpb, copy.getGeneralPurposeBit());
        assertEquals(1, copy.getExtraFields().length);
    }

    @Test
    public void testConstructor_FromZipArchiveEntry_nullGPB() throws Exception {
        final ZipArchiveEntry source = new ZipArchiveEntry("source.txt");
        source.setGeneralPurposeBit(null);

        final ZipArchiveEntry copy = new ZipArchiveEntry(source);
        assertNull(copy.getGeneralPurposeBit());
    }

    @Test
    public void testConstructor_FromFile_regularFile() throws Exception {
        final File file = temporaryFolder.newFile("sample.txt");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(new byte[]{1, 2, 3, 4, 5});
        }
        final ZipArchiveEntry entry = new ZipArchiveEntry(file, "sample.txt");
        assertEquals("sample.txt", entry.getName());
        assertEquals(5L, entry.getSize());
        assertEquals(file.lastModified(), entry.getTime());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructor_FromFile_directory() throws Exception {
        final File dir = temporaryFolder.newFolder("sampleDir");
        final ZipArchiveEntry entry = new ZipArchiveEntry(dir, "sampleDir");
        assertEquals("sampleDir/", entry.getName());
        assertTrue(entry.isDirectory());

        final ZipArchiveEntry entryWithSlash = new ZipArchiveEntry(dir, "sampleDir/");
        assertEquals("sampleDir/", entryWithSlash.getName());
        assertTrue(entryWithSlash.isDirectory());
    }

    @Test
    public void testClone() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("orig.txt");
        entry.setInternalAttributes(5);
        entry.setExternalAttributes(50L);
        final UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(1));
        entry.addExtraField(uef);

        final ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertNotSame(entry, cloned);
        assertEquals(entry.getName(), cloned.getName());
        assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        assertEquals(1, cloned.getExtraFields().length);
    }

    @Test
    public void testSetAndGetMethod_valid() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setMethod(ZipMethod.STORED.getCode());
        assertEquals(ZipMethod.STORED.getCode(), entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethod_negative_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setMethod(-2);
    }

    @Test
    public void testSetAndGetInternalAttributes() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(0, entry.getInternalAttributes());
        entry.setInternalAttributes(42);
        assertEquals(42, entry.getInternalAttributes());
    }

    @Test
    public void testSetAndGetExternalAttributes() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(0L, entry.getExternalAttributes());
        entry.setExternalAttributes(0x12345678L);
        assertEquals(0x12345678L, entry.getExternalAttributes());
    }

    @Test
    public void testUnixMode_normalFileWritable() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setUnixMode(0644);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0644, entry.getUnixMode());
        assertFalse(entry.isUnixSymlink());
    }

    @Test
    public void testUnixMode_readOnlyAndDirectory() {
        final ZipArchiveEntry dirEntry = new ZipArchiveEntry("dir/");
        dirEntry.setUnixMode(0444);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, dirEntry.getPlatform());
        assertEquals(0444, dirEntry.getUnixMode());
        assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testUnixMode_symlink() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("symlink");
        entry.setUnixMode(UnixStat.LINK_FLAG | 0777);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertTrue(entry.isUnixSymlink());
    }

    @Test
    public void testGetUnixMode_fatPlatformReturnsZero() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        entry.setExternalAttributes(0644L << 16);
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testSetName_fatPlatformWithExistingSlash() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test/name\\with\\backslash");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        entry.setName("test/name\\with\\backslash");
        assertEquals("test/name\\with\\backslash", entry.getName());
    }

    @Test
    public void testSetName_unixPlatformRetainsBackslash() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("dummy");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        entry.setName("folder\\file.txt");
        assertEquals("folder\\file.txt", entry.getName());
    }

    @Test
    public void testSetAndGetSize_valid() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(0L);
        assertEquals(0L, entry.getSize());
        entry.setSize(10000000000L);
        assertEquals(10000000000L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_negative_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(-1L);
    }

    @Test
    public void testRawName() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNull(entry.getRawName());

        final byte[] raw = new byte[]{0x61, 0x62, 0x63};
        entry.setName("abc", raw);
        assertEquals("abc", entry.getName());
        assertArrayEquals(raw, entry.getRawName());

        final byte[] copy = entry.getRawName();
        copy[0] = 0x78;
        assertFalse(copy[0] == entry.getRawName()[0]);
    }

    @Test
    public void testHashCode() {
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("file.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("file.txt");
        assertEquals(entry1.hashCode(), entry2.hashCode());
        assertEquals("file.txt".hashCode(), entry1.hashCode());
    }

    @Test
    public void testGeneralPurposeBit() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNotNull(entry.getGeneralPurposeBit());

        final GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useEncryption(true);
        entry.setGeneralPurposeBit(gpb);
        assertSame(gpb, entry.getGeneralPurposeBit());
    }

    @Test
    public void testLastModifiedDate() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        final long time = 1600000000000L;
        entry.setTime(time);
        assertEquals(new Date(time), entry.getLastModifiedDate());
    }

    @Test
    public void testExtraFields_addAndGet_normalAndUnparseable() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");

        assertEquals(0, entry.getExtraFields().length);
        assertEquals(0, entry.getExtraFields(true).length);
        assertEquals(0, entry.getExtraFields(false).length);

        final UnrecognizedExtraField uef1 = new UnrecognizedExtraField();
        uef1.setHeaderId(new ZipShort(1));
        uef1.setLocalFileDataData(new byte[]{1});

        entry.addExtraField(uef1);
        assertEquals(1, entry.getExtraFields().length);
        assertEquals(uef1, entry.getExtraField(new ZipShort(1)));
        assertNull(entry.getExtraField(new ZipShort(2)));

        final UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[]{0x01, 0x02}, 0, 2);
        entry.addExtraField(unparseable);

        assertSame(unparseable, entry.getUnparseableExtraFieldData());
        assertEquals(1, entry.getExtraFields(false).length);
        assertEquals(2, entry.getExtraFields(true).length);

        final UnrecognizedExtraField uef1Replacement = new UnrecognizedExtraField();
        uef1Replacement.setHeaderId(new ZipShort(1));
        uef1Replacement.setLocalFileDataData(new byte[]{2});
        entry.addExtraField(uef1Replacement);

        assertEquals(1, entry.getExtraFields(false).length);
        assertEquals(uef1Replacement, entry.getExtraField(new ZipShort(1)));

        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
        assertEquals(1, entry.getExtraFields(true).length);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldData_whenNull_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testAddAsFirstExtraField() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");

        final UnrecognizedExtraField uef1 = new UnrecognizedExtraField();
        uef1.setHeaderId(new ZipShort(1));
        entry.addExtraField(uef1);

        final UnrecognizedExtraField uef2 = new UnrecognizedExtraField();
        uef2.setHeaderId(new ZipShort(2));
        entry.addAsFirstExtraField(uef2);

        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertEquals(new ZipShort(2), fields[0].getHeaderId());
        assertEquals(new ZipShort(1), fields[1].getHeaderId());

        final UnrecognizedExtraField uef1Replacement = new UnrecognizedExtraField();
        uef1Replacement.setHeaderId(new ZipShort(1));
        entry.addAsFirstExtraField(uef1Replacement);

        fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertEquals(new ZipShort(1), fields[0].getHeaderId());
        assertEquals(new ZipShort(2), fields[1].getHeaderId());

        final ZipArchiveEntry entry2 = new ZipArchiveEntry("test2");
        final UnparseableExtraFieldData unp = new UnparseableExtraFieldData();
        entry2.addAsFirstExtraField(unp);
        assertSame(unp, entry2.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetExtraFields_arrayWithUnparseable() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");

        final UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(1));
        final UnparseableExtraFieldData unp = new UnparseableExtraFieldData();

        entry.setExtraFields(new ZipExtraField[]{uef, unp});

        assertEquals(1, entry.getExtraFields(false).length);
        assertEquals(2, entry.getExtraFields(true).length);
        assertSame(unp, entry.getUnparseableExtraFieldData());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_whenEmpty_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeExtraField(new ZipShort(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_whenNotFound_throwsException() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        final UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(1));
        entry.addExtraField(uef);

        entry.removeExtraField(new ZipShort(2));
    }

    @Test
    public void testRemoveExtraField_success() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        final UnrecognizedExtraField uef1 = new UnrecognizedExtraField();
        uef1.setHeaderId(new ZipShort(1));
        final UnrecognizedExtraField uef2 = new UnrecognizedExtraField();
        uef2.setHeaderId(new ZipShort(2));
        entry.addExtraField(uef1);
        entry.addExtraField(uef2);

        entry.removeExtraField(new ZipShort(1));
        assertEquals(1, entry.getExtraFields().length);
        assertEquals(new ZipShort(2), entry.getExtraFields()[0].getHeaderId());
    }

    @Test
    public void testSetExtraBytes_andMergeLocalExtra() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        final byte[] extra1 = new byte[]{0x01, 0x00, 0x01, 0x00, 0x41};
        entry.setExtra(extra1);
        assertEquals(1, entry.getExtraFields().length);

        final byte[] extra2 = new byte[]{0x01, 0x00, 0x01, 0x00, 0x42, 0x02, 0x00, 0x01, 0x00, 0x43};
        entry.setExtra(extra2);
        assertEquals(2, entry.getExtraFields().length);

        assertNotNull(entry.getLocalFileDataExtra());
    }

    @Test
    public void testSetCentralDirectoryExtra_andMergeCentralExtra() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        final byte[] cd1 = new byte[]{0x01, 0x00, 0x01, 0x00, 0x41};
        entry.setCentralDirectoryExtra(cd1);
        assertEquals(1, entry.getExtraFields().length);

        final byte[] cd2 = new byte[]{0x01, 0x00, 0x01, 0x00, 0x42, 0x02, 0x00, 0x01, 0x00, 0x43};
        entry.setCentralDirectoryExtra(cd2);
        assertEquals(2, entry.getExtraFields().length);

        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test
    public void testGetLocalFileDataExtra_defaultEmpty() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        final byte[] localExtra = entry.getLocalFileDataExtra();
        assertNotNull(localExtra);
        assertEquals(0, localExtra.length);
    }

    @Test
    public void testGetUnparseableOnlyExtraFields() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");
        final UnparseableExtraFieldData unp = new UnparseableExtraFieldData();
        unp.parseFromLocalFileData(new byte[]{1, 2, 3}, 0, 3);
        entry.addExtraField(unp);

        final ZipExtraField[] fields = entry.getExtraFields(true);
        assertEquals(1, fields.length);
        assertSame(unp, fields[0]);
    }

    @Test
    public void testVersionAndFlagProperties() {
        final ZipArchiveEntry entry = new ZipArchiveEntry("test");

        assertEquals(0, entry.getVersionMadeBy());
        entry.setVersionMadeBy(45);
        assertEquals(45, entry.getVersionMadeBy());

        assertEquals(0, entry.getVersionRequired());
        entry.setVersionRequired(20);
        assertEquals(20, entry.getVersionRequired());

        assertEquals(0, entry.getRawFlag());
        entry.setRawFlag(8);
        assertEquals(8, entry.getRawFlag());
    }

    @Test
    public void testEquals_contract() {
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("test");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("test");

        assertTrue(entry1.equals(entry1));
        assertFalse(entry1.equals(null));
        assertFalse(entry1.equals("otherObject"));
        assertTrue(entry1.equals(entry2));

        entry2.setName("other");
        assertFalse(entry1.equals(entry2));

        final ZipArchiveEntry nullName1 = new ZipArchiveEntry("");
        nullName1.setName(null);
        final ZipArchiveEntry nullName2 = new ZipArchiveEntry("");
        nullName2.setName(null);
        assertTrue(nullName1.equals(nullName2));
        assertFalse(nullName1.equals(entry1));
        assertFalse(entry1.equals(nullName1));
    }

    @Test
    public void testEquals_allFieldsComparison() {
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("test");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("test");

        entry1.setTime(1000L);
        entry2.setTime(2000L);
        assertFalse(entry1.equals(entry2));
        entry2.setTime(1000L);
        assertTrue(entry1.equals(entry2));

        entry1.setComment("comment");
        assertFalse(entry1.equals(entry2));
        entry2.setComment("comment");
        assertTrue(entry1.equals(entry2));

        entry1.setInternalAttributes(1);
        assertFalse(entry1.equals(entry2));
        entry2.setInternalAttributes(1);
        assertTrue(entry1.equals(entry2));

        entry1.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertFalse(entry1.equals(entry2));
        entry2.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertTrue(entry1.equals(entry2));

        entry1.setExternalAttributes(0644L);
        assertFalse(entry1.equals(entry2));
        entry2.setExternalAttributes(0644L);
        assertTrue(entry1.equals(entry2));

        entry1.setMethod(ZipEntry.STORED);
        assertFalse(entry1.equals(entry2));
        entry2.setMethod(ZipEntry.STORED);
        assertTrue(entry1.equals(entry2));

        entry1.setSize(100L);
        assertFalse(entry1.equals(entry2));
        entry2.setSize(100L);
        assertTrue(entry1.equals(entry2));

        entry1.setCrc(555L);
        assertFalse(entry1.equals(entry2));
        entry2.setCrc(555L);
        assertTrue(entry1.equals(entry2));

        entry1.setCompressedSize(50L);
        assertFalse(entry1.equals(entry2));
        entry2.setCompressedSize(50L);
        assertTrue(entry1.equals(entry2));

        final UnrecognizedExtraField uef = new UnrecognizedExtraField();
        uef.setHeaderId(new ZipShort(99));
        uef.setLocalFileDataData(new byte[]{1});
        uef.setCentralDirectoryData(new byte[]{2});
        entry1.addExtraField(uef);
        assertFalse(entry1.equals(entry2));
        entry2.addExtraField(uef);
        assertTrue(entry1.equals(entry2));

        final GeneralPurposeBit gpb1 = new GeneralPurposeBit();
        gpb1.useEncryption(true);
        entry1.setGeneralPurposeBit(gpb1);
        assertFalse(entry1.equals(entry2));
        final GeneralPurposeBit gpb2 = new GeneralPurposeBit();
        gpb2.useEncryption(true);
        entry2.setGeneralPurposeBit(gpb2);
        assertTrue(entry1.equals(entry2));
    }
}
