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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45596;
     Object term56452;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45596 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term45728 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term45596, term45596.getClass(), "is", term45728);
        setIntField(term45596, term45596.getClass(), "recordSize", 10000);
        term56452 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term56453 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term56452, term56452.getClass(), "SMALL_BUF", null);
        setIntField(term56452, term56452.getClass(), "recordSize", 10000);
        setIntField(term56452, term56452.getClass(), "blockSize", 0);
        setBooleanField(term56452, term56452.getClass(), "hasHitEOF", false);
        setLongField(term56452, term56452.getClass(), "entrySize", 0L);
        setLongField(term56452, term56452.getClass(), "entryOffset", 0L);
        setField(term56453, term56453.getClass(), "SMALL_BUF", null);
        setIntField(term56453, term56453.getClass(), "recordSize", 0);
        setIntField(term56453, term56453.getClass(), "blockSize", 0);
        setBooleanField(term56453, term56453.getClass(), "hasHitEOF", false);
        setLongField(term56453, term56453.getClass(), "entrySize", 0L);
        setLongField(term56453, term56453.getClass(), "entryOffset", 0L);
        setField(term56453, term56453.getClass(), "is", null);
        setField(term56453, term56453.getClass(), "currEntry", null);
        setField(term56453, term56453.getClass(), "zipEncoding", null);
        setField(term56453, term56453.getClass(), "SINGLE", null);
        setLongField(term56453, term56453.getClass(), "bytesRead", 0L);
        setField(term56452, term56452.getClass(), "is", term56453);
        setField(term56452, term56452.getClass(), "currEntry", null);
        setField(term56452, term56452.getClass(), "zipEncoding", null);
        setField(term56452, term56452.getClass(), "SINGLE", null);
        setLongField(term56452, term56452.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term45596, args);
        assertTrue(recursiveEquals(term45596, term56452));
    }

};


