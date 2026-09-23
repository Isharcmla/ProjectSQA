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

public class ByteQuadsCanonicalizer_init_688117066145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430081;

    public ByteQuadsCanonicalizer_init_688117066145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term186174 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term186286 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term186174, term186174.getClass(), "_parent", term186286);
        setIntField(term186174, term186174.getClass(), "_seed", 0);
        setBooleanField(term186174, term186174.getClass(), "_intern", false);
        setBooleanField(term186174, term186174.getClass(), "_failOnDoS", false);
        term430081 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term430082 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term430083 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term430084 = (int[]) newIntArray(16777216);
        Object[] term430085 = (Object[]) newArray("java.lang.String", 4194304);
        setField(term430081, term430081.getClass(), "_parent", null);
        setIntField(term430083, term430083.getClass(), "size", 2097152);
        setIntField(term430083, term430083.getClass(), "count", 0);
        setIntField(term430083, term430083.getClass(), "tertiaryShift", 7);
        setField(term430083, term430083.getClass(), "mainHash", term430084);
        setField(term430083, term430083.getClass(), "names", term430085);
        setIntField(term430083, term430083.getClass(), "spilloverEnd", 14680064);
        setIntField(term430083, term430083.getClass(), "longNameOffset", 16777216);
        setField(term430082, term430082.getClass(), "value", term430083);
        setField(term430081, term430081.getClass(), "_tableInfo", term430082);
        setIntField(term430081, term430081.getClass(), "_seed", 0);
        setBooleanField(term430081, term430081.getClass(), "_intern", true);
        setBooleanField(term430081, term430081.getClass(), "_failOnDoS", true);
        setField(term430081, term430081.getClass(), "_hashArea", null);
        setIntField(term430081, term430081.getClass(), "_hashSize", 0);
        setIntField(term430081, term430081.getClass(), "_secondaryStart", 0);
        setIntField(term430081, term430081.getClass(), "_tertiaryStart", 0);
        setIntField(term430081, term430081.getClass(), "_tertiaryShift", 0);
        setIntField(term430081, term430081.getClass(), "_count", 0);
        setField(term430081, term430081.getClass(), "_names", null);
        setIntField(term430081, term430081.getClass(), "_spilloverEnd", 0);
        setIntField(term430081, term430081.getClass(), "_longNameOffset", 0);
        setBooleanField(term430081, term430081.getClass(), "_needRehash", false);
        setBooleanField(term430081, term430081.getClass(), "_hashShared", false);
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
        args[0] = 1572855;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term430081));
    }

};


