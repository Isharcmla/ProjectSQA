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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224427;
     Object term224519;
     Object term225321;
     Object term225322;
     Object term225273;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224427 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term224519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term224611 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term224701 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term224611, term224611.getClass(), "next", term224701);
        setIntField(term224611, term224611.getClass(), "type", 39);
        setField(term224519, term224519.getClass(), "first", term224611);
        setIntField(term224519, term224519.getClass(), "type", 20);
        term225321 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term225321, term225321.getClass(), "currentTraversal", null);
        term225322 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term225323 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term225324 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term225322, term225322.getClass(), "number", 0.0);
        setIntField(term225322, term225322.getClass(), "type", 20);
        setField(term225322, term225322.getClass(), "next", null);
        setDoubleField(term225323, term225323.getClass(), "number", 0.0);
        setIntField(term225323, term225323.getClass(), "type", 39);
        setIntField(term225324, term225324.getClass(), "encodedSourceStart", 0);
        setIntField(term225324, term225324.getClass(), "encodedSourceEnd", 0);
        setField(term225324, term225324.getClass(), "sourceName", null);
        setIntField(term225324, term225324.getClass(), "baseLineno", 0);
        setIntField(term225324, term225324.getClass(), "endLineno", 0);
        setField(term225324, term225324.getClass(), "functions", null);
        setField(term225324, term225324.getClass(), "regexps", null);
        setField(term225324, term225324.getClass(), "itsVariables", null);
        setField(term225324, term225324.getClass(), "itsConst", null);
        setField(term225324, term225324.getClass(), "itsVariableNames", null);
        setIntField(term225324, term225324.getClass(), "varStart", 0);
        setField(term225324, term225324.getClass(), "compilerData", null);
        setIntField(term225324, term225324.getClass(), "type", 0);
        setField(term225324, term225324.getClass(), "next", null);
        setField(term225324, term225324.getClass(), "first", null);
        setField(term225324, term225324.getClass(), "last", null);
        setField(term225324, term225324.getClass(), "propListHead", null);
        setIntField(term225324, term225324.getClass(), "sourcePosition", 0);
        setField(term225324, term225324.getClass(), "jsType", null);
        setField(term225324, term225324.getClass(), "parent", null);
        setField(term225323, term225323.getClass(), "next", term225324);
        setField(term225323, term225323.getClass(), "first", null);
        setField(term225323, term225323.getClass(), "last", null);
        setField(term225323, term225323.getClass(), "propListHead", null);
        setIntField(term225323, term225323.getClass(), "sourcePosition", 0);
        setField(term225323, term225323.getClass(), "jsType", null);
        setField(term225323, term225323.getClass(), "parent", null);
        setField(term225322, term225322.getClass(), "first", term225323);
        setField(term225322, term225322.getClass(), "last", null);
        setField(term225322, term225322.getClass(), "propListHead", null);
        setIntField(term225322, term225322.getClass(), "sourcePosition", 0);
        setField(term225322, term225322.getClass(), "jsType", null);
        setField(term225322, term225322.getClass(), "parent", null);
        term225273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term225276 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term225279 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term225273, term225273.getClass(), "number", 0.0);
        setIntField(term225273, term225273.getClass(), "type", 20);
        setField(term225273, term225273.getClass(), "next", null);
        setDoubleField(term225276, term225276.getClass(), "number", 0.0);
        setIntField(term225276, term225276.getClass(), "type", 39);
        setIntField(term225279, term225279.getClass(), "encodedSourceStart", 0);
        setIntField(term225279, term225279.getClass(), "encodedSourceEnd", 0);
        setField(term225279, term225279.getClass(), "sourceName", null);
        setIntField(term225279, term225279.getClass(), "baseLineno", 0);
        setIntField(term225279, term225279.getClass(), "endLineno", 0);
        setField(term225279, term225279.getClass(), "functions", null);
        setField(term225279, term225279.getClass(), "regexps", null);
        setField(term225279, term225279.getClass(), "itsVariables", null);
        setField(term225279, term225279.getClass(), "itsConst", null);
        setField(term225279, term225279.getClass(), "itsVariableNames", null);
        setIntField(term225279, term225279.getClass(), "varStart", 0);
        setField(term225279, term225279.getClass(), "compilerData", null);
        setIntField(term225279, term225279.getClass(), "type", 0);
        setField(term225279, term225279.getClass(), "next", null);
        setField(term225279, term225279.getClass(), "first", null);
        setField(term225279, term225279.getClass(), "last", null);
        setField(term225279, term225279.getClass(), "propListHead", null);
        setIntField(term225279, term225279.getClass(), "sourcePosition", 0);
        setField(term225279, term225279.getClass(), "jsType", null);
        setField(term225279, term225279.getClass(), "parent", null);
        setField(term225276, term225276.getClass(), "next", term225279);
        setField(term225276, term225276.getClass(), "first", null);
        setField(term225276, term225276.getClass(), "last", null);
        setField(term225276, term225276.getClass(), "propListHead", null);
        setIntField(term225276, term225276.getClass(), "sourcePosition", 0);
        setField(term225276, term225276.getClass(), "jsType", null);
        setField(term225276, term225276.getClass(), "parent", null);
        setField(term225273, term225273.getClass(), "first", term225276);
        setField(term225273, term225273.getClass(), "last", null);
        setField(term225273, term225273.getClass(), "propListHead", null);
        setIntField(term225273, term225273.getClass(), "sourcePosition", 0);
        setField(term225273, term225273.getClass(), "jsType", null);
        setField(term225273, term225273.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term224519;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term224427, args);
        assertTrue(recursiveEquals(term224427, term225321));
        assertTrue(recursiveEquals(term224519, term225322));
        assertTrue(recursiveEquals(retValue, term225273));
    }

};


