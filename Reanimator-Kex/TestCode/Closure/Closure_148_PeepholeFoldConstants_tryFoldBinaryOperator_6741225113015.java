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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886106;
     Object term886198;
     Object term887411;
     Object term887412;
     Object term887311;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886106 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term886198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term886290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term886382 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term886468 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term886382, term886382.getClass(), "type", 64);
        setField(term886290, term886290.getClass(), "next", term886382);
        setIntField(term886290, term886290.getClass(), "type", 0);
        setField(term886198, term886198.getClass(), "first", term886290);
        setIntField(term886198, term886198.getClass(), "type", 101);
        setField(term886198, term886198.getClass(), "parent", term886468);
        term887411 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term887411, term887411.getClass(), "currentTraversal", null);
        term887412 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term887413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term887414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term887415 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term887412, term887412.getClass(), "str", null);
        setIntField(term887412, term887412.getClass(), "type", 101);
        setField(term887412, term887412.getClass(), "next", null);
        setField(term887413, term887413.getClass(), "str", null);
        setIntField(term887413, term887413.getClass(), "type", 0);
        setField(term887414, term887414.getClass(), "str", null);
        setIntField(term887414, term887414.getClass(), "type", 64);
        setField(term887414, term887414.getClass(), "next", null);
        setField(term887414, term887414.getClass(), "first", null);
        setField(term887414, term887414.getClass(), "last", null);
        setField(term887414, term887414.getClass(), "propListHead", null);
        setIntField(term887414, term887414.getClass(), "sourcePosition", 0);
        setField(term887414, term887414.getClass(), "jsType", null);
        setField(term887414, term887414.getClass(), "parent", null);
        setField(term887413, term887413.getClass(), "next", term887414);
        setField(term887413, term887413.getClass(), "first", null);
        setField(term887413, term887413.getClass(), "last", null);
        setField(term887413, term887413.getClass(), "propListHead", null);
        setIntField(term887413, term887413.getClass(), "sourcePosition", 0);
        setField(term887413, term887413.getClass(), "jsType", null);
        setField(term887413, term887413.getClass(), "parent", null);
        setField(term887412, term887412.getClass(), "first", term887413);
        setField(term887412, term887412.getClass(), "last", null);
        setField(term887412, term887412.getClass(), "propListHead", null);
        setIntField(term887412, term887412.getClass(), "sourcePosition", 0);
        setField(term887412, term887412.getClass(), "jsType", null);
        setField(term887415, term887415.getClass(), "functionName", null);
        setBooleanField(term887415, term887415.getClass(), "itsNeedsActivation", false);
        setIntField(term887415, term887415.getClass(), "itsFunctionType", 0);
        setBooleanField(term887415, term887415.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term887415, term887415.getClass(), "encodedSourceStart", 0);
        setIntField(term887415, term887415.getClass(), "encodedSourceEnd", 0);
        setField(term887415, term887415.getClass(), "sourceName", null);
        setIntField(term887415, term887415.getClass(), "baseLineno", 0);
        setIntField(term887415, term887415.getClass(), "endLineno", 0);
        setField(term887415, term887415.getClass(), "functions", null);
        setField(term887415, term887415.getClass(), "regexps", null);
        setField(term887415, term887415.getClass(), "itsVariables", null);
        setField(term887415, term887415.getClass(), "itsConst", null);
        setField(term887415, term887415.getClass(), "itsVariableNames", null);
        setIntField(term887415, term887415.getClass(), "varStart", 0);
        setField(term887415, term887415.getClass(), "compilerData", null);
        setIntField(term887415, term887415.getClass(), "type", 0);
        setField(term887415, term887415.getClass(), "next", null);
        setField(term887415, term887415.getClass(), "first", null);
        setField(term887415, term887415.getClass(), "last", null);
        setField(term887415, term887415.getClass(), "propListHead", null);
        setIntField(term887415, term887415.getClass(), "sourcePosition", 0);
        setField(term887415, term887415.getClass(), "jsType", null);
        setField(term887415, term887415.getClass(), "parent", null);
        setField(term887412, term887412.getClass(), "parent", term887415);
        term887311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term887313 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term887315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term887320 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term887311, term887311.getClass(), "str", null);
        setIntField(term887311, term887311.getClass(), "type", 101);
        setField(term887311, term887311.getClass(), "next", null);
        setField(term887313, term887313.getClass(), "str", null);
        setIntField(term887313, term887313.getClass(), "type", 0);
        setField(term887315, term887315.getClass(), "str", null);
        setIntField(term887315, term887315.getClass(), "type", 64);
        setField(term887315, term887315.getClass(), "next", null);
        setField(term887315, term887315.getClass(), "first", null);
        setField(term887315, term887315.getClass(), "last", null);
        setField(term887315, term887315.getClass(), "propListHead", null);
        setIntField(term887315, term887315.getClass(), "sourcePosition", 0);
        setField(term887315, term887315.getClass(), "jsType", null);
        setField(term887315, term887315.getClass(), "parent", null);
        setField(term887313, term887313.getClass(), "next", term887315);
        setField(term887313, term887313.getClass(), "first", null);
        setField(term887313, term887313.getClass(), "last", null);
        setField(term887313, term887313.getClass(), "propListHead", null);
        setIntField(term887313, term887313.getClass(), "sourcePosition", 0);
        setField(term887313, term887313.getClass(), "jsType", null);
        setField(term887313, term887313.getClass(), "parent", null);
        setField(term887311, term887311.getClass(), "first", term887313);
        setField(term887311, term887311.getClass(), "last", null);
        setField(term887311, term887311.getClass(), "propListHead", null);
        setIntField(term887311, term887311.getClass(), "sourcePosition", 0);
        setField(term887311, term887311.getClass(), "jsType", null);
        setField(term887320, term887320.getClass(), "functionName", null);
        setBooleanField(term887320, term887320.getClass(), "itsNeedsActivation", false);
        setIntField(term887320, term887320.getClass(), "itsFunctionType", 0);
        setBooleanField(term887320, term887320.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term887320, term887320.getClass(), "encodedSourceStart", 0);
        setIntField(term887320, term887320.getClass(), "encodedSourceEnd", 0);
        setField(term887320, term887320.getClass(), "sourceName", null);
        setIntField(term887320, term887320.getClass(), "baseLineno", 0);
        setIntField(term887320, term887320.getClass(), "endLineno", 0);
        setField(term887320, term887320.getClass(), "functions", null);
        setField(term887320, term887320.getClass(), "regexps", null);
        setField(term887320, term887320.getClass(), "itsVariables", null);
        setField(term887320, term887320.getClass(), "itsConst", null);
        setField(term887320, term887320.getClass(), "itsVariableNames", null);
        setIntField(term887320, term887320.getClass(), "varStart", 0);
        setField(term887320, term887320.getClass(), "compilerData", null);
        setIntField(term887320, term887320.getClass(), "type", 0);
        setField(term887320, term887320.getClass(), "next", null);
        setField(term887320, term887320.getClass(), "first", null);
        setField(term887320, term887320.getClass(), "last", null);
        setField(term887320, term887320.getClass(), "propListHead", null);
        setIntField(term887320, term887320.getClass(), "sourcePosition", 0);
        setField(term887320, term887320.getClass(), "jsType", null);
        setField(term887320, term887320.getClass(), "parent", null);
        setField(term887311, term887311.getClass(), "parent", term887320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term886198;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term886106, args);
        assertTrue(recursiveEquals(term886106, term887411));
        assertTrue(recursiveEquals(term886198, term887412));
        assertTrue(recursiveEquals(retValue, term887311));
    }

};


