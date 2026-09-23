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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95518;
     Object term95604;
     Object term96152;
     Object term96153;
     Object term96091;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95518 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term95604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95690 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95782 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term95690, term95690.getClass(), "next", term95782);
        setIntField(term95690, term95690.getClass(), "type", 39);
        setField(term95604, term95604.getClass(), "first", term95690);
        setIntField(term95604, term95604.getClass(), "type", 24);
        term96152 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term96152, term96152.getClass(), "currentTraversal", null);
        term96153 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96154 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term96153, term96153.getClass(), "functionName", null);
        setBooleanField(term96153, term96153.getClass(), "itsNeedsActivation", false);
        setIntField(term96153, term96153.getClass(), "itsFunctionType", 0);
        setBooleanField(term96153, term96153.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96153, term96153.getClass(), "encodedSourceStart", 0);
        setIntField(term96153, term96153.getClass(), "encodedSourceEnd", 0);
        setField(term96153, term96153.getClass(), "sourceName", null);
        setIntField(term96153, term96153.getClass(), "baseLineno", 0);
        setIntField(term96153, term96153.getClass(), "endLineno", 0);
        setField(term96153, term96153.getClass(), "functions", null);
        setField(term96153, term96153.getClass(), "regexps", null);
        setField(term96153, term96153.getClass(), "itsVariables", null);
        setField(term96153, term96153.getClass(), "itsConst", null);
        setField(term96153, term96153.getClass(), "itsVariableNames", null);
        setIntField(term96153, term96153.getClass(), "varStart", 0);
        setField(term96153, term96153.getClass(), "compilerData", null);
        setIntField(term96153, term96153.getClass(), "type", 24);
        setField(term96153, term96153.getClass(), "next", null);
        setField(term96154, term96154.getClass(), "functionName", null);
        setBooleanField(term96154, term96154.getClass(), "itsNeedsActivation", false);
        setIntField(term96154, term96154.getClass(), "itsFunctionType", 0);
        setBooleanField(term96154, term96154.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96154, term96154.getClass(), "encodedSourceStart", 0);
        setIntField(term96154, term96154.getClass(), "encodedSourceEnd", 0);
        setField(term96154, term96154.getClass(), "sourceName", null);
        setIntField(term96154, term96154.getClass(), "baseLineno", 0);
        setIntField(term96154, term96154.getClass(), "endLineno", 0);
        setField(term96154, term96154.getClass(), "functions", null);
        setField(term96154, term96154.getClass(), "regexps", null);
        setField(term96154, term96154.getClass(), "itsVariables", null);
        setField(term96154, term96154.getClass(), "itsConst", null);
        setField(term96154, term96154.getClass(), "itsVariableNames", null);
        setIntField(term96154, term96154.getClass(), "varStart", 0);
        setField(term96154, term96154.getClass(), "compilerData", null);
        setIntField(term96154, term96154.getClass(), "type", 39);
        setField(term96155, term96155.getClass(), "str", null);
        setIntField(term96155, term96155.getClass(), "type", 0);
        setField(term96155, term96155.getClass(), "next", null);
        setField(term96155, term96155.getClass(), "first", null);
        setField(term96155, term96155.getClass(), "last", null);
        setField(term96155, term96155.getClass(), "propListHead", null);
        setIntField(term96155, term96155.getClass(), "sourcePosition", 0);
        setField(term96155, term96155.getClass(), "jsType", null);
        setField(term96155, term96155.getClass(), "parent", null);
        setField(term96154, term96154.getClass(), "next", term96155);
        setField(term96154, term96154.getClass(), "first", null);
        setField(term96154, term96154.getClass(), "last", null);
        setField(term96154, term96154.getClass(), "propListHead", null);
        setIntField(term96154, term96154.getClass(), "sourcePosition", 0);
        setField(term96154, term96154.getClass(), "jsType", null);
        setField(term96154, term96154.getClass(), "parent", null);
        setField(term96153, term96153.getClass(), "first", term96154);
        setField(term96153, term96153.getClass(), "last", null);
        setField(term96153, term96153.getClass(), "propListHead", null);
        setIntField(term96153, term96153.getClass(), "sourcePosition", 0);
        setField(term96153, term96153.getClass(), "jsType", null);
        setField(term96153, term96153.getClass(), "parent", null);
        term96091 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96101 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96111 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term96091, term96091.getClass(), "functionName", null);
        setBooleanField(term96091, term96091.getClass(), "itsNeedsActivation", false);
        setIntField(term96091, term96091.getClass(), "itsFunctionType", 0);
        setBooleanField(term96091, term96091.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96091, term96091.getClass(), "encodedSourceStart", 0);
        setIntField(term96091, term96091.getClass(), "encodedSourceEnd", 0);
        setField(term96091, term96091.getClass(), "sourceName", null);
        setIntField(term96091, term96091.getClass(), "baseLineno", 0);
        setIntField(term96091, term96091.getClass(), "endLineno", 0);
        setField(term96091, term96091.getClass(), "functions", null);
        setField(term96091, term96091.getClass(), "regexps", null);
        setField(term96091, term96091.getClass(), "itsVariables", null);
        setField(term96091, term96091.getClass(), "itsConst", null);
        setField(term96091, term96091.getClass(), "itsVariableNames", null);
        setIntField(term96091, term96091.getClass(), "varStart", 0);
        setField(term96091, term96091.getClass(), "compilerData", null);
        setIntField(term96091, term96091.getClass(), "type", 24);
        setField(term96091, term96091.getClass(), "next", null);
        setField(term96101, term96101.getClass(), "functionName", null);
        setBooleanField(term96101, term96101.getClass(), "itsNeedsActivation", false);
        setIntField(term96101, term96101.getClass(), "itsFunctionType", 0);
        setBooleanField(term96101, term96101.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96101, term96101.getClass(), "encodedSourceStart", 0);
        setIntField(term96101, term96101.getClass(), "encodedSourceEnd", 0);
        setField(term96101, term96101.getClass(), "sourceName", null);
        setIntField(term96101, term96101.getClass(), "baseLineno", 0);
        setIntField(term96101, term96101.getClass(), "endLineno", 0);
        setField(term96101, term96101.getClass(), "functions", null);
        setField(term96101, term96101.getClass(), "regexps", null);
        setField(term96101, term96101.getClass(), "itsVariables", null);
        setField(term96101, term96101.getClass(), "itsConst", null);
        setField(term96101, term96101.getClass(), "itsVariableNames", null);
        setIntField(term96101, term96101.getClass(), "varStart", 0);
        setField(term96101, term96101.getClass(), "compilerData", null);
        setIntField(term96101, term96101.getClass(), "type", 39);
        setField(term96111, term96111.getClass(), "str", null);
        setIntField(term96111, term96111.getClass(), "type", 0);
        setField(term96111, term96111.getClass(), "next", null);
        setField(term96111, term96111.getClass(), "first", null);
        setField(term96111, term96111.getClass(), "last", null);
        setField(term96111, term96111.getClass(), "propListHead", null);
        setIntField(term96111, term96111.getClass(), "sourcePosition", 0);
        setField(term96111, term96111.getClass(), "jsType", null);
        setField(term96111, term96111.getClass(), "parent", null);
        setField(term96101, term96101.getClass(), "next", term96111);
        setField(term96101, term96101.getClass(), "first", null);
        setField(term96101, term96101.getClass(), "last", null);
        setField(term96101, term96101.getClass(), "propListHead", null);
        setIntField(term96101, term96101.getClass(), "sourcePosition", 0);
        setField(term96101, term96101.getClass(), "jsType", null);
        setField(term96101, term96101.getClass(), "parent", null);
        setField(term96091, term96091.getClass(), "first", term96101);
        setField(term96091, term96091.getClass(), "last", null);
        setField(term96091, term96091.getClass(), "propListHead", null);
        setIntField(term96091, term96091.getClass(), "sourcePosition", 0);
        setField(term96091, term96091.getClass(), "jsType", null);
        setField(term96091, term96091.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term95604;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term95518, args);
        assertTrue(recursiveEquals(term95518, term96152));
        assertTrue(recursiveEquals(term95604, term96153));
        assertTrue(recursiveEquals(retValue, term96091));
    }

};


