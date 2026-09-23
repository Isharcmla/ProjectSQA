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
import java.util.ArrayDeque;
import java.util.HashMap;

public class ControlFlowAnalysis_init_25922360974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24836;

    public ControlFlowAnalysis_init_25922360974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term24612 = new ArrayDeque();
        Object term24452 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term24558 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties$1"));
        setField(term24452, term24452.getClass(), "priorityComparator", term24558);
        setField(term24452, term24452.getClass(), "exceptionHandler", term24612);
        ArrayDeque term24838 = new ArrayDeque();
        HashMap term24841 = new HashMap();
        term24836 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term24837 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis$1"));
        Object term24840 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setField(term24836, term24836.getClass(), "compiler", null);
        setField(term24836, term24836.getClass(), "cfg", null);
        setField(term24836, term24836.getClass(), "astPosition", null);
        setField(term24836, term24836.getClass(), "nodePriorities", null);
        setField(term24837, term24837.getClass(), "this$0", term24836);
        setField(term24836, term24836.getClass(), "priorityComparator", term24837);
        setIntField(term24836, term24836.getClass(), "astPositionCounter", 0);
        setIntField(term24836, term24836.getClass(), "priorityCounter", 0);
        setBooleanField(term24836, term24836.getClass(), "shouldTraverseFunctions", false);
        setField(term24836, term24836.getClass(), "root", null);
        setField(term24836, term24836.getClass(), "exceptionHandler", term24838);
        setIntField(term24840, term24840.getClass(), "expectedValuesPerKey", 8);
        setField(term24840, term24840.getClass(), "map", term24841);
        setIntField(term24840, term24840.getClass(), "totalSize", 0);
        setField(term24840, term24840.getClass(), "keySet", null);
        setField(term24840, term24840.getClass(), "multiset", null);
        setField(term24840, term24840.getClass(), "valuesCollection", null);
        setField(term24840, term24840.getClass(), "entries", null);
        setField(term24840, term24840.getClass(), "asMap", null);
        setField(term24836, term24836.getClass(), "finallyMap", term24840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24836));
    }

};


