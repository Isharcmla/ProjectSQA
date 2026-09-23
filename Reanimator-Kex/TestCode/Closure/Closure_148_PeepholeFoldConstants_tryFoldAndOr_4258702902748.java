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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790127;
     Object term790213;
     Object term790397;
     Object term790489;
     Object term791544;
     Object term791545;
     Object term791547;
     Object term791548;
     Object term791465;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term790127 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term790213 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term790305 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term790305, term790305.getClass(), "type", 108);
        setField(term790213, term790213.getClass(), "parent", term790305);
        setIntField(term790213, term790213.getClass(), "type", 100);
        term790397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term790397, term790397.getClass(), "type", 80);
        term790489 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term790489, term790489.getClass(), "type", 44);
        term791544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term791544, term791544.getClass(), "currentTraversal", null);
        term791545 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term791546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term791545, term791545.getClass(), "functionName", null);
        setBooleanField(term791545, term791545.getClass(), "itsNeedsActivation", false);
        setIntField(term791545, term791545.getClass(), "itsFunctionType", 0);
        setBooleanField(term791545, term791545.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791545, term791545.getClass(), "encodedSourceStart", 0);
        setIntField(term791545, term791545.getClass(), "encodedSourceEnd", 0);
        setField(term791545, term791545.getClass(), "sourceName", null);
        setIntField(term791545, term791545.getClass(), "baseLineno", 0);
        setIntField(term791545, term791545.getClass(), "endLineno", 0);
        setField(term791545, term791545.getClass(), "functions", null);
        setField(term791545, term791545.getClass(), "regexps", null);
        setField(term791545, term791545.getClass(), "itsVariables", null);
        setField(term791545, term791545.getClass(), "itsConst", null);
        setField(term791545, term791545.getClass(), "itsVariableNames", null);
        setIntField(term791545, term791545.getClass(), "varStart", 0);
        setField(term791545, term791545.getClass(), "compilerData", null);
        setIntField(term791545, term791545.getClass(), "type", 100);
        setField(term791545, term791545.getClass(), "next", null);
        setField(term791545, term791545.getClass(), "first", null);
        setField(term791545, term791545.getClass(), "last", null);
        setField(term791545, term791545.getClass(), "propListHead", null);
        setIntField(term791545, term791545.getClass(), "sourcePosition", 0);
        setField(term791545, term791545.getClass(), "jsType", null);
        setDoubleField(term791546, term791546.getClass(), "number", 0.0);
        setIntField(term791546, term791546.getClass(), "type", 108);
        setField(term791546, term791546.getClass(), "next", null);
        setField(term791546, term791546.getClass(), "first", null);
        setField(term791546, term791546.getClass(), "last", null);
        setField(term791546, term791546.getClass(), "propListHead", null);
        setIntField(term791546, term791546.getClass(), "sourcePosition", 0);
        setField(term791546, term791546.getClass(), "jsType", null);
        setField(term791546, term791546.getClass(), "parent", null);
        setField(term791545, term791545.getClass(), "parent", term791546);
        term791547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term791547, term791547.getClass(), "number", 0.0);
        setIntField(term791547, term791547.getClass(), "type", 80);
        setField(term791547, term791547.getClass(), "next", null);
        setField(term791547, term791547.getClass(), "first", null);
        setField(term791547, term791547.getClass(), "last", null);
        setField(term791547, term791547.getClass(), "propListHead", null);
        setIntField(term791547, term791547.getClass(), "sourcePosition", 0);
        setField(term791547, term791547.getClass(), "jsType", null);
        setField(term791547, term791547.getClass(), "parent", null);
        term791548 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term791548, term791548.getClass(), "str", null);
        setIntField(term791548, term791548.getClass(), "type", 44);
        setField(term791548, term791548.getClass(), "next", null);
        setField(term791548, term791548.getClass(), "first", null);
        setField(term791548, term791548.getClass(), "last", null);
        setField(term791548, term791548.getClass(), "propListHead", null);
        setIntField(term791548, term791548.getClass(), "sourcePosition", 0);
        setField(term791548, term791548.getClass(), "jsType", null);
        setField(term791548, term791548.getClass(), "parent", null);
        term791465 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term791476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term791465, term791465.getClass(), "functionName", null);
        setBooleanField(term791465, term791465.getClass(), "itsNeedsActivation", false);
        setIntField(term791465, term791465.getClass(), "itsFunctionType", 0);
        setBooleanField(term791465, term791465.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791465, term791465.getClass(), "encodedSourceStart", 0);
        setIntField(term791465, term791465.getClass(), "encodedSourceEnd", 0);
        setField(term791465, term791465.getClass(), "sourceName", null);
        setIntField(term791465, term791465.getClass(), "baseLineno", 0);
        setIntField(term791465, term791465.getClass(), "endLineno", 0);
        setField(term791465, term791465.getClass(), "functions", null);
        setField(term791465, term791465.getClass(), "regexps", null);
        setField(term791465, term791465.getClass(), "itsVariables", null);
        setField(term791465, term791465.getClass(), "itsConst", null);
        setField(term791465, term791465.getClass(), "itsVariableNames", null);
        setIntField(term791465, term791465.getClass(), "varStart", 0);
        setField(term791465, term791465.getClass(), "compilerData", null);
        setIntField(term791465, term791465.getClass(), "type", 100);
        setField(term791465, term791465.getClass(), "next", null);
        setField(term791465, term791465.getClass(), "first", null);
        setField(term791465, term791465.getClass(), "last", null);
        setField(term791465, term791465.getClass(), "propListHead", null);
        setIntField(term791465, term791465.getClass(), "sourcePosition", 0);
        setField(term791465, term791465.getClass(), "jsType", null);
        setDoubleField(term791476, term791476.getClass(), "number", 0.0);
        setIntField(term791476, term791476.getClass(), "type", 108);
        setField(term791476, term791476.getClass(), "next", null);
        setField(term791476, term791476.getClass(), "first", null);
        setField(term791476, term791476.getClass(), "last", null);
        setField(term791476, term791476.getClass(), "propListHead", null);
        setIntField(term791476, term791476.getClass(), "sourcePosition", 0);
        setField(term791476, term791476.getClass(), "jsType", null);
        setField(term791476, term791476.getClass(), "parent", null);
        setField(term791465, term791465.getClass(), "parent", term791476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term790213;
        args[1] = term790397;
        args[2] = term790489;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term790127, args);
        assertTrue(recursiveEquals(term790127, term791544));
        assertTrue(recursiveEquals(term790213, term791545));
        assertTrue(recursiveEquals(term790397, term791547));
        assertTrue(recursiveEquals(term790489, term791548));
        assertTrue(recursiveEquals(retValue, term791465));
    }

};


