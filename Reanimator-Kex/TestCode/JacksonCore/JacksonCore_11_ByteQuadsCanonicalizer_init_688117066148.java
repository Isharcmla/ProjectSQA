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

public class ByteQuadsCanonicalizer_init_688117066148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641044;

    public ByteQuadsCanonicalizer_init_688117066148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term203577 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term203689 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term203577, term203577.getClass(), "_parent", term203689);
        setIntField(term203577, term203577.getClass(), "_seed", 0);
        setBooleanField(term203577, term203577.getClass(), "_intern", false);
        setBooleanField(term203577, term203577.getClass(), "_failOnDoS", false);
        term641044 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term641045 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term641046 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term641047 = (int[]) newIntArray(4194304);
        Object[] term641048 = (Object[]) newArray("java.lang.String", 1048576);
        setField(term641044, term641044.getClass(), "_parent", null);
        setIntField(term641046, term641046.getClass(), "size", 524288);
        setIntField(term641046, term641046.getClass(), "count", 0);
        setIntField(term641046, term641046.getClass(), "tertiaryShift", 7);
        setField(term641046, term641046.getClass(), "mainHash", term641047);
        setField(term641046, term641046.getClass(), "names", term641048);
        setIntField(term641046, term641046.getClass(), "spilloverEnd", 3670016);
        setIntField(term641046, term641046.getClass(), "longNameOffset", 4194304);
        setField(term641045, term641045.getClass(), "value", term641046);
        setField(term641044, term641044.getClass(), "_tableInfo", term641045);
        setIntField(term641044, term641044.getClass(), "_seed", 0);
        setBooleanField(term641044, term641044.getClass(), "_intern", true);
        setBooleanField(term641044, term641044.getClass(), "_failOnDoS", true);
        setField(term641044, term641044.getClass(), "_hashArea", null);
        setIntField(term641044, term641044.getClass(), "_hashSize", 0);
        setIntField(term641044, term641044.getClass(), "_secondaryStart", 0);
        setIntField(term641044, term641044.getClass(), "_tertiaryStart", 0);
        setIntField(term641044, term641044.getClass(), "_tertiaryShift", 0);
        setIntField(term641044, term641044.getClass(), "_count", 0);
        setField(term641044, term641044.getClass(), "_names", null);
        setIntField(term641044, term641044.getClass(), "_spilloverEnd", 0);
        setIntField(term641044, term641044.getClass(), "_longNameOffset", 0);
        setBooleanField(term641044, term641044.getClass(), "_needRehash", false);
        setBooleanField(term641044, term641044.getClass(), "_hashShared", false);
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
        assertTrue(recursiveEquals(instance, term641044));
    }

};


