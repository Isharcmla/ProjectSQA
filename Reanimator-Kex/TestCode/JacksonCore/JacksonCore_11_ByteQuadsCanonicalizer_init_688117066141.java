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

public class ByteQuadsCanonicalizer_init_688117066141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528954;

    public ByteQuadsCanonicalizer_init_688117066141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term202463 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term202575 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term202463, term202463.getClass(), "_parent", term202575);
        setIntField(term202463, term202463.getClass(), "_seed", 0);
        setBooleanField(term202463, term202463.getClass(), "_intern", false);
        setBooleanField(term202463, term202463.getClass(), "_failOnDoS", false);
        term528954 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term528955 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term528956 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term528957 = (int[]) newIntArray(1024);
        Object[] term528958 = (Object[]) newArray("java.lang.String", 256);
        setField(term528954, term528954.getClass(), "_parent", null);
        setIntField(term528956, term528956.getClass(), "size", 128);
        setIntField(term528956, term528956.getClass(), "count", 0);
        setIntField(term528956, term528956.getClass(), "tertiaryShift", 4);
        setField(term528956, term528956.getClass(), "mainHash", term528957);
        setField(term528956, term528956.getClass(), "names", term528958);
        setIntField(term528956, term528956.getClass(), "spilloverEnd", 896);
        setIntField(term528956, term528956.getClass(), "longNameOffset", 1024);
        setField(term528955, term528955.getClass(), "value", term528956);
        setField(term528954, term528954.getClass(), "_tableInfo", term528955);
        setIntField(term528954, term528954.getClass(), "_seed", 0);
        setBooleanField(term528954, term528954.getClass(), "_intern", true);
        setBooleanField(term528954, term528954.getClass(), "_failOnDoS", true);
        setField(term528954, term528954.getClass(), "_hashArea", null);
        setIntField(term528954, term528954.getClass(), "_hashSize", 0);
        setIntField(term528954, term528954.getClass(), "_secondaryStart", 0);
        setIntField(term528954, term528954.getClass(), "_tertiaryStart", 0);
        setIntField(term528954, term528954.getClass(), "_tertiaryShift", 0);
        setIntField(term528954, term528954.getClass(), "_count", 0);
        setField(term528954, term528954.getClass(), "_names", null);
        setIntField(term528954, term528954.getClass(), "_spilloverEnd", 0);
        setIntField(term528954, term528954.getClass(), "_longNameOffset", 0);
        setBooleanField(term528954, term528954.getClass(), "_needRehash", false);
        setBooleanField(term528954, term528954.getClass(), "_hashShared", false);
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
        args[0] = 87;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term528954));
    }

};


