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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128004;
     Object term128090;
     Object term128380;
     Object term128381;
     Object term128304;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128004 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term128090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term128246, term128246.getClass(), "type", 42);
        setField(term128176, term128176.getClass(), "next", term128246);
        setIntField(term128176, term128176.getClass(), "type", 42);
        setField(term128090, term128090.getClass(), "first", term128176);
        setIntField(term128090, term128090.getClass(), "type", 16);
        term128380 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term128380, term128380.getClass(), "currentTraversal", null);
        term128381 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128382 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128381, term128381.getClass(), "functionName", null);
        setBooleanField(term128381, term128381.getClass(), "itsNeedsActivation", false);
        setIntField(term128381, term128381.getClass(), "itsFunctionType", 0);
        setBooleanField(term128381, term128381.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term128381, term128381.getClass(), "encodedSourceStart", 0);
        setIntField(term128381, term128381.getClass(), "encodedSourceEnd", 0);
        setField(term128381, term128381.getClass(), "sourceName", null);
        setIntField(term128381, term128381.getClass(), "baseLineno", 0);
        setIntField(term128381, term128381.getClass(), "endLineno", 0);
        setField(term128381, term128381.getClass(), "functions", null);
        setField(term128381, term128381.getClass(), "regexps", null);
        setField(term128381, term128381.getClass(), "itsVariables", null);
        setField(term128381, term128381.getClass(), "itsConst", null);
        setField(term128381, term128381.getClass(), "itsVariableNames", null);
        setIntField(term128381, term128381.getClass(), "varStart", 0);
        setField(term128381, term128381.getClass(), "compilerData", null);
        setIntField(term128381, term128381.getClass(), "type", 16);
        setField(term128381, term128381.getClass(), "next", null);
        setField(term128382, term128382.getClass(), "functionName", null);
        setBooleanField(term128382, term128382.getClass(), "itsNeedsActivation", false);
        setIntField(term128382, term128382.getClass(), "itsFunctionType", 0);
        setBooleanField(term128382, term128382.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term128382, term128382.getClass(), "encodedSourceStart", 0);
        setIntField(term128382, term128382.getClass(), "encodedSourceEnd", 0);
        setField(term128382, term128382.getClass(), "sourceName", null);
        setIntField(term128382, term128382.getClass(), "baseLineno", 0);
        setIntField(term128382, term128382.getClass(), "endLineno", 0);
        setField(term128382, term128382.getClass(), "functions", null);
        setField(term128382, term128382.getClass(), "regexps", null);
        setField(term128382, term128382.getClass(), "itsVariables", null);
        setField(term128382, term128382.getClass(), "itsConst", null);
        setField(term128382, term128382.getClass(), "itsVariableNames", null);
        setIntField(term128382, term128382.getClass(), "varStart", 0);
        setField(term128382, term128382.getClass(), "compilerData", null);
        setIntField(term128382, term128382.getClass(), "type", 42);
        setIntField(term128383, term128383.getClass(), "type", 42);
        setField(term128383, term128383.getClass(), "next", null);
        setField(term128383, term128383.getClass(), "first", null);
        setField(term128383, term128383.getClass(), "last", null);
        setField(term128383, term128383.getClass(), "propListHead", null);
        setIntField(term128383, term128383.getClass(), "sourcePosition", 0);
        setField(term128383, term128383.getClass(), "jsType", null);
        setField(term128383, term128383.getClass(), "parent", null);
        setField(term128382, term128382.getClass(), "next", term128383);
        setField(term128382, term128382.getClass(), "first", null);
        setField(term128382, term128382.getClass(), "last", null);
        setField(term128382, term128382.getClass(), "propListHead", null);
        setIntField(term128382, term128382.getClass(), "sourcePosition", 0);
        setField(term128382, term128382.getClass(), "jsType", null);
        setField(term128382, term128382.getClass(), "parent", null);
        setField(term128381, term128381.getClass(), "first", term128382);
        setField(term128381, term128381.getClass(), "last", null);
        setField(term128381, term128381.getClass(), "propListHead", null);
        setIntField(term128381, term128381.getClass(), "sourcePosition", 0);
        setField(term128381, term128381.getClass(), "jsType", null);
        setField(term128381, term128381.getClass(), "parent", null);
        term128304 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128314 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128304, term128304.getClass(), "functionName", null);
        setBooleanField(term128304, term128304.getClass(), "itsNeedsActivation", false);
        setIntField(term128304, term128304.getClass(), "itsFunctionType", 0);
        setBooleanField(term128304, term128304.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term128304, term128304.getClass(), "encodedSourceStart", 0);
        setIntField(term128304, term128304.getClass(), "encodedSourceEnd", 0);
        setField(term128304, term128304.getClass(), "sourceName", null);
        setIntField(term128304, term128304.getClass(), "baseLineno", 0);
        setIntField(term128304, term128304.getClass(), "endLineno", 0);
        setField(term128304, term128304.getClass(), "functions", null);
        setField(term128304, term128304.getClass(), "regexps", null);
        setField(term128304, term128304.getClass(), "itsVariables", null);
        setField(term128304, term128304.getClass(), "itsConst", null);
        setField(term128304, term128304.getClass(), "itsVariableNames", null);
        setIntField(term128304, term128304.getClass(), "varStart", 0);
        setField(term128304, term128304.getClass(), "compilerData", null);
        setIntField(term128304, term128304.getClass(), "type", 16);
        setField(term128304, term128304.getClass(), "next", null);
        setField(term128314, term128314.getClass(), "functionName", null);
        setBooleanField(term128314, term128314.getClass(), "itsNeedsActivation", false);
        setIntField(term128314, term128314.getClass(), "itsFunctionType", 0);
        setBooleanField(term128314, term128314.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term128314, term128314.getClass(), "encodedSourceStart", 0);
        setIntField(term128314, term128314.getClass(), "encodedSourceEnd", 0);
        setField(term128314, term128314.getClass(), "sourceName", null);
        setIntField(term128314, term128314.getClass(), "baseLineno", 0);
        setIntField(term128314, term128314.getClass(), "endLineno", 0);
        setField(term128314, term128314.getClass(), "functions", null);
        setField(term128314, term128314.getClass(), "regexps", null);
        setField(term128314, term128314.getClass(), "itsVariables", null);
        setField(term128314, term128314.getClass(), "itsConst", null);
        setField(term128314, term128314.getClass(), "itsVariableNames", null);
        setIntField(term128314, term128314.getClass(), "varStart", 0);
        setField(term128314, term128314.getClass(), "compilerData", null);
        setIntField(term128314, term128314.getClass(), "type", 42);
        setIntField(term128324, term128324.getClass(), "type", 42);
        setField(term128324, term128324.getClass(), "next", null);
        setField(term128324, term128324.getClass(), "first", null);
        setField(term128324, term128324.getClass(), "last", null);
        setField(term128324, term128324.getClass(), "propListHead", null);
        setIntField(term128324, term128324.getClass(), "sourcePosition", 0);
        setField(term128324, term128324.getClass(), "jsType", null);
        setField(term128324, term128324.getClass(), "parent", null);
        setField(term128314, term128314.getClass(), "next", term128324);
        setField(term128314, term128314.getClass(), "first", null);
        setField(term128314, term128314.getClass(), "last", null);
        setField(term128314, term128314.getClass(), "propListHead", null);
        setIntField(term128314, term128314.getClass(), "sourcePosition", 0);
        setField(term128314, term128314.getClass(), "jsType", null);
        setField(term128314, term128314.getClass(), "parent", null);
        setField(term128304, term128304.getClass(), "first", term128314);
        setField(term128304, term128304.getClass(), "last", null);
        setField(term128304, term128304.getClass(), "propListHead", null);
        setIntField(term128304, term128304.getClass(), "sourcePosition", 0);
        setField(term128304, term128304.getClass(), "jsType", null);
        setField(term128304, term128304.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128090;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term128004, args);
        assertTrue(recursiveEquals(term128004, term128380));
        assertTrue(recursiveEquals(term128090, term128381));
        assertTrue(recursiveEquals(retValue, term128304));
    }

};


