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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656570;
     Object term656662;
     Object term657290;
     Object term657291;
     Object term657224;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term656570 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term656662 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term656752 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term656844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term656752, term656752.getClass(), "next", term656844);
        setIntField(term656752, term656752.getClass(), "type", 0);
        setField(term656662, term656662.getClass(), "first", term656752);
        setIntField(term656662, term656662.getClass(), "type", 100);
        setField(term656662, term656662.getClass(), "parent", null);
        term657290 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term657290, term657290.getClass(), "currentTraversal", null);
        term657291 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term657292 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term657293 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term657291, term657291.getClass(), "str", null);
        setIntField(term657291, term657291.getClass(), "type", 100);
        setField(term657291, term657291.getClass(), "next", null);
        setIntField(term657292, term657292.getClass(), "encodedSourceStart", 0);
        setIntField(term657292, term657292.getClass(), "encodedSourceEnd", 0);
        setField(term657292, term657292.getClass(), "sourceName", null);
        setIntField(term657292, term657292.getClass(), "baseLineno", 0);
        setIntField(term657292, term657292.getClass(), "endLineno", 0);
        setField(term657292, term657292.getClass(), "functions", null);
        setField(term657292, term657292.getClass(), "regexps", null);
        setField(term657292, term657292.getClass(), "itsVariables", null);
        setField(term657292, term657292.getClass(), "itsConst", null);
        setField(term657292, term657292.getClass(), "itsVariableNames", null);
        setIntField(term657292, term657292.getClass(), "varStart", 0);
        setField(term657292, term657292.getClass(), "compilerData", null);
        setIntField(term657292, term657292.getClass(), "type", 0);
        setDoubleField(term657293, term657293.getClass(), "number", 0.0);
        setIntField(term657293, term657293.getClass(), "type", 0);
        setField(term657293, term657293.getClass(), "next", null);
        setField(term657293, term657293.getClass(), "first", null);
        setField(term657293, term657293.getClass(), "last", null);
        setField(term657293, term657293.getClass(), "propListHead", null);
        setIntField(term657293, term657293.getClass(), "sourcePosition", 0);
        setField(term657293, term657293.getClass(), "jsType", null);
        setField(term657293, term657293.getClass(), "parent", null);
        setField(term657292, term657292.getClass(), "next", term657293);
        setField(term657292, term657292.getClass(), "first", null);
        setField(term657292, term657292.getClass(), "last", null);
        setField(term657292, term657292.getClass(), "propListHead", null);
        setIntField(term657292, term657292.getClass(), "sourcePosition", 0);
        setField(term657292, term657292.getClass(), "jsType", null);
        setField(term657292, term657292.getClass(), "parent", null);
        setField(term657291, term657291.getClass(), "first", term657292);
        setField(term657291, term657291.getClass(), "last", null);
        setField(term657291, term657291.getClass(), "propListHead", null);
        setIntField(term657291, term657291.getClass(), "sourcePosition", 0);
        setField(term657291, term657291.getClass(), "jsType", null);
        setField(term657291, term657291.getClass(), "parent", null);
        term657224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term657226 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term657233 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term657224, term657224.getClass(), "str", null);
        setIntField(term657224, term657224.getClass(), "type", 100);
        setField(term657224, term657224.getClass(), "next", null);
        setIntField(term657226, term657226.getClass(), "encodedSourceStart", 0);
        setIntField(term657226, term657226.getClass(), "encodedSourceEnd", 0);
        setField(term657226, term657226.getClass(), "sourceName", null);
        setIntField(term657226, term657226.getClass(), "baseLineno", 0);
        setIntField(term657226, term657226.getClass(), "endLineno", 0);
        setField(term657226, term657226.getClass(), "functions", null);
        setField(term657226, term657226.getClass(), "regexps", null);
        setField(term657226, term657226.getClass(), "itsVariables", null);
        setField(term657226, term657226.getClass(), "itsConst", null);
        setField(term657226, term657226.getClass(), "itsVariableNames", null);
        setIntField(term657226, term657226.getClass(), "varStart", 0);
        setField(term657226, term657226.getClass(), "compilerData", null);
        setIntField(term657226, term657226.getClass(), "type", 0);
        setDoubleField(term657233, term657233.getClass(), "number", 0.0);
        setIntField(term657233, term657233.getClass(), "type", 0);
        setField(term657233, term657233.getClass(), "next", null);
        setField(term657233, term657233.getClass(), "first", null);
        setField(term657233, term657233.getClass(), "last", null);
        setField(term657233, term657233.getClass(), "propListHead", null);
        setIntField(term657233, term657233.getClass(), "sourcePosition", 0);
        setField(term657233, term657233.getClass(), "jsType", null);
        setField(term657233, term657233.getClass(), "parent", null);
        setField(term657226, term657226.getClass(), "next", term657233);
        setField(term657226, term657226.getClass(), "first", null);
        setField(term657226, term657226.getClass(), "last", null);
        setField(term657226, term657226.getClass(), "propListHead", null);
        setIntField(term657226, term657226.getClass(), "sourcePosition", 0);
        setField(term657226, term657226.getClass(), "jsType", null);
        setField(term657226, term657226.getClass(), "parent", null);
        setField(term657224, term657224.getClass(), "first", term657226);
        setField(term657224, term657224.getClass(), "last", null);
        setField(term657224, term657224.getClass(), "propListHead", null);
        setIntField(term657224, term657224.getClass(), "sourcePosition", 0);
        setField(term657224, term657224.getClass(), "jsType", null);
        setField(term657224, term657224.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term656662;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term656570, args);
        assertTrue(recursiveEquals(term656570, term657290));
        assertTrue(recursiveEquals(term656662, term657291));
        assertTrue(recursiveEquals(retValue, term657224));
    }

};


