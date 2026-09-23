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

public class PeepholeOptimizationsPass_traverse_11243165826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2302;
     Object term2372;
     Object term4727;
     Object term4729;

    public PeepholeOptimizationsPass_traverse_11243165826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2302 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term2134 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term2302, term2302.getClass(), "peepholeOptimizations", term2134);
        term2372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2372, term2372.getClass(), "type", 0);
        setIntField(term2442, term2442.getClass(), "type", 0);
        setIntField(term2512, term2512.getClass(), "type", 0);
        setField(term2512, term2512.getClass(), "first", null);
        setField(term2442, term2442.getClass(), "first", term2512);
        setField(term2372, term2372.getClass(), "first", term2442);
        term4727 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term4728 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term4727, term4727.getClass(), "compiler", null);
        setField(term4727, term4727.getClass(), "peepholeOptimizations", term4728);
        setField(term4727, term4727.getClass(), "traversalState", null);
        term4729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4729, term4729.getClass(), "type", 0);
        setField(term4729, term4729.getClass(), "next", null);
        setIntField(term4730, term4730.getClass(), "type", 0);
        setField(term4730, term4730.getClass(), "next", null);
        setIntField(term4731, term4731.getClass(), "type", 0);
        setField(term4731, term4731.getClass(), "next", null);
        setField(term4731, term4731.getClass(), "first", null);
        setField(term4731, term4731.getClass(), "last", null);
        setField(term4731, term4731.getClass(), "propListHead", null);
        setIntField(term4731, term4731.getClass(), "sourcePosition", 0);
        setField(term4731, term4731.getClass(), "jsType", null);
        setField(term4731, term4731.getClass(), "parent", null);
        setField(term4730, term4730.getClass(), "first", term4731);
        setField(term4730, term4730.getClass(), "last", null);
        setField(term4730, term4730.getClass(), "propListHead", null);
        setIntField(term4730, term4730.getClass(), "sourcePosition", 0);
        setField(term4730, term4730.getClass(), "jsType", null);
        setField(term4730, term4730.getClass(), "parent", null);
        setField(term4729, term4729.getClass(), "first", term4730);
        setField(term4729, term4729.getClass(), "last", null);
        setField(term4729, term4729.getClass(), "propListHead", null);
        setIntField(term4729, term4729.getClass(), "sourcePosition", 0);
        setField(term4729, term4729.getClass(), "jsType", null);
        setField(term4729, term4729.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2372;
        callMethod(klass, "traverse", argTypes, term2302, args);
        assertTrue(recursiveEquals(term2302, term4727));
        assertTrue(recursiveEquals(term2372, term4729));
    }

};


