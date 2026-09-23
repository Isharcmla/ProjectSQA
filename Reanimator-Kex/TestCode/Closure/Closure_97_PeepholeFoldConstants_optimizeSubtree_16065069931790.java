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

public class PeepholeFoldConstants_optimizeSubtree_16065069931790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697809;
     Object term697901;
     Object term698301;
     Object term698302;
     Object term698213;

    public PeepholeFoldConstants_optimizeSubtree_16065069931790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697809 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term697901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term697993 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698079 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term697901, term697901.getClass(), "type", 35);
        setField(term697993, term697993.getClass(), "next", term698079);
        setIntField(term697993, term697993.getClass(), "type", 63);
        setField(term697901, term697901.getClass(), "first", term697993);
        term698301 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term698301, term698301.getClass(), "currentTraversal", null);
        term698302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698303 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698304 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term698302, term698302.getClass(), "str", null);
        setIntField(term698302, term698302.getClass(), "type", 35);
        setField(term698302, term698302.getClass(), "next", null);
        setField(term698303, term698303.getClass(), "str", null);
        setIntField(term698303, term698303.getClass(), "type", 63);
        setField(term698304, term698304.getClass(), "functionName", null);
        setBooleanField(term698304, term698304.getClass(), "itsNeedsActivation", false);
        setIntField(term698304, term698304.getClass(), "itsFunctionType", 0);
        setBooleanField(term698304, term698304.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term698304, term698304.getClass(), "encodedSourceStart", 0);
        setIntField(term698304, term698304.getClass(), "encodedSourceEnd", 0);
        setField(term698304, term698304.getClass(), "sourceName", null);
        setIntField(term698304, term698304.getClass(), "baseLineno", 0);
        setIntField(term698304, term698304.getClass(), "endLineno", 0);
        setField(term698304, term698304.getClass(), "functions", null);
        setField(term698304, term698304.getClass(), "regexps", null);
        setField(term698304, term698304.getClass(), "itsVariables", null);
        setField(term698304, term698304.getClass(), "itsConst", null);
        setField(term698304, term698304.getClass(), "itsVariableNames", null);
        setIntField(term698304, term698304.getClass(), "varStart", 0);
        setField(term698304, term698304.getClass(), "compilerData", null);
        setIntField(term698304, term698304.getClass(), "type", 0);
        setField(term698304, term698304.getClass(), "next", null);
        setField(term698304, term698304.getClass(), "first", null);
        setField(term698304, term698304.getClass(), "last", null);
        setField(term698304, term698304.getClass(), "propListHead", null);
        setIntField(term698304, term698304.getClass(), "sourcePosition", 0);
        setField(term698304, term698304.getClass(), "jsType", null);
        setField(term698304, term698304.getClass(), "parent", null);
        setField(term698303, term698303.getClass(), "next", term698304);
        setField(term698303, term698303.getClass(), "first", null);
        setField(term698303, term698303.getClass(), "last", null);
        setField(term698303, term698303.getClass(), "propListHead", null);
        setIntField(term698303, term698303.getClass(), "sourcePosition", 0);
        setField(term698303, term698303.getClass(), "jsType", null);
        setField(term698303, term698303.getClass(), "parent", null);
        setField(term698302, term698302.getClass(), "first", term698303);
        setField(term698302, term698302.getClass(), "last", null);
        setField(term698302, term698302.getClass(), "propListHead", null);
        setIntField(term698302, term698302.getClass(), "sourcePosition", 0);
        setField(term698302, term698302.getClass(), "jsType", null);
        setField(term698302, term698302.getClass(), "parent", null);
        term698213 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698215 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term698217 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term698213, term698213.getClass(), "str", null);
        setIntField(term698213, term698213.getClass(), "type", 35);
        setField(term698213, term698213.getClass(), "next", null);
        setField(term698215, term698215.getClass(), "str", null);
        setIntField(term698215, term698215.getClass(), "type", 63);
        setField(term698217, term698217.getClass(), "functionName", null);
        setBooleanField(term698217, term698217.getClass(), "itsNeedsActivation", false);
        setIntField(term698217, term698217.getClass(), "itsFunctionType", 0);
        setBooleanField(term698217, term698217.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term698217, term698217.getClass(), "encodedSourceStart", 0);
        setIntField(term698217, term698217.getClass(), "encodedSourceEnd", 0);
        setField(term698217, term698217.getClass(), "sourceName", null);
        setIntField(term698217, term698217.getClass(), "baseLineno", 0);
        setIntField(term698217, term698217.getClass(), "endLineno", 0);
        setField(term698217, term698217.getClass(), "functions", null);
        setField(term698217, term698217.getClass(), "regexps", null);
        setField(term698217, term698217.getClass(), "itsVariables", null);
        setField(term698217, term698217.getClass(), "itsConst", null);
        setField(term698217, term698217.getClass(), "itsVariableNames", null);
        setIntField(term698217, term698217.getClass(), "varStart", 0);
        setField(term698217, term698217.getClass(), "compilerData", null);
        setIntField(term698217, term698217.getClass(), "type", 0);
        setField(term698217, term698217.getClass(), "next", null);
        setField(term698217, term698217.getClass(), "first", null);
        setField(term698217, term698217.getClass(), "last", null);
        setField(term698217, term698217.getClass(), "propListHead", null);
        setIntField(term698217, term698217.getClass(), "sourcePosition", 0);
        setField(term698217, term698217.getClass(), "jsType", null);
        setField(term698217, term698217.getClass(), "parent", null);
        setField(term698215, term698215.getClass(), "next", term698217);
        setField(term698215, term698215.getClass(), "first", null);
        setField(term698215, term698215.getClass(), "last", null);
        setField(term698215, term698215.getClass(), "propListHead", null);
        setIntField(term698215, term698215.getClass(), "sourcePosition", 0);
        setField(term698215, term698215.getClass(), "jsType", null);
        setField(term698215, term698215.getClass(), "parent", null);
        setField(term698213, term698213.getClass(), "first", term698215);
        setField(term698213, term698213.getClass(), "last", null);
        setField(term698213, term698213.getClass(), "propListHead", null);
        setIntField(term698213, term698213.getClass(), "sourcePosition", 0);
        setField(term698213, term698213.getClass(), "jsType", null);
        setField(term698213, term698213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term697901;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term697809, args);
        assertTrue(recursiveEquals(term697809, term698301));
        assertTrue(recursiveEquals(term697901, term698302));
        assertTrue(recursiveEquals(retValue, term698213));
    }

};


