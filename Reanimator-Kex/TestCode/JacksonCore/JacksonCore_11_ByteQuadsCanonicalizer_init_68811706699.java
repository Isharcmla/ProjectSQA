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

public class ByteQuadsCanonicalizer_init_68811706699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58477;

    public ByteQuadsCanonicalizer_init_68811706699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16390 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term16502 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term16390, term16390.getClass(), "_parent", term16502);
        setIntField(term16390, term16390.getClass(), "_seed", 0);
        setBooleanField(term16390, term16390.getClass(), "_intern", false);
        setBooleanField(term16390, term16390.getClass(), "_failOnDoS", false);
        term58477 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term58478 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term58479 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term58480 = (int[]) newIntArray(128);
        Object[] term58481 = (Object[]) newArray("java.lang.String", 32);
        setField(term58477, term58477.getClass(), "_parent", null);
        setIntField(term58479, term58479.getClass(), "size", 16);
        setIntField(term58479, term58479.getClass(), "count", 0);
        setIntField(term58479, term58479.getClass(), "tertiaryShift", 4);
        setField(term58479, term58479.getClass(), "mainHash", term58480);
        setField(term58479, term58479.getClass(), "names", term58481);
        setIntField(term58479, term58479.getClass(), "spilloverEnd", 112);
        setIntField(term58479, term58479.getClass(), "longNameOffset", 128);
        setField(term58478, term58478.getClass(), "value", term58479);
        setField(term58477, term58477.getClass(), "_tableInfo", term58478);
        setIntField(term58477, term58477.getClass(), "_seed", 0);
        setBooleanField(term58477, term58477.getClass(), "_intern", true);
        setBooleanField(term58477, term58477.getClass(), "_failOnDoS", true);
        setField(term58477, term58477.getClass(), "_hashArea", null);
        setIntField(term58477, term58477.getClass(), "_hashSize", 0);
        setIntField(term58477, term58477.getClass(), "_secondaryStart", 0);
        setIntField(term58477, term58477.getClass(), "_tertiaryStart", 0);
        setIntField(term58477, term58477.getClass(), "_tertiaryShift", 0);
        setIntField(term58477, term58477.getClass(), "_count", 0);
        setField(term58477, term58477.getClass(), "_names", null);
        setIntField(term58477, term58477.getClass(), "_spilloverEnd", 0);
        setIntField(term58477, term58477.getClass(), "_longNameOffset", 0);
        setBooleanField(term58477, term58477.getClass(), "_needRehash", false);
        setBooleanField(term58477, term58477.getClass(), "_hashShared", false);
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
        args[0] = 15;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58477));
    }

};


