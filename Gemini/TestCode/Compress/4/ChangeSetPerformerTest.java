package org.apache.commons.compress.changes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.junit.Test;

public class ChangeSetPerformerTest {

    private static class SimpleArchiveEntry implements ArchiveEntry {
        private final String name;
        private final long size;
        private final boolean isDir;

        public SimpleArchiveEntry(String name) {
            this(name, 0, false);
        }

        public SimpleArchiveEntry(String name, long size, boolean isDir) {
            this.name = name;
            this.size = size;
            this.isDir = isDir;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public long getSize() {
            return size;
        }

        @Override
        public boolean isDirectory() {
            return isDir;
        }

        @Override
        public Date getLastModifiedDate() {
            return new Date();
        }
    }

    private static class SimpleArchiveInputStream extends ArchiveInputStream {
        private final List<ArchiveEntry> entries;
        private final List<byte[]> contents;
        private int currentIndex = -1;
        private ByteArrayInputStream currentStream = null;
        private boolean throwOnRead = false;
        private boolean throwOnGetNext = false;

        public SimpleArchiveInputStream(List<ArchiveEntry> entries, List<byte[]> contents) {
            this.entries = entries;
            this.contents = contents;
        }

        public void setThrowOnRead(boolean throwOnRead) {
            this.throwOnRead = throwOnRead;
        }

        public void setThrowOnGetNext(boolean throwOnGetNext) {
            this.throwOnGetNext = throwOnGetNext;
        }

        @Override
        public ArchiveEntry getNextEntry() throws IOException {
            if (throwOnGetNext) {
                throw new IOException("Simulated getNextEntry exception");
            }
            currentIndex++;
            if (currentIndex < entries.size()) {
                byte[] content = (contents != null && currentIndex < contents.size())
                        ? contents.get(currentIndex)
                        : new byte[0];
                currentStream = new ByteArrayInputStream(content);
                return entries.get(currentIndex);
            }
            return null;
        }

        @Override
        public int read() throws IOException {
            if (throwOnRead) {
                throw new IOException("Simulated read exception");
            }
            if (currentStream != null) {
                return currentStream.read();
            }
            return -1;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            if (throwOnRead) {
                throw new IOException("Simulated read exception");
            }
            if (currentStream != null) {
                return currentStream.read(b, off, len);
            }
            return -1;
        }
    }

    private static class SimpleArchiveOutputStream extends ArchiveOutputStream {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();
        private final List<ArchiveEntry> putEntries = new ArrayList<ArchiveEntry>();
        private final List<ArchiveEntry> closedEntries = new ArrayList<ArchiveEntry>();
        private boolean throwOnPut = false;
        private boolean throwOnCloseEntry = false;
        private boolean throwOnWrite = false;

        public void setThrowOnPut(boolean throwOnPut) {
            this.throwOnPut = throwOnPut;
        }

        public void setThrowOnCloseEntry(boolean throwOnCloseEntry) {
            this.throwOnCloseEntry = throwOnCloseEntry;
        }

        public void setThrowOnWrite(boolean throwOnWrite) {
            this.throwOnWrite = throwOnWrite;
        }

        @Override
        public void putArchiveEntry(ArchiveEntry entry) throws IOException {
            if (throwOnPut) {
                throw new IOException("Simulated putArchiveEntry exception");
            }
            putEntries.add(entry);
        }

        @Override
        public void closeArchiveEntry() throws IOException {
            if (throwOnCloseEntry) {
                throw new IOException("Simulated closeArchiveEntry exception");
            }
            if (!putEntries.isEmpty()) {
                closedEntries.add(putEntries.get(putEntries.size() - 1));
            }
        }

        @Override
        public void finish() throws IOException {
        }

        @Override
        public ArchiveEntry createArchiveEntry(File inputFile, String entryName) throws IOException {
            return new SimpleArchiveEntry(entryName);
        }

        @Override
        public void write(int b) throws IOException {
            if (throwOnWrite) {
                throw new IOException("Simulated write exception");
            }
            out.write(b);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            if (throwOnWrite) {
                throw new IOException("Simulated write exception");
            }
            out.write(b, off, len);
        }

        public List<ArchiveEntry> getPutEntries() {
            return putEntries;
        }

        public byte[] toByteArray() {
            return out.toByteArray();
        }
    }

