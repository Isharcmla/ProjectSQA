import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.ZipEntry;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;

public class ZipArchiveInputStreamTest {

    // ---------- Helper methods to build test zip byte arrays ----------

    private byte[] createZipWithEntries(Map<String, byte[]> entries, int method) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        for (Map.Entry<String, byte[]> e : entries.entrySet()) {
            ZipArchiveEntry entry = new ZipArchiveEntry(e.getKey());
            entry.setMethod(method);
            zos.putArchiveEntry(entry);
            zos.write(e.getValue());
            zos.closeArchiveEntry();
        }
        zos.finish();
        zos.close();
        return baos.toByteArray();
    }

    private byte[] createSingleStoredEntryZip(String name, byte[] content) throws IOException {
        Map<String, byte[]> map = new LinkedHashMap<String, byte[]>();
        map.put(name, content);
        return createZipWithEntries(map, ZipArchiveEntry.STORED);
    }

    private byte[] createSingleDeflatedEntryZip(String name, byte[] content) throws IOException {
        Map<String, byte[]> map = new LinkedHashMap<String, byte[]>();
        map.put(name, content);
        return createZipWithEntries(map, ZipArchiveEntry.DEFLATED);
    }

    private byte[] readAll(ZipArchiveInputStream zis) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int n;
        while ((n = zis.read(buffer, 0, buffer.length)) != -1) {
            out.write(buffer, 0, n);
        }
        return out.toByteArray();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_defaultEncoding_createsInstance() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        assertNotNull(zis);
        zis.close();
    }

    @Test
    public void testConstructor_withEncoding_createsInstance() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data), "UTF-8");
        assertNotNull(zis);
        assertEquals("UTF-8", zis.encoding);
        zis.close();
    }

    @Test
    public void testConstructor_withEncodingAndUnicodeFlag_createsInstance() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data), "UTF-8", false);
        assertNotNull(zis);
        zis.close();
    }

    @Test
    public void testConstructor_withAllParams_createsInstance() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data), "UTF-8", true, true);
        assertNotNull(zis);
        zis.close();
    }

    @Test
    public void testConstructor_nullEncoding_usesPlatformDefault() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data), null);
        assertNotNull(zis);
        assertNull(zis.encoding);
        zis.close();
    }

    // ---------- getNextZipEntry tests ----------

    @Test
    public void testGetNextZipEntry_storedEntry_returnsEntryWithCorrectName() throws IOException {
        byte[] data = createSingleStoredEntryZip("stored.txt", "hello world".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("stored.txt", entry.getName());
        assertEquals(ZipArchiveEntry.STORED, entry.getMethod());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_deflatedEntry_returnsEntryWithCorrectName() throws IOException {
        byte[] data = createSingleDeflatedEntryZip("deflated.txt", "hello deflate world".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("deflated.txt", entry.getName());
        assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_emptyStream_returnsNull() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNull(entry);
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_closedStream_returnsNull() throws IOException {
        byte[] data = createSingleStoredEntryZip("stored.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.close();
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNull(entry);
    }

    @Test
    public void testGetNextZipEntry_multipleEntries_readsAllEntries() throws IOException {
        Map<String, byte[]> map = new LinkedHashMap<String, byte[]>();
        map.put("a.txt", "AAAA".getBytes());
        map.put("b.txt", "BBBB".getBytes());
        byte[] data = createZipWithEntries(map, ZipArchiveEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));

        ZipArchiveEntry e1 = zis.getNextZipEntry();
        assertNotNull(e1);
        assertEquals("a.txt", e1.getName());

        ZipArchiveEntry e2 = zis.getNextZipEntry();
        assertNotNull(e2);
        assertEquals("b.txt", e2.getName());

        ZipArchiveEntry e3 = zis.getNextZipEntry();
        assertNull(e3);

        zis.close();
    }

    // ---------- getNextEntry tests ----------

    @Test
    public void testGetNextEntry_delegatesToGetNextZipEntry_returnsEntry() throws IOException {
        byte[] data = createSingleStoredEntryZip("delegate.txt", "content".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ArchiveEntry entry = zis.getNextEntry();
        assertNotNull(entry);
        assertTrue(entry instanceof ZipArchiveEntry);
        assertEquals("delegate.txt", entry.getName());
        zis.close();
    }

    // ---------- canReadEntryData tests ----------

    @Test
    public void testCanReadEntryData_nonZipArchiveEntry_returnsFalse() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ArchiveEntry fakeEntry = new ArchiveEntry() {
            public String getName() { return "fake"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public java.util.Date getLastModifiedDate() { return new java.util.Date(); }
        };
        assertFalse(zis.canReadEntryData(fakeEntry));
        zis.close();
    }

    @Test
    public void testCanReadEntryData_storedEntry_returnsTrue() throws IOException {
        byte[] data = createSingleStoredEntryZip("readable.txt", "abc".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertTrue(zis.canReadEntryData(entry));
        zis.close();
    }

    // ---------- read tests ----------

    @Test(expected = IOException.class)
    public void testRead_closedStream_throwsIOException() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.close();
        byte[] buffer = new byte[10];
        zis.read(buffer, 0, 10);
    }

    @Test
    public void testRead_noCurrentEntry_returnsMinusOne() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        byte[] buffer = new byte[10];
        int result = zis.read(buffer, 0, 10);
        assertEquals(-1, result);
        zis.close();
    }

    @Test
    public void testRead_storedEntryData_returnsCorrectBytes() throws IOException {
        String content = "This is stored content for reading test";
        byte[] data = createSingleStoredEntryZip("stored.txt", content.getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        byte[] readContent = readAll(zis);
        assertEquals(content, new String(readContent));
        zis.close();
    }

    @Test
    public void testRead_deflatedEntryData_returnsCorrectBytes() throws IOException {
        String content = "This is deflated content for reading test, needs to be reasonably long for compression";
        byte[] data = createSingleDeflatedEntryZip("deflated.txt", content.getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        byte[] readContent = readAll(zis);
        assertEquals(content, new String(readContent));
        zis.close();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRead_invalidOffsetLength_throwsArrayIndexOutOfBounds() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        byte[] buffer = new byte[5];
        // length larger than remaining buffer given offset -> should throw
        zis.read(buffer, 3, 10);
    }

    @Test
    public void testRead_zeroLength_returnsZero() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        byte[] buffer = new byte[5];
        int result = zis.read(buffer, 0, 0);
        assertEquals(0, result);
        zis.close();
    }

    // ---------- skip tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testSkip_negativeValue_throwsIllegalArgumentException() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello world".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        zis.skip(-1L);
    }

    @Test
    public void testSkip_positiveValue_skipsBytes() throws IOException {
        String content = "0123456789";
        byte[] data = createSingleStoredEntryZip("test.txt", content.getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        long skipped = zis.skip(5);
        assertEquals(5, skipped);
        byte[] buffer = new byte[5];
        int read = zis.read(buffer, 0, 5);
        assertEquals(5, read);
        assertEquals("56789", new String(buffer));
        zis.close();
    }

    @Test
    public void testSkip_zeroValue_returnsZero() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        long skipped = zis.skip(0);
        assertEquals(0, skipped);
        zis.close();
    }

    // ---------- matches tests ----------

    @Test
    public void testMatches_lfhSignature_returnsTrue() {
        byte[] signature = new byte[] { 0x50, 0x4b, 0x03, 0x04, 0x00, 0x00 };
        assertTrue(ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatches_eocdSignature_returnsTrue() {
        byte[] signature = new byte[] { 0x50, 0x4b, 0x05, 0x06, 0x00, 0x00 };
        assertTrue(ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatches_ddSignature_returnsTrue() {
        byte[] signature = new byte[] { 0x50, 0x4b, 0x07, 0x08, 0x00, 0x00 };
        assertTrue(ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatches_splitMarker_returnsTrue() {
        byte[] signature = new byte[] { 0x50, 0x4b, 0x30, 0x30, 0x00, 0x00 };
        assertTrue(ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatches_invalidSignature_returnsFalse() {
        byte[] signature = new byte[] { 0x00, 0x00, 0x00, 0x00 };
        assertFalse(ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatches_lengthTooShort_returnsFalse() {
        byte[] signature = new byte[] { 0x50, 0x4b };
        assertFalse(ZipArchiveInputStream.matches(signature, signature.length));
    }

    // ---------- close tests ----------

    @Test
    public void testClose_closesStreamWithoutError() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.close();
        // no exception expected
        assertTrue(true);
    }

    @Test
    public void testClose_calledTwice_noException() throws IOException {
        byte[] data = createSingleStoredEntryZip("test.txt", "hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.close();
        zis.close();
        // no exception expected on second close
        assertTrue(true);
    }

    // ---------- additional integration test ----------

    @Test
    public void testGetNextZipEntry_afterReadingEntryFully_movesToNextEntry() throws IOException {
        Map<String, byte[]> map = new LinkedHashMap<String, byte[]>();
        map.put("first.txt", "first content".getBytes());
        map.put("second.txt", "second content here".getBytes());
        byte[] data = createZipWithEntries(map, ZipArchiveEntry.DEFLATED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));

        ZipArchiveEntry first = zis.getNextZipEntry();
        assertEquals("first.txt", first.getName());
        byte[] firstContent = readAll(zis);
        assertEquals("first content", new String(firstContent));

        ZipArchiveEntry second = zis.getNextZipEntry();
        assertEquals("second.txt", second.getName());
        byte[] secondContent = readAll(zis);
        assertEquals("second content here", new String(secondContent));

        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextZipEntry_withoutReadingEntryData_closesEntryAutomatically() throws IOException {
        Map<String, byte[]> map = new LinkedHashMap<String, byte[]>();
        map.put("skip1.txt", "some content to skip".getBytes());
        map.put("skip2.txt", "more content".getBytes());
        byte[] data = createZipWithEntries(map, ZipArchiveEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));

        ZipArchiveEntry first = zis.getNextZipEntry();
        assertNotNull(first);
        // do not read data, immediately move to next entry
        ZipArchiveEntry second = zis.getNextZipEntry();
        assertNotNull(second);
        assertEquals("skip2.txt", second.getName());

        zis.close();
    }
}
