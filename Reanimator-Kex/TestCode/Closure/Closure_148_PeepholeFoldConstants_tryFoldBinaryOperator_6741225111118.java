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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262930;
     Object term263022;
     Object term263298;
     Object term263299;
     Object term263249;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262930 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term263022 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term263108 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term263178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term263108, term263108.getClass(), "next", term263178);
        setField(term263022, term263022.getClass(), "first", term263108);
        setIntField(term263022, term263022.getClass(), "type", 9);
        term263298 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term263298, term263298.getClass(), "currentTraversal", null);
        term263299 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term263300 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term263301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term263299, term263299.getClass(), "str", null);
        setIntField(term263299, term263299.getClass(), "type", 9);
        setField(term263299, term263299.getClass(), "next", null);
        setField(term263300, term263300.getClass(), "functionName", null);
        setBooleanField(term263300, term263300.getClass(), "itsNeedsActivation", false);
        setIntField(term263300, term263300.getClass(), "itsFunctionType", 0);
        setBooleanField(term263300, term263300.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term263300, term263300.getClass(), "encodedSourceStart", 0);
        setIntField(term263300, term263300.getClass(), "encodedSourceEnd", 0);
        setField(term263300, term263300.getClass(), "sourceName", null);
        setIntField(term263300, term263300.getClass(), "baseLineno", 0);
        setIntField(term263300, term263300.getClass(), "endLineno", 0);
        setField(term263300, term263300.getClass(), "functions", null);
        setField(term263300, term263300.getClass(), "regexps", null);
        setField(term263300, term263300.getClass(), "itsVariables", null);
        setField(term263300, term263300.getClass(), "itsConst", null);
        setField(term263300, term263300.getClass(), "itsVariableNames", null);
        setIntField(term263300, term263300.getClass(), "varStart", 0);
        setField(term263300, term263300.getClass(), "compilerData", null);
        setIntField(term263300, term263300.getClass(), "type", 0);
        setIntField(term263301, term263301.getClass(), "type", 0);
        setField(term263301, term263301.getClass(), "next", null);
        setField(term263301, term263301.getClass(), "first", null);
        setField(term263301, term263301.getClass(), "last", null);
        setField(term263301, term263301.getClass(), "propListHead", null);
        setIntField(term263301, term263301.getClass(), "sourcePosition", 0);
        setField(term263301, term263301.getClass(), "jsType", null);
        setField(term263301, term263301.getClass(), "parent", null);
        setField(term263300, term263300.getClass(), "next", term263301);
        setField(term263300, term263300.getClass(), "first", null);
        setField(term263300, term263300.getClass(), "last", null);
        setField(term263300, term263300.getClass(), "propListHead", null);
        setIntField(term263300, term263300.getClass(), "sourcePosition", 0);
        setField(term263300, term263300.getClass(), "jsType", null);
        setField(term263300, term263300.getClass(), "parent", null);
        setField(term263299, term263299.getClass(), "first", term263300);
        setField(term263299, term263299.getClass(), "last", null);
        setField(term263299, term263299.getClass(), "propListHead", null);
        setIntField(term263299, term263299.getClass(), "sourcePosition", 0);
        setField(term263299, term263299.getClass(), "jsType", null);
        setField(term263299, term263299.getClass(), "parent", null);
        term263249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term263251 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term263261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term263249, term263249.getClass(), "str", null);
        setIntField(term263249, term263249.getClass(), "type", 9);
        setField(term263249, term263249.getClass(), "next", null);
        setField(term263251, term263251.getClass(), "functionName", null);
        setBooleanField(term263251, term263251.getClass(), "itsNeedsActivation", false);
        setIntField(term263251, term263251.getClass(), "itsFunctionType", 0);
        setBooleanField(term263251, term263251.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term263251, term263251.getClass(), "encodedSourceStart", 0);
        setIntField(term263251, term263251.getClass(), "encodedSourceEnd", 0);
        setField(term263251, term263251.getClass(), "sourceName", null);
        setIntField(term263251, term263251.getClass(), "baseLineno", 0);
        setIntField(term263251, term263251.getClass(), "endLineno", 0);
        setField(term263251, term263251.getClass(), "functions", null);
        setField(term263251, term263251.getClass(), "regexps", null);
        setField(term263251, term263251.getClass(), "itsVariables", null);
        setField(term263251, term263251.getClass(), "itsConst", null);
        setField(term263251, term263251.getClass(), "itsVariableNames", null);
        setIntField(term263251, term263251.getClass(), "varStart", 0);
        setField(term263251, term263251.getClass(), "compilerData", null);
        setIntField(term263251, term263251.getClass(), "type", 0);
        setIntField(term263261, term263261.getClass(), "type", 0);
        setField(term263261, term263261.getClass(), "next", null);
        setField(term263261, term263261.getClass(), "first", null);
        setField(term263261, term263261.getClass(), "last", null);
        setField(term263261, term263261.getClass(), "propListHead", null);
        setIntField(term263261, term263261.getClass(), "sourcePosition", 0);
        setField(term263261, term263261.getClass(), "jsType", null);
        setField(term263261, term263261.getClass(), "parent", null);
        setField(term263251, term263251.getClass(), "next", term263261);
        setField(term263251, term263251.getClass(), "first", null);
        setField(term263251, term263251.getClass(), "last", null);
        setField(term263251, term263251.getClass(), "propListHead", null);
        setIntField(term263251, term263251.getClass(), "sourcePosition", 0);
        setField(term263251, term263251.getClass(), "jsType", null);
        setField(term263251, term263251.getClass(), "parent", null);
        setField(term263249, term263249.getClass(), "first", term263251);
        setField(term263249, term263249.getClass(), "last", null);
        setField(term263249, term263249.getClass(), "propListHead", null);
        setIntField(term263249, term263249.getClass(), "sourcePosition", 0);
        setField(term263249, term263249.getClass(), "jsType", null);
        setField(term263249, term263249.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term263022;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term262930, args);
        assertTrue(recursiveEquals(term262930, term263298));
        assertTrue(recursiveEquals(term263022, term263299));
        assertTrue(recursiveEquals(retValue, term263249));
    }

};


