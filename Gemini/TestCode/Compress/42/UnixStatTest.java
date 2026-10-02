package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnixStatTest {

    @Test
    public void testConstantValues_exactOctalMatches() {
        assertEquals(07777, UnixStat.PERM_MASK);
        assertEquals(0120000, UnixStat.LINK_FLAG);
        assertEquals(0100000, UnixStat.FILE_FLAG);
        assertEquals(040000, UnixStat.DIR_FLAG);
        assertEquals(0777, UnixStat.DEFAULT_LINK_PERM);
        assertEquals(0755, UnixStat.DEFAULT_DIR_PERM);
        assertEquals(0644, UnixStat.DEFAULT_FILE_PERM);
    }

    @Test
    public void testConstantValues_decimalEquivalents() {
        assertEquals(4095, UnixStat.PERM_MASK);
        assertEquals(40960, UnixStat.LINK_FLAG);
        assertEquals(32768, UnixStat.FILE_FLAG);
        assertEquals(16384, UnixStat.DIR_FLAG);
        assertEquals(511, UnixStat.DEFAULT_LINK_PERM);
        assertEquals(493, UnixStat.DEFAULT_DIR_PERM);
        assertEquals(420, UnixStat.DEFAULT_FILE_PERM);
    }

    @Test
    public void testBitwiseOperations_maskAndFlags() {
        int sampleLinkMode = UnixStat.LINK_FLAG | UnixStat.DEFAULT_LINK_PERM;
        int sampleFileMode = UnixStat.FILE_FLAG | UnixStat.DEFAULT_FILE_PERM;
        int sampleDirMode = UnixStat.DIR_FLAG | UnixStat.DEFAULT_DIR_PERM;

        assertEquals(UnixStat.DEFAULT_LINK_PERM, sampleLinkMode & UnixStat.PERM_MASK);
        assertEquals(UnixStat.DEFAULT_FILE_PERM, sampleFileMode & UnixStat.PERM_MASK);
        assertEquals(UnixStat.DEFAULT_DIR_PERM, sampleDirMode & UnixStat.PERM_MASK);

        assertEquals(UnixStat.LINK_FLAG, sampleLinkMode & UnixStat.LINK_FLAG);
        assertEquals(UnixStat.FILE_FLAG, sampleFileMode & UnixStat.FILE_FLAG);
        assertEquals(UnixStat.DIR_FLAG, sampleDirMode & UnixStat.DIR_FLAG);

        assertEquals(0, sampleLinkMode & UnixStat.FILE_FLAG);
        assertEquals(0, sampleFileMode & UnixStat.DIR_FLAG);
        assertEquals(0, sampleDirMode & UnixStat.LINK_FLAG);
    }

    @Test
    public void testBitwiseOperations_edgeCases() {
        assertEquals(0, 0 & UnixStat.PERM_MASK);
        assertEquals(UnixStat.PERM_MASK, -1 & UnixStat.PERM_MASK);
        assertEquals(UnixStat.LINK_FLAG, -1 & UnixStat.LINK_FLAG);
        assertEquals(UnixStat.FILE_FLAG, -1 & UnixStat.FILE_FLAG);
        assertEquals(UnixStat.DIR_FLAG, -1 & UnixStat.DIR_FLAG);
    }

    @Test
    public void testInterfaceImplementation_canBeImplemented() {
        UnixStat instance = new UnixStat() {};
        assertNotNull(instance);
        assertTrue(instance instanceof UnixStat);
    }
}
