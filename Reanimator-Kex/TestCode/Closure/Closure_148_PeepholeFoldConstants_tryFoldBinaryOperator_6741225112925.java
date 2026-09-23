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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term856093;
     Object term856163;
     Object term857024;
     Object term857025;
     Object term856911;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term856093 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term856163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term856253 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term856345 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term856431 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term856345, term856345.getClass(), "type", 64);
        setField(term856253, term856253.getClass(), "next", term856345);
        setIntField(term856253, term856253.getClass(), "type", 0);
        setField(term856163, term856163.getClass(), "first", term856253);
        setIntField(term856163, term856163.getClass(), "type", 101);
        setField(term856163, term856163.getClass(), "parent", term856431);
        term857024 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term857024, term857024.getClass(), "currentTraversal", null);
        term857025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857026 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term857027 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term857028 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term857025, term857025.getClass(), "type", 101);
        setField(term857025, term857025.getClass(), "next", null);
        setIntField(term857026, term857026.getClass(), "encodedSourceStart", 0);
        setIntField(term857026, term857026.getClass(), "encodedSourceEnd", 0);
        setField(term857026, term857026.getClass(), "sourceName", null);
        setIntField(term857026, term857026.getClass(), "baseLineno", 0);
        setIntField(term857026, term857026.getClass(), "endLineno", 0);
        setField(term857026, term857026.getClass(), "functions", null);
        setField(term857026, term857026.getClass(), "regexps", null);
        setField(term857026, term857026.getClass(), "itsVariables", null);
        setField(term857026, term857026.getClass(), "itsConst", null);
        setField(term857026, term857026.getClass(), "itsVariableNames", null);
        setIntField(term857026, term857026.getClass(), "varStart", 0);
        setField(term857026, term857026.getClass(), "compilerData", null);
        setIntField(term857026, term857026.getClass(), "type", 0);
        setDoubleField(term857027, term857027.getClass(), "number", 0.0);
        setIntField(term857027, term857027.getClass(), "type", 64);
        setField(term857027, term857027.getClass(), "next", null);
        setField(term857027, term857027.getClass(), "first", null);
        setField(term857027, term857027.getClass(), "last", null);
        setField(term857027, term857027.getClass(), "propListHead", null);
        setIntField(term857027, term857027.getClass(), "sourcePosition", 0);
        setField(term857027, term857027.getClass(), "jsType", null);
        setField(term857027, term857027.getClass(), "parent", null);
        setField(term857026, term857026.getClass(), "next", term857027);
        setField(term857026, term857026.getClass(), "first", null);
        setField(term857026, term857026.getClass(), "last", null);
        setField(term857026, term857026.getClass(), "propListHead", null);
        setIntField(term857026, term857026.getClass(), "sourcePosition", 0);
        setField(term857026, term857026.getClass(), "jsType", null);
        setField(term857026, term857026.getClass(), "parent", null);
        setField(term857025, term857025.getClass(), "first", term857026);
        setField(term857025, term857025.getClass(), "last", null);
        setField(term857025, term857025.getClass(), "propListHead", null);
        setIntField(term857025, term857025.getClass(), "sourcePosition", 0);
        setField(term857025, term857025.getClass(), "jsType", null);
        setField(term857028, term857028.getClass(), "functionName", null);
        setBooleanField(term857028, term857028.getClass(), "itsNeedsActivation", false);
        setIntField(term857028, term857028.getClass(), "itsFunctionType", 0);
        setBooleanField(term857028, term857028.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term857028, term857028.getClass(), "encodedSourceStart", 0);
        setIntField(term857028, term857028.getClass(), "encodedSourceEnd", 0);
        setField(term857028, term857028.getClass(), "sourceName", null);
        setIntField(term857028, term857028.getClass(), "baseLineno", 0);
        setIntField(term857028, term857028.getClass(), "endLineno", 0);
        setField(term857028, term857028.getClass(), "functions", null);
        setField(term857028, term857028.getClass(), "regexps", null);
        setField(term857028, term857028.getClass(), "itsVariables", null);
        setField(term857028, term857028.getClass(), "itsConst", null);
        setField(term857028, term857028.getClass(), "itsVariableNames", null);
        setIntField(term857028, term857028.getClass(), "varStart", 0);
        setField(term857028, term857028.getClass(), "compilerData", null);
        setIntField(term857028, term857028.getClass(), "type", 0);
        setField(term857028, term857028.getClass(), "next", null);
        setField(term857028, term857028.getClass(), "first", null);
        setField(term857028, term857028.getClass(), "last", null);
        setField(term857028, term857028.getClass(), "propListHead", null);
        setIntField(term857028, term857028.getClass(), "sourcePosition", 0);
        setField(term857028, term857028.getClass(), "jsType", null);
        setField(term857028, term857028.getClass(), "parent", null);
        setField(term857025, term857025.getClass(), "parent", term857028);
        term856911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term856913 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term856920 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term856926 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term856911, term856911.getClass(), "type", 101);
        setField(term856911, term856911.getClass(), "next", null);
        setIntField(term856913, term856913.getClass(), "encodedSourceStart", 0);
        setIntField(term856913, term856913.getClass(), "encodedSourceEnd", 0);
        setField(term856913, term856913.getClass(), "sourceName", null);
        setIntField(term856913, term856913.getClass(), "baseLineno", 0);
        setIntField(term856913, term856913.getClass(), "endLineno", 0);
        setField(term856913, term856913.getClass(), "functions", null);
        setField(term856913, term856913.getClass(), "regexps", null);
        setField(term856913, term856913.getClass(), "itsVariables", null);
        setField(term856913, term856913.getClass(), "itsConst", null);
        setField(term856913, term856913.getClass(), "itsVariableNames", null);
        setIntField(term856913, term856913.getClass(), "varStart", 0);
        setField(term856913, term856913.getClass(), "compilerData", null);
        setIntField(term856913, term856913.getClass(), "type", 0);
        setDoubleField(term856920, term856920.getClass(), "number", 0.0);
        setIntField(term856920, term856920.getClass(), "type", 64);
        setField(term856920, term856920.getClass(), "next", null);
        setField(term856920, term856920.getClass(), "first", null);
        setField(term856920, term856920.getClass(), "last", null);
        setField(term856920, term856920.getClass(), "propListHead", null);
        setIntField(term856920, term856920.getClass(), "sourcePosition", 0);
        setField(term856920, term856920.getClass(), "jsType", null);
        setField(term856920, term856920.getClass(), "parent", null);
        setField(term856913, term856913.getClass(), "next", term856920);
        setField(term856913, term856913.getClass(), "first", null);
        setField(term856913, term856913.getClass(), "last", null);
        setField(term856913, term856913.getClass(), "propListHead", null);
        setIntField(term856913, term856913.getClass(), "sourcePosition", 0);
        setField(term856913, term856913.getClass(), "jsType", null);
        setField(term856913, term856913.getClass(), "parent", null);
        setField(term856911, term856911.getClass(), "first", term856913);
        setField(term856911, term856911.getClass(), "last", null);
        setField(term856911, term856911.getClass(), "propListHead", null);
        setIntField(term856911, term856911.getClass(), "sourcePosition", 0);
        setField(term856911, term856911.getClass(), "jsType", null);
        setField(term856926, term856926.getClass(), "functionName", null);
        setBooleanField(term856926, term856926.getClass(), "itsNeedsActivation", false);
        setIntField(term856926, term856926.getClass(), "itsFunctionType", 0);
        setBooleanField(term856926, term856926.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term856926, term856926.getClass(), "encodedSourceStart", 0);
        setIntField(term856926, term856926.getClass(), "encodedSourceEnd", 0);
        setField(term856926, term856926.getClass(), "sourceName", null);
        setIntField(term856926, term856926.getClass(), "baseLineno", 0);
        setIntField(term856926, term856926.getClass(), "endLineno", 0);
        setField(term856926, term856926.getClass(), "functions", null);
        setField(term856926, term856926.getClass(), "regexps", null);
        setField(term856926, term856926.getClass(), "itsVariables", null);
        setField(term856926, term856926.getClass(), "itsConst", null);
        setField(term856926, term856926.getClass(), "itsVariableNames", null);
        setIntField(term856926, term856926.getClass(), "varStart", 0);
        setField(term856926, term856926.getClass(), "compilerData", null);
        setIntField(term856926, term856926.getClass(), "type", 0);
        setField(term856926, term856926.getClass(), "next", null);
        setField(term856926, term856926.getClass(), "first", null);
        setField(term856926, term856926.getClass(), "last", null);
        setField(term856926, term856926.getClass(), "propListHead", null);
        setIntField(term856926, term856926.getClass(), "sourcePosition", 0);
        setField(term856926, term856926.getClass(), "jsType", null);
        setField(term856926, term856926.getClass(), "parent", null);
        setField(term856911, term856911.getClass(), "parent", term856926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term856163;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term856093, args);
        assertTrue(recursiveEquals(term856093, term857024));
        assertTrue(recursiveEquals(term856163, term857025));
        assertTrue(recursiveEquals(retValue, term856911));
    }

};


