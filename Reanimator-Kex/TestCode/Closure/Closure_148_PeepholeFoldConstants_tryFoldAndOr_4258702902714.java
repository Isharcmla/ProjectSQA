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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778593;
     Object term778679;
     Object term778863;
     Object term778955;
     Object term779152;
     Object term779153;
     Object term779155;
     Object term779156;
     Object term779076;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term778593 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term778679 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term778771 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term778771, term778771.getClass(), "type", 108);
        setField(term778679, term778679.getClass(), "parent", term778771);
        setIntField(term778679, term778679.getClass(), "type", 0);
        term778863 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term778863, term778863.getClass(), "type", 55);
        term778955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term778955, term778955.getClass(), "type", 64);
        term779152 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term779152, term779152.getClass(), "currentTraversal", null);
        term779153 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term779154 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term779153, term779153.getClass(), "functionName", null);
        setBooleanField(term779153, term779153.getClass(), "itsNeedsActivation", false);
        setIntField(term779153, term779153.getClass(), "itsFunctionType", 0);
        setBooleanField(term779153, term779153.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term779153, term779153.getClass(), "encodedSourceStart", 0);
        setIntField(term779153, term779153.getClass(), "encodedSourceEnd", 0);
        setField(term779153, term779153.getClass(), "sourceName", null);
        setIntField(term779153, term779153.getClass(), "baseLineno", 0);
        setIntField(term779153, term779153.getClass(), "endLineno", 0);
        setField(term779153, term779153.getClass(), "functions", null);
        setField(term779153, term779153.getClass(), "regexps", null);
        setField(term779153, term779153.getClass(), "itsVariables", null);
        setField(term779153, term779153.getClass(), "itsConst", null);
        setField(term779153, term779153.getClass(), "itsVariableNames", null);
        setIntField(term779153, term779153.getClass(), "varStart", 0);
        setField(term779153, term779153.getClass(), "compilerData", null);
        setIntField(term779153, term779153.getClass(), "type", 0);
        setField(term779153, term779153.getClass(), "next", null);
        setField(term779153, term779153.getClass(), "first", null);
        setField(term779153, term779153.getClass(), "last", null);
        setField(term779153, term779153.getClass(), "propListHead", null);
        setIntField(term779153, term779153.getClass(), "sourcePosition", 0);
        setField(term779153, term779153.getClass(), "jsType", null);
        setField(term779154, term779154.getClass(), "str", null);
        setIntField(term779154, term779154.getClass(), "type", 108);
        setField(term779154, term779154.getClass(), "next", null);
        setField(term779154, term779154.getClass(), "first", null);
        setField(term779154, term779154.getClass(), "last", null);
        setField(term779154, term779154.getClass(), "propListHead", null);
        setIntField(term779154, term779154.getClass(), "sourcePosition", 0);
        setField(term779154, term779154.getClass(), "jsType", null);
        setField(term779154, term779154.getClass(), "parent", null);
        setField(term779153, term779153.getClass(), "parent", term779154);
        term779155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term779155, term779155.getClass(), "str", null);
        setIntField(term779155, term779155.getClass(), "type", 55);
        setField(term779155, term779155.getClass(), "next", null);
        setField(term779155, term779155.getClass(), "first", null);
        setField(term779155, term779155.getClass(), "last", null);
        setField(term779155, term779155.getClass(), "propListHead", null);
        setIntField(term779155, term779155.getClass(), "sourcePosition", 0);
        setField(term779155, term779155.getClass(), "jsType", null);
        setField(term779155, term779155.getClass(), "parent", null);
        term779156 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term779156, term779156.getClass(), "number", 0.0);
        setIntField(term779156, term779156.getClass(), "type", 64);
        setField(term779156, term779156.getClass(), "next", null);
        setField(term779156, term779156.getClass(), "first", null);
        setField(term779156, term779156.getClass(), "last", null);
        setField(term779156, term779156.getClass(), "propListHead", null);
        setIntField(term779156, term779156.getClass(), "sourcePosition", 0);
        setField(term779156, term779156.getClass(), "jsType", null);
        setField(term779156, term779156.getClass(), "parent", null);
        term779076 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term779087 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term779076, term779076.getClass(), "functionName", null);
        setBooleanField(term779076, term779076.getClass(), "itsNeedsActivation", false);
        setIntField(term779076, term779076.getClass(), "itsFunctionType", 0);
        setBooleanField(term779076, term779076.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term779076, term779076.getClass(), "encodedSourceStart", 0);
        setIntField(term779076, term779076.getClass(), "encodedSourceEnd", 0);
        setField(term779076, term779076.getClass(), "sourceName", null);
        setIntField(term779076, term779076.getClass(), "baseLineno", 0);
        setIntField(term779076, term779076.getClass(), "endLineno", 0);
        setField(term779076, term779076.getClass(), "functions", null);
        setField(term779076, term779076.getClass(), "regexps", null);
        setField(term779076, term779076.getClass(), "itsVariables", null);
        setField(term779076, term779076.getClass(), "itsConst", null);
        setField(term779076, term779076.getClass(), "itsVariableNames", null);
        setIntField(term779076, term779076.getClass(), "varStart", 0);
        setField(term779076, term779076.getClass(), "compilerData", null);
        setIntField(term779076, term779076.getClass(), "type", 0);
        setField(term779076, term779076.getClass(), "next", null);
        setField(term779076, term779076.getClass(), "first", null);
        setField(term779076, term779076.getClass(), "last", null);
        setField(term779076, term779076.getClass(), "propListHead", null);
        setIntField(term779076, term779076.getClass(), "sourcePosition", 0);
        setField(term779076, term779076.getClass(), "jsType", null);
        setField(term779087, term779087.getClass(), "str", null);
        setIntField(term779087, term779087.getClass(), "type", 108);
        setField(term779087, term779087.getClass(), "next", null);
        setField(term779087, term779087.getClass(), "first", null);
        setField(term779087, term779087.getClass(), "last", null);
        setField(term779087, term779087.getClass(), "propListHead", null);
        setIntField(term779087, term779087.getClass(), "sourcePosition", 0);
        setField(term779087, term779087.getClass(), "jsType", null);
        setField(term779087, term779087.getClass(), "parent", null);
        setField(term779076, term779076.getClass(), "parent", term779087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term778679;
        args[1] = term778863;
        args[2] = term778955;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term778593, args);
        assertTrue(recursiveEquals(term778593, term779152));
        assertTrue(recursiveEquals(term778679, term779153));
        assertTrue(recursiveEquals(term778863, term779155));
        assertTrue(recursiveEquals(term778955, term779156));
        assertTrue(recursiveEquals(retValue, term779076));
    }

};


