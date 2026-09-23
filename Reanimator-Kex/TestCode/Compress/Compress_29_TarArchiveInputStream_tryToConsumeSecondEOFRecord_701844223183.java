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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82710;
     Object term83407;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82710 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term82842 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term82842, term82842.getClass(), "hasHitEOF", true);
        setField(term82710, term82710.getClass(), "is", term82842);
        setIntField(term82710, term82710.getClass(), "recordSize", 512);
        term83407 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term83408 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term83407, term83407.getClass(), "SMALL_BUF", null);
        setIntField(term83407, term83407.getClass(), "recordSize", 512);
        setIntField(term83407, term83407.getClass(), "blockSize", 0);
        setBooleanField(term83407, term83407.getClass(), "hasHitEOF", false);
        setLongField(term83407, term83407.getClass(), "entrySize", 0L);
        setLongField(term83407, term83407.getClass(), "entryOffset", 0L);
        setField(term83408, term83408.getClass(), "SMALL_BUF", null);
        setIntField(term83408, term83408.getClass(), "recordSize", 0);
        setIntField(term83408, term83408.getClass(), "blockSize", 0);
        setBooleanField(term83408, term83408.getClass(), "hasHitEOF", true);
        setLongField(term83408, term83408.getClass(), "entrySize", 0L);
        setLongField(term83408, term83408.getClass(), "entryOffset", 0L);
        setField(term83408, term83408.getClass(), "is", null);
        setField(term83408, term83408.getClass(), "currEntry", null);
        setField(term83408, term83408.getClass(), "zipEncoding", null);
        setField(term83408, term83408.getClass(), "SINGLE", null);
        setLongField(term83408, term83408.getClass(), "bytesRead", 0L);
        setField(term83407, term83407.getClass(), "is", term83408);
        setField(term83407, term83407.getClass(), "currEntry", null);
        setField(term83407, term83407.getClass(), "zipEncoding", null);
        setField(term83407, term83407.getClass(), "SINGLE", null);
        setLongField(term83407, term83407.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term82710, args);
        assertTrue(recursiveEquals(term82710, term83407));
    }

};


