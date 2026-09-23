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
import java.util.HashMap;

public class TarArchiveInputStream_init_19412011637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term10065;

    public TarArchiveInputStream_init_19412011637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new Integer(568599855);
        HashMap term10070 = new HashMap();
        term10065 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term10066 = (byte[]) newByteArray(256);
        Object term10067 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term10071 = (byte[]) newByteArray(1);
        setField(term10065, term10065.getClass(), "SMALL_BUF", term10066);
        setIntField(term10065, term10065.getClass(), "recordSize", 512);
        setIntField(term10065, term10065.getClass(), "blockSize", 568599855);
        setBooleanField(term10065, term10065.getClass(), "hasHitEOF", false);
        setLongField(term10065, term10065.getClass(), "entrySize", 0L);
        setLongField(term10065, term10065.getClass(), "entryOffset", 0L);
        setField(term10065, term10065.getClass(), "is", null);
        setField(term10065, term10065.getClass(), "currEntry", null);
        setField(term10067, term10067.getClass(), "charsetName", "UTF8");
        setField(term10065, term10065.getClass(), "zipEncoding", term10067);
        setField(term10065, term10065.getClass(), "encoding", null);
        setField(term10065, term10065.getClass(), "globalPaxHeaders", term10070);
        setField(term10065, term10065.getClass(), "SINGLE", term10071);
        setLongField(term10065, term10065.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term10065));
        assertTrue(recursiveEquals(term23, 568599855));
    }

};


