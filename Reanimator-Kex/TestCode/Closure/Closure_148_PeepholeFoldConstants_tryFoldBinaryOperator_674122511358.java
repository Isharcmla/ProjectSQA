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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71912;
     Object term71998;
     Object term72295;
     Object term72296;
     Object term72231;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71912 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term71998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term72084, term72084.getClass(), "next", term72176);
        setIntField(term72084, term72084.getClass(), "type", 39);
        setField(term71998, term71998.getClass(), "first", term72084);
        setIntField(term71998, term71998.getClass(), "type", 20);
        term72295 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term72295, term72295.getClass(), "currentTraversal", null);
        term72296 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72297 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72298 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term72296, term72296.getClass(), "functionName", null);
        setBooleanField(term72296, term72296.getClass(), "itsNeedsActivation", false);
        setIntField(term72296, term72296.getClass(), "itsFunctionType", 0);
        setBooleanField(term72296, term72296.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term72296, term72296.getClass(), "encodedSourceStart", 0);
        setIntField(term72296, term72296.getClass(), "encodedSourceEnd", 0);
        setField(term72296, term72296.getClass(), "sourceName", null);
        setIntField(term72296, term72296.getClass(), "baseLineno", 0);
        setIntField(term72296, term72296.getClass(), "endLineno", 0);
        setField(term72296, term72296.getClass(), "functions", null);
        setField(term72296, term72296.getClass(), "regexps", null);
        setField(term72296, term72296.getClass(), "itsVariables", null);
        setField(term72296, term72296.getClass(), "itsConst", null);
        setField(term72296, term72296.getClass(), "itsVariableNames", null);
        setIntField(term72296, term72296.getClass(), "varStart", 0);
        setField(term72296, term72296.getClass(), "compilerData", null);
        setIntField(term72296, term72296.getClass(), "type", 20);
        setField(term72296, term72296.getClass(), "next", null);
        setField(term72297, term72297.getClass(), "functionName", null);
        setBooleanField(term72297, term72297.getClass(), "itsNeedsActivation", false);
        setIntField(term72297, term72297.getClass(), "itsFunctionType", 0);
        setBooleanField(term72297, term72297.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term72297, term72297.getClass(), "encodedSourceStart", 0);
        setIntField(term72297, term72297.getClass(), "encodedSourceEnd", 0);
        setField(term72297, term72297.getClass(), "sourceName", null);
        setIntField(term72297, term72297.getClass(), "baseLineno", 0);
        setIntField(term72297, term72297.getClass(), "endLineno", 0);
        setField(term72297, term72297.getClass(), "functions", null);
        setField(term72297, term72297.getClass(), "regexps", null);
        setField(term72297, term72297.getClass(), "itsVariables", null);
        setField(term72297, term72297.getClass(), "itsConst", null);
        setField(term72297, term72297.getClass(), "itsVariableNames", null);
        setIntField(term72297, term72297.getClass(), "varStart", 0);
        setField(term72297, term72297.getClass(), "compilerData", null);
        setIntField(term72297, term72297.getClass(), "type", 39);
        setDoubleField(term72298, term72298.getClass(), "number", 0.0);
        setIntField(term72298, term72298.getClass(), "type", 0);
        setField(term72298, term72298.getClass(), "next", null);
        setField(term72298, term72298.getClass(), "first", null);
        setField(term72298, term72298.getClass(), "last", null);
        setField(term72298, term72298.getClass(), "propListHead", null);
        setIntField(term72298, term72298.getClass(), "sourcePosition", 0);
        setField(term72298, term72298.getClass(), "jsType", null);
        setField(term72298, term72298.getClass(), "parent", null);
        setField(term72297, term72297.getClass(), "next", term72298);
        setField(term72297, term72297.getClass(), "first", null);
        setField(term72297, term72297.getClass(), "last", null);
        setField(term72297, term72297.getClass(), "propListHead", null);
        setIntField(term72297, term72297.getClass(), "sourcePosition", 0);
        setField(term72297, term72297.getClass(), "jsType", null);
        setField(term72297, term72297.getClass(), "parent", null);
        setField(term72296, term72296.getClass(), "first", term72297);
        setField(term72296, term72296.getClass(), "last", null);
        setField(term72296, term72296.getClass(), "propListHead", null);
        setIntField(term72296, term72296.getClass(), "sourcePosition", 0);
        setField(term72296, term72296.getClass(), "jsType", null);
        setField(term72296, term72296.getClass(), "parent", null);
        term72231 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72241 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term72231, term72231.getClass(), "functionName", null);
        setBooleanField(term72231, term72231.getClass(), "itsNeedsActivation", false);
        setIntField(term72231, term72231.getClass(), "itsFunctionType", 0);
        setBooleanField(term72231, term72231.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term72231, term72231.getClass(), "encodedSourceStart", 0);
        setIntField(term72231, term72231.getClass(), "encodedSourceEnd", 0);
        setField(term72231, term72231.getClass(), "sourceName", null);
        setIntField(term72231, term72231.getClass(), "baseLineno", 0);
        setIntField(term72231, term72231.getClass(), "endLineno", 0);
        setField(term72231, term72231.getClass(), "functions", null);
        setField(term72231, term72231.getClass(), "regexps", null);
        setField(term72231, term72231.getClass(), "itsVariables", null);
        setField(term72231, term72231.getClass(), "itsConst", null);
        setField(term72231, term72231.getClass(), "itsVariableNames", null);
        setIntField(term72231, term72231.getClass(), "varStart", 0);
        setField(term72231, term72231.getClass(), "compilerData", null);
        setIntField(term72231, term72231.getClass(), "type", 20);
        setField(term72231, term72231.getClass(), "next", null);
        setField(term72241, term72241.getClass(), "functionName", null);
        setBooleanField(term72241, term72241.getClass(), "itsNeedsActivation", false);
        setIntField(term72241, term72241.getClass(), "itsFunctionType", 0);
        setBooleanField(term72241, term72241.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term72241, term72241.getClass(), "encodedSourceStart", 0);
        setIntField(term72241, term72241.getClass(), "encodedSourceEnd", 0);
        setField(term72241, term72241.getClass(), "sourceName", null);
        setIntField(term72241, term72241.getClass(), "baseLineno", 0);
        setIntField(term72241, term72241.getClass(), "endLineno", 0);
        setField(term72241, term72241.getClass(), "functions", null);
        setField(term72241, term72241.getClass(), "regexps", null);
        setField(term72241, term72241.getClass(), "itsVariables", null);
        setField(term72241, term72241.getClass(), "itsConst", null);
        setField(term72241, term72241.getClass(), "itsVariableNames", null);
        setIntField(term72241, term72241.getClass(), "varStart", 0);
        setField(term72241, term72241.getClass(), "compilerData", null);
        setIntField(term72241, term72241.getClass(), "type", 39);
        setDoubleField(term72251, term72251.getClass(), "number", 0.0);
        setIntField(term72251, term72251.getClass(), "type", 0);
        setField(term72251, term72251.getClass(), "next", null);
        setField(term72251, term72251.getClass(), "first", null);
        setField(term72251, term72251.getClass(), "last", null);
        setField(term72251, term72251.getClass(), "propListHead", null);
        setIntField(term72251, term72251.getClass(), "sourcePosition", 0);
        setField(term72251, term72251.getClass(), "jsType", null);
        setField(term72251, term72251.getClass(), "parent", null);
        setField(term72241, term72241.getClass(), "next", term72251);
        setField(term72241, term72241.getClass(), "first", null);
        setField(term72241, term72241.getClass(), "last", null);
        setField(term72241, term72241.getClass(), "propListHead", null);
        setIntField(term72241, term72241.getClass(), "sourcePosition", 0);
        setField(term72241, term72241.getClass(), "jsType", null);
        setField(term72241, term72241.getClass(), "parent", null);
        setField(term72231, term72231.getClass(), "first", term72241);
        setField(term72231, term72231.getClass(), "last", null);
        setField(term72231, term72231.getClass(), "propListHead", null);
        setIntField(term72231, term72231.getClass(), "sourcePosition", 0);
        setField(term72231, term72231.getClass(), "jsType", null);
        setField(term72231, term72231.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term71998;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term71912, args);
        assertTrue(recursiveEquals(term71912, term72295));
        assertTrue(recursiveEquals(term71998, term72296));
        assertTrue(recursiveEquals(retValue, term72231));
    }

};


