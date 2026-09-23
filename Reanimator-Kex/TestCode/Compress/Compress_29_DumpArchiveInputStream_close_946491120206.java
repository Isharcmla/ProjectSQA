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

public class DumpArchiveInputStream_close_946491120206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202481;
     Object term202976;

    public DumpArchiveInputStream_close_946491120206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202481 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term202603 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term202663 = newInstance(Class.forName("java.io.BufferedInputStream"));
        setBooleanField(term202481, term202481.getClass(), "isClosed", false);
        setField(term202603, term202603.getClass(), "in", term202663);
        setField(term202481, term202481.getClass(), "raw", term202603);
        term202976 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term202977 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term202978 = newInstance(Class.forName("java.io.BufferedInputStream"));
        setField(term202976, term202976.getClass(), "summary", null);
        setField(term202976, term202976.getClass(), "active", null);
        setBooleanField(term202976, term202976.getClass(), "isClosed", true);
        setBooleanField(term202976, term202976.getClass(), "hasHitEOF", false);
        setLongField(term202976, term202976.getClass(), "entrySize", 0L);
        setLongField(term202976, term202976.getClass(), "entryOffset", 0L);
        setIntField(term202976, term202976.getClass(), "readIdx", 0);
        setField(term202976, term202976.getClass(), "readBuf", null);
        setField(term202976, term202976.getClass(), "blockBuffer", null);
        setIntField(term202976, term202976.getClass(), "recordOffset", 0);
        setLongField(term202976, term202976.getClass(), "filepos", 0L);
        setField(term202977, term202977.getClass(), "blockBuffer", null);
        setIntField(term202977, term202977.getClass(), "currBlkIdx", 0);
        setIntField(term202977, term202977.getClass(), "blockSize", 0);
        setIntField(term202977, term202977.getClass(), "readOffset", 0);
        setBooleanField(term202977, term202977.getClass(), "isCompressed", false);
        setLongField(term202977, term202977.getClass(), "bytesRead", 0L);
        setField(term202978, term202978.getClass(), "buf", null);
        setIntField(term202978, term202978.getClass(), "count", 0);
        setIntField(term202978, term202978.getClass(), "pos", 0);
        setIntField(term202978, term202978.getClass(), "markpos", 0);
        setIntField(term202978, term202978.getClass(), "marklimit", 0);
        setField(term202978, term202978.getClass(), "in", null);
        setField(term202977, term202977.getClass(), "in", term202978);
        setField(term202976, term202976.getClass(), "raw", term202977);
        setField(term202976, term202976.getClass(), "names", null);
        setField(term202976, term202976.getClass(), "pending", null);
        setField(term202976, term202976.getClass(), "queue", null);
        setField(term202976, term202976.getClass(), "zipEncoding", null);
        setField(term202976, term202976.getClass(), "SINGLE", null);
        setLongField(term202976, term202976.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term202481, args);
        assertTrue(recursiveEquals(term202481, term202976));
    }

};


