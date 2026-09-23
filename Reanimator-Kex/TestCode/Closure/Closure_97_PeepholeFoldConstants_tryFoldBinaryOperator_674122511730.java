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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186951;
     Object term187043;
     Object term187298;
     Object term187299;
     Object term187237;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186951 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term187043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187225 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term187225, term187225.getClass(), "type", 42);
        setField(term187135, term187135.getClass(), "next", term187225);
        setIntField(term187135, term187135.getClass(), "type", 42);
        setField(term187043, term187043.getClass(), "first", term187135);
        setIntField(term187043, term187043.getClass(), "type", 14);
        term187298 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term187298, term187298.getClass(), "currentTraversal", null);
        term187299 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187300 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187301 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term187299, term187299.getClass(), "str", null);
        setIntField(term187299, term187299.getClass(), "type", 14);
        setField(term187299, term187299.getClass(), "next", null);
        setField(term187300, term187300.getClass(), "str", null);
        setIntField(term187300, term187300.getClass(), "type", 42);
        setIntField(term187301, term187301.getClass(), "encodedSourceStart", 0);
        setIntField(term187301, term187301.getClass(), "encodedSourceEnd", 0);
        setField(term187301, term187301.getClass(), "sourceName", null);
        setIntField(term187301, term187301.getClass(), "baseLineno", 0);
        setIntField(term187301, term187301.getClass(), "endLineno", 0);
        setField(term187301, term187301.getClass(), "functions", null);
        setField(term187301, term187301.getClass(), "regexps", null);
        setField(term187301, term187301.getClass(), "itsVariables", null);
        setField(term187301, term187301.getClass(), "itsConst", null);
        setField(term187301, term187301.getClass(), "itsVariableNames", null);
        setIntField(term187301, term187301.getClass(), "varStart", 0);
        setField(term187301, term187301.getClass(), "compilerData", null);
        setIntField(term187301, term187301.getClass(), "type", 42);
        setField(term187301, term187301.getClass(), "next", null);
        setField(term187301, term187301.getClass(), "first", null);
        setField(term187301, term187301.getClass(), "last", null);
        setField(term187301, term187301.getClass(), "propListHead", null);
        setIntField(term187301, term187301.getClass(), "sourcePosition", 0);
        setField(term187301, term187301.getClass(), "jsType", null);
        setField(term187301, term187301.getClass(), "parent", null);
        setField(term187300, term187300.getClass(), "next", term187301);
        setField(term187300, term187300.getClass(), "first", null);
        setField(term187300, term187300.getClass(), "last", null);
        setField(term187300, term187300.getClass(), "propListHead", null);
        setIntField(term187300, term187300.getClass(), "sourcePosition", 0);
        setField(term187300, term187300.getClass(), "jsType", null);
        setField(term187300, term187300.getClass(), "parent", null);
        setField(term187299, term187299.getClass(), "first", term187300);
        setField(term187299, term187299.getClass(), "last", null);
        setField(term187299, term187299.getClass(), "propListHead", null);
        setIntField(term187299, term187299.getClass(), "sourcePosition", 0);
        setField(term187299, term187299.getClass(), "jsType", null);
        setField(term187299, term187299.getClass(), "parent", null);
        term187237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187241 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term187237, term187237.getClass(), "str", null);
        setIntField(term187237, term187237.getClass(), "type", 14);
        setField(term187237, term187237.getClass(), "next", null);
        setField(term187239, term187239.getClass(), "str", null);
        setIntField(term187239, term187239.getClass(), "type", 42);
        setIntField(term187241, term187241.getClass(), "encodedSourceStart", 0);
        setIntField(term187241, term187241.getClass(), "encodedSourceEnd", 0);
        setField(term187241, term187241.getClass(), "sourceName", null);
        setIntField(term187241, term187241.getClass(), "baseLineno", 0);
        setIntField(term187241, term187241.getClass(), "endLineno", 0);
        setField(term187241, term187241.getClass(), "functions", null);
        setField(term187241, term187241.getClass(), "regexps", null);
        setField(term187241, term187241.getClass(), "itsVariables", null);
        setField(term187241, term187241.getClass(), "itsConst", null);
        setField(term187241, term187241.getClass(), "itsVariableNames", null);
        setIntField(term187241, term187241.getClass(), "varStart", 0);
        setField(term187241, term187241.getClass(), "compilerData", null);
        setIntField(term187241, term187241.getClass(), "type", 42);
        setField(term187241, term187241.getClass(), "next", null);
        setField(term187241, term187241.getClass(), "first", null);
        setField(term187241, term187241.getClass(), "last", null);
        setField(term187241, term187241.getClass(), "propListHead", null);
        setIntField(term187241, term187241.getClass(), "sourcePosition", 0);
        setField(term187241, term187241.getClass(), "jsType", null);
        setField(term187241, term187241.getClass(), "parent", null);
        setField(term187239, term187239.getClass(), "next", term187241);
        setField(term187239, term187239.getClass(), "first", null);
        setField(term187239, term187239.getClass(), "last", null);
        setField(term187239, term187239.getClass(), "propListHead", null);
        setIntField(term187239, term187239.getClass(), "sourcePosition", 0);
        setField(term187239, term187239.getClass(), "jsType", null);
        setField(term187239, term187239.getClass(), "parent", null);
        setField(term187237, term187237.getClass(), "first", term187239);
        setField(term187237, term187237.getClass(), "last", null);
        setField(term187237, term187237.getClass(), "propListHead", null);
        setIntField(term187237, term187237.getClass(), "sourcePosition", 0);
        setField(term187237, term187237.getClass(), "jsType", null);
        setField(term187237, term187237.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term187043;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term186951, args);
        assertTrue(recursiveEquals(term186951, term187298));
        assertTrue(recursiveEquals(term187043, term187299));
        assertTrue(recursiveEquals(retValue, term187237));
    }

};


