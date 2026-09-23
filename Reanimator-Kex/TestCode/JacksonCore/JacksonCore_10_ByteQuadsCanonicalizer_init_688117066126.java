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

public class ByteQuadsCanonicalizer_init_688117066126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252419;

    public ByteQuadsCanonicalizer_init_688117066126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100006 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term100118 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term100006, term100006.getClass(), "_parent", term100118);
        setIntField(term100006, term100006.getClass(), "_seed", 0);
        setBooleanField(term100006, term100006.getClass(), "_intern", false);
        setBooleanField(term100006, term100006.getClass(), "_failOnDoS", false);
        term252419 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term252420 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term252421 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term252422 = (int[]) newIntArray(8192);
        Object[] term252423 = (Object[]) newArray("java.lang.String", 2048);
        setField(term252419, term252419.getClass(), "_parent", null);
        setIntField(term252421, term252421.getClass(), "size", 1024);
        setIntField(term252421, term252421.getClass(), "count", 0);
        setIntField(term252421, term252421.getClass(), "tertiaryShift", 5);
        setField(term252421, term252421.getClass(), "mainHash", term252422);
        setField(term252421, term252421.getClass(), "names", term252423);
        setIntField(term252421, term252421.getClass(), "spilloverEnd", 7168);
        setIntField(term252421, term252421.getClass(), "longNameOffset", 8192);
        setField(term252420, term252420.getClass(), "value", term252421);
        setField(term252419, term252419.getClass(), "_tableInfo", term252420);
        setIntField(term252419, term252419.getClass(), "_seed", 0);
        setBooleanField(term252419, term252419.getClass(), "_intern", true);
        setBooleanField(term252419, term252419.getClass(), "_failOnDoS", true);
        setField(term252419, term252419.getClass(), "_hashArea", null);
        setIntField(term252419, term252419.getClass(), "_hashSize", 0);
        setIntField(term252419, term252419.getClass(), "_secondaryStart", 0);
        setIntField(term252419, term252419.getClass(), "_tertiaryStart", 0);
        setIntField(term252419, term252419.getClass(), "_tertiaryShift", 0);
        setIntField(term252419, term252419.getClass(), "_count", 0);
        setField(term252419, term252419.getClass(), "_names", null);
        setIntField(term252419, term252419.getClass(), "_spilloverEnd", 0);
        setIntField(term252419, term252419.getClass(), "_longNameOffset", 0);
        setBooleanField(term252419, term252419.getClass(), "_needRehash", false);
        setBooleanField(term252419, term252419.getClass(), "_hashShared", false);
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
        args[0] = 763;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term252419));
    }

};


