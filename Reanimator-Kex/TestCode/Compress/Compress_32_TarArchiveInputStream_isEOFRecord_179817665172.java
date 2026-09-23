package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;

public class TarArchiveInputStream_isEOFRecord_179817665172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26236;
     Object term26257;

    public TarArchiveInputStream_isEOFRecord_179817665172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26236 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term26257 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term26257, term26257.getClass(), "SMALL_BUF", null);
        setIntField(term26257, term26257.getClass(), "recordSize", 0);
        setIntField(term26257, term26257.getClass(), "blockSize", 0);
        setBooleanField(term26257, term26257.getClass(), "hasHitEOF", false);
        setLongField(term26257, term26257.getClass(), "entrySize", 0L);
        setLongField(term26257, term26257.getClass(), "entryOffset", 0L);
        setField(term26257, term26257.getClass(), "is", null);
        setField(term26257, term26257.getClass(), "currEntry", null);
        setField(term26257, term26257.getClass(), "zipEncoding", null);
        setField(term26257, term26257.getClass(), "encoding", null);
        setField(term26257, term26257.getClass(), "SINGLE", null);
        setLongField(term26257, term26257.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isEOFRecord", argTypes, term26236, args);
        assertTrue(recursiveEquals(term26236, term26257));
        assertTrue(recursiveEquals(retValue, true));
    }

};


