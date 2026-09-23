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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944273;
     Object term944365;
     Object term945351;
     Object term945352;
     Object term945242;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944273 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term944365 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term944451 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term944537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term944607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term944537, term944537.getClass(), "type", 64);
        setField(term944451, term944451.getClass(), "next", term944537);
        setIntField(term944451, term944451.getClass(), "type", 0);
        setField(term944365, term944365.getClass(), "first", term944451);
        setIntField(term944365, term944365.getClass(), "type", 101);
        setIntField(term944607, term944607.getClass(), "type", 98);
        setField(term944365, term944365.getClass(), "parent", term944607);
        term945351 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term945351, term945351.getClass(), "currentTraversal", null);
        term945352 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945353 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term945354 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term945355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term945352, term945352.getClass(), "str", null);
        setIntField(term945352, term945352.getClass(), "type", 101);
        setField(term945352, term945352.getClass(), "next", null);
        setField(term945353, term945353.getClass(), "functionName", null);
        setBooleanField(term945353, term945353.getClass(), "itsNeedsActivation", false);
        setIntField(term945353, term945353.getClass(), "itsFunctionType", 0);
        setBooleanField(term945353, term945353.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term945353, term945353.getClass(), "encodedSourceStart", 0);
        setIntField(term945353, term945353.getClass(), "encodedSourceEnd", 0);
        setField(term945353, term945353.getClass(), "sourceName", null);
        setIntField(term945353, term945353.getClass(), "baseLineno", 0);
        setIntField(term945353, term945353.getClass(), "endLineno", 0);
        setField(term945353, term945353.getClass(), "functions", null);
        setField(term945353, term945353.getClass(), "regexps", null);
        setField(term945353, term945353.getClass(), "itsVariables", null);
        setField(term945353, term945353.getClass(), "itsConst", null);
        setField(term945353, term945353.getClass(), "itsVariableNames", null);
        setIntField(term945353, term945353.getClass(), "varStart", 0);
        setField(term945353, term945353.getClass(), "compilerData", null);
        setIntField(term945353, term945353.getClass(), "type", 0);
        setField(term945354, term945354.getClass(), "functionName", null);
        setBooleanField(term945354, term945354.getClass(), "itsNeedsActivation", false);
        setIntField(term945354, term945354.getClass(), "itsFunctionType", 0);
        setBooleanField(term945354, term945354.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term945354, term945354.getClass(), "encodedSourceStart", 0);
        setIntField(term945354, term945354.getClass(), "encodedSourceEnd", 0);
        setField(term945354, term945354.getClass(), "sourceName", null);
        setIntField(term945354, term945354.getClass(), "baseLineno", 0);
        setIntField(term945354, term945354.getClass(), "endLineno", 0);
        setField(term945354, term945354.getClass(), "functions", null);
        setField(term945354, term945354.getClass(), "regexps", null);
        setField(term945354, term945354.getClass(), "itsVariables", null);
        setField(term945354, term945354.getClass(), "itsConst", null);
        setField(term945354, term945354.getClass(), "itsVariableNames", null);
        setIntField(term945354, term945354.getClass(), "varStart", 0);
        setField(term945354, term945354.getClass(), "compilerData", null);
        setIntField(term945354, term945354.getClass(), "type", 64);
        setField(term945354, term945354.getClass(), "next", null);
        setField(term945354, term945354.getClass(), "first", null);
        setField(term945354, term945354.getClass(), "last", null);
        setField(term945354, term945354.getClass(), "propListHead", null);
        setIntField(term945354, term945354.getClass(), "sourcePosition", 0);
        setField(term945354, term945354.getClass(), "jsType", null);
        setField(term945354, term945354.getClass(), "parent", null);
        setField(term945353, term945353.getClass(), "next", term945354);
        setField(term945353, term945353.getClass(), "first", null);
        setField(term945353, term945353.getClass(), "last", null);
        setField(term945353, term945353.getClass(), "propListHead", null);
        setIntField(term945353, term945353.getClass(), "sourcePosition", 0);
        setField(term945353, term945353.getClass(), "jsType", null);
        setField(term945353, term945353.getClass(), "parent", null);
        setField(term945352, term945352.getClass(), "first", term945353);
        setField(term945352, term945352.getClass(), "last", null);
        setField(term945352, term945352.getClass(), "propListHead", null);
        setIntField(term945352, term945352.getClass(), "sourcePosition", 0);
        setField(term945352, term945352.getClass(), "jsType", null);
        setIntField(term945355, term945355.getClass(), "type", 98);
        setField(term945355, term945355.getClass(), "next", null);
        setField(term945355, term945355.getClass(), "first", null);
        setField(term945355, term945355.getClass(), "last", null);
        setField(term945355, term945355.getClass(), "propListHead", null);
        setIntField(term945355, term945355.getClass(), "sourcePosition", 0);
        setField(term945355, term945355.getClass(), "jsType", null);
        setField(term945355, term945355.getClass(), "parent", null);
        setField(term945352, term945352.getClass(), "parent", term945355);
        term945242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term945254 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term945267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term945242, term945242.getClass(), "str", null);
        setIntField(term945242, term945242.getClass(), "type", 101);
        setField(term945242, term945242.getClass(), "next", null);
        setField(term945244, term945244.getClass(), "functionName", null);
        setBooleanField(term945244, term945244.getClass(), "itsNeedsActivation", false);
        setIntField(term945244, term945244.getClass(), "itsFunctionType", 0);
        setBooleanField(term945244, term945244.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term945244, term945244.getClass(), "encodedSourceStart", 0);
        setIntField(term945244, term945244.getClass(), "encodedSourceEnd", 0);
        setField(term945244, term945244.getClass(), "sourceName", null);
        setIntField(term945244, term945244.getClass(), "baseLineno", 0);
        setIntField(term945244, term945244.getClass(), "endLineno", 0);
        setField(term945244, term945244.getClass(), "functions", null);
        setField(term945244, term945244.getClass(), "regexps", null);
        setField(term945244, term945244.getClass(), "itsVariables", null);
        setField(term945244, term945244.getClass(), "itsConst", null);
        setField(term945244, term945244.getClass(), "itsVariableNames", null);
        setIntField(term945244, term945244.getClass(), "varStart", 0);
        setField(term945244, term945244.getClass(), "compilerData", null);
        setIntField(term945244, term945244.getClass(), "type", 0);
        setField(term945254, term945254.getClass(), "functionName", null);
        setBooleanField(term945254, term945254.getClass(), "itsNeedsActivation", false);
        setIntField(term945254, term945254.getClass(), "itsFunctionType", 0);
        setBooleanField(term945254, term945254.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term945254, term945254.getClass(), "encodedSourceStart", 0);
        setIntField(term945254, term945254.getClass(), "encodedSourceEnd", 0);
        setField(term945254, term945254.getClass(), "sourceName", null);
        setIntField(term945254, term945254.getClass(), "baseLineno", 0);
        setIntField(term945254, term945254.getClass(), "endLineno", 0);
        setField(term945254, term945254.getClass(), "functions", null);
        setField(term945254, term945254.getClass(), "regexps", null);
        setField(term945254, term945254.getClass(), "itsVariables", null);
        setField(term945254, term945254.getClass(), "itsConst", null);
        setField(term945254, term945254.getClass(), "itsVariableNames", null);
        setIntField(term945254, term945254.getClass(), "varStart", 0);
        setField(term945254, term945254.getClass(), "compilerData", null);
        setIntField(term945254, term945254.getClass(), "type", 64);
        setField(term945254, term945254.getClass(), "next", null);
        setField(term945254, term945254.getClass(), "first", null);
        setField(term945254, term945254.getClass(), "last", null);
        setField(term945254, term945254.getClass(), "propListHead", null);
        setIntField(term945254, term945254.getClass(), "sourcePosition", 0);
        setField(term945254, term945254.getClass(), "jsType", null);
        setField(term945254, term945254.getClass(), "parent", null);
        setField(term945244, term945244.getClass(), "next", term945254);
        setField(term945244, term945244.getClass(), "first", null);
        setField(term945244, term945244.getClass(), "last", null);
        setField(term945244, term945244.getClass(), "propListHead", null);
        setIntField(term945244, term945244.getClass(), "sourcePosition", 0);
        setField(term945244, term945244.getClass(), "jsType", null);
        setField(term945244, term945244.getClass(), "parent", null);
        setField(term945242, term945242.getClass(), "first", term945244);
        setField(term945242, term945242.getClass(), "last", null);
        setField(term945242, term945242.getClass(), "propListHead", null);
        setIntField(term945242, term945242.getClass(), "sourcePosition", 0);
        setField(term945242, term945242.getClass(), "jsType", null);
        setIntField(term945267, term945267.getClass(), "type", 98);
        setField(term945267, term945267.getClass(), "next", null);
        setField(term945267, term945267.getClass(), "first", null);
        setField(term945267, term945267.getClass(), "last", null);
        setField(term945267, term945267.getClass(), "propListHead", null);
        setIntField(term945267, term945267.getClass(), "sourcePosition", 0);
        setField(term945267, term945267.getClass(), "jsType", null);
        setField(term945267, term945267.getClass(), "parent", null);
        setField(term945242, term945242.getClass(), "parent", term945267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term944365;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term944273, args);
        assertTrue(recursiveEquals(term944273, term945351));
        assertTrue(recursiveEquals(term944365, term945352));
        assertTrue(recursiveEquals(retValue, term945242));
    }

};


