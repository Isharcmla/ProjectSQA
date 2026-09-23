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

public class ByteQuadsCanonicalizer_init_688117066151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634593;

    public ByteQuadsCanonicalizer_init_688117066151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term277587 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term277699 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term277587, term277587.getClass(), "_parent", term277699);
        setIntField(term277587, term277587.getClass(), "_seed", 0);
        setBooleanField(term277587, term277587.getClass(), "_intern", false);
        setBooleanField(term277587, term277587.getClass(), "_failOnDoS", false);
        term634593 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term634594 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term634595 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term634596 = (int[]) newIntArray(134217728);
        Object[] term634597 = (Object[]) newArray("java.lang.String", 33554432);
        setField(term634593, term634593.getClass(), "_parent", null);
        setIntField(term634595, term634595.getClass(), "size", 16777216);
        setIntField(term634595, term634595.getClass(), "count", 0);
        setIntField(term634595, term634595.getClass(), "tertiaryShift", 7);
        setField(term634595, term634595.getClass(), "mainHash", term634596);
        setField(term634595, term634595.getClass(), "names", term634597);
        setIntField(term634595, term634595.getClass(), "spilloverEnd", 117440512);
        setIntField(term634595, term634595.getClass(), "longNameOffset", 134217728);
        setField(term634594, term634594.getClass(), "value", term634595);
        setField(term634593, term634593.getClass(), "_tableInfo", term634594);
        setIntField(term634593, term634593.getClass(), "_seed", 0);
        setBooleanField(term634593, term634593.getClass(), "_intern", true);
        setBooleanField(term634593, term634593.getClass(), "_failOnDoS", true);
        setField(term634593, term634593.getClass(), "_hashArea", null);
        setIntField(term634593, term634593.getClass(), "_hashSize", 0);
        setIntField(term634593, term634593.getClass(), "_secondaryStart", 0);
        setIntField(term634593, term634593.getClass(), "_tertiaryStart", 0);
        setIntField(term634593, term634593.getClass(), "_tertiaryShift", 0);
        setIntField(term634593, term634593.getClass(), "_count", 0);
        setField(term634593, term634593.getClass(), "_names", null);
        setIntField(term634593, term634593.getClass(), "_spilloverEnd", 0);
        setIntField(term634593, term634593.getClass(), "_longNameOffset", 0);
        setBooleanField(term634593, term634593.getClass(), "_needRehash", false);
        setBooleanField(term634593, term634593.getClass(), "_hashShared", false);
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
        args[0] = 12582903;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term634593));
    }

};


