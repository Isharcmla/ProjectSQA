package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test suite for UnixStat interface constants.
 * Since UnixStat is an interface containing only constant values,
 * tests verify that the constant values match expected octal/decimal values.
 */
public class UnixStatTest {

    // (ก) normal/typical input - verify constant values are as expected

    @Test
    public void testPermMask_value_matchesExpectedOctal() {
        assertEquals(07777, UnixStat.PERM_MASK);
    }

    @Test
    public void testLinkFlag_value_matchesExpectedOctal() {
        assertEquals(0120000, UnixStat.LINK_FLAG);
    }

    @Test
    public void testFileFlag_value_matchesExpectedOctal() {
        assertEquals(0100000, UnixStat.FILE_FLAG);
    }

    @Test
    public void testDirFlag_value_matchesExpectedOctal() {
        assertEquals(040000, UnixStat.DIR_FLAG);
    }

    @Test
    public void testDefaultLinkPerm_value_matchesExpectedOctal() {
        assertEquals(0777, UnixStat.DEFAULT_LINK_PERM);
    }

    @Test
    public void testDefaultDirPerm_value_matchesExpectedOctal() {
        assertEquals(0755, UnixStat.DEFAULT_DIR_PERM);
    }

    @Test
    public void testDefaultFilePerm_value_matchesExpectedOctal() {
        assertEquals(0644, UnixStat.DEFAULT_FILE_PERM);
    }

    // (ข) edge case - verify constants are non-negative and within expected boundary ranges

    @Test
    public void testPermMask_isNonNegative_true() {
        assertTrue(UnixStat.PERM_MASK >= 0);
    }

    @Test
    public void testLinkFlag_isNonNegative_true() {
        assertTrue(UnixStat.LINK_FLAG >= 0);
    }

    @Test
    public void testFileFlag_isNonNegative_true() {
        assertTrue(UnixStat.FILE_FLAG >= 0);
    }

    @Test
    public void testDirFlag_isNonNegative_true() {
        assertTrue(UnixStat.DIR_FLAG >= 0);
    }

    @Test
    public void testDefaultLinkPerm_isNonNegative_true() {
        assertTrue(UnixStat.DEFAULT_LINK_PERM >= 0);
    }

    @Test
    public void testDefaultDirPerm_isNonNegative_true() {
        assertTrue(UnixStat.DEFAULT_DIR_PERM >= 0);
    }

    @Test
    public void testDefaultFilePerm_isNonNegative_true() {
        assertTrue(UnixStat.DEFAULT_FILE_PERM >= 0);
    }

    // (ข) edge case - boundary comparisons between flags/permissions

    @Test
    public void testFileFlag_lessThanLinkFlag_true() {
        assertTrue(UnixStat.FILE_FLAG < UnixStat.LINK_FLAG);
    }

    @Test
    public void testDirFlag_lessThanFileFlag_true() {
        assertTrue(UnixStat.DIR_FLAG < UnixStat.FILE_FLAG);
    }

    @Test
    public void testDefaultFilePerm_lessThanOrEqualPermMask_true() {
        assertTrue(UnixStat.DEFAULT_FILE_PERM <= UnixStat.PERM_MASK);
    }

    @Test
    public void testDefaultDirPerm_lessThanOrEqualPermMask_true() {
        assertTrue(UnixStat.DEFAULT_DIR_PERM <= UnixStat.PERM_MASK);
    }

    @Test
    public void testDefaultLinkPerm_lessThanOrEqualPermMask_true() {
        assertTrue(UnixStat.DEFAULT_LINK_PERM <= UnixStat.PERM_MASK);
    }

    // (ค) exception case - not applicable since UnixStat contains only constants
    // and no methods that can throw exceptions. This test documents that
    // attempting to instantiate the interface directly is not possible
    // (compile-time error), so no runtime exception test is applicable.
    // Instead, we verify a class implementing UnixStat can access constants
    // without throwing any exception.

    private static class DummyImplementor implements UnixStat {
        // No additional members; used to verify interface constants
        // are accessible without exceptions when implemented.
    }

    @Test
    public void testImplementingClass_accessConstants_noExceptionThrown() {
        try {
            DummyImplementor dummy = new DummyImplementor();
            int perm = dummy.PERM_MASK;
            int link = dummy.LINK_FLAG;
            int file = dummy.FILE_FLAG;
            int dir = dummy.DIR_FLAG;
            int defLink = dummy.DEFAULT_LINK_PERM;
            int defDir = dummy.DEFAULT_DIR_PERM;
            int defFile = dummy.DEFAULT_FILE_PERM;

            assertEquals(07777, perm);
            assertEquals(0120000, link);
            assertEquals(0100000, file);
            assertEquals(040000, dir);
            assertEquals(0777, defLink);
            assertEquals(0755, defDir);
            assertEquals(0644, defFile);
        } catch (Exception e) {
            fail("Accessing UnixStat constants should not throw any exception: " + e.getMessage());
        }
    }
}
