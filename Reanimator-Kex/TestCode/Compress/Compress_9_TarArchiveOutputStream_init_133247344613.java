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

public class TarArchiveOutputStream_init_133247344613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22049;

    public TarArchiveOutputStream_init_133247344613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22049 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term22050 = (byte[]) newByteArray(512);
        byte[] term22051 = (byte[]) newByteArray(512);
        Object term22052 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term22053 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term22054 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term22055 = newInstance(Class.forName("java.lang.Object"));
        byte[] term22056 = (byte[]) newByteArray(10240);
        byte[] term22057 = (byte[]) newByteArray(1);
        setLongField(term22049, term22049.getClass(), "currSize", 0L);
        setField(term22049, term22049.getClass(), "currName", null);
        setLongField(term22049, term22049.getClass(), "currBytes", 0L);
        setField(term22049, term22049.getClass(), "recordBuf", term22050);
        setIntField(term22049, term22049.getClass(), "assemLen", 0);
        setField(term22049, term22049.getClass(), "assemBuf", term22051);
        setField(term22052, term22052.getClass(), "inStream", null);
        setLongField(term22054, term22054.getClass(), "value", 0L);
        setField(term22053, term22053.getClass(), "bytesWritten", term22054);
        setField(term22053, term22053.getClass(), "out", null);
        setBooleanField(term22053, term22053.getClass(), "closed", false);
        setField(term22053, term22053.getClass(), "closeLock", term22055);
        setField(term22052, term22052.getClass(), "outStream", term22053);
        setField(term22052, term22052.getClass(), "blockBuffer", term22056);
        setIntField(term22052, term22052.getClass(), "currBlkIdx", 0);
        setIntField(term22052, term22052.getClass(), "currRecIdx", 0);
        setIntField(term22052, term22052.getClass(), "blockSize", 10240);
        setIntField(term22052, term22052.getClass(), "recordSize", 512);
        setIntField(term22052, term22052.getClass(), "recsPerBlock", 20);
        setField(term22049, term22049.getClass(), "buffer", term22052);
        setIntField(term22049, term22049.getClass(), "longFileMode", 0);
        setBooleanField(term22049, term22049.getClass(), "closed", false);
        setBooleanField(term22049, term22049.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term22049, term22049.getClass(), "finished", false);
        setField(term22049, term22049.getClass(), "out", term22053);
        setField(term22049, term22049.getClass(), "oneByte", term22057);
        setLongField(term22049, term22049.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22049));
    }

};


