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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664087;
     Object term664173;
     Object term664762;
     Object term664763;
     Object term664705;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664087 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term664173 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term664265 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term664173, term664173.getClass(), "first", term664173);
        setField(term664173, term664173.getClass(), "next", term664265);
        setIntField(term664173, term664173.getClass(), "type", 14);
        term664762 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term664762, term664762.getClass(), "currentTraversal", null);
        term664763 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term664764 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term664763, term664763.getClass(), "functionName", null);
        setBooleanField(term664763, term664763.getClass(), "itsNeedsActivation", false);
        setIntField(term664763, term664763.getClass(), "itsFunctionType", 0);
        setBooleanField(term664763, term664763.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term664763, term664763.getClass(), "encodedSourceStart", 0);
        setIntField(term664763, term664763.getClass(), "encodedSourceEnd", 0);
        setField(term664763, term664763.getClass(), "sourceName", null);
        setIntField(term664763, term664763.getClass(), "baseLineno", 0);
        setIntField(term664763, term664763.getClass(), "endLineno", 0);
        setField(term664763, term664763.getClass(), "functions", null);
        setField(term664763, term664763.getClass(), "regexps", null);
        setField(term664763, term664763.getClass(), "itsVariables", null);
        setField(term664763, term664763.getClass(), "itsConst", null);
        setField(term664763, term664763.getClass(), "itsVariableNames", null);
        setIntField(term664763, term664763.getClass(), "varStart", 0);
        setField(term664763, term664763.getClass(), "compilerData", null);
        setIntField(term664763, term664763.getClass(), "type", 14);
        setDoubleField(term664764, term664764.getClass(), "number", 0.0);
        setIntField(term664764, term664764.getClass(), "type", 0);
        setField(term664764, term664764.getClass(), "next", null);
        setField(term664764, term664764.getClass(), "first", null);
        setField(term664764, term664764.getClass(), "last", null);
        setField(term664764, term664764.getClass(), "propListHead", null);
        setIntField(term664764, term664764.getClass(), "sourcePosition", 0);
        setField(term664764, term664764.getClass(), "jsType", null);
        setField(term664764, term664764.getClass(), "parent", null);
        setField(term664763, term664763.getClass(), "next", term664764);
        setField(term664763, term664763.getClass(), "first", term664763);
        setField(term664763, term664763.getClass(), "last", null);
        setField(term664763, term664763.getClass(), "propListHead", null);
        setIntField(term664763, term664763.getClass(), "sourcePosition", 0);
        setField(term664763, term664763.getClass(), "jsType", null);
        setField(term664763, term664763.getClass(), "parent", null);
        term664705 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term664715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term664705, term664705.getClass(), "functionName", null);
        setBooleanField(term664705, term664705.getClass(), "itsNeedsActivation", false);
        setIntField(term664705, term664705.getClass(), "itsFunctionType", 0);
        setBooleanField(term664705, term664705.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term664705, term664705.getClass(), "encodedSourceStart", 0);
        setIntField(term664705, term664705.getClass(), "encodedSourceEnd", 0);
        setField(term664705, term664705.getClass(), "sourceName", null);
        setIntField(term664705, term664705.getClass(), "baseLineno", 0);
        setIntField(term664705, term664705.getClass(), "endLineno", 0);
        setField(term664705, term664705.getClass(), "functions", null);
        setField(term664705, term664705.getClass(), "regexps", null);
        setField(term664705, term664705.getClass(), "itsVariables", null);
        setField(term664705, term664705.getClass(), "itsConst", null);
        setField(term664705, term664705.getClass(), "itsVariableNames", null);
        setIntField(term664705, term664705.getClass(), "varStart", 0);
        setField(term664705, term664705.getClass(), "compilerData", null);
        setIntField(term664705, term664705.getClass(), "type", 14);
        setDoubleField(term664715, term664715.getClass(), "number", 0.0);
        setIntField(term664715, term664715.getClass(), "type", 0);
        setField(term664715, term664715.getClass(), "next", null);
        setField(term664715, term664715.getClass(), "first", null);
        setField(term664715, term664715.getClass(), "last", null);
        setField(term664715, term664715.getClass(), "propListHead", null);
        setIntField(term664715, term664715.getClass(), "sourcePosition", 0);
        setField(term664715, term664715.getClass(), "jsType", null);
        setField(term664715, term664715.getClass(), "parent", null);
        setField(term664705, term664705.getClass(), "next", term664715);
        setField(term664705, term664705.getClass(), "first", term664705);
        setField(term664705, term664705.getClass(), "last", null);
        setField(term664705, term664705.getClass(), "propListHead", null);
        setIntField(term664705, term664705.getClass(), "sourcePosition", 0);
        setField(term664705, term664705.getClass(), "jsType", null);
        setField(term664705, term664705.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term664173;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term664087, args);
        assertTrue(recursiveEquals(term664087, term664762));
        assertTrue(recursiveEquals(term664173, term664763));
        assertTrue(recursiveEquals(retValue, term664705));
    }

};


