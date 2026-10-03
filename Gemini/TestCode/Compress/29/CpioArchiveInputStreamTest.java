package org.apache.commons.compress.archivers.cpio;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class CpioArchiveInputStreamTest {

    private byte[] createArchive(short format, int blockSize, String encoding, String[] names, byte[][] contents) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, format, blockSize, encoding);
        for (int i = 0; i < names.length; i++) {
            CpioArchiveEntry entry = new CpioArchiveEntry(format, names[i]);
            entry.setMode(CpioConstants.C_ISREG | 0644);
            byte[] content = contents[i] != null ? contents[i] : new byte[0];
            entry.setSize(content.length);
            if (format == CpioConstants.FORMAT_NEW_CRC) {
                long crc = 0;
                for (byte b : content) {
                    crc += (b & 0xFF);
                }
                entry.setChksum(crc);
            }
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
    public void testConstructors() throws IOException {
        byte[] empty = new byte[0];

        CpioArchiveInputStream in1 = new CpioArchiveInputStream(new ByteArrayInputStream(empty));
        Assert.assertNotNull(in1);
        in1.close();

        CpioArchiveInputStream in2 = new CpioArchiveInputStream(new ByteArrayInputStream(empty), CharsetNames.UTF_8);
        Assert.assertNotNull(in2);
        in2.close();

        CpioArchiveInputStream in3 = new CpioArchiveInputStream(new ByteArrayInputStream(empty), 1024);
        Assert.assertNotNull(in3);
        in3.close();

        CpioArchiveInputStream in4 = new CpioArchiveInputStream(new ByteArrayInputStream(empty), 1024, CharsetNames.UTF_8);
        Assert.assertNotNull(in4);
        in4.close();
    }

    @Test
    public void testReadFormatNew() throws IOException {
        String[] names = new String[]{"file1.txt", "file2.txt"};
        byte[][] contents = new byte[][]{"Hello World".getBytes(), "Apache Commons Compress".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, CpioConstants.BLOCK_SIZE, CharsetNames.US_ASCII, names, contents);

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        
        CpioArchiveEntry entry1 = in.getNextCPIOEntry();
        Assert.assertNotNull(entry1);
        Assert.assertEquals("file1.txt", entry1.getName());
        Assert.assertEquals(1, in.available());
        byte[] buf = new byte[contents[0].length];
        int read = in.read(buf, 0, buf.length);
        Assert.assertEquals(contents[0].length, read);
        Assert.assertArrayEquals(contents[0], buf);
        Assert.assertEquals(-1, in.read(buf, 0, buf.length));
        Assert.assertEquals(0, in.available());

        ArchiveEntry entry2 = in.getNextEntry();
        Assert.assertNotNull(entry2);
        Assert.assertEquals("file2.txt", entry2.getName());
        byte[] buf2 = new byte[contents[1].length];
        read = in.read(buf2, 0, buf2.length);
        Assert.assertEquals(contents[1].length, read);
        Assert.assertArrayEquals(contents[1], buf2);

        Assert.assertNull(in.getNextEntry());
        in.close();
    }

    @Test
    public void testReadFormatNewCrc() throws IOException {
        String[] names = new String[]{"crc.txt"};
        byte[][] contents = new byte[][]{"Check CRC bytes".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW_CRC, CpioConstants.BLOCK_SIZE, CharsetNames.US_ASCII, names, contents);

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("crc.txt", entry.getName());
        byte[] buf = new byte[contents[0].length];
        int read = in.read(buf, 0, buf.length);
        Assert.assertEquals(contents[0].length, read);
        Assert.assertArrayEquals(contents[0], buf);
        Assert.assertEquals(-1, in.read(buf, 0, buf.length));
        Assert.assertNull(in.getNextCPIOEntry());
        in.close();
    }

    @Test
    public void testReadFormatOldAscii() throws IOException {
        String[] names = new String[]{"old_ascii.txt"};
        byte[][] contents = new byte[][]{"Old ASCII format data".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_OLD_ASCII, CpioConstants.BLOCK_SIZE, CharsetNames.US_ASCII, names, contents);

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("old_ascii.txt", entry.getName());
        byte[] buf = new byte[contents[0].length];
        int read = in.read(buf, 0, buf.length);
        Assert.assertEquals(contents[0].length, read);
        Assert.assertArrayEquals(contents[0], buf);
        Assert.assertEquals(-1, in.read(buf, 0, buf.length));
        Assert.assertNull(in.getNextCPIOEntry());
        in.close();
    }

    @Test
    public void testReadFormatOldBinary() throws IOException {
        String[] names = new String[]{"old_bin.txt"};
        byte[][] contents = new byte[][]{"Old Binary format data".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_OLD_BINARY, CpioConstants.BLOCK_SIZE, CharsetNames.US_ASCII, names, contents);

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("old_bin.txt", entry.getName());
        byte[] buf = new byte[contents[0].length];
        int read = in.read(buf, 0, buf.length);
        Assert.assertEquals(contents[0].length, read);
        Assert.assertArrayEquals(contents[0], buf);
        Assert.assertEquals(-1, in.read(buf, 0, buf.length));
        Assert.assertNull(in.getNextCPIOEntry());
        in.close();
    }

    @Test
    public void testReadOldBinarySwapped() throws IOException {
        String[] names = new String[]{"swapped.bin"};
        byte[][] contents = new byte[][]{"Binary data swapped".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_OLD_BINARY, CpioConstants.BLOCK_SIZE, CharsetNames.US_ASCII, names, contents);

        byte[] swappedData = Arrays.copyOf(archiveData, archiveData.length);
        for (int i = 0; i < 26; i += 2) {
            byte tmp = swappedData[i];
            swappedData[i] = swappedData[i + 1];
            swappedData[i + 1] = tmp;
        }

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(swappedData));
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        Assert.assertNotNull(entry);
        in.close();
    }

    @Test
    public void testSkipWithoutReading() throws IOException {
        String[] names = new String[]{"skip1.txt", "skip2.txt"};
        byte[][] contents = new byte[][]{"Data inside skip1".getBytes(), "Data inside skip2".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, 512, CharsetNames.US_ASCII, names, contents);

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        CpioArchiveEntry entry1 = in.getNextCPIOEntry();
        Assert.assertNotNull(entry1);
        Assert.assertEquals("skip1.txt", entry1.getName());

        CpioArchiveEntry entry2 = in.getNextCPIOEntry();
        Assert.assertNotNull(entry2);
        Assert.assertEquals("skip2.txt", entry2.getName());

        byte[] buf = new byte[contents[1].length];
        int read = in.read(buf);
        Assert.assertEquals(contents[1].length, read);
        Assert.assertArrayEquals(contents[1], buf);

        Assert.assertNull(in.getNextCPIOEntry());
        in.close();
    }

    @Test
    public void testPartialSkip() throws IOException {
        String[] names = new String[]{"skip_partial.txt"};
        byte[][] contents = new byte[][]{"1234567890abcdefghij".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, 512, CharsetNames.US_ASCII, names, contents);

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        Assert.assertNotNull(entry);

        long skipped = in.skip(5);
        Assert.assertEquals(5, skipped);
        byte[] buf = new byte[5];
        int read = in.read(buf, 0, 5);
        Assert.assertEquals(5, read);
        Assert.assertEquals("67890", new String(buf));

        long skippedRest = in.skip(100);
        Assert.assertEquals(10, skippedRest);
        Assert.assertEquals(-1, in.read());

        in.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeThrowsException() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.skip(-1);
        } finally {
            in.close();
        }
    }

    @Test
    public void testSkipZero() throws IOException {
        String[] names = new String[]{"zero_skip.txt"};
        byte[][] contents = new byte[][]{"data".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, 512, CharsetNames.US_ASCII, names, contents);

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        in.getNextCPIOEntry();
        long skipped = in.skip(0);
        Assert.assertEquals(0, skipped);
        in.close();
    }

    @Test
    public void testReadBoundaries() throws IOException {
        String[] names = new String[]{"bound.txt"};
        byte[][] contents = new byte[][]{"testing read boundaries".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW, 512, CharsetNames.US_ASCII, names, contents);

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        
        Assert.assertEquals(-1, in.read(new byte[10], 0, 10));

        in.getNextCPIOEntry();

        Assert.assertEquals(0, in.read(new byte[10], 0, 0));

        try {
            in.read(new byte[10], -1, 5);
            Assert.fail("Should throw IndexOutOfBoundsException for negative offset");
        } catch (IndexOutOfBoundsException expected) {
        }

        try {
            in.read(new byte[10], 0, -1);
            Assert.fail("Should throw IndexOutOfBoundsException for negative length");
        } catch (IndexOutOfBoundsException expected) {
        }

        try {
            in.read(new byte[10], 5, 6);
            Assert.fail("Should throw IndexOutOfBoundsException for offset + length > buf.length");
        } catch (IndexOutOfBoundsException expected) {
        }

        in.close();
    }

    @Test(expected = IOException.class)
    public void testAvailableAfterCloseThrowsException() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.available();
    }

    @Test(expected = IOException.class)
    public void testGetNextEntryAfterCloseThrowsException() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.getNextCPIOEntry();
    }

    @Test(expected = IOException.class)
    public void testReadAfterCloseThrowsException() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.read(new byte[10], 0, 10);
    }

    @Test(expected = IOException.class)
    public void testSkipAfterCloseThrowsException() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.skip(5);
    }

    @Test
    public void testDoubleCloseDoesNotThrow() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.close();
    }

    @Test(expected = IOException.class)
    public void testUnknownMagicThrowsException() throws IOException {
        byte[] badMagic = "UNKNOWN_MAGIC_HEADER".getBytes();
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(badMagic));
        try {
            in.getNextCPIOEntry();
        } finally {
            in.close();
        }
    }

    @Test(expected = EOFException.class)
    public void testTruncatedStreamThrowsEOFException() throws IOException {
        byte[] truncated = new byte[]{0x30, 0x37};
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(truncated));
        try {
            in.getNextCPIOEntry();
        } finally {
            in.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCrcErrorThrowsException() throws IOException {
        String[] names = new String[]{"crc_corrupt.txt"};
        byte[][] contents = new byte[][]{"CRC corrupt data".getBytes()};
        byte[] archiveData = createArchive(CpioConstants.FORMAT_NEW_CRC, 512, CharsetNames.US_ASCII, names, contents);

        for (int i = 0; i < archiveData.length - 5; i++) {
            if (archiveData[i] == 'C' && archiveData[i + 1] == 'R' && archiveData[i + 2] == 'C') {
                archiveData[i] = 'X';
                break;
            }
        }

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        try {
            CpioArchiveEntry entry = in.getNextCPIOEntry();
            Assert.assertNotNull(entry);
            byte[] buf = new byte[contents[0].length];
            in.read(buf, 0, buf.length);
            in.read(buf, 0, buf.length);
        } finally {
            in.close();
        }
    }

    @Test(expected = IOException.class)
    public void testModeZeroNonTrailerNewFormatThrowsException() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(CpioConstants.MAGIC_NEW);
        sb.append("00000000"); // inode
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

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(sb.toString().getBytes()));
        try {
            in.getNextCPIOEntry();
        } finally {
            in.close();
        }
    }

    @Test(expected = IOException.class)
    public void testModeZeroNonTrailerOldAsciiFormatThrowsException() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(CpioConstants.MAGIC_OLD_ASCII);
        sb.append("000000"); // dev
        sb.append("000000"); // ino
        sb.append("000000"); // mode = 0
        sb.append("000000"); // uid
        sb.append("000000"); // gid
        sb.append("000001"); // nlink
        sb.append("000000"); // rdev
        sb.append("00000000000"); // mtime
        sb.append("000005"); // namesize = 5 ("test\0")
        sb.append("00000000000"); // filesize
        sb.append("test\0"); // name

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(sb.toString().getBytes()));
        try {
            in.getNextCPIOEntry();
        } finally {
            in.close();
        }
    }

    @Test(expected = IOException.class)
    public void testModeZeroNonTrailerOldBinaryFormatThrowsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{(byte) 0xC7, 0x71}); // MAGIC_OLD_BINARY (070707)
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
        baos.write("test\0".getBytes()); // name
        baos.write(new byte[]{0}); // pad

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        try {
            in.getNextCPIOEntry();
        } finally {
            in.close();
        }
    }

    @Test
    public void testMatches() {
        Assert.assertFalse(CpioArchiveInputStream.matches(new byte[]{0, 0, 0, 0, 0}, 5));

        byte[] oldBinaryLE = new byte[]{(byte) 0xC7, 0x71, 0, 0, 0, 0};
        Assert.assertTrue(CpioArchiveInputStream.matches(oldBinaryLE, 6));

        byte[] oldBinaryBE = new byte[]{0x71, (byte) 0xC7, 0, 0, 0, 0};
        Assert.assertTrue(CpioArchiveInputStream.matches(oldBinaryBE, 6));

        byte[] magicNew = "070701".getBytes();
        Assert.assertTrue(CpioArchiveInputStream.matches(magicNew, 6));

        byte[] magicNewCrc = "070702".getBytes();
        Assert.assertTrue(CpioArchiveInputStream.matches(magicNewCrc, 6));

        byte[] magicOldAscii = "070707".getBytes();
        Assert.assertTrue(CpioArchiveInputStream.matches(magicOldAscii, 6));

        byte[] badByte0 = "170701".getBytes();
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte0, 6));

        byte[] badByte1 = "080701".getBytes();
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte1, 6));

        byte[] badByte2 = "071701".getBytes();
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte2, 6));

        byte[] badByte3 = "070801".getBytes();
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte3, 6));

        byte[] badByte4 = "070711".getBytes();
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte4, 6));

        byte[] badByte5 = "070709".getBytes();
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte5, 6));
    }
}
