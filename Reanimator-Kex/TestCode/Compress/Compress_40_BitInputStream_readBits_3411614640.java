package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class BitInputStream_readBits_3411614640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7192;
     Object term7693;

    public BitInputStream_readBits_3411614640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7192 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term7356 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.BoundedRandomAccessFileInputStream"));
        setIntField(term7192, term7192.getClass(), "bitsCachedSize", -1);
        setField(term7192, term7192.getClass(), "in", term7356);
        term7693 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term7694 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.BoundedRandomAccessFileInputStream"));
        setField(term7694, term7694.getClass(), "file", null);
        setLongField(term7694, term7694.getClass(), "bytesRemaining", 0L);
        setField(term7693, term7693.getClass(), "in", term7694);
        setField(term7693, term7693.getClass(), "byteOrder", null);
        setLongField(term7693, term7693.getClass(), "bitsCached", 0L);
        setIntField(term7693, term7693.getClass(), "bitsCachedSize", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "readBits", argTypes, term7192, args);
        assertTrue(recursiveEquals(term7192, term7693));
        assertTrue(recursiveEquals(retValue, -1L));
    }

};


