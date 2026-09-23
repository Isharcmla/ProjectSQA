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
import java.lang.Integer;
import java.lang.Object;

public class ByteQuadsCanonicalizer_createRoot_126110732948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term4676;

    public ByteQuadsCanonicalizer_createRoot_126110732948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = new Integer(391863371);
        term4676 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term4677 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term4678 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term4682 = (int[]) newIntArray(512);
        Object[] term5195 = (Object[]) newArray("java.lang.String", 128);
        setField(term4676, term4676.getClass(), "_parent", null);
        setIntField(term4678, term4678.getClass(), "size", 64);
        setIntField(term4678, term4678.getClass(), "count", 0);
        setIntField(term4678, term4678.getClass(), "tertiaryShift", 4);
        setField(term4678, term4678.getClass(), "mainHash", term4682);
        setField(term4678, term4678.getClass(), "names", term5195);
        setIntField(term4678, term4678.getClass(), "spilloverEnd", 448);
        setIntField(term4678, term4678.getClass(), "longNameOffset", 512);
        setField(term4677, term4677.getClass(), "value", term4678);
        setField(term4676, term4676.getClass(), "_tableInfo", term4677);
        setIntField(term4676, term4676.getClass(), "_seed", 391863371);
        setBooleanField(term4676, term4676.getClass(), "_intern", true);
        setBooleanField(term4676, term4676.getClass(), "_failOnDoS", true);
        setField(term4676, term4676.getClass(), "_hashArea", null);
        setIntField(term4676, term4676.getClass(), "_hashSize", 0);
        setIntField(term4676, term4676.getClass(), "_secondaryStart", 0);
        setIntField(term4676, term4676.getClass(), "_tertiaryStart", 0);
        setIntField(term4676, term4676.getClass(), "_tertiaryShift", 0);
        setIntField(term4676, term4676.getClass(), "_count", 0);
        setField(term4676, term4676.getClass(), "_names", null);
        setIntField(term4676, term4676.getClass(), "_spilloverEnd", 0);
        setIntField(term4676, term4676.getClass(), "_longNameOffset", 0);
        setBooleanField(term4676, term4676.getClass(), "_needRehash", false);
        setBooleanField(term4676, term4676.getClass(), "_hashShared", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15;
        Object retValue = callMethod(klass, "createRoot", argTypes, null, args);
        assertTrue(recursiveEquals(term15, 391863371));
        assertTrue(recursiveEquals(retValue, term4676));
    }

};