    @Test
    public void testPerform_emptyChangeSetAndEmptyInputStream_emptyResults() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.<ArchiveEntry>emptyList(),
                Collections.<byte[]>emptyList()
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromChangeSet().isEmpty());
        assertTrue(results.getAddedFromStream().isEmpty());
        assertTrue(results.getDeleted().isEmpty());
        assertTrue(out.getPutEntries().isEmpty());
    }

    @Test
    public void testPerform_noChanges_copiesAllEntriesFromStream() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry entry1 = new SimpleArchiveEntry("file1.txt", 5, false);
        ArchiveEntry entry2 = new SimpleArchiveEntry("file2.txt", 5, false);
        List<ArchiveEntry> entries = Arrays.asList(entry1, entry2);
        List<byte[]> contents = Arrays.asList("data1".getBytes(), "data2".getBytes());

        SimpleArchiveInputStream in = new SimpleArchiveInputStream(entries, contents);
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertEquals(2, results.getAddedFromStream().size());
        assertTrue(results.getAddedFromStream().contains("file1.txt"));
        assertTrue(results.getAddedFromStream().contains("file2.txt"));
        assertTrue(results.hasBeenAdded("file1.txt"));
        assertTrue(results.hasBeenAdded("file2.txt"));
        assertEquals(2, out.getPutEntries().size());
        assertEquals("data1data2", new String(out.toByteArray()));
    }

    @Test
    public void testPerform_addReplaceMode_addsEntryBeforeStreamProcessing() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry addedEntry = new SimpleArchiveEntry("added.txt");
        changeSet.add(addedEntry, new ByteArrayInputStream("addedContent".getBytes()), true);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry streamEntry = new SimpleArchiveEntry("stream.txt");
        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.singletonList(streamEntry),
                Collections.singletonList("streamContent".getBytes())
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromChangeSet().contains("added.txt"));
        assertTrue(results.getAddedFromStream().contains("stream.txt"));
        assertEquals(2, out.getPutEntries().size());
        assertEquals("added.txt", out.getPutEntries().get(0).getName());
        assertEquals("stream.txt", out.getPutEntries().get(1).getName());
        assertEquals("addedContentstreamContent", new String(out.toByteArray()));
    }

    @Test
    public void testPerform_addReplaceMode_replacesSameNamedEntryInStream() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry replaceEntry = new SimpleArchiveEntry("file.txt");
        changeSet.add(replaceEntry, new ByteArrayInputStream("newContent".getBytes()), true);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry streamEntry = new SimpleArchiveEntry("file.txt");
        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.singletonList(streamEntry),
                Collections.singletonList("oldContent".getBytes())
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromChangeSet().contains("file.txt"));
        assertFalse(results.getAddedFromStream().contains("file.txt"));
        assertEquals(1, out.getPutEntries().size());
        assertEquals("newContent", new String(out.toByteArray()));
    }

    @Test
    public void testPerform_addNonReplaceMode_addsEntryAfterStreamWhenNotPresent() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry addedEntry = new SimpleArchiveEntry("appended.txt");
        changeSet.add(addedEntry, new ByteArrayInputStream("appendedContent".getBytes()), false);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry streamEntry = new SimpleArchiveEntry("stream.txt");
        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.singletonList(streamEntry),
                Collections.singletonList("streamContent".getBytes())
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromStream().contains("stream.txt"));
        assertTrue(results.getAddedFromChangeSet().contains("appended.txt"));
        assertEquals(2, out.getPutEntries().size());
        assertEquals("stream.txt", out.getPutEntries().get(0).getName());
        assertEquals("appended.txt", out.getPutEntries().get(1).getName());
        assertEquals("streamContentappendedContent", new String(out.toByteArray()));
    }

    @Test
    public void testPerform_addNonReplaceMode_skippedWhenAlreadyInStream() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry nonReplaceEntry = new SimpleArchiveEntry("file.txt");
        changeSet.add(nonReplaceEntry, new ByteArrayInputStream("ignoredContent".getBytes()), false);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry streamEntry = new SimpleArchiveEntry("file.txt");
        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.singletonList(streamEntry),
                Collections.singletonList("streamContent".getBytes())
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromStream().contains("file.txt"));
        assertFalse(results.getAddedFromChangeSet().contains("file.txt"));
        assertEquals(1, out.getPutEntries().size());
        assertEquals("streamContent", new String(out.toByteArray()));
    }

    @Test
    public void testPerform_deleteFile_deletesMatchingEntryOnly() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("file1.txt");

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry entry1 = new SimpleArchiveEntry("file1.txt");
        ArchiveEntry entry2 = new SimpleArchiveEntry("file2.txt");
        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Arrays.asList(entry1, entry2),
                Arrays.asList("data1".getBytes(), "data2".getBytes())
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getDeleted().contains("file1.txt"));
        assertFalse(results.getDeleted().contains("file2.txt"));
        assertTrue(results.getAddedFromStream().contains("file2.txt"));
        assertEquals(1, out.getPutEntries().size());
        assertEquals("file2.txt", out.getPutEntries().get(0).getName());
        assertEquals("data2", new String(out.toByteArray()));
    }

    @Test
    public void testPerform_deleteDir_deletesMatchingDirectoryEntries() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.deleteDir("targetDir");

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry entry1 = new SimpleArchiveEntry("targetDir/file1.txt");
        ArchiveEntry entry2 = new SimpleArchiveEntry("targetDir/subdir/file2.txt");
        ArchiveEntry entry3 = new SimpleArchiveEntry("targetDirOther/file3.txt");
        ArchiveEntry entry4 = new SimpleArchiveEntry("root.txt");

        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Arrays.asList(entry1, entry2, entry3, entry4),
                Arrays.asList("d1".getBytes(), "d2".getBytes(), "d3".getBytes(), "d4".getBytes())
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertEquals(2, results.getDeleted().size());
        assertTrue(results.getDeleted().contains("targetDir/file1.txt"));
        assertTrue(results.getDeleted().contains("targetDir/subdir/file2.txt"));
        assertFalse(results.getDeleted().contains("targetDirOther/file3.txt"));
        assertTrue(results.getAddedFromStream().contains("targetDirOther/file3.txt"));
        assertTrue(results.getAddedFromStream().contains("root.txt"));
        assertEquals(2, out.getPutEntries().size());
    }

    @Test
    public void testPerform_deleteUnmatched_doesNotDeleteStreamEntries() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("nonexistent.txt");
        changeSet.deleteDir("nonexistentDir");

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry entry = new SimpleArchiveEntry("keep.txt");
        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.singletonList(entry),
                Collections.singletonList("content".getBytes())
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getDeleted().isEmpty());
        assertTrue(results.getAddedFromStream().contains("keep.txt"));
        assertEquals(1, out.getPutEntries().size());
    }

    @Test
    public void testPerform_nullEntryNameInInputStream_copiedWhenNoChanges() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry nullNamedEntry = new SimpleArchiveEntry(null);
        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.singletonList(nullNamedEntry),
                Collections.singletonList("nullNameData".getBytes())
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertEquals(1, results.getAddedFromStream().size());
        assertTrue(results.hasBeenAdded(null));
        assertEquals(1, out.getPutEntries().size());
    }

    @Test
    public void testPerform_workingSetRemainingAddOperations_isDeletedLaterReturnsFalse() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry addedEntry = new SimpleArchiveEntry("newFile.txt");
        changeSet.add(addedEntry, new ByteArrayInputStream("newData".getBytes()), false);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry streamEntry = new SimpleArchiveEntry("streamFile.txt");
        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.singletonList(streamEntry),
                Collections.singletonList("streamData".getBytes())
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromStream().contains("streamFile.txt"));
        assertTrue(results.getAddedFromChangeSet().contains("newFile.txt"));
        assertEquals(2, out.getPutEntries().size());
    }

    @Test
    public void testPerform_multipleCalls_isReusableAndThreadSafe() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("deleteMe.txt");
        ArchiveEntry addEntry = new SimpleArchiveEntry("added.txt");
        changeSet.add(addEntry, new ByteArrayInputStream("content".getBytes()), false);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        for (int i = 0; i < 2; i++) {
            ArchiveEntry e1 = new SimpleArchiveEntry("deleteMe.txt");
            ArchiveEntry e2 = new SimpleArchiveEntry("keep.txt");
            SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                    Arrays.asList(e1, e2),
                    Arrays.asList("d1".getBytes(), "d2".getBytes())
            );
            SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

            ChangeSetResults results = performer.perform(in, out);

            assertTrue(results.getDeleted().contains("deleteMe.txt"));
            assertTrue(results.getAddedFromStream().contains("keep.txt"));
            assertTrue(results.getAddedFromChangeSet().contains("added.txt"));
            assertEquals(2, out.getPutEntries().size());
        }
    }

    @Test(expected = IOException.class)
    public void testPerform_inputStreamThrowsExceptionOnGetNext_throwsIOException() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.<ArchiveEntry>emptyList(),
                Collections.<byte[]>emptyList()
        );
        in.setThrowOnGetNext(true);
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        performer.perform(in, out);
    }

    @Test(expected = IOException.class)
    public void testPerform_inputStreamThrowsExceptionOnRead_throwsIOException() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        ArchiveEntry entry = new SimpleArchiveEntry("file.txt");
        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.singletonList(entry),
                Collections.singletonList("data".getBytes())
        );
        in.setThrowOnRead(true);
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();

        performer.perform(in, out);
    }

    @Test(expected = IOException.class)
    public void testPerform_outputStreamThrowsExceptionOnPut_throwsIOException() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry entry = new SimpleArchiveEntry("added.txt");
        changeSet.add(entry, new ByteArrayInputStream("data".getBytes()), true);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.<ArchiveEntry>emptyList(),
                Collections.<byte[]>emptyList()
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();
        out.setThrowOnPut(true);

        performer.perform(in, out);
    }

    @Test(expected = IOException.class)
    public void testPerform_outputStreamThrowsExceptionOnCloseEntry_throwsIOException() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry entry = new SimpleArchiveEntry("added.txt");
        changeSet.add(entry, new ByteArrayInputStream("data".getBytes()), true);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.<ArchiveEntry>emptyList(),
                Collections.<byte[]>emptyList()
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();
        out.setThrowOnCloseEntry(true);

        performer.perform(in, out);
    }

    @Test(expected = IOException.class)
    public void testPerform_outputStreamThrowsExceptionOnWrite_throwsIOException() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry entry = new SimpleArchiveEntry("added.txt");
        changeSet.add(entry, new ByteArrayInputStream("data".getBytes()), true);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        SimpleArchiveInputStream in = new SimpleArchiveInputStream(
                Collections.<ArchiveEntry>emptyList(),
                Collections.<byte[]>emptyList()
        );
        SimpleArchiveOutputStream out = new SimpleArchiveOutputStream();
        out.setThrowOnWrite(true);

        performer.perform(in, out);
    }
}
