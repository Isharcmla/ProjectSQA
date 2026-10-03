package org.apache.commons.compress.archivers.zip;

import org.junit.Test;

import java.util.zip.ZipException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

public class Zip64ExtendedInformationExtraFieldTest {

    @Test
    public void testGetHeaderId_returnsCorrectHeaderId() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipShort(0x0001), field.getHeaderId());
        assertSame(Zip64ExtendedInformationExtraField.HEADER_ID, field.getHeaderId());
    }

    @Test
    public void testDefaultConstructor_allFieldsNull() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
        assertEquals(0, field.getLocalFileDataLength().getValue());
        assertEquals(0, field.getCentralDirectoryLength().getValue());
        assertArrayEquals(new byte[0], field.getLocalFileDataData());
        assertArrayEquals(new byte[0], field.getCentralDirectoryData());
    }

    @Test
    public void testTwoArgConstructor_setsSizesProperly() {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize);

        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
        assertEquals(16, field.getLocalFileDataLength().getValue());
        assertEquals(16, field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testFourArgConstructor_setsAllFields() {
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        ZipEightByteInteger offset = new ZipEightByteInteger(200L);
        ZipLong disk = new ZipLong(1L);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize, offset, disk);

        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertEquals(disk, field.getDiskStartNumber());
        assertEquals(16, field.getLocalFileDataLength().getValue());
        assertEquals(28, field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testSettersAndGetters() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();

        ZipEightByteInteger size = new ZipEightByteInteger(12345L);
        ZipEightByteInteger compSize = new ZipEightByteInteger(67890L);
        ZipEightByteInteger offset = new ZipEightByteInteger(112233L);
        ZipLong disk = new ZipLong(42L);

        field.setSize(size);
        field.setCompressedSize(compSize);
        field.setRelativeHeaderOffset(offset);
        field.setDiskStartNumber(disk);

        assertEquals(size, field.getSize());
        assertEquals(compSize, field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertEquals(disk, field.getDiskStartNumber());
    }

    @Test
    public void testGetLocalFileDataData_bothSizesPresent_returns16Bytes() {
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger compSize = new ZipEightByteInteger(2L);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compSize);

        byte[] data = field.getLocalFileDataData();
        assertEquals(16, data.length);

        byte[] expected = new byte[16];
        System.arraycopy(size.getBytes(), 0, expected, 0, 8);
        System.arraycopy(compSize.getBytes(), 0, expected, 8, 8);
        assertArrayEquals(expected, data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataData_sizeNullCompressedSizeNotNull_throwsException() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setCompressedSize(new ZipEightByteInteger(100L));
        field.getLocalFileDataData();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataData_sizeNotNullCompressedSizeNull_throwsException() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setSize(new ZipEightByteInteger(100L));
        field.getLocalFileDataData();
    }

    @Test
    public void testGetCentralDirectoryData_allFieldsPresent() {
        ZipEightByteInteger size = new ZipEightByteInteger(0x0102030405060708L);
        ZipEightByteInteger compSize = new ZipEightByteInteger(0x1112131415161718L);
        ZipEightByteInteger offset = new ZipEightByteInteger(0x2122232425262728L);
        ZipLong disk = new ZipLong(0x31323334L);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compSize, offset, disk);

        byte[] data = field.getCentralDirectoryData();
        assertEquals(28, data.length);

        byte[] expected = new byte[28];
        System.arraycopy(size.getBytes(), 0, expected, 0, 8);
        System.arraycopy(compSize.getBytes(), 0, expected, 8, 8);
        System.arraycopy(offset.getBytes(), 0, expected, 16, 8);
        System.arraycopy(disk.getBytes(), 0, expected, 24, 4);

        assertArrayEquals(expected, data);
    }

    @Test
    public void testGetCentralDirectoryData_partialFields() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setSize(new ZipEightByteInteger(10L));
        field.setRelativeHeaderOffset(new ZipEightByteInteger(20L));
        // size (8) + offset (8) = 16 bytes
        assertEquals(16, field.getCentralDirectoryLength().getValue());

        byte[] data = field.getCentralDirectoryData();
        assertEquals(16, data.length);

        byte[] expected = new byte[16];
        System.arraycopy(new ZipEightByteInteger(10L).getBytes(), 0, expected, 0, 8);
        System.arraycopy(new ZipEightByteInteger(20L).getBytes(), 0, expected, 8, 8);
        assertArrayEquals(expected, data);

        field = new Zip64ExtendedInformationExtraField();
        field.setCompressedSize(new ZipEightByteInteger(30L));
        field.setDiskStartNumber(new ZipLong(5L));
        assertEquals(12, field.getCentralDirectoryLength().getValue());

        data = field.getCentralDirectoryData();
        assertEquals(12, data.length);
        expected = new byte[12];
        System.arraycopy(new ZipEightByteInteger(30L).getBytes(), 0, expected, 0, 8);
        System.arraycopy(new ZipLong(5L).getBytes(), 0, expected, 8, 4);
        assertArrayEquals(expected, data);
    }

    @Test
    public void testParseFromLocalFileData_lengthZero_doesNothing() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[10];
        field.parseFromLocalFileData(buffer, 0, 0);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test(expected = ZipException.class)
    public void testParseFromLocalFileData_lengthLessThan16_throwsZipException() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[15];
        field.parseFromLocalFileData(buffer, 0, 15);
    }

    @Test
    public void testParseFromLocalFileData_length16_readsBothSizes() throws ZipException {
        byte[] buffer = new byte[20];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compSize = new ZipEightByteInteger(200L);
        System.arraycopy(size.getBytes(), 0, buffer, 2, 8);
        System.arraycopy(compSize.getBytes(), 0, buffer, 10, 8);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(buffer, 2, 16);

        assertEquals(size, field.getSize());
        assertEquals(compSize, field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_length24_readsSizesAndOffset() throws ZipException {
        byte[] buffer = new byte[24];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compSize = new ZipEightByteInteger(200L);
        ZipEightByteInteger offset = new ZipEightByteInteger(300L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(offset.getBytes(), 0, buffer, 16, 8);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(buffer, 0, 24);

        assertEquals(size, field.getSize());
        assertEquals(compSize, field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_length28_readsAllFields() throws ZipException {
        byte[] buffer = new byte[28];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compSize = new ZipEightByteInteger(200L);
        ZipEightByteInteger offset = new ZipEightByteInteger(300L);
        ZipLong disk = new ZipLong(400L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(offset.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(disk.getBytes(), 0, buffer, 24, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(buffer, 0, 28);

        assertEquals(size, field.getSize());
        assertEquals(compSize, field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertEquals(disk, field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_lengthAtLeast28_parsesAll() throws ZipException {
        byte[] buffer = new byte[32];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compSize = new ZipEightByteInteger(200L);
        ZipEightByteInteger offset = new ZipEightByteInteger(300L);
        ZipLong disk = new ZipLong(400L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(offset.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(disk.getBytes(), 0, buffer, 24, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 28);

        assertEquals(size, field.getSize());
        assertEquals(compSize, field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertEquals(disk, field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_length24_parsesSizesAndOffset() throws ZipException {
        byte[] buffer = new byte[24];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compSize = new ZipEightByteInteger(200L);
        ZipEightByteInteger offset = new ZipEightByteInteger(300L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(offset.getBytes(), 0, buffer, 16, 8);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 24);

        assertEquals(size, field.getSize());
        assertEquals(compSize, field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_lengthMod8Equals4_parsesDiskStart() throws ZipException {
        byte[] buffer = new byte[12];
        ZipLong disk = new ZipLong(999L);
        System.arraycopy(disk.getBytes(), 0, buffer, 8, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 12);

        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertEquals(disk, field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_unrecognizedLength_doesNotPopulateFields() throws ZipException {
        byte[] buffer = new byte[16];
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 16);

        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_withoutPriorParse_doesNothing() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.reparseCentralDirectoryData(true, true, true, true);
        assertNull(field.getSize());
    }

    @Test
    public void testReparseCentralDirectoryData_allCombinations() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compSize = new ZipEightByteInteger(200L);
        ZipEightByteInteger offset = new ZipEightByteInteger(300L);
        ZipLong disk = new ZipLong(400L);

        byte[] buffer = new byte[28];
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(offset.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(disk.getBytes(), 0, buffer, 24, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 28);

        field.setSize(null);
        field.setCompressedSize(null);
        field.setRelativeHeaderOffset(null);
        field.setDiskStartNumber(null);

        field.reparseCentralDirectoryData(true, true, true, true);
        assertEquals(size, field.getSize());
        assertEquals(compSize, field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertEquals(disk, field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_subsetOfFields() throws ZipException {
        ZipEightByteInteger compSize = new ZipEightByteInteger(555L);
        ZipLong disk = new ZipLong(777L);

        byte[] buffer = new byte[12];
        System.arraycopy(compSize.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(disk.getBytes(), 0, buffer, 8, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 12);

        field.setSize(null);
        field.setCompressedSize(null);
        field.setRelativeHeaderOffset(null);
        field.setDiskStartNumber(null);

        field.reparseCentralDirectoryData(false, true, false, true);
        assertNull(field.getSize());
        assertEquals(compSize, field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertEquals(disk, field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_onlyUncompressedAndRelativeOffset() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(111L);
        ZipEightByteInteger offset = new ZipEightByteInteger(222L);

        byte[] buffer = new byte[16];
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(offset.getBytes(), 0, buffer, 8, 8);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 16);

        field.reparseCentralDirectoryData(true, false, true, false);
        assertEquals(size, field.getSize());
        assertNull(field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryData_lengthMismatch_throwsZipException() throws ZipException {
        byte[] buffer = new byte[16];
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 16);

        // Expected length for (true, true, true, false) is 24, but raw is 16
        field.reparseCentralDirectoryData(true, true, true, false);
    }
}
