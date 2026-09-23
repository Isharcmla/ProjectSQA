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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627823;
     Object term627915;
     Object term628658;
     Object term628659;
     Object term628578;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term627823 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term627915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term628005 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term628097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term628189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term628097, term628097.getClass(), "type", 44);
        setField(term628005, term628005.getClass(), "next", term628097);
        setIntField(term628005, term628005.getClass(), "type", 0);
        setField(term627915, term627915.getClass(), "first", term628005);
        setIntField(term627915, term627915.getClass(), "type", 101);
        setField(term627915, term627915.getClass(), "parent", term628189);
        term628658 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term628658, term628658.getClass(), "currentTraversal", null);
        term628659 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term628660 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term628661 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term628662 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term628659, term628659.getClass(), "number", 0.0);
        setIntField(term628659, term628659.getClass(), "type", 101);
        setField(term628659, term628659.getClass(), "next", null);
        setIntField(term628660, term628660.getClass(), "encodedSourceStart", 0);
        setIntField(term628660, term628660.getClass(), "encodedSourceEnd", 0);
        setField(term628660, term628660.getClass(), "sourceName", null);
        setIntField(term628660, term628660.getClass(), "baseLineno", 0);
        setIntField(term628660, term628660.getClass(), "endLineno", 0);
        setField(term628660, term628660.getClass(), "functions", null);
        setField(term628660, term628660.getClass(), "regexps", null);
        setField(term628660, term628660.getClass(), "itsVariables", null);
        setField(term628660, term628660.getClass(), "itsConst", null);
        setField(term628660, term628660.getClass(), "itsVariableNames", null);
        setIntField(term628660, term628660.getClass(), "varStart", 0);
        setField(term628660, term628660.getClass(), "compilerData", null);
        setIntField(term628660, term628660.getClass(), "type", 0);
        setField(term628661, term628661.getClass(), "str", null);
        setIntField(term628661, term628661.getClass(), "type", 44);
        setField(term628661, term628661.getClass(), "next", null);
        setField(term628661, term628661.getClass(), "first", null);
        setField(term628661, term628661.getClass(), "last", null);
        setField(term628661, term628661.getClass(), "propListHead", null);
        setIntField(term628661, term628661.getClass(), "sourcePosition", 0);
        setField(term628661, term628661.getClass(), "jsType", null);
        setField(term628661, term628661.getClass(), "parent", null);
        setField(term628660, term628660.getClass(), "next", term628661);
        setField(term628660, term628660.getClass(), "first", null);
        setField(term628660, term628660.getClass(), "last", null);
        setField(term628660, term628660.getClass(), "propListHead", null);
        setIntField(term628660, term628660.getClass(), "sourcePosition", 0);
        setField(term628660, term628660.getClass(), "jsType", null);
        setField(term628660, term628660.getClass(), "parent", null);
        setField(term628659, term628659.getClass(), "first", term628660);
        setField(term628659, term628659.getClass(), "last", null);
        setField(term628659, term628659.getClass(), "propListHead", null);
        setIntField(term628659, term628659.getClass(), "sourcePosition", 0);
        setField(term628659, term628659.getClass(), "jsType", null);
        setField(term628662, term628662.getClass(), "str", null);
        setIntField(term628662, term628662.getClass(), "type", 0);
        setField(term628662, term628662.getClass(), "next", null);
        setField(term628662, term628662.getClass(), "first", null);
        setField(term628662, term628662.getClass(), "last", null);
        setField(term628662, term628662.getClass(), "propListHead", null);
        setIntField(term628662, term628662.getClass(), "sourcePosition", 0);
        setField(term628662, term628662.getClass(), "jsType", null);
        setField(term628662, term628662.getClass(), "parent", null);
        setField(term628659, term628659.getClass(), "parent", term628662);
        term628578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term628581 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term628588 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term628593 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term628578, term628578.getClass(), "number", 0.0);
        setIntField(term628578, term628578.getClass(), "type", 101);
        setField(term628578, term628578.getClass(), "next", null);
        setIntField(term628581, term628581.getClass(), "encodedSourceStart", 0);
        setIntField(term628581, term628581.getClass(), "encodedSourceEnd", 0);
        setField(term628581, term628581.getClass(), "sourceName", null);
        setIntField(term628581, term628581.getClass(), "baseLineno", 0);
        setIntField(term628581, term628581.getClass(), "endLineno", 0);
        setField(term628581, term628581.getClass(), "functions", null);
        setField(term628581, term628581.getClass(), "regexps", null);
        setField(term628581, term628581.getClass(), "itsVariables", null);
        setField(term628581, term628581.getClass(), "itsConst", null);
        setField(term628581, term628581.getClass(), "itsVariableNames", null);
        setIntField(term628581, term628581.getClass(), "varStart", 0);
        setField(term628581, term628581.getClass(), "compilerData", null);
        setIntField(term628581, term628581.getClass(), "type", 0);
        setField(term628588, term628588.getClass(), "str", null);
        setIntField(term628588, term628588.getClass(), "type", 44);
        setField(term628588, term628588.getClass(), "next", null);
        setField(term628588, term628588.getClass(), "first", null);
        setField(term628588, term628588.getClass(), "last", null);
        setField(term628588, term628588.getClass(), "propListHead", null);
        setIntField(term628588, term628588.getClass(), "sourcePosition", 0);
        setField(term628588, term628588.getClass(), "jsType", null);
        setField(term628588, term628588.getClass(), "parent", null);
        setField(term628581, term628581.getClass(), "next", term628588);
        setField(term628581, term628581.getClass(), "first", null);
        setField(term628581, term628581.getClass(), "last", null);
        setField(term628581, term628581.getClass(), "propListHead", null);
        setIntField(term628581, term628581.getClass(), "sourcePosition", 0);
        setField(term628581, term628581.getClass(), "jsType", null);
        setField(term628581, term628581.getClass(), "parent", null);
        setField(term628578, term628578.getClass(), "first", term628581);
        setField(term628578, term628578.getClass(), "last", null);
        setField(term628578, term628578.getClass(), "propListHead", null);
        setIntField(term628578, term628578.getClass(), "sourcePosition", 0);
        setField(term628578, term628578.getClass(), "jsType", null);
        setField(term628593, term628593.getClass(), "str", null);
        setIntField(term628593, term628593.getClass(), "type", 0);
        setField(term628593, term628593.getClass(), "next", null);
        setField(term628593, term628593.getClass(), "first", null);
        setField(term628593, term628593.getClass(), "last", null);
        setField(term628593, term628593.getClass(), "propListHead", null);
        setIntField(term628593, term628593.getClass(), "sourcePosition", 0);
        setField(term628593, term628593.getClass(), "jsType", null);
        setField(term628593, term628593.getClass(), "parent", null);
        setField(term628578, term628578.getClass(), "parent", term628593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term627915;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term627823, args);
        assertTrue(recursiveEquals(term627823, term628658));
        assertTrue(recursiveEquals(term627915, term628659));
        assertTrue(recursiveEquals(retValue, term628578));
    }

};


