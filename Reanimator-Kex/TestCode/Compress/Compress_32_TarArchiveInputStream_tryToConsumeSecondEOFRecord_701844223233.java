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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91695;
     Object term142698;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91695 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term91755 = newInstance(Class.forName("java.io.SequenceInputStream"));
        setField(term91695, term91695.getClass(), "is", term91755);
        setIntField(term91695, term91695.getClass(), "recordSize", 10000);
        term142698 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term142699 = newInstance(Class.forName("java.io.SequenceInputStream"));
        setField(term142698, term142698.getClass(), "SMALL_BUF", null);
        setIntField(term142698, term142698.getClass(), "recordSize", 10000);
        setIntField(term142698, term142698.getClass(), "blockSize", 0);
        setBooleanField(term142698, term142698.getClass(), "hasHitEOF", false);
        setLongField(term142698, term142698.getClass(), "entrySize", 0L);
        setLongField(term142698, term142698.getClass(), "entryOffset", 0L);
        setField(term142699, term142699.getClass(), "e", null);
        setField(term142699, term142699.getClass(), "in", null);
        setField(term142698, term142698.getClass(), "is", term142699);
        setField(term142698, term142698.getClass(), "currEntry", null);
        setField(term142698, term142698.getClass(), "zipEncoding", null);
        setField(term142698, term142698.getClass(), "encoding", null);
        setField(term142698, term142698.getClass(), "SINGLE", null);
        setLongField(term142698, term142698.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term91695, args);
        assertTrue(recursiveEquals(term91695, term142698));
    }

};


