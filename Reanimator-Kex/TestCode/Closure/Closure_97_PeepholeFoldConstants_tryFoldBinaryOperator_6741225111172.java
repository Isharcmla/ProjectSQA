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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359773;
     Object term359865;
     Object term360148;
     Object term360149;
     Object term360061;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359773 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term359865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term359955 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term360041 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term359955, term359955.getClass(), "next", term360041);
        setIntField(term359955, term359955.getClass(), "type", 0);
        setField(term359865, term359865.getClass(), "first", term359955);
        setIntField(term359865, term359865.getClass(), "type", 100);
        setField(term359865, term359865.getClass(), "parent", null);
        term360148 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term360148, term360148.getClass(), "currentTraversal", null);
        term360149 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term360150 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term360151 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term360149, term360149.getClass(), "str", null);
        setIntField(term360149, term360149.getClass(), "type", 100);
        setField(term360149, term360149.getClass(), "next", null);
        setIntField(term360150, term360150.getClass(), "encodedSourceStart", 0);
        setIntField(term360150, term360150.getClass(), "encodedSourceEnd", 0);
        setField(term360150, term360150.getClass(), "sourceName", null);
        setIntField(term360150, term360150.getClass(), "baseLineno", 0);
        setIntField(term360150, term360150.getClass(), "endLineno", 0);
        setField(term360150, term360150.getClass(), "functions", null);
        setField(term360150, term360150.getClass(), "regexps", null);
        setField(term360150, term360150.getClass(), "itsVariables", null);
        setField(term360150, term360150.getClass(), "itsConst", null);
        setField(term360150, term360150.getClass(), "itsVariableNames", null);
        setIntField(term360150, term360150.getClass(), "varStart", 0);
        setField(term360150, term360150.getClass(), "compilerData", null);
        setIntField(term360150, term360150.getClass(), "type", 0);
        setField(term360151, term360151.getClass(), "functionName", null);
        setBooleanField(term360151, term360151.getClass(), "itsNeedsActivation", false);
        setIntField(term360151, term360151.getClass(), "itsFunctionType", 0);
        setBooleanField(term360151, term360151.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term360151, term360151.getClass(), "encodedSourceStart", 0);
        setIntField(term360151, term360151.getClass(), "encodedSourceEnd", 0);
        setField(term360151, term360151.getClass(), "sourceName", null);
        setIntField(term360151, term360151.getClass(), "baseLineno", 0);
        setIntField(term360151, term360151.getClass(), "endLineno", 0);
        setField(term360151, term360151.getClass(), "functions", null);
        setField(term360151, term360151.getClass(), "regexps", null);
        setField(term360151, term360151.getClass(), "itsVariables", null);
        setField(term360151, term360151.getClass(), "itsConst", null);
        setField(term360151, term360151.getClass(), "itsVariableNames", null);
        setIntField(term360151, term360151.getClass(), "varStart", 0);
        setField(term360151, term360151.getClass(), "compilerData", null);
        setIntField(term360151, term360151.getClass(), "type", 0);
        setField(term360151, term360151.getClass(), "next", null);
        setField(term360151, term360151.getClass(), "first", null);
        setField(term360151, term360151.getClass(), "last", null);
        setField(term360151, term360151.getClass(), "propListHead", null);
        setIntField(term360151, term360151.getClass(), "sourcePosition", 0);
        setField(term360151, term360151.getClass(), "jsType", null);
        setField(term360151, term360151.getClass(), "parent", null);
        setField(term360150, term360150.getClass(), "next", term360151);
        setField(term360150, term360150.getClass(), "first", null);
        setField(term360150, term360150.getClass(), "last", null);
        setField(term360150, term360150.getClass(), "propListHead", null);
        setIntField(term360150, term360150.getClass(), "sourcePosition", 0);
        setField(term360150, term360150.getClass(), "jsType", null);
        setField(term360150, term360150.getClass(), "parent", null);
        setField(term360149, term360149.getClass(), "first", term360150);
        setField(term360149, term360149.getClass(), "last", null);
        setField(term360149, term360149.getClass(), "propListHead", null);
        setIntField(term360149, term360149.getClass(), "sourcePosition", 0);
        setField(term360149, term360149.getClass(), "jsType", null);
        setField(term360149, term360149.getClass(), "parent", null);
        term360061 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term360063 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term360070 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term360061, term360061.getClass(), "str", null);
        setIntField(term360061, term360061.getClass(), "type", 100);
        setField(term360061, term360061.getClass(), "next", null);
        setIntField(term360063, term360063.getClass(), "encodedSourceStart", 0);
        setIntField(term360063, term360063.getClass(), "encodedSourceEnd", 0);
        setField(term360063, term360063.getClass(), "sourceName", null);
        setIntField(term360063, term360063.getClass(), "baseLineno", 0);
        setIntField(term360063, term360063.getClass(), "endLineno", 0);
        setField(term360063, term360063.getClass(), "functions", null);
        setField(term360063, term360063.getClass(), "regexps", null);
        setField(term360063, term360063.getClass(), "itsVariables", null);
        setField(term360063, term360063.getClass(), "itsConst", null);
        setField(term360063, term360063.getClass(), "itsVariableNames", null);
        setIntField(term360063, term360063.getClass(), "varStart", 0);
        setField(term360063, term360063.getClass(), "compilerData", null);
        setIntField(term360063, term360063.getClass(), "type", 0);
        setField(term360070, term360070.getClass(), "functionName", null);
        setBooleanField(term360070, term360070.getClass(), "itsNeedsActivation", false);
        setIntField(term360070, term360070.getClass(), "itsFunctionType", 0);
        setBooleanField(term360070, term360070.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term360070, term360070.getClass(), "encodedSourceStart", 0);
        setIntField(term360070, term360070.getClass(), "encodedSourceEnd", 0);
        setField(term360070, term360070.getClass(), "sourceName", null);
        setIntField(term360070, term360070.getClass(), "baseLineno", 0);
        setIntField(term360070, term360070.getClass(), "endLineno", 0);
        setField(term360070, term360070.getClass(), "functions", null);
        setField(term360070, term360070.getClass(), "regexps", null);
        setField(term360070, term360070.getClass(), "itsVariables", null);
        setField(term360070, term360070.getClass(), "itsConst", null);
        setField(term360070, term360070.getClass(), "itsVariableNames", null);
        setIntField(term360070, term360070.getClass(), "varStart", 0);
        setField(term360070, term360070.getClass(), "compilerData", null);
        setIntField(term360070, term360070.getClass(), "type", 0);
        setField(term360070, term360070.getClass(), "next", null);
        setField(term360070, term360070.getClass(), "first", null);
        setField(term360070, term360070.getClass(), "last", null);
        setField(term360070, term360070.getClass(), "propListHead", null);
        setIntField(term360070, term360070.getClass(), "sourcePosition", 0);
        setField(term360070, term360070.getClass(), "jsType", null);
        setField(term360070, term360070.getClass(), "parent", null);
        setField(term360063, term360063.getClass(), "next", term360070);
        setField(term360063, term360063.getClass(), "first", null);
        setField(term360063, term360063.getClass(), "last", null);
        setField(term360063, term360063.getClass(), "propListHead", null);
        setIntField(term360063, term360063.getClass(), "sourcePosition", 0);
        setField(term360063, term360063.getClass(), "jsType", null);
        setField(term360063, term360063.getClass(), "parent", null);
        setField(term360061, term360061.getClass(), "first", term360063);
        setField(term360061, term360061.getClass(), "last", null);
        setField(term360061, term360061.getClass(), "propListHead", null);
        setIntField(term360061, term360061.getClass(), "sourcePosition", 0);
        setField(term360061, term360061.getClass(), "jsType", null);
        setField(term360061, term360061.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term359865;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term359773, args);
        assertTrue(recursiveEquals(term359773, term360148));
        assertTrue(recursiveEquals(term359865, term360149));
        assertTrue(recursiveEquals(retValue, term360061));
    }

};


