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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46356;
     Object term46535;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46356 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term46488 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term46356, term46356.getClass(), "is", term46488);
        term46535 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term46536 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term46535, term46535.getClass(), "SMALL_BUF", null);
        setIntField(term46535, term46535.getClass(), "recordSize", 0);
        setIntField(term46535, term46535.getClass(), "blockSize", 0);
        setBooleanField(term46535, term46535.getClass(), "hasHitEOF", false);
        setLongField(term46535, term46535.getClass(), "entrySize", 0L);
        setLongField(term46535, term46535.getClass(), "entryOffset", 0L);
        setField(term46536, term46536.getClass(), "SMALL_BUF", null);
        setIntField(term46536, term46536.getClass(), "recordSize", 0);
        setIntField(term46536, term46536.getClass(), "blockSize", 0);
        setBooleanField(term46536, term46536.getClass(), "hasHitEOF", false);
        setLongField(term46536, term46536.getClass(), "entrySize", 0L);
        setLongField(term46536, term46536.getClass(), "entryOffset", 0L);
        setField(term46536, term46536.getClass(), "is", null);
        setField(term46536, term46536.getClass(), "currEntry", null);
        setField(term46536, term46536.getClass(), "encoding", null);
        setField(term46536, term46536.getClass(), "SINGLE", null);
        setLongField(term46536, term46536.getClass(), "bytesRead", 0L);
        setField(term46535, term46535.getClass(), "is", term46536);
        setField(term46535, term46535.getClass(), "currEntry", null);
        setField(term46535, term46535.getClass(), "encoding", null);
        setField(term46535, term46535.getClass(), "SINGLE", null);
        setLongField(term46535, term46535.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term46356, args);
        assertTrue(recursiveEquals(term46356, term46535));
    }

};


