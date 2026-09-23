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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505940;
     Object term506032;
     Object term506810;
     Object term506811;
     Object term506765;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term505940 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term506032 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term506118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term506118, term506118.getClass(), "next", term506188);
        setField(term506032, term506032.getClass(), "first", term506118);
        setIntField(term506032, term506032.getClass(), "type", 20);
        term506810 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term506810, term506810.getClass(), "currentTraversal", null);
        term506811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term506812 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term506811, term506811.getClass(), "number", 0.0);
        setIntField(term506811, term506811.getClass(), "type", 20);
        setField(term506811, term506811.getClass(), "next", null);
        setField(term506812, term506812.getClass(), "functionName", null);
        setBooleanField(term506812, term506812.getClass(), "itsNeedsActivation", false);
        setIntField(term506812, term506812.getClass(), "itsFunctionType", 0);
        setBooleanField(term506812, term506812.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term506812, term506812.getClass(), "encodedSourceStart", 0);
        setIntField(term506812, term506812.getClass(), "encodedSourceEnd", 0);
        setField(term506812, term506812.getClass(), "sourceName", null);
        setIntField(term506812, term506812.getClass(), "baseLineno", 0);
        setIntField(term506812, term506812.getClass(), "endLineno", 0);
        setField(term506812, term506812.getClass(), "functions", null);
        setField(term506812, term506812.getClass(), "regexps", null);
        setField(term506812, term506812.getClass(), "itsVariables", null);
        setField(term506812, term506812.getClass(), "itsConst", null);
        setField(term506812, term506812.getClass(), "itsVariableNames", null);
        setIntField(term506812, term506812.getClass(), "varStart", 0);
        setField(term506812, term506812.getClass(), "compilerData", null);
        setIntField(term506812, term506812.getClass(), "type", 0);
        setIntField(term506813, term506813.getClass(), "type", 0);
        setField(term506813, term506813.getClass(), "next", null);
        setField(term506813, term506813.getClass(), "first", null);
        setField(term506813, term506813.getClass(), "last", null);
        setField(term506813, term506813.getClass(), "propListHead", null);
        setIntField(term506813, term506813.getClass(), "sourcePosition", 0);
        setField(term506813, term506813.getClass(), "jsType", null);
        setField(term506813, term506813.getClass(), "parent", null);
        setField(term506812, term506812.getClass(), "next", term506813);
        setField(term506812, term506812.getClass(), "first", null);
        setField(term506812, term506812.getClass(), "last", null);
        setField(term506812, term506812.getClass(), "propListHead", null);
        setIntField(term506812, term506812.getClass(), "sourcePosition", 0);
        setField(term506812, term506812.getClass(), "jsType", null);
        setField(term506812, term506812.getClass(), "parent", null);
        setField(term506811, term506811.getClass(), "first", term506812);
        setField(term506811, term506811.getClass(), "last", null);
        setField(term506811, term506811.getClass(), "propListHead", null);
        setIntField(term506811, term506811.getClass(), "sourcePosition", 0);
        setField(term506811, term506811.getClass(), "jsType", null);
        setField(term506811, term506811.getClass(), "parent", null);
        term506765 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term506768 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term506778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term506765, term506765.getClass(), "number", 0.0);
        setIntField(term506765, term506765.getClass(), "type", 20);
        setField(term506765, term506765.getClass(), "next", null);
        setField(term506768, term506768.getClass(), "functionName", null);
        setBooleanField(term506768, term506768.getClass(), "itsNeedsActivation", false);
        setIntField(term506768, term506768.getClass(), "itsFunctionType", 0);
        setBooleanField(term506768, term506768.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term506768, term506768.getClass(), "encodedSourceStart", 0);
        setIntField(term506768, term506768.getClass(), "encodedSourceEnd", 0);
        setField(term506768, term506768.getClass(), "sourceName", null);
        setIntField(term506768, term506768.getClass(), "baseLineno", 0);
        setIntField(term506768, term506768.getClass(), "endLineno", 0);
        setField(term506768, term506768.getClass(), "functions", null);
        setField(term506768, term506768.getClass(), "regexps", null);
        setField(term506768, term506768.getClass(), "itsVariables", null);
        setField(term506768, term506768.getClass(), "itsConst", null);
        setField(term506768, term506768.getClass(), "itsVariableNames", null);
        setIntField(term506768, term506768.getClass(), "varStart", 0);
        setField(term506768, term506768.getClass(), "compilerData", null);
        setIntField(term506768, term506768.getClass(), "type", 0);
        setIntField(term506778, term506778.getClass(), "type", 0);
        setField(term506778, term506778.getClass(), "next", null);
        setField(term506778, term506778.getClass(), "first", null);
        setField(term506778, term506778.getClass(), "last", null);
        setField(term506778, term506778.getClass(), "propListHead", null);
        setIntField(term506778, term506778.getClass(), "sourcePosition", 0);
        setField(term506778, term506778.getClass(), "jsType", null);
        setField(term506778, term506778.getClass(), "parent", null);
        setField(term506768, term506768.getClass(), "next", term506778);
        setField(term506768, term506768.getClass(), "first", null);
        setField(term506768, term506768.getClass(), "last", null);
        setField(term506768, term506768.getClass(), "propListHead", null);
        setIntField(term506768, term506768.getClass(), "sourcePosition", 0);
        setField(term506768, term506768.getClass(), "jsType", null);
        setField(term506768, term506768.getClass(), "parent", null);
        setField(term506765, term506765.getClass(), "first", term506768);
        setField(term506765, term506765.getClass(), "last", null);
        setField(term506765, term506765.getClass(), "propListHead", null);
        setIntField(term506765, term506765.getClass(), "sourcePosition", 0);
        setField(term506765, term506765.getClass(), "jsType", null);
        setField(term506765, term506765.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term506032;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term505940, args);
        assertTrue(recursiveEquals(term505940, term506810));
        assertTrue(recursiveEquals(term506032, term506811));
        assertTrue(recursiveEquals(retValue, term506765));
    }

};


