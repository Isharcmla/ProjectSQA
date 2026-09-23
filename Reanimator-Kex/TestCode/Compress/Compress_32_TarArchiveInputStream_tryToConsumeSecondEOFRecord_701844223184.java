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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78321;
     Object term79136;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78321 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term78381 = newInstance(Class.forName("java.io.SequenceInputStream"));
        setField(term78321, term78321.getClass(), "is", term78381);
        term79136 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term79137 = newInstance(Class.forName("java.io.SequenceInputStream"));
        setField(term79136, term79136.getClass(), "SMALL_BUF", null);
        setIntField(term79136, term79136.getClass(), "recordSize", 0);
        setIntField(term79136, term79136.getClass(), "blockSize", 0);
        setBooleanField(term79136, term79136.getClass(), "hasHitEOF", false);
        setLongField(term79136, term79136.getClass(), "entrySize", 0L);
        setLongField(term79136, term79136.getClass(), "entryOffset", 0L);
        setField(term79137, term79137.getClass(), "e", null);
        setField(term79137, term79137.getClass(), "in", null);
        setField(term79136, term79136.getClass(), "is", term79137);
        setField(term79136, term79136.getClass(), "currEntry", null);
        setField(term79136, term79136.getClass(), "zipEncoding", null);
        setField(term79136, term79136.getClass(), "encoding", null);
        setField(term79136, term79136.getClass(), "SINGLE", null);
        setLongField(term79136, term79136.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term78321, args);
        assertTrue(recursiveEquals(term78321, term79136));
    }

};


