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

public class DumpArchiveInputStream_close_946491120140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95100;
     Object term95582;

    public DumpArchiveInputStream_close_946491120140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95100 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term95222 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term95290 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setBooleanField(term95100, term95100.getClass(), "isClosed", false);
        setField(term95222, term95222.getClass(), "in", term95290);
        setField(term95100, term95100.getClass(), "raw", term95222);
        term95582 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term95583 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term95584 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setField(term95582, term95582.getClass(), "summary", null);
        setField(term95582, term95582.getClass(), "active", null);
        setBooleanField(term95582, term95582.getClass(), "isClosed", true);
        setBooleanField(term95582, term95582.getClass(), "hasHitEOF", false);
        setLongField(term95582, term95582.getClass(), "entrySize", 0L);
        setLongField(term95582, term95582.getClass(), "entryOffset", 0L);
        setIntField(term95582, term95582.getClass(), "readIdx", 0);
        setField(term95582, term95582.getClass(), "readBuf", null);
        setField(term95582, term95582.getClass(), "blockBuffer", null);
        setIntField(term95582, term95582.getClass(), "recordOffset", 0);
        setLongField(term95582, term95582.getClass(), "filepos", 0L);
        setField(term95583, term95583.getClass(), "blockBuffer", null);
        setIntField(term95583, term95583.getClass(), "currBlkIdx", 0);
        setIntField(term95583, term95583.getClass(), "blockSize", 0);
        setIntField(term95583, term95583.getClass(), "readOffset", 0);
        setBooleanField(term95583, term95583.getClass(), "isCompressed", false);
        setLongField(term95583, term95583.getClass(), "bytesRead", 0L);
        setField(term95584, term95584.getClass(), "buffer", null);
        setIntField(term95584, term95584.getClass(), "pos", 0);
        setIntField(term95584, term95584.getClass(), "count", 0);
        setField(term95583, term95583.getClass(), "in", term95584);
        setField(term95582, term95582.getClass(), "raw", term95583);
        setField(term95582, term95582.getClass(), "names", null);
        setField(term95582, term95582.getClass(), "pending", null);
        setField(term95582, term95582.getClass(), "queue", null);
        setField(term95582, term95582.getClass(), "zipEncoding", null);
        setField(term95582, term95582.getClass(), "SINGLE", null);
        setLongField(term95582, term95582.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term95100, args);
        assertTrue(recursiveEquals(term95100, term95582));
    }

};


