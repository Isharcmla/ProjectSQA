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

public class DumpArchiveInputStream_read_154452840472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53793;
     Object term53807;

    public DumpArchiveInputStream_read_154452840472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53793 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term53793, term53793.getClass(), "hasHitEOF", true);
        term53807 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term53807, term53807.getClass(), "summary", null);
        setField(term53807, term53807.getClass(), "active", null);
        setBooleanField(term53807, term53807.getClass(), "isClosed", false);
        setBooleanField(term53807, term53807.getClass(), "hasHitEOF", true);
        setLongField(term53807, term53807.getClass(), "entrySize", 0L);
        setLongField(term53807, term53807.getClass(), "entryOffset", 0L);
        setIntField(term53807, term53807.getClass(), "readIdx", 0);
        setField(term53807, term53807.getClass(), "readBuf", null);
        setField(term53807, term53807.getClass(), "blockBuffer", null);
        setIntField(term53807, term53807.getClass(), "recordOffset", 0);
        setLongField(term53807, term53807.getClass(), "filepos", 0L);
        setField(term53807, term53807.getClass(), "raw", null);
        setField(term53807, term53807.getClass(), "names", null);
        setField(term53807, term53807.getClass(), "pending", null);
        setField(term53807, term53807.getClass(), "queue", null);
        setField(term53807, term53807.getClass(), "zipEncoding", null);
        setField(term53807, term53807.getClass(), "SINGLE", null);
        setLongField(term53807, term53807.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "read", argTypes, term53793, args);
        assertTrue(recursiveEquals(term53793, term53807));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


