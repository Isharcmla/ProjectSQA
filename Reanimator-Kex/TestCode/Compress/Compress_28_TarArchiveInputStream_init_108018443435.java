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

public class TarArchiveInputStream_init_108018443435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term51;
     Object term9275;

    public TarArchiveInputStream_init_108018443435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = new Integer(1484323161);
        term51 = new Integer(391863371);
        term9275 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term9276 = (byte[]) newByteArray(256);
        Object term9277 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term9280 = (byte[]) newByteArray(1);
        setField(term9275, term9275.getClass(), "SMALL_BUF", term9276);
        setIntField(term9275, term9275.getClass(), "recordSize", 391863371);
        setIntField(term9275, term9275.getClass(), "blockSize", 1484323161);
        setBooleanField(term9275, term9275.getClass(), "hasHitEOF", false);
        setLongField(term9275, term9275.getClass(), "entrySize", 0L);
        setLongField(term9275, term9275.getClass(), "entryOffset", 0L);
        setField(term9275, term9275.getClass(), "is", null);
        setField(term9275, term9275.getClass(), "currEntry", null);
        setField(term9277, term9277.getClass(), "charsetName", "UTF8");
        setField(term9275, term9275.getClass(), "encoding", term9277);
        setField(term9275, term9275.getClass(), "SINGLE", term9280);
        setLongField(term9275, term9275.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term49;
        args[2] = term51;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9275));
        assertTrue(recursiveEquals(term49, 1484323161));
        assertTrue(recursiveEquals(term51, 391863371));
    }

};


