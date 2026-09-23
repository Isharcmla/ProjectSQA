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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525728;
     Object term525820;
     Object term526057;
     Object term526058;
     Object term525997;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term525728 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term525820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term525906 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term525976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term525976, term525976.getClass(), "type", 42);
        setField(term525906, term525906.getClass(), "next", term525976);
        setIntField(term525906, term525906.getClass(), "type", 42);
        setField(term525820, term525820.getClass(), "first", term525906);
        setIntField(term525820, term525820.getClass(), "type", 16);
        term526057 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term526057, term526057.getClass(), "currentTraversal", null);
        term526058 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term526059 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term526060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term526058, term526058.getClass(), "str", null);
        setIntField(term526058, term526058.getClass(), "type", 16);
        setField(term526058, term526058.getClass(), "next", null);
        setField(term526059, term526059.getClass(), "functionName", null);
        setBooleanField(term526059, term526059.getClass(), "itsNeedsActivation", false);
        setIntField(term526059, term526059.getClass(), "itsFunctionType", 0);
        setBooleanField(term526059, term526059.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term526059, term526059.getClass(), "encodedSourceStart", 0);
        setIntField(term526059, term526059.getClass(), "encodedSourceEnd", 0);
        setField(term526059, term526059.getClass(), "sourceName", null);
        setIntField(term526059, term526059.getClass(), "baseLineno", 0);
        setIntField(term526059, term526059.getClass(), "endLineno", 0);
        setField(term526059, term526059.getClass(), "functions", null);
        setField(term526059, term526059.getClass(), "regexps", null);
        setField(term526059, term526059.getClass(), "itsVariables", null);
        setField(term526059, term526059.getClass(), "itsConst", null);
        setField(term526059, term526059.getClass(), "itsVariableNames", null);
        setIntField(term526059, term526059.getClass(), "varStart", 0);
        setField(term526059, term526059.getClass(), "compilerData", null);
        setIntField(term526059, term526059.getClass(), "type", 42);
        setIntField(term526060, term526060.getClass(), "type", 42);
        setField(term526060, term526060.getClass(), "next", null);
        setField(term526060, term526060.getClass(), "first", null);
        setField(term526060, term526060.getClass(), "last", null);
        setField(term526060, term526060.getClass(), "propListHead", null);
        setIntField(term526060, term526060.getClass(), "sourcePosition", 0);
        setField(term526060, term526060.getClass(), "jsType", null);
        setField(term526060, term526060.getClass(), "parent", null);
        setField(term526059, term526059.getClass(), "next", term526060);
        setField(term526059, term526059.getClass(), "first", null);
        setField(term526059, term526059.getClass(), "last", null);
        setField(term526059, term526059.getClass(), "propListHead", null);
        setIntField(term526059, term526059.getClass(), "sourcePosition", 0);
        setField(term526059, term526059.getClass(), "jsType", null);
        setField(term526059, term526059.getClass(), "parent", null);
        setField(term526058, term526058.getClass(), "first", term526059);
        setField(term526058, term526058.getClass(), "last", null);
        setField(term526058, term526058.getClass(), "propListHead", null);
        setIntField(term526058, term526058.getClass(), "sourcePosition", 0);
        setField(term526058, term526058.getClass(), "jsType", null);
        setField(term526058, term526058.getClass(), "parent", null);
        term525997 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term525999 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term526009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term525997, term525997.getClass(), "str", null);
        setIntField(term525997, term525997.getClass(), "type", 16);
        setField(term525997, term525997.getClass(), "next", null);
        setField(term525999, term525999.getClass(), "functionName", null);
        setBooleanField(term525999, term525999.getClass(), "itsNeedsActivation", false);
        setIntField(term525999, term525999.getClass(), "itsFunctionType", 0);
        setBooleanField(term525999, term525999.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term525999, term525999.getClass(), "encodedSourceStart", 0);
        setIntField(term525999, term525999.getClass(), "encodedSourceEnd", 0);
        setField(term525999, term525999.getClass(), "sourceName", null);
        setIntField(term525999, term525999.getClass(), "baseLineno", 0);
        setIntField(term525999, term525999.getClass(), "endLineno", 0);
        setField(term525999, term525999.getClass(), "functions", null);
        setField(term525999, term525999.getClass(), "regexps", null);
        setField(term525999, term525999.getClass(), "itsVariables", null);
        setField(term525999, term525999.getClass(), "itsConst", null);
        setField(term525999, term525999.getClass(), "itsVariableNames", null);
        setIntField(term525999, term525999.getClass(), "varStart", 0);
        setField(term525999, term525999.getClass(), "compilerData", null);
        setIntField(term525999, term525999.getClass(), "type", 42);
        setIntField(term526009, term526009.getClass(), "type", 42);
        setField(term526009, term526009.getClass(), "next", null);
        setField(term526009, term526009.getClass(), "first", null);
        setField(term526009, term526009.getClass(), "last", null);
        setField(term526009, term526009.getClass(), "propListHead", null);
        setIntField(term526009, term526009.getClass(), "sourcePosition", 0);
        setField(term526009, term526009.getClass(), "jsType", null);
        setField(term526009, term526009.getClass(), "parent", null);
        setField(term525999, term525999.getClass(), "next", term526009);
        setField(term525999, term525999.getClass(), "first", null);
        setField(term525999, term525999.getClass(), "last", null);
        setField(term525999, term525999.getClass(), "propListHead", null);
        setIntField(term525999, term525999.getClass(), "sourcePosition", 0);
        setField(term525999, term525999.getClass(), "jsType", null);
        setField(term525999, term525999.getClass(), "parent", null);
        setField(term525997, term525997.getClass(), "first", term525999);
        setField(term525997, term525997.getClass(), "last", null);
        setField(term525997, term525997.getClass(), "propListHead", null);
        setIntField(term525997, term525997.getClass(), "sourcePosition", 0);
        setField(term525997, term525997.getClass(), "jsType", null);
        setField(term525997, term525997.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term525820;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term525728, args);
        assertTrue(recursiveEquals(term525728, term526057));
        assertTrue(recursiveEquals(term525820, term526058));
        assertTrue(recursiveEquals(retValue, term525997));
    }

};


