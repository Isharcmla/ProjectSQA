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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223095;
     Object term223187;
     Object term223939;
     Object term223940;
     Object term223875;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223095 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term223187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223369 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term223369, term223369.getClass(), "type", 106);
        setField(term223279, term223279.getClass(), "next", term223369);
        setIntField(term223279, term223279.getClass(), "type", 42);
        setField(term223187, term223187.getClass(), "first", term223279);
        setIntField(term223187, term223187.getClass(), "type", 14);
        term223939 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term223939, term223939.getClass(), "currentTraversal", null);
        term223940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223942 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term223940, term223940.getClass(), "str", null);
        setIntField(term223940, term223940.getClass(), "type", 14);
        setField(term223940, term223940.getClass(), "next", null);
        setField(term223941, term223941.getClass(), "str", null);
        setIntField(term223941, term223941.getClass(), "type", 42);
        setIntField(term223942, term223942.getClass(), "encodedSourceStart", 0);
        setIntField(term223942, term223942.getClass(), "encodedSourceEnd", 0);
        setField(term223942, term223942.getClass(), "sourceName", null);
        setIntField(term223942, term223942.getClass(), "baseLineno", 0);
        setIntField(term223942, term223942.getClass(), "endLineno", 0);
        setField(term223942, term223942.getClass(), "functions", null);
        setField(term223942, term223942.getClass(), "regexps", null);
        setField(term223942, term223942.getClass(), "itsVariables", null);
        setField(term223942, term223942.getClass(), "itsConst", null);
        setField(term223942, term223942.getClass(), "itsVariableNames", null);
        setIntField(term223942, term223942.getClass(), "varStart", 0);
        setField(term223942, term223942.getClass(), "compilerData", null);
        setIntField(term223942, term223942.getClass(), "type", 106);
        setField(term223942, term223942.getClass(), "next", null);
        setField(term223942, term223942.getClass(), "first", null);
        setField(term223942, term223942.getClass(), "last", null);
        setField(term223942, term223942.getClass(), "propListHead", null);
        setIntField(term223942, term223942.getClass(), "sourcePosition", 0);
        setField(term223942, term223942.getClass(), "jsType", null);
        setField(term223942, term223942.getClass(), "parent", null);
        setField(term223941, term223941.getClass(), "next", term223942);
        setField(term223941, term223941.getClass(), "first", null);
        setField(term223941, term223941.getClass(), "last", null);
        setField(term223941, term223941.getClass(), "propListHead", null);
        setIntField(term223941, term223941.getClass(), "sourcePosition", 0);
        setField(term223941, term223941.getClass(), "jsType", null);
        setField(term223941, term223941.getClass(), "parent", null);
        setField(term223940, term223940.getClass(), "first", term223941);
        setField(term223940, term223940.getClass(), "last", null);
        setField(term223940, term223940.getClass(), "propListHead", null);
        setIntField(term223940, term223940.getClass(), "sourcePosition", 0);
        setField(term223940, term223940.getClass(), "jsType", null);
        setField(term223940, term223940.getClass(), "parent", null);
        term223875 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223879 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term223875, term223875.getClass(), "str", null);
        setIntField(term223875, term223875.getClass(), "type", 14);
        setField(term223875, term223875.getClass(), "next", null);
        setField(term223877, term223877.getClass(), "str", null);
        setIntField(term223877, term223877.getClass(), "type", 42);
        setIntField(term223879, term223879.getClass(), "encodedSourceStart", 0);
        setIntField(term223879, term223879.getClass(), "encodedSourceEnd", 0);
        setField(term223879, term223879.getClass(), "sourceName", null);
        setIntField(term223879, term223879.getClass(), "baseLineno", 0);
        setIntField(term223879, term223879.getClass(), "endLineno", 0);
        setField(term223879, term223879.getClass(), "functions", null);
        setField(term223879, term223879.getClass(), "regexps", null);
        setField(term223879, term223879.getClass(), "itsVariables", null);
        setField(term223879, term223879.getClass(), "itsConst", null);
        setField(term223879, term223879.getClass(), "itsVariableNames", null);
        setIntField(term223879, term223879.getClass(), "varStart", 0);
        setField(term223879, term223879.getClass(), "compilerData", null);
        setIntField(term223879, term223879.getClass(), "type", 106);
        setField(term223879, term223879.getClass(), "next", null);
        setField(term223879, term223879.getClass(), "first", null);
        setField(term223879, term223879.getClass(), "last", null);
        setField(term223879, term223879.getClass(), "propListHead", null);
        setIntField(term223879, term223879.getClass(), "sourcePosition", 0);
        setField(term223879, term223879.getClass(), "jsType", null);
        setField(term223879, term223879.getClass(), "parent", null);
        setField(term223877, term223877.getClass(), "next", term223879);
        setField(term223877, term223877.getClass(), "first", null);
        setField(term223877, term223877.getClass(), "last", null);
        setField(term223877, term223877.getClass(), "propListHead", null);
        setIntField(term223877, term223877.getClass(), "sourcePosition", 0);
        setField(term223877, term223877.getClass(), "jsType", null);
        setField(term223877, term223877.getClass(), "parent", null);
        setField(term223875, term223875.getClass(), "first", term223877);
        setField(term223875, term223875.getClass(), "last", null);
        setField(term223875, term223875.getClass(), "propListHead", null);
        setIntField(term223875, term223875.getClass(), "sourcePosition", 0);
        setField(term223875, term223875.getClass(), "jsType", null);
        setField(term223875, term223875.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term223187;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term223095, args);
        assertTrue(recursiveEquals(term223095, term223939));
        assertTrue(recursiveEquals(term223187, term223940));
        assertTrue(recursiveEquals(retValue, term223875));
    }

};


