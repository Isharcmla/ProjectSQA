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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274730;
     Object term274822;
     Object term275443;
     Object term275444;
     Object term275400;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274730 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term274822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term274908 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term274978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term274908, term274908.getClass(), "next", term274978);
        setField(term274822, term274822.getClass(), "first", term274908);
        setIntField(term274822, term274822.getClass(), "type", 18);
        term275443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term275443, term275443.getClass(), "currentTraversal", null);
        term275444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term275445 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term275446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term275444, term275444.getClass(), "str", null);
        setIntField(term275444, term275444.getClass(), "type", 18);
        setField(term275444, term275444.getClass(), "next", null);
        setField(term275445, term275445.getClass(), "functionName", null);
        setBooleanField(term275445, term275445.getClass(), "itsNeedsActivation", false);
        setIntField(term275445, term275445.getClass(), "itsFunctionType", 0);
        setBooleanField(term275445, term275445.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term275445, term275445.getClass(), "encodedSourceStart", 0);
        setIntField(term275445, term275445.getClass(), "encodedSourceEnd", 0);
        setField(term275445, term275445.getClass(), "sourceName", null);
        setIntField(term275445, term275445.getClass(), "baseLineno", 0);
        setIntField(term275445, term275445.getClass(), "endLineno", 0);
        setField(term275445, term275445.getClass(), "functions", null);
        setField(term275445, term275445.getClass(), "regexps", null);
        setField(term275445, term275445.getClass(), "itsVariables", null);
        setField(term275445, term275445.getClass(), "itsConst", null);
        setField(term275445, term275445.getClass(), "itsVariableNames", null);
        setIntField(term275445, term275445.getClass(), "varStart", 0);
        setField(term275445, term275445.getClass(), "compilerData", null);
        setIntField(term275445, term275445.getClass(), "type", 0);
        setIntField(term275446, term275446.getClass(), "type", 0);
        setField(term275446, term275446.getClass(), "next", null);
        setField(term275446, term275446.getClass(), "first", null);
        setField(term275446, term275446.getClass(), "last", null);
        setField(term275446, term275446.getClass(), "propListHead", null);
        setIntField(term275446, term275446.getClass(), "sourcePosition", 0);
        setField(term275446, term275446.getClass(), "jsType", null);
        setField(term275446, term275446.getClass(), "parent", null);
        setField(term275445, term275445.getClass(), "next", term275446);
        setField(term275445, term275445.getClass(), "first", null);
        setField(term275445, term275445.getClass(), "last", null);
        setField(term275445, term275445.getClass(), "propListHead", null);
        setIntField(term275445, term275445.getClass(), "sourcePosition", 0);
        setField(term275445, term275445.getClass(), "jsType", null);
        setField(term275445, term275445.getClass(), "parent", null);
        setField(term275444, term275444.getClass(), "first", term275445);
        setField(term275444, term275444.getClass(), "last", null);
        setField(term275444, term275444.getClass(), "propListHead", null);
        setIntField(term275444, term275444.getClass(), "sourcePosition", 0);
        setField(term275444, term275444.getClass(), "jsType", null);
        setField(term275444, term275444.getClass(), "parent", null);
        term275400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term275402 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term275412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term275400, term275400.getClass(), "str", null);
        setIntField(term275400, term275400.getClass(), "type", 18);
        setField(term275400, term275400.getClass(), "next", null);
        setField(term275402, term275402.getClass(), "functionName", null);
        setBooleanField(term275402, term275402.getClass(), "itsNeedsActivation", false);
        setIntField(term275402, term275402.getClass(), "itsFunctionType", 0);
        setBooleanField(term275402, term275402.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term275402, term275402.getClass(), "encodedSourceStart", 0);
        setIntField(term275402, term275402.getClass(), "encodedSourceEnd", 0);
        setField(term275402, term275402.getClass(), "sourceName", null);
        setIntField(term275402, term275402.getClass(), "baseLineno", 0);
        setIntField(term275402, term275402.getClass(), "endLineno", 0);
        setField(term275402, term275402.getClass(), "functions", null);
        setField(term275402, term275402.getClass(), "regexps", null);
        setField(term275402, term275402.getClass(), "itsVariables", null);
        setField(term275402, term275402.getClass(), "itsConst", null);
        setField(term275402, term275402.getClass(), "itsVariableNames", null);
        setIntField(term275402, term275402.getClass(), "varStart", 0);
        setField(term275402, term275402.getClass(), "compilerData", null);
        setIntField(term275402, term275402.getClass(), "type", 0);
        setIntField(term275412, term275412.getClass(), "type", 0);
        setField(term275412, term275412.getClass(), "next", null);
        setField(term275412, term275412.getClass(), "first", null);
        setField(term275412, term275412.getClass(), "last", null);
        setField(term275412, term275412.getClass(), "propListHead", null);
        setIntField(term275412, term275412.getClass(), "sourcePosition", 0);
        setField(term275412, term275412.getClass(), "jsType", null);
        setField(term275412, term275412.getClass(), "parent", null);
        setField(term275402, term275402.getClass(), "next", term275412);
        setField(term275402, term275402.getClass(), "first", null);
        setField(term275402, term275402.getClass(), "last", null);
        setField(term275402, term275402.getClass(), "propListHead", null);
        setIntField(term275402, term275402.getClass(), "sourcePosition", 0);
        setField(term275402, term275402.getClass(), "jsType", null);
        setField(term275402, term275402.getClass(), "parent", null);
        setField(term275400, term275400.getClass(), "first", term275402);
        setField(term275400, term275400.getClass(), "last", null);
        setField(term275400, term275400.getClass(), "propListHead", null);
        setIntField(term275400, term275400.getClass(), "sourcePosition", 0);
        setField(term275400, term275400.getClass(), "jsType", null);
        setField(term275400, term275400.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term274822;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term274730, args);
        assertTrue(recursiveEquals(term274730, term275443));
        assertTrue(recursiveEquals(term274822, term275444));
        assertTrue(recursiveEquals(retValue, term275400));
    }

};


