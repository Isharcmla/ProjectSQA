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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304918;
     Object term305004;
     Object term305322;
     Object term305323;
     Object term305234;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304918 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term305004 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term305090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term305182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term305090, term305090.getClass(), "next", term305182);
        setIntField(term305090, term305090.getClass(), "type", 0);
        setField(term305004, term305004.getClass(), "first", term305090);
        setIntField(term305004, term305004.getClass(), "type", 100);
        setField(term305004, term305004.getClass(), "parent", null);
        term305322 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term305322, term305322.getClass(), "currentTraversal", null);
        term305323 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term305324 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term305325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term305323, term305323.getClass(), "functionName", null);
        setBooleanField(term305323, term305323.getClass(), "itsNeedsActivation", false);
        setIntField(term305323, term305323.getClass(), "itsFunctionType", 0);
        setBooleanField(term305323, term305323.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term305323, term305323.getClass(), "encodedSourceStart", 0);
        setIntField(term305323, term305323.getClass(), "encodedSourceEnd", 0);
        setField(term305323, term305323.getClass(), "sourceName", null);
        setIntField(term305323, term305323.getClass(), "baseLineno", 0);
        setIntField(term305323, term305323.getClass(), "endLineno", 0);
        setField(term305323, term305323.getClass(), "functions", null);
        setField(term305323, term305323.getClass(), "regexps", null);
        setField(term305323, term305323.getClass(), "itsVariables", null);
        setField(term305323, term305323.getClass(), "itsConst", null);
        setField(term305323, term305323.getClass(), "itsVariableNames", null);
        setIntField(term305323, term305323.getClass(), "varStart", 0);
        setField(term305323, term305323.getClass(), "compilerData", null);
        setIntField(term305323, term305323.getClass(), "type", 100);
        setField(term305323, term305323.getClass(), "next", null);
        setField(term305324, term305324.getClass(), "functionName", null);
        setBooleanField(term305324, term305324.getClass(), "itsNeedsActivation", false);
        setIntField(term305324, term305324.getClass(), "itsFunctionType", 0);
        setBooleanField(term305324, term305324.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term305324, term305324.getClass(), "encodedSourceStart", 0);
        setIntField(term305324, term305324.getClass(), "encodedSourceEnd", 0);
        setField(term305324, term305324.getClass(), "sourceName", null);
        setIntField(term305324, term305324.getClass(), "baseLineno", 0);
        setIntField(term305324, term305324.getClass(), "endLineno", 0);
        setField(term305324, term305324.getClass(), "functions", null);
        setField(term305324, term305324.getClass(), "regexps", null);
        setField(term305324, term305324.getClass(), "itsVariables", null);
        setField(term305324, term305324.getClass(), "itsConst", null);
        setField(term305324, term305324.getClass(), "itsVariableNames", null);
        setIntField(term305324, term305324.getClass(), "varStart", 0);
        setField(term305324, term305324.getClass(), "compilerData", null);
        setIntField(term305324, term305324.getClass(), "type", 0);
        setDoubleField(term305325, term305325.getClass(), "number", 0.0);
        setIntField(term305325, term305325.getClass(), "type", 0);
        setField(term305325, term305325.getClass(), "next", null);
        setField(term305325, term305325.getClass(), "first", null);
        setField(term305325, term305325.getClass(), "last", null);
        setField(term305325, term305325.getClass(), "propListHead", null);
        setIntField(term305325, term305325.getClass(), "sourcePosition", 0);
        setField(term305325, term305325.getClass(), "jsType", null);
        setField(term305325, term305325.getClass(), "parent", null);
        setField(term305324, term305324.getClass(), "next", term305325);
        setField(term305324, term305324.getClass(), "first", null);
        setField(term305324, term305324.getClass(), "last", null);
        setField(term305324, term305324.getClass(), "propListHead", null);
        setIntField(term305324, term305324.getClass(), "sourcePosition", 0);
        setField(term305324, term305324.getClass(), "jsType", null);
        setField(term305324, term305324.getClass(), "parent", null);
        setField(term305323, term305323.getClass(), "first", term305324);
        setField(term305323, term305323.getClass(), "last", null);
        setField(term305323, term305323.getClass(), "propListHead", null);
        setIntField(term305323, term305323.getClass(), "sourcePosition", 0);
        setField(term305323, term305323.getClass(), "jsType", null);
        setField(term305323, term305323.getClass(), "parent", null);
        term305234 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term305244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term305254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term305234, term305234.getClass(), "functionName", null);
        setBooleanField(term305234, term305234.getClass(), "itsNeedsActivation", false);
        setIntField(term305234, term305234.getClass(), "itsFunctionType", 0);
        setBooleanField(term305234, term305234.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term305234, term305234.getClass(), "encodedSourceStart", 0);
        setIntField(term305234, term305234.getClass(), "encodedSourceEnd", 0);
        setField(term305234, term305234.getClass(), "sourceName", null);
        setIntField(term305234, term305234.getClass(), "baseLineno", 0);
        setIntField(term305234, term305234.getClass(), "endLineno", 0);
        setField(term305234, term305234.getClass(), "functions", null);
        setField(term305234, term305234.getClass(), "regexps", null);
        setField(term305234, term305234.getClass(), "itsVariables", null);
        setField(term305234, term305234.getClass(), "itsConst", null);
        setField(term305234, term305234.getClass(), "itsVariableNames", null);
        setIntField(term305234, term305234.getClass(), "varStart", 0);
        setField(term305234, term305234.getClass(), "compilerData", null);
        setIntField(term305234, term305234.getClass(), "type", 100);
        setField(term305234, term305234.getClass(), "next", null);
        setField(term305244, term305244.getClass(), "functionName", null);
        setBooleanField(term305244, term305244.getClass(), "itsNeedsActivation", false);
        setIntField(term305244, term305244.getClass(), "itsFunctionType", 0);
        setBooleanField(term305244, term305244.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term305244, term305244.getClass(), "encodedSourceStart", 0);
        setIntField(term305244, term305244.getClass(), "encodedSourceEnd", 0);
        setField(term305244, term305244.getClass(), "sourceName", null);
        setIntField(term305244, term305244.getClass(), "baseLineno", 0);
        setIntField(term305244, term305244.getClass(), "endLineno", 0);
        setField(term305244, term305244.getClass(), "functions", null);
        setField(term305244, term305244.getClass(), "regexps", null);
        setField(term305244, term305244.getClass(), "itsVariables", null);
        setField(term305244, term305244.getClass(), "itsConst", null);
        setField(term305244, term305244.getClass(), "itsVariableNames", null);
        setIntField(term305244, term305244.getClass(), "varStart", 0);
        setField(term305244, term305244.getClass(), "compilerData", null);
        setIntField(term305244, term305244.getClass(), "type", 0);
        setDoubleField(term305254, term305254.getClass(), "number", 0.0);
        setIntField(term305254, term305254.getClass(), "type", 0);
        setField(term305254, term305254.getClass(), "next", null);
        setField(term305254, term305254.getClass(), "first", null);
        setField(term305254, term305254.getClass(), "last", null);
        setField(term305254, term305254.getClass(), "propListHead", null);
        setIntField(term305254, term305254.getClass(), "sourcePosition", 0);
        setField(term305254, term305254.getClass(), "jsType", null);
        setField(term305254, term305254.getClass(), "parent", null);
        setField(term305244, term305244.getClass(), "next", term305254);
        setField(term305244, term305244.getClass(), "first", null);
        setField(term305244, term305244.getClass(), "last", null);
        setField(term305244, term305244.getClass(), "propListHead", null);
        setIntField(term305244, term305244.getClass(), "sourcePosition", 0);
        setField(term305244, term305244.getClass(), "jsType", null);
        setField(term305244, term305244.getClass(), "parent", null);
        setField(term305234, term305234.getClass(), "first", term305244);
        setField(term305234, term305234.getClass(), "last", null);
        setField(term305234, term305234.getClass(), "propListHead", null);
        setIntField(term305234, term305234.getClass(), "sourcePosition", 0);
        setField(term305234, term305234.getClass(), "jsType", null);
        setField(term305234, term305234.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term305004;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term304918, args);
        assertTrue(recursiveEquals(term304918, term305322));
        assertTrue(recursiveEquals(term305004, term305323));
        assertTrue(recursiveEquals(retValue, term305234));
    }

};


