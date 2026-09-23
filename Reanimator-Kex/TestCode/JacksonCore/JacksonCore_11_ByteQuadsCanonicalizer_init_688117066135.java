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

public class ByteQuadsCanonicalizer_init_688117066135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395201;

    public ByteQuadsCanonicalizer_init_688117066135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term200277 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term200389 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term200277, term200277.getClass(), "_parent", term200389);
        setIntField(term200277, term200277.getClass(), "_seed", 0);
        setBooleanField(term200277, term200277.getClass(), "_intern", false);
        setBooleanField(term200277, term200277.getClass(), "_failOnDoS", false);
        term395201 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term395202 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term395203 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term395204 = (int[]) newIntArray(65536);
        Object[] term395205 = (Object[]) newArray("java.lang.String", 16384);
        setField(term395201, term395201.getClass(), "_parent", null);
        setIntField(term395203, term395203.getClass(), "size", 8192);
        setIntField(term395203, term395203.getClass(), "count", 0);
        setIntField(term395203, term395203.getClass(), "tertiaryShift", 7);
        setField(term395203, term395203.getClass(), "mainHash", term395204);
        setField(term395203, term395203.getClass(), "names", term395205);
        setIntField(term395203, term395203.getClass(), "spilloverEnd", 57344);
        setIntField(term395203, term395203.getClass(), "longNameOffset", 65536);
        setField(term395202, term395202.getClass(), "value", term395203);
        setField(term395201, term395201.getClass(), "_tableInfo", term395202);
        setIntField(term395201, term395201.getClass(), "_seed", 0);
        setBooleanField(term395201, term395201.getClass(), "_intern", true);
        setBooleanField(term395201, term395201.getClass(), "_failOnDoS", true);
        setField(term395201, term395201.getClass(), "_hashArea", null);
        setIntField(term395201, term395201.getClass(), "_hashSize", 0);
        setIntField(term395201, term395201.getClass(), "_secondaryStart", 0);
        setIntField(term395201, term395201.getClass(), "_tertiaryStart", 0);
        setIntField(term395201, term395201.getClass(), "_tertiaryShift", 0);
        setIntField(term395201, term395201.getClass(), "_count", 0);
        setField(term395201, term395201.getClass(), "_names", null);
        setIntField(term395201, term395201.getClass(), "_spilloverEnd", 0);
        setIntField(term395201, term395201.getClass(), "_longNameOffset", 0);
        setBooleanField(term395201, term395201.getClass(), "_needRehash", false);
        setBooleanField(term395201, term395201.getClass(), "_hashShared", false);
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
        assertTrue(recursiveEquals(instance, term395201));
    }

};


