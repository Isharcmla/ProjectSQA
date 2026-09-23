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

public class ByteQuadsCanonicalizer_init_688117066146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470152;

    public ByteQuadsCanonicalizer_init_688117066146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term186465 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term186577 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term186465, term186465.getClass(), "_parent", term186577);
        setIntField(term186465, term186465.getClass(), "_seed", 0);
        setBooleanField(term186465, term186465.getClass(), "_intern", false);
        setBooleanField(term186465, term186465.getClass(), "_failOnDoS", false);
        term470152 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term470153 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term470154 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term470155 = (int[]) newIntArray(2097152);
        Object[] term470156 = (Object[]) newArray("java.lang.String", 524288);
        setField(term470152, term470152.getClass(), "_parent", null);
        setIntField(term470154, term470154.getClass(), "size", 262144);
        setIntField(term470154, term470154.getClass(), "count", 0);
        setIntField(term470154, term470154.getClass(), "tertiaryShift", 7);
        setField(term470154, term470154.getClass(), "mainHash", term470155);
        setField(term470154, term470154.getClass(), "names", term470156);
        setIntField(term470154, term470154.getClass(), "spilloverEnd", 1835008);
        setIntField(term470154, term470154.getClass(), "longNameOffset", 2097152);
        setField(term470153, term470153.getClass(), "value", term470154);
        setField(term470152, term470152.getClass(), "_tableInfo", term470153);
        setIntField(term470152, term470152.getClass(), "_seed", 0);
        setBooleanField(term470152, term470152.getClass(), "_intern", true);
        setBooleanField(term470152, term470152.getClass(), "_failOnDoS", true);
        setField(term470152, term470152.getClass(), "_hashArea", null);
        setIntField(term470152, term470152.getClass(), "_hashSize", 0);
        setIntField(term470152, term470152.getClass(), "_secondaryStart", 0);
        setIntField(term470152, term470152.getClass(), "_tertiaryStart", 0);
        setIntField(term470152, term470152.getClass(), "_tertiaryShift", 0);
        setIntField(term470152, term470152.getClass(), "_count", 0);
        setField(term470152, term470152.getClass(), "_names", null);
        setIntField(term470152, term470152.getClass(), "_spilloverEnd", 0);
        setIntField(term470152, term470152.getClass(), "_longNameOffset", 0);
        setBooleanField(term470152, term470152.getClass(), "_needRehash", false);
        setBooleanField(term470152, term470152.getClass(), "_hashShared", false);
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
        args[0] = 262143;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term470152));
    }

};


