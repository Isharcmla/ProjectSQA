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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265751;
     Object term265843;
     Object term266476;
     Object term266477;
     Object term266410;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265751 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term265843 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265933 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term266025 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term265933, term265933.getClass(), "next", term266025);
        setIntField(term265933, term265933.getClass(), "type", 0);
        setField(term265843, term265843.getClass(), "first", term265933);
        setIntField(term265843, term265843.getClass(), "type", 101);
        setField(term265843, term265843.getClass(), "parent", null);
        term266476 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term266476, term266476.getClass(), "currentTraversal", null);
        term266477 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term266478 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term266479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term266477, term266477.getClass(), "str", null);
        setIntField(term266477, term266477.getClass(), "type", 101);
        setField(term266477, term266477.getClass(), "next", null);
        setIntField(term266478, term266478.getClass(), "encodedSourceStart", 0);
        setIntField(term266478, term266478.getClass(), "encodedSourceEnd", 0);
        setField(term266478, term266478.getClass(), "sourceName", null);
        setIntField(term266478, term266478.getClass(), "baseLineno", 0);
        setIntField(term266478, term266478.getClass(), "endLineno", 0);
        setField(term266478, term266478.getClass(), "functions", null);
        setField(term266478, term266478.getClass(), "regexps", null);
        setField(term266478, term266478.getClass(), "itsVariables", null);
        setField(term266478, term266478.getClass(), "itsConst", null);
        setField(term266478, term266478.getClass(), "itsVariableNames", null);
        setIntField(term266478, term266478.getClass(), "varStart", 0);
        setField(term266478, term266478.getClass(), "compilerData", null);
        setIntField(term266478, term266478.getClass(), "type", 0);
        setDoubleField(term266479, term266479.getClass(), "number", 0.0);
        setIntField(term266479, term266479.getClass(), "type", 0);
        setField(term266479, term266479.getClass(), "next", null);
        setField(term266479, term266479.getClass(), "first", null);
        setField(term266479, term266479.getClass(), "last", null);
        setField(term266479, term266479.getClass(), "propListHead", null);
        setIntField(term266479, term266479.getClass(), "sourcePosition", 0);
        setField(term266479, term266479.getClass(), "jsType", null);
        setField(term266479, term266479.getClass(), "parent", null);
        setField(term266478, term266478.getClass(), "next", term266479);
        setField(term266478, term266478.getClass(), "first", null);
        setField(term266478, term266478.getClass(), "last", null);
        setField(term266478, term266478.getClass(), "propListHead", null);
        setIntField(term266478, term266478.getClass(), "sourcePosition", 0);
        setField(term266478, term266478.getClass(), "jsType", null);
        setField(term266478, term266478.getClass(), "parent", null);
        setField(term266477, term266477.getClass(), "first", term266478);
        setField(term266477, term266477.getClass(), "last", null);
        setField(term266477, term266477.getClass(), "propListHead", null);
        setIntField(term266477, term266477.getClass(), "sourcePosition", 0);
        setField(term266477, term266477.getClass(), "jsType", null);
        setField(term266477, term266477.getClass(), "parent", null);
        term266410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term266412 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term266419 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term266410, term266410.getClass(), "str", null);
        setIntField(term266410, term266410.getClass(), "type", 101);
        setField(term266410, term266410.getClass(), "next", null);
        setIntField(term266412, term266412.getClass(), "encodedSourceStart", 0);
        setIntField(term266412, term266412.getClass(), "encodedSourceEnd", 0);
        setField(term266412, term266412.getClass(), "sourceName", null);
        setIntField(term266412, term266412.getClass(), "baseLineno", 0);
        setIntField(term266412, term266412.getClass(), "endLineno", 0);
        setField(term266412, term266412.getClass(), "functions", null);
        setField(term266412, term266412.getClass(), "regexps", null);
        setField(term266412, term266412.getClass(), "itsVariables", null);
        setField(term266412, term266412.getClass(), "itsConst", null);
        setField(term266412, term266412.getClass(), "itsVariableNames", null);
        setIntField(term266412, term266412.getClass(), "varStart", 0);
        setField(term266412, term266412.getClass(), "compilerData", null);
        setIntField(term266412, term266412.getClass(), "type", 0);
        setDoubleField(term266419, term266419.getClass(), "number", 0.0);
        setIntField(term266419, term266419.getClass(), "type", 0);
        setField(term266419, term266419.getClass(), "next", null);
        setField(term266419, term266419.getClass(), "first", null);
        setField(term266419, term266419.getClass(), "last", null);
        setField(term266419, term266419.getClass(), "propListHead", null);
        setIntField(term266419, term266419.getClass(), "sourcePosition", 0);
        setField(term266419, term266419.getClass(), "jsType", null);
        setField(term266419, term266419.getClass(), "parent", null);
        setField(term266412, term266412.getClass(), "next", term266419);
        setField(term266412, term266412.getClass(), "first", null);
        setField(term266412, term266412.getClass(), "last", null);
        setField(term266412, term266412.getClass(), "propListHead", null);
        setIntField(term266412, term266412.getClass(), "sourcePosition", 0);
        setField(term266412, term266412.getClass(), "jsType", null);
        setField(term266412, term266412.getClass(), "parent", null);
        setField(term266410, term266410.getClass(), "first", term266412);
        setField(term266410, term266410.getClass(), "last", null);
        setField(term266410, term266410.getClass(), "propListHead", null);
        setIntField(term266410, term266410.getClass(), "sourcePosition", 0);
        setField(term266410, term266410.getClass(), "jsType", null);
        setField(term266410, term266410.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term265843;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term265751, args);
        assertTrue(recursiveEquals(term265751, term266476));
        assertTrue(recursiveEquals(term265843, term266477));
        assertTrue(recursiveEquals(retValue, term266410));
    }

};


