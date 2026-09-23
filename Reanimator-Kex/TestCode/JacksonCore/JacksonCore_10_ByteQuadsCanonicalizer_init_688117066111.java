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

public class ByteQuadsCanonicalizer_init_688117066111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172926;

    public ByteQuadsCanonicalizer_init_688117066111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58086 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term58198 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term58086, term58086.getClass(), "_parent", term58198);
        setIntField(term58086, term58086.getClass(), "_seed", 0);
        setBooleanField(term58086, term58086.getClass(), "_intern", false);
        setBooleanField(term58086, term58086.getClass(), "_failOnDoS", false);
        term172926 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term172927 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term172928 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term172929 = (int[]) newIntArray(524288);
        Object[] term172930 = (Object[]) newArray("java.lang.String", 131072);
        setField(term172926, term172926.getClass(), "_parent", null);
        setIntField(term172928, term172928.getClass(), "size", 65536);
        setIntField(term172928, term172928.getClass(), "count", 0);
        setIntField(term172928, term172928.getClass(), "tertiaryShift", 7);
        setField(term172928, term172928.getClass(), "mainHash", term172929);
        setField(term172928, term172928.getClass(), "names", term172930);
        setIntField(term172928, term172928.getClass(), "spilloverEnd", 458752);
        setIntField(term172928, term172928.getClass(), "longNameOffset", 524288);
        setField(term172927, term172927.getClass(), "value", term172928);
        setField(term172926, term172926.getClass(), "_tableInfo", term172927);
        setIntField(term172926, term172926.getClass(), "_seed", 0);
        setBooleanField(term172926, term172926.getClass(), "_intern", true);
        setBooleanField(term172926, term172926.getClass(), "_failOnDoS", true);
        setField(term172926, term172926.getClass(), "_hashArea", null);
        setIntField(term172926, term172926.getClass(), "_hashSize", 0);
        setIntField(term172926, term172926.getClass(), "_secondaryStart", 0);
        setIntField(term172926, term172926.getClass(), "_tertiaryStart", 0);
        setIntField(term172926, term172926.getClass(), "_tertiaryShift", 0);
        setIntField(term172926, term172926.getClass(), "_count", 0);
        setField(term172926, term172926.getClass(), "_names", null);
        setIntField(term172926, term172926.getClass(), "_spilloverEnd", 0);
        setIntField(term172926, term172926.getClass(), "_longNameOffset", 0);
        setBooleanField(term172926, term172926.getClass(), "_needRehash", false);
        setBooleanField(term172926, term172926.getClass(), "_hashShared", false);
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
        args[0] = 65503;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term172926));
    }

};


