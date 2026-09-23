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
     Object term157989;

    public ByteQuadsCanonicalizer_init_688117066110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58758 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term58870 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term58758, term58758.getClass(), "_parent", term58870);
        setIntField(term58758, term58758.getClass(), "_seed", 0);
        setBooleanField(term58758, term58758.getClass(), "_intern", false);
        setBooleanField(term58758, term58758.getClass(), "_failOnDoS", false);
        term157989 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term157990 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term157991 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term157992 = (int[]) newIntArray(2048);
        Object[] term157993 = (Object[]) newArray("java.lang.String", 512);
        setField(term157989, term157989.getClass(), "_parent", null);
        setIntField(term157991, term157991.getClass(), "size", 256);
        setIntField(term157991, term157991.getClass(), "count", 0);
        setIntField(term157991, term157991.getClass(), "tertiaryShift", 5);
        setField(term157991, term157991.getClass(), "mainHash", term157992);
        setField(term157991, term157991.getClass(), "names", term157993);
        setIntField(term157991, term157991.getClass(), "spilloverEnd", 1792);
        setIntField(term157991, term157991.getClass(), "longNameOffset", 2048);
        setField(term157990, term157990.getClass(), "value", term157991);
        setField(term157989, term157989.getClass(), "_tableInfo", term157990);
        setIntField(term157989, term157989.getClass(), "_seed", 0);
        setBooleanField(term157989, term157989.getClass(), "_intern", true);
        setBooleanField(term157989, term157989.getClass(), "_failOnDoS", true);
        setField(term157989, term157989.getClass(), "_hashArea", null);
        setIntField(term157989, term157989.getClass(), "_hashSize", 0);
        setIntField(term157989, term157989.getClass(), "_secondaryStart", 0);
        setIntField(term157989, term157989.getClass(), "_tertiaryStart", 0);
        setIntField(term157989, term157989.getClass(), "_tertiaryShift", 0);
        setIntField(term157989, term157989.getClass(), "_count", 0);
        setField(term157989, term157989.getClass(), "_names", null);
        setIntField(term157989, term157989.getClass(), "_spilloverEnd", 0);
        setIntField(term157989, term157989.getClass(), "_longNameOffset", 0);
        setBooleanField(term157989, term157989.getClass(), "_needRehash", false);
        setBooleanField(term157989, term157989.getClass(), "_hashShared", false);
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
        args[0] = 183;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term157989));
    }

};


