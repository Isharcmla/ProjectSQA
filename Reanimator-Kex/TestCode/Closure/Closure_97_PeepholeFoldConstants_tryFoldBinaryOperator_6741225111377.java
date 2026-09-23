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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469566;
     Object term469658;
     Object term517724;
     Object term517725;
     Object term517574;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469566 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term469658 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term469744 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term469814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term469744, term469744.getClass(), "next", term469814);
        setField(term469658, term469658.getClass(), "first", term469744);
        setIntField(term469658, term469658.getClass(), "type", 18);
        term517724 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term517724, term517724.getClass(), "currentTraversal", null);
        term517725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term517726 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term517725, term517725.getClass(), "str", null);
        setIntField(term517725, term517725.getClass(), "type", 18);
        setField(term517725, term517725.getClass(), "next", null);
        setField(term517726, term517726.getClass(), "functionName", null);
        setBooleanField(term517726, term517726.getClass(), "itsNeedsActivation", false);
        setIntField(term517726, term517726.getClass(), "itsFunctionType", 0);
        setBooleanField(term517726, term517726.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517726, term517726.getClass(), "encodedSourceStart", 0);
        setIntField(term517726, term517726.getClass(), "encodedSourceEnd", 0);
        setField(term517726, term517726.getClass(), "sourceName", null);
        setIntField(term517726, term517726.getClass(), "baseLineno", 0);
        setIntField(term517726, term517726.getClass(), "endLineno", 0);
        setField(term517726, term517726.getClass(), "functions", null);
        setField(term517726, term517726.getClass(), "regexps", null);
        setField(term517726, term517726.getClass(), "itsVariables", null);
        setField(term517726, term517726.getClass(), "itsConst", null);
        setField(term517726, term517726.getClass(), "itsVariableNames", null);
        setIntField(term517726, term517726.getClass(), "varStart", 0);
        setField(term517726, term517726.getClass(), "compilerData", null);
        setIntField(term517726, term517726.getClass(), "type", 0);
        setIntField(term517729, term517729.getClass(), "type", 0);
        setField(term517729, term517729.getClass(), "next", null);
        setField(term517729, term517729.getClass(), "first", null);
        setField(term517729, term517729.getClass(), "last", null);
        setField(term517729, term517729.getClass(), "propListHead", null);
        setIntField(term517729, term517729.getClass(), "sourcePosition", 0);
        setField(term517729, term517729.getClass(), "jsType", null);
        setField(term517729, term517729.getClass(), "parent", null);
        setField(term517726, term517726.getClass(), "next", term517729);
        setField(term517726, term517726.getClass(), "first", null);
        setField(term517726, term517726.getClass(), "last", null);
        setField(term517726, term517726.getClass(), "propListHead", null);
        setIntField(term517726, term517726.getClass(), "sourcePosition", 0);
        setField(term517726, term517726.getClass(), "jsType", null);
        setField(term517726, term517726.getClass(), "parent", null);
        setField(term517725, term517725.getClass(), "first", term517726);
        setField(term517725, term517725.getClass(), "last", null);
        setField(term517725, term517725.getClass(), "propListHead", null);
        setIntField(term517725, term517725.getClass(), "sourcePosition", 0);
        setField(term517725, term517725.getClass(), "jsType", null);
        setField(term517725, term517725.getClass(), "parent", null);
        term517574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term517576 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term517574, term517574.getClass(), "str", null);
        setIntField(term517574, term517574.getClass(), "type", 18);
        setField(term517574, term517574.getClass(), "next", null);
        setField(term517576, term517576.getClass(), "functionName", null);
        setBooleanField(term517576, term517576.getClass(), "itsNeedsActivation", false);
        setIntField(term517576, term517576.getClass(), "itsFunctionType", 0);
        setBooleanField(term517576, term517576.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517576, term517576.getClass(), "encodedSourceStart", 0);
        setIntField(term517576, term517576.getClass(), "encodedSourceEnd", 0);
        setField(term517576, term517576.getClass(), "sourceName", null);
        setIntField(term517576, term517576.getClass(), "baseLineno", 0);
        setIntField(term517576, term517576.getClass(), "endLineno", 0);
        setField(term517576, term517576.getClass(), "functions", null);
        setField(term517576, term517576.getClass(), "regexps", null);
        setField(term517576, term517576.getClass(), "itsVariables", null);
        setField(term517576, term517576.getClass(), "itsConst", null);
        setField(term517576, term517576.getClass(), "itsVariableNames", null);
        setIntField(term517576, term517576.getClass(), "varStart", 0);
        setField(term517576, term517576.getClass(), "compilerData", null);
        setIntField(term517576, term517576.getClass(), "type", 0);
        setIntField(term517586, term517586.getClass(), "type", 0);
        setField(term517586, term517586.getClass(), "next", null);
        setField(term517586, term517586.getClass(), "first", null);
        setField(term517586, term517586.getClass(), "last", null);
        setField(term517586, term517586.getClass(), "propListHead", null);
        setIntField(term517586, term517586.getClass(), "sourcePosition", 0);
        setField(term517586, term517586.getClass(), "jsType", null);
        setField(term517586, term517586.getClass(), "parent", null);
        setField(term517576, term517576.getClass(), "next", term517586);
        setField(term517576, term517576.getClass(), "first", null);
        setField(term517576, term517576.getClass(), "last", null);
        setField(term517576, term517576.getClass(), "propListHead", null);
        setIntField(term517576, term517576.getClass(), "sourcePosition", 0);
        setField(term517576, term517576.getClass(), "jsType", null);
        setField(term517576, term517576.getClass(), "parent", null);
        setField(term517574, term517574.getClass(), "first", term517576);
        setField(term517574, term517574.getClass(), "last", null);
        setField(term517574, term517574.getClass(), "propListHead", null);
        setIntField(term517574, term517574.getClass(), "sourcePosition", 0);
        setField(term517574, term517574.getClass(), "jsType", null);
        setField(term517574, term517574.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term469658;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term469566, args);
        assertTrue(recursiveEquals(term469566, term517724));
        assertTrue(recursiveEquals(term469658, term517725));
        assertTrue(recursiveEquals(retValue, term517574));
    }

};


