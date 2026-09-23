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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77268;
     Object term77354;
     Object term77544;
     Object term77545;
     Object term77500;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term77354 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term77424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77354, term77354.getClass(), "first", term77354);
        setField(term77354, term77354.getClass(), "next", term77424);
        setIntField(term77354, term77354.getClass(), "type", 15);
        term77544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term77544, term77544.getClass(), "currentTraversal", null);
        term77545 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term77546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77545, term77545.getClass(), "functionName", null);
        setBooleanField(term77545, term77545.getClass(), "itsNeedsActivation", false);
        setIntField(term77545, term77545.getClass(), "itsFunctionType", 0);
        setBooleanField(term77545, term77545.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77545, term77545.getClass(), "encodedSourceStart", 0);
        setIntField(term77545, term77545.getClass(), "encodedSourceEnd", 0);
        setField(term77545, term77545.getClass(), "sourceName", null);
        setIntField(term77545, term77545.getClass(), "baseLineno", 0);
        setIntField(term77545, term77545.getClass(), "endLineno", 0);
        setField(term77545, term77545.getClass(), "functions", null);
        setField(term77545, term77545.getClass(), "regexps", null);
        setField(term77545, term77545.getClass(), "itsVariables", null);
        setField(term77545, term77545.getClass(), "itsConst", null);
        setField(term77545, term77545.getClass(), "itsVariableNames", null);
        setIntField(term77545, term77545.getClass(), "varStart", 0);
        setField(term77545, term77545.getClass(), "compilerData", null);
        setIntField(term77545, term77545.getClass(), "type", 15);
        setIntField(term77546, term77546.getClass(), "type", 0);
        setField(term77546, term77546.getClass(), "next", null);
        setField(term77546, term77546.getClass(), "first", null);
        setField(term77546, term77546.getClass(), "last", null);
        setField(term77546, term77546.getClass(), "propListHead", null);
        setIntField(term77546, term77546.getClass(), "sourcePosition", 0);
        setField(term77546, term77546.getClass(), "jsType", null);
        setField(term77546, term77546.getClass(), "parent", null);
        setField(term77545, term77545.getClass(), "next", term77546);
        setField(term77545, term77545.getClass(), "first", term77545);
        setField(term77545, term77545.getClass(), "last", null);
        setField(term77545, term77545.getClass(), "propListHead", null);
        setIntField(term77545, term77545.getClass(), "sourcePosition", 0);
        setField(term77545, term77545.getClass(), "jsType", null);
        setField(term77545, term77545.getClass(), "parent", null);
        term77500 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term77510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77500, term77500.getClass(), "functionName", null);
        setBooleanField(term77500, term77500.getClass(), "itsNeedsActivation", false);
        setIntField(term77500, term77500.getClass(), "itsFunctionType", 0);
        setBooleanField(term77500, term77500.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77500, term77500.getClass(), "encodedSourceStart", 0);
        setIntField(term77500, term77500.getClass(), "encodedSourceEnd", 0);
        setField(term77500, term77500.getClass(), "sourceName", null);
        setIntField(term77500, term77500.getClass(), "baseLineno", 0);
        setIntField(term77500, term77500.getClass(), "endLineno", 0);
        setField(term77500, term77500.getClass(), "functions", null);
        setField(term77500, term77500.getClass(), "regexps", null);
        setField(term77500, term77500.getClass(), "itsVariables", null);
        setField(term77500, term77500.getClass(), "itsConst", null);
        setField(term77500, term77500.getClass(), "itsVariableNames", null);
        setIntField(term77500, term77500.getClass(), "varStart", 0);
        setField(term77500, term77500.getClass(), "compilerData", null);
        setIntField(term77500, term77500.getClass(), "type", 15);
        setIntField(term77510, term77510.getClass(), "type", 0);
        setField(term77510, term77510.getClass(), "next", null);
        setField(term77510, term77510.getClass(), "first", null);
        setField(term77510, term77510.getClass(), "last", null);
        setField(term77510, term77510.getClass(), "propListHead", null);
        setIntField(term77510, term77510.getClass(), "sourcePosition", 0);
        setField(term77510, term77510.getClass(), "jsType", null);
        setField(term77510, term77510.getClass(), "parent", null);
        setField(term77500, term77500.getClass(), "next", term77510);
        setField(term77500, term77500.getClass(), "first", term77500);
        setField(term77500, term77500.getClass(), "last", null);
        setField(term77500, term77500.getClass(), "propListHead", null);
        setIntField(term77500, term77500.getClass(), "sourcePosition", 0);
        setField(term77500, term77500.getClass(), "jsType", null);
        setField(term77500, term77500.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term77354;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term77268, args);
        assertTrue(recursiveEquals(term77268, term77544));
        assertTrue(recursiveEquals(term77354, term77545));
        assertTrue(recursiveEquals(retValue, term77500));
    }

};


