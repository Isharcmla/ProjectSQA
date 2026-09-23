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

public class TarArchiveInputStream_getNextTarEntry_135466979205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99543;
     Object term100237;

    public TarArchiveInputStream_getNextTarEntry_135466979205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99543 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term99675 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term99543, term99543.getClass(), "hasHitEOF", false);
        setField(term99543, term99543.getClass(), "currEntry", null);
        setIntField(term99543, term99543.getClass(), "recordSize", 512);
        setField(term99543, term99543.getClass(), "is", term99675);
        term100237 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term100238 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term100237, term100237.getClass(), "SMALL_BUF", null);
        setIntField(term100237, term100237.getClass(), "recordSize", 512);
        setIntField(term100237, term100237.getClass(), "blockSize", 0);
        setBooleanField(term100237, term100237.getClass(), "hasHitEOF", true);
        setLongField(term100237, term100237.getClass(), "entrySize", 0L);
        setLongField(term100237, term100237.getClass(), "entryOffset", 0L);
        setField(term100238, term100238.getClass(), "SMALL_BUF", null);
        setIntField(term100238, term100238.getClass(), "recordSize", 0);
        setIntField(term100238, term100238.getClass(), "blockSize", 0);
        setBooleanField(term100238, term100238.getClass(), "hasHitEOF", false);
        setLongField(term100238, term100238.getClass(), "entrySize", 0L);
        setLongField(term100238, term100238.getClass(), "entryOffset", 0L);
        setField(term100238, term100238.getClass(), "is", null);
        setField(term100238, term100238.getClass(), "currEntry", null);
        setField(term100238, term100238.getClass(), "encoding", null);
        setField(term100238, term100238.getClass(), "SINGLE", null);
        setLongField(term100238, term100238.getClass(), "bytesRead", 0L);
        setField(term100237, term100237.getClass(), "is", term100238);
        setField(term100237, term100237.getClass(), "currEntry", null);
        setField(term100237, term100237.getClass(), "encoding", null);
        setField(term100237, term100237.getClass(), "SINGLE", null);
        setLongField(term100237, term100237.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term99543, args);
        assertTrue(recursiveEquals(term99543, term100237));
        assertTrue(recursiveEquals(retValue, null));
    }

};


