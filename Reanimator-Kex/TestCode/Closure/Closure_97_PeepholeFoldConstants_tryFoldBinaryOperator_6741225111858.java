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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715402;
     Object term715494;
     Object term715757;
     Object term715758;
     Object term715700;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715402 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term715494 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715586 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715672 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term715586, term715586.getClass(), "next", term715672);
        setIntField(term715586, term715586.getClass(), "type", 39);
        setField(term715494, term715494.getClass(), "first", term715586);
        setIntField(term715494, term715494.getClass(), "type", 19);
        term715757 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term715757, term715757.getClass(), "currentTraversal", null);
        term715758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715760 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term715758, term715758.getClass(), "number", 0.0);
        setIntField(term715758, term715758.getClass(), "type", 19);
        setField(term715758, term715758.getClass(), "next", null);
        setDoubleField(term715759, term715759.getClass(), "number", 0.0);
        setIntField(term715759, term715759.getClass(), "type", 39);
        setField(term715760, term715760.getClass(), "functionName", null);
        setBooleanField(term715760, term715760.getClass(), "itsNeedsActivation", false);
        setIntField(term715760, term715760.getClass(), "itsFunctionType", 0);
        setBooleanField(term715760, term715760.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term715760, term715760.getClass(), "encodedSourceStart", 0);
        setIntField(term715760, term715760.getClass(), "encodedSourceEnd", 0);
        setField(term715760, term715760.getClass(), "sourceName", null);
        setIntField(term715760, term715760.getClass(), "baseLineno", 0);
        setIntField(term715760, term715760.getClass(), "endLineno", 0);
        setField(term715760, term715760.getClass(), "functions", null);
        setField(term715760, term715760.getClass(), "regexps", null);
        setField(term715760, term715760.getClass(), "itsVariables", null);
        setField(term715760, term715760.getClass(), "itsConst", null);
        setField(term715760, term715760.getClass(), "itsVariableNames", null);
        setIntField(term715760, term715760.getClass(), "varStart", 0);
        setField(term715760, term715760.getClass(), "compilerData", null);
        setIntField(term715760, term715760.getClass(), "type", 0);
        setField(term715760, term715760.getClass(), "next", null);
        setField(term715760, term715760.getClass(), "first", null);
        setField(term715760, term715760.getClass(), "last", null);
        setField(term715760, term715760.getClass(), "propListHead", null);
        setIntField(term715760, term715760.getClass(), "sourcePosition", 0);
        setField(term715760, term715760.getClass(), "jsType", null);
        setField(term715760, term715760.getClass(), "parent", null);
        setField(term715759, term715759.getClass(), "next", term715760);
        setField(term715759, term715759.getClass(), "first", null);
        setField(term715759, term715759.getClass(), "last", null);
        setField(term715759, term715759.getClass(), "propListHead", null);
        setIntField(term715759, term715759.getClass(), "sourcePosition", 0);
        setField(term715759, term715759.getClass(), "jsType", null);
        setField(term715759, term715759.getClass(), "parent", null);
        setField(term715758, term715758.getClass(), "first", term715759);
        setField(term715758, term715758.getClass(), "last", null);
        setField(term715758, term715758.getClass(), "propListHead", null);
        setIntField(term715758, term715758.getClass(), "sourcePosition", 0);
        setField(term715758, term715758.getClass(), "jsType", null);
        setField(term715758, term715758.getClass(), "parent", null);
        term715700 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715703 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715706 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term715700, term715700.getClass(), "number", 0.0);
        setIntField(term715700, term715700.getClass(), "type", 19);
        setField(term715700, term715700.getClass(), "next", null);
        setDoubleField(term715703, term715703.getClass(), "number", 0.0);
        setIntField(term715703, term715703.getClass(), "type", 39);
        setField(term715706, term715706.getClass(), "functionName", null);
        setBooleanField(term715706, term715706.getClass(), "itsNeedsActivation", false);
        setIntField(term715706, term715706.getClass(), "itsFunctionType", 0);
        setBooleanField(term715706, term715706.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term715706, term715706.getClass(), "encodedSourceStart", 0);
        setIntField(term715706, term715706.getClass(), "encodedSourceEnd", 0);
        setField(term715706, term715706.getClass(), "sourceName", null);
        setIntField(term715706, term715706.getClass(), "baseLineno", 0);
        setIntField(term715706, term715706.getClass(), "endLineno", 0);
        setField(term715706, term715706.getClass(), "functions", null);
        setField(term715706, term715706.getClass(), "regexps", null);
        setField(term715706, term715706.getClass(), "itsVariables", null);
        setField(term715706, term715706.getClass(), "itsConst", null);
        setField(term715706, term715706.getClass(), "itsVariableNames", null);
        setIntField(term715706, term715706.getClass(), "varStart", 0);
        setField(term715706, term715706.getClass(), "compilerData", null);
        setIntField(term715706, term715706.getClass(), "type", 0);
        setField(term715706, term715706.getClass(), "next", null);
        setField(term715706, term715706.getClass(), "first", null);
        setField(term715706, term715706.getClass(), "last", null);
        setField(term715706, term715706.getClass(), "propListHead", null);
        setIntField(term715706, term715706.getClass(), "sourcePosition", 0);
        setField(term715706, term715706.getClass(), "jsType", null);
        setField(term715706, term715706.getClass(), "parent", null);
        setField(term715703, term715703.getClass(), "next", term715706);
        setField(term715703, term715703.getClass(), "first", null);
        setField(term715703, term715703.getClass(), "last", null);
        setField(term715703, term715703.getClass(), "propListHead", null);
        setIntField(term715703, term715703.getClass(), "sourcePosition", 0);
        setField(term715703, term715703.getClass(), "jsType", null);
        setField(term715703, term715703.getClass(), "parent", null);
        setField(term715700, term715700.getClass(), "first", term715703);
        setField(term715700, term715700.getClass(), "last", null);
        setField(term715700, term715700.getClass(), "propListHead", null);
        setIntField(term715700, term715700.getClass(), "sourcePosition", 0);
        setField(term715700, term715700.getClass(), "jsType", null);
        setField(term715700, term715700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term715494;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term715402, args);
        assertTrue(recursiveEquals(term715402, term715757));
        assertTrue(recursiveEquals(term715494, term715758));
        assertTrue(recursiveEquals(retValue, term715700));
    }

};


