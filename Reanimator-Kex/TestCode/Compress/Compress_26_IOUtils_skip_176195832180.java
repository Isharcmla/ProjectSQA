package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;

public class IOUtils_skip_176195832180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30567;
     Object term32167;

    public IOUtils_skip_176195832180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30567 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term32167 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term32167, term32167.getClass(), "SMALL_BUF", null);
        setIntField(term32167, term32167.getClass(), "recordSize", 0);
        setIntField(term32167, term32167.getClass(), "blockSize", 0);
        setBooleanField(term32167, term32167.getClass(), "hasHitEOF", false);
        setLongField(term32167, term32167.getClass(), "entrySize", 0L);
        setLongField(term32167, term32167.getClass(), "entryOffset", 0L);
        setField(term32167, term32167.getClass(), "is", null);
        setField(term32167, term32167.getClass(), "currEntry", null);
        setField(term32167, term32167.getClass(), "encoding", null);
        setField(term32167, term32167.getClass(), "SINGLE", null);
        setLongField(term32167, term32167.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term30567;
        args[1] = 1073741824L;
        Object retValue = callMethod(klass, "skip", argTypes, null, args);
        assertTrue(recursiveEquals(term30567, term32167));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


