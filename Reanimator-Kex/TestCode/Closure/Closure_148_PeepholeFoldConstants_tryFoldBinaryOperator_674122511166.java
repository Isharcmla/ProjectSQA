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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30577;
     Object term30663;
     Object term30937;
     Object term30938;
     Object term30873;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30577 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term30663 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term30749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term30819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30749, term30749.getClass(), "next", term30819);
        setField(term30663, term30663.getClass(), "first", term30749);
        setIntField(term30663, term30663.getClass(), "type", 86);
        term30937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term30937, term30937.getClass(), "currentTraversal", null);
        term30938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term30939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term30940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30938, term30938.getClass(), "functionName", null);
        setBooleanField(term30938, term30938.getClass(), "itsNeedsActivation", false);
        setIntField(term30938, term30938.getClass(), "itsFunctionType", 0);
        setBooleanField(term30938, term30938.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30938, term30938.getClass(), "encodedSourceStart", 0);
        setIntField(term30938, term30938.getClass(), "encodedSourceEnd", 0);
        setField(term30938, term30938.getClass(), "sourceName", null);
        setIntField(term30938, term30938.getClass(), "baseLineno", 0);
        setIntField(term30938, term30938.getClass(), "endLineno", 0);
        setField(term30938, term30938.getClass(), "functions", null);
        setField(term30938, term30938.getClass(), "regexps", null);
        setField(term30938, term30938.getClass(), "itsVariables", null);
        setField(term30938, term30938.getClass(), "itsConst", null);
        setField(term30938, term30938.getClass(), "itsVariableNames", null);
        setIntField(term30938, term30938.getClass(), "varStart", 0);
        setField(term30938, term30938.getClass(), "compilerData", null);
        setIntField(term30938, term30938.getClass(), "type", 86);
        setField(term30938, term30938.getClass(), "next", null);
        setField(term30939, term30939.getClass(), "functionName", null);
        setBooleanField(term30939, term30939.getClass(), "itsNeedsActivation", false);
        setIntField(term30939, term30939.getClass(), "itsFunctionType", 0);
        setBooleanField(term30939, term30939.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30939, term30939.getClass(), "encodedSourceStart", 0);
        setIntField(term30939, term30939.getClass(), "encodedSourceEnd", 0);
        setField(term30939, term30939.getClass(), "sourceName", null);
        setIntField(term30939, term30939.getClass(), "baseLineno", 0);
        setIntField(term30939, term30939.getClass(), "endLineno", 0);
        setField(term30939, term30939.getClass(), "functions", null);
        setField(term30939, term30939.getClass(), "regexps", null);
        setField(term30939, term30939.getClass(), "itsVariables", null);
        setField(term30939, term30939.getClass(), "itsConst", null);
        setField(term30939, term30939.getClass(), "itsVariableNames", null);
        setIntField(term30939, term30939.getClass(), "varStart", 0);
        setField(term30939, term30939.getClass(), "compilerData", null);
        setIntField(term30939, term30939.getClass(), "type", 0);
        setIntField(term30940, term30940.getClass(), "type", 0);
        setField(term30940, term30940.getClass(), "next", null);
        setField(term30940, term30940.getClass(), "first", null);
        setField(term30940, term30940.getClass(), "last", null);
        setField(term30940, term30940.getClass(), "propListHead", null);
        setIntField(term30940, term30940.getClass(), "sourcePosition", 0);
        setField(term30940, term30940.getClass(), "jsType", null);
        setField(term30940, term30940.getClass(), "parent", null);
        setField(term30939, term30939.getClass(), "next", term30940);
        setField(term30939, term30939.getClass(), "first", null);
        setField(term30939, term30939.getClass(), "last", null);
        setField(term30939, term30939.getClass(), "propListHead", null);
        setIntField(term30939, term30939.getClass(), "sourcePosition", 0);
        setField(term30939, term30939.getClass(), "jsType", null);
        setField(term30939, term30939.getClass(), "parent", null);
        setField(term30938, term30938.getClass(), "first", term30939);
        setField(term30938, term30938.getClass(), "last", null);
        setField(term30938, term30938.getClass(), "propListHead", null);
        setIntField(term30938, term30938.getClass(), "sourcePosition", 0);
        setField(term30938, term30938.getClass(), "jsType", null);
        setField(term30938, term30938.getClass(), "parent", null);
        term30873 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term30883 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term30893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30873, term30873.getClass(), "functionName", null);
        setBooleanField(term30873, term30873.getClass(), "itsNeedsActivation", false);
        setIntField(term30873, term30873.getClass(), "itsFunctionType", 0);
        setBooleanField(term30873, term30873.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30873, term30873.getClass(), "encodedSourceStart", 0);
        setIntField(term30873, term30873.getClass(), "encodedSourceEnd", 0);
        setField(term30873, term30873.getClass(), "sourceName", null);
        setIntField(term30873, term30873.getClass(), "baseLineno", 0);
        setIntField(term30873, term30873.getClass(), "endLineno", 0);
        setField(term30873, term30873.getClass(), "functions", null);
        setField(term30873, term30873.getClass(), "regexps", null);
        setField(term30873, term30873.getClass(), "itsVariables", null);
        setField(term30873, term30873.getClass(), "itsConst", null);
        setField(term30873, term30873.getClass(), "itsVariableNames", null);
        setIntField(term30873, term30873.getClass(), "varStart", 0);
        setField(term30873, term30873.getClass(), "compilerData", null);
        setIntField(term30873, term30873.getClass(), "type", 86);
        setField(term30873, term30873.getClass(), "next", null);
        setField(term30883, term30883.getClass(), "functionName", null);
        setBooleanField(term30883, term30883.getClass(), "itsNeedsActivation", false);
        setIntField(term30883, term30883.getClass(), "itsFunctionType", 0);
        setBooleanField(term30883, term30883.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30883, term30883.getClass(), "encodedSourceStart", 0);
        setIntField(term30883, term30883.getClass(), "encodedSourceEnd", 0);
        setField(term30883, term30883.getClass(), "sourceName", null);
        setIntField(term30883, term30883.getClass(), "baseLineno", 0);
        setIntField(term30883, term30883.getClass(), "endLineno", 0);
        setField(term30883, term30883.getClass(), "functions", null);
        setField(term30883, term30883.getClass(), "regexps", null);
        setField(term30883, term30883.getClass(), "itsVariables", null);
        setField(term30883, term30883.getClass(), "itsConst", null);
        setField(term30883, term30883.getClass(), "itsVariableNames", null);
        setIntField(term30883, term30883.getClass(), "varStart", 0);
        setField(term30883, term30883.getClass(), "compilerData", null);
        setIntField(term30883, term30883.getClass(), "type", 0);
        setIntField(term30893, term30893.getClass(), "type", 0);
        setField(term30893, term30893.getClass(), "next", null);
        setField(term30893, term30893.getClass(), "first", null);
        setField(term30893, term30893.getClass(), "last", null);
        setField(term30893, term30893.getClass(), "propListHead", null);
        setIntField(term30893, term30893.getClass(), "sourcePosition", 0);
        setField(term30893, term30893.getClass(), "jsType", null);
        setField(term30893, term30893.getClass(), "parent", null);
        setField(term30883, term30883.getClass(), "next", term30893);
        setField(term30883, term30883.getClass(), "first", null);
        setField(term30883, term30883.getClass(), "last", null);
        setField(term30883, term30883.getClass(), "propListHead", null);
        setIntField(term30883, term30883.getClass(), "sourcePosition", 0);
        setField(term30883, term30883.getClass(), "jsType", null);
        setField(term30883, term30883.getClass(), "parent", null);
        setField(term30873, term30873.getClass(), "first", term30883);
        setField(term30873, term30873.getClass(), "last", null);
        setField(term30873, term30873.getClass(), "propListHead", null);
        setIntField(term30873, term30873.getClass(), "sourcePosition", 0);
        setField(term30873, term30873.getClass(), "jsType", null);
        setField(term30873, term30873.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30663;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term30577, args);
        assertTrue(recursiveEquals(term30577, term30937));
        assertTrue(recursiveEquals(term30663, term30938));
        assertTrue(recursiveEquals(retValue, term30873));
    }

};


