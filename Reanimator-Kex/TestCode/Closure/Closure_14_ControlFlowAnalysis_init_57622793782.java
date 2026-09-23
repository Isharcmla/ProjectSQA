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
import java.lang.String;
import java.util.ArrayDeque;
import java.util.HashMap;

public class ControlFlowAnalysis_init_57622793782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36423;

    public ControlFlowAnalysis_init_57622793782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36430 = Class.forName((String) "com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator");
        Field term36429 = ((Class) term36430).getDeclaredField((String) "INSTANCE");
        ((Field) term36429).setAccessible(true);
        Object enum4 = ((Field) term36429).get((Object) null);
        ArrayDeque term35696 = new ArrayDeque();
        Object term35454 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        setField(term35454, term35454.getClass(), "priorityComparator", enum4);
        setField(term35454, term35454.getClass(), "exceptionHandler", term35696);
        ArrayDeque term36425 = new ArrayDeque();
        HashMap term36428 = new HashMap();
        term36423 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term36424 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis$1"));
        Object term36427 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term36423, term36423.getClass(), "compiler", null);
        setField(term36423, term36423.getClass(), "cfg", null);
        setField(term36423, term36423.getClass(), "astPosition", null);
        setField(term36423, term36423.getClass(), "nodePriorities", null);
        setField(term36424, term36424.getClass(), "this$0", term36423);
        setField(term36423, term36423.getClass(), "priorityComparator", term36424);
        setIntField(term36423, term36423.getClass(), "astPositionCounter", 0);
        setIntField(term36423, term36423.getClass(), "priorityCounter", 0);
        setBooleanField(term36423, term36423.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term36423, term36423.getClass(), "edgeAnnotations", false);
        setField(term36423, term36423.getClass(), "root", null);
        setField(term36423, term36423.getClass(), "exceptionHandler", term36425);
        setIntField(term36427, term36427.getClass(), "expectedValuesPerKey", 8);
        setField(term36427, term36427.getClass(), "map", term36428);
        setIntField(term36427, term36427.getClass(), "totalSize", 0);
        setField(term36427, term36427.getClass(), "keySet", null);
        setField(term36427, term36427.getClass(), "multiset", null);
        setField(term36427, term36427.getClass(), "valuesCollection", null);
        setField(term36427, term36427.getClass(), "entries", null);
        setField(term36427, term36427.getClass(), "asMap", null);
        setField(term36423, term36423.getClass(), "finallyMap", term36427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = false;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36423));
    }

};


