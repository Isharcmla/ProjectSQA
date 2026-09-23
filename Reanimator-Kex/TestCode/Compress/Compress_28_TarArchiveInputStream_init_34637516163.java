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

public class TarArchiveInputStream_init_34637516163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22562;
     Object term22858;
     Object term22865;

    public TarArchiveInputStream_init_34637516163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22320 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term22430 = newInstance(Class.forName("org.apache.commons.compress.utils.BoundedInputStream"));
        setField(term22320, term22320.getClass(), "SINGLE", null);
        setLongField(term22320, term22320.getClass(), "bytesRead", 0L);
        setField(term22320, term22320.getClass(), "SMALL_BUF", null);
        setField(term22320, term22320.getClass(), "is", term22430);
        setBooleanField(term22320, term22320.getClass(), "hasHitEOF", false);
        term22562 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term22858 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term22859 = (byte[]) newByteArray(256);
        Object term22860 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term22861 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term22864 = (byte[]) newByteArray(1);
        setField(term22858, term22858.getClass(), "SMALL_BUF", term22859);
        setIntField(term22858, term22858.getClass(), "recordSize", 512);
        setIntField(term22858, term22858.getClass(), "blockSize", 10240);
        setBooleanField(term22858, term22858.getClass(), "hasHitEOF", false);
        setLongField(term22858, term22858.getClass(), "entrySize", 0L);
        setLongField(term22858, term22858.getClass(), "entryOffset", 0L);
        setField(term22860, term22860.getClass(), "SMALL_BUF", null);
        setIntField(term22860, term22860.getClass(), "recordSize", 0);
        setIntField(term22860, term22860.getClass(), "blockSize", 0);
        setBooleanField(term22860, term22860.getClass(), "hasHitEOF", false);
        setLongField(term22860, term22860.getClass(), "entrySize", 0L);
        setLongField(term22860, term22860.getClass(), "entryOffset", 0L);
        setField(term22860, term22860.getClass(), "is", null);
        setField(term22860, term22860.getClass(), "currEntry", null);
        setField(term22860, term22860.getClass(), "encoding", null);
        setField(term22860, term22860.getClass(), "SINGLE", null);
        setLongField(term22860, term22860.getClass(), "bytesRead", 0L);
        setField(term22858, term22858.getClass(), "is", term22860);
        setField(term22858, term22858.getClass(), "currEntry", null);
        setField(term22861, term22861.getClass(), "charsetName", "UTF8");
        setField(term22858, term22858.getClass(), "encoding", term22861);
        setField(term22858, term22858.getClass(), "SINGLE", term22864);
        setLongField(term22858, term22858.getClass(), "bytesRead", 0L);
        term22865 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term22865, term22865.getClass(), "SMALL_BUF", null);
        setIntField(term22865, term22865.getClass(), "recordSize", 0);
        setIntField(term22865, term22865.getClass(), "blockSize", 0);
        setBooleanField(term22865, term22865.getClass(), "hasHitEOF", false);
        setLongField(term22865, term22865.getClass(), "entrySize", 0L);
        setLongField(term22865, term22865.getClass(), "entryOffset", 0L);
        setField(term22865, term22865.getClass(), "is", null);
        setField(term22865, term22865.getClass(), "currEntry", null);
        setField(term22865, term22865.getClass(), "encoding", null);
        setField(term22865, term22865.getClass(), "SINGLE", null);
        setLongField(term22865, term22865.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term22562;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22858));
        assertTrue(recursiveEquals(term22562, null));
    }

};


