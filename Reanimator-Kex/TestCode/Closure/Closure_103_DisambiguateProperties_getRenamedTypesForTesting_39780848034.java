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

public class DisambiguateProperties_getRenamedTypesForTesting_39780848034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3128;
     Object term198808;
     Object term198792;

    public DisambiguateProperties_getRenamedTypesForTesting_39780848034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3176 = new HashMap();
        term3128 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term3128, term3128.getClass(), "properties", term3176);
        HashMap term198809 = new HashMap();
        term198808 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setBooleanField(term198808, term198808.getClass(), "showInvalidationWarnings", false);
        setField(term198808, term198808.getClass(), "compiler", null);
        setField(term198808, term198808.getClass(), "typeSystem", null);
        setField(term198808, term198808.getClass(), "properties", term198809);
        HashMap term198794 = new HashMap();
        term198792 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term198792, term198792.getClass(), "expectedValuesPerKey", 8);
        setField(term198792, term198792.getClass(), "map", term198794);
        setIntField(term198792, term198792.getClass(), "totalSize", 0);
        setField(term198792, term198792.getClass(), "keySet", null);
        setField(term198792, term198792.getClass(), "multiset", null);
        setField(term198792, term198792.getClass(), "valuesCollection", null);
        setField(term198792, term198792.getClass(), "entries", null);
        setField(term198792, term198792.getClass(), "asMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRenamedTypesForTesting", argTypes, term3128, args);
        assertTrue(recursiveEquals(term3128, term198808));
        assertTrue(recursiveEquals(retValue, term198792));
    }

};


