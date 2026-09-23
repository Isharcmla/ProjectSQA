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

public class ByteQuadsCanonicalizer_init_688117066153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714729;

    public ByteQuadsCanonicalizer_init_688117066153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term278152 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term278264 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term278152, term278152.getClass(), "_parent", term278264);
        setIntField(term278152, term278152.getClass(), "_seed", 0);
        setBooleanField(term278152, term278152.getClass(), "_intern", false);
        setBooleanField(term278152, term278152.getClass(), "_failOnDoS", false);
        term714729 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term714730 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term714731 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term714732 = (int[]) newIntArray(65536);
        Object[] term714733 = (Object[]) newArray("java.lang.String", 16384);
        setField(term714729, term714729.getClass(), "_parent", null);
        setIntField(term714731, term714731.getClass(), "size", 8192);
        setIntField(term714731, term714731.getClass(), "count", 0);
        setIntField(term714731, term714731.getClass(), "tertiaryShift", 7);
        setField(term714731, term714731.getClass(), "mainHash", term714732);
        setField(term714731, term714731.getClass(), "names", term714733);
        setIntField(term714731, term714731.getClass(), "spilloverEnd", 57344);
        setIntField(term714731, term714731.getClass(), "longNameOffset", 65536);
        setField(term714730, term714730.getClass(), "value", term714731);
        setField(term714729, term714729.getClass(), "_tableInfo", term714730);
        setIntField(term714729, term714729.getClass(), "_seed", 0);
        setBooleanField(term714729, term714729.getClass(), "_intern", true);
        setBooleanField(term714729, term714729.getClass(), "_failOnDoS", true);
        setField(term714729, term714729.getClass(), "_hashArea", null);
        setIntField(term714729, term714729.getClass(), "_hashSize", 0);
        setIntField(term714729, term714729.getClass(), "_secondaryStart", 0);
        setIntField(term714729, term714729.getClass(), "_tertiaryStart", 0);
        setIntField(term714729, term714729.getClass(), "_tertiaryShift", 0);
        setIntField(term714729, term714729.getClass(), "_count", 0);
        setField(term714729, term714729.getClass(), "_names", null);
        setIntField(term714729, term714729.getClass(), "_spilloverEnd", 0);
        setIntField(term714729, term714729.getClass(), "_longNameOffset", 0);
        setBooleanField(term714729, term714729.getClass(), "_needRehash", false);
        setBooleanField(term714729, term714729.getClass(), "_hashShared", false);
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
        args[0] = 5416;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term714729));
    }

};


