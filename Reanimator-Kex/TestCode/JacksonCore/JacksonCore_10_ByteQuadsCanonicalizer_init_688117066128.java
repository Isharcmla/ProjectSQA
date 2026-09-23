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

public class ByteQuadsCanonicalizer_init_688117066128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273290;

    public ByteQuadsCanonicalizer_init_688117066128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100591 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term100703 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term100591, term100591.getClass(), "_parent", term100703);
        setIntField(term100591, term100591.getClass(), "_seed", 0);
        setBooleanField(term100591, term100591.getClass(), "_intern", false);
        setBooleanField(term100591, term100591.getClass(), "_failOnDoS", false);
        term273290 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term273291 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term273292 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term273293 = (int[]) newIntArray(4096);
        Object[] term273294 = (Object[]) newArray("java.lang.String", 1024);
        setField(term273290, term273290.getClass(), "_parent", null);
        setIntField(term273292, term273292.getClass(), "size", 512);
        setIntField(term273292, term273292.getClass(), "count", 0);
        setIntField(term273292, term273292.getClass(), "tertiaryShift", 5);
        setField(term273292, term273292.getClass(), "mainHash", term273293);
        setField(term273292, term273292.getClass(), "names", term273294);
        setIntField(term273292, term273292.getClass(), "spilloverEnd", 3584);
        setIntField(term273292, term273292.getClass(), "longNameOffset", 4096);
        setField(term273291, term273291.getClass(), "value", term273292);
        setField(term273290, term273290.getClass(), "_tableInfo", term273291);
        setIntField(term273290, term273290.getClass(), "_seed", 0);
        setBooleanField(term273290, term273290.getClass(), "_intern", true);
        setBooleanField(term273290, term273290.getClass(), "_failOnDoS", true);
        setField(term273290, term273290.getClass(), "_hashArea", null);
        setIntField(term273290, term273290.getClass(), "_hashSize", 0);
        setIntField(term273290, term273290.getClass(), "_secondaryStart", 0);
        setIntField(term273290, term273290.getClass(), "_tertiaryStart", 0);
        setIntField(term273290, term273290.getClass(), "_tertiaryShift", 0);
        setIntField(term273290, term273290.getClass(), "_count", 0);
        setField(term273290, term273290.getClass(), "_names", null);
        setIntField(term273290, term273290.getClass(), "_spilloverEnd", 0);
        setIntField(term273290, term273290.getClass(), "_longNameOffset", 0);
        setBooleanField(term273290, term273290.getClass(), "_needRehash", false);
        setBooleanField(term273290, term273290.getClass(), "_hashShared", false);
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
        args[0] = 375;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term273290));
    }

};


