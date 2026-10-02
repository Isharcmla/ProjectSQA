package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TarArchiveEntryTest implements TarConstants {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testConstructor_nameOnly_setsDefaultValues() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, entry.getMode());
        Assert.assertEquals(LF_NORMAL, entry.getLinkFlag());
        Assert.assertNull(entry.getFile());
        Assert.assertFalse(entry.isDirectory());
        Assert.assertTrue(entry.isFile());
    }

    @Test
    public void testConstructor_directoryName_setsDirectoryMode() {
        TarArchiveEntry entry = new TarArchiveEntry("testdir/");
        Assert.assertEquals("testdir/", entry.getName());
        Assert.assertEquals(TarArchiveEntry.DEFAULT_DIR_MODE, entry.getMode());
        Assert.assertEquals(LF_DIR, entry.getLinkFlag());
        Assert.assertTrue(entry.isDirectory());
        Assert.assertFalse(entry.isFile());
    }

    @Test
    public void testConstructor_preserveLeadingSlashes_true() {
        TarArchiveEntry entry = new TarArchiveEntry("/test.txt", true);
        Assert.assertEquals("/test.txt", entry.getName());
    }

    @Test
    public void testConstructor_preserveLeadingSlashes_false() {
        TarArchiveEntry entry = new TarArchiveEntry("/test.txt", false);
        Assert.assertEquals("test.txt", entry.getName());

        TarArchiveEntry entryMultiple = new TarArchiveEntry("///multiple///test.txt", false);
        Assert.assertEquals("multiple///test.txt", entryMultiple.getName());
    }

    @Test
    public void testConstructor_nameAndLinkFlag() {
        TarArchiveEntry entry = new TarArchiveEntry("link.txt", LF_SYMLINK);
        Assert.assertEquals("link.txt", entry.getName());
        Assert.assertTrue(entry.isSymbolicLink());

        TarArchiveEntry gnuLongNameEntry = new TarArchiveEntry("longname", LF_GNUTYPE_LONGNAME);
        Assert.assertTrue(gnuLongNameEntry.isGNULongNameEntry());

        TarArchiveEntry gnuLongLinkEntry = new TarArchiveEntry("longlink", LF_GNUTYPE_LONGLINK);
        Assert.assertTrue(gnuLongLinkEntry.isGNULongLinkEntry());
    }

    @Test
    public void testConstructor_nameLinkFlagAndPreserveLeadingSlashes() {
        TarArchiveEntry entry = new TarArchiveEntry("/link.txt", LF_LINK, true);
        Assert.assertEquals("/link.txt", entry.getName());
        Assert.assertTrue(entry.isLink());
    }

    @Test
    public void testConstructor_file_normalFile() throws IOException {
        File file = temporaryFolder.newFile("sample.txt");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(new byte[]{1, 2, 3, 4, 5});
        }
        TarArchiveEntry entry = new TarArchiveEntry(file);
        Assert.assertEquals(file, entry.getFile());
        Assert.assertEquals(5L, entry.getSize());
        Assert.assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, entry.getMode());
        Assert.assertTrue(entry.isFile());
        Assert.assertFalse(entry.isDirectory());
        Assert.assertEquals(file.lastModified() / 1000L, entry.getModTime().getTime() / 1000L);
    }

    @Test
    public void testConstructor_file_directory() {
        File dir = temporaryFolder.getRoot();
        TarArchiveEntry entry = new TarArchiveEntry(dir);
        Assert.assertEquals(dir, entry.getFile());
        Assert.assertEquals(TarArchiveEntry.DEFAULT_DIR_MODE, entry.getMode());
        Assert.assertTrue(entry.isDirectory());
        Assert.assertTrue(entry.getName().endsWith("/"));
    }

    @Test
    public void testConstructor_fileAndExplicitName() throws IOException {
        File file = temporaryFolder.newFile("custom.txt");
        TarArchiveEntry entry = new TarArchiveEntry(file, "customName.txt");
        Assert.assertEquals("customName.txt", entry.getName());
        Assert.assertEquals(file, entry.getFile());

        File dir = temporaryFolder.newFolder("subfolder");
        TarArchiveEntry entryDir1 = new TarArchiveEntry(dir, "myFolder");
        Assert.assertEquals("myFolder/", entryDir1.getName());

        TarArchiveEntry entryDir2 = new TarArchiveEntry(dir, "myFolder/");
        Assert.assertEquals("myFolder/", entryDir2.getName());

        TarArchiveEntry entryEmpty = new TarArchiveEntry(dir, "");
        Assert.assertEquals("/", entryEmpty.getName());
    }

    @Test
    public void testConstructor_headerBuf_andEncoding() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("archive/test.txt");
        entry.setSize(12345L);
        entry.setModTime(1000000L);
        entry.setMode(0644);
        entry.setUserId(1001);
        entry.setGroupId(1002);
        entry.setUserName("testuser");
        entry.setGroupName("testgroup");
        entry.setLinkName("link_target");

        byte[] buf = new byte[512];
        entry.writeEntryHeader(buf);

        TarArchiveEntry parsedEntry = new TarArchiveEntry(buf);
        Assert.assertEquals("archive/test.txt", parsedEntry.getName());
        Assert.assertEquals(12345L, parsedEntry.getSize());
        Assert.assertEquals(0644, parsedEntry.getMode());
        Assert.assertEquals(1001, parsedEntry.getUserId());
        Assert.assertEquals(1002, parsedEntry.getGroupId());
        Assert.assertEquals("testuser", parsedEntry.getUserName());
        Assert.assertEquals("testgroup", parsedEntry.getGroupName());
        Assert.assertEquals("link_target", parsedEntry.getLinkName());
        Assert.assertTrue(parsedEntry.isCheckSumOK());

        ZipEncoding enc = ZipEncodingHelper.getZipEncoding("UTF-8");
        TarArchiveEntry parsedWithEncoding = new TarArchiveEntry(buf, enc);
        Assert.assertEquals("archive/test.txt", parsedWithEncoding.getName());
    }

    @Test
    public void testEqualsAndHashCode() {
        TarArchiveEntry entry1 = new TarArchiveEntry("test.txt");
        TarArchiveEntry entry2 = new TarArchiveEntry("test.txt");
        TarArchiveEntry entry3 = new TarArchiveEntry("other.txt");

        Assert.assertTrue(entry1.equals(entry2));
        Assert.assertTrue(entry1.equals((Object) entry2));
        Assert.assertFalse(entry1.equals(entry3));
        Assert.assertFalse(entry1.equals(null));
        Assert.assertFalse(entry1.equals("test.txt"));
        Assert.assertEquals(entry1.hashCode(), entry2.hashCode());
    }

    @Test
    public void testIsDescendent() {
        TarArchiveEntry parent = new TarArchiveEntry("parent/");
        TarArchiveEntry child = new TarArchiveEntry("parent/child.txt");
        TarArchiveEntry sibling = new TarArchiveEntry("sibling.txt");

        Assert.assertTrue(parent.isDescendent(child));
        Assert.assertFalse(parent.isDescendent(sibling));
    }

    @Test
    public void testGetAndSetName() {
        TarArchiveEntry entry = new TarArchiveEntry("initial.txt");
        entry.setName("changed.txt");
        Assert.assertEquals("changed.txt", entry.getName());

        TarArchiveEntry entryWithSlashes = new TarArchiveEntry("/init.txt", true);
        entryWithSlashes.setName("/changed.txt");
        Assert.assertEquals("/changed.txt", entryWithSlashes.getName());
    }

    @Test
    public void testGetAndSetMode() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setMode(0777);
        Assert.assertEquals(0777, entry.getMode());
    }

    @Test
    public void testGetAndSetLinkName() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setLinkName("target.txt");
        Assert.assertEquals("target.txt", entry.getLinkName());
    }

    @Test
    public void testGetAndSetUserIdAndGroupId() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setUserId(500);
        Assert.assertEquals(500, entry.getUserId());
        Assert.assertEquals(500L, entry.getLongUserId());

        entry.setUserId(4000000000L);
        Assert.assertEquals((int) (4000000000L & 0xffffffffL), entry.getUserId());
        Assert.assertEquals(4000000000L, entry.getLongUserId());

        entry.setGroupId(600);
        Assert.assertEquals(600, entry.getGroupId());
        Assert.assertEquals(600L, entry.getLongGroupId());

        entry.setGroupId(5000000000L);
        Assert.assertEquals((int) (5000000000L & 0xffffffffL), entry.getGroupId());
        Assert.assertEquals(5000000000L, entry.getLongGroupId());

        entry.setIds(10, 20);
        Assert.assertEquals(10L, entry.getLongUserId());
        Assert.assertEquals(20L, entry.getLongGroupId());
    }

    @Test
    public void testGetAndSetUserAndGroupName() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setUserName("alice");
        Assert.assertEquals("alice", entry.getUserName());
        entry.setGroupName("users");
        Assert.assertEquals("users", entry.getGroupName());

        entry.setNames("bob", "admins");
        Assert.assertEquals("bob", entry.getUserName());
        Assert.assertEquals("admins", entry.getGroupName());
    }

    @Test
    public void testModTime() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        long nowMillis = 1500000000000L;
        entry.setModTime(nowMillis);
        Assert.assertEquals(new Date(nowMillis), entry.getModTime());
        Assert.assertEquals(new Date(nowMillis), entry.getLastModifiedDate());

        Date date = new Date(1600000000000L);
        entry.setModTime(date);
        Assert.assertEquals(date, entry.getModTime());
    }

    @Test
    public void testSize() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(1024L);
        Assert.assertEquals(1024L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSize_negative_throwsException() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(-1L);
    }

    @Test
    public void testDevMajorAndMinor() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setDevMajor(5);
        Assert.assertEquals(5, entry.getDevMajor());
        entry.setDevMinor(10);
        Assert.assertEquals(10, entry.getDevMinor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMajor_negative_throwsException() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setDevMajor(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMinor_negative_throwsException() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setDevMinor(-1);
    }

    @Test
    public void testFileTypesCheck() {
        TarArchiveEntry chrEntry = new TarArchiveEntry("chr", LF_CHR);
        Assert.assertTrue(chrEntry.isCharacterDevice());

        TarArchiveEntry blkEntry = new TarArchiveEntry("blk", LF_BLK);
        Assert.assertTrue(blkEntry.isBlockDevice());

        TarArchiveEntry fifoEntry = new TarArchiveEntry("fifo", LF_FIFO);
        Assert.assertTrue(fifoEntry.isFIFO());

        TarArchiveEntry oldNormEntry = new TarArchiveEntry("oldnorm", LF_OLDNORM);
        Assert.assertTrue(oldNormEntry.isFile());

        TarArchiveEntry paxEntry = new TarArchiveEntry("pax", LF_PAX_EXTENDED_HEADER_LC);
        Assert.assertTrue(paxEntry.isPaxHeader());

        TarArchiveEntry paxUcEntry = new TarArchiveEntry("paxUc", LF_PAX_EXTENDED_HEADER_UC);
        Assert.assertTrue(paxUcEntry.isPaxHeader());

        TarArchiveEntry globalPaxEntry = new TarArchiveEntry("paxGlobal", LF_PAX_GLOBAL_EXTENDED_HEADER);
        Assert.assertTrue(globalPaxEntry.isGlobalPaxHeader());

        TarArchiveEntry oldGnuSparse = new TarArchiveEntry("sparse", LF_GNUTYPE_SPARSE);
        Assert.assertTrue(oldGnuSparse.isOldGNUSparse());
        Assert.assertTrue(oldGnuSparse.isGNUSparse());
        Assert.assertTrue(oldGnuSparse.isSparse());
    }

    @Test
    public void testSparseDataFillMethods() {
        TarArchiveEntry entry = new TarArchiveEntry("sparse.txt");
        Assert.assertFalse(entry.isSparse());
        Assert.assertFalse(entry.isPaxGNUSparse());
        Assert.assertFalse(entry.isStarSparse());
        Assert.assertFalse(entry.isExtended());
        Assert.assertEquals(0L, entry.getRealSize());

        Map<String, String> gnuHeaders0x = new HashMap<>();
        gnuHeaders0x.put("GNU.sparse.size", "500");
        gnuHeaders0x.put("GNU.sparse.name", "gnu_sparse_0x.txt");
        entry.fillGNUSparse0xData(gnuHeaders0x);
        Assert.assertTrue(entry.isPaxGNUSparse());
        Assert.assertTrue(entry.isGNUSparse());
        Assert.assertTrue(entry.isSparse());
        Assert.assertEquals(500L, entry.getRealSize());
        Assert.assertEquals("gnu_sparse_0x.txt", entry.getName());

        Map<String, String> gnuHeaders1x = new HashMap<>();
        gnuHeaders1x.put("GNU.sparse.realsize", "800");
        gnuHeaders1x.put("GNU.sparse.name", "gnu_sparse_1x.txt");
        entry.fillGNUSparse1xData(gnuHeaders1x);
        Assert.assertEquals(800L, entry.getRealSize());
        Assert.assertEquals("gnu_sparse_1x.txt", entry.getName());

        TarArchiveEntry starEntry = new TarArchiveEntry("star.txt");
        Map<String, String> starHeaders = new HashMap<>();
        starHeaders.put("SCHILY.realsize", "1200");
        starEntry.fillStarSparseData(starHeaders);
        Assert.assertTrue(starEntry.isStarSparse());
        Assert.assertTrue(starEntry.isSparse());
        Assert.assertEquals(1200L, starEntry.getRealSize());
    }

    @Test
    public void testGetDirectoryEntries() throws IOException {
        TarArchiveEntry nonFileEntry = new TarArchiveEntry("nonFile");
        Assert.assertEquals(0, nonFileEntry.getDirectoryEntries().length);

        File emptyDir = temporaryFolder.newFolder("emptyDir");
        TarArchiveEntry emptyDirEntry = new TarArchiveEntry(emptyDir);
        Assert.assertEquals(0, emptyDirEntry.getDirectoryEntries().length);

        File dir = temporaryFolder.newFolder("parentDir");
        File child1 = new File(dir, "child1.txt");
        Assert.assertTrue(child1.createNewFile());
        File child2 = new File(dir, "child2.txt");
        Assert.assertTrue(child2.createNewFile());

        TarArchiveEntry dirEntry = new TarArchiveEntry(dir);
        TarArchiveEntry[] children = dirEntry.getDirectoryEntries();
        Assert.assertEquals(2, children.length);

        File nonDirFile = temporaryFolder.newFile("regular.txt");
        TarArchiveEntry regularEntry = new TarArchiveEntry(nonDirFile);
        Assert.assertEquals(0, regularEntry.getDirectoryEntries().length);
    }

    @Test
    public void testWriteEntryHeader_starModeAndOverflowHandling() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("overflow.txt");
        entry.setSize(0777777777777L); // Exceeds standard octal size for SIZELEN
        byte[] buf = new byte[512];
        entry.writeEntryHeader(buf, ZipEncodingHelper.getZipEncoding("UTF-8"), false);
        Assert.assertTrue(TarUtils.verifyCheckSum(buf));

        byte[] bufStar = new byte[512];
        entry.writeEntryHeader(bufStar, ZipEncodingHelper.getZipEncoding("UTF-8"), true);
        Assert.assertTrue(TarUtils.verifyCheckSum(bufStar));
    }

    @Test
    public void testParseTarHeader_oldGnuFormat() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("oldgnu.txt");
        byte[] buf = new byte[512];
        entry.writeEntryHeader(buf);

        // Modify header to match GNU magic
        System.arraycopy(MAGIC_GNU.getBytes("UTF-8"), 0, buf, MAGIC_OFFSET, MAGICLEN);
        TarUtils.formatLongOctalBytes(1, buf, 482, ISEXTENDEDLEN_GNU); // isExtended
        TarUtils.formatLongOctalBytes(123456L, buf, 483, REALSIZELEN_GNU); // realSize

        // Recompute checksum
        for (int i = 0; i < CHKSUMLEN; i++) {
            buf[148 + i] = ' ';
        }
        long chk = TarUtils.computeCheckSum(buf);
        TarUtils.formatCheckSumOctalBytes(chk, buf, 148, CHKSUMLEN);

        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        Assert.assertTrue(parsed.isExtended());
        Assert.assertEquals(123456L, parsed.getRealSize());
    }

    @Test
    public void testParseTarHeader_xstarFormat() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        byte[] buf = new byte[512];
        entry.writeEntryHeader(buf);

        // Set XSTAR magic and prefix
        System.arraycopy(MAGIC_XSTAR.getBytes("UTF-8"), 0, buf, XSTAR_MAGIC_OFFSET, XSTAR_MAGIC_LEN);
        System.arraycopy("starprefix".getBytes("UTF-8"), 0, buf, 345, "starprefix".length());

        for (int i = 0; i < CHKSUMLEN; i++) {
            buf[148 + i] = ' ';
        }
        long chk = TarUtils.computeCheckSum(buf);
        TarUtils.formatCheckSumOctalBytes(chk, buf, 148, CHKSUMLEN);

        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        Assert.assertEquals("starprefix/file.txt", parsed.getName());
    }

    @Test
    public void testParseTarHeader_posixPrefixFormat() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        byte[] buf = new byte[512];
        entry.writeEntryHeader(buf);

        System.arraycopy("posixprefix".getBytes("UTF-8"), 0, buf, 345, "posixprefix".length());

        for (int i = 0; i < CHKSUMLEN; i++) {
            buf[148 + i] = ' ';
        }
        long chk = TarUtils.computeCheckSum(buf);
        TarUtils.formatCheckSumOctalBytes(chk, buf, 148, CHKSUMLEN);

        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        Assert.assertEquals("posixprefix/file.txt", parsed.getName());
    }

    @Test
    public void testParseTarHeader_directoryWithoutSlash() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("dir/");
        byte[] buf = new byte[512];
        entry.writeEntryHeader(buf);

        // Strip trailing slash in the name field manually
        buf[3] = 0; // "dir\0" instead of "dir/"

        for (int i = 0; i < CHKSUMLEN; i++) {
            buf[148 + i] = ' ';
        }
        long chk = TarUtils.computeCheckSum(buf);
        TarUtils.formatCheckSumOctalBytes(chk, buf, 148, CHKSUMLEN);

        TarArchiveEntry parsed = new TarArchiveEntry(buf);
        Assert.assertTrue(parsed.isDirectory());
        Assert.assertEquals("dir/", parsed.getName());
    }
}
