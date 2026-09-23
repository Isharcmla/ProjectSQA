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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579713;
     Object term579803;
     Object term580477;
     Object term580478;
     Object term580407;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term579713 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term579803 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term579893 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term579983 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term579893, term579893.getClass(), "next", term579983);
        setIntField(term579893, term579893.getClass(), "type", 39);
        setField(term579803, term579803.getClass(), "first", term579893);
        setIntField(term579803, term579803.getClass(), "type", 23);
        term580477 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term580477, term580477.getClass(), "currentTraversal", null);
        term580478 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term580479 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term580480 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term580478, term580478.getClass(), "encodedSourceStart", 0);
        setIntField(term580478, term580478.getClass(), "encodedSourceEnd", 0);
        setField(term580478, term580478.getClass(), "sourceName", null);
        setIntField(term580478, term580478.getClass(), "baseLineno", 0);
        setIntField(term580478, term580478.getClass(), "endLineno", 0);
        setField(term580478, term580478.getClass(), "functions", null);
        setField(term580478, term580478.getClass(), "regexps", null);
        setField(term580478, term580478.getClass(), "itsVariables", null);
        setField(term580478, term580478.getClass(), "itsConst", null);
        setField(term580478, term580478.getClass(), "itsVariableNames", null);
        setIntField(term580478, term580478.getClass(), "varStart", 0);
        setField(term580478, term580478.getClass(), "compilerData", null);
        setIntField(term580478, term580478.getClass(), "type", 23);
        setField(term580478, term580478.getClass(), "next", null);
        setIntField(term580479, term580479.getClass(), "encodedSourceStart", 0);
        setIntField(term580479, term580479.getClass(), "encodedSourceEnd", 0);
        setField(term580479, term580479.getClass(), "sourceName", null);
        setIntField(term580479, term580479.getClass(), "baseLineno", 0);
        setIntField(term580479, term580479.getClass(), "endLineno", 0);
        setField(term580479, term580479.getClass(), "functions", null);
        setField(term580479, term580479.getClass(), "regexps", null);
        setField(term580479, term580479.getClass(), "itsVariables", null);
        setField(term580479, term580479.getClass(), "itsConst", null);
        setField(term580479, term580479.getClass(), "itsVariableNames", null);
        setIntField(term580479, term580479.getClass(), "varStart", 0);
        setField(term580479, term580479.getClass(), "compilerData", null);
        setIntField(term580479, term580479.getClass(), "type", 39);
        setIntField(term580480, term580480.getClass(), "encodedSourceStart", 0);
        setIntField(term580480, term580480.getClass(), "encodedSourceEnd", 0);
        setField(term580480, term580480.getClass(), "sourceName", null);
        setIntField(term580480, term580480.getClass(), "baseLineno", 0);
        setIntField(term580480, term580480.getClass(), "endLineno", 0);
        setField(term580480, term580480.getClass(), "functions", null);
        setField(term580480, term580480.getClass(), "regexps", null);
        setField(term580480, term580480.getClass(), "itsVariables", null);
        setField(term580480, term580480.getClass(), "itsConst", null);
        setField(term580480, term580480.getClass(), "itsVariableNames", null);
        setIntField(term580480, term580480.getClass(), "varStart", 0);
        setField(term580480, term580480.getClass(), "compilerData", null);
        setIntField(term580480, term580480.getClass(), "type", 0);
        setField(term580480, term580480.getClass(), "next", null);
        setField(term580480, term580480.getClass(), "first", null);
        setField(term580480, term580480.getClass(), "last", null);
        setField(term580480, term580480.getClass(), "propListHead", null);
        setIntField(term580480, term580480.getClass(), "sourcePosition", 0);
        setField(term580480, term580480.getClass(), "jsType", null);
        setField(term580480, term580480.getClass(), "parent", null);
        setField(term580479, term580479.getClass(), "next", term580480);
        setField(term580479, term580479.getClass(), "first", null);
        setField(term580479, term580479.getClass(), "last", null);
        setField(term580479, term580479.getClass(), "propListHead", null);
        setIntField(term580479, term580479.getClass(), "sourcePosition", 0);
        setField(term580479, term580479.getClass(), "jsType", null);
        setField(term580479, term580479.getClass(), "parent", null);
        setField(term580478, term580478.getClass(), "first", term580479);
        setField(term580478, term580478.getClass(), "last", null);
        setField(term580478, term580478.getClass(), "propListHead", null);
        setIntField(term580478, term580478.getClass(), "sourcePosition", 0);
        setField(term580478, term580478.getClass(), "jsType", null);
        setField(term580478, term580478.getClass(), "parent", null);
        term580407 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term580414 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term580421 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term580407, term580407.getClass(), "encodedSourceStart", 0);
        setIntField(term580407, term580407.getClass(), "encodedSourceEnd", 0);
        setField(term580407, term580407.getClass(), "sourceName", null);
        setIntField(term580407, term580407.getClass(), "baseLineno", 0);
        setIntField(term580407, term580407.getClass(), "endLineno", 0);
        setField(term580407, term580407.getClass(), "functions", null);
        setField(term580407, term580407.getClass(), "regexps", null);
        setField(term580407, term580407.getClass(), "itsVariables", null);
        setField(term580407, term580407.getClass(), "itsConst", null);
        setField(term580407, term580407.getClass(), "itsVariableNames", null);
        setIntField(term580407, term580407.getClass(), "varStart", 0);
        setField(term580407, term580407.getClass(), "compilerData", null);
        setIntField(term580407, term580407.getClass(), "type", 23);
        setField(term580407, term580407.getClass(), "next", null);
        setIntField(term580414, term580414.getClass(), "encodedSourceStart", 0);
        setIntField(term580414, term580414.getClass(), "encodedSourceEnd", 0);
        setField(term580414, term580414.getClass(), "sourceName", null);
        setIntField(term580414, term580414.getClass(), "baseLineno", 0);
        setIntField(term580414, term580414.getClass(), "endLineno", 0);
        setField(term580414, term580414.getClass(), "functions", null);
        setField(term580414, term580414.getClass(), "regexps", null);
        setField(term580414, term580414.getClass(), "itsVariables", null);
        setField(term580414, term580414.getClass(), "itsConst", null);
        setField(term580414, term580414.getClass(), "itsVariableNames", null);
        setIntField(term580414, term580414.getClass(), "varStart", 0);
        setField(term580414, term580414.getClass(), "compilerData", null);
        setIntField(term580414, term580414.getClass(), "type", 39);
        setIntField(term580421, term580421.getClass(), "encodedSourceStart", 0);
        setIntField(term580421, term580421.getClass(), "encodedSourceEnd", 0);
        setField(term580421, term580421.getClass(), "sourceName", null);
        setIntField(term580421, term580421.getClass(), "baseLineno", 0);
        setIntField(term580421, term580421.getClass(), "endLineno", 0);
        setField(term580421, term580421.getClass(), "functions", null);
        setField(term580421, term580421.getClass(), "regexps", null);
        setField(term580421, term580421.getClass(), "itsVariables", null);
        setField(term580421, term580421.getClass(), "itsConst", null);
        setField(term580421, term580421.getClass(), "itsVariableNames", null);
        setIntField(term580421, term580421.getClass(), "varStart", 0);
        setField(term580421, term580421.getClass(), "compilerData", null);
        setIntField(term580421, term580421.getClass(), "type", 0);
        setField(term580421, term580421.getClass(), "next", null);
        setField(term580421, term580421.getClass(), "first", null);
        setField(term580421, term580421.getClass(), "last", null);
        setField(term580421, term580421.getClass(), "propListHead", null);
        setIntField(term580421, term580421.getClass(), "sourcePosition", 0);
        setField(term580421, term580421.getClass(), "jsType", null);
        setField(term580421, term580421.getClass(), "parent", null);
        setField(term580414, term580414.getClass(), "next", term580421);
        setField(term580414, term580414.getClass(), "first", null);
        setField(term580414, term580414.getClass(), "last", null);
        setField(term580414, term580414.getClass(), "propListHead", null);
        setIntField(term580414, term580414.getClass(), "sourcePosition", 0);
        setField(term580414, term580414.getClass(), "jsType", null);
        setField(term580414, term580414.getClass(), "parent", null);
        setField(term580407, term580407.getClass(), "first", term580414);
        setField(term580407, term580407.getClass(), "last", null);
        setField(term580407, term580407.getClass(), "propListHead", null);
        setIntField(term580407, term580407.getClass(), "sourcePosition", 0);
        setField(term580407, term580407.getClass(), "jsType", null);
        setField(term580407, term580407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term579803;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term579713, args);
        assertTrue(recursiveEquals(term579713, term580477));
        assertTrue(recursiveEquals(term579803, term580478));
        assertTrue(recursiveEquals(retValue, term580407));
    }

};


