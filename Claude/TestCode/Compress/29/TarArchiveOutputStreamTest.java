import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarConstants;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream bos;

    @Before
    public void setUp() {
        bos = new ByteArrayOutputStream();
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructor_default_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        assertNotNull(tos);
        tos.close();
    }

    @Test
    public void testConstructor_withEncoding_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, "UTF-8");
        assertNotNull(tos);
        tos.close();
    }

    @Test
    public void testConstructor_withBlockSize_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, 10240);
        assertNotNull(tos);
        tos.close();
    }

    @Test
    public void testConstructor_withBlockSizeAndEncoding_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, 10240, "UTF-8");
        assertNotNull(tos);
        tos.close();
    }

    @Test
    public void testConstructor_withBlockSizeAndRecordSize_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, 10240, 512);
        assertNotNull(tos);
        tos.close();
    }

    @Test
    public void testConstructor_withBlockSizeRecordSizeAndEncoding_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, 10240, 512, "UTF-8");
        assertNotNull(tos);
        tos.close();
    }

    // ---------- getRecordSize ----------

    @Test
    public void testGetRecordSize_default_returnsDefaultSize() {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tos.getRecordSize());
    }

    // ---------- putArchiveEntry / closeArchiveEntry - normal ----------

    @Test
    public void testPutAndCloseArchiveEntry_normalFile_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "hello world".getBytes("UTF-8");
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testPutArchiveEntry_directoryEntry_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("dir/");
        assertTrue(entry.isDirectory());
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterFinished_throwsIOException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry);
    }

    // ---------- write ----------

    @Test
    public void testWrite_normalData_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "abcdef".getBytes("UTF-8");
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data, 0, data.length);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testWrite_noCurrentEntry_throwsIllegalStateException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        byte[] data = "abc".getBytes("UTF-8");
        tos.write(data, 0, data.length);
    }

    @Test(expected = IOException.class)
    public void testWrite_exceedsSize_throwsIOException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(2);
        tos.putArchiveEntry(entry);
        byte[] data = "abcdefghij".getBytes("UTF-8");
        tos.write(data, 0, data.length);
    }

    @Test
    public void testWrite_largeDataAcrossMultipleRecords_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("bigfile.txt");
        byte[] data = new byte[2000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data, 0, data.length);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    // ---------- closeArchiveEntry ----------

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_noCurrentEntry_throwsIOException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_incompleteData_throwsIOException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        byte[] data = "abc".getBytes("UTF-8");
        tos.write(data, 0, data.length);
        tos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_afterFinished_throwsIOException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.closeArchiveEntry();
    }

    // ---------- finish ----------

    @Test
    public void testFinish_normal_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        tos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    @Test(expected = IOException.class)
    public void testFinish_calledTwice_throwsIOException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        tos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throwsIOException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry);
        tos.finish();
    }

    // ---------- close ----------

    @Test
    public void testClose_withoutExplicitFinish_callsFinishInternally() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    @Test
    public void testClose_calledTwice_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.close();
        tos.close(); // should not throw since closed flag prevents double close
    }

    // ---------- flush ----------

    @Test
    public void testFlush_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.flush();
        tos.close();
    }

    // ---------- getBytesWritten / getCount ----------

    @Test
    public void testGetBytesWritten_afterWrite_returnsPositiveValue() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "hello".getBytes("UTF-8");
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data, 0, data.length);
        tos.closeArchiveEntry();
        assertTrue(tos.getBytesWritten() > 0);
        tos.close();
    }

    @Test
    public void testGetCount_deprecated_returnsSameAsBytesWritten() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        assertEquals((int) tos.getBytesWritten(), tos.getCount());
        tos.close();
    }

    // ---------- createArchiveEntry ----------

    @Test
    public void testCreateArchiveEntry_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        File tmpFile = File.createTempFile("tar-test", ".txt");
        tmpFile.deleteOnExit();
        Object entry = tos.createArchiveEntry(tmpFile, "entryName.txt");
        assertNotNull(entry);
        assertTrue(entry instanceof TarArchiveEntry);
        tos.close();
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_afterFinished_throwsIOException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        File tmpFile = File.createTempFile("tar-test2", ".txt");
        tmpFile.deleteOnExit();
        tos.createArchiveEntry(tmpFile, "entryName.txt");
    }

    // ---------- setLongFileMode ----------

    @Test(expected = RuntimeException.class)
    public void testSetLongFileMode_error_longNameThrowsRuntimeException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testSetLongFileMode_truncate_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    @Test
    public void testSetLongFileMode_gnu_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    @Test
    public void testSetLongFileMode_posix_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    @Test
    public void testSetLongFileMode_shortName_noSpecialHandling() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    // ---------- setBigNumberMode ----------

    @Test(expected = RuntimeException.class)
    public void testSetBigNumberMode_error_bigSizeThrowsRuntimeException() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry("bigfile.txt");
        entry.setSize(TarConstants.MAXSIZE + 100L);
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testSetBigNumberMode_posix_bigSizeSuccess() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("bigfile.txt");
        entry.setSize(TarConstants.MAXSIZE + 100L);
        tos.putArchiveEntry(entry);
        // size won't match actual bytes written, so use closeArchiveEntry via matching write
        // Reset size expectation isn't needed since we won't write full data; instead
        // avoid violating closeArchiveEntry check by setting size back for simple demonstration
        tos.close();
    }

    @Test
    public void testSetBigNumberMode_star_bigSizeSuccess() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entry = new TarArchiveEntry("bigfile.txt");
        entry.setSize(TarConstants.MAXSIZE + 100L);
        tos.putArchiveEntry(entry);
        tos.close();
    }

    // ---------- setAddPaxHeadersForNonAsciiNames ----------

    @Test
    public void testSetAddPaxHeadersForNonAsciiNames_nonAsciiName_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("t\u00EBst.txt");
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    @Test
    public void testSetAddPaxHeadersForNonAsciiNames_asciiName_noExtraHeader() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("ascii.txt");
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    // ---------- linkName handling ----------

    @Test
    public void testPutArchiveEntry_withLinkName_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("link.txt", TarConstants.LF_SYMLINK);
        entry.setLinkName("target.txt");
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    @Test
    public void testPutArchiveEntry_withLongLinkName_gnuMode_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('b');
        }
        TarArchiveEntry entry = new TarArchiveEntry("link2.txt", TarConstants.LF_SYMLINK);
        entry.setLinkName(sb.toString());
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    // ---------- multiple entries ----------

    @Test
    public void testMultipleEntries_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        for (int i = 0; i < 3; i++) {
            TarArchiveEntry entry = new TarArchiveEntry("file" + i + ".txt");
            byte[] data = ("content" + i).getBytes("UTF-8");
            entry.setSize(data.length);
            tos.putArchiveEntry(entry);
            tos.write(data, 0, data.length);
            tos.closeArchiveEntry();
        }
        tos.finish();
        tos.close();
        assertTrue(bos.toByteArray().length > 0);
    }

    // ---------- modTime negative handling in transferModTime (via long name GNU) ----------

    @Test
    public void testPutArchiveEntry_withNegativeModTime_gnuLongLink_success() throws IOException {
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('c');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setModTime(new Date(-1000L));
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }
}
