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

public class ByteQuadsCanonicalizer_init_688117066159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799837;

    public ByteQuadsCanonicalizer_init_688117066159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term610563 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term610675 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term610563, term610563.getClass(), "_parent", term610675);
        setIntField(term610563, term610563.getClass(), "_seed", 0);
        setBooleanField(term610563, term610563.getClass(), "_intern", false);
        setBooleanField(term610563, term610563.getClass(), "_failOnDoS", false);
        term799837 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term799838 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term799839 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term799840 = (int[]) newIntArray(32768);
        Object[] term799841 = (Object[]) newArray("java.lang.String", 8192);
        setField(term799837, term799837.getClass(), "_parent", null);
        setIntField(term799839, term799839.getClass(), "size", 4096);
        setIntField(term799839, term799839.getClass(), "count", 0);
        setIntField(term799839, term799839.getClass(), "tertiaryShift", 6);
        setField(term799839, term799839.getClass(), "mainHash", term799840);
        setField(term799839, term799839.getClass(), "names", term799841);
        setIntField(term799839, term799839.getClass(), "spilloverEnd", 28672);
        setIntField(term799839, term799839.getClass(), "longNameOffset", 32768);
        setField(term799838, term799838.getClass(), "value", term799839);
        setField(term799837, term799837.getClass(), "_tableInfo", term799838);
        setIntField(term799837, term799837.getClass(), "_seed", 0);
        setBooleanField(term799837, term799837.getClass(), "_intern", true);
        setBooleanField(term799837, term799837.getClass(), "_failOnDoS", true);
        setField(term799837, term799837.getClass(), "_hashArea", null);
        setIntField(term799837, term799837.getClass(), "_hashSize", 0);
        setIntField(term799837, term799837.getClass(), "_secondaryStart", 0);
        setIntField(term799837, term799837.getClass(), "_tertiaryStart", 0);
        setIntField(term799837, term799837.getClass(), "_tertiaryShift", 0);
        setIntField(term799837, term799837.getClass(), "_count", 0);
        setField(term799837, term799837.getClass(), "_names", null);
        setIntField(term799837, term799837.getClass(), "_spilloverEnd", 0);
        setIntField(term799837, term799837.getClass(), "_longNameOffset", 0);
        setBooleanField(term799837, term799837.getClass(), "_needRehash", false);
        setBooleanField(term799837, term799837.getClass(), "_hashShared", false);
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
        args[0] = 4096;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term799837));
    }

};


