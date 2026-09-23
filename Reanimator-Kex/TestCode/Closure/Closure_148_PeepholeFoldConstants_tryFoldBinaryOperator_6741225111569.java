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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395420;
     Object term395512;
     Object term396282;
     Object term396283;
     Object term396207;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term395512 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term395598 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term395668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term395598, term395598.getClass(), "next", term395668);
        setField(term395512, term395512.getClass(), "first", term395598);
        setIntField(term395512, term395512.getClass(), "type", 21);
        term396282 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term396282, term396282.getClass(), "currentTraversal", null);
        term396283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term396284 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term396285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term396283, term396283.getClass(), "number", 0.0);
        setIntField(term396283, term396283.getClass(), "type", 21);
        setField(term396283, term396283.getClass(), "next", null);
        setField(term396284, term396284.getClass(), "functionName", null);
        setBooleanField(term396284, term396284.getClass(), "itsNeedsActivation", false);
        setIntField(term396284, term396284.getClass(), "itsFunctionType", 0);
        setBooleanField(term396284, term396284.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term396284, term396284.getClass(), "encodedSourceStart", 0);
        setIntField(term396284, term396284.getClass(), "encodedSourceEnd", 0);
        setField(term396284, term396284.getClass(), "sourceName", null);
        setIntField(term396284, term396284.getClass(), "baseLineno", 0);
        setIntField(term396284, term396284.getClass(), "endLineno", 0);
        setField(term396284, term396284.getClass(), "functions", null);
        setField(term396284, term396284.getClass(), "regexps", null);
        setField(term396284, term396284.getClass(), "itsVariables", null);
        setField(term396284, term396284.getClass(), "itsConst", null);
        setField(term396284, term396284.getClass(), "itsVariableNames", null);
        setIntField(term396284, term396284.getClass(), "varStart", 0);
        setField(term396284, term396284.getClass(), "compilerData", null);
        setIntField(term396284, term396284.getClass(), "type", 0);
        setIntField(term396285, term396285.getClass(), "type", 0);
        setField(term396285, term396285.getClass(), "next", null);
        setField(term396285, term396285.getClass(), "first", null);
        setField(term396285, term396285.getClass(), "last", null);
        setField(term396285, term396285.getClass(), "propListHead", null);
        setIntField(term396285, term396285.getClass(), "sourcePosition", 0);
        setField(term396285, term396285.getClass(), "jsType", null);
        setField(term396285, term396285.getClass(), "parent", null);
        setField(term396284, term396284.getClass(), "next", term396285);
        setField(term396284, term396284.getClass(), "first", null);
        setField(term396284, term396284.getClass(), "last", null);
        setField(term396284, term396284.getClass(), "propListHead", null);
        setIntField(term396284, term396284.getClass(), "sourcePosition", 0);
        setField(term396284, term396284.getClass(), "jsType", null);
        setField(term396284, term396284.getClass(), "parent", null);
        setField(term396283, term396283.getClass(), "first", term396284);
        setField(term396283, term396283.getClass(), "last", null);
        setField(term396283, term396283.getClass(), "propListHead", null);
        setIntField(term396283, term396283.getClass(), "sourcePosition", 0);
        setField(term396283, term396283.getClass(), "jsType", null);
        setField(term396283, term396283.getClass(), "parent", null);
        term396207 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term396210 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term396220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term396207, term396207.getClass(), "number", 0.0);
        setIntField(term396207, term396207.getClass(), "type", 21);
        setField(term396207, term396207.getClass(), "next", null);
        setField(term396210, term396210.getClass(), "functionName", null);
        setBooleanField(term396210, term396210.getClass(), "itsNeedsActivation", false);
        setIntField(term396210, term396210.getClass(), "itsFunctionType", 0);
        setBooleanField(term396210, term396210.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term396210, term396210.getClass(), "encodedSourceStart", 0);
        setIntField(term396210, term396210.getClass(), "encodedSourceEnd", 0);
        setField(term396210, term396210.getClass(), "sourceName", null);
        setIntField(term396210, term396210.getClass(), "baseLineno", 0);
        setIntField(term396210, term396210.getClass(), "endLineno", 0);
        setField(term396210, term396210.getClass(), "functions", null);
        setField(term396210, term396210.getClass(), "regexps", null);
        setField(term396210, term396210.getClass(), "itsVariables", null);
        setField(term396210, term396210.getClass(), "itsConst", null);
        setField(term396210, term396210.getClass(), "itsVariableNames", null);
        setIntField(term396210, term396210.getClass(), "varStart", 0);
        setField(term396210, term396210.getClass(), "compilerData", null);
        setIntField(term396210, term396210.getClass(), "type", 0);
        setIntField(term396220, term396220.getClass(), "type", 0);
        setField(term396220, term396220.getClass(), "next", null);
        setField(term396220, term396220.getClass(), "first", null);
        setField(term396220, term396220.getClass(), "last", null);
        setField(term396220, term396220.getClass(), "propListHead", null);
        setIntField(term396220, term396220.getClass(), "sourcePosition", 0);
        setField(term396220, term396220.getClass(), "jsType", null);
        setField(term396220, term396220.getClass(), "parent", null);
        setField(term396210, term396210.getClass(), "next", term396220);
        setField(term396210, term396210.getClass(), "first", null);
        setField(term396210, term396210.getClass(), "last", null);
        setField(term396210, term396210.getClass(), "propListHead", null);
        setIntField(term396210, term396210.getClass(), "sourcePosition", 0);
        setField(term396210, term396210.getClass(), "jsType", null);
        setField(term396210, term396210.getClass(), "parent", null);
        setField(term396207, term396207.getClass(), "first", term396210);
        setField(term396207, term396207.getClass(), "last", null);
        setField(term396207, term396207.getClass(), "propListHead", null);
        setIntField(term396207, term396207.getClass(), "sourcePosition", 0);
        setField(term396207, term396207.getClass(), "jsType", null);
        setField(term396207, term396207.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term395512;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term395420, args);
        assertTrue(recursiveEquals(term395420, term396282));
        assertTrue(recursiveEquals(term395512, term396283));
        assertTrue(recursiveEquals(retValue, term396207));
    }

};


