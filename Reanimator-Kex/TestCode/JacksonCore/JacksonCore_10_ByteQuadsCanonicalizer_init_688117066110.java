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

public class ByteQuadsCanonicalizer_init_688117066110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142346;

    public ByteQuadsCanonicalizer_init_688117066110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57801 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term57913 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term57801, term57801.getClass(), "_parent", term57913);
        setIntField(term57801, term57801.getClass(), "_seed", 0);
        setBooleanField(term57801, term57801.getClass(), "_intern", false);
        setBooleanField(term57801, term57801.getClass(), "_failOnDoS", false);
        term142346 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term142347 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term142348 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term142349 = (int[]) newIntArray(512);
        Object[] term142350 = (Object[]) newArray("java.lang.String", 128);
        setField(term142346, term142346.getClass(), "_parent", null);
        setIntField(term142348, term142348.getClass(), "size", 64);
        setIntField(term142348, term142348.getClass(), "count", 0);
        setIntField(term142348, term142348.getClass(), "tertiaryShift", 4);
        setField(term142348, term142348.getClass(), "mainHash", term142349);
        setField(term142348, term142348.getClass(), "names", term142350);
        setIntField(term142348, term142348.getClass(), "spilloverEnd", 448);
        setIntField(term142348, term142348.getClass(), "longNameOffset", 512);
        setField(term142347, term142347.getClass(), "value", term142348);
        setField(term142346, term142346.getClass(), "_tableInfo", term142347);
        setIntField(term142346, term142346.getClass(), "_seed", 0);
        setBooleanField(term142346, term142346.getClass(), "_intern", true);
        setBooleanField(term142346, term142346.getClass(), "_failOnDoS", true);
        setField(term142346, term142346.getClass(), "_hashArea", null);
        setIntField(term142346, term142346.getClass(), "_hashSize", 0);
        setIntField(term142346, term142346.getClass(), "_secondaryStart", 0);
        setIntField(term142346, term142346.getClass(), "_tertiaryStart", 0);
        setIntField(term142346, term142346.getClass(), "_tertiaryShift", 0);
        setIntField(term142346, term142346.getClass(), "_count", 0);
        setField(term142346, term142346.getClass(), "_names", null);
        setIntField(term142346, term142346.getClass(), "_spilloverEnd", 0);
        setIntField(term142346, term142346.getClass(), "_longNameOffset", 0);
        setBooleanField(term142346, term142346.getClass(), "_needRehash", false);
        setBooleanField(term142346, term142346.getClass(), "_hashShared", false);
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
        args[0] = 63;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term142346));
    }

};


