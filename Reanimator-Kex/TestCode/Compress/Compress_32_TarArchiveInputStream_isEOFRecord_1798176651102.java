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

public class TarArchiveInputStream_isEOFRecord_1798176651102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31374;
     Object term31222;
     Object term31431;
     Object term31432;

    public TarArchiveInputStream_isEOFRecord_1798176651102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31374 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setIntField(term31374, term31374.getClass(), "recordSize", 1);
        term31222 = (byte[]) newByteArray(1);
        term31431 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term31431, term31431.getClass(), "SMALL_BUF", null);
        setIntField(term31431, term31431.getClass(), "recordSize", 1);
        setIntField(term31431, term31431.getClass(), "blockSize", 0);
        setBooleanField(term31431, term31431.getClass(), "hasHitEOF", false);
        setLongField(term31431, term31431.getClass(), "entrySize", 0L);
        setLongField(term31431, term31431.getClass(), "entryOffset", 0L);
        setField(term31431, term31431.getClass(), "is", null);
        setField(term31431, term31431.getClass(), "currEntry", null);
        setField(term31431, term31431.getClass(), "zipEncoding", null);
        setField(term31431, term31431.getClass(), "encoding", null);
        setField(term31431, term31431.getClass(), "SINGLE", null);
        setLongField(term31431, term31431.getClass(), "bytesRead", 0L);
        term31432 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term31222;
        Object retValue = callMethod(klass, "isEOFRecord", argTypes, term31374, args);
        assertTrue(recursiveEquals(term31374, term31431));
        assertTrue(recursiveEquals(term31222, term31432));
        assertTrue(recursiveEquals(retValue, true));
    }

};


