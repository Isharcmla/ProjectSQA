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

public class TarArchiveInputStream_getNextEntry_368851603102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31335;
     Object term31643;

    public TarArchiveInputStream_getNextEntry_368851603102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31335 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term31335, term31335.getClass(), "hasHitEOF", true);
        term31643 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term31643, term31643.getClass(), "SMALL_BUF", null);
        setIntField(term31643, term31643.getClass(), "recordSize", 0);
        setIntField(term31643, term31643.getClass(), "blockSize", 0);
        setBooleanField(term31643, term31643.getClass(), "hasHitEOF", true);
        setLongField(term31643, term31643.getClass(), "entrySize", 0L);
        setLongField(term31643, term31643.getClass(), "entryOffset", 0L);
        setField(term31643, term31643.getClass(), "is", null);
        setField(term31643, term31643.getClass(), "currEntry", null);
        setField(term31643, term31643.getClass(), "zipEncoding", null);
        setField(term31643, term31643.getClass(), "SINGLE", null);
        setLongField(term31643, term31643.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term31335, args);
        assertTrue(recursiveEquals(term31335, term31643));
        assertTrue(recursiveEquals(retValue, null));
    }

};


