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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268803;
     Object term268889;
     Object term269422;
     Object term269423;
     Object term269378;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268803 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term268889 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term268959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term268889, term268889.getClass(), "first", term268889);
        setField(term268889, term268889.getClass(), "next", term268959);
        setIntField(term268889, term268889.getClass(), "type", 12);
        term269422 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term269422, term269422.getClass(), "currentTraversal", null);
        term269423 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term269424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term269423, term269423.getClass(), "functionName", null);
        setBooleanField(term269423, term269423.getClass(), "itsNeedsActivation", false);
        setIntField(term269423, term269423.getClass(), "itsFunctionType", 0);
        setBooleanField(term269423, term269423.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term269423, term269423.getClass(), "encodedSourceStart", 0);
        setIntField(term269423, term269423.getClass(), "encodedSourceEnd", 0);
        setField(term269423, term269423.getClass(), "sourceName", null);
        setIntField(term269423, term269423.getClass(), "baseLineno", 0);
        setIntField(term269423, term269423.getClass(), "endLineno", 0);
        setField(term269423, term269423.getClass(), "functions", null);
        setField(term269423, term269423.getClass(), "regexps", null);
        setField(term269423, term269423.getClass(), "itsVariables", null);
        setField(term269423, term269423.getClass(), "itsConst", null);
        setField(term269423, term269423.getClass(), "itsVariableNames", null);
        setIntField(term269423, term269423.getClass(), "varStart", 0);
        setField(term269423, term269423.getClass(), "compilerData", null);
        setIntField(term269423, term269423.getClass(), "type", 12);
        setIntField(term269424, term269424.getClass(), "type", 0);
        setField(term269424, term269424.getClass(), "next", null);
        setField(term269424, term269424.getClass(), "first", null);
        setField(term269424, term269424.getClass(), "last", null);
        setField(term269424, term269424.getClass(), "propListHead", null);
        setIntField(term269424, term269424.getClass(), "sourcePosition", 0);
        setField(term269424, term269424.getClass(), "jsType", null);
        setField(term269424, term269424.getClass(), "parent", null);
        setField(term269423, term269423.getClass(), "next", term269424);
        setField(term269423, term269423.getClass(), "first", term269423);
        setField(term269423, term269423.getClass(), "last", null);
        setField(term269423, term269423.getClass(), "propListHead", null);
        setIntField(term269423, term269423.getClass(), "sourcePosition", 0);
        setField(term269423, term269423.getClass(), "jsType", null);
        setField(term269423, term269423.getClass(), "parent", null);
        term269378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term269388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term269378, term269378.getClass(), "functionName", null);
        setBooleanField(term269378, term269378.getClass(), "itsNeedsActivation", false);
        setIntField(term269378, term269378.getClass(), "itsFunctionType", 0);
        setBooleanField(term269378, term269378.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term269378, term269378.getClass(), "encodedSourceStart", 0);
        setIntField(term269378, term269378.getClass(), "encodedSourceEnd", 0);
        setField(term269378, term269378.getClass(), "sourceName", null);
        setIntField(term269378, term269378.getClass(), "baseLineno", 0);
        setIntField(term269378, term269378.getClass(), "endLineno", 0);
        setField(term269378, term269378.getClass(), "functions", null);
        setField(term269378, term269378.getClass(), "regexps", null);
        setField(term269378, term269378.getClass(), "itsVariables", null);
        setField(term269378, term269378.getClass(), "itsConst", null);
        setField(term269378, term269378.getClass(), "itsVariableNames", null);
        setIntField(term269378, term269378.getClass(), "varStart", 0);
        setField(term269378, term269378.getClass(), "compilerData", null);
        setIntField(term269378, term269378.getClass(), "type", 12);
        setIntField(term269388, term269388.getClass(), "type", 0);
        setField(term269388, term269388.getClass(), "next", null);
        setField(term269388, term269388.getClass(), "first", null);
        setField(term269388, term269388.getClass(), "last", null);
        setField(term269388, term269388.getClass(), "propListHead", null);
        setIntField(term269388, term269388.getClass(), "sourcePosition", 0);
        setField(term269388, term269388.getClass(), "jsType", null);
        setField(term269388, term269388.getClass(), "parent", null);
        setField(term269378, term269378.getClass(), "next", term269388);
        setField(term269378, term269378.getClass(), "first", term269378);
        setField(term269378, term269378.getClass(), "last", null);
        setField(term269378, term269378.getClass(), "propListHead", null);
        setIntField(term269378, term269378.getClass(), "sourcePosition", 0);
        setField(term269378, term269378.getClass(), "jsType", null);
        setField(term269378, term269378.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term268889;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term268803, args);
        assertTrue(recursiveEquals(term268803, term269422));
        assertTrue(recursiveEquals(term268889, term269423));
        assertTrue(recursiveEquals(retValue, term269378));
    }

};


