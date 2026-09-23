package org.apache.commons.compress.archivers.dump;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.dump.EqualityUtils.*;
import java.lang.Object;

public class DumpArchiveInputStream_close_946491120550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term998386;
     Object term998805;

    public DumpArchiveInputStream_close_946491120550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term998386 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term998508 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term998576 = newInstance(Class.forName("org.tukaani.xz.DeltaInputStream"));
        Object term998644 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        setBooleanField(term998386, term998386.getClass(), "isClosed", false);
        setField(term998576, term998576.getClass(), "in", term998644);
        setField(term998508, term998508.getClass(), "in", term998576);
        setField(term998386, term998386.getClass(), "raw", term998508);
        term998805 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term998806 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term998807 = newInstance(Class.forName("org.tukaani.xz.DeltaInputStream"));
        setField(term998805, term998805.getClass(), "summary", null);
        setField(term998805, term998805.getClass(), "active", null);
        setBooleanField(term998805, term998805.getClass(), "isClosed", true);
        setBooleanField(term998805, term998805.getClass(), "hasHitEOF", false);
        setLongField(term998805, term998805.getClass(), "entrySize", 0L);
        setLongField(term998805, term998805.getClass(), "entryOffset", 0L);
        setIntField(term998805, term998805.getClass(), "readIdx", 0);
        setField(term998805, term998805.getClass(), "readBuf", null);
        setField(term998805, term998805.getClass(), "blockBuffer", null);
        setIntField(term998805, term998805.getClass(), "recordOffset", 0);
        setLongField(term998805, term998805.getClass(), "filepos", 0L);
        setField(term998806, term998806.getClass(), "blockBuffer", null);
        setIntField(term998806, term998806.getClass(), "currBlkIdx", 0);
        setIntField(term998806, term998806.getClass(), "blockSize", 0);
        setIntField(term998806, term998806.getClass(), "readOffset", 0);
        setBooleanField(term998806, term998806.getClass(), "isCompressed", false);
        setLongField(term998806, term998806.getClass(), "bytesRead", 0L);
        setField(term998807, term998807.getClass(), "in", null);
        setField(term998807, term998807.getClass(), "delta", null);
        setField(term998807, term998807.getClass(), "exception", null);
        setField(term998807, term998807.getClass(), "tempBuf", null);
        setField(term998806, term998806.getClass(), "in", term998807);
        setField(term998805, term998805.getClass(), "raw", term998806);
        setField(term998805, term998805.getClass(), "names", null);
        setField(term998805, term998805.getClass(), "pending", null);
        setField(term998805, term998805.getClass(), "queue", null);
        setField(term998805, term998805.getClass(), "zipEncoding", null);
        setField(term998805, term998805.getClass(), "SINGLE", null);
        setLongField(term998805, term998805.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term998386, args);
        assertTrue(recursiveEquals(term998386, term998805));
    }

};


