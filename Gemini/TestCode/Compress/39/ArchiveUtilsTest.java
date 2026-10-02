package org.apache.commons.compress.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.util.Date;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

public class ArchiveUtilsTest {

    private static class TestArchiveEntry implements ArchiveEntry {
        private final String name;
        private final long size;
        private final boolean isDirectory;

        TestArchiveEntry(String name, long size, boolean isDirectory) {
            this.name = name;
            this.size = size;
            this.isDirectory = isDirectory;
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
            return isDirectory;
        }

        @Override
        public Date getLastModifiedDate() {
            return new Date();
        }
    }

    @Test
    public void testConstructor_privateInstantiationViaReflection_success() throws Exception {
        Constructor<ArchiveUtils> constructor = ArchiveUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ArchiveUtils instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testToString_directoryShortSize_formattedCorrectly() {
        ArchiveEntry entry = new TestArchiveEntry("testfiles", 100L, true);
        assertEquals("d     100 testfiles", ArchiveUtils.toString(entry));
    }

    @Test
    public void testToString_fileMediumSize_formattedCorrectly() {
        ArchiveEntry entry = new TestArchiveEntry("main.c", 2000L, false);
        assertEquals("-    2000 main.c", ArchiveUtils.toString(entry));
    }

    @Test
    public void testToString_fileExactSevenDigitsSize_formattedCorrectly() {
        ArchiveEntry entry = new TestArchiveEntry("large.bin", 1234567L, false);
        assertEquals("- 1234567 large.bin", ArchiveUtils.toString(entry));
    }

    @Test
    public void testToString_fileLongerThanSevenDigitsSize_formattedCorrectly() {
        ArchiveEntry entry = new TestArchiveEntry("huge.bin", 12345678L, false);
        assertEquals("- 12345678 huge.bin", ArchiveUtils.toString(entry));
    }

    @Test
    public void testToAsciiBytes_normalAndEmptyString_convertedCorrectly() {
        byte[] expected = new byte[] { 'A', 'B', 'C' };
        byte[] actual = ArchiveUtils.toAsciiBytes("ABC");
        assertTrue(ArchiveUtils.isEqual(expected, actual));

        byte[] empty = ArchiveUtils.toAsciiBytes("");
        assertEquals(0, empty.length);
    }

    @Test
    public void testToAsciiString_fullByteArray_convertedCorrectly() {
        byte[] bytes = new byte[] { 'H', 'e', 'l', 'l', 'o' };
        assertEquals("Hello", ArchiveUtils.toAsciiString(bytes));

        assertEquals("", ArchiveUtils.toAsciiString(new byte[0]));
    }

    @Test
    public void testToAsciiString_subarrayWithOffsetAndLength_convertedCorrectly() {
        byte[] bytes = new byte[] { 'X', 'Y', 'Z', 'H', 'e', 'l', 'l', 'o', '1', '2' };
        assertEquals("Hello", ArchiveUtils.toAsciiString(bytes, 3, 5));
        assertEquals("", ArchiveUtils.toAsciiString(bytes, 0, 0));
    }

    @Test
    public void testMatchAsciiBuffer_fullBufferMatching_returnsTrue() {
        byte[] buffer = ArchiveUtils.toAsciiBytes("TEST");
        assertTrue(ArchiveUtils.matchAsciiBuffer("TEST", buffer));
    }

    @Test
    public void testMatchAsciiBuffer_fullBufferMismatch_returnsFalse() {
        byte[] buffer = ArchiveUtils.toAsciiBytes("TEST");
        assertFalse(ArchiveUtils.matchAsciiBuffer("FAIL", buffer));
        assertFalse(ArchiveUtils.matchAsciiBuffer("TESTING", buffer));
    }

    @Test
    public void testMatchAsciiBuffer_withOffsetAndLengthMatching_returnsTrue() {
        byte[] buffer = ArchiveUtils.toAsciiBytes("PREFIX_MATCH_SUFFIX");
        assertTrue(ArchiveUtils.matchAsciiBuffer("MATCH", buffer, 7, 5));
    }

    @Test
    public void testMatchAsciiBuffer_withOffsetAndLengthMismatch_returnsFalse() {
        byte[] buffer = ArchiveUtils.toAsciiBytes("PREFIX_MATCH_SUFFIX");
        assertFalse(ArchiveUtils.matchAsciiBuffer("WRONG", buffer, 7, 5));
    }

    @Test
    public void testIsEqual_twoBuffers_matchesAndMismatches() {
        byte[] b1 = new byte[] { 1, 2, 3 };
        byte[] b2 = new byte[] { 1, 2, 3 };
        byte[] b3 = new byte[] { 1, 2, 4 };
        byte[] b4 = new byte[] { 1, 2 };

        assertTrue(ArchiveUtils.isEqual(b1, b2));
        assertFalse(ArchiveUtils.isEqual(b1, b3));
        assertFalse(ArchiveUtils.isEqual(b1, b4));
    }

    @Test
    public void testIsEqual_subArraysWithoutIgnoreTrailingNulls() {
        byte[] b1 = new byte[] { 0, 1, 2, 3, 0 };
        byte[] b2 = new byte[] { 9, 1, 2, 3, 9 };
        byte[] b3 = new byte[] { 9, 1, 2, 4, 9 };

        assertTrue(ArchiveUtils.isEqual(b1, 1, 3, b2, 1, 3));
        assertFalse(ArchiveUtils.isEqual(b1, 1, 3, b3, 1, 3));
    }

    @Test
    public void testIsEqual_withIgnoreTrailingNullsTwoArrays() {
        byte[] b1 = new byte[] { 1, 2, 0, 0 };
        byte[] b2 = new byte[] { 1, 2 };
        byte[] b3 = new byte[] { 1, 2, 0, 1 };

        assertTrue(ArchiveUtils.isEqual(b1, b2, true));
        assertTrue(ArchiveUtils.isEqual(b2, b1, true));
        assertFalse(ArchiveUtils.isEqual(b1, b2, false));
        assertFalse(ArchiveUtils.isEqual(b3, b2, true));
        assertFalse(ArchiveUtils.isEqual(b2, b3, true));
    }

    @Test
    public void testIsEqual_fullBranchCoverageForIgnoreTrailingNulls() {
        byte[] base = new byte[] { 'A', 'B' };
        byte[] longerWithZeros = new byte[] { 'A', 'B', 0, 0 };
        byte[] longerWithNonZero = new byte[] { 'A', 'B', 0, 'C' };
        byte[] mismatchPrefix = new byte[] { 'A', 'X', 0, 0 };

        // length1 == length2
        assertTrue(ArchiveUtils.isEqual(base, 0, 2, base, 0, 2, true));
        assertTrue(ArchiveUtils.isEqual(base, 0, 2, base, 0, 2, false));

        // length1 > length2, trailing all zero
        assertTrue(ArchiveUtils.isEqual(longerWithZeros, 0, 4, base, 0, 2, true));
        assertFalse(ArchiveUtils.isEqual(longerWithZeros, 0, 4, base, 0, 2, false));

        // length1 > length2, trailing non-zero
        assertFalse(ArchiveUtils.isEqual(longerWithNonZero, 0, 4, base, 0, 2, true));

        // length1 < length2, trailing all zero
        assertTrue(ArchiveUtils.isEqual(base, 0, 2, longerWithZeros, 0, 4, true));
        assertFalse(ArchiveUtils.isEqual(base, 0, 2, longerWithZeros, 0, 4, false));

        // length1 < length2, trailing non-zero
        assertFalse(ArchiveUtils.isEqual(base, 0, 2, longerWithNonZero, 0, 4, true));

        // mismatch in common prefix
        assertFalse(ArchiveUtils.isEqual(mismatchPrefix, 0, 4, base, 0, 2, true));
        assertFalse(ArchiveUtils.isEqual(base, 0, 2, mismatchPrefix, 0, 4, true));
    }

    @Test
    public void testIsEqualWithNull_variousOffsetsAndLengths() {
        byte[] b1 = new byte[] { 0, 'T', 'E', 'S', 'T', 0, 0, 0 };
        byte[] b2 = new byte[] { 9, 'T', 'E', 'S', 'T', 9 };

        assertTrue(ArchiveUtils.isEqualWithNull(b1, 1, 6, b2, 1, 4));
        assertTrue(ArchiveUtils.isEqualWithNull(b2, 1, 4, b1, 1, 6));
        assertFalse(ArchiveUtils.isEqualWithNull(b1, 1, 7, b2, 1, 4));
    }

    @Test
    public void testIsArrayZero_emptyArrayOrZeroLength_returnsTrue() {
        byte[] empty = new byte[0];
        assertTrue(ArchiveUtils.isArrayZero(empty, 0));

        byte[] nonZero = new byte[] { 1, 2, 3 };
        assertTrue(ArchiveUtils.isArrayZero(nonZero, 0));
    }

    @Test
    public void testIsArrayZero_allZeros_returnsTrue() {
        byte[] zeros = new byte[] { 0, 0, 0, 0 };
        assertTrue(ArchiveUtils.isArrayZero(zeros, 4));
        assertTrue(ArchiveUtils.isArrayZero(zeros, 2));
    }

    @Test
    public void testIsArrayZero_containsNonZero_returnsFalse() {
        byte[] nonZeroFirst = new byte[] { 1, 0, 0 };
        assertFalse(ArchiveUtils.isArrayZero(nonZeroFirst, 3));

        byte[] nonZeroMiddle = new byte[] { 0, 5, 0 };
        assertFalse(ArchiveUtils.isArrayZero(nonZeroMiddle, 3));

        byte[] nonZeroLast = new byte[] { 0, 0, 9 };
        assertFalse(ArchiveUtils.isArrayZero(nonZeroLast, 3));

        // Checking before the non-zero element
        assertTrue(ArchiveUtils.isArrayZero(nonZeroLast, 2));
    }

    @Test
    public void testSanitize_printableAsciiAndUnicode_remainsUnchanged() {
        assertEquals("Hello, World!", ArchiveUtils.sanitize("Hello, World!"));
        assertEquals("FileName123.tar.gz", ArchiveUtils.sanitize("FileName123.tar.gz"));
        assertEquals("ภาษาไทย", ArchiveUtils.sanitize("ภาษาไทย"));
        assertEquals("", ArchiveUtils.sanitize(""));
    }

    @Test
    public void testSanitize_controlCharacters_replacedWithQuestionMark() {
        assertEquals("Hello?World", ArchiveUtils.sanitize("Hello\nWorld"));
        assertEquals("A?B?C?", ArchiveUtils.sanitize("A\u0000B\u0001C\u001F"));
        assertEquals("???", ArchiveUtils.sanitize("\r\t\b"));
    }

    @Test
    public void testSanitize_unicodeSpecialsAndUnassignedBlocks_replacedWithQuestionMark() {
        // Unicode SPECIALS block (e.g. \uFFF0 - \uFFFF)
        assertEquals("Special?", ArchiveUtils.sanitize("Special\uFFF0"));
        assertEquals("Special?", ArchiveUtils.sanitize("Special\uFFFF"));

        // Unassigned code point where Character.UnicodeBlock.of(c) returns null
        assertEquals("Unassigned?", ArchiveUtils.sanitize("Unassigned\u0378"));
    }
}
