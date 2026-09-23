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

public class ByteQuadsCanonicalizer_init_688117066147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510225;

    public ByteQuadsCanonicalizer_init_688117066147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term186762 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term186874 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term186762, term186762.getClass(), "_parent", term186874);
        setIntField(term186762, term186762.getClass(), "_seed", 0);
        setBooleanField(term186762, term186762.getClass(), "_intern", false);
        setBooleanField(term186762, term186762.getClass(), "_failOnDoS", false);
        term510225 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term510226 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term510227 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term510228 = (int[]) newIntArray(8388608);
        Object[] term510229 = (Object[]) newArray("java.lang.String", 2097152);
        setField(term510225, term510225.getClass(), "_parent", null);
        setIntField(term510227, term510227.getClass(), "size", 1048576);
        setIntField(term510227, term510227.getClass(), "count", 0);
        setIntField(term510227, term510227.getClass(), "tertiaryShift", 7);
        setField(term510227, term510227.getClass(), "mainHash", term510228);
        setField(term510227, term510227.getClass(), "names", term510229);
        setIntField(term510227, term510227.getClass(), "spilloverEnd", 7340032);
        setIntField(term510227, term510227.getClass(), "longNameOffset", 8388608);
        setField(term510226, term510226.getClass(), "value", term510227);
        setField(term510225, term510225.getClass(), "_tableInfo", term510226);
        setIntField(term510225, term510225.getClass(), "_seed", 0);
        setBooleanField(term510225, term510225.getClass(), "_intern", true);
        setBooleanField(term510225, term510225.getClass(), "_failOnDoS", true);
        setField(term510225, term510225.getClass(), "_hashArea", null);
        setIntField(term510225, term510225.getClass(), "_hashSize", 0);
        setIntField(term510225, term510225.getClass(), "_secondaryStart", 0);
        setIntField(term510225, term510225.getClass(), "_tertiaryStart", 0);
        setIntField(term510225, term510225.getClass(), "_tertiaryShift", 0);
        setIntField(term510225, term510225.getClass(), "_count", 0);
        setField(term510225, term510225.getClass(), "_names", null);
        setIntField(term510225, term510225.getClass(), "_spilloverEnd", 0);
        setIntField(term510225, term510225.getClass(), "_longNameOffset", 0);
        setBooleanField(term510225, term510225.getClass(), "_needRehash", false);
        setBooleanField(term510225, term510225.getClass(), "_hashShared", false);
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
        args[0] = 550925;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term510225));
    }

};


