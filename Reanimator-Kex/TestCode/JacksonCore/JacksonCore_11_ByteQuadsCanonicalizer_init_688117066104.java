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

public class ByteQuadsCanonicalizer_init_688117066104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100547;

    public ByteQuadsCanonicalizer_init_688117066104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16921 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term17033 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term16921, term16921.getClass(), "_parent", term17033);
        setIntField(term16921, term16921.getClass(), "_seed", 0);
        setBooleanField(term16921, term16921.getClass(), "_intern", false);
        setBooleanField(term16921, term16921.getClass(), "_failOnDoS", false);
        term100547 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term100548 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term100549 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term100550 = (int[]) newIntArray(8192);
        Object[] term100551 = (Object[]) newArray("java.lang.String", 2048);
        setField(term100547, term100547.getClass(), "_parent", null);
        setIntField(term100549, term100549.getClass(), "size", 1024);
        setIntField(term100549, term100549.getClass(), "count", 0);
        setIntField(term100549, term100549.getClass(), "tertiaryShift", 5);
        setField(term100549, term100549.getClass(), "mainHash", term100550);
        setField(term100549, term100549.getClass(), "names", term100551);
        setIntField(term100549, term100549.getClass(), "spilloverEnd", 7168);
        setIntField(term100549, term100549.getClass(), "longNameOffset", 8192);
        setField(term100548, term100548.getClass(), "value", term100549);
        setField(term100547, term100547.getClass(), "_tableInfo", term100548);
        setIntField(term100547, term100547.getClass(), "_seed", 0);
        setBooleanField(term100547, term100547.getClass(), "_intern", true);
        setBooleanField(term100547, term100547.getClass(), "_failOnDoS", true);
        setField(term100547, term100547.getClass(), "_hashArea", null);
        setIntField(term100547, term100547.getClass(), "_hashSize", 0);
        setIntField(term100547, term100547.getClass(), "_secondaryStart", 0);
        setIntField(term100547, term100547.getClass(), "_tertiaryStart", 0);
        setIntField(term100547, term100547.getClass(), "_tertiaryShift", 0);
        setIntField(term100547, term100547.getClass(), "_count", 0);
        setField(term100547, term100547.getClass(), "_names", null);
        setIntField(term100547, term100547.getClass(), "_spilloverEnd", 0);
        setIntField(term100547, term100547.getClass(), "_longNameOffset", 0);
        setBooleanField(term100547, term100547.getClass(), "_needRehash", false);
        setBooleanField(term100547, term100547.getClass(), "_hashShared", false);
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
        args[0] = 763;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term100547));
    }

};


