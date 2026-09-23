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
import java.lang.Integer;
import java.lang.Object;

public class TarArchiveInputStream_init_19412011635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term8909;

    public TarArchiveInputStream_init_19412011635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new Integer(568599855);
        term8909 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term8910 = (byte[]) newByteArray(256);
        Object term8911 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term8914 = (byte[]) newByteArray(1);
        setField(term8909, term8909.getClass(), "SMALL_BUF", term8910);
        setIntField(term8909, term8909.getClass(), "recordSize", 512);
        setIntField(term8909, term8909.getClass(), "blockSize", 568599855);
        setBooleanField(term8909, term8909.getClass(), "hasHitEOF", false);
        setLongField(term8909, term8909.getClass(), "entrySize", 0L);
        setLongField(term8909, term8909.getClass(), "entryOffset", 0L);
        setField(term8909, term8909.getClass(), "is", null);
        setField(term8909, term8909.getClass(), "currEntry", null);
        setField(term8911, term8911.getClass(), "charsetName", "UTF8");
        setField(term8909, term8909.getClass(), "zipEncoding", term8911);
        setField(term8909, term8909.getClass(), "encoding", null);
        setField(term8909, term8909.getClass(), "SINGLE", term8914);
        setLongField(term8909, term8909.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8909));
        assertTrue(recursiveEquals(term23, 568599855));
    }

};


