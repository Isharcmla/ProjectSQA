package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

public class ZipArchiveOutputStreamTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private File tempFile;
    private ByteArrayOutputStream baos;
    private ZipArchiveOutputStream streamOut;
    private ZipArchiveOutputStream fileOut;

    @Before
    public void setUp() throws Exception {
        tempFile = tempFolder.newFile("test.zip");
        baos = new ByteArrayOutputStream();
        streamOut = new ZipArchiveOutputStream(baos);
        fileOut = new ZipArchiveOutputStream(tempFile);
    }

    @After
    public void tearDown() {
        if (streamOut != null) {
            try {
                streamOut.close();
            } catch (IOException ignored) {
            }
        }
        if (fileOut != null) {
            try {
                fileOut.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void testIsSeekable_streamOutput_returnsFalse() {
        Assert.assertFalse(streamOut.isSeekable());
    }

    @Test
    public void testIsSeekable_fileOutput_returnsTrue() {
        Assert.assertTrue(fileOut.isSeekable());
    }

    @Test
    public void testSetAndGetEncoding() {
        Assert.assertEquals(ZipArchiveOutputStream.DEFAULT_ENCODING, streamOut.getEncoding());
        streamOut.setEncoding("ISO-8859-1");
        Assert.assertEquals("ISO-8859-1", streamOut.getEncoding());
        streamOut.setEncoding(null);
        Assert.assertNull(streamOut.getEncoding());
    }

    @Test
    public void testSetUseLanguageEncodingFlag() {
        streamOut.setEncoding("UTF-8");
        streamOut.setUseLanguageEncodingFlag(true);
        streamOut.setUseLanguageEncodingFlag(false);

        streamOut.setEncoding("US-ASCII");
        streamOut.setUseLanguageEncodingFlag(true);
    }

    @Test
    public void testSetFallbackToUTF8() {
        streamOut.setFallbackToUTF8(true);
        streamOut.setFallbackToUTF8(false);
    }

    @Test
    public void testSetCreateUnicodeExtraFields() {
        streamOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        streamOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
        streamOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER);
    }

    @Test
    public void testUnicodeExtraFieldPolicy_toString() {
        Assert.assertEquals("always", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS.toString());
        Assert.assertEquals("never", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER.toString());
        Assert.assertEquals("not encodeable", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE.toString());
    }

    @Test
    public void testSetLevel_validLevels_setsSuccessfully() {
        streamOut.setLevel(Deflater.NO_COMPRESSION);
        streamOut.setLevel(Deflater.BEST_SPEED);
        streamOut.setLevel(Deflater.BEST_COMPRESSION);
        streamOut.setLevel(Deflater.DEFAULT_COMPRESSION);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevel_tooLow_throwsException() {
        streamOut.setLevel(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevel_tooHigh_throwsException() {
        streamOut.setLevel(10);
    }

    @Test
    public void testSetMethod() {
        streamOut.setMethod(ZipArchiveOutputStream.STORED);
        streamOut.setMethod(ZipArchiveOutputStream.DEFLATED);
    }

    @Test
    public void testSetComment() throws Exception {
        streamOut.setComment("Test Archive Comment");
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        streamOut.putArchiveEntry(entry);
        streamOut.write("test".getBytes());
        streamOut.closeArchiveEntry();
        streamOut.finish();
    }

    @Test
    public void testCreateArchiveEntry() throws Exception {
        File dummyFile = tempFolder.newFile("dummy.txt");
        ArchiveEntry entry = streamOut.createArchiveEntry(dummyFile, "dummyInZip.txt");
        Assert.assertNotNull(entry);
        Assert.assertEquals("dummyInZip.txt", entry.getName());
    }

    @Test
    public void testDeflatedEntry_streamOutput_smallData() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("deflated.txt");
        streamOut.putArchiveEntry(entry);
        byte[] data = "Hello World".getBytes();
        streamOut.write(data, 0, data.length);
        streamOut.closeArchiveEntry();
        streamOut.finish();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testDeflatedEntry_streamOutput_largeDataExceedingBlockSize() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("large.bin");
        streamOut.putArchiveEntry(entry);
        // Larger than DEFLATER_BLOCK_SIZE (8192)
        byte[] largeData = new byte[20000];
        Arrays.fill(largeData, (byte) 'A');
        streamOut.write(largeData, 0, largeData.length);
        streamOut.closeArchiveEntry();
        streamOut.finish();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testDeflatedEntry_streamOutput_zeroLengthWrite() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("empty.txt");
        streamOut.putArchiveEntry(entry);
        streamOut.write(new byte[0], 0, 0);
        streamOut.closeArchiveEntry();
        streamOut.finish();
    }

    @Test
    public void testStoredEntry_streamOutput_success() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        byte[] data = "Stored data content".getBytes();
        CRC32 crc = new CRC32();
        crc.update(data);

        entry.setSize(data.length);
        entry.setCrc(crc.getValue());

        streamOut.putArchiveEntry(entry);
        streamOut.write(data, 0, data.length);
        streamOut.closeArchiveEntry();
        streamOut.finish();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test(expected = ZipException.class)
    public void testStoredEntry_streamOutput_missingSize_throwsException() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setCrc(12345L);
        streamOut.putArchiveEntry(entry);
    }

    @Test(expected = ZipException.class)
    public void testStoredEntry_streamOutput_missingCrc_throwsException() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(100L);
        streamOut.putArchiveEntry(entry);
    }

    @Test(expected = ZipException.class)
    public void testStoredEntry_streamOutput_badCrc_throwsException() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("stored_bad_crc.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        byte[] data = "Data".getBytes();
        entry.setSize(data.length);
        entry.setCrc(999999L);

        streamOut.putArchiveEntry(entry);
        streamOut.write(data, 0, data.length);
        streamOut.closeArchiveEntry();
    }

    @Test(expected = ZipException.class)
    public void testStoredEntry_streamOutput_badSize_throwsException() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("stored_bad_size.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        byte[] data = "Data".getBytes();
        CRC32 crc = new CRC32();
        crc.update(data);
        entry.setSize(data.length + 10);
        entry.setCrc(crc.getValue());

        streamOut.putArchiveEntry(entry);
        streamOut.write(data, 0, data.length);
        streamOut.closeArchiveEntry();
    }

    @Test
    public void testStoredEntry_fileOutput_raf_success() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("stored_raf.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        // Size and CRC are not required upfront for RAF seekable output
        fileOut.putArchiveEntry(entry);
        byte[] data = "Data to RAF".getBytes();
        fileOut.write(data, 0, data.length);
        fileOut.closeArchiveEntry();
        fileOut.finish();
        fileOut.close();
        fileOut = null;
        Assert.assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testDeflatedEntry_fileOutput_raf_success() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("deflated_raf.txt");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        fileOut.putArchiveEntry(entry);
        byte[] data = "Deflated Data to RAF".getBytes();
        fileOut.write(data, 0, data.length);
        fileOut.closeArchiveEntry();
        fileOut.finish();
        fileOut.close();
        fileOut = null;
        Assert.assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testCompressionLevelChangeBetweenEntries() throws Exception {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("entry1.txt");
        streamOut.putArchiveEntry(entry1);
        streamOut.write("Data 1".getBytes());
        streamOut.closeArchiveEntry();

        streamOut.setLevel(Deflater.BEST_COMPRESSION);

        ZipArchiveEntry entry2 = new ZipArchiveEntry("entry2.txt");
        streamOut.putArchiveEntry(entry2);
        streamOut.write("Data 2".getBytes());
        streamOut.closeArchiveEntry();

        streamOut.finish();
    }

    @Test
    public void testCloseArchiveEntry_whenNoEntryOpen_doesNothing() throws IOException {
        streamOut.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throwsException() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("unclosed.txt");
        streamOut.putArchiveEntry(entry);
        streamOut.finish();
    }

    @Test
    public void testUnicodeExtraFields_AlwaysPolicy() throws Exception {
        streamOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        ZipArchiveEntry entry = new ZipArchiveEntry("test_unicode.txt");
        entry.setComment("Unicode Comment \u00E9\u00E0");
        streamOut.putArchiveEntry(entry);
        streamOut.write("some data".getBytes());
        streamOut.closeArchiveEntry();
        streamOut.finish();
    }

    @Test
    public void testUnicodeExtraFields_NotEncodeablePolicy_withNonAscii() throws Exception {
        streamOut.setEncoding("US-ASCII");
        streamOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
        ZipArchiveEntry entry = new ZipArchiveEntry("t\u00E9st.txt");
        entry.setComment("c\u00F4mment");
        streamOut.putArchiveEntry(entry);
        streamOut.write("data".getBytes());
        streamOut.closeArchiveEntry();
        streamOut.finish();
    }

    @Test
    public void testFallbackToUTF8_withNonEncodableName() throws Exception {
        streamOut.setEncoding("US-ASCII");
        streamOut.setFallbackToUTF8(true);
        ZipArchiveEntry entry = new ZipArchiveEntry("\u4E2D\u6587.txt");
        streamOut.putArchiveEntry(entry);
        streamOut.write("data".getBytes());
        streamOut.closeArchiveEntry();
        streamOut.finish();
    }

    @Test
    public void testCentralFileHeader_withNullComment_andCustomAttributes() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("attributes.txt");
        entry.setComment(null);
        entry.setInternalAttributes(1);
        entry.setExternalAttributes(0100644L << 16);
        entry.setUnixMode(0644);
        streamOut.putArchiveEntry(entry);
        streamOut.write("test".getBytes());
        streamOut.closeArchiveEntry();
        streamOut.finish();
    }

    @Test
    public void testFlush() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("flush.txt");
        streamOut.putArchiveEntry(entry);
        streamOut.write("flush test".getBytes());
        streamOut.flush();
        streamOut.closeArchiveEntry();
        streamOut.finish();
    }

    @Test
    public void testClose() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("close.txt");
        streamOut.putArchiveEntry(entry);
        streamOut.write("close test".getBytes());
        streamOut.closeArchiveEntry();
        streamOut.close();
    }
}
