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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170820;
     Object term170906;
     Object term172002;
     Object term172003;
     Object term171923;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170820 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term170906 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term170992 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171084 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term171084, term171084.getClass(), "type", 42);
        setField(term170992, term170992.getClass(), "next", term171084);
        setIntField(term170992, term170992.getClass(), "type", 42);
        setField(term170906, term170906.getClass(), "first", term170992);
        setIntField(term170906, term170906.getClass(), "type", 16);
        term172002 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term172002, term172002.getClass(), "currentTraversal", null);
        term172003 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172004 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172005 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term172003, term172003.getClass(), "functionName", null);
        setBooleanField(term172003, term172003.getClass(), "itsNeedsActivation", false);
        setIntField(term172003, term172003.getClass(), "itsFunctionType", 0);
        setBooleanField(term172003, term172003.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term172003, term172003.getClass(), "encodedSourceStart", 0);
        setIntField(term172003, term172003.getClass(), "encodedSourceEnd", 0);
        setField(term172003, term172003.getClass(), "sourceName", null);
        setIntField(term172003, term172003.getClass(), "baseLineno", 0);
        setIntField(term172003, term172003.getClass(), "endLineno", 0);
        setField(term172003, term172003.getClass(), "functions", null);
        setField(term172003, term172003.getClass(), "regexps", null);
        setField(term172003, term172003.getClass(), "itsVariables", null);
        setField(term172003, term172003.getClass(), "itsConst", null);
        setField(term172003, term172003.getClass(), "itsVariableNames", null);
        setIntField(term172003, term172003.getClass(), "varStart", 0);
        setField(term172003, term172003.getClass(), "compilerData", null);
        setIntField(term172003, term172003.getClass(), "type", 16);
        setField(term172003, term172003.getClass(), "next", null);
        setField(term172004, term172004.getClass(), "functionName", null);
        setBooleanField(term172004, term172004.getClass(), "itsNeedsActivation", false);
        setIntField(term172004, term172004.getClass(), "itsFunctionType", 0);
        setBooleanField(term172004, term172004.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term172004, term172004.getClass(), "encodedSourceStart", 0);
        setIntField(term172004, term172004.getClass(), "encodedSourceEnd", 0);
        setField(term172004, term172004.getClass(), "sourceName", null);
        setIntField(term172004, term172004.getClass(), "baseLineno", 0);
        setIntField(term172004, term172004.getClass(), "endLineno", 0);
        setField(term172004, term172004.getClass(), "functions", null);
        setField(term172004, term172004.getClass(), "regexps", null);
        setField(term172004, term172004.getClass(), "itsVariables", null);
        setField(term172004, term172004.getClass(), "itsConst", null);
        setField(term172004, term172004.getClass(), "itsVariableNames", null);
        setIntField(term172004, term172004.getClass(), "varStart", 0);
        setField(term172004, term172004.getClass(), "compilerData", null);
        setIntField(term172004, term172004.getClass(), "type", 42);
        setDoubleField(term172005, term172005.getClass(), "number", 0.0);
        setIntField(term172005, term172005.getClass(), "type", 42);
        setField(term172005, term172005.getClass(), "next", null);
        setField(term172005, term172005.getClass(), "first", null);
        setField(term172005, term172005.getClass(), "last", null);
        setField(term172005, term172005.getClass(), "propListHead", null);
        setIntField(term172005, term172005.getClass(), "sourcePosition", 0);
        setField(term172005, term172005.getClass(), "jsType", null);
        setField(term172005, term172005.getClass(), "parent", null);
        setField(term172004, term172004.getClass(), "next", term172005);
        setField(term172004, term172004.getClass(), "first", null);
        setField(term172004, term172004.getClass(), "last", null);
        setField(term172004, term172004.getClass(), "propListHead", null);
        setIntField(term172004, term172004.getClass(), "sourcePosition", 0);
        setField(term172004, term172004.getClass(), "jsType", null);
        setField(term172004, term172004.getClass(), "parent", null);
        setField(term172003, term172003.getClass(), "first", term172004);
        setField(term172003, term172003.getClass(), "last", null);
        setField(term172003, term172003.getClass(), "propListHead", null);
        setIntField(term172003, term172003.getClass(), "sourcePosition", 0);
        setField(term172003, term172003.getClass(), "jsType", null);
        setField(term172003, term172003.getClass(), "parent", null);
        term171923 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171933 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171943 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term171923, term171923.getClass(), "functionName", null);
        setBooleanField(term171923, term171923.getClass(), "itsNeedsActivation", false);
        setIntField(term171923, term171923.getClass(), "itsFunctionType", 0);
        setBooleanField(term171923, term171923.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term171923, term171923.getClass(), "encodedSourceStart", 0);
        setIntField(term171923, term171923.getClass(), "encodedSourceEnd", 0);
        setField(term171923, term171923.getClass(), "sourceName", null);
        setIntField(term171923, term171923.getClass(), "baseLineno", 0);
        setIntField(term171923, term171923.getClass(), "endLineno", 0);
        setField(term171923, term171923.getClass(), "functions", null);
        setField(term171923, term171923.getClass(), "regexps", null);
        setField(term171923, term171923.getClass(), "itsVariables", null);
        setField(term171923, term171923.getClass(), "itsConst", null);
        setField(term171923, term171923.getClass(), "itsVariableNames", null);
        setIntField(term171923, term171923.getClass(), "varStart", 0);
        setField(term171923, term171923.getClass(), "compilerData", null);
        setIntField(term171923, term171923.getClass(), "type", 16);
        setField(term171923, term171923.getClass(), "next", null);
        setField(term171933, term171933.getClass(), "functionName", null);
        setBooleanField(term171933, term171933.getClass(), "itsNeedsActivation", false);
        setIntField(term171933, term171933.getClass(), "itsFunctionType", 0);
        setBooleanField(term171933, term171933.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term171933, term171933.getClass(), "encodedSourceStart", 0);
        setIntField(term171933, term171933.getClass(), "encodedSourceEnd", 0);
        setField(term171933, term171933.getClass(), "sourceName", null);
        setIntField(term171933, term171933.getClass(), "baseLineno", 0);
        setIntField(term171933, term171933.getClass(), "endLineno", 0);
        setField(term171933, term171933.getClass(), "functions", null);
        setField(term171933, term171933.getClass(), "regexps", null);
        setField(term171933, term171933.getClass(), "itsVariables", null);
        setField(term171933, term171933.getClass(), "itsConst", null);
        setField(term171933, term171933.getClass(), "itsVariableNames", null);
        setIntField(term171933, term171933.getClass(), "varStart", 0);
        setField(term171933, term171933.getClass(), "compilerData", null);
        setIntField(term171933, term171933.getClass(), "type", 42);
        setDoubleField(term171943, term171943.getClass(), "number", 0.0);
        setIntField(term171943, term171943.getClass(), "type", 42);
        setField(term171943, term171943.getClass(), "next", null);
        setField(term171943, term171943.getClass(), "first", null);
        setField(term171943, term171943.getClass(), "last", null);
        setField(term171943, term171943.getClass(), "propListHead", null);
        setIntField(term171943, term171943.getClass(), "sourcePosition", 0);
        setField(term171943, term171943.getClass(), "jsType", null);
        setField(term171943, term171943.getClass(), "parent", null);
        setField(term171933, term171933.getClass(), "next", term171943);
        setField(term171933, term171933.getClass(), "first", null);
        setField(term171933, term171933.getClass(), "last", null);
        setField(term171933, term171933.getClass(), "propListHead", null);
        setIntField(term171933, term171933.getClass(), "sourcePosition", 0);
        setField(term171933, term171933.getClass(), "jsType", null);
        setField(term171933, term171933.getClass(), "parent", null);
        setField(term171923, term171923.getClass(), "first", term171933);
        setField(term171923, term171923.getClass(), "last", null);
        setField(term171923, term171923.getClass(), "propListHead", null);
        setIntField(term171923, term171923.getClass(), "sourcePosition", 0);
        setField(term171923, term171923.getClass(), "jsType", null);
        setField(term171923, term171923.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term170906;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term170820, args);
        assertTrue(recursiveEquals(term170820, term172002));
        assertTrue(recursiveEquals(term170906, term172003));
        assertTrue(recursiveEquals(retValue, term171923));
    }

};


