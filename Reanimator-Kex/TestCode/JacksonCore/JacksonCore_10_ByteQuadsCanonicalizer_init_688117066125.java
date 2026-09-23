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

public class ByteQuadsCanonicalizer_init_688117066125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217784;

    public ByteQuadsCanonicalizer_init_688117066125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99333 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term99445 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term99333, term99333.getClass(), "_parent", term99445);
        setIntField(term99333, term99333.getClass(), "_seed", 0);
        setBooleanField(term99333, term99333.getClass(), "_intern", false);
        setBooleanField(term99333, term99333.getClass(), "_failOnDoS", false);
        term217784 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term217785 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term217786 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term217787 = (int[]) newIntArray(268435456);
        Object[] term217788 = (Object[]) newArray("java.lang.String", 67108864);
        setField(term217784, term217784.getClass(), "_parent", null);
        setIntField(term217786, term217786.getClass(), "size", 33554432);
        setIntField(term217786, term217786.getClass(), "count", 0);
        setIntField(term217786, term217786.getClass(), "tertiaryShift", 7);
        setField(term217786, term217786.getClass(), "mainHash", term217787);
        setField(term217786, term217786.getClass(), "names", term217788);
        setIntField(term217786, term217786.getClass(), "spilloverEnd", 234881024);
        setIntField(term217786, term217786.getClass(), "longNameOffset", 268435456);
        setField(term217785, term217785.getClass(), "value", term217786);
        setField(term217784, term217784.getClass(), "_tableInfo", term217785);
        setIntField(term217784, term217784.getClass(), "_seed", 0);
        setBooleanField(term217784, term217784.getClass(), "_intern", true);
        setBooleanField(term217784, term217784.getClass(), "_failOnDoS", true);
        setField(term217784, term217784.getClass(), "_hashArea", null);
        setIntField(term217784, term217784.getClass(), "_hashSize", 0);
        setIntField(term217784, term217784.getClass(), "_secondaryStart", 0);
        setIntField(term217784, term217784.getClass(), "_tertiaryStart", 0);
        setIntField(term217784, term217784.getClass(), "_tertiaryShift", 0);
        setIntField(term217784, term217784.getClass(), "_count", 0);
        setField(term217784, term217784.getClass(), "_names", null);
        setIntField(term217784, term217784.getClass(), "_spilloverEnd", 0);
        setIntField(term217784, term217784.getClass(), "_longNameOffset", 0);
        setBooleanField(term217784, term217784.getClass(), "_needRehash", false);
        setBooleanField(term217784, term217784.getClass(), "_hashShared", false);
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
        args[0] = 25165799;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term217784));
    }

};


