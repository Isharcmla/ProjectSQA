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

public class PeepholeFoldConstants_tryFoldAndOr_425870290412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95729;
     Object term95821;
     Object term95907;
     Object term95993;
     Object term96125;
     Object term96126;
     Object term96127;
     Object term96128;
     Object term96071;

    public PeepholeFoldConstants_tryFoldAndOr_425870290412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95729 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term95821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term95821, term95821.getClass(), "parent", null);
        setIntField(term95821, term95821.getClass(), "type", 0);
        term95907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term95907, term95907.getClass(), "type", 0);
        term95993 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term96125 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term96125, term96125.getClass(), "currentTraversal", null);
        term96126 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term96126, term96126.getClass(), "str", null);
        setIntField(term96126, term96126.getClass(), "type", 0);
        setField(term96126, term96126.getClass(), "next", null);
        setField(term96126, term96126.getClass(), "first", null);
        setField(term96126, term96126.getClass(), "last", null);
        setField(term96126, term96126.getClass(), "propListHead", null);
        setIntField(term96126, term96126.getClass(), "sourcePosition", 0);
        setField(term96126, term96126.getClass(), "jsType", null);
        setField(term96126, term96126.getClass(), "parent", null);
        term96127 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term96127, term96127.getClass(), "functionName", null);
        setBooleanField(term96127, term96127.getClass(), "itsNeedsActivation", false);
        setIntField(term96127, term96127.getClass(), "itsFunctionType", 0);
        setBooleanField(term96127, term96127.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96127, term96127.getClass(), "encodedSourceStart", 0);
        setIntField(term96127, term96127.getClass(), "encodedSourceEnd", 0);
        setField(term96127, term96127.getClass(), "sourceName", null);
        setIntField(term96127, term96127.getClass(), "baseLineno", 0);
        setIntField(term96127, term96127.getClass(), "endLineno", 0);
        setField(term96127, term96127.getClass(), "functions", null);
        setField(term96127, term96127.getClass(), "regexps", null);
        setField(term96127, term96127.getClass(), "itsVariables", null);
        setField(term96127, term96127.getClass(), "itsConst", null);
        setField(term96127, term96127.getClass(), "itsVariableNames", null);
        setIntField(term96127, term96127.getClass(), "varStart", 0);
        setField(term96127, term96127.getClass(), "compilerData", null);
        setIntField(term96127, term96127.getClass(), "type", 0);
        setField(term96127, term96127.getClass(), "next", null);
        setField(term96127, term96127.getClass(), "first", null);
        setField(term96127, term96127.getClass(), "last", null);
        setField(term96127, term96127.getClass(), "propListHead", null);
        setIntField(term96127, term96127.getClass(), "sourcePosition", 0);
        setField(term96127, term96127.getClass(), "jsType", null);
        setField(term96127, term96127.getClass(), "parent", null);
        term96128 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term96128, term96128.getClass(), "functionName", null);
        setBooleanField(term96128, term96128.getClass(), "itsNeedsActivation", false);
        setIntField(term96128, term96128.getClass(), "itsFunctionType", 0);
        setBooleanField(term96128, term96128.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96128, term96128.getClass(), "encodedSourceStart", 0);
        setIntField(term96128, term96128.getClass(), "encodedSourceEnd", 0);
        setField(term96128, term96128.getClass(), "sourceName", null);
        setIntField(term96128, term96128.getClass(), "baseLineno", 0);
        setIntField(term96128, term96128.getClass(), "endLineno", 0);
        setField(term96128, term96128.getClass(), "functions", null);
        setField(term96128, term96128.getClass(), "regexps", null);
        setField(term96128, term96128.getClass(), "itsVariables", null);
        setField(term96128, term96128.getClass(), "itsConst", null);
        setField(term96128, term96128.getClass(), "itsVariableNames", null);
        setIntField(term96128, term96128.getClass(), "varStart", 0);
        setField(term96128, term96128.getClass(), "compilerData", null);
        setIntField(term96128, term96128.getClass(), "type", 0);
        setField(term96128, term96128.getClass(), "next", null);
        setField(term96128, term96128.getClass(), "first", null);
        setField(term96128, term96128.getClass(), "last", null);
        setField(term96128, term96128.getClass(), "propListHead", null);
        setIntField(term96128, term96128.getClass(), "sourcePosition", 0);
        setField(term96128, term96128.getClass(), "jsType", null);
        setField(term96128, term96128.getClass(), "parent", null);
        term96071 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term96071, term96071.getClass(), "str", null);
        setIntField(term96071, term96071.getClass(), "type", 0);
        setField(term96071, term96071.getClass(), "next", null);
        setField(term96071, term96071.getClass(), "first", null);
        setField(term96071, term96071.getClass(), "last", null);
        setField(term96071, term96071.getClass(), "propListHead", null);
        setIntField(term96071, term96071.getClass(), "sourcePosition", 0);
        setField(term96071, term96071.getClass(), "jsType", null);
        setField(term96071, term96071.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term95821;
        args[1] = term95907;
        args[2] = term95993;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term95729, args);
        assertTrue(recursiveEquals(term95729, term96125));
        assertTrue(recursiveEquals(term95821, term96126));
        assertTrue(recursiveEquals(term95907, term96127));
        assertTrue(recursiveEquals(term95993, term96128));
        assertTrue(recursiveEquals(retValue, term96071));
    }

};


