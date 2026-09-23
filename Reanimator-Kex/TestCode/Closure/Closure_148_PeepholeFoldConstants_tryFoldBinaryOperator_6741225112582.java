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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732073;
     Object term732165;
     Object term732543;
     Object term732544;
     Object term732458;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term732165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term732255 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term732347 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term732439 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term732347, term732347.getClass(), "type", 64);
        setField(term732255, term732255.getClass(), "next", term732347);
        setIntField(term732255, term732255.getClass(), "type", 0);
        setField(term732165, term732165.getClass(), "first", term732255);
        setIntField(term732165, term732165.getClass(), "type", 101);
        setField(term732165, term732165.getClass(), "parent", term732439);
        term732543 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term732543, term732543.getClass(), "currentTraversal", null);
        term732544 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term732545 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term732546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term732547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term732544, term732544.getClass(), "str", null);
        setIntField(term732544, term732544.getClass(), "type", 101);
        setField(term732544, term732544.getClass(), "next", null);
        setIntField(term732545, term732545.getClass(), "encodedSourceStart", 0);
        setIntField(term732545, term732545.getClass(), "encodedSourceEnd", 0);
        setField(term732545, term732545.getClass(), "sourceName", null);
        setIntField(term732545, term732545.getClass(), "baseLineno", 0);
        setIntField(term732545, term732545.getClass(), "endLineno", 0);
        setField(term732545, term732545.getClass(), "functions", null);
        setField(term732545, term732545.getClass(), "regexps", null);
        setField(term732545, term732545.getClass(), "itsVariables", null);
        setField(term732545, term732545.getClass(), "itsConst", null);
        setField(term732545, term732545.getClass(), "itsVariableNames", null);
        setIntField(term732545, term732545.getClass(), "varStart", 0);
        setField(term732545, term732545.getClass(), "compilerData", null);
        setIntField(term732545, term732545.getClass(), "type", 0);
        setDoubleField(term732546, term732546.getClass(), "number", 0.0);
        setIntField(term732546, term732546.getClass(), "type", 64);
        setField(term732546, term732546.getClass(), "next", null);
        setField(term732546, term732546.getClass(), "first", null);
        setField(term732546, term732546.getClass(), "last", null);
        setField(term732546, term732546.getClass(), "propListHead", null);
        setIntField(term732546, term732546.getClass(), "sourcePosition", 0);
        setField(term732546, term732546.getClass(), "jsType", null);
        setField(term732546, term732546.getClass(), "parent", null);
        setField(term732545, term732545.getClass(), "next", term732546);
        setField(term732545, term732545.getClass(), "first", null);
        setField(term732545, term732545.getClass(), "last", null);
        setField(term732545, term732545.getClass(), "propListHead", null);
        setIntField(term732545, term732545.getClass(), "sourcePosition", 0);
        setField(term732545, term732545.getClass(), "jsType", null);
        setField(term732545, term732545.getClass(), "parent", null);
        setField(term732544, term732544.getClass(), "first", term732545);
        setField(term732544, term732544.getClass(), "last", null);
        setField(term732544, term732544.getClass(), "propListHead", null);
        setIntField(term732544, term732544.getClass(), "sourcePosition", 0);
        setField(term732544, term732544.getClass(), "jsType", null);
        setDoubleField(term732547, term732547.getClass(), "number", 0.0);
        setIntField(term732547, term732547.getClass(), "type", 0);
        setField(term732547, term732547.getClass(), "next", null);
        setField(term732547, term732547.getClass(), "first", null);
        setField(term732547, term732547.getClass(), "last", null);
        setField(term732547, term732547.getClass(), "propListHead", null);
        setIntField(term732547, term732547.getClass(), "sourcePosition", 0);
        setField(term732547, term732547.getClass(), "jsType", null);
        setField(term732547, term732547.getClass(), "parent", null);
        setField(term732544, term732544.getClass(), "parent", term732547);
        term732458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term732460 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term732467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term732473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term732458, term732458.getClass(), "str", null);
        setIntField(term732458, term732458.getClass(), "type", 101);
        setField(term732458, term732458.getClass(), "next", null);
        setIntField(term732460, term732460.getClass(), "encodedSourceStart", 0);
        setIntField(term732460, term732460.getClass(), "encodedSourceEnd", 0);
        setField(term732460, term732460.getClass(), "sourceName", null);
        setIntField(term732460, term732460.getClass(), "baseLineno", 0);
        setIntField(term732460, term732460.getClass(), "endLineno", 0);
        setField(term732460, term732460.getClass(), "functions", null);
        setField(term732460, term732460.getClass(), "regexps", null);
        setField(term732460, term732460.getClass(), "itsVariables", null);
        setField(term732460, term732460.getClass(), "itsConst", null);
        setField(term732460, term732460.getClass(), "itsVariableNames", null);
        setIntField(term732460, term732460.getClass(), "varStart", 0);
        setField(term732460, term732460.getClass(), "compilerData", null);
        setIntField(term732460, term732460.getClass(), "type", 0);
        setDoubleField(term732467, term732467.getClass(), "number", 0.0);
        setIntField(term732467, term732467.getClass(), "type", 64);
        setField(term732467, term732467.getClass(), "next", null);
        setField(term732467, term732467.getClass(), "first", null);
        setField(term732467, term732467.getClass(), "last", null);
        setField(term732467, term732467.getClass(), "propListHead", null);
        setIntField(term732467, term732467.getClass(), "sourcePosition", 0);
        setField(term732467, term732467.getClass(), "jsType", null);
        setField(term732467, term732467.getClass(), "parent", null);
        setField(term732460, term732460.getClass(), "next", term732467);
        setField(term732460, term732460.getClass(), "first", null);
        setField(term732460, term732460.getClass(), "last", null);
        setField(term732460, term732460.getClass(), "propListHead", null);
        setIntField(term732460, term732460.getClass(), "sourcePosition", 0);
        setField(term732460, term732460.getClass(), "jsType", null);
        setField(term732460, term732460.getClass(), "parent", null);
        setField(term732458, term732458.getClass(), "first", term732460);
        setField(term732458, term732458.getClass(), "last", null);
        setField(term732458, term732458.getClass(), "propListHead", null);
        setIntField(term732458, term732458.getClass(), "sourcePosition", 0);
        setField(term732458, term732458.getClass(), "jsType", null);
        setDoubleField(term732473, term732473.getClass(), "number", 0.0);
        setIntField(term732473, term732473.getClass(), "type", 0);
        setField(term732473, term732473.getClass(), "next", null);
        setField(term732473, term732473.getClass(), "first", null);
        setField(term732473, term732473.getClass(), "last", null);
        setField(term732473, term732473.getClass(), "propListHead", null);
        setIntField(term732473, term732473.getClass(), "sourcePosition", 0);
        setField(term732473, term732473.getClass(), "jsType", null);
        setField(term732473, term732473.getClass(), "parent", null);
        setField(term732458, term732458.getClass(), "parent", term732473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term732165;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term732073, args);
        assertTrue(recursiveEquals(term732073, term732543));
        assertTrue(recursiveEquals(term732165, term732544));
        assertTrue(recursiveEquals(retValue, term732458));
    }

};


