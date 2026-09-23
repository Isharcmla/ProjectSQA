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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403112;
     Object term403204;
     Object term421049;
     Object term421050;
     Object term420999;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term403204 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term403290 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term403360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term403290, term403290.getClass(), "next", term403360);
        setField(term403204, term403204.getClass(), "first", term403290);
        setIntField(term403204, term403204.getClass(), "type", 12);
        term421049 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term421049, term421049.getClass(), "currentTraversal", null);
        term421050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421051 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term421052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term421050, term421050.getClass(), "str", null);
        setIntField(term421050, term421050.getClass(), "type", 12);
        setField(term421050, term421050.getClass(), "next", null);
        setField(term421051, term421051.getClass(), "functionName", null);
        setBooleanField(term421051, term421051.getClass(), "itsNeedsActivation", false);
        setIntField(term421051, term421051.getClass(), "itsFunctionType", 0);
        setBooleanField(term421051, term421051.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term421051, term421051.getClass(), "encodedSourceStart", 0);
        setIntField(term421051, term421051.getClass(), "encodedSourceEnd", 0);
        setField(term421051, term421051.getClass(), "sourceName", null);
        setIntField(term421051, term421051.getClass(), "baseLineno", 0);
        setIntField(term421051, term421051.getClass(), "endLineno", 0);
        setField(term421051, term421051.getClass(), "functions", null);
        setField(term421051, term421051.getClass(), "regexps", null);
        setField(term421051, term421051.getClass(), "itsVariables", null);
        setField(term421051, term421051.getClass(), "itsConst", null);
        setField(term421051, term421051.getClass(), "itsVariableNames", null);
        setIntField(term421051, term421051.getClass(), "varStart", 0);
        setField(term421051, term421051.getClass(), "compilerData", null);
        setIntField(term421051, term421051.getClass(), "type", 0);
        setIntField(term421052, term421052.getClass(), "type", 0);
        setField(term421052, term421052.getClass(), "next", null);
        setField(term421052, term421052.getClass(), "first", null);
        setField(term421052, term421052.getClass(), "last", null);
        setField(term421052, term421052.getClass(), "propListHead", null);
        setIntField(term421052, term421052.getClass(), "sourcePosition", 0);
        setField(term421052, term421052.getClass(), "jsType", null);
        setField(term421052, term421052.getClass(), "parent", null);
        setField(term421051, term421051.getClass(), "next", term421052);
        setField(term421051, term421051.getClass(), "first", null);
        setField(term421051, term421051.getClass(), "last", null);
        setField(term421051, term421051.getClass(), "propListHead", null);
        setIntField(term421051, term421051.getClass(), "sourcePosition", 0);
        setField(term421051, term421051.getClass(), "jsType", null);
        setField(term421051, term421051.getClass(), "parent", null);
        setField(term421050, term421050.getClass(), "first", term421051);
        setField(term421050, term421050.getClass(), "last", null);
        setField(term421050, term421050.getClass(), "propListHead", null);
        setIntField(term421050, term421050.getClass(), "sourcePosition", 0);
        setField(term421050, term421050.getClass(), "jsType", null);
        setField(term421050, term421050.getClass(), "parent", null);
        term420999 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421001 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term421011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term420999, term420999.getClass(), "str", null);
        setIntField(term420999, term420999.getClass(), "type", 12);
        setField(term420999, term420999.getClass(), "next", null);
        setField(term421001, term421001.getClass(), "functionName", null);
        setBooleanField(term421001, term421001.getClass(), "itsNeedsActivation", false);
        setIntField(term421001, term421001.getClass(), "itsFunctionType", 0);
        setBooleanField(term421001, term421001.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term421001, term421001.getClass(), "encodedSourceStart", 0);
        setIntField(term421001, term421001.getClass(), "encodedSourceEnd", 0);
        setField(term421001, term421001.getClass(), "sourceName", null);
        setIntField(term421001, term421001.getClass(), "baseLineno", 0);
        setIntField(term421001, term421001.getClass(), "endLineno", 0);
        setField(term421001, term421001.getClass(), "functions", null);
        setField(term421001, term421001.getClass(), "regexps", null);
        setField(term421001, term421001.getClass(), "itsVariables", null);
        setField(term421001, term421001.getClass(), "itsConst", null);
        setField(term421001, term421001.getClass(), "itsVariableNames", null);
        setIntField(term421001, term421001.getClass(), "varStart", 0);
        setField(term421001, term421001.getClass(), "compilerData", null);
        setIntField(term421001, term421001.getClass(), "type", 0);
        setIntField(term421011, term421011.getClass(), "type", 0);
        setField(term421011, term421011.getClass(), "next", null);
        setField(term421011, term421011.getClass(), "first", null);
        setField(term421011, term421011.getClass(), "last", null);
        setField(term421011, term421011.getClass(), "propListHead", null);
        setIntField(term421011, term421011.getClass(), "sourcePosition", 0);
        setField(term421011, term421011.getClass(), "jsType", null);
        setField(term421011, term421011.getClass(), "parent", null);
        setField(term421001, term421001.getClass(), "next", term421011);
        setField(term421001, term421001.getClass(), "first", null);
        setField(term421001, term421001.getClass(), "last", null);
        setField(term421001, term421001.getClass(), "propListHead", null);
        setIntField(term421001, term421001.getClass(), "sourcePosition", 0);
        setField(term421001, term421001.getClass(), "jsType", null);
        setField(term421001, term421001.getClass(), "parent", null);
        setField(term420999, term420999.getClass(), "first", term421001);
        setField(term420999, term420999.getClass(), "last", null);
        setField(term420999, term420999.getClass(), "propListHead", null);
        setIntField(term420999, term420999.getClass(), "sourcePosition", 0);
        setField(term420999, term420999.getClass(), "jsType", null);
        setField(term420999, term420999.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term403204;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term403112, args);
        assertTrue(recursiveEquals(term403112, term421049));
        assertTrue(recursiveEquals(term403204, term421050));
        assertTrue(recursiveEquals(retValue, term420999));
    }

};


