package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.zip.ZipException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class X7875_NewUnixTest {

    private X7875_NewUnix xf;

    @Before
    public void setUp() {
        xf = new X7875_NewUnix();
    }

    @Test
    public void testConstructor_defaultValues() {
        assertEquals(new ZipShort(0x7875), xf.getHeaderId());
        assertEquals(1000L, xf.getUID());
        assertEquals(1000L, xf.getGID());
    }

    @Test
    public void testGetHeaderId_returnsExpectedConstant() {
        ZipShort headerId = xf.getHeaderId();
        assertEquals(0x7875, headerId.getValue());
    }

    @Test
    public void testSetAndGetUID_normalAndEdgeValues() {
        xf.setUID(0L);
        assertEquals(0L, xf.getUID());

        xf.setUID(1234567L);
        assertEquals(1234567L, xf.getUID());

        xf.setUID(0xFFFFFFFFL); // 32-bit unsigned max
        assertEquals(0xFFFFFFFFL, xf.getUID());

        xf.setUID(-1L);
        assertEquals(-1L, xf.getUID());
    }

    @Test
    public void testSetAndGetGID_normalAndEdgeValues() {
        xf.setGID(0L);
        assertEquals(0L, xf.getGID());

        xf.setGID(7654321L);
        assertEquals(7654321L, xf.getGID());

        xf.setGID(0xFFFFFFFFL); // 32-bit unsigned max
        assertEquals(0xFFFFFFFFL, xf.getGID());

        xf.setGID(-1L);
        assertEquals(-1L, xf.getGID());
    }

    @Test
    public void testGetLocalFileDataLength_and_Data_defaults() {
        // UID=1000 (0x03E8 -> 2 bytes), GID=1000 (0x03E8 -> 2 bytes)
        // 3 header bytes (version + uidLen + gidLen) + 2 + 2 = 7 bytes
        assertEquals(new ZipShort(7), xf.getLocalFileDataLength());

        byte[] data = xf.getLocalFileDataData();
        assertEquals(7, data.length);
        assertEquals(1, data[0]); // version
        assertEquals(2, data[1]); // UID length
        assertEquals((byte) 0xE8, data[2]); // UID byte 0 (little endian)
        assertEquals((byte) 0x03, data[3]); // UID byte 1
        assertEquals(2, data[4]); // GID length
        assertEquals((byte) 0xE8, data[5]); // GID byte 0 (little endian)
        assertEquals((byte) 0x03, data[6]); // GID byte 1
    }

    @Test
    public void testGetLocalFileDataLength_and_Data_zeroValues() {
        xf.setUID(0L);
        xf.setGID(0L);

        // UID=0 (1 byte min), GID=0 (1 byte min)
        // 3 + 1 + 1 = 5 bytes
        assertEquals(new ZipShort(5), xf.getLocalFileDataLength());

        byte[] data = xf.getLocalFileDataData();
        assertEquals(5, data.length);
        assertEquals(1, data[0]); // version
        assertEquals(1, data[1]); // UID size
        assertEquals(0, data[2]); // UID value
        assertEquals(1, data[3]); // GID size
        assertEquals(0, data[4]); // GID value
    }

    @Test
    public void testGetCentralDirectoryLength_equalsLocalFileDataLength() {
        assertEquals(xf.getLocalFileDataLength(), xf.getCentralDirectoryLength());

        xf.setUID(0x12345678L);
        xf.setGID(0x98765432L);
        assertEquals(xf.getLocalFileDataLength(), xf.getCentralDirectoryLength());
    }

    @Test
    public void testGetCentralDirectoryData_returnsEmptyArray() {
        byte[] data = xf.getCentralDirectoryData();
        assertNotNull(data);
        assertEquals(0, data.length);
    }

    @Test
    public void testParseFromLocalFileData_roundTrip() throws ZipException {
        xf.setUID(12345678L);
        xf.setGID(87654321L);
        byte[] data = xf.getLocalFileDataData();

        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(data, 0, data.length);

        assertEquals(xf.getUID(), parsed.getUID());
        assertEquals(xf.getGID(), parsed.getGID());
        assertEquals(xf, parsed);
    }

    @Test
    public void testParseFromLocalFileData_withOffset() throws ZipException {
        xf.setUID(42L);
        xf.setGID(84L);
        byte[] raw = xf.getLocalFileDataData();

        byte[] buffer = new byte[raw.length + 10];
        int offset = 4;
        System.arraycopy(raw, 0, buffer, offset, raw.length);

        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(buffer, offset, raw.length);

        assertEquals(42L, parsed.getUID());
        assertEquals(84L, parsed.getGID());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseFromLocalFileData_truncatedData_throwsException() throws ZipException {
        byte[] truncated = new byte[]{1, 2, 0}; // missing UID bytes
        xf.parseFromLocalFileData(truncated, 0, truncated.length);
    }

    @Test
    public void testParseFromCentralDirectoryData_noOp() throws ZipException {
        xf.setUID(500L);
        xf.setGID(600L);

        byte[] dummy = new byte[]{1, 2, 3};
        xf.parseFromCentralDirectoryData(dummy, 0, dummy.length);

        // Values should remain intact
        assertEquals(500L, xf.getUID());
        assertEquals(600L, xf.getGID());
    }

    @Test
    public void testToString_containsUidAndGid() {
        xf.setUID(111L);
        xf.setGID(222L);
        String str = xf.toString();
        assertNotNull(str);
        assertTrue(str.contains("0x7875"));
        assertTrue(str.contains("UID=111"));
        assertTrue(str.contains("GID=222"));
    }

    @Test
    public void testClone_createsIndependentEqualCopy() throws CloneNotSupportedException {
        xf.setUID(5555L);
        xf.setGID(6666L);

        Object clonedObj = xf.clone();
        assertTrue(clonedObj instanceof X7875_NewUnix);

        X7875_NewUnix cloned = (X7875_NewUnix) clonedObj;
        assertEquals(xf, cloned);
        assertEquals(xf.hashCode(), cloned.hashCode());

        // Modifying original should not affect clone
        xf.setUID(9999L);
        assertNotEquals(xf.getUID(), cloned.getUID());
        assertNotEquals(xf, cloned);
    }

    @Test
    public void testEquals_and_HashCode() {
        X7875_NewUnix other = new X7875_NewUnix();

        // Reflexive
        assertTrue(xf.equals(xf));

        // Symmetric equal
        assertTrue(xf.equals(other));
        assertTrue(other.equals(xf));
        assertEquals(xf.hashCode(), other.hashCode());

        // Null check
        assertFalse(xf.equals(null));

        // Different type
        assertFalse(xf.equals("some string"));

        // Different UID
        other.setUID(2000L);
        assertFalse(xf.equals(other));
        assertFalse(other.equals(xf));

        // Reset and test different GID
        other.setUID(1000L);
        other.setGID(2000L);
        assertFalse(xf.equals(other));
        assertFalse(other.equals(xf));
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_nullInput() {
        assertNull(X7875_NewUnix.trimLeadingZeroesForceMinLength(null));
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_emptyArray() {
        byte[] input = new byte[0];
        byte[] expected = new byte[]{0};
        assertArrayEquals(expected, X7875_NewUnix.trimLeadingZeroesForceMinLength(input));
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_allZeroes() {
        byte[] input = new byte[]{0, 0, 0};
        byte[] expected = new byte[]{0};
        assertArrayEquals(expected, X7875_NewUnix.trimLeadingZeroesForceMinLength(input));
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_leadingZeroes() {
        byte[] input = new byte[]{0, 0, 1, 2, 3};
        byte[] expected = new byte[]{1, 2, 3};
        assertArrayEquals(expected, X7875_NewUnix.trimLeadingZeroesForceMinLength(input));
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_noLeadingZeroes() {
        byte[] input = new byte[]{1, 2, 3};
        byte[] expected = new byte[]{1, 2, 3};
        assertArrayEquals(expected, X7875_NewUnix.trimLeadingZeroesForceMinLength(input));
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_singleZero() {
        byte[] input = new byte[]{0};
        byte[] expected = new byte[]{0};
        assertArrayEquals(expected, X7875_NewUnix.trimLeadingZeroesForceMinLength(input));
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_singleNonZero() {
        byte[] input = new byte[]{5};
        byte[] expected = new byte[]{5};
        assertArrayEquals(expected, X7875_NewUnix.trimLeadingZeroesForceMinLength(input));
    }
}
