package org.apache.commons.compress.archivers.ar;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ArArchiveInputStreamTest {

    private static final String HEADER = "!<arch>\n";
    private static final String TRAILER = "`\n";

    private byte[] createEntryBytes(String name, long size, byte[] content) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-16s", name));
        sb.append(String.format("%-12s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-8s", "100644"));
        sb.append(String.format("%-10s", String.valueOf(size)));
        sb.append(TRAILER);

        byte[] headerBytes = sb.toString().getBytes();
        byte[] result = new byte[headerBytes.length + (content != null ? content.length : 0)];
        System.arraycopy(headerBytes, 0, result, 0, headerBytes.length);
        if (content != null && content.length > 0) {
            System.arraycopy(content, 0, result, headerBytes.length, content.length);
        }
        return result;
    }

    private byte[] createArchive(byte[][] entries) {
        int totalLen = HEADER.getBytes().length;
        for (byte[] entry : entries) {
            totalLen += entry.length;
        }
        byte[] archive = new byte[totalLen];
        byte[] headerBytes = HEADER.getBytes();
        System.arraycopy(headerBytes, 0, archive, 0, headerBytes.length);

        int pos = headerBytes.length;
        for (byte[] entry : entries) {
            System.arraycopy(entry, 0, archive, pos, entry.length);
            pos += entry.length;
        }
        return archive;
    }

    @Test
    public void testMatches_validSignature_returnsTrue() {
        byte[] signature = new byte[]{0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        Assert.assertTrue(ArArchiveInputStream.matches(signature, 8));
        Assert.assertTrue(ArArchiveInputStream.matches(signature, 10));
    }

    @Test
    public void testMatches_shortLength_returnsFalse() {
        byte[] signature = new byte[]{0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 7));
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 0));
        Assert.assertFalse(ArArchiveInputStream.matches(signature, -1));
    }

    @Test
    public void testMatches_mismatchedBytes_returnsFalse() {
        byte[] valid = new byte[]{0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};

        for (int i = 0; i < 8; i++) {
            byte[] invalid = valid.clone();
            invalid[i] = (byte) (invalid[i] ^ 0xFF);
            Assert.assertFalse("Byte at position " + i + " should have failed match",
                    ArArchiveInputStream.matches(invalid, 8));
        }
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_emptyStream_throwsIOException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);
        arStream.getNextArEntry();
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_headerTooShort_throwsIOException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("!<arc".getBytes());
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);
        arStream.getNextArEntry();
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_invalidHeader_throwsIOException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("invalid_header!!".getBytes());
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);
        arStream.getNextArEntry();
    }

    @Test
    public void testGetNextArEntry_onlyHeaderNoEntries_returnsNull() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(HEADER.getBytes());
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);
        ArArchiveEntry entry = arStream.getNextArEntry();
        Assert.assertNull(entry);
    }

    @Test
    public void testGetNextArEntry_singleValidEntry_success() throws IOException {
        byte[] entryContent = "hello world".getBytes();
        byte[] entryBytes = createEntryBytes("test.txt", entryContent.length, entryContent);
        byte[] archiveBytes = createArchive(new byte[][]{entryBytes});

        ByteArrayInputStream bais = new ByteArrayInputStream(archiveBytes);
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);

        ArArchiveEntry entry = arStream.getNextArEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(entryContent.length, entry.getSize());

        byte[] buffer = new byte[entryContent.length];
        int bytesRead = arStream.read(buffer);
        Assert.assertEquals(entryContent.length, bytesRead);
        Assert.assertArrayEquals(entryContent, buffer);

        Assert.assertNull(arStream.getNextArEntry());
    }

    @Test
    public void testGetNextEntry_delegatesToGetNextArEntry() throws IOException {
        byte[] entryContent = "data".getBytes();
        byte[] entryBytes = createEntryBytes("entry.bin", entryContent.length, entryContent);
        byte[] archiveBytes = createArchive(new byte[][]{entryBytes});

        ByteArrayInputStream bais = new ByteArrayInputStream(archiveBytes);
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);

        ArchiveEntry entry = arStream.getNextEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("entry.bin", entry.getName());
        Assert.assertEquals(entryContent.length, entry.getSize());
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_truncatedEntryHeader_throwsIOException() throws IOException {
        byte[] headerBytes = HEADER.getBytes();
        byte[] truncatedEntry = new byte[30]; // less than 60 bytes entry header
        byte[] archive = new byte[headerBytes.length + truncatedEntry.length];
        System.arraycopy(headerBytes, 0, archive, 0, headerBytes.length);
        System.arraycopy(truncatedEntry, 0, archive, headerBytes.length, truncatedEntry.length);

        ByteArrayInputStream bais = new ByteArrayInputStream(archive);
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);
        arStream.getNextArEntry();
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_invalidTrailer_throwsIOException() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-16s", "bad_trailer.txt"));
        sb.append(String.format("%-12s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-8s", "100644"));
        sb.append(String.format("%-10s", "0"));
        sb.append("XX"); // Invalid trailer, expected `\n

        byte[] entryBytes = sb.toString().getBytes();
        byte[] archiveBytes = createArchive(new byte[][]{entryBytes});

        ByteArrayInputStream bais = new ByteArrayInputStream(archiveBytes);
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);
        arStream.getNextArEntry();
    }

    @Test
    public void testGetNextArEntry_oddLengthEntryPaddingHandled() throws IOException {
        // Content with odd length (5 bytes)
        byte[] content1 = new byte[]{1, 2, 3, 4, 5};
        byte[] entry1 = createEntryBytes("file1.bin", content1.length, content1);

        // Ar requires 1-byte padding if file size is odd, but offset tracks bytes read
        byte[] content2 = new byte[]{6, 7, 8, 9};
        byte[] entry2 = createEntryBytes("file2.bin", content2.length, content2);

        // Put extra padding byte between entry1 and entry2
        byte[] padding = new byte[]{0x0a};

        int totalLength = HEADER.getBytes().length + entry1.length + padding.length + entry2.length;
        byte[] archive = new byte[totalLength];
        int pos = 0;
        System.arraycopy(HEADER.getBytes(), 0, archive, pos, HEADER.getBytes().length);
        pos += HEADER.getBytes().length;
        System.arraycopy(entry1, 0, archive, pos, entry1.length);
        pos += entry1.length;
        System.arraycopy(padding, 0, archive, pos, padding.length);
        pos += padding.length;
        System.arraycopy(entry2, 0, archive, pos, entry2.length);

        ByteArrayInputStream bais = new ByteArrayInputStream(archive);
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);

        ArArchiveEntry first = arStream.getNextArEntry();
        Assert.assertNotNull(first);
        Assert.assertEquals("file1.bin", first.getName());

        byte[] readContent1 = new byte[5];
        int bytesRead = arStream.read(readContent1, 0, 5);
        Assert.assertEquals(5, bytesRead);
        Assert.assertArrayEquals(content1, readContent1);

        // Next call should detect offset % 2 != 0 and read padding byte
        ArArchiveEntry second = arStream.getNextArEntry();
        Assert.assertNotNull(second);
        Assert.assertEquals("file2.bin", second.getName());

        byte[] readContent2 = new byte[4];
        bytesRead = arStream.read(readContent2, 0, 4);
        Assert.assertEquals(4, bytesRead);
        Assert.assertArrayEquals(content2, readContent2);

        Assert.assertNull(arStream.getNextArEntry());
    }

    @Test
    public void testRead_singleByteAndArrayReads() throws IOException {
        byte[] content = new byte[]{10, 20, 30, 40};
        byte[] entryBytes = createEntryBytes("bytes.bin", content.length, content);
        byte[] archiveBytes = createArchive(new byte[][]{entryBytes});

        ByteArrayInputStream bais = new ByteArrayInputStream(archiveBytes);
        ArArchiveInputStream arStream = new ArArchiveInputStream(bais);

        ArArchiveEntry entry = arStream.getNextArEntry();
        Assert.assertNotNull(entry);

        int b1 = arStream.read();
        Assert.assertEquals(10, b1);

        byte[] remaining = new byte[3];
        int readCount = arStream.read(remaining);
        Assert.assertEquals(3, readCount);
        Assert.assertArrayEquals(new byte[]{20, 30, 40}, remaining);

        int eof = arStream.read();
        Assert.assertEquals(-1, eof);

        int eofArray = arStream.read(new byte[5], 0, 5);
        Assert.assertEquals(-1, eofArray);
    }

    @Test
    public void testClose_closesUnderlyingStreamOnce() throws IOException {
        final boolean[] closed = new boolean[]{false};
        InputStream mockInputStream = new FilterInputStream(new ByteArrayInputStream(HEADER.getBytes())) {
            @Override
            public void close() throws IOException {
                closed[0] = true;
                super.close();
            }
        };

        ArArchiveInputStream arStream = new ArArchiveInputStream(mockInputStream);
        Assert.assertFalse(closed[0]);

        arStream.close();
        Assert.assertTrue(closed[0]);

        // Calling close again should not fail
        arStream.close();
        Assert.assertTrue(closed[0]);
    }
}
