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
import java.lang.Object;

public class TarArchiveOutputStream_flush_287142803110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101542;
     Object term102355;

    public TarArchiveOutputStream_flush_287142803110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101542 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term101676 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term101740 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        setField(term101676, term101676.getClass(), "out", term101740);
        setField(term101542, term101542.getClass(), "out", term101676);
        term102355 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term102356 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term102357 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        setLongField(term102355, term102355.getClass(), "currSize", 0L);
        setField(term102355, term102355.getClass(), "currName", null);
        setLongField(term102355, term102355.getClass(), "currBytes", 0L);
        setField(term102355, term102355.getClass(), "recordBuf", null);
        setIntField(term102355, term102355.getClass(), "assemLen", 0);
        setField(term102355, term102355.getClass(), "assemBuf", null);
        setField(term102355, term102355.getClass(), "buffer", null);
        setIntField(term102355, term102355.getClass(), "longFileMode", 0);
        setBooleanField(term102355, term102355.getClass(), "closed", false);
        setLongField(term102356, term102356.getClass(), "currSize", 0L);
        setField(term102356, term102356.getClass(), "currName", null);
        setLongField(term102356, term102356.getClass(), "currBytes", 0L);
        setField(term102356, term102356.getClass(), "recordBuf", null);
        setIntField(term102356, term102356.getClass(), "assemLen", 0);
        setField(term102356, term102356.getClass(), "assemBuf", null);
        setField(term102356, term102356.getClass(), "buffer", null);
        setIntField(term102356, term102356.getClass(), "longFileMode", 0);
        setBooleanField(term102356, term102356.getClass(), "closed", false);
        setField(term102357, term102357.getClass(), "buf", null);
        setIntField(term102357, term102357.getClass(), "count", 0);
        setField(term102356, term102356.getClass(), "out", term102357);
        setField(term102356, term102356.getClass(), "oneByte", null);
        setField(term102355, term102355.getClass(), "out", term102356);
        setField(term102355, term102355.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term101542, args);
        assertTrue(recursiveEquals(term101542, term102355));
    }

};


