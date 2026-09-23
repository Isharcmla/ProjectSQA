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

public class TarArchiveInputStream_init_18041528233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6915;

    public TarArchiveInputStream_init_18041528233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6915 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6916 = (byte[]) newByteArray(256);
        Object term6917 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term6920 = (byte[]) newByteArray(1);
        setField(term6915, term6915.getClass(), "SMALL_BUF", term6916);
        setIntField(term6915, term6915.getClass(), "recordSize", 512);
        setIntField(term6915, term6915.getClass(), "blockSize", 10240);
        setBooleanField(term6915, term6915.getClass(), "hasHitEOF", false);
        setLongField(term6915, term6915.getClass(), "entrySize", 0L);
        setLongField(term6915, term6915.getClass(), "entryOffset", 0L);
        setField(term6915, term6915.getClass(), "is", null);
        setField(term6915, term6915.getClass(), "currEntry", null);
        setField(term6917, term6917.getClass(), "charsetName", "UTF8");
        setField(term6915, term6915.getClass(), "zipEncoding", term6917);
        setField(term6915, term6915.getClass(), "SINGLE", term6920);
        setLongField(term6915, term6915.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6915));
    }

};


