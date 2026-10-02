package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.zip.ZipException;

public class X5455_ExtendedTimestampTest {

    @Test
    public void testGetHeaderId_returnsExpectedHeaderId() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        Assert.assertEquals(new ZipShort(0x5455), xf.getHeaderId());
    }

    @Test
    public void testDefaults_onInstantiation() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        Assert.assertEquals(0, xf.getFlags());
        Assert.assertFalse(xf.isBit0_modifyTimePresent());
        Assert.assertFalse(xf.isBit1_accessTimePresent());
        Assert.assertFalse(xf.isBit2_createTimePresent());
        Assert.assertNull(xf.getModifyTime());
        Assert.assertNull(xf.getAccessTime());
        Assert.assertNull(xf.getCreateTime());
        Assert.assertNull(xf.getModifyJavaTime());
        Assert.assertNull(xf.getAccessJavaTime());
        Assert.assertNull(xf.getCreateJavaTime());
        Assert.assertEquals(1, xf.getLocalFileDataLength().getValue());
        Assert.assertEquals(1, xf.getCentralDirectoryLength().getValue());
        Assert.assertArrayEquals(new byte[]{0}, xf.getLocalFileDataData());
        Assert.assertArrayEquals(new byte[]{0}, xf.getCentralDirectoryData());
    }

    @Test
    public void testSetFlags_setsBitsCorrectly() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.setFlags((byte) 7);
        Assert.assertEquals(7, xf.getFlags());
        Assert.assertTrue(xf.isBit0_modifyTimePresent());
        Assert.assertTrue(xf.isBit1_accessTimePresent());
        Assert.assertTrue(xf.isBit2_createTimePresent());

        xf.setFlags((byte) 0);
        Assert.assertEquals(0, xf.getFlags());
        Assert.assertFalse(xf.isBit0_modifyTimePresent());
        Assert.assertFalse(xf.isBit1_accessTimePresent());
        Assert.assertFalse(xf.isBit2_createTimePresent());

        xf.setFlags((byte) 1);
        Assert.assertTrue(xf.isBit0_modifyTimePresent());
        Assert.assertFalse(xf.isBit1_accessTimePresent());
        Assert.assertFalse(xf.isBit2_createTimePresent());

        xf.setFlags((byte) 2);
        Assert.assertFalse(xf.isBit0_modifyTimePresent());
        Assert.assertTrue(xf.isBit1_accessTimePresent());
        Assert.assertFalse(xf.isBit2_createTimePresent());

        xf.setFlags((byte) 4);
        Assert.assertFalse(xf.isBit0_modifyTimePresent());
        Assert.assertFalse(xf.isBit1_accessTimePresent());
        Assert.assertTrue(xf.isBit2_createTimePresent());
    }

    @Test
    public void testSetAndGetModifyTime_withZipLong() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        final ZipLong time = new ZipLong(1000);
        xf.setModifyTime(time);
        Assert.assertEquals(time, xf.getModifyTime());
        Assert.assertTrue(xf.isBit0_modifyTimePresent());
        Assert.assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, xf.getFlags() & X5455_ExtendedTimestamp.MODIFY_TIME_BIT);

        xf.setModifyTime(null);
        Assert.assertNull(xf.getModifyTime());
        Assert.assertFalse(xf.isBit0_modifyTimePresent());
        Assert.assertEquals(0, xf.getFlags() & X5455_ExtendedTimestamp.MODIFY_TIME_BIT);
    }

    @Test
    public void testSetAndGetAccessTime_withZipLong() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        final ZipLong time = new ZipLong(2000);
        xf.setAccessTime(time);
        Assert.assertEquals(time, xf.getAccessTime());
        Assert.assertTrue(xf.isBit1_accessTimePresent());
        Assert.assertEquals(X5455_ExtendedTimestamp.ACCESS_TIME_BIT, xf.getFlags() & X5455_ExtendedTimestamp.ACCESS_TIME_BIT);

        xf.setAccessTime(null);
        Assert.assertNull(xf.getAccessTime());
        Assert.assertFalse(xf.isBit1_accessTimePresent());
        Assert.assertEquals(0, xf.getFlags() & X5455_ExtendedTimestamp.ACCESS_TIME_BIT);
    }

    @Test
    public void testSetAndGetCreateTime_withZipLong() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        final ZipLong time = new ZipLong(3000);
        xf.setCreateTime(time);
        Assert.assertEquals(time, xf.getCreateTime());
        Assert.assertTrue(xf.isBit2_createTimePresent());
        Assert.assertEquals(X5455_ExtendedTimestamp.CREATE_TIME_BIT, xf.getFlags() & X5455_ExtendedTimestamp.CREATE_TIME_BIT);

        xf.setCreateTime(null);
        Assert.assertNull(xf.getCreateTime());
        Assert.assertFalse(xf.isBit2_createTimePresent());
        Assert.assertEquals(0, xf.getFlags() & X5455_ExtendedTimestamp.CREATE_TIME_BIT);
    }

    @Test
    public void testSetAndGetJavaTime_withDate() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        final Date date = new Date(123456789000L);

        xf.setModifyJavaTime(date);
        xf.setAccessJavaTime(date);
        xf.setCreateJavaTime(date);

        Assert.assertEquals(date, xf.getModifyJavaTime());
        Assert.assertEquals(date, xf.getAccessJavaTime());
        Assert.assertEquals(date, xf.getCreateJavaTime());
        Assert.assertEquals(new ZipLong(123456789L), xf.getModifyTime());
        Assert.assertEquals(new ZipLong(123456789L), xf.getAccessTime());
        Assert.assertEquals(new ZipLong(123456789L), xf.getCreateTime());

        xf.setModifyJavaTime(null);
        xf.setAccessJavaTime(null);
        xf.setCreateJavaTime(null);

        Assert.assertNull(xf.getModifyJavaTime());
        Assert.assertNull(xf.getAccessJavaTime());
        Assert.assertNull(xf.getCreateJavaTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetModifyJavaTime_overflowThrowsException() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        final Date overflowDate = new Date((0x100000000L + 1) * 1000L);
        xf.setModifyJavaTime(overflowDate);
    }

    @Test
    public void testGetLocalFileDataData_allFieldsPresent() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.setModifyTime(new ZipLong(1));
        xf.setAccessTime(new ZipLong(2));
        xf.setCreateTime(new ZipLong(3));

        Assert.assertEquals(13, xf.getLocalFileDataLength().getValue());
        Assert.assertEquals(5, xf.getCentralDirectoryLength().getValue());

        final byte[] local = xf.getLocalFileDataData();
        final byte[] expectedLocal = new byte[]{
                7,
                1, 0, 0, 0,
                2, 0, 0, 0,
                3, 0, 0, 0
        };
        Assert.assertArrayEquals(expectedLocal, local);

        final byte[] central = xf.getCentralDirectoryData();
        final byte[] expectedCentral = new byte[]{
                7,
                1, 0, 0, 0
        };
        Assert.assertArrayEquals(expectedCentral, central);
    }

    @Test
    public void testGetLocalFileDataData_partialFields() {
        final X5455_ExtendedTimestamp xf1 = new X5455_ExtendedTimestamp();
        xf1.setAccessTime(new ZipLong(2));
        Assert.assertEquals(5, xf1.getLocalFileDataLength().getValue());
        Assert.assertEquals(1, xf1.getCentralDirectoryLength().getValue());
        Assert.assertArrayEquals(new byte[]{2, 2, 0, 0, 0}, xf1.getLocalFileDataData());

        final X5455_ExtendedTimestamp xf2 = new X5455_ExtendedTimestamp();
        xf2.setCreateTime(new ZipLong(3));
        Assert.assertEquals(5, xf2.getLocalFileDataLength().getValue());
        Assert.assertEquals(1, xf2.getCentralDirectoryLength().getValue());
        Assert.assertArrayEquals(new byte[]{4, 3, 0, 0, 0}, xf2.getLocalFileDataData());
    }

    @Test
    public void testGetLocalFileDataData_flagSetButObjectNull() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.setFlags((byte) 7);
        Assert.assertEquals(1, xf.getLocalFileDataLength().getValue());
        Assert.assertEquals(5, xf.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testParseFromLocalFileData_allFields() throws ZipException {
        final byte[] data = new byte[]{
                7,
                10, 0, 0, 0,
                20, 0, 0, 0,
                30, 0, 0, 0
        };

        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.parseFromLocalFileData(data, 0, data.length);

        Assert.assertEquals(7, xf.getFlags());
        Assert.assertEquals(new ZipLong(10), xf.getModifyTime());
        Assert.assertEquals(new ZipLong(20), xf.getAccessTime());
        Assert.assertEquals(new ZipLong(30), xf.getCreateTime());
    }

    @Test
    public void testParseFromLocalFileData_partialFieldsWithOffset() throws ZipException {
        final byte[] buffer = new byte[]{
                -1, -1,
                3,
                10, 0, 0, 0,
                20, 0, 0, 0,
                -1
        };

        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.parseFromLocalFileData(buffer, 2, 9);

        Assert.assertEquals(3, xf.getFlags());
        Assert.assertEquals(new ZipLong(10), xf.getModifyTime());
        Assert.assertEquals(new ZipLong(20), xf.getAccessTime());
        Assert.assertNull(xf.getCreateTime());
    }

    @Test
    public void testParseFromLocalFileData_centralDataTruncation() throws ZipException {
        final byte[] centralBuffer = new byte[]{
                7,
                10, 0, 0, 0
        };

        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.parseFromLocalFileData(centralBuffer, 0, centralBuffer.length);

        Assert.assertEquals(7, xf.getFlags());
        Assert.assertEquals(new ZipLong(10), xf.getModifyTime());
        Assert.assertNull(xf.getAccessTime());
        Assert.assertNull(xf.getCreateTime());
    }

    @Test
    public void testParseFromCentralDirectoryData() throws ZipException {
        final byte[] centralBuffer = new byte[]{
                1,
                15, 0, 0, 0
        };

        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.parseFromCentralDirectoryData(centralBuffer, 0, centralBuffer.length);

        Assert.assertEquals(1, xf.getFlags());
        Assert.assertEquals(new ZipLong(15), xf.getModifyTime());
        Assert.assertNull(xf.getAccessTime());
        Assert.assertNull(xf.getCreateTime());
    }

    @Test
    public void testParseResetsPreviousState() throws ZipException {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.setModifyTime(new ZipLong(1));
        xf.setAccessTime(new ZipLong(2));
        xf.setCreateTime(new ZipLong(3));

        final byte[] emptyFlagsData = new byte[]{0};
        xf.parseFromLocalFileData(emptyFlagsData, 0, 1);

        Assert.assertEquals(0, xf.getFlags());
        Assert.assertNull(xf.getModifyTime());
        Assert.assertNull(xf.getAccessTime());
        Assert.assertNull(xf.getCreateTime());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseFromLocalFileData_insufficientLengthThrowsException() throws ZipException {
        final byte[] data = new byte[]{1, 1, 0};
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.parseFromLocalFileData(data, 0, data.length);
    }

    @Test
    public void testToString() {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        String str = xf.toString();
        Assert.assertTrue(str.contains("0x5455 Zip Extra Field: Flags="));
        Assert.assertFalse(str.contains("Modify:["));
        Assert.assertFalse(str.contains("Access:["));
        Assert.assertFalse(str.contains("Create:["));

        xf.setModifyTime(new ZipLong(100));
        xf.setAccessTime(new ZipLong(200));
        xf.setCreateTime(new ZipLong(300));
        str = xf.toString();
        Assert.assertTrue(str.contains("Modify:["));
        Assert.assertTrue(str.contains("Access:["));
        Assert.assertTrue(str.contains("Create:["));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        final X5455_ExtendedTimestamp xf = new X5455_ExtendedTimestamp();
        xf.setModifyTime(new ZipLong(100));
        xf.setAccessTime(new ZipLong(200));
        xf.setCreateTime(new ZipLong(300));

        final X5455_ExtendedTimestamp clone = (X5455_ExtendedTimestamp) xf.clone();
        Assert.assertNotSame(xf, clone);
        Assert.assertEquals(xf, clone);
        Assert.assertEquals(xf.hashCode(), clone.hashCode());
        Assert.assertEquals(xf.getModifyTime(), clone.getModifyTime());
        Assert.assertEquals(xf.getAccessTime(), clone.getAccessTime());
        Assert.assertEquals(xf.getCreateTime(), clone.getCreateTime());
        Assert.assertEquals(xf.getFlags(), clone.getFlags());
    }

    @Test
    public void testEqualsAndHashCode() {
        final X5455_ExtendedTimestamp xf1 = new X5455_ExtendedTimestamp();
        final X5455_ExtendedTimestamp xf2 = new X5455_ExtendedTimestamp();

        Assert.assertEquals(xf1, xf1);
        Assert.assertEquals(xf1, xf2);
        Assert.assertEquals(xf1.hashCode(), xf2.hashCode());
        Assert.assertNotEquals(xf1, null);
        Assert.assertNotEquals(xf1, new Object());

        xf1.setModifyTime(new ZipLong(100));
        Assert.assertNotEquals(xf1, xf2);

        xf2.setModifyTime(new ZipLong(100));
        Assert.assertEquals(xf1, xf2);
        Assert.assertEquals(xf1.hashCode(), xf2.hashCode());

        xf1.setAccessTime(new ZipLong(200));
        Assert.assertNotEquals(xf1, xf2);
        xf2.setAccessTime(new ZipLong(200));
        Assert.assertEquals(xf1, xf2);
        Assert.assertEquals(xf1.hashCode(), xf2.hashCode());

        xf1.setCreateTime(new ZipLong(300));
        Assert.assertNotEquals(xf1, xf2);
        xf2.setCreateTime(new ZipLong(300));
        Assert.assertEquals(xf1, xf2);
        Assert.assertEquals(xf1.hashCode(), xf2.hashCode());

        xf2.setCreateTime(new ZipLong(999));
        Assert.assertNotEquals(xf1, xf2);

        final X5455_ExtendedTimestamp xf3 = new X5455_ExtendedTimestamp();
        final X5455_ExtendedTimestamp xf4 = new X5455_ExtendedTimestamp();
        xf3.setFlags((byte) 0x07);
        xf4.setFlags((byte) 0xF7);
        Assert.assertEquals(xf3, xf4);
        Assert.assertEquals(xf3.hashCode(), xf4.hashCode());
    }
}
