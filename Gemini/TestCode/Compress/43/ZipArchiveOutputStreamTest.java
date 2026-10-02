package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.SeekableInMemoryByteChannel;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

public class ZipArchiveOutputStreamTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testConstructor_outputStream_isNotSeekable() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            Assert.assertFalse(zaos.isSeekable());
            Assert.assertEquals(ZipArchiveOutputStream.DEFAULT_ENCODING, zaos.getEncoding());
        }
    }

    @Test
    public void testConstructor_file_isSeekable() throws IOException {
        File file = tempFolder.newFile("test_file.zip");
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(file)) {
            Assert.assertTrue(zaos.isSeekable());
        }
    }

    @Test
    public void testConstructor_seekableByteChannel_isSeekable() throws IOException {
        SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(channel)) {
            Assert.assertTrue(zaos.isSeekable());
        }
    }

    @Test
    public void testSetEncoding_andGetEncoding() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setEncoding("ISO-8859-1");
            Assert.assertEquals("ISO-8859-1", zaos.getEncoding());
            zaos.setEncoding(null);
            Assert.assertNull(zaos.getEncoding());
        }
    }

    @Test
    public void testSetUseLanguageEncodingFlag() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setEncoding("UTF-8");
            zaos.setUseLanguageEncodingFlag(true);
            zaos.setUseLanguageEncodingFlag(false);
            zaos.setEncoding("ISO-8859-1");
            zaos.setUseLanguageEncodingFlag(true);
        }
    }

    @Test
    public void testSetLevel_validAndInvalid() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setLevel(Deflater.NO_COMPRESSION);
            zaos.setLevel(Deflater.BEST_COMPRESSION);
            zaos.setLevel(Deflater.DEFAULT_COMPRESSION);

            try {
                zaos.setLevel(-2);
                Assert.fail("Expected IllegalArgumentException for level -2");
            } catch (IllegalArgumentException expected) {
            }

            try {
                zaos.setLevel(10);
                Assert.fail("Expected IllegalArgumentException for level 10");
            } catch (IllegalArgumentException expected) {
            }
        }
    }

    @Test
    public void testSetMethod_andSetComment() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setMethod(ZipArchiveOutputStream.STORED);
            zaos.setMethod(ZipArchiveOutputStream.DEFLATED);
            zaos.setComment("Archive Comment Test");
        }
    }

    @Test
    public void testSetCreateUnicodeExtraFields_andFallbackToUTF8() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER);
            zaos.setFallbackToUTF8(true);
            zaos.setFallbackToUTF8(false);
        }
    }

    @Test
    public void testCanWriteEntryData() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry zaeDeflated = new ZipArchiveEntry("test.txt");
            zaeDeflated.setMethod(ZipArchiveOutputStream.DEFLATED);
            Assert.assertTrue(zaos.canWriteEntryData(zaeDeflated));

            ZipArchiveEntry zaeStored = new ZipArchiveEntry("test_stored.txt");
            zaeStored.setMethod(ZipArchiveOutputStream.STORED);
            Assert.assertTrue(zaos.canWriteEntryData(zaeStored));

            ZipArchiveEntry zaeImploding = new ZipArchiveEntry("test_imp.txt");
            zaeImploding.setMethod(ZipMethod.IMPLODING.getCode());
            Assert.assertFalse(zaos.canWriteEntryData(zaeImploding));

            ZipArchiveEntry zaeUnshrinking = new ZipArchiveEntry("test_unshrink.txt");
            zaeUnshrinking.setMethod(ZipMethod.UNSHRINKING.getCode());
            Assert.assertFalse(zaos.canWriteEntryData(zaeUnshrinking));

            ArchiveEntry nonZipEntry = new ArchiveEntry() {
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
                public java.util.Date getLastModifiedDate() {
                    return new java.util.Date();
                }
            };
            Assert.assertFalse(zaos.canWriteEntryData(nonZipEntry));
        }
    }

    @Test
    public void testDeflatedEntry_outputStream_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("folder/file1.txt");
            entry.setComment("File comment");
            zaos.putArchiveEntry(entry);
            byte[] data = "Hello World! This is compressed content.".getBytes(StandardCharsets.UTF_8);
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            zaos.finish();
        }
        byte[] result = baos.toByteArray();
        Assert.assertTrue(result.length > 0);
    }

    @Test
    public void testStoredEntry_outputStream_success() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            byte[] data = "Uncompressed raw data content".getBytes(StandardCharsets.UTF_8);
            CRC32 crc = new CRC32();
            crc.update(data);

            ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(data.length);
            entry.setCrc(crc.getValue());

            zaos.putArchiveEntry(entry);
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
        }
    }

    @Test(expected = ZipException.class)
    public void testStoredEntry_outputStream_missingSize_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("stored_err.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            zaos.putArchiveEntry(entry);
        }
    }

    @Test(expected = ZipException.class)
    public void testStoredEntry_outputStream_missingCrc_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("stored_err.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(10);
            zaos.putArchiveEntry(entry);
        }
    }

    @Test(expected = ZipException.class)
    public void testStoredEntry_outputStream_badCrc_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            byte[] data = "TestData".getBytes(StandardCharsets.UTF_8);
            ZipArchiveEntry entry = new ZipArchiveEntry("bad_crc.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(data.length);
            entry.setCrc(12345L);

            zaos.putArchiveEntry(entry);
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
        }
    }

    @Test(expected = ZipException.class)
    public void testStoredEntry_outputStream_badSize_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            byte[] data = "TestData".getBytes(StandardCharsets.UTF_8);
            CRC32 crc = new CRC32();
            crc.update(data);

            ZipArchiveEntry entry = new ZipArchiveEntry("bad_size.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(data.length + 5);
            entry.setCrc(crc.getValue());

            zaos.putArchiveEntry(entry);
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
        }
    }

    @Test
    public void testStoredEntry_seekableChannel_sizeCalculatedAutomatically() throws IOException {
        SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(channel)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("seekable_stored.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            zaos.putArchiveEntry(entry);
            byte[] data = "Stored in seekable channel".getBytes(StandardCharsets.UTF_8);
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
        }
        Assert.assertTrue(channel.size() > 0);
    }

    @Test
    public void testZip64Mode_always() throws IOException {
        SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(channel)) {
            zaos.setUseZip64(Zip64Mode.Always);
            ZipArchiveEntry entry = new ZipArchiveEntry("z64_always.txt");
            zaos.putArchiveEntry(entry);
            zaos.write("ZIP64 test".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();
        }
    }

    @Test
    public void testZip64Mode_always_outputStream() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setUseZip64(Zip64Mode.Always);
            ZipArchiveEntry entry = new ZipArchiveEntry("z64_stream.txt");
            zaos.putArchiveEntry(entry);
            zaos.write("ZIP64 stream test".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();
        }
    }

    @Test(expected = Zip64RequiredException.class)
    public void testZip64Mode_never_throwsWhenLarge() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setUseZip64(Zip64Mode.Never);
            ZipArchiveEntry entry = new ZipArchiveEntry("large.bin");
            entry.setSize(0x100000000L);
            zaos.putArchiveEntry(entry);
        }
    }

    @Test
    public void testUnicodeExtraFields_policies() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setEncoding("US-ASCII");
            zaos.setFallbackToUTF8(true);
            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);

            ZipArchiveEntry entry1 = new ZipArchiveEntry("ascii_name.txt");
            entry1.setComment("comment");
            zaos.putArchiveEntry(entry1);
            zaos.write(new byte[]{1, 2, 3});
            zaos.closeArchiveEntry();

            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
            ZipArchiveEntry entry2 = new ZipArchiveEntry("unicode_\u00E4\u00F6\u00FC.txt");
            entry2.setComment("unicode_comment_\u00E9");
            zaos.putArchiveEntry(entry2);
            zaos.write(new byte[]{4, 5, 6});
            zaos.closeArchiveEntry();

            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER);
            ZipArchiveEntry entry3 = new ZipArchiveEntry("never_unicode.txt");
            zaos.putArchiveEntry(entry3);
            zaos.write(new byte[]{7, 8, 9});
            zaos.closeArchiveEntry();
        }
    }

    @Test
    public void testResourceAlignmentExtraField() throws IOException {
        SeekableInMemoryByteChannel channel = new SeekableInMemoryByteChannel();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(channel)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("aligned.txt");
            entry.setAlignment(1024);
            zaos.putArchiveEntry(entry);
            zaos.write("Aligned content".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();

            ResourceAlignmentExtraField oldField = new ResourceAlignmentExtraField(512, true);
            ZipArchiveEntry entry2 = new ZipArchiveEntry("aligned2.txt");
            entry2.addExtraField(oldField);
            zaos.putArchiveEntry(entry2);
            zaos.write("Second aligned content".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();
        }
    }

    @Test
    public void testAddRawArchiveEntry_phased() throws IOException {
        byte[] payload = "Raw compressed payload".getBytes(StandardCharsets.UTF_8);
        CRC32 crc = new CRC32();
        crc.update(payload);

        ZipArchiveEntry entry = new ZipArchiveEntry("raw_entry.txt");
        entry.setSize(payload.length);
        entry.setCompressedSize(payload.length);
        entry.setCrc(crc.getValue());
        entry.setMethod(ZipArchiveOutputStream.STORED);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.addRawArchiveEntry(entry, new ByteArrayInputStream(payload));
        }
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testAddRawArchiveEntry_withZip64Extra_unphased() throws IOException {
        byte[] payload = "Another raw payload".getBytes(StandardCharsets.UTF_8);

        ZipArchiveEntry entry = new ZipArchiveEntry("raw_unphased.txt");
        entry.addExtraField(new Zip64ExtendedInformationExtraField());
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.addRawArchiveEntry(entry, new ByteArrayInputStream(payload));
        }
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void testCreateArchiveEntry_fromFile() throws IOException {
        File file = tempFolder.newFile("entry_source.txt");
        File dir = tempFolder.newFolder("entry_dir");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            ArchiveEntry fileEntry = zaos.createArchiveEntry(file, "custom_name.txt");
            Assert.assertEquals("custom_name.txt", fileEntry.getName());

            ArchiveEntry dirEntry = zaos.createArchiveEntry(dir, "dir_name");
            Assert.assertTrue(dirEntry.getName().endsWith("/"));
        }
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntry_afterFinished_throwsException() throws IOException {
        File file = tempFolder.newFile("file.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.finish();
        zaos.createArchiveEntry(file, "file.txt");
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntry_afterFinished_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.finish();
        zaos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
    }

    @Test(expected = IOException.class)
    public void testFinish_twice_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.finish();
        zaos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinish_withUnclosedEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.putArchiveEntry(new ZipArchiveEntry("unclosed.txt"));
            zaos.finish();
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testWrite_withoutActiveEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.write(new byte[]{1, 2, 3}, 0, 3);
        }
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntry_withoutActiveEntry_throwsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.closeArchiveEntry();
        }
    }

    @Test
    public void testAutoClosingPreviousEntryOnPutNext() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.putArchiveEntry(new ZipArchiveEntry("entry1.txt"));
            zaos.write("Entry 1".getBytes(StandardCharsets.UTF_8));

            zaos.putArchiveEntry(new ZipArchiveEntry("entry2.txt"));
            zaos.write("Entry 2".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();
        }
    }

    @Test
    public void testCompressionLevelChangeBetweenEntries() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            zaos.setLevel(Deflater.BEST_SPEED);
            zaos.putArchiveEntry(new ZipArchiveEntry("fast.txt"));
            zaos.write("Fast compressed data".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();

            zaos.setLevel(Deflater.BEST_COMPRESSION);
            zaos.putArchiveEntry(new ZipArchiveEntry("best.txt"));
            zaos.write("Best compressed data".getBytes(StandardCharsets.UTF_8));
            zaos.closeArchiveEntry();
        }
    }

    @Test
    public void testProtectedMethods_deflate_writeLocalFileHeader_writeCentralFileHeader_writeOut() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TestZipArchiveOutputStream zaos = new TestZipArchiveOutputStream(baos);

        ZipArchiveEntry entry = new ZipArchiveEntry("manual.txt");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        entry.setTime(System.currentTimeMillis());

        zaos.putArchiveEntry(entry);
        zaos.testWriteOut(new byte[]{1, 2, 3});
        zaos.testWriteOut(new byte[]{4, 5, 6}, 0, 3);
        zaos.testDeflate();
        zaos.closeArchiveEntry();

        zaos.flush();
        zaos.finish();
        zaos.destroy();
    }

    @Test
    public void testUnicodeExtraFieldPolicy_toString() {
        Assert.assertEquals("always", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS.toString());
        Assert.assertEquals("never", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER.toString());
        Assert.assertEquals("not encodeable", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE.toString());
    }

    @Test
    public void testEmptyWriteOnPreClose() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("empty.txt");
            zaos.putArchiveEntry(entry);
            zaos.closeArchiveEntry();
        }
    }

    private static class TestZipArchiveOutputStream extends ZipArchiveOutputStream {
        TestZipArchiveOutputStream(OutputStream out) {
            super(out);
        }

        void testDeflate() throws IOException {
            super.deflate();
        }

        void testWriteOut(byte[] data) throws IOException {
            super.writeOut(data);
        }

        void testWriteOut(byte[] data, int offset, int length) throws IOException {
            super.writeOut(data, offset, length);
        }
    }
}
