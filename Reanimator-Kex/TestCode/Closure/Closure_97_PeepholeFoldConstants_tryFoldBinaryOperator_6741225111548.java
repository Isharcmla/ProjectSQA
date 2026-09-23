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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568022;
     Object term568114;
     Object term568443;
     Object term568444;
     Object term568372;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568022 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term568114 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568200 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term568292 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term568200, term568200.getClass(), "next", term568292);
        setIntField(term568200, term568200.getClass(), "type", 0);
        setField(term568114, term568114.getClass(), "first", term568200);
        setIntField(term568114, term568114.getClass(), "type", 101);
        setField(term568114, term568114.getClass(), "parent", null);
        term568443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term568443, term568443.getClass(), "currentTraversal", null);
        term568444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568445 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term568446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term568444, term568444.getClass(), "number", 0.0);
        setIntField(term568444, term568444.getClass(), "type", 101);
        setField(term568444, term568444.getClass(), "next", null);
        setField(term568445, term568445.getClass(), "functionName", null);
        setBooleanField(term568445, term568445.getClass(), "itsNeedsActivation", false);
        setIntField(term568445, term568445.getClass(), "itsFunctionType", 0);
        setBooleanField(term568445, term568445.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term568445, term568445.getClass(), "encodedSourceStart", 0);
        setIntField(term568445, term568445.getClass(), "encodedSourceEnd", 0);
        setField(term568445, term568445.getClass(), "sourceName", null);
        setIntField(term568445, term568445.getClass(), "baseLineno", 0);
        setIntField(term568445, term568445.getClass(), "endLineno", 0);
        setField(term568445, term568445.getClass(), "functions", null);
        setField(term568445, term568445.getClass(), "regexps", null);
        setField(term568445, term568445.getClass(), "itsVariables", null);
        setField(term568445, term568445.getClass(), "itsConst", null);
        setField(term568445, term568445.getClass(), "itsVariableNames", null);
        setIntField(term568445, term568445.getClass(), "varStart", 0);
        setField(term568445, term568445.getClass(), "compilerData", null);
        setIntField(term568445, term568445.getClass(), "type", 0);
        setField(term568446, term568446.getClass(), "str", null);
        setIntField(term568446, term568446.getClass(), "type", 0);
        setField(term568446, term568446.getClass(), "next", null);
        setField(term568446, term568446.getClass(), "first", null);
        setField(term568446, term568446.getClass(), "last", null);
        setField(term568446, term568446.getClass(), "propListHead", null);
        setIntField(term568446, term568446.getClass(), "sourcePosition", 0);
        setField(term568446, term568446.getClass(), "jsType", null);
        setField(term568446, term568446.getClass(), "parent", null);
        setField(term568445, term568445.getClass(), "next", term568446);
        setField(term568445, term568445.getClass(), "first", null);
        setField(term568445, term568445.getClass(), "last", null);
        setField(term568445, term568445.getClass(), "propListHead", null);
        setIntField(term568445, term568445.getClass(), "sourcePosition", 0);
        setField(term568445, term568445.getClass(), "jsType", null);
        setField(term568445, term568445.getClass(), "parent", null);
        setField(term568444, term568444.getClass(), "first", term568445);
        setField(term568444, term568444.getClass(), "last", null);
        setField(term568444, term568444.getClass(), "propListHead", null);
        setIntField(term568444, term568444.getClass(), "sourcePosition", 0);
        setField(term568444, term568444.getClass(), "jsType", null);
        setField(term568444, term568444.getClass(), "parent", null);
        term568372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568375 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term568385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term568372, term568372.getClass(), "number", 0.0);
        setIntField(term568372, term568372.getClass(), "type", 101);
        setField(term568372, term568372.getClass(), "next", null);
        setField(term568375, term568375.getClass(), "functionName", null);
        setBooleanField(term568375, term568375.getClass(), "itsNeedsActivation", false);
        setIntField(term568375, term568375.getClass(), "itsFunctionType", 0);
        setBooleanField(term568375, term568375.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term568375, term568375.getClass(), "encodedSourceStart", 0);
        setIntField(term568375, term568375.getClass(), "encodedSourceEnd", 0);
        setField(term568375, term568375.getClass(), "sourceName", null);
        setIntField(term568375, term568375.getClass(), "baseLineno", 0);
        setIntField(term568375, term568375.getClass(), "endLineno", 0);
        setField(term568375, term568375.getClass(), "functions", null);
        setField(term568375, term568375.getClass(), "regexps", null);
        setField(term568375, term568375.getClass(), "itsVariables", null);
        setField(term568375, term568375.getClass(), "itsConst", null);
        setField(term568375, term568375.getClass(), "itsVariableNames", null);
        setIntField(term568375, term568375.getClass(), "varStart", 0);
        setField(term568375, term568375.getClass(), "compilerData", null);
        setIntField(term568375, term568375.getClass(), "type", 0);
        setField(term568385, term568385.getClass(), "str", null);
        setIntField(term568385, term568385.getClass(), "type", 0);
        setField(term568385, term568385.getClass(), "next", null);
        setField(term568385, term568385.getClass(), "first", null);
        setField(term568385, term568385.getClass(), "last", null);
        setField(term568385, term568385.getClass(), "propListHead", null);
        setIntField(term568385, term568385.getClass(), "sourcePosition", 0);
        setField(term568385, term568385.getClass(), "jsType", null);
        setField(term568385, term568385.getClass(), "parent", null);
        setField(term568375, term568375.getClass(), "next", term568385);
        setField(term568375, term568375.getClass(), "first", null);
        setField(term568375, term568375.getClass(), "last", null);
        setField(term568375, term568375.getClass(), "propListHead", null);
        setIntField(term568375, term568375.getClass(), "sourcePosition", 0);
        setField(term568375, term568375.getClass(), "jsType", null);
        setField(term568375, term568375.getClass(), "parent", null);
        setField(term568372, term568372.getClass(), "first", term568375);
        setField(term568372, term568372.getClass(), "last", null);
        setField(term568372, term568372.getClass(), "propListHead", null);
        setIntField(term568372, term568372.getClass(), "sourcePosition", 0);
        setField(term568372, term568372.getClass(), "jsType", null);
        setField(term568372, term568372.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term568114;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term568022, args);
        assertTrue(recursiveEquals(term568022, term568443));
        assertTrue(recursiveEquals(term568114, term568444));
        assertTrue(recursiveEquals(retValue, term568372));
    }

};


