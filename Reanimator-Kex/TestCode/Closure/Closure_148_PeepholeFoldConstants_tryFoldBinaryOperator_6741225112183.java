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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595602;
     Object term595692;
     Object term596340;
     Object term596341;
     Object term596285;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term595602 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term595692 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term595778 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term595870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term595778, term595778.getClass(), "next", term595870);
        setIntField(term595778, term595778.getClass(), "type", 39);
        setField(term595692, term595692.getClass(), "first", term595778);
        setIntField(term595692, term595692.getClass(), "type", 19);
        term596340 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term596340, term596340.getClass(), "currentTraversal", null);
        term596341 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term596342 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term596343 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term596341, term596341.getClass(), "encodedSourceStart", 0);
        setIntField(term596341, term596341.getClass(), "encodedSourceEnd", 0);
        setField(term596341, term596341.getClass(), "sourceName", null);
        setIntField(term596341, term596341.getClass(), "baseLineno", 0);
        setIntField(term596341, term596341.getClass(), "endLineno", 0);
        setField(term596341, term596341.getClass(), "functions", null);
        setField(term596341, term596341.getClass(), "regexps", null);
        setField(term596341, term596341.getClass(), "itsVariables", null);
        setField(term596341, term596341.getClass(), "itsConst", null);
        setField(term596341, term596341.getClass(), "itsVariableNames", null);
        setIntField(term596341, term596341.getClass(), "varStart", 0);
        setField(term596341, term596341.getClass(), "compilerData", null);
        setIntField(term596341, term596341.getClass(), "type", 19);
        setField(term596341, term596341.getClass(), "next", null);
        setField(term596342, term596342.getClass(), "functionName", null);
        setBooleanField(term596342, term596342.getClass(), "itsNeedsActivation", false);
        setIntField(term596342, term596342.getClass(), "itsFunctionType", 0);
        setBooleanField(term596342, term596342.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term596342, term596342.getClass(), "encodedSourceStart", 0);
        setIntField(term596342, term596342.getClass(), "encodedSourceEnd", 0);
        setField(term596342, term596342.getClass(), "sourceName", null);
        setIntField(term596342, term596342.getClass(), "baseLineno", 0);
        setIntField(term596342, term596342.getClass(), "endLineno", 0);
        setField(term596342, term596342.getClass(), "functions", null);
        setField(term596342, term596342.getClass(), "regexps", null);
        setField(term596342, term596342.getClass(), "itsVariables", null);
        setField(term596342, term596342.getClass(), "itsConst", null);
        setField(term596342, term596342.getClass(), "itsVariableNames", null);
        setIntField(term596342, term596342.getClass(), "varStart", 0);
        setField(term596342, term596342.getClass(), "compilerData", null);
        setIntField(term596342, term596342.getClass(), "type", 39);
        setField(term596343, term596343.getClass(), "str", null);
        setIntField(term596343, term596343.getClass(), "type", 0);
        setField(term596343, term596343.getClass(), "next", null);
        setField(term596343, term596343.getClass(), "first", null);
        setField(term596343, term596343.getClass(), "last", null);
        setField(term596343, term596343.getClass(), "propListHead", null);
        setIntField(term596343, term596343.getClass(), "sourcePosition", 0);
        setField(term596343, term596343.getClass(), "jsType", null);
        setField(term596343, term596343.getClass(), "parent", null);
        setField(term596342, term596342.getClass(), "next", term596343);
        setField(term596342, term596342.getClass(), "first", null);
        setField(term596342, term596342.getClass(), "last", null);
        setField(term596342, term596342.getClass(), "propListHead", null);
        setIntField(term596342, term596342.getClass(), "sourcePosition", 0);
        setField(term596342, term596342.getClass(), "jsType", null);
        setField(term596342, term596342.getClass(), "parent", null);
        setField(term596341, term596341.getClass(), "first", term596342);
        setField(term596341, term596341.getClass(), "last", null);
        setField(term596341, term596341.getClass(), "propListHead", null);
        setIntField(term596341, term596341.getClass(), "sourcePosition", 0);
        setField(term596341, term596341.getClass(), "jsType", null);
        setField(term596341, term596341.getClass(), "parent", null);
        term596285 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term596292 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term596302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term596285, term596285.getClass(), "encodedSourceStart", 0);
        setIntField(term596285, term596285.getClass(), "encodedSourceEnd", 0);
        setField(term596285, term596285.getClass(), "sourceName", null);
        setIntField(term596285, term596285.getClass(), "baseLineno", 0);
        setIntField(term596285, term596285.getClass(), "endLineno", 0);
        setField(term596285, term596285.getClass(), "functions", null);
        setField(term596285, term596285.getClass(), "regexps", null);
        setField(term596285, term596285.getClass(), "itsVariables", null);
        setField(term596285, term596285.getClass(), "itsConst", null);
        setField(term596285, term596285.getClass(), "itsVariableNames", null);
        setIntField(term596285, term596285.getClass(), "varStart", 0);
        setField(term596285, term596285.getClass(), "compilerData", null);
        setIntField(term596285, term596285.getClass(), "type", 19);
        setField(term596285, term596285.getClass(), "next", null);
        setField(term596292, term596292.getClass(), "functionName", null);
        setBooleanField(term596292, term596292.getClass(), "itsNeedsActivation", false);
        setIntField(term596292, term596292.getClass(), "itsFunctionType", 0);
        setBooleanField(term596292, term596292.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term596292, term596292.getClass(), "encodedSourceStart", 0);
        setIntField(term596292, term596292.getClass(), "encodedSourceEnd", 0);
        setField(term596292, term596292.getClass(), "sourceName", null);
        setIntField(term596292, term596292.getClass(), "baseLineno", 0);
        setIntField(term596292, term596292.getClass(), "endLineno", 0);
        setField(term596292, term596292.getClass(), "functions", null);
        setField(term596292, term596292.getClass(), "regexps", null);
        setField(term596292, term596292.getClass(), "itsVariables", null);
        setField(term596292, term596292.getClass(), "itsConst", null);
        setField(term596292, term596292.getClass(), "itsVariableNames", null);
        setIntField(term596292, term596292.getClass(), "varStart", 0);
        setField(term596292, term596292.getClass(), "compilerData", null);
        setIntField(term596292, term596292.getClass(), "type", 39);
        setField(term596302, term596302.getClass(), "str", null);
        setIntField(term596302, term596302.getClass(), "type", 0);
        setField(term596302, term596302.getClass(), "next", null);
        setField(term596302, term596302.getClass(), "first", null);
        setField(term596302, term596302.getClass(), "last", null);
        setField(term596302, term596302.getClass(), "propListHead", null);
        setIntField(term596302, term596302.getClass(), "sourcePosition", 0);
        setField(term596302, term596302.getClass(), "jsType", null);
        setField(term596302, term596302.getClass(), "parent", null);
        setField(term596292, term596292.getClass(), "next", term596302);
        setField(term596292, term596292.getClass(), "first", null);
        setField(term596292, term596292.getClass(), "last", null);
        setField(term596292, term596292.getClass(), "propListHead", null);
        setIntField(term596292, term596292.getClass(), "sourcePosition", 0);
        setField(term596292, term596292.getClass(), "jsType", null);
        setField(term596292, term596292.getClass(), "parent", null);
        setField(term596285, term596285.getClass(), "first", term596292);
        setField(term596285, term596285.getClass(), "last", null);
        setField(term596285, term596285.getClass(), "propListHead", null);
        setIntField(term596285, term596285.getClass(), "sourcePosition", 0);
        setField(term596285, term596285.getClass(), "jsType", null);
        setField(term596285, term596285.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term595692;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term595602, args);
        assertTrue(recursiveEquals(term595602, term596340));
        assertTrue(recursiveEquals(term595692, term596341));
        assertTrue(recursiveEquals(retValue, term596285));
    }

};


