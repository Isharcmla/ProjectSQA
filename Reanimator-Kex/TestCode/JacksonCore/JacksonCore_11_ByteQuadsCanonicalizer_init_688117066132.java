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

public class ByteQuadsCanonicalizer_init_688117066132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274996;

    public ByteQuadsCanonicalizer_init_688117066132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term108940 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term109052 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term108940, term108940.getClass(), "_parent", term109052);
        setIntField(term108940, term108940.getClass(), "_seed", 0);
        setBooleanField(term108940, term108940.getClass(), "_intern", false);
        setBooleanField(term108940, term108940.getClass(), "_failOnDoS", false);
        term274996 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term274997 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term274998 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term274999 = (int[]) newIntArray(134217728);
        Object[] term275000 = (Object[]) newArray("java.lang.String", 33554432);
        setField(term274996, term274996.getClass(), "_parent", null);
        setIntField(term274998, term274998.getClass(), "size", 16777216);
        setIntField(term274998, term274998.getClass(), "count", 0);
        setIntField(term274998, term274998.getClass(), "tertiaryShift", 7);
        setField(term274998, term274998.getClass(), "mainHash", term274999);
        setField(term274998, term274998.getClass(), "names", term275000);
        setIntField(term274998, term274998.getClass(), "spilloverEnd", 117440512);
        setIntField(term274998, term274998.getClass(), "longNameOffset", 134217728);
        setField(term274997, term274997.getClass(), "value", term274998);
        setField(term274996, term274996.getClass(), "_tableInfo", term274997);
        setIntField(term274996, term274996.getClass(), "_seed", 0);
        setBooleanField(term274996, term274996.getClass(), "_intern", true);
        setBooleanField(term274996, term274996.getClass(), "_failOnDoS", true);
        setField(term274996, term274996.getClass(), "_hashArea", null);
        setIntField(term274996, term274996.getClass(), "_hashSize", 0);
        setIntField(term274996, term274996.getClass(), "_secondaryStart", 0);
        setIntField(term274996, term274996.getClass(), "_tertiaryStart", 0);
        setIntField(term274996, term274996.getClass(), "_tertiaryShift", 0);
        setIntField(term274996, term274996.getClass(), "_count", 0);
        setField(term274996, term274996.getClass(), "_names", null);
        setIntField(term274996, term274996.getClass(), "_spilloverEnd", 0);
        setIntField(term274996, term274996.getClass(), "_longNameOffset", 0);
        setBooleanField(term274996, term274996.getClass(), "_needRehash", false);
        setBooleanField(term274996, term274996.getClass(), "_hashShared", false);
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
        args[0] = 12582903;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term274996));
    }

};


