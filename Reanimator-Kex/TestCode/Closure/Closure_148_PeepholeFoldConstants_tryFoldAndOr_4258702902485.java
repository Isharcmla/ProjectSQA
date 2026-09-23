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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696575;
     Object term696661;
     Object term696845;
     Object term696937;
     Object term697570;
     Object term697571;
     Object term697573;
     Object term697574;
     Object term697492;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term696575 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term696661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term696753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term696753, term696753.getClass(), "type", 108);
        setField(term696661, term696661.getClass(), "parent", term696753);
        setIntField(term696661, term696661.getClass(), "type", 0);
        term696845 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term696845, term696845.getClass(), "type", 106);
        term696937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term696937, term696937.getClass(), "type", 44);
        term697570 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term697570, term697570.getClass(), "currentTraversal", null);
        term697571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term697572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term697571, term697571.getClass(), "functionName", null);
        setBooleanField(term697571, term697571.getClass(), "itsNeedsActivation", false);
        setIntField(term697571, term697571.getClass(), "itsFunctionType", 0);
        setBooleanField(term697571, term697571.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term697571, term697571.getClass(), "encodedSourceStart", 0);
        setIntField(term697571, term697571.getClass(), "encodedSourceEnd", 0);
        setField(term697571, term697571.getClass(), "sourceName", null);
        setIntField(term697571, term697571.getClass(), "baseLineno", 0);
        setIntField(term697571, term697571.getClass(), "endLineno", 0);
        setField(term697571, term697571.getClass(), "functions", null);
        setField(term697571, term697571.getClass(), "regexps", null);
        setField(term697571, term697571.getClass(), "itsVariables", null);
        setField(term697571, term697571.getClass(), "itsConst", null);
        setField(term697571, term697571.getClass(), "itsVariableNames", null);
        setIntField(term697571, term697571.getClass(), "varStart", 0);
        setField(term697571, term697571.getClass(), "compilerData", null);
        setIntField(term697571, term697571.getClass(), "type", 0);
        setField(term697571, term697571.getClass(), "next", null);
        setField(term697571, term697571.getClass(), "first", null);
        setField(term697571, term697571.getClass(), "last", null);
        setField(term697571, term697571.getClass(), "propListHead", null);
        setIntField(term697571, term697571.getClass(), "sourcePosition", 0);
        setField(term697571, term697571.getClass(), "jsType", null);
        setDoubleField(term697572, term697572.getClass(), "number", 0.0);
        setIntField(term697572, term697572.getClass(), "type", 108);
        setField(term697572, term697572.getClass(), "next", null);
        setField(term697572, term697572.getClass(), "first", null);
        setField(term697572, term697572.getClass(), "last", null);
        setField(term697572, term697572.getClass(), "propListHead", null);
        setIntField(term697572, term697572.getClass(), "sourcePosition", 0);
        setField(term697572, term697572.getClass(), "jsType", null);
        setField(term697572, term697572.getClass(), "parent", null);
        setField(term697571, term697571.getClass(), "parent", term697572);
        term697573 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term697573, term697573.getClass(), "number", 0.0);
        setIntField(term697573, term697573.getClass(), "type", 106);
        setField(term697573, term697573.getClass(), "next", null);
        setField(term697573, term697573.getClass(), "first", null);
        setField(term697573, term697573.getClass(), "last", null);
        setField(term697573, term697573.getClass(), "propListHead", null);
        setIntField(term697573, term697573.getClass(), "sourcePosition", 0);
        setField(term697573, term697573.getClass(), "jsType", null);
        setField(term697573, term697573.getClass(), "parent", null);
        term697574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term697574, term697574.getClass(), "str", null);
        setIntField(term697574, term697574.getClass(), "type", 44);
        setField(term697574, term697574.getClass(), "next", null);
        setField(term697574, term697574.getClass(), "first", null);
        setField(term697574, term697574.getClass(), "last", null);
        setField(term697574, term697574.getClass(), "propListHead", null);
        setIntField(term697574, term697574.getClass(), "sourcePosition", 0);
        setField(term697574, term697574.getClass(), "jsType", null);
        setField(term697574, term697574.getClass(), "parent", null);
        term697492 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term697503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term697492, term697492.getClass(), "functionName", null);
        setBooleanField(term697492, term697492.getClass(), "itsNeedsActivation", false);
        setIntField(term697492, term697492.getClass(), "itsFunctionType", 0);
        setBooleanField(term697492, term697492.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term697492, term697492.getClass(), "encodedSourceStart", 0);
        setIntField(term697492, term697492.getClass(), "encodedSourceEnd", 0);
        setField(term697492, term697492.getClass(), "sourceName", null);
        setIntField(term697492, term697492.getClass(), "baseLineno", 0);
        setIntField(term697492, term697492.getClass(), "endLineno", 0);
        setField(term697492, term697492.getClass(), "functions", null);
        setField(term697492, term697492.getClass(), "regexps", null);
        setField(term697492, term697492.getClass(), "itsVariables", null);
        setField(term697492, term697492.getClass(), "itsConst", null);
        setField(term697492, term697492.getClass(), "itsVariableNames", null);
        setIntField(term697492, term697492.getClass(), "varStart", 0);
        setField(term697492, term697492.getClass(), "compilerData", null);
        setIntField(term697492, term697492.getClass(), "type", 0);
        setField(term697492, term697492.getClass(), "next", null);
        setField(term697492, term697492.getClass(), "first", null);
        setField(term697492, term697492.getClass(), "last", null);
        setField(term697492, term697492.getClass(), "propListHead", null);
        setIntField(term697492, term697492.getClass(), "sourcePosition", 0);
        setField(term697492, term697492.getClass(), "jsType", null);
        setDoubleField(term697503, term697503.getClass(), "number", 0.0);
        setIntField(term697503, term697503.getClass(), "type", 108);
        setField(term697503, term697503.getClass(), "next", null);
        setField(term697503, term697503.getClass(), "first", null);
        setField(term697503, term697503.getClass(), "last", null);
        setField(term697503, term697503.getClass(), "propListHead", null);
        setIntField(term697503, term697503.getClass(), "sourcePosition", 0);
        setField(term697503, term697503.getClass(), "jsType", null);
        setField(term697503, term697503.getClass(), "parent", null);
        setField(term697492, term697492.getClass(), "parent", term697503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term696661;
        args[1] = term696845;
        args[2] = term696937;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term696575, args);
        assertTrue(recursiveEquals(term696575, term697570));
        assertTrue(recursiveEquals(term696661, term697571));
        assertTrue(recursiveEquals(term696845, term697573));
        assertTrue(recursiveEquals(term696937, term697574));
        assertTrue(recursiveEquals(retValue, term697492));
    }

};


