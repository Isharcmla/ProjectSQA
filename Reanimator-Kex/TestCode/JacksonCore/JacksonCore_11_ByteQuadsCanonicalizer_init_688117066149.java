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

public class ByteQuadsCanonicalizer_init_688117066149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681109;

    public ByteQuadsCanonicalizer_init_688117066149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term203851 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term203963 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term203851, term203851.getClass(), "_parent", term203963);
        setIntField(term203851, term203851.getClass(), "_seed", 0);
        setBooleanField(term203851, term203851.getClass(), "_intern", false);
        setBooleanField(term203851, term203851.getClass(), "_failOnDoS", false);
        term681109 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term681110 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term681111 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term681112 = (int[]) newIntArray(32768);
        Object[] term681113 = (Object[]) newArray("java.lang.String", 8192);
        setField(term681109, term681109.getClass(), "_parent", null);
        setIntField(term681111, term681111.getClass(), "size", 4096);
        setIntField(term681111, term681111.getClass(), "count", 0);
        setIntField(term681111, term681111.getClass(), "tertiaryShift", 6);
        setField(term681111, term681111.getClass(), "mainHash", term681112);
        setField(term681111, term681111.getClass(), "names", term681113);
        setIntField(term681111, term681111.getClass(), "spilloverEnd", 28672);
        setIntField(term681111, term681111.getClass(), "longNameOffset", 32768);
        setField(term681110, term681110.getClass(), "value", term681111);
        setField(term681109, term681109.getClass(), "_tableInfo", term681110);
        setIntField(term681109, term681109.getClass(), "_seed", 0);
        setBooleanField(term681109, term681109.getClass(), "_intern", true);
        setBooleanField(term681109, term681109.getClass(), "_failOnDoS", true);
        setField(term681109, term681109.getClass(), "_hashArea", null);
        setIntField(term681109, term681109.getClass(), "_hashSize", 0);
        setIntField(term681109, term681109.getClass(), "_secondaryStart", 0);
        setIntField(term681109, term681109.getClass(), "_tertiaryStart", 0);
        setIntField(term681109, term681109.getClass(), "_tertiaryShift", 0);
        setIntField(term681109, term681109.getClass(), "_count", 0);
        setField(term681109, term681109.getClass(), "_names", null);
        setIntField(term681109, term681109.getClass(), "_spilloverEnd", 0);
        setIntField(term681109, term681109.getClass(), "_longNameOffset", 0);
        setBooleanField(term681109, term681109.getClass(), "_needRehash", false);
        setBooleanField(term681109, term681109.getClass(), "_hashShared", false);
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
        args[0] = 2710;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term681109));
    }

};


