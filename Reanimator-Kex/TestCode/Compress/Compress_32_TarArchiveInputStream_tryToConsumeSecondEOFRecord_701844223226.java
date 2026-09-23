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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88460;
     Object term120290;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88460 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term88520 = newInstance(Class.forName("java.io.SequenceInputStream"));
        setField(term88460, term88460.getClass(), "is", term88520);
        term120290 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term120291 = newInstance(Class.forName("java.io.SequenceInputStream"));
        setField(term120290, term120290.getClass(), "SMALL_BUF", null);
        setIntField(term120290, term120290.getClass(), "recordSize", 0);
        setIntField(term120290, term120290.getClass(), "blockSize", 0);
        setBooleanField(term120290, term120290.getClass(), "hasHitEOF", false);
        setLongField(term120290, term120290.getClass(), "entrySize", 0L);
        setLongField(term120290, term120290.getClass(), "entryOffset", 0L);
        setField(term120291, term120291.getClass(), "e", null);
        setField(term120291, term120291.getClass(), "in", null);
        setField(term120290, term120290.getClass(), "is", term120291);
        setField(term120290, term120290.getClass(), "currEntry", null);
        setField(term120290, term120290.getClass(), "zipEncoding", null);
        setField(term120290, term120290.getClass(), "encoding", null);
        setField(term120290, term120290.getClass(), "SINGLE", null);
        setLongField(term120290, term120290.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term88460, args);
        assertTrue(recursiveEquals(term88460, term120290));
    }

};


