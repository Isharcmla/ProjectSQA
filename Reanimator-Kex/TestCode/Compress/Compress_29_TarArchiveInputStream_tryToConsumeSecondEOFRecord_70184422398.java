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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30240;
     Object term31043;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_70184422398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30240 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term30372 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term30240, term30240.getClass(), "is", term30372);
        term31043 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term31044 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term31043, term31043.getClass(), "SMALL_BUF", null);
        setIntField(term31043, term31043.getClass(), "recordSize", 0);
        setIntField(term31043, term31043.getClass(), "blockSize", 0);
        setBooleanField(term31043, term31043.getClass(), "hasHitEOF", false);
        setLongField(term31043, term31043.getClass(), "entrySize", 0L);
        setLongField(term31043, term31043.getClass(), "entryOffset", 0L);
        setField(term31044, term31044.getClass(), "SMALL_BUF", null);
        setIntField(term31044, term31044.getClass(), "recordSize", 0);
        setIntField(term31044, term31044.getClass(), "blockSize", 0);
        setBooleanField(term31044, term31044.getClass(), "hasHitEOF", false);
        setLongField(term31044, term31044.getClass(), "entrySize", 0L);
        setLongField(term31044, term31044.getClass(), "entryOffset", 0L);
        setField(term31044, term31044.getClass(), "is", null);
        setField(term31044, term31044.getClass(), "currEntry", null);
        setField(term31044, term31044.getClass(), "zipEncoding", null);
        setField(term31044, term31044.getClass(), "SINGLE", null);
        setLongField(term31044, term31044.getClass(), "bytesRead", 0L);
        setField(term31043, term31043.getClass(), "is", term31044);
        setField(term31043, term31043.getClass(), "currEntry", null);
        setField(term31043, term31043.getClass(), "zipEncoding", null);
        setField(term31043, term31043.getClass(), "SINGLE", null);
        setLongField(term31043, term31043.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term30240, args);
        assertTrue(recursiveEquals(term30240, term31043));
    }

};


