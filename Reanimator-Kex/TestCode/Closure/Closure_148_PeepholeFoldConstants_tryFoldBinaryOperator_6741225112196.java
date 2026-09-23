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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600849;
     Object term600941;
     Object term601185;
     Object term601186;
     Object term601141;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600849 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term600941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term601033 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term601123 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term601033, term601033.getClass(), "next", term601123);
        setIntField(term601033, term601033.getClass(), "type", 39);
        setField(term600941, term600941.getClass(), "first", term601033);
        setIntField(term600941, term600941.getClass(), "type", 24);
        term601185 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term601185, term601185.getClass(), "currentTraversal", null);
        term601186 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term601187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term601188 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term601186, term601186.getClass(), "str", null);
        setIntField(term601186, term601186.getClass(), "type", 24);
        setField(term601186, term601186.getClass(), "next", null);
        setField(term601187, term601187.getClass(), "str", null);
        setIntField(term601187, term601187.getClass(), "type", 39);
        setIntField(term601188, term601188.getClass(), "encodedSourceStart", 0);
        setIntField(term601188, term601188.getClass(), "encodedSourceEnd", 0);
        setField(term601188, term601188.getClass(), "sourceName", null);
        setIntField(term601188, term601188.getClass(), "baseLineno", 0);
        setIntField(term601188, term601188.getClass(), "endLineno", 0);
        setField(term601188, term601188.getClass(), "functions", null);
        setField(term601188, term601188.getClass(), "regexps", null);
        setField(term601188, term601188.getClass(), "itsVariables", null);
        setField(term601188, term601188.getClass(), "itsConst", null);
        setField(term601188, term601188.getClass(), "itsVariableNames", null);
        setIntField(term601188, term601188.getClass(), "varStart", 0);
        setField(term601188, term601188.getClass(), "compilerData", null);
        setIntField(term601188, term601188.getClass(), "type", 0);
        setField(term601188, term601188.getClass(), "next", null);
        setField(term601188, term601188.getClass(), "first", null);
        setField(term601188, term601188.getClass(), "last", null);
        setField(term601188, term601188.getClass(), "propListHead", null);
        setIntField(term601188, term601188.getClass(), "sourcePosition", 0);
        setField(term601188, term601188.getClass(), "jsType", null);
        setField(term601188, term601188.getClass(), "parent", null);
        setField(term601187, term601187.getClass(), "next", term601188);
        setField(term601187, term601187.getClass(), "first", null);
        setField(term601187, term601187.getClass(), "last", null);
        setField(term601187, term601187.getClass(), "propListHead", null);
        setIntField(term601187, term601187.getClass(), "sourcePosition", 0);
        setField(term601187, term601187.getClass(), "jsType", null);
        setField(term601187, term601187.getClass(), "parent", null);
        setField(term601186, term601186.getClass(), "first", term601187);
        setField(term601186, term601186.getClass(), "last", null);
        setField(term601186, term601186.getClass(), "propListHead", null);
        setIntField(term601186, term601186.getClass(), "sourcePosition", 0);
        setField(term601186, term601186.getClass(), "jsType", null);
        setField(term601186, term601186.getClass(), "parent", null);
        term601141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term601143 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term601145 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term601141, term601141.getClass(), "str", null);
        setIntField(term601141, term601141.getClass(), "type", 24);
        setField(term601141, term601141.getClass(), "next", null);
        setField(term601143, term601143.getClass(), "str", null);
        setIntField(term601143, term601143.getClass(), "type", 39);
        setIntField(term601145, term601145.getClass(), "encodedSourceStart", 0);
        setIntField(term601145, term601145.getClass(), "encodedSourceEnd", 0);
        setField(term601145, term601145.getClass(), "sourceName", null);
        setIntField(term601145, term601145.getClass(), "baseLineno", 0);
        setIntField(term601145, term601145.getClass(), "endLineno", 0);
        setField(term601145, term601145.getClass(), "functions", null);
        setField(term601145, term601145.getClass(), "regexps", null);
        setField(term601145, term601145.getClass(), "itsVariables", null);
        setField(term601145, term601145.getClass(), "itsConst", null);
        setField(term601145, term601145.getClass(), "itsVariableNames", null);
        setIntField(term601145, term601145.getClass(), "varStart", 0);
        setField(term601145, term601145.getClass(), "compilerData", null);
        setIntField(term601145, term601145.getClass(), "type", 0);
        setField(term601145, term601145.getClass(), "next", null);
        setField(term601145, term601145.getClass(), "first", null);
        setField(term601145, term601145.getClass(), "last", null);
        setField(term601145, term601145.getClass(), "propListHead", null);
        setIntField(term601145, term601145.getClass(), "sourcePosition", 0);
        setField(term601145, term601145.getClass(), "jsType", null);
        setField(term601145, term601145.getClass(), "parent", null);
        setField(term601143, term601143.getClass(), "next", term601145);
        setField(term601143, term601143.getClass(), "first", null);
        setField(term601143, term601143.getClass(), "last", null);
        setField(term601143, term601143.getClass(), "propListHead", null);
        setIntField(term601143, term601143.getClass(), "sourcePosition", 0);
        setField(term601143, term601143.getClass(), "jsType", null);
        setField(term601143, term601143.getClass(), "parent", null);
        setField(term601141, term601141.getClass(), "first", term601143);
        setField(term601141, term601141.getClass(), "last", null);
        setField(term601141, term601141.getClass(), "propListHead", null);
        setIntField(term601141, term601141.getClass(), "sourcePosition", 0);
        setField(term601141, term601141.getClass(), "jsType", null);
        setField(term601141, term601141.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term600941;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term600849, args);
        assertTrue(recursiveEquals(term600849, term601185));
        assertTrue(recursiveEquals(term600941, term601186));
        assertTrue(recursiveEquals(retValue, term601141));
    }

};


