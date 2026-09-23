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

public class TarArchiveInputStream_init_92792938938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term10900;

    public TarArchiveInputStream_init_92792938938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Integer(1162663216);
        HashMap term10907 = new HashMap();
        term10900 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term10901 = (byte[]) newByteArray(256);
        Object term10902 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term10908 = (byte[]) newByteArray(1);
        setField(term10900, term10900.getClass(), "SMALL_BUF", term10901);
        setIntField(term10900, term10900.getClass(), "recordSize", 512);
        setIntField(term10900, term10900.getClass(), "blockSize", 1162663216);
        setBooleanField(term10900, term10900.getClass(), "hasHitEOF", false);
        setLongField(term10900, term10900.getClass(), "entrySize", 0L);
        setLongField(term10900, term10900.getClass(), "entryOffset", 0L);
        setField(term10900, term10900.getClass(), "is", null);
        setField(term10900, term10900.getClass(), "currEntry", null);
        setField(term10902, term10902.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term10900, term10900.getClass(), "zipEncoding", term10902);
        setField(term10900, term10900.getClass(), "encoding", "sjlJAEtRrb");
        setField(term10900, term10900.getClass(), "globalPaxHeaders", term10907);
        setField(term10900, term10900.getClass(), "SINGLE", term10908);
        setLongField(term10900, term10900.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term25;
        args[2] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10900));
        assertTrue(recursiveEquals(term25, null));
    }

};


