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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686264;
     Object term686356;
     Object term686709;
     Object term686710;
     Object term686640;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term686264 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term686356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term686442 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term686528 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term686442, term686442.getClass(), "next", term686528);
        setIntField(term686442, term686442.getClass(), "type", 39);
        setField(term686356, term686356.getClass(), "first", term686442);
        setIntField(term686356, term686356.getClass(), "type", 22);
        term686709 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term686709, term686709.getClass(), "currentTraversal", null);
        term686710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term686711 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term686712 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term686710, term686710.getClass(), "str", null);
        setIntField(term686710, term686710.getClass(), "type", 22);
        setField(term686710, term686710.getClass(), "next", null);
        setField(term686711, term686711.getClass(), "functionName", null);
        setBooleanField(term686711, term686711.getClass(), "itsNeedsActivation", false);
        setIntField(term686711, term686711.getClass(), "itsFunctionType", 0);
        setBooleanField(term686711, term686711.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term686711, term686711.getClass(), "encodedSourceStart", 0);
        setIntField(term686711, term686711.getClass(), "encodedSourceEnd", 0);
        setField(term686711, term686711.getClass(), "sourceName", null);
        setIntField(term686711, term686711.getClass(), "baseLineno", 0);
        setIntField(term686711, term686711.getClass(), "endLineno", 0);
        setField(term686711, term686711.getClass(), "functions", null);
        setField(term686711, term686711.getClass(), "regexps", null);
        setField(term686711, term686711.getClass(), "itsVariables", null);
        setField(term686711, term686711.getClass(), "itsConst", null);
        setField(term686711, term686711.getClass(), "itsVariableNames", null);
        setIntField(term686711, term686711.getClass(), "varStart", 0);
        setField(term686711, term686711.getClass(), "compilerData", null);
        setIntField(term686711, term686711.getClass(), "type", 39);
        setField(term686712, term686712.getClass(), "functionName", null);
        setBooleanField(term686712, term686712.getClass(), "itsNeedsActivation", false);
        setIntField(term686712, term686712.getClass(), "itsFunctionType", 0);
        setBooleanField(term686712, term686712.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term686712, term686712.getClass(), "encodedSourceStart", 0);
        setIntField(term686712, term686712.getClass(), "encodedSourceEnd", 0);
        setField(term686712, term686712.getClass(), "sourceName", null);
        setIntField(term686712, term686712.getClass(), "baseLineno", 0);
        setIntField(term686712, term686712.getClass(), "endLineno", 0);
        setField(term686712, term686712.getClass(), "functions", null);
        setField(term686712, term686712.getClass(), "regexps", null);
        setField(term686712, term686712.getClass(), "itsVariables", null);
        setField(term686712, term686712.getClass(), "itsConst", null);
        setField(term686712, term686712.getClass(), "itsVariableNames", null);
        setIntField(term686712, term686712.getClass(), "varStart", 0);
        setField(term686712, term686712.getClass(), "compilerData", null);
        setIntField(term686712, term686712.getClass(), "type", 0);
        setField(term686712, term686712.getClass(), "next", null);
        setField(term686712, term686712.getClass(), "first", null);
        setField(term686712, term686712.getClass(), "last", null);
        setField(term686712, term686712.getClass(), "propListHead", null);
        setIntField(term686712, term686712.getClass(), "sourcePosition", 0);
        setField(term686712, term686712.getClass(), "jsType", null);
        setField(term686712, term686712.getClass(), "parent", null);
        setField(term686711, term686711.getClass(), "next", term686712);
        setField(term686711, term686711.getClass(), "first", null);
        setField(term686711, term686711.getClass(), "last", null);
        setField(term686711, term686711.getClass(), "propListHead", null);
        setIntField(term686711, term686711.getClass(), "sourcePosition", 0);
        setField(term686711, term686711.getClass(), "jsType", null);
        setField(term686711, term686711.getClass(), "parent", null);
        setField(term686710, term686710.getClass(), "first", term686711);
        setField(term686710, term686710.getClass(), "last", null);
        setField(term686710, term686710.getClass(), "propListHead", null);
        setIntField(term686710, term686710.getClass(), "sourcePosition", 0);
        setField(term686710, term686710.getClass(), "jsType", null);
        setField(term686710, term686710.getClass(), "parent", null);
        term686640 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term686642 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term686652 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term686640, term686640.getClass(), "str", null);
        setIntField(term686640, term686640.getClass(), "type", 22);
        setField(term686640, term686640.getClass(), "next", null);
        setField(term686642, term686642.getClass(), "functionName", null);
        setBooleanField(term686642, term686642.getClass(), "itsNeedsActivation", false);
        setIntField(term686642, term686642.getClass(), "itsFunctionType", 0);
        setBooleanField(term686642, term686642.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term686642, term686642.getClass(), "encodedSourceStart", 0);
        setIntField(term686642, term686642.getClass(), "encodedSourceEnd", 0);
        setField(term686642, term686642.getClass(), "sourceName", null);
        setIntField(term686642, term686642.getClass(), "baseLineno", 0);
        setIntField(term686642, term686642.getClass(), "endLineno", 0);
        setField(term686642, term686642.getClass(), "functions", null);
        setField(term686642, term686642.getClass(), "regexps", null);
        setField(term686642, term686642.getClass(), "itsVariables", null);
        setField(term686642, term686642.getClass(), "itsConst", null);
        setField(term686642, term686642.getClass(), "itsVariableNames", null);
        setIntField(term686642, term686642.getClass(), "varStart", 0);
        setField(term686642, term686642.getClass(), "compilerData", null);
        setIntField(term686642, term686642.getClass(), "type", 39);
        setField(term686652, term686652.getClass(), "functionName", null);
        setBooleanField(term686652, term686652.getClass(), "itsNeedsActivation", false);
        setIntField(term686652, term686652.getClass(), "itsFunctionType", 0);
        setBooleanField(term686652, term686652.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term686652, term686652.getClass(), "encodedSourceStart", 0);
        setIntField(term686652, term686652.getClass(), "encodedSourceEnd", 0);
        setField(term686652, term686652.getClass(), "sourceName", null);
        setIntField(term686652, term686652.getClass(), "baseLineno", 0);
        setIntField(term686652, term686652.getClass(), "endLineno", 0);
        setField(term686652, term686652.getClass(), "functions", null);
        setField(term686652, term686652.getClass(), "regexps", null);
        setField(term686652, term686652.getClass(), "itsVariables", null);
        setField(term686652, term686652.getClass(), "itsConst", null);
        setField(term686652, term686652.getClass(), "itsVariableNames", null);
        setIntField(term686652, term686652.getClass(), "varStart", 0);
        setField(term686652, term686652.getClass(), "compilerData", null);
        setIntField(term686652, term686652.getClass(), "type", 0);
        setField(term686652, term686652.getClass(), "next", null);
        setField(term686652, term686652.getClass(), "first", null);
        setField(term686652, term686652.getClass(), "last", null);
        setField(term686652, term686652.getClass(), "propListHead", null);
        setIntField(term686652, term686652.getClass(), "sourcePosition", 0);
        setField(term686652, term686652.getClass(), "jsType", null);
        setField(term686652, term686652.getClass(), "parent", null);
        setField(term686642, term686642.getClass(), "next", term686652);
        setField(term686642, term686642.getClass(), "first", null);
        setField(term686642, term686642.getClass(), "last", null);
        setField(term686642, term686642.getClass(), "propListHead", null);
        setIntField(term686642, term686642.getClass(), "sourcePosition", 0);
        setField(term686642, term686642.getClass(), "jsType", null);
        setField(term686642, term686642.getClass(), "parent", null);
        setField(term686640, term686640.getClass(), "first", term686642);
        setField(term686640, term686640.getClass(), "last", null);
        setField(term686640, term686640.getClass(), "propListHead", null);
        setIntField(term686640, term686640.getClass(), "sourcePosition", 0);
        setField(term686640, term686640.getClass(), "jsType", null);
        setField(term686640, term686640.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term686356;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term686264, args);
        assertTrue(recursiveEquals(term686264, term686709));
        assertTrue(recursiveEquals(term686356, term686710));
        assertTrue(recursiveEquals(retValue, term686640));
    }

};


