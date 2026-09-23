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

public class ByteQuadsCanonicalizer_init_68811706696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47371;

    public ByteQuadsCanonicalizer_init_68811706696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16305 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term16417 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term16305, term16305.getClass(), "_parent", term16417);
        setIntField(term16305, term16305.getClass(), "_seed", 0);
        setBooleanField(term16305, term16305.getClass(), "_intern", false);
        setBooleanField(term16305, term16305.getClass(), "_failOnDoS", false);
        term47371 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term47372 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term47373 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term47374 = (int[]) newIntArray(4194304);
        Object[] term47375 = (Object[]) newArray("java.lang.String", 1048576);
        setField(term47371, term47371.getClass(), "_parent", null);
        setIntField(term47373, term47373.getClass(), "size", 524288);
        setIntField(term47373, term47373.getClass(), "count", 0);
        setIntField(term47373, term47373.getClass(), "tertiaryShift", 7);
        setField(term47373, term47373.getClass(), "mainHash", term47374);
        setField(term47373, term47373.getClass(), "names", term47375);
        setIntField(term47373, term47373.getClass(), "spilloverEnd", 3670016);
        setIntField(term47373, term47373.getClass(), "longNameOffset", 4194304);
        setField(term47372, term47372.getClass(), "value", term47373);
        setField(term47371, term47371.getClass(), "_tableInfo", term47372);
        setIntField(term47371, term47371.getClass(), "_seed", 0);
        setBooleanField(term47371, term47371.getClass(), "_intern", true);
        setBooleanField(term47371, term47371.getClass(), "_failOnDoS", true);
        setField(term47371, term47371.getClass(), "_hashArea", null);
        setIntField(term47371, term47371.getClass(), "_hashSize", 0);
        setIntField(term47371, term47371.getClass(), "_secondaryStart", 0);
        setIntField(term47371, term47371.getClass(), "_tertiaryStart", 0);
        setIntField(term47371, term47371.getClass(), "_tertiaryShift", 0);
        setIntField(term47371, term47371.getClass(), "_count", 0);
        setField(term47371, term47371.getClass(), "_names", null);
        setIntField(term47371, term47371.getClass(), "_spilloverEnd", 0);
        setIntField(term47371, term47371.getClass(), "_longNameOffset", 0);
        setBooleanField(term47371, term47371.getClass(), "_needRehash", false);
        setBooleanField(term47371, term47371.getClass(), "_hashShared", false);
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
        args[0] = 389111;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47371));
    }

};


