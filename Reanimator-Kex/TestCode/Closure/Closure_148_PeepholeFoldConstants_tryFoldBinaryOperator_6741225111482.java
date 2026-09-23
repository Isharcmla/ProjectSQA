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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368487;
     Object term368573;
     Object term368873;
     Object term368874;
     Object term368807;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368487 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term368573 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term368659 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term368729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term368659, term368659.getClass(), "next", term368729);
        setField(term368573, term368573.getClass(), "first", term368659);
        setIntField(term368573, term368573.getClass(), "type", 12);
        term368873 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term368873, term368873.getClass(), "currentTraversal", null);
        term368874 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term368875 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term368876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term368874, term368874.getClass(), "functionName", null);
        setBooleanField(term368874, term368874.getClass(), "itsNeedsActivation", false);
        setIntField(term368874, term368874.getClass(), "itsFunctionType", 0);
        setBooleanField(term368874, term368874.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term368874, term368874.getClass(), "encodedSourceStart", 0);
        setIntField(term368874, term368874.getClass(), "encodedSourceEnd", 0);
        setField(term368874, term368874.getClass(), "sourceName", null);
        setIntField(term368874, term368874.getClass(), "baseLineno", 0);
        setIntField(term368874, term368874.getClass(), "endLineno", 0);
        setField(term368874, term368874.getClass(), "functions", null);
        setField(term368874, term368874.getClass(), "regexps", null);
        setField(term368874, term368874.getClass(), "itsVariables", null);
        setField(term368874, term368874.getClass(), "itsConst", null);
        setField(term368874, term368874.getClass(), "itsVariableNames", null);
        setIntField(term368874, term368874.getClass(), "varStart", 0);
        setField(term368874, term368874.getClass(), "compilerData", null);
        setIntField(term368874, term368874.getClass(), "type", 12);
        setField(term368874, term368874.getClass(), "next", null);
        setField(term368875, term368875.getClass(), "functionName", null);
        setBooleanField(term368875, term368875.getClass(), "itsNeedsActivation", false);
        setIntField(term368875, term368875.getClass(), "itsFunctionType", 0);
        setBooleanField(term368875, term368875.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term368875, term368875.getClass(), "encodedSourceStart", 0);
        setIntField(term368875, term368875.getClass(), "encodedSourceEnd", 0);
        setField(term368875, term368875.getClass(), "sourceName", null);
        setIntField(term368875, term368875.getClass(), "baseLineno", 0);
        setIntField(term368875, term368875.getClass(), "endLineno", 0);
        setField(term368875, term368875.getClass(), "functions", null);
        setField(term368875, term368875.getClass(), "regexps", null);
        setField(term368875, term368875.getClass(), "itsVariables", null);
        setField(term368875, term368875.getClass(), "itsConst", null);
        setField(term368875, term368875.getClass(), "itsVariableNames", null);
        setIntField(term368875, term368875.getClass(), "varStart", 0);
        setField(term368875, term368875.getClass(), "compilerData", null);
        setIntField(term368875, term368875.getClass(), "type", 0);
        setIntField(term368876, term368876.getClass(), "type", 0);
        setField(term368876, term368876.getClass(), "next", null);
        setField(term368876, term368876.getClass(), "first", null);
        setField(term368876, term368876.getClass(), "last", null);
        setField(term368876, term368876.getClass(), "propListHead", null);
        setIntField(term368876, term368876.getClass(), "sourcePosition", 0);
        setField(term368876, term368876.getClass(), "jsType", null);
        setField(term368876, term368876.getClass(), "parent", null);
        setField(term368875, term368875.getClass(), "next", term368876);
        setField(term368875, term368875.getClass(), "first", null);
        setField(term368875, term368875.getClass(), "last", null);
        setField(term368875, term368875.getClass(), "propListHead", null);
        setIntField(term368875, term368875.getClass(), "sourcePosition", 0);
        setField(term368875, term368875.getClass(), "jsType", null);
        setField(term368875, term368875.getClass(), "parent", null);
        setField(term368874, term368874.getClass(), "first", term368875);
        setField(term368874, term368874.getClass(), "last", null);
        setField(term368874, term368874.getClass(), "propListHead", null);
        setIntField(term368874, term368874.getClass(), "sourcePosition", 0);
        setField(term368874, term368874.getClass(), "jsType", null);
        setField(term368874, term368874.getClass(), "parent", null);
        term368807 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term368817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term368827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term368807, term368807.getClass(), "functionName", null);
        setBooleanField(term368807, term368807.getClass(), "itsNeedsActivation", false);
        setIntField(term368807, term368807.getClass(), "itsFunctionType", 0);
        setBooleanField(term368807, term368807.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term368807, term368807.getClass(), "encodedSourceStart", 0);
        setIntField(term368807, term368807.getClass(), "encodedSourceEnd", 0);
        setField(term368807, term368807.getClass(), "sourceName", null);
        setIntField(term368807, term368807.getClass(), "baseLineno", 0);
        setIntField(term368807, term368807.getClass(), "endLineno", 0);
        setField(term368807, term368807.getClass(), "functions", null);
        setField(term368807, term368807.getClass(), "regexps", null);
        setField(term368807, term368807.getClass(), "itsVariables", null);
        setField(term368807, term368807.getClass(), "itsConst", null);
        setField(term368807, term368807.getClass(), "itsVariableNames", null);
        setIntField(term368807, term368807.getClass(), "varStart", 0);
        setField(term368807, term368807.getClass(), "compilerData", null);
        setIntField(term368807, term368807.getClass(), "type", 12);
        setField(term368807, term368807.getClass(), "next", null);
        setField(term368817, term368817.getClass(), "functionName", null);
        setBooleanField(term368817, term368817.getClass(), "itsNeedsActivation", false);
        setIntField(term368817, term368817.getClass(), "itsFunctionType", 0);
        setBooleanField(term368817, term368817.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term368817, term368817.getClass(), "encodedSourceStart", 0);
        setIntField(term368817, term368817.getClass(), "encodedSourceEnd", 0);
        setField(term368817, term368817.getClass(), "sourceName", null);
        setIntField(term368817, term368817.getClass(), "baseLineno", 0);
        setIntField(term368817, term368817.getClass(), "endLineno", 0);
        setField(term368817, term368817.getClass(), "functions", null);
        setField(term368817, term368817.getClass(), "regexps", null);
        setField(term368817, term368817.getClass(), "itsVariables", null);
        setField(term368817, term368817.getClass(), "itsConst", null);
        setField(term368817, term368817.getClass(), "itsVariableNames", null);
        setIntField(term368817, term368817.getClass(), "varStart", 0);
        setField(term368817, term368817.getClass(), "compilerData", null);
        setIntField(term368817, term368817.getClass(), "type", 0);
        setIntField(term368827, term368827.getClass(), "type", 0);
        setField(term368827, term368827.getClass(), "next", null);
        setField(term368827, term368827.getClass(), "first", null);
        setField(term368827, term368827.getClass(), "last", null);
        setField(term368827, term368827.getClass(), "propListHead", null);
        setIntField(term368827, term368827.getClass(), "sourcePosition", 0);
        setField(term368827, term368827.getClass(), "jsType", null);
        setField(term368827, term368827.getClass(), "parent", null);
        setField(term368817, term368817.getClass(), "next", term368827);
        setField(term368817, term368817.getClass(), "first", null);
        setField(term368817, term368817.getClass(), "last", null);
        setField(term368817, term368817.getClass(), "propListHead", null);
        setIntField(term368817, term368817.getClass(), "sourcePosition", 0);
        setField(term368817, term368817.getClass(), "jsType", null);
        setField(term368817, term368817.getClass(), "parent", null);
        setField(term368807, term368807.getClass(), "first", term368817);
        setField(term368807, term368807.getClass(), "last", null);
        setField(term368807, term368807.getClass(), "propListHead", null);
        setIntField(term368807, term368807.getClass(), "sourcePosition", 0);
        setField(term368807, term368807.getClass(), "jsType", null);
        setField(term368807, term368807.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term368573;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term368487, args);
        assertTrue(recursiveEquals(term368487, term368873));
        assertTrue(recursiveEquals(term368573, term368874));
        assertTrue(recursiveEquals(retValue, term368807));
    }

};


