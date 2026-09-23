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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354481;
     Object term354573;
     Object term355420;
     Object term355421;
     Object term355348;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354481 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term354573 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term354659 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354751 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term354659, term354659.getClass(), "next", term354751);
        setIntField(term354659, term354659.getClass(), "type", 0);
        setField(term354573, term354573.getClass(), "first", term354659);
        setIntField(term354573, term354573.getClass(), "type", 101);
        setField(term354573, term354573.getClass(), "parent", null);
        term355420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term355420, term355420.getClass(), "currentTraversal", null);
        term355421 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term355422 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355423 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term355421, term355421.getClass(), "str", null);
        setIntField(term355421, term355421.getClass(), "type", 101);
        setField(term355421, term355421.getClass(), "next", null);
        setField(term355422, term355422.getClass(), "functionName", null);
        setBooleanField(term355422, term355422.getClass(), "itsNeedsActivation", false);
        setIntField(term355422, term355422.getClass(), "itsFunctionType", 0);
        setBooleanField(term355422, term355422.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355422, term355422.getClass(), "encodedSourceStart", 0);
        setIntField(term355422, term355422.getClass(), "encodedSourceEnd", 0);
        setField(term355422, term355422.getClass(), "sourceName", null);
        setIntField(term355422, term355422.getClass(), "baseLineno", 0);
        setIntField(term355422, term355422.getClass(), "endLineno", 0);
        setField(term355422, term355422.getClass(), "functions", null);
        setField(term355422, term355422.getClass(), "regexps", null);
        setField(term355422, term355422.getClass(), "itsVariables", null);
        setField(term355422, term355422.getClass(), "itsConst", null);
        setField(term355422, term355422.getClass(), "itsVariableNames", null);
        setIntField(term355422, term355422.getClass(), "varStart", 0);
        setField(term355422, term355422.getClass(), "compilerData", null);
        setIntField(term355422, term355422.getClass(), "type", 0);
        setDoubleField(term355423, term355423.getClass(), "number", 0.0);
        setIntField(term355423, term355423.getClass(), "type", 0);
        setField(term355423, term355423.getClass(), "next", null);
        setField(term355423, term355423.getClass(), "first", null);
        setField(term355423, term355423.getClass(), "last", null);
        setField(term355423, term355423.getClass(), "propListHead", null);
        setIntField(term355423, term355423.getClass(), "sourcePosition", 0);
        setField(term355423, term355423.getClass(), "jsType", null);
        setField(term355423, term355423.getClass(), "parent", null);
        setField(term355422, term355422.getClass(), "next", term355423);
        setField(term355422, term355422.getClass(), "first", null);
        setField(term355422, term355422.getClass(), "last", null);
        setField(term355422, term355422.getClass(), "propListHead", null);
        setIntField(term355422, term355422.getClass(), "sourcePosition", 0);
        setField(term355422, term355422.getClass(), "jsType", null);
        setField(term355422, term355422.getClass(), "parent", null);
        setField(term355421, term355421.getClass(), "first", term355422);
        setField(term355421, term355421.getClass(), "last", null);
        setField(term355421, term355421.getClass(), "propListHead", null);
        setIntField(term355421, term355421.getClass(), "sourcePosition", 0);
        setField(term355421, term355421.getClass(), "jsType", null);
        setField(term355421, term355421.getClass(), "parent", null);
        term355348 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term355350 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term355348, term355348.getClass(), "str", null);
        setIntField(term355348, term355348.getClass(), "type", 101);
        setField(term355348, term355348.getClass(), "next", null);
        setField(term355350, term355350.getClass(), "functionName", null);
        setBooleanField(term355350, term355350.getClass(), "itsNeedsActivation", false);
        setIntField(term355350, term355350.getClass(), "itsFunctionType", 0);
        setBooleanField(term355350, term355350.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355350, term355350.getClass(), "encodedSourceStart", 0);
        setIntField(term355350, term355350.getClass(), "encodedSourceEnd", 0);
        setField(term355350, term355350.getClass(), "sourceName", null);
        setIntField(term355350, term355350.getClass(), "baseLineno", 0);
        setIntField(term355350, term355350.getClass(), "endLineno", 0);
        setField(term355350, term355350.getClass(), "functions", null);
        setField(term355350, term355350.getClass(), "regexps", null);
        setField(term355350, term355350.getClass(), "itsVariables", null);
        setField(term355350, term355350.getClass(), "itsConst", null);
        setField(term355350, term355350.getClass(), "itsVariableNames", null);
        setIntField(term355350, term355350.getClass(), "varStart", 0);
        setField(term355350, term355350.getClass(), "compilerData", null);
        setIntField(term355350, term355350.getClass(), "type", 0);
        setDoubleField(term355360, term355360.getClass(), "number", 0.0);
        setIntField(term355360, term355360.getClass(), "type", 0);
        setField(term355360, term355360.getClass(), "next", null);
        setField(term355360, term355360.getClass(), "first", null);
        setField(term355360, term355360.getClass(), "last", null);
        setField(term355360, term355360.getClass(), "propListHead", null);
        setIntField(term355360, term355360.getClass(), "sourcePosition", 0);
        setField(term355360, term355360.getClass(), "jsType", null);
        setField(term355360, term355360.getClass(), "parent", null);
        setField(term355350, term355350.getClass(), "next", term355360);
        setField(term355350, term355350.getClass(), "first", null);
        setField(term355350, term355350.getClass(), "last", null);
        setField(term355350, term355350.getClass(), "propListHead", null);
        setIntField(term355350, term355350.getClass(), "sourcePosition", 0);
        setField(term355350, term355350.getClass(), "jsType", null);
        setField(term355350, term355350.getClass(), "parent", null);
        setField(term355348, term355348.getClass(), "first", term355350);
        setField(term355348, term355348.getClass(), "last", null);
        setField(term355348, term355348.getClass(), "propListHead", null);
        setIntField(term355348, term355348.getClass(), "sourcePosition", 0);
        setField(term355348, term355348.getClass(), "jsType", null);
        setField(term355348, term355348.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term354573;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term354481, args);
        assertTrue(recursiveEquals(term354481, term355420));
        assertTrue(recursiveEquals(term354573, term355421));
        assertTrue(recursiveEquals(retValue, term355348));
    }

};


