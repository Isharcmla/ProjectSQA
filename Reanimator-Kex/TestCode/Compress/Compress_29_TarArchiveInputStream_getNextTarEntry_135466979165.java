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

public class TarArchiveInputStream_getNextTarEntry_135466979165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69203;
     Object term69897;

    public TarArchiveInputStream_getNextTarEntry_135466979165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69203 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term69335 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term69203, term69203.getClass(), "hasHitEOF", false);
        setField(term69203, term69203.getClass(), "currEntry", null);
        setIntField(term69203, term69203.getClass(), "recordSize", 512);
        setField(term69203, term69203.getClass(), "is", term69335);
        term69897 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term69898 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term69897, term69897.getClass(), "SMALL_BUF", null);
        setIntField(term69897, term69897.getClass(), "recordSize", 512);
        setIntField(term69897, term69897.getClass(), "blockSize", 0);
        setBooleanField(term69897, term69897.getClass(), "hasHitEOF", true);
        setLongField(term69897, term69897.getClass(), "entrySize", 0L);
        setLongField(term69897, term69897.getClass(), "entryOffset", 0L);
        setField(term69898, term69898.getClass(), "SMALL_BUF", null);
        setIntField(term69898, term69898.getClass(), "recordSize", 0);
        setIntField(term69898, term69898.getClass(), "blockSize", 0);
        setBooleanField(term69898, term69898.getClass(), "hasHitEOF", false);
        setLongField(term69898, term69898.getClass(), "entrySize", 0L);
        setLongField(term69898, term69898.getClass(), "entryOffset", 0L);
        setField(term69898, term69898.getClass(), "is", null);
        setField(term69898, term69898.getClass(), "currEntry", null);
        setField(term69898, term69898.getClass(), "zipEncoding", null);
        setField(term69898, term69898.getClass(), "SINGLE", null);
        setLongField(term69898, term69898.getClass(), "bytesRead", 0L);
        setField(term69897, term69897.getClass(), "is", term69898);
        setField(term69897, term69897.getClass(), "currEntry", null);
        setField(term69897, term69897.getClass(), "zipEncoding", null);
        setField(term69897, term69897.getClass(), "SINGLE", null);
        setLongField(term69897, term69897.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term69203, args);
        assertTrue(recursiveEquals(term69203, term69897));
        assertTrue(recursiveEquals(retValue, null));
    }

};


