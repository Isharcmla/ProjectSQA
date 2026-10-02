import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ArchiveUtilsTest {

    // Simple test implementation of ArchiveEntry interface
    private static class TestArchiveEntry implements ArchiveEntry {
        private final String name;
        private final long size;
        private final boolean directory;

        TestArchiveEntry(String name, long size, boolean directory) {
            this.name = name;
            this.size = size;
            this.directory = directory;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public long getSize() {
            return size;
        }

        @Override
        public boolean isDirectory() {
            return directory;
        }

        @Override
        public Date getLastModifiedDate() {
            return new Date();
        }
    }

    // ---------- toString(ArchiveEntry) ----------

    @Test
    public void testToString_fileEntry_returnsExpectedFormat() {
        ArchiveEntry entry = new TestArchiveEntry("main.c", 2000, false);
        String result = ArchiveUtils.toString(entry);
        assertEquals("-    2000 main.c", result);
    }

    @Test
    public void testToString_directoryEntry_returnsExpectedFormat() {
        ArchiveEntry entry = new TestArchiveEntry("testfiles", 100, true);
        String result = ArchiveUtils.toString(entry);
        assertEquals("d     100 testfiles", result);
    }

    @Test
    public void testToString_zeroSizeEntry_returnsExpectedFormat() {
        ArchiveEntry entry = new TestArchiveEntry("empty.txt", 0, false);
        String result = ArchiveUtils.toString(entry);
        assertEquals("-       0 empty.txt", result);
    }

    @Test
    public void testToString_largeSizeEntry_returnsExpectedFormat() {
        // size length > 7 characters, no padding spaces should be added
        ArchiveEntry entry = new TestArchiveEntry("bigfile.bin", 123456789L, false);
        String result = ArchiveUtils.toString(entry);
        assertEquals("- 123456789 bigfile.bin", result);
    }

    @Test
    public void testToString_emptyName_returnsExpectedFormat() {
        ArchiveEntry entry = new TestArchiveEntry("", 5, false);
        String result = ArchiveUtils.toString(entry);
        assertEquals("-       5 ", result);
    }

    // ---------- matchAsciiBuffer(String, byte[], int, int) ----------

    @Test
    public void testMatchAsciiBuffer_withOffsetLength_matches_returnsTrue() {
        byte[] buffer = "XXhelloYY".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer("hello", buffer, 2, 5);
        assertTrue(result);
    }

    @Test
    public void testMatchAsciiBuffer_withOffsetLength_notMatches_returnsFalse() {
        byte[] buffer = "XXhelloYY".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer("world", buffer, 2, 5);
        assertFalse(result);
    }

    @Test
    public void testMatchAsciiBuffer_withOffsetLength_emptyExpected_returnsTrue() {
        byte[] buffer = "abc".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer("", buffer, 0, 0);
        assertTrue(result);
    }

    // ---------- matchAsciiBuffer(String, byte[]) ----------

    @Test
    public void testMatchAsciiBuffer_wholeBuffer_matches_returnsTrue() {
        byte[] buffer = "hello".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer("hello", buffer);
        assertTrue(result);
    }

    @Test
    public void testMatchAsciiBuffer_wholeBuffer_notMatches_returnsFalse() {
        byte[] buffer = "hello".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer("world", buffer);
        assertFalse(result);
    }

    @Test
    public void testMatchAsciiBuffer_wholeBuffer_emptyBoth_returnsTrue() {
        byte[] buffer = new byte[0];
        boolean result = ArchiveUtils.matchAsciiBuffer("", buffer);
        assertTrue(result);
    }

    // ---------- toAsciiBytes ----------

    @Test
    public void testToAsciiBytes_normalString_returnsCorrectBytes() {
        byte[] result = ArchiveUtils.toAsciiBytes("ABC");
        assertArrayEquals(new byte[]{65, 66, 67}, result);
    }

    @Test
    public void testToAsciiBytes_emptyString_returnsEmptyArray() {
        byte[] result = ArchiveUtils.toAsciiBytes("");
        assertEquals(0, result.length);
    }

    // ---------- toAsciiString(byte[]) ----------

    @Test
    public void testToAsciiString_normalBytes_returnsCorrectString() {
        byte[] input = {65, 66, 67};
        String result = ArchiveUtils.toAsciiString(input);
        assertEquals("ABC", result);
    }

    @Test
    public void testToAsciiString_emptyBytes_returnsEmptyString() {
        byte[] input = new byte[0];
        String result = ArchiveUtils.toAsciiString(input);
        assertEquals("", result);
    }

    // ---------- toAsciiString(byte[], int, int) ----------

    @Test
    public void testToAsciiString_withOffsetLength_returnsCorrectSubstring() {
        byte[] input = "XXhelloYY".getBytes();
        String result = ArchiveUtils.toAsciiString(input, 2, 5);
        assertEquals("hello", result);
    }

    @Test
    public void testToAsciiString_withZeroLength_returnsEmptyString() {
        byte[] input = "hello".getBytes();
        String result = ArchiveUtils.toAsciiString(input, 0, 0);
        assertEquals("", result);
    }

    // ---------- isEqual (7-arg, full version) ----------

    @Test
    public void testIsEqual_sameLengthSameContent_returnsTrue() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 3, false));
    }

    @Test
    public void testIsEqual_sameLengthDifferentContent_returnsFalse() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 4};
        assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 3, false));
    }

    @Test
    public void testIsEqual_differentLengthNoIgnoreNulls_returnsFalse() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 0};
        assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 4, false));
    }

    @Test
    public void testIsEqual_length1GreaterIgnoreNulls_trailingZeros_returnsTrue() {
        byte[] b1 = {1, 2, 3, 0, 0};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, 0, 5, b2, 0, 3, true));
    }

    @Test
    public void testIsEqual_length1GreaterIgnoreNulls_trailingNonZero_returnsFalse() {
        byte[] b1 = {1, 2, 3, 5, 0};
        byte[] b2 = {1, 2, 3};
        assertFalse(ArchiveUtils.isEqual(b1, 0, 5, b2, 0, 3, true));
    }

    @Test
    public void testIsEqual_length2GreaterIgnoreNulls_trailingZeros_returnsTrue() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 0, 0};
        assertTrue(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 5, true));
    }

    @Test
    public void testIsEqual_length2GreaterIgnoreNulls_trailingNonZero_returnsFalse() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 9, 0};
        assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 5, true));
    }

    @Test
    public void testIsEqual_withOffsets_matches_returnsTrue() {
        byte[] b1 = {9, 1, 2, 3, 9};
        byte[] b2 = {8, 8, 1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, 1, 3, b2, 2, 3, false));
    }

    // ---------- isEqual (6-arg overload) ----------

    @Test
    public void testIsEqual_sixArgOverload_matches_returnsTrue() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 3));
    }

    @Test
    public void testIsEqual_sixArgOverload_notMatches_returnsFalse() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 4};
        assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 3));
    }

    // ---------- isEqual(byte[], byte[]) ----------

    @Test
    public void testIsEqual_twoArgOverload_matches_returnsTrue() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, b2));
    }

    @Test
    public void testIsEqual_twoArgOverload_notMatches_returnsFalse() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 4};
        assertFalse(ArchiveUtils.isEqual(b1, b2));
    }

    @Test
    public void testIsEqual_twoArgOverload_differentLength_returnsFalse() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2};
        assertFalse(ArchiveUtils.isEqual(b1, b2));
    }

    @Test
    public void testIsEqual_twoArgOverload_emptyArrays_returnsTrue() {
        byte[] b1 = new byte[0];
        byte[] b2 = new byte[0];
        assertTrue(ArchiveUtils.isEqual(b1, b2));
    }

    // ---------- isEqual(byte[], byte[], boolean) ----------

    @Test
    public void testIsEqual_threeArgOverload_ignoreNullsTrue_matches_returnsTrue() {
        byte[] b1 = {1, 2, 3, 0};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, b2, true));
    }

    @Test
    public void testIsEqual_threeArgOverload_ignoreNullsFalse_notMatches_returnsFalse() {
        byte[] b1 = {1, 2, 3, 0};
        byte[] b2 = {1, 2, 3};
        assertFalse(ArchiveUtils.isEqual(b1, b2, false));
    }

    // ---------- isEqualWithNull ----------

    @Test
    public void testIsEqualWithNull_trailingZeros_returnsTrue() {
        byte[] b1 = {1, 2, 3, 0, 0};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqualWithNull(b1, 0, 5, b2, 0, 3));
    }

    @Test
    public void testIsEqualWithNull_trailingNonZero_returnsFalse() {
        byte[] b1 = {1, 2, 3, 5};
        byte[] b2 = {1, 2, 3};
        assertFalse(ArchiveUtils.isEqualWithNull(b1, 0, 4, b2, 0, 3));
    }

    @Test
    public void testIsEqualWithNull_sameLengthSameContent_returnsTrue() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqualWithNull(b1, 0, 3, b2, 0, 3));
    }

    // ---------- isArrayZero ----------

    @Test
    public void testIsArrayZero_allZeros_returnsTrue() {
        byte[] a = {0, 0, 0, 0};
        assertTrue(ArchiveUtils.isArrayZero(a, 4));
    }

    @Test
    public void testIsArrayZero_containsNonZero_returnsFalse() {
        byte[] a = {0, 0, 1, 0};
        assertFalse(ArchiveUtils.isArrayZero(a, 4));
    }

    @Test
    public void testIsArrayZero_sizeZero_returnsTrue() {
        byte[] a = {1, 2, 3};
        assertTrue(ArchiveUtils.isArrayZero(a, 0));
    }

    @Test
    public void testIsArrayZero_partialCheck_ignoresNonZeroBeyondSize_returnsTrue() {
        byte[] a = {0, 0, 5, 5};
        assertTrue(ArchiveUtils.isArrayZero(a, 2));
    }

    // ---------- sanitize ----------

    @Test
    public void testSanitize_normalString_returnsSameString() {
        String result = ArchiveUtils.sanitize("Hello World");
        assertEquals("Hello World", result);
    }

    @Test
    public void testSanitize_emptyString_returnsEmptyString() {
        String result = ArchiveUtils.sanitize("");
        assertEquals("", result);
    }

    @Test
    public void testSanitize_controlCharacters_replacedWithQuestionMark() {
        String input = "Hello\u0001World";
        String result = ArchiveUtils.sanitize(input);
        assertEquals("Hello?World", result);
    }

    @Test
    public void testSanitize_newlineCharacter_replacedWithQuestionMark() {
        String input = "Hello\nWorld";
        String result = ArchiveUtils.sanitize(input);
        assertEquals("Hello?World", result);
    }

    @Test
    public void testSanitize_mixedNormalAndControlChars_returnsSanitizedString() {
        String input = "A\u0000B\u0002C";
        String result = ArchiveUtils.sanitize(input);
        assertEquals("A?B?C", result);
    }
}
