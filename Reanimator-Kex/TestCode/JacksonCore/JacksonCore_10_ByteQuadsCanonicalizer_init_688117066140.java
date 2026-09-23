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

public class ByteQuadsCanonicalizer_init_688117066140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309314;

    public ByteQuadsCanonicalizer_init_688117066140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term184771 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term184883 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term184771, term184771.getClass(), "_parent", term184883);
        setIntField(term184771, term184771.getClass(), "_seed", 0);
        setBooleanField(term184771, term184771.getClass(), "_intern", false);
        setBooleanField(term184771, term184771.getClass(), "_failOnDoS", false);
        term309314 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term309315 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term309316 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term309317 = (int[]) newIntArray(536870912);
        Object[] term309318 = (Object[]) newArray("java.lang.String", 134217728);
        setField(term309314, term309314.getClass(), "_parent", null);
        setIntField(term309316, term309316.getClass(), "size", 67108864);
        setIntField(term309316, term309316.getClass(), "count", 0);
        setIntField(term309316, term309316.getClass(), "tertiaryShift", 7);
        setField(term309316, term309316.getClass(), "mainHash", term309317);
        setField(term309316, term309316.getClass(), "names", term309318);
        setIntField(term309316, term309316.getClass(), "spilloverEnd", 469762048);
        setIntField(term309316, term309316.getClass(), "longNameOffset", 536870912);
        setField(term309315, term309315.getClass(), "value", term309316);
        setField(term309314, term309314.getClass(), "_tableInfo", term309315);
        setIntField(term309314, term309314.getClass(), "_seed", 0);
        setBooleanField(term309314, term309314.getClass(), "_intern", true);
        setBooleanField(term309314, term309314.getClass(), "_failOnDoS", true);
        setField(term309314, term309314.getClass(), "_hashArea", null);
        setIntField(term309314, term309314.getClass(), "_hashSize", 0);
        setIntField(term309314, term309314.getClass(), "_secondaryStart", 0);
        setIntField(term309314, term309314.getClass(), "_tertiaryStart", 0);
        setIntField(term309314, term309314.getClass(), "_tertiaryShift", 0);
        setIntField(term309314, term309314.getClass(), "_count", 0);
        setField(term309314, term309314.getClass(), "_names", null);
        setIntField(term309314, term309314.getClass(), "_spilloverEnd", 0);
        setIntField(term309314, term309314.getClass(), "_longNameOffset", 0);
        setBooleanField(term309314, term309314.getClass(), "_needRehash", false);
        setBooleanField(term309314, term309314.getClass(), "_hashShared", false);
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
        args[0] = 50331639;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term309314));
    }

};


