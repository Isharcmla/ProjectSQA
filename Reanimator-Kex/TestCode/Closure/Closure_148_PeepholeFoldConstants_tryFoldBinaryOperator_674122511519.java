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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110142;
     Object term110228;
     Object term110757;
     Object term110758;
     Object term110698;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110142 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term110228 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term110314 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term110384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term110314, term110314.getClass(), "next", term110384);
        setField(term110228, term110228.getClass(), "first", term110314);
        setIntField(term110228, term110228.getClass(), "type", 20);
        term110757 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term110757, term110757.getClass(), "currentTraversal", null);
        term110758 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term110759 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term110760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term110758, term110758.getClass(), "functionName", null);
        setBooleanField(term110758, term110758.getClass(), "itsNeedsActivation", false);
        setIntField(term110758, term110758.getClass(), "itsFunctionType", 0);
        setBooleanField(term110758, term110758.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term110758, term110758.getClass(), "encodedSourceStart", 0);
        setIntField(term110758, term110758.getClass(), "encodedSourceEnd", 0);
        setField(term110758, term110758.getClass(), "sourceName", null);
        setIntField(term110758, term110758.getClass(), "baseLineno", 0);
        setIntField(term110758, term110758.getClass(), "endLineno", 0);
        setField(term110758, term110758.getClass(), "functions", null);
        setField(term110758, term110758.getClass(), "regexps", null);
        setField(term110758, term110758.getClass(), "itsVariables", null);
        setField(term110758, term110758.getClass(), "itsConst", null);
        setField(term110758, term110758.getClass(), "itsVariableNames", null);
        setIntField(term110758, term110758.getClass(), "varStart", 0);
        setField(term110758, term110758.getClass(), "compilerData", null);
        setIntField(term110758, term110758.getClass(), "type", 20);
        setField(term110758, term110758.getClass(), "next", null);
        setField(term110759, term110759.getClass(), "functionName", null);
        setBooleanField(term110759, term110759.getClass(), "itsNeedsActivation", false);
        setIntField(term110759, term110759.getClass(), "itsFunctionType", 0);
        setBooleanField(term110759, term110759.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term110759, term110759.getClass(), "encodedSourceStart", 0);
        setIntField(term110759, term110759.getClass(), "encodedSourceEnd", 0);
        setField(term110759, term110759.getClass(), "sourceName", null);
        setIntField(term110759, term110759.getClass(), "baseLineno", 0);
        setIntField(term110759, term110759.getClass(), "endLineno", 0);
        setField(term110759, term110759.getClass(), "functions", null);
        setField(term110759, term110759.getClass(), "regexps", null);
        setField(term110759, term110759.getClass(), "itsVariables", null);
        setField(term110759, term110759.getClass(), "itsConst", null);
        setField(term110759, term110759.getClass(), "itsVariableNames", null);
        setIntField(term110759, term110759.getClass(), "varStart", 0);
        setField(term110759, term110759.getClass(), "compilerData", null);
        setIntField(term110759, term110759.getClass(), "type", 0);
        setIntField(term110760, term110760.getClass(), "type", 0);
        setField(term110760, term110760.getClass(), "next", null);
        setField(term110760, term110760.getClass(), "first", null);
        setField(term110760, term110760.getClass(), "last", null);
        setField(term110760, term110760.getClass(), "propListHead", null);
        setIntField(term110760, term110760.getClass(), "sourcePosition", 0);
        setField(term110760, term110760.getClass(), "jsType", null);
        setField(term110760, term110760.getClass(), "parent", null);
        setField(term110759, term110759.getClass(), "next", term110760);
        setField(term110759, term110759.getClass(), "first", null);
        setField(term110759, term110759.getClass(), "last", null);
        setField(term110759, term110759.getClass(), "propListHead", null);
        setIntField(term110759, term110759.getClass(), "sourcePosition", 0);
        setField(term110759, term110759.getClass(), "jsType", null);
        setField(term110759, term110759.getClass(), "parent", null);
        setField(term110758, term110758.getClass(), "first", term110759);
        setField(term110758, term110758.getClass(), "last", null);
        setField(term110758, term110758.getClass(), "propListHead", null);
        setIntField(term110758, term110758.getClass(), "sourcePosition", 0);
        setField(term110758, term110758.getClass(), "jsType", null);
        setField(term110758, term110758.getClass(), "parent", null);
        term110698 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term110708 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term110718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term110698, term110698.getClass(), "functionName", null);
        setBooleanField(term110698, term110698.getClass(), "itsNeedsActivation", false);
        setIntField(term110698, term110698.getClass(), "itsFunctionType", 0);
        setBooleanField(term110698, term110698.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term110698, term110698.getClass(), "encodedSourceStart", 0);
        setIntField(term110698, term110698.getClass(), "encodedSourceEnd", 0);
        setField(term110698, term110698.getClass(), "sourceName", null);
        setIntField(term110698, term110698.getClass(), "baseLineno", 0);
        setIntField(term110698, term110698.getClass(), "endLineno", 0);
        setField(term110698, term110698.getClass(), "functions", null);
        setField(term110698, term110698.getClass(), "regexps", null);
        setField(term110698, term110698.getClass(), "itsVariables", null);
        setField(term110698, term110698.getClass(), "itsConst", null);
        setField(term110698, term110698.getClass(), "itsVariableNames", null);
        setIntField(term110698, term110698.getClass(), "varStart", 0);
        setField(term110698, term110698.getClass(), "compilerData", null);
        setIntField(term110698, term110698.getClass(), "type", 20);
        setField(term110698, term110698.getClass(), "next", null);
        setField(term110708, term110708.getClass(), "functionName", null);
        setBooleanField(term110708, term110708.getClass(), "itsNeedsActivation", false);
        setIntField(term110708, term110708.getClass(), "itsFunctionType", 0);
        setBooleanField(term110708, term110708.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term110708, term110708.getClass(), "encodedSourceStart", 0);
        setIntField(term110708, term110708.getClass(), "encodedSourceEnd", 0);
        setField(term110708, term110708.getClass(), "sourceName", null);
        setIntField(term110708, term110708.getClass(), "baseLineno", 0);
        setIntField(term110708, term110708.getClass(), "endLineno", 0);
        setField(term110708, term110708.getClass(), "functions", null);
        setField(term110708, term110708.getClass(), "regexps", null);
        setField(term110708, term110708.getClass(), "itsVariables", null);
        setField(term110708, term110708.getClass(), "itsConst", null);
        setField(term110708, term110708.getClass(), "itsVariableNames", null);
        setIntField(term110708, term110708.getClass(), "varStart", 0);
        setField(term110708, term110708.getClass(), "compilerData", null);
        setIntField(term110708, term110708.getClass(), "type", 0);
        setIntField(term110718, term110718.getClass(), "type", 0);
        setField(term110718, term110718.getClass(), "next", null);
        setField(term110718, term110718.getClass(), "first", null);
        setField(term110718, term110718.getClass(), "last", null);
        setField(term110718, term110718.getClass(), "propListHead", null);
        setIntField(term110718, term110718.getClass(), "sourcePosition", 0);
        setField(term110718, term110718.getClass(), "jsType", null);
        setField(term110718, term110718.getClass(), "parent", null);
        setField(term110708, term110708.getClass(), "next", term110718);
        setField(term110708, term110708.getClass(), "first", null);
        setField(term110708, term110708.getClass(), "last", null);
        setField(term110708, term110708.getClass(), "propListHead", null);
        setIntField(term110708, term110708.getClass(), "sourcePosition", 0);
        setField(term110708, term110708.getClass(), "jsType", null);
        setField(term110708, term110708.getClass(), "parent", null);
        setField(term110698, term110698.getClass(), "first", term110708);
        setField(term110698, term110698.getClass(), "last", null);
        setField(term110698, term110698.getClass(), "propListHead", null);
        setIntField(term110698, term110698.getClass(), "sourcePosition", 0);
        setField(term110698, term110698.getClass(), "jsType", null);
        setField(term110698, term110698.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term110228;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term110142, args);
        assertTrue(recursiveEquals(term110142, term110757));
        assertTrue(recursiveEquals(term110228, term110758));
        assertTrue(recursiveEquals(retValue, term110698));
    }

};


