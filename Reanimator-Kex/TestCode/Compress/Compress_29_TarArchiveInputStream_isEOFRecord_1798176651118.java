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

public class TarArchiveInputStream_isEOFRecord_1798176651118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35369;
     Object term35217;
     Object term35692;
     Object term35693;

    public TarArchiveInputStream_isEOFRecord_1798176651118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35369 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setIntField(term35369, term35369.getClass(), "recordSize", 1);
        term35217 = (byte[]) newByteArray(1);
        term35692 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term35692, term35692.getClass(), "SMALL_BUF", null);
        setIntField(term35692, term35692.getClass(), "recordSize", 1);
        setIntField(term35692, term35692.getClass(), "blockSize", 0);
        setBooleanField(term35692, term35692.getClass(), "hasHitEOF", false);
        setLongField(term35692, term35692.getClass(), "entrySize", 0L);
        setLongField(term35692, term35692.getClass(), "entryOffset", 0L);
        setField(term35692, term35692.getClass(), "is", null);
        setField(term35692, term35692.getClass(), "currEntry", null);
        setField(term35692, term35692.getClass(), "zipEncoding", null);
        setField(term35692, term35692.getClass(), "SINGLE", null);
        setLongField(term35692, term35692.getClass(), "bytesRead", 0L);
        term35693 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term35217;
        Object retValue = callMethod(klass, "isEOFRecord", argTypes, term35369, args);
        assertTrue(recursiveEquals(term35369, term35692));
        assertTrue(recursiveEquals(term35217, term35693));
        assertTrue(recursiveEquals(retValue, true));
    }

};


