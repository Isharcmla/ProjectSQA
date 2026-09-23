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

public class ControlFlowAnalysis_init_57622793741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term3406;

    public ControlFlowAnalysis_init_57622793741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term3 = new Boolean(false);
        ArrayDeque term3408 = new ArrayDeque();
        HashMap term3411 = new HashMap();
        term3406 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term3407 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis$1"));
        Object term3410 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term3406, term3406.getClass(), "compiler", null);
        setField(term3406, term3406.getClass(), "cfg", null);
        setField(term3406, term3406.getClass(), "astPosition", null);
        setField(term3406, term3406.getClass(), "nodePriorities", null);
        setField(term3407, term3407.getClass(), "this$0", term3406);
        setField(term3406, term3406.getClass(), "priorityComparator", term3407);
        setIntField(term3406, term3406.getClass(), "astPositionCounter", 0);
        setIntField(term3406, term3406.getClass(), "priorityCounter", 0);
        setBooleanField(term3406, term3406.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term3406, term3406.getClass(), "edgeAnnotations", false);
        setField(term3406, term3406.getClass(), "root", null);
        setField(term3406, term3406.getClass(), "exceptionHandler", term3408);
        setIntField(term3410, term3410.getClass(), "expectedValuesPerKey", 8);
        setField(term3410, term3410.getClass(), "map", term3411);
        setIntField(term3410, term3410.getClass(), "totalSize", 0);
        setField(term3410, term3410.getClass(), "keySet", null);
        setField(term3410, term3410.getClass(), "multiset", null);
        setField(term3410, term3410.getClass(), "valuesCollection", null);
        setField(term3410, term3410.getClass(), "entries", null);
        setField(term3410, term3410.getClass(), "asMap", null);
        setField(term3406, term3406.getClass(), "finallyMap", term3410);
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
        args[1] = term1;
        args[2] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3406));
        assertTrue(recursiveEquals(term1, false));
        assertTrue(recursiveEquals(term3, false));
    }

};


