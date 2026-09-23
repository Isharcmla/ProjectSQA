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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term925642;
     Object term925734;
     Object term926707;
     Object term926708;
     Object term926647;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term925642 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term925734 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term925820 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term925912 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term925820, term925820.getClass(), "next", term925912);
        setIntField(term925820, term925820.getClass(), "type", 108);
        setField(term925734, term925734.getClass(), "first", term925820);
        setIntField(term925734, term925734.getClass(), "type", 16);
        term926707 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term926707, term926707.getClass(), "currentTraversal", null);
        term926708 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term926709 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term926710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term926708, term926708.getClass(), "number", 0.0);
        setIntField(term926708, term926708.getClass(), "type", 16);
        setField(term926708, term926708.getClass(), "next", null);
        setField(term926709, term926709.getClass(), "functionName", null);
        setBooleanField(term926709, term926709.getClass(), "itsNeedsActivation", false);
        setIntField(term926709, term926709.getClass(), "itsFunctionType", 0);
        setBooleanField(term926709, term926709.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term926709, term926709.getClass(), "encodedSourceStart", 0);
        setIntField(term926709, term926709.getClass(), "encodedSourceEnd", 0);
        setField(term926709, term926709.getClass(), "sourceName", null);
        setIntField(term926709, term926709.getClass(), "baseLineno", 0);
        setIntField(term926709, term926709.getClass(), "endLineno", 0);
        setField(term926709, term926709.getClass(), "functions", null);
        setField(term926709, term926709.getClass(), "regexps", null);
        setField(term926709, term926709.getClass(), "itsVariables", null);
        setField(term926709, term926709.getClass(), "itsConst", null);
        setField(term926709, term926709.getClass(), "itsVariableNames", null);
        setIntField(term926709, term926709.getClass(), "varStart", 0);
        setField(term926709, term926709.getClass(), "compilerData", null);
        setIntField(term926709, term926709.getClass(), "type", 108);
        setField(term926710, term926710.getClass(), "str", null);
        setIntField(term926710, term926710.getClass(), "type", 0);
        setField(term926710, term926710.getClass(), "next", null);
        setField(term926710, term926710.getClass(), "first", null);
        setField(term926710, term926710.getClass(), "last", null);
        setField(term926710, term926710.getClass(), "propListHead", null);
        setIntField(term926710, term926710.getClass(), "sourcePosition", 0);
        setField(term926710, term926710.getClass(), "jsType", null);
        setField(term926710, term926710.getClass(), "parent", null);
        setField(term926709, term926709.getClass(), "next", term926710);
        setField(term926709, term926709.getClass(), "first", null);
        setField(term926709, term926709.getClass(), "last", null);
        setField(term926709, term926709.getClass(), "propListHead", null);
        setIntField(term926709, term926709.getClass(), "sourcePosition", 0);
        setField(term926709, term926709.getClass(), "jsType", null);
        setField(term926709, term926709.getClass(), "parent", null);
        setField(term926708, term926708.getClass(), "first", term926709);
        setField(term926708, term926708.getClass(), "last", null);
        setField(term926708, term926708.getClass(), "propListHead", null);
        setIntField(term926708, term926708.getClass(), "sourcePosition", 0);
        setField(term926708, term926708.getClass(), "jsType", null);
        setField(term926708, term926708.getClass(), "parent", null);
        term926647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term926650 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term926660 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term926647, term926647.getClass(), "number", 0.0);
        setIntField(term926647, term926647.getClass(), "type", 16);
        setField(term926647, term926647.getClass(), "next", null);
        setField(term926650, term926650.getClass(), "functionName", null);
        setBooleanField(term926650, term926650.getClass(), "itsNeedsActivation", false);
        setIntField(term926650, term926650.getClass(), "itsFunctionType", 0);
        setBooleanField(term926650, term926650.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term926650, term926650.getClass(), "encodedSourceStart", 0);
        setIntField(term926650, term926650.getClass(), "encodedSourceEnd", 0);
        setField(term926650, term926650.getClass(), "sourceName", null);
        setIntField(term926650, term926650.getClass(), "baseLineno", 0);
        setIntField(term926650, term926650.getClass(), "endLineno", 0);
        setField(term926650, term926650.getClass(), "functions", null);
        setField(term926650, term926650.getClass(), "regexps", null);
        setField(term926650, term926650.getClass(), "itsVariables", null);
        setField(term926650, term926650.getClass(), "itsConst", null);
        setField(term926650, term926650.getClass(), "itsVariableNames", null);
        setIntField(term926650, term926650.getClass(), "varStart", 0);
        setField(term926650, term926650.getClass(), "compilerData", null);
        setIntField(term926650, term926650.getClass(), "type", 108);
        setField(term926660, term926660.getClass(), "str", null);
        setIntField(term926660, term926660.getClass(), "type", 0);
        setField(term926660, term926660.getClass(), "next", null);
        setField(term926660, term926660.getClass(), "first", null);
        setField(term926660, term926660.getClass(), "last", null);
        setField(term926660, term926660.getClass(), "propListHead", null);
        setIntField(term926660, term926660.getClass(), "sourcePosition", 0);
        setField(term926660, term926660.getClass(), "jsType", null);
        setField(term926660, term926660.getClass(), "parent", null);
        setField(term926650, term926650.getClass(), "next", term926660);
        setField(term926650, term926650.getClass(), "first", null);
        setField(term926650, term926650.getClass(), "last", null);
        setField(term926650, term926650.getClass(), "propListHead", null);
        setIntField(term926650, term926650.getClass(), "sourcePosition", 0);
        setField(term926650, term926650.getClass(), "jsType", null);
        setField(term926650, term926650.getClass(), "parent", null);
        setField(term926647, term926647.getClass(), "first", term926650);
        setField(term926647, term926647.getClass(), "last", null);
        setField(term926647, term926647.getClass(), "propListHead", null);
        setIntField(term926647, term926647.getClass(), "sourcePosition", 0);
        setField(term926647, term926647.getClass(), "jsType", null);
        setField(term926647, term926647.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term925734;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term925642, args);
        assertTrue(recursiveEquals(term925642, term926707));
        assertTrue(recursiveEquals(term925734, term926708));
        assertTrue(recursiveEquals(retValue, term926647));
    }

};


