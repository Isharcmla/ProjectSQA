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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255854;
     Object term255946;
     Object term257035;
     Object term257036;
     Object term256978;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255854 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term255946 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256038 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term256038, term256038.getClass(), "next", term256124);
        setIntField(term256038, term256038.getClass(), "type", 39);
        setField(term255946, term255946.getClass(), "first", term256038);
        setIntField(term255946, term255946.getClass(), "type", 20);
        term257035 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term257035, term257035.getClass(), "currentTraversal", null);
        term257036 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257038 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term257036, term257036.getClass(), "number", 0.0);
        setIntField(term257036, term257036.getClass(), "type", 20);
        setField(term257036, term257036.getClass(), "next", null);
        setDoubleField(term257037, term257037.getClass(), "number", 0.0);
        setIntField(term257037, term257037.getClass(), "type", 39);
        setField(term257038, term257038.getClass(), "functionName", null);
        setBooleanField(term257038, term257038.getClass(), "itsNeedsActivation", false);
        setIntField(term257038, term257038.getClass(), "itsFunctionType", 0);
        setBooleanField(term257038, term257038.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term257038, term257038.getClass(), "encodedSourceStart", 0);
        setIntField(term257038, term257038.getClass(), "encodedSourceEnd", 0);
        setField(term257038, term257038.getClass(), "sourceName", null);
        setIntField(term257038, term257038.getClass(), "baseLineno", 0);
        setIntField(term257038, term257038.getClass(), "endLineno", 0);
        setField(term257038, term257038.getClass(), "functions", null);
        setField(term257038, term257038.getClass(), "regexps", null);
        setField(term257038, term257038.getClass(), "itsVariables", null);
        setField(term257038, term257038.getClass(), "itsConst", null);
        setField(term257038, term257038.getClass(), "itsVariableNames", null);
        setIntField(term257038, term257038.getClass(), "varStart", 0);
        setField(term257038, term257038.getClass(), "compilerData", null);
        setIntField(term257038, term257038.getClass(), "type", 0);
        setField(term257038, term257038.getClass(), "next", null);
        setField(term257038, term257038.getClass(), "first", null);
        setField(term257038, term257038.getClass(), "last", null);
        setField(term257038, term257038.getClass(), "propListHead", null);
        setIntField(term257038, term257038.getClass(), "sourcePosition", 0);
        setField(term257038, term257038.getClass(), "jsType", null);
        setField(term257038, term257038.getClass(), "parent", null);
        setField(term257037, term257037.getClass(), "next", term257038);
        setField(term257037, term257037.getClass(), "first", null);
        setField(term257037, term257037.getClass(), "last", null);
        setField(term257037, term257037.getClass(), "propListHead", null);
        setIntField(term257037, term257037.getClass(), "sourcePosition", 0);
        setField(term257037, term257037.getClass(), "jsType", null);
        setField(term257037, term257037.getClass(), "parent", null);
        setField(term257036, term257036.getClass(), "first", term257037);
        setField(term257036, term257036.getClass(), "last", null);
        setField(term257036, term257036.getClass(), "propListHead", null);
        setIntField(term257036, term257036.getClass(), "sourcePosition", 0);
        setField(term257036, term257036.getClass(), "jsType", null);
        setField(term257036, term257036.getClass(), "parent", null);
        term256978 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256981 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256984 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term256978, term256978.getClass(), "number", 0.0);
        setIntField(term256978, term256978.getClass(), "type", 20);
        setField(term256978, term256978.getClass(), "next", null);
        setDoubleField(term256981, term256981.getClass(), "number", 0.0);
        setIntField(term256981, term256981.getClass(), "type", 39);
        setField(term256984, term256984.getClass(), "functionName", null);
        setBooleanField(term256984, term256984.getClass(), "itsNeedsActivation", false);
        setIntField(term256984, term256984.getClass(), "itsFunctionType", 0);
        setBooleanField(term256984, term256984.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term256984, term256984.getClass(), "encodedSourceStart", 0);
        setIntField(term256984, term256984.getClass(), "encodedSourceEnd", 0);
        setField(term256984, term256984.getClass(), "sourceName", null);
        setIntField(term256984, term256984.getClass(), "baseLineno", 0);
        setIntField(term256984, term256984.getClass(), "endLineno", 0);
        setField(term256984, term256984.getClass(), "functions", null);
        setField(term256984, term256984.getClass(), "regexps", null);
        setField(term256984, term256984.getClass(), "itsVariables", null);
        setField(term256984, term256984.getClass(), "itsConst", null);
        setField(term256984, term256984.getClass(), "itsVariableNames", null);
        setIntField(term256984, term256984.getClass(), "varStart", 0);
        setField(term256984, term256984.getClass(), "compilerData", null);
        setIntField(term256984, term256984.getClass(), "type", 0);
        setField(term256984, term256984.getClass(), "next", null);
        setField(term256984, term256984.getClass(), "first", null);
        setField(term256984, term256984.getClass(), "last", null);
        setField(term256984, term256984.getClass(), "propListHead", null);
        setIntField(term256984, term256984.getClass(), "sourcePosition", 0);
        setField(term256984, term256984.getClass(), "jsType", null);
        setField(term256984, term256984.getClass(), "parent", null);
        setField(term256981, term256981.getClass(), "next", term256984);
        setField(term256981, term256981.getClass(), "first", null);
        setField(term256981, term256981.getClass(), "last", null);
        setField(term256981, term256981.getClass(), "propListHead", null);
        setIntField(term256981, term256981.getClass(), "sourcePosition", 0);
        setField(term256981, term256981.getClass(), "jsType", null);
        setField(term256981, term256981.getClass(), "parent", null);
        setField(term256978, term256978.getClass(), "first", term256981);
        setField(term256978, term256978.getClass(), "last", null);
        setField(term256978, term256978.getClass(), "propListHead", null);
        setIntField(term256978, term256978.getClass(), "sourcePosition", 0);
        setField(term256978, term256978.getClass(), "jsType", null);
        setField(term256978, term256978.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term255946;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term255854, args);
        assertTrue(recursiveEquals(term255854, term257035));
        assertTrue(recursiveEquals(term255946, term257036));
        assertTrue(recursiveEquals(retValue, term256978));
    }

};


