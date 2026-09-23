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

public class DumpArchiveInputStream_close_946491120306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428449;
     Object term429221;

    public DumpArchiveInputStream_close_946491120306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428449 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term428571 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term428717 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term428853 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term428975 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setBooleanField(term428449, term428449.getClass(), "isClosed", false);
        setField(term428717, term428717.getClass(), "inf", null);
        setBooleanField(term428853, term428853.getClass(), "isClosed", false);
        setField(term428853, term428853.getClass(), "raw", term428975);
        setField(term428717, term428717.getClass(), "in", term428853);
        setField(term428571, term428571.getClass(), "in", term428717);
        setField(term428449, term428449.getClass(), "raw", term428571);
        term429221 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term429222 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term429223 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term429224 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term429225 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term429221, term429221.getClass(), "summary", null);
        setField(term429221, term429221.getClass(), "active", null);
        setBooleanField(term429221, term429221.getClass(), "isClosed", true);
        setBooleanField(term429221, term429221.getClass(), "hasHitEOF", false);
        setLongField(term429221, term429221.getClass(), "entrySize", 0L);
        setLongField(term429221, term429221.getClass(), "entryOffset", 0L);
        setIntField(term429221, term429221.getClass(), "readIdx", 0);
        setField(term429221, term429221.getClass(), "readBuf", null);
        setField(term429221, term429221.getClass(), "blockBuffer", null);
        setIntField(term429221, term429221.getClass(), "recordOffset", 0);
        setLongField(term429221, term429221.getClass(), "filepos", 0L);
        setField(term429222, term429222.getClass(), "blockBuffer", null);
        setIntField(term429222, term429222.getClass(), "currBlkIdx", 0);
        setIntField(term429222, term429222.getClass(), "blockSize", 0);
        setIntField(term429222, term429222.getClass(), "readOffset", 0);
        setBooleanField(term429222, term429222.getClass(), "isCompressed", false);
        setLongField(term429222, term429222.getClass(), "bytesRead", 0L);
        setField(term429224, term429224.getClass(), "summary", null);
        setField(term429224, term429224.getClass(), "active", null);
        setBooleanField(term429224, term429224.getClass(), "isClosed", true);
        setBooleanField(term429224, term429224.getClass(), "hasHitEOF", false);
        setLongField(term429224, term429224.getClass(), "entrySize", 0L);
        setLongField(term429224, term429224.getClass(), "entryOffset", 0L);
        setIntField(term429224, term429224.getClass(), "readIdx", 0);
        setField(term429224, term429224.getClass(), "readBuf", null);
        setField(term429224, term429224.getClass(), "blockBuffer", null);
        setIntField(term429224, term429224.getClass(), "recordOffset", 0);
        setLongField(term429224, term429224.getClass(), "filepos", 0L);
        setField(term429225, term429225.getClass(), "blockBuffer", null);
        setIntField(term429225, term429225.getClass(), "currBlkIdx", 0);
        setIntField(term429225, term429225.getClass(), "blockSize", 0);
        setIntField(term429225, term429225.getClass(), "readOffset", 0);
        setBooleanField(term429225, term429225.getClass(), "isCompressed", false);
        setLongField(term429225, term429225.getClass(), "bytesRead", 0L);
        setField(term429225, term429225.getClass(), "in", null);
        setField(term429224, term429224.getClass(), "raw", term429225);
        setField(term429224, term429224.getClass(), "names", null);
        setField(term429224, term429224.getClass(), "pending", null);
        setField(term429224, term429224.getClass(), "queue", null);
        setField(term429224, term429224.getClass(), "zipEncoding", null);
        setField(term429224, term429224.getClass(), "SINGLE", null);
        setLongField(term429224, term429224.getClass(), "bytesRead", 0L);
        setField(term429223, term429223.getClass(), "in", term429224);
        setBooleanField(term429223, term429223.getClass(), "decompressConcatenated", false);
        setField(term429223, term429223.getClass(), "buf", null);
        setIntField(term429223, term429223.getClass(), "bufUsed", 0);
        setField(term429223, term429223.getClass(), "inf", null);
        setField(term429223, term429223.getClass(), "crc", null);
        setBooleanField(term429223, term429223.getClass(), "endReached", false);
        setField(term429223, term429223.getClass(), "oneByte", null);
        setField(term429223, term429223.getClass(), "parameters", null);
        setLongField(term429223, term429223.getClass(), "bytesRead", 0L);
        setField(term429222, term429222.getClass(), "in", term429223);
        setField(term429221, term429221.getClass(), "raw", term429222);
        setField(term429221, term429221.getClass(), "names", null);
        setField(term429221, term429221.getClass(), "pending", null);
        setField(term429221, term429221.getClass(), "queue", null);
        setField(term429221, term429221.getClass(), "zipEncoding", null);
        setField(term429221, term429221.getClass(), "SINGLE", null);
        setLongField(term429221, term429221.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term428449, args);
        assertTrue(recursiveEquals(term428449, term429221));
    }

};


