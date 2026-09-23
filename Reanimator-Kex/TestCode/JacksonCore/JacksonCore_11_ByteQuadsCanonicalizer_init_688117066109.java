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

public class ByteQuadsCanonicalizer_init_688117066109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151277;

    public ByteQuadsCanonicalizer_init_688117066109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57530 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term57642 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term57530, term57530.getClass(), "_parent", term57642);
        setIntField(term57530, term57530.getClass(), "_seed", 0);
        setBooleanField(term57530, term57530.getClass(), "_intern", false);
        setBooleanField(term57530, term57530.getClass(), "_failOnDoS", false);
        term151277 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term151278 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term151279 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term151280 = (int[]) newIntArray(512);
        Object[] term151281 = (Object[]) newArray("java.lang.String", 128);
        setField(term151277, term151277.getClass(), "_parent", null);
        setIntField(term151279, term151279.getClass(), "size", 64);
        setIntField(term151279, term151279.getClass(), "count", 0);
        setIntField(term151279, term151279.getClass(), "tertiaryShift", 4);
        setField(term151279, term151279.getClass(), "mainHash", term151280);
        setField(term151279, term151279.getClass(), "names", term151281);
        setIntField(term151279, term151279.getClass(), "spilloverEnd", 448);
        setIntField(term151279, term151279.getClass(), "longNameOffset", 512);
        setField(term151278, term151278.getClass(), "value", term151279);
        setField(term151277, term151277.getClass(), "_tableInfo", term151278);
        setIntField(term151277, term151277.getClass(), "_seed", 0);
        setBooleanField(term151277, term151277.getClass(), "_intern", true);
        setBooleanField(term151277, term151277.getClass(), "_failOnDoS", true);
        setField(term151277, term151277.getClass(), "_hashArea", null);
        setIntField(term151277, term151277.getClass(), "_hashSize", 0);
        setIntField(term151277, term151277.getClass(), "_secondaryStart", 0);
        setIntField(term151277, term151277.getClass(), "_tertiaryStart", 0);
        setIntField(term151277, term151277.getClass(), "_tertiaryShift", 0);
        setIntField(term151277, term151277.getClass(), "_count", 0);
        setField(term151277, term151277.getClass(), "_names", null);
        setIntField(term151277, term151277.getClass(), "_spilloverEnd", 0);
        setIntField(term151277, term151277.getClass(), "_longNameOffset", 0);
        setBooleanField(term151277, term151277.getClass(), "_needRehash", false);
        setBooleanField(term151277, term151277.getClass(), "_hashShared", false);
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
        args[0] = 63;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term151277));
    }

};


