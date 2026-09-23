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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281295;
     Object term281387;
     Object term281822;
     Object term281823;
     Object term281729;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281295 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term281387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term281473 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term281559 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term281473, term281473.getClass(), "next", term281559);
        setIntField(term281473, term281473.getClass(), "type", 0);
        setField(term281387, term281387.getClass(), "first", term281473);
        setIntField(term281387, term281387.getClass(), "type", 101);
        setField(term281387, term281387.getClass(), "parent", null);
        term281822 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term281822, term281822.getClass(), "currentTraversal", null);
        term281823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term281824 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term281825 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term281823, term281823.getClass(), "str", null);
        setIntField(term281823, term281823.getClass(), "type", 101);
        setField(term281823, term281823.getClass(), "next", null);
        setField(term281824, term281824.getClass(), "functionName", null);
        setBooleanField(term281824, term281824.getClass(), "itsNeedsActivation", false);
        setIntField(term281824, term281824.getClass(), "itsFunctionType", 0);
        setBooleanField(term281824, term281824.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term281824, term281824.getClass(), "encodedSourceStart", 0);
        setIntField(term281824, term281824.getClass(), "encodedSourceEnd", 0);
        setField(term281824, term281824.getClass(), "sourceName", null);
        setIntField(term281824, term281824.getClass(), "baseLineno", 0);
        setIntField(term281824, term281824.getClass(), "endLineno", 0);
        setField(term281824, term281824.getClass(), "functions", null);
        setField(term281824, term281824.getClass(), "regexps", null);
        setField(term281824, term281824.getClass(), "itsVariables", null);
        setField(term281824, term281824.getClass(), "itsConst", null);
        setField(term281824, term281824.getClass(), "itsVariableNames", null);
        setIntField(term281824, term281824.getClass(), "varStart", 0);
        setField(term281824, term281824.getClass(), "compilerData", null);
        setIntField(term281824, term281824.getClass(), "type", 0);
        setField(term281825, term281825.getClass(), "functionName", null);
        setBooleanField(term281825, term281825.getClass(), "itsNeedsActivation", false);
        setIntField(term281825, term281825.getClass(), "itsFunctionType", 0);
        setBooleanField(term281825, term281825.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term281825, term281825.getClass(), "encodedSourceStart", 0);
        setIntField(term281825, term281825.getClass(), "encodedSourceEnd", 0);
        setField(term281825, term281825.getClass(), "sourceName", null);
        setIntField(term281825, term281825.getClass(), "baseLineno", 0);
        setIntField(term281825, term281825.getClass(), "endLineno", 0);
        setField(term281825, term281825.getClass(), "functions", null);
        setField(term281825, term281825.getClass(), "regexps", null);
        setField(term281825, term281825.getClass(), "itsVariables", null);
        setField(term281825, term281825.getClass(), "itsConst", null);
        setField(term281825, term281825.getClass(), "itsVariableNames", null);
        setIntField(term281825, term281825.getClass(), "varStart", 0);
        setField(term281825, term281825.getClass(), "compilerData", null);
        setIntField(term281825, term281825.getClass(), "type", 0);
        setField(term281825, term281825.getClass(), "next", null);
        setField(term281825, term281825.getClass(), "first", null);
        setField(term281825, term281825.getClass(), "last", null);
        setField(term281825, term281825.getClass(), "propListHead", null);
        setIntField(term281825, term281825.getClass(), "sourcePosition", 0);
        setField(term281825, term281825.getClass(), "jsType", null);
        setField(term281825, term281825.getClass(), "parent", null);
        setField(term281824, term281824.getClass(), "next", term281825);
        setField(term281824, term281824.getClass(), "first", null);
        setField(term281824, term281824.getClass(), "last", null);
        setField(term281824, term281824.getClass(), "propListHead", null);
        setIntField(term281824, term281824.getClass(), "sourcePosition", 0);
        setField(term281824, term281824.getClass(), "jsType", null);
        setField(term281824, term281824.getClass(), "parent", null);
        setField(term281823, term281823.getClass(), "first", term281824);
        setField(term281823, term281823.getClass(), "last", null);
        setField(term281823, term281823.getClass(), "propListHead", null);
        setIntField(term281823, term281823.getClass(), "sourcePosition", 0);
        setField(term281823, term281823.getClass(), "jsType", null);
        setField(term281823, term281823.getClass(), "parent", null);
        term281729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term281731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term281741 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term281729, term281729.getClass(), "str", null);
        setIntField(term281729, term281729.getClass(), "type", 101);
        setField(term281729, term281729.getClass(), "next", null);
        setField(term281731, term281731.getClass(), "functionName", null);
        setBooleanField(term281731, term281731.getClass(), "itsNeedsActivation", false);
        setIntField(term281731, term281731.getClass(), "itsFunctionType", 0);
        setBooleanField(term281731, term281731.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term281731, term281731.getClass(), "encodedSourceStart", 0);
        setIntField(term281731, term281731.getClass(), "encodedSourceEnd", 0);
        setField(term281731, term281731.getClass(), "sourceName", null);
        setIntField(term281731, term281731.getClass(), "baseLineno", 0);
        setIntField(term281731, term281731.getClass(), "endLineno", 0);
        setField(term281731, term281731.getClass(), "functions", null);
        setField(term281731, term281731.getClass(), "regexps", null);
        setField(term281731, term281731.getClass(), "itsVariables", null);
        setField(term281731, term281731.getClass(), "itsConst", null);
        setField(term281731, term281731.getClass(), "itsVariableNames", null);
        setIntField(term281731, term281731.getClass(), "varStart", 0);
        setField(term281731, term281731.getClass(), "compilerData", null);
        setIntField(term281731, term281731.getClass(), "type", 0);
        setField(term281741, term281741.getClass(), "functionName", null);
        setBooleanField(term281741, term281741.getClass(), "itsNeedsActivation", false);
        setIntField(term281741, term281741.getClass(), "itsFunctionType", 0);
        setBooleanField(term281741, term281741.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term281741, term281741.getClass(), "encodedSourceStart", 0);
        setIntField(term281741, term281741.getClass(), "encodedSourceEnd", 0);
        setField(term281741, term281741.getClass(), "sourceName", null);
        setIntField(term281741, term281741.getClass(), "baseLineno", 0);
        setIntField(term281741, term281741.getClass(), "endLineno", 0);
        setField(term281741, term281741.getClass(), "functions", null);
        setField(term281741, term281741.getClass(), "regexps", null);
        setField(term281741, term281741.getClass(), "itsVariables", null);
        setField(term281741, term281741.getClass(), "itsConst", null);
        setField(term281741, term281741.getClass(), "itsVariableNames", null);
        setIntField(term281741, term281741.getClass(), "varStart", 0);
        setField(term281741, term281741.getClass(), "compilerData", null);
        setIntField(term281741, term281741.getClass(), "type", 0);
        setField(term281741, term281741.getClass(), "next", null);
        setField(term281741, term281741.getClass(), "first", null);
        setField(term281741, term281741.getClass(), "last", null);
        setField(term281741, term281741.getClass(), "propListHead", null);
        setIntField(term281741, term281741.getClass(), "sourcePosition", 0);
        setField(term281741, term281741.getClass(), "jsType", null);
        setField(term281741, term281741.getClass(), "parent", null);
        setField(term281731, term281731.getClass(), "next", term281741);
        setField(term281731, term281731.getClass(), "first", null);
        setField(term281731, term281731.getClass(), "last", null);
        setField(term281731, term281731.getClass(), "propListHead", null);
        setIntField(term281731, term281731.getClass(), "sourcePosition", 0);
        setField(term281731, term281731.getClass(), "jsType", null);
        setField(term281731, term281731.getClass(), "parent", null);
        setField(term281729, term281729.getClass(), "first", term281731);
        setField(term281729, term281729.getClass(), "last", null);
        setField(term281729, term281729.getClass(), "propListHead", null);
        setIntField(term281729, term281729.getClass(), "sourcePosition", 0);
        setField(term281729, term281729.getClass(), "jsType", null);
        setField(term281729, term281729.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term281387;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term281295, args);
        assertTrue(recursiveEquals(term281295, term281822));
        assertTrue(recursiveEquals(term281387, term281823));
        assertTrue(recursiveEquals(retValue, term281729));
    }

};


