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

public class ByteQuadsCanonicalizer_init_688117066162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840442;

    public ByteQuadsCanonicalizer_init_688117066162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term319469 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term319469, term319469.getClass(), "_parent", null);
        setIntField(term319469, term319469.getClass(), "_seed", 0);
        setBooleanField(term319469, term319469.getClass(), "_intern", false);
        setBooleanField(term319469, term319469.getClass(), "_failOnDoS", false);
        term840442 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term840443 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term840444 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term840445 = (int[]) newIntArray(131072);
        Object[] term840446 = (Object[]) newArray("java.lang.String", 32768);
        setField(term840442, term840442.getClass(), "_parent", null);
        setIntField(term840444, term840444.getClass(), "size", 16384);
        setIntField(term840444, term840444.getClass(), "count", 0);
        setIntField(term840444, term840444.getClass(), "tertiaryShift", 7);
        setField(term840444, term840444.getClass(), "mainHash", term840445);
        setField(term840444, term840444.getClass(), "names", term840446);
        setIntField(term840444, term840444.getClass(), "spilloverEnd", 114688);
        setIntField(term840444, term840444.getClass(), "longNameOffset", 131072);
        setField(term840443, term840443.getClass(), "value", term840444);
        setField(term840442, term840442.getClass(), "_tableInfo", term840443);
        setIntField(term840442, term840442.getClass(), "_seed", 0);
        setBooleanField(term840442, term840442.getClass(), "_intern", true);
        setBooleanField(term840442, term840442.getClass(), "_failOnDoS", true);
        setField(term840442, term840442.getClass(), "_hashArea", null);
        setIntField(term840442, term840442.getClass(), "_hashSize", 0);
        setIntField(term840442, term840442.getClass(), "_secondaryStart", 0);
        setIntField(term840442, term840442.getClass(), "_tertiaryStart", 0);
        setIntField(term840442, term840442.getClass(), "_tertiaryShift", 0);
        setIntField(term840442, term840442.getClass(), "_count", 0);
        setField(term840442, term840442.getClass(), "_names", null);
        setIntField(term840442, term840442.getClass(), "_spilloverEnd", 0);
        setIntField(term840442, term840442.getClass(), "_longNameOffset", 0);
        setBooleanField(term840442, term840442.getClass(), "_needRehash", false);
        setBooleanField(term840442, term840442.getClass(), "_hashShared", false);
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
        args[0] = 16384;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term840442));
    }

};


