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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term818445;
     Object term818531;
     Object term818715;
     Object term818807;
     Object term818893;
     Object term818894;
     Object term818896;
     Object term818897;
     Object term818817;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term818445 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term818531 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term818623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term818623, term818623.getClass(), "type", 108);
        setField(term818531, term818531.getClass(), "parent", term818623);
        setIntField(term818531, term818531.getClass(), "type", 0);
        term818715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term818715, term818715.getClass(), "type", 72);
        term818807 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term818807, term818807.getClass(), "type", 64);
        term818893 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term818893, term818893.getClass(), "currentTraversal", null);
        term818894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term818895 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term818894, term818894.getClass(), "functionName", null);
        setBooleanField(term818894, term818894.getClass(), "itsNeedsActivation", false);
        setIntField(term818894, term818894.getClass(), "itsFunctionType", 0);
        setBooleanField(term818894, term818894.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term818894, term818894.getClass(), "encodedSourceStart", 0);
        setIntField(term818894, term818894.getClass(), "encodedSourceEnd", 0);
        setField(term818894, term818894.getClass(), "sourceName", null);
        setIntField(term818894, term818894.getClass(), "baseLineno", 0);
        setIntField(term818894, term818894.getClass(), "endLineno", 0);
        setField(term818894, term818894.getClass(), "functions", null);
        setField(term818894, term818894.getClass(), "regexps", null);
        setField(term818894, term818894.getClass(), "itsVariables", null);
        setField(term818894, term818894.getClass(), "itsConst", null);
        setField(term818894, term818894.getClass(), "itsVariableNames", null);
        setIntField(term818894, term818894.getClass(), "varStart", 0);
        setField(term818894, term818894.getClass(), "compilerData", null);
        setIntField(term818894, term818894.getClass(), "type", 0);
        setField(term818894, term818894.getClass(), "next", null);
        setField(term818894, term818894.getClass(), "first", null);
        setField(term818894, term818894.getClass(), "last", null);
        setField(term818894, term818894.getClass(), "propListHead", null);
        setIntField(term818894, term818894.getClass(), "sourcePosition", 0);
        setField(term818894, term818894.getClass(), "jsType", null);
        setField(term818895, term818895.getClass(), "str", null);
        setIntField(term818895, term818895.getClass(), "type", 108);
        setField(term818895, term818895.getClass(), "next", null);
        setField(term818895, term818895.getClass(), "first", null);
        setField(term818895, term818895.getClass(), "last", null);
        setField(term818895, term818895.getClass(), "propListHead", null);
        setIntField(term818895, term818895.getClass(), "sourcePosition", 0);
        setField(term818895, term818895.getClass(), "jsType", null);
        setField(term818895, term818895.getClass(), "parent", null);
        setField(term818894, term818894.getClass(), "parent", term818895);
        term818896 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term818896, term818896.getClass(), "str", null);
        setIntField(term818896, term818896.getClass(), "type", 72);
        setField(term818896, term818896.getClass(), "next", null);
        setField(term818896, term818896.getClass(), "first", null);
        setField(term818896, term818896.getClass(), "last", null);
        setField(term818896, term818896.getClass(), "propListHead", null);
        setIntField(term818896, term818896.getClass(), "sourcePosition", 0);
        setField(term818896, term818896.getClass(), "jsType", null);
        setField(term818896, term818896.getClass(), "parent", null);
        term818897 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term818897, term818897.getClass(), "number", 0.0);
        setIntField(term818897, term818897.getClass(), "type", 64);
        setField(term818897, term818897.getClass(), "next", null);
        setField(term818897, term818897.getClass(), "first", null);
        setField(term818897, term818897.getClass(), "last", null);
        setField(term818897, term818897.getClass(), "propListHead", null);
        setIntField(term818897, term818897.getClass(), "sourcePosition", 0);
        setField(term818897, term818897.getClass(), "jsType", null);
        setField(term818897, term818897.getClass(), "parent", null);
        term818817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term818828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term818817, term818817.getClass(), "functionName", null);
        setBooleanField(term818817, term818817.getClass(), "itsNeedsActivation", false);
        setIntField(term818817, term818817.getClass(), "itsFunctionType", 0);
        setBooleanField(term818817, term818817.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term818817, term818817.getClass(), "encodedSourceStart", 0);
        setIntField(term818817, term818817.getClass(), "encodedSourceEnd", 0);
        setField(term818817, term818817.getClass(), "sourceName", null);
        setIntField(term818817, term818817.getClass(), "baseLineno", 0);
        setIntField(term818817, term818817.getClass(), "endLineno", 0);
        setField(term818817, term818817.getClass(), "functions", null);
        setField(term818817, term818817.getClass(), "regexps", null);
        setField(term818817, term818817.getClass(), "itsVariables", null);
        setField(term818817, term818817.getClass(), "itsConst", null);
        setField(term818817, term818817.getClass(), "itsVariableNames", null);
        setIntField(term818817, term818817.getClass(), "varStart", 0);
        setField(term818817, term818817.getClass(), "compilerData", null);
        setIntField(term818817, term818817.getClass(), "type", 0);
        setField(term818817, term818817.getClass(), "next", null);
        setField(term818817, term818817.getClass(), "first", null);
        setField(term818817, term818817.getClass(), "last", null);
        setField(term818817, term818817.getClass(), "propListHead", null);
        setIntField(term818817, term818817.getClass(), "sourcePosition", 0);
        setField(term818817, term818817.getClass(), "jsType", null);
        setField(term818828, term818828.getClass(), "str", null);
        setIntField(term818828, term818828.getClass(), "type", 108);
        setField(term818828, term818828.getClass(), "next", null);
        setField(term818828, term818828.getClass(), "first", null);
        setField(term818828, term818828.getClass(), "last", null);
        setField(term818828, term818828.getClass(), "propListHead", null);
        setIntField(term818828, term818828.getClass(), "sourcePosition", 0);
        setField(term818828, term818828.getClass(), "jsType", null);
        setField(term818828, term818828.getClass(), "parent", null);
        setField(term818817, term818817.getClass(), "parent", term818828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term818531;
        args[1] = term818715;
        args[2] = term818807;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term818445, args);
        assertTrue(recursiveEquals(term818445, term818893));
        assertTrue(recursiveEquals(term818531, term818894));
        assertTrue(recursiveEquals(term818715, term818896));
        assertTrue(recursiveEquals(term818807, term818897));
        assertTrue(recursiveEquals(retValue, term818817));
    }

};


