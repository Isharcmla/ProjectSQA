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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575760;
     Object term575852;
     Object term576333;
     Object term576334;
     Object term576288;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term575760 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term575852 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term575938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term576008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term575938, term575938.getClass(), "next", term576008);
        setField(term575852, term575852.getClass(), "first", term575938);
        setIntField(term575852, term575852.getClass(), "type", 22);
        term576333 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term576333, term576333.getClass(), "currentTraversal", null);
        term576334 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term576335 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term576336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term576334, term576334.getClass(), "number", 0.0);
        setIntField(term576334, term576334.getClass(), "type", 22);
        setField(term576334, term576334.getClass(), "next", null);
        setField(term576335, term576335.getClass(), "functionName", null);
        setBooleanField(term576335, term576335.getClass(), "itsNeedsActivation", false);
        setIntField(term576335, term576335.getClass(), "itsFunctionType", 0);
        setBooleanField(term576335, term576335.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term576335, term576335.getClass(), "encodedSourceStart", 0);
        setIntField(term576335, term576335.getClass(), "encodedSourceEnd", 0);
        setField(term576335, term576335.getClass(), "sourceName", null);
        setIntField(term576335, term576335.getClass(), "baseLineno", 0);
        setIntField(term576335, term576335.getClass(), "endLineno", 0);
        setField(term576335, term576335.getClass(), "functions", null);
        setField(term576335, term576335.getClass(), "regexps", null);
        setField(term576335, term576335.getClass(), "itsVariables", null);
        setField(term576335, term576335.getClass(), "itsConst", null);
        setField(term576335, term576335.getClass(), "itsVariableNames", null);
        setIntField(term576335, term576335.getClass(), "varStart", 0);
        setField(term576335, term576335.getClass(), "compilerData", null);
        setIntField(term576335, term576335.getClass(), "type", 0);
        setIntField(term576336, term576336.getClass(), "type", 0);
        setField(term576336, term576336.getClass(), "next", null);
        setField(term576336, term576336.getClass(), "first", null);
        setField(term576336, term576336.getClass(), "last", null);
        setField(term576336, term576336.getClass(), "propListHead", null);
        setIntField(term576336, term576336.getClass(), "sourcePosition", 0);
        setField(term576336, term576336.getClass(), "jsType", null);
        setField(term576336, term576336.getClass(), "parent", null);
        setField(term576335, term576335.getClass(), "next", term576336);
        setField(term576335, term576335.getClass(), "first", null);
        setField(term576335, term576335.getClass(), "last", null);
        setField(term576335, term576335.getClass(), "propListHead", null);
        setIntField(term576335, term576335.getClass(), "sourcePosition", 0);
        setField(term576335, term576335.getClass(), "jsType", null);
        setField(term576335, term576335.getClass(), "parent", null);
        setField(term576334, term576334.getClass(), "first", term576335);
        setField(term576334, term576334.getClass(), "last", null);
        setField(term576334, term576334.getClass(), "propListHead", null);
        setIntField(term576334, term576334.getClass(), "sourcePosition", 0);
        setField(term576334, term576334.getClass(), "jsType", null);
        setField(term576334, term576334.getClass(), "parent", null);
        term576288 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term576291 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term576301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term576288, term576288.getClass(), "number", 0.0);
        setIntField(term576288, term576288.getClass(), "type", 22);
        setField(term576288, term576288.getClass(), "next", null);
        setField(term576291, term576291.getClass(), "functionName", null);
        setBooleanField(term576291, term576291.getClass(), "itsNeedsActivation", false);
        setIntField(term576291, term576291.getClass(), "itsFunctionType", 0);
        setBooleanField(term576291, term576291.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term576291, term576291.getClass(), "encodedSourceStart", 0);
        setIntField(term576291, term576291.getClass(), "encodedSourceEnd", 0);
        setField(term576291, term576291.getClass(), "sourceName", null);
        setIntField(term576291, term576291.getClass(), "baseLineno", 0);
        setIntField(term576291, term576291.getClass(), "endLineno", 0);
        setField(term576291, term576291.getClass(), "functions", null);
        setField(term576291, term576291.getClass(), "regexps", null);
        setField(term576291, term576291.getClass(), "itsVariables", null);
        setField(term576291, term576291.getClass(), "itsConst", null);
        setField(term576291, term576291.getClass(), "itsVariableNames", null);
        setIntField(term576291, term576291.getClass(), "varStart", 0);
        setField(term576291, term576291.getClass(), "compilerData", null);
        setIntField(term576291, term576291.getClass(), "type", 0);
        setIntField(term576301, term576301.getClass(), "type", 0);
        setField(term576301, term576301.getClass(), "next", null);
        setField(term576301, term576301.getClass(), "first", null);
        setField(term576301, term576301.getClass(), "last", null);
        setField(term576301, term576301.getClass(), "propListHead", null);
        setIntField(term576301, term576301.getClass(), "sourcePosition", 0);
        setField(term576301, term576301.getClass(), "jsType", null);
        setField(term576301, term576301.getClass(), "parent", null);
        setField(term576291, term576291.getClass(), "next", term576301);
        setField(term576291, term576291.getClass(), "first", null);
        setField(term576291, term576291.getClass(), "last", null);
        setField(term576291, term576291.getClass(), "propListHead", null);
        setIntField(term576291, term576291.getClass(), "sourcePosition", 0);
        setField(term576291, term576291.getClass(), "jsType", null);
        setField(term576291, term576291.getClass(), "parent", null);
        setField(term576288, term576288.getClass(), "first", term576291);
        setField(term576288, term576288.getClass(), "last", null);
        setField(term576288, term576288.getClass(), "propListHead", null);
        setIntField(term576288, term576288.getClass(), "sourcePosition", 0);
        setField(term576288, term576288.getClass(), "jsType", null);
        setField(term576288, term576288.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term575852;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term575760, args);
        assertTrue(recursiveEquals(term575760, term576333));
        assertTrue(recursiveEquals(term575852, term576334));
        assertTrue(recursiveEquals(retValue, term576288));
    }

};


