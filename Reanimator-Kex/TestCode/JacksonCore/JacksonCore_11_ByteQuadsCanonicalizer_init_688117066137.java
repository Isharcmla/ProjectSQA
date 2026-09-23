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

public class ByteQuadsCanonicalizer_init_688117066137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475339;

    public ByteQuadsCanonicalizer_init_688117066137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term201173 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term201285 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term201173, term201173.getClass(), "_parent", term201285);
        setIntField(term201173, term201173.getClass(), "_seed", 0);
        setBooleanField(term201173, term201173.getClass(), "_intern", false);
        setBooleanField(term201173, term201173.getClass(), "_failOnDoS", false);
        term475339 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term475340 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term475341 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term475342 = (int[]) newIntArray(16777216);
        Object[] term475343 = (Object[]) newArray("java.lang.String", 4194304);
        setField(term475339, term475339.getClass(), "_parent", null);
        setIntField(term475341, term475341.getClass(), "size", 2097152);
        setIntField(term475341, term475341.getClass(), "count", 0);
        setIntField(term475341, term475341.getClass(), "tertiaryShift", 7);
        setField(term475341, term475341.getClass(), "mainHash", term475342);
        setField(term475341, term475341.getClass(), "names", term475343);
        setIntField(term475341, term475341.getClass(), "spilloverEnd", 14680064);
        setIntField(term475341, term475341.getClass(), "longNameOffset", 16777216);
        setField(term475340, term475340.getClass(), "value", term475341);
        setField(term475339, term475339.getClass(), "_tableInfo", term475340);
        setIntField(term475339, term475339.getClass(), "_seed", 0);
        setBooleanField(term475339, term475339.getClass(), "_intern", true);
        setBooleanField(term475339, term475339.getClass(), "_failOnDoS", true);
        setField(term475339, term475339.getClass(), "_hashArea", null);
        setIntField(term475339, term475339.getClass(), "_hashSize", 0);
        setIntField(term475339, term475339.getClass(), "_secondaryStart", 0);
        setIntField(term475339, term475339.getClass(), "_tertiaryStart", 0);
        setIntField(term475339, term475339.getClass(), "_tertiaryShift", 0);
        setIntField(term475339, term475339.getClass(), "_count", 0);
        setField(term475339, term475339.getClass(), "_names", null);
        setIntField(term475339, term475339.getClass(), "_spilloverEnd", 0);
        setIntField(term475339, term475339.getClass(), "_longNameOffset", 0);
        setBooleanField(term475339, term475339.getClass(), "_needRehash", false);
        setBooleanField(term475339, term475339.getClass(), "_hashShared", false);
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
        args[0] = 1572855;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term475339));
    }

};


