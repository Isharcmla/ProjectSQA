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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621847;
     Object term621939;
     Object term650746;
     Object term650747;
     Object term650694;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621847 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term621939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term622025 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term622095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term622025, term622025.getClass(), "next", term622095);
        setField(term621939, term621939.getClass(), "first", term622025);
        setIntField(term621939, term621939.getClass(), "type", 13);
        term650746 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term650746, term650746.getClass(), "currentTraversal", null);
        term650747 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term650748 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term650747, term650747.getClass(), "number", 0.0);
        setIntField(term650747, term650747.getClass(), "type", 13);
        setField(term650747, term650747.getClass(), "next", null);
        setField(term650748, term650748.getClass(), "functionName", null);
        setBooleanField(term650748, term650748.getClass(), "itsNeedsActivation", false);
        setIntField(term650748, term650748.getClass(), "itsFunctionType", 0);
        setBooleanField(term650748, term650748.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650748, term650748.getClass(), "encodedSourceStart", 0);
        setIntField(term650748, term650748.getClass(), "encodedSourceEnd", 0);
        setField(term650748, term650748.getClass(), "sourceName", null);
        setIntField(term650748, term650748.getClass(), "baseLineno", 0);
        setIntField(term650748, term650748.getClass(), "endLineno", 0);
        setField(term650748, term650748.getClass(), "functions", null);
        setField(term650748, term650748.getClass(), "regexps", null);
        setField(term650748, term650748.getClass(), "itsVariables", null);
        setField(term650748, term650748.getClass(), "itsConst", null);
        setField(term650748, term650748.getClass(), "itsVariableNames", null);
        setIntField(term650748, term650748.getClass(), "varStart", 0);
        setField(term650748, term650748.getClass(), "compilerData", null);
        setIntField(term650748, term650748.getClass(), "type", 0);
        setIntField(term650749, term650749.getClass(), "type", 0);
        setField(term650749, term650749.getClass(), "next", null);
        setField(term650749, term650749.getClass(), "first", null);
        setField(term650749, term650749.getClass(), "last", null);
        setField(term650749, term650749.getClass(), "propListHead", null);
        setIntField(term650749, term650749.getClass(), "sourcePosition", 0);
        setField(term650749, term650749.getClass(), "jsType", null);
        setField(term650749, term650749.getClass(), "parent", null);
        setField(term650748, term650748.getClass(), "next", term650749);
        setField(term650748, term650748.getClass(), "first", null);
        setField(term650748, term650748.getClass(), "last", null);
        setField(term650748, term650748.getClass(), "propListHead", null);
        setIntField(term650748, term650748.getClass(), "sourcePosition", 0);
        setField(term650748, term650748.getClass(), "jsType", null);
        setField(term650748, term650748.getClass(), "parent", null);
        setField(term650747, term650747.getClass(), "first", term650748);
        setField(term650747, term650747.getClass(), "last", null);
        setField(term650747, term650747.getClass(), "propListHead", null);
        setIntField(term650747, term650747.getClass(), "sourcePosition", 0);
        setField(term650747, term650747.getClass(), "jsType", null);
        setField(term650747, term650747.getClass(), "parent", null);
        term650694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term650697 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term650694, term650694.getClass(), "number", 0.0);
        setIntField(term650694, term650694.getClass(), "type", 13);
        setField(term650694, term650694.getClass(), "next", null);
        setField(term650697, term650697.getClass(), "functionName", null);
        setBooleanField(term650697, term650697.getClass(), "itsNeedsActivation", false);
        setIntField(term650697, term650697.getClass(), "itsFunctionType", 0);
        setBooleanField(term650697, term650697.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650697, term650697.getClass(), "encodedSourceStart", 0);
        setIntField(term650697, term650697.getClass(), "encodedSourceEnd", 0);
        setField(term650697, term650697.getClass(), "sourceName", null);
        setIntField(term650697, term650697.getClass(), "baseLineno", 0);
        setIntField(term650697, term650697.getClass(), "endLineno", 0);
        setField(term650697, term650697.getClass(), "functions", null);
        setField(term650697, term650697.getClass(), "regexps", null);
        setField(term650697, term650697.getClass(), "itsVariables", null);
        setField(term650697, term650697.getClass(), "itsConst", null);
        setField(term650697, term650697.getClass(), "itsVariableNames", null);
        setIntField(term650697, term650697.getClass(), "varStart", 0);
        setField(term650697, term650697.getClass(), "compilerData", null);
        setIntField(term650697, term650697.getClass(), "type", 0);
        setIntField(term650707, term650707.getClass(), "type", 0);
        setField(term650707, term650707.getClass(), "next", null);
        setField(term650707, term650707.getClass(), "first", null);
        setField(term650707, term650707.getClass(), "last", null);
        setField(term650707, term650707.getClass(), "propListHead", null);
        setIntField(term650707, term650707.getClass(), "sourcePosition", 0);
        setField(term650707, term650707.getClass(), "jsType", null);
        setField(term650707, term650707.getClass(), "parent", null);
        setField(term650697, term650697.getClass(), "next", term650707);
        setField(term650697, term650697.getClass(), "first", null);
        setField(term650697, term650697.getClass(), "last", null);
        setField(term650697, term650697.getClass(), "propListHead", null);
        setIntField(term650697, term650697.getClass(), "sourcePosition", 0);
        setField(term650697, term650697.getClass(), "jsType", null);
        setField(term650697, term650697.getClass(), "parent", null);
        setField(term650694, term650694.getClass(), "first", term650697);
        setField(term650694, term650694.getClass(), "last", null);
        setField(term650694, term650694.getClass(), "propListHead", null);
        setIntField(term650694, term650694.getClass(), "sourcePosition", 0);
        setField(term650694, term650694.getClass(), "jsType", null);
        setField(term650694, term650694.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term621939;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term621847, args);
        assertTrue(recursiveEquals(term621847, term650746));
        assertTrue(recursiveEquals(term621939, term650747));
        assertTrue(recursiveEquals(retValue, term650694));
    }

};


