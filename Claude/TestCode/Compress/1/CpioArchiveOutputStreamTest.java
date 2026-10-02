package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructorSingleArg_defaultFormat_noException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        assertNotNull(out);
        out.close();
    }

    @Test
    public void testConstructorTwoArgs_validFormatNew_noException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        assertNotNull(out);
        out.close();
    }

    @Test
    public void testConstructorTwoArgs_validFormatNewCrc_noException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        assertNotNull(out);
        out.close();
    }

    @Test
    public void testConstructorTwoArgs_validFormatOldAscii_noException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        assertNotNull(out);
        out.close();
    }

    @Test
    public void testConstructorTwoArgs_validFormatOldBinary_noException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        assertNotNull(out);
        out.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTwoArgs_invalidFormat_throwsIllegalArgumentException() {
        new CpioArchiveOutputStream(baos, (short) 9999);
    }

    // ---------------------------------------------------------------
    // putNextEntry tests
    // ---------------------------------------------------------------

    @Test
    public void testPutNextEntry_newFormat_writesSuccessfully() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test.txt", 5);
        out.putNextEntry(entry);
        out.write("Hello".getBytes());
        out.closeArchiveEntry();
        out.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testPutNextEntry_oldAsciiFormat_writesSuccessfully() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "old.txt", 3);
        out.putNextEntry(entry);
        out.write("abc".getBytes());
        out.closeArchiveEntry();
        out.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testPutNextEntry_oldBinaryFormat_writesSuccessfully() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "bin.txt", 4);
        out.putNextEntry(entry);
        out.write("data".getBytes());
        out.closeArchiveEntry();
        out.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testPutNextEntry_newCrcFormat_writesSuccessfully() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc.txt", 0);
        out.putNextEntry(entry);
        out.closeArchiveEntry();
        out.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test(expected = IOException.class)
    public void testPutNextEntry_duplicateName_throwsIOException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup.txt", 0);
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup.txt", 0);
        try {
            out.putNextEntry(entry1);
            out.putNextEntry(entry2);
        } finally {
            // stream may be left open; ignore
        }
    }

    @Test(expected = IOException.class)
    public void testPutNextEntry_afterStreamClosed_throwsIOException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "afterclose.txt", 0);
        out.putNextEntry(entry);
    }

    @Test
    public void testPutNextEntry_entryWithDefaultFormatAndTime_usesStreamDefaults() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("defaults.txt", 0);
        out.putNextEntry(entry);
        assertEquals(CpioConstants.FORMAT_NEW, entry.getFormat());
        assertNotEquals(-1L, entry.getTime());
        out.closeArchiveEntry();
        out.close();
    }

    // ---------------------------------------------------------------
    // write(byte[], off, len) tests
    // ---------------------------------------------------------------

    @Test
    public void testWrite_byteArray_success() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "write.txt", 5);
        out.putNextEntry(entry);
        out.write("Hello".getBytes(), 0, 5);
        out.closeArchiveEntry();
        out.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_negativeOffset_throwsIndexOutOfBoundsException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "neg.txt", 5);
        out.putNextEntry(entry);
        byte[] data = "Hello".getBytes();
        out.write(data, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_offsetPlusLenGreaterThanArrayLength_throwsIndexOutOfBoundsException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "bounds.txt", 5);
        out.putNextEntry(entry);
        byte[] data = new byte[5];
        out.write(data, 3, 5);
    }

    @Test
    public void testWrite_zeroLength_noExceptionEvenWithoutCurrentEntry() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        byte[] data = new byte[0];
        out.write(data, 0, 0);
        out.close();
    }

    @Test(expected = IOException.class)
    public void testWrite_noCurrentEntry_throwsIOException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        byte[] data = "Hello".getBytes();
        out.write(data, 0, 5);
    }

    @Test(expected = IOException.class)
    public void testWrite_exceedsEntrySize_throwsIOException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "small.txt", 2);
        out.putNextEntry(entry);
        byte[] data = "abc".getBytes();
        out.write(data, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testWrite_afterStreamClosed_throwsIOException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();
        byte[] data = "abc".getBytes();
        out.write(data, 0, 3);
    }

    // ---------------------------------------------------------------
    // write(int) test
    // ---------------------------------------------------------------

    @Test
    public void testWriteSingleByte_success() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.write((int) 'A');
        out.close();
        assertEquals(1, baos.toByteArray().length);
    }

    // ---------------------------------------------------------------
    // closeArchiveEntry tests
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_sizeMismatch_throwsIOException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "mismatch.txt", 5);
        out.putNextEntry(entry);
        // do not write the required 5 bytes
        out.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_crcMismatch_throwsIOException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crcbad.txt", 1);
        out.putNextEntry(entry);
        out.write(new byte[] { (byte) 'A' }, 0, 1);
        out.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntry_crcMatch_success() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crcgood.txt", 0);
        out.putNextEntry(entry);
        out.closeArchiveEntry();
        out.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    // ---------------------------------------------------------------
    // finish tests
    // ---------------------------------------------------------------

    @Test
    public void testFinish_writesTrailerSuccessfully() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "beforefinish.txt", 0);
        out.putNextEntry(entry);
        out.finish();
        out.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testFinish_calledMultipleTimes_noException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.finish();
        out.finish();
        out.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test(expected = IOException.class)
    public void testFinish_afterStreamClosed_throwsIOException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();
        out.finish();
    }

    // ---------------------------------------------------------------
    // close tests
    // ---------------------------------------------------------------

    @Test
    public void testClose_closesStream_success() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();
        // calling close again should not throw
        out.close();
    }

    @Test
    public void testClose_calledTwice_noExceptionAndIdempotent() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();
        try {
            out.close();
        } catch (IOException e) {
            fail("Second close() should not throw an exception");
        }
    }

    // ---------------------------------------------------------------
    // putArchiveEntry tests
    // ---------------------------------------------------------------

    @Test
    public void testPutArchiveEntry_delegatesToPutNextEntry_success() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "archiveentry.txt", 0);
        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test(expected = ClassCastException.class)
    public void testPutArchiveEntry_withNonCpioArchiveEntry_throwsClassCastException() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        org.apache.commons.compress.archivers.ArchiveEntry fakeEntry =
                new org.apache.commons.compress.archivers.ArchiveEntry() {
                    public String getName() {
                        return "fake";
                    }

                    public long getSize() {
                        return 0;
                    }

                    public boolean isDirectory() {
                        return false;
                    }

                    public java.util.Date getLastModifiedDate() {
                        return new java.util.Date();
                    }
                };
        out.putArchiveEntry(fakeEntry);
    }
}
