package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CpioArchiveInputStreamTest {

    private byte[] createArchive(short format, String[] names, byte[][] contents) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, format);
        for (int i = 0; i < names.length; i++) {
            byte[] content = contents[i] != null ? contents[i] : new byte[0];
            CpioArchiveEntry entry = new CpioArchiveEntry(format, names[i], content.length);
            entry.setMode(CpioConstants.C_ISREG | 0644);
            out.putNextEntry(entry);
            if (content.length > 0) {
                out.write(content);
            }
            out.closeArchiveEntry();
        }
        out.close();
        return baos.toByteArray();
    }

    @Test
    public void testReadNewFormat_multipleEntries_success() throws IOException {
        String[] names = {"file1.txt", "file2.txt"};
        byte[][] contents = {
                "Hello, World!".getBytes(StandardCharsets.UTF_8),
                "Second file content for test.".getBytes(StandardCharsets.UTF_8)
        };
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, names, contents);

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData))) {
            CpioArchiveEntry entry1 = in.getNextCPIOEntry();
            assertNotNull(entry1);
            assertEquals("file1.txt", entry1.getName());
            assertEquals(contents[0].length, entry1.getSize());
            assertEquals(1, in.available());

            byte[] buf1 = new byte[contents[0].length];
            int read1 = in.read(buf1, 0, buf1.length);
            assertEquals(contents[0].length, read1);
            assertArrayEquals(contents[0], buf1);

            assertEquals(-1, in.read(buf1, 0, buf1.length));
            assertEquals(0, in.available());

            CpioArchiveEntry entry2 = in.getNextEntry();
            assertNotNull(entry2);
            assertEquals("file2.txt", entry2.getName());

            byte[] buf2 = new byte[contents[1].length];
            int read2 = in.read(buf2, 0, buf2.length);
            assertEquals(contents[1].length, read2);
            assertArrayEquals(contents[1], buf2);

            assertNull(in.getNextCPIOEntry());
        }
    }

    @Test
    public void testReadNewCrcFormat_validCrc_success() throws IOException {
        String[] names = {"crc_test.txt"};
        byte[][] contents = {"Testing CRC32 content integrity".getBytes(StandardCharsets.UTF_8)};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW_CRC, names, contents);

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData))) {
            CpioArchiveEntry entry = in.getNextCPIOEntry();
            assertNotNull(entry);
            assertEquals(CpioConstants.FORMAT_NEW_CRC, entry.getFormat());

            byte[] readBuf = new byte[100];
            int bytesRead = in.read(readBuf, 0, readBuf.length);
            assertEquals(contents[0].length, bytesRead);

            assertEquals(-1, in.read(readBuf, 0, readBuf.length));
            assertNull(in.getNextCPIOEntry());
        }
    }

    @Test(expected = IOException.class)
    public void testReadNewCrcFormat_invalidCrc_throwsException() throws IOException {
        String[] names = {"crc_bad.txt"};
        byte[][] contents = {"Original Content".getBytes(StandardCharsets.UTF_8)};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW_CRC, names, contents);

        int contentIndex = -1;
        byte[] orig = "Original Content".getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < archiveData.length - orig.length; i++) {
            boolean match = true;
            for (int j = 0; j < orig.length; j++) {
                if (archiveData[i + j] != orig[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                contentIndex = i;
                break;
            }
        }
        assertTrue("Content pattern should be found in archive", contentIndex != -1);
        archiveData[contentIndex] = (byte) (archiveData[contentIndex] ^ 0xFF);

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData))) {
            CpioArchiveEntry entry = in.getNextCPIOEntry();
            assertNotNull(entry);
            byte[] buf = new byte[contents[0].length];
            in.read(buf, 0, buf.length);
            in.read(buf, 0, buf.length);
        }
    }

    @Test
    public void testReadOldAsciiFormat_success() throws IOException {
        String[] names = {"old_ascii.txt"};
        byte[][] contents = {"Old Ascii Content".getBytes(StandardCharsets.UTF_8)};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_OLD_ASCII, names, contents);

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData))) {
            CpioArchiveEntry entry = in.getNextCPIOEntry();
            assertNotNull(entry);
            assertEquals("old_ascii.txt", entry.getName());
            assertEquals(CpioConstants.FORMAT_OLD_ASCII, entry.getFormat());

            byte[] buf = new byte[contents[0].length];
            int read = in.read(buf, 0, buf.length);
            assertEquals(contents[0].length, read);
            assertArrayEquals(contents[0], buf);
            assertNull(in.getNextCPIOEntry());
        }
    }

    @Test
    public void testReadOldBinaryFormat_success() throws IOException {
        String[] names = {"old_bin.txt"};
        byte[][] contents = {"Old Binary Content".getBytes(StandardCharsets.UTF_8)};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_OLD_BINARY, names, contents);

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData))) {
            CpioArchiveEntry entry = in.getNextCPIOEntry();
            assertNotNull(entry);
            assertEquals("old_bin.txt", entry.getName());
            assertEquals(CpioConstants.FORMAT_OLD_BINARY, entry.getFormat());

            byte[] buf = new byte[contents[0].length];
            int read = in.read(buf, 0, buf.length);
            assertEquals(contents[0].length, read);
            assertArrayEquals(contents[0], buf);
            assertNull(in.getNextCPIOEntry());
        }
    }

    @Test
    public void testReadOldBinaryFormat_swappedHalfWord_success() throws IOException {
        String[] names = {"swap_bin.txt"};
        byte[][] contents = {"Swapped Binary".getBytes(StandardCharsets.UTF_8)};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_OLD_BINARY, names, contents);

        byte b0 = archiveData[0];
        byte b1 = archiveData[1];
        archiveData[0] = b1;
        archiveData[1] = b0;

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData))) {
            CpioArchiveEntry entry = in.getNextCPIOEntry();
            assertNotNull(entry);
            assertEquals(CpioConstants.FORMAT_OLD_BINARY, entry.getFormat());
        }
    }

    @Test
    public void testReadImplicitCloseEntry_skipsUnreadData() throws IOException {
        String[] names = {"file1.txt", "file2.txt"};
        byte[][] contents = {
                "Large unread content 1234567890".getBytes(StandardCharsets.UTF_8),
                "Next file content".getBytes(StandardCharsets.UTF_8)
        };
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, names, contents);

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData))) {
            CpioArchiveEntry entry1 = in.getNextCPIOEntry();
            assertNotNull(entry1);
            assertEquals("file1.txt", entry1.getName());

            CpioArchiveEntry entry2 = in.getNextCPIOEntry();
            assertNotNull(entry2);
            assertEquals("file2.txt", entry2.getName());

            byte[] buf = new byte[contents[1].length];
            int read = in.read(buf, 0, buf.length);
            assertEquals(contents[1].length, read);
            assertArrayEquals(contents[1], buf);
        }
    }

    @Test
    public void testRead_boundariesAndEdgeCases() throws IOException {
        String[] names = {"test.txt"};
        byte[][] contents = {"Sample data".getBytes(StandardCharsets.UTF_8)};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, names, contents);

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData))) {
            assertEquals(-1, in.read(new byte[10], 0, 10));

            in.getNextCPIOEntry();

            assertEquals(0, in.read(new byte[10], 0, 0));

            try {
                in.read(new byte[10], -1, 5);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {}

            try {
                in.read(new byte[10], 0, -1);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {}

            try {
                in.read(new byte[10], 5, 6);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {}
        }
    }

    @Test
    public void testSkip_validAndEdgeCases() throws IOException {
        String[] names = {"bigfile.bin"};
        byte[] bigContent = new byte[10000];
        Arrays.fill(bigContent, (byte) 'A');
        byte[][] contents = {bigContent};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, names, contents);

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData))) {
            CpioArchiveEntry entry = in.getNextCPIOEntry();
            assertNotNull(entry);

            try {
                in.skip(-1);
                fail("Expected IllegalArgumentException on negative skip");
            } catch (IllegalArgumentException expected) {}

            long skippedFirst = in.skip(5000);
            assertEquals(5000, skippedFirst);

            long skippedSecond = in.skip(6000);
            assertEquals(5000, skippedSecond);

            assertEquals(0, in.skip(100));
        }
    }

    @Test(expected = IOException.class)
    public void testEnsureOpen_getNextEntryAfterClose() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.getNextEntry();
    }

    @Test(expected = IOException.class)
    public void testEnsureOpen_availableAfterClose() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.available();
    }

    @Test(expected = IOException.class)
    public void testEnsureOpen_readAfterClose() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.read(new byte[10], 0, 10);
    }

    @Test(expected = IOException.class)
    public void testEnsureOpen_skipAfterClose() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.skip(10);
    }

    @Test
    public void testClose_idempotent() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.close();
    }

    @Test(expected = IOException.class)
    public void testUnknownMagic_throwsIOException() throws IOException {
        byte[] badMagic = "999999".getBytes(StandardCharsets.US_ASCII);
        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(badMagic))) {
            in.getNextCPIOEntry();
        }
    }

    @Test(expected = EOFException.class)
    public void testUnexpectedEOF_throwsEOFException() throws IOException {
        byte[] truncated = new byte[]{0x30};
        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(truncated))) {
            in.getNextCPIOEntry();
        }
    }

    @Test(expected = IOException.class)
    public void testMode0NotTrailer_newFormat_throwsIOException() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("070701"); // magic
        sb.append("00000000"); // ino
        sb.append("00000000"); // mode = 0
        sb.append("00000000"); // uid
        sb.append("00000000"); // gid
        sb.append("00000001"); // nlink
        sb.append("00000000"); // mtime
        sb.append("00000000"); // filesize
        sb.append("00000000"); // devmajor
        sb.append("00000000"); // devminor
        sb.append("00000000"); // rdevmajor
        sb.append("00000000"); // rdevminor
        sb.append("00000005"); // namesize = 5 ("test\0")
        sb.append("00000000"); // chksum
        sb.append("test\0");   // name
        sb.append("\0\0\0");   // pad

        byte[] raw = sb.toString().getBytes(StandardCharsets.US_ASCII);
        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(raw))) {
            in.getNextCPIOEntry();
        }
    }

    @Test(expected = IOException.class)
    public void testMode0NotTrailer_oldAsciiFormat_throwsIOException() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("070707"); // magic
        sb.append("000000"); // dev
        sb.append("000000"); // ino
        sb.append("000000"); // mode = 0
        sb.append("000000"); // uid
        sb.append("000000"); // gid
        sb.append("000001"); // nlink
        sb.append("000000"); // rdev
        sb.append("00000000000"); // mtime (11 chars)
        sb.append("000005"); // namesize = 5
        sb.append("00000000000"); // filesize (11 chars)
        sb.append("test\0");

        byte[] raw = sb.toString().getBytes(StandardCharsets.US_ASCII);
        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(raw))) {
            in.getNextCPIOEntry();
        }
    }

    @Test(expected = IOException.class)
    public void testMode0NotTrailer_oldBinaryFormat_throwsIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{0x71, (byte) 0xc7}); // magic
        baos.write(new byte[]{0, 0}); // dev
        baos.write(new byte[]{0, 0}); // ino
        baos.write(new byte[]{0, 0}); // mode = 0
        baos.write(new byte[]{0, 0}); // uid
        baos.write(new byte[]{0, 0}); // gid
        baos.write(new byte[]{0, 1}); // nlink
        baos.write(new byte[]{0, 0}); // rdev
        baos.write(new byte[]{0, 0, 0, 0}); // mtime
        baos.write(new byte[]{0, 5}); // namesize = 5
        baos.write(new byte[]{0, 0, 0, 0}); // filesize
        baos.write("test\0\0".getBytes(StandardCharsets.US_ASCII)); // name + pad

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            in.getNextCPIOEntry();
        }
    }

    @Test
    public void testCustomBlockSize_skipsRemainder() throws IOException {
        String[] names = {"file.txt"};
        byte[][] contents = {"Small".getBytes(StandardCharsets.UTF_8)};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, names, contents);

        try (CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData), 512)) {
            assertNotNull(in.getNextCPIOEntry());
            assertNull(in.getNextCPIOEntry());
        }
    }

    @Test
    public void testMatches_allBranches() {
        assertFalse(CpioArchiveInputStream.matches(new byte[5], 5));

        assertTrue(CpioArchiveInputStream.matches(new byte[]{0x71, (byte) 0xc7, 0, 0, 0, 0}, 6));
        assertTrue(CpioArchiveInputStream.matches(new byte[]{(byte) 0xc7, 0x71, 0, 0, 0, 0}, 6));

        assertTrue(CpioArchiveInputStream.matches("070701".getBytes(StandardCharsets.US_ASCII), 6));
        assertTrue(CpioArchiveInputStream.matches("070702".getBytes(StandardCharsets.US_ASCII), 6));
        assertTrue(CpioArchiveInputStream.matches("070707".getBytes(StandardCharsets.US_ASCII), 6));

        assertFalse(CpioArchiveInputStream.matches("170701".getBytes(StandardCharsets.US_ASCII), 6));
        assertFalse(CpioArchiveInputStream.matches("080701".getBytes(StandardCharsets.US_ASCII), 6));
        assertFalse(CpioArchiveInputStream.matches("071701".getBytes(StandardCharsets.US_ASCII), 6));
        assertFalse(CpioArchiveInputStream.matches("070801".getBytes(StandardCharsets.US_ASCII), 6));
        assertFalse(CpioArchiveInputStream.matches("070711".getBytes(StandardCharsets.US_ASCII), 6));
        assertFalse(CpioArchiveInputStream.matches("070708".getBytes(StandardCharsets.US_ASCII), 6));
    }
}
