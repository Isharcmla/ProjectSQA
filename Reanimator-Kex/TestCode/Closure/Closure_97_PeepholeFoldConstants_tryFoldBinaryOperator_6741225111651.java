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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659722;
     Object term659808;
     Object term660453;
     Object term660454;
     Object term660375;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659722 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term659808 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term659894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term659808, term659808.getClass(), "first", term659808);
        setField(term659808, term659808.getClass(), "next", term659894);
        setIntField(term659808, term659808.getClass(), "type", 14);
        term660453 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term660453, term660453.getClass(), "currentTraversal", null);
        term660454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term660455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term660454, term660454.getClass(), "functionName", null);
        setBooleanField(term660454, term660454.getClass(), "itsNeedsActivation", false);
        setIntField(term660454, term660454.getClass(), "itsFunctionType", 0);
        setBooleanField(term660454, term660454.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term660454, term660454.getClass(), "encodedSourceStart", 0);
        setIntField(term660454, term660454.getClass(), "encodedSourceEnd", 0);
        setField(term660454, term660454.getClass(), "sourceName", null);
        setIntField(term660454, term660454.getClass(), "baseLineno", 0);
        setIntField(term660454, term660454.getClass(), "endLineno", 0);
        setField(term660454, term660454.getClass(), "functions", null);
        setField(term660454, term660454.getClass(), "regexps", null);
        setField(term660454, term660454.getClass(), "itsVariables", null);
        setField(term660454, term660454.getClass(), "itsConst", null);
        setField(term660454, term660454.getClass(), "itsVariableNames", null);
        setIntField(term660454, term660454.getClass(), "varStart", 0);
        setField(term660454, term660454.getClass(), "compilerData", null);
        setIntField(term660454, term660454.getClass(), "type", 14);
        setField(term660455, term660455.getClass(), "functionName", null);
        setBooleanField(term660455, term660455.getClass(), "itsNeedsActivation", false);
        setIntField(term660455, term660455.getClass(), "itsFunctionType", 0);
        setBooleanField(term660455, term660455.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term660455, term660455.getClass(), "encodedSourceStart", 0);
        setIntField(term660455, term660455.getClass(), "encodedSourceEnd", 0);
        setField(term660455, term660455.getClass(), "sourceName", null);
        setIntField(term660455, term660455.getClass(), "baseLineno", 0);
        setIntField(term660455, term660455.getClass(), "endLineno", 0);
        setField(term660455, term660455.getClass(), "functions", null);
        setField(term660455, term660455.getClass(), "regexps", null);
        setField(term660455, term660455.getClass(), "itsVariables", null);
        setField(term660455, term660455.getClass(), "itsConst", null);
        setField(term660455, term660455.getClass(), "itsVariableNames", null);
        setIntField(term660455, term660455.getClass(), "varStart", 0);
        setField(term660455, term660455.getClass(), "compilerData", null);
        setIntField(term660455, term660455.getClass(), "type", 0);
        setField(term660455, term660455.getClass(), "next", null);
        setField(term660455, term660455.getClass(), "first", null);
        setField(term660455, term660455.getClass(), "last", null);
        setField(term660455, term660455.getClass(), "propListHead", null);
        setIntField(term660455, term660455.getClass(), "sourcePosition", 0);
        setField(term660455, term660455.getClass(), "jsType", null);
        setField(term660455, term660455.getClass(), "parent", null);
        setField(term660454, term660454.getClass(), "next", term660455);
        setField(term660454, term660454.getClass(), "first", term660454);
        setField(term660454, term660454.getClass(), "last", null);
        setField(term660454, term660454.getClass(), "propListHead", null);
        setIntField(term660454, term660454.getClass(), "sourcePosition", 0);
        setField(term660454, term660454.getClass(), "jsType", null);
        setField(term660454, term660454.getClass(), "parent", null);
        term660375 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term660385 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term660375, term660375.getClass(), "functionName", null);
        setBooleanField(term660375, term660375.getClass(), "itsNeedsActivation", false);
        setIntField(term660375, term660375.getClass(), "itsFunctionType", 0);
        setBooleanField(term660375, term660375.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term660375, term660375.getClass(), "encodedSourceStart", 0);
        setIntField(term660375, term660375.getClass(), "encodedSourceEnd", 0);
        setField(term660375, term660375.getClass(), "sourceName", null);
        setIntField(term660375, term660375.getClass(), "baseLineno", 0);
        setIntField(term660375, term660375.getClass(), "endLineno", 0);
        setField(term660375, term660375.getClass(), "functions", null);
        setField(term660375, term660375.getClass(), "regexps", null);
        setField(term660375, term660375.getClass(), "itsVariables", null);
        setField(term660375, term660375.getClass(), "itsConst", null);
        setField(term660375, term660375.getClass(), "itsVariableNames", null);
        setIntField(term660375, term660375.getClass(), "varStart", 0);
        setField(term660375, term660375.getClass(), "compilerData", null);
        setIntField(term660375, term660375.getClass(), "type", 14);
        setField(term660385, term660385.getClass(), "functionName", null);
        setBooleanField(term660385, term660385.getClass(), "itsNeedsActivation", false);
        setIntField(term660385, term660385.getClass(), "itsFunctionType", 0);
        setBooleanField(term660385, term660385.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term660385, term660385.getClass(), "encodedSourceStart", 0);
        setIntField(term660385, term660385.getClass(), "encodedSourceEnd", 0);
        setField(term660385, term660385.getClass(), "sourceName", null);
        setIntField(term660385, term660385.getClass(), "baseLineno", 0);
        setIntField(term660385, term660385.getClass(), "endLineno", 0);
        setField(term660385, term660385.getClass(), "functions", null);
        setField(term660385, term660385.getClass(), "regexps", null);
        setField(term660385, term660385.getClass(), "itsVariables", null);
        setField(term660385, term660385.getClass(), "itsConst", null);
        setField(term660385, term660385.getClass(), "itsVariableNames", null);
        setIntField(term660385, term660385.getClass(), "varStart", 0);
        setField(term660385, term660385.getClass(), "compilerData", null);
        setIntField(term660385, term660385.getClass(), "type", 0);
        setField(term660385, term660385.getClass(), "next", null);
        setField(term660385, term660385.getClass(), "first", null);
        setField(term660385, term660385.getClass(), "last", null);
        setField(term660385, term660385.getClass(), "propListHead", null);
        setIntField(term660385, term660385.getClass(), "sourcePosition", 0);
        setField(term660385, term660385.getClass(), "jsType", null);
        setField(term660385, term660385.getClass(), "parent", null);
        setField(term660375, term660375.getClass(), "next", term660385);
        setField(term660375, term660375.getClass(), "first", term660375);
        setField(term660375, term660375.getClass(), "last", null);
        setField(term660375, term660375.getClass(), "propListHead", null);
        setIntField(term660375, term660375.getClass(), "sourcePosition", 0);
        setField(term660375, term660375.getClass(), "jsType", null);
        setField(term660375, term660375.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term659808;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term659722, args);
        assertTrue(recursiveEquals(term659722, term660453));
        assertTrue(recursiveEquals(term659808, term660454));
        assertTrue(recursiveEquals(retValue, term660375));
    }

};


