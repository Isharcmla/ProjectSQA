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
     Object term22012;

    public TarArchiveOutputStream_init_133247344613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22012 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term22013 = (byte[]) newByteArray(512);
        byte[] term22014 = (byte[]) newByteArray(512);
        Object term22015 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term22016 = (byte[]) newByteArray(10240);
        byte[] term22017 = (byte[]) newByteArray(1);
        setLongField(term22012, term22012.getClass(), "currSize", 0L);
        setField(term22012, term22012.getClass(), "currName", null);
        setLongField(term22012, term22012.getClass(), "currBytes", 0L);
        setField(term22012, term22012.getClass(), "recordBuf", term22013);
        setIntField(term22012, term22012.getClass(), "assemLen", 0);
        setField(term22012, term22012.getClass(), "assemBuf", term22014);
        setField(term22015, term22015.getClass(), "inStream", null);
        setField(term22015, term22015.getClass(), "outStream", null);
        setField(term22015, term22015.getClass(), "blockBuffer", term22016);
        setIntField(term22015, term22015.getClass(), "currBlkIdx", 0);
        setIntField(term22015, term22015.getClass(), "currRecIdx", 0);
        setIntField(term22015, term22015.getClass(), "blockSize", 10240);
        setIntField(term22015, term22015.getClass(), "recordSize", 512);
        setIntField(term22015, term22015.getClass(), "recsPerBlock", 20);
        setField(term22012, term22012.getClass(), "buffer", term22015);
        setIntField(term22012, term22012.getClass(), "longFileMode", 0);
        setBooleanField(term22012, term22012.getClass(), "closed", false);
        setBooleanField(term22012, term22012.getClass(), "haveUnclosedEntry", false);
        setField(term22012, term22012.getClass(), "out", null);
        setField(term22012, term22012.getClass(), "oneByte", term22017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22012));
    }

};


