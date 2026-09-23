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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246254;
     Object term246340;
     Object term246664;
     Object term246665;
     Object term246597;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246254 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term246340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term246426 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term246518 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term246426, term246426.getClass(), "next", term246518);
        setIntField(term246426, term246426.getClass(), "type", 39);
        setField(term246340, term246340.getClass(), "first", term246426);
        setIntField(term246340, term246340.getClass(), "type", 9);
        term246664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term246664, term246664.getClass(), "currentTraversal", null);
        term246665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term246666 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term246667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term246665, term246665.getClass(), "functionName", null);
        setBooleanField(term246665, term246665.getClass(), "itsNeedsActivation", false);
        setIntField(term246665, term246665.getClass(), "itsFunctionType", 0);
        setBooleanField(term246665, term246665.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246665, term246665.getClass(), "encodedSourceStart", 0);
        setIntField(term246665, term246665.getClass(), "encodedSourceEnd", 0);
        setField(term246665, term246665.getClass(), "sourceName", null);
        setIntField(term246665, term246665.getClass(), "baseLineno", 0);
        setIntField(term246665, term246665.getClass(), "endLineno", 0);
        setField(term246665, term246665.getClass(), "functions", null);
        setField(term246665, term246665.getClass(), "regexps", null);
        setField(term246665, term246665.getClass(), "itsVariables", null);
        setField(term246665, term246665.getClass(), "itsConst", null);
        setField(term246665, term246665.getClass(), "itsVariableNames", null);
        setIntField(term246665, term246665.getClass(), "varStart", 0);
        setField(term246665, term246665.getClass(), "compilerData", null);
        setIntField(term246665, term246665.getClass(), "type", 9);
        setField(term246665, term246665.getClass(), "next", null);
        setField(term246666, term246666.getClass(), "functionName", null);
        setBooleanField(term246666, term246666.getClass(), "itsNeedsActivation", false);
        setIntField(term246666, term246666.getClass(), "itsFunctionType", 0);
        setBooleanField(term246666, term246666.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246666, term246666.getClass(), "encodedSourceStart", 0);
        setIntField(term246666, term246666.getClass(), "encodedSourceEnd", 0);
        setField(term246666, term246666.getClass(), "sourceName", null);
        setIntField(term246666, term246666.getClass(), "baseLineno", 0);
        setIntField(term246666, term246666.getClass(), "endLineno", 0);
        setField(term246666, term246666.getClass(), "functions", null);
        setField(term246666, term246666.getClass(), "regexps", null);
        setField(term246666, term246666.getClass(), "itsVariables", null);
        setField(term246666, term246666.getClass(), "itsConst", null);
        setField(term246666, term246666.getClass(), "itsVariableNames", null);
        setIntField(term246666, term246666.getClass(), "varStart", 0);
        setField(term246666, term246666.getClass(), "compilerData", null);
        setIntField(term246666, term246666.getClass(), "type", 39);
        setField(term246667, term246667.getClass(), "str", null);
        setIntField(term246667, term246667.getClass(), "type", 0);
        setField(term246667, term246667.getClass(), "next", null);
        setField(term246667, term246667.getClass(), "first", null);
        setField(term246667, term246667.getClass(), "last", null);
        setField(term246667, term246667.getClass(), "propListHead", null);
        setIntField(term246667, term246667.getClass(), "sourcePosition", 0);
        setField(term246667, term246667.getClass(), "jsType", null);
        setField(term246667, term246667.getClass(), "parent", null);
        setField(term246666, term246666.getClass(), "next", term246667);
        setField(term246666, term246666.getClass(), "first", null);
        setField(term246666, term246666.getClass(), "last", null);
        setField(term246666, term246666.getClass(), "propListHead", null);
        setIntField(term246666, term246666.getClass(), "sourcePosition", 0);
        setField(term246666, term246666.getClass(), "jsType", null);
        setField(term246666, term246666.getClass(), "parent", null);
        setField(term246665, term246665.getClass(), "first", term246666);
        setField(term246665, term246665.getClass(), "last", null);
        setField(term246665, term246665.getClass(), "propListHead", null);
        setIntField(term246665, term246665.getClass(), "sourcePosition", 0);
        setField(term246665, term246665.getClass(), "jsType", null);
        setField(term246665, term246665.getClass(), "parent", null);
        term246597 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term246607 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term246617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term246597, term246597.getClass(), "functionName", null);
        setBooleanField(term246597, term246597.getClass(), "itsNeedsActivation", false);
        setIntField(term246597, term246597.getClass(), "itsFunctionType", 0);
        setBooleanField(term246597, term246597.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246597, term246597.getClass(), "encodedSourceStart", 0);
        setIntField(term246597, term246597.getClass(), "encodedSourceEnd", 0);
        setField(term246597, term246597.getClass(), "sourceName", null);
        setIntField(term246597, term246597.getClass(), "baseLineno", 0);
        setIntField(term246597, term246597.getClass(), "endLineno", 0);
        setField(term246597, term246597.getClass(), "functions", null);
        setField(term246597, term246597.getClass(), "regexps", null);
        setField(term246597, term246597.getClass(), "itsVariables", null);
        setField(term246597, term246597.getClass(), "itsConst", null);
        setField(term246597, term246597.getClass(), "itsVariableNames", null);
        setIntField(term246597, term246597.getClass(), "varStart", 0);
        setField(term246597, term246597.getClass(), "compilerData", null);
        setIntField(term246597, term246597.getClass(), "type", 9);
        setField(term246597, term246597.getClass(), "next", null);
        setField(term246607, term246607.getClass(), "functionName", null);
        setBooleanField(term246607, term246607.getClass(), "itsNeedsActivation", false);
        setIntField(term246607, term246607.getClass(), "itsFunctionType", 0);
        setBooleanField(term246607, term246607.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246607, term246607.getClass(), "encodedSourceStart", 0);
        setIntField(term246607, term246607.getClass(), "encodedSourceEnd", 0);
        setField(term246607, term246607.getClass(), "sourceName", null);
        setIntField(term246607, term246607.getClass(), "baseLineno", 0);
        setIntField(term246607, term246607.getClass(), "endLineno", 0);
        setField(term246607, term246607.getClass(), "functions", null);
        setField(term246607, term246607.getClass(), "regexps", null);
        setField(term246607, term246607.getClass(), "itsVariables", null);
        setField(term246607, term246607.getClass(), "itsConst", null);
        setField(term246607, term246607.getClass(), "itsVariableNames", null);
        setIntField(term246607, term246607.getClass(), "varStart", 0);
        setField(term246607, term246607.getClass(), "compilerData", null);
        setIntField(term246607, term246607.getClass(), "type", 39);
        setField(term246617, term246617.getClass(), "str", null);
        setIntField(term246617, term246617.getClass(), "type", 0);
        setField(term246617, term246617.getClass(), "next", null);
        setField(term246617, term246617.getClass(), "first", null);
        setField(term246617, term246617.getClass(), "last", null);
        setField(term246617, term246617.getClass(), "propListHead", null);
        setIntField(term246617, term246617.getClass(), "sourcePosition", 0);
        setField(term246617, term246617.getClass(), "jsType", null);
        setField(term246617, term246617.getClass(), "parent", null);
        setField(term246607, term246607.getClass(), "next", term246617);
        setField(term246607, term246607.getClass(), "first", null);
        setField(term246607, term246607.getClass(), "last", null);
        setField(term246607, term246607.getClass(), "propListHead", null);
        setIntField(term246607, term246607.getClass(), "sourcePosition", 0);
        setField(term246607, term246607.getClass(), "jsType", null);
        setField(term246607, term246607.getClass(), "parent", null);
        setField(term246597, term246597.getClass(), "first", term246607);
        setField(term246597, term246597.getClass(), "last", null);
        setField(term246597, term246597.getClass(), "propListHead", null);
        setIntField(term246597, term246597.getClass(), "sourcePosition", 0);
        setField(term246597, term246597.getClass(), "jsType", null);
        setField(term246597, term246597.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term246340;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term246254, args);
        assertTrue(recursiveEquals(term246254, term246664));
        assertTrue(recursiveEquals(term246340, term246665));
        assertTrue(recursiveEquals(retValue, term246597));
    }

};


