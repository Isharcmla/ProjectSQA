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

public class ByteQuadsCanonicalizer_init_688117066111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190107;

    public ByteQuadsCanonicalizer_init_688117066111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59049 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term59161 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term59049, term59049.getClass(), "_parent", term59161);
        setIntField(term59049, term59049.getClass(), "_seed", 0);
        setBooleanField(term59049, term59049.getClass(), "_intern", false);
        setBooleanField(term59049, term59049.getClass(), "_failOnDoS", false);
        term190107 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term190108 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term190109 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term190110 = (int[]) newIntArray(2097152);
        Object[] term190111 = (Object[]) newArray("java.lang.String", 524288);
        setField(term190107, term190107.getClass(), "_parent", null);
        setIntField(term190109, term190109.getClass(), "size", 262144);
        setIntField(term190109, term190109.getClass(), "count", 0);
        setIntField(term190109, term190109.getClass(), "tertiaryShift", 7);
        setField(term190109, term190109.getClass(), "mainHash", term190110);
        setField(term190109, term190109.getClass(), "names", term190111);
        setIntField(term190109, term190109.getClass(), "spilloverEnd", 1835008);
        setIntField(term190109, term190109.getClass(), "longNameOffset", 2097152);
        setField(term190108, term190108.getClass(), "value", term190109);
        setField(term190107, term190107.getClass(), "_tableInfo", term190108);
        setIntField(term190107, term190107.getClass(), "_seed", 0);
        setBooleanField(term190107, term190107.getClass(), "_intern", true);
        setBooleanField(term190107, term190107.getClass(), "_failOnDoS", true);
        setField(term190107, term190107.getClass(), "_hashArea", null);
        setIntField(term190107, term190107.getClass(), "_hashSize", 0);
        setIntField(term190107, term190107.getClass(), "_secondaryStart", 0);
        setIntField(term190107, term190107.getClass(), "_tertiaryStart", 0);
        setIntField(term190107, term190107.getClass(), "_tertiaryShift", 0);
        setIntField(term190107, term190107.getClass(), "_count", 0);
        setField(term190107, term190107.getClass(), "_names", null);
        setIntField(term190107, term190107.getClass(), "_spilloverEnd", 0);
        setIntField(term190107, term190107.getClass(), "_longNameOffset", 0);
        setBooleanField(term190107, term190107.getClass(), "_needRehash", false);
        setBooleanField(term190107, term190107.getClass(), "_hashShared", false);
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
        assertTrue(recursiveEquals(instance, term190107));
    }

};


