package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

public class TarArchiveInputStreamTest {

    private byte[] createSimpleTarArchive(String entryName, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry(entryName);
        entry.setSize(content.length);
        entry.setModTime(new Date());
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
        return baos.toByteArray();
    }

    private byte[] createMultiEntryTarArchive(String[] names, byte[][] contents) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        for (int i = 0; i < names.length; i++) {
            TarArchiveEntry entry = new TarArchiveEntry(names[i]);
            entry.setSize(contents[i].length);
            entry.setModTime(new Date());
            taos.putArchiveEntry(entry);
            taos.write(contents[i]);
            taos.closeArchiveEntry();
        }
        taos.finish();
        taos.close();
        return baos.toByteArray();
    }

    @Test
    public void testConstructorsAndRecordSize() throws IOException {
        byte[] empty = new byte[0];
        TarArchiveInputStream tais1 = new TarArchiveInputStream(new ByteArrayInputStream(empty));
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tais1.getRecordSize());
        tais1.close();

        TarArchiveInputStream tais2 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tais2.getRecordSize());
        tais2.close();

        TarArchiveInputStream tais3 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024, 512);
        Assert.assertEquals(512, tais3.getRecordSize());
        tais3.close();
    }

    @Test
    public void testMatches() {
        byte[] shortBuf = new byte[100];
        Assert.assertFalse(TarArchiveInputStream.matches(shortBuf, 100));

        byte[] buf = new byte[512];
        Assert.assertFalse(TarArchiveInputStream.matches(buf, 512));

        // Test POSIX magic and version
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, buf, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, buf, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(buf, 512));

        // Test GNU magic with space version
        Arrays.fill(buf, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, buf, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, buf, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(buf, 512));

        // Test GNU magic with zero version
        Arrays.fill(buf, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, buf, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, buf, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(buf, 512));

        // Test Ant magic and version
        Arrays.fill(buf, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, buf, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, buf, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(buf, 512));

        // Test invalid magic with valid length
        Arrays.fill(buf, (byte) 'a');
        Assert.assertFalse(TarArchiveInputStream.matches(buf, 512));
    }

    @Test
    public void testReadSingleEntryCompletely() throws IOException {
        byte[] content = "Hello, Tar World! 1234567890".getBytes("UTF-8");
        byte[] tarData = createSimpleTarArchive("test.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(content.length, tais.available());

        byte[] readBuf = new byte[content.length];
        int numRead = tais.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(content.length, numRead);
        Assert.assertArrayEquals(content, readBuf);

        Assert.assertEquals(0, tais.available());
        Assert.assertEquals(-1, tais.read(readBuf, 0, readBuf.length));

        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testReadInSmallChunks() throws IOException {
        byte[] content = new byte[1200];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i % 127);
        }
        byte[] tarData = createSimpleTarArchive("large.bin", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry = (TarArchiveEntry) tais.getNextEntry();
        Assert.assertNotNull(entry);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[100];
        int read;
        while ((read = tais.read(buf, 0, buf.length)) != -1) {
            baos.write(buf, 0, read);
        }

        Assert.assertArrayEquals(content, baos.toByteArray());
        Assert.assertNull(tais.getNextEntry());
        tais.close();
    }

    @Test
    public void testSkipWithinEntry() throws IOException {
        byte[] content = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes("UTF-8");
        byte[] tarData = createSimpleTarArchive("skip.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        long skipped = tais.skip(10);
        Assert.assertEquals(10, skipped);
        Assert.assertEquals(content.length - 10, tais.available());

        byte[] buf = new byte[5];
        int read = tais.read(buf, 0, 5);
        Assert.assertEquals(5, read);
        Assert.assertEquals("ABCDE", new String(buf, 0, read, "UTF-8"));

        long skipRest = tais.skip(100);
        Assert.assertEquals(content.length - 15, skipRest);
        Assert.assertEquals(0, tais.available());
        Assert.assertEquals(-1, tais.read(buf, 0, 5));

        tais.close();
    }

    @Test
    public void testSkipLargeAmountExceedingBufferSize() throws IOException {
        byte[] content = new byte[10 * 1024];
        Arrays.fill(content, (byte) 'X');
        byte[] tarData = createSimpleTarArchive("huge.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        long skipped = tais.skip(9 * 1024);
        Assert.assertEquals(9 * 1024, skipped);

        byte[] buf = new byte[1024];
        int read = tais.read(buf, 0, buf.length);
        Assert.assertEquals(1024, read);

        tais.close();
    }

    @Test
    public void testAutoSkipRemainingBytesOnNextEntry() throws IOException {
        String[] names = new String[]{"file1.txt", "file2.txt"};
        byte[][] contents = new byte[][]{
            "File1 Content that is not read completely".getBytes("UTF-8"),
            "File2 Content".getBytes("UTF-8")
        };
        byte[] tarData = createMultiEntryTarArchive(names, contents);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry1 = tais.getNextTarEntry();
        Assert.assertEquals("file1.txt", entry1.getName());

        byte[] buf = new byte[5];
        tais.read(buf, 0, 5); // Read only 5 bytes

        TarArchiveEntry entry2 = tais.getNextTarEntry();
        Assert.assertEquals("file2.txt", entry2.getName());

        byte[] fullBuf = new byte[contents[1].length];
        int read = tais.read(fullBuf, 0, fullBuf.length);
        Assert.assertEquals(contents[1].length, read);
        Assert.assertArrayEquals(contents[1], fullBuf);

        Assert.assertNull(tais.getNextTarEntry());
        Assert.assertNull(tais.getNextTarEntry()); // Call again when EOF reached
        tais.close();
    }

    @Test
    public void testResetMethod() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tais.reset(); // Should do nothing and not throw exception
        tais.close();
    }

    @Test
    public void testGNULongNameEntry() throws IOException {
        String longName = "a/very/long/path/name/that/exceeds/one/hundred/characters/and/must/be/split/or/handled/via/gnu/long/name/header/extension/testfile.txt";
        byte[] content = "GNU Long Name Content".getBytes("UTF-8");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(content.length);
        entry.setModTime(new Date());
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        Assert.assertNotNull(readEntry);
        Assert.assertEquals(longName, readEntry.getName());

        byte[] readBuf = new byte[content.length];
        int read = tais.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(content.length, read);
        Assert.assertArrayEquals(content, readBuf);
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testGNULongNameWithoutFollowingEntry() throws IOException {
        // Construct archive with only a GNU long link entry and no subsequent entry
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry longNameEntry = new TarArchiveEntry(TarConstants.GNU_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] nameBytes = "orphan_long_name.txt\0".getBytes("UTF-8");
        longNameEntry.setSize(nameBytes.length);
        taos.putArchiveEntry(longNameEntry);
        taos.write(nameBytes);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        tais.close();
    }

    @Test
    public void testPaxHeaders() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);

        String longName = "pax/very/long/path/name/that/triggers/posix/pax/header/creation/in/tar/archive/output/stream/entry.txt";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setGroupId(1234);
        entry.setGroupName("paxgroup");
        entry.setUserId(5678);
        entry.setUserName("paxuser");
        entry.setLinkName("somelink");
        byte[] content = "POSIX PAX Content".getBytes("UTF-8");
        entry.setSize(content.length);
        entry.setModTime(new Date());

        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        Assert.assertNotNull(readEntry);
        Assert.assertEquals(longName, readEntry.getName());
        Assert.assertEquals(1234, readEntry.getGroupId());
        Assert.assertEquals("paxgroup", readEntry.getGroupName());
        Assert.assertEquals(5678, readEntry.getUserId());
        Assert.assertEquals("paxuser", readEntry.getUserName());
        Assert.assertEquals("somelink", readEntry.getLinkName());
        Assert.assertEquals(content.length, readEntry.getSize());

        byte[] readBuf = new byte[content.length];
        int read = tais.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(content.length, read);
        Assert.assertArrayEquals(content, readBuf);

        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testParsePaxHeaders() throws IOException {
        String paxData = "25 ctime=1354000000.0\n" +
                         "30 path=/custom/path/file.txt\n" +
                         "20 linkpath=target\n" +
                         "14 gid=1001\n" +
                         "18 gname=testgrp\n" +
                         "14 uid=2002\n" +
                         "19 uname=testuser\n" +
                         "14 size=4096\n";
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tais.parsePaxHeaders(new StringReader(paxData));
        tais.close();

        Assert.assertEquals("/custom/path/file.txt", headers.get("path"));
        Assert.assertEquals("target", headers.get("linkpath"));
        Assert.assertEquals("1001", headers.get("gid"));
        Assert.assertEquals("testgrp", headers.get("gname"));
        Assert.assertEquals("2002", headers.get("uid"));
        Assert.assertEquals("testuser", headers.get("uname"));
        Assert.assertEquals("4096", headers.get("size"));
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeadersTruncatedThrowsException() throws IOException {
        String paxData = "50 path=short";
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            tais.parsePaxHeaders(new StringReader(paxData));
        } finally {
            tais.close();
        }
    }

    @Test
    public void testGNUSparseExtendedHeader() throws IOException {
        // Create a header representing an extended GNU sparse entry
        byte[] record = new byte[512];
        System.arraycopy("sparse.bin".getBytes("UTF-8"), 0, record, 0, 10);
        // mode
        System.arraycopy("0000644\0".getBytes("UTF-8"), 0, record, 100, 8);
        // size
        System.arraycopy("00000000000\0".getBytes("UTF-8"), 0, record, 124, 12);
        // typeflag
        record[156] = TarConstants.LF_GNUTYPE_SPARSE;
        // isextended flag in sparse header
        record[504] = 1; // isextended = 1

        // Calculate checksum
        Arrays.fill(record, 148, 148 + 8, (byte) ' ');
        long sum = 0;
        for (byte b : record) {
            sum += (b & 0xFF);
        }
        String checksumStr = String.format("%06o\0 ", sum);
        System.arraycopy(checksumStr.getBytes("UTF-8"), 0, record, 148, 8);

        // Second record for extended sparse info
        byte[] sparseExtRecord = new byte[512];
        sparseExtRecord[504] = 0; // isextended = 0

        // Trailing EOF records (2 * 512 = 1024 bytes)
        byte[] eofRecords = new byte[1024];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(record);
        baos.write(sparseExtRecord);
        baos.write(eofRecords);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertTrue(entry.isGNUSparse());
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test(expected = IOException.class)
    public void testReadUnexpectedEOFThrowsIOException() throws IOException {
        byte[] content = "Some content that gets cut off".getBytes("UTF-8");
        byte[] tarData = createSimpleTarArchive("test.txt", content);

        // Truncate tarData abruptly within the content
        byte[] truncatedData = new byte[512 + 5];
        System.arraycopy(tarData, 0, truncatedData, 0, truncatedData.length);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(truncatedData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        byte[] buf = new byte[100];
        tais.read(buf, 0, 100); // Truncation triggers unexpected EOF in buffer.readRecord()
        tais.close();
    }

    @Test
    public void testCanReadEntryData() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        TarArchiveEntry normalEntry = new TarArchiveEntry("file.txt");
        Assert.assertTrue(tais.canReadEntryData(normalEntry));

        TarArchiveEntry sparseEntry = new TarArchiveEntry("file.txt", TarConstants.LF_GNUTYPE_SPARSE);
        Assert.assertFalse(tais.canReadEntryData(sparseEntry));

        ArchiveEntry nonTarEntry = new ArchiveEntry() {
            @Override
            public String getName() {
                return "dummy";
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public boolean isDirectory() {
                return false;
            }

            @Override
            public Date getLastModifiedDate() {
                return new Date();
            }
        };
        Assert.assertFalse(tais.canReadEntryData(nonTarEntry));

        tais.closeQuietly();
    }

    @Test
    public void testGetAndSetCurrentEntryAndEOF() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(tais.getCurrentEntry());
        Assert.assertFalse(tais.isAtEOF());

        TarArchiveEntry entry = new TarArchiveEntry("custom.txt");
        tais.setCurrentEntry(entry);
        Assert.assertEquals(entry, tais.getCurrentEntry());

        tais.setAtEOF(true);
        Assert.assertTrue(tais.isAtEOF());

        tais.closeQuietly();
    }

    @Test
    public void testAvailableWithHugeSize() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry hugeEntry = new TarArchiveEntry("huge.bin");
        hugeEntry.setSize(Long.MAX_VALUE);
        tais.setCurrentEntry(hugeEntry);

        // Note: available() relies on entrySize and entryOffset inside stream
        // When getNextTarEntry is not called, entrySize is 0, so available returns 0
        try {
            Assert.assertEquals(0, tais.available());
        } catch (IOException e) {
            Assert.fail("available() threw IOException");
        }
        tais.closeQuietly();
    }

    @Test(expected = RuntimeException.class)
    public void testSkipCurrentTarEntryFailureThrowsRuntimeException() throws IOException {
        // Stream that returns 0 bytes available and EOF early when trying to skip
        InputStream brokenStream = new InputStream() {
            private int count = 0;
            @Override
            public int read() throws IOException {
                if (count++ < 512) {
                    return 0; // First 512 bytes are header with large size
                }
                return -1; // EOF
            }
        };

        byte[] header = new byte[512];
        System.arraycopy("fake.txt".getBytes("UTF-8"), 0, header, 0, 8);
        System.arraycopy("0000644\0".getBytes("UTF-8"), 0, header, 100, 8);
        System.arraycopy("00000001000\0".getBytes("UTF-8"), 0, header, 124, 12); // size = 512 bytes
        Arrays.fill(header, 148, 148 + 8, (byte) ' ');
        long sum = 0;
        for (byte b : header) {
            sum += (b & 0xFF);
        }
        String checksumStr = String.format("%06o\0 ", sum);
        System.arraycopy(checksumStr.getBytes("UTF-8"), 0, header, 148, 8);

        ByteArrayInputStream bais = new ByteArrayInputStream(header);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.getNextTarEntry(); // Read first entry

        // Next call attempts to skip unread 512 bytes, but underlying stream has no data left -> skip returns 0 -> RuntimeException
        tais.getNextTarEntry();
        tais.close();
    }

    private void closeQuietly(TarArchiveInputStream tais) {
        try {
            if (tais != null) {
                tais.close();
            }
        } catch (IOException ignored) {
        }
    }
}
private extension for test {
    void closeQuietly() {
    }
}
```

Wait! In `TarArchiveInputStreamTest.java`, let's make sure there are no syntax errors like `private extension for test` at the bottom or helper method issues. Let's fix that cleanly.

Let's double check `closeQuietly`:
Instead of adding extension methods which don't exist in Java, we can just make `private void closeQuietly(TarArchiveInputStream tais)` inside the class or `tais.close()` inside try/catch or `@Test` with throws `IOException`.

Let's refine the test class code to ensure 100% valid Java code with no syntax errors.

Let's check imports:
- `import org.apache.commons.compress.archivers.ArchiveEntry;`
- `import org.junit.Assert;`
- `import org.junit.Test;`
- `import java.io.ByteArrayInputStream;`
- `import java.io.ByteArrayOutputStream;`
- `import java.io.IOException;`
- `import java.io.InputStream;`
- `import java.io.StringReader;`
- `import java.util.Arrays;`
- `import java.util.Date;`
- `import java.util.Map;`

Let's check the constructor and methods of `TarArchiveEntry` in Commons Compress:
- `TarArchiveEntry(String name)`
- `TarArchiveEntry(String name, byte linkFlag)`
- `TarArchiveEntry(byte[] headerBuf)`
- `setSize(long size)`
- `setModTime(Date time)`
- `setGroupId(int groupId)`
- `setGroupName(String groupName)`
- `setUserId(int userId)`
- `setUserName(String userName)`
- `setLinkName(String link)`
- `isGNUSparse()`
- `isGNULongNameEntry()`
- `isPaxHeader()`
- `isExtended()`

Let's verify `available()` with > Integer.MAX_VALUE branch in `TarArchiveInputStream`:
```java
    @Override
    public int available() throws IOException {
        if (entrySize - entryOffset > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) (entrySize - entryOffset);
    }
```
How can we trigger `entrySize - entryOffset > Integer.MAX_VALUE`?
If we use Pax headers with `size=5000000000` (which is > Integer.MAX_VALUE), when `getNextTarEntry()` parses pax headers, `applyPaxHeadersToCurrentEntry` does `currEntry.setSize(Long.parseLong(val))`, and then `entrySize = currEntry.getSize()`.
Then `tais.available()` will evaluate `entrySize - entryOffset > Integer.MAX_VALUE` and return `Integer.MAX_VALUE`! That's brilliant for testing that branch!

Let's write a test for that:
```java
    @Test
    public void testAvailableWithPaxHeaderLargeSize() throws IOException {
        String paxHeaderData = "27 size=5000000000\n";
        byte[] paxContent = paxHeaderData.getBytes("UTF-8");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry paxEntry = new TarArchiveEntry("PaxHeader/largefile.bin", TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        paxEntry.setSize(paxContent.length);
        taos.putArchiveEntry(paxEntry);
        taos.write(paxContent);
        taos.closeArchiveEntry();

        TarArchiveEntry dataEntry = new TarArchiveEntry("largefile.bin");
        dataEntry.setSize(0);
        taos.putArchiveEntry(dataEntry);
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(Integer.MAX_VALUE, tais.available());
        tais.close();
    }
```

Let's check if there are other branches in `TarArchiveInputStream`:
1. `read(byte[] buf, int offset, int numToRead)`:
   - `if (entryOffset >= entrySize)` returns `-1`. (Tested)
   - `if ((numToRead + entryOffset) > entrySize)` sets `numToRead = (int)(entrySize - entryOffset)`. (Tested)
   - `if (readBuf != null)`:
     - `if (sz >= readBuf.length)` -> `readBuf = null;`
     - `else` -> creates `newBuf` with leftover.
     Let's test reading partially from readBuf! E.g. read 10 bytes from a 512-byte record, so `readBuf` has 502 bytes. Then read 5 bytes from `readBuf`, so `readBuf` still has 497 bytes!
   - `while (numToRead > 0)`:
     - `if (recLen > sz)` -> copies to buf, remainder to `readBuf`.
     - `else` -> `sz = recLen; System.arraycopy...` (when `numToRead >= 512`, e.g. readBuf is null and numToRead is 1024).

Let's write a test specifically exercising all read buffer branches:
- read 1 byte (recLen 512 > sz 1, sets readBuf of 511 bytes)
- read 1 byte (from readBuf: sz 1 < 511, keeps remaining readBuf of 510 bytes)
- read 510 bytes (from readBuf: sz 510 == readBuf.length, readBuf becomes null)
- read 1024 bytes (recLen <= sz, reads full record directly into buffer)

Let's verify this test case:
Entry size 2048 bytes.
- read 1 byte -> buffer reads record (512), leaves 511 in readBuf.
- read 1 byte -> readBuf has 510 left.
- read 510 bytes -> readBuf exhausted, becomes null.
- read 1024 bytes -> reads two 512-byte records with `recLen <= sz`.
- read remainder (512 bytes).

Let's check `getRecord()` when `buffer.readRecord()` returns null or EOF record:
- EOF record (two consecutive 512 blocks of 0s): tested via normal tar stream ending.
- When `hasHitEOF` is true, calling `getNextTarEntry()` returns null immediately.

Let's review the code carefully and output ONLY the compilable Java code. package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

public class TarArchiveInputStreamTest {

    private byte[] createSimpleTarArchive(String entryName, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry(entryName);
        entry.setSize(content.length);
        entry.setModTime(new Date());
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
        return baos.toByteArray();
    }

    private byte[] createMultiEntryTarArchive(String[] names, byte[][] contents) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        for (int i = 0; i < names.length; i++) {
            TarArchiveEntry entry = new TarArchiveEntry(names[i]);
            entry.setSize(contents[i].length);
            entry.setModTime(new Date());
            taos.putArchiveEntry(entry);
            taos.write(contents[i]);
            taos.closeArchiveEntry();
        }
        taos.finish();
        taos.close();
        return baos.toByteArray();
    }

    @Test
    public void testConstructorsAndGetRecordSize() throws IOException {
        byte[] empty = new byte[0];
        TarArchiveInputStream tais1 = new TarArchiveInputStream(new ByteArrayInputStream(empty));
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tais1.getRecordSize());
        tais1.close();

        TarArchiveInputStream tais2 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tais2.getRecordSize());
        tais2.close();

        TarArchiveInputStream tais3 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024, 512);
        Assert.assertEquals(512, tais3.getRecordSize());
        tais3.close();
    }

    @Test
    public void testMatches() {
        byte[] shortBuf = new byte[100];
        Assert.assertFalse(TarArchiveInputStream.matches(shortBuf, 100));

        byte[] buf = new byte[512];
        Assert.assertFalse(TarArchiveInputStream.matches(buf, 512));

        // Test POSIX magic and version
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, buf, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, buf, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(buf, 512));

        // Test GNU magic with space version
        Arrays.fill(buf, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, buf, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, buf, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(buf, 512));

        // Test GNU magic with zero version
        Arrays.fill(buf, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, buf, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, buf, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(buf, 512));

        // Test Ant magic and version
        Arrays.fill(buf, (byte) 0);
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, buf, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, buf, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(buf, 512));

        // Test invalid magic with valid length
        Arrays.fill(buf, (byte) 'x');
        Assert.assertFalse(TarArchiveInputStream.matches(buf, 512));
    }

    @Test
    public void testReadSingleEntryCompletely() throws IOException {
        byte[] content = "Hello, Tar World! 1234567890".getBytes("UTF-8");
        byte[] tarData = createSimpleTarArchive("test.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(content.length, tais.available());

        byte[] readBuf = new byte[content.length];
        int numRead = tais.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(content.length, numRead);
        Assert.assertArrayEquals(content, readBuf);

        Assert.assertEquals(0, tais.available());
        Assert.assertEquals(-1, tais.read(readBuf, 0, readBuf.length));

        Assert.assertNull(tais.getNextTarEntry());
        Assert.assertNull(tais.getNextTarEntry()); // Test after EOF is hit
        tais.close();
    }

    @Test
    public void testReadBufferedBranches() throws IOException {
        // Entry size is 2048 bytes (4 records of 512 bytes)
        byte[] content = new byte[2048];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i & 0xFF);
        }
        byte[] tarData = createSimpleTarArchive("buffered.bin", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        // 1. Read 1 byte -> reads 512-byte record, places 1 byte into out and 511 into readBuf
        byte[] b1 = new byte[1];
        int read1 = tais.read(b1, 0, 1);
        Assert.assertEquals(1, read1);
        Assert.assertEquals(content[0], b1[0]);

        // 2. Read 1 byte -> reads from readBuf (sz < readBuf.length), leaves 510 in readBuf
        byte[] b2 = new byte[1];
        int read2 = tais.read(b2, 0, 1);
        Assert.assertEquals(1, read2);
        Assert.assertEquals(content[1], b2[0]);

        // 3. Read 510 bytes -> exhausts readBuf (sz >= readBuf.length), readBuf becomes null
        byte[] b3 = new byte[510];
        int read3 = tais.read(b3, 0, 510);
        Assert.assertEquals(510, read3);
        byte[] expectedB3 = new byte[510];
        System.arraycopy(content, 2, expectedB3, 0, 510);
        Assert.assertArrayEquals(expectedB3, b3);

        // 4. Read 1024 bytes -> reads two 512-byte records via while loop with recLen <= sz
        byte[] b4 = new byte[1024];
        int read4 = tais.read(b4, 0, 1024);
        Assert.assertEquals(1024, read4);
        byte[] expectedB4 = new byte[1024];
        System.arraycopy(content, 512, expectedB4, 0, 1024);
        Assert.assertArrayEquals(expectedB4, b4);

        // 5. Read remaining 512 bytes
        byte[] b5 = new byte[512];
        int read5 = tais.read(b5, 0, 512);
        Assert.assertEquals(512, read5);

        Assert.assertEquals(-1, tais.read(b1, 0, 1));
        tais.close();
    }

    @Test
    public void testSkipWithinEntry() throws IOException {
        byte[] content = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes("UTF-8");
        byte[] tarData = createSimpleTarArchive("skip.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        long skipped = tais.skip(10);
        Assert.assertEquals(10, skipped);
        Assert.assertEquals(content.length - 10, tais.available());

        byte[] buf = new byte[5];
        int read = tais.read(buf, 0, 5);
        Assert.assertEquals(5, read);
        Assert.assertEquals("ABCDE", new String(buf, 0, read, "UTF-8"));

        long skipRest = tais.skip(100);
        Assert.assertEquals(content.length - 15, skipRest);
        Assert.assertEquals(0, tais.available());
        Assert.assertEquals(-1, tais.read(buf, 0, 5));

        tais.close();
    }

    @Test
    public void testSkipLargeAmountExceedingInternalBuffer() throws IOException {
        byte[] content = new byte[10 * 1024];
        Arrays.fill(content, (byte) 'A');
        byte[] tarData = createSimpleTarArchive("huge.txt", content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        long skipped = tais.skip(9 * 1024);
        Assert.assertEquals(9 * 1024, skipped);

        byte[] buf = new byte[1024];
        int read = tais.read(buf, 0, buf.length);
        Assert.assertEquals(1024, read);

        tais.close();
    }

    @Test
    public void testAutoSkipRemainingBytesOnNextEntry() throws IOException {
        String[] names = new String[]{"file1.txt", "file2.txt"};
        byte[][] contents = new byte[][]{
            "File 1 long content that will not be fully read".getBytes("UTF-8"),
            "File 2 Content".getBytes("UTF-8")
        };
        byte[] tarData = createMultiEntryTarArchive(names, contents);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(tarData));
        TarArchiveEntry entry1 = tais.getNextTarEntry();
        Assert.assertEquals("file1.txt", entry1.getName());

        byte[] buf = new byte[5];
        tais.read(buf, 0, 5); // Read only first 5 bytes

        TarArchiveEntry entry2 = (TarArchiveEntry) tais.getNextEntry();
        Assert.assertEquals("file2.txt", entry2.getName());

        byte[] fullBuf = new byte[contents[1].length];
        int read = tais.read(fullBuf, 0, fullBuf.length);
        Assert.assertEquals(contents[1].length, read);
        Assert.assertArrayEquals(contents[1], fullBuf);

        Assert.assertNull(tais.getNextEntry());
        tais.close();
    }

    @Test
    public void testResetMethod() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tais.reset();
        tais.close();
    }

    @Test
    public void testGNULongNameEntry() throws IOException {
        String longName = "long/path/name/that/exceeds/one/hundred/characters/and/must/be/handled/via/gnu/long/name/header/extension/testfile.txt";
        byte[] content = "GNU Long Name Content".getBytes("UTF-8");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(content.length);
        entry.setModTime(new Date());
        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        Assert.assertNotNull(readEntry);
        Assert.assertEquals(longName, readEntry.getName());

        byte[] readBuf = new byte[content.length];
        int read = tais.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(content.length, read);
        Assert.assertArrayEquals(content, readBuf);
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testGNULongNameWithoutFollowingEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry longNameEntry = new TarArchiveEntry(TarConstants.GNU_LONGLINK, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] nameBytes = "orphan_long_name.txt\0".getBytes("UTF-8");
        longNameEntry.setSize(nameBytes.length);
        taos.putArchiveEntry(longNameEntry);
        taos.write(nameBytes);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        tais.close();
    }

    @Test
    public void testPaxHeaders() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);

        String longName = "pax/very/long/path/name/that/triggers/posix/pax/header/creation/in/tar/archive/entry.txt";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setGroupId(1234);
        entry.setGroupName("paxgroup");
        entry.setUserId(5678);
        entry.setUserName("paxuser");
        entry.setLinkName("targetlink");
        byte[] content = "POSIX PAX Content".getBytes("UTF-8");
        entry.setSize(content.length);
        entry.setModTime(new Date());

        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        Assert.assertNotNull(readEntry);
        Assert.assertEquals(longName, readEntry.getName());
        Assert.assertEquals(1234, readEntry.getGroupId());
        Assert.assertEquals("paxgroup", readEntry.getGroupName());
        Assert.assertEquals(5678, readEntry.getUserId());
        Assert.assertEquals("paxuser", readEntry.getUserName());
        Assert.assertEquals("targetlink", readEntry.getLinkName());
        Assert.assertEquals(content.length, readEntry.getSize());

        byte[] readBuf = new byte[content.length];
        int read = tais.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(content.length, read);
        Assert.assertArrayEquals(content, readBuf);

        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testAvailableWithPaxHeaderLargeSize() throws IOException {
        String paxHeaderData = "27 size=5000000000\n";
        byte[] paxContent = paxHeaderData.getBytes("UTF-8");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry paxEntry = new TarArchiveEntry("PaxHeader/largefile.bin", TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        paxEntry.setSize(paxContent.length);
        taos.putArchiveEntry(paxEntry);
        taos.write(paxContent);
        taos.closeArchiveEntry();

        TarArchiveEntry dataEntry = new TarArchiveEntry("largefile.bin");
        dataEntry.setSize(0);
        taos.putArchiveEntry(dataEntry);
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(Integer.MAX_VALUE, tais.available());
        tais.close();
    }

    @Test
    public void testParsePaxHeaders() throws IOException {
        String paxData = "25 ctime=1354000000.0\n" +
                         "30 path=/custom/path/file.txt\n" +
                         "20 linkpath=target\n" +
                         "14 gid=1001\n" +
                         "18 gname=testgrp\n" +
                         "14 uid=2002\n" +
                         "19 uname=testuser\n" +
                         "14 size=4096\n";
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tais.parsePaxHeaders(new StringReader(paxData));
        tais.close();

        Assert.assertEquals("/custom/path/file.txt", headers.get("path"));
        Assert.assertEquals("target", headers.get("linkpath"));
        Assert.assertEquals("1001", headers.get("gid"));
        Assert.assertEquals("testgrp", headers.get("gname"));
        Assert.assertEquals("2002", headers.get("uid"));
        Assert.assertEquals("testuser", headers.get("uname"));
        Assert.assertEquals("4096", headers.get("size"));
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeadersTruncatedThrowsException() throws IOException {
        String paxData = "50 path=short";
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            tais.parsePaxHeaders(new StringReader(paxData));
        } finally {
            tais.close();
        }
    }

    @Test
    public void testGNUSparseExtendedHeader() throws IOException {
        byte[] record = new byte[512];
        System.arraycopy("sparse.bin".getBytes("UTF-8"), 0, record, 0, 10);
        System.arraycopy("0000644\0".getBytes("UTF-8"), 0, record, 100, 8);
        System.arraycopy("00000000000\0".getBytes("UTF-8"), 0, record, 124, 12);
        record[156] = TarConstants.LF_GNUTYPE_SPARSE;
        record[504] = 1; // isextended = 1

        Arrays.fill(record, 148, 148 + 8, (byte) ' ');
        long sum = 0;
        for (byte b : record) {
            sum += (b & 0xFF);
        }
        String checksumStr = String.format("%06o\0 ", sum);
        System.arraycopy(checksumStr.getBytes("UTF-8"), 0, record, 148, 8);

        byte[] sparseExtRecord = new byte[512];
        sparseExtRecord[504] = 0; // isextended = 0

        byte[] eofRecords = new byte[1024];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(record);
        baos.write(sparseExtRecord);
        baos.write(eofRecords);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertTrue(entry.isGNUSparse());
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test(expected = IOException.class)
    public void testReadUnexpectedEOFThrowsIOException() throws IOException {
        byte[] content = "Some content that gets cut off unexpectedly".getBytes("UTF-8");
        byte[] tarData = createSimpleTarArchive("test.txt", content);

        byte[] truncatedData = new byte[512 + 5];
        System.arraycopy(tarData, 0, truncatedData, 0, truncatedData.length);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(truncatedData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        byte[] buf = new byte[100];
        try {
            tais.read(buf, 0, 100);
        } finally {
            tais.close();
        }
    }

    @Test
    public void testCanReadEntryData() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        TarArchiveEntry normalEntry = new TarArchiveEntry("file.txt");
        Assert.assertTrue(tais.canReadEntryData(normalEntry));

        TarArchiveEntry sparseEntry = new TarArchiveEntry("file.txt", TarConstants.LF_GNUTYPE_SPARSE);
        Assert.assertFalse(tais.canReadEntryData(sparseEntry));

        ArchiveEntry nonTarEntry = new ArchiveEntry() {
            @Override
            public String getName() {
                return "dummy";
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public boolean isDirectory() {
                return false;
            }

            @Override
            public Date getLastModifiedDate() {
                return new Date();
            }
        };
        Assert.assertFalse(tais.canReadEntryData(nonTarEntry));

        tais.close();
    }

    @Test
    public void testGetAndSetCurrentEntryAndEOF() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(tais.getCurrentEntry());
        Assert.assertFalse(tais.isAtEOF());

        TarArchiveEntry entry = new TarArchiveEntry("custom.txt");
        tais.setCurrentEntry(entry);
        Assert.assertEquals(entry, tais.getCurrentEntry());

        tais.setAtEOF(true);
        Assert.assertTrue(tais.isAtEOF());

        tais.close();
    }

    @Test(expected = RuntimeException.class)
    public void testSkipCurrentTarEntryFailureThrowsRuntimeException() throws IOException {
        byte[] header = new byte[512];
        System.arraycopy("fake.txt".getBytes("UTF-8"), 0, header, 0, 8);
        System.arraycopy("0000644\0".getBytes("UTF-8"), 0, header, 100, 8);
        System.arraycopy("00000001000\0".getBytes("UTF-8"), 0, header, 124, 12);
        Arrays.fill(header, 148, 148 + 8, (byte) ' ');
        long sum = 0;
        for (byte b : header) {
            sum += (b & 0xFF);
        }
        String checksumStr = String.format("%06o\0 ", sum);
        System.arraycopy(checksumStr.getBytes("UTF-8"), 0, header, 148, 8);

        ByteArrayInputStream bais = new ByteArrayInputStream(header);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        try {
            tais.getNextTarEntry();
            tais.getNextTarEntry();
        } finally {
            tais.close();
        }
    }
}
