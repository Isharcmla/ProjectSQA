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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777657;
     Object term777749;
     Object term777988;
     Object term777989;
     Object term777926;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term777657 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term777749 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term777835 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term777905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term777835, term777835.getClass(), "next", term777905);
        setField(term777749, term777749.getClass(), "first", term777835);
        setIntField(term777749, term777749.getClass(), "type", 14);
        term777988 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term777988, term777988.getClass(), "currentTraversal", null);
        term777989 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term777990 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term777991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term777989, term777989.getClass(), "number", 0.0);
        setIntField(term777989, term777989.getClass(), "type", 14);
        setField(term777989, term777989.getClass(), "next", null);
        setField(term777990, term777990.getClass(), "functionName", null);
        setBooleanField(term777990, term777990.getClass(), "itsNeedsActivation", false);
        setIntField(term777990, term777990.getClass(), "itsFunctionType", 0);
        setBooleanField(term777990, term777990.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term777990, term777990.getClass(), "encodedSourceStart", 0);
        setIntField(term777990, term777990.getClass(), "encodedSourceEnd", 0);
        setField(term777990, term777990.getClass(), "sourceName", null);
        setIntField(term777990, term777990.getClass(), "baseLineno", 0);
        setIntField(term777990, term777990.getClass(), "endLineno", 0);
        setField(term777990, term777990.getClass(), "functions", null);
        setField(term777990, term777990.getClass(), "regexps", null);
        setField(term777990, term777990.getClass(), "itsVariables", null);
        setField(term777990, term777990.getClass(), "itsConst", null);
        setField(term777990, term777990.getClass(), "itsVariableNames", null);
        setIntField(term777990, term777990.getClass(), "varStart", 0);
        setField(term777990, term777990.getClass(), "compilerData", null);
        setIntField(term777990, term777990.getClass(), "type", 0);
        setIntField(term777991, term777991.getClass(), "type", 0);
        setField(term777991, term777991.getClass(), "next", null);
        setField(term777991, term777991.getClass(), "first", null);
        setField(term777991, term777991.getClass(), "last", null);
        setField(term777991, term777991.getClass(), "propListHead", null);
        setIntField(term777991, term777991.getClass(), "sourcePosition", 0);
        setField(term777991, term777991.getClass(), "jsType", null);
        setField(term777991, term777991.getClass(), "parent", null);
        setField(term777990, term777990.getClass(), "next", term777991);
        setField(term777990, term777990.getClass(), "first", null);
        setField(term777990, term777990.getClass(), "last", null);
        setField(term777990, term777990.getClass(), "propListHead", null);
        setIntField(term777990, term777990.getClass(), "sourcePosition", 0);
        setField(term777990, term777990.getClass(), "jsType", null);
        setField(term777990, term777990.getClass(), "parent", null);
        setField(term777989, term777989.getClass(), "first", term777990);
        setField(term777989, term777989.getClass(), "last", null);
        setField(term777989, term777989.getClass(), "propListHead", null);
        setIntField(term777989, term777989.getClass(), "sourcePosition", 0);
        setField(term777989, term777989.getClass(), "jsType", null);
        setField(term777989, term777989.getClass(), "parent", null);
        term777926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term777929 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term777939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term777926, term777926.getClass(), "number", 0.0);
        setIntField(term777926, term777926.getClass(), "type", 14);
        setField(term777926, term777926.getClass(), "next", null);
        setField(term777929, term777929.getClass(), "functionName", null);
        setBooleanField(term777929, term777929.getClass(), "itsNeedsActivation", false);
        setIntField(term777929, term777929.getClass(), "itsFunctionType", 0);
        setBooleanField(term777929, term777929.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term777929, term777929.getClass(), "encodedSourceStart", 0);
        setIntField(term777929, term777929.getClass(), "encodedSourceEnd", 0);
        setField(term777929, term777929.getClass(), "sourceName", null);
        setIntField(term777929, term777929.getClass(), "baseLineno", 0);
        setIntField(term777929, term777929.getClass(), "endLineno", 0);
        setField(term777929, term777929.getClass(), "functions", null);
        setField(term777929, term777929.getClass(), "regexps", null);
        setField(term777929, term777929.getClass(), "itsVariables", null);
        setField(term777929, term777929.getClass(), "itsConst", null);
        setField(term777929, term777929.getClass(), "itsVariableNames", null);
        setIntField(term777929, term777929.getClass(), "varStart", 0);
        setField(term777929, term777929.getClass(), "compilerData", null);
        setIntField(term777929, term777929.getClass(), "type", 0);
        setIntField(term777939, term777939.getClass(), "type", 0);
        setField(term777939, term777939.getClass(), "next", null);
        setField(term777939, term777939.getClass(), "first", null);
        setField(term777939, term777939.getClass(), "last", null);
        setField(term777939, term777939.getClass(), "propListHead", null);
        setIntField(term777939, term777939.getClass(), "sourcePosition", 0);
        setField(term777939, term777939.getClass(), "jsType", null);
        setField(term777939, term777939.getClass(), "parent", null);
        setField(term777929, term777929.getClass(), "next", term777939);
        setField(term777929, term777929.getClass(), "first", null);
        setField(term777929, term777929.getClass(), "last", null);
        setField(term777929, term777929.getClass(), "propListHead", null);
        setIntField(term777929, term777929.getClass(), "sourcePosition", 0);
        setField(term777929, term777929.getClass(), "jsType", null);
        setField(term777929, term777929.getClass(), "parent", null);
        setField(term777926, term777926.getClass(), "first", term777929);
        setField(term777926, term777926.getClass(), "last", null);
        setField(term777926, term777926.getClass(), "propListHead", null);
        setIntField(term777926, term777926.getClass(), "sourcePosition", 0);
        setField(term777926, term777926.getClass(), "jsType", null);
        setField(term777926, term777926.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term777749;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term777657, args);
        assertTrue(recursiveEquals(term777657, term777988));
        assertTrue(recursiveEquals(term777749, term777989));
        assertTrue(recursiveEquals(retValue, term777926));
    }

};


