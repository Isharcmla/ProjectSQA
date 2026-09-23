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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659071;
     Object term659163;
     Object term659569;
     Object term659570;
     Object term659505;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659071 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term659163 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term659249 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term659341 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term659341, term659341.getClass(), "type", 42);
        setField(term659249, term659249.getClass(), "next", term659341);
        setIntField(term659249, term659249.getClass(), "type", 42);
        setField(term659163, term659163.getClass(), "first", term659249);
        setIntField(term659163, term659163.getClass(), "type", 14);
        term659569 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term659569, term659569.getClass(), "currentTraversal", null);
        term659570 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term659571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term659572 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term659570, term659570.getClass(), "number", 0.0);
        setIntField(term659570, term659570.getClass(), "type", 14);
        setField(term659570, term659570.getClass(), "next", null);
        setField(term659571, term659571.getClass(), "functionName", null);
        setBooleanField(term659571, term659571.getClass(), "itsNeedsActivation", false);
        setIntField(term659571, term659571.getClass(), "itsFunctionType", 0);
        setBooleanField(term659571, term659571.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term659571, term659571.getClass(), "encodedSourceStart", 0);
        setIntField(term659571, term659571.getClass(), "encodedSourceEnd", 0);
        setField(term659571, term659571.getClass(), "sourceName", null);
        setIntField(term659571, term659571.getClass(), "baseLineno", 0);
        setIntField(term659571, term659571.getClass(), "endLineno", 0);
        setField(term659571, term659571.getClass(), "functions", null);
        setField(term659571, term659571.getClass(), "regexps", null);
        setField(term659571, term659571.getClass(), "itsVariables", null);
        setField(term659571, term659571.getClass(), "itsConst", null);
        setField(term659571, term659571.getClass(), "itsVariableNames", null);
        setIntField(term659571, term659571.getClass(), "varStart", 0);
        setField(term659571, term659571.getClass(), "compilerData", null);
        setIntField(term659571, term659571.getClass(), "type", 42);
        setField(term659572, term659572.getClass(), "str", null);
        setIntField(term659572, term659572.getClass(), "type", 42);
        setField(term659572, term659572.getClass(), "next", null);
        setField(term659572, term659572.getClass(), "first", null);
        setField(term659572, term659572.getClass(), "last", null);
        setField(term659572, term659572.getClass(), "propListHead", null);
        setIntField(term659572, term659572.getClass(), "sourcePosition", 0);
        setField(term659572, term659572.getClass(), "jsType", null);
        setField(term659572, term659572.getClass(), "parent", null);
        setField(term659571, term659571.getClass(), "next", term659572);
        setField(term659571, term659571.getClass(), "first", null);
        setField(term659571, term659571.getClass(), "last", null);
        setField(term659571, term659571.getClass(), "propListHead", null);
        setIntField(term659571, term659571.getClass(), "sourcePosition", 0);
        setField(term659571, term659571.getClass(), "jsType", null);
        setField(term659571, term659571.getClass(), "parent", null);
        setField(term659570, term659570.getClass(), "first", term659571);
        setField(term659570, term659570.getClass(), "last", null);
        setField(term659570, term659570.getClass(), "propListHead", null);
        setIntField(term659570, term659570.getClass(), "sourcePosition", 0);
        setField(term659570, term659570.getClass(), "jsType", null);
        setField(term659570, term659570.getClass(), "parent", null);
        term659505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term659508 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term659518 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term659505, term659505.getClass(), "number", 0.0);
        setIntField(term659505, term659505.getClass(), "type", 14);
        setField(term659505, term659505.getClass(), "next", null);
        setField(term659508, term659508.getClass(), "functionName", null);
        setBooleanField(term659508, term659508.getClass(), "itsNeedsActivation", false);
        setIntField(term659508, term659508.getClass(), "itsFunctionType", 0);
        setBooleanField(term659508, term659508.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term659508, term659508.getClass(), "encodedSourceStart", 0);
        setIntField(term659508, term659508.getClass(), "encodedSourceEnd", 0);
        setField(term659508, term659508.getClass(), "sourceName", null);
        setIntField(term659508, term659508.getClass(), "baseLineno", 0);
        setIntField(term659508, term659508.getClass(), "endLineno", 0);
        setField(term659508, term659508.getClass(), "functions", null);
        setField(term659508, term659508.getClass(), "regexps", null);
        setField(term659508, term659508.getClass(), "itsVariables", null);
        setField(term659508, term659508.getClass(), "itsConst", null);
        setField(term659508, term659508.getClass(), "itsVariableNames", null);
        setIntField(term659508, term659508.getClass(), "varStart", 0);
        setField(term659508, term659508.getClass(), "compilerData", null);
        setIntField(term659508, term659508.getClass(), "type", 42);
        setField(term659518, term659518.getClass(), "str", null);
        setIntField(term659518, term659518.getClass(), "type", 42);
        setField(term659518, term659518.getClass(), "next", null);
        setField(term659518, term659518.getClass(), "first", null);
        setField(term659518, term659518.getClass(), "last", null);
        setField(term659518, term659518.getClass(), "propListHead", null);
        setIntField(term659518, term659518.getClass(), "sourcePosition", 0);
        setField(term659518, term659518.getClass(), "jsType", null);
        setField(term659518, term659518.getClass(), "parent", null);
        setField(term659508, term659508.getClass(), "next", term659518);
        setField(term659508, term659508.getClass(), "first", null);
        setField(term659508, term659508.getClass(), "last", null);
        setField(term659508, term659508.getClass(), "propListHead", null);
        setIntField(term659508, term659508.getClass(), "sourcePosition", 0);
        setField(term659508, term659508.getClass(), "jsType", null);
        setField(term659508, term659508.getClass(), "parent", null);
        setField(term659505, term659505.getClass(), "first", term659508);
        setField(term659505, term659505.getClass(), "last", null);
        setField(term659505, term659505.getClass(), "propListHead", null);
        setIntField(term659505, term659505.getClass(), "sourcePosition", 0);
        setField(term659505, term659505.getClass(), "jsType", null);
        setField(term659505, term659505.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term659163;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term659071, args);
        assertTrue(recursiveEquals(term659071, term659569));
        assertTrue(recursiveEquals(term659163, term659570));
        assertTrue(recursiveEquals(retValue, term659505));
    }

};


