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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168977;
     Object term169063;
     Object term169648;
     Object term169649;
     Object term169572;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168977 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term169063 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169149 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term169063, term169063.getClass(), "first", term169063);
        setField(term169063, term169063.getClass(), "next", term169149);
        setIntField(term169063, term169063.getClass(), "type", 16);
        term169648 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term169648, term169648.getClass(), "currentTraversal", null);
        term169649 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169650 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term169649, term169649.getClass(), "functionName", null);
        setBooleanField(term169649, term169649.getClass(), "itsNeedsActivation", false);
        setIntField(term169649, term169649.getClass(), "itsFunctionType", 0);
        setBooleanField(term169649, term169649.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169649, term169649.getClass(), "encodedSourceStart", 0);
        setIntField(term169649, term169649.getClass(), "encodedSourceEnd", 0);
        setField(term169649, term169649.getClass(), "sourceName", null);
        setIntField(term169649, term169649.getClass(), "baseLineno", 0);
        setIntField(term169649, term169649.getClass(), "endLineno", 0);
        setField(term169649, term169649.getClass(), "functions", null);
        setField(term169649, term169649.getClass(), "regexps", null);
        setField(term169649, term169649.getClass(), "itsVariables", null);
        setField(term169649, term169649.getClass(), "itsConst", null);
        setField(term169649, term169649.getClass(), "itsVariableNames", null);
        setIntField(term169649, term169649.getClass(), "varStart", 0);
        setField(term169649, term169649.getClass(), "compilerData", null);
        setIntField(term169649, term169649.getClass(), "type", 16);
        setField(term169650, term169650.getClass(), "functionName", null);
        setBooleanField(term169650, term169650.getClass(), "itsNeedsActivation", false);
        setIntField(term169650, term169650.getClass(), "itsFunctionType", 0);
        setBooleanField(term169650, term169650.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169650, term169650.getClass(), "encodedSourceStart", 0);
        setIntField(term169650, term169650.getClass(), "encodedSourceEnd", 0);
        setField(term169650, term169650.getClass(), "sourceName", null);
        setIntField(term169650, term169650.getClass(), "baseLineno", 0);
        setIntField(term169650, term169650.getClass(), "endLineno", 0);
        setField(term169650, term169650.getClass(), "functions", null);
        setField(term169650, term169650.getClass(), "regexps", null);
        setField(term169650, term169650.getClass(), "itsVariables", null);
        setField(term169650, term169650.getClass(), "itsConst", null);
        setField(term169650, term169650.getClass(), "itsVariableNames", null);
        setIntField(term169650, term169650.getClass(), "varStart", 0);
        setField(term169650, term169650.getClass(), "compilerData", null);
        setIntField(term169650, term169650.getClass(), "type", 0);
        setField(term169650, term169650.getClass(), "next", null);
        setField(term169650, term169650.getClass(), "first", null);
        setField(term169650, term169650.getClass(), "last", null);
        setField(term169650, term169650.getClass(), "propListHead", null);
        setIntField(term169650, term169650.getClass(), "sourcePosition", 0);
        setField(term169650, term169650.getClass(), "jsType", null);
        setField(term169650, term169650.getClass(), "parent", null);
        setField(term169649, term169649.getClass(), "next", term169650);
        setField(term169649, term169649.getClass(), "first", term169649);
        setField(term169649, term169649.getClass(), "last", null);
        setField(term169649, term169649.getClass(), "propListHead", null);
        setIntField(term169649, term169649.getClass(), "sourcePosition", 0);
        setField(term169649, term169649.getClass(), "jsType", null);
        setField(term169649, term169649.getClass(), "parent", null);
        term169572 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169582 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term169572, term169572.getClass(), "functionName", null);
        setBooleanField(term169572, term169572.getClass(), "itsNeedsActivation", false);
        setIntField(term169572, term169572.getClass(), "itsFunctionType", 0);
        setBooleanField(term169572, term169572.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169572, term169572.getClass(), "encodedSourceStart", 0);
        setIntField(term169572, term169572.getClass(), "encodedSourceEnd", 0);
        setField(term169572, term169572.getClass(), "sourceName", null);
        setIntField(term169572, term169572.getClass(), "baseLineno", 0);
        setIntField(term169572, term169572.getClass(), "endLineno", 0);
        setField(term169572, term169572.getClass(), "functions", null);
        setField(term169572, term169572.getClass(), "regexps", null);
        setField(term169572, term169572.getClass(), "itsVariables", null);
        setField(term169572, term169572.getClass(), "itsConst", null);
        setField(term169572, term169572.getClass(), "itsVariableNames", null);
        setIntField(term169572, term169572.getClass(), "varStart", 0);
        setField(term169572, term169572.getClass(), "compilerData", null);
        setIntField(term169572, term169572.getClass(), "type", 16);
        setField(term169582, term169582.getClass(), "functionName", null);
        setBooleanField(term169582, term169582.getClass(), "itsNeedsActivation", false);
        setIntField(term169582, term169582.getClass(), "itsFunctionType", 0);
        setBooleanField(term169582, term169582.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169582, term169582.getClass(), "encodedSourceStart", 0);
        setIntField(term169582, term169582.getClass(), "encodedSourceEnd", 0);
        setField(term169582, term169582.getClass(), "sourceName", null);
        setIntField(term169582, term169582.getClass(), "baseLineno", 0);
        setIntField(term169582, term169582.getClass(), "endLineno", 0);
        setField(term169582, term169582.getClass(), "functions", null);
        setField(term169582, term169582.getClass(), "regexps", null);
        setField(term169582, term169582.getClass(), "itsVariables", null);
        setField(term169582, term169582.getClass(), "itsConst", null);
        setField(term169582, term169582.getClass(), "itsVariableNames", null);
        setIntField(term169582, term169582.getClass(), "varStart", 0);
        setField(term169582, term169582.getClass(), "compilerData", null);
        setIntField(term169582, term169582.getClass(), "type", 0);
        setField(term169582, term169582.getClass(), "next", null);
        setField(term169582, term169582.getClass(), "first", null);
        setField(term169582, term169582.getClass(), "last", null);
        setField(term169582, term169582.getClass(), "propListHead", null);
        setIntField(term169582, term169582.getClass(), "sourcePosition", 0);
        setField(term169582, term169582.getClass(), "jsType", null);
        setField(term169582, term169582.getClass(), "parent", null);
        setField(term169572, term169572.getClass(), "next", term169582);
        setField(term169572, term169572.getClass(), "first", term169572);
        setField(term169572, term169572.getClass(), "last", null);
        setField(term169572, term169572.getClass(), "propListHead", null);
        setIntField(term169572, term169572.getClass(), "sourcePosition", 0);
        setField(term169572, term169572.getClass(), "jsType", null);
        setField(term169572, term169572.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term169063;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term168977, args);
        assertTrue(recursiveEquals(term168977, term169648));
        assertTrue(recursiveEquals(term169063, term169649));
        assertTrue(recursiveEquals(retValue, term169572));
    }

};


