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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589246;
     Object term589338;
     Object term589571;
     Object term589572;
     Object term589509;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589246 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term589338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term589424 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term589494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term589424, term589424.getClass(), "next", term589494);
        setField(term589338, term589338.getClass(), "first", term589424);
        setIntField(term589338, term589338.getClass(), "type", 14);
        term589571 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term589571, term589571.getClass(), "currentTraversal", null);
        term589572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term589573 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term589574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term589572, term589572.getClass(), "number", 0.0);
        setIntField(term589572, term589572.getClass(), "type", 14);
        setField(term589572, term589572.getClass(), "next", null);
        setField(term589573, term589573.getClass(), "functionName", null);
        setBooleanField(term589573, term589573.getClass(), "itsNeedsActivation", false);
        setIntField(term589573, term589573.getClass(), "itsFunctionType", 0);
        setBooleanField(term589573, term589573.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term589573, term589573.getClass(), "encodedSourceStart", 0);
        setIntField(term589573, term589573.getClass(), "encodedSourceEnd", 0);
        setField(term589573, term589573.getClass(), "sourceName", null);
        setIntField(term589573, term589573.getClass(), "baseLineno", 0);
        setIntField(term589573, term589573.getClass(), "endLineno", 0);
        setField(term589573, term589573.getClass(), "functions", null);
        setField(term589573, term589573.getClass(), "regexps", null);
        setField(term589573, term589573.getClass(), "itsVariables", null);
        setField(term589573, term589573.getClass(), "itsConst", null);
        setField(term589573, term589573.getClass(), "itsVariableNames", null);
        setIntField(term589573, term589573.getClass(), "varStart", 0);
        setField(term589573, term589573.getClass(), "compilerData", null);
        setIntField(term589573, term589573.getClass(), "type", 0);
        setIntField(term589574, term589574.getClass(), "type", 0);
        setField(term589574, term589574.getClass(), "next", null);
        setField(term589574, term589574.getClass(), "first", null);
        setField(term589574, term589574.getClass(), "last", null);
        setField(term589574, term589574.getClass(), "propListHead", null);
        setIntField(term589574, term589574.getClass(), "sourcePosition", 0);
        setField(term589574, term589574.getClass(), "jsType", null);
        setField(term589574, term589574.getClass(), "parent", null);
        setField(term589573, term589573.getClass(), "next", term589574);
        setField(term589573, term589573.getClass(), "first", null);
        setField(term589573, term589573.getClass(), "last", null);
        setField(term589573, term589573.getClass(), "propListHead", null);
        setIntField(term589573, term589573.getClass(), "sourcePosition", 0);
        setField(term589573, term589573.getClass(), "jsType", null);
        setField(term589573, term589573.getClass(), "parent", null);
        setField(term589572, term589572.getClass(), "first", term589573);
        setField(term589572, term589572.getClass(), "last", null);
        setField(term589572, term589572.getClass(), "propListHead", null);
        setIntField(term589572, term589572.getClass(), "sourcePosition", 0);
        setField(term589572, term589572.getClass(), "jsType", null);
        setField(term589572, term589572.getClass(), "parent", null);
        term589509 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term589512 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term589522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term589509, term589509.getClass(), "number", 0.0);
        setIntField(term589509, term589509.getClass(), "type", 14);
        setField(term589509, term589509.getClass(), "next", null);
        setField(term589512, term589512.getClass(), "functionName", null);
        setBooleanField(term589512, term589512.getClass(), "itsNeedsActivation", false);
        setIntField(term589512, term589512.getClass(), "itsFunctionType", 0);
        setBooleanField(term589512, term589512.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term589512, term589512.getClass(), "encodedSourceStart", 0);
        setIntField(term589512, term589512.getClass(), "encodedSourceEnd", 0);
        setField(term589512, term589512.getClass(), "sourceName", null);
        setIntField(term589512, term589512.getClass(), "baseLineno", 0);
        setIntField(term589512, term589512.getClass(), "endLineno", 0);
        setField(term589512, term589512.getClass(), "functions", null);
        setField(term589512, term589512.getClass(), "regexps", null);
        setField(term589512, term589512.getClass(), "itsVariables", null);
        setField(term589512, term589512.getClass(), "itsConst", null);
        setField(term589512, term589512.getClass(), "itsVariableNames", null);
        setIntField(term589512, term589512.getClass(), "varStart", 0);
        setField(term589512, term589512.getClass(), "compilerData", null);
        setIntField(term589512, term589512.getClass(), "type", 0);
        setIntField(term589522, term589522.getClass(), "type", 0);
        setField(term589522, term589522.getClass(), "next", null);
        setField(term589522, term589522.getClass(), "first", null);
        setField(term589522, term589522.getClass(), "last", null);
        setField(term589522, term589522.getClass(), "propListHead", null);
        setIntField(term589522, term589522.getClass(), "sourcePosition", 0);
        setField(term589522, term589522.getClass(), "jsType", null);
        setField(term589522, term589522.getClass(), "parent", null);
        setField(term589512, term589512.getClass(), "next", term589522);
        setField(term589512, term589512.getClass(), "first", null);
        setField(term589512, term589512.getClass(), "last", null);
        setField(term589512, term589512.getClass(), "propListHead", null);
        setIntField(term589512, term589512.getClass(), "sourcePosition", 0);
        setField(term589512, term589512.getClass(), "jsType", null);
        setField(term589512, term589512.getClass(), "parent", null);
        setField(term589509, term589509.getClass(), "first", term589512);
        setField(term589509, term589509.getClass(), "last", null);
        setField(term589509, term589509.getClass(), "propListHead", null);
        setIntField(term589509, term589509.getClass(), "sourcePosition", 0);
        setField(term589509, term589509.getClass(), "jsType", null);
        setField(term589509, term589509.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term589338;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term589246, args);
        assertTrue(recursiveEquals(term589246, term589571));
        assertTrue(recursiveEquals(term589338, term589572));
        assertTrue(recursiveEquals(retValue, term589509));
    }

};


