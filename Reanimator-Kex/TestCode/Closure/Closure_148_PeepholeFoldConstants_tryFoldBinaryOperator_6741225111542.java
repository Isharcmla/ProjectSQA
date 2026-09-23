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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386867;
     Object term386959;
     Object term388005;
     Object term388006;
     Object term387955;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term386959 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term387045 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term387137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term387045, term387045.getClass(), "next", term387137);
        setField(term386959, term386959.getClass(), "first", term387045);
        setIntField(term386959, term386959.getClass(), "type", 33);
        term388005 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term388005, term388005.getClass(), "currentTraversal", null);
        term388006 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term388007 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term388008 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term388006, term388006.getClass(), "str", null);
        setIntField(term388006, term388006.getClass(), "type", 33);
        setField(term388006, term388006.getClass(), "next", null);
        setField(term388007, term388007.getClass(), "functionName", null);
        setBooleanField(term388007, term388007.getClass(), "itsNeedsActivation", false);
        setIntField(term388007, term388007.getClass(), "itsFunctionType", 0);
        setBooleanField(term388007, term388007.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term388007, term388007.getClass(), "encodedSourceStart", 0);
        setIntField(term388007, term388007.getClass(), "encodedSourceEnd", 0);
        setField(term388007, term388007.getClass(), "sourceName", null);
        setIntField(term388007, term388007.getClass(), "baseLineno", 0);
        setIntField(term388007, term388007.getClass(), "endLineno", 0);
        setField(term388007, term388007.getClass(), "functions", null);
        setField(term388007, term388007.getClass(), "regexps", null);
        setField(term388007, term388007.getClass(), "itsVariables", null);
        setField(term388007, term388007.getClass(), "itsConst", null);
        setField(term388007, term388007.getClass(), "itsVariableNames", null);
        setIntField(term388007, term388007.getClass(), "varStart", 0);
        setField(term388007, term388007.getClass(), "compilerData", null);
        setIntField(term388007, term388007.getClass(), "type", 0);
        setDoubleField(term388008, term388008.getClass(), "number", 0.0);
        setIntField(term388008, term388008.getClass(), "type", 0);
        setField(term388008, term388008.getClass(), "next", null);
        setField(term388008, term388008.getClass(), "first", null);
        setField(term388008, term388008.getClass(), "last", null);
        setField(term388008, term388008.getClass(), "propListHead", null);
        setIntField(term388008, term388008.getClass(), "sourcePosition", 0);
        setField(term388008, term388008.getClass(), "jsType", null);
        setField(term388008, term388008.getClass(), "parent", null);
        setField(term388007, term388007.getClass(), "next", term388008);
        setField(term388007, term388007.getClass(), "first", null);
        setField(term388007, term388007.getClass(), "last", null);
        setField(term388007, term388007.getClass(), "propListHead", null);
        setIntField(term388007, term388007.getClass(), "sourcePosition", 0);
        setField(term388007, term388007.getClass(), "jsType", null);
        setField(term388007, term388007.getClass(), "parent", null);
        setField(term388006, term388006.getClass(), "first", term388007);
        setField(term388006, term388006.getClass(), "last", null);
        setField(term388006, term388006.getClass(), "propListHead", null);
        setIntField(term388006, term388006.getClass(), "sourcePosition", 0);
        setField(term388006, term388006.getClass(), "jsType", null);
        setField(term388006, term388006.getClass(), "parent", null);
        term387955 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term387957 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term387967 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term387955, term387955.getClass(), "str", null);
        setIntField(term387955, term387955.getClass(), "type", 33);
        setField(term387955, term387955.getClass(), "next", null);
        setField(term387957, term387957.getClass(), "functionName", null);
        setBooleanField(term387957, term387957.getClass(), "itsNeedsActivation", false);
        setIntField(term387957, term387957.getClass(), "itsFunctionType", 0);
        setBooleanField(term387957, term387957.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term387957, term387957.getClass(), "encodedSourceStart", 0);
        setIntField(term387957, term387957.getClass(), "encodedSourceEnd", 0);
        setField(term387957, term387957.getClass(), "sourceName", null);
        setIntField(term387957, term387957.getClass(), "baseLineno", 0);
        setIntField(term387957, term387957.getClass(), "endLineno", 0);
        setField(term387957, term387957.getClass(), "functions", null);
        setField(term387957, term387957.getClass(), "regexps", null);
        setField(term387957, term387957.getClass(), "itsVariables", null);
        setField(term387957, term387957.getClass(), "itsConst", null);
        setField(term387957, term387957.getClass(), "itsVariableNames", null);
        setIntField(term387957, term387957.getClass(), "varStart", 0);
        setField(term387957, term387957.getClass(), "compilerData", null);
        setIntField(term387957, term387957.getClass(), "type", 0);
        setDoubleField(term387967, term387967.getClass(), "number", 0.0);
        setIntField(term387967, term387967.getClass(), "type", 0);
        setField(term387967, term387967.getClass(), "next", null);
        setField(term387967, term387967.getClass(), "first", null);
        setField(term387967, term387967.getClass(), "last", null);
        setField(term387967, term387967.getClass(), "propListHead", null);
        setIntField(term387967, term387967.getClass(), "sourcePosition", 0);
        setField(term387967, term387967.getClass(), "jsType", null);
        setField(term387967, term387967.getClass(), "parent", null);
        setField(term387957, term387957.getClass(), "next", term387967);
        setField(term387957, term387957.getClass(), "first", null);
        setField(term387957, term387957.getClass(), "last", null);
        setField(term387957, term387957.getClass(), "propListHead", null);
        setIntField(term387957, term387957.getClass(), "sourcePosition", 0);
        setField(term387957, term387957.getClass(), "jsType", null);
        setField(term387957, term387957.getClass(), "parent", null);
        setField(term387955, term387955.getClass(), "first", term387957);
        setField(term387955, term387955.getClass(), "last", null);
        setField(term387955, term387955.getClass(), "propListHead", null);
        setIntField(term387955, term387955.getClass(), "sourcePosition", 0);
        setField(term387955, term387955.getClass(), "jsType", null);
        setField(term387955, term387955.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term386959;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term386867, args);
        assertTrue(recursiveEquals(term386867, term388005));
        assertTrue(recursiveEquals(term386959, term388006));
        assertTrue(recursiveEquals(retValue, term387955));
    }

};


