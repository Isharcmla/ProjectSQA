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

public class ByteQuadsCanonicalizer_init_688117066113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184436;

    public ByteQuadsCanonicalizer_init_688117066113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99022 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term99134 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term99022, term99022.getClass(), "_parent", term99134);
        setIntField(term99022, term99022.getClass(), "_seed", 0);
        setBooleanField(term99022, term99022.getClass(), "_intern", false);
        setBooleanField(term99022, term99022.getClass(), "_failOnDoS", false);
        term184436 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term184437 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term184438 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term184439 = (int[]) newIntArray(128);
        Object[] term184440 = (Object[]) newArray("java.lang.String", 32);
        setField(term184436, term184436.getClass(), "_parent", null);
        setIntField(term184438, term184438.getClass(), "size", 16);
        setIntField(term184438, term184438.getClass(), "count", 0);
        setIntField(term184438, term184438.getClass(), "tertiaryShift", 4);
        setField(term184438, term184438.getClass(), "mainHash", term184439);
        setField(term184438, term184438.getClass(), "names", term184440);
        setIntField(term184438, term184438.getClass(), "spilloverEnd", 112);
        setIntField(term184438, term184438.getClass(), "longNameOffset", 128);
        setField(term184437, term184437.getClass(), "value", term184438);
        setField(term184436, term184436.getClass(), "_tableInfo", term184437);
        setIntField(term184436, term184436.getClass(), "_seed", 0);
        setBooleanField(term184436, term184436.getClass(), "_intern", true);
        setBooleanField(term184436, term184436.getClass(), "_failOnDoS", true);
        setField(term184436, term184436.getClass(), "_hashArea", null);
        setIntField(term184436, term184436.getClass(), "_hashSize", 0);
        setIntField(term184436, term184436.getClass(), "_secondaryStart", 0);
        setIntField(term184436, term184436.getClass(), "_tertiaryStart", 0);
        setIntField(term184436, term184436.getClass(), "_tertiaryShift", 0);
        setIntField(term184436, term184436.getClass(), "_count", 0);
        setField(term184436, term184436.getClass(), "_names", null);
        setIntField(term184436, term184436.getClass(), "_spilloverEnd", 0);
        setIntField(term184436, term184436.getClass(), "_longNameOffset", 0);
        setBooleanField(term184436, term184436.getClass(), "_needRehash", false);
        setBooleanField(term184436, term184436.getClass(), "_hashShared", false);
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
        args[0] = 15;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term184436));
    }

};


