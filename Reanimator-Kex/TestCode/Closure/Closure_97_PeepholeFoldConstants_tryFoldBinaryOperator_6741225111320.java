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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437099;
     Object term437189;
     Object term437441;
     Object term437442;
     Object term437383;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437099 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term437189 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term437275 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term437367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term437275, term437275.getClass(), "next", term437367);
        setIntField(term437275, term437275.getClass(), "type", 39);
        setField(term437189, term437189.getClass(), "first", term437275);
        setIntField(term437189, term437189.getClass(), "type", 22);
        term437441 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term437441, term437441.getClass(), "currentTraversal", null);
        term437442 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term437443 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term437444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term437442, term437442.getClass(), "encodedSourceStart", 0);
        setIntField(term437442, term437442.getClass(), "encodedSourceEnd", 0);
        setField(term437442, term437442.getClass(), "sourceName", null);
        setIntField(term437442, term437442.getClass(), "baseLineno", 0);
        setIntField(term437442, term437442.getClass(), "endLineno", 0);
        setField(term437442, term437442.getClass(), "functions", null);
        setField(term437442, term437442.getClass(), "regexps", null);
        setField(term437442, term437442.getClass(), "itsVariables", null);
        setField(term437442, term437442.getClass(), "itsConst", null);
        setField(term437442, term437442.getClass(), "itsVariableNames", null);
        setIntField(term437442, term437442.getClass(), "varStart", 0);
        setField(term437442, term437442.getClass(), "compilerData", null);
        setIntField(term437442, term437442.getClass(), "type", 22);
        setField(term437442, term437442.getClass(), "next", null);
        setField(term437443, term437443.getClass(), "functionName", null);
        setBooleanField(term437443, term437443.getClass(), "itsNeedsActivation", false);
        setIntField(term437443, term437443.getClass(), "itsFunctionType", 0);
        setBooleanField(term437443, term437443.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term437443, term437443.getClass(), "encodedSourceStart", 0);
        setIntField(term437443, term437443.getClass(), "encodedSourceEnd", 0);
        setField(term437443, term437443.getClass(), "sourceName", null);
        setIntField(term437443, term437443.getClass(), "baseLineno", 0);
        setIntField(term437443, term437443.getClass(), "endLineno", 0);
        setField(term437443, term437443.getClass(), "functions", null);
        setField(term437443, term437443.getClass(), "regexps", null);
        setField(term437443, term437443.getClass(), "itsVariables", null);
        setField(term437443, term437443.getClass(), "itsConst", null);
        setField(term437443, term437443.getClass(), "itsVariableNames", null);
        setIntField(term437443, term437443.getClass(), "varStart", 0);
        setField(term437443, term437443.getClass(), "compilerData", null);
        setIntField(term437443, term437443.getClass(), "type", 39);
        setDoubleField(term437444, term437444.getClass(), "number", 0.0);
        setIntField(term437444, term437444.getClass(), "type", 0);
        setField(term437444, term437444.getClass(), "next", null);
        setField(term437444, term437444.getClass(), "first", null);
        setField(term437444, term437444.getClass(), "last", null);
        setField(term437444, term437444.getClass(), "propListHead", null);
        setIntField(term437444, term437444.getClass(), "sourcePosition", 0);
        setField(term437444, term437444.getClass(), "jsType", null);
        setField(term437444, term437444.getClass(), "parent", null);
        setField(term437443, term437443.getClass(), "next", term437444);
        setField(term437443, term437443.getClass(), "first", null);
        setField(term437443, term437443.getClass(), "last", null);
        setField(term437443, term437443.getClass(), "propListHead", null);
        setIntField(term437443, term437443.getClass(), "sourcePosition", 0);
        setField(term437443, term437443.getClass(), "jsType", null);
        setField(term437443, term437443.getClass(), "parent", null);
        setField(term437442, term437442.getClass(), "first", term437443);
        setField(term437442, term437442.getClass(), "last", null);
        setField(term437442, term437442.getClass(), "propListHead", null);
        setIntField(term437442, term437442.getClass(), "sourcePosition", 0);
        setField(term437442, term437442.getClass(), "jsType", null);
        setField(term437442, term437442.getClass(), "parent", null);
        term437383 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term437390 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term437400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term437383, term437383.getClass(), "encodedSourceStart", 0);
        setIntField(term437383, term437383.getClass(), "encodedSourceEnd", 0);
        setField(term437383, term437383.getClass(), "sourceName", null);
        setIntField(term437383, term437383.getClass(), "baseLineno", 0);
        setIntField(term437383, term437383.getClass(), "endLineno", 0);
        setField(term437383, term437383.getClass(), "functions", null);
        setField(term437383, term437383.getClass(), "regexps", null);
        setField(term437383, term437383.getClass(), "itsVariables", null);
        setField(term437383, term437383.getClass(), "itsConst", null);
        setField(term437383, term437383.getClass(), "itsVariableNames", null);
        setIntField(term437383, term437383.getClass(), "varStart", 0);
        setField(term437383, term437383.getClass(), "compilerData", null);
        setIntField(term437383, term437383.getClass(), "type", 22);
        setField(term437383, term437383.getClass(), "next", null);
        setField(term437390, term437390.getClass(), "functionName", null);
        setBooleanField(term437390, term437390.getClass(), "itsNeedsActivation", false);
        setIntField(term437390, term437390.getClass(), "itsFunctionType", 0);
        setBooleanField(term437390, term437390.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term437390, term437390.getClass(), "encodedSourceStart", 0);
        setIntField(term437390, term437390.getClass(), "encodedSourceEnd", 0);
        setField(term437390, term437390.getClass(), "sourceName", null);
        setIntField(term437390, term437390.getClass(), "baseLineno", 0);
        setIntField(term437390, term437390.getClass(), "endLineno", 0);
        setField(term437390, term437390.getClass(), "functions", null);
        setField(term437390, term437390.getClass(), "regexps", null);
        setField(term437390, term437390.getClass(), "itsVariables", null);
        setField(term437390, term437390.getClass(), "itsConst", null);
        setField(term437390, term437390.getClass(), "itsVariableNames", null);
        setIntField(term437390, term437390.getClass(), "varStart", 0);
        setField(term437390, term437390.getClass(), "compilerData", null);
        setIntField(term437390, term437390.getClass(), "type", 39);
        setDoubleField(term437400, term437400.getClass(), "number", 0.0);
        setIntField(term437400, term437400.getClass(), "type", 0);
        setField(term437400, term437400.getClass(), "next", null);
        setField(term437400, term437400.getClass(), "first", null);
        setField(term437400, term437400.getClass(), "last", null);
        setField(term437400, term437400.getClass(), "propListHead", null);
        setIntField(term437400, term437400.getClass(), "sourcePosition", 0);
        setField(term437400, term437400.getClass(), "jsType", null);
        setField(term437400, term437400.getClass(), "parent", null);
        setField(term437390, term437390.getClass(), "next", term437400);
        setField(term437390, term437390.getClass(), "first", null);
        setField(term437390, term437390.getClass(), "last", null);
        setField(term437390, term437390.getClass(), "propListHead", null);
        setIntField(term437390, term437390.getClass(), "sourcePosition", 0);
        setField(term437390, term437390.getClass(), "jsType", null);
        setField(term437390, term437390.getClass(), "parent", null);
        setField(term437383, term437383.getClass(), "first", term437390);
        setField(term437383, term437383.getClass(), "last", null);
        setField(term437383, term437383.getClass(), "propListHead", null);
        setIntField(term437383, term437383.getClass(), "sourcePosition", 0);
        setField(term437383, term437383.getClass(), "jsType", null);
        setField(term437383, term437383.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term437189;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term437099, args);
        assertTrue(recursiveEquals(term437099, term437441));
        assertTrue(recursiveEquals(term437189, term437442));
        assertTrue(recursiveEquals(retValue, term437383));
    }

};


