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

public class ByteQuadsCanonicalizer_init_177292230292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15992;
     Object term16124;
     Object term16453;
     Object term16455;
     Object term16456;

    public ByteQuadsCanonicalizer_init_177292230292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15768 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term15880 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term15768, term15768.getClass(), "_parent", term15880);
        setIntField(term15768, term15768.getClass(), "_seed", 0);
        setBooleanField(term15768, term15768.getClass(), "_intern", false);
        setBooleanField(term15768, term15768.getClass(), "_failOnDoS", false);
        setField(term15768, term15768.getClass(), "_tableInfo", null);
        term15992 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        term16124 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        term16453 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term16454 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term16454, term16454.getClass(), "_parent", null);
        setField(term16454, term16454.getClass(), "_tableInfo", null);
        setIntField(term16454, term16454.getClass(), "_seed", 0);
        setBooleanField(term16454, term16454.getClass(), "_intern", false);
        setBooleanField(term16454, term16454.getClass(), "_failOnDoS", false);
        setField(term16454, term16454.getClass(), "_hashArea", null);
        setIntField(term16454, term16454.getClass(), "_hashSize", 0);
        setIntField(term16454, term16454.getClass(), "_secondaryStart", 0);
        setIntField(term16454, term16454.getClass(), "_tertiaryStart", 0);
        setIntField(term16454, term16454.getClass(), "_tertiaryShift", 0);
        setIntField(term16454, term16454.getClass(), "_count", 0);
        setField(term16454, term16454.getClass(), "_names", null);
        setIntField(term16454, term16454.getClass(), "_spilloverEnd", 0);
        setIntField(term16454, term16454.getClass(), "_longNameOffset", 0);
        setBooleanField(term16454, term16454.getClass(), "_needRehash", false);
        setBooleanField(term16454, term16454.getClass(), "_hashShared", false);
        setField(term16453, term16453.getClass(), "_parent", term16454);
        setField(term16453, term16453.getClass(), "_tableInfo", null);
        setIntField(term16453, term16453.getClass(), "_seed", 0);
        setBooleanField(term16453, term16453.getClass(), "_intern", true);
        setBooleanField(term16453, term16453.getClass(), "_failOnDoS", true);
        setField(term16453, term16453.getClass(), "_hashArea", null);
        setIntField(term16453, term16453.getClass(), "_hashSize", 0);
        setIntField(term16453, term16453.getClass(), "_secondaryStart", 0);
        setIntField(term16453, term16453.getClass(), "_tertiaryStart", 0);
        setIntField(term16453, term16453.getClass(), "_tertiaryShift", 0);
        setIntField(term16453, term16453.getClass(), "_count", 0);
        setField(term16453, term16453.getClass(), "_names", null);
        setIntField(term16453, term16453.getClass(), "_spilloverEnd", 0);
        setIntField(term16453, term16453.getClass(), "_longNameOffset", 0);
        setBooleanField(term16453, term16453.getClass(), "_needRehash", false);
        setBooleanField(term16453, term16453.getClass(), "_hashShared", true);
        term16455 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term16455, term16455.getClass(), "_parent", null);
        setField(term16455, term16455.getClass(), "_tableInfo", null);
        setIntField(term16455, term16455.getClass(), "_seed", 0);
        setBooleanField(term16455, term16455.getClass(), "_intern", false);
        setBooleanField(term16455, term16455.getClass(), "_failOnDoS", false);
        setField(term16455, term16455.getClass(), "_hashArea", null);
        setIntField(term16455, term16455.getClass(), "_hashSize", 0);
        setIntField(term16455, term16455.getClass(), "_secondaryStart", 0);
        setIntField(term16455, term16455.getClass(), "_tertiaryStart", 0);
        setIntField(term16455, term16455.getClass(), "_tertiaryShift", 0);
        setIntField(term16455, term16455.getClass(), "_count", 0);
        setField(term16455, term16455.getClass(), "_names", null);
        setIntField(term16455, term16455.getClass(), "_spilloverEnd", 0);
        setIntField(term16455, term16455.getClass(), "_longNameOffset", 0);
        setBooleanField(term16455, term16455.getClass(), "_needRehash", false);
        setBooleanField(term16455, term16455.getClass(), "_hashShared", false);
        term16456 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        setIntField(term16456, term16456.getClass(), "size", 0);
        setIntField(term16456, term16456.getClass(), "count", 0);
        setIntField(term16456, term16456.getClass(), "tertiaryShift", 0);
        setField(term16456, term16456.getClass(), "mainHash", null);
        setField(term16456, term16456.getClass(), "names", null);
        setIntField(term16456, term16456.getClass(), "spilloverEnd", 0);
        setIntField(term16456, term16456.getClass(), "longNameOffset", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo");
        Object[] args = new Object[5];
        args[0] = term15992;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        args[4] = term16124;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16453));
        assertTrue(recursiveEquals(term15992, term16455));
        assertTrue(recursiveEquals(term16124, term16456));
    }

};


