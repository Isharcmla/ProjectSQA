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
     Object term757993;

    public ByteQuadsCanonicalizer_init_688117066159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term278843 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term278843, term278843.getClass(), "_parent", null);
        setIntField(term278843, term278843.getClass(), "_seed", 0);
        setBooleanField(term278843, term278843.getClass(), "_intern", false);
        setBooleanField(term278843, term278843.getClass(), "_failOnDoS", false);
        term757993 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term757994 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term757995 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term757996 = (int[]) newIntArray(8192);
        Object[] term757997 = (Object[]) newArray("java.lang.String", 2048);
        setField(term757993, term757993.getClass(), "_parent", null);
        setIntField(term757995, term757995.getClass(), "size", 1024);
        setIntField(term757995, term757995.getClass(), "count", 0);
        setIntField(term757995, term757995.getClass(), "tertiaryShift", 5);
        setField(term757995, term757995.getClass(), "mainHash", term757996);
        setField(term757995, term757995.getClass(), "names", term757997);
        setIntField(term757995, term757995.getClass(), "spilloverEnd", 7168);
        setIntField(term757995, term757995.getClass(), "longNameOffset", 8192);
        setField(term757994, term757994.getClass(), "value", term757995);
        setField(term757993, term757993.getClass(), "_tableInfo", term757994);
        setIntField(term757993, term757993.getClass(), "_seed", 0);
        setBooleanField(term757993, term757993.getClass(), "_intern", true);
        setBooleanField(term757993, term757993.getClass(), "_failOnDoS", true);
        setField(term757993, term757993.getClass(), "_hashArea", null);
        setIntField(term757993, term757993.getClass(), "_hashSize", 0);
        setIntField(term757993, term757993.getClass(), "_secondaryStart", 0);
        setIntField(term757993, term757993.getClass(), "_tertiaryStart", 0);
        setIntField(term757993, term757993.getClass(), "_tertiaryShift", 0);
        setIntField(term757993, term757993.getClass(), "_count", 0);
        setField(term757993, term757993.getClass(), "_names", null);
        setIntField(term757993, term757993.getClass(), "_spilloverEnd", 0);
        setIntField(term757993, term757993.getClass(), "_longNameOffset", 0);
        setBooleanField(term757993, term757993.getClass(), "_needRehash", false);
        setBooleanField(term757993, term757993.getClass(), "_hashShared", false);
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
        assertTrue(recursiveEquals(instance, term757993));
    }

};


