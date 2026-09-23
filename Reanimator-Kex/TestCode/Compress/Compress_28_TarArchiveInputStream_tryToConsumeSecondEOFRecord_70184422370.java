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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24213;
     Object term24546;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24213 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term24345 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term24213, term24213.getClass(), "is", term24345);
        term24546 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term24547 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term24546, term24546.getClass(), "SMALL_BUF", null);
        setIntField(term24546, term24546.getClass(), "recordSize", 0);
        setIntField(term24546, term24546.getClass(), "blockSize", 0);
        setBooleanField(term24546, term24546.getClass(), "hasHitEOF", false);
        setLongField(term24546, term24546.getClass(), "entrySize", 0L);
        setLongField(term24546, term24546.getClass(), "entryOffset", 0L);
        setField(term24547, term24547.getClass(), "SMALL_BUF", null);
        setIntField(term24547, term24547.getClass(), "recordSize", 0);
        setIntField(term24547, term24547.getClass(), "blockSize", 0);
        setBooleanField(term24547, term24547.getClass(), "hasHitEOF", false);
        setLongField(term24547, term24547.getClass(), "entrySize", 0L);
        setLongField(term24547, term24547.getClass(), "entryOffset", 0L);
        setField(term24547, term24547.getClass(), "is", null);
        setField(term24547, term24547.getClass(), "currEntry", null);
        setField(term24547, term24547.getClass(), "encoding", null);
        setField(term24547, term24547.getClass(), "SINGLE", null);
        setLongField(term24547, term24547.getClass(), "bytesRead", 0L);
        setField(term24546, term24546.getClass(), "is", term24547);
        setField(term24546, term24546.getClass(), "currEntry", null);
        setField(term24546, term24546.getClass(), "encoding", null);
        setField(term24546, term24546.getClass(), "SINGLE", null);
        setLongField(term24546, term24546.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term24213, args);
        assertTrue(recursiveEquals(term24213, term24546));
    }

};


