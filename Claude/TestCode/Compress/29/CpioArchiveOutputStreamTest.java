import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
    }

    private CpioArchiveEntry newEntry(String name, long size, short format) {
        CpioArchiveEntry e = new CpioArchiveEntry(format);
        e.setName(name);
        e.setSize(size);
        e.setMode(CpioConstants.C_ISREG);
        e.setTime(0);
        e.setNumberOfLinks(1);
        return e;
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_defaultFormat_created() {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos);
        assertNotNull(cos);
    }

    @Test
    public void testConstructor_withEncoding_created() {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, "US-ASCII");
        assertNotNull(cos);
    }

    @Test
    public void testConstructor_withFormat_created() {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        assertNotNull(cos);
    }

    @Test
    public void testConstructor_withFormatAndBlockSize_created() {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW, 128);
        assertNotNull(cos);
    }

    @Test
    public void testConstructor_withFormatBlockSizeAndEncoding_created() {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC, 512, "US-ASCII");
        assertNotNull(cos);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidFormat_throwsIllegalArgumentException() {
        new CpioArchiveOutputStream(baos, (short) 9999);
    }

    // ---------- putArchiveEntry tests ----------

    @Test
    public void testPutArchiveEntry_normalNewFormat_writesHeaderSuccessfully() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = newEntry("testfile", 5, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(entry);
        cos.write("12345".getBytes(), 0, 5);
        cos.closeArchiveEntry();
        cos.finish();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_afterFinished_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.finish();
        CpioArchiveEntry entry = newEntry("afterFinish", 0, CpioConstants.FORMAT_NEW);
        try {
            cos.putArchiveEntry(entry);
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("already been finished"));
        }
    }

    @Test
    public void testPutArchiveEntry_formatMismatch_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = newEntry("mismatch", 0, CpioConstants.FORMAT_OLD_ASCII);
        try {
            cos.putArchiveEntry(entry);
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("does not match existing format"));
        }
    }

    @Test
    public void testPutArchiveEntry_duplicateName_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e1 = newEntry("dup", 0, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(e1);
        cos.closeArchiveEntry();

        CpioArchiveEntry e2 = newEntry("dup", 0, CpioConstants.FORMAT_NEW);
        try {
            cos.putArchiveEntry(e2);
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("duplicate entry"));
        }
    }

    @Test
    public void testPutArchiveEntry_closesPreviousUnclosedEntry_automatically() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry e1 = newEntry("firstEntry", 0, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(e1);
        // do NOT close, put another entry directly -> should auto-close previous
        CpioArchiveEntry e2 = newEntry("secondEntry", 0, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(e2);
        cos.closeArchiveEntry();
        cos.finish();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    // ---------- write tests ----------

    @Test
    public void testWrite_noCurrentEntry_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        try {
            cos.write(new byte[]{1, 2, 3}, 0, 3);
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("no current CPIO entry"));
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrite_negativeOffset_throwsIndexOutOfBoundsException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.write(new byte[]{1, 2, 3}, -1, 1);
    }

    @Test
    public void testWrite_zeroLength_noOpAndNoException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.write(new byte[]{1, 2, 3}, 0, 0);
        // no exception expected, no current entry required
    }

    @Test
    public void testWrite_exceedEntrySize_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = newEntry("smallfile", 3, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(entry);
        try {
            cos.write("123456".getBytes(), 0, 6);
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("attempt to write past end"));
        }
    }

    @Test
    public void testWrite_afterClose_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.finish();
        cos.close();
        try {
            cos.write(new byte[]{1}, 0, 1);
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("Stream closed"));
        }
    }

    // ---------- closeArchiveEntry tests ----------

    @Test
    public void testCloseArchiveEntry_noEntry_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        try {
            cos.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("non-existent entry"));
        }
    }

    @Test
    public void testCloseArchiveEntry_sizeMismatch_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = newEntry("sizemismatch", 5, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(entry);
        cos.write("123".getBytes(), 0, 3);
        try {
            cos.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("invalid entry size"));
        }
    }

    @Test
    public void testCloseArchiveEntry_afterFinished_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.finish();
        try {
            cos.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("already been finished"));
        }
    }

    @Test
    public void testCloseArchiveEntry_crcMismatch_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = newEntry("crcmismatch", 5, CpioConstants.FORMAT_NEW_CRC);
        entry.setChksum(0); // wrong checksum, actual sum of "12345" is 255
        cos.putArchiveEntry(entry);
        cos.write("12345".getBytes(), 0, 5);
        try {
            cos.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("CRC Error"));
        }
    }

    @Test
    public void testCloseArchiveEntry_crcMatches_success() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = newEntry("crcmatch", 5, CpioConstants.FORMAT_NEW_CRC);
        entry.setChksum(255); // sum of ASCII codes of "12345"
        cos.putArchiveEntry(entry);
        cos.write("12345".getBytes(), 0, 5);
        cos.closeArchiveEntry();
        cos.finish();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    // ---------- finish tests ----------

    @Test
    public void testFinish_normal_success() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.finish();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testFinish_alreadyFinished_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.finish();
        try {
            cos.finish();
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("already been finished"));
        }
    }

    @Test
    public void testFinish_unclosedEntry_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = newEntry("unclosed", 0, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(entry);
        try {
            cos.finish();
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("unclosed entries"));
        }
    }

    @Test
    public void testFinish_withPadding_smallBlockSize_success() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW, 16);
        CpioArchiveEntry entry = newEntry("padded", 4, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(entry);
        cos.write("data".getBytes(), 0, 4);
        cos.closeArchiveEntry();
        cos.finish();
        cos.close();
        assertTrue(baos.size() % 16 == 0);
    }

    // ---------- close tests ----------

    @Test
    public void testClose_notFinishedYet_finishesAndClosesUnderlyingStream() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = newEntry("closetest", 0, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(entry);
        cos.closeArchiveEntry();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testClose_calledTwice_noException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.close();
        cos.close(); // should not throw, closed flag prevents double close of underlying stream
    }

    // ---------- createArchiveEntry tests ----------

    @Test
    public void testCreateArchiveEntry_normal_returnsCpioArchiveEntry() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        File tempFile = File.createTempFile("cpiotest", ".tmp");
        tempFile.deleteOnExit();
        ArchiveEntry entry = cos.createArchiveEntry(tempFile, "entryName");
        assertNotNull(entry);
        assertTrue(entry instanceof CpioArchiveEntry);
        assertEquals("entryName", entry.getName());
    }

    @Test
    public void testCreateArchiveEntry_afterFinished_throwsIOException() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        cos.finish();
        File tempFile = File.createTempFile("cpiotest2", ".tmp");
        tempFile.deleteOnExit();
        try {
            cos.createArchiveEntry(tempFile, "entryName2");
            fail("Expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("already been finished"));
        }
    }

    // ---------- Full cycle tests for other formats ----------

    @Test
    public void testFullCycle_oldAsciiFormat_success() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = newEntry("oldasciifile", 5, CpioConstants.FORMAT_OLD_ASCII);
        cos.putArchiveEntry(entry);
        cos.write("hello".getBytes(), 0, 5);
        cos.closeArchiveEntry();
        cos.finish();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testFullCycle_oldBinaryFormat_success() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = newEntry("oldbinaryfile", 5, CpioConstants.FORMAT_OLD_BINARY);
        cos.putArchiveEntry(entry);
        cos.write("world".getBytes(), 0, 5);
        cos.closeArchiveEntry();
        cos.finish();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testFullCycle_newCrcFormat_success() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = newEntry("newcrcfile", 5, CpioConstants.FORMAT_NEW_CRC);
        entry.setChksum(255);
        cos.putArchiveEntry(entry);
        cos.write("12345".getBytes(), 0, 5);
        cos.closeArchiveEntry();
        cos.finish();
        cos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntry_multipleEntriesArtificialInode_success() throws IOException {
        CpioArchiveOutputStream cos = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = newEntry("file1", 0, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(entry1);
        cos.closeArchiveEntry();

        CpioArchiveEntry entry2 = newEntry("file2", 0, CpioConstants.FORMAT_NEW);
        cos.putArchiveEntry(entry2);
        cos.closeArchiveEntry();

        cos.finish();
        cos.close();
        assertTrue(baos.size() > 0);
    }
}
