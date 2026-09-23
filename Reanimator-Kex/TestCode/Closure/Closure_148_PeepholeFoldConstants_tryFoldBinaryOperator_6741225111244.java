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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296502;
     Object term296594;
     Object term296938;
     Object term296939;
     Object term296861;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296502 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term296594 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296772 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term296686, term296686.getClass(), "next", term296772);
        setIntField(term296686, term296686.getClass(), "type", 0);
        setField(term296594, term296594.getClass(), "first", term296686);
        setIntField(term296594, term296594.getClass(), "type", 101);
        setField(term296594, term296594.getClass(), "parent", null);
        term296938 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term296938, term296938.getClass(), "currentTraversal", null);
        term296939 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296941 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term296939, term296939.getClass(), "str", null);
        setIntField(term296939, term296939.getClass(), "type", 101);
        setField(term296939, term296939.getClass(), "next", null);
        setField(term296940, term296940.getClass(), "str", null);
        setIntField(term296940, term296940.getClass(), "type", 0);
        setField(term296941, term296941.getClass(), "functionName", null);
        setBooleanField(term296941, term296941.getClass(), "itsNeedsActivation", false);
        setIntField(term296941, term296941.getClass(), "itsFunctionType", 0);
        setBooleanField(term296941, term296941.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term296941, term296941.getClass(), "encodedSourceStart", 0);
        setIntField(term296941, term296941.getClass(), "encodedSourceEnd", 0);
        setField(term296941, term296941.getClass(), "sourceName", null);
        setIntField(term296941, term296941.getClass(), "baseLineno", 0);
        setIntField(term296941, term296941.getClass(), "endLineno", 0);
        setField(term296941, term296941.getClass(), "functions", null);
        setField(term296941, term296941.getClass(), "regexps", null);
        setField(term296941, term296941.getClass(), "itsVariables", null);
        setField(term296941, term296941.getClass(), "itsConst", null);
        setField(term296941, term296941.getClass(), "itsVariableNames", null);
        setIntField(term296941, term296941.getClass(), "varStart", 0);
        setField(term296941, term296941.getClass(), "compilerData", null);
        setIntField(term296941, term296941.getClass(), "type", 0);
        setField(term296941, term296941.getClass(), "next", null);
        setField(term296941, term296941.getClass(), "first", null);
        setField(term296941, term296941.getClass(), "last", null);
        setField(term296941, term296941.getClass(), "propListHead", null);
        setIntField(term296941, term296941.getClass(), "sourcePosition", 0);
        setField(term296941, term296941.getClass(), "jsType", null);
        setField(term296941, term296941.getClass(), "parent", null);
        setField(term296940, term296940.getClass(), "next", term296941);
        setField(term296940, term296940.getClass(), "first", null);
        setField(term296940, term296940.getClass(), "last", null);
        setField(term296940, term296940.getClass(), "propListHead", null);
        setIntField(term296940, term296940.getClass(), "sourcePosition", 0);
        setField(term296940, term296940.getClass(), "jsType", null);
        setField(term296940, term296940.getClass(), "parent", null);
        setField(term296939, term296939.getClass(), "first", term296940);
        setField(term296939, term296939.getClass(), "last", null);
        setField(term296939, term296939.getClass(), "propListHead", null);
        setIntField(term296939, term296939.getClass(), "sourcePosition", 0);
        setField(term296939, term296939.getClass(), "jsType", null);
        setField(term296939, term296939.getClass(), "parent", null);
        term296861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296863 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296865 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term296861, term296861.getClass(), "str", null);
        setIntField(term296861, term296861.getClass(), "type", 101);
        setField(term296861, term296861.getClass(), "next", null);
        setField(term296863, term296863.getClass(), "str", null);
        setIntField(term296863, term296863.getClass(), "type", 0);
        setField(term296865, term296865.getClass(), "functionName", null);
        setBooleanField(term296865, term296865.getClass(), "itsNeedsActivation", false);
        setIntField(term296865, term296865.getClass(), "itsFunctionType", 0);
        setBooleanField(term296865, term296865.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term296865, term296865.getClass(), "encodedSourceStart", 0);
        setIntField(term296865, term296865.getClass(), "encodedSourceEnd", 0);
        setField(term296865, term296865.getClass(), "sourceName", null);
        setIntField(term296865, term296865.getClass(), "baseLineno", 0);
        setIntField(term296865, term296865.getClass(), "endLineno", 0);
        setField(term296865, term296865.getClass(), "functions", null);
        setField(term296865, term296865.getClass(), "regexps", null);
        setField(term296865, term296865.getClass(), "itsVariables", null);
        setField(term296865, term296865.getClass(), "itsConst", null);
        setField(term296865, term296865.getClass(), "itsVariableNames", null);
        setIntField(term296865, term296865.getClass(), "varStart", 0);
        setField(term296865, term296865.getClass(), "compilerData", null);
        setIntField(term296865, term296865.getClass(), "type", 0);
        setField(term296865, term296865.getClass(), "next", null);
        setField(term296865, term296865.getClass(), "first", null);
        setField(term296865, term296865.getClass(), "last", null);
        setField(term296865, term296865.getClass(), "propListHead", null);
        setIntField(term296865, term296865.getClass(), "sourcePosition", 0);
        setField(term296865, term296865.getClass(), "jsType", null);
        setField(term296865, term296865.getClass(), "parent", null);
        setField(term296863, term296863.getClass(), "next", term296865);
        setField(term296863, term296863.getClass(), "first", null);
        setField(term296863, term296863.getClass(), "last", null);
        setField(term296863, term296863.getClass(), "propListHead", null);
        setIntField(term296863, term296863.getClass(), "sourcePosition", 0);
        setField(term296863, term296863.getClass(), "jsType", null);
        setField(term296863, term296863.getClass(), "parent", null);
        setField(term296861, term296861.getClass(), "first", term296863);
        setField(term296861, term296861.getClass(), "last", null);
        setField(term296861, term296861.getClass(), "propListHead", null);
        setIntField(term296861, term296861.getClass(), "sourcePosition", 0);
        setField(term296861, term296861.getClass(), "jsType", null);
        setField(term296861, term296861.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term296594;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term296502, args);
        assertTrue(recursiveEquals(term296502, term296938));
        assertTrue(recursiveEquals(term296594, term296939));
        assertTrue(recursiveEquals(retValue, term296861));
    }

};


