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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432576;
     Object term432668;
     Object term433400;
     Object term433401;
     Object term433326;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432576 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term432668 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term432760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term432846 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term432846, term432846.getClass(), "type", 42);
        setField(term432760, term432760.getClass(), "next", term432846);
        setIntField(term432760, term432760.getClass(), "type", 42);
        setField(term432668, term432668.getClass(), "first", term432760);
        setIntField(term432668, term432668.getClass(), "type", 14);
        term433400 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term433400, term433400.getClass(), "currentTraversal", null);
        term433401 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term433402 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term433403 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term433401, term433401.getClass(), "number", 0.0);
        setIntField(term433401, term433401.getClass(), "type", 14);
        setField(term433401, term433401.getClass(), "next", null);
        setDoubleField(term433402, term433402.getClass(), "number", 0.0);
        setIntField(term433402, term433402.getClass(), "type", 42);
        setField(term433403, term433403.getClass(), "functionName", null);
        setBooleanField(term433403, term433403.getClass(), "itsNeedsActivation", false);
        setIntField(term433403, term433403.getClass(), "itsFunctionType", 0);
        setBooleanField(term433403, term433403.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term433403, term433403.getClass(), "encodedSourceStart", 0);
        setIntField(term433403, term433403.getClass(), "encodedSourceEnd", 0);
        setField(term433403, term433403.getClass(), "sourceName", null);
        setIntField(term433403, term433403.getClass(), "baseLineno", 0);
        setIntField(term433403, term433403.getClass(), "endLineno", 0);
        setField(term433403, term433403.getClass(), "functions", null);
        setField(term433403, term433403.getClass(), "regexps", null);
        setField(term433403, term433403.getClass(), "itsVariables", null);
        setField(term433403, term433403.getClass(), "itsConst", null);
        setField(term433403, term433403.getClass(), "itsVariableNames", null);
        setIntField(term433403, term433403.getClass(), "varStart", 0);
        setField(term433403, term433403.getClass(), "compilerData", null);
        setIntField(term433403, term433403.getClass(), "type", 42);
        setField(term433403, term433403.getClass(), "next", null);
        setField(term433403, term433403.getClass(), "first", null);
        setField(term433403, term433403.getClass(), "last", null);
        setField(term433403, term433403.getClass(), "propListHead", null);
        setIntField(term433403, term433403.getClass(), "sourcePosition", 0);
        setField(term433403, term433403.getClass(), "jsType", null);
        setField(term433403, term433403.getClass(), "parent", null);
        setField(term433402, term433402.getClass(), "next", term433403);
        setField(term433402, term433402.getClass(), "first", null);
        setField(term433402, term433402.getClass(), "last", null);
        setField(term433402, term433402.getClass(), "propListHead", null);
        setIntField(term433402, term433402.getClass(), "sourcePosition", 0);
        setField(term433402, term433402.getClass(), "jsType", null);
        setField(term433402, term433402.getClass(), "parent", null);
        setField(term433401, term433401.getClass(), "first", term433402);
        setField(term433401, term433401.getClass(), "last", null);
        setField(term433401, term433401.getClass(), "propListHead", null);
        setIntField(term433401, term433401.getClass(), "sourcePosition", 0);
        setField(term433401, term433401.getClass(), "jsType", null);
        setField(term433401, term433401.getClass(), "parent", null);
        term433326 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term433329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term433332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term433326, term433326.getClass(), "number", 0.0);
        setIntField(term433326, term433326.getClass(), "type", 14);
        setField(term433326, term433326.getClass(), "next", null);
        setDoubleField(term433329, term433329.getClass(), "number", 0.0);
        setIntField(term433329, term433329.getClass(), "type", 42);
        setField(term433332, term433332.getClass(), "functionName", null);
        setBooleanField(term433332, term433332.getClass(), "itsNeedsActivation", false);
        setIntField(term433332, term433332.getClass(), "itsFunctionType", 0);
        setBooleanField(term433332, term433332.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term433332, term433332.getClass(), "encodedSourceStart", 0);
        setIntField(term433332, term433332.getClass(), "encodedSourceEnd", 0);
        setField(term433332, term433332.getClass(), "sourceName", null);
        setIntField(term433332, term433332.getClass(), "baseLineno", 0);
        setIntField(term433332, term433332.getClass(), "endLineno", 0);
        setField(term433332, term433332.getClass(), "functions", null);
        setField(term433332, term433332.getClass(), "regexps", null);
        setField(term433332, term433332.getClass(), "itsVariables", null);
        setField(term433332, term433332.getClass(), "itsConst", null);
        setField(term433332, term433332.getClass(), "itsVariableNames", null);
        setIntField(term433332, term433332.getClass(), "varStart", 0);
        setField(term433332, term433332.getClass(), "compilerData", null);
        setIntField(term433332, term433332.getClass(), "type", 42);
        setField(term433332, term433332.getClass(), "next", null);
        setField(term433332, term433332.getClass(), "first", null);
        setField(term433332, term433332.getClass(), "last", null);
        setField(term433332, term433332.getClass(), "propListHead", null);
        setIntField(term433332, term433332.getClass(), "sourcePosition", 0);
        setField(term433332, term433332.getClass(), "jsType", null);
        setField(term433332, term433332.getClass(), "parent", null);
        setField(term433329, term433329.getClass(), "next", term433332);
        setField(term433329, term433329.getClass(), "first", null);
        setField(term433329, term433329.getClass(), "last", null);
        setField(term433329, term433329.getClass(), "propListHead", null);
        setIntField(term433329, term433329.getClass(), "sourcePosition", 0);
        setField(term433329, term433329.getClass(), "jsType", null);
        setField(term433329, term433329.getClass(), "parent", null);
        setField(term433326, term433326.getClass(), "first", term433329);
        setField(term433326, term433326.getClass(), "last", null);
        setField(term433326, term433326.getClass(), "propListHead", null);
        setIntField(term433326, term433326.getClass(), "sourcePosition", 0);
        setField(term433326, term433326.getClass(), "jsType", null);
        setField(term433326, term433326.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term432668;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term432576, args);
        assertTrue(recursiveEquals(term432576, term433400));
        assertTrue(recursiveEquals(term432668, term433401));
        assertTrue(recursiveEquals(retValue, term433326));
    }

};


