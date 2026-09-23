package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashMap;

public class DisambiguateProperties_getRenamedTypesForTesting_39780848027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6402;
     Object term6499;
     Object term6484;

    public DisambiguateProperties_getRenamedTypesForTesting_39780848027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6450 = new HashMap();
        term6402 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term6402, term6402.getClass(), "properties", term6450);
        HashMap term6500 = new HashMap();
        term6499 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term6499, term6499.getClass(), "compiler", null);
        setField(term6499, term6499.getClass(), "typeSystem", null);
        setField(term6499, term6499.getClass(), "invalidationMap", null);
        setField(term6499, term6499.getClass(), "propertiesToErrorFor", null);
        setField(term6499, term6499.getClass(), "properties", term6500);
        HashMap term6486 = new HashMap();
        term6484 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term6484, term6484.getClass(), "expectedValuesPerKey", 2);
        setField(term6484, term6484.getClass(), "map", term6486);
        setIntField(term6484, term6484.getClass(), "totalSize", 0);
        setField(term6484, term6484.getClass(), "entries", null);
        setField(term6484, term6484.getClass(), "keySet", null);
        setField(term6484, term6484.getClass(), "keys", null);
        setField(term6484, term6484.getClass(), "values", null);
        setField(term6484, term6484.getClass(), "asMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRenamedTypesForTesting", argTypes, term6402, args);
        assertTrue(recursiveEquals(term6402, term6499));
        assertTrue(recursiveEquals(retValue, term6484));
    }

};


