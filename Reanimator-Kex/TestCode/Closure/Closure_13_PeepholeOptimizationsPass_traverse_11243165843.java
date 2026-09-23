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

public class PeepholeOptimizationsPass_traverse_11243165843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6862;
     Object term6932;
     Object term44573;
     Object term44575;

    public PeepholeOptimizationsPass_traverse_11243165843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6862 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term6636 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term6862, term6862.getClass(), "peepholeOptimizations", term6636);
        term6932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6932, term6932.getClass(), "type", 0);
        setIntField(term7002, term7002.getClass(), "type", 0);
        setIntField(term7072, term7072.getClass(), "type", 0);
        setField(term7072, term7072.getClass(), "first", null);
        setField(term7072, term7072.getClass(), "parent", null);
        setField(term7072, term7072.getClass(), "next", null);
        setField(term7002, term7002.getClass(), "first", term7072);
        setField(term7002, term7002.getClass(), "parent", null);
        setField(term7002, term7002.getClass(), "next", null);
        setField(term6932, term6932.getClass(), "first", term7002);
        setField(term6932, term6932.getClass(), "parent", term7072);
        term44573 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term44574 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term44573, term44573.getClass(), "compiler", null);
        setField(term44573, term44573.getClass(), "peepholeOptimizations", term44574);
        setField(term44573, term44573.getClass(), "traversalState", null);
        term44575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44575, term44575.getClass(), "type", 0);
        setField(term44575, term44575.getClass(), "next", null);
        setIntField(term44576, term44576.getClass(), "type", 0);
        setField(term44576, term44576.getClass(), "next", null);
        setIntField(term44577, term44577.getClass(), "type", 0);
        setField(term44577, term44577.getClass(), "next", null);
        setField(term44577, term44577.getClass(), "first", null);
        setField(term44577, term44577.getClass(), "last", null);
        setField(term44577, term44577.getClass(), "propListHead", null);
        setIntField(term44577, term44577.getClass(), "sourcePosition", 0);
        setField(term44577, term44577.getClass(), "jsType", null);
        setField(term44577, term44577.getClass(), "parent", null);
        setField(term44576, term44576.getClass(), "first", term44577);
        setField(term44576, term44576.getClass(), "last", null);
        setField(term44576, term44576.getClass(), "propListHead", null);
        setIntField(term44576, term44576.getClass(), "sourcePosition", 0);
        setField(term44576, term44576.getClass(), "jsType", null);
        setField(term44576, term44576.getClass(), "parent", null);
        setField(term44575, term44575.getClass(), "first", term44576);
        setField(term44575, term44575.getClass(), "last", null);
        setField(term44575, term44575.getClass(), "propListHead", null);
        setIntField(term44575, term44575.getClass(), "sourcePosition", 0);
        setField(term44575, term44575.getClass(), "jsType", null);
        setField(term44575, term44575.getClass(), "parent", term44577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6932;
        callMethod(klass, "traverse", argTypes, term6862, args);
        assertTrue(recursiveEquals(term6862, term44573));
        assertTrue(recursiveEquals(term6932, term44575));
    }

};


