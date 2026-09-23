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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176051;
     Object term176143;
     Object term176455;
     Object term176456;
     Object term176392;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176051 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term176143 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176235 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176325 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term176235, term176235.getClass(), "next", term176325);
        setIntField(term176235, term176235.getClass(), "type", 14);
        setField(term176143, term176143.getClass(), "first", term176235);
        setIntField(term176143, term176143.getClass(), "type", 14);
        term176455 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term176455, term176455.getClass(), "currentTraversal", null);
        term176456 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176457 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176458 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term176456, term176456.getClass(), "number", 0.0);
        setIntField(term176456, term176456.getClass(), "type", 14);
        setField(term176456, term176456.getClass(), "next", null);
        setDoubleField(term176457, term176457.getClass(), "number", 0.0);
        setIntField(term176457, term176457.getClass(), "type", 14);
        setIntField(term176458, term176458.getClass(), "encodedSourceStart", 0);
        setIntField(term176458, term176458.getClass(), "encodedSourceEnd", 0);
        setField(term176458, term176458.getClass(), "sourceName", null);
        setIntField(term176458, term176458.getClass(), "baseLineno", 0);
        setIntField(term176458, term176458.getClass(), "endLineno", 0);
        setField(term176458, term176458.getClass(), "functions", null);
        setField(term176458, term176458.getClass(), "regexps", null);
        setField(term176458, term176458.getClass(), "itsVariables", null);
        setField(term176458, term176458.getClass(), "itsConst", null);
        setField(term176458, term176458.getClass(), "itsVariableNames", null);
        setIntField(term176458, term176458.getClass(), "varStart", 0);
        setField(term176458, term176458.getClass(), "compilerData", null);
        setIntField(term176458, term176458.getClass(), "type", 0);
        setField(term176458, term176458.getClass(), "next", null);
        setField(term176458, term176458.getClass(), "first", null);
        setField(term176458, term176458.getClass(), "last", null);
        setField(term176458, term176458.getClass(), "propListHead", null);
        setIntField(term176458, term176458.getClass(), "sourcePosition", 0);
        setField(term176458, term176458.getClass(), "jsType", null);
        setField(term176458, term176458.getClass(), "parent", null);
        setField(term176457, term176457.getClass(), "next", term176458);
        setField(term176457, term176457.getClass(), "first", null);
        setField(term176457, term176457.getClass(), "last", null);
        setField(term176457, term176457.getClass(), "propListHead", null);
        setIntField(term176457, term176457.getClass(), "sourcePosition", 0);
        setField(term176457, term176457.getClass(), "jsType", null);
        setField(term176457, term176457.getClass(), "parent", null);
        setField(term176456, term176456.getClass(), "first", term176457);
        setField(term176456, term176456.getClass(), "last", null);
        setField(term176456, term176456.getClass(), "propListHead", null);
        setIntField(term176456, term176456.getClass(), "sourcePosition", 0);
        setField(term176456, term176456.getClass(), "jsType", null);
        setField(term176456, term176456.getClass(), "parent", null);
        term176392 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176395 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176398 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term176392, term176392.getClass(), "number", 0.0);
        setIntField(term176392, term176392.getClass(), "type", 14);
        setField(term176392, term176392.getClass(), "next", null);
        setDoubleField(term176395, term176395.getClass(), "number", 0.0);
        setIntField(term176395, term176395.getClass(), "type", 14);
        setIntField(term176398, term176398.getClass(), "encodedSourceStart", 0);
        setIntField(term176398, term176398.getClass(), "encodedSourceEnd", 0);
        setField(term176398, term176398.getClass(), "sourceName", null);
        setIntField(term176398, term176398.getClass(), "baseLineno", 0);
        setIntField(term176398, term176398.getClass(), "endLineno", 0);
        setField(term176398, term176398.getClass(), "functions", null);
        setField(term176398, term176398.getClass(), "regexps", null);
        setField(term176398, term176398.getClass(), "itsVariables", null);
        setField(term176398, term176398.getClass(), "itsConst", null);
        setField(term176398, term176398.getClass(), "itsVariableNames", null);
        setIntField(term176398, term176398.getClass(), "varStart", 0);
        setField(term176398, term176398.getClass(), "compilerData", null);
        setIntField(term176398, term176398.getClass(), "type", 0);
        setField(term176398, term176398.getClass(), "next", null);
        setField(term176398, term176398.getClass(), "first", null);
        setField(term176398, term176398.getClass(), "last", null);
        setField(term176398, term176398.getClass(), "propListHead", null);
        setIntField(term176398, term176398.getClass(), "sourcePosition", 0);
        setField(term176398, term176398.getClass(), "jsType", null);
        setField(term176398, term176398.getClass(), "parent", null);
        setField(term176395, term176395.getClass(), "next", term176398);
        setField(term176395, term176395.getClass(), "first", null);
        setField(term176395, term176395.getClass(), "last", null);
        setField(term176395, term176395.getClass(), "propListHead", null);
        setIntField(term176395, term176395.getClass(), "sourcePosition", 0);
        setField(term176395, term176395.getClass(), "jsType", null);
        setField(term176395, term176395.getClass(), "parent", null);
        setField(term176392, term176392.getClass(), "first", term176395);
        setField(term176392, term176392.getClass(), "last", null);
        setField(term176392, term176392.getClass(), "propListHead", null);
        setIntField(term176392, term176392.getClass(), "sourcePosition", 0);
        setField(term176392, term176392.getClass(), "jsType", null);
        setField(term176392, term176392.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term176143;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term176051, args);
        assertTrue(recursiveEquals(term176051, term176455));
        assertTrue(recursiveEquals(term176143, term176456));
        assertTrue(recursiveEquals(retValue, term176392));
    }

};


