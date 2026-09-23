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

public class ByteQuadsCanonicalizer_init_688117066133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315065;

    public ByteQuadsCanonicalizer_init_688117066133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term109225 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term109337 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term109225, term109225.getClass(), "_parent", term109337);
        setIntField(term109225, term109225.getClass(), "_seed", 0);
        setBooleanField(term109225, term109225.getClass(), "_intern", false);
        setBooleanField(term109225, term109225.getClass(), "_failOnDoS", false);
        term315065 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term315066 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term315067 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term315068 = (int[]) newIntArray(524288);
        Object[] term315069 = (Object[]) newArray("java.lang.String", 131072);
        setField(term315065, term315065.getClass(), "_parent", null);
        setIntField(term315067, term315067.getClass(), "size", 65536);
        setIntField(term315067, term315067.getClass(), "count", 0);
        setIntField(term315067, term315067.getClass(), "tertiaryShift", 7);
        setField(term315067, term315067.getClass(), "mainHash", term315068);
        setField(term315067, term315067.getClass(), "names", term315069);
        setIntField(term315067, term315067.getClass(), "spilloverEnd", 458752);
        setIntField(term315067, term315067.getClass(), "longNameOffset", 524288);
        setField(term315066, term315066.getClass(), "value", term315067);
        setField(term315065, term315065.getClass(), "_tableInfo", term315066);
        setIntField(term315065, term315065.getClass(), "_seed", 0);
        setBooleanField(term315065, term315065.getClass(), "_intern", true);
        setBooleanField(term315065, term315065.getClass(), "_failOnDoS", true);
        setField(term315065, term315065.getClass(), "_hashArea", null);
        setIntField(term315065, term315065.getClass(), "_hashSize", 0);
        setIntField(term315065, term315065.getClass(), "_secondaryStart", 0);
        setIntField(term315065, term315065.getClass(), "_tertiaryStart", 0);
        setIntField(term315065, term315065.getClass(), "_tertiaryShift", 0);
        setIntField(term315065, term315065.getClass(), "_count", 0);
        setField(term315065, term315065.getClass(), "_names", null);
        setIntField(term315065, term315065.getClass(), "_spilloverEnd", 0);
        setIntField(term315065, term315065.getClass(), "_longNameOffset", 0);
        setBooleanField(term315065, term315065.getClass(), "_needRehash", false);
        setBooleanField(term315065, term315065.getClass(), "_hashShared", false);
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
        args[0] = 65503;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term315065));
    }

};


