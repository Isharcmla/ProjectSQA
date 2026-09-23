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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286834;
     Object term286926;
     Object term287543;
     Object term287544;
     Object term287496;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term286926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term287012 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term287104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term287012, term287012.getClass(), "next", term287104);
        setField(term286926, term286926.getClass(), "first", term287012);
        setIntField(term286926, term286926.getClass(), "type", 33);
        term287543 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term287543, term287543.getClass(), "currentTraversal", null);
        term287544 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term287545 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term287546 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term287544, term287544.getClass(), "str", null);
        setIntField(term287544, term287544.getClass(), "type", 33);
        setField(term287544, term287544.getClass(), "next", null);
        setField(term287545, term287545.getClass(), "functionName", null);
        setBooleanField(term287545, term287545.getClass(), "itsNeedsActivation", false);
        setIntField(term287545, term287545.getClass(), "itsFunctionType", 0);
        setBooleanField(term287545, term287545.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term287545, term287545.getClass(), "encodedSourceStart", 0);
        setIntField(term287545, term287545.getClass(), "encodedSourceEnd", 0);
        setField(term287545, term287545.getClass(), "sourceName", null);
        setIntField(term287545, term287545.getClass(), "baseLineno", 0);
        setIntField(term287545, term287545.getClass(), "endLineno", 0);
        setField(term287545, term287545.getClass(), "functions", null);
        setField(term287545, term287545.getClass(), "regexps", null);
        setField(term287545, term287545.getClass(), "itsVariables", null);
        setField(term287545, term287545.getClass(), "itsConst", null);
        setField(term287545, term287545.getClass(), "itsVariableNames", null);
        setIntField(term287545, term287545.getClass(), "varStart", 0);
        setField(term287545, term287545.getClass(), "compilerData", null);
        setIntField(term287545, term287545.getClass(), "type", 0);
        setField(term287546, term287546.getClass(), "str", null);
        setIntField(term287546, term287546.getClass(), "type", 0);
        setField(term287546, term287546.getClass(), "next", null);
        setField(term287546, term287546.getClass(), "first", null);
        setField(term287546, term287546.getClass(), "last", null);
        setField(term287546, term287546.getClass(), "propListHead", null);
        setIntField(term287546, term287546.getClass(), "sourcePosition", 0);
        setField(term287546, term287546.getClass(), "jsType", null);
        setField(term287546, term287546.getClass(), "parent", null);
        setField(term287545, term287545.getClass(), "next", term287546);
        setField(term287545, term287545.getClass(), "first", null);
        setField(term287545, term287545.getClass(), "last", null);
        setField(term287545, term287545.getClass(), "propListHead", null);
        setIntField(term287545, term287545.getClass(), "sourcePosition", 0);
        setField(term287545, term287545.getClass(), "jsType", null);
        setField(term287545, term287545.getClass(), "parent", null);
        setField(term287544, term287544.getClass(), "first", term287545);
        setField(term287544, term287544.getClass(), "last", null);
        setField(term287544, term287544.getClass(), "propListHead", null);
        setIntField(term287544, term287544.getClass(), "sourcePosition", 0);
        setField(term287544, term287544.getClass(), "jsType", null);
        setField(term287544, term287544.getClass(), "parent", null);
        term287496 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term287498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term287508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term287496, term287496.getClass(), "str", null);
        setIntField(term287496, term287496.getClass(), "type", 33);
        setField(term287496, term287496.getClass(), "next", null);
        setField(term287498, term287498.getClass(), "functionName", null);
        setBooleanField(term287498, term287498.getClass(), "itsNeedsActivation", false);
        setIntField(term287498, term287498.getClass(), "itsFunctionType", 0);
        setBooleanField(term287498, term287498.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term287498, term287498.getClass(), "encodedSourceStart", 0);
        setIntField(term287498, term287498.getClass(), "encodedSourceEnd", 0);
        setField(term287498, term287498.getClass(), "sourceName", null);
        setIntField(term287498, term287498.getClass(), "baseLineno", 0);
        setIntField(term287498, term287498.getClass(), "endLineno", 0);
        setField(term287498, term287498.getClass(), "functions", null);
        setField(term287498, term287498.getClass(), "regexps", null);
        setField(term287498, term287498.getClass(), "itsVariables", null);
        setField(term287498, term287498.getClass(), "itsConst", null);
        setField(term287498, term287498.getClass(), "itsVariableNames", null);
        setIntField(term287498, term287498.getClass(), "varStart", 0);
        setField(term287498, term287498.getClass(), "compilerData", null);
        setIntField(term287498, term287498.getClass(), "type", 0);
        setField(term287508, term287508.getClass(), "str", null);
        setIntField(term287508, term287508.getClass(), "type", 0);
        setField(term287508, term287508.getClass(), "next", null);
        setField(term287508, term287508.getClass(), "first", null);
        setField(term287508, term287508.getClass(), "last", null);
        setField(term287508, term287508.getClass(), "propListHead", null);
        setIntField(term287508, term287508.getClass(), "sourcePosition", 0);
        setField(term287508, term287508.getClass(), "jsType", null);
        setField(term287508, term287508.getClass(), "parent", null);
        setField(term287498, term287498.getClass(), "next", term287508);
        setField(term287498, term287498.getClass(), "first", null);
        setField(term287498, term287498.getClass(), "last", null);
        setField(term287498, term287498.getClass(), "propListHead", null);
        setIntField(term287498, term287498.getClass(), "sourcePosition", 0);
        setField(term287498, term287498.getClass(), "jsType", null);
        setField(term287498, term287498.getClass(), "parent", null);
        setField(term287496, term287496.getClass(), "first", term287498);
        setField(term287496, term287496.getClass(), "last", null);
        setField(term287496, term287496.getClass(), "propListHead", null);
        setIntField(term287496, term287496.getClass(), "sourcePosition", 0);
        setField(term287496, term287496.getClass(), "jsType", null);
        setField(term287496, term287496.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term286926;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term286834, args);
        assertTrue(recursiveEquals(term286834, term287543));
        assertTrue(recursiveEquals(term286926, term287544));
        assertTrue(recursiveEquals(retValue, term287496));
    }

};


