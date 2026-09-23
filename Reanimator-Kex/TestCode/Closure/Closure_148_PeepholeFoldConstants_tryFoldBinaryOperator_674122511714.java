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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158756;
     Object term158842;
     Object term159370;
     Object term159371;
     Object term159309;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158756 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term158842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term158928 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term159020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term158928, term158928.getClass(), "next", term159020);
        setIntField(term158928, term158928.getClass(), "type", 39);
        setField(term158842, term158842.getClass(), "first", term158928);
        setIntField(term158842, term158842.getClass(), "type", 20);
        term159370 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term159370, term159370.getClass(), "currentTraversal", null);
        term159371 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term159372 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term159373 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term159371, term159371.getClass(), "functionName", null);
        setBooleanField(term159371, term159371.getClass(), "itsNeedsActivation", false);
        setIntField(term159371, term159371.getClass(), "itsFunctionType", 0);
        setBooleanField(term159371, term159371.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term159371, term159371.getClass(), "encodedSourceStart", 0);
        setIntField(term159371, term159371.getClass(), "encodedSourceEnd", 0);
        setField(term159371, term159371.getClass(), "sourceName", null);
        setIntField(term159371, term159371.getClass(), "baseLineno", 0);
        setIntField(term159371, term159371.getClass(), "endLineno", 0);
        setField(term159371, term159371.getClass(), "functions", null);
        setField(term159371, term159371.getClass(), "regexps", null);
        setField(term159371, term159371.getClass(), "itsVariables", null);
        setField(term159371, term159371.getClass(), "itsConst", null);
        setField(term159371, term159371.getClass(), "itsVariableNames", null);
        setIntField(term159371, term159371.getClass(), "varStart", 0);
        setField(term159371, term159371.getClass(), "compilerData", null);
        setIntField(term159371, term159371.getClass(), "type", 20);
        setField(term159371, term159371.getClass(), "next", null);
        setField(term159372, term159372.getClass(), "functionName", null);
        setBooleanField(term159372, term159372.getClass(), "itsNeedsActivation", false);
        setIntField(term159372, term159372.getClass(), "itsFunctionType", 0);
        setBooleanField(term159372, term159372.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term159372, term159372.getClass(), "encodedSourceStart", 0);
        setIntField(term159372, term159372.getClass(), "encodedSourceEnd", 0);
        setField(term159372, term159372.getClass(), "sourceName", null);
        setIntField(term159372, term159372.getClass(), "baseLineno", 0);
        setIntField(term159372, term159372.getClass(), "endLineno", 0);
        setField(term159372, term159372.getClass(), "functions", null);
        setField(term159372, term159372.getClass(), "regexps", null);
        setField(term159372, term159372.getClass(), "itsVariables", null);
        setField(term159372, term159372.getClass(), "itsConst", null);
        setField(term159372, term159372.getClass(), "itsVariableNames", null);
        setIntField(term159372, term159372.getClass(), "varStart", 0);
        setField(term159372, term159372.getClass(), "compilerData", null);
        setIntField(term159372, term159372.getClass(), "type", 39);
        setField(term159373, term159373.getClass(), "str", null);
        setIntField(term159373, term159373.getClass(), "type", 0);
        setField(term159373, term159373.getClass(), "next", null);
        setField(term159373, term159373.getClass(), "first", null);
        setField(term159373, term159373.getClass(), "last", null);
        setField(term159373, term159373.getClass(), "propListHead", null);
        setIntField(term159373, term159373.getClass(), "sourcePosition", 0);
        setField(term159373, term159373.getClass(), "jsType", null);
        setField(term159373, term159373.getClass(), "parent", null);
        setField(term159372, term159372.getClass(), "next", term159373);
        setField(term159372, term159372.getClass(), "first", null);
        setField(term159372, term159372.getClass(), "last", null);
        setField(term159372, term159372.getClass(), "propListHead", null);
        setIntField(term159372, term159372.getClass(), "sourcePosition", 0);
        setField(term159372, term159372.getClass(), "jsType", null);
        setField(term159372, term159372.getClass(), "parent", null);
        setField(term159371, term159371.getClass(), "first", term159372);
        setField(term159371, term159371.getClass(), "last", null);
        setField(term159371, term159371.getClass(), "propListHead", null);
        setIntField(term159371, term159371.getClass(), "sourcePosition", 0);
        setField(term159371, term159371.getClass(), "jsType", null);
        setField(term159371, term159371.getClass(), "parent", null);
        term159309 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term159319 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term159329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term159309, term159309.getClass(), "functionName", null);
        setBooleanField(term159309, term159309.getClass(), "itsNeedsActivation", false);
        setIntField(term159309, term159309.getClass(), "itsFunctionType", 0);
        setBooleanField(term159309, term159309.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term159309, term159309.getClass(), "encodedSourceStart", 0);
        setIntField(term159309, term159309.getClass(), "encodedSourceEnd", 0);
        setField(term159309, term159309.getClass(), "sourceName", null);
        setIntField(term159309, term159309.getClass(), "baseLineno", 0);
        setIntField(term159309, term159309.getClass(), "endLineno", 0);
        setField(term159309, term159309.getClass(), "functions", null);
        setField(term159309, term159309.getClass(), "regexps", null);
        setField(term159309, term159309.getClass(), "itsVariables", null);
        setField(term159309, term159309.getClass(), "itsConst", null);
        setField(term159309, term159309.getClass(), "itsVariableNames", null);
        setIntField(term159309, term159309.getClass(), "varStart", 0);
        setField(term159309, term159309.getClass(), "compilerData", null);
        setIntField(term159309, term159309.getClass(), "type", 20);
        setField(term159309, term159309.getClass(), "next", null);
        setField(term159319, term159319.getClass(), "functionName", null);
        setBooleanField(term159319, term159319.getClass(), "itsNeedsActivation", false);
        setIntField(term159319, term159319.getClass(), "itsFunctionType", 0);
        setBooleanField(term159319, term159319.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term159319, term159319.getClass(), "encodedSourceStart", 0);
        setIntField(term159319, term159319.getClass(), "encodedSourceEnd", 0);
        setField(term159319, term159319.getClass(), "sourceName", null);
        setIntField(term159319, term159319.getClass(), "baseLineno", 0);
        setIntField(term159319, term159319.getClass(), "endLineno", 0);
        setField(term159319, term159319.getClass(), "functions", null);
        setField(term159319, term159319.getClass(), "regexps", null);
        setField(term159319, term159319.getClass(), "itsVariables", null);
        setField(term159319, term159319.getClass(), "itsConst", null);
        setField(term159319, term159319.getClass(), "itsVariableNames", null);
        setIntField(term159319, term159319.getClass(), "varStart", 0);
        setField(term159319, term159319.getClass(), "compilerData", null);
        setIntField(term159319, term159319.getClass(), "type", 39);
        setField(term159329, term159329.getClass(), "str", null);
        setIntField(term159329, term159329.getClass(), "type", 0);
        setField(term159329, term159329.getClass(), "next", null);
        setField(term159329, term159329.getClass(), "first", null);
        setField(term159329, term159329.getClass(), "last", null);
        setField(term159329, term159329.getClass(), "propListHead", null);
        setIntField(term159329, term159329.getClass(), "sourcePosition", 0);
        setField(term159329, term159329.getClass(), "jsType", null);
        setField(term159329, term159329.getClass(), "parent", null);
        setField(term159319, term159319.getClass(), "next", term159329);
        setField(term159319, term159319.getClass(), "first", null);
        setField(term159319, term159319.getClass(), "last", null);
        setField(term159319, term159319.getClass(), "propListHead", null);
        setIntField(term159319, term159319.getClass(), "sourcePosition", 0);
        setField(term159319, term159319.getClass(), "jsType", null);
        setField(term159319, term159319.getClass(), "parent", null);
        setField(term159309, term159309.getClass(), "first", term159319);
        setField(term159309, term159309.getClass(), "last", null);
        setField(term159309, term159309.getClass(), "propListHead", null);
        setIntField(term159309, term159309.getClass(), "sourcePosition", 0);
        setField(term159309, term159309.getClass(), "jsType", null);
        setField(term159309, term159309.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term158842;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term158756, args);
        assertTrue(recursiveEquals(term158756, term159370));
        assertTrue(recursiveEquals(term158842, term159371));
        assertTrue(recursiveEquals(retValue, term159309));
    }

};


