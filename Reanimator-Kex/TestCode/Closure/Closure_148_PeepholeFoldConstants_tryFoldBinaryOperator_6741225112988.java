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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876867;
     Object term876959;
     Object term878647;
     Object term878648;
     Object term878584;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term876867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term876959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term877051 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term877141 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term877141, term877141.getClass(), "type", 42);
        setField(term877051, term877051.getClass(), "next", term877141);
        setIntField(term877051, term877051.getClass(), "type", 42);
        setField(term876959, term876959.getClass(), "first", term877051);
        setIntField(term876959, term876959.getClass(), "type", 16);
        term878647 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term878647, term878647.getClass(), "currentTraversal", null);
        term878648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term878649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term878650 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term878648, term878648.getClass(), "number", 0.0);
        setIntField(term878648, term878648.getClass(), "type", 16);
        setField(term878648, term878648.getClass(), "next", null);
        setDoubleField(term878649, term878649.getClass(), "number", 0.0);
        setIntField(term878649, term878649.getClass(), "type", 42);
        setIntField(term878650, term878650.getClass(), "encodedSourceStart", 0);
        setIntField(term878650, term878650.getClass(), "encodedSourceEnd", 0);
        setField(term878650, term878650.getClass(), "sourceName", null);
        setIntField(term878650, term878650.getClass(), "baseLineno", 0);
        setIntField(term878650, term878650.getClass(), "endLineno", 0);
        setField(term878650, term878650.getClass(), "functions", null);
        setField(term878650, term878650.getClass(), "regexps", null);
        setField(term878650, term878650.getClass(), "itsVariables", null);
        setField(term878650, term878650.getClass(), "itsConst", null);
        setField(term878650, term878650.getClass(), "itsVariableNames", null);
        setIntField(term878650, term878650.getClass(), "varStart", 0);
        setField(term878650, term878650.getClass(), "compilerData", null);
        setIntField(term878650, term878650.getClass(), "type", 42);
        setField(term878650, term878650.getClass(), "next", null);
        setField(term878650, term878650.getClass(), "first", null);
        setField(term878650, term878650.getClass(), "last", null);
        setField(term878650, term878650.getClass(), "propListHead", null);
        setIntField(term878650, term878650.getClass(), "sourcePosition", 0);
        setField(term878650, term878650.getClass(), "jsType", null);
        setField(term878650, term878650.getClass(), "parent", null);
        setField(term878649, term878649.getClass(), "next", term878650);
        setField(term878649, term878649.getClass(), "first", null);
        setField(term878649, term878649.getClass(), "last", null);
        setField(term878649, term878649.getClass(), "propListHead", null);
        setIntField(term878649, term878649.getClass(), "sourcePosition", 0);
        setField(term878649, term878649.getClass(), "jsType", null);
        setField(term878649, term878649.getClass(), "parent", null);
        setField(term878648, term878648.getClass(), "first", term878649);
        setField(term878648, term878648.getClass(), "last", null);
        setField(term878648, term878648.getClass(), "propListHead", null);
        setIntField(term878648, term878648.getClass(), "sourcePosition", 0);
        setField(term878648, term878648.getClass(), "jsType", null);
        setField(term878648, term878648.getClass(), "parent", null);
        term878584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term878587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term878590 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term878584, term878584.getClass(), "number", 0.0);
        setIntField(term878584, term878584.getClass(), "type", 16);
        setField(term878584, term878584.getClass(), "next", null);
        setDoubleField(term878587, term878587.getClass(), "number", 0.0);
        setIntField(term878587, term878587.getClass(), "type", 42);
        setIntField(term878590, term878590.getClass(), "encodedSourceStart", 0);
        setIntField(term878590, term878590.getClass(), "encodedSourceEnd", 0);
        setField(term878590, term878590.getClass(), "sourceName", null);
        setIntField(term878590, term878590.getClass(), "baseLineno", 0);
        setIntField(term878590, term878590.getClass(), "endLineno", 0);
        setField(term878590, term878590.getClass(), "functions", null);
        setField(term878590, term878590.getClass(), "regexps", null);
        setField(term878590, term878590.getClass(), "itsVariables", null);
        setField(term878590, term878590.getClass(), "itsConst", null);
        setField(term878590, term878590.getClass(), "itsVariableNames", null);
        setIntField(term878590, term878590.getClass(), "varStart", 0);
        setField(term878590, term878590.getClass(), "compilerData", null);
        setIntField(term878590, term878590.getClass(), "type", 42);
        setField(term878590, term878590.getClass(), "next", null);
        setField(term878590, term878590.getClass(), "first", null);
        setField(term878590, term878590.getClass(), "last", null);
        setField(term878590, term878590.getClass(), "propListHead", null);
        setIntField(term878590, term878590.getClass(), "sourcePosition", 0);
        setField(term878590, term878590.getClass(), "jsType", null);
        setField(term878590, term878590.getClass(), "parent", null);
        setField(term878587, term878587.getClass(), "next", term878590);
        setField(term878587, term878587.getClass(), "first", null);
        setField(term878587, term878587.getClass(), "last", null);
        setField(term878587, term878587.getClass(), "propListHead", null);
        setIntField(term878587, term878587.getClass(), "sourcePosition", 0);
        setField(term878587, term878587.getClass(), "jsType", null);
        setField(term878587, term878587.getClass(), "parent", null);
        setField(term878584, term878584.getClass(), "first", term878587);
        setField(term878584, term878584.getClass(), "last", null);
        setField(term878584, term878584.getClass(), "propListHead", null);
        setIntField(term878584, term878584.getClass(), "sourcePosition", 0);
        setField(term878584, term878584.getClass(), "jsType", null);
        setField(term878584, term878584.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term876959;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term876867, args);
        assertTrue(recursiveEquals(term876867, term878647));
        assertTrue(recursiveEquals(term876959, term878648));
        assertTrue(recursiveEquals(retValue, term878584));
    }

};


