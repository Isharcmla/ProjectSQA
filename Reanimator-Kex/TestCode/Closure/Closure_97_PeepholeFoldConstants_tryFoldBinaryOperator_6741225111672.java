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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665403;
     Object term665495;
     Object term665845;
     Object term665846;
     Object term665761;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665403 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term665495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term665581 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term665671 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term665581, term665581.getClass(), "next", term665671);
        setIntField(term665581, term665581.getClass(), "type", 0);
        setField(term665495, term665495.getClass(), "first", term665581);
        setIntField(term665495, term665495.getClass(), "type", 100);
        setField(term665495, term665495.getClass(), "parent", null);
        term665845 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term665845, term665845.getClass(), "currentTraversal", null);
        term665846 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term665847 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term665848 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term665846, term665846.getClass(), "str", null);
        setIntField(term665846, term665846.getClass(), "type", 100);
        setField(term665846, term665846.getClass(), "next", null);
        setField(term665847, term665847.getClass(), "functionName", null);
        setBooleanField(term665847, term665847.getClass(), "itsNeedsActivation", false);
        setIntField(term665847, term665847.getClass(), "itsFunctionType", 0);
        setBooleanField(term665847, term665847.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term665847, term665847.getClass(), "encodedSourceStart", 0);
        setIntField(term665847, term665847.getClass(), "encodedSourceEnd", 0);
        setField(term665847, term665847.getClass(), "sourceName", null);
        setIntField(term665847, term665847.getClass(), "baseLineno", 0);
        setIntField(term665847, term665847.getClass(), "endLineno", 0);
        setField(term665847, term665847.getClass(), "functions", null);
        setField(term665847, term665847.getClass(), "regexps", null);
        setField(term665847, term665847.getClass(), "itsVariables", null);
        setField(term665847, term665847.getClass(), "itsConst", null);
        setField(term665847, term665847.getClass(), "itsVariableNames", null);
        setIntField(term665847, term665847.getClass(), "varStart", 0);
        setField(term665847, term665847.getClass(), "compilerData", null);
        setIntField(term665847, term665847.getClass(), "type", 0);
        setIntField(term665848, term665848.getClass(), "encodedSourceStart", 0);
        setIntField(term665848, term665848.getClass(), "encodedSourceEnd", 0);
        setField(term665848, term665848.getClass(), "sourceName", null);
        setIntField(term665848, term665848.getClass(), "baseLineno", 0);
        setIntField(term665848, term665848.getClass(), "endLineno", 0);
        setField(term665848, term665848.getClass(), "functions", null);
        setField(term665848, term665848.getClass(), "regexps", null);
        setField(term665848, term665848.getClass(), "itsVariables", null);
        setField(term665848, term665848.getClass(), "itsConst", null);
        setField(term665848, term665848.getClass(), "itsVariableNames", null);
        setIntField(term665848, term665848.getClass(), "varStart", 0);
        setField(term665848, term665848.getClass(), "compilerData", null);
        setIntField(term665848, term665848.getClass(), "type", 0);
        setField(term665848, term665848.getClass(), "next", null);
        setField(term665848, term665848.getClass(), "first", null);
        setField(term665848, term665848.getClass(), "last", null);
        setField(term665848, term665848.getClass(), "propListHead", null);
        setIntField(term665848, term665848.getClass(), "sourcePosition", 0);
        setField(term665848, term665848.getClass(), "jsType", null);
        setField(term665848, term665848.getClass(), "parent", null);
        setField(term665847, term665847.getClass(), "next", term665848);
        setField(term665847, term665847.getClass(), "first", null);
        setField(term665847, term665847.getClass(), "last", null);
        setField(term665847, term665847.getClass(), "propListHead", null);
        setIntField(term665847, term665847.getClass(), "sourcePosition", 0);
        setField(term665847, term665847.getClass(), "jsType", null);
        setField(term665847, term665847.getClass(), "parent", null);
        setField(term665846, term665846.getClass(), "first", term665847);
        setField(term665846, term665846.getClass(), "last", null);
        setField(term665846, term665846.getClass(), "propListHead", null);
        setIntField(term665846, term665846.getClass(), "sourcePosition", 0);
        setField(term665846, term665846.getClass(), "jsType", null);
        setField(term665846, term665846.getClass(), "parent", null);
        term665761 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term665763 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term665773 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term665761, term665761.getClass(), "str", null);
        setIntField(term665761, term665761.getClass(), "type", 100);
        setField(term665761, term665761.getClass(), "next", null);
        setField(term665763, term665763.getClass(), "functionName", null);
        setBooleanField(term665763, term665763.getClass(), "itsNeedsActivation", false);
        setIntField(term665763, term665763.getClass(), "itsFunctionType", 0);
        setBooleanField(term665763, term665763.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term665763, term665763.getClass(), "encodedSourceStart", 0);
        setIntField(term665763, term665763.getClass(), "encodedSourceEnd", 0);
        setField(term665763, term665763.getClass(), "sourceName", null);
        setIntField(term665763, term665763.getClass(), "baseLineno", 0);
        setIntField(term665763, term665763.getClass(), "endLineno", 0);
        setField(term665763, term665763.getClass(), "functions", null);
        setField(term665763, term665763.getClass(), "regexps", null);
        setField(term665763, term665763.getClass(), "itsVariables", null);
        setField(term665763, term665763.getClass(), "itsConst", null);
        setField(term665763, term665763.getClass(), "itsVariableNames", null);
        setIntField(term665763, term665763.getClass(), "varStart", 0);
        setField(term665763, term665763.getClass(), "compilerData", null);
        setIntField(term665763, term665763.getClass(), "type", 0);
        setIntField(term665773, term665773.getClass(), "encodedSourceStart", 0);
        setIntField(term665773, term665773.getClass(), "encodedSourceEnd", 0);
        setField(term665773, term665773.getClass(), "sourceName", null);
        setIntField(term665773, term665773.getClass(), "baseLineno", 0);
        setIntField(term665773, term665773.getClass(), "endLineno", 0);
        setField(term665773, term665773.getClass(), "functions", null);
        setField(term665773, term665773.getClass(), "regexps", null);
        setField(term665773, term665773.getClass(), "itsVariables", null);
        setField(term665773, term665773.getClass(), "itsConst", null);
        setField(term665773, term665773.getClass(), "itsVariableNames", null);
        setIntField(term665773, term665773.getClass(), "varStart", 0);
        setField(term665773, term665773.getClass(), "compilerData", null);
        setIntField(term665773, term665773.getClass(), "type", 0);
        setField(term665773, term665773.getClass(), "next", null);
        setField(term665773, term665773.getClass(), "first", null);
        setField(term665773, term665773.getClass(), "last", null);
        setField(term665773, term665773.getClass(), "propListHead", null);
        setIntField(term665773, term665773.getClass(), "sourcePosition", 0);
        setField(term665773, term665773.getClass(), "jsType", null);
        setField(term665773, term665773.getClass(), "parent", null);
        setField(term665763, term665763.getClass(), "next", term665773);
        setField(term665763, term665763.getClass(), "first", null);
        setField(term665763, term665763.getClass(), "last", null);
        setField(term665763, term665763.getClass(), "propListHead", null);
        setIntField(term665763, term665763.getClass(), "sourcePosition", 0);
        setField(term665763, term665763.getClass(), "jsType", null);
        setField(term665763, term665763.getClass(), "parent", null);
        setField(term665761, term665761.getClass(), "first", term665763);
        setField(term665761, term665761.getClass(), "last", null);
        setField(term665761, term665761.getClass(), "propListHead", null);
        setIntField(term665761, term665761.getClass(), "sourcePosition", 0);
        setField(term665761, term665761.getClass(), "jsType", null);
        setField(term665761, term665761.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term665495;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term665403, args);
        assertTrue(recursiveEquals(term665403, term665845));
        assertTrue(recursiveEquals(term665495, term665846));
        assertTrue(recursiveEquals(retValue, term665761));
    }

};


