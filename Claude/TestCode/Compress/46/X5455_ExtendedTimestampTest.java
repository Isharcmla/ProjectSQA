import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class X5455_ExtendedTimestampTest {

    private X5455_ExtendedTimestamp xf;

    @Before
    public void setUp() {
        xf = new X5455_ExtendedTimestamp();
    }

    // ---------- getHeaderId ----------
    @Test
    public void testGetHeaderId_returnsCorrectValue() {
        ZipShort headerId = xf.getHeaderId();
        assertEquals(0x5455, headerId.getValue());
    }

    // ---------- getLocalFileDataLength ----------
    @Test
    public void testGetLocalFileDataLength_noFlags_returnsOne() {
        ZipShort length = xf.getLocalFileDataLength();
        assertEquals(1, length.getValue());
    }

    @Test
    public void testGetLocalFileDataLength_modifyTimeOnly_returnsFive() {
        xf.setModifyTime(new ZipLong(1000L));
        ZipShort length = xf.getLocalFileDataLength();
        assertEquals(5, length.getValue());
    }

    @Test
    public void testGetLocalFileDataLength_allThreeTimes_returnsThirteen() {
        xf.setModifyTime(new ZipLong(1000L));
        xf.setAccessTime(new ZipLong(2000L));
        xf.setCreateTime(new ZipLong(3000L));
        ZipShort length = xf.getLocalFileDataLength();
        assertEquals(13, length.getValue());
    }

    @Test
    public void testGetLocalFileDataLength_flagSetButTimeNull_ignoresTime() {
        // Manually set flags with bit1 and bit2, but do NOT set the times
        xf.setFlags((byte) (X5455_ExtendedTimestamp.ACCESS_TIME_BIT | X5455_ExtendedTimestamp.CREATE_TIME_BIT));
        ZipShort length = xf.getLocalFileDataLength();
        // bit1_accessTimePresent && accessTime != null -> false since accessTime is null
        assertEquals(1, length.getValue());
    }

    // ---------- getCentralDirectoryLength ----------
    @Test
    public void testGetCentralDirectoryLength_noModifyTime_returnsOne() {
        ZipShort length = xf.getCentralDirectoryLength();
        assertEquals(1, length.getValue());
    }

    @Test
    public void testGetCentralDirectoryLength_withModifyTime_returnsFive() {
        xf.setModifyTime(new ZipLong(1000L));
        ZipShort length = xf.getCentralDirectoryLength();
        assertEquals(5, length.getValue());
    }

    // ---------- getLocalFileDataData ----------
    @Test
    public void testGetLocalFileDataData_noTimes_returnsSingleZeroByte() {
        byte[] data = xf.getLocalFileDataData();
        assertEquals(1, data.length);
        assertEquals(0, data[0]);
    }

    @Test
    public void testGetLocalFileDataData_modifyTimeOnly_correctBytes() {
        xf.setModifyTime(new ZipLong(1000L));
        byte[] data = xf.getLocalFileDataData();
        assertEquals(5, data.length);
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, data[0]);
    }

    @Test
    public void testGetLocalFileDataData_allThreeTimes_correctFlagsAndLength() {
        xf.setModifyTime(new ZipLong(1000L));
        xf.setAccessTime(new ZipLong(2000L));
        xf.setCreateTime(new ZipLong(3000L));
        byte[] data = xf.getLocalFileDataData();
        assertEquals(13, data.length);
        int expectedFlags = X5455_ExtendedTimestamp.MODIFY_TIME_BIT
                | X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT;
        assertEquals((byte) expectedFlags, data[0]);
    }

    // ---------- getCentralDirectoryData ----------
    @Test
    public void testGetCentralDirectoryData_noTimes_returnsSingleByte() {
        byte[] data = xf.getCentralDirectoryData();
        assertEquals(1, data.length);
        assertEquals(0, data[0]);
    }

    @Test
    public void testGetCentralDirectoryData_withAllTimes_onlyModifyTimeIncluded() {
        xf.setModifyTime(new ZipLong(1000L));
        xf.setAccessTime(new ZipLong(2000L));
        xf.setCreateTime(new ZipLong(3000L));
        byte[] data = xf.getCentralDirectoryData();
        assertEquals(5, data.length);
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, data[0]);
    }

    // ---------- parseFromLocalFileData ----------
    @Test
    public void testParseFromLocalFileData_modifyTimeOnly_parsesCorrectly() throws ZipException {
        xf.setModifyTime(new ZipLong(1000L));
        byte[] data = xf.getLocalFileDataData();

        X5455_ExtendedTimestamp parsed = new X5455_ExtendedTimestamp();
        parsed.parseFromLocalFileData(data, 0, data.length);

        assertTrue(parsed.isBit0_modifyTimePresent());
        assertEquals(1000L, parsed.getModifyTime().getValue());
    }

    @Test
    public void testParseFromLocalFileData_allThreeTimes_parsesCorrectly() throws ZipException {
        xf.setModifyTime(new ZipLong(1000L));
        xf.setAccessTime(new ZipLong(2000L));
        xf.setCreateTime(new ZipLong(3000L));
        byte[] data = xf.getLocalFileDataData();

        X5455_ExtendedTimestamp parsed = new X5455_ExtendedTimestamp();
        parsed.parseFromLocalFileData(data, 0, data.length);

        assertTrue(parsed.isBit0_modifyTimePresent());
        assertTrue(parsed.isBit1_accessTimePresent());
        assertTrue(parsed.isBit2_createTimePresent());
        assertEquals(1000L, parsed.getModifyTime().getValue());
        assertEquals(2000L, parsed.getAccessTime().getValue());
        assertEquals(3000L, parsed.getCreateTime().getValue());
    }

    @Test
    public void testParseFromLocalFileData_withOffset_parsesCorrectly() throws ZipException {
        xf.setModifyTime(new ZipLong(1000L));
        byte[] rawData = xf.getLocalFileDataData();

        // Add an offset padding
        byte[] paddedData = new byte[rawData.length + 3];
        System.arraycopy(rawData, 0, paddedData, 3, rawData.length);

        X5455_ExtendedTimestamp parsed = new X5455_ExtendedTimestamp();
        parsed.parseFromLocalFileData(paddedData, 3, rawData.length);

        assertTrue(parsed.isBit0_modifyTimePresent());
        assertEquals(1000L, parsed.getModifyTime().getValue());
    }

    @Test
    public void testParseFromLocalFileData_flagsSetButNoDataForAccessCreate_shortLength() throws ZipException {
        // Simulate central directory style data: flags with bit1/bit2 set but only modify time present
        byte flags = (byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT
                | X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT);
        ZipLong modTime = new ZipLong(1000L);
        byte[] data = new byte[5];
        data[0] = flags;
        System.arraycopy(modTime.getBytes(), 0, data, 1, 4);

        X5455_ExtendedTimestamp parsed = new X5455_ExtendedTimestamp();
        parsed.parseFromLocalFileData(data, 0, data.length);

        assertTrue(parsed.isBit0_modifyTimePresent());
        assertTrue(parsed.isBit1_accessTimePresent());
        assertTrue(parsed.isBit2_createTimePresent());
        assertEquals(1000L, parsed.getModifyTime().getValue());
        assertNull(parsed.getAccessTime());
        assertNull(parsed.getCreateTime());
    }

    @Test
    public void testParseFromLocalFileData_noFlags_resultsInNoTimesPresent() throws ZipException {
        byte[] data = new byte[]{0};
        X5455_ExtendedTimestamp parsed = new X5455_ExtendedTimestamp();
        parsed.parseFromLocalFileData(data, 0, data.length);

        assertFalse(parsed.isBit0_modifyTimePresent());
        assertFalse(parsed.isBit1_accessTimePresent());
        assertFalse(parsed.isBit2_createTimePresent());
        assertNull(parsed.getModifyTime());
        assertNull(parsed.getAccessTime());
        assertNull(parsed.getCreateTime());
    }

    // ---------- parseFromCentralDirectoryData ----------
    @Test
    public void testParseFromCentralDirectoryData_modifyTimeOnly_parsesCorrectly() throws ZipException {
        xf.setModifyTime(new ZipLong(1000L));
        byte[] data = xf.getCentralDirectoryData();

        X5455_ExtendedTimestamp parsed = new X5455_ExtendedTimestamp();
        parsed.parseFromCentralDirectoryData(data, 0, data.length);

        assertTrue(parsed.isBit0_modifyTimePresent());
        assertEquals(1000L, parsed.getModifyTime().getValue());
    }

    // ---------- setFlags/getFlags ----------
    @Test
    public void testSetFlags_allBitsSet_correctlyUpdatesFlagsAndBits() {
        byte flags = (byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT
                | X5455_ExtendedTimestamp.ACCESS_TIME_BIT
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT);
        xf.setFlags(flags);

        assertEquals(flags, xf.getFlags());
        assertTrue(xf.isBit0_modifyTimePresent());
        assertTrue(xf.isBit1_accessTimePresent());
        assertTrue(xf.isBit2_createTimePresent());
    }

    @Test
    public void testSetFlags_zero_allBitsFalse() {
        xf.setFlags((byte) 0);
        assertEquals(0, xf.getFlags());
        assertFalse(xf.isBit0_modifyTimePresent());
        assertFalse(xf.isBit1_accessTimePresent());
        assertFalse(xf.isBit2_createTimePresent());
    }

    // ---------- isBit0/1/2 (default state) ----------
    @Test
    public void testIsBit0ModifyTimePresent_defaultFalse() {
        assertFalse(xf.isBit0_modifyTimePresent());
    }

    @Test
    public void testIsBit1AccessTimePresent_defaultFalse() {
        assertFalse(xf.isBit1_accessTimePresent());
    }

    @Test
    public void testIsBit2CreateTimePresent_defaultFalse() {
        assertFalse(xf.isBit2_createTimePresent());
    }

    // ---------- getModifyTime/getAccessTime/getCreateTime ----------
    @Test
    public void testGetModifyTime_defaultNull() {
        assertNull(xf.getModifyTime());
    }

    @Test
    public void testGetAccessTime_defaultNull() {
        assertNull(xf.getAccessTime());
    }

    @Test
    public void testGetCreateTime_defaultNull() {
        assertNull(xf.getCreateTime());
    }

    @Test
    public void testGetModifyTime_afterSet_returnsCorrectValue() {
        ZipLong zl = new ZipLong(12345L);
        xf.setModifyTime(zl);
        assertEquals(zl, xf.getModifyTime());
    }

    // ---------- getModifyJavaTime/getAccessJavaTime/getCreateJavaTime ----------
    @Test
    public void testGetModifyJavaTime_nullTime_returnsNull() {
        assertNull(xf.getModifyJavaTime());
    }

    @Test
    public void testGetModifyJavaTime_validTime_returnsCorrectDate() {
        xf.setModifyTime(new ZipLong(1000L));
        Date d = xf.getModifyJavaTime();
        assertNotNull(d);
        assertEquals(1000000L, d.getTime());
    }

    @Test
    public void testGetAccessJavaTime_nullTime_returnsNull() {
        assertNull(xf.getAccessJavaTime());
    }

    @Test
    public void testGetAccessJavaTime_validTime_returnsCorrectDate() {
        xf.setAccessTime(new ZipLong(2000L));
        Date d = xf.getAccessJavaTime();
        assertNotNull(d);
        assertEquals(2000000L, d.getTime());
    }

    @Test
    public void testGetCreateJavaTime_nullTime_returnsNull() {
        assertNull(xf.getCreateJavaTime());
    }

    @Test
    public void testGetCreateJavaTime_validTime_returnsCorrectDate() {
        xf.setCreateTime(new ZipLong(3000L));
        Date d = xf.getCreateJavaTime();
        assertNotNull(d);
        assertEquals(3000000L, d.getTime());
    }

    // ---------- setModifyTime/setAccessTime/setCreateTime ----------
    @Test
    public void testSetModifyTime_nonNull_setsBitAndFlag() {
        xf.setModifyTime(new ZipLong(500L));
        assertTrue(xf.isBit0_modifyTimePresent());
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, xf.getFlags());
        assertEquals(500L, xf.getModifyTime().getValue());
    }

    @Test
    public void testSetModifyTime_null_clearsBitAndFlag() {
        xf.setModifyTime(new ZipLong(500L));
        xf.setModifyTime(null);
        assertFalse(xf.isBit0_modifyTimePresent());
        assertEquals(0, xf.getFlags());
        assertNull(xf.getModifyTime());
    }

    @Test
    public void testSetAccessTime_nonNull_setsBitAndFlag() {
        xf.setAccessTime(new ZipLong(600L));
        assertTrue(xf.isBit1_accessTimePresent());
        assertEquals(X5455_ExtendedTimestamp.ACCESS_TIME_BIT, xf.getFlags());
        assertEquals(600L, xf.getAccessTime().getValue());
    }

    @Test
    public void testSetAccessTime_null_clearsBitAndFlag() {
        xf.setAccessTime(new ZipLong(600L));
        xf.setAccessTime(null);
        assertFalse(xf.isBit1_accessTimePresent());
        assertEquals(0, xf.getFlags());
        assertNull(xf.getAccessTime());
    }

    @Test
    public void testSetCreateTime_nonNull_setsBitAndFlag() {
        xf.setCreateTime(new ZipLong(700L));
        assertTrue(xf.isBit2_createTimePresent());
        assertEquals(X5455_ExtendedTimestamp.CREATE_TIME_BIT, xf.getFlags());
        assertEquals(700L, xf.getCreateTime().getValue());
    }

    @Test
    public void testSetCreateTime_null_clearsBitAndFlag() {
        xf.setCreateTime(new ZipLong(700L));
        xf.setCreateTime(null);
        assertFalse(xf.isBit2_createTimePresent());
        assertEquals(0, xf.getFlags());
        assertNull(xf.getCreateTime());
    }

    // ---------- setModifyJavaTime/setAccessJavaTime/setCreateJavaTime ----------
    @Test
    public void testSetModifyJavaTime_validDate_setsCorrectTime() {
        Date d = new Date(1000000L);
        xf.setModifyJavaTime(d);
        assertTrue(xf.isBit0_modifyTimePresent());
        assertEquals(1000L, xf.getModifyTime().getValue());
    }

    @Test
    public void testSetModifyJavaTime_null_clearsTime() {
        xf.setModifyJavaTime(new Date(1000000L));
        xf.setModifyJavaTime(null);
        assertFalse(xf.isBit0_modifyTimePresent());
        assertNull(xf.getModifyTime());
    }

    @Test
    public void testSetAccessJavaTime_validDate_setsCorrectTime() {
        Date d = new Date(2000000L);
        xf.setAccessJavaTime(d);
        assertTrue(xf.isBit1_accessTimePresent());
        assertEquals(2000L, xf.getAccessTime().getValue());
    }

    @Test
    public void testSetAccessJavaTime_null_clearsTime() {
        xf.setAccessJavaTime(new Date(2000000L));
        xf.setAccessJavaTime(null);
        assertFalse(xf.isBit1_accessTimePresent());
        assertNull(xf.getAccessTime());
    }

    @Test
    public void testSetCreateJavaTime_validDate_setsCorrectTime() {
        Date d = new Date(3000000L);
        xf.setCreateJavaTime(d);
        assertTrue(xf.isBit2_createTimePresent());
        assertEquals(3000L, xf.getCreateTime().getValue());
    }

    @Test
    public void testSetCreateJavaTime_null_clearsTime() {
        xf.setCreateJavaTime(new Date(3000000L));
        xf.setCreateJavaTime(null);
        assertFalse(xf.isBit2_createTimePresent());
        assertNull(xf.getCreateTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetModifyJavaTime_dateTooLarge_throwsIllegalArgumentException() {
        // 2^32 seconds since epoch in milliseconds
        long tooLargeMillis = 0x100000000L * 1000L;
        Date d = new Date(tooLargeMillis);
        xf.setModifyJavaTime(d);
    }

    // ---------- toString ----------
    @Test
    public void testToString_noTimes_containsFlagsOnly() {
        String s = xf.toString();
        assertTrue(s.contains("0x5455 Zip Extra Field: Flags="));
        assertFalse(s.contains("Modify:"));
        assertFalse(s.contains("Access:"));
        assertFalse(s.contains("Create:"));
    }

    @Test
    public void testToString_allTimesSet_containsAllLabels() {
        xf.setModifyTime(new ZipLong(1000L));
        xf.setAccessTime(new ZipLong(2000L));
        xf.setCreateTime(new ZipLong(3000L));
        String s = xf.toString();
        assertTrue(s.contains("Modify:"));
        assertTrue(s.contains("Access:"));
        assertTrue(s.contains("Create:"));
    }

    // ---------- clone ----------
    @Test
    public void testClone_producesEqualButDistinctObject() throws CloneNotSupportedException {
        xf.setModifyTime(new ZipLong(1000L));
        xf.setAccessTime(new ZipLong(2000L));
        xf.setCreateTime(new ZipLong(3000L));

        Object cloned = xf.clone();
        assertNotSame(xf, cloned);
        assertTrue(cloned instanceof X5455_ExtendedTimestamp);
        assertEquals(xf, cloned);
    }

    // ---------- equals ----------
    @Test
    public void testEquals_sameObject_returnsTrue() {
        assertTrue(xf.equals(xf));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(xf.equals("some string"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(xf.equals(null));
    }

    @Test
    public void testEquals_equalObjects_returnsTrue() {
        xf.setModifyTime(new ZipLong(1000L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setModifyTime(new ZipLong(1000L));
        assertTrue(xf.equals(other));
        assertTrue(other.equals(xf));
    }

    @Test
    public void testEquals_differentModifyTime_returnsFalse() {
        xf.setModifyTime(new ZipLong(1000L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setModifyTime(new ZipLong(2000L));
        assertFalse(xf.equals(other));
    }

    @Test
    public void testEquals_differentAccessTime_returnsFalse() {
        xf.setAccessTime(new ZipLong(1000L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setAccessTime(new ZipLong(2000L));
        assertFalse(xf.equals(other));
    }

    @Test
    public void testEquals_differentCreateTime_returnsFalse() {
        xf.setCreateTime(new ZipLong(1000L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setCreateTime(new ZipLong(2000L));
        assertFalse(xf.equals(other));
    }

    @Test
    public void testEquals_differentFlags_returnsFalse() {
        xf.setFlags((byte) X5455_ExtendedTimestamp.MODIFY_TIME_BIT);
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setFlags((byte) X5455_ExtendedTimestamp.ACCESS_TIME_BIT);
        assertFalse(xf.equals(other));
    }

    @Test
    public void testEquals_bothDefaultNoTimes_returnsTrue() {
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        assertTrue(xf.equals(other));
    }

    @Test
    public void testEquals_oneNullOneNonNullModifyTime_returnsFalse() {
        xf.setModifyTime(new ZipLong(1000L));
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        assertFalse(xf.equals(other));
        assertFalse(other.equals(xf));
    }

    // ---------- hashCode ----------
    @Test
    public void testHashCode_defaultObject_isConsistent() {
        int hash1 = xf.hashCode();
        int hash2 = xf.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_equalObjects_haveSameHashCode() {
        xf.setModifyTime(new ZipLong(1000L));
        xf.setAccessTime(new ZipLong(2000L));
        xf.setCreateTime(new ZipLong(3000L));

        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        other.setModifyTime(new ZipLong(1000L));
        other.setAccessTime(new ZipLong(2000L));
        other.setCreateTime(new ZipLong(3000L));

        assertEquals(xf.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_withOnlyModifyTime_differsFromDefault() {
        int defaultHash = xf.hashCode();
        xf.setModifyTime(new ZipLong(1000L));
        int modifiedHash = xf.hashCode();
        assertNotEquals(defaultHash, modifiedHash);
    }

    @Test
    public void testHashCode_withAccessTimeOnly_computesCorrectly() {
        xf.setAccessTime(new ZipLong(500L));
        int hash = xf.hashCode();
        // Just verify it doesn't throw and produces a deterministic value
        assertEquals(hash, xf.hashCode());
    }

    @Test
    public void testHashCode_withCreateTimeOnly_computesCorrectly() {
        xf.setCreateTime(new ZipLong(700L));
        int hash = xf.hashCode();
        assertEquals(hash, xf.hashCode());
    }
}
