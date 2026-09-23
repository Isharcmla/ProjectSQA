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

public class DumpArchiveInputStream_close_946491120383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619284;
     Object term623193;

    public DumpArchiveInputStream_close_946491120383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term619284 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term619406 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term619488 = newInstance(Class.forName("java.util.jar.Manifest$FastInputStream"));
        setBooleanField(term619284, term619284.getClass(), "isClosed", false);
        setField(term619406, term619406.getClass(), "in", term619488);
        setField(term619284, term619284.getClass(), "raw", term619406);
        term623193 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term623194 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term623195 = newInstance(Class.forName("java.util.jar.Manifest$FastInputStream"));
        setField(term623193, term623193.getClass(), "summary", null);
        setField(term623193, term623193.getClass(), "active", null);
        setBooleanField(term623193, term623193.getClass(), "isClosed", true);
        setBooleanField(term623193, term623193.getClass(), "hasHitEOF", false);
        setLongField(term623193, term623193.getClass(), "entrySize", 0L);
        setLongField(term623193, term623193.getClass(), "entryOffset", 0L);
        setIntField(term623193, term623193.getClass(), "readIdx", 0);
        setField(term623193, term623193.getClass(), "readBuf", null);
        setField(term623193, term623193.getClass(), "blockBuffer", null);
        setIntField(term623193, term623193.getClass(), "recordOffset", 0);
        setLongField(term623193, term623193.getClass(), "filepos", 0L);
        setField(term623194, term623194.getClass(), "blockBuffer", null);
        setIntField(term623194, term623194.getClass(), "currBlkIdx", 0);
        setIntField(term623194, term623194.getClass(), "blockSize", 0);
        setIntField(term623194, term623194.getClass(), "readOffset", 0);
        setBooleanField(term623194, term623194.getClass(), "isCompressed", false);
        setLongField(term623194, term623194.getClass(), "bytesRead", 0L);
        setField(term623195, term623195.getClass(), "buf", null);
        setIntField(term623195, term623195.getClass(), "count", 0);
        setIntField(term623195, term623195.getClass(), "pos", 0);
        setField(term623195, term623195.getClass(), "in", null);
        setField(term623194, term623194.getClass(), "in", term623195);
        setField(term623193, term623193.getClass(), "raw", term623194);
        setField(term623193, term623193.getClass(), "names", null);
        setField(term623193, term623193.getClass(), "pending", null);
        setField(term623193, term623193.getClass(), "queue", null);
        setField(term623193, term623193.getClass(), "zipEncoding", null);
        setField(term623193, term623193.getClass(), "SINGLE", null);
        setLongField(term623193, term623193.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term619284, args);
        assertTrue(recursiveEquals(term619284, term623193));
    }

};


