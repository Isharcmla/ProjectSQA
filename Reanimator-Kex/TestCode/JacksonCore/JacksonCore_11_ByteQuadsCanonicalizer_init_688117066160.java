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

public class ByteQuadsCanonicalizer_init_688117066160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839893;

    public ByteQuadsCanonicalizer_init_688117066160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term692340 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term692340, term692340.getClass(), "_parent", null);
        setIntField(term692340, term692340.getClass(), "_seed", 0);
        setBooleanField(term692340, term692340.getClass(), "_intern", false);
        setBooleanField(term692340, term692340.getClass(), "_failOnDoS", false);
        term839893 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term839894 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term839895 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term839896 = (int[]) newIntArray(131072);
        Object[] term839897 = (Object[]) newArray("java.lang.String", 32768);
        setField(term839893, term839893.getClass(), "_parent", null);
        setIntField(term839895, term839895.getClass(), "size", 16384);
        setIntField(term839895, term839895.getClass(), "count", 0);
        setIntField(term839895, term839895.getClass(), "tertiaryShift", 7);
        setField(term839895, term839895.getClass(), "mainHash", term839896);
        setField(term839895, term839895.getClass(), "names", term839897);
        setIntField(term839895, term839895.getClass(), "spilloverEnd", 114688);
        setIntField(term839895, term839895.getClass(), "longNameOffset", 131072);
        setField(term839894, term839894.getClass(), "value", term839895);
        setField(term839893, term839893.getClass(), "_tableInfo", term839894);
        setIntField(term839893, term839893.getClass(), "_seed", 0);
        setBooleanField(term839893, term839893.getClass(), "_intern", true);
        setBooleanField(term839893, term839893.getClass(), "_failOnDoS", true);
        setField(term839893, term839893.getClass(), "_hashArea", null);
        setIntField(term839893, term839893.getClass(), "_hashSize", 0);
        setIntField(term839893, term839893.getClass(), "_secondaryStart", 0);
        setIntField(term839893, term839893.getClass(), "_tertiaryStart", 0);
        setIntField(term839893, term839893.getClass(), "_tertiaryShift", 0);
        setIntField(term839893, term839893.getClass(), "_count", 0);
        setField(term839893, term839893.getClass(), "_names", null);
        setIntField(term839893, term839893.getClass(), "_spilloverEnd", 0);
        setIntField(term839893, term839893.getClass(), "_longNameOffset", 0);
        setBooleanField(term839893, term839893.getClass(), "_needRehash", false);
        setBooleanField(term839893, term839893.getClass(), "_hashShared", false);
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
        args[0] = 16384;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term839893));
    }

};


