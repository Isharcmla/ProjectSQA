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

public class PeepholeFoldConstants_optimizeSubtree_16065069931822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475492;
     Object term475584;
     Object term476555;
     Object term476556;
     Object term476493;

    public PeepholeFoldConstants_optimizeSubtree_16065069931822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term475584 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term475674 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term475584, term475584.getClass(), "type", 33);
        setField(term475584, term475584.getClass(), "first", term475584);
        setField(term475584, term475584.getClass(), "next", term475674);
        term476555 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term476555, term476555.getClass(), "currentTraversal", null);
        term476556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476557 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term476556, term476556.getClass(), "str", null);
        setIntField(term476556, term476556.getClass(), "type", 33);
        setIntField(term476557, term476557.getClass(), "encodedSourceStart", 0);
        setIntField(term476557, term476557.getClass(), "encodedSourceEnd", 0);
        setField(term476557, term476557.getClass(), "sourceName", null);
        setIntField(term476557, term476557.getClass(), "baseLineno", 0);
        setIntField(term476557, term476557.getClass(), "endLineno", 0);
        setField(term476557, term476557.getClass(), "functions", null);
        setField(term476557, term476557.getClass(), "regexps", null);
        setField(term476557, term476557.getClass(), "itsVariables", null);
        setField(term476557, term476557.getClass(), "itsConst", null);
        setField(term476557, term476557.getClass(), "itsVariableNames", null);
        setIntField(term476557, term476557.getClass(), "varStart", 0);
        setField(term476557, term476557.getClass(), "compilerData", null);
        setIntField(term476557, term476557.getClass(), "type", 0);
        setField(term476557, term476557.getClass(), "next", null);
        setField(term476557, term476557.getClass(), "first", null);
        setField(term476557, term476557.getClass(), "last", null);
        setField(term476557, term476557.getClass(), "propListHead", null);
        setIntField(term476557, term476557.getClass(), "sourcePosition", 0);
        setField(term476557, term476557.getClass(), "jsType", null);
        setField(term476557, term476557.getClass(), "parent", null);
        setField(term476556, term476556.getClass(), "next", term476557);
        setField(term476556, term476556.getClass(), "first", term476556);
        setField(term476556, term476556.getClass(), "last", null);
        setField(term476556, term476556.getClass(), "propListHead", null);
        setIntField(term476556, term476556.getClass(), "sourcePosition", 0);
        setField(term476556, term476556.getClass(), "jsType", null);
        setField(term476556, term476556.getClass(), "parent", null);
        term476493 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term476495 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term476493, term476493.getClass(), "str", null);
        setIntField(term476493, term476493.getClass(), "type", 33);
        setIntField(term476495, term476495.getClass(), "encodedSourceStart", 0);
        setIntField(term476495, term476495.getClass(), "encodedSourceEnd", 0);
        setField(term476495, term476495.getClass(), "sourceName", null);
        setIntField(term476495, term476495.getClass(), "baseLineno", 0);
        setIntField(term476495, term476495.getClass(), "endLineno", 0);
        setField(term476495, term476495.getClass(), "functions", null);
        setField(term476495, term476495.getClass(), "regexps", null);
        setField(term476495, term476495.getClass(), "itsVariables", null);
        setField(term476495, term476495.getClass(), "itsConst", null);
        setField(term476495, term476495.getClass(), "itsVariableNames", null);
        setIntField(term476495, term476495.getClass(), "varStart", 0);
        setField(term476495, term476495.getClass(), "compilerData", null);
        setIntField(term476495, term476495.getClass(), "type", 0);
        setField(term476495, term476495.getClass(), "next", null);
        setField(term476495, term476495.getClass(), "first", null);
        setField(term476495, term476495.getClass(), "last", null);
        setField(term476495, term476495.getClass(), "propListHead", null);
        setIntField(term476495, term476495.getClass(), "sourcePosition", 0);
        setField(term476495, term476495.getClass(), "jsType", null);
        setField(term476495, term476495.getClass(), "parent", null);
        setField(term476493, term476493.getClass(), "next", term476495);
        setField(term476493, term476493.getClass(), "first", term476493);
        setField(term476493, term476493.getClass(), "last", null);
        setField(term476493, term476493.getClass(), "propListHead", null);
        setIntField(term476493, term476493.getClass(), "sourcePosition", 0);
        setField(term476493, term476493.getClass(), "jsType", null);
        setField(term476493, term476493.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term475584;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term475492, args);
        assertTrue(recursiveEquals(term475492, term476555));
        assertTrue(recursiveEquals(term475584, term476556));
        assertTrue(recursiveEquals(retValue, term476493));
    }

};


