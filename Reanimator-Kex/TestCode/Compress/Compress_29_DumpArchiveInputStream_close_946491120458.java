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

public class DumpArchiveInputStream_close_946491120458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782933;
     Object term783631;

    public DumpArchiveInputStream_close_946491120458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term782933 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term783055 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term783201 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term783347 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term783409 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        setBooleanField(term782933, term782933.getClass(), "isClosed", false);
        setField(term783201, term783201.getClass(), "inf", null);
        setField(term783347, term783347.getClass(), "inf", null);
        setField(term783347, term783347.getClass(), "in", term783409);
        setField(term783201, term783201.getClass(), "in", term783347);
        setField(term783055, term783055.getClass(), "in", term783201);
        setField(term782933, term782933.getClass(), "raw", term783055);
        term783631 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term783632 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term783633 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term783634 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term783635 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        setField(term783631, term783631.getClass(), "summary", null);
        setField(term783631, term783631.getClass(), "active", null);
        setBooleanField(term783631, term783631.getClass(), "isClosed", true);
        setBooleanField(term783631, term783631.getClass(), "hasHitEOF", false);
        setLongField(term783631, term783631.getClass(), "entrySize", 0L);
        setLongField(term783631, term783631.getClass(), "entryOffset", 0L);
        setIntField(term783631, term783631.getClass(), "readIdx", 0);
        setField(term783631, term783631.getClass(), "readBuf", null);
        setField(term783631, term783631.getClass(), "blockBuffer", null);
        setIntField(term783631, term783631.getClass(), "recordOffset", 0);
        setLongField(term783631, term783631.getClass(), "filepos", 0L);
        setField(term783632, term783632.getClass(), "blockBuffer", null);
        setIntField(term783632, term783632.getClass(), "currBlkIdx", 0);
        setIntField(term783632, term783632.getClass(), "blockSize", 0);
        setIntField(term783632, term783632.getClass(), "readOffset", 0);
        setBooleanField(term783632, term783632.getClass(), "isCompressed", false);
        setLongField(term783632, term783632.getClass(), "bytesRead", 0L);
        setField(term783635, term783635.getClass(), "buf", null);
        setIntField(term783635, term783635.getClass(), "pos", 0);
        setIntField(term783635, term783635.getClass(), "mark", 0);
        setIntField(term783635, term783635.getClass(), "count", 0);
        setField(term783634, term783634.getClass(), "in", term783635);
        setBooleanField(term783634, term783634.getClass(), "decompressConcatenated", false);
        setField(term783634, term783634.getClass(), "buf", null);
        setIntField(term783634, term783634.getClass(), "bufUsed", 0);
        setField(term783634, term783634.getClass(), "inf", null);
        setField(term783634, term783634.getClass(), "crc", null);
        setBooleanField(term783634, term783634.getClass(), "endReached", false);
        setField(term783634, term783634.getClass(), "oneByte", null);
        setField(term783634, term783634.getClass(), "parameters", null);
        setLongField(term783634, term783634.getClass(), "bytesRead", 0L);
        setField(term783633, term783633.getClass(), "in", term783634);
        setBooleanField(term783633, term783633.getClass(), "decompressConcatenated", false);
        setField(term783633, term783633.getClass(), "buf", null);
        setIntField(term783633, term783633.getClass(), "bufUsed", 0);
        setField(term783633, term783633.getClass(), "inf", null);
        setField(term783633, term783633.getClass(), "crc", null);
        setBooleanField(term783633, term783633.getClass(), "endReached", false);
        setField(term783633, term783633.getClass(), "oneByte", null);
        setField(term783633, term783633.getClass(), "parameters", null);
        setLongField(term783633, term783633.getClass(), "bytesRead", 0L);
        setField(term783632, term783632.getClass(), "in", term783633);
        setField(term783631, term783631.getClass(), "raw", term783632);
        setField(term783631, term783631.getClass(), "names", null);
        setField(term783631, term783631.getClass(), "pending", null);
        setField(term783631, term783631.getClass(), "queue", null);
        setField(term783631, term783631.getClass(), "zipEncoding", null);
        setField(term783631, term783631.getClass(), "SINGLE", null);
        setLongField(term783631, term783631.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term782933, args);
        assertTrue(recursiveEquals(term782933, term783631));
    }

};


