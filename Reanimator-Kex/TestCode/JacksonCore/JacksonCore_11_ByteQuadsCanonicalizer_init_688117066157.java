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

public class ByteQuadsCanonicalizer_init_688117066157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735939;

    public ByteQuadsCanonicalizer_init_688117066157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term570199 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term570199, term570199.getClass(), "_parent", null);
        setIntField(term570199, term570199.getClass(), "_seed", 0);
        setBooleanField(term570199, term570199.getClass(), "_intern", false);
        setBooleanField(term570199, term570199.getClass(), "_failOnDoS", false);
        term735939 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term735940 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term735941 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term735942 = (int[]) newIntArray(1024);
        Object[] term735943 = (Object[]) newArray("java.lang.String", 256);
        setField(term735939, term735939.getClass(), "_parent", null);
        setIntField(term735941, term735941.getClass(), "size", 128);
        setIntField(term735941, term735941.getClass(), "count", 0);
        setIntField(term735941, term735941.getClass(), "tertiaryShift", 4);
        setField(term735941, term735941.getClass(), "mainHash", term735942);
        setField(term735941, term735941.getClass(), "names", term735943);
        setIntField(term735941, term735941.getClass(), "spilloverEnd", 896);
        setIntField(term735941, term735941.getClass(), "longNameOffset", 1024);
        setField(term735940, term735940.getClass(), "value", term735941);
        setField(term735939, term735939.getClass(), "_tableInfo", term735940);
        setIntField(term735939, term735939.getClass(), "_seed", 0);
        setBooleanField(term735939, term735939.getClass(), "_intern", true);
        setBooleanField(term735939, term735939.getClass(), "_failOnDoS", true);
        setField(term735939, term735939.getClass(), "_hashArea", null);
        setIntField(term735939, term735939.getClass(), "_hashSize", 0);
        setIntField(term735939, term735939.getClass(), "_secondaryStart", 0);
        setIntField(term735939, term735939.getClass(), "_tertiaryStart", 0);
        setIntField(term735939, term735939.getClass(), "_tertiaryShift", 0);
        setIntField(term735939, term735939.getClass(), "_count", 0);
        setField(term735939, term735939.getClass(), "_names", null);
        setIntField(term735939, term735939.getClass(), "_spilloverEnd", 0);
        setIntField(term735939, term735939.getClass(), "_longNameOffset", 0);
        setBooleanField(term735939, term735939.getClass(), "_needRehash", false);
        setBooleanField(term735939, term735939.getClass(), "_hashShared", false);
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
        args[0] = 128;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term735939));
    }

};


