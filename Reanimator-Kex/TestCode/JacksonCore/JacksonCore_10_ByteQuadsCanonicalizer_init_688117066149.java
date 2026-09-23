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

public class ByteQuadsCanonicalizer_init_688117066149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563417;

    public ByteQuadsCanonicalizer_init_688117066149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term187294 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term187406 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term187294, term187294.getClass(), "_parent", term187406);
        setIntField(term187294, term187294.getClass(), "_seed", 0);
        setBooleanField(term187294, term187294.getClass(), "_intern", false);
        setBooleanField(term187294, term187294.getClass(), "_failOnDoS", false);
        term563417 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term563418 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term563419 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term563420 = (int[]) newIntArray(1024);
        Object[] term563421 = (Object[]) newArray("java.lang.String", 256);
        setField(term563417, term563417.getClass(), "_parent", null);
        setIntField(term563419, term563419.getClass(), "size", 128);
        setIntField(term563419, term563419.getClass(), "count", 0);
        setIntField(term563419, term563419.getClass(), "tertiaryShift", 4);
        setField(term563419, term563419.getClass(), "mainHash", term563420);
        setField(term563419, term563419.getClass(), "names", term563421);
        setIntField(term563419, term563419.getClass(), "spilloverEnd", 896);
        setIntField(term563419, term563419.getClass(), "longNameOffset", 1024);
        setField(term563418, term563418.getClass(), "value", term563419);
        setField(term563417, term563417.getClass(), "_tableInfo", term563418);
        setIntField(term563417, term563417.getClass(), "_seed", 0);
        setBooleanField(term563417, term563417.getClass(), "_intern", true);
        setBooleanField(term563417, term563417.getClass(), "_failOnDoS", true);
        setField(term563417, term563417.getClass(), "_hashArea", null);
        setIntField(term563417, term563417.getClass(), "_hashSize", 0);
        setIntField(term563417, term563417.getClass(), "_secondaryStart", 0);
        setIntField(term563417, term563417.getClass(), "_tertiaryStart", 0);
        setIntField(term563417, term563417.getClass(), "_tertiaryShift", 0);
        setIntField(term563417, term563417.getClass(), "_count", 0);
        setField(term563417, term563417.getClass(), "_names", null);
        setIntField(term563417, term563417.getClass(), "_spilloverEnd", 0);
        setIntField(term563417, term563417.getClass(), "_longNameOffset", 0);
        setBooleanField(term563417, term563417.getClass(), "_needRehash", false);
        setBooleanField(term563417, term563417.getClass(), "_hashShared", false);
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
        args[0] = 87;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term563417));
    }

};


