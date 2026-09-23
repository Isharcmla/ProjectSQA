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

public class TarArchiveInputStream_init_18041528222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24983;

    public TarArchiveInputStream_init_18041528222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24983 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term24984 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term24985 = (byte[]) newByteArray(10240);
        byte[] term24986 = (byte[]) newByteArray(1);
        setBooleanField(term24983, term24983.getClass(), "hasHitEOF", false);
        setLongField(term24983, term24983.getClass(), "entrySize", 0L);
        setLongField(term24983, term24983.getClass(), "entryOffset", 0L);
        setField(term24983, term24983.getClass(), "readBuf", null);
        setField(term24984, term24984.getClass(), "inStream", null);
        setField(term24984, term24984.getClass(), "outStream", null);
        setField(term24984, term24984.getClass(), "blockBuffer", term24985);
        setIntField(term24984, term24984.getClass(), "currBlkIdx", 0);
        setIntField(term24984, term24984.getClass(), "currRecIdx", 0);
        setIntField(term24984, term24984.getClass(), "blockSize", 10240);
        setIntField(term24984, term24984.getClass(), "recordSize", 512);
        setIntField(term24984, term24984.getClass(), "recsPerBlock", 20);
        setField(term24983, term24983.getClass(), "buffer", term24984);
        setField(term24983, term24983.getClass(), "currEntry", null);
        setField(term24983, term24983.getClass(), "SINGLE", term24986);
        setLongField(term24983, term24983.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24983));
    }

};


