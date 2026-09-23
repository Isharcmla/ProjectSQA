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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620234;
     Object term620326;
     Object term650158;
     Object term650159;
     Object term650074;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term620234 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term620326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term620412 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term620498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term620412, term620412.getClass(), "next", term620498);
        setIntField(term620412, term620412.getClass(), "type", 0);
        setField(term620326, term620326.getClass(), "first", term620412);
        setIntField(term620326, term620326.getClass(), "type", 14);
        term650158 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term650158, term650158.getClass(), "currentTraversal", null);
        term650159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term650160 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term650159, term650159.getClass(), "str", null);
        setIntField(term650159, term650159.getClass(), "type", 14);
        setField(term650159, term650159.getClass(), "next", null);
        setField(term650160, term650160.getClass(), "functionName", null);
        setBooleanField(term650160, term650160.getClass(), "itsNeedsActivation", false);
        setIntField(term650160, term650160.getClass(), "itsFunctionType", 0);
        setBooleanField(term650160, term650160.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650160, term650160.getClass(), "encodedSourceStart", 0);
        setIntField(term650160, term650160.getClass(), "encodedSourceEnd", 0);
        setField(term650160, term650160.getClass(), "sourceName", null);
        setIntField(term650160, term650160.getClass(), "baseLineno", 0);
        setIntField(term650160, term650160.getClass(), "endLineno", 0);
        setField(term650160, term650160.getClass(), "functions", null);
        setField(term650160, term650160.getClass(), "regexps", null);
        setField(term650160, term650160.getClass(), "itsVariables", null);
        setField(term650160, term650160.getClass(), "itsConst", null);
        setField(term650160, term650160.getClass(), "itsVariableNames", null);
        setIntField(term650160, term650160.getClass(), "varStart", 0);
        setField(term650160, term650160.getClass(), "compilerData", null);
        setIntField(term650160, term650160.getClass(), "type", 0);
        setField(term650161, term650161.getClass(), "functionName", null);
        setBooleanField(term650161, term650161.getClass(), "itsNeedsActivation", false);
        setIntField(term650161, term650161.getClass(), "itsFunctionType", 0);
        setBooleanField(term650161, term650161.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650161, term650161.getClass(), "encodedSourceStart", 0);
        setIntField(term650161, term650161.getClass(), "encodedSourceEnd", 0);
        setField(term650161, term650161.getClass(), "sourceName", null);
        setIntField(term650161, term650161.getClass(), "baseLineno", 0);
        setIntField(term650161, term650161.getClass(), "endLineno", 0);
        setField(term650161, term650161.getClass(), "functions", null);
        setField(term650161, term650161.getClass(), "regexps", null);
        setField(term650161, term650161.getClass(), "itsVariables", null);
        setField(term650161, term650161.getClass(), "itsConst", null);
        setField(term650161, term650161.getClass(), "itsVariableNames", null);
        setIntField(term650161, term650161.getClass(), "varStart", 0);
        setField(term650161, term650161.getClass(), "compilerData", null);
        setIntField(term650161, term650161.getClass(), "type", 0);
        setField(term650161, term650161.getClass(), "next", null);
        setField(term650161, term650161.getClass(), "first", null);
        setField(term650161, term650161.getClass(), "last", null);
        setField(term650161, term650161.getClass(), "propListHead", null);
        setIntField(term650161, term650161.getClass(), "sourcePosition", 0);
        setField(term650161, term650161.getClass(), "jsType", null);
        setField(term650161, term650161.getClass(), "parent", null);
        setField(term650160, term650160.getClass(), "next", term650161);
        setField(term650160, term650160.getClass(), "first", null);
        setField(term650160, term650160.getClass(), "last", null);
        setField(term650160, term650160.getClass(), "propListHead", null);
        setIntField(term650160, term650160.getClass(), "sourcePosition", 0);
        setField(term650160, term650160.getClass(), "jsType", null);
        setField(term650160, term650160.getClass(), "parent", null);
        setField(term650159, term650159.getClass(), "first", term650160);
        setField(term650159, term650159.getClass(), "last", null);
        setField(term650159, term650159.getClass(), "propListHead", null);
        setIntField(term650159, term650159.getClass(), "sourcePosition", 0);
        setField(term650159, term650159.getClass(), "jsType", null);
        setField(term650159, term650159.getClass(), "parent", null);
        term650074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term650076 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650086 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term650074, term650074.getClass(), "str", null);
        setIntField(term650074, term650074.getClass(), "type", 14);
        setField(term650074, term650074.getClass(), "next", null);
        setField(term650076, term650076.getClass(), "functionName", null);
        setBooleanField(term650076, term650076.getClass(), "itsNeedsActivation", false);
        setIntField(term650076, term650076.getClass(), "itsFunctionType", 0);
        setBooleanField(term650076, term650076.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650076, term650076.getClass(), "encodedSourceStart", 0);
        setIntField(term650076, term650076.getClass(), "encodedSourceEnd", 0);
        setField(term650076, term650076.getClass(), "sourceName", null);
        setIntField(term650076, term650076.getClass(), "baseLineno", 0);
        setIntField(term650076, term650076.getClass(), "endLineno", 0);
        setField(term650076, term650076.getClass(), "functions", null);
        setField(term650076, term650076.getClass(), "regexps", null);
        setField(term650076, term650076.getClass(), "itsVariables", null);
        setField(term650076, term650076.getClass(), "itsConst", null);
        setField(term650076, term650076.getClass(), "itsVariableNames", null);
        setIntField(term650076, term650076.getClass(), "varStart", 0);
        setField(term650076, term650076.getClass(), "compilerData", null);
        setIntField(term650076, term650076.getClass(), "type", 0);
        setField(term650086, term650086.getClass(), "functionName", null);
        setBooleanField(term650086, term650086.getClass(), "itsNeedsActivation", false);
        setIntField(term650086, term650086.getClass(), "itsFunctionType", 0);
        setBooleanField(term650086, term650086.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650086, term650086.getClass(), "encodedSourceStart", 0);
        setIntField(term650086, term650086.getClass(), "encodedSourceEnd", 0);
        setField(term650086, term650086.getClass(), "sourceName", null);
        setIntField(term650086, term650086.getClass(), "baseLineno", 0);
        setIntField(term650086, term650086.getClass(), "endLineno", 0);
        setField(term650086, term650086.getClass(), "functions", null);
        setField(term650086, term650086.getClass(), "regexps", null);
        setField(term650086, term650086.getClass(), "itsVariables", null);
        setField(term650086, term650086.getClass(), "itsConst", null);
        setField(term650086, term650086.getClass(), "itsVariableNames", null);
        setIntField(term650086, term650086.getClass(), "varStart", 0);
        setField(term650086, term650086.getClass(), "compilerData", null);
        setIntField(term650086, term650086.getClass(), "type", 0);
        setField(term650086, term650086.getClass(), "next", null);
        setField(term650086, term650086.getClass(), "first", null);
        setField(term650086, term650086.getClass(), "last", null);
        setField(term650086, term650086.getClass(), "propListHead", null);
        setIntField(term650086, term650086.getClass(), "sourcePosition", 0);
        setField(term650086, term650086.getClass(), "jsType", null);
        setField(term650086, term650086.getClass(), "parent", null);
        setField(term650076, term650076.getClass(), "next", term650086);
        setField(term650076, term650076.getClass(), "first", null);
        setField(term650076, term650076.getClass(), "last", null);
        setField(term650076, term650076.getClass(), "propListHead", null);
        setIntField(term650076, term650076.getClass(), "sourcePosition", 0);
        setField(term650076, term650076.getClass(), "jsType", null);
        setField(term650076, term650076.getClass(), "parent", null);
        setField(term650074, term650074.getClass(), "first", term650076);
        setField(term650074, term650074.getClass(), "last", null);
        setField(term650074, term650074.getClass(), "propListHead", null);
        setIntField(term650074, term650074.getClass(), "sourcePosition", 0);
        setField(term650074, term650074.getClass(), "jsType", null);
        setField(term650074, term650074.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term620326;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term620234, args);
        assertTrue(recursiveEquals(term620234, term650158));
        assertTrue(recursiveEquals(term620326, term650159));
        assertTrue(recursiveEquals(retValue, term650074));
    }

};


