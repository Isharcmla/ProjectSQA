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

public class ByteQuadsCanonicalizer_init_688117066102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71502;

    public ByteQuadsCanonicalizer_init_688117066102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16654 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term16766 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term16654, term16654.getClass(), "_parent", term16766);
        setIntField(term16654, term16654.getClass(), "_seed", 0);
        setBooleanField(term16654, term16654.getClass(), "_intern", false);
        setBooleanField(term16654, term16654.getClass(), "_failOnDoS", false);
        term71502 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term71503 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term71504 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term71505 = (int[]) newIntArray(4096);
        Object[] term71506 = (Object[]) newArray("java.lang.String", 1024);
        setField(term71502, term71502.getClass(), "_parent", null);
        setIntField(term71504, term71504.getClass(), "size", 512);
        setIntField(term71504, term71504.getClass(), "count", 0);
        setIntField(term71504, term71504.getClass(), "tertiaryShift", 5);
        setField(term71504, term71504.getClass(), "mainHash", term71505);
        setField(term71504, term71504.getClass(), "names", term71506);
        setIntField(term71504, term71504.getClass(), "spilloverEnd", 3584);
        setIntField(term71504, term71504.getClass(), "longNameOffset", 4096);
        setField(term71503, term71503.getClass(), "value", term71504);
        setField(term71502, term71502.getClass(), "_tableInfo", term71503);
        setIntField(term71502, term71502.getClass(), "_seed", 0);
        setBooleanField(term71502, term71502.getClass(), "_intern", true);
        setBooleanField(term71502, term71502.getClass(), "_failOnDoS", true);
        setField(term71502, term71502.getClass(), "_hashArea", null);
        setIntField(term71502, term71502.getClass(), "_hashSize", 0);
        setIntField(term71502, term71502.getClass(), "_secondaryStart", 0);
        setIntField(term71502, term71502.getClass(), "_tertiaryStart", 0);
        setIntField(term71502, term71502.getClass(), "_tertiaryShift", 0);
        setIntField(term71502, term71502.getClass(), "_count", 0);
        setField(term71502, term71502.getClass(), "_names", null);
        setIntField(term71502, term71502.getClass(), "_spilloverEnd", 0);
        setIntField(term71502, term71502.getClass(), "_longNameOffset", 0);
        setBooleanField(term71502, term71502.getClass(), "_needRehash", false);
        setBooleanField(term71502, term71502.getClass(), "_hashShared", false);
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
        args[0] = 375;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term71502));
    }

};


