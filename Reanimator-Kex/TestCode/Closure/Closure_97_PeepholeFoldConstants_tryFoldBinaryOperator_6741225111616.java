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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626059;
     Object term626151;
     Object term651623;
     Object term651624;
     Object term651560;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626059 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term626151 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term626241 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term626311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term626241, term626241.getClass(), "next", term626311);
        setIntField(term626241, term626241.getClass(), "type", 0);
        setField(term626151, term626151.getClass(), "first", term626241);
        setIntField(term626151, term626151.getClass(), "type", 100);
        setField(term626151, term626151.getClass(), "parent", null);
        term651623 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651623, term651623.getClass(), "currentTraversal", null);
        term651624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651625 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term651626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651624, term651624.getClass(), "str", null);
        setIntField(term651624, term651624.getClass(), "type", 100);
        setField(term651624, term651624.getClass(), "next", null);
        setIntField(term651625, term651625.getClass(), "encodedSourceStart", 0);
        setIntField(term651625, term651625.getClass(), "encodedSourceEnd", 0);
        setField(term651625, term651625.getClass(), "sourceName", null);
        setIntField(term651625, term651625.getClass(), "baseLineno", 0);
        setIntField(term651625, term651625.getClass(), "endLineno", 0);
        setField(term651625, term651625.getClass(), "functions", null);
        setField(term651625, term651625.getClass(), "regexps", null);
        setField(term651625, term651625.getClass(), "itsVariables", null);
        setField(term651625, term651625.getClass(), "itsConst", null);
        setField(term651625, term651625.getClass(), "itsVariableNames", null);
        setIntField(term651625, term651625.getClass(), "varStart", 0);
        setField(term651625, term651625.getClass(), "compilerData", null);
        setIntField(term651625, term651625.getClass(), "type", 0);
        setIntField(term651626, term651626.getClass(), "type", 0);
        setField(term651626, term651626.getClass(), "next", null);
        setField(term651626, term651626.getClass(), "first", null);
        setField(term651626, term651626.getClass(), "last", null);
        setField(term651626, term651626.getClass(), "propListHead", null);
        setIntField(term651626, term651626.getClass(), "sourcePosition", 0);
        setField(term651626, term651626.getClass(), "jsType", null);
        setField(term651626, term651626.getClass(), "parent", null);
        setField(term651625, term651625.getClass(), "next", term651626);
        setField(term651625, term651625.getClass(), "first", null);
        setField(term651625, term651625.getClass(), "last", null);
        setField(term651625, term651625.getClass(), "propListHead", null);
        setIntField(term651625, term651625.getClass(), "sourcePosition", 0);
        setField(term651625, term651625.getClass(), "jsType", null);
        setField(term651625, term651625.getClass(), "parent", null);
        setField(term651624, term651624.getClass(), "first", term651625);
        setField(term651624, term651624.getClass(), "last", null);
        setField(term651624, term651624.getClass(), "propListHead", null);
        setIntField(term651624, term651624.getClass(), "sourcePosition", 0);
        setField(term651624, term651624.getClass(), "jsType", null);
        setField(term651624, term651624.getClass(), "parent", null);
        term651560 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651562 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term651569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651560, term651560.getClass(), "str", null);
        setIntField(term651560, term651560.getClass(), "type", 100);
        setField(term651560, term651560.getClass(), "next", null);
        setIntField(term651562, term651562.getClass(), "encodedSourceStart", 0);
        setIntField(term651562, term651562.getClass(), "encodedSourceEnd", 0);
        setField(term651562, term651562.getClass(), "sourceName", null);
        setIntField(term651562, term651562.getClass(), "baseLineno", 0);
        setIntField(term651562, term651562.getClass(), "endLineno", 0);
        setField(term651562, term651562.getClass(), "functions", null);
        setField(term651562, term651562.getClass(), "regexps", null);
        setField(term651562, term651562.getClass(), "itsVariables", null);
        setField(term651562, term651562.getClass(), "itsConst", null);
        setField(term651562, term651562.getClass(), "itsVariableNames", null);
        setIntField(term651562, term651562.getClass(), "varStart", 0);
        setField(term651562, term651562.getClass(), "compilerData", null);
        setIntField(term651562, term651562.getClass(), "type", 0);
        setIntField(term651569, term651569.getClass(), "type", 0);
        setField(term651569, term651569.getClass(), "next", null);
        setField(term651569, term651569.getClass(), "first", null);
        setField(term651569, term651569.getClass(), "last", null);
        setField(term651569, term651569.getClass(), "propListHead", null);
        setIntField(term651569, term651569.getClass(), "sourcePosition", 0);
        setField(term651569, term651569.getClass(), "jsType", null);
        setField(term651569, term651569.getClass(), "parent", null);
        setField(term651562, term651562.getClass(), "next", term651569);
        setField(term651562, term651562.getClass(), "first", null);
        setField(term651562, term651562.getClass(), "last", null);
        setField(term651562, term651562.getClass(), "propListHead", null);
        setIntField(term651562, term651562.getClass(), "sourcePosition", 0);
        setField(term651562, term651562.getClass(), "jsType", null);
        setField(term651562, term651562.getClass(), "parent", null);
        setField(term651560, term651560.getClass(), "first", term651562);
        setField(term651560, term651560.getClass(), "last", null);
        setField(term651560, term651560.getClass(), "propListHead", null);
        setIntField(term651560, term651560.getClass(), "sourcePosition", 0);
        setField(term651560, term651560.getClass(), "jsType", null);
        setField(term651560, term651560.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term626151;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term626059, args);
        assertTrue(recursiveEquals(term626059, term651623));
        assertTrue(recursiveEquals(term626151, term651624));
        assertTrue(recursiveEquals(retValue, term651560));
    }

};


