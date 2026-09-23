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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term792653;
     Object term792739;
     Object term792923;
     Object term793015;
     Object term793622;
     Object term793623;
     Object term793625;
     Object term793626;
     Object term793544;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term792653 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term792739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term792831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term792831, term792831.getClass(), "type", 108);
        setField(term792739, term792739.getClass(), "parent", term792831);
        setIntField(term792739, term792739.getClass(), "type", 0);
        term792923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term792923, term792923.getClass(), "type", 53);
        term793015 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term793015, term793015.getClass(), "type", 44);
        term793622 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term793622, term793622.getClass(), "currentTraversal", null);
        term793623 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term793624 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term793623, term793623.getClass(), "functionName", null);
        setBooleanField(term793623, term793623.getClass(), "itsNeedsActivation", false);
        setIntField(term793623, term793623.getClass(), "itsFunctionType", 0);
        setBooleanField(term793623, term793623.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term793623, term793623.getClass(), "encodedSourceStart", 0);
        setIntField(term793623, term793623.getClass(), "encodedSourceEnd", 0);
        setField(term793623, term793623.getClass(), "sourceName", null);
        setIntField(term793623, term793623.getClass(), "baseLineno", 0);
        setIntField(term793623, term793623.getClass(), "endLineno", 0);
        setField(term793623, term793623.getClass(), "functions", null);
        setField(term793623, term793623.getClass(), "regexps", null);
        setField(term793623, term793623.getClass(), "itsVariables", null);
        setField(term793623, term793623.getClass(), "itsConst", null);
        setField(term793623, term793623.getClass(), "itsVariableNames", null);
        setIntField(term793623, term793623.getClass(), "varStart", 0);
        setField(term793623, term793623.getClass(), "compilerData", null);
        setIntField(term793623, term793623.getClass(), "type", 0);
        setField(term793623, term793623.getClass(), "next", null);
        setField(term793623, term793623.getClass(), "first", null);
        setField(term793623, term793623.getClass(), "last", null);
        setField(term793623, term793623.getClass(), "propListHead", null);
        setIntField(term793623, term793623.getClass(), "sourcePosition", 0);
        setField(term793623, term793623.getClass(), "jsType", null);
        setDoubleField(term793624, term793624.getClass(), "number", 0.0);
        setIntField(term793624, term793624.getClass(), "type", 108);
        setField(term793624, term793624.getClass(), "next", null);
        setField(term793624, term793624.getClass(), "first", null);
        setField(term793624, term793624.getClass(), "last", null);
        setField(term793624, term793624.getClass(), "propListHead", null);
        setIntField(term793624, term793624.getClass(), "sourcePosition", 0);
        setField(term793624, term793624.getClass(), "jsType", null);
        setField(term793624, term793624.getClass(), "parent", null);
        setField(term793623, term793623.getClass(), "parent", term793624);
        term793625 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term793625, term793625.getClass(), "number", 0.0);
        setIntField(term793625, term793625.getClass(), "type", 53);
        setField(term793625, term793625.getClass(), "next", null);
        setField(term793625, term793625.getClass(), "first", null);
        setField(term793625, term793625.getClass(), "last", null);
        setField(term793625, term793625.getClass(), "propListHead", null);
        setIntField(term793625, term793625.getClass(), "sourcePosition", 0);
        setField(term793625, term793625.getClass(), "jsType", null);
        setField(term793625, term793625.getClass(), "parent", null);
        term793626 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term793626, term793626.getClass(), "str", null);
        setIntField(term793626, term793626.getClass(), "type", 44);
        setField(term793626, term793626.getClass(), "next", null);
        setField(term793626, term793626.getClass(), "first", null);
        setField(term793626, term793626.getClass(), "last", null);
        setField(term793626, term793626.getClass(), "propListHead", null);
        setIntField(term793626, term793626.getClass(), "sourcePosition", 0);
        setField(term793626, term793626.getClass(), "jsType", null);
        setField(term793626, term793626.getClass(), "parent", null);
        term793544 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term793555 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term793544, term793544.getClass(), "functionName", null);
        setBooleanField(term793544, term793544.getClass(), "itsNeedsActivation", false);
        setIntField(term793544, term793544.getClass(), "itsFunctionType", 0);
        setBooleanField(term793544, term793544.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term793544, term793544.getClass(), "encodedSourceStart", 0);
        setIntField(term793544, term793544.getClass(), "encodedSourceEnd", 0);
        setField(term793544, term793544.getClass(), "sourceName", null);
        setIntField(term793544, term793544.getClass(), "baseLineno", 0);
        setIntField(term793544, term793544.getClass(), "endLineno", 0);
        setField(term793544, term793544.getClass(), "functions", null);
        setField(term793544, term793544.getClass(), "regexps", null);
        setField(term793544, term793544.getClass(), "itsVariables", null);
        setField(term793544, term793544.getClass(), "itsConst", null);
        setField(term793544, term793544.getClass(), "itsVariableNames", null);
        setIntField(term793544, term793544.getClass(), "varStart", 0);
        setField(term793544, term793544.getClass(), "compilerData", null);
        setIntField(term793544, term793544.getClass(), "type", 0);
        setField(term793544, term793544.getClass(), "next", null);
        setField(term793544, term793544.getClass(), "first", null);
        setField(term793544, term793544.getClass(), "last", null);
        setField(term793544, term793544.getClass(), "propListHead", null);
        setIntField(term793544, term793544.getClass(), "sourcePosition", 0);
        setField(term793544, term793544.getClass(), "jsType", null);
        setDoubleField(term793555, term793555.getClass(), "number", 0.0);
        setIntField(term793555, term793555.getClass(), "type", 108);
        setField(term793555, term793555.getClass(), "next", null);
        setField(term793555, term793555.getClass(), "first", null);
        setField(term793555, term793555.getClass(), "last", null);
        setField(term793555, term793555.getClass(), "propListHead", null);
        setIntField(term793555, term793555.getClass(), "sourcePosition", 0);
        setField(term793555, term793555.getClass(), "jsType", null);
        setField(term793555, term793555.getClass(), "parent", null);
        setField(term793544, term793544.getClass(), "parent", term793555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term792739;
        args[1] = term792923;
        args[2] = term793015;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term792653, args);
        assertTrue(recursiveEquals(term792653, term793622));
        assertTrue(recursiveEquals(term792739, term793623));
        assertTrue(recursiveEquals(term792923, term793625));
        assertTrue(recursiveEquals(term793015, term793626));
        assertTrue(recursiveEquals(retValue, term793544));
    }

};


