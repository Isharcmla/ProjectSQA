import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.zip.ZipException;

public class X7875_NewUnixTest {

    private X7875_NewUnix field;

    @Before
    public void setUp() {
        field = new X7875_NewUnix();
    }

    @Test
    public void testConstructor_defaultValues_uidGidAreOneThousand() {
        assertEquals(1000L, field.getUID());
        assertEquals(1000L, field.getGID());
    }

    @Test
    public void testGetHeaderId_returnsCorrectHeaderId() {
        ZipShort headerId = field.getHeaderId();
        assertNotNull(headerId);
        assertEquals(0x7875, headerId.getValue());
    }

    @Test
    public void testSetAndGetUID_normalValue_returnsSameValue() {
        field.setUID(12345L);
        assertEquals(12345L, field.getUID());
    }

    @Test
    public void testSetAndGetGID_normalValue_returnsSameValue() {
        field.setGID(6789L);
        assertEquals(6789L, field.getGID());
    }

    @Test
    public void testSetUID_zeroValue_returnsZero() {
        field.setUID(0L);
        assertEquals(0L, field.getUID());
    }

    @Test
    public void testSetGID_zeroValue_returnsZero() {
        field.setGID(0L);
        assertEquals(0L, field.getGID());
    }

    @Test
    public void testSetUID_largeValue_returnsSameLargeValue() {
        long largeUid = 4294967295L; // max unsigned 32 bit
        field.setUID(largeUid);
        assertEquals(largeUid, field.getUID());
    }

    @Test
    public void testSetGID_largeValue_returnsSameLargeValue() {
        long largeGid = 4294967295L; // max unsigned 32 bit
        field.setGID(largeGid);
        assertEquals(largeGid, field.getGID());
    }

    @Test
    public void testGetLocalFileDataLength_defaultValues_returnsExpectedLength() {
        // uid=1000, gid=1000 -> byte arrays likely 2 bytes each (0x03E8)
        ZipShort length = field.getLocalFileDataLength();
        assertNotNull(length);
        assertTrue(length.getValue() >= 3);
    }

