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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547445;
     Object term547531;
     Object term548127;
     Object term548128;
     Object term548049;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547445 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term547531 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term547617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term547531, term547531.getClass(), "first", term547531);
        setField(term547531, term547531.getClass(), "next", term547617);
        setIntField(term547531, term547531.getClass(), "type", 14);
        term548127 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term548127, term548127.getClass(), "currentTraversal", null);
        term548128 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548129 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term548128, term548128.getClass(), "functionName", null);
        setBooleanField(term548128, term548128.getClass(), "itsNeedsActivation", false);
        setIntField(term548128, term548128.getClass(), "itsFunctionType", 0);
        setBooleanField(term548128, term548128.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548128, term548128.getClass(), "encodedSourceStart", 0);
        setIntField(term548128, term548128.getClass(), "encodedSourceEnd", 0);
        setField(term548128, term548128.getClass(), "sourceName", null);
        setIntField(term548128, term548128.getClass(), "baseLineno", 0);
        setIntField(term548128, term548128.getClass(), "endLineno", 0);
        setField(term548128, term548128.getClass(), "functions", null);
        setField(term548128, term548128.getClass(), "regexps", null);
        setField(term548128, term548128.getClass(), "itsVariables", null);
        setField(term548128, term548128.getClass(), "itsConst", null);
        setField(term548128, term548128.getClass(), "itsVariableNames", null);
        setIntField(term548128, term548128.getClass(), "varStart", 0);
        setField(term548128, term548128.getClass(), "compilerData", null);
        setIntField(term548128, term548128.getClass(), "type", 14);
        setField(term548129, term548129.getClass(), "functionName", null);
        setBooleanField(term548129, term548129.getClass(), "itsNeedsActivation", false);
        setIntField(term548129, term548129.getClass(), "itsFunctionType", 0);
        setBooleanField(term548129, term548129.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548129, term548129.getClass(), "encodedSourceStart", 0);
        setIntField(term548129, term548129.getClass(), "encodedSourceEnd", 0);
        setField(term548129, term548129.getClass(), "sourceName", null);
        setIntField(term548129, term548129.getClass(), "baseLineno", 0);
        setIntField(term548129, term548129.getClass(), "endLineno", 0);
        setField(term548129, term548129.getClass(), "functions", null);
        setField(term548129, term548129.getClass(), "regexps", null);
        setField(term548129, term548129.getClass(), "itsVariables", null);
        setField(term548129, term548129.getClass(), "itsConst", null);
        setField(term548129, term548129.getClass(), "itsVariableNames", null);
        setIntField(term548129, term548129.getClass(), "varStart", 0);
        setField(term548129, term548129.getClass(), "compilerData", null);
        setIntField(term548129, term548129.getClass(), "type", 0);
        setField(term548129, term548129.getClass(), "next", null);
        setField(term548129, term548129.getClass(), "first", null);
        setField(term548129, term548129.getClass(), "last", null);
        setField(term548129, term548129.getClass(), "propListHead", null);
        setIntField(term548129, term548129.getClass(), "sourcePosition", 0);
        setField(term548129, term548129.getClass(), "jsType", null);
        setField(term548129, term548129.getClass(), "parent", null);
        setField(term548128, term548128.getClass(), "next", term548129);
        setField(term548128, term548128.getClass(), "first", term548128);
        setField(term548128, term548128.getClass(), "last", null);
        setField(term548128, term548128.getClass(), "propListHead", null);
        setIntField(term548128, term548128.getClass(), "sourcePosition", 0);
        setField(term548128, term548128.getClass(), "jsType", null);
        setField(term548128, term548128.getClass(), "parent", null);
        term548049 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term548059 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term548049, term548049.getClass(), "functionName", null);
        setBooleanField(term548049, term548049.getClass(), "itsNeedsActivation", false);
        setIntField(term548049, term548049.getClass(), "itsFunctionType", 0);
        setBooleanField(term548049, term548049.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548049, term548049.getClass(), "encodedSourceStart", 0);
        setIntField(term548049, term548049.getClass(), "encodedSourceEnd", 0);
        setField(term548049, term548049.getClass(), "sourceName", null);
        setIntField(term548049, term548049.getClass(), "baseLineno", 0);
        setIntField(term548049, term548049.getClass(), "endLineno", 0);
        setField(term548049, term548049.getClass(), "functions", null);
        setField(term548049, term548049.getClass(), "regexps", null);
        setField(term548049, term548049.getClass(), "itsVariables", null);
        setField(term548049, term548049.getClass(), "itsConst", null);
        setField(term548049, term548049.getClass(), "itsVariableNames", null);
        setIntField(term548049, term548049.getClass(), "varStart", 0);
        setField(term548049, term548049.getClass(), "compilerData", null);
        setIntField(term548049, term548049.getClass(), "type", 14);
        setField(term548059, term548059.getClass(), "functionName", null);
        setBooleanField(term548059, term548059.getClass(), "itsNeedsActivation", false);
        setIntField(term548059, term548059.getClass(), "itsFunctionType", 0);
        setBooleanField(term548059, term548059.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term548059, term548059.getClass(), "encodedSourceStart", 0);
        setIntField(term548059, term548059.getClass(), "encodedSourceEnd", 0);
        setField(term548059, term548059.getClass(), "sourceName", null);
        setIntField(term548059, term548059.getClass(), "baseLineno", 0);
        setIntField(term548059, term548059.getClass(), "endLineno", 0);
        setField(term548059, term548059.getClass(), "functions", null);
        setField(term548059, term548059.getClass(), "regexps", null);
        setField(term548059, term548059.getClass(), "itsVariables", null);
        setField(term548059, term548059.getClass(), "itsConst", null);
        setField(term548059, term548059.getClass(), "itsVariableNames", null);
        setIntField(term548059, term548059.getClass(), "varStart", 0);
        setField(term548059, term548059.getClass(), "compilerData", null);
        setIntField(term548059, term548059.getClass(), "type", 0);
        setField(term548059, term548059.getClass(), "next", null);
        setField(term548059, term548059.getClass(), "first", null);
        setField(term548059, term548059.getClass(), "last", null);
        setField(term548059, term548059.getClass(), "propListHead", null);
        setIntField(term548059, term548059.getClass(), "sourcePosition", 0);
        setField(term548059, term548059.getClass(), "jsType", null);
        setField(term548059, term548059.getClass(), "parent", null);
        setField(term548049, term548049.getClass(), "next", term548059);
        setField(term548049, term548049.getClass(), "first", term548049);
        setField(term548049, term548049.getClass(), "last", null);
        setField(term548049, term548049.getClass(), "propListHead", null);
        setIntField(term548049, term548049.getClass(), "sourcePosition", 0);
        setField(term548049, term548049.getClass(), "jsType", null);
        setField(term548049, term548049.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term547531;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term547445, args);
        assertTrue(recursiveEquals(term547445, term548127));
        assertTrue(recursiveEquals(term547531, term548128));
        assertTrue(recursiveEquals(retValue, term548049));
    }

};


