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

public class PeepholeOptimizationsPass_traverse_11243165840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5899;
     Object term5969;
     Object term44252;
     Object term44254;

    public PeepholeOptimizationsPass_traverse_11243165840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5899 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term5699 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term5899, term5899.getClass(), "peepholeOptimizations", term5699);
        term5969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5969, term5969.getClass(), "type", 0);
        setIntField(term6039, term6039.getClass(), "type", 0);
        setIntField(term6109, term6109.getClass(), "type", 0);
        setField(term6109, term6109.getClass(), "first", null);
        setField(term6109, term6109.getClass(), "parent", null);
        setField(term6109, term6109.getClass(), "next", null);
        setField(term6039, term6039.getClass(), "first", term6109);
        setField(term6039, term6039.getClass(), "parent", term6109);
        setField(term5969, term5969.getClass(), "first", term6039);
        term44252 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term44253 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term44252, term44252.getClass(), "compiler", null);
        setField(term44252, term44252.getClass(), "peepholeOptimizations", term44253);
        setField(term44252, term44252.getClass(), "traversalState", null);
        term44254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44254, term44254.getClass(), "type", 0);
        setField(term44254, term44254.getClass(), "next", null);
        setIntField(term44255, term44255.getClass(), "type", 0);
        setField(term44255, term44255.getClass(), "next", null);
        setIntField(term44256, term44256.getClass(), "type", 0);
        setField(term44256, term44256.getClass(), "next", null);
        setField(term44256, term44256.getClass(), "first", null);
        setField(term44256, term44256.getClass(), "last", null);
        setField(term44256, term44256.getClass(), "propListHead", null);
        setIntField(term44256, term44256.getClass(), "sourcePosition", 0);
        setField(term44256, term44256.getClass(), "jsType", null);
        setField(term44256, term44256.getClass(), "parent", null);
        setField(term44255, term44255.getClass(), "first", term44256);
        setField(term44255, term44255.getClass(), "last", null);
        setField(term44255, term44255.getClass(), "propListHead", null);
        setIntField(term44255, term44255.getClass(), "sourcePosition", 0);
        setField(term44255, term44255.getClass(), "jsType", null);
        setField(term44255, term44255.getClass(), "parent", term44256);
        setField(term44254, term44254.getClass(), "first", term44255);
        setField(term44254, term44254.getClass(), "last", null);
        setField(term44254, term44254.getClass(), "propListHead", null);
        setIntField(term44254, term44254.getClass(), "sourcePosition", 0);
        setField(term44254, term44254.getClass(), "jsType", null);
        setField(term44254, term44254.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5969;
        callMethod(klass, "traverse", argTypes, term5899, args);
        assertTrue(recursiveEquals(term5899, term44252));
        assertTrue(recursiveEquals(term5969, term44254));
    }

};


