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

public class ByteQuadsCanonicalizer_init_688117066152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674663;

    public ByteQuadsCanonicalizer_init_688117066152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term277875 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term277987 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term277875, term277875.getClass(), "_parent", term277987);
        setIntField(term277875, term277875.getClass(), "_seed", 0);
        setBooleanField(term277875, term277875.getClass(), "_intern", false);
        setBooleanField(term277875, term277875.getClass(), "_failOnDoS", false);
        term674663 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term674664 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term674665 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term674666 = (int[]) newIntArray(1048576);
        Object[] term674667 = (Object[]) newArray("java.lang.String", 262144);
        setField(term674663, term674663.getClass(), "_parent", null);
        setIntField(term674665, term674665.getClass(), "size", 131072);
        setIntField(term674665, term674665.getClass(), "count", 0);
        setIntField(term674665, term674665.getClass(), "tertiaryShift", 7);
        setField(term674665, term674665.getClass(), "mainHash", term674666);
        setField(term674665, term674665.getClass(), "names", term674667);
        setIntField(term674665, term674665.getClass(), "spilloverEnd", 917504);
        setIntField(term674665, term674665.getClass(), "longNameOffset", 1048576);
        setField(term674664, term674664.getClass(), "value", term674665);
        setField(term674663, term674663.getClass(), "_tableInfo", term674664);
        setIntField(term674663, term674663.getClass(), "_seed", 0);
        setBooleanField(term674663, term674663.getClass(), "_intern", true);
        setBooleanField(term674663, term674663.getClass(), "_failOnDoS", true);
        setField(term674663, term674663.getClass(), "_hashArea", null);
        setIntField(term674663, term674663.getClass(), "_hashSize", 0);
        setIntField(term674663, term674663.getClass(), "_secondaryStart", 0);
        setIntField(term674663, term674663.getClass(), "_tertiaryStart", 0);
        setIntField(term674663, term674663.getClass(), "_tertiaryShift", 0);
        setIntField(term674663, term674663.getClass(), "_count", 0);
        setField(term674663, term674663.getClass(), "_names", null);
        setIntField(term674663, term674663.getClass(), "_spilloverEnd", 0);
        setIntField(term674663, term674663.getClass(), "_longNameOffset", 0);
        setBooleanField(term674663, term674663.getClass(), "_needRehash", false);
        setBooleanField(term674663, term674663.getClass(), "_hashShared", false);
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
        args[0] = 131071;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term674663));
    }

};


