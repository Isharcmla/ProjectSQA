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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88255;
     Object term120254;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88255 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term88315 = newInstance(Class.forName("java.io.SequenceInputStream"));
        setField(term88255, term88255.getClass(), "is", term88315);
        setIntField(term88255, term88255.getClass(), "recordSize", 512);
        term120254 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term120255 = newInstance(Class.forName("java.io.SequenceInputStream"));
        setField(term120254, term120254.getClass(), "SMALL_BUF", null);
        setIntField(term120254, term120254.getClass(), "recordSize", 512);
        setIntField(term120254, term120254.getClass(), "blockSize", 0);
        setBooleanField(term120254, term120254.getClass(), "hasHitEOF", false);
        setLongField(term120254, term120254.getClass(), "entrySize", 0L);
        setLongField(term120254, term120254.getClass(), "entryOffset", 0L);
        setField(term120255, term120255.getClass(), "e", null);
        setField(term120255, term120255.getClass(), "in", null);
        setField(term120254, term120254.getClass(), "is", term120255);
        setField(term120254, term120254.getClass(), "currEntry", null);
        setField(term120254, term120254.getClass(), "zipEncoding", null);
        setField(term120254, term120254.getClass(), "encoding", null);
        setField(term120254, term120254.getClass(), "SINGLE", null);
        setLongField(term120254, term120254.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term88255, args);
        assertTrue(recursiveEquals(term88255, term120254));
    }

};


