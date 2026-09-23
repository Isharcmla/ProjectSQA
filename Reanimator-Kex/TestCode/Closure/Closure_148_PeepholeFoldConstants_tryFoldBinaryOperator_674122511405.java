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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81859;
     Object term81951;
     Object term82476;
     Object term82477;
     Object term82428;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81859 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term81951 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82133 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term82043, term82043.getClass(), "next", term82133);
        setIntField(term82043, term82043.getClass(), "type", 39);
        setField(term81951, term81951.getClass(), "first", term82043);
        setIntField(term81951, term81951.getClass(), "type", 20);
        term82476 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term82476, term82476.getClass(), "currentTraversal", null);
        term82477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82479 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term82477, term82477.getClass(), "number", 0.0);
        setIntField(term82477, term82477.getClass(), "type", 20);
        setField(term82477, term82477.getClass(), "next", null);
        setDoubleField(term82478, term82478.getClass(), "number", 0.0);
        setIntField(term82478, term82478.getClass(), "type", 39);
        setIntField(term82479, term82479.getClass(), "encodedSourceStart", 0);
        setIntField(term82479, term82479.getClass(), "encodedSourceEnd", 0);
        setField(term82479, term82479.getClass(), "sourceName", null);
        setIntField(term82479, term82479.getClass(), "baseLineno", 0);
        setIntField(term82479, term82479.getClass(), "endLineno", 0);
        setField(term82479, term82479.getClass(), "functions", null);
        setField(term82479, term82479.getClass(), "regexps", null);
        setField(term82479, term82479.getClass(), "itsVariables", null);
        setField(term82479, term82479.getClass(), "itsConst", null);
        setField(term82479, term82479.getClass(), "itsVariableNames", null);
        setIntField(term82479, term82479.getClass(), "varStart", 0);
        setField(term82479, term82479.getClass(), "compilerData", null);
        setIntField(term82479, term82479.getClass(), "type", 0);
        setField(term82479, term82479.getClass(), "next", null);
        setField(term82479, term82479.getClass(), "first", null);
        setField(term82479, term82479.getClass(), "last", null);
        setField(term82479, term82479.getClass(), "propListHead", null);
        setIntField(term82479, term82479.getClass(), "sourcePosition", 0);
        setField(term82479, term82479.getClass(), "jsType", null);
        setField(term82479, term82479.getClass(), "parent", null);
        setField(term82478, term82478.getClass(), "next", term82479);
        setField(term82478, term82478.getClass(), "first", null);
        setField(term82478, term82478.getClass(), "last", null);
        setField(term82478, term82478.getClass(), "propListHead", null);
        setIntField(term82478, term82478.getClass(), "sourcePosition", 0);
        setField(term82478, term82478.getClass(), "jsType", null);
        setField(term82478, term82478.getClass(), "parent", null);
        setField(term82477, term82477.getClass(), "first", term82478);
        setField(term82477, term82477.getClass(), "last", null);
        setField(term82477, term82477.getClass(), "propListHead", null);
        setIntField(term82477, term82477.getClass(), "sourcePosition", 0);
        setField(term82477, term82477.getClass(), "jsType", null);
        setField(term82477, term82477.getClass(), "parent", null);
        term82428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82434 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term82428, term82428.getClass(), "number", 0.0);
        setIntField(term82428, term82428.getClass(), "type", 20);
        setField(term82428, term82428.getClass(), "next", null);
        setDoubleField(term82431, term82431.getClass(), "number", 0.0);
        setIntField(term82431, term82431.getClass(), "type", 39);
        setIntField(term82434, term82434.getClass(), "encodedSourceStart", 0);
        setIntField(term82434, term82434.getClass(), "encodedSourceEnd", 0);
        setField(term82434, term82434.getClass(), "sourceName", null);
        setIntField(term82434, term82434.getClass(), "baseLineno", 0);
        setIntField(term82434, term82434.getClass(), "endLineno", 0);
        setField(term82434, term82434.getClass(), "functions", null);
        setField(term82434, term82434.getClass(), "regexps", null);
        setField(term82434, term82434.getClass(), "itsVariables", null);
        setField(term82434, term82434.getClass(), "itsConst", null);
        setField(term82434, term82434.getClass(), "itsVariableNames", null);
        setIntField(term82434, term82434.getClass(), "varStart", 0);
        setField(term82434, term82434.getClass(), "compilerData", null);
        setIntField(term82434, term82434.getClass(), "type", 0);
        setField(term82434, term82434.getClass(), "next", null);
        setField(term82434, term82434.getClass(), "first", null);
        setField(term82434, term82434.getClass(), "last", null);
        setField(term82434, term82434.getClass(), "propListHead", null);
        setIntField(term82434, term82434.getClass(), "sourcePosition", 0);
        setField(term82434, term82434.getClass(), "jsType", null);
        setField(term82434, term82434.getClass(), "parent", null);
        setField(term82431, term82431.getClass(), "next", term82434);
        setField(term82431, term82431.getClass(), "first", null);
        setField(term82431, term82431.getClass(), "last", null);
        setField(term82431, term82431.getClass(), "propListHead", null);
        setIntField(term82431, term82431.getClass(), "sourcePosition", 0);
        setField(term82431, term82431.getClass(), "jsType", null);
        setField(term82431, term82431.getClass(), "parent", null);
        setField(term82428, term82428.getClass(), "first", term82431);
        setField(term82428, term82428.getClass(), "last", null);
        setField(term82428, term82428.getClass(), "propListHead", null);
        setIntField(term82428, term82428.getClass(), "sourcePosition", 0);
        setField(term82428, term82428.getClass(), "jsType", null);
        setField(term82428, term82428.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term81951;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term81859, args);
        assertTrue(recursiveEquals(term81859, term82476));
        assertTrue(recursiveEquals(term81951, term82477));
        assertTrue(recursiveEquals(retValue, term82428));
    }

};


