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

public class TarArchiveInputStream_read_828577992181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89004;
     Object term89016;

    public TarArchiveInputStream_read_828577992181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89004 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term89004, term89004.getClass(), "hasHitEOF", true);
        term89016 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term89016, term89016.getClass(), "SMALL_BUF", null);
        setIntField(term89016, term89016.getClass(), "recordSize", 0);
        setIntField(term89016, term89016.getClass(), "blockSize", 0);
        setBooleanField(term89016, term89016.getClass(), "hasHitEOF", true);
        setLongField(term89016, term89016.getClass(), "entrySize", 0L);
        setLongField(term89016, term89016.getClass(), "entryOffset", 0L);
        setField(term89016, term89016.getClass(), "is", null);
        setField(term89016, term89016.getClass(), "currEntry", null);
        setField(term89016, term89016.getClass(), "encoding", null);
        setField(term89016, term89016.getClass(), "SINGLE", null);
        setLongField(term89016, term89016.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "read", argTypes, term89004, args);
        assertTrue(recursiveEquals(term89004, term89016));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


