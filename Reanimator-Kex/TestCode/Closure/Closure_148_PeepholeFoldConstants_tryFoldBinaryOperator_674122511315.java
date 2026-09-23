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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61324;
     Object term61416;
     Object term62073;
     Object term62074;
     Object term62029;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61324 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term61416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61598 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term61508, term61508.getClass(), "next", term61598);
        setIntField(term61508, term61508.getClass(), "type", 39);
        setField(term61416, term61416.getClass(), "first", term61508);
        setIntField(term61416, term61416.getClass(), "type", 20);
        term62073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62073, term62073.getClass(), "currentTraversal", null);
        term62074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62075 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62076 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term62074, term62074.getClass(), "str", null);
        setIntField(term62074, term62074.getClass(), "type", 20);
        setField(term62074, term62074.getClass(), "next", null);
        setField(term62075, term62075.getClass(), "str", null);
        setIntField(term62075, term62075.getClass(), "type", 39);
        setIntField(term62076, term62076.getClass(), "encodedSourceStart", 0);
        setIntField(term62076, term62076.getClass(), "encodedSourceEnd", 0);
        setField(term62076, term62076.getClass(), "sourceName", null);
        setIntField(term62076, term62076.getClass(), "baseLineno", 0);
        setIntField(term62076, term62076.getClass(), "endLineno", 0);
        setField(term62076, term62076.getClass(), "functions", null);
        setField(term62076, term62076.getClass(), "regexps", null);
        setField(term62076, term62076.getClass(), "itsVariables", null);
        setField(term62076, term62076.getClass(), "itsConst", null);
        setField(term62076, term62076.getClass(), "itsVariableNames", null);
        setIntField(term62076, term62076.getClass(), "varStart", 0);
        setField(term62076, term62076.getClass(), "compilerData", null);
        setIntField(term62076, term62076.getClass(), "type", 0);
        setField(term62076, term62076.getClass(), "next", null);
        setField(term62076, term62076.getClass(), "first", null);
        setField(term62076, term62076.getClass(), "last", null);
        setField(term62076, term62076.getClass(), "propListHead", null);
        setIntField(term62076, term62076.getClass(), "sourcePosition", 0);
        setField(term62076, term62076.getClass(), "jsType", null);
        setField(term62076, term62076.getClass(), "parent", null);
        setField(term62075, term62075.getClass(), "next", term62076);
        setField(term62075, term62075.getClass(), "first", null);
        setField(term62075, term62075.getClass(), "last", null);
        setField(term62075, term62075.getClass(), "propListHead", null);
        setIntField(term62075, term62075.getClass(), "sourcePosition", 0);
        setField(term62075, term62075.getClass(), "jsType", null);
        setField(term62075, term62075.getClass(), "parent", null);
        setField(term62074, term62074.getClass(), "first", term62075);
        setField(term62074, term62074.getClass(), "last", null);
        setField(term62074, term62074.getClass(), "propListHead", null);
        setIntField(term62074, term62074.getClass(), "sourcePosition", 0);
        setField(term62074, term62074.getClass(), "jsType", null);
        setField(term62074, term62074.getClass(), "parent", null);
        term62029 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62033 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term62029, term62029.getClass(), "str", null);
        setIntField(term62029, term62029.getClass(), "type", 20);
        setField(term62029, term62029.getClass(), "next", null);
        setField(term62031, term62031.getClass(), "str", null);
        setIntField(term62031, term62031.getClass(), "type", 39);
        setIntField(term62033, term62033.getClass(), "encodedSourceStart", 0);
        setIntField(term62033, term62033.getClass(), "encodedSourceEnd", 0);
        setField(term62033, term62033.getClass(), "sourceName", null);
        setIntField(term62033, term62033.getClass(), "baseLineno", 0);
        setIntField(term62033, term62033.getClass(), "endLineno", 0);
        setField(term62033, term62033.getClass(), "functions", null);
        setField(term62033, term62033.getClass(), "regexps", null);
        setField(term62033, term62033.getClass(), "itsVariables", null);
        setField(term62033, term62033.getClass(), "itsConst", null);
        setField(term62033, term62033.getClass(), "itsVariableNames", null);
        setIntField(term62033, term62033.getClass(), "varStart", 0);
        setField(term62033, term62033.getClass(), "compilerData", null);
        setIntField(term62033, term62033.getClass(), "type", 0);
        setField(term62033, term62033.getClass(), "next", null);
        setField(term62033, term62033.getClass(), "first", null);
        setField(term62033, term62033.getClass(), "last", null);
        setField(term62033, term62033.getClass(), "propListHead", null);
        setIntField(term62033, term62033.getClass(), "sourcePosition", 0);
        setField(term62033, term62033.getClass(), "jsType", null);
        setField(term62033, term62033.getClass(), "parent", null);
        setField(term62031, term62031.getClass(), "next", term62033);
        setField(term62031, term62031.getClass(), "first", null);
        setField(term62031, term62031.getClass(), "last", null);
        setField(term62031, term62031.getClass(), "propListHead", null);
        setIntField(term62031, term62031.getClass(), "sourcePosition", 0);
        setField(term62031, term62031.getClass(), "jsType", null);
        setField(term62031, term62031.getClass(), "parent", null);
        setField(term62029, term62029.getClass(), "first", term62031);
        setField(term62029, term62029.getClass(), "last", null);
        setField(term62029, term62029.getClass(), "propListHead", null);
        setIntField(term62029, term62029.getClass(), "sourcePosition", 0);
        setField(term62029, term62029.getClass(), "jsType", null);
        setField(term62029, term62029.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61416;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term61324, args);
        assertTrue(recursiveEquals(term61324, term62073));
        assertTrue(recursiveEquals(term61416, term62074));
        assertTrue(recursiveEquals(retValue, term62029));
    }

};


