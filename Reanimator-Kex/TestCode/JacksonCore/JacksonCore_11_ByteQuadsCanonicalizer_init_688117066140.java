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

public class ByteQuadsCanonicalizer_init_688117066140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515827;

    public ByteQuadsCanonicalizer_init_688117066140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term202205 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term202317 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term202205, term202205.getClass(), "_parent", term202317);
        setIntField(term202205, term202205.getClass(), "_seed", 0);
        setBooleanField(term202205, term202205.getClass(), "_intern", false);
        setBooleanField(term202205, term202205.getClass(), "_failOnDoS", false);
        term515827 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term515828 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term515829 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term515830 = (int[]) newIntArray(8388608);
        Object[] term515831 = (Object[]) newArray("java.lang.String", 2097152);
        setField(term515827, term515827.getClass(), "_parent", null);
        setIntField(term515829, term515829.getClass(), "size", 1048576);
        setIntField(term515829, term515829.getClass(), "count", 0);
        setIntField(term515829, term515829.getClass(), "tertiaryShift", 7);
        setField(term515829, term515829.getClass(), "mainHash", term515830);
        setField(term515829, term515829.getClass(), "names", term515831);
        setIntField(term515829, term515829.getClass(), "spilloverEnd", 7340032);
        setIntField(term515829, term515829.getClass(), "longNameOffset", 8388608);
        setField(term515828, term515828.getClass(), "value", term515829);
        setField(term515827, term515827.getClass(), "_tableInfo", term515828);
        setIntField(term515827, term515827.getClass(), "_seed", 0);
        setBooleanField(term515827, term515827.getClass(), "_intern", true);
        setBooleanField(term515827, term515827.getClass(), "_failOnDoS", true);
        setField(term515827, term515827.getClass(), "_hashArea", null);
        setIntField(term515827, term515827.getClass(), "_hashSize", 0);
        setIntField(term515827, term515827.getClass(), "_secondaryStart", 0);
        setIntField(term515827, term515827.getClass(), "_tertiaryStart", 0);
        setIntField(term515827, term515827.getClass(), "_tertiaryShift", 0);
        setIntField(term515827, term515827.getClass(), "_count", 0);
        setField(term515827, term515827.getClass(), "_names", null);
        setIntField(term515827, term515827.getClass(), "_spilloverEnd", 0);
        setIntField(term515827, term515827.getClass(), "_longNameOffset", 0);
        setBooleanField(term515827, term515827.getClass(), "_needRehash", false);
        setBooleanField(term515827, term515827.getClass(), "_hashShared", false);
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
        args[0] = 550925;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term515827));
    }

};


