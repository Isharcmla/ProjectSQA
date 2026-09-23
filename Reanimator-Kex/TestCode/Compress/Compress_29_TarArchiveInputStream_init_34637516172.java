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

public class TarArchiveInputStream_init_34637516172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25003;
     Object term25297;
     Object term25304;

    public TarArchiveInputStream_init_34637516172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24785 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term24871 = newInstance(Class.forName("java.util.jar.JarVerifier$VerifierStream"));
        setField(term24785, term24785.getClass(), "SINGLE", null);
        setLongField(term24785, term24785.getClass(), "bytesRead", 0L);
        setField(term24785, term24785.getClass(), "SMALL_BUF", null);
        setField(term24785, term24785.getClass(), "is", term24871);
        setBooleanField(term24785, term24785.getClass(), "hasHitEOF", false);
        term25003 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term25297 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term25298 = (byte[]) newByteArray(256);
        Object term25299 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term25300 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term25303 = (byte[]) newByteArray(1);
        setField(term25297, term25297.getClass(), "SMALL_BUF", term25298);
        setIntField(term25297, term25297.getClass(), "recordSize", 512);
        setIntField(term25297, term25297.getClass(), "blockSize", 10240);
        setBooleanField(term25297, term25297.getClass(), "hasHitEOF", false);
        setLongField(term25297, term25297.getClass(), "entrySize", 0L);
        setLongField(term25297, term25297.getClass(), "entryOffset", 0L);
        setField(term25299, term25299.getClass(), "SMALL_BUF", null);
        setIntField(term25299, term25299.getClass(), "recordSize", 0);
        setIntField(term25299, term25299.getClass(), "blockSize", 0);
        setBooleanField(term25299, term25299.getClass(), "hasHitEOF", false);
        setLongField(term25299, term25299.getClass(), "entrySize", 0L);
        setLongField(term25299, term25299.getClass(), "entryOffset", 0L);
        setField(term25299, term25299.getClass(), "is", null);
        setField(term25299, term25299.getClass(), "currEntry", null);
        setField(term25299, term25299.getClass(), "zipEncoding", null);
        setField(term25299, term25299.getClass(), "SINGLE", null);
        setLongField(term25299, term25299.getClass(), "bytesRead", 0L);
        setField(term25297, term25297.getClass(), "is", term25299);
        setField(term25297, term25297.getClass(), "currEntry", null);
        setField(term25300, term25300.getClass(), "charsetName", "UTF8");
        setField(term25297, term25297.getClass(), "zipEncoding", term25300);
        setField(term25297, term25297.getClass(), "SINGLE", term25303);
        setLongField(term25297, term25297.getClass(), "bytesRead", 0L);
        term25304 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term25304, term25304.getClass(), "SMALL_BUF", null);
        setIntField(term25304, term25304.getClass(), "recordSize", 0);
        setIntField(term25304, term25304.getClass(), "blockSize", 0);
        setBooleanField(term25304, term25304.getClass(), "hasHitEOF", false);
        setLongField(term25304, term25304.getClass(), "entrySize", 0L);
        setLongField(term25304, term25304.getClass(), "entryOffset", 0L);
        setField(term25304, term25304.getClass(), "is", null);
        setField(term25304, term25304.getClass(), "currEntry", null);
        setField(term25304, term25304.getClass(), "zipEncoding", null);
        setField(term25304, term25304.getClass(), "SINGLE", null);
        setLongField(term25304, term25304.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term25003;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25297));
        assertTrue(recursiveEquals(term25003, null));
    }

};


