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

public class ByteQuadsCanonicalizer_init_688117066136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435265;

    public ByteQuadsCanonicalizer_init_688117066136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term200547 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term200659 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term200547, term200547.getClass(), "_parent", term200659);
        setIntField(term200547, term200547.getClass(), "_seed", 0);
        setBooleanField(term200547, term200547.getClass(), "_intern", false);
        setBooleanField(term200547, term200547.getClass(), "_failOnDoS", false);
        term435265 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term435266 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term435267 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term435268 = (int[]) newIntArray(16384);
        Object[] term435269 = (Object[]) newArray("java.lang.String", 4096);
        setField(term435265, term435265.getClass(), "_parent", null);
        setIntField(term435267, term435267.getClass(), "size", 2048);
        setIntField(term435267, term435267.getClass(), "count", 0);
        setIntField(term435267, term435267.getClass(), "tertiaryShift", 6);
        setField(term435267, term435267.getClass(), "mainHash", term435268);
        setField(term435267, term435267.getClass(), "names", term435269);
        setIntField(term435267, term435267.getClass(), "spilloverEnd", 14336);
        setIntField(term435267, term435267.getClass(), "longNameOffset", 16384);
        setField(term435266, term435266.getClass(), "value", term435267);
        setField(term435265, term435265.getClass(), "_tableInfo", term435266);
        setIntField(term435265, term435265.getClass(), "_seed", 0);
        setBooleanField(term435265, term435265.getClass(), "_intern", true);
        setBooleanField(term435265, term435265.getClass(), "_failOnDoS", true);
        setField(term435265, term435265.getClass(), "_hashArea", null);
        setIntField(term435265, term435265.getClass(), "_hashSize", 0);
        setIntField(term435265, term435265.getClass(), "_secondaryStart", 0);
        setIntField(term435265, term435265.getClass(), "_tertiaryStart", 0);
        setIntField(term435265, term435265.getClass(), "_tertiaryShift", 0);
        setIntField(term435265, term435265.getClass(), "_count", 0);
        setField(term435265, term435265.getClass(), "_names", null);
        setIntField(term435265, term435265.getClass(), "_spilloverEnd", 0);
        setIntField(term435265, term435265.getClass(), "_longNameOffset", 0);
        setBooleanField(term435265, term435265.getClass(), "_needRehash", false);
        setBooleanField(term435265, term435265.getClass(), "_hashShared", false);
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
        args[0] = 1355;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term435265));
    }

};


