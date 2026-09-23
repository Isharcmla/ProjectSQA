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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135491;
     Object term135577;
     Object term136157;
     Object term136158;
     Object term136116;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135491 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term135577 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term135669 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term135577, term135577.getClass(), "first", term135577);
        setField(term135577, term135577.getClass(), "next", term135669);
        setIntField(term135577, term135577.getClass(), "type", 33);
        term136157 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term136157, term136157.getClass(), "currentTraversal", null);
        term136158 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term136158, term136158.getClass(), "functionName", null);
        setBooleanField(term136158, term136158.getClass(), "itsNeedsActivation", false);
        setIntField(term136158, term136158.getClass(), "itsFunctionType", 0);
        setBooleanField(term136158, term136158.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136158, term136158.getClass(), "encodedSourceStart", 0);
        setIntField(term136158, term136158.getClass(), "encodedSourceEnd", 0);
        setField(term136158, term136158.getClass(), "sourceName", null);
        setIntField(term136158, term136158.getClass(), "baseLineno", 0);
        setIntField(term136158, term136158.getClass(), "endLineno", 0);
        setField(term136158, term136158.getClass(), "functions", null);
        setField(term136158, term136158.getClass(), "regexps", null);
        setField(term136158, term136158.getClass(), "itsVariables", null);
        setField(term136158, term136158.getClass(), "itsConst", null);
        setField(term136158, term136158.getClass(), "itsVariableNames", null);
        setIntField(term136158, term136158.getClass(), "varStart", 0);
        setField(term136158, term136158.getClass(), "compilerData", null);
        setIntField(term136158, term136158.getClass(), "type", 33);
        setField(term136159, term136159.getClass(), "str", null);
        setIntField(term136159, term136159.getClass(), "type", 0);
        setField(term136159, term136159.getClass(), "next", null);
        setField(term136159, term136159.getClass(), "first", null);
        setField(term136159, term136159.getClass(), "last", null);
        setField(term136159, term136159.getClass(), "propListHead", null);
        setIntField(term136159, term136159.getClass(), "sourcePosition", 0);
        setField(term136159, term136159.getClass(), "jsType", null);
        setField(term136159, term136159.getClass(), "parent", null);
        setField(term136158, term136158.getClass(), "next", term136159);
        setField(term136158, term136158.getClass(), "first", term136158);
        setField(term136158, term136158.getClass(), "last", null);
        setField(term136158, term136158.getClass(), "propListHead", null);
        setIntField(term136158, term136158.getClass(), "sourcePosition", 0);
        setField(term136158, term136158.getClass(), "jsType", null);
        setField(term136158, term136158.getClass(), "parent", null);
        term136116 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136126 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term136116, term136116.getClass(), "functionName", null);
        setBooleanField(term136116, term136116.getClass(), "itsNeedsActivation", false);
        setIntField(term136116, term136116.getClass(), "itsFunctionType", 0);
        setBooleanField(term136116, term136116.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136116, term136116.getClass(), "encodedSourceStart", 0);
        setIntField(term136116, term136116.getClass(), "encodedSourceEnd", 0);
        setField(term136116, term136116.getClass(), "sourceName", null);
        setIntField(term136116, term136116.getClass(), "baseLineno", 0);
        setIntField(term136116, term136116.getClass(), "endLineno", 0);
        setField(term136116, term136116.getClass(), "functions", null);
        setField(term136116, term136116.getClass(), "regexps", null);
        setField(term136116, term136116.getClass(), "itsVariables", null);
        setField(term136116, term136116.getClass(), "itsConst", null);
        setField(term136116, term136116.getClass(), "itsVariableNames", null);
        setIntField(term136116, term136116.getClass(), "varStart", 0);
        setField(term136116, term136116.getClass(), "compilerData", null);
        setIntField(term136116, term136116.getClass(), "type", 33);
        setField(term136126, term136126.getClass(), "str", null);
        setIntField(term136126, term136126.getClass(), "type", 0);
        setField(term136126, term136126.getClass(), "next", null);
        setField(term136126, term136126.getClass(), "first", null);
        setField(term136126, term136126.getClass(), "last", null);
        setField(term136126, term136126.getClass(), "propListHead", null);
        setIntField(term136126, term136126.getClass(), "sourcePosition", 0);
        setField(term136126, term136126.getClass(), "jsType", null);
        setField(term136126, term136126.getClass(), "parent", null);
        setField(term136116, term136116.getClass(), "next", term136126);
        setField(term136116, term136116.getClass(), "first", term136116);
        setField(term136116, term136116.getClass(), "last", null);
        setField(term136116, term136116.getClass(), "propListHead", null);
        setIntField(term136116, term136116.getClass(), "sourcePosition", 0);
        setField(term136116, term136116.getClass(), "jsType", null);
        setField(term136116, term136116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term135577;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term135491, args);
        assertTrue(recursiveEquals(term135491, term136157));
        assertTrue(recursiveEquals(term135577, term136158));
        assertTrue(recursiveEquals(retValue, term136116));
    }

};


