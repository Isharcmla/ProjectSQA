package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TarArchiveOutputStreamTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testConstructors_variousSignatures_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        TarArchiveOutputStream taos1 = new TarArchiveOutputStream(baos);
        Assert.assertEquals(512, taos1.getRecordSize());
        taos1.close();

        TarArchiveOutputStream taos2 = new TarArchiveOutputStream(baos, "UTF-8");
        Assert.assertEquals(512, taos2.getRecordSize());
        taos2.close();

        TarArchiveOutputStream taos3 = new TarArchiveOutputStream(baos, 1024);
        Assert.assertEquals(512, taos3.getRecordSize());
        taos3.close();

        TarArchiveOutputStream taos4 = new TarArchiveOutputStream(baos, 1024, "UTF-8");
        Assert.assertEquals(512, taos4.getRecordSize());
        taos4.close();

        TarArchiveOutputStream taos5 = new TarArchiveOutputStream(baos, 1024, 512);
        Assert.assertEquals(512, taos5.getRecordSize());
        taos5.close();

        TarArchiveOutputStream taos6 = new TarArchiveOutputStream(baos, 1024, 512, "UTF-8");
        Assert.assertEquals(512, taos6.getRecordSize());
        taos6.close();
    }

    @Test
    public void testPutArchiveEntry_directory_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir/", TarConstants.LF_DIR);
        taos.putArchiveEntry(dirEntry);
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();

        Assert.assertTrue(taos.getBytesWritten() > 0);
        Assert.assertEquals(taos.getBytesWritten(), (long) taos.getCount());
    }

    @Test
    public void testPutArchiveEntry_regularFileWithData_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] content = "Hello World".getBytes("UTF-8");
        entry.setSize(content.length);

        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();

        Assert.assertEquals(baos.size(), taos.getBytesWritten());
    }

    @Test
    public void testWrite_chunkedWritesAndLargeRecords_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        byte[] data = new byte[1500];
        Arrays.fill(data, (byte) 'a');

        TarArchiveEntry entry = new TarArchiveEntry("large.bin");
        entry.setSize(data.length);

        taos.putArchiveEntry(entry);

        // write in tiny chunks to test assembly buffer logic
        taos.write(data, 0, 100);
        taos.write(data, 100, 200);
        taos.write(data, 300, 300); // triggers assemLen + numToWrite >= recordBuf.length
        taos.write(data, 600, 600); // triggers while(numToWrite >= recordBuf.length)
        taos.write(data, 1200, 300); // triggers numToWrite < recordBuf.length

        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(taos.getBytesWritten() >= 1500);
    }

    @Test(expected = IllegalStateException.class)
    public void testWrite_withoutOpenEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            taos.write(new byte[]{1, 2, 3}, 0, 3);
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testWrite_exceedingSize_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("overflow.txt");
        entry.setSize(5);

        taos.putArchiveEntry(entry);
        try {
            taos.write(new byte[10], 0, 10);
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_unwrittenBytesRemaining_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        entry.setSize(10);

        taos.putArchiveEntry(entry);
        taos.write(new byte[]{1, 2, 3});
        try {
            taos.closeArchiveEntry();
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_noEntryOpen_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            taos.closeArchiveEntry();
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterFinish_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        try {
            taos.putArchiveEntry(new TarArchiveEntry("after_finish.txt"));
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_afterFinish_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        try {
            taos.closeArchiveEntry();
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testFinish_alreadyFinished_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        try {
            taos.finish();
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("unclosed.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        try {
            taos.finish();
        } finally {
            taos.close();
        }
    }

    @Test
    public void testCreateArchiveEntry_success() throws IOException {
        File file = temporaryFolder.newFile("test_file.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = (TarArchiveEntry) taos.createArchiveEntry(file, "test_file.txt");
        Assert.assertNotNull(entry);
        Assert.assertEquals("test_file.txt", entry.getName());
        taos.close();
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_afterFinish_throwsException() throws IOException {
        File file = temporaryFolder.newFile("test_file.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        try {
            taos.createArchiveEntry(file, "test_file.txt");
        } finally {
            taos.close();
        }
    }

    @Test
    public void testFlush_delegatesToUnderlyingStream() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.flush();
        taos.close();
    }

    @Test(expected = RuntimeException.class)
    public void testLongFileName_errorMode_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        String longName = "a".repeat(101);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test
    public void testLongFileName_truncateMode_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);

        String longName = "a".repeat(105);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(taos.getBytesWritten() > 0);
    }

    @Test
    public void testLongFileName_gnuMode_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        String longName = "a".repeat(120);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setModTime(new Date(1000000L));
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();

        // Also test GNU long link name
        TarArchiveEntry linkEntry = new TarArchiveEntry("linkEntry", TarConstants.LF_SYMLINK);
        linkEntry.setLinkName("b".repeat(120));
        taos.putArchiveEntry(linkEntry);
        taos.closeArchiveEntry();

        taos.close();
    }

    @Test
    public void testLongFileName_posixMode_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);

        String longName = "a".repeat(120);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();

        TarArchiveEntry linkEntry = new TarArchiveEntry("linkEntry", TarConstants.LF_SYMLINK);
        linkEntry.setLinkName("b".repeat(120));
        taos.putArchiveEntry(linkEntry);
        taos.closeArchiveEntry();

        taos.close();
    }

    @Test
    public void testNonAsciiNames_addPaxHeaders_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setAddPaxHeadersForNonAsciiNames(true);

        String nonAsciiName = "\u00e5\u00e4\u00f6.txt";
        TarArchiveEntry entry = new TarArchiveEntry(nonAsciiName);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();

        TarArchiveEntry linkEntry = new TarArchiveEntry("symlink", TarConstants.LF_SYMLINK);
        linkEntry.setLinkName("\u00fc\u00f1\u00e9.target");
        taos.putArchiveEntry(linkEntry);
        taos.closeArchiveEntry();

        taos.close();
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_sizeTooBig_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigSize.txt");
        entry.setSize(TarConstants.MAXSIZE + 1L);
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_gidTooBig_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigGid.txt");
        entry.setGroupId(TarConstants.MAXID + 1L);
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_uidTooBig_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigUid.txt");
        entry.setUserId(TarConstants.MAXID + 1L);
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_modeTooBig_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigMode.txt");
        entry.setMode((int) (TarConstants.MAXID + 1L));
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_mtimeTooBig_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigMtime.txt");
        entry.setModTime(new Date((TarConstants.MAXSIZE + 1L) * 1000L));
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_devMajorTooBig_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigDevMajor.txt");
        entry.setDevMajor((int) (TarConstants.MAXID + 1L));
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testFailForBigNumbers_devMinorTooBig_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigDevMinor.txt");
        entry.setDevMinor((int) (TarConstants.MAXID + 1L));
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test
    public void testBigNumberMode_posix_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);

        TarArchiveEntry entry = new TarArchiveEntry("posixBig.txt");
        entry.setSize(TarConstants.MAXSIZE + 1L);
        entry.setGroupId(TarConstants.MAXID + 1L);
        entry.setUserId(TarConstants.MAXID + 1L);
        entry.setModTime(new Date((TarConstants.MAXSIZE + 1L) * 1000L));
        entry.setDevMajor((int) (TarConstants.MAXID + 1L));
        entry.setDevMinor((int) (TarConstants.MAXID + 1L));
        entry.setMode(0644);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.close();
    }

    @Test(expected = RuntimeException.class)
    public void testBigNumberMode_posix_modeTooBig_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);

        TarArchiveEntry entry = new TarArchiveEntry("posixBigMode.txt");
        entry.setMode((int) (TarConstants.MAXID + 1L));
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test
    public void testBigNumberMode_star_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);

        TarArchiveEntry entry = new TarArchiveEntry("starBig.txt");
        entry.setSize(TarConstants.MAXSIZE + 1L);
        entry.setGroupId(TarConstants.MAXID + 1L);
        entry.setUserId(TarConstants.MAXID + 1L);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.close();
    }

    @Test
    public void testWritePaxHeaders_longPaxHeaderName_and_problematicChars() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        String entryNameWithSpecialChars = "dir/sub/very_long_name_that_exceeds_the_header_limit_for_pax_generation_which_is_around_100_characters_long_and_contains_\u0000_and_slashes/";
        TarArchiveEntry entry = new TarArchiveEntry(entryNameWithSpecialChars);
        entry.setModTime(new Date(-1000L)); // negative modTime triggers branch in transferModTime

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("longKey", "v".repeat(200)); // triggers multi-digit length adjust
        headers.put("k", "v"); // short line length

        taos.writePaxHeaders(entry, entryNameWithSpecialChars, headers);
        taos.close();
    }

    @Test
    public void testPadAsNeeded_withDifferentBlockSizes() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // 2048 block size, 512 record size -> 4 records per block
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 2048, 512);

        TarArchiveEntry entry = new TarArchiveEntry("singleRecord.txt");
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();

        // 1 header + 2 EOF records = 3 records written. Pad to 4 records.
        // Total bytes = 4 * 512 = 2048
        Assert.assertEquals(2048, baos.size());
    }
}
