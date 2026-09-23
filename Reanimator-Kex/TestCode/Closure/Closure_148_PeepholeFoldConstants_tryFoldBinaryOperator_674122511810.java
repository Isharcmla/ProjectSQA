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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183918;
     Object term184010;
     Object term184365;
     Object term184366;
     Object term184315;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183918 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term184010 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184102 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184192 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term184102, term184102.getClass(), "next", term184192);
        setIntField(term184102, term184102.getClass(), "type", 39);
        setField(term184010, term184010.getClass(), "first", term184102);
        setIntField(term184010, term184010.getClass(), "type", 9);
        term184365 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term184365, term184365.getClass(), "currentTraversal", null);
        term184366 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184367 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184368 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term184366, term184366.getClass(), "str", null);
        setIntField(term184366, term184366.getClass(), "type", 9);
        setField(term184366, term184366.getClass(), "next", null);
        setField(term184367, term184367.getClass(), "str", null);
        setIntField(term184367, term184367.getClass(), "type", 39);
        setIntField(term184368, term184368.getClass(), "encodedSourceStart", 0);
        setIntField(term184368, term184368.getClass(), "encodedSourceEnd", 0);
        setField(term184368, term184368.getClass(), "sourceName", null);
        setIntField(term184368, term184368.getClass(), "baseLineno", 0);
        setIntField(term184368, term184368.getClass(), "endLineno", 0);
        setField(term184368, term184368.getClass(), "functions", null);
        setField(term184368, term184368.getClass(), "regexps", null);
        setField(term184368, term184368.getClass(), "itsVariables", null);
        setField(term184368, term184368.getClass(), "itsConst", null);
        setField(term184368, term184368.getClass(), "itsVariableNames", null);
        setIntField(term184368, term184368.getClass(), "varStart", 0);
        setField(term184368, term184368.getClass(), "compilerData", null);
        setIntField(term184368, term184368.getClass(), "type", 0);
        setField(term184368, term184368.getClass(), "next", null);
        setField(term184368, term184368.getClass(), "first", null);
        setField(term184368, term184368.getClass(), "last", null);
        setField(term184368, term184368.getClass(), "propListHead", null);
        setIntField(term184368, term184368.getClass(), "sourcePosition", 0);
        setField(term184368, term184368.getClass(), "jsType", null);
        setField(term184368, term184368.getClass(), "parent", null);
        setField(term184367, term184367.getClass(), "next", term184368);
        setField(term184367, term184367.getClass(), "first", null);
        setField(term184367, term184367.getClass(), "last", null);
        setField(term184367, term184367.getClass(), "propListHead", null);
        setIntField(term184367, term184367.getClass(), "sourcePosition", 0);
        setField(term184367, term184367.getClass(), "jsType", null);
        setField(term184367, term184367.getClass(), "parent", null);
        setField(term184366, term184366.getClass(), "first", term184367);
        setField(term184366, term184366.getClass(), "last", null);
        setField(term184366, term184366.getClass(), "propListHead", null);
        setIntField(term184366, term184366.getClass(), "sourcePosition", 0);
        setField(term184366, term184366.getClass(), "jsType", null);
        setField(term184366, term184366.getClass(), "parent", null);
        term184315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184317 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184319 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term184315, term184315.getClass(), "str", null);
        setIntField(term184315, term184315.getClass(), "type", 9);
        setField(term184315, term184315.getClass(), "next", null);
        setField(term184317, term184317.getClass(), "str", null);
        setIntField(term184317, term184317.getClass(), "type", 39);
        setIntField(term184319, term184319.getClass(), "encodedSourceStart", 0);
        setIntField(term184319, term184319.getClass(), "encodedSourceEnd", 0);
        setField(term184319, term184319.getClass(), "sourceName", null);
        setIntField(term184319, term184319.getClass(), "baseLineno", 0);
        setIntField(term184319, term184319.getClass(), "endLineno", 0);
        setField(term184319, term184319.getClass(), "functions", null);
        setField(term184319, term184319.getClass(), "regexps", null);
        setField(term184319, term184319.getClass(), "itsVariables", null);
        setField(term184319, term184319.getClass(), "itsConst", null);
        setField(term184319, term184319.getClass(), "itsVariableNames", null);
        setIntField(term184319, term184319.getClass(), "varStart", 0);
        setField(term184319, term184319.getClass(), "compilerData", null);
        setIntField(term184319, term184319.getClass(), "type", 0);
        setField(term184319, term184319.getClass(), "next", null);
        setField(term184319, term184319.getClass(), "first", null);
        setField(term184319, term184319.getClass(), "last", null);
        setField(term184319, term184319.getClass(), "propListHead", null);
        setIntField(term184319, term184319.getClass(), "sourcePosition", 0);
        setField(term184319, term184319.getClass(), "jsType", null);
        setField(term184319, term184319.getClass(), "parent", null);
        setField(term184317, term184317.getClass(), "next", term184319);
        setField(term184317, term184317.getClass(), "first", null);
        setField(term184317, term184317.getClass(), "last", null);
        setField(term184317, term184317.getClass(), "propListHead", null);
        setIntField(term184317, term184317.getClass(), "sourcePosition", 0);
        setField(term184317, term184317.getClass(), "jsType", null);
        setField(term184317, term184317.getClass(), "parent", null);
        setField(term184315, term184315.getClass(), "first", term184317);
        setField(term184315, term184315.getClass(), "last", null);
        setField(term184315, term184315.getClass(), "propListHead", null);
        setIntField(term184315, term184315.getClass(), "sourcePosition", 0);
        setField(term184315, term184315.getClass(), "jsType", null);
        setField(term184315, term184315.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term184010;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term183918, args);
        assertTrue(recursiveEquals(term183918, term184365));
        assertTrue(recursiveEquals(term184010, term184366));
        assertTrue(recursiveEquals(retValue, term184315));
    }

};


