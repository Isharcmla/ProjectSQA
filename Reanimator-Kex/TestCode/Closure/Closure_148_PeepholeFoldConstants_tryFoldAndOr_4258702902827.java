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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821689;
     Object term821775;
     Object term821959;
     Object term822051;
     Object term822543;
     Object term822544;
     Object term822546;
     Object term822547;
     Object term822467;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term821689 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term821775 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term821867 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term821867, term821867.getClass(), "type", 108);
        setField(term821775, term821775.getClass(), "parent", term821867);
        setIntField(term821775, term821775.getClass(), "type", 0);
        term821959 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term821959, term821959.getClass(), "type", 128);
        term822051 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term822051, term822051.getClass(), "type", 64);
        term822543 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term822543, term822543.getClass(), "currentTraversal", null);
        term822544 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term822545 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term822544, term822544.getClass(), "functionName", null);
        setBooleanField(term822544, term822544.getClass(), "itsNeedsActivation", false);
        setIntField(term822544, term822544.getClass(), "itsFunctionType", 0);
        setBooleanField(term822544, term822544.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term822544, term822544.getClass(), "encodedSourceStart", 0);
        setIntField(term822544, term822544.getClass(), "encodedSourceEnd", 0);
        setField(term822544, term822544.getClass(), "sourceName", null);
        setIntField(term822544, term822544.getClass(), "baseLineno", 0);
        setIntField(term822544, term822544.getClass(), "endLineno", 0);
        setField(term822544, term822544.getClass(), "functions", null);
        setField(term822544, term822544.getClass(), "regexps", null);
        setField(term822544, term822544.getClass(), "itsVariables", null);
        setField(term822544, term822544.getClass(), "itsConst", null);
        setField(term822544, term822544.getClass(), "itsVariableNames", null);
        setIntField(term822544, term822544.getClass(), "varStart", 0);
        setField(term822544, term822544.getClass(), "compilerData", null);
        setIntField(term822544, term822544.getClass(), "type", 0);
        setField(term822544, term822544.getClass(), "next", null);
        setField(term822544, term822544.getClass(), "first", null);
        setField(term822544, term822544.getClass(), "last", null);
        setField(term822544, term822544.getClass(), "propListHead", null);
        setIntField(term822544, term822544.getClass(), "sourcePosition", 0);
        setField(term822544, term822544.getClass(), "jsType", null);
        setField(term822545, term822545.getClass(), "str", null);
        setIntField(term822545, term822545.getClass(), "type", 108);
        setField(term822545, term822545.getClass(), "next", null);
        setField(term822545, term822545.getClass(), "first", null);
        setField(term822545, term822545.getClass(), "last", null);
        setField(term822545, term822545.getClass(), "propListHead", null);
        setIntField(term822545, term822545.getClass(), "sourcePosition", 0);
        setField(term822545, term822545.getClass(), "jsType", null);
        setField(term822545, term822545.getClass(), "parent", null);
        setField(term822544, term822544.getClass(), "parent", term822545);
        term822546 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term822546, term822546.getClass(), "str", null);
        setIntField(term822546, term822546.getClass(), "type", 128);
        setField(term822546, term822546.getClass(), "next", null);
        setField(term822546, term822546.getClass(), "first", null);
        setField(term822546, term822546.getClass(), "last", null);
        setField(term822546, term822546.getClass(), "propListHead", null);
        setIntField(term822546, term822546.getClass(), "sourcePosition", 0);
        setField(term822546, term822546.getClass(), "jsType", null);
        setField(term822546, term822546.getClass(), "parent", null);
        term822547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term822547, term822547.getClass(), "number", 0.0);
        setIntField(term822547, term822547.getClass(), "type", 64);
        setField(term822547, term822547.getClass(), "next", null);
        setField(term822547, term822547.getClass(), "first", null);
        setField(term822547, term822547.getClass(), "last", null);
        setField(term822547, term822547.getClass(), "propListHead", null);
        setIntField(term822547, term822547.getClass(), "sourcePosition", 0);
        setField(term822547, term822547.getClass(), "jsType", null);
        setField(term822547, term822547.getClass(), "parent", null);
        term822467 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term822478 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term822467, term822467.getClass(), "functionName", null);
        setBooleanField(term822467, term822467.getClass(), "itsNeedsActivation", false);
        setIntField(term822467, term822467.getClass(), "itsFunctionType", 0);
        setBooleanField(term822467, term822467.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term822467, term822467.getClass(), "encodedSourceStart", 0);
        setIntField(term822467, term822467.getClass(), "encodedSourceEnd", 0);
        setField(term822467, term822467.getClass(), "sourceName", null);
        setIntField(term822467, term822467.getClass(), "baseLineno", 0);
        setIntField(term822467, term822467.getClass(), "endLineno", 0);
        setField(term822467, term822467.getClass(), "functions", null);
        setField(term822467, term822467.getClass(), "regexps", null);
        setField(term822467, term822467.getClass(), "itsVariables", null);
        setField(term822467, term822467.getClass(), "itsConst", null);
        setField(term822467, term822467.getClass(), "itsVariableNames", null);
        setIntField(term822467, term822467.getClass(), "varStart", 0);
        setField(term822467, term822467.getClass(), "compilerData", null);
        setIntField(term822467, term822467.getClass(), "type", 0);
        setField(term822467, term822467.getClass(), "next", null);
        setField(term822467, term822467.getClass(), "first", null);
        setField(term822467, term822467.getClass(), "last", null);
        setField(term822467, term822467.getClass(), "propListHead", null);
        setIntField(term822467, term822467.getClass(), "sourcePosition", 0);
        setField(term822467, term822467.getClass(), "jsType", null);
        setField(term822478, term822478.getClass(), "str", null);
        setIntField(term822478, term822478.getClass(), "type", 108);
        setField(term822478, term822478.getClass(), "next", null);
        setField(term822478, term822478.getClass(), "first", null);
        setField(term822478, term822478.getClass(), "last", null);
        setField(term822478, term822478.getClass(), "propListHead", null);
        setIntField(term822478, term822478.getClass(), "sourcePosition", 0);
        setField(term822478, term822478.getClass(), "jsType", null);
        setField(term822478, term822478.getClass(), "parent", null);
        setField(term822467, term822467.getClass(), "parent", term822478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term821775;
        args[1] = term821959;
        args[2] = term822051;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term821689, args);
        assertTrue(recursiveEquals(term821689, term822543));
        assertTrue(recursiveEquals(term821775, term822544));
        assertTrue(recursiveEquals(term821959, term822546));
        assertTrue(recursiveEquals(term822051, term822547));
        assertTrue(recursiveEquals(retValue, term822467));
    }

};


