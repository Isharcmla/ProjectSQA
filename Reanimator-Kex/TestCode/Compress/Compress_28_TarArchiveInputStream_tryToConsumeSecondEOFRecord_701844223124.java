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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60446;
     Object term61565;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60446 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term60578 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term60446, term60446.getClass(), "is", term60578);
        setIntField(term60446, term60446.getClass(), "recordSize", 512);
        term61565 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term61566 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term61565, term61565.getClass(), "SMALL_BUF", null);
        setIntField(term61565, term61565.getClass(), "recordSize", 512);
        setIntField(term61565, term61565.getClass(), "blockSize", 0);
        setBooleanField(term61565, term61565.getClass(), "hasHitEOF", false);
        setLongField(term61565, term61565.getClass(), "entrySize", 0L);
        setLongField(term61565, term61565.getClass(), "entryOffset", 0L);
        setField(term61566, term61566.getClass(), "SMALL_BUF", null);
        setIntField(term61566, term61566.getClass(), "recordSize", 0);
        setIntField(term61566, term61566.getClass(), "blockSize", 0);
        setBooleanField(term61566, term61566.getClass(), "hasHitEOF", false);
        setLongField(term61566, term61566.getClass(), "entrySize", 0L);
        setLongField(term61566, term61566.getClass(), "entryOffset", 0L);
        setField(term61566, term61566.getClass(), "is", null);
        setField(term61566, term61566.getClass(), "currEntry", null);
        setField(term61566, term61566.getClass(), "encoding", null);
        setField(term61566, term61566.getClass(), "SINGLE", null);
        setLongField(term61566, term61566.getClass(), "bytesRead", 0L);
        setField(term61565, term61565.getClass(), "is", term61566);
        setField(term61565, term61565.getClass(), "currEntry", null);
        setField(term61565, term61565.getClass(), "encoding", null);
        setField(term61565, term61565.getClass(), "SINGLE", null);
        setLongField(term61565, term61565.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term60446, args);
        assertTrue(recursiveEquals(term60446, term61565));
    }

};


