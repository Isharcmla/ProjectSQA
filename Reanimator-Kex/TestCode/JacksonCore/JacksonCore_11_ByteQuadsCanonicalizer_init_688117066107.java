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

public class ByteQuadsCanonicalizer_init_688117066107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139399;

    public ByteQuadsCanonicalizer_init_688117066107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57275 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term57387 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term57275, term57275.getClass(), "_parent", term57387);
        setIntField(term57275, term57275.getClass(), "_seed", 0);
        setBooleanField(term57275, term57275.getClass(), "_intern", false);
        setBooleanField(term57275, term57275.getClass(), "_failOnDoS", false);
        term139399 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term139400 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term139401 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term139402 = (int[]) newIntArray(131072);
        Object[] term139403 = (Object[]) newArray("java.lang.String", 32768);
        setField(term139399, term139399.getClass(), "_parent", null);
        setIntField(term139401, term139401.getClass(), "size", 16384);
        setIntField(term139401, term139401.getClass(), "count", 0);
        setIntField(term139401, term139401.getClass(), "tertiaryShift", 7);
        setField(term139401, term139401.getClass(), "mainHash", term139402);
        setField(term139401, term139401.getClass(), "names", term139403);
        setIntField(term139401, term139401.getClass(), "spilloverEnd", 114688);
        setIntField(term139401, term139401.getClass(), "longNameOffset", 131072);
        setField(term139400, term139400.getClass(), "value", term139401);
        setField(term139399, term139399.getClass(), "_tableInfo", term139400);
        setIntField(term139399, term139399.getClass(), "_seed", 0);
        setBooleanField(term139399, term139399.getClass(), "_intern", true);
        setBooleanField(term139399, term139399.getClass(), "_failOnDoS", true);
        setField(term139399, term139399.getClass(), "_hashArea", null);
        setIntField(term139399, term139399.getClass(), "_hashSize", 0);
        setIntField(term139399, term139399.getClass(), "_secondaryStart", 0);
        setIntField(term139399, term139399.getClass(), "_tertiaryStart", 0);
        setIntField(term139399, term139399.getClass(), "_tertiaryShift", 0);
        setIntField(term139399, term139399.getClass(), "_count", 0);
        setField(term139399, term139399.getClass(), "_names", null);
        setIntField(term139399, term139399.getClass(), "_spilloverEnd", 0);
        setIntField(term139399, term139399.getClass(), "_longNameOffset", 0);
        setBooleanField(term139399, term139399.getClass(), "_needRehash", false);
        setBooleanField(term139399, term139399.getClass(), "_hashShared", false);
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
        args[0] = 16383;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term139399));
    }

};


