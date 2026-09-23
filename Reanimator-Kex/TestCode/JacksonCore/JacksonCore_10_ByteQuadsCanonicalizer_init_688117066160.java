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

public class ByteQuadsCanonicalizer_init_688117066160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term796240;

    public ByteQuadsCanonicalizer_init_688117066160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term278987 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term279099 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term278987, term278987.getClass(), "_parent", term279099);
        setIntField(term278987, term278987.getClass(), "_seed", 0);
        setBooleanField(term278987, term278987.getClass(), "_intern", false);
        setBooleanField(term278987, term278987.getClass(), "_failOnDoS", false);
        term796240 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term796241 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term796242 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term796243 = (int[]) newIntArray(32768);
        Object[] term796244 = (Object[]) newArray("java.lang.String", 8192);
        setField(term796240, term796240.getClass(), "_parent", null);
        setIntField(term796242, term796242.getClass(), "size", 4096);
        setIntField(term796242, term796242.getClass(), "count", 0);
        setIntField(term796242, term796242.getClass(), "tertiaryShift", 6);
        setField(term796242, term796242.getClass(), "mainHash", term796243);
        setField(term796242, term796242.getClass(), "names", term796244);
        setIntField(term796242, term796242.getClass(), "spilloverEnd", 28672);
        setIntField(term796242, term796242.getClass(), "longNameOffset", 32768);
        setField(term796241, term796241.getClass(), "value", term796242);
        setField(term796240, term796240.getClass(), "_tableInfo", term796241);
        setIntField(term796240, term796240.getClass(), "_seed", 0);
        setBooleanField(term796240, term796240.getClass(), "_intern", true);
        setBooleanField(term796240, term796240.getClass(), "_failOnDoS", true);
        setField(term796240, term796240.getClass(), "_hashArea", null);
        setIntField(term796240, term796240.getClass(), "_hashSize", 0);
        setIntField(term796240, term796240.getClass(), "_secondaryStart", 0);
        setIntField(term796240, term796240.getClass(), "_tertiaryStart", 0);
        setIntField(term796240, term796240.getClass(), "_tertiaryShift", 0);
        setIntField(term796240, term796240.getClass(), "_count", 0);
        setField(term796240, term796240.getClass(), "_names", null);
        setIntField(term796240, term796240.getClass(), "_spilloverEnd", 0);
        setIntField(term796240, term796240.getClass(), "_longNameOffset", 0);
        setBooleanField(term796240, term796240.getClass(), "_needRehash", false);
        setBooleanField(term796240, term796240.getClass(), "_hashShared", false);
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
        args[0] = 4096;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term796240));
    }

};


