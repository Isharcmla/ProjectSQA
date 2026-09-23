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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term926952;
     Object term927044;
     Object term927704;
     Object term927705;
     Object term927644;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term926952 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term927044 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term927130 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term927200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term927130, term927130.getClass(), "next", term927200);
        setField(term927044, term927044.getClass(), "first", term927130);
        setIntField(term927044, term927044.getClass(), "type", 14);
        term927704 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term927704, term927704.getClass(), "currentTraversal", null);
        term927705 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term927706 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term927707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term927705, term927705.getClass(), "str", null);
        setIntField(term927705, term927705.getClass(), "type", 14);
        setField(term927705, term927705.getClass(), "next", null);
        setField(term927706, term927706.getClass(), "functionName", null);
        setBooleanField(term927706, term927706.getClass(), "itsNeedsActivation", false);
        setIntField(term927706, term927706.getClass(), "itsFunctionType", 0);
        setBooleanField(term927706, term927706.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term927706, term927706.getClass(), "encodedSourceStart", 0);
        setIntField(term927706, term927706.getClass(), "encodedSourceEnd", 0);
        setField(term927706, term927706.getClass(), "sourceName", null);
        setIntField(term927706, term927706.getClass(), "baseLineno", 0);
        setIntField(term927706, term927706.getClass(), "endLineno", 0);
        setField(term927706, term927706.getClass(), "functions", null);
        setField(term927706, term927706.getClass(), "regexps", null);
        setField(term927706, term927706.getClass(), "itsVariables", null);
        setField(term927706, term927706.getClass(), "itsConst", null);
        setField(term927706, term927706.getClass(), "itsVariableNames", null);
        setIntField(term927706, term927706.getClass(), "varStart", 0);
        setField(term927706, term927706.getClass(), "compilerData", null);
        setIntField(term927706, term927706.getClass(), "type", 0);
        setIntField(term927707, term927707.getClass(), "type", 0);
        setField(term927707, term927707.getClass(), "next", null);
        setField(term927707, term927707.getClass(), "first", null);
        setField(term927707, term927707.getClass(), "last", null);
        setField(term927707, term927707.getClass(), "propListHead", null);
        setIntField(term927707, term927707.getClass(), "sourcePosition", 0);
        setField(term927707, term927707.getClass(), "jsType", null);
        setField(term927707, term927707.getClass(), "parent", null);
        setField(term927706, term927706.getClass(), "next", term927707);
        setField(term927706, term927706.getClass(), "first", null);
        setField(term927706, term927706.getClass(), "last", null);
        setField(term927706, term927706.getClass(), "propListHead", null);
        setIntField(term927706, term927706.getClass(), "sourcePosition", 0);
        setField(term927706, term927706.getClass(), "jsType", null);
        setField(term927706, term927706.getClass(), "parent", null);
        setField(term927705, term927705.getClass(), "first", term927706);
        setField(term927705, term927705.getClass(), "last", null);
        setField(term927705, term927705.getClass(), "propListHead", null);
        setIntField(term927705, term927705.getClass(), "sourcePosition", 0);
        setField(term927705, term927705.getClass(), "jsType", null);
        setField(term927705, term927705.getClass(), "parent", null);
        term927644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term927646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term927656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term927644, term927644.getClass(), "str", null);
        setIntField(term927644, term927644.getClass(), "type", 14);
        setField(term927644, term927644.getClass(), "next", null);
        setField(term927646, term927646.getClass(), "functionName", null);
        setBooleanField(term927646, term927646.getClass(), "itsNeedsActivation", false);
        setIntField(term927646, term927646.getClass(), "itsFunctionType", 0);
        setBooleanField(term927646, term927646.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term927646, term927646.getClass(), "encodedSourceStart", 0);
        setIntField(term927646, term927646.getClass(), "encodedSourceEnd", 0);
        setField(term927646, term927646.getClass(), "sourceName", null);
        setIntField(term927646, term927646.getClass(), "baseLineno", 0);
        setIntField(term927646, term927646.getClass(), "endLineno", 0);
        setField(term927646, term927646.getClass(), "functions", null);
        setField(term927646, term927646.getClass(), "regexps", null);
        setField(term927646, term927646.getClass(), "itsVariables", null);
        setField(term927646, term927646.getClass(), "itsConst", null);
        setField(term927646, term927646.getClass(), "itsVariableNames", null);
        setIntField(term927646, term927646.getClass(), "varStart", 0);
        setField(term927646, term927646.getClass(), "compilerData", null);
        setIntField(term927646, term927646.getClass(), "type", 0);
        setIntField(term927656, term927656.getClass(), "type", 0);
        setField(term927656, term927656.getClass(), "next", null);
        setField(term927656, term927656.getClass(), "first", null);
        setField(term927656, term927656.getClass(), "last", null);
        setField(term927656, term927656.getClass(), "propListHead", null);
        setIntField(term927656, term927656.getClass(), "sourcePosition", 0);
        setField(term927656, term927656.getClass(), "jsType", null);
        setField(term927656, term927656.getClass(), "parent", null);
        setField(term927646, term927646.getClass(), "next", term927656);
        setField(term927646, term927646.getClass(), "first", null);
        setField(term927646, term927646.getClass(), "last", null);
        setField(term927646, term927646.getClass(), "propListHead", null);
        setIntField(term927646, term927646.getClass(), "sourcePosition", 0);
        setField(term927646, term927646.getClass(), "jsType", null);
        setField(term927646, term927646.getClass(), "parent", null);
        setField(term927644, term927644.getClass(), "first", term927646);
        setField(term927644, term927644.getClass(), "last", null);
        setField(term927644, term927644.getClass(), "propListHead", null);
        setIntField(term927644, term927644.getClass(), "sourcePosition", 0);
        setField(term927644, term927644.getClass(), "jsType", null);
        setField(term927644, term927644.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term927044;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term926952, args);
        assertTrue(recursiveEquals(term926952, term927704));
        assertTrue(recursiveEquals(term927044, term927705));
        assertTrue(recursiveEquals(retValue, term927644));
    }

};


