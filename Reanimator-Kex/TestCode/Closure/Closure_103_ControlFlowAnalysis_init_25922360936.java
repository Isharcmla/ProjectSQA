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
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.HashMap;

public class ControlFlowAnalysis_init_25922360936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3227;

    public ControlFlowAnalysis_init_25922360936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        ArrayDeque term3229 = new ArrayDeque();
        HashMap term3232 = new HashMap();
        term3227 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term3228 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis$1"));
        Object term3231 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term3227, term3227.getClass(), "compiler", null);
        setField(term3227, term3227.getClass(), "cfg", null);
        setField(term3227, term3227.getClass(), "astPosition", null);
        setField(term3227, term3227.getClass(), "nodePriorities", null);
        setField(term3228, term3228.getClass(), "this$0", term3227);
        setField(term3227, term3227.getClass(), "priorityComparator", term3228);
        setIntField(term3227, term3227.getClass(), "astPositionCounter", 0);
        setIntField(term3227, term3227.getClass(), "priorityCounter", 0);
        setBooleanField(term3227, term3227.getClass(), "shouldTraverseFunctions", false);
        setField(term3227, term3227.getClass(), "root", null);
        setField(term3227, term3227.getClass(), "exceptionHandler", term3229);
        setIntField(term3231, term3231.getClass(), "expectedValuesPerKey", 8);
        setField(term3231, term3231.getClass(), "map", term3232);
        setIntField(term3231, term3231.getClass(), "totalSize", 0);
        setField(term3231, term3231.getClass(), "keySet", null);
        setField(term3231, term3231.getClass(), "multiset", null);
        setField(term3231, term3231.getClass(), "valuesCollection", null);
        setField(term3231, term3231.getClass(), "entries", null);
        setField(term3231, term3231.getClass(), "asMap", null);
        setField(term3227, term3227.getClass(), "finallyMap", term3231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3227));
        assertTrue(recursiveEquals(term1, false));
    }

};


