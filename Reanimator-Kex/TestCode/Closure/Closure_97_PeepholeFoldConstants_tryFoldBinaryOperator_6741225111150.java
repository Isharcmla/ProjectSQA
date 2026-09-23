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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354129;
     Object term354215;
     Object term354458;
     Object term354459;
     Object term354392;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354129 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term354215 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354301 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term354301, term354301.getClass(), "next", term354371);
        setField(term354215, term354215.getClass(), "first", term354301);
        setIntField(term354215, term354215.getClass(), "type", 52);
        term354458 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term354458, term354458.getClass(), "currentTraversal", null);
        term354459 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354460 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term354459, term354459.getClass(), "functionName", null);
        setBooleanField(term354459, term354459.getClass(), "itsNeedsActivation", false);
        setIntField(term354459, term354459.getClass(), "itsFunctionType", 0);
        setBooleanField(term354459, term354459.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term354459, term354459.getClass(), "encodedSourceStart", 0);
        setIntField(term354459, term354459.getClass(), "encodedSourceEnd", 0);
        setField(term354459, term354459.getClass(), "sourceName", null);
        setIntField(term354459, term354459.getClass(), "baseLineno", 0);
        setIntField(term354459, term354459.getClass(), "endLineno", 0);
        setField(term354459, term354459.getClass(), "functions", null);
        setField(term354459, term354459.getClass(), "regexps", null);
        setField(term354459, term354459.getClass(), "itsVariables", null);
        setField(term354459, term354459.getClass(), "itsConst", null);
        setField(term354459, term354459.getClass(), "itsVariableNames", null);
        setIntField(term354459, term354459.getClass(), "varStart", 0);
        setField(term354459, term354459.getClass(), "compilerData", null);
        setIntField(term354459, term354459.getClass(), "type", 52);
        setField(term354459, term354459.getClass(), "next", null);
        setField(term354460, term354460.getClass(), "functionName", null);
        setBooleanField(term354460, term354460.getClass(), "itsNeedsActivation", false);
        setIntField(term354460, term354460.getClass(), "itsFunctionType", 0);
        setBooleanField(term354460, term354460.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term354460, term354460.getClass(), "encodedSourceStart", 0);
        setIntField(term354460, term354460.getClass(), "encodedSourceEnd", 0);
        setField(term354460, term354460.getClass(), "sourceName", null);
        setIntField(term354460, term354460.getClass(), "baseLineno", 0);
        setIntField(term354460, term354460.getClass(), "endLineno", 0);
        setField(term354460, term354460.getClass(), "functions", null);
        setField(term354460, term354460.getClass(), "regexps", null);
        setField(term354460, term354460.getClass(), "itsVariables", null);
        setField(term354460, term354460.getClass(), "itsConst", null);
        setField(term354460, term354460.getClass(), "itsVariableNames", null);
        setIntField(term354460, term354460.getClass(), "varStart", 0);
        setField(term354460, term354460.getClass(), "compilerData", null);
        setIntField(term354460, term354460.getClass(), "type", 0);
        setIntField(term354461, term354461.getClass(), "type", 0);
        setField(term354461, term354461.getClass(), "next", null);
        setField(term354461, term354461.getClass(), "first", null);
        setField(term354461, term354461.getClass(), "last", null);
        setField(term354461, term354461.getClass(), "propListHead", null);
        setIntField(term354461, term354461.getClass(), "sourcePosition", 0);
        setField(term354461, term354461.getClass(), "jsType", null);
        setField(term354461, term354461.getClass(), "parent", null);
        setField(term354460, term354460.getClass(), "next", term354461);
        setField(term354460, term354460.getClass(), "first", null);
        setField(term354460, term354460.getClass(), "last", null);
        setField(term354460, term354460.getClass(), "propListHead", null);
        setIntField(term354460, term354460.getClass(), "sourcePosition", 0);
        setField(term354460, term354460.getClass(), "jsType", null);
        setField(term354460, term354460.getClass(), "parent", null);
        setField(term354459, term354459.getClass(), "first", term354460);
        setField(term354459, term354459.getClass(), "last", null);
        setField(term354459, term354459.getClass(), "propListHead", null);
        setIntField(term354459, term354459.getClass(), "sourcePosition", 0);
        setField(term354459, term354459.getClass(), "jsType", null);
        setField(term354459, term354459.getClass(), "parent", null);
        term354392 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354402 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term354392, term354392.getClass(), "functionName", null);
        setBooleanField(term354392, term354392.getClass(), "itsNeedsActivation", false);
        setIntField(term354392, term354392.getClass(), "itsFunctionType", 0);
        setBooleanField(term354392, term354392.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term354392, term354392.getClass(), "encodedSourceStart", 0);
        setIntField(term354392, term354392.getClass(), "encodedSourceEnd", 0);
        setField(term354392, term354392.getClass(), "sourceName", null);
        setIntField(term354392, term354392.getClass(), "baseLineno", 0);
        setIntField(term354392, term354392.getClass(), "endLineno", 0);
        setField(term354392, term354392.getClass(), "functions", null);
        setField(term354392, term354392.getClass(), "regexps", null);
        setField(term354392, term354392.getClass(), "itsVariables", null);
        setField(term354392, term354392.getClass(), "itsConst", null);
        setField(term354392, term354392.getClass(), "itsVariableNames", null);
        setIntField(term354392, term354392.getClass(), "varStart", 0);
        setField(term354392, term354392.getClass(), "compilerData", null);
        setIntField(term354392, term354392.getClass(), "type", 52);
        setField(term354392, term354392.getClass(), "next", null);
        setField(term354402, term354402.getClass(), "functionName", null);
        setBooleanField(term354402, term354402.getClass(), "itsNeedsActivation", false);
        setIntField(term354402, term354402.getClass(), "itsFunctionType", 0);
        setBooleanField(term354402, term354402.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term354402, term354402.getClass(), "encodedSourceStart", 0);
        setIntField(term354402, term354402.getClass(), "encodedSourceEnd", 0);
        setField(term354402, term354402.getClass(), "sourceName", null);
        setIntField(term354402, term354402.getClass(), "baseLineno", 0);
        setIntField(term354402, term354402.getClass(), "endLineno", 0);
        setField(term354402, term354402.getClass(), "functions", null);
        setField(term354402, term354402.getClass(), "regexps", null);
        setField(term354402, term354402.getClass(), "itsVariables", null);
        setField(term354402, term354402.getClass(), "itsConst", null);
        setField(term354402, term354402.getClass(), "itsVariableNames", null);
        setIntField(term354402, term354402.getClass(), "varStart", 0);
        setField(term354402, term354402.getClass(), "compilerData", null);
        setIntField(term354402, term354402.getClass(), "type", 0);
        setIntField(term354412, term354412.getClass(), "type", 0);
        setField(term354412, term354412.getClass(), "next", null);
        setField(term354412, term354412.getClass(), "first", null);
        setField(term354412, term354412.getClass(), "last", null);
        setField(term354412, term354412.getClass(), "propListHead", null);
        setIntField(term354412, term354412.getClass(), "sourcePosition", 0);
        setField(term354412, term354412.getClass(), "jsType", null);
        setField(term354412, term354412.getClass(), "parent", null);
        setField(term354402, term354402.getClass(), "next", term354412);
        setField(term354402, term354402.getClass(), "first", null);
        setField(term354402, term354402.getClass(), "last", null);
        setField(term354402, term354402.getClass(), "propListHead", null);
        setIntField(term354402, term354402.getClass(), "sourcePosition", 0);
        setField(term354402, term354402.getClass(), "jsType", null);
        setField(term354402, term354402.getClass(), "parent", null);
        setField(term354392, term354392.getClass(), "first", term354402);
        setField(term354392, term354392.getClass(), "last", null);
        setField(term354392, term354392.getClass(), "propListHead", null);
        setIntField(term354392, term354392.getClass(), "sourcePosition", 0);
        setField(term354392, term354392.getClass(), "jsType", null);
        setField(term354392, term354392.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term354215;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term354129, args);
        assertTrue(recursiveEquals(term354129, term354458));
        assertTrue(recursiveEquals(term354215, term354459));
        assertTrue(recursiveEquals(retValue, term354392));
    }

};


