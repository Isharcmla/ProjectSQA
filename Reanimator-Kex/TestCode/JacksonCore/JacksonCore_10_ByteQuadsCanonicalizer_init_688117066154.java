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

public class ByteQuadsCanonicalizer_init_688117066154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730930;

    public ByteQuadsCanonicalizer_init_688117066154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term278413 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term278525 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term278413, term278413.getClass(), "_parent", term278525);
        setIntField(term278413, term278413.getClass(), "_seed", 0);
        setBooleanField(term278413, term278413.getClass(), "_intern", false);
        setBooleanField(term278413, term278413.getClass(), "_failOnDoS", false);
        term730930 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term730931 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term730932 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term730933 = (int[]) newIntArray(2048);
        Object[] term730934 = (Object[]) newArray("java.lang.String", 512);
        setField(term730930, term730930.getClass(), "_parent", null);
        setIntField(term730932, term730932.getClass(), "size", 256);
        setIntField(term730932, term730932.getClass(), "count", 0);
        setIntField(term730932, term730932.getClass(), "tertiaryShift", 5);
        setField(term730932, term730932.getClass(), "mainHash", term730933);
        setField(term730932, term730932.getClass(), "names", term730934);
        setIntField(term730932, term730932.getClass(), "spilloverEnd", 1792);
        setIntField(term730932, term730932.getClass(), "longNameOffset", 2048);
        setField(term730931, term730931.getClass(), "value", term730932);
        setField(term730930, term730930.getClass(), "_tableInfo", term730931);
        setIntField(term730930, term730930.getClass(), "_seed", 0);
        setBooleanField(term730930, term730930.getClass(), "_intern", true);
        setBooleanField(term730930, term730930.getClass(), "_failOnDoS", true);
        setField(term730930, term730930.getClass(), "_hashArea", null);
        setIntField(term730930, term730930.getClass(), "_hashSize", 0);
        setIntField(term730930, term730930.getClass(), "_secondaryStart", 0);
        setIntField(term730930, term730930.getClass(), "_tertiaryStart", 0);
        setIntField(term730930, term730930.getClass(), "_tertiaryShift", 0);
        setIntField(term730930, term730930.getClass(), "_count", 0);
        setField(term730930, term730930.getClass(), "_names", null);
        setIntField(term730930, term730930.getClass(), "_spilloverEnd", 0);
        setIntField(term730930, term730930.getClass(), "_longNameOffset", 0);
        setBooleanField(term730930, term730930.getClass(), "_needRehash", false);
        setBooleanField(term730930, term730930.getClass(), "_hashShared", false);
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
        args[0] = 183;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term730930));
    }

};


