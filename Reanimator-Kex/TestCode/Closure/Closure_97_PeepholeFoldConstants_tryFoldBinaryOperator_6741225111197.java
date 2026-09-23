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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365276;
     Object term365362;
     Object term365937;
     Object term365938;
     Object term365872;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365276 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term365362 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365448 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365540 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term365448, term365448.getClass(), "next", term365540);
        setIntField(term365448, term365448.getClass(), "type", 39);
        setField(term365362, term365362.getClass(), "first", term365448);
        setIntField(term365362, term365362.getClass(), "type", 11);
        term365937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term365937, term365937.getClass(), "currentTraversal", null);
        term365938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term365938, term365938.getClass(), "functionName", null);
        setBooleanField(term365938, term365938.getClass(), "itsNeedsActivation", false);
        setIntField(term365938, term365938.getClass(), "itsFunctionType", 0);
        setBooleanField(term365938, term365938.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term365938, term365938.getClass(), "encodedSourceStart", 0);
        setIntField(term365938, term365938.getClass(), "encodedSourceEnd", 0);
        setField(term365938, term365938.getClass(), "sourceName", null);
        setIntField(term365938, term365938.getClass(), "baseLineno", 0);
        setIntField(term365938, term365938.getClass(), "endLineno", 0);
        setField(term365938, term365938.getClass(), "functions", null);
        setField(term365938, term365938.getClass(), "regexps", null);
        setField(term365938, term365938.getClass(), "itsVariables", null);
        setField(term365938, term365938.getClass(), "itsConst", null);
        setField(term365938, term365938.getClass(), "itsVariableNames", null);
        setIntField(term365938, term365938.getClass(), "varStart", 0);
        setField(term365938, term365938.getClass(), "compilerData", null);
        setIntField(term365938, term365938.getClass(), "type", 11);
        setField(term365938, term365938.getClass(), "next", null);
        setField(term365939, term365939.getClass(), "functionName", null);
        setBooleanField(term365939, term365939.getClass(), "itsNeedsActivation", false);
        setIntField(term365939, term365939.getClass(), "itsFunctionType", 0);
        setBooleanField(term365939, term365939.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term365939, term365939.getClass(), "encodedSourceStart", 0);
        setIntField(term365939, term365939.getClass(), "encodedSourceEnd", 0);
        setField(term365939, term365939.getClass(), "sourceName", null);
        setIntField(term365939, term365939.getClass(), "baseLineno", 0);
        setIntField(term365939, term365939.getClass(), "endLineno", 0);
        setField(term365939, term365939.getClass(), "functions", null);
        setField(term365939, term365939.getClass(), "regexps", null);
        setField(term365939, term365939.getClass(), "itsVariables", null);
        setField(term365939, term365939.getClass(), "itsConst", null);
        setField(term365939, term365939.getClass(), "itsVariableNames", null);
        setIntField(term365939, term365939.getClass(), "varStart", 0);
        setField(term365939, term365939.getClass(), "compilerData", null);
        setIntField(term365939, term365939.getClass(), "type", 39);
        setField(term365940, term365940.getClass(), "str", null);
        setIntField(term365940, term365940.getClass(), "type", 0);
        setField(term365940, term365940.getClass(), "next", null);
        setField(term365940, term365940.getClass(), "first", null);
        setField(term365940, term365940.getClass(), "last", null);
        setField(term365940, term365940.getClass(), "propListHead", null);
        setIntField(term365940, term365940.getClass(), "sourcePosition", 0);
        setField(term365940, term365940.getClass(), "jsType", null);
        setField(term365940, term365940.getClass(), "parent", null);
        setField(term365939, term365939.getClass(), "next", term365940);
        setField(term365939, term365939.getClass(), "first", null);
        setField(term365939, term365939.getClass(), "last", null);
        setField(term365939, term365939.getClass(), "propListHead", null);
        setIntField(term365939, term365939.getClass(), "sourcePosition", 0);
        setField(term365939, term365939.getClass(), "jsType", null);
        setField(term365939, term365939.getClass(), "parent", null);
        setField(term365938, term365938.getClass(), "first", term365939);
        setField(term365938, term365938.getClass(), "last", null);
        setField(term365938, term365938.getClass(), "propListHead", null);
        setIntField(term365938, term365938.getClass(), "sourcePosition", 0);
        setField(term365938, term365938.getClass(), "jsType", null);
        setField(term365938, term365938.getClass(), "parent", null);
        term365872 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365882 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term365872, term365872.getClass(), "functionName", null);
        setBooleanField(term365872, term365872.getClass(), "itsNeedsActivation", false);
        setIntField(term365872, term365872.getClass(), "itsFunctionType", 0);
        setBooleanField(term365872, term365872.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term365872, term365872.getClass(), "encodedSourceStart", 0);
        setIntField(term365872, term365872.getClass(), "encodedSourceEnd", 0);
        setField(term365872, term365872.getClass(), "sourceName", null);
        setIntField(term365872, term365872.getClass(), "baseLineno", 0);
        setIntField(term365872, term365872.getClass(), "endLineno", 0);
        setField(term365872, term365872.getClass(), "functions", null);
        setField(term365872, term365872.getClass(), "regexps", null);
        setField(term365872, term365872.getClass(), "itsVariables", null);
        setField(term365872, term365872.getClass(), "itsConst", null);
        setField(term365872, term365872.getClass(), "itsVariableNames", null);
        setIntField(term365872, term365872.getClass(), "varStart", 0);
        setField(term365872, term365872.getClass(), "compilerData", null);
        setIntField(term365872, term365872.getClass(), "type", 11);
        setField(term365872, term365872.getClass(), "next", null);
        setField(term365882, term365882.getClass(), "functionName", null);
        setBooleanField(term365882, term365882.getClass(), "itsNeedsActivation", false);
        setIntField(term365882, term365882.getClass(), "itsFunctionType", 0);
        setBooleanField(term365882, term365882.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term365882, term365882.getClass(), "encodedSourceStart", 0);
        setIntField(term365882, term365882.getClass(), "encodedSourceEnd", 0);
        setField(term365882, term365882.getClass(), "sourceName", null);
        setIntField(term365882, term365882.getClass(), "baseLineno", 0);
        setIntField(term365882, term365882.getClass(), "endLineno", 0);
        setField(term365882, term365882.getClass(), "functions", null);
        setField(term365882, term365882.getClass(), "regexps", null);
        setField(term365882, term365882.getClass(), "itsVariables", null);
        setField(term365882, term365882.getClass(), "itsConst", null);
        setField(term365882, term365882.getClass(), "itsVariableNames", null);
        setIntField(term365882, term365882.getClass(), "varStart", 0);
        setField(term365882, term365882.getClass(), "compilerData", null);
        setIntField(term365882, term365882.getClass(), "type", 39);
        setField(term365892, term365892.getClass(), "str", null);
        setIntField(term365892, term365892.getClass(), "type", 0);
        setField(term365892, term365892.getClass(), "next", null);
        setField(term365892, term365892.getClass(), "first", null);
        setField(term365892, term365892.getClass(), "last", null);
        setField(term365892, term365892.getClass(), "propListHead", null);
        setIntField(term365892, term365892.getClass(), "sourcePosition", 0);
        setField(term365892, term365892.getClass(), "jsType", null);
        setField(term365892, term365892.getClass(), "parent", null);
        setField(term365882, term365882.getClass(), "next", term365892);
        setField(term365882, term365882.getClass(), "first", null);
        setField(term365882, term365882.getClass(), "last", null);
        setField(term365882, term365882.getClass(), "propListHead", null);
        setIntField(term365882, term365882.getClass(), "sourcePosition", 0);
        setField(term365882, term365882.getClass(), "jsType", null);
        setField(term365882, term365882.getClass(), "parent", null);
        setField(term365872, term365872.getClass(), "first", term365882);
        setField(term365872, term365872.getClass(), "last", null);
        setField(term365872, term365872.getClass(), "propListHead", null);
        setIntField(term365872, term365872.getClass(), "sourcePosition", 0);
        setField(term365872, term365872.getClass(), "jsType", null);
        setField(term365872, term365872.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term365362;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term365276, args);
        assertTrue(recursiveEquals(term365276, term365937));
        assertTrue(recursiveEquals(term365362, term365938));
        assertTrue(recursiveEquals(retValue, term365872));
    }

};


