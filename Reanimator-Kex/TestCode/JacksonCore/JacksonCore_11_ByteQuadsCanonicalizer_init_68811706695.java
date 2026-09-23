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

public class ByteQuadsCanonicalizer_init_68811706695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47103;

    public ByteQuadsCanonicalizer_init_68811706695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15824 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term15936 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term15824, term15824.getClass(), "_parent", term15936);
        setIntField(term15824, term15824.getClass(), "_seed", 0);
        setBooleanField(term15824, term15824.getClass(), "_intern", false);
        setBooleanField(term15824, term15824.getClass(), "_failOnDoS", false);
        term47103 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term47104 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term47105 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term47106 = (int[]) newIntArray(33554432);
        Object[] term47107 = (Object[]) newArray("java.lang.String", 8388608);
        setField(term47103, term47103.getClass(), "_parent", null);
        setIntField(term47105, term47105.getClass(), "size", 4194304);
        setIntField(term47105, term47105.getClass(), "count", 0);
        setIntField(term47105, term47105.getClass(), "tertiaryShift", 7);
        setField(term47105, term47105.getClass(), "mainHash", term47106);
        setField(term47105, term47105.getClass(), "names", term47107);
        setIntField(term47105, term47105.getClass(), "spilloverEnd", 29360128);
        setIntField(term47105, term47105.getClass(), "longNameOffset", 33554432);
        setField(term47104, term47104.getClass(), "value", term47105);
        setField(term47103, term47103.getClass(), "_tableInfo", term47104);
        setIntField(term47103, term47103.getClass(), "_seed", 0);
        setBooleanField(term47103, term47103.getClass(), "_intern", true);
        setBooleanField(term47103, term47103.getClass(), "_failOnDoS", true);
        setField(term47103, term47103.getClass(), "_hashArea", null);
        setIntField(term47103, term47103.getClass(), "_hashSize", 0);
        setIntField(term47103, term47103.getClass(), "_secondaryStart", 0);
        setIntField(term47103, term47103.getClass(), "_tertiaryStart", 0);
        setIntField(term47103, term47103.getClass(), "_tertiaryShift", 0);
        setIntField(term47103, term47103.getClass(), "_count", 0);
        setField(term47103, term47103.getClass(), "_names", null);
        setIntField(term47103, term47103.getClass(), "_spilloverEnd", 0);
        setIntField(term47103, term47103.getClass(), "_longNameOffset", 0);
        setBooleanField(term47103, term47103.getClass(), "_needRehash", false);
        setBooleanField(term47103, term47103.getClass(), "_hashShared", false);
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
        assertTrue(recursiveEquals(instance, term47103));
    }

};


