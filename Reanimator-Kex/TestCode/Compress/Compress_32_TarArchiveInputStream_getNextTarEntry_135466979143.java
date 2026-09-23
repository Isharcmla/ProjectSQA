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

public class TarArchiveInputStream_getNextTarEntry_135466979143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59928;
     Object term60994;

    public TarArchiveInputStream_getNextTarEntry_135466979143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59928 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term60060 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term59928, term59928.getClass(), "hasHitEOF", false);
        setField(term59928, term59928.getClass(), "currEntry", null);
        setIntField(term59928, term59928.getClass(), "recordSize", 512);
        setField(term59928, term59928.getClass(), "is", term60060);
        term60994 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term60995 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term60994, term60994.getClass(), "SMALL_BUF", null);
        setIntField(term60994, term60994.getClass(), "recordSize", 512);
        setIntField(term60994, term60994.getClass(), "blockSize", 0);
        setBooleanField(term60994, term60994.getClass(), "hasHitEOF", true);
        setLongField(term60994, term60994.getClass(), "entrySize", 0L);
        setLongField(term60994, term60994.getClass(), "entryOffset", 0L);
        setField(term60995, term60995.getClass(), "SMALL_BUF", null);
        setIntField(term60995, term60995.getClass(), "recordSize", 0);
        setIntField(term60995, term60995.getClass(), "blockSize", 0);
        setBooleanField(term60995, term60995.getClass(), "hasHitEOF", false);
        setLongField(term60995, term60995.getClass(), "entrySize", 0L);
        setLongField(term60995, term60995.getClass(), "entryOffset", 0L);
        setField(term60995, term60995.getClass(), "is", null);
        setField(term60995, term60995.getClass(), "currEntry", null);
        setField(term60995, term60995.getClass(), "zipEncoding", null);
        setField(term60995, term60995.getClass(), "encoding", null);
        setField(term60995, term60995.getClass(), "SINGLE", null);
        setLongField(term60995, term60995.getClass(), "bytesRead", 0L);
        setField(term60994, term60994.getClass(), "is", term60995);
        setField(term60994, term60994.getClass(), "currEntry", null);
        setField(term60994, term60994.getClass(), "zipEncoding", null);
        setField(term60994, term60994.getClass(), "encoding", null);
        setField(term60994, term60994.getClass(), "SINGLE", null);
        setLongField(term60994, term60994.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term59928, args);
        assertTrue(recursiveEquals(term59928, term60994));
        assertTrue(recursiveEquals(retValue, null));
    }

};


