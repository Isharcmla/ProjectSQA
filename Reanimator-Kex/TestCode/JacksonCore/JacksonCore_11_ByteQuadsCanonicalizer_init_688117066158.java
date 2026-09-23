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

public class ByteQuadsCanonicalizer_init_688117066158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761590;

    public ByteQuadsCanonicalizer_init_688117066158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term570341 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term570341, term570341.getClass(), "_parent", null);
        setIntField(term570341, term570341.getClass(), "_seed", 0);
        setBooleanField(term570341, term570341.getClass(), "_intern", false);
        setBooleanField(term570341, term570341.getClass(), "_failOnDoS", false);
        term761590 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term761591 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term761592 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term761593 = (int[]) newIntArray(8192);
        Object[] term761594 = (Object[]) newArray("java.lang.String", 2048);
        setField(term761590, term761590.getClass(), "_parent", null);
        setIntField(term761592, term761592.getClass(), "size", 1024);
        setIntField(term761592, term761592.getClass(), "count", 0);
        setIntField(term761592, term761592.getClass(), "tertiaryShift", 5);
        setField(term761592, term761592.getClass(), "mainHash", term761593);
        setField(term761592, term761592.getClass(), "names", term761594);
        setIntField(term761592, term761592.getClass(), "spilloverEnd", 7168);
        setIntField(term761592, term761592.getClass(), "longNameOffset", 8192);
        setField(term761591, term761591.getClass(), "value", term761592);
        setField(term761590, term761590.getClass(), "_tableInfo", term761591);
        setIntField(term761590, term761590.getClass(), "_seed", 0);
        setBooleanField(term761590, term761590.getClass(), "_intern", true);
        setBooleanField(term761590, term761590.getClass(), "_failOnDoS", true);
        setField(term761590, term761590.getClass(), "_hashArea", null);
        setIntField(term761590, term761590.getClass(), "_hashSize", 0);
        setIntField(term761590, term761590.getClass(), "_secondaryStart", 0);
        setIntField(term761590, term761590.getClass(), "_tertiaryStart", 0);
        setIntField(term761590, term761590.getClass(), "_tertiaryShift", 0);
        setIntField(term761590, term761590.getClass(), "_count", 0);
        setField(term761590, term761590.getClass(), "_names", null);
        setIntField(term761590, term761590.getClass(), "_spilloverEnd", 0);
        setIntField(term761590, term761590.getClass(), "_longNameOffset", 0);
        setBooleanField(term761590, term761590.getClass(), "_needRehash", false);
        setBooleanField(term761590, term761590.getClass(), "_hashShared", false);
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
        args[0] = 1024;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term761590));
    }

};


