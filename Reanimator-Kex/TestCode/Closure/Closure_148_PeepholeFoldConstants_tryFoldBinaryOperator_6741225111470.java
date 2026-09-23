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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364879;
     Object term364971;
     Object term365573;
     Object term365574;
     Object term365504;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364879 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term364971 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365061 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term365131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term365061, term365061.getClass(), "next", term365131);
        setIntField(term365061, term365061.getClass(), "type", 0);
        setField(term364971, term364971.getClass(), "first", term365061);
        setIntField(term364971, term364971.getClass(), "type", 101);
        setField(term364971, term364971.getClass(), "parent", null);
        term365573 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term365573, term365573.getClass(), "currentTraversal", null);
        term365574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365575 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term365576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term365574, term365574.getClass(), "str", null);
        setIntField(term365574, term365574.getClass(), "type", 101);
        setField(term365574, term365574.getClass(), "next", null);
        setIntField(term365575, term365575.getClass(), "encodedSourceStart", 0);
        setIntField(term365575, term365575.getClass(), "encodedSourceEnd", 0);
        setField(term365575, term365575.getClass(), "sourceName", null);
        setIntField(term365575, term365575.getClass(), "baseLineno", 0);
        setIntField(term365575, term365575.getClass(), "endLineno", 0);
        setField(term365575, term365575.getClass(), "functions", null);
        setField(term365575, term365575.getClass(), "regexps", null);
        setField(term365575, term365575.getClass(), "itsVariables", null);
        setField(term365575, term365575.getClass(), "itsConst", null);
        setField(term365575, term365575.getClass(), "itsVariableNames", null);
        setIntField(term365575, term365575.getClass(), "varStart", 0);
        setField(term365575, term365575.getClass(), "compilerData", null);
        setIntField(term365575, term365575.getClass(), "type", 0);
        setIntField(term365576, term365576.getClass(), "type", 0);
        setField(term365576, term365576.getClass(), "next", null);
        setField(term365576, term365576.getClass(), "first", null);
        setField(term365576, term365576.getClass(), "last", null);
        setField(term365576, term365576.getClass(), "propListHead", null);
        setIntField(term365576, term365576.getClass(), "sourcePosition", 0);
        setField(term365576, term365576.getClass(), "jsType", null);
        setField(term365576, term365576.getClass(), "parent", null);
        setField(term365575, term365575.getClass(), "next", term365576);
        setField(term365575, term365575.getClass(), "first", null);
        setField(term365575, term365575.getClass(), "last", null);
        setField(term365575, term365575.getClass(), "propListHead", null);
        setIntField(term365575, term365575.getClass(), "sourcePosition", 0);
        setField(term365575, term365575.getClass(), "jsType", null);
        setField(term365575, term365575.getClass(), "parent", null);
        setField(term365574, term365574.getClass(), "first", term365575);
        setField(term365574, term365574.getClass(), "last", null);
        setField(term365574, term365574.getClass(), "propListHead", null);
        setIntField(term365574, term365574.getClass(), "sourcePosition", 0);
        setField(term365574, term365574.getClass(), "jsType", null);
        setField(term365574, term365574.getClass(), "parent", null);
        term365504 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365506 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term365513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term365504, term365504.getClass(), "str", null);
        setIntField(term365504, term365504.getClass(), "type", 101);
        setField(term365504, term365504.getClass(), "next", null);
        setIntField(term365506, term365506.getClass(), "encodedSourceStart", 0);
        setIntField(term365506, term365506.getClass(), "encodedSourceEnd", 0);
        setField(term365506, term365506.getClass(), "sourceName", null);
        setIntField(term365506, term365506.getClass(), "baseLineno", 0);
        setIntField(term365506, term365506.getClass(), "endLineno", 0);
        setField(term365506, term365506.getClass(), "functions", null);
        setField(term365506, term365506.getClass(), "regexps", null);
        setField(term365506, term365506.getClass(), "itsVariables", null);
        setField(term365506, term365506.getClass(), "itsConst", null);
        setField(term365506, term365506.getClass(), "itsVariableNames", null);
        setIntField(term365506, term365506.getClass(), "varStart", 0);
        setField(term365506, term365506.getClass(), "compilerData", null);
        setIntField(term365506, term365506.getClass(), "type", 0);
        setIntField(term365513, term365513.getClass(), "type", 0);
        setField(term365513, term365513.getClass(), "next", null);
        setField(term365513, term365513.getClass(), "first", null);
        setField(term365513, term365513.getClass(), "last", null);
        setField(term365513, term365513.getClass(), "propListHead", null);
        setIntField(term365513, term365513.getClass(), "sourcePosition", 0);
        setField(term365513, term365513.getClass(), "jsType", null);
        setField(term365513, term365513.getClass(), "parent", null);
        setField(term365506, term365506.getClass(), "next", term365513);
        setField(term365506, term365506.getClass(), "first", null);
        setField(term365506, term365506.getClass(), "last", null);
        setField(term365506, term365506.getClass(), "propListHead", null);
        setIntField(term365506, term365506.getClass(), "sourcePosition", 0);
        setField(term365506, term365506.getClass(), "jsType", null);
        setField(term365506, term365506.getClass(), "parent", null);
        setField(term365504, term365504.getClass(), "first", term365506);
        setField(term365504, term365504.getClass(), "last", null);
        setField(term365504, term365504.getClass(), "propListHead", null);
        setIntField(term365504, term365504.getClass(), "sourcePosition", 0);
        setField(term365504, term365504.getClass(), "jsType", null);
        setField(term365504, term365504.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term364971;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term364879, args);
        assertTrue(recursiveEquals(term364879, term365573));
        assertTrue(recursiveEquals(term364971, term365574));
        assertTrue(recursiveEquals(retValue, term365504));
    }

};


