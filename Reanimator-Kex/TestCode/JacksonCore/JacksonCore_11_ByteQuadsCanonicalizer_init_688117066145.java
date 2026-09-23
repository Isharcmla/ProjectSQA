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
     Object term600414;

    public ByteQuadsCanonicalizer_init_688117066145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term203079 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term203191 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term203079, term203079.getClass(), "_parent", term203191);
        setIntField(term203079, term203079.getClass(), "_seed", 0);
        setBooleanField(term203079, term203079.getClass(), "_intern", false);
        setBooleanField(term203079, term203079.getClass(), "_failOnDoS", false);
        term600414 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term600415 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term600416 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term600417 = (int[]) newIntArray(268435456);
        Object[] term600418 = (Object[]) newArray("java.lang.String", 67108864);
        setField(term600414, term600414.getClass(), "_parent", null);
        setIntField(term600416, term600416.getClass(), "size", 33554432);
        setIntField(term600416, term600416.getClass(), "count", 0);
        setIntField(term600416, term600416.getClass(), "tertiaryShift", 7);
        setField(term600416, term600416.getClass(), "mainHash", term600417);
        setField(term600416, term600416.getClass(), "names", term600418);
        setIntField(term600416, term600416.getClass(), "spilloverEnd", 234881024);
        setIntField(term600416, term600416.getClass(), "longNameOffset", 268435456);
        setField(term600415, term600415.getClass(), "value", term600416);
        setField(term600414, term600414.getClass(), "_tableInfo", term600415);
        setIntField(term600414, term600414.getClass(), "_seed", 0);
        setBooleanField(term600414, term600414.getClass(), "_intern", true);
        setBooleanField(term600414, term600414.getClass(), "_failOnDoS", true);
        setField(term600414, term600414.getClass(), "_hashArea", null);
        setIntField(term600414, term600414.getClass(), "_hashSize", 0);
        setIntField(term600414, term600414.getClass(), "_secondaryStart", 0);
        setIntField(term600414, term600414.getClass(), "_tertiaryStart", 0);
        setIntField(term600414, term600414.getClass(), "_tertiaryShift", 0);
        setIntField(term600414, term600414.getClass(), "_count", 0);
        setField(term600414, term600414.getClass(), "_names", null);
        setIntField(term600414, term600414.getClass(), "_spilloverEnd", 0);
        setIntField(term600414, term600414.getClass(), "_longNameOffset", 0);
        setBooleanField(term600414, term600414.getClass(), "_needRehash", false);
        setBooleanField(term600414, term600414.getClass(), "_hashShared", false);
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
        args[0] = 25165799;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term600414));
    }

};


