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

public class ByteQuadsCanonicalizer_init_688117066100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88260;

    public ByteQuadsCanonicalizer_init_688117066100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16623 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term16735 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term16623, term16623.getClass(), "_parent", term16735);
        setIntField(term16623, term16623.getClass(), "_seed", 0);
        setBooleanField(term16623, term16623.getClass(), "_intern", false);
        setBooleanField(term16623, term16623.getClass(), "_failOnDoS", false);
        term88260 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term88261 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term88262 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term88263 = (int[]) newIntArray(131072);
        Object[] term88264 = (Object[]) newArray("java.lang.String", 32768);
        setField(term88260, term88260.getClass(), "_parent", null);
        setIntField(term88262, term88262.getClass(), "size", 16384);
        setIntField(term88262, term88262.getClass(), "count", 0);
        setIntField(term88262, term88262.getClass(), "tertiaryShift", 7);
        setField(term88262, term88262.getClass(), "mainHash", term88263);
        setField(term88262, term88262.getClass(), "names", term88264);
        setIntField(term88262, term88262.getClass(), "spilloverEnd", 114688);
        setIntField(term88262, term88262.getClass(), "longNameOffset", 131072);
        setField(term88261, term88261.getClass(), "value", term88262);
        setField(term88260, term88260.getClass(), "_tableInfo", term88261);
        setIntField(term88260, term88260.getClass(), "_seed", 0);
        setBooleanField(term88260, term88260.getClass(), "_intern", true);
        setBooleanField(term88260, term88260.getClass(), "_failOnDoS", true);
        setField(term88260, term88260.getClass(), "_hashArea", null);
        setIntField(term88260, term88260.getClass(), "_hashSize", 0);
        setIntField(term88260, term88260.getClass(), "_secondaryStart", 0);
        setIntField(term88260, term88260.getClass(), "_tertiaryStart", 0);
        setIntField(term88260, term88260.getClass(), "_tertiaryShift", 0);
        setIntField(term88260, term88260.getClass(), "_count", 0);
        setField(term88260, term88260.getClass(), "_names", null);
        setIntField(term88260, term88260.getClass(), "_spilloverEnd", 0);
        setIntField(term88260, term88260.getClass(), "_longNameOffset", 0);
        setBooleanField(term88260, term88260.getClass(), "_needRehash", false);
        setBooleanField(term88260, term88260.getClass(), "_hashShared", false);
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
        args[0] = 16383;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term88260));
    }

};


