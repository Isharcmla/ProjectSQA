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
import java.lang.Object;

public class TarArchiveInputStream_init_18041528231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6479;

    public TarArchiveInputStream_init_18041528231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6479 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6480 = (byte[]) newByteArray(256);
        Object term6481 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term6484 = (byte[]) newByteArray(1);
        setField(term6479, term6479.getClass(), "SMALL_BUF", term6480);
        setIntField(term6479, term6479.getClass(), "recordSize", 512);
        setIntField(term6479, term6479.getClass(), "blockSize", 10240);
        setBooleanField(term6479, term6479.getClass(), "hasHitEOF", false);
        setLongField(term6479, term6479.getClass(), "entrySize", 0L);
        setLongField(term6479, term6479.getClass(), "entryOffset", 0L);
        setField(term6479, term6479.getClass(), "is", null);
        setField(term6479, term6479.getClass(), "currEntry", null);
        setField(term6481, term6481.getClass(), "charsetName", "UTF8");
        setField(term6479, term6479.getClass(), "encoding", term6481);
        setField(term6479, term6479.getClass(), "SINGLE", term6484);
        setLongField(term6479, term6479.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6479));
    }

};


