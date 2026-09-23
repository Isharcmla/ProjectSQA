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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term794986;
     Object term795072;
     Object term795256;
     Object term795348;
     Object term795430;
     Object term795431;
     Object term795433;
     Object term795434;
     Object term795352;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term794986 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term795072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term795164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term795164, term795164.getClass(), "type", 114);
        setField(term795072, term795072.getClass(), "parent", term795164);
        setIntField(term795072, term795072.getClass(), "type", 0);
        term795256 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term795256, term795256.getClass(), "type", 127);
        term795348 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term795348, term795348.getClass(), "type", 63);
        term795430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term795430, term795430.getClass(), "currentTraversal", null);
        term795431 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term795432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term795431, term795431.getClass(), "functionName", null);
        setBooleanField(term795431, term795431.getClass(), "itsNeedsActivation", false);
        setIntField(term795431, term795431.getClass(), "itsFunctionType", 0);
        setBooleanField(term795431, term795431.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term795431, term795431.getClass(), "encodedSourceStart", 0);
        setIntField(term795431, term795431.getClass(), "encodedSourceEnd", 0);
        setField(term795431, term795431.getClass(), "sourceName", null);
        setIntField(term795431, term795431.getClass(), "baseLineno", 0);
        setIntField(term795431, term795431.getClass(), "endLineno", 0);
        setField(term795431, term795431.getClass(), "functions", null);
        setField(term795431, term795431.getClass(), "regexps", null);
        setField(term795431, term795431.getClass(), "itsVariables", null);
        setField(term795431, term795431.getClass(), "itsConst", null);
        setField(term795431, term795431.getClass(), "itsVariableNames", null);
        setIntField(term795431, term795431.getClass(), "varStart", 0);
        setField(term795431, term795431.getClass(), "compilerData", null);
        setIntField(term795431, term795431.getClass(), "type", 0);
        setField(term795431, term795431.getClass(), "next", null);
        setField(term795431, term795431.getClass(), "first", null);
        setField(term795431, term795431.getClass(), "last", null);
        setField(term795431, term795431.getClass(), "propListHead", null);
        setIntField(term795431, term795431.getClass(), "sourcePosition", 0);
        setField(term795431, term795431.getClass(), "jsType", null);
        setField(term795432, term795432.getClass(), "str", null);
        setIntField(term795432, term795432.getClass(), "type", 114);
        setField(term795432, term795432.getClass(), "next", null);
        setField(term795432, term795432.getClass(), "first", null);
        setField(term795432, term795432.getClass(), "last", null);
        setField(term795432, term795432.getClass(), "propListHead", null);
        setIntField(term795432, term795432.getClass(), "sourcePosition", 0);
        setField(term795432, term795432.getClass(), "jsType", null);
        setField(term795432, term795432.getClass(), "parent", null);
        setField(term795431, term795431.getClass(), "parent", term795432);
        term795433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term795433, term795433.getClass(), "str", null);
        setIntField(term795433, term795433.getClass(), "type", 127);
        setField(term795433, term795433.getClass(), "next", null);
        setField(term795433, term795433.getClass(), "first", null);
        setField(term795433, term795433.getClass(), "last", null);
        setField(term795433, term795433.getClass(), "propListHead", null);
        setIntField(term795433, term795433.getClass(), "sourcePosition", 0);
        setField(term795433, term795433.getClass(), "jsType", null);
        setField(term795433, term795433.getClass(), "parent", null);
        term795434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term795434, term795434.getClass(), "number", 0.0);
        setIntField(term795434, term795434.getClass(), "type", 63);
        setField(term795434, term795434.getClass(), "next", null);
        setField(term795434, term795434.getClass(), "first", null);
        setField(term795434, term795434.getClass(), "last", null);
        setField(term795434, term795434.getClass(), "propListHead", null);
        setIntField(term795434, term795434.getClass(), "sourcePosition", 0);
        setField(term795434, term795434.getClass(), "jsType", null);
        setField(term795434, term795434.getClass(), "parent", null);
        term795352 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term795363 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term795352, term795352.getClass(), "functionName", null);
        setBooleanField(term795352, term795352.getClass(), "itsNeedsActivation", false);
        setIntField(term795352, term795352.getClass(), "itsFunctionType", 0);
        setBooleanField(term795352, term795352.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term795352, term795352.getClass(), "encodedSourceStart", 0);
        setIntField(term795352, term795352.getClass(), "encodedSourceEnd", 0);
        setField(term795352, term795352.getClass(), "sourceName", null);
        setIntField(term795352, term795352.getClass(), "baseLineno", 0);
        setIntField(term795352, term795352.getClass(), "endLineno", 0);
        setField(term795352, term795352.getClass(), "functions", null);
        setField(term795352, term795352.getClass(), "regexps", null);
        setField(term795352, term795352.getClass(), "itsVariables", null);
        setField(term795352, term795352.getClass(), "itsConst", null);
        setField(term795352, term795352.getClass(), "itsVariableNames", null);
        setIntField(term795352, term795352.getClass(), "varStart", 0);
        setField(term795352, term795352.getClass(), "compilerData", null);
        setIntField(term795352, term795352.getClass(), "type", 0);
        setField(term795352, term795352.getClass(), "next", null);
        setField(term795352, term795352.getClass(), "first", null);
        setField(term795352, term795352.getClass(), "last", null);
        setField(term795352, term795352.getClass(), "propListHead", null);
        setIntField(term795352, term795352.getClass(), "sourcePosition", 0);
        setField(term795352, term795352.getClass(), "jsType", null);
        setField(term795363, term795363.getClass(), "str", null);
        setIntField(term795363, term795363.getClass(), "type", 114);
        setField(term795363, term795363.getClass(), "next", null);
        setField(term795363, term795363.getClass(), "first", null);
        setField(term795363, term795363.getClass(), "last", null);
        setField(term795363, term795363.getClass(), "propListHead", null);
        setIntField(term795363, term795363.getClass(), "sourcePosition", 0);
        setField(term795363, term795363.getClass(), "jsType", null);
        setField(term795363, term795363.getClass(), "parent", null);
        setField(term795352, term795352.getClass(), "parent", term795363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term795072;
        args[1] = term795256;
        args[2] = term795348;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term794986, args);
        assertTrue(recursiveEquals(term794986, term795430));
        assertTrue(recursiveEquals(term795072, term795431));
        assertTrue(recursiveEquals(term795256, term795433));
        assertTrue(recursiveEquals(term795348, term795434));
        assertTrue(recursiveEquals(retValue, term795352));
    }

};