    @Test
    public void testGetCentralDirectoryLength_sameAsLocalFileDataLength() {
        assertEquals(field.getLocalFileDataLength().getValue(), field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetLocalFileDataData_defaultValues_returnsCorrectByteArray() {
        byte[] data = field.getLocalFileDataData();
        assertNotNull(data);
        // version=1, uidSize, uid bytes, gidSize, gid bytes
        assertEquals(1, data[0]); // version
    }

    @Test
    public void testGetLocalFileDataData_zeroUidGid_returnsMinLengthArrays() {
        field.setUID(0L);
        field.setGID(0L);
        byte[] data = field.getLocalFileDataData();
        // version(1) + uidSize(1) + uidBytes(1) + gidSize(1) + gidBytes(1) = 5
        assertEquals(5, data.length);
        assertEquals(1, data[0]); // version
        assertEquals(1, data[1]); // uid size
        assertEquals(0, data[2]); // uid byte
        assertEquals(1, data[3]); // gid size
        assertEquals(0, data[4]); // gid byte
    }

    @Test
    public void testGetCentralDirectoryData_returnsEmptyArray() {
        byte[] data = field.getCentralDirectoryData();
        assertNotNull(data);
        assertEquals(0, data.length);
    }

    @Test
    public void testParseFromLocalFileData_validData_setsUidGidCorrectly() throws ZipException {
        // version=1, uidSize=2, uid=1000 (little endian: 0xE8, 0x03), gidSize=2, gid=2000 (0xD0, 0x07)
        byte[] data = new byte[] {
                1, // version
                2, // uid size
                (byte) 0xE8, 0x03, // uid = 1000
                2, // gid size
                (byte) 0xD0, 0x07 // gid = 2000
        };
        field.parseFromLocalFileData(data, 0, data.length);
        assertEquals(1000L, field.getUID());
        assertEquals(2000L, field.getGID());
    }

    @Test
    public void testParseFromLocalFileData_withOffset_setsUidGidCorrectly() throws ZipException {
        byte[] data = new byte[] {
                0, 0, // padding to test offset
                1, // version
                1, // uid size
                5, // uid=5
                1, // gid size
                10 // gid=10
        };
        field.parseFromLocalFileData(data, 2, data.length - 2);
        assertEquals(5L, field.getUID());
        assertEquals(10L, field.getGID());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseFromLocalFileData_insufficientData_throwsException() throws ZipException {
        byte[] data = new byte[] {1, 2}; // not enough bytes for uid/gid
        field.parseFromLocalFileData(data, 0, data.length);
    }

    @Test
    public void testParseFromCentralDirectoryData_doesNothing() throws ZipException {
        byte[] data = new byte[] {1, 2, 3};
        // Should not throw and should not modify state
        field.setUID(999L);
        field.setGID(888L);
        field.parseFromCentralDirectoryData(data, 0, data.length);
        assertEquals(999L, field.getUID());
        assertEquals(888L, field.getGID());
    }

    @Test
    public void testToString_returnsExpectedFormat() {
        field.setUID(100L);
        field.setGID(200L);
        String str = field.toString();
        assertTrue(str.contains("UID=100"));
        assertTrue(str.contains("GID=200"));
        assertTrue(str.startsWith("0x7875 Zip Extra Field:"));
    }

    @Test
    public void testClone_returnsEqualButDistinctObject() throws CloneNotSupportedException {
        field.setUID(555L);
        field.setGID(666L);
        Object cloned = field.clone();
        assertNotSame(field, cloned);
        assertEquals(field, cloned);
    }

    @Test
    public void testEquals_sameValues_returnsTrue() {
        X7875_NewUnix other = new X7875_NewUnix();
        assertEquals(field, other);
    }

    @Test
    public void testEquals_differentUid_returnsFalse() {
        X7875_NewUnix other = new X7875_NewUnix();
        other.setUID(9999L);
        assertNotEquals(field, other);
    }

    @Test
    public void testEquals_differentGid_returnsFalse() {
        X7875_NewUnix other = new X7875_NewUnix();
        other.setGID(9999L);
        assertNotEquals(field, other);
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        assertFalse(field.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(field.equals("someString"));
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(field.equals(field));
    }

    @Test
    public void testHashCode_sameValues_sameHashCode() {
        X7875_NewUnix other = new X7875_NewUnix();
        assertEquals(field.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_differentValues_differentHashCode() {
        X7875_NewUnix other = new X7875_NewUnix();
        other.setUID(123456789L);
        other.setGID(987654321L);
        assertNotEquals(field.hashCode(), other.hashCode());
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_nullInput_returnsNull() {
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(null);
        assertNull(result);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_allZeroes_returnsMinLengthArray() {
        byte[] input = new byte[] {0, 0, 0};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_leadingZeroes_trimsCorrectly() {
        byte[] input = new byte[] {0, 0, 5, 10};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(2, result.length);
        assertEquals(5, result[0]);
        assertEquals(10, result[1]);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_noLeadingZeroes_returnsSameLength() {
        byte[] input = new byte[] {5, 10, 15};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(3, result.length);
        assertEquals(5, result[0]);
        assertEquals(10, result[1]);
        assertEquals(15, result[2]);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_emptyArray_returnsMinLengthArray() {
        byte[] input = new byte[0];
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength_singleZeroByte_returnsMinLengthArray() {
        byte[] input = new byte[] {0};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

    @Test
    public void testGetLocalFileDataData_thenParseBack_roundTripConsistent() throws ZipException {
        field.setUID(123456L);
        field.setGID(654321L);
        byte[] data = field.getLocalFileDataData();

        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(data, 0, data.length);

        assertEquals(field.getUID(), parsed.getUID());
        assertEquals(field.getGID(), parsed.getGID());
    }
}
