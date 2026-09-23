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

public class ByteQuadsCanonicalizer_init_688117066144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390007;

    public ByteQuadsCanonicalizer_init_688117066144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term185875 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term185987 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term185875, term185875.getClass(), "_parent", term185987);
        setIntField(term185875, term185875.getClass(), "_seed", 0);
        setBooleanField(term185875, term185875.getClass(), "_intern", false);
        setBooleanField(term185875, term185875.getClass(), "_failOnDoS", false);
        term390007 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term390008 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term390009 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term390010 = (int[]) newIntArray(16384);
        Object[] term390011 = (Object[]) newArray("java.lang.String", 4096);
        setField(term390007, term390007.getClass(), "_parent", null);
        setIntField(term390009, term390009.getClass(), "size", 2048);
        setIntField(term390009, term390009.getClass(), "count", 0);
        setIntField(term390009, term390009.getClass(), "tertiaryShift", 6);
        setField(term390009, term390009.getClass(), "mainHash", term390010);
        setField(term390009, term390009.getClass(), "names", term390011);
        setIntField(term390009, term390009.getClass(), "spilloverEnd", 14336);
        setIntField(term390009, term390009.getClass(), "longNameOffset", 16384);
        setField(term390008, term390008.getClass(), "value", term390009);
        setField(term390007, term390007.getClass(), "_tableInfo", term390008);
        setIntField(term390007, term390007.getClass(), "_seed", 0);
        setBooleanField(term390007, term390007.getClass(), "_intern", true);
        setBooleanField(term390007, term390007.getClass(), "_failOnDoS", true);
        setField(term390007, term390007.getClass(), "_hashArea", null);
        setIntField(term390007, term390007.getClass(), "_hashSize", 0);
        setIntField(term390007, term390007.getClass(), "_secondaryStart", 0);
        setIntField(term390007, term390007.getClass(), "_tertiaryStart", 0);
        setIntField(term390007, term390007.getClass(), "_tertiaryShift", 0);
        setIntField(term390007, term390007.getClass(), "_count", 0);
        setField(term390007, term390007.getClass(), "_names", null);
        setIntField(term390007, term390007.getClass(), "_spilloverEnd", 0);
        setIntField(term390007, term390007.getClass(), "_longNameOffset", 0);
        setBooleanField(term390007, term390007.getClass(), "_needRehash", false);
        setBooleanField(term390007, term390007.getClass(), "_hashShared", false);
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
        args[0] = 1355;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term390007));
    }

};


