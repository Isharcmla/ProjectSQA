import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_defaultFormat_createsStreamSuccessfully() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        assertNotNull(cos);
        cos.close();
    }

    @Test
    public void testConstructor_validFormatNew_noException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        assertNotNull(cos);
        cos.close();
    }

    @Test
    public void testConstructor_validFormatNewCrc_noException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        assertNotNull(cos);
        cos.close();
    }

    @Test
    public void testConstructor_validFormatOldAscii_noException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        assertNotNull(cos);
        cos.close();
    }

    @Test
    public void testConstructor_validFormatOldBinary_noException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        assertNotNull(cos);
        cos.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidFormat_throwsIllegalArgumentException() {
        new CpioArchiveOutputStream(baos, (short) 9999);
    }

    // ---------- putArchiveEntry tests ----------

    @Test
    public void testPutArchiveEntry_normalEntry_writesHeaderSuccessfully() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "testfile", 5);
        entry.setTime(-1); // trigger auto time set branch
        cos.putArchiveEntry(entry);
        assertTrue(entry.getTime() != -1);
        cos.write("12345".getBytes(), 0, 5);
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_closesPreviousEntryAutomatically() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "first", 0);
        cos.putArchiveEntry(entry1);
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "second", 0);
        cos.putArchiveEntry(entry2); // should auto close entry1 since size==0==written
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_formatMismatch_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "mismatch", 0);
        try {
            cos.putArchiveEntry(entry);
            fail("Expected IOException due to format mismatch");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Header format"));
        }
        cos.close();
    }

    @Test
    public void testPutArchiveEntry_duplicateEntryName_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup", 0);
        cos.putArchiveEntry(entry1);
        cos.closeArchiveEntry();
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "dup", 0);
        try {
            cos.putArchiveEntry(entry2);
            fail("Expected IOException due to duplicate entry name");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("duplicate entry"));
        }
        cos.close();
    }

    @Test
    public void testPutArchiveEntry_emptyNameEntry_writesSuccessfully() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "", 0);
        cos.putArchiveEntry(entry);
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    // ---------- closeArchiveEntry tests ----------

    @Test
    public void testCloseArchiveEntry_invalidSize_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "sizeMismatch", 5);
        cos.putArchiveEntry(entry);
        // Not writing the full 5 bytes
        try {
            cos.closeArchiveEntry();
            fail("Expected IOException due to invalid entry size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid entry size"));
        }
        cos.close();
    }

    @Test
    public void testCloseArchiveEntry_crcMismatch_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crcfile", 5);
        entry.setChksum(0); // wrong checksum
        cos.putArchiveEntry(entry);
        cos.write("ABCDE".getBytes(), 0, 5);
        try {
            cos.closeArchiveEntry();
            fail("Expected IOException due to CRC mismatch");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("CRC Error"));
        }
        cos.close();
    }

    @Test
    public void testCloseArchiveEntry_crcMatches_noException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crcfile2", 5);
        long expectedCrc = 'A' + 'A' + 'A' + 'A' + 'A';
        entry.setChksum(expectedCrc);
        cos.putArchiveEntry(entry);
        cos.write("AAAAA".getBytes(), 0, 5);
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    // ---------- write tests ----------

    @Test
    public void testWrite_normalData_writesSuccessfully() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "writeTest", 5);
        cos.putArchiveEntry(entry);
        cos.write("hello".getBytes(), 0, 5);
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        byte[] b = new byte[5];
        cos.write(b, -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_offsetExceedsBounds_throwsIndexOutOfBoundsException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        byte[] b = new byte[5];
        cos.write(b, 3, 5);
    }

    @Test
    public void testWrite_zeroLength_returnsWithoutException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        byte[] b = new byte[0];
        cos.write(b, 0, 0); // should simply return, no entry required
        cos.close();
    }

    @Test
    public void testWrite_noCurrentEntry_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        byte[] b = "data".getBytes();
        try {
            cos.write(b, 0, b.length);
            fail("Expected IOException due to no current entry");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no current CPIO entry"));
        }
        cos.close();
    }

    @Test
    public void testWrite_pastEndOfEntry_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "smallEntry", 3);
        cos.putArchiveEntry(entry);
        byte[] b = "12345".getBytes();
        try {
            cos.write(b, 0, 5);
            fail("Expected IOException due to writing past end of entry");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("attempt to write past end"));
        }
        cos.close();
    }

    @Test
    public void testWrite_crcFormatAccumulatesChecksum_matchesExpectedCrc() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crcAccum", 3);
        long expected = 'X' + 'Y' + 'Z';
        entry.setChksum(expected);
        cos.putArchiveEntry(entry);
        cos.write("XYZ".getBytes(), 0, 3);
        cos.closeArchiveEntry(); // should not throw since crc matches
        cos.close();
        assertTrue(baos.size() > 0);
    }

    // ---------- finish tests ----------

    @Test
    public void testFinish_normal_writesTrailer() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "finishTest", 0);
        cos.putArchiveEntry(entry);
        cos.closeArchiveEntry();
        cos.finish();
        // calling finish again should be no-op
        cos.finish();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testFinish_unclosedEntry_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "unclosed", 0);
        cos.putArchiveEntry(entry);
        try {
            cos.finish();
            fail("Expected IOException due to unclosed entry");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("unclosed entries"));
        }
        // clean up: close entry then close stream to avoid resource issues
        cos.closeArchiveEntry();
        cos.close();
    }

    // ---------- close tests ----------

    @Test
    public void testClose_calledMultipleTimes_noException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.close();
        cos.close(); // second call should be no-op
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testClose_afterClose_ensureOpenThrowsIOExceptionOnPutArchiveEntry() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.close();
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "afterClose", 0);
        try {
            cos.putArchiveEntry(entry);
            fail("Expected IOException since stream is closed");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Stream closed"));
        }
    }

    @Test
    public void testClose_afterClose_writeThrowsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.close();
        byte[] b = "data".getBytes();
        try {
            cos.write(b, 0, b.length);
            fail("Expected IOException since stream is closed");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Stream closed"));
        }
    }

    // ---------- createArchiveEntry tests ----------

    @Test
    public void testCreateArchiveEntry_returnsCpioArchiveEntryInstance() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        File tempFile = File.createTempFile("cpiotest", ".tmp");
        tempFile.deleteOnExit();
        ArchiveEntry entry = cos.createArchiveEntry(tempFile, "entryName");
        assertNotNull(entry);
        assertTrue(entry instanceof CpioArchiveEntry);
        assertEquals("entryName", entry.getName());
        cos.close();
    }

    // ---------- Old ASCII / Old Binary format entry writing tests ----------

    @Test
    public void testPutArchiveEntry_oldAsciiFormat_writesSuccessfully() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "oldAsciiFile", 4);
        cos.putArchiveEntry(entry);
        cos.write("data".getBytes(), 0, 4);
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_oldBinaryFormat_writesSuccessfully() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "oldBinaryFile", 4);
        cos.putArchiveEntry(entry);
        cos.write("data".getBytes(), 0, 4);
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(baos.size() > 0);
    }
}
