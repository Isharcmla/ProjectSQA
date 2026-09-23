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

public class ByteQuadsCanonicalizer_init_688117066131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234919;

    public ByteQuadsCanonicalizer_init_688117066131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term75805 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term75917 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term75805, term75805.getClass(), "_parent", term75917);
        setIntField(term75805, term75805.getClass(), "_seed", 0);
        setBooleanField(term75805, term75805.getClass(), "_intern", false);
        setBooleanField(term75805, term75805.getClass(), "_failOnDoS", false);
        term234919 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term234920 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term234921 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term234922 = (int[]) newIntArray(536870912);
        Object[] term234923 = (Object[]) newArray("java.lang.String", 134217728);
        setField(term234919, term234919.getClass(), "_parent", null);
        setIntField(term234921, term234921.getClass(), "size", 67108864);
        setIntField(term234921, term234921.getClass(), "count", 0);
        setIntField(term234921, term234921.getClass(), "tertiaryShift", 7);
        setField(term234921, term234921.getClass(), "mainHash", term234922);
        setField(term234921, term234921.getClass(), "names", term234923);
        setIntField(term234921, term234921.getClass(), "spilloverEnd", 469762048);
        setIntField(term234921, term234921.getClass(), "longNameOffset", 536870912);
        setField(term234920, term234920.getClass(), "value", term234921);
        setField(term234919, term234919.getClass(), "_tableInfo", term234920);
        setIntField(term234919, term234919.getClass(), "_seed", 0);
        setBooleanField(term234919, term234919.getClass(), "_intern", true);
        setBooleanField(term234919, term234919.getClass(), "_failOnDoS", true);
        setField(term234919, term234919.getClass(), "_hashArea", null);
        setIntField(term234919, term234919.getClass(), "_hashSize", 0);
        setIntField(term234919, term234919.getClass(), "_secondaryStart", 0);
        setIntField(term234919, term234919.getClass(), "_tertiaryStart", 0);
        setIntField(term234919, term234919.getClass(), "_tertiaryShift", 0);
        setIntField(term234919, term234919.getClass(), "_count", 0);
        setField(term234919, term234919.getClass(), "_names", null);
        setIntField(term234919, term234919.getClass(), "_spilloverEnd", 0);
        setIntField(term234919, term234919.getClass(), "_longNameOffset", 0);
        setBooleanField(term234919, term234919.getClass(), "_needRehash", false);
        setBooleanField(term234919, term234919.getClass(), "_hashShared", false);
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
        args[0] = 50331639;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term234919));
    }

};


