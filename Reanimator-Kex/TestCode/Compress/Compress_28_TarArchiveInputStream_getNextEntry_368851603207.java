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

public class TarArchiveInputStream_getNextEntry_368851603207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100917;
     Object term101611;

    public TarArchiveInputStream_getNextEntry_368851603207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100917 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term101049 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term100917, term100917.getClass(), "hasHitEOF", false);
        setField(term100917, term100917.getClass(), "currEntry", null);
        setIntField(term100917, term100917.getClass(), "recordSize", 512);
        setField(term100917, term100917.getClass(), "is", term101049);
        term101611 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term101612 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term101611, term101611.getClass(), "SMALL_BUF", null);
        setIntField(term101611, term101611.getClass(), "recordSize", 512);
        setIntField(term101611, term101611.getClass(), "blockSize", 0);
        setBooleanField(term101611, term101611.getClass(), "hasHitEOF", true);
        setLongField(term101611, term101611.getClass(), "entrySize", 0L);
        setLongField(term101611, term101611.getClass(), "entryOffset", 0L);
        setField(term101612, term101612.getClass(), "SMALL_BUF", null);
        setIntField(term101612, term101612.getClass(), "recordSize", 0);
        setIntField(term101612, term101612.getClass(), "blockSize", 0);
        setBooleanField(term101612, term101612.getClass(), "hasHitEOF", false);
        setLongField(term101612, term101612.getClass(), "entrySize", 0L);
        setLongField(term101612, term101612.getClass(), "entryOffset", 0L);
        setField(term101612, term101612.getClass(), "is", null);
        setField(term101612, term101612.getClass(), "currEntry", null);
        setField(term101612, term101612.getClass(), "encoding", null);
        setField(term101612, term101612.getClass(), "SINGLE", null);
        setLongField(term101612, term101612.getClass(), "bytesRead", 0L);
        setField(term101611, term101611.getClass(), "is", term101612);
        setField(term101611, term101611.getClass(), "currEntry", null);
        setField(term101611, term101611.getClass(), "encoding", null);
        setField(term101611, term101611.getClass(), "SINGLE", null);
        setLongField(term101611, term101611.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term100917, args);
        assertTrue(recursiveEquals(term100917, term101611));
        assertTrue(recursiveEquals(retValue, null));
    }

};


