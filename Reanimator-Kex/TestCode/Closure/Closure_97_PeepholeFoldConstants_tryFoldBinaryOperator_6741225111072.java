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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333268;
     Object term333360;
     Object term333604;
     Object term333605;
     Object term333554;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term333360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term333452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term333542 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term333452, term333452.getClass(), "next", term333542);
        setIntField(term333452, term333452.getClass(), "type", 39);
        setField(term333360, term333360.getClass(), "first", term333452);
        setIntField(term333360, term333360.getClass(), "type", 9);
        term333604 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term333604, term333604.getClass(), "currentTraversal", null);
        term333605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term333606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term333607 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term333605, term333605.getClass(), "str", null);
        setIntField(term333605, term333605.getClass(), "type", 9);
        setField(term333605, term333605.getClass(), "next", null);
        setField(term333606, term333606.getClass(), "str", null);
        setIntField(term333606, term333606.getClass(), "type", 39);
        setIntField(term333607, term333607.getClass(), "encodedSourceStart", 0);
        setIntField(term333607, term333607.getClass(), "encodedSourceEnd", 0);
        setField(term333607, term333607.getClass(), "sourceName", null);
        setIntField(term333607, term333607.getClass(), "baseLineno", 0);
        setIntField(term333607, term333607.getClass(), "endLineno", 0);
        setField(term333607, term333607.getClass(), "functions", null);
        setField(term333607, term333607.getClass(), "regexps", null);
        setField(term333607, term333607.getClass(), "itsVariables", null);
        setField(term333607, term333607.getClass(), "itsConst", null);
        setField(term333607, term333607.getClass(), "itsVariableNames", null);
        setIntField(term333607, term333607.getClass(), "varStart", 0);
        setField(term333607, term333607.getClass(), "compilerData", null);
        setIntField(term333607, term333607.getClass(), "type", 0);
        setField(term333607, term333607.getClass(), "next", null);
        setField(term333607, term333607.getClass(), "first", null);
        setField(term333607, term333607.getClass(), "last", null);
        setField(term333607, term333607.getClass(), "propListHead", null);
        setIntField(term333607, term333607.getClass(), "sourcePosition", 0);
        setField(term333607, term333607.getClass(), "jsType", null);
        setField(term333607, term333607.getClass(), "parent", null);
        setField(term333606, term333606.getClass(), "next", term333607);
        setField(term333606, term333606.getClass(), "first", null);
        setField(term333606, term333606.getClass(), "last", null);
        setField(term333606, term333606.getClass(), "propListHead", null);
        setIntField(term333606, term333606.getClass(), "sourcePosition", 0);
        setField(term333606, term333606.getClass(), "jsType", null);
        setField(term333606, term333606.getClass(), "parent", null);
        setField(term333605, term333605.getClass(), "first", term333606);
        setField(term333605, term333605.getClass(), "last", null);
        setField(term333605, term333605.getClass(), "propListHead", null);
        setIntField(term333605, term333605.getClass(), "sourcePosition", 0);
        setField(term333605, term333605.getClass(), "jsType", null);
        setField(term333605, term333605.getClass(), "parent", null);
        term333554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term333556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term333558 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term333554, term333554.getClass(), "str", null);
        setIntField(term333554, term333554.getClass(), "type", 9);
        setField(term333554, term333554.getClass(), "next", null);
        setField(term333556, term333556.getClass(), "str", null);
        setIntField(term333556, term333556.getClass(), "type", 39);
        setIntField(term333558, term333558.getClass(), "encodedSourceStart", 0);
        setIntField(term333558, term333558.getClass(), "encodedSourceEnd", 0);
        setField(term333558, term333558.getClass(), "sourceName", null);
        setIntField(term333558, term333558.getClass(), "baseLineno", 0);
        setIntField(term333558, term333558.getClass(), "endLineno", 0);
        setField(term333558, term333558.getClass(), "functions", null);
        setField(term333558, term333558.getClass(), "regexps", null);
        setField(term333558, term333558.getClass(), "itsVariables", null);
        setField(term333558, term333558.getClass(), "itsConst", null);
        setField(term333558, term333558.getClass(), "itsVariableNames", null);
        setIntField(term333558, term333558.getClass(), "varStart", 0);
        setField(term333558, term333558.getClass(), "compilerData", null);
        setIntField(term333558, term333558.getClass(), "type", 0);
        setField(term333558, term333558.getClass(), "next", null);
        setField(term333558, term333558.getClass(), "first", null);
        setField(term333558, term333558.getClass(), "last", null);
        setField(term333558, term333558.getClass(), "propListHead", null);
        setIntField(term333558, term333558.getClass(), "sourcePosition", 0);
        setField(term333558, term333558.getClass(), "jsType", null);
        setField(term333558, term333558.getClass(), "parent", null);
        setField(term333556, term333556.getClass(), "next", term333558);
        setField(term333556, term333556.getClass(), "first", null);
        setField(term333556, term333556.getClass(), "last", null);
        setField(term333556, term333556.getClass(), "propListHead", null);
        setIntField(term333556, term333556.getClass(), "sourcePosition", 0);
        setField(term333556, term333556.getClass(), "jsType", null);
        setField(term333556, term333556.getClass(), "parent", null);
        setField(term333554, term333554.getClass(), "first", term333556);
        setField(term333554, term333554.getClass(), "last", null);
        setField(term333554, term333554.getClass(), "propListHead", null);
        setIntField(term333554, term333554.getClass(), "sourcePosition", 0);
        setField(term333554, term333554.getClass(), "jsType", null);
        setField(term333554, term333554.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term333360;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term333268, args);
        assertTrue(recursiveEquals(term333268, term333604));
        assertTrue(recursiveEquals(term333360, term333605));
        assertTrue(recursiveEquals(retValue, term333554));
    }

};


