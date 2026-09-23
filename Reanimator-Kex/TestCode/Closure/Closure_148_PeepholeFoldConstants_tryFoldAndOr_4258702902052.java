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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552967;
     Object term553053;
     Object term553237;
     Object term553329;
     Object term553412;
     Object term553413;
     Object term553415;
     Object term553416;
     Object term553334;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552967 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term553053 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term553145, term553145.getClass(), "type", 108);
        setField(term553053, term553053.getClass(), "parent", term553145);
        setIntField(term553053, term553053.getClass(), "type", 0);
        term553237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term553237, term553237.getClass(), "type", 69);
        term553329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term553329, term553329.getClass(), "type", 44);
        term553412 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term553412, term553412.getClass(), "currentTraversal", null);
        term553413 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553414 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term553413, term553413.getClass(), "functionName", null);
        setBooleanField(term553413, term553413.getClass(), "itsNeedsActivation", false);
        setIntField(term553413, term553413.getClass(), "itsFunctionType", 0);
        setBooleanField(term553413, term553413.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term553413, term553413.getClass(), "encodedSourceStart", 0);
        setIntField(term553413, term553413.getClass(), "encodedSourceEnd", 0);
        setField(term553413, term553413.getClass(), "sourceName", null);
        setIntField(term553413, term553413.getClass(), "baseLineno", 0);
        setIntField(term553413, term553413.getClass(), "endLineno", 0);
        setField(term553413, term553413.getClass(), "functions", null);
        setField(term553413, term553413.getClass(), "regexps", null);
        setField(term553413, term553413.getClass(), "itsVariables", null);
        setField(term553413, term553413.getClass(), "itsConst", null);
        setField(term553413, term553413.getClass(), "itsVariableNames", null);
        setIntField(term553413, term553413.getClass(), "varStart", 0);
        setField(term553413, term553413.getClass(), "compilerData", null);
        setIntField(term553413, term553413.getClass(), "type", 0);
        setField(term553413, term553413.getClass(), "next", null);
        setField(term553413, term553413.getClass(), "first", null);
        setField(term553413, term553413.getClass(), "last", null);
        setField(term553413, term553413.getClass(), "propListHead", null);
        setIntField(term553413, term553413.getClass(), "sourcePosition", 0);
        setField(term553413, term553413.getClass(), "jsType", null);
        setDoubleField(term553414, term553414.getClass(), "number", 0.0);
        setIntField(term553414, term553414.getClass(), "type", 108);
        setField(term553414, term553414.getClass(), "next", null);
        setField(term553414, term553414.getClass(), "first", null);
        setField(term553414, term553414.getClass(), "last", null);
        setField(term553414, term553414.getClass(), "propListHead", null);
        setIntField(term553414, term553414.getClass(), "sourcePosition", 0);
        setField(term553414, term553414.getClass(), "jsType", null);
        setField(term553414, term553414.getClass(), "parent", null);
        setField(term553413, term553413.getClass(), "parent", term553414);
        term553415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term553415, term553415.getClass(), "number", 0.0);
        setIntField(term553415, term553415.getClass(), "type", 69);
        setField(term553415, term553415.getClass(), "next", null);
        setField(term553415, term553415.getClass(), "first", null);
        setField(term553415, term553415.getClass(), "last", null);
        setField(term553415, term553415.getClass(), "propListHead", null);
        setIntField(term553415, term553415.getClass(), "sourcePosition", 0);
        setField(term553415, term553415.getClass(), "jsType", null);
        setField(term553415, term553415.getClass(), "parent", null);
        term553416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term553416, term553416.getClass(), "str", null);
        setIntField(term553416, term553416.getClass(), "type", 44);
        setField(term553416, term553416.getClass(), "next", null);
        setField(term553416, term553416.getClass(), "first", null);
        setField(term553416, term553416.getClass(), "last", null);
        setField(term553416, term553416.getClass(), "propListHead", null);
        setIntField(term553416, term553416.getClass(), "sourcePosition", 0);
        setField(term553416, term553416.getClass(), "jsType", null);
        setField(term553416, term553416.getClass(), "parent", null);
        term553334 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553345 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term553334, term553334.getClass(), "functionName", null);
        setBooleanField(term553334, term553334.getClass(), "itsNeedsActivation", false);
        setIntField(term553334, term553334.getClass(), "itsFunctionType", 0);
        setBooleanField(term553334, term553334.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term553334, term553334.getClass(), "encodedSourceStart", 0);
        setIntField(term553334, term553334.getClass(), "encodedSourceEnd", 0);
        setField(term553334, term553334.getClass(), "sourceName", null);
        setIntField(term553334, term553334.getClass(), "baseLineno", 0);
        setIntField(term553334, term553334.getClass(), "endLineno", 0);
        setField(term553334, term553334.getClass(), "functions", null);
        setField(term553334, term553334.getClass(), "regexps", null);
        setField(term553334, term553334.getClass(), "itsVariables", null);
        setField(term553334, term553334.getClass(), "itsConst", null);
        setField(term553334, term553334.getClass(), "itsVariableNames", null);
        setIntField(term553334, term553334.getClass(), "varStart", 0);
        setField(term553334, term553334.getClass(), "compilerData", null);
        setIntField(term553334, term553334.getClass(), "type", 0);
        setField(term553334, term553334.getClass(), "next", null);
        setField(term553334, term553334.getClass(), "first", null);
        setField(term553334, term553334.getClass(), "last", null);
        setField(term553334, term553334.getClass(), "propListHead", null);
        setIntField(term553334, term553334.getClass(), "sourcePosition", 0);
        setField(term553334, term553334.getClass(), "jsType", null);
        setDoubleField(term553345, term553345.getClass(), "number", 0.0);
        setIntField(term553345, term553345.getClass(), "type", 108);
        setField(term553345, term553345.getClass(), "next", null);
        setField(term553345, term553345.getClass(), "first", null);
        setField(term553345, term553345.getClass(), "last", null);
        setField(term553345, term553345.getClass(), "propListHead", null);
        setIntField(term553345, term553345.getClass(), "sourcePosition", 0);
        setField(term553345, term553345.getClass(), "jsType", null);
        setField(term553345, term553345.getClass(), "parent", null);
        setField(term553334, term553334.getClass(), "parent", term553345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term553053;
        args[1] = term553237;
        args[2] = term553329;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term552967, args);
        assertTrue(recursiveEquals(term552967, term553412));
        assertTrue(recursiveEquals(term553053, term553413));
        assertTrue(recursiveEquals(term553237, term553415));
        assertTrue(recursiveEquals(term553329, term553416));
        assertTrue(recursiveEquals(retValue, term553334));
    }

};


