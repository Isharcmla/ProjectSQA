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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351564;
     Object term351656;
     Object term352282;
     Object term352283;
     Object term352222;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351564 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term351656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term351742 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term351812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term351742, term351742.getClass(), "next", term351812);
        setField(term351656, term351656.getClass(), "first", term351742);
        setIntField(term351656, term351656.getClass(), "type", 16);
        term352282 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term352282, term352282.getClass(), "currentTraversal", null);
        term352283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term352284 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term352285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term352283, term352283.getClass(), "number", 0.0);
        setIntField(term352283, term352283.getClass(), "type", 16);
        setField(term352283, term352283.getClass(), "next", null);
        setField(term352284, term352284.getClass(), "functionName", null);
        setBooleanField(term352284, term352284.getClass(), "itsNeedsActivation", false);
        setIntField(term352284, term352284.getClass(), "itsFunctionType", 0);
        setBooleanField(term352284, term352284.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term352284, term352284.getClass(), "encodedSourceStart", 0);
        setIntField(term352284, term352284.getClass(), "encodedSourceEnd", 0);
        setField(term352284, term352284.getClass(), "sourceName", null);
        setIntField(term352284, term352284.getClass(), "baseLineno", 0);
        setIntField(term352284, term352284.getClass(), "endLineno", 0);
        setField(term352284, term352284.getClass(), "functions", null);
        setField(term352284, term352284.getClass(), "regexps", null);
        setField(term352284, term352284.getClass(), "itsVariables", null);
        setField(term352284, term352284.getClass(), "itsConst", null);
        setField(term352284, term352284.getClass(), "itsVariableNames", null);
        setIntField(term352284, term352284.getClass(), "varStart", 0);
        setField(term352284, term352284.getClass(), "compilerData", null);
        setIntField(term352284, term352284.getClass(), "type", 0);
        setIntField(term352285, term352285.getClass(), "type", 0);
        setField(term352285, term352285.getClass(), "next", null);
        setField(term352285, term352285.getClass(), "first", null);
        setField(term352285, term352285.getClass(), "last", null);
        setField(term352285, term352285.getClass(), "propListHead", null);
        setIntField(term352285, term352285.getClass(), "sourcePosition", 0);
        setField(term352285, term352285.getClass(), "jsType", null);
        setField(term352285, term352285.getClass(), "parent", null);
        setField(term352284, term352284.getClass(), "next", term352285);
        setField(term352284, term352284.getClass(), "first", null);
        setField(term352284, term352284.getClass(), "last", null);
        setField(term352284, term352284.getClass(), "propListHead", null);
        setIntField(term352284, term352284.getClass(), "sourcePosition", 0);
        setField(term352284, term352284.getClass(), "jsType", null);
        setField(term352284, term352284.getClass(), "parent", null);
        setField(term352283, term352283.getClass(), "first", term352284);
        setField(term352283, term352283.getClass(), "last", null);
        setField(term352283, term352283.getClass(), "propListHead", null);
        setIntField(term352283, term352283.getClass(), "sourcePosition", 0);
        setField(term352283, term352283.getClass(), "jsType", null);
        setField(term352283, term352283.getClass(), "parent", null);
        term352222 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term352225 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term352235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term352222, term352222.getClass(), "number", 0.0);
        setIntField(term352222, term352222.getClass(), "type", 16);
        setField(term352222, term352222.getClass(), "next", null);
        setField(term352225, term352225.getClass(), "functionName", null);
        setBooleanField(term352225, term352225.getClass(), "itsNeedsActivation", false);
        setIntField(term352225, term352225.getClass(), "itsFunctionType", 0);
        setBooleanField(term352225, term352225.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term352225, term352225.getClass(), "encodedSourceStart", 0);
        setIntField(term352225, term352225.getClass(), "encodedSourceEnd", 0);
        setField(term352225, term352225.getClass(), "sourceName", null);
        setIntField(term352225, term352225.getClass(), "baseLineno", 0);
        setIntField(term352225, term352225.getClass(), "endLineno", 0);
        setField(term352225, term352225.getClass(), "functions", null);
        setField(term352225, term352225.getClass(), "regexps", null);
        setField(term352225, term352225.getClass(), "itsVariables", null);
        setField(term352225, term352225.getClass(), "itsConst", null);
        setField(term352225, term352225.getClass(), "itsVariableNames", null);
        setIntField(term352225, term352225.getClass(), "varStart", 0);
        setField(term352225, term352225.getClass(), "compilerData", null);
        setIntField(term352225, term352225.getClass(), "type", 0);
        setIntField(term352235, term352235.getClass(), "type", 0);
        setField(term352235, term352235.getClass(), "next", null);
        setField(term352235, term352235.getClass(), "first", null);
        setField(term352235, term352235.getClass(), "last", null);
        setField(term352235, term352235.getClass(), "propListHead", null);
        setIntField(term352235, term352235.getClass(), "sourcePosition", 0);
        setField(term352235, term352235.getClass(), "jsType", null);
        setField(term352235, term352235.getClass(), "parent", null);
        setField(term352225, term352225.getClass(), "next", term352235);
        setField(term352225, term352225.getClass(), "first", null);
        setField(term352225, term352225.getClass(), "last", null);
        setField(term352225, term352225.getClass(), "propListHead", null);
        setIntField(term352225, term352225.getClass(), "sourcePosition", 0);
        setField(term352225, term352225.getClass(), "jsType", null);
        setField(term352225, term352225.getClass(), "parent", null);
        setField(term352222, term352222.getClass(), "first", term352225);
        setField(term352222, term352222.getClass(), "last", null);
        setField(term352222, term352222.getClass(), "propListHead", null);
        setIntField(term352222, term352222.getClass(), "sourcePosition", 0);
        setField(term352222, term352222.getClass(), "jsType", null);
        setField(term352222, term352222.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term351656;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term351564, args);
        assertTrue(recursiveEquals(term351564, term352282));
        assertTrue(recursiveEquals(term351656, term352283));
        assertTrue(recursiveEquals(retValue, term352222));
    }

};


