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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711058;
     Object term711144;
     Object term711328;
     Object term711420;
     Object term711599;
     Object term711600;
     Object term711602;
     Object term711603;
     Object term711519;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711058 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term711144 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term711236 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term711236, term711236.getClass(), "type", 114);
        setField(term711144, term711144.getClass(), "parent", term711236);
        setIntField(term711144, term711144.getClass(), "type", 0);
        term711328 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term711328, term711328.getClass(), "type", 80);
        term711420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term711420, term711420.getClass(), "type", 44);
        term711599 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term711599, term711599.getClass(), "currentTraversal", null);
        term711600 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term711601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term711600, term711600.getClass(), "functionName", null);
        setBooleanField(term711600, term711600.getClass(), "itsNeedsActivation", false);
        setIntField(term711600, term711600.getClass(), "itsFunctionType", 0);
        setBooleanField(term711600, term711600.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term711600, term711600.getClass(), "encodedSourceStart", 0);
        setIntField(term711600, term711600.getClass(), "encodedSourceEnd", 0);
        setField(term711600, term711600.getClass(), "sourceName", null);
        setIntField(term711600, term711600.getClass(), "baseLineno", 0);
        setIntField(term711600, term711600.getClass(), "endLineno", 0);
        setField(term711600, term711600.getClass(), "functions", null);
        setField(term711600, term711600.getClass(), "regexps", null);
        setField(term711600, term711600.getClass(), "itsVariables", null);
        setField(term711600, term711600.getClass(), "itsConst", null);
        setField(term711600, term711600.getClass(), "itsVariableNames", null);
        setIntField(term711600, term711600.getClass(), "varStart", 0);
        setField(term711600, term711600.getClass(), "compilerData", null);
        setIntField(term711600, term711600.getClass(), "type", 0);
        setField(term711600, term711600.getClass(), "next", null);
        setField(term711600, term711600.getClass(), "first", null);
        setField(term711600, term711600.getClass(), "last", null);
        setField(term711600, term711600.getClass(), "propListHead", null);
        setIntField(term711600, term711600.getClass(), "sourcePosition", 0);
        setField(term711600, term711600.getClass(), "jsType", null);
        setDoubleField(term711601, term711601.getClass(), "number", 0.0);
        setIntField(term711601, term711601.getClass(), "type", 114);
        setField(term711601, term711601.getClass(), "next", null);
        setField(term711601, term711601.getClass(), "first", null);
        setField(term711601, term711601.getClass(), "last", null);
        setField(term711601, term711601.getClass(), "propListHead", null);
        setIntField(term711601, term711601.getClass(), "sourcePosition", 0);
        setField(term711601, term711601.getClass(), "jsType", null);
        setField(term711601, term711601.getClass(), "parent", null);
        setField(term711600, term711600.getClass(), "parent", term711601);
        term711602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term711602, term711602.getClass(), "number", 0.0);
        setIntField(term711602, term711602.getClass(), "type", 80);
        setField(term711602, term711602.getClass(), "next", null);
        setField(term711602, term711602.getClass(), "first", null);
        setField(term711602, term711602.getClass(), "last", null);
        setField(term711602, term711602.getClass(), "propListHead", null);
        setIntField(term711602, term711602.getClass(), "sourcePosition", 0);
        setField(term711602, term711602.getClass(), "jsType", null);
        setField(term711602, term711602.getClass(), "parent", null);
        term711603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term711603, term711603.getClass(), "str", null);
        setIntField(term711603, term711603.getClass(), "type", 44);
        setField(term711603, term711603.getClass(), "next", null);
        setField(term711603, term711603.getClass(), "first", null);
        setField(term711603, term711603.getClass(), "last", null);
        setField(term711603, term711603.getClass(), "propListHead", null);
        setIntField(term711603, term711603.getClass(), "sourcePosition", 0);
        setField(term711603, term711603.getClass(), "jsType", null);
        setField(term711603, term711603.getClass(), "parent", null);
        term711519 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term711530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term711519, term711519.getClass(), "functionName", null);
        setBooleanField(term711519, term711519.getClass(), "itsNeedsActivation", false);
        setIntField(term711519, term711519.getClass(), "itsFunctionType", 0);
        setBooleanField(term711519, term711519.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term711519, term711519.getClass(), "encodedSourceStart", 0);
        setIntField(term711519, term711519.getClass(), "encodedSourceEnd", 0);
        setField(term711519, term711519.getClass(), "sourceName", null);
        setIntField(term711519, term711519.getClass(), "baseLineno", 0);
        setIntField(term711519, term711519.getClass(), "endLineno", 0);
        setField(term711519, term711519.getClass(), "functions", null);
        setField(term711519, term711519.getClass(), "regexps", null);
        setField(term711519, term711519.getClass(), "itsVariables", null);
        setField(term711519, term711519.getClass(), "itsConst", null);
        setField(term711519, term711519.getClass(), "itsVariableNames", null);
        setIntField(term711519, term711519.getClass(), "varStart", 0);
        setField(term711519, term711519.getClass(), "compilerData", null);
        setIntField(term711519, term711519.getClass(), "type", 0);
        setField(term711519, term711519.getClass(), "next", null);
        setField(term711519, term711519.getClass(), "first", null);
        setField(term711519, term711519.getClass(), "last", null);
        setField(term711519, term711519.getClass(), "propListHead", null);
        setIntField(term711519, term711519.getClass(), "sourcePosition", 0);
        setField(term711519, term711519.getClass(), "jsType", null);
        setDoubleField(term711530, term711530.getClass(), "number", 0.0);
        setIntField(term711530, term711530.getClass(), "type", 114);
        setField(term711530, term711530.getClass(), "next", null);
        setField(term711530, term711530.getClass(), "first", null);
        setField(term711530, term711530.getClass(), "last", null);
        setField(term711530, term711530.getClass(), "propListHead", null);
        setIntField(term711530, term711530.getClass(), "sourcePosition", 0);
        setField(term711530, term711530.getClass(), "jsType", null);
        setField(term711530, term711530.getClass(), "parent", null);
        setField(term711519, term711519.getClass(), "parent", term711530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term711144;
        args[1] = term711328;
        args[2] = term711420;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term711058, args);
        assertTrue(recursiveEquals(term711058, term711599));
        assertTrue(recursiveEquals(term711144, term711600));
        assertTrue(recursiveEquals(term711328, term711602));
        assertTrue(recursiveEquals(term711420, term711603));
        assertTrue(recursiveEquals(retValue, term711519));
    }

};


