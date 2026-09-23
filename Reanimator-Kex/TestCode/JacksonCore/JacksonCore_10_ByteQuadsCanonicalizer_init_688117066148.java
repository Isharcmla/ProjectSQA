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

public class ByteQuadsCanonicalizer_init_688117066148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550290;

    public ByteQuadsCanonicalizer_init_688117066148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term187036 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term187148 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term187036, term187036.getClass(), "_parent", term187148);
        setIntField(term187036, term187036.getClass(), "_seed", 0);
        setBooleanField(term187036, term187036.getClass(), "_intern", false);
        setBooleanField(term187036, term187036.getClass(), "_failOnDoS", false);
        term550290 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term550291 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term550292 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term550293 = (int[]) newIntArray(32768);
        Object[] term550294 = (Object[]) newArray("java.lang.String", 8192);
        setField(term550290, term550290.getClass(), "_parent", null);
        setIntField(term550292, term550292.getClass(), "size", 4096);
        setIntField(term550292, term550292.getClass(), "count", 0);
        setIntField(term550292, term550292.getClass(), "tertiaryShift", 6);
        setField(term550292, term550292.getClass(), "mainHash", term550293);
        setField(term550292, term550292.getClass(), "names", term550294);
        setIntField(term550292, term550292.getClass(), "spilloverEnd", 28672);
        setIntField(term550292, term550292.getClass(), "longNameOffset", 32768);
        setField(term550291, term550291.getClass(), "value", term550292);
        setField(term550290, term550290.getClass(), "_tableInfo", term550291);
        setIntField(term550290, term550290.getClass(), "_seed", 0);
        setBooleanField(term550290, term550290.getClass(), "_intern", true);
        setBooleanField(term550290, term550290.getClass(), "_failOnDoS", true);
        setField(term550290, term550290.getClass(), "_hashArea", null);
        setIntField(term550290, term550290.getClass(), "_hashSize", 0);
        setIntField(term550290, term550290.getClass(), "_secondaryStart", 0);
        setIntField(term550290, term550290.getClass(), "_tertiaryStart", 0);
        setIntField(term550290, term550290.getClass(), "_tertiaryShift", 0);
        setIntField(term550290, term550290.getClass(), "_count", 0);
        setField(term550290, term550290.getClass(), "_names", null);
        setIntField(term550290, term550290.getClass(), "_spilloverEnd", 0);
        setIntField(term550290, term550290.getClass(), "_longNameOffset", 0);
        setBooleanField(term550290, term550290.getClass(), "_needRehash", false);
        setBooleanField(term550290, term550290.getClass(), "_hashShared", false);
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
        args[0] = 2710;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term550290));
    }

};


