import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.zip.ZipException;

public class Zip64ExtendedInformationExtraFieldTest {

    private Zip64ExtendedInformationExtraField field;

    @Before
    public void setUp() {
        field = new Zip64ExtendedInformationExtraField();
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_createsEmptyField() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testTwoArgConstructor_setsSizeAndCompressedSize() {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(size, compressedSize);
        assertEquals(size, f.getSize());
        assertEquals(compressedSize, f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testFourArgConstructor_setsAllFields() {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(200L);
        ZipLong diskStart = new ZipLong(1L);
        Zip64ExtendedInformationExtraField f =
            new Zip64ExtendedInformationExtraField(size, compressedSize,
                relativeHeaderOffset, diskStart);
        assertEquals(size, f.getSize());
        assertEquals(compressedSize, f.getCompressedSize());
        assertEquals(relativeHeaderOffset, f.getRelativeHeaderOffset());
        assertEquals(diskStart, f.getDiskStartNumber());
    }

    // ---------- getHeaderId ----------

    @Test
    public void testGetHeaderId_returnsCorrectHeaderId() {
        assertEquals(new ZipShort(0x0001), field.getHeaderId());
    }

    // ---------- getLocalFileDataLength ----------

    @Test
    public void testGetLocalFileDataLength_sizeNull_returnsZero() {
        assertEquals(0, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLength_sizeSet_returnsSixteen() {
        field.setSize(new ZipEightByteInteger(10L));
        assertEquals(16, field.getLocalFileDataLength().getValue());
    }

    // ---------- getCentralDirectoryLength ----------

    @Test
    public void testGetCentralDirectoryLength_allNull_returnsZero() {
        assertEquals(0, field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetCentralDirectoryLength_allSet_returnsCorrectLength() {
        field.setSize(new ZipEightByteInteger(1L));
        field.setCompressedSize(new ZipEightByteInteger(2L));
        field.setRelativeHeaderOffset(new ZipEightByteInteger(3L));
        field.setDiskStartNumber(new ZipLong(4L));
        // 8+8+8+4 = 28
        assertEquals(28, field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetCentralDirectoryLength_onlySizeSet_returnsEight() {
        field.setSize(new ZipEightByteInteger(1L));
        assertEquals(8, field.getCentralDirectoryLength().getValue());
    }

    // ---------- getLocalFileDataData ----------

    @Test
    public void testGetLocalFileDataData_bothNull_returnsEmptyArray() {
        byte[] data = field.getLocalFileDataData();
        assertEquals(0, data.length);
    }

    @Test
    public void testGetLocalFileDataData_bothSet_returnsCorrectData() {
        field.setSize(new ZipEightByteInteger(100L));
        field.setCompressedSize(new ZipEightByteInteger(50L));
        byte[] data = field.getLocalFileDataData();
        assertEquals(16, data.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataData_onlySizeSet_throwsIllegalArgumentException() {
        field.setSize(new ZipEightByteInteger(100L));
        field.getLocalFileDataData();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataData_onlyCompressedSizeSet_throwsIllegalArgumentException() {
        field.setCompressedSize(new ZipEightByteInteger(50L));
        field.getLocalFileDataData();
    }

    // ---------- getCentralDirectoryData ----------

    @Test
    public void testGetCentralDirectoryData_allFieldsSet_returnsCorrectLengthData() {
        field.setSize(new ZipEightByteInteger(1L));
        field.setCompressedSize(new ZipEightByteInteger(2L));
        field.setRelativeHeaderOffset(new ZipEightByteInteger(3L));
        field.setDiskStartNumber(new ZipLong(4L));
        byte[] data = field.getCentralDirectoryData();
        assertEquals(28, data.length);
    }

    @Test
    public void testGetCentralDirectoryData_allNull_returnsEmptyArray() {
        byte[] data = field.getCentralDirectoryData();
        assertEquals(0, data.length);
    }

    @Test
    public void testGetCentralDirectoryData_onlyRelativeHeaderOffsetSet_returnsCorrectData() {
        field.setRelativeHeaderOffset(new ZipEightByteInteger(3L));
        byte[] data = field.getCentralDirectoryData();
        assertEquals(8, data.length);
    }

    @Test
    public void testGetCentralDirectoryData_onlyDiskStartSet_returnsCorrectData() {
        field.setDiskStartNumber(new ZipLong(4L));
        byte[] data = field.getCentralDirectoryData();
        assertEquals(4, data.length);
    }

    // ---------- parseFromLocalFileData ----------

    @Test
    public void testParseFromLocalFileData_zeroLength_doesNothing() throws ZipException {
        byte[] buffer = new byte[0];
        field.parseFromLocalFileData(buffer, 0, 0);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
    }

    @Test(expected = ZipException.class)
    public void testParseFromLocalFileData_lengthTooSmall_throwsZipException() throws ZipException {
        byte[] buffer = new byte[10];
        field.parseFromLocalFileData(buffer, 0, 10);
    }

    @Test
    public void testParseFromLocalFileData_exactlyTwoDwords_setsSizesOnly() throws ZipException {
        byte[] buffer = new byte[16];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compressedSize.getBytes(), 0, buffer, 8, 8);

        field.parseFromLocalFileData(buffer, 0, 16);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_withRelativeHeaderOffset_setsAllExceptDiskStart() throws ZipException {
        byte[] buffer = new byte[24];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        ZipEightByteInteger relOffset = new ZipEightByteInteger(200L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compressedSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(relOffset.getBytes(), 0, buffer, 16, 8);

        field.parseFromLocalFileData(buffer, 0, 24);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relOffset, field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_withAllFields_setsAllValues() throws ZipException {
        byte[] buffer = new byte[28];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        ZipEightByteInteger relOffset = new ZipEightByteInteger(200L);
        ZipLong diskStart = new ZipLong(1L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compressedSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(relOffset.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(diskStart.getBytes(), 0, buffer, 24, 4);

        field.parseFromLocalFileData(buffer, 0, 28);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relOffset, field.getRelativeHeaderOffset());
        assertEquals(diskStart, field.getDiskStartNumber());
    }

    // ---------- parseFromCentralDirectoryData ----------

    @Test
    public void testParseFromCentralDirectoryData_fullLength_setsAllFields() throws ZipException {
        byte[] buffer = new byte[28];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        ZipEightByteInteger relOffset = new ZipEightByteInteger(200L);
        ZipLong diskStart = new ZipLong(1L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compressedSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(relOffset.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(diskStart.getBytes(), 0, buffer, 24, 4);

        field.parseFromCentralDirectoryData(buffer, 0, 28);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relOffset, field.getRelativeHeaderOffset());
        assertEquals(diskStart, field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_threeDwords_setsThreeFields() throws ZipException {
        byte[] buffer = new byte[24];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        ZipEightByteInteger relOffset = new ZipEightByteInteger(200L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compressedSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(relOffset.getBytes(), 0, buffer, 16, 8);

        field.parseFromCentralDirectoryData(buffer, 0, 24);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relOffset, field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_lengthModEqualsWord_setsDiskStartOnly() throws ZipException {
        // length % DWORD == WORD, e.g. length = 4 (WORD)
        byte[] buffer = new byte[4];
        ZipLong diskStart = new ZipLong(5L);
        System.arraycopy(diskStart.getBytes(), 0, buffer, 0, 4);

        field.parseFromCentralDirectoryData(buffer, 0, 4);
        assertEquals(diskStart, field.getDiskStartNumber());
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
    }

    @Test
    public void testParseFromCentralDirectoryData_lengthZero_noFieldsSet() throws ZipException {
        byte[] buffer = new byte[0];
        field.parseFromCentralDirectoryData(buffer, 0, 0);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_lengthDoesNotMatchAnyCase_noFieldsSet() throws ZipException {
        // length = 12, not >= 28, not == 24, not % 8 == 4 (12 % 8 = 4 actually)
        // Choose length that fails all branches: e.g., length = 6
        byte[] buffer = new byte[6];
        field.parseFromCentralDirectoryData(buffer, 0, 6);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    // ---------- reparseCentralDirectoryData ----------

    @Test
    public void testReparseCentralDirectoryData_rawDataNull_doesNothing() throws ZipException {
        // rawCentralDirectoryData is null since parseFromCentralDirectoryData was never called
        field.reparseCentralDirectoryData(true, true, true, true);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_allFlagsTrue_setsAllFields() throws ZipException {
        byte[] buffer = new byte[28];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        ZipEightByteInteger relOffset = new ZipEightByteInteger(200L);
        ZipLong diskStart = new ZipLong(1L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(compressedSize.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(relOffset.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(diskStart.getBytes(), 0, buffer, 24, 4);

        // first call parseFromCentralDirectoryData to set rawCentralDirectoryData
        field.parseFromCentralDirectoryData(buffer, 0, 28);
        // reset fields to verify reparse actually sets them
        field.setSize(null);
        field.setCompressedSize(null);
        field.setRelativeHeaderOffset(null);
        field.setDiskStartNumber(null);

        field.reparseCentralDirectoryData(true, true, true, true);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relOffset, field.getRelativeHeaderOffset());
        assertEquals(diskStart, field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_onlySizeFlagTrue_setsSizeOnly() throws ZipException {
        byte[] buffer = new byte[8];
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        System.arraycopy(size.getBytes(), 0, buffer, 0, 8);

        field.parseFromCentralDirectoryData(buffer, 0, 8);
        field.setSize(null);

        field.reparseCentralDirectoryData(true, false, false, false);
        assertEquals(size, field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_onlyDiskStartFlagTrue_setsDiskStartOnly() throws ZipException {
        byte[] buffer = new byte[4];
        ZipLong diskStart = new ZipLong(7L);
        System.arraycopy(diskStart.getBytes(), 0, buffer, 0, 4);

        field.parseFromCentralDirectoryData(buffer, 0, 4);
        field.setDiskStartNumber(null);

        field.reparseCentralDirectoryData(false, false, false, true);
        assertEquals(diskStart, field.getDiskStartNumber());
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
    }

    @Test
    public void testReparseCentralDirectoryData_allFlagsFalse_setsNothingButNoException() throws ZipException {
        byte[] buffer = new byte[0];
        field.parseFromCentralDirectoryData(buffer, 0, 0);

        field.reparseCentralDirectoryData(false, false, false, false);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryData_lengthMismatch_throwsZipException() throws ZipException {
        byte[] buffer = new byte[8];
        field.parseFromCentralDirectoryData(buffer, 0, 8);

        // expected length would be 8+8=16 but actual raw data length is 8
        field.reparseCentralDirectoryData(true, true, false, false);
    }

    // ---------- getters/setters ----------

    @Test
    public void testGetSetSize_normalValue_returnsSameValue() {
        ZipEightByteInteger size = new ZipEightByteInteger(123L);
        field.setSize(size);
        assertEquals(size, field.getSize());
    }

    @Test
    public void testGetSetSize_null_returnsNull() {
        field.setSize(null);
        assertNull(field.getSize());
    }

    @Test
    public void testGetSetCompressedSize_normalValue_returnsSameValue() {
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(456L);
        field.setCompressedSize(compressedSize);
        assertEquals(compressedSize, field.getCompressedSize());
    }

    @Test
    public void testGetSetCompressedSize_null_returnsNull() {
        field.setCompressedSize(null);
        assertNull(field.getCompressedSize());
    }

    @Test
    public void testGetSetRelativeHeaderOffset_normalValue_returnsSameValue() {
        ZipEightByteInteger relOffset = new ZipEightByteInteger(789L);
        field.setRelativeHeaderOffset(relOffset);
        assertEquals(relOffset, field.getRelativeHeaderOffset());
    }

    @Test
    public void testGetSetRelativeHeaderOffset_null_returnsNull() {
        field.setRelativeHeaderOffset(null);
        assertNull(field.getRelativeHeaderOffset());
    }

    @Test
    public void testGetSetDiskStartNumber_normalValue_returnsSameValue() {
        ZipLong diskStart = new ZipLong(3L);
        field.setDiskStartNumber(diskStart);
        assertEquals(diskStart, field.getDiskStartNumber());
    }

    @Test
    public void testGetSetDiskStartNumber_null_returnsNull() {
        field.setDiskStartNumber(null);
        assertNull(field.getDiskStartNumber());
    }
}
