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
import java.lang.Object;

public class IOUtils_skip_176195832192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35259;
     Object term35539;

    public IOUtils_skip_176195832192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35259 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term35391 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setLongField(term35259, term35259.getClass(), "entrySize", -9223372035781033984L);
        setLongField(term35259, term35259.getClass(), "entryOffset", 0L);
        setField(term35259, term35259.getClass(), "is", term35391);
        term35539 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term35540 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term35539, term35539.getClass(), "SMALL_BUF", null);
        setIntField(term35539, term35539.getClass(), "recordSize", 0);
        setIntField(term35539, term35539.getClass(), "blockSize", 0);
        setBooleanField(term35539, term35539.getClass(), "hasHitEOF", false);
        setLongField(term35539, term35539.getClass(), "entrySize", -9223372035781033984L);
        setLongField(term35539, term35539.getClass(), "entryOffset", 0L);
        setField(term35540, term35540.getClass(), "SMALL_BUF", null);
        setIntField(term35540, term35540.getClass(), "recordSize", 0);
        setIntField(term35540, term35540.getClass(), "blockSize", 0);
        setBooleanField(term35540, term35540.getClass(), "hasHitEOF", false);
        setLongField(term35540, term35540.getClass(), "entrySize", 0L);
        setLongField(term35540, term35540.getClass(), "entryOffset", 0L);
        setField(term35540, term35540.getClass(), "is", null);
        setField(term35540, term35540.getClass(), "currEntry", null);
        setField(term35540, term35540.getClass(), "encoding", null);
        setField(term35540, term35540.getClass(), "SINGLE", null);
        setLongField(term35540, term35540.getClass(), "bytesRead", 0L);
        setField(term35539, term35539.getClass(), "is", term35540);
        setField(term35539, term35539.getClass(), "currEntry", null);
        setField(term35539, term35539.getClass(), "encoding", null);
        setField(term35539, term35539.getClass(), "SINGLE", null);
        setLongField(term35539, term35539.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term35259;
        args[1] = 9223372033633550335L;
        Object retValue = callMethod(klass, "skip", argTypes, null, args);
        assertTrue(recursiveEquals(term35259, term35539));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


