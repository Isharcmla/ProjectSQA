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

public class PeepholeOptimizationsPass_traverse_11243165842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6418;
     Object term6488;
     Object term44415;
     Object term44417;

    public PeepholeOptimizationsPass_traverse_11243165842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6418 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term6244 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term6418, term6418.getClass(), "peepholeOptimizations", term6244);
        term6488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6488, term6488.getClass(), "type", 0);
        setIntField(term6558, term6558.getClass(), "type", 0);
        setIntField(term6628, term6628.getClass(), "type", 0);
        setField(term6628, term6628.getClass(), "first", null);
        setField(term6628, term6628.getClass(), "parent", term6628);
        setField(term6558, term6558.getClass(), "first", term6628);
        setField(term6488, term6488.getClass(), "first", term6558);
        term44415 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term44416 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term44415, term44415.getClass(), "compiler", null);
        setField(term44415, term44415.getClass(), "peepholeOptimizations", term44416);
        setField(term44415, term44415.getClass(), "traversalState", null);
        term44417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44417, term44417.getClass(), "type", 0);
        setField(term44417, term44417.getClass(), "next", null);
        setIntField(term44418, term44418.getClass(), "type", 0);
        setField(term44418, term44418.getClass(), "next", null);
        setIntField(term44419, term44419.getClass(), "type", 0);
        setField(term44419, term44419.getClass(), "next", null);
        setField(term44419, term44419.getClass(), "first", null);
        setField(term44419, term44419.getClass(), "last", null);
        setField(term44419, term44419.getClass(), "propListHead", null);
        setIntField(term44419, term44419.getClass(), "sourcePosition", 0);
        setField(term44419, term44419.getClass(), "jsType", null);
        setField(term44419, term44419.getClass(), "parent", term44419);
        setField(term44418, term44418.getClass(), "first", term44419);
        setField(term44418, term44418.getClass(), "last", null);
        setField(term44418, term44418.getClass(), "propListHead", null);
        setIntField(term44418, term44418.getClass(), "sourcePosition", 0);
        setField(term44418, term44418.getClass(), "jsType", null);
        setField(term44418, term44418.getClass(), "parent", null);
        setField(term44417, term44417.getClass(), "first", term44418);
        setField(term44417, term44417.getClass(), "last", null);
        setField(term44417, term44417.getClass(), "propListHead", null);
        setIntField(term44417, term44417.getClass(), "sourcePosition", 0);
        setField(term44417, term44417.getClass(), "jsType", null);
        setField(term44417, term44417.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6488;
        callMethod(klass, "traverse", argTypes, term6418, args);
        assertTrue(recursiveEquals(term6418, term44415));
        assertTrue(recursiveEquals(term6488, term44417));
    }

};


