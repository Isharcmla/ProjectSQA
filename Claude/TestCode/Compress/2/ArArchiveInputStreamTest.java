package org.apache.commons.compress.archivers.ar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

public class ArArchiveInputStreamTest {

    private static final String GLOBAL_HEADER = "!<arch>\n";
    private static final String ENTRY_TRAILER = "`\n";

    private String pad(String s, int len) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < len) {
            sb.append(' ');
        }
        return sb.substring(0, len);
    }

    private byte[] buildEntryHeader(String name, long size) {
        StringBuilder sb = new StringBuilder();
        sb.append(pad(name, 16));
        sb.append(pad("0", 12)); // mtime
        sb.append(pad("0", 6));  // uid
        sb.append(pad("0", 6));  // gid
        sb.append(pad("100644", 8)); // mode
        sb.append(pad(Long.toString(size), 10)); // size
        sb.append(ENTRY_TRAILER);
        return sb.toString().getBytes();
    }

    private byte[] buildArchive(Object[] entries) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(GLOBAL_HEADER.getBytes());
        for (int i = 0; i < entries.length; i += 2) {
            String name = (String) entries[i];
            byte[] content = (byte[]) entries[i + 1];
            out.write(buildEntryHeader(name, content.length));
            out.write(content);
            if (content.length % 2 != 0) {
                out.write('\n');
            }
        }
        return out.toByteArray();
    }

    @Test
    public void testConstructor_validInput_createsInstance() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ArArchiveInputStream ar = new ArArchiveInputStream(is);
        assertNotNull(ar);
    }

    @Test
    public void testGetNextArEntry_singleEntry_returnsCorrectEntry() throws IOException {
        byte[] content = "AAAA".getBytes();
        byte[] archive = buildArchive(new Object[]{"a.txt", content});
        ArArchiveInputStream ar = new ArArchiveInputStream(new ByteArrayInputStream(archive));
        ArArchiveEntry entry = ar.getNextArEntry();
        assertNotNull(entry);
        assertEquals("a.txt", entry.getName());
        assertEquals(4, entry.getSize());
    }

    @Test
    public void testGetNextArEntry_noMoreEntries_returnsNull() throws IOException {
        byte[] archive = GLOBAL_HEADER.getBytes();
        ArArchiveInputStream ar = new ArArchiveInputStream(new ByteArrayInputStream(archive));
        ArArchiveEntry entry = ar.getNextArEntry();
        assertNull(entry);
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_invalidGlobalHeader_throwsIOException() throws IOException {
        byte[] archive = "invalidhd".getBytes();
        ArArchiveInputStream ar = new ArArchiveInputStream(new ByteArrayInputStream(archive));
        ar.getNextArEntry();
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_shortGlobalHeader_throwsIOException() throws IOException {
        byte[] archive = "abc".getBytes();
        ArArchiveInputStream ar = new ArArchiveInputStream(new ByteArrayInputStream(archive));
        ar.getNextArEntry();
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_invalidTrailer_throwsIOException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(GLOBAL_HEADER.getBytes());
        StringBuilder sb = new StringBuilder();
        sb.append(pad("a.txt", 16));
        sb.append(pad("0", 12));
        sb.append(pad("0", 6));
        sb.append(pad("0", 6));
        sb.append(pad("100644", 8));
        sb.append(pad("4", 10));
        sb.append("XX"); // invalid trailer
        out.write(sb.toString().getBytes());
        out.write("AAAA".getBytes());
        ArArchiveInputStream ar = new ArArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
        ar.getNextArEntry();
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntry_shortEntryHeader_throwsIOException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(GLOBAL_HEADER.getBytes());
        out.write("short".getBytes());
        ArArchiveInputStream ar = new ArArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
        ar.getNextArEntry();
    }

    @Test
    public void testGetNextArEntry_multipleEntriesWithOddPadding_readsAllEntries() throws IOException {
        byte[] content1 = "AAAAA".getBytes(); // odd length 5
        byte[] content2 = "BBBB".getBytes(); // even length 4
        byte[] archive = buildArchive(new Object[]{"a.txt", content1, "b.txt", content2});
        ArArchiveInputStream ar = new ArArchiveInputStream(new ByteArrayInputStream(archive));

        ArArchiveEntry entry1 = ar.getNextArEntry();
        assertNotNull(entry1);
        assertEquals("a.txt", entry1.getName());
        assertEquals(5, entry1.getSize());
        byte[] buf1 = new byte[5];
        ar.read(buf1);
        assertArrayEquals(content1, buf1);

        ArArchiveEntry entry2 = ar.getNextArEntry();
        assertNotNull(entry2);
        assertEquals("b.txt", entry2.getName());
        assertEquals(4, entry2.getSize());
        byte[] buf2 = new byte[4];
        ar.read(buf2);
        assertArrayEquals(content2, buf2);

        ArArchiveEntry entry3 = ar.getNextArEntry();
        assertNull(entry3);
    }

    @Test
    public void testGetNextEntry_returnsArchiveEntry() throws IOException {
        byte[] content = "TEST".getBytes();
        byte[] archive = buildArchive(new Object[]{"t.txt", content});
        ArArchiveInputStream ar = new ArArchiveInputStream(new ByteArrayInputStream(archive));
        ArchiveEntry entry = ar.getNextEntry();
        assertNotNull(entry);
        assertEquals("t.txt", entry.getName());
    }

    @Test
    public void testClose_closesStreamWithoutException() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ArArchiveInputStream ar = new ArArchiveInputStream(is);
        ar.close();
    }

    @Test
    public void testClose_calledMultipleTimes_noException() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ArArchiveInputStream ar = new ArArchiveInputStream(is);
        ar.close();
        ar.close(); // second call should be a no-op
    }

    @Test
    public void testRead_singleByte_returnsCorrectValue() throws IOException {
        byte[] data = {65, 66, 67}; // A B C
        InputStream is = new ByteArrayInputStream(data);
        ArArchiveInputStream ar = new ArArchiveInputStream(is);
        assertEquals(65, ar.read());
        assertEquals(66, ar.read());
        assertEquals(67, ar.read());
    }

    @Test
    public void testRead_atEOF_returnsMinusOne() throws IOException {
        byte[] data = {};
        InputStream is = new ByteArrayInputStream(data);
        ArArchiveInputStream ar = new ArArchiveInputStream(is);
        assertEquals(-1, ar.read());
    }

    @Test
    public void testReadByteArray_normalRead_returnsCorrectData() throws IOException {
        byte[] data = "HelloWorld".getBytes();
        InputStream is = new ByteArrayInputStream(data);
        ArArchiveInputStream ar = new ArArchiveInputStream(is);
        byte[] buf = new byte[10];
        int read = ar.read(buf);
        assertEquals(10, read);
        assertArrayEquals(data, buf);
    }

    @Test
    public void testReadByteArray_emptyStream_returnsMinusOne() throws IOException {
        byte[] data = {};
        InputStream is = new ByteArrayInputStream(data);
        ArArchiveInputStream ar = new ArArchiveInputStream(is);
        byte[] buf = new byte[5];
        int read = ar.read(buf);
        assertEquals(-1, read);
    }

    @Test
    public void testReadByteArrayOffsetLen_normalRead_returnsCorrectData() throws IOException {
        byte[] data = "HelloWorld".getBytes();
        InputStream is = new ByteArrayInputStream(data);
        ArArchiveInputStream ar = new ArArchiveInputStream(is);
        byte[] buf = new byte[20];
        int read = ar.read(buf, 5, 10);
        assertEquals(10, read);
        byte[] expected = new byte[10];
        System.arraycopy(data, 0, expected, 0, 10);
        byte[] actual = new byte[10];
        System.arraycopy(buf, 5, actual, 0, 10);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReadByteArrayOffsetLen_zeroLength_returnsZero() throws IOException {
        byte[] data = "Hello".getBytes();
        InputStream is = new ByteArrayInputStream(data);
        ArArchiveInputStream ar = new ArArchiveInputStream(is);
        byte[] buf = new byte[5];
        int read = ar.read(buf, 0, 0);
        assertEquals(0, read);
    }

    @Test
    public void testMatches_validSignature_returnsTrue() {
        byte[] signature = {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        assertTrue(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void testMatches_lengthLessThan8_returnsFalse() {
        byte[] signature = {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e};
        assertFalse(ArArchiveInputStream.matches(signature, 7));
    }

    @Test
    public void testMatches_invalidByte0_returnsFalse() {
        byte[] signature = {0x00, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void testMatches_invalidByte1_returnsFalse() {
        byte[] signature = {0x21, 0x00, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void testMatches_invalidByte2_returnsFalse() {
        byte[] signature = {0x21, 0x3c, 0x00, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void testMatches_invalidByte3_returnsFalse() {
        byte[] signature = {0x21, 0x3c, 0x61, 0x00, 0x63, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void testMatches_invalidByte4_returnsFalse() {
        byte[] signature = {0x21, 0x3c, 0x61, 0x72, 0x00, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void testMatches_invalidByte5_returnsFalse() {
        byte[] signature = {0x21, 0x3c, 0x61, 0x72, 0x63, 0x00, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void testMatches_invalidByte6_returnsFalse() {
        byte[] signature = {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x00, 0x0a};
        assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void testMatches_invalidByte7_returnsFalse() {
        byte[] signature = {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x00};
        assertFalse(ArArchiveInputStream.matches(signature, 8));
    }
}
