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

public class CheckAccessControls_getClassOfMethod_1679898606209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60355;
     Object term60447;
     Object term60578;
     Object term60579;

    public CheckAccessControls_getClassOfMethod_1679898606209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60355 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term60447 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60533 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term60447, term60447.getClass(), "type", 86);
        setField(term60447, term60447.getClass(), "first", term60533);
        term60578 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term60578, term60578.getClass(), "compiler", null);
        setField(term60578, term60578.getClass(), "validator", null);
        setIntField(term60578, term60578.getClass(), "deprecatedDepth", 0);
        setIntField(term60578, term60578.getClass(), "methodDepth", 0);
        setField(term60578, term60578.getClass(), "currentClass", null);
        setField(term60578, term60578.getClass(), "initializedConstantProperties", null);
        term60579 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60580 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term60579, term60579.getClass(), "str", null);
        setIntField(term60579, term60579.getClass(), "type", 86);
        setField(term60579, term60579.getClass(), "next", null);
        setField(term60580, term60580.getClass(), "functionName", null);
        setBooleanField(term60580, term60580.getClass(), "itsNeedsActivation", false);
        setIntField(term60580, term60580.getClass(), "itsFunctionType", 0);
        setBooleanField(term60580, term60580.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term60580, term60580.getClass(), "encodedSourceStart", 0);
        setIntField(term60580, term60580.getClass(), "encodedSourceEnd", 0);
        setField(term60580, term60580.getClass(), "sourceName", null);
        setIntField(term60580, term60580.getClass(), "baseLineno", 0);
        setIntField(term60580, term60580.getClass(), "endLineno", 0);
        setField(term60580, term60580.getClass(), "functions", null);
        setField(term60580, term60580.getClass(), "regexps", null);
        setField(term60580, term60580.getClass(), "itsVariables", null);
        setField(term60580, term60580.getClass(), "itsConst", null);
        setField(term60580, term60580.getClass(), "itsVariableNames", null);
        setIntField(term60580, term60580.getClass(), "varStart", 0);
        setField(term60580, term60580.getClass(), "compilerData", null);
        setIntField(term60580, term60580.getClass(), "type", 0);
        setField(term60580, term60580.getClass(), "next", null);
        setField(term60580, term60580.getClass(), "first", null);
        setField(term60580, term60580.getClass(), "last", null);
        setField(term60580, term60580.getClass(), "propListHead", null);
        setIntField(term60580, term60580.getClass(), "sourcePosition", 0);
        setField(term60580, term60580.getClass(), "jsType", null);
        setField(term60580, term60580.getClass(), "parent", null);
        setField(term60579, term60579.getClass(), "first", term60580);
        setField(term60579, term60579.getClass(), "last", null);
        setField(term60579, term60579.getClass(), "propListHead", null);
        setIntField(term60579, term60579.getClass(), "sourcePosition", 0);
        setField(term60579, term60579.getClass(), "jsType", null);
        setField(term60579, term60579.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60447;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term60355, args);
        assertTrue(recursiveEquals(term60355, term60578));
        assertTrue(recursiveEquals(term60447, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


