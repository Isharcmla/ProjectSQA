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

public class ByteQuadsCanonicalizer_init_688117066161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809363;

    public ByteQuadsCanonicalizer_init_688117066161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term279240 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term279240, term279240.getClass(), "_parent", null);
        setIntField(term279240, term279240.getClass(), "_seed", 0);
        setBooleanField(term279240, term279240.getClass(), "_intern", false);
        setBooleanField(term279240, term279240.getClass(), "_failOnDoS", false);
        term809363 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term809364 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term809365 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term809366 = (int[]) newIntArray(1024);
        Object[] term809367 = (Object[]) newArray("java.lang.String", 256);
        setField(term809363, term809363.getClass(), "_parent", null);
        setIntField(term809365, term809365.getClass(), "size", 128);
        setIntField(term809365, term809365.getClass(), "count", 0);
        setIntField(term809365, term809365.getClass(), "tertiaryShift", 4);
        setField(term809365, term809365.getClass(), "mainHash", term809366);
        setField(term809365, term809365.getClass(), "names", term809367);
        setIntField(term809365, term809365.getClass(), "spilloverEnd", 896);
        setIntField(term809365, term809365.getClass(), "longNameOffset", 1024);
        setField(term809364, term809364.getClass(), "value", term809365);
        setField(term809363, term809363.getClass(), "_tableInfo", term809364);
        setIntField(term809363, term809363.getClass(), "_seed", 0);
        setBooleanField(term809363, term809363.getClass(), "_intern", true);
        setBooleanField(term809363, term809363.getClass(), "_failOnDoS", true);
        setField(term809363, term809363.getClass(), "_hashArea", null);
        setIntField(term809363, term809363.getClass(), "_hashSize", 0);
        setIntField(term809363, term809363.getClass(), "_secondaryStart", 0);
        setIntField(term809363, term809363.getClass(), "_tertiaryStart", 0);
        setIntField(term809363, term809363.getClass(), "_tertiaryShift", 0);
        setIntField(term809363, term809363.getClass(), "_count", 0);
        setField(term809363, term809363.getClass(), "_names", null);
        setIntField(term809363, term809363.getClass(), "_spilloverEnd", 0);
        setIntField(term809363, term809363.getClass(), "_longNameOffset", 0);
        setBooleanField(term809363, term809363.getClass(), "_needRehash", false);
        setBooleanField(term809363, term809363.getClass(), "_hashShared", false);
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
        assertTrue(recursiveEquals(instance, term809363));
    }

};


