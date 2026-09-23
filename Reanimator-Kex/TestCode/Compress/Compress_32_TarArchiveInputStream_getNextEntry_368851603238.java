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

public class TarArchiveInputStream_getNextEntry_368851603238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95672;
     Object term146667;

    public TarArchiveInputStream_getNextEntry_368851603238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95672 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term95804 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term95672, term95672.getClass(), "hasHitEOF", false);
        setField(term95672, term95672.getClass(), "currEntry", null);
        setIntField(term95672, term95672.getClass(), "recordSize", 512);
        setBooleanField(term95804, term95804.getClass(), "hasHitEOF", true);
        setField(term95672, term95672.getClass(), "is", term95804);
        term146667 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term146668 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term146667, term146667.getClass(), "SMALL_BUF", null);
        setIntField(term146667, term146667.getClass(), "recordSize", 512);
        setIntField(term146667, term146667.getClass(), "blockSize", 0);
        setBooleanField(term146667, term146667.getClass(), "hasHitEOF", true);
        setLongField(term146667, term146667.getClass(), "entrySize", 0L);
        setLongField(term146667, term146667.getClass(), "entryOffset", 0L);
        setField(term146668, term146668.getClass(), "SMALL_BUF", null);
        setIntField(term146668, term146668.getClass(), "recordSize", 0);
        setIntField(term146668, term146668.getClass(), "blockSize", 0);
        setBooleanField(term146668, term146668.getClass(), "hasHitEOF", true);
        setLongField(term146668, term146668.getClass(), "entrySize", 0L);
        setLongField(term146668, term146668.getClass(), "entryOffset", 0L);
        setField(term146668, term146668.getClass(), "is", null);
        setField(term146668, term146668.getClass(), "currEntry", null);
        setField(term146668, term146668.getClass(), "zipEncoding", null);
        setField(term146668, term146668.getClass(), "encoding", null);
        setField(term146668, term146668.getClass(), "SINGLE", null);
        setLongField(term146668, term146668.getClass(), "bytesRead", 0L);
        setField(term146667, term146667.getClass(), "is", term146668);
        setField(term146667, term146667.getClass(), "currEntry", null);
        setField(term146667, term146667.getClass(), "zipEncoding", null);
        setField(term146667, term146667.getClass(), "encoding", null);
        setField(term146667, term146667.getClass(), "SINGLE", null);
        setLongField(term146667, term146667.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term95672, args);
        assertTrue(recursiveEquals(term95672, term146667));
        assertTrue(recursiveEquals(retValue, null));
    }

};


