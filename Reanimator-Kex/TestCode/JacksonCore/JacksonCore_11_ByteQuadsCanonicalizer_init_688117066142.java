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

public class ByteQuadsCanonicalizer_init_688117066142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560053;

    public ByteQuadsCanonicalizer_init_688117066142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term202768 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term202880 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term202768, term202768.getClass(), "_parent", term202880);
        setIntField(term202768, term202768.getClass(), "_seed", 0);
        setBooleanField(term202768, term202768.getClass(), "_intern", false);
        setBooleanField(term202768, term202768.getClass(), "_failOnDoS", false);
        term560053 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term560054 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term560055 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term560056 = (int[]) newIntArray(67108864);
        Object[] term560057 = (Object[]) newArray("java.lang.String", 16777216);
        setField(term560053, term560053.getClass(), "_parent", null);
        setIntField(term560055, term560055.getClass(), "size", 8388608);
        setIntField(term560055, term560055.getClass(), "count", 0);
        setIntField(term560055, term560055.getClass(), "tertiaryShift", 7);
        setField(term560055, term560055.getClass(), "mainHash", term560056);
        setField(term560055, term560055.getClass(), "names", term560057);
        setIntField(term560055, term560055.getClass(), "spilloverEnd", 58720256);
        setIntField(term560055, term560055.getClass(), "longNameOffset", 67108864);
        setField(term560054, term560054.getClass(), "value", term560055);
        setField(term560053, term560053.getClass(), "_tableInfo", term560054);
        setIntField(term560053, term560053.getClass(), "_seed", 0);
        setBooleanField(term560053, term560053.getClass(), "_intern", true);
        setBooleanField(term560053, term560053.getClass(), "_failOnDoS", true);
        setField(term560053, term560053.getClass(), "_hashArea", null);
        setIntField(term560053, term560053.getClass(), "_hashSize", 0);
        setIntField(term560053, term560053.getClass(), "_secondaryStart", 0);
        setIntField(term560053, term560053.getClass(), "_tertiaryStart", 0);
        setIntField(term560053, term560053.getClass(), "_tertiaryShift", 0);
        setIntField(term560053, term560053.getClass(), "_count", 0);
        setField(term560053, term560053.getClass(), "_names", null);
        setIntField(term560053, term560053.getClass(), "_spilloverEnd", 0);
        setIntField(term560053, term560053.getClass(), "_longNameOffset", 0);
        setBooleanField(term560053, term560053.getClass(), "_needRehash", false);
        setBooleanField(term560053, term560053.getClass(), "_hashShared", false);
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
        args[0] = 6291447;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term560053));
    }

};


