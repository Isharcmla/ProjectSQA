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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256276;
     Object term256368;
     Object term257116;
     Object term257117;
     Object term257051;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256276 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term256368 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256460 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256550 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term256550, term256550.getClass(), "type", 42);
        setField(term256460, term256460.getClass(), "next", term256550);
        setIntField(term256460, term256460.getClass(), "type", 42);
        setField(term256368, term256368.getClass(), "first", term256460);
        setIntField(term256368, term256368.getClass(), "type", 14);
        term257116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term257116, term257116.getClass(), "currentTraversal", null);
        term257117 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257118 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257119 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term257117, term257117.getClass(), "number", 0.0);
        setIntField(term257117, term257117.getClass(), "type", 14);
        setField(term257117, term257117.getClass(), "next", null);
        setDoubleField(term257118, term257118.getClass(), "number", 0.0);
        setIntField(term257118, term257118.getClass(), "type", 42);
        setIntField(term257119, term257119.getClass(), "encodedSourceStart", 0);
        setIntField(term257119, term257119.getClass(), "encodedSourceEnd", 0);
        setField(term257119, term257119.getClass(), "sourceName", null);
        setIntField(term257119, term257119.getClass(), "baseLineno", 0);
        setIntField(term257119, term257119.getClass(), "endLineno", 0);
        setField(term257119, term257119.getClass(), "functions", null);
        setField(term257119, term257119.getClass(), "regexps", null);
        setField(term257119, term257119.getClass(), "itsVariables", null);
        setField(term257119, term257119.getClass(), "itsConst", null);
        setField(term257119, term257119.getClass(), "itsVariableNames", null);
        setIntField(term257119, term257119.getClass(), "varStart", 0);
        setField(term257119, term257119.getClass(), "compilerData", null);
        setIntField(term257119, term257119.getClass(), "type", 42);
        setField(term257119, term257119.getClass(), "next", null);
        setField(term257119, term257119.getClass(), "first", null);
        setField(term257119, term257119.getClass(), "last", null);
        setField(term257119, term257119.getClass(), "propListHead", null);
        setIntField(term257119, term257119.getClass(), "sourcePosition", 0);
        setField(term257119, term257119.getClass(), "jsType", null);
        setField(term257119, term257119.getClass(), "parent", null);
        setField(term257118, term257118.getClass(), "next", term257119);
        setField(term257118, term257118.getClass(), "first", null);
        setField(term257118, term257118.getClass(), "last", null);
        setField(term257118, term257118.getClass(), "propListHead", null);
        setIntField(term257118, term257118.getClass(), "sourcePosition", 0);
        setField(term257118, term257118.getClass(), "jsType", null);
        setField(term257118, term257118.getClass(), "parent", null);
        setField(term257117, term257117.getClass(), "first", term257118);
        setField(term257117, term257117.getClass(), "last", null);
        setField(term257117, term257117.getClass(), "propListHead", null);
        setIntField(term257117, term257117.getClass(), "sourcePosition", 0);
        setField(term257117, term257117.getClass(), "jsType", null);
        setField(term257117, term257117.getClass(), "parent", null);
        term257051 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257057 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term257051, term257051.getClass(), "number", 0.0);
        setIntField(term257051, term257051.getClass(), "type", 14);
        setField(term257051, term257051.getClass(), "next", null);
        setDoubleField(term257054, term257054.getClass(), "number", 0.0);
        setIntField(term257054, term257054.getClass(), "type", 42);
        setIntField(term257057, term257057.getClass(), "encodedSourceStart", 0);
        setIntField(term257057, term257057.getClass(), "encodedSourceEnd", 0);
        setField(term257057, term257057.getClass(), "sourceName", null);
        setIntField(term257057, term257057.getClass(), "baseLineno", 0);
        setIntField(term257057, term257057.getClass(), "endLineno", 0);
        setField(term257057, term257057.getClass(), "functions", null);
        setField(term257057, term257057.getClass(), "regexps", null);
        setField(term257057, term257057.getClass(), "itsVariables", null);
        setField(term257057, term257057.getClass(), "itsConst", null);
        setField(term257057, term257057.getClass(), "itsVariableNames", null);
        setIntField(term257057, term257057.getClass(), "varStart", 0);
        setField(term257057, term257057.getClass(), "compilerData", null);
        setIntField(term257057, term257057.getClass(), "type", 42);
        setField(term257057, term257057.getClass(), "next", null);
        setField(term257057, term257057.getClass(), "first", null);
        setField(term257057, term257057.getClass(), "last", null);
        setField(term257057, term257057.getClass(), "propListHead", null);
        setIntField(term257057, term257057.getClass(), "sourcePosition", 0);
        setField(term257057, term257057.getClass(), "jsType", null);
        setField(term257057, term257057.getClass(), "parent", null);
        setField(term257054, term257054.getClass(), "next", term257057);
        setField(term257054, term257054.getClass(), "first", null);
        setField(term257054, term257054.getClass(), "last", null);
        setField(term257054, term257054.getClass(), "propListHead", null);
        setIntField(term257054, term257054.getClass(), "sourcePosition", 0);
        setField(term257054, term257054.getClass(), "jsType", null);
        setField(term257054, term257054.getClass(), "parent", null);
        setField(term257051, term257051.getClass(), "first", term257054);
        setField(term257051, term257051.getClass(), "last", null);
        setField(term257051, term257051.getClass(), "propListHead", null);
        setIntField(term257051, term257051.getClass(), "sourcePosition", 0);
        setField(term257051, term257051.getClass(), "jsType", null);
        setField(term257051, term257051.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term256368;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term256276, args);
        assertTrue(recursiveEquals(term256276, term257116));
        assertTrue(recursiveEquals(term256368, term257117));
        assertTrue(recursiveEquals(retValue, term257051));
    }

};


