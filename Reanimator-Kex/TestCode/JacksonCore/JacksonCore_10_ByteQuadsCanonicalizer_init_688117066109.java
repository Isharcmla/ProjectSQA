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

public class ByteQuadsCanonicalizer_init_688117066109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130766;

    public ByteQuadsCanonicalizer_init_688117066109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57546 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term57658 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term57546, term57546.getClass(), "_parent", term57658);
        setIntField(term57546, term57546.getClass(), "_seed", 0);
        setBooleanField(term57546, term57546.getClass(), "_intern", false);
        setBooleanField(term57546, term57546.getClass(), "_failOnDoS", false);
        term130766 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term130767 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term130768 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term130769 = (int[]) newIntArray(262144);
        Object[] term130770 = (Object[]) newArray("java.lang.String", 65536);
        setField(term130766, term130766.getClass(), "_parent", null);
        setIntField(term130768, term130768.getClass(), "size", 32768);
        setIntField(term130768, term130768.getClass(), "count", 0);
        setIntField(term130768, term130768.getClass(), "tertiaryShift", 7);
        setField(term130768, term130768.getClass(), "mainHash", term130769);
        setField(term130768, term130768.getClass(), "names", term130770);
        setIntField(term130768, term130768.getClass(), "spilloverEnd", 229376);
        setIntField(term130768, term130768.getClass(), "longNameOffset", 262144);
        setField(term130767, term130767.getClass(), "value", term130768);
        setField(term130766, term130766.getClass(), "_tableInfo", term130767);
        setIntField(term130766, term130766.getClass(), "_seed", 0);
        setBooleanField(term130766, term130766.getClass(), "_intern", true);
        setBooleanField(term130766, term130766.getClass(), "_failOnDoS", true);
        setField(term130766, term130766.getClass(), "_hashArea", null);
        setIntField(term130766, term130766.getClass(), "_hashSize", 0);
        setIntField(term130766, term130766.getClass(), "_secondaryStart", 0);
        setIntField(term130766, term130766.getClass(), "_tertiaryStart", 0);
        setIntField(term130766, term130766.getClass(), "_tertiaryShift", 0);
        setIntField(term130766, term130766.getClass(), "_count", 0);
        setField(term130766, term130766.getClass(), "_names", null);
        setIntField(term130766, term130766.getClass(), "_spilloverEnd", 0);
        setIntField(term130766, term130766.getClass(), "_longNameOffset", 0);
        setBooleanField(term130766, term130766.getClass(), "_needRehash", false);
        setBooleanField(term130766, term130766.getClass(), "_hashShared", false);
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
        assertTrue(recursiveEquals(instance, term130766));
    }

};


