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
     Object term722403;

    public ByteQuadsCanonicalizer_init_688117066152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term204385 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term204497 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term204385, term204385.getClass(), "_parent", term204497);
        setIntField(term204385, term204385.getClass(), "_seed", 0);
        setBooleanField(term204385, term204385.getClass(), "_intern", false);
        setBooleanField(term204385, term204385.getClass(), "_failOnDoS", false);
        term722403 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term722404 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term722405 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term722406 = (int[]) newIntArray(262144);
        Object[] term722407 = (Object[]) newArray("java.lang.String", 65536);
        setField(term722403, term722403.getClass(), "_parent", null);
        setIntField(term722405, term722405.getClass(), "size", 32768);
        setIntField(term722405, term722405.getClass(), "count", 0);
        setIntField(term722405, term722405.getClass(), "tertiaryShift", 7);
        setField(term722405, term722405.getClass(), "mainHash", term722406);
        setField(term722405, term722405.getClass(), "names", term722407);
        setIntField(term722405, term722405.getClass(), "spilloverEnd", 229376);
        setIntField(term722405, term722405.getClass(), "longNameOffset", 262144);
        setField(term722404, term722404.getClass(), "value", term722405);
        setField(term722403, term722403.getClass(), "_tableInfo", term722404);
        setIntField(term722403, term722403.getClass(), "_seed", 0);
        setBooleanField(term722403, term722403.getClass(), "_intern", true);
        setBooleanField(term722403, term722403.getClass(), "_failOnDoS", true);
        setField(term722403, term722403.getClass(), "_hashArea", null);
        setIntField(term722403, term722403.getClass(), "_hashSize", 0);
        setIntField(term722403, term722403.getClass(), "_secondaryStart", 0);
        setIntField(term722403, term722403.getClass(), "_tertiaryStart", 0);
        setIntField(term722403, term722403.getClass(), "_tertiaryShift", 0);
        setIntField(term722403, term722403.getClass(), "_count", 0);
        setField(term722403, term722403.getClass(), "_names", null);
        setIntField(term722403, term722403.getClass(), "_spilloverEnd", 0);
        setIntField(term722403, term722403.getClass(), "_longNameOffset", 0);
        setBooleanField(term722403, term722403.getClass(), "_needRehash", false);
        setBooleanField(term722403, term722403.getClass(), "_hashShared", false);
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
        args[0] = 32767;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term722403));
    }

};


