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

public class ByteQuadsCanonicalizer_init_1772922302139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201888;
     Object term202020;
     Object term485756;
     Object term485758;
     Object term485759;

    public ByteQuadsCanonicalizer_init_1772922302139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term201664 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term201776 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term201664, term201664.getClass(), "_parent", term201776);
        setIntField(term201664, term201664.getClass(), "_seed", 0);
        setBooleanField(term201664, term201664.getClass(), "_intern", false);
        setBooleanField(term201664, term201664.getClass(), "_failOnDoS", false);
        setField(term201664, term201664.getClass(), "_tableInfo", null);
        term201888 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        term202020 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        term485756 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term485757 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term485757, term485757.getClass(), "_parent", null);
        setField(term485757, term485757.getClass(), "_tableInfo", null);
        setIntField(term485757, term485757.getClass(), "_seed", 0);
        setBooleanField(term485757, term485757.getClass(), "_intern", false);
        setBooleanField(term485757, term485757.getClass(), "_failOnDoS", false);
        setField(term485757, term485757.getClass(), "_hashArea", null);
        setIntField(term485757, term485757.getClass(), "_hashSize", 0);
        setIntField(term485757, term485757.getClass(), "_secondaryStart", 0);
        setIntField(term485757, term485757.getClass(), "_tertiaryStart", 0);
        setIntField(term485757, term485757.getClass(), "_tertiaryShift", 0);
        setIntField(term485757, term485757.getClass(), "_count", 0);
        setField(term485757, term485757.getClass(), "_names", null);
        setIntField(term485757, term485757.getClass(), "_spilloverEnd", 0);
        setIntField(term485757, term485757.getClass(), "_longNameOffset", 0);
        setBooleanField(term485757, term485757.getClass(), "_needRehash", false);
        setBooleanField(term485757, term485757.getClass(), "_hashShared", false);
        setField(term485756, term485756.getClass(), "_parent", term485757);
        setField(term485756, term485756.getClass(), "_tableInfo", null);
        setIntField(term485756, term485756.getClass(), "_seed", 0);
        setBooleanField(term485756, term485756.getClass(), "_intern", true);
        setBooleanField(term485756, term485756.getClass(), "_failOnDoS", true);
        setField(term485756, term485756.getClass(), "_hashArea", null);
        setIntField(term485756, term485756.getClass(), "_hashSize", 0);
        setIntField(term485756, term485756.getClass(), "_secondaryStart", 0);
        setIntField(term485756, term485756.getClass(), "_tertiaryStart", 0);
        setIntField(term485756, term485756.getClass(), "_tertiaryShift", 0);
        setIntField(term485756, term485756.getClass(), "_count", 0);
        setField(term485756, term485756.getClass(), "_names", null);
        setIntField(term485756, term485756.getClass(), "_spilloverEnd", 0);
        setIntField(term485756, term485756.getClass(), "_longNameOffset", 0);
        setBooleanField(term485756, term485756.getClass(), "_needRehash", false);
        setBooleanField(term485756, term485756.getClass(), "_hashShared", true);
        term485758 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        setField(term485758, term485758.getClass(), "_parent", null);
        setField(term485758, term485758.getClass(), "_tableInfo", null);
        setIntField(term485758, term485758.getClass(), "_seed", 0);
        setBooleanField(term485758, term485758.getClass(), "_intern", false);
        setBooleanField(term485758, term485758.getClass(), "_failOnDoS", false);
        setField(term485758, term485758.getClass(), "_hashArea", null);
        setIntField(term485758, term485758.getClass(), "_hashSize", 0);
        setIntField(term485758, term485758.getClass(), "_secondaryStart", 0);
        setIntField(term485758, term485758.getClass(), "_tertiaryStart", 0);
        setIntField(term485758, term485758.getClass(), "_tertiaryShift", 0);
        setIntField(term485758, term485758.getClass(), "_count", 0);
        setField(term485758, term485758.getClass(), "_names", null);
        setIntField(term485758, term485758.getClass(), "_spilloverEnd", 0);
        setIntField(term485758, term485758.getClass(), "_longNameOffset", 0);
        setBooleanField(term485758, term485758.getClass(), "_needRehash", false);
        setBooleanField(term485758, term485758.getClass(), "_hashShared", false);
        term485759 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        setIntField(term485759, term485759.getClass(), "size", 0);
        setIntField(term485759, term485759.getClass(), "count", 0);
        setIntField(term485759, term485759.getClass(), "tertiaryShift", 0);
        setField(term485759, term485759.getClass(), "mainHash", null);
        setField(term485759, term485759.getClass(), "names", null);
        setIntField(term485759, term485759.getClass(), "spilloverEnd", 0);
        setIntField(term485759, term485759.getClass(), "longNameOffset", 0);
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
        args[0] = term201888;
        args[1] = true;
        args[2] = 0;
        args[3] = true;
        args[4] = term202020;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term485756));
        assertTrue(recursiveEquals(term201888, term485758));
        assertTrue(recursiveEquals(term202020, term485759));
    }

};


