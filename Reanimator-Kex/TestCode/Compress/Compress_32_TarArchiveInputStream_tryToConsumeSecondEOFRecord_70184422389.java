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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29251;
     Object term29437;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29251 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term29383 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term29251, term29251.getClass(), "is", term29383);
        term29437 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term29438 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term29437, term29437.getClass(), "SMALL_BUF", null);
        setIntField(term29437, term29437.getClass(), "recordSize", 0);
        setIntField(term29437, term29437.getClass(), "blockSize", 0);
        setBooleanField(term29437, term29437.getClass(), "hasHitEOF", false);
        setLongField(term29437, term29437.getClass(), "entrySize", 0L);
        setLongField(term29437, term29437.getClass(), "entryOffset", 0L);
        setField(term29438, term29438.getClass(), "SMALL_BUF", null);
        setIntField(term29438, term29438.getClass(), "recordSize", 0);
        setIntField(term29438, term29438.getClass(), "blockSize", 0);
        setBooleanField(term29438, term29438.getClass(), "hasHitEOF", false);
        setLongField(term29438, term29438.getClass(), "entrySize", 0L);
        setLongField(term29438, term29438.getClass(), "entryOffset", 0L);
        setField(term29438, term29438.getClass(), "is", null);
        setField(term29438, term29438.getClass(), "currEntry", null);
        setField(term29438, term29438.getClass(), "zipEncoding", null);
        setField(term29438, term29438.getClass(), "encoding", null);
        setField(term29438, term29438.getClass(), "SINGLE", null);
        setLongField(term29438, term29438.getClass(), "bytesRead", 0L);
        setField(term29437, term29437.getClass(), "is", term29438);
        setField(term29437, term29437.getClass(), "currEntry", null);
        setField(term29437, term29437.getClass(), "zipEncoding", null);
        setField(term29437, term29437.getClass(), "encoding", null);
        setField(term29437, term29437.getClass(), "SINGLE", null);
        setLongField(term29437, term29437.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term29251, args);
        assertTrue(recursiveEquals(term29251, term29437));
    }

};


