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

public class DumpArchiveInputStream_close_946491120406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662469;
     Object term662870;

    public DumpArchiveInputStream_close_946491120406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term662469 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term662591 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term662737 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term662807 = newInstance(Class.forName("org.tukaani.xz.SimpleInputStream"));
        setBooleanField(term662469, term662469.getClass(), "isClosed", false);
        setField(term662737, term662737.getClass(), "inf", null);
        setField(term662737, term662737.getClass(), "in", term662807);
        setField(term662591, term662591.getClass(), "in", term662737);
        setField(term662469, term662469.getClass(), "raw", term662591);
        term662870 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term662871 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term662872 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term662873 = newInstance(Class.forName("org.tukaani.xz.SimpleInputStream"));
        setField(term662870, term662870.getClass(), "summary", null);
        setField(term662870, term662870.getClass(), "active", null);
        setBooleanField(term662870, term662870.getClass(), "isClosed", true);
        setBooleanField(term662870, term662870.getClass(), "hasHitEOF", false);
        setLongField(term662870, term662870.getClass(), "entrySize", 0L);
        setLongField(term662870, term662870.getClass(), "entryOffset", 0L);
        setIntField(term662870, term662870.getClass(), "readIdx", 0);
        setField(term662870, term662870.getClass(), "readBuf", null);
        setField(term662870, term662870.getClass(), "blockBuffer", null);
        setIntField(term662870, term662870.getClass(), "recordOffset", 0);
        setLongField(term662870, term662870.getClass(), "filepos", 0L);
        setField(term662871, term662871.getClass(), "blockBuffer", null);
        setIntField(term662871, term662871.getClass(), "currBlkIdx", 0);
        setIntField(term662871, term662871.getClass(), "blockSize", 0);
        setIntField(term662871, term662871.getClass(), "readOffset", 0);
        setBooleanField(term662871, term662871.getClass(), "isCompressed", false);
        setLongField(term662871, term662871.getClass(), "bytesRead", 0L);
        setField(term662873, term662873.getClass(), "in", null);
        setField(term662873, term662873.getClass(), "simpleFilter", null);
        setField(term662873, term662873.getClass(), "filterBuf", null);
        setIntField(term662873, term662873.getClass(), "pos", 0);
        setIntField(term662873, term662873.getClass(), "filtered", 0);
        setIntField(term662873, term662873.getClass(), "unfiltered", 0);
        setBooleanField(term662873, term662873.getClass(), "endReached", false);
        setField(term662873, term662873.getClass(), "exception", null);
        setField(term662873, term662873.getClass(), "tempBuf", null);
        setField(term662872, term662872.getClass(), "in", term662873);
        setBooleanField(term662872, term662872.getClass(), "decompressConcatenated", false);
        setField(term662872, term662872.getClass(), "buf", null);
        setIntField(term662872, term662872.getClass(), "bufUsed", 0);
        setField(term662872, term662872.getClass(), "inf", null);
        setField(term662872, term662872.getClass(), "crc", null);
        setBooleanField(term662872, term662872.getClass(), "endReached", false);
        setField(term662872, term662872.getClass(), "oneByte", null);
        setField(term662872, term662872.getClass(), "parameters", null);
        setLongField(term662872, term662872.getClass(), "bytesRead", 0L);
        setField(term662871, term662871.getClass(), "in", term662872);
        setField(term662870, term662870.getClass(), "raw", term662871);
        setField(term662870, term662870.getClass(), "names", null);
        setField(term662870, term662870.getClass(), "pending", null);
        setField(term662870, term662870.getClass(), "queue", null);
        setField(term662870, term662870.getClass(), "zipEncoding", null);
        setField(term662870, term662870.getClass(), "SINGLE", null);
        setLongField(term662870, term662870.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term662469, args);
        assertTrue(recursiveEquals(term662469, term662870));
    }

};


