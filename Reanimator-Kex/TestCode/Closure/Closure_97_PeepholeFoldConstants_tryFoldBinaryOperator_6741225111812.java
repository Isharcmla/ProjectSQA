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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703792;
     Object term703878;
     Object term704183;
     Object term704184;
     Object term704111;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term703792 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term703878 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703964 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704056 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term704056, term704056.getClass(), "type", 40);
        setField(term704056, term704056.getClass(), "str", "");
        setField(term703964, term703964.getClass(), "next", term704056);
        setField(term703878, term703878.getClass(), "first", term703964);
        setIntField(term703878, term703878.getClass(), "type", 33);
        term704183 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term704183, term704183.getClass(), "currentTraversal", null);
        term704184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704185 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704186 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term704184, term704184.getClass(), "functionName", null);
        setBooleanField(term704184, term704184.getClass(), "itsNeedsActivation", false);
        setIntField(term704184, term704184.getClass(), "itsFunctionType", 0);
        setBooleanField(term704184, term704184.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term704184, term704184.getClass(), "encodedSourceStart", 0);
        setIntField(term704184, term704184.getClass(), "encodedSourceEnd", 0);
        setField(term704184, term704184.getClass(), "sourceName", null);
        setIntField(term704184, term704184.getClass(), "baseLineno", 0);
        setIntField(term704184, term704184.getClass(), "endLineno", 0);
        setField(term704184, term704184.getClass(), "functions", null);
        setField(term704184, term704184.getClass(), "regexps", null);
        setField(term704184, term704184.getClass(), "itsVariables", null);
        setField(term704184, term704184.getClass(), "itsConst", null);
        setField(term704184, term704184.getClass(), "itsVariableNames", null);
        setIntField(term704184, term704184.getClass(), "varStart", 0);
        setField(term704184, term704184.getClass(), "compilerData", null);
        setIntField(term704184, term704184.getClass(), "type", 33);
        setField(term704184, term704184.getClass(), "next", null);
        setField(term704185, term704185.getClass(), "functionName", null);
        setBooleanField(term704185, term704185.getClass(), "itsNeedsActivation", false);
        setIntField(term704185, term704185.getClass(), "itsFunctionType", 0);
        setBooleanField(term704185, term704185.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term704185, term704185.getClass(), "encodedSourceStart", 0);
        setIntField(term704185, term704185.getClass(), "encodedSourceEnd", 0);
        setField(term704185, term704185.getClass(), "sourceName", null);
        setIntField(term704185, term704185.getClass(), "baseLineno", 0);
        setIntField(term704185, term704185.getClass(), "endLineno", 0);
        setField(term704185, term704185.getClass(), "functions", null);
        setField(term704185, term704185.getClass(), "regexps", null);
        setField(term704185, term704185.getClass(), "itsVariables", null);
        setField(term704185, term704185.getClass(), "itsConst", null);
        setField(term704185, term704185.getClass(), "itsVariableNames", null);
        setIntField(term704185, term704185.getClass(), "varStart", 0);
        setField(term704185, term704185.getClass(), "compilerData", null);
        setIntField(term704185, term704185.getClass(), "type", 0);
        setField(term704186, term704186.getClass(), "str", "");
        setIntField(term704186, term704186.getClass(), "type", 40);
        setField(term704186, term704186.getClass(), "next", null);
        setField(term704186, term704186.getClass(), "first", null);
        setField(term704186, term704186.getClass(), "last", null);
        setField(term704186, term704186.getClass(), "propListHead", null);
        setIntField(term704186, term704186.getClass(), "sourcePosition", 0);
        setField(term704186, term704186.getClass(), "jsType", null);
        setField(term704186, term704186.getClass(), "parent", null);
        setField(term704185, term704185.getClass(), "next", term704186);
        setField(term704185, term704185.getClass(), "first", null);
        setField(term704185, term704185.getClass(), "last", null);
        setField(term704185, term704185.getClass(), "propListHead", null);
        setIntField(term704185, term704185.getClass(), "sourcePosition", 0);
        setField(term704185, term704185.getClass(), "jsType", null);
        setField(term704185, term704185.getClass(), "parent", null);
        setField(term704184, term704184.getClass(), "first", term704185);
        setField(term704184, term704184.getClass(), "last", null);
        setField(term704184, term704184.getClass(), "propListHead", null);
        setIntField(term704184, term704184.getClass(), "sourcePosition", 0);
        setField(term704184, term704184.getClass(), "jsType", null);
        setField(term704184, term704184.getClass(), "parent", null);
        term704111 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704121 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704131 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term704111, term704111.getClass(), "functionName", null);
        setBooleanField(term704111, term704111.getClass(), "itsNeedsActivation", false);
        setIntField(term704111, term704111.getClass(), "itsFunctionType", 0);
        setBooleanField(term704111, term704111.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term704111, term704111.getClass(), "encodedSourceStart", 0);
        setIntField(term704111, term704111.getClass(), "encodedSourceEnd", 0);
        setField(term704111, term704111.getClass(), "sourceName", null);
        setIntField(term704111, term704111.getClass(), "baseLineno", 0);
        setIntField(term704111, term704111.getClass(), "endLineno", 0);
        setField(term704111, term704111.getClass(), "functions", null);
        setField(term704111, term704111.getClass(), "regexps", null);
        setField(term704111, term704111.getClass(), "itsVariables", null);
        setField(term704111, term704111.getClass(), "itsConst", null);
        setField(term704111, term704111.getClass(), "itsVariableNames", null);
        setIntField(term704111, term704111.getClass(), "varStart", 0);
        setField(term704111, term704111.getClass(), "compilerData", null);
        setIntField(term704111, term704111.getClass(), "type", 33);
        setField(term704111, term704111.getClass(), "next", null);
        setField(term704121, term704121.getClass(), "functionName", null);
        setBooleanField(term704121, term704121.getClass(), "itsNeedsActivation", false);
        setIntField(term704121, term704121.getClass(), "itsFunctionType", 0);
        setBooleanField(term704121, term704121.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term704121, term704121.getClass(), "encodedSourceStart", 0);
        setIntField(term704121, term704121.getClass(), "encodedSourceEnd", 0);
        setField(term704121, term704121.getClass(), "sourceName", null);
        setIntField(term704121, term704121.getClass(), "baseLineno", 0);
        setIntField(term704121, term704121.getClass(), "endLineno", 0);
        setField(term704121, term704121.getClass(), "functions", null);
        setField(term704121, term704121.getClass(), "regexps", null);
        setField(term704121, term704121.getClass(), "itsVariables", null);
        setField(term704121, term704121.getClass(), "itsConst", null);
        setField(term704121, term704121.getClass(), "itsVariableNames", null);
        setIntField(term704121, term704121.getClass(), "varStart", 0);
        setField(term704121, term704121.getClass(), "compilerData", null);
        setIntField(term704121, term704121.getClass(), "type", 0);
        setField(term704131, term704131.getClass(), "str", "");
        setIntField(term704131, term704131.getClass(), "type", 40);
        setField(term704131, term704131.getClass(), "next", null);
        setField(term704131, term704131.getClass(), "first", null);
        setField(term704131, term704131.getClass(), "last", null);
        setField(term704131, term704131.getClass(), "propListHead", null);
        setIntField(term704131, term704131.getClass(), "sourcePosition", 0);
        setField(term704131, term704131.getClass(), "jsType", null);
        setField(term704131, term704131.getClass(), "parent", null);
        setField(term704121, term704121.getClass(), "next", term704131);
        setField(term704121, term704121.getClass(), "first", null);
        setField(term704121, term704121.getClass(), "last", null);
        setField(term704121, term704121.getClass(), "propListHead", null);
        setIntField(term704121, term704121.getClass(), "sourcePosition", 0);
        setField(term704121, term704121.getClass(), "jsType", null);
        setField(term704121, term704121.getClass(), "parent", null);
        setField(term704111, term704111.getClass(), "first", term704121);
        setField(term704111, term704111.getClass(), "last", null);
        setField(term704111, term704111.getClass(), "propListHead", null);
        setIntField(term704111, term704111.getClass(), "sourcePosition", 0);
        setField(term704111, term704111.getClass(), "jsType", null);
        setField(term704111, term704111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term703878;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term703792, args);
        assertTrue(recursiveEquals(term703792, term704183));
        assertTrue(recursiveEquals(term703878, term704184));
        assertTrue(recursiveEquals(retValue, term704111));
    }

};


