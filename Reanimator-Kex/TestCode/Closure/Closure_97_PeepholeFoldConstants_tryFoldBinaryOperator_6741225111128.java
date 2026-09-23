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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347917;
     Object term348007;
     Object term348600;
     Object term348601;
     Object term348542;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347917 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term348007 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term348093 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term348185 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term348093, term348093.getClass(), "next", term348185);
        setIntField(term348093, term348093.getClass(), "type", 39);
        setField(term348007, term348007.getClass(), "first", term348093);
        setIntField(term348007, term348007.getClass(), "type", 24);
        term348600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term348600, term348600.getClass(), "currentTraversal", null);
        term348601 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term348602 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term348603 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term348601, term348601.getClass(), "encodedSourceStart", 0);
        setIntField(term348601, term348601.getClass(), "encodedSourceEnd", 0);
        setField(term348601, term348601.getClass(), "sourceName", null);
        setIntField(term348601, term348601.getClass(), "baseLineno", 0);
        setIntField(term348601, term348601.getClass(), "endLineno", 0);
        setField(term348601, term348601.getClass(), "functions", null);
        setField(term348601, term348601.getClass(), "regexps", null);
        setField(term348601, term348601.getClass(), "itsVariables", null);
        setField(term348601, term348601.getClass(), "itsConst", null);
        setField(term348601, term348601.getClass(), "itsVariableNames", null);
        setIntField(term348601, term348601.getClass(), "varStart", 0);
        setField(term348601, term348601.getClass(), "compilerData", null);
        setIntField(term348601, term348601.getClass(), "type", 24);
        setField(term348601, term348601.getClass(), "next", null);
        setField(term348602, term348602.getClass(), "functionName", null);
        setBooleanField(term348602, term348602.getClass(), "itsNeedsActivation", false);
        setIntField(term348602, term348602.getClass(), "itsFunctionType", 0);
        setBooleanField(term348602, term348602.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term348602, term348602.getClass(), "encodedSourceStart", 0);
        setIntField(term348602, term348602.getClass(), "encodedSourceEnd", 0);
        setField(term348602, term348602.getClass(), "sourceName", null);
        setIntField(term348602, term348602.getClass(), "baseLineno", 0);
        setIntField(term348602, term348602.getClass(), "endLineno", 0);
        setField(term348602, term348602.getClass(), "functions", null);
        setField(term348602, term348602.getClass(), "regexps", null);
        setField(term348602, term348602.getClass(), "itsVariables", null);
        setField(term348602, term348602.getClass(), "itsConst", null);
        setField(term348602, term348602.getClass(), "itsVariableNames", null);
        setIntField(term348602, term348602.getClass(), "varStart", 0);
        setField(term348602, term348602.getClass(), "compilerData", null);
        setIntField(term348602, term348602.getClass(), "type", 39);
        setDoubleField(term348603, term348603.getClass(), "number", 0.0);
        setIntField(term348603, term348603.getClass(), "type", 0);
        setField(term348603, term348603.getClass(), "next", null);
        setField(term348603, term348603.getClass(), "first", null);
        setField(term348603, term348603.getClass(), "last", null);
        setField(term348603, term348603.getClass(), "propListHead", null);
        setIntField(term348603, term348603.getClass(), "sourcePosition", 0);
        setField(term348603, term348603.getClass(), "jsType", null);
        setField(term348603, term348603.getClass(), "parent", null);
        setField(term348602, term348602.getClass(), "next", term348603);
        setField(term348602, term348602.getClass(), "first", null);
        setField(term348602, term348602.getClass(), "last", null);
        setField(term348602, term348602.getClass(), "propListHead", null);
        setIntField(term348602, term348602.getClass(), "sourcePosition", 0);
        setField(term348602, term348602.getClass(), "jsType", null);
        setField(term348602, term348602.getClass(), "parent", null);
        setField(term348601, term348601.getClass(), "first", term348602);
        setField(term348601, term348601.getClass(), "last", null);
        setField(term348601, term348601.getClass(), "propListHead", null);
        setIntField(term348601, term348601.getClass(), "sourcePosition", 0);
        setField(term348601, term348601.getClass(), "jsType", null);
        setField(term348601, term348601.getClass(), "parent", null);
        term348542 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term348549 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term348559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term348542, term348542.getClass(), "encodedSourceStart", 0);
        setIntField(term348542, term348542.getClass(), "encodedSourceEnd", 0);
        setField(term348542, term348542.getClass(), "sourceName", null);
        setIntField(term348542, term348542.getClass(), "baseLineno", 0);
        setIntField(term348542, term348542.getClass(), "endLineno", 0);
        setField(term348542, term348542.getClass(), "functions", null);
        setField(term348542, term348542.getClass(), "regexps", null);
        setField(term348542, term348542.getClass(), "itsVariables", null);
        setField(term348542, term348542.getClass(), "itsConst", null);
        setField(term348542, term348542.getClass(), "itsVariableNames", null);
        setIntField(term348542, term348542.getClass(), "varStart", 0);
        setField(term348542, term348542.getClass(), "compilerData", null);
        setIntField(term348542, term348542.getClass(), "type", 24);
        setField(term348542, term348542.getClass(), "next", null);
        setField(term348549, term348549.getClass(), "functionName", null);
        setBooleanField(term348549, term348549.getClass(), "itsNeedsActivation", false);
        setIntField(term348549, term348549.getClass(), "itsFunctionType", 0);
        setBooleanField(term348549, term348549.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term348549, term348549.getClass(), "encodedSourceStart", 0);
        setIntField(term348549, term348549.getClass(), "encodedSourceEnd", 0);
        setField(term348549, term348549.getClass(), "sourceName", null);
        setIntField(term348549, term348549.getClass(), "baseLineno", 0);
        setIntField(term348549, term348549.getClass(), "endLineno", 0);
        setField(term348549, term348549.getClass(), "functions", null);
        setField(term348549, term348549.getClass(), "regexps", null);
        setField(term348549, term348549.getClass(), "itsVariables", null);
        setField(term348549, term348549.getClass(), "itsConst", null);
        setField(term348549, term348549.getClass(), "itsVariableNames", null);
        setIntField(term348549, term348549.getClass(), "varStart", 0);
        setField(term348549, term348549.getClass(), "compilerData", null);
        setIntField(term348549, term348549.getClass(), "type", 39);
        setDoubleField(term348559, term348559.getClass(), "number", 0.0);
        setIntField(term348559, term348559.getClass(), "type", 0);
        setField(term348559, term348559.getClass(), "next", null);
        setField(term348559, term348559.getClass(), "first", null);
        setField(term348559, term348559.getClass(), "last", null);
        setField(term348559, term348559.getClass(), "propListHead", null);
        setIntField(term348559, term348559.getClass(), "sourcePosition", 0);
        setField(term348559, term348559.getClass(), "jsType", null);
        setField(term348559, term348559.getClass(), "parent", null);
        setField(term348549, term348549.getClass(), "next", term348559);
        setField(term348549, term348549.getClass(), "first", null);
        setField(term348549, term348549.getClass(), "last", null);
        setField(term348549, term348549.getClass(), "propListHead", null);
        setIntField(term348549, term348549.getClass(), "sourcePosition", 0);
        setField(term348549, term348549.getClass(), "jsType", null);
        setField(term348549, term348549.getClass(), "parent", null);
        setField(term348542, term348542.getClass(), "first", term348549);
        setField(term348542, term348542.getClass(), "last", null);
        setField(term348542, term348542.getClass(), "propListHead", null);
        setIntField(term348542, term348542.getClass(), "sourcePosition", 0);
        setField(term348542, term348542.getClass(), "jsType", null);
        setField(term348542, term348542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term348007;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term347917, args);
        assertTrue(recursiveEquals(term347917, term348600));
        assertTrue(recursiveEquals(term348007, term348601));
        assertTrue(recursiveEquals(retValue, term348542));
    }

};


