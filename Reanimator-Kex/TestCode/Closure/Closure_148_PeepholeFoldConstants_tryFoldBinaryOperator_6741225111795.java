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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467456;
     Object term467548;
     Object term468557;
     Object term468558;
     Object term468515;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term467456 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term467548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term467638 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term467548, term467548.getClass(), "first", term467548);
        setField(term467548, term467548.getClass(), "next", term467638);
        setIntField(term467548, term467548.getClass(), "type", 33);
        term468557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term468557, term468557.getClass(), "currentTraversal", null);
        term468558 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term468559 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term468558, term468558.getClass(), "number", 0.0);
        setIntField(term468558, term468558.getClass(), "type", 33);
        setIntField(term468559, term468559.getClass(), "encodedSourceStart", 0);
        setIntField(term468559, term468559.getClass(), "encodedSourceEnd", 0);
        setField(term468559, term468559.getClass(), "sourceName", null);
        setIntField(term468559, term468559.getClass(), "baseLineno", 0);
        setIntField(term468559, term468559.getClass(), "endLineno", 0);
        setField(term468559, term468559.getClass(), "functions", null);
        setField(term468559, term468559.getClass(), "regexps", null);
        setField(term468559, term468559.getClass(), "itsVariables", null);
        setField(term468559, term468559.getClass(), "itsConst", null);
        setField(term468559, term468559.getClass(), "itsVariableNames", null);
        setIntField(term468559, term468559.getClass(), "varStart", 0);
        setField(term468559, term468559.getClass(), "compilerData", null);
        setIntField(term468559, term468559.getClass(), "type", 0);
        setField(term468559, term468559.getClass(), "next", null);
        setField(term468559, term468559.getClass(), "first", null);
        setField(term468559, term468559.getClass(), "last", null);
        setField(term468559, term468559.getClass(), "propListHead", null);
        setIntField(term468559, term468559.getClass(), "sourcePosition", 0);
        setField(term468559, term468559.getClass(), "jsType", null);
        setField(term468559, term468559.getClass(), "parent", null);
        setField(term468558, term468558.getClass(), "next", term468559);
        setField(term468558, term468558.getClass(), "first", term468558);
        setField(term468558, term468558.getClass(), "last", null);
        setField(term468558, term468558.getClass(), "propListHead", null);
        setIntField(term468558, term468558.getClass(), "sourcePosition", 0);
        setField(term468558, term468558.getClass(), "jsType", null);
        setField(term468558, term468558.getClass(), "parent", null);
        term468515 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term468518 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term468515, term468515.getClass(), "number", 0.0);
        setIntField(term468515, term468515.getClass(), "type", 33);
        setIntField(term468518, term468518.getClass(), "encodedSourceStart", 0);
        setIntField(term468518, term468518.getClass(), "encodedSourceEnd", 0);
        setField(term468518, term468518.getClass(), "sourceName", null);
        setIntField(term468518, term468518.getClass(), "baseLineno", 0);
        setIntField(term468518, term468518.getClass(), "endLineno", 0);
        setField(term468518, term468518.getClass(), "functions", null);
        setField(term468518, term468518.getClass(), "regexps", null);
        setField(term468518, term468518.getClass(), "itsVariables", null);
        setField(term468518, term468518.getClass(), "itsConst", null);
        setField(term468518, term468518.getClass(), "itsVariableNames", null);
        setIntField(term468518, term468518.getClass(), "varStart", 0);
        setField(term468518, term468518.getClass(), "compilerData", null);
        setIntField(term468518, term468518.getClass(), "type", 0);
        setField(term468518, term468518.getClass(), "next", null);
        setField(term468518, term468518.getClass(), "first", null);
        setField(term468518, term468518.getClass(), "last", null);
        setField(term468518, term468518.getClass(), "propListHead", null);
        setIntField(term468518, term468518.getClass(), "sourcePosition", 0);
        setField(term468518, term468518.getClass(), "jsType", null);
        setField(term468518, term468518.getClass(), "parent", null);
        setField(term468515, term468515.getClass(), "next", term468518);
        setField(term468515, term468515.getClass(), "first", term468515);
        setField(term468515, term468515.getClass(), "last", null);
        setField(term468515, term468515.getClass(), "propListHead", null);
        setIntField(term468515, term468515.getClass(), "sourcePosition", 0);
        setField(term468515, term468515.getClass(), "jsType", null);
        setField(term468515, term468515.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term467548;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term467456, args);
        assertTrue(recursiveEquals(term467456, term468557));
        assertTrue(recursiveEquals(term467548, term468558));
        assertTrue(recursiveEquals(retValue, term468515));
    }

};


