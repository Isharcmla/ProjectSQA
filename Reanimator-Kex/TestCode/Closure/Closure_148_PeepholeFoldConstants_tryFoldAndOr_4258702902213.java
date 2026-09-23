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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605829;
     Object term605915;
     Object term606099;
     Object term606191;
     Object term606804;
     Object term606805;
     Object term606807;
     Object term606808;
     Object term606728;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605829 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term605915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term606007 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term606007, term606007.getClass(), "type", 108);
        setField(term605915, term605915.getClass(), "parent", term606007);
        setIntField(term605915, term605915.getClass(), "type", 0);
        term606099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term606099, term606099.getClass(), "type", 0);
        term606191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term606191, term606191.getClass(), "type", 63);
        term606804 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term606804, term606804.getClass(), "currentTraversal", null);
        term606805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term606806 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term606805, term606805.getClass(), "functionName", null);
        setBooleanField(term606805, term606805.getClass(), "itsNeedsActivation", false);
        setIntField(term606805, term606805.getClass(), "itsFunctionType", 0);
        setBooleanField(term606805, term606805.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term606805, term606805.getClass(), "encodedSourceStart", 0);
        setIntField(term606805, term606805.getClass(), "encodedSourceEnd", 0);
        setField(term606805, term606805.getClass(), "sourceName", null);
        setIntField(term606805, term606805.getClass(), "baseLineno", 0);
        setIntField(term606805, term606805.getClass(), "endLineno", 0);
        setField(term606805, term606805.getClass(), "functions", null);
        setField(term606805, term606805.getClass(), "regexps", null);
        setField(term606805, term606805.getClass(), "itsVariables", null);
        setField(term606805, term606805.getClass(), "itsConst", null);
        setField(term606805, term606805.getClass(), "itsVariableNames", null);
        setIntField(term606805, term606805.getClass(), "varStart", 0);
        setField(term606805, term606805.getClass(), "compilerData", null);
        setIntField(term606805, term606805.getClass(), "type", 0);
        setField(term606805, term606805.getClass(), "next", null);
        setField(term606805, term606805.getClass(), "first", null);
        setField(term606805, term606805.getClass(), "last", null);
        setField(term606805, term606805.getClass(), "propListHead", null);
        setIntField(term606805, term606805.getClass(), "sourcePosition", 0);
        setField(term606805, term606805.getClass(), "jsType", null);
        setField(term606806, term606806.getClass(), "str", null);
        setIntField(term606806, term606806.getClass(), "type", 108);
        setField(term606806, term606806.getClass(), "next", null);
        setField(term606806, term606806.getClass(), "first", null);
        setField(term606806, term606806.getClass(), "last", null);
        setField(term606806, term606806.getClass(), "propListHead", null);
        setIntField(term606806, term606806.getClass(), "sourcePosition", 0);
        setField(term606806, term606806.getClass(), "jsType", null);
        setField(term606806, term606806.getClass(), "parent", null);
        setField(term606805, term606805.getClass(), "parent", term606806);
        term606807 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term606807, term606807.getClass(), "str", null);
        setIntField(term606807, term606807.getClass(), "type", 0);
        setField(term606807, term606807.getClass(), "next", null);
        setField(term606807, term606807.getClass(), "first", null);
        setField(term606807, term606807.getClass(), "last", null);
        setField(term606807, term606807.getClass(), "propListHead", null);
        setIntField(term606807, term606807.getClass(), "sourcePosition", 0);
        setField(term606807, term606807.getClass(), "jsType", null);
        setField(term606807, term606807.getClass(), "parent", null);
        term606808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term606808, term606808.getClass(), "number", 0.0);
        setIntField(term606808, term606808.getClass(), "type", 63);
        setField(term606808, term606808.getClass(), "next", null);
        setField(term606808, term606808.getClass(), "first", null);
        setField(term606808, term606808.getClass(), "last", null);
        setField(term606808, term606808.getClass(), "propListHead", null);
        setIntField(term606808, term606808.getClass(), "sourcePosition", 0);
        setField(term606808, term606808.getClass(), "jsType", null);
        setField(term606808, term606808.getClass(), "parent", null);
        term606728 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term606739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term606728, term606728.getClass(), "functionName", null);
        setBooleanField(term606728, term606728.getClass(), "itsNeedsActivation", false);
        setIntField(term606728, term606728.getClass(), "itsFunctionType", 0);
        setBooleanField(term606728, term606728.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term606728, term606728.getClass(), "encodedSourceStart", 0);
        setIntField(term606728, term606728.getClass(), "encodedSourceEnd", 0);
        setField(term606728, term606728.getClass(), "sourceName", null);
        setIntField(term606728, term606728.getClass(), "baseLineno", 0);
        setIntField(term606728, term606728.getClass(), "endLineno", 0);
        setField(term606728, term606728.getClass(), "functions", null);
        setField(term606728, term606728.getClass(), "regexps", null);
        setField(term606728, term606728.getClass(), "itsVariables", null);
        setField(term606728, term606728.getClass(), "itsConst", null);
        setField(term606728, term606728.getClass(), "itsVariableNames", null);
        setIntField(term606728, term606728.getClass(), "varStart", 0);
        setField(term606728, term606728.getClass(), "compilerData", null);
        setIntField(term606728, term606728.getClass(), "type", 0);
        setField(term606728, term606728.getClass(), "next", null);
        setField(term606728, term606728.getClass(), "first", null);
        setField(term606728, term606728.getClass(), "last", null);
        setField(term606728, term606728.getClass(), "propListHead", null);
        setIntField(term606728, term606728.getClass(), "sourcePosition", 0);
        setField(term606728, term606728.getClass(), "jsType", null);
        setField(term606739, term606739.getClass(), "str", null);
        setIntField(term606739, term606739.getClass(), "type", 108);
        setField(term606739, term606739.getClass(), "next", null);
        setField(term606739, term606739.getClass(), "first", null);
        setField(term606739, term606739.getClass(), "last", null);
        setField(term606739, term606739.getClass(), "propListHead", null);
        setIntField(term606739, term606739.getClass(), "sourcePosition", 0);
        setField(term606739, term606739.getClass(), "jsType", null);
        setField(term606739, term606739.getClass(), "parent", null);
        setField(term606728, term606728.getClass(), "parent", term606739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term605915;
        args[1] = term606099;
        args[2] = term606191;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term605829, args);
        assertTrue(recursiveEquals(term605829, term606804));
        assertTrue(recursiveEquals(term605915, term606805));
        assertTrue(recursiveEquals(term606099, term606807));
        assertTrue(recursiveEquals(term606191, term606808));
        assertTrue(recursiveEquals(retValue, term606728));
    }

};


