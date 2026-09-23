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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40201;
     Object term40287;
     Object term40498;
     Object term40499;
     Object term40461;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40201 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term40287 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term40357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40287, term40287.getClass(), "first", term40287);
        setField(term40287, term40287.getClass(), "next", term40357);
        setIntField(term40287, term40287.getClass(), "type", 20);
        term40498 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term40498, term40498.getClass(), "currentTraversal", null);
        term40499 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term40500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40499, term40499.getClass(), "functionName", null);
        setBooleanField(term40499, term40499.getClass(), "itsNeedsActivation", false);
        setIntField(term40499, term40499.getClass(), "itsFunctionType", 0);
        setBooleanField(term40499, term40499.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term40499, term40499.getClass(), "encodedSourceStart", 0);
        setIntField(term40499, term40499.getClass(), "encodedSourceEnd", 0);
        setField(term40499, term40499.getClass(), "sourceName", null);
        setIntField(term40499, term40499.getClass(), "baseLineno", 0);
        setIntField(term40499, term40499.getClass(), "endLineno", 0);
        setField(term40499, term40499.getClass(), "functions", null);
        setField(term40499, term40499.getClass(), "regexps", null);
        setField(term40499, term40499.getClass(), "itsVariables", null);
        setField(term40499, term40499.getClass(), "itsConst", null);
        setField(term40499, term40499.getClass(), "itsVariableNames", null);
        setIntField(term40499, term40499.getClass(), "varStart", 0);
        setField(term40499, term40499.getClass(), "compilerData", null);
        setIntField(term40499, term40499.getClass(), "type", 20);
        setIntField(term40500, term40500.getClass(), "type", 0);
        setField(term40500, term40500.getClass(), "next", null);
        setField(term40500, term40500.getClass(), "first", null);
        setField(term40500, term40500.getClass(), "last", null);
        setField(term40500, term40500.getClass(), "propListHead", null);
        setIntField(term40500, term40500.getClass(), "sourcePosition", 0);
        setField(term40500, term40500.getClass(), "jsType", null);
        setField(term40500, term40500.getClass(), "parent", null);
        setField(term40499, term40499.getClass(), "next", term40500);
        setField(term40499, term40499.getClass(), "first", term40499);
        setField(term40499, term40499.getClass(), "last", null);
        setField(term40499, term40499.getClass(), "propListHead", null);
        setIntField(term40499, term40499.getClass(), "sourcePosition", 0);
        setField(term40499, term40499.getClass(), "jsType", null);
        setField(term40499, term40499.getClass(), "parent", null);
        term40461 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term40471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40461, term40461.getClass(), "functionName", null);
        setBooleanField(term40461, term40461.getClass(), "itsNeedsActivation", false);
        setIntField(term40461, term40461.getClass(), "itsFunctionType", 0);
        setBooleanField(term40461, term40461.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term40461, term40461.getClass(), "encodedSourceStart", 0);
        setIntField(term40461, term40461.getClass(), "encodedSourceEnd", 0);
        setField(term40461, term40461.getClass(), "sourceName", null);
        setIntField(term40461, term40461.getClass(), "baseLineno", 0);
        setIntField(term40461, term40461.getClass(), "endLineno", 0);
        setField(term40461, term40461.getClass(), "functions", null);
        setField(term40461, term40461.getClass(), "regexps", null);
        setField(term40461, term40461.getClass(), "itsVariables", null);
        setField(term40461, term40461.getClass(), "itsConst", null);
        setField(term40461, term40461.getClass(), "itsVariableNames", null);
        setIntField(term40461, term40461.getClass(), "varStart", 0);
        setField(term40461, term40461.getClass(), "compilerData", null);
        setIntField(term40461, term40461.getClass(), "type", 20);
        setIntField(term40471, term40471.getClass(), "type", 0);
        setField(term40471, term40471.getClass(), "next", null);
        setField(term40471, term40471.getClass(), "first", null);
        setField(term40471, term40471.getClass(), "last", null);
        setField(term40471, term40471.getClass(), "propListHead", null);
        setIntField(term40471, term40471.getClass(), "sourcePosition", 0);
        setField(term40471, term40471.getClass(), "jsType", null);
        setField(term40471, term40471.getClass(), "parent", null);
        setField(term40461, term40461.getClass(), "next", term40471);
        setField(term40461, term40461.getClass(), "first", term40461);
        setField(term40461, term40461.getClass(), "last", null);
        setField(term40461, term40461.getClass(), "propListHead", null);
        setIntField(term40461, term40461.getClass(), "sourcePosition", 0);
        setField(term40461, term40461.getClass(), "jsType", null);
        setField(term40461, term40461.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40287;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term40201, args);
        assertTrue(recursiveEquals(term40201, term40498));
        assertTrue(recursiveEquals(term40287, term40499));
        assertTrue(recursiveEquals(retValue, term40461));
    }

};


