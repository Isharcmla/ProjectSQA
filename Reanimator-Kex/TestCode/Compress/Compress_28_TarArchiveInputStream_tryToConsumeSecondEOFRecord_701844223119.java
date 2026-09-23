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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48790;
     Object term58970;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48790 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term48922 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term48790, term48790.getClass(), "is", term48922);
        setIntField(term48790, term48790.getClass(), "recordSize", 10000);
        term58970 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term58971 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term58970, term58970.getClass(), "SMALL_BUF", null);
        setIntField(term58970, term58970.getClass(), "recordSize", 10000);
        setIntField(term58970, term58970.getClass(), "blockSize", 0);
        setBooleanField(term58970, term58970.getClass(), "hasHitEOF", false);
        setLongField(term58970, term58970.getClass(), "entrySize", 0L);
        setLongField(term58970, term58970.getClass(), "entryOffset", 0L);
        setField(term58971, term58971.getClass(), "SMALL_BUF", null);
        setIntField(term58971, term58971.getClass(), "recordSize", 0);
        setIntField(term58971, term58971.getClass(), "blockSize", 0);
        setBooleanField(term58971, term58971.getClass(), "hasHitEOF", false);
        setLongField(term58971, term58971.getClass(), "entrySize", 0L);
        setLongField(term58971, term58971.getClass(), "entryOffset", 0L);
        setField(term58971, term58971.getClass(), "is", null);
        setField(term58971, term58971.getClass(), "currEntry", null);
        setField(term58971, term58971.getClass(), "encoding", null);
        setField(term58971, term58971.getClass(), "SINGLE", null);
        setLongField(term58971, term58971.getClass(), "bytesRead", 0L);
        setField(term58970, term58970.getClass(), "is", term58971);
        setField(term58970, term58970.getClass(), "currEntry", null);
        setField(term58970, term58970.getClass(), "encoding", null);
        setField(term58970, term58970.getClass(), "SINGLE", null);
        setLongField(term58970, term58970.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term48790, args);
        assertTrue(recursiveEquals(term48790, term58970));
    }

};


