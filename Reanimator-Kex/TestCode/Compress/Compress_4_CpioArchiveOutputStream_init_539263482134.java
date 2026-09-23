package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_init_539263482134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63189;
     Object term73263;
     Object term73269;

    public CpioArchiveOutputStream_init_539263482134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term63051 = new HashMap();
        Object term63003 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] term62821 = (byte[]) newByteArray(0);
        setField(term63003, term63003.getClass(), "oneByte", term62821);
        setBooleanField(term63003, term63003.getClass(), "closed", false);
        setField(term63003, term63003.getClass(), "names", term63051);
        setLongField(term63003, term63003.getClass(), "crc", 0L);
        setField(term63003, term63003.getClass(), "out", term63003);
        term63189 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap term73264 = new HashMap();
        term73263 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term73265 = newInstance(Class.forName("java.io.FilterOutputStream"));
        Object term73266 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term73267 = newInstance(Class.forName("java.lang.Object"));
        byte[] term73268 = (byte[]) newByteArray(1);
        setField(term73263, term73263.getClass(), "entry", null);
        setBooleanField(term73263, term73263.getClass(), "closed", false);
        setBooleanField(term73263, term73263.getClass(), "finished", false);
        setShortField(term73263, term73263.getClass(), "entryFormat", (short) 1);
        setField(term73263, term73263.getClass(), "names", term73264);
        setLongField(term73263, term73263.getClass(), "crc", 0L);
        setLongField(term73263, term73263.getClass(), "written", 0L);
        setField(term73266, term73266.getClass(), "entry", null);
        setBooleanField(term73266, term73266.getClass(), "closed", false);
        setBooleanField(term73266, term73266.getClass(), "finished", false);
        setShortField(term73266, term73266.getClass(), "entryFormat", (short) 0);
        setField(term73266, term73266.getClass(), "names", null);
        setLongField(term73266, term73266.getClass(), "crc", 0L);
        setLongField(term73266, term73266.getClass(), "written", 0L);
        setField(term73266, term73266.getClass(), "out", null);
        setField(term73266, term73266.getClass(), "oneByte", null);
        setField(term73265, term73265.getClass(), "out", term73266);
        setBooleanField(term73265, term73265.getClass(), "closed", false);
        setField(term73265, term73265.getClass(), "closeLock", term73267);
        setField(term73263, term73263.getClass(), "out", term73265);
        setField(term73263, term73263.getClass(), "oneByte", term73268);
        term73269 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term73269, term73269.getClass(), "entry", null);
        setBooleanField(term73269, term73269.getClass(), "closed", false);
        setBooleanField(term73269, term73269.getClass(), "finished", false);
        setShortField(term73269, term73269.getClass(), "entryFormat", (short) 0);
        setField(term73269, term73269.getClass(), "names", null);
        setLongField(term73269, term73269.getClass(), "crc", 0L);
        setLongField(term73269, term73269.getClass(), "written", 0L);
        setField(term73269, term73269.getClass(), "out", null);
        setField(term73269, term73269.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = term63189;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term73263));
        assertTrue(recursiveEquals(term63189, term73269));
    }

};


