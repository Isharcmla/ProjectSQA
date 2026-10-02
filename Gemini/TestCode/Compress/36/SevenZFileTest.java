package org.apache.commons.compress.archivers.sevenz;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.BitSet;
import java.util.Iterator;
import java.util.zip.CRC32;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class SevenZFileTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    private File createArchiveFile(final byte[] packData, final byte[] nextHeader) throws IOException {
        final byte[] archiveBytes = build7zData(packData, nextHeader);
        final File file = temporaryFolder.newFile();
        final FileOutputStream fos = new FileOutputStream(file);
        try {
            fos.write(archiveBytes);
        } finally {
            fos.close();
        }
        return file;
    }

    private byte[] build7zData(final byte[] packData, final byte[] nextHeader) {
        final int packLen = packData == null ? 0 : packData.length;
        final int headerLen = nextHeader == null ? 0 : nextHeader.length;

        final CRC32 headerCrc = new CRC32();
        if (nextHeader != null) {
            headerCrc.update(nextHeader);
        }
        final long nextHeaderCrcVal = headerCrc.getValue();

        final ByteBuffer startHeaderBuf = ByteBuffer.allocate(20).order(ByteOrder.LITTLE_ENDIAN);
        startHeaderBuf.putLong(packLen);
        startHeaderBuf.putLong(headerLen);
        startHeaderBuf.putInt((int) nextHeaderCrcVal);
        final byte[] startHeader = startHeaderBuf.array();

        final CRC32 startHeaderCrc = new CRC32();
        startHeaderCrc.update(startHeader);
        final long startHeaderCrcVal = startHeaderCrc.getValue();

        final ByteBuffer mainHeaderBuf = ByteBuffer.allocate(32).order(ByteOrder.LITTLE_ENDIAN);
        mainHeaderBuf.put(SevenZFile.sevenZSignature);
        mainHeaderBuf.put((byte) 0);
        mainHeaderBuf.put((byte) 4);
        mainHeaderBuf.putInt((int) startHeaderCrcVal);
        mainHeaderBuf.put(startHeader);

        final byte[] result = new byte[32 + packLen + headerLen];
        System.arraycopy(mainHeaderBuf.array(), 0, result, 0, 32);
        if (packLen > 0) {
            System.arraycopy(packData, 0, result, 32, packLen);
        }
        if (headerLen > 0) {
            System.arraycopy(nextHeader, 0, result, 32 + packLen, headerLen);
        }
        return result;
    }

    private byte[] createEmptyFilesHeader() {
        return new byte[] {
            (byte) NID.kHeader,
            (byte) NID.kFilesInfo,
            0x00, // numFiles = 0
            0x00, // end of properties
            (byte) NID.kEnd
        };
    }

    @Test
    public void testMatches_validAndInvalidSignatures() {
        final byte[] validSig = new byte[] { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };
        final byte[] longerSig = new byte[] { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C, 0x00, 0x01 };
        final byte[] invalidSig = new byte[] { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x00 };
        final byte[] shortSig = new byte[] { '7', 'z', (byte) 0xBC };

        assertTrue(SevenZFile.matches(validSig, validSig.length));
        assertTrue(SevenZFile.matches(longerSig, longerSig.length));
        assertFalse(SevenZFile.matches(invalidSig, invalidSig.length));
        assertFalse(SevenZFile.matches(shortSig, shortSig.length));
        assertFalse(SevenZFile.matches(validSig, 5));
    }

    @Test
    public void testConstructor_badSignature_throwsIOException() throws Exception {
        final File file = temporaryFolder.newFile();
        final FileOutputStream fos = new FileOutputStream(file);
        fos.write(new byte[] { 'B', 'A', 'D', 'S', 'I', 'G', 0, 0 });
        fos.close();

        try {
            new SevenZFile(file);
            fail("Expected IOException for bad signature");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("Bad 7z signature"));
        }
    }

    @Test
    public void testConstructor_unsupportedVersion_throwsIOException() throws Exception {
        final byte[] data = build7zData(null, createEmptyFilesHeader());
        data[6] = 1; // Major version = 1 (unsupported)

        final File file = temporaryFolder.newFile();
        final FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();

        try {
            new SevenZFile(file);
            fail("Expected IOException for unsupported version");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("Unsupported 7z version"));
        }
    }

    @Test
    public void testConstructor_startHeaderCrcMismatch_throwsIOException() throws Exception {
        final byte[] data = build7zData(null, createEmptyFilesHeader());
        data[8] ^= 0xFF; // Corrupt startHeader CRC

        final File file = temporaryFolder.newFile();
        final FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();

        try {
            new SevenZFile(file);
            fail("Expected IOException for CRC mismatch");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("CRC") || e.getMessage().contains("mismatch"));
        }
    }

    @Test
    public void testConstructor_nextHeaderCrcMismatch_throwsIOException() throws Exception {
        final byte[] data = build7zData(null, createEmptyFilesHeader());
        data[data.length - 1] ^= 0xFF; // Corrupt next header content

        final File file = temporaryFolder.newFile();
        final FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();

        try {
            new SevenZFile(file);
            fail("Expected IOException for NextHeader CRC mismatch");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("NextHeader CRC mismatch"));
        }
    }

    @Test
    public void testConstructor_noHeaderNid_throwsIOException() throws Exception {
        final byte[] invalidHeader = new byte[] {
            (byte) NID.kArchiveProperties, // Unexpected root NID (not kHeader)
            0x00
        };
        final File file = createArchiveFile(null, invalidHeader);

        try {
            new SevenZFile(file);
            fail("Expected IOException for missing kHeader");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("Broken or unsupported archive: no Header"));
        }
    }

    @Test
    public void testEmptyArchive_success() throws Exception {
        final File file = createArchiveFile(null, createEmptyFilesHeader());
        final SevenZFile sevenZFile = new SevenZFile(file);

        assertNull(sevenZFile.getNextEntry());
        final Iterable<SevenZArchiveEntry> entries = sevenZFile.getEntries();
        assertNotNull(entries);
        assertFalse(entries.iterator().hasNext());
        assertNotNull(sevenZFile.toString());

        sevenZFile.close();
        // Idempotent close
        sevenZFile.close();
    }

    @Test
    public void testConstructor_withPassword_success() throws Exception {
        final File file = createArchiveFile(null, createEmptyFilesHeader());
        final byte[] password = new byte[] { 'p', 0, 'a', 0, 's', 0, 's', 0 };
        final SevenZFile sevenZFile = new SevenZFile(file, password);

        assertNull(sevenZFile.getNextEntry());
        sevenZFile.close();
    }

    @Test
    public void testReadWithoutEntry_throwsIllegalStateException() throws Exception {
        final File file = createArchiveFile(null, createEmptyFilesHeader());
        final SevenZFile sevenZFile = new SevenZFile(file);

        try {
            sevenZFile.read();
            fail("Expected IllegalStateException when reading without entry");
        } catch (final IllegalStateException expected) {
            // Success
        }

        try {
            sevenZFile.read(new byte[10]);
            fail("Expected IllegalStateException when reading without entry");
        } catch (final IllegalStateException expected) {
            // Success
        }

        try {
            sevenZFile.read(new byte[10], 0, 5);
            fail("Expected IllegalStateException when reading without entry");
        } catch (final IllegalStateException expected) {
            // Success
        }

        sevenZFile.close();
    }

    @Test
    public void testArchiveWithEmptyDirectoryAndEmptyFile() throws Exception {
        final ByteArrayOutputStream headerOut = new ByteArrayOutputStream();
        headerOut.write(NID.kHeader);
        headerOut.write(NID.kFilesInfo);
        headerOut.write(2); // numFiles = 2

        // kEmptyStream: both files have no stream
        headerOut.write(NID.kEmptyStream);
        headerOut.write(1); // 1 byte size
        headerOut.write(0xC0); // bits: 1 1 0 0 0 0 0 0 (both empty streams)

        // kEmptyFile: first is directory (0), second is empty file (1)
        headerOut.write(NID.kEmptyFile);
        headerOut.write(1); // 1 byte size
        headerOut.write(0x40); // bits: 0 1 0 0 0 0 0 0

        // kAnti: not anti
        headerOut.write(NID.kAnti);
        headerOut.write(1);
        headerOut.write(0x00);

        // kName: "dir\0file\0" in UTF-16LE
        final ByteArrayOutputStream namesOut = new ByteArrayOutputStream();
        namesOut.write("d".getBytes("UTF-16LE"));
        namesOut.write(0);
        namesOut.write(0);
        namesOut.write("f".getBytes("UTF-16LE"));
        namesOut.write(0);
        namesOut.write(0);
        final byte[] namesBytes = namesOut.toByteArray();

        headerOut.write(NID.kName);
        headerOut.write(namesBytes.length + 1); // size uint64
        headerOut.write(0x00); // external = 0
        headerOut.write(namesBytes);

        headerOut.write(0x00); // end of files properties
        headerOut.write(NID.kEnd); // end of header

        final File file = createArchiveFile(null, headerOut.toByteArray());
        final SevenZFile sevenZFile = new SevenZFile(file);

        final SevenZArchiveEntry dirEntry = sevenZFile.getNextEntry();
        assertNotNull(dirEntry);
        assertEquals("d", dirEntry.getName());
        assertTrue(dirEntry.isDirectory());
        assertFalse(dirEntry.hasStream());
        assertEquals(0, dirEntry.getSize());

        final SevenZArchiveEntry fileEntry = sevenZFile.getNextEntry();
        assertNotNull(fileEntry);
        assertEquals("f", fileEntry.getName());
        assertFalse(fileEntry.isDirectory());
        assertFalse(fileEntry.hasStream());
        assertEquals(0, fileEntry.getSize());

        assertNull(sevenZFile.getNextEntry());
        sevenZFile.close();
    }

    @Test
    public void testArchiveWithCopyStream_readMethods() throws Exception {
        final byte[] content = new byte[] { 'H', 'e', 'l', 'l', 'o' };

        final ByteArrayOutputStream headerOut = new ByteArrayOutputStream();
        headerOut.write(NID.kHeader);

        // kMainStreamsInfo
        headerOut.write(NID.kMainStreamsInfo);

        // kPackInfo
        headerOut.write(NID.kPackInfo);
        headerOut.write(0x00); // packPos = 0
        headerOut.write(0x01); // numPackStreams = 1
        headerOut.write(NID.kSize);
        headerOut.write(content.length); // packSize
        headerOut.write(NID.kEnd);

        // kUnpackInfo
        headerOut.write(NID.kUnpackInfo);
        headerOut.write(NID.kFolder);
        headerOut.write(0x01); // numFolders = 1
        headerOut.write(0x00); // external = 0

        // Folder 0
        headerOut.write(0x01); // numCoders = 1
        headerOut.write(0x01); // bits: idSize = 1, isSimple = true
        headerOut.write(0x00); // method: COPY (0x00)

        // kCodersUnpackSize
        headerOut.write(NID.kCodersUnpackSize);
        headerOut.write(content.length); // unpackSize
        headerOut.write(NID.kEnd);

        // kSubStreamsInfo
        headerOut.write(NID.kSubStreamsInfo);
        headerOut.write(NID.kEnd);

        headerOut.write(NID.kEnd); // End MainStreamsInfo

        // kFilesInfo
        headerOut.write(NID.kFilesInfo);
        headerOut.write(0x01); // numFiles = 1

        // kName: "test.txt\0"
        final ByteArrayOutputStream namesOut = new ByteArrayOutputStream();
        namesOut.write("t".getBytes("UTF-16LE"));
        namesOut.write(0);
        namesOut.write(0);
        final byte[] namesBytes = namesOut.toByteArray();

        headerOut.write(NID.kName);
        headerOut.write(namesBytes.length + 1);
        headerOut.write(0x00); // external
        headerOut.write(namesBytes);

        headerOut.write(0x00); // end of files properties
        headerOut.write(NID.kEnd); // End Header

        final File file = createArchiveFile(content, headerOut.toByteArray());
        final SevenZFile sevenZFile = new SevenZFile(file);

        final SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);
        assertEquals("t", entry.getName());
        assertEquals(content.length, entry.getSize());
        assertTrue(entry.hasStream());

        final int firstByte = sevenZFile.read();
        assertEquals('H', firstByte);

        final byte[] buf = new byte[3];
        final int readCount = sevenZFile.read(buf);
        assertEquals(3, readCount);
        assertArrayEquals(new byte[] { 'e', 'l', 'l' }, buf);

        final byte[] lastBuf = new byte[2];
        final int lastReadCount = sevenZFile.read(lastBuf, 0, 2);
        assertEquals(1, lastReadCount);
        assertEquals('o', lastBuf[0]);

        final int eof = sevenZFile.read();
        assertEquals(-1, eof);

        assertNull(sevenZFile.getNextEntry());
        sevenZFile.close();
    }

    @Test
    public void testArchiveWithAllFileProperties() throws Exception {
        final ByteArrayOutputStream headerOut = new ByteArrayOutputStream();
        headerOut.write(NID.kHeader);

        // kArchiveProperties
        headerOut.write(NID.kArchiveProperties);
        headerOut.write(0x01); // property id
        headerOut.write(0x01); // size
        headerOut.write(0xAA); // prop byte
        headerOut.write(0x00); // end archive properties

        // kFilesInfo
        headerOut.write(NID.kFilesInfo);
        headerOut.write(0x01); // 1 file

        // kName
        final ByteArrayOutputStream namesOut = new ByteArrayOutputStream();
        namesOut.write("a".getBytes("UTF-16LE"));
        namesOut.write(0);
        namesOut.write(0);
        final byte[] namesBytes = namesOut.toByteArray();
        headerOut.write(NID.kName);
        headerOut.write(namesBytes.length + 1);
        headerOut.write(0x00);
        headerOut.write(namesBytes);

        // kCTime
        headerOut.write(NID.kCTime);
        headerOut.write(10); // size
        headerOut.write(0x01); // allDefined = 1
        headerOut.write(0x00); // external = 0
        final ByteBuffer cTimeBuf = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(1000L);
        headerOut.write(cTimeBuf.array());

        // kATime
        headerOut.write(NID.kATime);
        headerOut.write(10);
        headerOut.write(0x01); // allDefined = 1
        headerOut.write(0x00);
        final ByteBuffer aTimeBuf = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(2000L);
        headerOut.write(aTimeBuf.array());

        // kMTime
        headerOut.write(NID.kMTime);
        headerOut.write(10);
        headerOut.write(0x01); // allDefined = 1
        headerOut.write(0x00);
        final ByteBuffer mTimeBuf = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(3000L);
        headerOut.write(mTimeBuf.array());

        // kWinAttributes
        headerOut.write(NID.kWinAttributes);
        headerOut.write(6);
        headerOut.write(0x01); // allDefined = 1
        headerOut.write(0x00);
        final ByteBuffer winBuf = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(0x20);
        headerOut.write(winBuf.array());

        // kDummy
        headerOut.write(NID.kDummy);
        headerOut.write(0x02); // size = 2
        headerOut.write(0x00);
        headerOut.write(0x00);

        // Unknown property
        headerOut.write(0x7F);
        headerOut.write(0x01); // size = 1
        headerOut.write(0x12);

        headerOut.write(0x00); // End of files properties
        headerOut.write(NID.kEnd); // End Header

        final File file = createArchiveFile(null, headerOut.toByteArray());
        final SevenZFile sevenZFile = new SevenZFile(file);

        final Iterator<SevenZArchiveEntry> iterator = sevenZFile.getEntries().iterator();
        assertTrue(iterator.hasNext());
        final SevenZArchiveEntry entry = iterator.next();
        assertEquals("a", entry.getName());
        assertTrue(entry.getHasCreationDate());
        assertTrue(entry.getHasAccessDate());
        assertTrue(entry.getHasLastModifiedDate());
        assertTrue(entry.getHasWindowsAttributes());
        assertEquals(0x20, entry.getWindowsAttributes());

        sevenZFile.close();
    }

    @Test
    public void testAdditionalStreamsInfo_throwsIOException() throws Exception {
        final byte[] header = new byte[] {
            (byte) NID.kHeader,
            (byte) NID.kAdditionalStreamsInfo,
            (byte) NID.kEnd
        };
        final File file = createArchiveFile(null, header);

        try {
            new SevenZFile(file);
            fail("Expected IOException for unsupported additional streams");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("Additional streams unsupported"));
        }
    }

    @Test
    public void testStartPosProperty_throwsIOException() throws Exception {
        final ByteArrayOutputStream headerOut = new ByteArrayOutputStream();
        headerOut.write(NID.kHeader);
        headerOut.write(NID.kFilesInfo);
        headerOut.write(0x01); // 1 file
        headerOut.write(NID.kStartPos);
        headerOut.write(0x01);
        headerOut.write(0x00);

        final File file = createArchiveFile(null, headerOut.toByteArray());

        try {
            new SevenZFile(file);
            fail("Expected IOException for unsupported kStartPos");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("kStartPos is unsupported"));
        }
    }

    @Test
    public void testEmptyFileBeforeEmptyStream_throwsIOException() throws Exception {
        final ByteArrayOutputStream headerOut = new ByteArrayOutputStream();
        headerOut.write(NID.kHeader);
        headerOut.write(NID.kFilesInfo);
        headerOut.write(0x01); // 1 file
        headerOut.write(NID.kEmptyFile); // kEmptyFile before kEmptyStream
        headerOut.write(0x01);
        headerOut.write(0x00);

        final File file = createArchiveFile(null, headerOut.toByteArray());

        try {
            new SevenZFile(file);
            fail("Expected IOException for kEmptyFile before kEmptyStream");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("kEmptyStream must appear before kEmptyFile"));
        }
    }

    @Test
    public void testAntiBeforeEmptyStream_throwsIOException() throws Exception {
        final ByteArrayOutputStream headerOut = new ByteArrayOutputStream();
        headerOut.write(NID.kHeader);
        headerOut.write(NID.kFilesInfo);
        headerOut.write(0x01); // 1 file
        headerOut.write(NID.kAnti); // kAnti before kEmptyStream
        headerOut.write(0x01);
        headerOut.write(0x00);

        final File file = createArchiveFile(null, headerOut.toByteArray());

        try {
            new SevenZFile(file);
            fail("Expected IOException for kAnti before kEmptyStream");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("kEmptyStream must appear before kAnti"));
        }
    }

    @Test
    public void testInvalidFileNameLength_throwsIOException() throws Exception {
        final ByteArrayOutputStream headerOut = new ByteArrayOutputStream();
        headerOut.write(NID.kHeader);
        headerOut.write(NID.kFilesInfo);
        headerOut.write(0x01);
        headerOut.write(NID.kName);
        headerOut.write(0x02); // size = 2 ((2-1) & 1 != 0 -> invalid odd length)
        headerOut.write(0x00);
        headerOut.write(0x00);

        final File file = createArchiveFile(null, headerOut.toByteArray());

        try {
            new SevenZFile(file);
            fail("Expected IOException for invalid file names length");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("File names length invalid"));
        }
    }

    @Test
    public void testBadlyTerminatedHeader_throwsIOException() throws Exception {
        final byte[] header = new byte[] {
            (byte) NID.kHeader,
            0x7E // invalid termination NID
        };
        final File file = createArchiveFile(null, header);

        try {
            new SevenZFile(file);
            fail("Expected IOException for badly terminated header");
        } catch (final IOException e) {
            assertTrue(e.getMessage().contains("Badly terminated header"));
        }
    }
}
