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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159505;
     Object term159597;
     Object term159753;
     Object term159754;
     Object term159704;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159505 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term159597 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159683 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term159597, term159597.getClass(), "first", term159597);
        setField(term159597, term159597.getClass(), "next", term159683);
        setIntField(term159597, term159597.getClass(), "type", 33);
        term159753 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term159753, term159753.getClass(), "currentTraversal", null);
        term159754 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term159754, term159754.getClass(), "str", null);
        setIntField(term159754, term159754.getClass(), "type", 33);
        setField(term159755, term159755.getClass(), "functionName", null);
        setBooleanField(term159755, term159755.getClass(), "itsNeedsActivation", false);
        setIntField(term159755, term159755.getClass(), "itsFunctionType", 0);
        setBooleanField(term159755, term159755.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term159755, term159755.getClass(), "encodedSourceStart", 0);
        setIntField(term159755, term159755.getClass(), "encodedSourceEnd", 0);
        setField(term159755, term159755.getClass(), "sourceName", null);
        setIntField(term159755, term159755.getClass(), "baseLineno", 0);
        setIntField(term159755, term159755.getClass(), "endLineno", 0);
        setField(term159755, term159755.getClass(), "functions", null);
        setField(term159755, term159755.getClass(), "regexps", null);
        setField(term159755, term159755.getClass(), "itsVariables", null);
        setField(term159755, term159755.getClass(), "itsConst", null);
        setField(term159755, term159755.getClass(), "itsVariableNames", null);
        setIntField(term159755, term159755.getClass(), "varStart", 0);
        setField(term159755, term159755.getClass(), "compilerData", null);
        setIntField(term159755, term159755.getClass(), "type", 0);
        setField(term159755, term159755.getClass(), "next", null);
        setField(term159755, term159755.getClass(), "first", null);
        setField(term159755, term159755.getClass(), "last", null);
        setField(term159755, term159755.getClass(), "propListHead", null);
        setIntField(term159755, term159755.getClass(), "sourcePosition", 0);
        setField(term159755, term159755.getClass(), "jsType", null);
        setField(term159755, term159755.getClass(), "parent", null);
        setField(term159754, term159754.getClass(), "next", term159755);
        setField(term159754, term159754.getClass(), "first", term159754);
        setField(term159754, term159754.getClass(), "last", null);
        setField(term159754, term159754.getClass(), "propListHead", null);
        setIntField(term159754, term159754.getClass(), "sourcePosition", 0);
        setField(term159754, term159754.getClass(), "jsType", null);
        setField(term159754, term159754.getClass(), "parent", null);
        term159704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159706 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term159704, term159704.getClass(), "str", null);
        setIntField(term159704, term159704.getClass(), "type", 33);
        setField(term159706, term159706.getClass(), "functionName", null);
        setBooleanField(term159706, term159706.getClass(), "itsNeedsActivation", false);
        setIntField(term159706, term159706.getClass(), "itsFunctionType", 0);
        setBooleanField(term159706, term159706.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term159706, term159706.getClass(), "encodedSourceStart", 0);
        setIntField(term159706, term159706.getClass(), "encodedSourceEnd", 0);
        setField(term159706, term159706.getClass(), "sourceName", null);
        setIntField(term159706, term159706.getClass(), "baseLineno", 0);
        setIntField(term159706, term159706.getClass(), "endLineno", 0);
        setField(term159706, term159706.getClass(), "functions", null);
        setField(term159706, term159706.getClass(), "regexps", null);
        setField(term159706, term159706.getClass(), "itsVariables", null);
        setField(term159706, term159706.getClass(), "itsConst", null);
        setField(term159706, term159706.getClass(), "itsVariableNames", null);
        setIntField(term159706, term159706.getClass(), "varStart", 0);
        setField(term159706, term159706.getClass(), "compilerData", null);
        setIntField(term159706, term159706.getClass(), "type", 0);
        setField(term159706, term159706.getClass(), "next", null);
        setField(term159706, term159706.getClass(), "first", null);
        setField(term159706, term159706.getClass(), "last", null);
        setField(term159706, term159706.getClass(), "propListHead", null);
        setIntField(term159706, term159706.getClass(), "sourcePosition", 0);
        setField(term159706, term159706.getClass(), "jsType", null);
        setField(term159706, term159706.getClass(), "parent", null);
        setField(term159704, term159704.getClass(), "next", term159706);
        setField(term159704, term159704.getClass(), "first", term159704);
        setField(term159704, term159704.getClass(), "last", null);
        setField(term159704, term159704.getClass(), "propListHead", null);
        setIntField(term159704, term159704.getClass(), "sourcePosition", 0);
        setField(term159704, term159704.getClass(), "jsType", null);
        setField(term159704, term159704.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term159597;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term159505, args);
        assertTrue(recursiveEquals(term159505, term159753));
        assertTrue(recursiveEquals(term159597, term159754));
        assertTrue(recursiveEquals(retValue, term159704));
    }

};


