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
import java.lang.Object;
import java.util.HashMap;

public class MaybeReachingVariableUse_createInitialEstimateLattice_114951785423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22870;
     Object term22916;
     Object term22906;

    public MaybeReachingVariableUse_createInitialEstimateLattice_114951785423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22870 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term22916 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        setField(term22916, term22916.getClass(), "jsScope", null);
        setField(term22916, term22916.getClass(), "escaped", null);
        setField(term22916, term22916.getClass(), "cfg", null);
        setField(term22916, term22916.getClass(), "joinOp", null);
        setField(term22916, term22916.getClass(), "orderedWorkSet", null);
        HashMap term22909 = new HashMap();
        term22906 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term22907 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term22907, term22907.getClass(), "expectedValuesPerKey", 8);
        setField(term22907, term22907.getClass(), "map", term22909);
        setIntField(term22907, term22907.getClass(), "totalSize", 0);
        setField(term22907, term22907.getClass(), "keySet", null);
        setField(term22907, term22907.getClass(), "multiset", null);
        setField(term22907, term22907.getClass(), "valuesCollection", null);
        setField(term22907, term22907.getClass(), "entries", null);
        setField(term22907, term22907.getClass(), "asMap", null);
        setField(term22906, term22906.getClass(), "mayUseMap", term22907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createInitialEstimateLattice", argTypes, term22870, args);
        assertTrue(recursiveEquals(term22870, term22916));
        assertTrue(recursiveEquals(retValue, term22906));
    }

};


