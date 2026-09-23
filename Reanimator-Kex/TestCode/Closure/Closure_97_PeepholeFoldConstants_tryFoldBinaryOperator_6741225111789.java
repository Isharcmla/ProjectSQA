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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697308;
     Object term697400;
     Object term698207;
     Object term698208;
     Object term698099;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697308 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term697400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term697492 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term697584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term697670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term697584, term697584.getClass(), "first", term697670);
        setField(term697492, term697492.getClass(), "next", term697584);
        setField(term697400, term697400.getClass(), "first", term697492);
        setIntField(term697400, term697400.getClass(), "type", 86);
        term698207 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term698207, term698207.getClass(), "currentTraversal", null);
        term698208 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698210 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698211 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term698208, term698208.getClass(), "number", 0.0);
        setIntField(term698208, term698208.getClass(), "type", 86);
        setField(term698208, term698208.getClass(), "next", null);
        setDoubleField(term698209, term698209.getClass(), "number", 0.0);
        setIntField(term698209, term698209.getClass(), "type", 0);
        setDoubleField(term698210, term698210.getClass(), "number", 0.0);
        setIntField(term698210, term698210.getClass(), "type", 0);
        setField(term698210, term698210.getClass(), "next", null);
        setField(term698211, term698211.getClass(), "functionName", null);
        setBooleanField(term698211, term698211.getClass(), "itsNeedsActivation", false);
        setIntField(term698211, term698211.getClass(), "itsFunctionType", 0);
        setBooleanField(term698211, term698211.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term698211, term698211.getClass(), "encodedSourceStart", 0);
        setIntField(term698211, term698211.getClass(), "encodedSourceEnd", 0);
        setField(term698211, term698211.getClass(), "sourceName", null);
        setIntField(term698211, term698211.getClass(), "baseLineno", 0);
        setIntField(term698211, term698211.getClass(), "endLineno", 0);
        setField(term698211, term698211.getClass(), "functions", null);
        setField(term698211, term698211.getClass(), "regexps", null);
        setField(term698211, term698211.getClass(), "itsVariables", null);
        setField(term698211, term698211.getClass(), "itsConst", null);
        setField(term698211, term698211.getClass(), "itsVariableNames", null);
        setIntField(term698211, term698211.getClass(), "varStart", 0);
        setField(term698211, term698211.getClass(), "compilerData", null);
        setIntField(term698211, term698211.getClass(), "type", 0);
        setField(term698211, term698211.getClass(), "next", null);
        setField(term698211, term698211.getClass(), "first", null);
        setField(term698211, term698211.getClass(), "last", null);
        setField(term698211, term698211.getClass(), "propListHead", null);
        setIntField(term698211, term698211.getClass(), "sourcePosition", 0);
        setField(term698211, term698211.getClass(), "jsType", null);
        setField(term698211, term698211.getClass(), "parent", null);
        setField(term698210, term698210.getClass(), "first", term698211);
        setField(term698210, term698210.getClass(), "last", null);
        setField(term698210, term698210.getClass(), "propListHead", null);
        setIntField(term698210, term698210.getClass(), "sourcePosition", 0);
        setField(term698210, term698210.getClass(), "jsType", null);
        setField(term698210, term698210.getClass(), "parent", null);
        setField(term698209, term698209.getClass(), "next", term698210);
        setField(term698209, term698209.getClass(), "first", null);
        setField(term698209, term698209.getClass(), "last", null);
        setField(term698209, term698209.getClass(), "propListHead", null);
        setIntField(term698209, term698209.getClass(), "sourcePosition", 0);
        setField(term698209, term698209.getClass(), "jsType", null);
        setField(term698209, term698209.getClass(), "parent", null);
        setField(term698208, term698208.getClass(), "first", term698209);
        setField(term698208, term698208.getClass(), "last", null);
        setField(term698208, term698208.getClass(), "propListHead", null);
        setIntField(term698208, term698208.getClass(), "sourcePosition", 0);
        setField(term698208, term698208.getClass(), "jsType", null);
        setField(term698208, term698208.getClass(), "parent", null);
        term698099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698108 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term698099, term698099.getClass(), "number", 0.0);
        setIntField(term698099, term698099.getClass(), "type", 86);
        setField(term698099, term698099.getClass(), "next", null);
        setDoubleField(term698102, term698102.getClass(), "number", 0.0);
        setIntField(term698102, term698102.getClass(), "type", 0);
        setDoubleField(term698105, term698105.getClass(), "number", 0.0);
        setIntField(term698105, term698105.getClass(), "type", 0);
        setField(term698105, term698105.getClass(), "next", null);
        setField(term698108, term698108.getClass(), "functionName", null);
        setBooleanField(term698108, term698108.getClass(), "itsNeedsActivation", false);
        setIntField(term698108, term698108.getClass(), "itsFunctionType", 0);
        setBooleanField(term698108, term698108.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term698108, term698108.getClass(), "encodedSourceStart", 0);
        setIntField(term698108, term698108.getClass(), "encodedSourceEnd", 0);
        setField(term698108, term698108.getClass(), "sourceName", null);
        setIntField(term698108, term698108.getClass(), "baseLineno", 0);
        setIntField(term698108, term698108.getClass(), "endLineno", 0);
        setField(term698108, term698108.getClass(), "functions", null);
        setField(term698108, term698108.getClass(), "regexps", null);
        setField(term698108, term698108.getClass(), "itsVariables", null);
        setField(term698108, term698108.getClass(), "itsConst", null);
        setField(term698108, term698108.getClass(), "itsVariableNames", null);
        setIntField(term698108, term698108.getClass(), "varStart", 0);
        setField(term698108, term698108.getClass(), "compilerData", null);
        setIntField(term698108, term698108.getClass(), "type", 0);
        setField(term698108, term698108.getClass(), "next", null);
        setField(term698108, term698108.getClass(), "first", null);
        setField(term698108, term698108.getClass(), "last", null);
        setField(term698108, term698108.getClass(), "propListHead", null);
        setIntField(term698108, term698108.getClass(), "sourcePosition", 0);
        setField(term698108, term698108.getClass(), "jsType", null);
        setField(term698108, term698108.getClass(), "parent", null);
        setField(term698105, term698105.getClass(), "first", term698108);
        setField(term698105, term698105.getClass(), "last", null);
        setField(term698105, term698105.getClass(), "propListHead", null);
        setIntField(term698105, term698105.getClass(), "sourcePosition", 0);
        setField(term698105, term698105.getClass(), "jsType", null);
        setField(term698105, term698105.getClass(), "parent", null);
        setField(term698102, term698102.getClass(), "next", term698105);
        setField(term698102, term698102.getClass(), "first", null);
        setField(term698102, term698102.getClass(), "last", null);
        setField(term698102, term698102.getClass(), "propListHead", null);
        setIntField(term698102, term698102.getClass(), "sourcePosition", 0);
        setField(term698102, term698102.getClass(), "jsType", null);
        setField(term698102, term698102.getClass(), "parent", null);
        setField(term698099, term698099.getClass(), "first", term698102);
        setField(term698099, term698099.getClass(), "last", null);
        setField(term698099, term698099.getClass(), "propListHead", null);
        setIntField(term698099, term698099.getClass(), "sourcePosition", 0);
        setField(term698099, term698099.getClass(), "jsType", null);
        setField(term698099, term698099.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term697400;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term697308, args);
        assertTrue(recursiveEquals(term697308, term698207));
        assertTrue(recursiveEquals(term697400, term698208));
        assertTrue(recursiveEquals(retValue, term698099));
    }

};


