package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    private static String createLongName(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

    @Test
    public void testConstructors() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        TarArchiveOutputStream taos1 = new TarArchiveOutputStream(bos);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos1.getRecordSize());
        taos1.close();

        TarArchiveOutputStream taos2 = new TarArchiveOutputStream(new ByteArrayOutputStream(), "UTF-8");
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos2.getRecordSize());
        taos2.close();

        TarArchiveOutputStream taos3 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos3.getRecordSize());
        taos3.close();

        TarArchiveOutputStream taos4 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024, "UTF-8");
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos4.getRecordSize());
        taos4.close();

        TarArchiveOutputStream taos5 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024, 512);
        assertEquals(512, taos5.getRecordSize());
        taos5.close();

        TarArchiveOutputStream taos6 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024, 512, "UTF-8");
        assertEquals(512, taos6.getRecordSize());
        taos6.close();
    }

    @Test
    public void testWriteAndGetCount() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "Hello, Tar!".getBytes("UTF-8");
        entry.setSize(data.length);

        taos.putArchiveEntry(entry);
        taos.write(data);
        taos.closeArchiveEntry();
        taos.finish();

        assertTrue(taos.getBytesWritten() > 0);
        assertEquals((int) taos.getBytesWritten(), taos.getCount());

        taos.close();
    }

    @Test
    public void testWriteDirectoryEntry() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("testdir/");
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        assertTrue(bos.size() > 0);
    }

    @Test
    public void testWriteChunkedAndAssembledBuffers() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int recordSize = 512;
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos, 1024, recordSize);

        int totalSize = recordSize * 2 + 50;
        TarArchiveEntry entry = new TarArchiveEntry("large.bin");
        entry.setSize(totalSize);
        taos.putArchiveEntry(entry);

        byte[] part1 = new byte[300];
        taos.write(part1);

        byte[] part2 = new byte[300];
        taos.write(part2);

        byte[] part3 = new byte[totalSize - 600];
        taos.write(part3);

        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        assertEquals(taos.getBytesWritten(), bos.size());
    }

    @Test
    public void testWriteMoreThanOneRecordDirectly() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        int size = 1500;
        TarArchiveEntry entry = new TarArchiveEntry("large_direct.bin");
        entry.setSize(size);
        taos.putArchiveEntry(entry);

        byte[] largeData = new byte[size];
        taos.write(largeData, 0, size);

        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        assertTrue(bos.size() > size);
    }

    @Test(expected = IOException.class)
    public void testWriteExceedsEntrySizeThrowsException() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("overflow.txt");
        entry.setSize(5);
        taos.putArchiveEntry(entry);

        taos.write(new byte[10]);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryBeforeWritingAllDataThrowsException() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("underflow.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.write(new byte[5]);
        taos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithoutOpenEntryThrowsException() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWhenFinishedThrowsException() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.finish();
        taos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryWhenFinishedThrowsException() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.finish();
        taos.putArchiveEntry(new TarArchiveEntry("file.txt"));
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntryThrowsException() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("unclosed.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinishTwiceThrowsException() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.finish();
        taos.finish();
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntryWhenFinishedThrowsException() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.finish();
        taos.createArchiveEntry(new File("somefile"), "somefile");
    }

    @Test
    public void testCreateArchiveEntrySuccess() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        File temp = File.createTempFile("tartest", ".tmp");
        try {
            TarArchiveEntry entry = (TarArchiveEntry) taos.createArchiveEntry(temp, "entryName");
            assertNotNull(entry);
            assertEquals("entryName", entry.getName());
        } finally {
            temp.delete();
            taos.close();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testLongFileNameDefaultError() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName(105));
        entry.setSize(0);
        taos.putArchiveEntry(entry);
    }

    @Test
    public void testLongFileNameTruncate() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName(105));
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
    }

    @Test
    public void testLongFileNameGnu() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName(120));
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
    }

    @Test
    public void testLongFileNamePosix() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName(120));
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
    }

    @Test
    public void testAddPaxHeadersForNonAsciiNames() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setAddPaxHeadersForNonAsciiNames(true);

        TarArchiveEntry entry = new TarArchiveEntry("ไฟล์ทดสอบ.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();

        TarArchiveEntry linkEntry = new TarArchiveEntry("symlink", TarConstants.LF_SYMLINK);
        linkEntry.setLinkName("ปลายทาง.txt");
        taos.putArchiveEntry(linkEntry);
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();
    }

    @Test
    public void testWritePaxHeadersFormattingAndStripping() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("k", "v");
        headers.put("largeKey", createLongName(150));
        headers.put("unicodeKey", "ค่าทดสอบความยาวเพื่อทดสอบการคำนวณไบต์");

        String nonAsciiName = "test_\u0080_entry_" + createLongName(120);
        taos.writePaxHeaders(nonAsciiName, headers);
        taos.close();
    }

    @Test
    public void testBigNumberModesPosix() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);

        TarArchiveEntry entry = new TarArchiveEntry("bignumber.bin");
        entry.setSize(TarConstants.MAXSIZE + 1000L);
        entry.setGroupId(TarConstants.MAXID + 10L);
        entry.setUserId(TarConstants.MAXID + 20L);
        entry.setModTime(new Date((TarConstants.MAXSIZE + 1000L) * 1000));
        entry.setDevMajor((int) (TarConstants.MAXID + 30L));
        entry.setDevMinor((int) (TarConstants.MAXID + 40L));

        taos.putArchiveEntry(entry);
        taos.write(new byte[100]);
        entry.setSize(100);
        taos.close();
    }

    @Test
    public void testBigNumberModesStar() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);

        TarArchiveEntry entry = new TarArchiveEntry("star.bin");
        entry.setSize(TarConstants.MAXSIZE + 1000L);
        entry.setGroupId(TarConstants.MAXID + 10L);
        entry.setUserId(TarConstants.MAXID + 20L);

        taos.putArchiveEntry(entry);
        taos.close();
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumberSize() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigsize.bin");
        entry.setSize(TarConstants.MAXSIZE + 1L);
        taos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testFailForNegativeSize() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("negsize.bin");
        entry.setSize(-5L);
        taos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumberGroupId() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigid.bin");
        entry.setSize(0);
        entry.setGroupId(TarConstants.MAXID + 1L);
        taos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumberUserId() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("biguid.bin");
        entry.setSize(0);
        entry.setUserId(TarConstants.MAXID + 1L);
        taos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumberModTime() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigtime.bin");
        entry.setSize(0);
        entry.setModTime(new Date((TarConstants.MAXSIZE + 1000L) * 1000L));
        taos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumberModeInPosixMode() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);

        TarArchiveEntry entry = new TarArchiveEntry("bigmode.bin");
        entry.setSize(0);
        entry.setMode((int) (TarConstants.MAXID + 10L));
        taos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumberDevMajor() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("devmajor.bin");
        entry.setSize(0);
        entry.setDevMajor((int) (TarConstants.MAXID + 1L));
        taos.putArchiveEntry(entry);
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumberDevMinor() throws IOException {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("devminor.bin");
        entry.setSize(0);
        entry.setDevMinor((int) (TarConstants.MAXID + 1L));
        taos.putArchiveEntry(entry);
    }

    @Test
    public void testFlushAndMultipleClose() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.flush();
        taos.close();
        taos.close();
    }
}
