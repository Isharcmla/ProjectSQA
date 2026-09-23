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

public class ByteQuadsCanonicalizer_init_688117066134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355135;

    public ByteQuadsCanonicalizer_init_688117066134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term149580 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term149692 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term149580, term149580.getClass(), "_parent", term149692);
        setIntField(term149580, term149580.getClass(), "_seed", 0);
        setBooleanField(term149580, term149580.getClass(), "_intern", false);
        setBooleanField(term149580, term149580.getClass(), "_failOnDoS", false);
        term355135 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term355136 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term355137 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term355138 = (int[]) newIntArray(1048576);
        Object[] term355139 = (Object[]) newArray("java.lang.String", 262144);
        setField(term355135, term355135.getClass(), "_parent", null);
        setIntField(term355137, term355137.getClass(), "size", 131072);
        setIntField(term355137, term355137.getClass(), "count", 0);
        setIntField(term355137, term355137.getClass(), "tertiaryShift", 7);
        setField(term355137, term355137.getClass(), "mainHash", term355138);
        setField(term355137, term355137.getClass(), "names", term355139);
        setIntField(term355137, term355137.getClass(), "spilloverEnd", 917504);
        setIntField(term355137, term355137.getClass(), "longNameOffset", 1048576);
        setField(term355136, term355136.getClass(), "value", term355137);
        setField(term355135, term355135.getClass(), "_tableInfo", term355136);
        setIntField(term355135, term355135.getClass(), "_seed", 0);
        setBooleanField(term355135, term355135.getClass(), "_intern", true);
        setBooleanField(term355135, term355135.getClass(), "_failOnDoS", true);
        setField(term355135, term355135.getClass(), "_hashArea", null);
        setIntField(term355135, term355135.getClass(), "_hashSize", 0);
        setIntField(term355135, term355135.getClass(), "_secondaryStart", 0);
        setIntField(term355135, term355135.getClass(), "_tertiaryStart", 0);
        setIntField(term355135, term355135.getClass(), "_tertiaryShift", 0);
        setIntField(term355135, term355135.getClass(), "_count", 0);
        setField(term355135, term355135.getClass(), "_names", null);
        setIntField(term355135, term355135.getClass(), "_spilloverEnd", 0);
        setIntField(term355135, term355135.getClass(), "_longNameOffset", 0);
        setBooleanField(term355135, term355135.getClass(), "_needRehash", false);
        setBooleanField(term355135, term355135.getClass(), "_hashShared", false);
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
        args[0] = 131071;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term355135));
    }

};


