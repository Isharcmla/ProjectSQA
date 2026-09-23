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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402285;
     Object term402377;
     Object term420897;
     Object term420898;
     Object term420808;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402285 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term402377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term402467 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term402553 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term402467, term402467.getClass(), "next", term402553);
        setIntField(term402467, term402467.getClass(), "type", 0);
        setField(term402377, term402377.getClass(), "first", term402467);
        setIntField(term402377, term402377.getClass(), "type", 100);
        setField(term402377, term402377.getClass(), "parent", null);
        term420897 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term420897, term420897.getClass(), "currentTraversal", null);
        term420898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420899 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term420900 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term420898, term420898.getClass(), "number", 0.0);
        setIntField(term420898, term420898.getClass(), "type", 100);
        setField(term420898, term420898.getClass(), "next", null);
        setIntField(term420899, term420899.getClass(), "encodedSourceStart", 0);
        setIntField(term420899, term420899.getClass(), "encodedSourceEnd", 0);
        setField(term420899, term420899.getClass(), "sourceName", null);
        setIntField(term420899, term420899.getClass(), "baseLineno", 0);
        setIntField(term420899, term420899.getClass(), "endLineno", 0);
        setField(term420899, term420899.getClass(), "functions", null);
        setField(term420899, term420899.getClass(), "regexps", null);
        setField(term420899, term420899.getClass(), "itsVariables", null);
        setField(term420899, term420899.getClass(), "itsConst", null);
        setField(term420899, term420899.getClass(), "itsVariableNames", null);
        setIntField(term420899, term420899.getClass(), "varStart", 0);
        setField(term420899, term420899.getClass(), "compilerData", null);
        setIntField(term420899, term420899.getClass(), "type", 0);
        setField(term420900, term420900.getClass(), "functionName", null);
        setBooleanField(term420900, term420900.getClass(), "itsNeedsActivation", false);
        setIntField(term420900, term420900.getClass(), "itsFunctionType", 0);
        setBooleanField(term420900, term420900.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term420900, term420900.getClass(), "encodedSourceStart", 0);
        setIntField(term420900, term420900.getClass(), "encodedSourceEnd", 0);
        setField(term420900, term420900.getClass(), "sourceName", null);
        setIntField(term420900, term420900.getClass(), "baseLineno", 0);
        setIntField(term420900, term420900.getClass(), "endLineno", 0);
        setField(term420900, term420900.getClass(), "functions", null);
        setField(term420900, term420900.getClass(), "regexps", null);
        setField(term420900, term420900.getClass(), "itsVariables", null);
        setField(term420900, term420900.getClass(), "itsConst", null);
        setField(term420900, term420900.getClass(), "itsVariableNames", null);
        setIntField(term420900, term420900.getClass(), "varStart", 0);
        setField(term420900, term420900.getClass(), "compilerData", null);
        setIntField(term420900, term420900.getClass(), "type", 0);
        setField(term420900, term420900.getClass(), "next", null);
        setField(term420900, term420900.getClass(), "first", null);
        setField(term420900, term420900.getClass(), "last", null);
        setField(term420900, term420900.getClass(), "propListHead", null);
        setIntField(term420900, term420900.getClass(), "sourcePosition", 0);
        setField(term420900, term420900.getClass(), "jsType", null);
        setField(term420900, term420900.getClass(), "parent", null);
        setField(term420899, term420899.getClass(), "next", term420900);
        setField(term420899, term420899.getClass(), "first", null);
        setField(term420899, term420899.getClass(), "last", null);
        setField(term420899, term420899.getClass(), "propListHead", null);
        setIntField(term420899, term420899.getClass(), "sourcePosition", 0);
        setField(term420899, term420899.getClass(), "jsType", null);
        setField(term420899, term420899.getClass(), "parent", null);
        setField(term420898, term420898.getClass(), "first", term420899);
        setField(term420898, term420898.getClass(), "last", null);
        setField(term420898, term420898.getClass(), "propListHead", null);
        setIntField(term420898, term420898.getClass(), "sourcePosition", 0);
        setField(term420898, term420898.getClass(), "jsType", null);
        setField(term420898, term420898.getClass(), "parent", null);
        term420808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420811 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term420818 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term420808, term420808.getClass(), "number", 0.0);
        setIntField(term420808, term420808.getClass(), "type", 100);
        setField(term420808, term420808.getClass(), "next", null);
        setIntField(term420811, term420811.getClass(), "encodedSourceStart", 0);
        setIntField(term420811, term420811.getClass(), "encodedSourceEnd", 0);
        setField(term420811, term420811.getClass(), "sourceName", null);
        setIntField(term420811, term420811.getClass(), "baseLineno", 0);
        setIntField(term420811, term420811.getClass(), "endLineno", 0);
        setField(term420811, term420811.getClass(), "functions", null);
        setField(term420811, term420811.getClass(), "regexps", null);
        setField(term420811, term420811.getClass(), "itsVariables", null);
        setField(term420811, term420811.getClass(), "itsConst", null);
        setField(term420811, term420811.getClass(), "itsVariableNames", null);
        setIntField(term420811, term420811.getClass(), "varStart", 0);
        setField(term420811, term420811.getClass(), "compilerData", null);
        setIntField(term420811, term420811.getClass(), "type", 0);
        setField(term420818, term420818.getClass(), "functionName", null);
        setBooleanField(term420818, term420818.getClass(), "itsNeedsActivation", false);
        setIntField(term420818, term420818.getClass(), "itsFunctionType", 0);
        setBooleanField(term420818, term420818.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term420818, term420818.getClass(), "encodedSourceStart", 0);
        setIntField(term420818, term420818.getClass(), "encodedSourceEnd", 0);
        setField(term420818, term420818.getClass(), "sourceName", null);
        setIntField(term420818, term420818.getClass(), "baseLineno", 0);
        setIntField(term420818, term420818.getClass(), "endLineno", 0);
        setField(term420818, term420818.getClass(), "functions", null);
        setField(term420818, term420818.getClass(), "regexps", null);
        setField(term420818, term420818.getClass(), "itsVariables", null);
        setField(term420818, term420818.getClass(), "itsConst", null);
        setField(term420818, term420818.getClass(), "itsVariableNames", null);
        setIntField(term420818, term420818.getClass(), "varStart", 0);
        setField(term420818, term420818.getClass(), "compilerData", null);
        setIntField(term420818, term420818.getClass(), "type", 0);
        setField(term420818, term420818.getClass(), "next", null);
        setField(term420818, term420818.getClass(), "first", null);
        setField(term420818, term420818.getClass(), "last", null);
        setField(term420818, term420818.getClass(), "propListHead", null);
        setIntField(term420818, term420818.getClass(), "sourcePosition", 0);
        setField(term420818, term420818.getClass(), "jsType", null);
        setField(term420818, term420818.getClass(), "parent", null);
        setField(term420811, term420811.getClass(), "next", term420818);
        setField(term420811, term420811.getClass(), "first", null);
        setField(term420811, term420811.getClass(), "last", null);
        setField(term420811, term420811.getClass(), "propListHead", null);
        setIntField(term420811, term420811.getClass(), "sourcePosition", 0);
        setField(term420811, term420811.getClass(), "jsType", null);
        setField(term420811, term420811.getClass(), "parent", null);
        setField(term420808, term420808.getClass(), "first", term420811);
        setField(term420808, term420808.getClass(), "last", null);
        setField(term420808, term420808.getClass(), "propListHead", null);
        setIntField(term420808, term420808.getClass(), "sourcePosition", 0);
        setField(term420808, term420808.getClass(), "jsType", null);
        setField(term420808, term420808.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term402377;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term402285, args);
        assertTrue(recursiveEquals(term402285, term420897));
        assertTrue(recursiveEquals(term402377, term420898));
        assertTrue(recursiveEquals(retValue, term420808));
    }

};


