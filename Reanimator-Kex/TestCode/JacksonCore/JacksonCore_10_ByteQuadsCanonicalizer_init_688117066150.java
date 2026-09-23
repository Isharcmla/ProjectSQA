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
     Object term594516;

    public ByteQuadsCanonicalizer_init_688117066150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term187599 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term187711 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term187599, term187599.getClass(), "_parent", term187711);
        setIntField(term187599, term187599.getClass(), "_seed", 0);
        setBooleanField(term187599, term187599.getClass(), "_intern", false);
        setBooleanField(term187599, term187599.getClass(), "_failOnDoS", false);
        term594516 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term594517 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term594518 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term594519 = (int[]) newIntArray(67108864);
        Object[] term594520 = (Object[]) newArray("java.lang.String", 16777216);
        setField(term594516, term594516.getClass(), "_parent", null);
        setIntField(term594518, term594518.getClass(), "size", 8388608);
        setIntField(term594518, term594518.getClass(), "count", 0);
        setIntField(term594518, term594518.getClass(), "tertiaryShift", 7);
        setField(term594518, term594518.getClass(), "mainHash", term594519);
        setField(term594518, term594518.getClass(), "names", term594520);
        setIntField(term594518, term594518.getClass(), "spilloverEnd", 58720256);
        setIntField(term594518, term594518.getClass(), "longNameOffset", 67108864);
        setField(term594517, term594517.getClass(), "value", term594518);
        setField(term594516, term594516.getClass(), "_tableInfo", term594517);
        setIntField(term594516, term594516.getClass(), "_seed", 0);
        setBooleanField(term594516, term594516.getClass(), "_intern", true);
        setBooleanField(term594516, term594516.getClass(), "_failOnDoS", true);
        setField(term594516, term594516.getClass(), "_hashArea", null);
        setIntField(term594516, term594516.getClass(), "_hashSize", 0);
        setIntField(term594516, term594516.getClass(), "_secondaryStart", 0);
        setIntField(term594516, term594516.getClass(), "_tertiaryStart", 0);
        setIntField(term594516, term594516.getClass(), "_tertiaryShift", 0);
        setIntField(term594516, term594516.getClass(), "_count", 0);
        setField(term594516, term594516.getClass(), "_names", null);
        setIntField(term594516, term594516.getClass(), "_spilloverEnd", 0);
        setIntField(term594516, term594516.getClass(), "_longNameOffset", 0);
        setBooleanField(term594516, term594516.getClass(), "_needRehash", false);
        setBooleanField(term594516, term594516.getClass(), "_hashShared", false);
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
        args[0] = 6291447;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term594516));
    }

};


