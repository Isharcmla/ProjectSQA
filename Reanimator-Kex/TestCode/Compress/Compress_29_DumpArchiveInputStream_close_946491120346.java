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

public class DumpArchiveInputStream_close_946491120346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534858;
     Object term535359;

    public DumpArchiveInputStream_close_946491120346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534858 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term534980 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term535126 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term535262 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term534858, term534858.getClass(), "isClosed", false);
        setField(term535126, term535126.getClass(), "inf", null);
        setBooleanField(term535262, term535262.getClass(), "isClosed", true);
        setField(term535126, term535126.getClass(), "in", term535262);
        setField(term534980, term534980.getClass(), "in", term535126);
        setField(term534858, term534858.getClass(), "raw", term534980);
        term535359 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term535360 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term535361 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term535362 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term535359, term535359.getClass(), "summary", null);
        setField(term535359, term535359.getClass(), "active", null);
        setBooleanField(term535359, term535359.getClass(), "isClosed", true);
        setBooleanField(term535359, term535359.getClass(), "hasHitEOF", false);
        setLongField(term535359, term535359.getClass(), "entrySize", 0L);
        setLongField(term535359, term535359.getClass(), "entryOffset", 0L);
        setIntField(term535359, term535359.getClass(), "readIdx", 0);
        setField(term535359, term535359.getClass(), "readBuf", null);
        setField(term535359, term535359.getClass(), "blockBuffer", null);
        setIntField(term535359, term535359.getClass(), "recordOffset", 0);
        setLongField(term535359, term535359.getClass(), "filepos", 0L);
        setField(term535360, term535360.getClass(), "blockBuffer", null);
        setIntField(term535360, term535360.getClass(), "currBlkIdx", 0);
        setIntField(term535360, term535360.getClass(), "blockSize", 0);
        setIntField(term535360, term535360.getClass(), "readOffset", 0);
        setBooleanField(term535360, term535360.getClass(), "isCompressed", false);
        setLongField(term535360, term535360.getClass(), "bytesRead", 0L);
        setField(term535362, term535362.getClass(), "summary", null);
        setField(term535362, term535362.getClass(), "active", null);
        setBooleanField(term535362, term535362.getClass(), "isClosed", true);
        setBooleanField(term535362, term535362.getClass(), "hasHitEOF", false);
        setLongField(term535362, term535362.getClass(), "entrySize", 0L);
        setLongField(term535362, term535362.getClass(), "entryOffset", 0L);
        setIntField(term535362, term535362.getClass(), "readIdx", 0);
        setField(term535362, term535362.getClass(), "readBuf", null);
        setField(term535362, term535362.getClass(), "blockBuffer", null);
        setIntField(term535362, term535362.getClass(), "recordOffset", 0);
        setLongField(term535362, term535362.getClass(), "filepos", 0L);
        setField(term535362, term535362.getClass(), "raw", null);
        setField(term535362, term535362.getClass(), "names", null);
        setField(term535362, term535362.getClass(), "pending", null);
        setField(term535362, term535362.getClass(), "queue", null);
        setField(term535362, term535362.getClass(), "zipEncoding", null);
        setField(term535362, term535362.getClass(), "SINGLE", null);
        setLongField(term535362, term535362.getClass(), "bytesRead", 0L);
        setField(term535361, term535361.getClass(), "in", term535362);
        setBooleanField(term535361, term535361.getClass(), "decompressConcatenated", false);
        setField(term535361, term535361.getClass(), "buf", null);
        setIntField(term535361, term535361.getClass(), "bufUsed", 0);
        setField(term535361, term535361.getClass(), "inf", null);
        setField(term535361, term535361.getClass(), "crc", null);
        setBooleanField(term535361, term535361.getClass(), "endReached", false);
        setField(term535361, term535361.getClass(), "oneByte", null);
        setField(term535361, term535361.getClass(), "parameters", null);
        setLongField(term535361, term535361.getClass(), "bytesRead", 0L);
        setField(term535360, term535360.getClass(), "in", term535361);
        setField(term535359, term535359.getClass(), "raw", term535360);
        setField(term535359, term535359.getClass(), "names", null);
        setField(term535359, term535359.getClass(), "pending", null);
        setField(term535359, term535359.getClass(), "queue", null);
        setField(term535359, term535359.getClass(), "zipEncoding", null);
        setField(term535359, term535359.getClass(), "SINGLE", null);
        setLongField(term535359, term535359.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term534858, args);
        assertTrue(recursiveEquals(term534858, term535359));
    }

};


