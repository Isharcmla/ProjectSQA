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

public class ByteQuadsCanonicalizer_init_688117066112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183747;

    public ByteQuadsCanonicalizer_init_688117066112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98780 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term98892 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term98780, term98780.getClass(), "_parent", term98892);
        setIntField(term98780, term98780.getClass(), "_seed", 0);
        setBooleanField(term98780, term98780.getClass(), "_intern", false);
        setBooleanField(term98780, term98780.getClass(), "_failOnDoS", false);
        term183747 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term183748 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term183749 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term183750 = (int[]) newIntArray(256);
        Object[] term183751 = (Object[]) newArray("java.lang.String", 64);
        setField(term183747, term183747.getClass(), "_parent", null);
        setIntField(term183749, term183749.getClass(), "size", 32);
        setIntField(term183749, term183749.getClass(), "count", 0);
        setIntField(term183749, term183749.getClass(), "tertiaryShift", 4);
        setField(term183749, term183749.getClass(), "mainHash", term183750);
        setField(term183749, term183749.getClass(), "names", term183751);
        setIntField(term183749, term183749.getClass(), "spilloverEnd", 224);
        setIntField(term183749, term183749.getClass(), "longNameOffset", 256);
        setField(term183748, term183748.getClass(), "value", term183749);
        setField(term183747, term183747.getClass(), "_tableInfo", term183748);
        setIntField(term183747, term183747.getClass(), "_seed", 0);
        setBooleanField(term183747, term183747.getClass(), "_intern", true);
        setBooleanField(term183747, term183747.getClass(), "_failOnDoS", true);
        setField(term183747, term183747.getClass(), "_hashArea", null);
        setIntField(term183747, term183747.getClass(), "_hashSize", 0);
        setIntField(term183747, term183747.getClass(), "_secondaryStart", 0);
        setIntField(term183747, term183747.getClass(), "_tertiaryStart", 0);
        setIntField(term183747, term183747.getClass(), "_tertiaryShift", 0);
        setIntField(term183747, term183747.getClass(), "_count", 0);
        setField(term183747, term183747.getClass(), "_names", null);
        setIntField(term183747, term183747.getClass(), "_spilloverEnd", 0);
        setIntField(term183747, term183747.getClass(), "_longNameOffset", 0);
        setBooleanField(term183747, term183747.getClass(), "_needRehash", false);
        setBooleanField(term183747, term183747.getClass(), "_hashShared", false);
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
        args[0] = 31;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term183747));
    }

};


