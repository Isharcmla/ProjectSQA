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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832448;
     Object term832534;
     Object term833582;
     Object term833583;
     Object term833516;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term832448 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term832534 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term832620 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term832690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term832620, term832620.getClass(), "next", term832690);
        setField(term832534, term832534.getClass(), "first", term832620);
        setIntField(term832534, term832534.getClass(), "type", 15);
        term833582 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term833582, term833582.getClass(), "currentTraversal", null);
        term833583 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term833584 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term833585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term833583, term833583.getClass(), "functionName", null);
        setBooleanField(term833583, term833583.getClass(), "itsNeedsActivation", false);
        setIntField(term833583, term833583.getClass(), "itsFunctionType", 0);
        setBooleanField(term833583, term833583.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term833583, term833583.getClass(), "encodedSourceStart", 0);
        setIntField(term833583, term833583.getClass(), "encodedSourceEnd", 0);
        setField(term833583, term833583.getClass(), "sourceName", null);
        setIntField(term833583, term833583.getClass(), "baseLineno", 0);
        setIntField(term833583, term833583.getClass(), "endLineno", 0);
        setField(term833583, term833583.getClass(), "functions", null);
        setField(term833583, term833583.getClass(), "regexps", null);
        setField(term833583, term833583.getClass(), "itsVariables", null);
        setField(term833583, term833583.getClass(), "itsConst", null);
        setField(term833583, term833583.getClass(), "itsVariableNames", null);
        setIntField(term833583, term833583.getClass(), "varStart", 0);
        setField(term833583, term833583.getClass(), "compilerData", null);
        setIntField(term833583, term833583.getClass(), "type", 15);
        setField(term833583, term833583.getClass(), "next", null);
        setField(term833584, term833584.getClass(), "functionName", null);
        setBooleanField(term833584, term833584.getClass(), "itsNeedsActivation", false);
        setIntField(term833584, term833584.getClass(), "itsFunctionType", 0);
        setBooleanField(term833584, term833584.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term833584, term833584.getClass(), "encodedSourceStart", 0);
        setIntField(term833584, term833584.getClass(), "encodedSourceEnd", 0);
        setField(term833584, term833584.getClass(), "sourceName", null);
        setIntField(term833584, term833584.getClass(), "baseLineno", 0);
        setIntField(term833584, term833584.getClass(), "endLineno", 0);
        setField(term833584, term833584.getClass(), "functions", null);
        setField(term833584, term833584.getClass(), "regexps", null);
        setField(term833584, term833584.getClass(), "itsVariables", null);
        setField(term833584, term833584.getClass(), "itsConst", null);
        setField(term833584, term833584.getClass(), "itsVariableNames", null);
        setIntField(term833584, term833584.getClass(), "varStart", 0);
        setField(term833584, term833584.getClass(), "compilerData", null);
        setIntField(term833584, term833584.getClass(), "type", 0);
        setIntField(term833585, term833585.getClass(), "type", 0);
        setField(term833585, term833585.getClass(), "next", null);
        setField(term833585, term833585.getClass(), "first", null);
        setField(term833585, term833585.getClass(), "last", null);
        setField(term833585, term833585.getClass(), "propListHead", null);
        setIntField(term833585, term833585.getClass(), "sourcePosition", 0);
        setField(term833585, term833585.getClass(), "jsType", null);
        setField(term833585, term833585.getClass(), "parent", null);
        setField(term833584, term833584.getClass(), "next", term833585);
        setField(term833584, term833584.getClass(), "first", null);
        setField(term833584, term833584.getClass(), "last", null);
        setField(term833584, term833584.getClass(), "propListHead", null);
        setIntField(term833584, term833584.getClass(), "sourcePosition", 0);
        setField(term833584, term833584.getClass(), "jsType", null);
        setField(term833584, term833584.getClass(), "parent", null);
        setField(term833583, term833583.getClass(), "first", term833584);
        setField(term833583, term833583.getClass(), "last", null);
        setField(term833583, term833583.getClass(), "propListHead", null);
        setIntField(term833583, term833583.getClass(), "sourcePosition", 0);
        setField(term833583, term833583.getClass(), "jsType", null);
        setField(term833583, term833583.getClass(), "parent", null);
        term833516 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term833526 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term833536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term833516, term833516.getClass(), "functionName", null);
        setBooleanField(term833516, term833516.getClass(), "itsNeedsActivation", false);
        setIntField(term833516, term833516.getClass(), "itsFunctionType", 0);
        setBooleanField(term833516, term833516.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term833516, term833516.getClass(), "encodedSourceStart", 0);
        setIntField(term833516, term833516.getClass(), "encodedSourceEnd", 0);
        setField(term833516, term833516.getClass(), "sourceName", null);
        setIntField(term833516, term833516.getClass(), "baseLineno", 0);
        setIntField(term833516, term833516.getClass(), "endLineno", 0);
        setField(term833516, term833516.getClass(), "functions", null);
        setField(term833516, term833516.getClass(), "regexps", null);
        setField(term833516, term833516.getClass(), "itsVariables", null);
        setField(term833516, term833516.getClass(), "itsConst", null);
        setField(term833516, term833516.getClass(), "itsVariableNames", null);
        setIntField(term833516, term833516.getClass(), "varStart", 0);
        setField(term833516, term833516.getClass(), "compilerData", null);
        setIntField(term833516, term833516.getClass(), "type", 15);
        setField(term833516, term833516.getClass(), "next", null);
        setField(term833526, term833526.getClass(), "functionName", null);
        setBooleanField(term833526, term833526.getClass(), "itsNeedsActivation", false);
        setIntField(term833526, term833526.getClass(), "itsFunctionType", 0);
        setBooleanField(term833526, term833526.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term833526, term833526.getClass(), "encodedSourceStart", 0);
        setIntField(term833526, term833526.getClass(), "encodedSourceEnd", 0);
        setField(term833526, term833526.getClass(), "sourceName", null);
        setIntField(term833526, term833526.getClass(), "baseLineno", 0);
        setIntField(term833526, term833526.getClass(), "endLineno", 0);
        setField(term833526, term833526.getClass(), "functions", null);
        setField(term833526, term833526.getClass(), "regexps", null);
        setField(term833526, term833526.getClass(), "itsVariables", null);
        setField(term833526, term833526.getClass(), "itsConst", null);
        setField(term833526, term833526.getClass(), "itsVariableNames", null);
        setIntField(term833526, term833526.getClass(), "varStart", 0);
        setField(term833526, term833526.getClass(), "compilerData", null);
        setIntField(term833526, term833526.getClass(), "type", 0);
        setIntField(term833536, term833536.getClass(), "type", 0);
        setField(term833536, term833536.getClass(), "next", null);
        setField(term833536, term833536.getClass(), "first", null);
        setField(term833536, term833536.getClass(), "last", null);
        setField(term833536, term833536.getClass(), "propListHead", null);
        setIntField(term833536, term833536.getClass(), "sourcePosition", 0);
        setField(term833536, term833536.getClass(), "jsType", null);
        setField(term833536, term833536.getClass(), "parent", null);
        setField(term833526, term833526.getClass(), "next", term833536);
        setField(term833526, term833526.getClass(), "first", null);
        setField(term833526, term833526.getClass(), "last", null);
        setField(term833526, term833526.getClass(), "propListHead", null);
        setIntField(term833526, term833526.getClass(), "sourcePosition", 0);
        setField(term833526, term833526.getClass(), "jsType", null);
        setField(term833526, term833526.getClass(), "parent", null);
        setField(term833516, term833516.getClass(), "first", term833526);
        setField(term833516, term833516.getClass(), "last", null);
        setField(term833516, term833516.getClass(), "propListHead", null);
        setIntField(term833516, term833516.getClass(), "sourcePosition", 0);
        setField(term833516, term833516.getClass(), "jsType", null);
        setField(term833516, term833516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term832534;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term832448, args);
        assertTrue(recursiveEquals(term832448, term833582));
        assertTrue(recursiveEquals(term832534, term833583));
        assertTrue(recursiveEquals(retValue, term833516));
    }

};


