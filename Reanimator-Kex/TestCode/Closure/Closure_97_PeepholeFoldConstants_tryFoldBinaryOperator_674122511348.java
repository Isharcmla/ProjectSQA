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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68823;
     Object term68909;
     Object term81895;
     Object term81896;
     Object term81832;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68823 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term68909 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term68995 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term69065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68995, term68995.getClass(), "next", term69065);
        setField(term68909, term68909.getClass(), "first", term68995);
        setIntField(term68909, term68909.getClass(), "type", 11);
        term81895 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81895, term81895.getClass(), "currentTraversal", null);
        term81896 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81897 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81896, term81896.getClass(), "functionName", null);
        setBooleanField(term81896, term81896.getClass(), "itsNeedsActivation", false);
        setIntField(term81896, term81896.getClass(), "itsFunctionType", 0);
        setBooleanField(term81896, term81896.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81896, term81896.getClass(), "encodedSourceStart", 0);
        setIntField(term81896, term81896.getClass(), "encodedSourceEnd", 0);
        setField(term81896, term81896.getClass(), "sourceName", null);
        setIntField(term81896, term81896.getClass(), "baseLineno", 0);
        setIntField(term81896, term81896.getClass(), "endLineno", 0);
        setField(term81896, term81896.getClass(), "functions", null);
        setField(term81896, term81896.getClass(), "regexps", null);
        setField(term81896, term81896.getClass(), "itsVariables", null);
        setField(term81896, term81896.getClass(), "itsConst", null);
        setField(term81896, term81896.getClass(), "itsVariableNames", null);
        setIntField(term81896, term81896.getClass(), "varStart", 0);
        setField(term81896, term81896.getClass(), "compilerData", null);
        setIntField(term81896, term81896.getClass(), "type", 11);
        setField(term81896, term81896.getClass(), "next", null);
        setField(term81897, term81897.getClass(), "functionName", null);
        setBooleanField(term81897, term81897.getClass(), "itsNeedsActivation", false);
        setIntField(term81897, term81897.getClass(), "itsFunctionType", 0);
        setBooleanField(term81897, term81897.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81897, term81897.getClass(), "encodedSourceStart", 0);
        setIntField(term81897, term81897.getClass(), "encodedSourceEnd", 0);
        setField(term81897, term81897.getClass(), "sourceName", null);
        setIntField(term81897, term81897.getClass(), "baseLineno", 0);
        setIntField(term81897, term81897.getClass(), "endLineno", 0);
        setField(term81897, term81897.getClass(), "functions", null);
        setField(term81897, term81897.getClass(), "regexps", null);
        setField(term81897, term81897.getClass(), "itsVariables", null);
        setField(term81897, term81897.getClass(), "itsConst", null);
        setField(term81897, term81897.getClass(), "itsVariableNames", null);
        setIntField(term81897, term81897.getClass(), "varStart", 0);
        setField(term81897, term81897.getClass(), "compilerData", null);
        setIntField(term81897, term81897.getClass(), "type", 0);
        setIntField(term81898, term81898.getClass(), "type", 0);
        setField(term81898, term81898.getClass(), "next", null);
        setField(term81898, term81898.getClass(), "first", null);
        setField(term81898, term81898.getClass(), "last", null);
        setField(term81898, term81898.getClass(), "propListHead", null);
        setIntField(term81898, term81898.getClass(), "sourcePosition", 0);
        setField(term81898, term81898.getClass(), "jsType", null);
        setField(term81898, term81898.getClass(), "parent", null);
        setField(term81897, term81897.getClass(), "next", term81898);
        setField(term81897, term81897.getClass(), "first", null);
        setField(term81897, term81897.getClass(), "last", null);
        setField(term81897, term81897.getClass(), "propListHead", null);
        setIntField(term81897, term81897.getClass(), "sourcePosition", 0);
        setField(term81897, term81897.getClass(), "jsType", null);
        setField(term81897, term81897.getClass(), "parent", null);
        setField(term81896, term81896.getClass(), "first", term81897);
        setField(term81896, term81896.getClass(), "last", null);
        setField(term81896, term81896.getClass(), "propListHead", null);
        setIntField(term81896, term81896.getClass(), "sourcePosition", 0);
        setField(term81896, term81896.getClass(), "jsType", null);
        setField(term81896, term81896.getClass(), "parent", null);
        term81832 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81832, term81832.getClass(), "functionName", null);
        setBooleanField(term81832, term81832.getClass(), "itsNeedsActivation", false);
        setIntField(term81832, term81832.getClass(), "itsFunctionType", 0);
        setBooleanField(term81832, term81832.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81832, term81832.getClass(), "encodedSourceStart", 0);
        setIntField(term81832, term81832.getClass(), "encodedSourceEnd", 0);
        setField(term81832, term81832.getClass(), "sourceName", null);
        setIntField(term81832, term81832.getClass(), "baseLineno", 0);
        setIntField(term81832, term81832.getClass(), "endLineno", 0);
        setField(term81832, term81832.getClass(), "functions", null);
        setField(term81832, term81832.getClass(), "regexps", null);
        setField(term81832, term81832.getClass(), "itsVariables", null);
        setField(term81832, term81832.getClass(), "itsConst", null);
        setField(term81832, term81832.getClass(), "itsVariableNames", null);
        setIntField(term81832, term81832.getClass(), "varStart", 0);
        setField(term81832, term81832.getClass(), "compilerData", null);
        setIntField(term81832, term81832.getClass(), "type", 11);
        setField(term81832, term81832.getClass(), "next", null);
        setField(term81842, term81842.getClass(), "functionName", null);
        setBooleanField(term81842, term81842.getClass(), "itsNeedsActivation", false);
        setIntField(term81842, term81842.getClass(), "itsFunctionType", 0);
        setBooleanField(term81842, term81842.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81842, term81842.getClass(), "encodedSourceStart", 0);
        setIntField(term81842, term81842.getClass(), "encodedSourceEnd", 0);
        setField(term81842, term81842.getClass(), "sourceName", null);
        setIntField(term81842, term81842.getClass(), "baseLineno", 0);
        setIntField(term81842, term81842.getClass(), "endLineno", 0);
        setField(term81842, term81842.getClass(), "functions", null);
        setField(term81842, term81842.getClass(), "regexps", null);
        setField(term81842, term81842.getClass(), "itsVariables", null);
        setField(term81842, term81842.getClass(), "itsConst", null);
        setField(term81842, term81842.getClass(), "itsVariableNames", null);
        setIntField(term81842, term81842.getClass(), "varStart", 0);
        setField(term81842, term81842.getClass(), "compilerData", null);
        setIntField(term81842, term81842.getClass(), "type", 0);
        setIntField(term81852, term81852.getClass(), "type", 0);
        setField(term81852, term81852.getClass(), "next", null);
        setField(term81852, term81852.getClass(), "first", null);
        setField(term81852, term81852.getClass(), "last", null);
        setField(term81852, term81852.getClass(), "propListHead", null);
        setIntField(term81852, term81852.getClass(), "sourcePosition", 0);
        setField(term81852, term81852.getClass(), "jsType", null);
        setField(term81852, term81852.getClass(), "parent", null);
        setField(term81842, term81842.getClass(), "next", term81852);
        setField(term81842, term81842.getClass(), "first", null);
        setField(term81842, term81842.getClass(), "last", null);
        setField(term81842, term81842.getClass(), "propListHead", null);
        setIntField(term81842, term81842.getClass(), "sourcePosition", 0);
        setField(term81842, term81842.getClass(), "jsType", null);
        setField(term81842, term81842.getClass(), "parent", null);
        setField(term81832, term81832.getClass(), "first", term81842);
        setField(term81832, term81832.getClass(), "last", null);
        setField(term81832, term81832.getClass(), "propListHead", null);
        setIntField(term81832, term81832.getClass(), "sourcePosition", 0);
        setField(term81832, term81832.getClass(), "jsType", null);
        setField(term81832, term81832.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term68909;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term68823, args);
        assertTrue(recursiveEquals(term68823, term81895));
        assertTrue(recursiveEquals(term68909, term81896));
        assertTrue(recursiveEquals(retValue, term81832));
    }

};


