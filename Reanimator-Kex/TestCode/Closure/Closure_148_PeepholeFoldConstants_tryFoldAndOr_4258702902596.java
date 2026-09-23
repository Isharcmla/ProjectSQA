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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737622;
     Object term737708;
     Object term737892;
     Object term737984;
     Object term738068;
     Object term738069;
     Object term738071;
     Object term738072;
     Object term737989;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term737622 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term737708 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term737800 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term737800, term737800.getClass(), "type", 108);
        setField(term737708, term737708.getClass(), "parent", term737800);
        setIntField(term737708, term737708.getClass(), "type", 100);
        term737892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term737892, term737892.getClass(), "type", 109);
        term737984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term737984, term737984.getClass(), "type", 44);
        term738068 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term738068, term738068.getClass(), "currentTraversal", null);
        term738069 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738070 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term738069, term738069.getClass(), "functionName", null);
        setBooleanField(term738069, term738069.getClass(), "itsNeedsActivation", false);
        setIntField(term738069, term738069.getClass(), "itsFunctionType", 0);
        setBooleanField(term738069, term738069.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738069, term738069.getClass(), "encodedSourceStart", 0);
        setIntField(term738069, term738069.getClass(), "encodedSourceEnd", 0);
        setField(term738069, term738069.getClass(), "sourceName", null);
        setIntField(term738069, term738069.getClass(), "baseLineno", 0);
        setIntField(term738069, term738069.getClass(), "endLineno", 0);
        setField(term738069, term738069.getClass(), "functions", null);
        setField(term738069, term738069.getClass(), "regexps", null);
        setField(term738069, term738069.getClass(), "itsVariables", null);
        setField(term738069, term738069.getClass(), "itsConst", null);
        setField(term738069, term738069.getClass(), "itsVariableNames", null);
        setIntField(term738069, term738069.getClass(), "varStart", 0);
        setField(term738069, term738069.getClass(), "compilerData", null);
        setIntField(term738069, term738069.getClass(), "type", 100);
        setField(term738069, term738069.getClass(), "next", null);
        setField(term738069, term738069.getClass(), "first", null);
        setField(term738069, term738069.getClass(), "last", null);
        setField(term738069, term738069.getClass(), "propListHead", null);
        setIntField(term738069, term738069.getClass(), "sourcePosition", 0);
        setField(term738069, term738069.getClass(), "jsType", null);
        setDoubleField(term738070, term738070.getClass(), "number", 0.0);
        setIntField(term738070, term738070.getClass(), "type", 108);
        setField(term738070, term738070.getClass(), "next", null);
        setField(term738070, term738070.getClass(), "first", null);
        setField(term738070, term738070.getClass(), "last", null);
        setField(term738070, term738070.getClass(), "propListHead", null);
        setIntField(term738070, term738070.getClass(), "sourcePosition", 0);
        setField(term738070, term738070.getClass(), "jsType", null);
        setField(term738070, term738070.getClass(), "parent", null);
        setField(term738069, term738069.getClass(), "parent", term738070);
        term738071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term738071, term738071.getClass(), "number", 0.0);
        setIntField(term738071, term738071.getClass(), "type", 109);
        setField(term738071, term738071.getClass(), "next", null);
        setField(term738071, term738071.getClass(), "first", null);
        setField(term738071, term738071.getClass(), "last", null);
        setField(term738071, term738071.getClass(), "propListHead", null);
        setIntField(term738071, term738071.getClass(), "sourcePosition", 0);
        setField(term738071, term738071.getClass(), "jsType", null);
        setField(term738071, term738071.getClass(), "parent", null);
        term738072 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term738072, term738072.getClass(), "str", null);
        setIntField(term738072, term738072.getClass(), "type", 44);
        setField(term738072, term738072.getClass(), "next", null);
        setField(term738072, term738072.getClass(), "first", null);
        setField(term738072, term738072.getClass(), "last", null);
        setField(term738072, term738072.getClass(), "propListHead", null);
        setIntField(term738072, term738072.getClass(), "sourcePosition", 0);
        setField(term738072, term738072.getClass(), "jsType", null);
        setField(term738072, term738072.getClass(), "parent", null);
        term737989 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738000 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term737989, term737989.getClass(), "functionName", null);
        setBooleanField(term737989, term737989.getClass(), "itsNeedsActivation", false);
        setIntField(term737989, term737989.getClass(), "itsFunctionType", 0);
        setBooleanField(term737989, term737989.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term737989, term737989.getClass(), "encodedSourceStart", 0);
        setIntField(term737989, term737989.getClass(), "encodedSourceEnd", 0);
        setField(term737989, term737989.getClass(), "sourceName", null);
        setIntField(term737989, term737989.getClass(), "baseLineno", 0);
        setIntField(term737989, term737989.getClass(), "endLineno", 0);
        setField(term737989, term737989.getClass(), "functions", null);
        setField(term737989, term737989.getClass(), "regexps", null);
        setField(term737989, term737989.getClass(), "itsVariables", null);
        setField(term737989, term737989.getClass(), "itsConst", null);
        setField(term737989, term737989.getClass(), "itsVariableNames", null);
        setIntField(term737989, term737989.getClass(), "varStart", 0);
        setField(term737989, term737989.getClass(), "compilerData", null);
        setIntField(term737989, term737989.getClass(), "type", 100);
        setField(term737989, term737989.getClass(), "next", null);
        setField(term737989, term737989.getClass(), "first", null);
        setField(term737989, term737989.getClass(), "last", null);
        setField(term737989, term737989.getClass(), "propListHead", null);
        setIntField(term737989, term737989.getClass(), "sourcePosition", 0);
        setField(term737989, term737989.getClass(), "jsType", null);
        setDoubleField(term738000, term738000.getClass(), "number", 0.0);
        setIntField(term738000, term738000.getClass(), "type", 108);
        setField(term738000, term738000.getClass(), "next", null);
        setField(term738000, term738000.getClass(), "first", null);
        setField(term738000, term738000.getClass(), "last", null);
        setField(term738000, term738000.getClass(), "propListHead", null);
        setIntField(term738000, term738000.getClass(), "sourcePosition", 0);
        setField(term738000, term738000.getClass(), "jsType", null);
        setField(term738000, term738000.getClass(), "parent", null);
        setField(term737989, term737989.getClass(), "parent", term738000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term737708;
        args[1] = term737892;
        args[2] = term737984;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term737622, args);
        assertTrue(recursiveEquals(term737622, term738068));
        assertTrue(recursiveEquals(term737708, term738069));
        assertTrue(recursiveEquals(term737892, term738071));
        assertTrue(recursiveEquals(term737984, term738072));
        assertTrue(recursiveEquals(retValue, term737989));
    }

};


