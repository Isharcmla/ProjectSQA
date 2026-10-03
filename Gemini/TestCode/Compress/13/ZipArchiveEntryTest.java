package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class ZipArchiveEntryTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testConstructor_StringName_setsNameCorrectly() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertFalse(entry.isDirectory());
        Assert.assertEquals(-1, entry.getMethod());
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        Assert.assertNull(entry.getRawName());
    }

    @Test
    public void testConstructor_DirectoryName_identifiesAsDirectory() {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        Assert.assertEquals("dir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void testDefaultConstructor_createsEmptyEntry() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        Assert.assertEquals("", entry.getName());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructor_FromJavaZipEntry_withoutExtra() throws ZipException {
        ZipEntry javaZipEntry = new ZipEntry("entry.txt");
        javaZipEntry.setMethod(ZipEntry.DEFLATED);
        javaZipEntry.setSize(1234L);
        javaZipEntry.setTime(100000L);

        ZipArchiveEntry entry = new ZipArchiveEntry(javaZipEntry);
        Assert.assertEquals("entry.txt", entry.getName());
        Assert.assertEquals(ZipEntry.DEFLATED, entry.getMethod());
        Assert.assertEquals(1234L, entry.getSize());
        Assert.assertEquals(100000L, entry.getTime());
        Assert.assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testConstructor_FromJavaZipEntry_withExtra() throws ZipException {
        ZipEntry javaZipEntry = new ZipEntry("entry.txt");
        AsiExtraField asi = new AsiExtraField();
        asi.setMode(0755);
        javaZipEntry.setExtra(asi.getLocalFileDataData());

        ZipArchiveEntry entry = new ZipArchiveEntry(javaZipEntry);
        Assert.assertEquals("entry.txt", entry.getName());
        Assert.assertTrue(entry.getExtraFields().length > 0);
    }

    @Test
    public void testConstructor_FromZipArchiveEntry_copiesAllFields() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("original.txt");
        original.setInternalAttributes(2);
        original.setExternalAttributes(42L);
        original.setUnixMode(0644);
        AsiExtraField asi = new AsiExtraField();
        asi.setMode(0644);
        original.addExtraField(asi);

        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        Assert.assertEquals(original.getName(), copy.getName());
        Assert.assertEquals(original.getInternalAttributes(), copy.getInternalAttributes());
        Assert.assertEquals(original.getExternalAttributes(), copy.getExternalAttributes());
        Assert.assertEquals(original.getPlatform(), copy.getPlatform());
        Assert.assertEquals(original.getUnixMode(), copy.getUnixMode());
        Assert.assertNotNull(copy.getExtraField(asi.getHeaderId()));
    }

    @Test
    public void testConstructor_FromFile_file() throws IOException {
        File file = temporaryFolder.newFile("sample.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(new byte[]{1, 2, 3, 4, 5});
        fos.close();

        ZipArchiveEntry entry = new ZipArchiveEntry(file, "sample.txt");
        Assert.assertEquals("sample.txt", entry.getName());
        Assert.assertFalse(entry.isDirectory());
        Assert.assertEquals(5L, entry.getSize());
        Assert.assertEquals(file.lastModified(), entry.getTime());
    }

    @Test
    public void testConstructor_FromFile_directoryWithoutTrailingSlash() {
        File dir = temporaryFolder.getRoot();
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "myDir");
        Assert.assertEquals("myDir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void testConstructor_FromFile_directoryWithTrailingSlash() {
        File dir = temporaryFolder.getRoot();
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "myDir/");
        Assert.assertEquals("myDir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void testClone_createsEqualCopy() {
        ZipArchiveEntry entry = new ZipArchiveEntry("cloneMe.txt");
        entry.setInternalAttributes(5);
        entry.setExternalAttributes(10L);
        entry.setUnixMode(0777);
        entry.setSize(500L);
        entry.setMethod(ZipEntry.DEFLATED);
        AsiExtraField asi = new AsiExtraField();
        asi.setMode(0777);
        entry.addExtraField(asi);

        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        Assert.assertNotSame(entry, cloned);
        Assert.assertEquals(entry, cloned);
        Assert.assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        Assert.assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        Assert.assertEquals(entry.getUnixMode(), cloned.getUnixMode());
        Assert.assertArrayEquals(entry.getExtraFields(), cloned.getExtraFields());
    }

    @Test
    public void testMethod_getterSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        Assert.assertEquals(-1, entry.getMethod());
        entry.setMethod(ZipEntry.STORED);
        Assert.assertEquals(ZipEntry.STORED, entry.getMethod());
        entry.setMethod(ZipEntry.DEFLATED);
        Assert.assertEquals(ZipEntry.DEFLATED, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethod_negativeValue_throwsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setMethod(-2);
    }

    @Test
    public void testSize_getterSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        Assert.assertEquals(ZipArchiveEntry.SIZE_UNKNOWN, entry.getSize());
        entry.setSize(1024L);
        Assert.assertEquals(1024L, entry.getSize());
        entry.setSize(0L);
        Assert.assertEquals(0L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_negativeValue_throwsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(-5L);
    }

    @Test
    public void testInternalAttributes_getterSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        Assert.assertEquals(0, entry.getInternalAttributes());
        entry.setInternalAttributes(123);
        Assert.assertEquals(123, entry.getInternalAttributes());
    }

    @Test
    public void testExternalAttributes_getterSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        Assert.assertEquals(0L, entry.getExternalAttributes());
        entry.setExternalAttributes(0xFFFFFFFFL);
        Assert.assertEquals(0xFFFFFFFFL, entry.getExternalAttributes());
    }

    @Test
    public void testPlatform_getterSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testUnixMode_whenPlatformNotUnix_returnsZero() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        entry.setExternalAttributes(0755L << 16);
        Assert.assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testUnixMode_fileAndDirectoryModes() {
        ZipArchiveEntry fileEntry = new ZipArchiveEntry("file.txt");
        fileEntry.setUnixMode(0644);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, fileEntry.getPlatform());
        Assert.assertEquals(0644, fileEntry.getUnixMode());
        Assert.assertEquals(0, fileEntry.getExternalAttributes() & 0x10); // Not directory

        ZipArchiveEntry dirEntry = new ZipArchiveEntry("dir/");
        dirEntry.setUnixMode(0755);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, dirEntry.getPlatform());
        Assert.assertEquals(0755, dirEntry.getUnixMode());
        Assert.assertEquals(0x10, dirEntry.getExternalAttributes() & 0x10); // Directory flag set

        ZipArchiveEntry readOnlyEntry = new ZipArchiveEntry("readonly.txt");
        readOnlyEntry.setUnixMode(0444); // No 0200 write bit -> read-only attribute set to 1
        Assert.assertEquals(1, readOnlyEntry.getExternalAttributes() & 1);
    }

    @Test
    public void testExtraFields_setAndGet() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        Assert.assertEquals(0, entry.getExtraFields().length);
        Assert.assertEquals(0, entry.getExtraFields(true).length);
        Assert.assertEquals(0, entry.getExtraFields(false).length);

        UnrecognizedExtraField f1 = new UnrecognizedExtraField();
        f1.setHeaderId(new ZipShort(1));
        f1.setLocalFileDataData(new byte[]{1});

        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[]{9, 9}, 0, 2);

        entry.setExtraFields(new ZipExtraField[]{f1, unparseable});
        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertEquals(1, entry.getExtraFields(false).length);
        Assert.assertEquals(2, entry.getExtraFields(true).length);
        Assert.assertSame(unparseable, entry.getUnparseableExtraFieldData());
        Assert.assertSame(f1, entry.getExtraField(new ZipShort(1)));
        Assert.assertNull(entry.getExtraField(new ZipShort(999)));
    }

    @Test
    public void testExtraFields_whenExtraFieldsNull_unparseableOnly() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        entry.addExtraField(unparseable);

        Assert.assertEquals(0, entry.getExtraFields(false).length);
        Assert.assertEquals(1, entry.getExtraFields(true).length);
        Assert.assertSame(unparseable, entry.getExtraFields(true)[0]);
    }

    @Test
    public void testAddExtraField_replacesExistingAndHandlesUnparseable() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        UnrecognizedExtraField f1 = new UnrecognizedExtraField();
        f1.setHeaderId(new ZipShort(1));
        f1.setLocalFileDataData(new byte[]{10});

        entry.addExtraField(f1);
        Assert.assertSame(f1, entry.getExtraField(new ZipShort(1)));

        UnrecognizedExtraField f1Replacement = new UnrecognizedExtraField();
        f1Replacement.setHeaderId(new ZipShort(1));
        f1Replacement.setLocalFileDataData(new byte[]{20});
        entry.addExtraField(f1Replacement);
        Assert.assertSame(f1Replacement, entry.getExtraField(new ZipShort(1)));

        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable);
        Assert.assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testAddAsFirstExtraField_ordersCorrectly() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        UnrecognizedExtraField f1 = new UnrecognizedExtraField();
        f1.setHeaderId(new ZipShort(1));
        f1.setLocalFileDataData(new byte[]{1});

        UnrecognizedExtraField f2 = new UnrecognizedExtraField();
        f2.setHeaderId(new ZipShort(2));
        f2.setLocalFileDataData(new byte[]{2});

        entry.addAsFirstExtraField(f1);
        entry.addAsFirstExtraField(f2);

        ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(2, fields.length);
        Assert.assertEquals(new ZipShort(2), fields[0].getHeaderId());
        Assert.assertEquals(new ZipShort(1), fields[1].getHeaderId());

        // Re-add f1 as first
        entry.addAsFirstExtraField(f1);
        fields = entry.getExtraFields();
        Assert.assertEquals(new ZipShort(1), fields[0].getHeaderId());
        Assert.assertEquals(new ZipShort(2), fields[1].getHeaderId());

        // Add unparseable via addAsFirstExtraField
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addAsFirstExtraField(unparseable);
        Assert.assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testRemoveExtraField_success() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        UnrecognizedExtraField f1 = new UnrecognizedExtraField();
        f1.setHeaderId(new ZipShort(1));
        f1.setLocalFileDataData(new byte[]{1});
        entry.addExtraField(f1);

        entry.removeExtraField(new ZipShort(1));
        Assert.assertNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_whenExtraFieldsNull_throwsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeExtraField(new ZipShort(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraField_whenFieldMissing_throwsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        UnrecognizedExtraField f1 = new UnrecognizedExtraField();
        f1.setHeaderId(new ZipShort(1));
        f1.setLocalFileDataData(new byte[]{1});
        entry.addExtraField(f1);

        entry.removeExtraField(new ZipShort(2));
    }

    @Test
    public void testRemoveUnparseableExtraFieldData_success() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable);
        Assert.assertNotNull(entry.getUnparseableExtraFieldData());

        entry.removeUnparseableExtraFieldData();
        Assert.assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldData_whenNull_throwsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testSetExtra_byteData_andMerge() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        AsiExtraField asi = new AsiExtraField();
        asi.setMode(0755);
        byte[] data = asi.getLocalFileDataData();
        byte[] fullExtra = new byte[data.length + 4];
        System.arraycopy(asi.getHeaderId().getBytes(), 0, fullExtra, 0, 2);
        System.arraycopy(new ZipShort(data.length).getBytes(), 0, fullExtra, 2, 2);
        System.arraycopy(data, 0, fullExtra, 4, data.length);

        entry.setExtra(fullExtra);
        Assert.assertNotNull(entry.getExtraField(asi.getHeaderId()));

        // Merge again to trigger existing field branch in mergeExtraFields (local = true)
        entry.setExtra(fullExtra);
        Assert.assertNotNull(entry.getExtraField(asi.getHeaderId()));
    }

    @Test
    public void testSetCentralDirectoryExtra_andMerge() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        AsiExtraField asi = new AsiExtraField();
        asi.setMode(0644);
        byte[] data = asi.getCentralDirectoryData();
        byte[] fullExtra = new byte[data.length + 4];
        System.arraycopy(asi.getHeaderId().getBytes(), 0, fullExtra, 0, 2);
        System.arraycopy(new ZipShort(data.length).getBytes(), 0, fullExtra, 2, 2);
        System.arraycopy(data, 0, fullExtra, 4, data.length);

        entry.setCentralDirectoryExtra(fullExtra);
        Assert.assertNotNull(entry.getExtraField(asi.getHeaderId()));

        // Merge again to trigger existing field branch in mergeExtraFields (local = false)
        entry.setCentralDirectoryExtra(fullExtra);
        Assert.assertNotNull(entry.getExtraField(asi.getHeaderId()));
    }

    @Test
    public void testGetLocalFileDataExtra_and_getCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        Assert.assertArrayEquals(new byte[0], entry.getLocalFileDataExtra());
        Assert.assertArrayEquals(new byte[0], entry.getCentralDirectoryExtra());

        UnrecognizedExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(new ZipShort(0x1234));
        field.setLocalFileDataData(new byte[]{1, 2});
        field.setCentralDirectoryData(new byte[]{3, 4, 5});
        entry.addExtraField(field);

        Assert.assertTrue(entry.getLocalFileDataExtra().length > 0);
        Assert.assertTrue(entry.getCentralDirectoryExtra().length > 0);
    }

    @Test
    public void testRawName_and_setNameWithBytes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("defaultName");
        Assert.assertNull(entry.getRawName());

        byte[] raw = new byte[]{0x61, 0x62, 0x63};
        entry.setName("abc", raw);
        Assert.assertEquals("abc", entry.getName());
        Assert.assertArrayEquals(raw, entry.getRawName());

        // Ensure returned rawName is a copy
        byte[] returnedRaw = entry.getRawName();
        returnedRaw[0] = 0;
        Assert.assertEquals(0x61, entry.getRawName()[0]);
    }

    @Test
    public void testSetName_nullFallbackToSuper() {
        ZipArchiveEntry entry = new ZipArchiveEntry("initial");
        entry.setName(null);
        Assert.assertEquals("initial", entry.getName());
    }

    @Test
    public void testGeneralPurposeBit_getterSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        Assert.assertNotNull(entry.getGeneralPurposeBit());

        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        entry.setGeneralPurposeBit(gpb);
        Assert.assertSame(gpb, entry.getGeneralPurposeBit());
        Assert.assertTrue(entry.getGeneralPurposeBit().usesUTF8ForNames());
    }

    @Test
    public void testGetLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        long now = 1600000000000L;
        entry.setTime(now);
        Assert.assertEquals(new Date(now), entry.getLastModifiedDate());
    }

    @Test
    public void testHashCode_consistentWithName() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("testName");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("testName");
        Assert.assertEquals(entry1.hashCode(), entry2.hashCode());
        Assert.assertEquals("testName".hashCode(), entry1.hashCode());
    }

    @Test
    public void testEquals_reflexiveSymmetricAndNullChecks() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("file.txt");
        Assert.assertTrue(entry1.equals(entry1));
        Assert.assertFalse(entry1.equals(null));
        Assert.assertFalse(entry1.equals("NotAZipArchiveEntry"));

        ZipArchiveEntry entry2 = new ZipArchiveEntry("file.txt");
        Assert.assertTrue(entry1.equals(entry2));
        Assert.assertTrue(entry2.equals(entry1));

        ZipArchiveEntry entry3 = new ZipArchiveEntry("other.txt");
        Assert.assertFalse(entry1.equals(entry3));
    }

    @Test
    public void testEquals_allFieldVariations() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("file.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("file.txt");

        // Comment differences
        e1.setComment("comment");
        Assert.assertFalse(e1.equals(e2));
        Assert.assertFalse(e2.equals(e1));
        e2.setComment("different");
        Assert.assertFalse(e1.equals(e2));
        e2.setComment("comment");
        Assert.assertTrue(e1.equals(e2));

        // Time differences
        e1.setTime(1000L);
        e2.setTime(2000L);
        Assert.assertFalse(e1.equals(e2));
        e2.setTime(1000L);
        Assert.assertTrue(e1.equals(e2));

        // Internal attributes differences
        e1.setInternalAttributes(1);
        Assert.assertFalse(e1.equals(e2));
        e2.setInternalAttributes(1);
        Assert.assertTrue(e1.equals(e2));

        // Platform differences
        e1.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        Assert.assertFalse(e1.equals(e2));
        e2.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        Assert.assertTrue(e1.equals(e2));

        // External attributes differences
        e1.setExternalAttributes(10L);
        Assert.assertFalse(e1.equals(e2));
        e2.setExternalAttributes(10L);
        Assert.assertTrue(e1.equals(e2));

        // Method differences
        e1.setMethod(ZipEntry.DEFLATED);
        Assert.assertFalse(e1.equals(e2));
        e2.setMethod(ZipEntry.DEFLATED);
        Assert.assertTrue(e1.equals(e2));

        // Size differences
        e1.setSize(100L);
        Assert.assertFalse(e1.equals(e2));
        e2.setSize(100L);
        Assert.assertTrue(e1.equals(e2));

        // CRC differences
        e1.setCrc(12345L);
        Assert.assertFalse(e1.equals(e2));
        e2.setCrc(12345L);
        Assert.assertTrue(e1.equals(e2));

        // CompressedSize differences
        e1.setCompressedSize(50L);
        Assert.assertFalse(e1.equals(e2));
        e2.setCompressedSize(50L);
        Assert.assertTrue(e1.equals(e2));

        // Extra fields differences
        UnrecognizedExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(new ZipShort(0x1111));
        field.setLocalFileDataData(new byte[]{1});
        e1.addExtraField(field);
        Assert.assertFalse(e1.equals(e2));
        e2.addExtraField(field);
        Assert.assertTrue(e1.equals(e2));

        // GPB differences
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        e1.setGeneralPurposeBit(gpb);
        Assert.assertFalse(e1.equals(e2));
        e2.setGeneralPurposeBit(gpb);
        Assert.assertTrue(e1.equals(e2));
    }
}
