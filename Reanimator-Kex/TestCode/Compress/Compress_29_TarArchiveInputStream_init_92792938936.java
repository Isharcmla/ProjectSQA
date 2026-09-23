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

public class TarArchiveInputStream_init_92792938936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term9130;

    public TarArchiveInputStream_init_92792938936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Integer(1162663216);
        term9130 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term9131 = (byte[]) newByteArray(256);
        Object term9132 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term9135 = (byte[]) newByteArray(1);
        setField(term9130, term9130.getClass(), "SMALL_BUF", term9131);
        setIntField(term9130, term9130.getClass(), "recordSize", 512);
        setIntField(term9130, term9130.getClass(), "blockSize", 1162663216);
        setBooleanField(term9130, term9130.getClass(), "hasHitEOF", false);
        setLongField(term9130, term9130.getClass(), "entrySize", 0L);
        setLongField(term9130, term9130.getClass(), "entryOffset", 0L);
        setField(term9130, term9130.getClass(), "is", null);
        setField(term9130, term9130.getClass(), "currEntry", null);
        setField(term9132, term9132.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term9130, term9130.getClass(), "zipEncoding", term9132);
        setField(term9130, term9130.getClass(), "SINGLE", term9135);
        setLongField(term9130, term9130.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term9130));
        assertTrue(recursiveEquals(term25, null));
    }

};


