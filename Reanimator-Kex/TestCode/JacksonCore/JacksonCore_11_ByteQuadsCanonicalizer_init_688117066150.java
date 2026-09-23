package com.fasterxml.jackson.core.sym;

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
import static com.fasterxml.jackson.core.sym.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.sym.EqualityUtils.*;
import java.lang.Object;

public class ByteQuadsCanonicalizer_init_688117066150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691930;

    public ByteQuadsCanonicalizer_init_688117066150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term204103 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term204215 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term204103, term204103.getClass(), "_parent", term204215);
        setIntField(term204103, term204103.getClass(), "_seed", 0);
        setBooleanField(term204103, term204103.getClass(), "_intern", false);
        setBooleanField(term204103, term204103.getClass(), "_failOnDoS", false);
        term691930 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term691931 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term691932 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term691933 = (int[]) newIntArray(256);
        Object[] term691934 = (Object[]) newArray("java.lang.String", 64);
        setField(term691930, term691930.getClass(), "_parent", null);
        setIntField(term691932, term691932.getClass(), "size", 32);
        setIntField(term691932, term691932.getClass(), "count", 0);
        setIntField(term691932, term691932.getClass(), "tertiaryShift", 4);
        setField(term691932, term691932.getClass(), "mainHash", term691933);
        setField(term691932, term691932.getClass(), "names", term691934);
        setIntField(term691932, term691932.getClass(), "spilloverEnd", 224);
        setIntField(term691932, term691932.getClass(), "longNameOffset", 256);
        setField(term691931, term691931.getClass(), "value", term691932);
        setField(term691930, term691930.getClass(), "_tableInfo", term691931);
        setIntField(term691930, term691930.getClass(), "_seed", 0);
        setBooleanField(term691930, term691930.getClass(), "_intern", true);
        setBooleanField(term691930, term691930.getClass(), "_failOnDoS", true);
        setField(term691930, term691930.getClass(), "_hashArea", null);
        setIntField(term691930, term691930.getClass(), "_hashSize", 0);
        setIntField(term691930, term691930.getClass(), "_secondaryStart", 0);
        setIntField(term691930, term691930.getClass(), "_tertiaryStart", 0);
        setIntField(term691930, term691930.getClass(), "_tertiaryShift", 0);
        setIntField(term691930, term691930.getClass(), "_count", 0);
        setField(term691930, term691930.getClass(), "_names", null);
        setIntField(term691930, term691930.getClass(), "_spilloverEnd", 0);
        setIntField(term691930, term691930.getClass(), "_longNameOffset", 0);
        setBooleanField(term691930, term691930.getClass(), "_needRehash", false);
        setBooleanField(term691930, term691930.getClass(), "_hashShared", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = 31;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term691930));
    }

};


