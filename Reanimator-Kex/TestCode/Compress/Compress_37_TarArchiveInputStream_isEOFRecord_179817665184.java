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

public class TarArchiveInputStream_isEOFRecord_179817665184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33524;
     Object term33677;

    public TarArchiveInputStream_isEOFRecord_179817665184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33524 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term33677 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term33677, term33677.getClass(), "SMALL_BUF", null);
        setIntField(term33677, term33677.getClass(), "recordSize", 0);
        setIntField(term33677, term33677.getClass(), "blockSize", 0);
        setBooleanField(term33677, term33677.getClass(), "hasHitEOF", false);
        setLongField(term33677, term33677.getClass(), "entrySize", 0L);
        setLongField(term33677, term33677.getClass(), "entryOffset", 0L);
        setField(term33677, term33677.getClass(), "is", null);
        setField(term33677, term33677.getClass(), "currEntry", null);
        setField(term33677, term33677.getClass(), "zipEncoding", null);
        setField(term33677, term33677.getClass(), "encoding", null);
        setField(term33677, term33677.getClass(), "globalPaxHeaders", null);
        setField(term33677, term33677.getClass(), "SINGLE", null);
        setLongField(term33677, term33677.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isEOFRecord", argTypes, term33524, args);
        assertTrue(recursiveEquals(term33524, term33677));
        assertTrue(recursiveEquals(retValue, true));
    }

};


