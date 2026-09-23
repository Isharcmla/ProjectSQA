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
     Object term547752;
     Object term547844;
     Object term548185;
     Object term548186;
     Object term548141;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547752 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term547844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term547936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term548026 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term547936, term547936.getClass(), "next", term548026);
        setIntField(term547936, term547936.getClass(), "type", 39);
        setField(term547844, term547844.getClass(), "first", term547936);
        setIntField(term547844, term547844.getClass(), "type", 18);
        term548185 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term548185, term548185.getClass(), "currentTraversal", null);
        term548186 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term548187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term548188 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term548186, term548186.getClass(), "str", null);
        setIntField(term548186, term548186.getClass(), "type", 18);
        setField(term548186, term548186.getClass(), "next", null);
        setField(term548187, term548187.getClass(), "str", null);
        setIntField(term548187, term548187.getClass(), "type", 39);
        setIntField(term548188, term548188.getClass(), "encodedSourceStart", 0);
        setIntField(term548188, term548188.getClass(), "encodedSourceEnd", 0);
        setField(term548188, term548188.getClass(), "sourceName", null);
        setIntField(term548188, term548188.getClass(), "baseLineno", 0);
        setIntField(term548188, term548188.getClass(), "endLineno", 0);
        setField(term548188, term548188.getClass(), "functions", null);
        setField(term548188, term548188.getClass(), "regexps", null);
        setField(term548188, term548188.getClass(), "itsVariables", null);
        setField(term548188, term548188.getClass(), "itsConst", null);
        setField(term548188, term548188.getClass(), "itsVariableNames", null);
        setIntField(term548188, term548188.getClass(), "varStart", 0);
        setField(term548188, term548188.getClass(), "compilerData", null);
        setIntField(term548188, term548188.getClass(), "type", 0);
        setField(term548188, term548188.getClass(), "next", null);
        setField(term548188, term548188.getClass(), "first", null);
        setField(term548188, term548188.getClass(), "last", null);
        setField(term548188, term548188.getClass(), "propListHead", null);
        setIntField(term548188, term548188.getClass(), "sourcePosition", 0);
        setField(term548188, term548188.getClass(), "jsType", null);
        setField(term548188, term548188.getClass(), "parent", null);
        setField(term548187, term548187.getClass(), "next", term548188);
        setField(term548187, term548187.getClass(), "first", null);
        setField(term548187, term548187.getClass(), "last", null);
        setField(term548187, term548187.getClass(), "propListHead", null);
        setIntField(term548187, term548187.getClass(), "sourcePosition", 0);
        setField(term548187, term548187.getClass(), "jsType", null);
        setField(term548187, term548187.getClass(), "parent", null);
        setField(term548186, term548186.getClass(), "first", term548187);
        setField(term548186, term548186.getClass(), "last", null);
        setField(term548186, term548186.getClass(), "propListHead", null);
        setIntField(term548186, term548186.getClass(), "sourcePosition", 0);
        setField(term548186, term548186.getClass(), "jsType", null);
        setField(term548186, term548186.getClass(), "parent", null);
        term548141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term548143 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term548145 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term548141, term548141.getClass(), "str", null);
        setIntField(term548141, term548141.getClass(), "type", 18);
        setField(term548141, term548141.getClass(), "next", null);
        setField(term548143, term548143.getClass(), "str", null);
        setIntField(term548143, term548143.getClass(), "type", 39);
        setIntField(term548145, term548145.getClass(), "encodedSourceStart", 0);
        setIntField(term548145, term548145.getClass(), "encodedSourceEnd", 0);
        setField(term548145, term548145.getClass(), "sourceName", null);
        setIntField(term548145, term548145.getClass(), "baseLineno", 0);
        setIntField(term548145, term548145.getClass(), "endLineno", 0);
        setField(term548145, term548145.getClass(), "functions", null);
        setField(term548145, term548145.getClass(), "regexps", null);
        setField(term548145, term548145.getClass(), "itsVariables", null);
        setField(term548145, term548145.getClass(), "itsConst", null);
        setField(term548145, term548145.getClass(), "itsVariableNames", null);
        setIntField(term548145, term548145.getClass(), "varStart", 0);
        setField(term548145, term548145.getClass(), "compilerData", null);
        setIntField(term548145, term548145.getClass(), "type", 0);
        setField(term548145, term548145.getClass(), "next", null);
        setField(term548145, term548145.getClass(), "first", null);
        setField(term548145, term548145.getClass(), "last", null);
        setField(term548145, term548145.getClass(), "propListHead", null);
        setIntField(term548145, term548145.getClass(), "sourcePosition", 0);
        setField(term548145, term548145.getClass(), "jsType", null);
        setField(term548145, term548145.getClass(), "parent", null);
        setField(term548143, term548143.getClass(), "next", term548145);
        setField(term548143, term548143.getClass(), "first", null);
        setField(term548143, term548143.getClass(), "last", null);
        setField(term548143, term548143.getClass(), "propListHead", null);
        setIntField(term548143, term548143.getClass(), "sourcePosition", 0);
        setField(term548143, term548143.getClass(), "jsType", null);
        setField(term548143, term548143.getClass(), "parent", null);
        setField(term548141, term548141.getClass(), "first", term548143);
        setField(term548141, term548141.getClass(), "last", null);
        setField(term548141, term548141.getClass(), "propListHead", null);
        setIntField(term548141, term548141.getClass(), "sourcePosition", 0);
        setField(term548141, term548141.getClass(), "jsType", null);
        setField(term548141, term548141.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term547844;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term547752, args);
        assertTrue(recursiveEquals(term547752, term548185));
        assertTrue(recursiveEquals(term547844, term548186));
        assertTrue(recursiveEquals(retValue, term548141));
    }

};


