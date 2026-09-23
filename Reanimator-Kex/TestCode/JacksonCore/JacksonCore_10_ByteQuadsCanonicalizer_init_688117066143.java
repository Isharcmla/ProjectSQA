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

public class ByteQuadsCanonicalizer_init_688117066143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349943;

    public ByteQuadsCanonicalizer_init_688117066143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term185278 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term185390 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term185278, term185278.getClass(), "_parent", term185390);
        setIntField(term185278, term185278.getClass(), "_seed", 0);
        setBooleanField(term185278, term185278.getClass(), "_intern", false);
        setBooleanField(term185278, term185278.getClass(), "_failOnDoS", false);
        term349943 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term349944 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term349945 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term349946 = (int[]) newIntArray(33554432);
        Object[] term349947 = (Object[]) newArray("java.lang.String", 8388608);
        setField(term349943, term349943.getClass(), "_parent", null);
        setIntField(term349945, term349945.getClass(), "size", 4194304);
        setIntField(term349945, term349945.getClass(), "count", 0);
        setIntField(term349945, term349945.getClass(), "tertiaryShift", 7);
        setField(term349945, term349945.getClass(), "mainHash", term349946);
        setField(term349945, term349945.getClass(), "names", term349947);
        setIntField(term349945, term349945.getClass(), "spilloverEnd", 29360128);
        setIntField(term349945, term349945.getClass(), "longNameOffset", 33554432);
        setField(term349944, term349944.getClass(), "value", term349945);
        setField(term349943, term349943.getClass(), "_tableInfo", term349944);
        setIntField(term349943, term349943.getClass(), "_seed", 0);
        setBooleanField(term349943, term349943.getClass(), "_intern", true);
        setBooleanField(term349943, term349943.getClass(), "_failOnDoS", true);
        setField(term349943, term349943.getClass(), "_hashArea", null);
        setIntField(term349943, term349943.getClass(), "_hashSize", 0);
        setIntField(term349943, term349943.getClass(), "_secondaryStart", 0);
        setIntField(term349943, term349943.getClass(), "_tertiaryStart", 0);
        setIntField(term349943, term349943.getClass(), "_tertiaryShift", 0);
        setIntField(term349943, term349943.getClass(), "_count", 0);
        setField(term349943, term349943.getClass(), "_names", null);
        setIntField(term349943, term349943.getClass(), "_spilloverEnd", 0);
        setIntField(term349943, term349943.getClass(), "_longNameOffset", 0);
        setBooleanField(term349943, term349943.getClass(), "_needRehash", false);
        setBooleanField(term349943, term349943.getClass(), "_hashShared", false);
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
        args[0] = 3145719;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term349943));
    }

};


