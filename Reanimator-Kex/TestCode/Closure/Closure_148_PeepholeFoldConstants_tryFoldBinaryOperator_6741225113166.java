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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term939531;
     Object term939623;
     Object term939866;
     Object term939867;
     Object term939818;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term939531 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term939623 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term939715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term939805 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term939715, term939715.getClass(), "next", term939805);
        setIntField(term939715, term939715.getClass(), "type", 39);
        setField(term939623, term939623.getClass(), "first", term939715);
        setIntField(term939623, term939623.getClass(), "type", 23);
        term939866 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term939866, term939866.getClass(), "currentTraversal", null);
        term939867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term939868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term939869 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term939867, term939867.getClass(), "number", 0.0);
        setIntField(term939867, term939867.getClass(), "type", 23);
        setField(term939867, term939867.getClass(), "next", null);
        setDoubleField(term939868, term939868.getClass(), "number", 0.0);
        setIntField(term939868, term939868.getClass(), "type", 39);
        setIntField(term939869, term939869.getClass(), "encodedSourceStart", 0);
        setIntField(term939869, term939869.getClass(), "encodedSourceEnd", 0);
        setField(term939869, term939869.getClass(), "sourceName", null);
        setIntField(term939869, term939869.getClass(), "baseLineno", 0);
        setIntField(term939869, term939869.getClass(), "endLineno", 0);
        setField(term939869, term939869.getClass(), "functions", null);
        setField(term939869, term939869.getClass(), "regexps", null);
        setField(term939869, term939869.getClass(), "itsVariables", null);
        setField(term939869, term939869.getClass(), "itsConst", null);
        setField(term939869, term939869.getClass(), "itsVariableNames", null);
        setIntField(term939869, term939869.getClass(), "varStart", 0);
        setField(term939869, term939869.getClass(), "compilerData", null);
        setIntField(term939869, term939869.getClass(), "type", 0);
        setField(term939869, term939869.getClass(), "next", null);
        setField(term939869, term939869.getClass(), "first", null);
        setField(term939869, term939869.getClass(), "last", null);
        setField(term939869, term939869.getClass(), "propListHead", null);
        setIntField(term939869, term939869.getClass(), "sourcePosition", 0);
        setField(term939869, term939869.getClass(), "jsType", null);
        setField(term939869, term939869.getClass(), "parent", null);
        setField(term939868, term939868.getClass(), "next", term939869);
        setField(term939868, term939868.getClass(), "first", null);
        setField(term939868, term939868.getClass(), "last", null);
        setField(term939868, term939868.getClass(), "propListHead", null);
        setIntField(term939868, term939868.getClass(), "sourcePosition", 0);
        setField(term939868, term939868.getClass(), "jsType", null);
        setField(term939868, term939868.getClass(), "parent", null);
        setField(term939867, term939867.getClass(), "first", term939868);
        setField(term939867, term939867.getClass(), "last", null);
        setField(term939867, term939867.getClass(), "propListHead", null);
        setIntField(term939867, term939867.getClass(), "sourcePosition", 0);
        setField(term939867, term939867.getClass(), "jsType", null);
        setField(term939867, term939867.getClass(), "parent", null);
        term939818 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term939821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term939824 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term939818, term939818.getClass(), "number", 0.0);
        setIntField(term939818, term939818.getClass(), "type", 23);
        setField(term939818, term939818.getClass(), "next", null);
        setDoubleField(term939821, term939821.getClass(), "number", 0.0);
        setIntField(term939821, term939821.getClass(), "type", 39);
        setIntField(term939824, term939824.getClass(), "encodedSourceStart", 0);
        setIntField(term939824, term939824.getClass(), "encodedSourceEnd", 0);
        setField(term939824, term939824.getClass(), "sourceName", null);
        setIntField(term939824, term939824.getClass(), "baseLineno", 0);
        setIntField(term939824, term939824.getClass(), "endLineno", 0);
        setField(term939824, term939824.getClass(), "functions", null);
        setField(term939824, term939824.getClass(), "regexps", null);
        setField(term939824, term939824.getClass(), "itsVariables", null);
        setField(term939824, term939824.getClass(), "itsConst", null);
        setField(term939824, term939824.getClass(), "itsVariableNames", null);
        setIntField(term939824, term939824.getClass(), "varStart", 0);
        setField(term939824, term939824.getClass(), "compilerData", null);
        setIntField(term939824, term939824.getClass(), "type", 0);
        setField(term939824, term939824.getClass(), "next", null);
        setField(term939824, term939824.getClass(), "first", null);
        setField(term939824, term939824.getClass(), "last", null);
        setField(term939824, term939824.getClass(), "propListHead", null);
        setIntField(term939824, term939824.getClass(), "sourcePosition", 0);
        setField(term939824, term939824.getClass(), "jsType", null);
        setField(term939824, term939824.getClass(), "parent", null);
        setField(term939821, term939821.getClass(), "next", term939824);
        setField(term939821, term939821.getClass(), "first", null);
        setField(term939821, term939821.getClass(), "last", null);
        setField(term939821, term939821.getClass(), "propListHead", null);
        setIntField(term939821, term939821.getClass(), "sourcePosition", 0);
        setField(term939821, term939821.getClass(), "jsType", null);
        setField(term939821, term939821.getClass(), "parent", null);
        setField(term939818, term939818.getClass(), "first", term939821);
        setField(term939818, term939818.getClass(), "last", null);
        setField(term939818, term939818.getClass(), "propListHead", null);
        setIntField(term939818, term939818.getClass(), "sourcePosition", 0);
        setField(term939818, term939818.getClass(), "jsType", null);
        setField(term939818, term939818.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term939623;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term939531, args);
        assertTrue(recursiveEquals(term939531, term939866));
        assertTrue(recursiveEquals(term939623, term939867));
        assertTrue(recursiveEquals(retValue, term939818));
    }

};


