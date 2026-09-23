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

public class TarArchiveOutputStream_init_123922963014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term54098;

    public TarArchiveOutputStream_init_123922963014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term54098 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term54099 = (byte[]) newByteArray(512);
        byte[] term54100 = (byte[]) newByteArray(512);
        Object term54101 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term54102 = (byte[]) newByteArray(568599855);
        byte[] term54103 = (byte[]) newByteArray(1);
        setLongField(term54098, term54098.getClass(), "currSize", 0L);
        setField(term54098, term54098.getClass(), "currName", null);
        setLongField(term54098, term54098.getClass(), "currBytes", 0L);
        setField(term54098, term54098.getClass(), "recordBuf", term54099);
        setIntField(term54098, term54098.getClass(), "assemLen", 0);
        setField(term54098, term54098.getClass(), "assemBuf", term54100);
        setField(term54101, term54101.getClass(), "inStream", null);
        setField(term54101, term54101.getClass(), "outStream", null);
        setField(term54101, term54101.getClass(), "blockBuffer", term54102);
        setIntField(term54101, term54101.getClass(), "currBlkIdx", 0);
        setIntField(term54101, term54101.getClass(), "currRecIdx", 0);
        setIntField(term54101, term54101.getClass(), "blockSize", 568599855);
        setIntField(term54101, term54101.getClass(), "recordSize", 512);
        setIntField(term54101, term54101.getClass(), "recsPerBlock", 1110546);
        setField(term54098, term54098.getClass(), "buffer", term54101);
        setIntField(term54098, term54098.getClass(), "longFileMode", 0);
        setBooleanField(term54098, term54098.getClass(), "closed", false);
        setBooleanField(term54098, term54098.getClass(), "haveUnclosedEntry", false);
        setField(term54098, term54098.getClass(), "out", null);
        setField(term54098, term54098.getClass(), "oneByte", term54103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term54098));
        assertTrue(recursiveEquals(term1, null));
    }

};


