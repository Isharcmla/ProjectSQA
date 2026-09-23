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

public class TarArchiveInputStream_read_82857799298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30689;
     Object term30855;

    public TarArchiveInputStream_read_82857799298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30689 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term30689, term30689.getClass(), "hasHitEOF", false);
        term30855 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term30855, term30855.getClass(), "SMALL_BUF", null);
        setIntField(term30855, term30855.getClass(), "recordSize", 0);
        setIntField(term30855, term30855.getClass(), "blockSize", 0);
        setBooleanField(term30855, term30855.getClass(), "hasHitEOF", false);
        setLongField(term30855, term30855.getClass(), "entrySize", 0L);
        setLongField(term30855, term30855.getClass(), "entryOffset", 0L);
        setField(term30855, term30855.getClass(), "is", null);
        setField(term30855, term30855.getClass(), "currEntry", null);
        setField(term30855, term30855.getClass(), "zipEncoding", null);
        setField(term30855, term30855.getClass(), "encoding", null);
        setField(term30855, term30855.getClass(), "SINGLE", null);
        setLongField(term30855, term30855.getClass(), "bytesRead", 0L);
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
        Object retValue = callMethod(klass, "read", argTypes, term30689, args);
        assertTrue(recursiveEquals(term30689, term30855));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


